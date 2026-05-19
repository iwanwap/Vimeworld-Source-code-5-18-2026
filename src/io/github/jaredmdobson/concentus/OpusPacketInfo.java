/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueByte;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.BoxedValueShort;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.OpusBandwidth;
import io.github.jaredmdobson.concentus.OpusBandwidthHelpers;
import io.github.jaredmdobson.concentus.OpusDecoder;
import io.github.jaredmdobson.concentus.OpusError;
import io.github.jaredmdobson.concentus.OpusException;
import io.github.jaredmdobson.concentus.OpusMode;
import java.util.ArrayList;
import java.util.List;

public class OpusPacketInfo {
    public byte TOCByte;
    public List<Byte[]> Frames;
    public int PayloadOffset;

    private OpusPacketInfo(byte toc, List<Byte[]> frames, int payloadOffset) {
        this.TOCByte = toc;
        this.Frames = frames;
        this.PayloadOffset = payloadOffset;
    }

    public static OpusPacketInfo parseOpusPacket(byte[] packet, int packet_offset, int len) throws OpusException {
        BoxedValueInt packetOffset;
        BoxedValueInt payload_offset;
        short[] size;
        BoxedValueByte out_toc = new BoxedValueByte(0);
        int numFrames = OpusPacketInfo.getNumFrames(packet, packet_offset, len);
        byte[][] frames = new byte[numFrames][];
        int error = OpusPacketInfo.opus_packet_parse_impl(packet, packet_offset, len, 0, out_toc, frames, 0, size = new short[numFrames], 0, payload_offset = new BoxedValueInt(0), packetOffset = new BoxedValueInt(0));
        if (error < 0) {
            throw new OpusException("An error occurred while parsing the packet", error);
        }
        ArrayList<Byte[]> copiedFrames = new ArrayList<Byte[]>();
        for (int c2 = 0; c2 < frames.length; ++c2) {
            Byte[] convertedFrame = new Byte[frames[c2].length];
            for (int d2 = 0; d2 < convertedFrame.length; ++d2) {
                convertedFrame[d2] = frames[c2][d2];
            }
            copiedFrames.add(convertedFrame);
        }
        return new OpusPacketInfo(out_toc.Val, copiedFrames, payload_offset.Val);
    }

    public static int getNumSamplesPerFrame(byte[] packet, int packet_offset, int Fs2) {
        int audiosize;
        if ((packet[packet_offset] & 0x80) != 0) {
            audiosize = packet[packet_offset] >> 3 & 3;
            audiosize = (Fs2 << audiosize) / 400;
        } else {
            audiosize = (packet[packet_offset] & 0x60) == 96 ? ((packet[packet_offset] & 8) != 0 ? Fs2 / 50 : Fs2 / 100) : ((audiosize = packet[packet_offset] >> 3 & 3) == 3 ? Fs2 * 60 / 1000 : (Fs2 << audiosize) / 100);
        }
        return audiosize;
    }

