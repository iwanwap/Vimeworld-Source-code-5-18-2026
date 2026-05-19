/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Autocorrelation;
import io.github.jaredmdobson.concentus.Bands;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltCommon;
import io.github.jaredmdobson.concentus.CeltLPC;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.CeltTables;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;
import io.github.jaredmdobson.concentus.OpusError;
import io.github.jaredmdobson.concentus.QuantizeBands;
import io.github.jaredmdobson.concentus.Rate;
import io.github.jaredmdobson.concentus.VQ;

class CeltDecoder {
    CeltMode mode = null;
    int overlap = 0;
    int channels = 0;
    int stream_channels = 0;
    int downsample = 0;
    int start = 0;
    int end = 0;
    int signalling = 0;
    int rng = 0;
    int error = 0;
    int last_pitch_index = 0;
    int loss_count = 0;
    int postfilter_period = 0;
    int postfilter_period_old = 0;
    int postfilter_gain = 0;
    int postfilter_gain_old = 0;
    int postfilter_tapset = 0;
    int postfilter_tapset_old = 0;
    final int[] preemph_memD = new int[2];
    int[][] decode_mem = null;
    int[][] lpc = null;
    int[] oldEBands = null;
    int[] oldLogE = null;
    int[] oldLogE2 = null;
    int[] backgroundLogE = null;

    CeltDecoder() {
    }

    private void Reset() {
        this.mode = null;
        this.overlap = 0;
        this.channels = 0;
        this.stream_channels = 0;
        this.downsample = 0;
        this.start = 0;
        this.end = 0;
        this.signalling = 0;
        this.PartialReset();
    }

    private void PartialReset() {
        this.rng = 0;
        this.error = 0;
        this.last_pitch_index = 0;
        this.loss_count = 0;
        this.postfilter_period = 0;
        this.postfilter_period_old = 0;
        this.postfilter_gain = 0;
        this.postfilter_gain_old = 0;
        this.postfilter_tapset = 0;
        this.postfilter_tapset_old = 0;
        Arrays.MemSet(this.preemph_memD, 0, 2);
        this.decode_mem = null;
        this.lpc = null;
        this.oldEBands = null;
        this.oldLogE = null;
        this.oldLogE2 = null;
        this.backgroundLogE = null;
    }

    void ResetState() {
        this.PartialReset();
        this.decode_mem = new int[this.channels][];
        this.lpc = new int[this.channels][];
        for (int c2 = 0; c2 < this.channels; ++c2) {
            this.decode_mem[c2] = new int[2048 + this.mode.overlap];
            this.lpc[c2] = new int[24];
        }
        this.oldEBands = new int[2 * this.mode.nbEBands];
        this.oldLogE = new int[2 * this.mode.nbEBands];
        this.oldLogE2 = new int[2 * this.mode.nbEBands];
        this.backgroundLogE = new int[2 * this.mode.nbEBands];
        for (int i2 = 0; i2 < 2 * this.mode.nbEBands; ++i2) {
            this.oldLogE2[i2] = -28672;
            this.oldLogE[i2] = -28672;
        }
    }

