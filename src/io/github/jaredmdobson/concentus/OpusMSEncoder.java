/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Bands;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltCommon;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.ChannelLayout;
import io.github.jaredmdobson.concentus.CodecHelpers;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.MDCT;
import io.github.jaredmdobson.concentus.OpusApplication;
import io.github.jaredmdobson.concentus.OpusBandwidth;
import io.github.jaredmdobson.concentus.OpusEncoder;
import io.github.jaredmdobson.concentus.OpusError;
import io.github.jaredmdobson.concentus.OpusException;
import io.github.jaredmdobson.concentus.OpusFramesize;
import io.github.jaredmdobson.concentus.OpusMode;
import io.github.jaredmdobson.concentus.OpusMultistream;
import io.github.jaredmdobson.concentus.OpusRepacketizer;
import io.github.jaredmdobson.concentus.OpusSignal;
import io.github.jaredmdobson.concentus.QuantizeBands;
import io.github.jaredmdobson.concentus.VorbisLayout;

public class OpusMSEncoder {
    final ChannelLayout layout = new ChannelLayout();
    int lfe_stream = 0;
    OpusApplication application = OpusApplication.OPUS_APPLICATION_AUDIO;
    OpusFramesize variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
    int surround = 0;
    int bitrate_bps = 0;
    final float[] subframe_mem = new float[3];
    OpusEncoder[] encoders = null;
    int[] window_mem = null;
    int[] preemph_mem = null;
    private static final int[] diff_table = new int[]{512, 300, 165, 87, 45, 23, 11, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0};
    private final int MS_FRAME_TMP = 3832;

    private OpusMSEncoder(int nb_streams, int nb_coupled_streams) {
        if (nb_streams < 1 || nb_coupled_streams > nb_streams || nb_coupled_streams < 0) {
            throw new IllegalArgumentException("Invalid channel count in MS encoder");
        }
        this.encoders = new OpusEncoder[nb_streams];
        for (int c2 = 0; c2 < nb_streams; ++c2) {
            this.encoders[c2] = new OpusEncoder();
        }
        int nb_channels = nb_coupled_streams * 2 + (nb_streams - nb_coupled_streams);
        this.window_mem = new int[nb_channels * 120];
        this.preemph_mem = new int[nb_channels];
    }

