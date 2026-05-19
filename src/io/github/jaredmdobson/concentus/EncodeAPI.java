/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueByte;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.EncControlState;
import io.github.jaredmdobson.concentus.EncodeIndices;
import io.github.jaredmdobson.concentus.EncodePulses;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.HPVariableCutoff;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Resampler;
import io.github.jaredmdobson.concentus.SilkChannelEncoder;
import io.github.jaredmdobson.concentus.SilkEncoder;
import io.github.jaredmdobson.concentus.SilkError;
import io.github.jaredmdobson.concentus.SilkTables;
import io.github.jaredmdobson.concentus.Stereo;

class EncodeAPI {
    EncodeAPI() {
    }

    static int silk_InitEncoder(SilkEncoder encState, EncControlState encStatus) {
        int ret = SilkError.SILK_NO_ERROR;
        encState.Reset();
        for (int n2 = 0; n2 < 2; ++n2) {
            Inlines.OpusAssert((ret += SilkEncoder.silk_init_encoder(encState.state_Fxx[n2])) == SilkError.SILK_NO_ERROR);
        }
        encState.nChannelsAPI = 1;
        encState.nChannelsInternal = 1;
        Inlines.OpusAssert((ret += EncodeAPI.silk_QueryEncoder(encState, encStatus)) == SilkError.SILK_NO_ERROR);
        return ret;
    }

    static int silk_QueryEncoder(SilkEncoder encState, EncControlState encStatus) {
        int ret = SilkError.SILK_NO_ERROR;
        SilkChannelEncoder state_Fxx = encState.state_Fxx[0];
        encStatus.Reset();
        encStatus.nChannelsAPI = encState.nChannelsAPI;
        encStatus.nChannelsInternal = encState.nChannelsInternal;
        encStatus.API_sampleRate = state_Fxx.API_fs_Hz;
        encStatus.maxInternalSampleRate = state_Fxx.maxInternal_fs_Hz;
        encStatus.minInternalSampleRate = state_Fxx.minInternal_fs_Hz;
        encStatus.desiredInternalSampleRate = state_Fxx.desiredInternal_fs_Hz;
        encStatus.payloadSize_ms = state_Fxx.PacketSize_ms;
        encStatus.bitRate = state_Fxx.TargetRate_bps;
        encStatus.packetLossPercentage = state_Fxx.PacketLoss_perc;
        encStatus.complexity = state_Fxx.Complexity;
        encStatus.useInBandFEC = state_Fxx.useInBandFEC;
        encStatus.useDTX = state_Fxx.useDTX;
        encStatus.useCBR = state_Fxx.useCBR;
        encStatus.internalSampleRate = Inlines.silk_SMULBB(state_Fxx.fs_kHz, 1000);
        encStatus.allowBandwidthSwitch = state_Fxx.allow_bandwidth_switch;
        encStatus.inWBmodeWithoutVariableLP = state_Fxx.fs_kHz == 16 && state_Fxx.sLP.mode == 0 ? 1 : 0;
        return ret;
    }