    int celt_decoder_init(int sampling_rate, int channels) {
        int ret = this.opus_custom_decoder_init(CeltMode.mode48000_960_120, channels);
        if (ret != OpusError.OPUS_OK) {
            return ret;
        }
        this.downsample = CeltCommon.resampling_factor(sampling_rate);
        if (this.downsample == 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        return OpusError.OPUS_OK;
    }

    private int opus_custom_decoder_init(CeltMode mode, int channels) {
        if (channels < 0 || channels > 2) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (this == null) {
            return OpusError.OPUS_ALLOC_FAIL;
        }
        this.Reset();
        this.mode = mode;
        this.overlap = mode.overlap;
        this.stream_channels = this.channels = channels;
        this.downsample = 1;
        this.start = 0;
        this.end = this.mode.effEBands;
        this.signalling = 1;
        this.loss_count = 0;
        this.ResetState();
        return OpusError.OPUS_OK;
    }

    void celt_decode_lost(int N2, int LM2) {
        boolean noise_based;
        int C2 = this.channels;
        int[][] out_syn = new int[2][];
        int[] out_syn_ptrs = new int[2];
        CeltMode mode = this.mode;
        int nbEBands = mode.nbEBands;
        int overlap = mode.overlap;
        short[] eBands = mode.eBands;
        int c2 = 0;
        do {
            out_syn[c2] = this.decode_mem[c2];
            out_syn_ptrs[c2] = 2048 - N2;
        } while (++c2 < C2);
        boolean bl2 = noise_based = this.loss_count >= 5 || this.start != 0;
        if (noise_based) {
            int i2;
            int end = this.end;
            int effEnd = Inlines.IMAX(this.start, Inlines.IMIN(end, mode.effEBands));
            int[][] X2 = Arrays.InitTwoDimensionalArrayInt(C2, N2);
            int decay = this.loss_count == 0 ? 1536 : 512;
            c2 = 0;
            do {
                for (i2 = this.start; i2 < end; ++i2) {
                    this.oldEBands[c2 * nbEBands + i2] = Inlines.MAX16(this.backgroundLogE[c2 * nbEBands + i2], this.oldEBands[c2 * nbEBands + i2] - decay);
                }
            } while (++c2 < C2);
            int seed = this.rng;
            for (c2 = 0; c2 < C2; ++c2) {
                for (i2 = this.start; i2 < effEnd; ++i2) {
                    int boffs = eBands[i2] << LM2;
                    int blen = eBands[i2 + 1] - eBands[i2] << LM2;
                    for (int j2 = 0; j2 < blen; ++j2) {
                        seed = Bands.celt_lcg_rand(seed);
                        X2[c2][boffs + j2] = seed >> 20;
                    }
                    VQ.renormalise_vector(X2[c2], 0, blen, Short.MAX_VALUE);
                }
            }
            this.rng = seed;
            c2 = 0;
            do {
                Arrays.MemMove(this.decode_mem[c2], N2, 0, 2048 - N2 + (overlap >> 1));
            } while (++c2 < C2);
            CeltCommon.celt_synthesis(mode, X2, out_syn, out_syn_ptrs, this.oldEBands, this.start, effEnd, C2, C2, 0, LM2, this.downsample, 0);
        } else {
            int pitch_index;
            int fade = Short.MAX_VALUE;
            if (this.loss_count == 0) {
                this.last_pitch_index = pitch_index = CeltCommon.celt_plc_pitch_search(this.decode_mem, C2);
            } else {
                pitch_index = this.last_pitch_index;
                fade = 26214;
            }
            int[] etmp = new int[overlap];
            int[] exc = new int[1024];
            int[] window = mode.window;
            c2 = 0;
            do {
                int i3;
                int S1 = 0;
                int[] buf = this.decode_mem[c2];
                for (i3 = 0; i3 < 1024; ++i3) {
                    exc[i3] = Inlines.ROUND16(buf[1024 + i3], 12);
                }
                if (this.loss_count == 0) {
                    int[] ac2 = new int[25];
                    Autocorrelation._celt_autocorr(exc, ac2, window, overlap, 24, 1024);
                    ac2[0] = ac2[0] + Inlines.SHR32(ac2[0], 13);
                    for (i3 = 1; i3 <= 24; ++i3) {
                        int n2 = i3;
                        ac2[n2] = ac2[n2] - Inlines.MULT16_32_Q15(2 * i3 * i3, ac2[i3]);
                    }
                    CeltLPC.celt_lpc(this.lpc[c2], ac2, 24);
                }
                int exc_length = Inlines.IMIN(2 * pitch_index, 1024);
                int[] lpc_mem = new int[24];
                for (i3 = 0; i3 < 24; ++i3) {
                    lpc_mem[i3] = Inlines.ROUND16(buf[2048 - exc_length - 1 - i3], 12);
                }
                Kernels.celt_fir(exc, 1024 - exc_length, this.lpc[c2], 0, exc, 1024 - exc_length, exc_length, 24, lpc_mem);
                int E1 = 1;
                int E2 = 1;
                int shift = Inlines.IMAX(0, 2 * Inlines.celt_zlog2(Inlines.celt_maxabs16(exc, 1024 - exc_length, exc_length)) - 20);
                int decay_length = exc_length >> 1;
                for (i3 = 0; i3 < decay_length; ++i3) {
                    int e2 = exc[1024 - decay_length + i3];
                    E1 += Inlines.SHR32(Inlines.MULT16_16(e2, e2), shift);
                    e2 = exc[1024 - 2 * decay_length + i3];
                    E2 += Inlines.SHR32(Inlines.MULT16_16(e2, e2), shift);
                }
                E1 = Inlines.MIN32(E1, E2);
                int decay = Inlines.celt_sqrt(Inlines.frac_div32(Inlines.SHR32(E1, 1), E2));
                Arrays.MemMove(buf, N2, 0, 2048 - N2);
                int extrapolation_offset = 1024 - pitch_index;
                int extrapolation_len = N2 + overlap;
                int attenuation = Inlines.MULT16_16_Q15(fade, decay);
                int j3 = 0;
                i3 = 0;
                while (i3 < extrapolation_len) {
                    if (j3 >= pitch_index) {
                        j3 -= pitch_index;
                        attenuation = Inlines.MULT16_16_Q15(attenuation, decay);
                    }
                    buf[2048 - N2 + i3] = Inlines.SHL32(Inlines.MULT16_16_Q15(attenuation, exc[extrapolation_offset + j3]), 12);
                    int tmp = Inlines.ROUND16(buf[1024 - N2 + extrapolation_offset + j3], 12);
                    S1 += Inlines.SHR32(Inlines.MULT16_16(tmp, tmp), 8);
                    ++i3;
                    ++j3;
                }
                lpc_mem = new int[24];
                for (i3 = 0; i3 < 24; ++i3) {
                    lpc_mem[i3] = Inlines.ROUND16(buf[2048 - N2 - 1 - i3], 12);
                }
                CeltLPC.celt_iir(buf, 2048 - N2, this.lpc[c2], buf, 2048 - N2, extrapolation_len, 24, lpc_mem);
                int S2 = 0;
                for (i3 = 0; i3 < extrapolation_len; ++i3) {
                    int tmp = Inlines.ROUND16(buf[2048 - N2 + i3], 12);
                    S2 += Inlines.SHR32(Inlines.MULT16_16(tmp, tmp), 8);
                }
                if (S1 <= Inlines.SHR32(S2, 2)) {
                    for (i3 = 0; i3 < extrapolation_len; ++i3) {
                        buf[2048 - N2 + i3] = 0;
                    }
                } else if (S1 < S2) {
                    int ratio = Inlines.celt_sqrt(Inlines.frac_div32(Inlines.SHR32(S1, 1) + 1, S2 + 1));
                    for (i3 = 0; i3 < overlap; ++i3) {
                        int tmp_g = Short.MAX_VALUE - Inlines.MULT16_16_Q15(window[i3], Short.MAX_VALUE - ratio);
                        buf[2048 - N2 + i3] = Inlines.MULT16_32_Q15(tmp_g, buf[2048 - N2 + i3]);
                    }
                    for (i3 = overlap; i3 < extrapolation_len; ++i3) {
                        buf[2048 - N2 + i3] = Inlines.MULT16_32_Q15(ratio, buf[2048 - N2 + i3]);
                    }
                }
                CeltCommon.comb_filter(etmp, 0, buf, 2048, this.postfilter_period, this.postfilter_period, overlap, -this.postfilter_gain, -this.postfilter_gain, this.postfilter_tapset, this.postfilter_tapset, null, 0);
                for (i3 = 0; i3 < overlap / 2; ++i3) {
                    buf[2048 + i3] = Inlines.MULT16_32_Q15(window[i3], etmp[overlap - 1 - i3]) + Inlines.MULT16_32_Q15(window[overlap - i3 - 1], etmp[i3]);
                }
            } while (++c2 < C2);
        }
        ++this.loss_count;
    }

    int celt_decode_with_ec(byte[] data, int data_ptr, int len, short[] pcm, int pcm_ptr, int frame_size, EntropyCoder dec, int accum) {
        int isTransient;
        int i2;
        int LM2;
        int[][] out_syn = new int[2][];
        int[] out_syn_ptrs = new int[2];
        int CC2 = this.channels;
        int intensity = 0;
        int dual_stereo = 0;
        int anti_collapse_on = 0;
        int C2 = this.stream_channels;
        CeltMode mode = this.mode;
        int nbEBands = mode.nbEBands;
        int overlap = mode.overlap;
        short[] eBands = mode.eBands;
        int start = this.start;
        int end = this.end;
        frame_size *= this.downsample;
        int[] oldBandE = this.oldEBands;
        int[] oldLogE = this.oldLogE;
        int[] oldLogE2 = this.oldLogE2;
        int[] backgroundLogE = this.backgroundLogE;
        for (LM2 = 0; LM2 <= mode.maxLM && mode.shortMdctSize << LM2 != frame_size; ++LM2) {
        }
        if (LM2 > mode.maxLM) {
            return OpusError.OPUS_BAD_ARG;
        }
        int M2 = 1 << LM2;
        if (len < 0 || len > 1275 || pcm == null) {
            return OpusError.OPUS_BAD_ARG;
        }
        int N2 = M2 * mode.shortMdctSize;
        int c2 = 0;
        do {
            out_syn[c2] = this.decode_mem[c2];
            out_syn_ptrs[c2] = 2048 - N2;
        } while (++c2 < CC2);
        int effEnd = end;
        if (effEnd > mode.effEBands) {
            effEnd = mode.effEBands;
        }
        if (data == null || len <= 1) {
            this.celt_decode_lost(N2, LM2);
            CeltCommon.deemphasis(out_syn, out_syn_ptrs, pcm, pcm_ptr, N2, CC2, this.downsample, mode.preemph, this.preemph_memD, accum);
            return frame_size / this.downsample;
        }
        if (dec == null) {
            dec = new EntropyCoder();
            dec.dec_init(data, data_ptr, len);
        }
        if (C2 == 1) {
            for (i2 = 0; i2 < nbEBands; ++i2) {
                oldBandE[i2] = Inlines.MAX16(oldBandE[i2], oldBandE[nbEBands + i2]);
            }
        }
        int total_bits = len * 8;
        int tell = dec.tell();
        int silence = tell >= total_bits ? 1 : (tell == 1 ? dec.dec_bit_logp(15L) : 0);
        if (silence != 0) {
            tell = len * 8;
            dec.nbits_total += tell - dec.tell();
        }
        int postfilter_gain = 0;
        int postfilter_pitch = 0;
        int postfilter_tapset = 0;
        if (start == 0 && tell + 16 <= total_bits) {
            if (dec.dec_bit_logp(1L) != 0) {
                int octave = (int)dec.dec_uint(6L);
                postfilter_pitch = (16 << octave) + dec.dec_bits(4 + octave) - 1;
                int qg2 = dec.dec_bits(3);
                if (dec.tell() + 2 <= total_bits) {
                    postfilter_tapset = dec.dec_icdf(CeltTables.tapset_icdf, 2);
                }
                postfilter_gain = 3072 * (qg2 + 1);
            }
            tell = dec.tell();
        }
        if (LM2 > 0 && tell + 3 <= total_bits) {
            isTransient = dec.dec_bit_logp(3L);
            tell = dec.tell();
        } else {
            isTransient = 0;
        }
        int shortBlocks = isTransient != 0 ? M2 : 0;
        int intra_ener = tell + 3 <= total_bits ? dec.dec_bit_logp(3L) : 0;
        QuantizeBands.unquant_coarse_energy(mode, start, end, oldBandE, intra_ener, dec, C2, LM2);
        int[] tf_res = new int[nbEBands];
        CeltCommon.tf_decode(start, end, isTransient, tf_res, LM2, dec);
        tell = dec.tell();
        int spread_decision = 2;
        if (tell + 4 <= total_bits) {
            spread_decision = dec.dec_icdf(CeltTables.spread_icdf, 5);
        }
        int[] cap = new int[nbEBands];
        CeltCommon.init_caps(mode, cap, LM2, C2);
        int[] offsets = new int[nbEBands];
        int dynalloc_logp = 6;
        total_bits <<= 3;
        tell = dec.tell_frac();
        for (i2 = start; i2 < end; ++i2) {
            int boost;
            int width = C2 * (eBands[i2 + 1] - eBands[i2]) << LM2;
            int quanta = Inlines.IMIN(width << 3, Inlines.IMAX(48, width));
            int dynalloc_loop_logp = dynalloc_logp;
            for (boost = 0; tell + (dynalloc_loop_logp << 3) < total_bits && boost < cap[i2]; boost += quanta, total_bits -= quanta) {
                int flag = dec.dec_bit_logp(dynalloc_loop_logp);
                tell = dec.tell_frac();
                if (flag == 0) break;
                dynalloc_loop_logp = 1;
            }
            offsets[i2] = boost;
            if (boost <= 0) continue;
            dynalloc_logp = Inlines.IMAX(2, dynalloc_logp - 1);
        }
        int[] fine_quant = new int[nbEBands];
        int alloc_trim = tell + 48 <= total_bits ? dec.dec_icdf(CeltTables.trim_icdf, 7) : 5;
        int bits = (len * 8 << 3) - dec.tell_frac() - 1;
        int anti_collapse_rsv = isTransient != 0 && LM2 >= 2 && bits >= LM2 + 2 << 3 ? 8 : 0;
        bits -= anti_collapse_rsv;
        int[] pulses = new int[nbEBands];
        int[] fine_priority = new int[nbEBands];
        BoxedValueInt boxed_intensity = new BoxedValueInt(intensity);
        BoxedValueInt boxed_dual_stereo = new BoxedValueInt(dual_stereo);
        BoxedValueInt boxed_balance = new BoxedValueInt(0);
        int codedBands = Rate.compute_allocation(mode, start, end, offsets, cap, alloc_trim, boxed_intensity, boxed_dual_stereo, bits, boxed_balance, pulses, fine_quant, fine_priority, C2, LM2, dec, 0, 0, 0);
        intensity = boxed_intensity.Val;
        dual_stereo = boxed_dual_stereo.Val;
        int balance = boxed_balance.Val;
        QuantizeBands.unquant_fine_energy(mode, start, end, oldBandE, fine_quant, dec, C2);
        c2 = 0;
        do {
            Arrays.MemMove(this.decode_mem[c2], N2, 0, 2048 - N2 + overlap / 2);
        } while (++c2 < CC2);
        short[] collapse_masks = new short[C2 * nbEBands];
        int[][] X2 = Arrays.InitTwoDimensionalArrayInt(C2, N2);
        BoxedValueInt boxed_rng = new BoxedValueInt(this.rng);
        Bands.quant_all_bands(0, mode, start, end, X2[0], C2 == 2 ? X2[1] : null, collapse_masks, null, pulses, shortBlocks, spread_decision, dual_stereo, intensity, tf_res, len * 64 - anti_collapse_rsv, balance, dec, LM2, codedBands, boxed_rng);
        this.rng = boxed_rng.Val;
        if (anti_collapse_rsv > 0) {
            anti_collapse_on = dec.dec_bits(1);
        }
        QuantizeBands.unquant_energy_finalise(mode, start, end, oldBandE, fine_quant, fine_priority, len * 8 - dec.tell(), dec, C2);
        if (anti_collapse_on != 0) {
            Bands.anti_collapse(mode, X2, collapse_masks, LM2, C2, N2, start, end, oldBandE, oldLogE, oldLogE2, pulses, this.rng);
        }
        if (silence != 0) {
            for (i2 = 0; i2 < C2 * nbEBands; ++i2) {
                oldBandE[i2] = -28672;
            }
        }
        CeltCommon.celt_synthesis(mode, X2, out_syn, out_syn_ptrs, oldBandE, start, effEnd, C2, CC2, isTransient, LM2, this.downsample, silence);
        c2 = 0;
        do {
            this.postfilter_period = Inlines.IMAX(this.postfilter_period, 15);
            this.postfilter_period_old = Inlines.IMAX(this.postfilter_period_old, 15);
            CeltCommon.comb_filter(out_syn[c2], out_syn_ptrs[c2], out_syn[c2], out_syn_ptrs[c2], this.postfilter_period_old, this.postfilter_period, mode.shortMdctSize, this.postfilter_gain_old, this.postfilter_gain, this.postfilter_tapset_old, this.postfilter_tapset, mode.window, overlap);
            if (LM2 == 0) continue;
            CeltCommon.comb_filter(out_syn[c2], out_syn_ptrs[c2] + mode.shortMdctSize, out_syn[c2], out_syn_ptrs[c2] + mode.shortMdctSize, this.postfilter_period, postfilter_pitch, N2 - mode.shortMdctSize, this.postfilter_gain, postfilter_gain, this.postfilter_tapset, postfilter_tapset, mode.window, overlap);
        } while (++c2 < CC2);
        this.postfilter_period_old = this.postfilter_period;
        this.postfilter_gain_old = this.postfilter_gain;
        this.postfilter_tapset_old = this.postfilter_tapset;
        this.postfilter_period = postfilter_pitch;
        this.postfilter_gain = postfilter_gain;
        this.postfilter_tapset = postfilter_tapset;
        if (LM2 != 0) {
            this.postfilter_period_old = this.postfilter_period;
            this.postfilter_gain_old = this.postfilter_gain;
            this.postfilter_tapset_old = this.postfilter_tapset;
        }
        if (C2 == 1) {
            System.arraycopy(oldBandE, 0, oldBandE, nbEBands, nbEBands);
        }
        if (isTransient == 0) {
            System.arraycopy(oldLogE, 0, oldLogE2, 0, 2 * nbEBands);
            System.arraycopy(oldBandE, 0, oldLogE, 0, 2 * nbEBands);
            int max_background_increase = this.loss_count < 10 ? M2 * 1 : 1024;
            for (i2 = 0; i2 < 2 * nbEBands; ++i2) {
                backgroundLogE[i2] = Inlines.MIN16(backgroundLogE[i2] + max_background_increase, oldBandE[i2]);
            }
        } else {
            for (i2 = 0; i2 < 2 * nbEBands; ++i2) {
                oldLogE[i2] = Inlines.MIN16(oldLogE[i2], oldBandE[i2]);
            }
        }
        c2 = 0;
        do {
            for (i2 = 0; i2 < start; ++i2) {
                oldBandE[c2 * nbEBands + i2] = 0;
                oldLogE2[c2 * nbEBands + i2] = -28672;
                oldLogE[c2 * nbEBands + i2] = -28672;
            }
            for (i2 = end; i2 < nbEBands; ++i2) {
                oldBandE[c2 * nbEBands + i2] = 0;
                oldLogE2[c2 * nbEBands + i2] = -28672;
                oldLogE[c2 * nbEBands + i2] = -28672;
            }
        } while (++c2 < 2);
        this.rng = (int)dec.rng;
        CeltCommon.deemphasis(out_syn, out_syn_ptrs, pcm, pcm_ptr, N2, CC2, this.downsample, mode.preemph, this.preemph_memD, accum);
        this.loss_count = 0;
        if (dec.tell() > 8 * len) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        if (dec.get_error() != 0) {
            this.error = 1;
        }
        return frame_size / this.downsample;
    }

    void SetStartBand(int value) {
        if (value < 0 || value >= this.mode.nbEBands) {
            throw new IllegalArgumentException("Start band above max number of ebands (or negative)");
        }
        this.start = value;
    }

    void SetEndBand(int value) {
        if (value < 1 || value > this.mode.nbEBands) {
            throw new IllegalArgumentException("End band above max number of ebands (or less than 1)");
        }
        this.end = value;
    }

    void SetChannels(int value) {
        if (value < 1 || value > 2) {
            throw new IllegalArgumentException("Channel count must be 1 or 2");
        }
        this.stream_channels = value;
    }

    int GetAndClearError() {
        int returnVal = this.error;
        this.error = 0;
        return returnVal;
    }

    public int GetLookahead() {
        return this.overlap / this.downsample;
    }

    public int GetPitch() {
        return this.postfilter_period;
    }

    public CeltMode GetMode() {
        return this.mode;
    }

    public void SetSignalling(int value) {
        this.signalling = value;
    }

    public int GetFinalRange() {
        return this.rng;
    }
}