    public void resetState() {
        this.subframe_mem[2] = 0.0f;
        this.subframe_mem[1] = 0.0f;
        this.subframe_mem[0] = 0.0f;
        if (this.surround != 0) {
            Arrays.MemSet(this.preemph_mem, 0, this.layout.nb_channels);
            Arrays.MemSet(this.window_mem, 0, this.layout.nb_channels * 120);
        }
        int encoder_ptr = 0;
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            OpusEncoder enc = this.encoders[encoder_ptr++];
            enc.resetState();
        }
    }

    static int validate_encoder_layout(ChannelLayout layout) {
        for (int s2 = 0; s2 < layout.nb_streams; ++s2) {
            if (s2 < layout.nb_coupled_streams) {
                if (OpusMultistream.get_left_channel(layout, s2, -1) == -1) {
                    return 0;
                }
                if (OpusMultistream.get_right_channel(layout, s2, -1) != -1) continue;
                return 0;
            }
            if (OpusMultistream.get_mono_channel(layout, s2, -1) != -1) continue;
            return 0;
        }
        return 1;
    }

    static void channel_pos(int channels, int[] pos) {
        if (channels == 4) {
            pos[0] = 1;
            pos[1] = 3;
            pos[2] = 1;
            pos[3] = 3;
        } else if (channels == 3 || channels == 5 || channels == 6) {
            pos[0] = 1;
            pos[1] = 2;
            pos[2] = 3;
            pos[3] = 1;
            pos[4] = 3;
            pos[5] = 0;
        } else if (channels == 7) {
            pos[0] = 1;
            pos[1] = 2;
            pos[2] = 3;
            pos[3] = 1;
            pos[4] = 3;
            pos[5] = 2;
            pos[6] = 0;
        } else if (channels == 8) {
            pos[0] = 1;
            pos[1] = 2;
            pos[2] = 3;
            pos[3] = 1;
            pos[4] = 3;
            pos[5] = 1;
            pos[6] = 3;
            pos[7] = 0;
        }
    }

    static int logSum(int a2, int b2) {
        int diff;
        int max;
        if (a2 > b2) {
            max = a2;
            diff = Inlines.SUB32(Inlines.EXTEND32(a2), Inlines.EXTEND32(b2));
        } else {
            max = b2;
            diff = Inlines.SUB32(Inlines.EXTEND32(b2), Inlines.EXTEND32(a2));
        }
        if (diff >= 8192) {
            return max;
        }
        int low = Inlines.SHR32(diff, 9);
        int frac = Inlines.SHL16(diff - Inlines.SHL16(low, 9), 6);
        return max + diff_table[low] + Inlines.MULT16_16_Q15(frac, Inlines.SUB16(diff_table[low + 1], diff_table[low]));
    }

    static void surround_analysis(CeltMode celt_mode, short[] pcm, int pcm_ptr, int[] bandLogE, int[] mem, int[] preemph_mem, int len, int overlap, int channels, int rate) {
        int i2;
        int c2;
        int LM2;
        int[] pos = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[][] bandE = Arrays.InitTwoDimensionalArrayInt(1, 21);
        int[][] maskLogE = Arrays.InitTwoDimensionalArrayInt(3, 21);
        int upsample = CeltCommon.resampling_factor(rate);
        int frame_size = len * upsample;
        for (LM2 = 0; LM2 < celt_mode.maxLM && celt_mode.shortMdctSize << LM2 != frame_size; ++LM2) {
        }
        int[] input = new int[frame_size + overlap];
        short[] x2 = new short[len];
        int[][] freq = Arrays.InitTwoDimensionalArrayInt(1, frame_size);
        OpusMSEncoder.channel_pos(channels, pos);
        for (c2 = 0; c2 < 3; ++c2) {
            for (i2 = 0; i2 < 21; ++i2) {
                maskLogE[c2][i2] = -28672;
            }
        }
        for (c2 = 0; c2 < channels; ++c2) {
            System.arraycopy(mem, c2 * overlap, input, 0, overlap);
            OpusMSEncoder.opus_copy_channel_in_short(x2, 0, 1, pcm, pcm_ptr, channels, c2, len);
            BoxedValueInt boxed_preemph = new BoxedValueInt(preemph_mem[c2]);
            CeltCommon.celt_preemphasis(x2, input, overlap, frame_size, 1, upsample, celt_mode.preemph, boxed_preemph, 0);
            preemph_mem[c2] = boxed_preemph.Val;
            MDCT.clt_mdct_forward(celt_mode.mdct, input, 0, freq[0], 0, celt_mode.window, overlap, celt_mode.maxLM - LM2, 1);
            if (upsample != 1) {
                int bound = len;
                i2 = 0;
                while (i2 < bound) {
                    int[] nArray = freq[0];
                    int n2 = i2++;
                    nArray[n2] = nArray[n2] * upsample;
                }
                while (i2 < frame_size) {
                    freq[0][i2] = 0;
                    ++i2;
                }
            }
            Bands.compute_band_energies(celt_mode, freq, bandE, 21, 1, LM2);
            QuantizeBands.amp2Log2(celt_mode, 21, 21, bandE[0], bandLogE, 21 * c2, 1);
            for (i2 = 1; i2 < 21; ++i2) {
                bandLogE[21 * c2 + i2] = Inlines.MAX16(bandLogE[21 * c2 + i2], bandLogE[21 * c2 + i2 - 1] - 1024);
            }
            for (i2 = 19; i2 >= 0; --i2) {
                bandLogE[21 * c2 + i2] = Inlines.MAX16(bandLogE[21 * c2 + i2], bandLogE[21 * c2 + i2 + 1] - 2048);
            }
            if (pos[c2] == 1) {
                for (i2 = 0; i2 < 21; ++i2) {
                    maskLogE[0][i2] = OpusMSEncoder.logSum(maskLogE[0][i2], bandLogE[21 * c2 + i2]);
                }
            } else if (pos[c2] == 3) {
                for (i2 = 0; i2 < 21; ++i2) {
                    maskLogE[2][i2] = OpusMSEncoder.logSum(maskLogE[2][i2], bandLogE[21 * c2 + i2]);
                }
            } else if (pos[c2] == 2) {
                for (i2 = 0; i2 < 21; ++i2) {
                    maskLogE[0][i2] = OpusMSEncoder.logSum(maskLogE[0][i2], bandLogE[21 * c2 + i2] - 512);
                    maskLogE[2][i2] = OpusMSEncoder.logSum(maskLogE[2][i2], bandLogE[21 * c2 + i2] - 512);
                }
            }
            System.arraycopy(input, frame_size, mem, c2 * overlap, overlap);
        }
        for (i2 = 0; i2 < 21; ++i2) {
            maskLogE[1][i2] = Inlines.MIN32(maskLogE[0][i2], maskLogE[2][i2]);
        }
        int channel_offset = Inlines.HALF16(Inlines.celt_log2(32768 / (channels - 1)));
        for (c2 = 0; c2 < 3; ++c2) {
            i2 = 0;
            while (i2 < 21) {
                int[] nArray = maskLogE[c2];
                int n3 = i2++;
                nArray[n3] = nArray[n3] + channel_offset;
            }
        }
        for (c2 = 0; c2 < channels; ++c2) {
            if (pos[c2] != 0) {
                int[] mask = maskLogE[pos[c2] - 1];
                for (i2 = 0; i2 < 21; ++i2) {
                    bandLogE[21 * c2 + i2] = bandLogE[21 * c2 + i2] - mask[i2];
                }
                continue;
            }
            for (i2 = 0; i2 < 21; ++i2) {
                bandLogE[21 * c2 + i2] = 0;
            }
        }
    }

    int opus_multistream_encoder_init(int Fs2, int channels, int streams, int coupled_streams, short[] mapping, OpusApplication application, int surround) {
        int ret;
        int i2;
        if (channels > 255 || channels < 1 || coupled_streams > streams || streams < 1 || coupled_streams < 0 || streams > 255 - coupled_streams) {
            return OpusError.OPUS_BAD_ARG;
        }
        this.layout.nb_channels = channels;
        this.layout.nb_streams = streams;
        this.layout.nb_coupled_streams = coupled_streams;
        this.subframe_mem[2] = 0.0f;
        this.subframe_mem[1] = 0.0f;
        this.subframe_mem[0] = 0.0f;
        if (surround == 0) {
            this.lfe_stream = -1;
        }
        this.bitrate_bps = -1000;
        this.application = application;
        this.variable_duration = OpusFramesize.OPUS_FRAMESIZE_ARG;
        for (i2 = 0; i2 < this.layout.nb_channels; ++i2) {
            this.layout.mapping[i2] = mapping[i2];
        }
        if (OpusMultistream.validate_layout(this.layout) == 0 || OpusMSEncoder.validate_encoder_layout(this.layout) == 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        int encoder_ptr = 0;
        for (i2 = 0; i2 < this.layout.nb_coupled_streams; ++i2) {
            ret = this.encoders[encoder_ptr].opus_init_encoder(Fs2, 2, application);
            if (ret != OpusError.OPUS_OK) {
                return ret;
            }
            if (i2 == this.lfe_stream) {
                this.encoders[encoder_ptr].setIsLFE(true);
            }
            ++encoder_ptr;
        }
        while (i2 < this.layout.nb_streams) {
            ret = this.encoders[encoder_ptr].opus_init_encoder(Fs2, 1, application);
            if (i2 == this.lfe_stream) {
                this.encoders[encoder_ptr].setIsLFE(true);
            }
            if (ret != OpusError.OPUS_OK) {
                return ret;
            }
            ++encoder_ptr;
            ++i2;
        }
        if (surround != 0) {
            Arrays.MemSet(this.preemph_mem, 0, channels);
            Arrays.MemSet(this.window_mem, 0, channels * 120);
        }
        this.surround = surround;
        return OpusError.OPUS_OK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    int opus_multistream_surround_encoder_init(int Fs2, int channels, int mapping_family, BoxedValueInt streams, BoxedValueInt coupled_streams, short[] mapping, OpusApplication application) {
        streams.Val = 0;
        coupled_streams.Val = 0;
        if (channels > 255 || channels < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        this.lfe_stream = -1;
        if (mapping_family == 0) {
            if (channels == 1) {
                streams.Val = 1;
                coupled_streams.Val = 0;
                mapping[0] = 0;
                return this.opus_multistream_encoder_init(Fs2, channels, streams.Val, coupled_streams.Val, mapping, application, channels > 2 && mapping_family == 1 ? 1 : 0);
            } else {
                if (channels != 2) return OpusError.OPUS_UNIMPLEMENTED;
                streams.Val = 1;
                coupled_streams.Val = 1;
                mapping[0] = 0;
                mapping[1] = 1;
            }
            return this.opus_multistream_encoder_init(Fs2, channels, streams.Val, coupled_streams.Val, mapping, application, channels > 2 && mapping_family == 1 ? 1 : 0);
        } else if (mapping_family == 1 && channels <= 8 && channels >= 1) {
            streams.Val = VorbisLayout.vorbis_mappings[channels - 1].nb_streams;
            coupled_streams.Val = VorbisLayout.vorbis_mappings[channels - 1].nb_coupled_streams;
            for (int i2 = 0; i2 < channels; ++i2) {
                mapping[i2] = VorbisLayout.vorbis_mappings[channels - 1].mapping[i2];
            }
            if (channels < 6) return this.opus_multistream_encoder_init(Fs2, channels, streams.Val, coupled_streams.Val, mapping, application, channels > 2 && mapping_family == 1 ? 1 : 0);
            this.lfe_stream = streams.Val - 1;
            return this.opus_multistream_encoder_init(Fs2, channels, streams.Val, coupled_streams.Val, mapping, application, channels > 2 && mapping_family == 1 ? 1 : 0);
        } else {
            if (mapping_family != 255) return OpusError.OPUS_UNIMPLEMENTED;
            streams.Val = channels;
            coupled_streams.Val = 0;
            for (int i3 = 0; i3 < channels; i3 = (int)((byte)(i3 + 1))) {
                mapping[i3] = (short)i3;
            }
        }
        return this.opus_multistream_encoder_init(Fs2, channels, streams.Val, coupled_streams.Val, mapping, application, channels > 2 && mapping_family == 1 ? 1 : 0);
    }

    public static OpusMSEncoder Create(int Fs2, int channels, int streams, int coupled_streams, short[] mapping, OpusApplication application) throws OpusException {
        if (channels > 255 || channels < 1 || coupled_streams > streams || streams < 1 || coupled_streams < 0 || streams > 255 - coupled_streams) {
            throw new IllegalArgumentException("Invalid channel / stream configuration");
        }
        OpusMSEncoder st2 = new OpusMSEncoder(streams, coupled_streams);
        int ret = st2.opus_multistream_encoder_init(Fs2, channels, streams, coupled_streams, mapping, application, 0);
        if (ret != OpusError.OPUS_OK) {
            if (ret == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("OPUS_BAD_ARG when creating MS encoder");
            }
            throw new OpusException("Could not create MS encoder", ret);
        }
        return st2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void GetStreamCount(int channels, int mapping_family, BoxedValueInt nb_streams, BoxedValueInt nb_coupled_streams) {
        if (mapping_family == 0) {
            if (channels == 1) {
                nb_streams.Val = 1;
                nb_coupled_streams.Val = 0;
                return;
            } else {
                if (channels != 2) throw new IllegalArgumentException("More than 2 channels requires custom mappings");
                nb_streams.Val = 1;
                nb_coupled_streams.Val = 1;
            }
            return;
        } else if (mapping_family == 1 && channels <= 8 && channels >= 1) {
            nb_streams.Val = VorbisLayout.vorbis_mappings[channels - 1].nb_streams;
            nb_coupled_streams.Val = VorbisLayout.vorbis_mappings[channels - 1].nb_coupled_streams;
            return;
        } else {
            if (mapping_family != 255) throw new IllegalArgumentException("Invalid mapping family");
            nb_streams.Val = channels;
            nb_coupled_streams.Val = 0;
        }
    }

    public static OpusMSEncoder CreateSurround(int Fs2, int channels, int mapping_family, BoxedValueInt streams, BoxedValueInt coupled_streams, short[] mapping, OpusApplication application) throws OpusException {
        if (channels > 255 || channels < 1 || application == OpusApplication.OPUS_APPLICATION_UNIMPLEMENTED) {
            throw new IllegalArgumentException("Invalid channel count or application");
        }
        BoxedValueInt nb_streams = new BoxedValueInt(0);
        BoxedValueInt nb_coupled_streams = new BoxedValueInt(0);
        OpusMSEncoder.GetStreamCount(channels, mapping_family, nb_streams, nb_coupled_streams);
        OpusMSEncoder st2 = new OpusMSEncoder(nb_streams.Val, nb_coupled_streams.Val);
        int ret = st2.opus_multistream_surround_encoder_init(Fs2, channels, mapping_family, streams, coupled_streams, mapping, application);
        if (ret != OpusError.OPUS_OK) {
            if (ret == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("Bad argument passed to CreateSurround");
            }
            throw new OpusException("Could not create multistream encoder", ret);
        }
        return st2;
    }

    int surround_rate_allocation(int[] out_rates, int frame_size) {
        int channel_rate;
        int rate_sum = 0;
        OpusEncoder ptr = this.encoders[0];
        int Fs2 = ptr.getSampleRate();
        int stream_offset = this.bitrate_bps > this.layout.nb_channels * 40000 ? 20000 : this.bitrate_bps / this.layout.nb_channels / 2;
        stream_offset += 60 * (Fs2 / frame_size - 50);
        int lfe_offset = 3500 + 60 * (Fs2 / frame_size - 50);
        int coupled_ratio = 512;
        int lfe_ratio = 32;
        if (this.bitrate_bps == -1000) {
            channel_rate = Fs2 + 60 * Fs2 / frame_size;
        } else if (this.bitrate_bps == -1) {
            channel_rate = 300000;
        } else {
            int nb_lfe = this.lfe_stream != -1 ? 1 : 0;
            int nb_coupled = this.layout.nb_coupled_streams;
            int nb_uncoupled = this.layout.nb_streams - nb_coupled - nb_lfe;
            int total = (nb_uncoupled << 8) + coupled_ratio * nb_coupled + nb_lfe * lfe_ratio;
            channel_rate = 256 * (this.bitrate_bps - lfe_offset * nb_lfe - stream_offset * (nb_coupled + nb_uncoupled)) / total;
        }
        for (int i2 = 0; i2 < this.layout.nb_streams; ++i2) {
            out_rates[i2] = i2 < this.layout.nb_coupled_streams ? stream_offset + (channel_rate * coupled_ratio >> 8) : (i2 != this.lfe_stream ? stream_offset + channel_rate : lfe_offset + (channel_rate * lfe_ratio >> 8));
            out_rates[i2] = Inlines.IMAX(out_rates[i2], 500);
            rate_sum += out_rates[i2];
        }
        return rate_sum;
    }

    int opus_multistream_encode_native(short[] pcm, int pcm_ptr, int analysis_frame_size, byte[] data, int data_ptr, int max_data_bytes, int lsb_depth, int float_api) {
        int s2;
        byte[] tmp_data = new byte[3832];
        OpusRepacketizer rp2 = new OpusRepacketizer();
        int[] bitrates = new int[256];
        int[] bandLogE = new int[42];
        int[] mem = null;
        int[] preemph_mem = null;
        if (this.surround != 0) {
            preemph_mem = this.preemph_mem;
            mem = this.window_mem;
        }
        int encoder_ptr = 0;
        int Fs2 = this.encoders[encoder_ptr].getSampleRate();
        boolean vbr = this.encoders[encoder_ptr].getUseVBR();
        CeltMode celt_mode = this.encoders[encoder_ptr].GetCeltMode();
        int channels = this.layout.nb_streams + this.layout.nb_coupled_streams;
        int delay_compensation = this.encoders[encoder_ptr].getLookahead();
        int frame_size = CodecHelpers.compute_frame_size(pcm, pcm_ptr, analysis_frame_size, this.variable_duration, channels, Fs2, this.bitrate_bps, delay_compensation -= Fs2 / 400, this.subframe_mem, this.encoders[encoder_ptr].analysis.enabled);
        if (400 * frame_size < Fs2) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (400 * frame_size != Fs2 && 200 * frame_size != Fs2 && 100 * frame_size != Fs2 && 50 * frame_size != Fs2 && 25 * frame_size != Fs2 && 50 * frame_size != 3 * Fs2) {
            return OpusError.OPUS_BAD_ARG;
        }
        int smallest_packet = this.layout.nb_streams * 2 - 1;
        if (max_data_bytes < smallest_packet) {
            return OpusError.OPUS_BUFFER_TOO_SMALL;
        }
        short[] buf = new short[2 * frame_size];
        int[] bandSMR = new int[21 * this.layout.nb_channels];
        if (this.surround != 0) {
            OpusMSEncoder.surround_analysis(celt_mode, pcm, pcm_ptr, bandSMR, mem, preemph_mem, frame_size, 120, this.layout.nb_channels, Fs2);
        }
        int rate_sum = this.surround_rate_allocation(bitrates, frame_size);
        if (!vbr) {
            if (this.bitrate_bps == -1000) {
                max_data_bytes = Inlines.IMIN(max_data_bytes, 3 * rate_sum / (24 * Fs2 / frame_size));
            } else if (this.bitrate_bps != -1) {
                max_data_bytes = Inlines.IMIN(max_data_bytes, Inlines.IMAX(smallest_packet, 3 * this.bitrate_bps / (24 * Fs2 / frame_size)));
            }
        }
        for (s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            OpusEncoder enc = this.encoders[encoder_ptr];
            ++encoder_ptr;
            enc.setBitrate(bitrates[s2]);
            if (this.surround == 0) continue;
            int equiv_rate = this.bitrate_bps;
            if (frame_size * 50 < Fs2) {
                equiv_rate -= 60 * (Fs2 / frame_size - 50) * this.layout.nb_channels;
            }
            if (equiv_rate > 10000 * this.layout.nb_channels) {
                enc.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_FULLBAND);
            } else if (equiv_rate > 7000 * this.layout.nb_channels) {
                enc.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND);
            } else if (equiv_rate > 5000 * this.layout.nb_channels) {
                enc.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND);
            } else {
                enc.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND);
            }
            if (s2 >= this.layout.nb_coupled_streams) continue;
            enc.setForceMode(OpusMode.MODE_CELT_ONLY);
            enc.setForceChannels(2);
        }
        encoder_ptr = 0;
        int tot_size = 0;
        for (s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            int len;
            int c2;
            int c1;
            int i2;
            rp2.Reset();
            OpusEncoder enc = this.encoders[encoder_ptr];
            if (s2 < this.layout.nb_coupled_streams) {
                int left = OpusMultistream.get_left_channel(this.layout, s2, -1);
                int right = OpusMultistream.get_right_channel(this.layout, s2, -1);
                OpusMSEncoder.opus_copy_channel_in_short(buf, 0, 2, pcm, pcm_ptr, this.layout.nb_channels, left, frame_size);
                OpusMSEncoder.opus_copy_channel_in_short(buf, 1, 2, pcm, pcm_ptr, this.layout.nb_channels, right, frame_size);
                ++encoder_ptr;
                if (this.surround != 0) {
                    for (i2 = 0; i2 < 21; ++i2) {
                        bandLogE[i2] = bandSMR[21 * left + i2];
                        bandLogE[21 + i2] = bandSMR[21 * right + i2];
                    }
                }
                c1 = left;
                c2 = right;
            } else {
                int chan = OpusMultistream.get_mono_channel(this.layout, s2, -1);
                OpusMSEncoder.opus_copy_channel_in_short(buf, 0, 1, pcm, pcm_ptr, this.layout.nb_channels, chan, frame_size);
                ++encoder_ptr;
                if (this.surround != 0) {
                    for (i2 = 0; i2 < 21; ++i2) {
                        bandLogE[i2] = bandSMR[21 * chan + i2];
                    }
                }
                c1 = chan;
                c2 = -1;
            }
            if (this.surround != 0) {
                enc.SetEnergyMask(bandLogE);
            }
            int curr_max = max_data_bytes - tot_size;
            curr_max -= Inlines.IMAX(0, 2 * (this.layout.nb_streams - s2 - 1) - 1);
            curr_max = Inlines.IMIN(curr_max, 3832);
            if (s2 != this.layout.nb_streams - 1) {
                curr_max -= curr_max > 253 ? 2 : 1;
            }
            if (!vbr && s2 == this.layout.nb_streams - 1) {
                enc.setBitrate(curr_max * (8 * Fs2 / frame_size));
            }
            if ((len = enc.opus_encode_native(buf, 0, frame_size, tmp_data, 0, curr_max, lsb_depth, pcm, pcm_ptr, analysis_frame_size, c1, c2, this.layout.nb_channels, float_api)) < 0) {
                return len;
            }
            rp2.addPacket(tmp_data, 0, len);
            len = rp2.opus_repacketizer_out_range_impl(0, rp2.getNumFrames(), data, data_ptr, max_data_bytes - tot_size, s2 != this.layout.nb_streams - 1 ? 1 : 0, !vbr && s2 == this.layout.nb_streams - 1 ? 1 : 0);
            data_ptr += len;
            tot_size += len;
        }
        return tot_size;
    }

    static void opus_copy_channel_in_short(short[] dst, int dst_ptr, int dst_stride, short[] src, int src_ptr, int src_stride, int src_channel, int frame_size) {
        for (int i2 = 0; i2 < frame_size; ++i2) {
            dst[dst_ptr + i2 * dst_stride] = src[i2 * src_stride + src_channel + src_ptr];
        }
    }

    public int encodeMultistream(short[] pcm, int pcm_offset, int frame_size, byte[] outputBuffer, int outputBuffer_offset, int max_data_bytes) {
        return this.opus_multistream_encode_native(pcm, pcm_offset, frame_size, outputBuffer, outputBuffer_offset, max_data_bytes, 16, 0);
    }

    public int getBitrate() {
        int value = 0;
        int encoder_ptr = 0;
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            OpusEncoder enc = this.encoders[encoder_ptr++];
            value += enc.getBitrate();
        }
        return value;
    }

    public void setBitrate(int value) {
        if (value < 0 && value != -1000 && value != -1) {
            throw new IllegalArgumentException("Invalid bitrate");
        }
        this.bitrate_bps = value;
    }

    public OpusApplication getApplication() {
        return this.encoders[0].getApplication();
    }

    public void setApplication(OpusApplication value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setApplication(value);
        }
    }

    public int getForceChannels() {
        return this.encoders[0].getForceChannels();
    }

    public void setForceChannels(int value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setForceChannels(value);
        }
    }

    public OpusBandwidth getMaxBandwidth() {
        return this.encoders[0].getMaxBandwidth();
    }

    public void setMaxBandwidth(OpusBandwidth value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setMaxBandwidth(value);
        }
    }

    public OpusBandwidth getBandwidth() {
        return this.encoders[0].getBandwidth();
    }

    public void setBandwidth(OpusBandwidth value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setBandwidth(value);
        }
    }

    public boolean getUseDTX() {
        return this.encoders[0].getUseDTX();
    }

    public void setUseDTX(boolean value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setUseDTX(value);
        }
    }

    public int getComplexity() {
        return this.encoders[0].getComplexity();
    }

    public void setComplexity(int value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setComplexity(value);
        }
    }

    public OpusMode getForceMode() {
        return this.encoders[0].getForceMode();
    }

    public void setForceMode(OpusMode value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setForceMode(value);
        }
    }

    public boolean getUseInbandFEC() {
        return this.encoders[0].getUseInbandFEC();
    }

    public void setUseInbandFEC(boolean value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setUseInbandFEC(value);
        }
    }

    public int getPacketLossPercent() {
        return this.encoders[0].getPacketLossPercent();
    }

    public void setPacketLossPercent(int value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setPacketLossPercent(value);
        }
    }

    public boolean getUseVBR() {
        return this.encoders[0].getUseVBR();
    }

    public void setUseVBR(boolean value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setUseVBR(value);
        }
    }

    public boolean getUseConstrainedVBR() {
        return this.encoders[0].getUseConstrainedVBR();
    }

    public void setUseConstrainedVBR(boolean value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setUseConstrainedVBR(value);
        }
    }

    public OpusSignal getSignalType() {
        return this.encoders[0].getSignalType();
    }

    public void setSignalType(OpusSignal value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setSignalType(value);
        }
    }

    public int getLookahead() {
        return this.encoders[0].getLookahead();
    }

    public int getSampleRate() {
        return this.encoders[0].getSampleRate();
    }

    public int getFinalRange() {
        int value = 0;
        int encoder_ptr = 0;
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            value ^= this.encoders[encoder_ptr++].getFinalRange();
        }
        return value;
    }

    public int getLSBDepth() {
        return this.encoders[0].getLSBDepth();
    }

    public void setLSBDepth(int value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setLSBDepth(value);
        }
    }

    public boolean getPredictionDisabled() {
        return this.encoders[0].getPredictionDisabled();
    }

    public void setPredictionDisabled(boolean value) {
        for (int encoder_ptr = 0; encoder_ptr < this.layout.nb_streams; ++encoder_ptr) {
            this.encoders[encoder_ptr].setPredictionDisabled(value);
        }
    }

    public OpusFramesize getExpertFrameDuration() {
        return this.variable_duration;
    }

    public void setExpertFrameDuration(OpusFramesize value) {
        this.variable_duration = value;
    }

    public OpusEncoder getMultistreamEncoderState(int streamId) {
        if (streamId >= this.layout.nb_streams) {
            throw new IllegalArgumentException("Requested stream doesn't exist");
        }
        return this.encoders[streamId];
    }
}