    static int silk_Encode(SilkEncoder psEnc, EncControlState encControl, short[] samplesIn, int nSamplesIn, EntropyCoder psRangeEnc, BoxedValueInt nBytesOut, int prefillFlag) {
        int i2;
        int n2;
        int ret = SilkError.SILK_NO_ERROR;
        int tmp_payloadSize_ms = 0;
        int tmp_complexity = 0;
        int nSamplesFromInput = 0;
        int[] MStargetRates_bps = new int[2];
        nBytesOut.Val = 0;
        if (encControl.reducedDependency != 0) {
            psEnc.state_Fxx[0].first_frame_after_reset = 1;
            psEnc.state_Fxx[1].first_frame_after_reset = 1;
        }
        psEnc.state_Fxx[1].nFramesEncoded = 0;
        psEnc.state_Fxx[0].nFramesEncoded = 0;
        if ((ret += encControl.check_control_input()) != SilkError.SILK_NO_ERROR) {
            Inlines.OpusAssert(false);
            return ret;
        }
        encControl.switchReady = 0;
        if (encControl.nChannelsInternal > psEnc.nChannelsInternal) {
            ret += SilkEncoder.silk_init_encoder(psEnc.state_Fxx[1]);
            Arrays.MemSet(psEnc.sStereo.pred_prev_Q13, (short)0, 2);
            Arrays.MemSet(psEnc.sStereo.sSide, (short)0, 2);
            psEnc.sStereo.mid_side_amp_Q0[0] = 0;
            psEnc.sStereo.mid_side_amp_Q0[1] = 1;
            psEnc.sStereo.mid_side_amp_Q0[2] = 0;
            psEnc.sStereo.mid_side_amp_Q0[3] = 1;
            psEnc.sStereo.width_prev_Q14 = 0;
            psEnc.sStereo.smth_width_Q14 = (short)16384;
            if (psEnc.nChannelsAPI == 2) {
                psEnc.state_Fxx[1].resampler_state.Assign(psEnc.state_Fxx[0].resampler_state);
                System.arraycopy(psEnc.state_Fxx[0].In_HP_State, 0, psEnc.state_Fxx[1].In_HP_State, 0, 2);
            }
        }
        boolean transition = encControl.payloadSize_ms != psEnc.state_Fxx[0].PacketSize_ms || psEnc.nChannelsInternal != encControl.nChannelsInternal;
        psEnc.nChannelsAPI = encControl.nChannelsAPI;
        psEnc.nChannelsInternal = encControl.nChannelsInternal;
        int nBlocksOf10ms = Inlines.silk_DIV32(100 * nSamplesIn, encControl.API_sampleRate);
        int tot_blocks = nBlocksOf10ms > 1 ? nBlocksOf10ms >> 1 : 1;
        int curr_block = 0;
        if (prefillFlag != 0) {
            if (nBlocksOf10ms != 1) {
                Inlines.OpusAssert(false);
                return SilkError.SILK_ENC_INPUT_INVALID_NO_OF_SAMPLES;
            }
            for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                Inlines.OpusAssert((ret += SilkEncoder.silk_init_encoder(psEnc.state_Fxx[n2])) == SilkError.SILK_NO_ERROR);
            }
            tmp_payloadSize_ms = encControl.payloadSize_ms;
            encControl.payloadSize_ms = 10;
            tmp_complexity = encControl.complexity;
            encControl.complexity = 0;
            for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                psEnc.state_Fxx[n2].controlled_since_last_payload = 0;
                psEnc.state_Fxx[n2].prefillFlag = 1;
            }
        } else {
            if (nBlocksOf10ms * encControl.API_sampleRate != 100 * nSamplesIn || nSamplesIn < 0) {
                Inlines.OpusAssert(false);
                return SilkError.SILK_ENC_INPUT_INVALID_NO_OF_SAMPLES;
            }
            if (1000 * nSamplesIn > encControl.payloadSize_ms * encControl.API_sampleRate) {
                Inlines.OpusAssert(false);
                return SilkError.SILK_ENC_INPUT_INVALID_NO_OF_SAMPLES;
            }
        }
        int TargetRate_bps = Inlines.silk_RSHIFT32(encControl.bitRate, encControl.nChannelsInternal - 1);
        for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
            int force_fs_kHz;
            int n3 = force_fs_kHz = n2 == 1 ? psEnc.state_Fxx[0].fs_kHz : 0;
            if ((ret += psEnc.state_Fxx[n2].silk_control_encoder(encControl, TargetRate_bps, psEnc.allowBandwidthSwitch, n2, force_fs_kHz)) != SilkError.SILK_NO_ERROR) {
                Inlines.OpusAssert(false);
                return ret;
            }
            if (psEnc.state_Fxx[n2].first_frame_after_reset != 0 || transition) {
                for (i2 = 0; i2 < psEnc.state_Fxx[0].nFramesPerPacket; ++i2) {
                    psEnc.state_Fxx[n2].LBRR_flags[i2] = 0;
                }
            }
            psEnc.state_Fxx[n2].inDTX = psEnc.state_Fxx[n2].useDTX;
        }
        Inlines.OpusAssert(encControl.nChannelsInternal == 1 || psEnc.state_Fxx[0].fs_kHz == psEnc.state_Fxx[1].fs_kHz);
        int nSamplesToBufferMax = 10 * nBlocksOf10ms * psEnc.state_Fxx[0].fs_kHz;
        int nSamplesFromInputMax = Inlines.silk_DIV32_16(nSamplesToBufferMax * psEnc.state_Fxx[0].API_fs_Hz, (short)(psEnc.state_Fxx[0].fs_kHz * 1000));
        short[] buf = new short[nSamplesFromInputMax];
        int samplesIn_ptr = 0;
        while (true) {
            int nSamplesToBuffer = psEnc.state_Fxx[0].frame_length - psEnc.state_Fxx[0].inputBufIx;
            nSamplesToBuffer = Inlines.silk_min(nSamplesToBuffer, nSamplesToBufferMax);
            nSamplesFromInput = Inlines.silk_DIV32_16(nSamplesToBuffer * psEnc.state_Fxx[0].API_fs_Hz, psEnc.state_Fxx[0].fs_kHz * 1000);
            if (encControl.nChannelsAPI == 2 && encControl.nChannelsInternal == 2) {
                int id2 = psEnc.state_Fxx[0].nFramesEncoded;
                for (n2 = 0; n2 < nSamplesFromInput; ++n2) {
                    buf[n2] = samplesIn[samplesIn_ptr + 2 * n2];
                }
                if (psEnc.nPrevChannelsInternal == 1 && id2 == 0) {
                    psEnc.state_Fxx[1].resampler_state.Assign(psEnc.state_Fxx[0].resampler_state);
                }
                ret += Resampler.silk_resampler(psEnc.state_Fxx[0].resampler_state, psEnc.state_Fxx[0].inputBuf, psEnc.state_Fxx[0].inputBufIx + 2, buf, 0, nSamplesFromInput);
                psEnc.state_Fxx[0].inputBufIx += nSamplesToBuffer;
                nSamplesToBuffer = psEnc.state_Fxx[1].frame_length - psEnc.state_Fxx[1].inputBufIx;
                nSamplesToBuffer = Inlines.silk_min(nSamplesToBuffer, 10 * nBlocksOf10ms * psEnc.state_Fxx[1].fs_kHz);
                for (n2 = 0; n2 < nSamplesFromInput; ++n2) {
                    buf[n2] = samplesIn[samplesIn_ptr + 2 * n2 + 1];
                }
                ret += Resampler.silk_resampler(psEnc.state_Fxx[1].resampler_state, psEnc.state_Fxx[1].inputBuf, psEnc.state_Fxx[1].inputBufIx + 2, buf, 0, nSamplesFromInput);
                psEnc.state_Fxx[1].inputBufIx += nSamplesToBuffer;
            } else if (encControl.nChannelsAPI == 2 && encControl.nChannelsInternal == 1) {
                for (n2 = 0; n2 < nSamplesFromInput; ++n2) {
                    int sum = samplesIn[samplesIn_ptr + 2 * n2] + samplesIn[samplesIn_ptr + 2 * n2 + 1];
                    buf[n2] = (short)Inlines.silk_RSHIFT_ROUND(sum, 1);
                }
                ret += Resampler.silk_resampler(psEnc.state_Fxx[0].resampler_state, psEnc.state_Fxx[0].inputBuf, psEnc.state_Fxx[0].inputBufIx + 2, buf, 0, nSamplesFromInput);
                if (psEnc.nPrevChannelsInternal == 2 && psEnc.state_Fxx[0].nFramesEncoded == 0) {
                    ret += Resampler.silk_resampler(psEnc.state_Fxx[1].resampler_state, psEnc.state_Fxx[1].inputBuf, psEnc.state_Fxx[1].inputBufIx + 2, buf, 0, nSamplesFromInput);
                    for (n2 = 0; n2 < psEnc.state_Fxx[0].frame_length; ++n2) {
                        psEnc.state_Fxx[0].inputBuf[psEnc.state_Fxx[0].inputBufIx + n2 + 2] = (short)Inlines.silk_RSHIFT(psEnc.state_Fxx[0].inputBuf[psEnc.state_Fxx[0].inputBufIx + n2 + 2] + psEnc.state_Fxx[1].inputBuf[psEnc.state_Fxx[1].inputBufIx + n2 + 2], 1);
                    }
                }
                psEnc.state_Fxx[0].inputBufIx += nSamplesToBuffer;
            } else {
                Inlines.OpusAssert(encControl.nChannelsAPI == 1 && encControl.nChannelsInternal == 1);
                System.arraycopy(samplesIn, samplesIn_ptr, buf, 0, nSamplesFromInput);
                ret += Resampler.silk_resampler(psEnc.state_Fxx[0].resampler_state, psEnc.state_Fxx[0].inputBuf, psEnc.state_Fxx[0].inputBufIx + 2, buf, 0, nSamplesFromInput);
                psEnc.state_Fxx[0].inputBufIx += nSamplesToBuffer;
            }
            samplesIn_ptr += nSamplesFromInput * encControl.nChannelsAPI;
            nSamplesIn -= nSamplesFromInput;
            psEnc.allowBandwidthSwitch = 0;
            if (psEnc.state_Fxx[0].inputBufIx < psEnc.state_Fxx[0].frame_length) break;
            Inlines.OpusAssert(psEnc.state_Fxx[0].inputBufIx == psEnc.state_Fxx[0].frame_length);
            Inlines.OpusAssert(encControl.nChannelsInternal == 1 || psEnc.state_Fxx[1].inputBufIx == psEnc.state_Fxx[1].frame_length);
            if (psEnc.state_Fxx[0].nFramesEncoded == 0 && prefillFlag == 0) {
                short[] iCDF = new short[]{0, 0};
                iCDF[0] = (short)(256 - Inlines.silk_RSHIFT(256, (psEnc.state_Fxx[0].nFramesPerPacket + 1) * encControl.nChannelsInternal));
                psRangeEnc.enc_icdf(0, iCDF, 8);
                for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                    int LBRR_symbol = 0;
                    for (i2 = 0; i2 < psEnc.state_Fxx[n2].nFramesPerPacket; ++i2) {
                        LBRR_symbol |= Inlines.silk_LSHIFT(psEnc.state_Fxx[n2].LBRR_flags[i2], i2);
                    }
                    psEnc.state_Fxx[n2].LBRR_flag = (byte)(LBRR_symbol > 0 ? 1 : 0);
                    if (LBRR_symbol == 0 || psEnc.state_Fxx[n2].nFramesPerPacket <= 1) continue;
                    psRangeEnc.enc_icdf(LBRR_symbol - 1, SilkTables.silk_LBRR_flags_iCDF_ptr[psEnc.state_Fxx[n2].nFramesPerPacket - 2], 8);
                }
                for (i2 = 0; i2 < psEnc.state_Fxx[0].nFramesPerPacket; ++i2) {
                    for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                        if (psEnc.state_Fxx[n2].LBRR_flags[i2] == 0) continue;
                        if (encControl.nChannelsInternal == 2 && n2 == 0) {
                            Stereo.silk_stereo_encode_pred(psRangeEnc, psEnc.sStereo.predIx[i2]);
                            if (psEnc.state_Fxx[1].LBRR_flags[i2] == 0) {
                                Stereo.silk_stereo_encode_mid_only(psRangeEnc, psEnc.sStereo.mid_only_flags[i2]);
                            }
                        }
                        int condCoding = i2 > 0 && psEnc.state_Fxx[n2].LBRR_flags[i2 - 1] != 0 ? 2 : 0;
                        EncodeIndices.silk_encode_indices(psEnc.state_Fxx[n2], psRangeEnc, i2, 1, condCoding);
                        EncodePulses.silk_encode_pulses(psRangeEnc, psEnc.state_Fxx[n2].indices_LBRR[i2].signalType, psEnc.state_Fxx[n2].indices_LBRR[i2].quantOffsetType, psEnc.state_Fxx[n2].pulses_LBRR[i2], psEnc.state_Fxx[n2].frame_length);
                    }
                }
                for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                    Arrays.MemSet(psEnc.state_Fxx[n2].LBRR_flags, 0, 3);
                }
                psEnc.nBitsUsedLBRR = psRangeEnc.tell();
            }
            HPVariableCutoff.silk_HP_variable_cutoff(psEnc.state_Fxx);
            int nBits = Inlines.silk_DIV32_16(Inlines.silk_MUL(encControl.bitRate, encControl.payloadSize_ms), 1000);
            if (prefillFlag == 0) {
                nBits -= psEnc.nBitsUsedLBRR;
            }
            nBits = Inlines.silk_DIV32_16(nBits, psEnc.state_Fxx[0].nFramesPerPacket);
            TargetRate_bps = encControl.payloadSize_ms == 10 ? Inlines.silk_SMULBB(nBits, 100) : Inlines.silk_SMULBB(nBits, 50);
            TargetRate_bps -= Inlines.silk_DIV32_16(Inlines.silk_MUL(psEnc.nBitsExceeded, 1000), 500);
            if (prefillFlag == 0 && psEnc.state_Fxx[0].nFramesEncoded > 0) {
                int bitsBalance = psRangeEnc.tell() - psEnc.nBitsUsedLBRR - nBits * psEnc.state_Fxx[0].nFramesEncoded;
                TargetRate_bps -= Inlines.silk_DIV32_16(Inlines.silk_MUL(bitsBalance, 1000), 500);
            }
            TargetRate_bps = Inlines.silk_LIMIT(TargetRate_bps, encControl.bitRate, 5000);
            if (encControl.nChannelsInternal == 2) {
                BoxedValueByte midOnlyFlagBoxed = new BoxedValueByte(psEnc.sStereo.mid_only_flags[psEnc.state_Fxx[0].nFramesEncoded]);
                Stereo.silk_stereo_LR_to_MS(psEnc.sStereo, psEnc.state_Fxx[0].inputBuf, 2, psEnc.state_Fxx[1].inputBuf, 2, psEnc.sStereo.predIx[psEnc.state_Fxx[0].nFramesEncoded], midOnlyFlagBoxed, MStargetRates_bps, TargetRate_bps, psEnc.state_Fxx[0].speech_activity_Q8, encControl.toMono, psEnc.state_Fxx[0].fs_kHz, psEnc.state_Fxx[0].frame_length);
                psEnc.sStereo.mid_only_flags[psEnc.state_Fxx[0].nFramesEncoded] = midOnlyFlagBoxed.Val;
                if (midOnlyFlagBoxed.Val == 0) {
                    if (psEnc.prev_decode_only_middle == 1) {
                        psEnc.state_Fxx[1].sShape.Reset();
                        psEnc.state_Fxx[1].sPrefilt.Reset();
                        psEnc.state_Fxx[1].sNSQ.Reset();
                        Arrays.MemSet(psEnc.state_Fxx[1].prev_NLSFq_Q15, (short)0, 16);
                        Arrays.MemSet(psEnc.state_Fxx[1].sLP.In_LP_State, 0, 2);
                        psEnc.state_Fxx[1].prevLag = 100;
                        psEnc.state_Fxx[1].sNSQ.lagPrev = 100;
                        psEnc.state_Fxx[1].sShape.LastGainIndex = (byte)10;
                        psEnc.state_Fxx[1].prevSignalType = 0;
                        psEnc.state_Fxx[1].sNSQ.prev_gain_Q16 = 65536;
                        psEnc.state_Fxx[1].first_frame_after_reset = 1;
                    }
                    psEnc.state_Fxx[1].silk_encode_do_VAD();
                } else {
                    psEnc.state_Fxx[1].VAD_flags[psEnc.state_Fxx[0].nFramesEncoded] = 0;
                }
                if (prefillFlag == 0) {
                    Stereo.silk_stereo_encode_pred(psRangeEnc, psEnc.sStereo.predIx[psEnc.state_Fxx[0].nFramesEncoded]);
                    if (psEnc.state_Fxx[1].VAD_flags[psEnc.state_Fxx[0].nFramesEncoded] == 0) {
                        Stereo.silk_stereo_encode_mid_only(psRangeEnc, psEnc.sStereo.mid_only_flags[psEnc.state_Fxx[0].nFramesEncoded]);
                    }
                }
            } else {
                System.arraycopy(psEnc.sStereo.sMid, 0, psEnc.state_Fxx[0].inputBuf, 0, 2);
                System.arraycopy(psEnc.state_Fxx[0].inputBuf, psEnc.state_Fxx[0].frame_length, psEnc.sStereo.sMid, 0, 2);
            }
            psEnc.state_Fxx[0].silk_encode_do_VAD();
            for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                int channelRate_bps;
                int useCBR;
                int maxBits = encControl.maxBits;
                if (tot_blocks == 2 && curr_block == 0) {
                    maxBits = maxBits * 3 / 5;
                } else if (tot_blocks == 3) {
                    if (curr_block == 0) {
                        maxBits = maxBits * 2 / 5;
                    } else if (curr_block == 1) {
                        maxBits = maxBits * 3 / 4;
                    }
                }
                int n4 = useCBR = encControl.useCBR != 0 && curr_block == tot_blocks - 1 ? 1 : 0;
                if (encControl.nChannelsInternal == 1) {
                    channelRate_bps = TargetRate_bps;
                } else {
                    channelRate_bps = MStargetRates_bps[n2];
                    if (n2 == 0 && MStargetRates_bps[1] > 0) {
                        useCBR = 0;
                        maxBits -= encControl.maxBits / (tot_blocks * 2);
                    }
                }
                if (channelRate_bps > 0) {
                    psEnc.state_Fxx[n2].silk_control_SNR(channelRate_bps);
                    int condCoding = psEnc.state_Fxx[0].nFramesEncoded - n2 <= 0 ? 0 : (n2 > 0 && psEnc.prev_decode_only_middle != 0 ? 1 : 2);
                    Inlines.OpusAssert((ret += psEnc.state_Fxx[n2].silk_encode_frame(nBytesOut, psRangeEnc, condCoding, maxBits, useCBR)) == SilkError.SILK_NO_ERROR);
                }
                psEnc.state_Fxx[n2].controlled_since_last_payload = 0;
                psEnc.state_Fxx[n2].inputBufIx = 0;
                ++psEnc.state_Fxx[n2].nFramesEncoded;
            }
            psEnc.prev_decode_only_middle = psEnc.sStereo.mid_only_flags[psEnc.state_Fxx[0].nFramesEncoded - 1];
            if (nBytesOut.Val > 0 && psEnc.state_Fxx[0].nFramesEncoded == psEnc.state_Fxx[0].nFramesPerPacket) {
                int flags = 0;
                for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                    for (i2 = 0; i2 < psEnc.state_Fxx[n2].nFramesPerPacket; ++i2) {
                        flags = Inlines.silk_LSHIFT(flags, 1);
                        flags |= psEnc.state_Fxx[n2].VAD_flags[i2];
                    }
                    flags = Inlines.silk_LSHIFT(flags, 1);
                    flags |= psEnc.state_Fxx[n2].LBRR_flag;
                }
                if (prefillFlag == 0) {
                    psRangeEnc.enc_patch_initial_bits(flags, (psEnc.state_Fxx[0].nFramesPerPacket + 1) * encControl.nChannelsInternal);
                }
                if (psEnc.state_Fxx[0].inDTX != 0 && (encControl.nChannelsInternal == 1 || psEnc.state_Fxx[1].inDTX != 0)) {
                    nBytesOut.Val = 0;
                }
                psEnc.nBitsExceeded += nBytesOut.Val * 8;
                psEnc.nBitsExceeded -= Inlines.silk_DIV32_16(Inlines.silk_MUL(encControl.bitRate, encControl.payloadSize_ms), 1000);
                psEnc.nBitsExceeded = Inlines.silk_LIMIT(psEnc.nBitsExceeded, 0, 10000);
                int speech_act_thr_for_switch_Q8 = Inlines.silk_SMLAWB(13, 3188, psEnc.timeSinceSwitchAllowed_ms);
                if (psEnc.state_Fxx[0].speech_activity_Q8 < speech_act_thr_for_switch_Q8) {
                    psEnc.allowBandwidthSwitch = 1;
                    psEnc.timeSinceSwitchAllowed_ms = 0;
                } else {
                    psEnc.allowBandwidthSwitch = 0;
                    psEnc.timeSinceSwitchAllowed_ms += encControl.payloadSize_ms;
                }
            }
            if (nSamplesIn == 0) break;
            ++curr_block;
        }
        psEnc.nPrevChannelsInternal = encControl.nChannelsInternal;
        encControl.allowBandwidthSwitch = psEnc.allowBandwidthSwitch;
        encControl.inWBmodeWithoutVariableLP = psEnc.state_Fxx[0].fs_kHz == 16 && psEnc.state_Fxx[0].sLP.mode == 0 ? 1 : 0;
        encControl.internalSampleRate = Inlines.silk_SMULBB(psEnc.state_Fxx[0].fs_kHz, 1000);
        int n5 = encControl.stereoWidth_Q14 = encControl.toMono != 0 ? 0 : (int)psEnc.sStereo.smth_width_Q14;
        if (prefillFlag != 0) {
            encControl.payloadSize_ms = tmp_payloadSize_ms;
            encControl.complexity = tmp_complexity;
            for (n2 = 0; n2 < encControl.nChannelsInternal; ++n2) {
                psEnc.state_Fxx[n2].controlled_since_last_payload = 0;
                psEnc.state_Fxx[n2].prefillFlag = 0;
            }
        }
        return ret;
    }
}