    public static OpusBandwidth getBandwidth(byte[] packet, int packet_offset) {
        OpusBandwidth bandwidth;
        if ((packet[packet_offset] & 0x80) != 0) {
            bandwidth = OpusBandwidthHelpers.GetBandwidth(OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) + (packet[packet_offset] >> 5 & 3));
            if (bandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) {
                bandwidth = OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
            }
        } else {
            bandwidth = (packet[packet_offset] & 0x60) == 96 ? ((packet[packet_offset] & 0x10) != 0 ? OpusBandwidth.OPUS_BANDWIDTH_FULLBAND : OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND) : OpusBandwidthHelpers.GetBandwidth(OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) + (packet[packet_offset] >> 5 & 3));
        }
        return bandwidth;
    }

    public static int getNumEncodedChannels(byte[] packet, int packet_offset) {
        return (packet[packet_offset] & 4) != 0 ? 2 : 1;
    }

    public static int getNumFrames(byte[] packet, int packet_offset, int len) {
        if (len < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        int count = packet[packet_offset] & 3;
        if (count == 0) {
            return 1;
        }
        if (count != 3) {
            return 2;
        }
        if (len < 2) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        return packet[packet_offset + 1] & 0x3F;
    }

    public static int getNumSamples(byte[] packet, int packet_offset, int len, int Fs2) {
        int count = OpusPacketInfo.getNumFrames(packet, packet_offset, len);
        if (count < 0) {
            return count;
        }
        int samples = count * OpusPacketInfo.getNumSamplesPerFrame(packet, packet_offset, Fs2);
        if (samples * 25 > Fs2 * 3) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        return samples;
    }

    public static int getNumSamples(OpusDecoder dec, byte[] packet, int packet_offset, int len) {
        return OpusPacketInfo.getNumSamples(packet, packet_offset, len, dec.Fs);
    }

    public static OpusMode getEncoderMode(byte[] packet, int packet_offset) {
        OpusMode mode = (packet[packet_offset] & 0x80) != 0 ? OpusMode.MODE_CELT_ONLY : ((packet[packet_offset] & 0x60) == 96 ? OpusMode.MODE_HYBRID : OpusMode.MODE_SILK_ONLY);
        return mode;
    }

    static int encode_size(int size, byte[] data, int data_ptr) {
        if (size < 252) {
            data[data_ptr] = (byte)(size & 0xFF);
            return 1;
        }
        int dp1 = 252 + (size & 3);
        data[data_ptr] = (byte)(dp1 & 0xFF);
        data[data_ptr + 1] = (byte)(size - dp1 >> 2);
        return 2;
    }

    static int parse_size(byte[] data, int data_ptr, int len, BoxedValueShort size) {
        if (len < 1) {
            size.Val = (short)-1;
            return -1;
        }
        if (Inlines.SignedByteToUnsignedInt(data[data_ptr]) < 252) {
            size.Val = (short)Inlines.SignedByteToUnsignedInt(data[data_ptr]);
            return 1;
        }
        if (len < 2) {
            size.Val = (short)-1;
            return -1;
        }
        size.Val = (short)(4 * Inlines.SignedByteToUnsignedInt(data[data_ptr + 1]) + Inlines.SignedByteToUnsignedInt(data[data_ptr]));
        return 2;
    }

    static int opus_packet_parse_impl(byte[] data, int data_ptr, int len, int self_delimited, BoxedValueByte out_toc, byte[][] frames, int frames_ptr, short[] sizes, int sizes_ptr, BoxedValueInt payload_offset, BoxedValueInt packet_offset) {
        int i2;
        int bytes;
        BoxedValueShort boxed_size;
        int count;
        int pad = 0;
        int data0 = data_ptr;
        out_toc.Val = 0;
        payload_offset.Val = 0;
        packet_offset.Val = 0;
        if (sizes == null || len < 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (len == 0) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        int framesize = OpusPacketInfo.getNumSamplesPerFrame(data, data_ptr, 48000);
        boolean cbr = false;
        byte toc = data[data_ptr++];
        int last_size = --len;
        switch (toc & 3) {
            case 0: {
                count = 1;
                break;
            }
            case 1: {
                count = 2;
                cbr = true;
                if (self_delimited != 0) break;
                if ((len & 1) != 0) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                last_size = len / 2;
                sizes[sizes_ptr] = (short)last_size;
                break;
            }
            case 2: {
                count = 2;
                boxed_size = new BoxedValueShort(sizes[sizes_ptr]);
                bytes = OpusPacketInfo.parse_size(data, data_ptr, len, boxed_size);
                sizes[sizes_ptr] = boxed_size.Val;
                if (sizes[sizes_ptr] < 0 || sizes[sizes_ptr] > (len -= bytes)) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                data_ptr += bytes;
                last_size = len - sizes[sizes_ptr];
                break;
            }
            default: {
                int ch2;
                if (len < 1) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                if ((count = (ch2 = Inlines.SignedByteToUnsignedInt(data[data_ptr++])) & 0x3F) <= 0 || framesize * count > 5760) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                --len;
                if ((ch2 & 0x40) != 0) {
                    int p2;
                    do {
                        if (len <= 0) {
                            return OpusError.OPUS_INVALID_PACKET;
                        }
                        p2 = Inlines.SignedByteToUnsignedInt(data[data_ptr++]);
                        --len;
                        int tmp = p2 == 255 ? 254 : p2;
                        len -= tmp;
                        pad += tmp;
                    } while (p2 == 255);
                }
                if (len < 0) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                boolean bl2 = cbr = (ch2 & 0x80) == 0;
                if (!cbr) {
                    last_size = len;
                    for (i2 = 0; i2 < count - 1; ++i2) {
                        boxed_size = new BoxedValueShort(sizes[sizes_ptr + i2]);
                        bytes = OpusPacketInfo.parse_size(data, data_ptr, len, boxed_size);
                        sizes[sizes_ptr + i2] = boxed_size.Val;
                        if (sizes[sizes_ptr + i2] < 0 || sizes[sizes_ptr + i2] > (len -= bytes)) {
                            return OpusError.OPUS_INVALID_PACKET;
                        }
                        data_ptr += bytes;
                        last_size -= bytes + sizes[sizes_ptr + i2];
                    }
                    if (last_size >= 0) break;
                    return OpusError.OPUS_INVALID_PACKET;
                }
                if (self_delimited != 0) break;
                last_size = len / count;
                if (last_size * count != len) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                for (i2 = 0; i2 < count - 1; ++i2) {
                    sizes[sizes_ptr + i2] = (short)last_size;
                }
            }
        }
        if (self_delimited != 0) {
            boxed_size = new BoxedValueShort(sizes[sizes_ptr + count - 1]);
            bytes = OpusPacketInfo.parse_size(data, data_ptr, len, boxed_size);
            sizes[sizes_ptr + count - 1] = boxed_size.Val;
            if (sizes[sizes_ptr + count - 1] < 0 || sizes[sizes_ptr + count - 1] > (len -= bytes)) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            data_ptr += bytes;
            if (cbr) {
                if (sizes[sizes_ptr + count - 1] * count > len) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                for (i2 = 0; i2 < count - 1; ++i2) {
                    sizes[sizes_ptr + i2] = sizes[sizes_ptr + count - 1];
                }
            } else if (bytes + sizes[sizes_ptr + count - 1] > last_size) {
                return OpusError.OPUS_INVALID_PACKET;
            }
        } else {
            if (last_size > 1275) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            sizes[sizes_ptr + count - 1] = (short)last_size;
        }
        payload_offset.Val = data_ptr - data0;
        for (i2 = 0; i2 < count; ++i2) {
            if (frames != null) {
                frames[frames_ptr + i2] = new byte[data.length - data_ptr];
                System.arraycopy(data, data_ptr, frames[frames_ptr + i2], 0, data.length - data_ptr);
            }
            data_ptr += sizes[sizes_ptr + i2];
        }
        packet_offset.Val = pad + (data_ptr - data0);
        out_toc.Val = toc;
        return count;
    }
}

