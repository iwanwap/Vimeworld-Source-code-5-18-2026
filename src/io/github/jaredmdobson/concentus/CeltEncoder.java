/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.AnalysisInfo;
import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Bands;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltCommon;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.CeltTables;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.OpusError;
import io.github.jaredmdobson.concentus.OpusFramesize;
import io.github.jaredmdobson.concentus.Pitch;
import io.github.jaredmdobson.concentus.QuantizeBands;
import io.github.jaredmdobson.concentus.Rate;

class CeltEncoder {
    CeltMode mode = null;
    int channels = 0;
    int stream_channels = 0;
    int force_intra = 0;
    int clip = 0;
    int disable_pf = 0;
    int complexity = 0;
    int upsample = 0;
    int start = 0;
    int end = 0;
    int bitrate = 0;
    int vbr = 0;
    int signalling = 0;
    int constrained_vbr = 0;
    int loss_rate = 0;
    int lsb_depth = 0;
    OpusFramesize variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
    int lfe = 0;
    int rng = 0;
    int spread_decision = 0;
    int delayedIntra = 0;
    int tonal_average = 0;
    int lastCodedBands = 0;
    int hf_average = 0;
    int tapset_decision = 0;
    int prefilter_period = 0;
    int prefilter_gain = 0;
    int prefilter_tapset = 0;
    int consec_transient = 0;
    AnalysisInfo analysis = new AnalysisInfo();
    final int[] preemph_memE = new int[2];
    final int[] preemph_memD = new int[2];
    int vbr_reservoir = 0;
    int vbr_drift = 0;
    int vbr_offset = 0;
    int vbr_count = 0;
    int overlap_max = 0;
    int stereo_saving = 0;
    int intensity = 0;
    int[] energy_mask = null;
    int spec_avg = 0;
    int[][] in_mem = null;
    int[][] prefilter_mem = null;
    int[][] oldBandE = null;
    int[][] oldLogE = null;
    int[][] oldLogE2 = null;

    CeltEncoder() {
    }

    private void Reset() {
        this.mode = null;
        this.channels = 0;
        this.stream_channels = 0;
        this.force_intra = 0;
        this.clip = 0;
        this.disable_pf = 0;
        this.complexity = 0;
        this.upsample = 0;
        this.start = 0;
        this.end = 0;
        this.bitrate = 0;
        this.vbr = 0;
        this.signalling = 0;
        this.constrained_vbr = 0;
        this.loss_rate = 0;
        this.lsb_depth = 0;
        this.variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
        this.lfe = 0;
        this.PartialReset();
    }

    private void PartialReset() {
        this.rng = 0;
        this.spread_decision = 0;
        this.delayedIntra = 0;
        this.tonal_average = 0;
        this.lastCodedBands = 0;
        this.hf_average = 0;
        this.tapset_decision = 0;
        this.prefilter_period = 0;
        this.prefilter_gain = 0;
        this.prefilter_tapset = 0;
        this.consec_transient = 0;
        this.analysis.Reset();
        this.preemph_memE[0] = 0;
        this.preemph_memE[1] = 0;
        this.preemph_memD[0] = 0;
        this.preemph_memD[1] = 0;
        this.vbr_reservoir = 0;
        this.vbr_drift = 0;
        this.vbr_offset = 0;
        this.vbr_count = 0;
        this.overlap_max = 0;
        this.stereo_saving = 0;
        this.intensity = 0;
        this.energy_mask = null;
        this.spec_avg = 0;
        this.in_mem = null;
        this.prefilter_mem = null;
        this.oldBandE = null;
        this.oldLogE = null;
        this.oldLogE2 = null;
    }

