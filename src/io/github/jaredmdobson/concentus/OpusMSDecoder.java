/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueByte;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.ChannelLayout;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.OpusBandwidth;
import io.github.jaredmdobson.concentus.OpusDecoder;
import io.github.jaredmdobson.concentus.OpusError;
import io.github.jaredmdobson.concentus.OpusException;
import io.github.jaredmdobson.concentus.OpusMultistream;
import io.github.jaredmdobson.concentus.OpusPacketInfo;

public class OpusMSDecoder {
    ChannelLayout layout = new ChannelLayout();
    OpusDecoder[] decoders = null;

    private OpusMSDecoder(int nb_streams, int nb_coupled_streams) {
        this.decoders = new OpusDecoder[nb_streams];
        for (int c2 = 0; c2 < nb_streams; ++c2) {
            this.decoders[c2] = new OpusDecoder();
        }
    }

    int opus_multistream_decoder_init(int Fs2, int channels, int streams, int coupled_streams, short[] mapping) {
        int ret;
        int i2;
        int decoder_ptr = 0;
        if (channels > 255 || channels < 1 || coupled_streams > streams || streams < 1 || coupled_streams < 0 || streams > 255 - coupled_streams) {
            throw new IllegalArgumentException("Invalid channel or coupled stream count");
        }
        this.layout.nb_channels = channels;
        this.layout.nb_streams = streams;
        this.layout.nb_coupled_streams = coupled_streams;
        for (i2 = 0; i2 < this.layout.nb_channels; ++i2) {
            this.layout.mapping[i2] = mapping[i2];
        }
        if (OpusMultistream.validate_layout(this.layout) == 0) {
            throw new IllegalArgumentException("Invalid surround channel layout");
        }
        for (i2 = 0; i2 < this.layout.nb_coupled_streams; ++i2) {
            ret = this.decoders[decoder_ptr].opus_decoder_init(Fs2, 2);
            if (ret != OpusError.OPUS_OK) {
                return ret;
            }
            ++decoder_ptr;
        }
        while (i2 < this.layout.nb_streams) {
            ret = this.decoders[decoder_ptr].opus_decoder_init(Fs2, 1);
            if (ret != OpusError.OPUS_OK) {
                return ret;
            }
            ++decoder_ptr;
            ++i2;
        }
        return OpusError.OPUS_OK;
    }

    public static OpusMSDecoder create(int Fs2, int channels, int streams, int coupled_streams, short[] mapping) throws OpusException {
        if (channels > 255 || channels < 1 || coupled_streams > streams || streams < 1 || coupled_streams < 0 || streams > 255 - coupled_streams) {
            throw new IllegalArgumentException("Invalid channel / stream configuration");
        }
        OpusMSDecoder st2 = new OpusMSDecoder(streams, coupled_streams);
        int ret = st2.opus_multistream_decoder_init(Fs2, channels, streams, coupled_streams, mapping);
        if (ret != OpusError.OPUS_OK) {
            if (ret == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("Bad argument while creating MS decoder");
            }
            throw new OpusException("Could not create MS decoder", ret);
        }
        return st2;
    }

    static int opus_multistream_packet_validate(byte[] data, int data_ptr, int len, int nb_streams, int Fs2) {
        BoxedValueByte toc = new BoxedValueByte(0);
        short[] size = new short[48];
        int samples = 0;
        BoxedValueInt packet_offset = new BoxedValueInt(0);
        BoxedValueInt dummy = new BoxedValueInt(0);
        for (int s2 = 0; s2 < nb_streams; ++s2) {
            if (len <= 0) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            int count = OpusPacketInfo.opus_packet_parse_impl(data, data_ptr, len, s2 != nb_streams - 1 ? 1 : 0, toc, null, 0, size, 0, dummy, packet_offset);
            if (count < 0) {
                return count;
            }
            int tmp_samples = OpusPacketInfo.getNumSamples(data, data_ptr, packet_offset.Val, Fs2);
            if (s2 != 0 && samples != tmp_samples) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            samples = tmp_samples;
            data_ptr += packet_offset.Val;
            len -= packet_offset.Val;
        }
        return samples;
    }

