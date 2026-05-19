/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.DecControlState;
import io.github.jaredmdobson.concentus.DecodeIndices;
import io.github.jaredmdobson.concentus.DecodePulses;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Resampler;
import io.github.jaredmdobson.concentus.SilkChannelDecoder;
import io.github.jaredmdobson.concentus.SilkDecoder;
import io.github.jaredmdobson.concentus.SilkError;
import io.github.jaredmdobson.concentus.SilkTables;
import io.github.jaredmdobson.concentus.Stereo;

class DecodeAPI {
    DecodeAPI() {
    }

    static int silk_InitDecoder(SilkDecoder decState) {
        decState.Reset();
        int ret = SilkError.SILK_NO_ERROR;
        SilkChannelDecoder[] channel_states = decState.channel_state;
        for (int n2 = 0; n2 < 2; ++n2) {
            ret = channel_states[n2].silk_init_decoder();
        }
        decState.sStereo.Reset();
        decState.prev_decode_only_middle = 0;
        return ret;
    }

    static int silk_Decode(SilkDecoder psDec, DecControlState decControl, int lostFlag, int newPacketFlag, EntropyCoder psRangeDec, short[] samplesOut, int samplesOut_ptr, BoxedValueInt nSamplesOut) {
        int resample_out_ptr;
        short[] resample_out;
        short[] samplesOut_tmp;
        boolean delay_stack_alloc;
        int condCoding;
        int i2;
        boolean stereo_to_mono;
        int n2;
        int decode_only_middle = 0;
        int ret = SilkError.SILK_NO_ERROR;
        BoxedValueInt nSamplesOutDec = new BoxedValueInt(0);
        int[] samplesOut_tmp_ptrs = new int[2];
        int[] MS_pred_Q13 = new int[]{0, 0};
        SilkChannelDecoder[] channel_state = psDec.channel_state;
        nSamplesOut.Val = 0;
        Inlines.OpusAssert(decControl.nChannelsInternal == 1 || decControl.nChannelsInternal == 2);
        if (newPacketFlag != 0) {
            for (n2 = 0; n2 < decControl.nChannelsInternal; ++n2) {
                channel_state[n2].nFramesDecoded = 0;
            }
        }
        if (decControl.nChannelsInternal > psDec.nChannelsInternal) {
            ret += channel_state[1].silk_init_decoder();
        }
        boolean bl2 = stereo_to_mono = decControl.nChannelsInternal == 1 && psDec.nChannelsInternal == 2 && decControl.internalSampleRate == 1000 * channel_state[0].fs_kHz;
        if (channel_state[0].nFramesDecoded == 0) {
            for (n2 = 0; n2 < decControl.nChannelsInternal; ++n2) {
                if (decControl.payloadSize_ms == 0) {
                    channel_state[n2].nFramesPerPacket = 1;
                    channel_state[n2].nb_subfr = 2;
                } else if (decControl.payloadSize_ms == 10) {
                    channel_state[n2].nFramesPerPacket = 1;
                    channel_state[n2].nb_subfr = 2;
                } else if (decControl.payloadSize_ms == 20) {
                    channel_state[n2].nFramesPerPacket = 1;
                    channel_state[n2].nb_subfr = 4;
                } else if (decControl.payloadSize_ms == 40) {
                    channel_state[n2].nFramesPerPacket = 2;
                    channel_state[n2].nb_subfr = 4;
                } else if (decControl.payloadSize_ms == 60) {
                    channel_state[n2].nFramesPerPacket = 3;
                    channel_state[n2].nb_subfr = 4;
                } else {
                    Inlines.OpusAssert(false);
                    return SilkError.SILK_DEC_INVALID_FRAME_SIZE;
                }
                int fs_kHz_dec = (decControl.internalSampleRate >> 10) + 1;
                if (fs_kHz_dec != 8 && fs_kHz_dec != 12 && fs_kHz_dec != 16) {
                    Inlines.OpusAssert(false);
                    return SilkError.SILK_DEC_INVALID_SAMPLING_FREQUENCY;
                }
                ret += channel_state[n2].silk_decoder_set_fs(fs_kHz_dec, decControl.API_sampleRate);
            }
        }
        if (decControl.nChannelsAPI == 2 && decControl.nChannelsInternal == 2 && (psDec.nChannelsAPI == 1 || psDec.nChannelsInternal == 1)) {
            Arrays.MemSet(psDec.sStereo.pred_prev_Q13, (short)0, 2);
            Arrays.MemSet(psDec.sStereo.sSide, (short)0, 2);
            channel_state[1].resampler_state.Assign(channel_state[0].resampler_state);
        }
        psDec.nChannelsAPI = decControl.nChannelsAPI;
        psDec.nChannelsInternal = decControl.nChannelsInternal;
        if (decControl.API_sampleRate > 48000 || decControl.API_sampleRate < 8000) {
            ret = SilkError.SILK_DEC_INVALID_SAMPLING_FREQUENCY;
            return ret;
        }
        if (lostFlag != 1 && channel_state[0].nFramesDecoded == 0) {
            for (n2 = 0; n2 < decControl.nChannelsInternal; ++n2) {
                for (i2 = 0; i2 < channel_state[n2].nFramesPerPacket; ++i2) {
                    channel_state[n2].VAD_flags[i2] = psRangeDec.dec_bit_logp(1L);
                }
                channel_state[n2].LBRR_flag = psRangeDec.dec_bit_logp(1L);
            }
            for (n2 = 0; n2 < decControl.nChannelsInternal; ++n2) {
                Arrays.MemSet(channel_state[n2].LBRR_flags, 0, 3);
                if (channel_state[n2].LBRR_flag == 0) continue;
                if (channel_state[n2].nFramesPerPacket == 1) {
                    channel_state[n2].LBRR_flags[0] = 1;
                    continue;
                }
                int LBRR_symbol = psRangeDec.dec_icdf(SilkTables.silk_LBRR_flags_iCDF_ptr[channel_state[n2].nFramesPerPacket - 2], 8) + 1;
                for (i2 = 0; i2 < channel_state[n2].nFramesPerPacket; ++i2) {
                    channel_state[n2].LBRR_flags[i2] = Inlines.silk_RSHIFT(LBRR_symbol, i2) & 1;
                }
            }
            if (lostFlag == 0) {
                for (i2 = 0; i2 < channel_state[0].nFramesPerPacket; ++i2) {
                    for (n2 = 0; n2 < decControl.nChannelsInternal; ++n2) {
                        if (channel_state[n2].LBRR_flags[i2] == 0) continue;
                        short[] pulses = new short[320];
                        if (decControl.nChannelsInternal == 2 && n2 == 0) {
                            Stereo.silk_stereo_decode_pred(psRangeDec, MS_pred_Q13);
                            if (channel_state[1].LBRR_flags[i2] == 0) {
                                BoxedValueInt decodeOnlyMiddleBoxed = new BoxedValueInt(decode_only_middle);
                                Stereo.silk_stereo_decode_mid_only(psRangeDec, decodeOnlyMiddleBoxed);
                                decode_only_middle = decodeOnlyMiddleBoxed.Val;
                            }
                        }
                        condCoding = i2 > 0 && channel_state[n2].LBRR_flags[i2 - 1] != 0 ? 2 : 0;
                        DecodeIndices.silk_decode_indices(channel_state[n2], psRangeDec, i2, 1, condCoding);
                        DecodePulses.silk_decode_pulses(psRangeDec, pulses, channel_state[n2].indices.signalType, channel_state[n2].indices.quantOffsetType, channel_state[n2].frame_length);
                    }
                }
            }
        }
        if (decControl.nChannelsInternal == 2) {
            if (lostFlag == 0 || lostFlag == 2 && channel_state[0].LBRR_flags[channel_state[0].nFramesDecoded] == 1) {
                Stereo.silk_stereo_decode_pred(psRangeDec, MS_pred_Q13);
                if (lostFlag == 0 && channel_state[1].VAD_flags[channel_state[0].nFramesDecoded] == 0 || lostFlag == 2 && channel_state[1].LBRR_flags[channel_state[0].nFramesDecoded] == 0) {
                    BoxedValueInt decodeOnlyMiddleBoxed = new BoxedValueInt(decode_only_middle);
                    Stereo.silk_stereo_decode_mid_only(psRangeDec, decodeOnlyMiddleBoxed);
                    decode_only_middle = decodeOnlyMiddleBoxed.Val;
                } else {
                    decode_only_middle = 0;
                }
            } else {
                for (n2 = 0; n2 < 2; ++n2) {
                    MS_pred_Q13[n2] = psDec.sStereo.pred_prev_Q13[n2];
                }
            }
        }
        if (decControl.nChannelsInternal == 2 && decode_only_middle == 0 && psDec.prev_decode_only_middle == 1) {
            Arrays.MemSet(psDec.channel_state[1].outBuf, (short)0, 480);
            Arrays.MemSet(psDec.channel_state[1].sLPC_Q14_buf, 0, 16);
            psDec.channel_state[1].lagPrev = 100;
            psDec.channel_state[1].LastGainIndex = (byte)10;
            psDec.channel_state[1].prevSignalType = 0;
            psDec.channel_state[1].first_frame_after_reset = 1;
        }
        boolean bl3 = delay_stack_alloc = decControl.internalSampleRate * decControl.nChannelsInternal < decControl.API_sampleRate * decControl.nChannelsAPI;
        if (delay_stack_alloc) {
            samplesOut_tmp = samplesOut;
            samplesOut_tmp_ptrs[0] = samplesOut_ptr;
            samplesOut_tmp_ptrs[1] = samplesOut_ptr + channel_state[0].frame_length + 2;
        } else {
            short[] samplesOut1_tmp_storage1 = new short[decControl.nChannelsInternal * (channel_state[0].frame_length + 2)];
            samplesOut_tmp = samplesOut1_tmp_storage1;
            samplesOut_tmp_ptrs[0] = 0;
            samplesOut_tmp_ptrs[1] = channel_state[0].frame_length + 2;
        }
        boolean has_side = lostFlag == 0 ? decode_only_middle == 0 : psDec.prev_decode_only_middle == 0 || decControl.nChannelsInternal == 2 && lostFlag == 2 && channel_state[1].LBRR_flags[channel_state[1].nFramesDecoded] == 1;
        for (n2 = 0; n2 < decControl.nChannelsInternal; ++n2) {
            if (n2 == 0 || has_side) {
                int FrameIndex = channel_state[0].nFramesDecoded - n2;
                condCoding = FrameIndex <= 0 ? 0 : (lostFlag == 2 ? (channel_state[n2].LBRR_flags[FrameIndex - 1] != 0 ? 2 : 0) : (n2 > 0 && psDec.prev_decode_only_middle != 0 ? 1 : 2));
                ret += channel_state[n2].silk_decode_frame(psRangeDec, samplesOut_tmp, samplesOut_tmp_ptrs[n2] + 2, nSamplesOutDec, lostFlag, condCoding);
            } else {
                Arrays.MemSetWithOffset(samplesOut_tmp, (short)0, samplesOut_tmp_ptrs[n2] + 2, nSamplesOutDec.Val);
            }
            ++channel_state[n2].nFramesDecoded;
        }
        if (decControl.nChannelsAPI == 2 && decControl.nChannelsInternal == 2) {
            Stereo.silk_stereo_MS_to_LR(psDec.sStereo, samplesOut_tmp, samplesOut_tmp_ptrs[0], samplesOut_tmp, samplesOut_tmp_ptrs[1], MS_pred_Q13, channel_state[0].fs_kHz, nSamplesOutDec.Val);
        } else {
            System.arraycopy(psDec.sStereo.sMid, 0, samplesOut_tmp, samplesOut_tmp_ptrs[0], 2);
            System.arraycopy(samplesOut_tmp, samplesOut_tmp_ptrs[0] + nSamplesOutDec.Val, psDec.sStereo.sMid, 0, 2);
        }
        nSamplesOut.Val = Inlines.silk_DIV32(nSamplesOutDec.Val * decControl.API_sampleRate, Inlines.silk_SMULBB(channel_state[0].fs_kHz, 1000));
        if (decControl.nChannelsAPI == 2) {
            short[] samplesOut2_tmp = new short[nSamplesOut.Val];
            resample_out = samplesOut2_tmp;
            resample_out_ptr = 0;
        } else {
            resample_out = samplesOut;
            resample_out_ptr = samplesOut_ptr;
        }
        if (delay_stack_alloc) {
            short[] samplesOut1_tmp_storage2 = new short[decControl.nChannelsInternal * (channel_state[0].frame_length + 2)];
            System.arraycopy(samplesOut, samplesOut_ptr, samplesOut1_tmp_storage2, 0, decControl.nChannelsInternal * (channel_state[0].frame_length + 2));
            samplesOut_tmp = samplesOut1_tmp_storage2;
            samplesOut_tmp_ptrs[0] = 0;
            samplesOut_tmp_ptrs[1] = channel_state[0].frame_length + 2;
        }
        for (n2 = 0; n2 < Inlines.silk_min(decControl.nChannelsAPI, decControl.nChannelsInternal); ++n2) {
            ret += Resampler.silk_resampler(channel_state[n2].resampler_state, resample_out, resample_out_ptr, samplesOut_tmp, samplesOut_tmp_ptrs[n2] + 1, nSamplesOutDec.Val);
            if (decControl.nChannelsAPI != 2) continue;
            int nptr = samplesOut_ptr + n2;
            for (i2 = 0; i2 < nSamplesOut.Val; ++i2) {
                samplesOut[nptr + 2 * i2] = resample_out[resample_out_ptr + i2];
            }
        }
        if (decControl.nChannelsAPI == 2 && decControl.nChannelsInternal == 1) {
            if (stereo_to_mono) {
                ret += Resampler.silk_resampler(channel_state[1].resampler_state, resample_out, resample_out_ptr, samplesOut_tmp, samplesOut_tmp_ptrs[0] + 1, nSamplesOutDec.Val);
                for (i2 = 0; i2 < nSamplesOut.Val; ++i2) {
                    samplesOut[samplesOut_ptr + 1 + 2 * i2] = resample_out[resample_out_ptr + i2];
                }
            } else {
                for (i2 = 0; i2 < nSamplesOut.Val; ++i2) {
                    samplesOut[samplesOut_ptr + 1 + 2 * i2] = samplesOut[samplesOut_ptr + 2 * i2];
                }
            }
        }
        if (channel_state[0].prevSignalType == 2) {
            int[] mult_tab = new int[]{6, 4, 3};
            decControl.prevPitchLag = channel_state[0].lagPrev * mult_tab[channel_state[0].fs_kHz - 8 >> 2];
        } else {
            decControl.prevPitchLag = 0;
        }
        if (lostFlag == 1) {
            for (i2 = 0; i2 < psDec.nChannelsInternal; ++i2) {
                psDec.channel_state[i2].LastGainIndex = (byte)10;
            }
        } else {
            psDec.prev_decode_only_middle = decode_only_middle;
        }
        return ret;
    }
}