    void ResetState() {
        int i2;
        this.PartialReset();
        this.in_mem = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.overlap);
        this.prefilter_mem = Arrays.InitTwoDimensionalArrayInt(this.channels, 1024);
        this.oldBandE = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.nbEBands);
        this.oldLogE = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.nbEBands);
        this.oldLogE2 = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.nbEBands);
        for (i2 = 0; i2 < this.mode.nbEBands; ++i2) {
            this.oldLogE2[0][i2] = -28672;
            this.oldLogE[0][i2] = -28672;
        }
        if (this.channels == 2) {
            for (i2 = 0; i2 < this.mode.nbEBands; ++i2) {
                this.oldLogE2[1][i2] = -28672;
                this.oldLogE[1][i2] = -28672;
            }
        }
        this.vbr_offset = 0;
        this.delayedIntra = 1;
        this.spread_decision = 2;
        this.tonal_average = 256;
        this.hf_average = 0;
        this.tapset_decision = 0;
    }

    int opus_custom_encoder_init_arch(CeltMode mode, int channels) {
        if (channels < 0 || channels > 2) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (this == null || mode == null) {
            return OpusError.OPUS_ALLOC_FAIL;
        }
        this.Reset();
        this.mode = mode;
        this.stream_channels = this.channels = channels;
        this.upsample = 1;
        this.start = 0;
        this.end = this.mode.effEBands;
        this.signalling = 1;
        this.constrained_vbr = 1;
        this.clip = 1;
        this.bitrate = -1;
        this.vbr = 0;
        this.force_intra = 0;
        this.complexity = 5;
        this.lsb_depth = 24;
        this.ResetState();
        return OpusError.OPUS_OK;
    }

    int celt_encoder_init(int sampling_rate, int channels) {
        int ret = this.opus_custom_encoder_init_arch(CeltMode.mode48000_960_120, channels);
        if (ret != OpusError.OPUS_OK) {
            return ret;
        }
        this.upsample = CeltCommon.resampling_factor(sampling_rate);
        return OpusError.OPUS_OK;
    }

    int run_prefilter(int[][] input, int[][] prefilter_mem, int CC2, int N2, int prefilter_tapset, BoxedValueInt pitch, BoxedValueInt gain, BoxedValueInt qgain, int enabled, int nbAvailableBytes) {
        int qg2;
        int pf_on;
        int gain1;
        int[][] pre = new int[CC2][];
        BoxedValueInt pitch_index = new BoxedValueInt(0);
        CeltMode mode = this.mode;
        int overlap = mode.overlap;
        for (int z2 = 0; z2 < CC2; ++z2) {
            pre[z2] = new int[N2 + 1024];
        }
        int c2 = 0;
        do {
            System.arraycopy(prefilter_mem[c2], 0, pre[c2], 0, 1024);
            System.arraycopy(input[c2], overlap, pre[c2], 1024, N2);
        } while (++c2 < CC2);
        if (enabled != 0) {
            int[] pitch_buf = new int[1024 + N2 >> 1];
            Pitch.pitch_downsample(pre, pitch_buf, 1024 + N2, CC2);
            Pitch.pitch_search(pitch_buf, 512, pitch_buf, N2, 979, pitch_index);
            pitch_index.Val = 1024 - pitch_index.Val;
            gain1 = Pitch.remove_doubling(pitch_buf, 1024, 15, N2, pitch_index, this.prefilter_period, this.prefilter_gain);
            if (pitch_index.Val > 1022) {
                pitch_index.Val = 1022;
            }
            gain1 = Inlines.MULT16_16_Q15(22938, gain1);
            if (this.loss_rate > 2) {
                gain1 = Inlines.HALF32(gain1);
            }
            if (this.loss_rate > 4) {
                gain1 = Inlines.HALF32(gain1);
            }
            if (this.loss_rate > 8) {
                gain1 = 0;
            }
        } else {
            gain1 = 0;
            pitch_index.Val = 15;
        }
        int pf_threshold = 6554;
        if (Inlines.abs(pitch_index.Val - this.prefilter_period) * 10 > pitch_index.Val) {
            pf_threshold += 6554;
        }
        if (nbAvailableBytes < 25) {
            pf_threshold += 3277;
        }
        if (nbAvailableBytes < 35) {
            pf_threshold += 3277;
        }
        if (this.prefilter_gain > 13107) {
            pf_threshold -= 3277;
        }
        if (this.prefilter_gain > 18022) {
            pf_threshold -= 3277;
        }
        if (gain1 < (pf_threshold = Inlines.MAX16(pf_threshold, 6554))) {
            gain1 = 0;
            pf_on = 0;
            qg2 = 0;
        } else {
            if (Inlines.ABS32(gain1 - this.prefilter_gain) < 3277) {
                gain1 = this.prefilter_gain;
            }
            qg2 = (gain1 + 1536 >> 10) / 3 - 1;
            qg2 = Inlines.IMAX(0, Inlines.IMIN(7, qg2));
            gain1 = 3072 * (qg2 + 1);
            pf_on = 1;
        }
        c2 = 0;
        do {
            int offset = mode.shortMdctSize - overlap;
            this.prefilter_period = Inlines.IMAX(this.prefilter_period, 15);
            System.arraycopy(this.in_mem[c2], 0, input[c2], 0, overlap);
            if (offset != 0) {
                CeltCommon.comb_filter(input[c2], overlap, pre[c2], 1024, this.prefilter_period, this.prefilter_period, offset, -this.prefilter_gain, -this.prefilter_gain, this.prefilter_tapset, this.prefilter_tapset, null, 0);
            }
            CeltCommon.comb_filter(input[c2], overlap + offset, pre[c2], 1024 + offset, this.prefilter_period, pitch_index.Val, N2 - offset, -this.prefilter_gain, -gain1, this.prefilter_tapset, prefilter_tapset, mode.window, overlap);
            System.arraycopy(input[c2], N2, this.in_mem[c2], 0, overlap);
            if (N2 > 1024) {
                System.arraycopy(pre[c2], N2, prefilter_mem[c2], 0, 1024);
                continue;
            }
            Arrays.MemMove(prefilter_mem[c2], N2, 0, 1024 - N2);
            System.arraycopy(pre[c2], 1024, prefilter_mem[c2], 1024 - N2, N2);
        } while (++c2 < CC2);
        gain.Val = gain1;
        pitch.Val = pitch_index.Val;
        qgain.Val = qg2;
        return pf_on;
    }

    int celt_encode_with_ec(short[] pcm, int pcm_ptr, int frame_size, byte[] compressed, int compressed_ptr, int nbCompressedBytes, EntropyCoder enc) {
        int tf_sum;
        int tf_select;
        int i2;
        int vbr_bound;
        int max_allowed;
        int effectiveBytes;
        int vbr_rate;
        int nbFilledBytes;
        int tell;
        int LM2;
        int shortBlocks = 0;
        int isTransient = 0;
        int CC2 = this.channels;
        int C2 = this.stream_channels;
        int pitch_index = 15;
        int gain1 = 0;
        int dual_stereo = 0;
        int prefilter_tapset = 0;
        int anti_collapse_on = 0;
        int silence = 0;
        int tf_chan = 0;
        int pitch_change = 0;
        boolean transient_got_disabled = false;
        int surround_masking = 0;
        int temporal_vbr = 0;
        int surround_trim = 0;
        int equiv_rate = 510000;
        CeltMode mode = this.mode;
        int nbEBands = mode.nbEBands;
        int overlap = mode.overlap;
        short[] eBands = mode.eBands;
        int start = this.start;
        int end = this.end;
        int tf_estimate = 0;
        if (nbCompressedBytes < 2 || pcm == null) {
            return OpusError.OPUS_BAD_ARG;
        }
        frame_size *= this.upsample;
        for (LM2 = 0; LM2 <= mode.maxLM && mode.shortMdctSize << LM2 != frame_size; ++LM2) {
        }
        if (LM2 > mode.maxLM) {
            return OpusError.OPUS_BAD_ARG;
        }
        int M2 = 1 << LM2;
        int N2 = M2 * mode.shortMdctSize;
        if (enc == null) {
            tell = 1;
            nbFilledBytes = 0;
        } else {
            tell = enc.tell();
            nbFilledBytes = tell + 4 >> 3;
        }
        Inlines.OpusAssert(this.signalling == 0);
        nbCompressedBytes = Inlines.IMIN(nbCompressedBytes, 1275);
        int nbAvailableBytes = nbCompressedBytes - nbFilledBytes;
        if (this.vbr != 0 && this.bitrate != -1) {
            int den = mode.Fs >> 3;
            vbr_rate = (this.bitrate * frame_size + (den >> 1)) / den;
            effectiveBytes = vbr_rate >> 6;
        } else {
            vbr_rate = 0;
            int tmp = this.bitrate * frame_size;
            if (tell > 1) {
                tmp += tell;
            }
            if (this.bitrate != -1) {
                nbCompressedBytes = Inlines.IMAX(2, Inlines.IMIN(nbCompressedBytes, (tmp + 4 * mode.Fs) / (8 * mode.Fs) - (this.signalling != 0 ? 1 : 0)));
            }
            effectiveBytes = nbCompressedBytes;
        }
        if (this.bitrate != -1) {
            equiv_rate = this.bitrate - (40 * C2 + 20) * ((400 >> LM2) - 50);
        }
        if (enc == null) {
            enc = new EntropyCoder();
            enc.enc_init(compressed, compressed_ptr, nbCompressedBytes);
        }
        if (vbr_rate > 0 && this.constrained_vbr != 0 && (max_allowed = Inlines.IMIN(Inlines.IMAX(tell == 1 ? 2 : 0, vbr_rate + (vbr_bound = vbr_rate) - this.vbr_reservoir >> 6), nbAvailableBytes)) < nbAvailableBytes) {
            nbCompressedBytes = nbFilledBytes + max_allowed;
            nbAvailableBytes = max_allowed;
            enc.enc_shrink(nbCompressedBytes);
        }
        int total_bits = nbCompressedBytes * 8;
        int effEnd = end;
        if (effEnd > mode.effEBands) {
            effEnd = mode.effEBands;
        }
        int[][] input = Arrays.InitTwoDimensionalArrayInt(CC2, N2 + overlap);
        int sample_max = Inlines.MAX32(this.overlap_max, Inlines.celt_maxabs32(pcm, pcm_ptr, C2 * (N2 - overlap) / this.upsample));
        this.overlap_max = Inlines.celt_maxabs32(pcm, pcm_ptr + C2 * (N2 - overlap) / this.upsample, C2 * overlap / this.upsample);
        int n2 = silence = (sample_max = Inlines.MAX32(sample_max, this.overlap_max)) == 0 ? 1 : 0;
        if (tell == 1) {
            enc.enc_bit_logp(silence, 15);
        } else {
            silence = 0;
        }
        if (silence != 0) {
            if (vbr_rate > 0) {
                effectiveBytes = nbCompressedBytes = Inlines.IMIN(nbCompressedBytes, nbFilledBytes + 2);
                total_bits = nbCompressedBytes * 8;
                nbAvailableBytes = 2;
                enc.enc_shrink(nbCompressedBytes);
            }
            tell = nbCompressedBytes * 8;
            enc.nbits_total += tell - enc.tell();
        }
        int c2 = 0;
        BoxedValueInt boxed_memE = new BoxedValueInt(0);
        do {
            int need_clip = 0;
            boxed_memE.Val = this.preemph_memE[c2];
            CeltCommon.celt_preemphasis(pcm, pcm_ptr + c2, input[c2], overlap, N2, CC2, this.upsample, mode.preemph, boxed_memE, need_clip);
            this.preemph_memE[c2] = boxed_memE.Val;
        } while (++c2 < CC2);
        int enabled = (this.lfe != 0 && nbAvailableBytes > 3 || nbAvailableBytes > 12 * C2) && start == 0 && silence == 0 && this.disable_pf == 0 && this.complexity >= 5 && (this.consec_transient == 0 || LM2 == 3 || this.variable_duration != OpusFramesize.OPUS_FRAMESIZE_VARIABLE) ? 1 : 0;
        prefilter_tapset = this.tapset_decision;
        BoxedValueInt boxed_pitch_index = new BoxedValueInt(0);
        BoxedValueInt boxed_gain1 = new BoxedValueInt(0);
        BoxedValueInt boxed_qg = new BoxedValueInt(0);
        int pf_on = this.run_prefilter(input, this.prefilter_mem, CC2, N2, prefilter_tapset, boxed_pitch_index, boxed_gain1, boxed_qg, enabled, nbAvailableBytes);
        pitch_index = boxed_pitch_index.Val;
        gain1 = boxed_gain1.Val;
        int qg2 = boxed_qg.Val;
        if (!(gain1 <= 13107 && this.prefilter_gain <= 13107 || this.analysis.valid != 0 && !((double)this.analysis.tonality > 0.3) || !((double)pitch_index > 1.26 * (double)this.prefilter_period) && !((double)pitch_index < 0.79 * (double)this.prefilter_period))) {
            pitch_change = 1;
        }
        if (pf_on == 0) {
            if (start == 0 && tell + 16 <= total_bits) {
                enc.enc_bit_logp(0, 1);
            }
        } else {
            enc.enc_bit_logp(1, 1);
            int octave = Inlines.EC_ILOG(++pitch_index) - 5;
            enc.enc_uint(octave, 6L);
            enc.enc_bits(pitch_index - (16 << octave), 4 + octave);
            --pitch_index;
            enc.enc_bits(qg2, 3);
            enc.enc_icdf(prefilter_tapset, CeltTables.tapset_icdf, 2);
        }
        isTransient = 0;
        shortBlocks = 0;
        if (this.complexity >= 1 && this.lfe == 0) {
            BoxedValueInt boxed_tf_estimate = new BoxedValueInt(0);
            BoxedValueInt boxed_tf_chan = new BoxedValueInt(0);
            isTransient = CeltCommon.transient_analysis(input, N2 + overlap, CC2, boxed_tf_estimate, boxed_tf_chan);
            tf_estimate = boxed_tf_estimate.Val;
            tf_chan = boxed_tf_chan.Val;
        }
        if (LM2 > 0 && enc.tell() + 3 <= total_bits) {
            if (isTransient != 0) {
                shortBlocks = M2;
            }
        } else {
            isTransient = 0;
            transient_got_disabled = true;
        }
        int[][] freq = Arrays.InitTwoDimensionalArrayInt(CC2, N2);
        int[][] bandE = Arrays.InitTwoDimensionalArrayInt(CC2, nbEBands);
        int[][] bandLogE = Arrays.InitTwoDimensionalArrayInt(CC2, nbEBands);
        boolean secondMdct = shortBlocks != 0 && this.complexity >= 8;
        int[][] bandLogE2 = Arrays.InitTwoDimensionalArrayInt(CC2, nbEBands);
        if (secondMdct) {
            CeltCommon.compute_mdcts(mode, 0, input, freq, C2, CC2, LM2, this.upsample);
            Bands.compute_band_energies(mode, freq, bandE, effEnd, C2, LM2);
            QuantizeBands.amp2Log2(mode, effEnd, end, bandE, bandLogE2, C2);
            i2 = 0;
            while (i2 < nbEBands) {
                int[] nArray = bandLogE2[0];
                int n3 = i2++;
                nArray[n3] = nArray[n3] + Inlines.HALF16(Inlines.SHL16(LM2, 10));
            }
            if (C2 == 2) {
                i2 = 0;
                while (i2 < nbEBands) {
                    int[] nArray = bandLogE2[1];
                    int n4 = i2++;
                    nArray[n4] = nArray[n4] + Inlines.HALF16(Inlines.SHL16(LM2, 10));
                }
            }
        }
        CeltCommon.compute_mdcts(mode, shortBlocks, input, freq, C2, CC2, LM2, this.upsample);
        if (CC2 == 2 && C2 == 1) {
            tf_chan = 0;
        }
        Bands.compute_band_energies(mode, freq, bandE, effEnd, C2, LM2);
        if (this.lfe != 0) {
            for (i2 = 2; i2 < end; ++i2) {
                bandE[0][i2] = Inlines.IMIN(bandE[0][i2], Inlines.MULT16_32_Q15((short)3, bandE[0][0]));
                bandE[0][i2] = Inlines.MAX32(bandE[0][i2], 1);
            }
        }
        QuantizeBands.amp2Log2(mode, effEnd, end, bandE, bandLogE, C2);
        int[] surround_dynalloc = new int[C2 * nbEBands];
        if (start == 0 && this.energy_mask != null && this.lfe == 0) {
            int mask_avg = 0;
            int diff = 0;
            int count = 0;
            int mask_end = Inlines.IMAX(2, this.lastCodedBands);
            for (c2 = 0; c2 < C2; ++c2) {
                for (i2 = 0; i2 < mask_end; ++i2) {
                    int mask = Inlines.MAX16(Inlines.MIN16(this.energy_mask[nbEBands * c2 + i2], 256), -2048);
                    if (mask > 0) {
                        mask = Inlines.HALF16(mask);
                    }
                    mask_avg += Inlines.MULT16_16(mask, eBands[i2 + 1] - eBands[i2]);
                    count += eBands[i2 + 1] - eBands[i2];
                    diff += Inlines.MULT16_16(mask, 1 + 2 * i2 - mask_end);
                }
            }
            Inlines.OpusAssert(count > 0);
            mask_avg = Inlines.DIV32_16(mask_avg, count);
            mask_avg += 205;
            diff = diff * 6 / (C2 * (mask_end - 1) * (mask_end + 1) * mask_end);
            diff = Inlines.HALF32(diff);
            diff = Inlines.MAX32(Inlines.MIN32(diff, 32), -32);
            int midband = 0;
            while (eBands[midband + 1] < eBands[mask_end] / 2) {
                ++midband;
            }
            int count_dynalloc = 0;
            for (i2 = 0; i2 < mask_end; ++i2) {
                int lin = mask_avg + diff * (i2 - midband);
                int unmask = C2 == 2 ? Inlines.MAX16(this.energy_mask[i2], this.energy_mask[nbEBands + i2]) : this.energy_mask[i2];
                unmask = Inlines.MIN16(unmask, 0);
                if ((unmask -= lin) <= 256) continue;
                surround_dynalloc[i2] = unmask - 256;
                ++count_dynalloc;
            }
            if (count_dynalloc >= 3) {
                if ((mask_avg += 256) > 0) {
                    mask_avg = 0;
                    diff = 0;
                    Arrays.MemSet(surround_dynalloc, 0, mask_end);
                } else {
                    for (i2 = 0; i2 < mask_end; ++i2) {
                        surround_dynalloc[i2] = Inlines.MAX16(0, surround_dynalloc[i2] - 256);
                    }
                }
            }
            surround_trim = 64 * diff;
            surround_masking = mask_avg += 205;
        }
        if (this.lfe == 0) {
            int follow = -10240;
            int frame_avg = 0;
            int offset = shortBlocks != 0 ? Inlines.HALF16(Inlines.SHL16(LM2, 10)) : 0;
            for (i2 = start; i2 < end; ++i2) {
                follow = Inlines.MAX16(follow - 1024, bandLogE[0][i2] - offset);
                if (C2 == 2) {
                    follow = Inlines.MAX16(follow, bandLogE[1][i2] - offset);
                }
                frame_avg += follow;
            }
            temporal_vbr = Inlines.SUB16(frame_avg /= end - start, this.spec_avg);
            temporal_vbr = Inlines.MIN16(3072, Inlines.MAX16(-1536, temporal_vbr));
            this.spec_avg += (short)Inlines.MULT16_16_Q15(655, temporal_vbr);
        }
        if (!secondMdct) {
            System.arraycopy(bandLogE[0], 0, bandLogE2[0], 0, nbEBands);
            if (C2 == 2) {
                System.arraycopy(bandLogE[1], 0, bandLogE2[1], 0, nbEBands);
            }
        }
        if (LM2 > 0 && enc.tell() + 3 <= total_bits && isTransient == 0 && this.complexity >= 5 && this.lfe == 0 && CeltCommon.patch_transient_decision(bandLogE, this.oldBandE, nbEBands, start, end, C2) != 0) {
            isTransient = 1;
            shortBlocks = M2;
            CeltCommon.compute_mdcts(mode, shortBlocks, input, freq, C2, CC2, LM2, this.upsample);
            Bands.compute_band_energies(mode, freq, bandE, effEnd, C2, LM2);
            QuantizeBands.amp2Log2(mode, effEnd, end, bandE, bandLogE, C2);
            i2 = 0;
            while (i2 < nbEBands) {
                int[] nArray = bandLogE2[0];
                int n5 = i2++;
                nArray[n5] = nArray[n5] + Inlines.HALF16(Inlines.SHL16(LM2, 10));
            }
            if (C2 == 2) {
                i2 = 0;
                while (i2 < nbEBands) {
                    int[] nArray = bandLogE2[1];
                    int n6 = i2++;
                    nArray[n6] = nArray[n6] + Inlines.HALF16(Inlines.SHL16(LM2, 10));
                }
            }
            tf_estimate = 3277;
        }
        if (LM2 > 0 && enc.tell() + 3 <= total_bits) {
            enc.enc_bit_logp(isTransient, 3);
        }
        int[][] X2 = Arrays.InitTwoDimensionalArrayInt(C2, N2);
        Bands.normalise_bands(mode, freq, X2, bandE, effEnd, C2, M2);
        int[] tf_res = new int[nbEBands];
        if (effectiveBytes >= 15 * C2 && start == 0 && this.complexity >= 2 && this.lfe == 0) {
            int lambda = effectiveBytes < 40 ? 12 : (effectiveBytes < 60 ? 6 : (effectiveBytes < 100 ? 4 : 3));
            BoxedValueInt boxed_tf_sum = new BoxedValueInt(0);
            tf_select = CeltCommon.tf_analysis(mode, effEnd, isTransient, tf_res, lambda *= 2, X2, N2, LM2, boxed_tf_sum, tf_estimate, tf_chan);
            tf_sum = boxed_tf_sum.Val;
            for (i2 = effEnd; i2 < end; ++i2) {
                tf_res[i2] = tf_res[effEnd - 1];
            }
        } else {
            tf_sum = 0;
            for (i2 = 0; i2 < end; ++i2) {
                tf_res[i2] = isTransient;
            }
            tf_select = 0;
        }
        int[][] error = Arrays.InitTwoDimensionalArrayInt(C2, nbEBands);
        BoxedValueInt boxed_delayedintra = new BoxedValueInt(this.delayedIntra);
        QuantizeBands.quant_coarse_energy(mode, start, end, effEnd, bandLogE, this.oldBandE, total_bits, error, enc, C2, LM2, nbAvailableBytes, this.force_intra, boxed_delayedintra, this.complexity >= 4 ? 1 : 0, this.loss_rate, this.lfe);
        this.delayedIntra = boxed_delayedintra.Val;
        CeltCommon.tf_encode(start, end, isTransient, tf_res, LM2, tf_select, enc);
        if (enc.tell() + 4 <= total_bits) {
            if (this.lfe != 0) {
                this.tapset_decision = 0;
                this.spread_decision = 2;
            } else if (shortBlocks != 0 || this.complexity < 3 || nbAvailableBytes < 10 * C2 || start != 0) {
                this.spread_decision = this.complexity == 0 ? 0 : 2;
            } else {
                BoxedValueInt boxed_tonal_average = new BoxedValueInt(this.tonal_average);
                BoxedValueInt boxed_tapset_decision = new BoxedValueInt(this.tapset_decision);
                BoxedValueInt boxed_hf_average = new BoxedValueInt(this.hf_average);
                this.spread_decision = Bands.spreading_decision(mode, X2, boxed_tonal_average, this.spread_decision, boxed_hf_average, boxed_tapset_decision, pf_on != 0 && shortBlocks == 0 ? 1 : 0, effEnd, C2, M2);
                this.tonal_average = boxed_tonal_average.Val;
                this.tapset_decision = boxed_tapset_decision.Val;
                this.hf_average = boxed_hf_average.Val;
            }
            enc.enc_icdf(this.spread_decision, CeltTables.spread_icdf, 5);
        }
        int[] offsets = new int[nbEBands];
        BoxedValueInt boxed_tot_boost = new BoxedValueInt(0);
        int maxDepth = CeltCommon.dynalloc_analysis(bandLogE, bandLogE2, nbEBands, start, end, C2, offsets, this.lsb_depth, mode.logN, isTransient, this.vbr, this.constrained_vbr, eBands, LM2, effectiveBytes, boxed_tot_boost, this.lfe, surround_dynalloc);
        int tot_boost = boxed_tot_boost.Val;
        if (this.lfe != 0) {
            offsets[0] = Inlines.IMIN(8, effectiveBytes / 3);
        }
        int[] cap = new int[nbEBands];
        CeltCommon.init_caps(mode, cap, LM2, C2);
        int dynalloc_logp = 6;
        total_bits <<= 3;
        int total_boost = 0;
        tell = enc.tell_frac();
        for (i2 = start; i2 < end; ++i2) {
            int width = C2 * (eBands[i2 + 1] - eBands[i2]) << LM2;
            int quanta = Inlines.IMIN(width << 3, Inlines.IMAX(48, width));
            int dynalloc_loop_logp = dynalloc_logp;
            int boost = 0;
            int j2 = 0;
            while (tell + (dynalloc_loop_logp << 3) < total_bits - total_boost && boost < cap[i2]) {
                int flag = j2 < offsets[i2] ? 1 : 0;
                enc.enc_bit_logp(flag, dynalloc_loop_logp);
                tell = enc.tell_frac();
                if (flag == 0) break;
                boost += quanta;
                total_boost += quanta;
                dynalloc_loop_logp = 1;
                ++j2;
            }
            if (j2 != 0) {
                dynalloc_logp = Inlines.IMAX(2, dynalloc_logp - 1);
            }
            offsets[i2] = boost;
        }
        if (C2 == 2) {
            if (LM2 != 0) {
                dual_stereo = CeltCommon.stereo_analysis(mode, X2, LM2);
            }
            this.intensity = Bands.hysteresis_decision(equiv_rate / 1000, CeltTables.intensity_thresholds, CeltTables.intensity_histeresis, 21, this.intensity);
            this.intensity = Inlines.IMIN(end, Inlines.IMAX(start, this.intensity));
        }
        int alloc_trim = 5;
        if (tell + 48 <= total_bits - total_boost) {
            if (this.lfe != 0) {
                alloc_trim = 5;
            } else {
                BoxedValueInt boxed_stereo_saving = new BoxedValueInt(this.stereo_saving);
                alloc_trim = CeltCommon.alloc_trim_analysis(mode, X2, bandLogE, end, LM2, C2, this.analysis, boxed_stereo_saving, tf_estimate, this.intensity, surround_trim);
                this.stereo_saving = boxed_stereo_saving.Val;
            }
            enc.enc_icdf(alloc_trim, CeltTables.trim_icdf, 7);
            tell = enc.tell_frac();
        }
        if (vbr_rate > 0) {
            int alpha;
            int lm_diff = mode.maxLM - LM2;
            nbCompressedBytes = Inlines.IMIN(nbCompressedBytes, 1275 >> 3 - LM2);
            int base_target = vbr_rate - (40 * C2 + 20 << 3);
            if (this.constrained_vbr != 0) {
                base_target += this.vbr_offset >> lm_diff;
            }
            int target = CeltCommon.compute_vbr(mode, this.analysis, base_target, LM2, equiv_rate, this.lastCodedBands, C2, this.intensity, this.constrained_vbr, this.stereo_saving, tot_boost, tf_estimate, pitch_change, maxDepth, this.variable_duration, this.lfe, this.energy_mask != null ? 1 : 0, surround_masking, temporal_vbr);
            int min_allowed = (tell + total_boost + 64 - 1 >> 6) + 2 - nbFilledBytes;
            nbAvailableBytes = (target += tell) + 32 >> 6;
            nbAvailableBytes = Inlines.IMAX(min_allowed, nbAvailableBytes);
            nbAvailableBytes = Inlines.IMIN(nbCompressedBytes, nbAvailableBytes + nbFilledBytes) - nbFilledBytes;
            int delta = target - vbr_rate;
            target = nbAvailableBytes << 6;
            if (silence != 0) {
                nbAvailableBytes = 2;
                target = 128;
                delta = 0;
            }
            if (this.vbr_count < 970) {
                ++this.vbr_count;
                alpha = Inlines.celt_rcp(Inlines.SHL32(this.vbr_count + 20, 16));
            } else {
                alpha = 33;
            }
            if (this.constrained_vbr != 0) {
                this.vbr_reservoir += target - vbr_rate;
            }
            if (this.constrained_vbr != 0) {
                this.vbr_drift += Inlines.MULT16_32_Q15(alpha, delta * (1 << lm_diff) - this.vbr_offset - this.vbr_drift);
                this.vbr_offset = -this.vbr_drift;
            }
            if (this.constrained_vbr != 0 && this.vbr_reservoir < 0) {
                int adjust = -this.vbr_reservoir / 64;
                nbAvailableBytes += silence != 0 ? 0 : adjust;
                this.vbr_reservoir = 0;
            }
            nbCompressedBytes = Inlines.IMIN(nbCompressedBytes, nbAvailableBytes + nbFilledBytes);
            enc.enc_shrink(nbCompressedBytes);
        }
        int[] fine_quant = new int[nbEBands];
        int[] pulses = new int[nbEBands];
        int[] fine_priority = new int[nbEBands];
        int bits = (nbCompressedBytes * 8 << 3) - enc.tell_frac() - 1;
        int anti_collapse_rsv = isTransient != 0 && LM2 >= 2 && bits >= LM2 + 2 << 3 ? 8 : 0;
        bits -= anti_collapse_rsv;
        int signalBandwidth = end - 1;
        if (this.analysis.enabled && this.analysis.valid != 0) {
            int min_bandwidth = equiv_rate < 32000 * C2 ? 13 : (equiv_rate < 48000 * C2 ? 16 : (equiv_rate < 60000 * C2 ? 18 : (equiv_rate < 80000 * C2 ? 19 : 20)));
            signalBandwidth = Inlines.IMAX(this.analysis.bandwidth, min_bandwidth);
        }
        if (this.lfe != 0) {
            signalBandwidth = 1;
        }
        BoxedValueInt boxed_intensity = new BoxedValueInt(this.intensity);
        BoxedValueInt boxed_balance = new BoxedValueInt(0);
        BoxedValueInt boxed_dual_stereo = new BoxedValueInt(dual_stereo);
        int codedBands = Rate.compute_allocation(mode, start, end, offsets, cap, alloc_trim, boxed_intensity, boxed_dual_stereo, bits, boxed_balance, pulses, fine_quant, fine_priority, C2, LM2, enc, 1, this.lastCodedBands, signalBandwidth);
        this.intensity = boxed_intensity.Val;
        int balance = boxed_balance.Val;
        dual_stereo = boxed_dual_stereo.Val;
        this.lastCodedBands = this.lastCodedBands != 0 ? Inlines.IMIN(this.lastCodedBands + 1, Inlines.IMAX(this.lastCodedBands - 1, codedBands)) : codedBands;
        QuantizeBands.quant_fine_energy(mode, start, end, this.oldBandE, error, fine_quant, enc, C2);
        short[] collapse_masks = new short[C2 * nbEBands];
        BoxedValueInt boxed_rng = new BoxedValueInt(this.rng);
        Bands.quant_all_bands(1, mode, start, end, X2[0], C2 == 2 ? X2[1] : null, collapse_masks, bandE, pulses, shortBlocks, this.spread_decision, dual_stereo, this.intensity, tf_res, nbCompressedBytes * 64 - anti_collapse_rsv, balance, enc, LM2, codedBands, boxed_rng);
        this.rng = boxed_rng.Val;
        if (anti_collapse_rsv > 0) {
            anti_collapse_on = this.consec_transient < 2 ? 1 : 0;
            enc.enc_bits(anti_collapse_on, 1);
        }
        QuantizeBands.quant_energy_finalise(mode, start, end, this.oldBandE, error, fine_quant, fine_priority, nbCompressedBytes * 8 - enc.tell(), enc, C2);
        if (silence != 0) {
            for (i2 = 0; i2 < nbEBands; ++i2) {
                this.oldBandE[0][i2] = -28672;
            }
            if (C2 == 2) {
                for (i2 = 0; i2 < nbEBands; ++i2) {
                    this.oldBandE[1][i2] = -28672;
                }
            }
        }
        this.prefilter_period = pitch_index;
        this.prefilter_gain = gain1;
        this.prefilter_tapset = prefilter_tapset;
        if (CC2 == 2 && C2 == 1) {
            System.arraycopy(this.oldBandE[0], 0, this.oldBandE[1], 0, nbEBands);
        }
        if (isTransient == 0) {
            System.arraycopy(this.oldLogE[0], 0, this.oldLogE2[0], 0, nbEBands);
            System.arraycopy(this.oldBandE[0], 0, this.oldLogE[0], 0, nbEBands);
            if (CC2 == 2) {
                System.arraycopy(this.oldLogE[1], 0, this.oldLogE2[1], 0, nbEBands);
                System.arraycopy(this.oldBandE[1], 0, this.oldLogE[1], 0, nbEBands);
            }
        } else {
            for (i2 = 0; i2 < nbEBands; ++i2) {
                this.oldLogE[0][i2] = Inlines.MIN16(this.oldLogE[0][i2], this.oldBandE[0][i2]);
            }
            if (CC2 == 2) {
                for (i2 = 0; i2 < nbEBands; ++i2) {
                    this.oldLogE[1][i2] = Inlines.MIN16(this.oldLogE[1][i2], this.oldBandE[1][i2]);
                }
            }
        }
        c2 = 0;
        do {
            for (i2 = 0; i2 < start; ++i2) {
                this.oldBandE[c2][i2] = 0;
                this.oldLogE2[c2][i2] = -28672;
                this.oldLogE[c2][i2] = -28672;
            }
            for (i2 = end; i2 < nbEBands; ++i2) {
                this.oldBandE[c2][i2] = 0;
                this.oldLogE2[c2][i2] = -28672;
                this.oldLogE[c2][i2] = -28672;
            }
        } while (++c2 < CC2);
        this.consec_transient = isTransient != 0 || transient_got_disabled ? ++this.consec_transient : 0;
        this.rng = (int)enc.rng;
        enc.enc_done();
        if (enc.get_error() != 0) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        return nbCompressedBytes;
    }

    void SetComplexity(int value) {
        if (value < 0 || value > 10) {
            throw new IllegalArgumentException("Complexity must be between 0 and 10 inclusive");
        }
        this.complexity = value;
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

    void SetPacketLossPercent(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException("Packet loss must be between 0 and 100");
        }
        this.loss_rate = value;
    }

    void SetPrediction(int value) {
        if (value < 0 || value > 2) {
            throw new IllegalArgumentException("CELT prediction mode must be 0, 1, or 2");
        }
        this.disable_pf = value <= 1 ? 1 : 0;
        this.force_intra = value == 0 ? 1 : 0;
    }

    void SetVBRConstraint(boolean value) {
        this.constrained_vbr = value ? 1 : 0;
    }

    void SetVBR(boolean value) {
        this.vbr = value ? 1 : 0;
    }

    void SetBitrate(int value) {
        if (value <= 500 && value != -1) {
            throw new IllegalArgumentException("Bitrate out of range");
        }
        this.bitrate = value = Inlines.IMIN(value, 260000 * this.channels);
    }

    void SetChannels(int value) {
        if (value < 1 || value > 2) {
            throw new IllegalArgumentException("Channel count must be 1 or 2");
        }
        this.stream_channels = value;
    }

    void SetLSBDepth(int value) {
        if (value < 8 || value > 24) {
            throw new IllegalArgumentException("Bit depth must be between 8 and 24");
        }
        this.lsb_depth = value;
    }

    int GetLSBDepth() {
        return this.lsb_depth;
    }

    void SetExpertFrameDuration(OpusFramesize value) {
        this.variable_duration = value;
    }

    void SetSignalling(int value) {
        this.signalling = value;
    }

    void SetAnalysis(AnalysisInfo value) {
        if (value == null) {
            throw new IllegalArgumentException("AnalysisInfo");
        }
        this.analysis.Assign(value);
    }

    CeltMode GetMode() {
        return this.mode;
    }

    int GetFinalRange() {
        return this.rng;
    }

    void SetLFE(int value) {
        this.lfe = value;
    }

    void SetEnergyMask(int[] value) {
        this.energy_mask = value;
    }
}