    int opus_multistream_decode_native(byte[] data, int data_ptr, int len, short[] pcm, int pcm_ptr, int frame_size, int decode_fec, int soft_clip) {
        boolean do_plc = false;
        int Fs2 = this.getSampleRate();
        frame_size = Inlines.IMIN(frame_size, Fs2 / 25 * 3);
        short[] buf = new short[2 * frame_size];
        int decoder_ptr = 0;
        if (len == 0) {
            do_plc = true;
        }
        if (len < 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (!do_plc && len < 2 * this.layout.nb_streams - 1) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        if (!do_plc) {
            int ret = OpusMSDecoder.opus_multistream_packet_validate(data, data_ptr, len, this.layout.nb_streams, Fs2);
            if (ret < 0) {
                return ret;
            }
            if (ret > frame_size) {
                return OpusError.OPUS_BUFFER_TOO_SMALL;
            }
        }
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            int chan;
            int prev;
            OpusDecoder dec = this.decoders[decoder_ptr++];
            if (!do_plc && len <= 0) {
                return OpusError.OPUS_INTERNAL_ERROR;
            }
            BoxedValueInt packet_offset = new BoxedValueInt(0);
            int ret = dec.opus_decode_native(data, data_ptr, len, buf, 0, frame_size, decode_fec, s2 != this.layout.nb_streams - 1 ? 1 : 0, packet_offset, soft_clip);
            data_ptr += packet_offset.Val;
            len -= packet_offset.Val;
            if (ret <= 0) {
                return ret;
            }
            frame_size = ret;
            if (s2 < this.layout.nb_coupled_streams) {
                prev = -1;
                while ((chan = OpusMultistream.get_left_channel(this.layout, s2, prev)) != -1) {
                    OpusMSDecoder.opus_copy_channel_out_short(pcm, pcm_ptr, this.layout.nb_channels, chan, buf, 0, 2, frame_size);
                    prev = chan;
                }
                prev = -1;
                while ((chan = OpusMultistream.get_right_channel(this.layout, s2, prev)) != -1) {
                    OpusMSDecoder.opus_copy_channel_out_short(pcm, pcm_ptr, this.layout.nb_channels, chan, buf, 1, 2, frame_size);
                    prev = chan;
                }
                continue;
            }
            prev = -1;
            while ((chan = OpusMultistream.get_mono_channel(this.layout, s2, prev)) != -1) {
                OpusMSDecoder.opus_copy_channel_out_short(pcm, pcm_ptr, this.layout.nb_channels, chan, buf, 0, 1, frame_size);
                prev = chan;
            }
        }
        for (int c2 = 0; c2 < this.layout.nb_channels; ++c2) {
            if (this.layout.mapping[c2] != 255) continue;
            OpusMSDecoder.opus_copy_channel_out_short(pcm, pcm_ptr, this.layout.nb_channels, c2, null, 0, 0, frame_size);
        }
        return frame_size;
    }

    static void opus_copy_channel_out_short(short[] dst, int dst_ptr, int dst_stride, int dst_channel, short[] src, int src_ptr, int src_stride, int frame_size) {
        if (src != null) {
            for (int i2 = 0; i2 < frame_size; ++i2) {
                dst[i2 * dst_stride + dst_channel + dst_ptr] = src[i2 * src_stride + src_ptr];
            }
        } else {
            for (int i3 = 0; i3 < frame_size; ++i3) {
                dst[i3 * dst_stride + dst_channel + dst_ptr] = 0;
            }
        }
    }

    public int decodeMultistream(byte[] data, int data_offset, int len, short[] out_pcm, int out_pcm_offset, int frame_size, int decode_fec) {
        return this.opus_multistream_decode_native(data, data_offset, len, out_pcm, out_pcm_offset, frame_size, decode_fec, 0);
    }

    public OpusBandwidth getBandwidth() {
        if (this.decoders == null || this.decoders.length == 0) {
            throw new IllegalStateException("Decoder not initialized");
        }
        return this.decoders[0].getBandwidth();
    }

    public int getSampleRate() {
        if (this.decoders == null || this.decoders.length == 0) {
            throw new IllegalStateException("Decoder not initialized");
        }
        return this.decoders[0].getSampleRate();
    }

    public int getGain() {
        if (this.decoders == null || this.decoders.length == 0) {
            throw new IllegalStateException("Decoder not initialized");
        }
        return this.decoders[0].getGain();
    }

    public void setGain(int value) {
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            this.decoders[s2].setGain(value);
        }
    }

    public int getLastPacketDuration() {
        if (this.decoders == null || this.decoders.length == 0) {
            return OpusError.OPUS_INVALID_STATE;
        }
        return this.decoders[0].getLastPacketDuration();
    }

    public int getFinalRange() {
        int value = 0;
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            value ^= this.decoders[s2].getFinalRange();
        }
        return value;
    }

    public void ResetState() {
        for (int s2 = 0; s2 < this.layout.nb_streams; ++s2) {
            this.decoders[s2].resetState();
        }
    }

    public OpusDecoder GetMultistreamDecoderState(int streamId) {
        return this.decoders[streamId];
    }
}

