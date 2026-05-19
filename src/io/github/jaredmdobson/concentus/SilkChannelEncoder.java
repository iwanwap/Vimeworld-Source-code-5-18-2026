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
import io.github.jaredmdobson.concentus.Filters;
import io.github.jaredmdobson.concentus.FindPitchLags;
import io.github.jaredmdobson.concentus.FindPredCoefs;
import io.github.jaredmdobson.concentus.GainQuantization;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.NLSFCodebook;
import io.github.jaredmdobson.concentus.NoiseShapeAnalysis;
import io.github.jaredmdobson.concentus.ProcessGains;
import io.github.jaredmdobson.concentus.Resampler;
import io.github.jaredmdobson.concentus.SideInfoIndices;
import io.github.jaredmdobson.concentus.SilkEncoderControl;
import io.github.jaredmdobson.concentus.SilkError;
import io.github.jaredmdobson.concentus.SilkLPState;
import io.github.jaredmdobson.concentus.SilkNSQState;
import io.github.jaredmdobson.concentus.SilkPrefilterState;
import io.github.jaredmdobson.concentus.SilkResamplerState;
import io.github.jaredmdobson.concentus.SilkShapeState;
import io.github.jaredmdobson.concentus.SilkTables;
import io.github.jaredmdobson.concentus.SilkVADState;
import io.github.jaredmdobson.concentus.VoiceActivityDetection;

class SilkChannelEncoder {
    final int[] In_HP_State = new int[2];
    int variable_HP_smth1_Q15 = 0;
    int variable_HP_smth2_Q15 = 0;
    final SilkLPState sLP = new SilkLPState();
    final SilkVADState sVAD = new SilkVADState();
    final SilkNSQState sNSQ = new SilkNSQState();
    final short[] prev_NLSFq_Q15 = new short[16];
    int speech_activity_Q8 = 0;
    int allow_bandwidth_switch = 0;
    byte LBRRprevLastGainIndex = 0;
    byte prevSignalType = 0;
    int prevLag = 0;
    int pitch_LPC_win_length = 0;
    int max_pitch_lag = 0;
    int API_fs_Hz = 0;
    int prev_API_fs_Hz = 0;
    int maxInternal_fs_Hz = 0;
    int minInternal_fs_Hz = 0;
    int desiredInternal_fs_Hz = 0;
    int fs_kHz = 0;
    int nb_subfr = 0;
    int frame_length = 0;
    int subfr_length = 0;
    int ltp_mem_length = 0;
    int la_pitch = 0;
    int la_shape = 0;
    int shapeWinLength = 0;
    int TargetRate_bps = 0;
    int PacketSize_ms = 0;
    int PacketLoss_perc = 0;
    int frameCounter = 0;
    int Complexity = 0;
    int nStatesDelayedDecision = 0;
    int useInterpolatedNLSFs = 0;
    int shapingLPCOrder = 0;
    int predictLPCOrder = 0;
    int pitchEstimationComplexity = 0;
    int pitchEstimationLPCOrder = 0;
    int pitchEstimationThreshold_Q16 = 0;
    int LTPQuantLowComplexity = 0;
    int mu_LTP_Q9 = 0;
    int sum_log_gain_Q7 = 0;
    int NLSF_MSVQ_Survivors = 0;
    int first_frame_after_reset = 0;
    int controlled_since_last_payload = 0;
    int warping_Q16 = 0;
    int useCBR = 0;
    int prefillFlag = 0;
    short[] pitch_lag_low_bits_iCDF = null;
    short[] pitch_contour_iCDF = null;
    NLSFCodebook psNLSF_CB = null;
    final int[] input_quality_bands_Q15 = new int[4];
    int input_tilt_Q15 = 0;
    int SNR_dB_Q7 = 0;
    final byte[] VAD_flags = new byte[3];
    byte LBRR_flag = 0;
    final int[] LBRR_flags = new int[3];
    final SideInfoIndices indices = new SideInfoIndices();
    final byte[] pulses = new byte[320];
    final short[] inputBuf = new short[322];
    int inputBufIx = 0;
    int nFramesPerPacket = 0;
    int nFramesEncoded = 0;
    int nChannelsAPI = 0;
    int nChannelsInternal = 0;
    int channelNb = 0;
    int frames_since_onset = 0;
    int ec_prevSignalType = 0;
    short ec_prevLagIndex = 0;
    final SilkResamplerState resampler_state = new SilkResamplerState();
    int useDTX = 0;
    int inDTX = 0;
    int noSpeechCounter = 0;
    int useInBandFEC = 0;
    int LBRR_enabled = 0;
    int LBRR_GainIncreases = 0;
    final SideInfoIndices[] indices_LBRR = new SideInfoIndices[3];
    final byte[][] pulses_LBRR = Arrays.InitTwoDimensionalArrayByte(3, 320);
    final SilkShapeState sShape = new SilkShapeState();
    final SilkPrefilterState sPrefilt = new SilkPrefilterState();
    final short[] x_buf = new short[720];
    int LTPCorr_Q15 = 0;

    SilkChannelEncoder() {
        for (int c2 = 0; c2 < 3; ++c2) {
            this.indices_LBRR[c2] = new SideInfoIndices();
        }
    }

    void Reset() {
        Arrays.MemSet(this.In_HP_State, 0, 2);
        this.variable_HP_smth1_Q15 = 0;
        this.variable_HP_smth2_Q15 = 0;
        this.sLP.Reset();
        this.sVAD.Reset();
        this.sNSQ.Reset();
        Arrays.MemSet(this.prev_NLSFq_Q15, (short)0, 16);
        this.speech_activity_Q8 = 0;
        this.allow_bandwidth_switch = 0;
        this.LBRRprevLastGainIndex = 0;
        this.prevSignalType = 0;
        this.prevLag = 0;
        this.pitch_LPC_win_length = 0;
        this.max_pitch_lag = 0;
        this.API_fs_Hz = 0;
        this.prev_API_fs_Hz = 0;
        this.maxInternal_fs_Hz = 0;
        this.minInternal_fs_Hz = 0;
        this.desiredInternal_fs_Hz = 0;
        this.fs_kHz = 0;
        this.nb_subfr = 0;
        this.frame_length = 0;
        this.subfr_length = 0;
        this.ltp_mem_length = 0;
        this.la_pitch = 0;
        this.la_shape = 0;
        this.shapeWinLength = 0;
        this.TargetRate_bps = 0;
        this.PacketSize_ms = 0;
        this.PacketLoss_perc = 0;
        this.frameCounter = 0;
        this.Complexity = 0;
        this.nStatesDelayedDecision = 0;
        this.useInterpolatedNLSFs = 0;
        this.shapingLPCOrder = 0;
        this.predictLPCOrder = 0;
        this.pitchEstimationComplexity = 0;
        this.pitchEstimationLPCOrder = 0;
        this.pitchEstimationThreshold_Q16 = 0;
        this.LTPQuantLowComplexity = 0;
        this.mu_LTP_Q9 = 0;
        this.sum_log_gain_Q7 = 0;
        this.NLSF_MSVQ_Survivors = 0;
        this.first_frame_after_reset = 0;
        this.controlled_since_last_payload = 0;
        this.warping_Q16 = 0;
        this.useCBR = 0;
        this.prefillFlag = 0;
        this.pitch_lag_low_bits_iCDF = null;
        this.pitch_contour_iCDF = null;
        this.psNLSF_CB = null;
        Arrays.MemSet(this.input_quality_bands_Q15, 0, 4);
        this.input_tilt_Q15 = 0;
        this.SNR_dB_Q7 = 0;
        Arrays.MemSet(this.VAD_flags, (byte)0, 3);
        this.LBRR_flag = 0;
        Arrays.MemSet(this.LBRR_flags, 0, 3);
        this.indices.Reset();
        Arrays.MemSet(this.pulses, (byte)0, 320);
        Arrays.MemSet(this.inputBuf, (short)0, 322);
        this.inputBufIx = 0;
        this.nFramesPerPacket = 0;
        this.nFramesEncoded = 0;
        this.nChannelsAPI = 0;
        this.nChannelsInternal = 0;
        this.channelNb = 0;
        this.frames_since_onset = 0;
        this.ec_prevSignalType = 0;
        this.ec_prevLagIndex = 0;
        this.resampler_state.Reset();
        this.useDTX = 0;
        this.inDTX = 0;
        this.noSpeechCounter = 0;
        this.useInBandFEC = 0;
        this.LBRR_enabled = 0;
        this.LBRR_GainIncreases = 0;
        for (int c2 = 0; c2 < 3; ++c2) {
            this.indices_LBRR[c2].Reset();
            Arrays.MemSet(this.pulses_LBRR[c2], (byte)0, 320);
        }
        this.sShape.Reset();
        this.sPrefilt.Reset();
        Arrays.MemSet(this.x_buf, (short)0, 720);
        this.LTPCorr_Q15 = 0;
    }

    int silk_control_encoder(EncControlState encControl, int TargetRate_bps, int allow_bw_switch, int channelNb, int force_fs_kHz) {
        int ret = SilkError.SILK_NO_ERROR;
        this.useDTX = encControl.useDTX;
        this.useCBR = encControl.useCBR;
        this.API_fs_Hz = encControl.API_sampleRate;
        this.maxInternal_fs_Hz = encControl.maxInternalSampleRate;
        this.minInternal_fs_Hz = encControl.minInternalSampleRate;
        this.desiredInternal_fs_Hz = encControl.desiredInternalSampleRate;
        this.useInBandFEC = encControl.useInBandFEC;
        this.nChannelsAPI = encControl.nChannelsAPI;
        this.nChannelsInternal = encControl.nChannelsInternal;
        this.allow_bandwidth_switch = allow_bw_switch;
        this.channelNb = channelNb;
        if (this.controlled_since_last_payload != 0 && this.prefillFlag == 0) {
            if (this.API_fs_Hz != this.prev_API_fs_Hz && this.fs_kHz > 0) {
                ret = this.silk_setup_resamplers(this.fs_kHz);
            }
            return ret;
        }
        int fs_kHz = this.silk_control_audio_bandwidth(encControl);
        if (force_fs_kHz != 0) {
            fs_kHz = force_fs_kHz;
        }
        ret = this.silk_setup_resamplers(fs_kHz);
        ret = this.silk_setup_fs(fs_kHz, encControl.payloadSize_ms);
        ret = this.silk_setup_complexity(encControl.complexity);
        this.PacketLoss_perc = encControl.packetLossPercentage;
        ret = this.silk_setup_LBRR(TargetRate_bps);
        this.controlled_since_last_payload = 1;
        return ret;
    }

    private int silk_setup_resamplers(int fs_kHz) {
        int ret = 0;
        if (this.fs_kHz != fs_kHz || this.prev_API_fs_Hz != this.API_fs_Hz) {
            if (this.fs_kHz == 0) {
                ret += Resampler.silk_resampler_init(this.resampler_state, this.API_fs_Hz, fs_kHz * 1000, 1);
            } else {
                SilkResamplerState temp_resampler_state = null;
                int buf_length_ms = Inlines.silk_LSHIFT(this.nb_subfr * 5, 1) + 5;
                int old_buf_samples = buf_length_ms * this.fs_kHz;
                temp_resampler_state = new SilkResamplerState();
                ret += Resampler.silk_resampler_init(temp_resampler_state, Inlines.silk_SMULBB(this.fs_kHz, 1000), this.API_fs_Hz, 0);
                int api_buf_samples = buf_length_ms * Inlines.silk_DIV32_16(this.API_fs_Hz, 1000);
                short[] x_buf_API_fs_Hz = new short[api_buf_samples];
                ret += Resampler.silk_resampler(temp_resampler_state, x_buf_API_fs_Hz, 0, this.x_buf, 0, old_buf_samples);
                ret += Resampler.silk_resampler_init(this.resampler_state, this.API_fs_Hz, Inlines.silk_SMULBB(fs_kHz, 1000), 1);
                ret += Resampler.silk_resampler(this.resampler_state, this.x_buf, 0, x_buf_API_fs_Hz, 0, api_buf_samples);
            }
        }
        this.prev_API_fs_Hz = this.API_fs_Hz;
        return ret;
    }

    private int silk_setup_fs(int fs_kHz, int PacketSize_ms) {
        int ret = SilkError.SILK_NO_ERROR;
        if (PacketSize_ms != this.PacketSize_ms) {
            if (PacketSize_ms != 10 && PacketSize_ms != 20 && PacketSize_ms != 40 && PacketSize_ms != 60) {
                ret = SilkError.SILK_ENC_PACKET_SIZE_NOT_SUPPORTED;
            }
            if (PacketSize_ms <= 10) {
                this.nFramesPerPacket = 1;
                this.nb_subfr = PacketSize_ms == 10 ? 2 : 1;
                this.frame_length = Inlines.silk_SMULBB(PacketSize_ms, fs_kHz);
                this.pitch_LPC_win_length = Inlines.silk_SMULBB(14, fs_kHz);
                this.pitch_contour_iCDF = this.fs_kHz == 8 ? SilkTables.silk_pitch_contour_10_ms_NB_iCDF : SilkTables.silk_pitch_contour_10_ms_iCDF;
            } else {
                this.nFramesPerPacket = Inlines.silk_DIV32_16(PacketSize_ms, 20);
                this.nb_subfr = 4;
                this.frame_length = Inlines.silk_SMULBB(20, fs_kHz);
                this.pitch_LPC_win_length = Inlines.silk_SMULBB(24, fs_kHz);
                this.pitch_contour_iCDF = this.fs_kHz == 8 ? SilkTables.silk_pitch_contour_NB_iCDF : SilkTables.silk_pitch_contour_iCDF;
            }
            this.PacketSize_ms = PacketSize_ms;
            this.TargetRate_bps = 0;
        }
        Inlines.OpusAssert(fs_kHz == 8 || fs_kHz == 12 || fs_kHz == 16);
        Inlines.OpusAssert(this.nb_subfr == 2 || this.nb_subfr == 4);
        if (this.fs_kHz != fs_kHz) {
            this.sShape.Reset();
            this.sPrefilt.Reset();
            this.sNSQ.Reset();
            Arrays.MemSet(this.prev_NLSFq_Q15, (short)0, 16);
            Arrays.MemSet(this.sLP.In_LP_State, 0, 2);
            this.inputBufIx = 0;
            this.nFramesEncoded = 0;
            this.TargetRate_bps = 0;
            this.prevLag = 100;
            this.first_frame_after_reset = 1;
            this.sPrefilt.lagPrev = 100;
            this.sShape.LastGainIndex = (byte)10;
            this.sNSQ.lagPrev = 100;
            this.sNSQ.prev_gain_Q16 = 65536;
            this.prevSignalType = 0;
            this.fs_kHz = fs_kHz;
            this.pitch_contour_iCDF = this.fs_kHz == 8 ? (this.nb_subfr == 4 ? SilkTables.silk_pitch_contour_NB_iCDF : SilkTables.silk_pitch_contour_10_ms_NB_iCDF) : (this.nb_subfr == 4 ? SilkTables.silk_pitch_contour_iCDF : SilkTables.silk_pitch_contour_10_ms_iCDF);
            if (this.fs_kHz == 8 || this.fs_kHz == 12) {
                this.predictLPCOrder = 10;
                this.psNLSF_CB = SilkTables.silk_NLSF_CB_NB_MB;
            } else {
                this.predictLPCOrder = 16;
                this.psNLSF_CB = SilkTables.silk_NLSF_CB_WB;
            }
            this.subfr_length = 5 * fs_kHz;
            this.frame_length = Inlines.silk_SMULBB(this.subfr_length, this.nb_subfr);
            this.ltp_mem_length = Inlines.silk_SMULBB(20, fs_kHz);
            this.la_pitch = Inlines.silk_SMULBB(2, fs_kHz);
            this.max_pitch_lag = Inlines.silk_SMULBB(18, fs_kHz);
            this.pitch_LPC_win_length = this.nb_subfr == 4 ? Inlines.silk_SMULBB(24, fs_kHz) : Inlines.silk_SMULBB(14, fs_kHz);
            if (this.fs_kHz == 16) {
                this.mu_LTP_Q9 = 10;
                this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform8_iCDF;
            } else if (this.fs_kHz == 12) {
                this.mu_LTP_Q9 = 13;
                this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform6_iCDF;
            } else {
                this.mu_LTP_Q9 = 15;
                this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform4_iCDF;
            }
        }
        Inlines.OpusAssert(this.subfr_length * this.nb_subfr == this.frame_length);
        return ret;
    }

    private int silk_setup_complexity(int Complexity) {
        int ret = 0;
        Inlines.OpusAssert(Complexity >= 0 && Complexity <= 10);
        if (Complexity < 2) {
            this.pitchEstimationComplexity = 0;
            this.pitchEstimationThreshold_Q16 = 52429;
            this.pitchEstimationLPCOrder = 6;
            this.shapingLPCOrder = 8;
            this.la_shape = 3 * this.fs_kHz;
            this.nStatesDelayedDecision = 1;
            this.useInterpolatedNLSFs = 0;
            this.LTPQuantLowComplexity = 1;
            this.NLSF_MSVQ_Survivors = 2;
            this.warping_Q16 = 0;
        } else if (Complexity < 4) {
            this.pitchEstimationComplexity = 1;
            this.pitchEstimationThreshold_Q16 = 49807;
            this.pitchEstimationLPCOrder = 8;
            this.shapingLPCOrder = 10;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 1;
            this.useInterpolatedNLSFs = 0;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 4;
            this.warping_Q16 = 0;
        } else if (Complexity < 6) {
            this.pitchEstimationComplexity = 1;
            this.pitchEstimationThreshold_Q16 = 48497;
            this.pitchEstimationLPCOrder = 10;
            this.shapingLPCOrder = 12;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 2;
            this.useInterpolatedNLSFs = 1;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 8;
            this.warping_Q16 = this.fs_kHz * 983;
        } else if (Complexity < 8) {
            this.pitchEstimationComplexity = 1;
            this.pitchEstimationThreshold_Q16 = 47186;
            this.pitchEstimationLPCOrder = 12;
            this.shapingLPCOrder = 14;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 3;
            this.useInterpolatedNLSFs = 1;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 16;
            this.warping_Q16 = this.fs_kHz * 983;
        } else {
            this.pitchEstimationComplexity = 2;
            this.pitchEstimationThreshold_Q16 = 45875;
            this.pitchEstimationLPCOrder = 16;
            this.shapingLPCOrder = 16;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 4;
            this.useInterpolatedNLSFs = 1;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 32;
            this.warping_Q16 = this.fs_kHz * 983;
        }
        this.pitchEstimationLPCOrder = Inlines.silk_min_int(this.pitchEstimationLPCOrder, this.predictLPCOrder);
        this.shapeWinLength = 5 * this.fs_kHz + 2 * this.la_shape;
        this.Complexity = Complexity;
        Inlines.OpusAssert(this.pitchEstimationLPCOrder <= 16);
        Inlines.OpusAssert(this.shapingLPCOrder <= 16);
        Inlines.OpusAssert(this.nStatesDelayedDecision <= 4);
        Inlines.OpusAssert(this.warping_Q16 <= Short.MAX_VALUE);
        Inlines.OpusAssert(this.la_shape <= 80);
        Inlines.OpusAssert(this.shapeWinLength <= 240);
        Inlines.OpusAssert(this.NLSF_MSVQ_Survivors <= 32);
        return ret;
    }

    private int silk_setup_LBRR(int TargetRate_bps) {
        int ret = SilkError.SILK_NO_ERROR;
        int LBRR_in_previous_packet = this.LBRR_enabled;
        this.LBRR_enabled = 0;
        if (this.useInBandFEC != 0 && this.PacketLoss_perc > 0) {
            int LBRR_rate_thres_bps = this.fs_kHz == 8 ? 12000 : (this.fs_kHz == 12 ? 14000 : 16000);
            if (TargetRate_bps > (LBRR_rate_thres_bps = Inlines.silk_SMULWB(Inlines.silk_MUL(LBRR_rate_thres_bps, 125 - Inlines.silk_min(this.PacketLoss_perc, 25)), 655))) {
                this.LBRR_GainIncreases = LBRR_in_previous_packet == 0 ? 7 : Inlines.silk_max_int(7 - Inlines.silk_SMULWB(this.PacketLoss_perc, 26214), 2);
                this.LBRR_enabled = 1;
            }
        }
        return ret;
    }

    int silk_control_audio_bandwidth(EncControlState encControl) {
        int fs_kHz = this.fs_kHz;
        int fs_Hz = Inlines.silk_SMULBB(fs_kHz, 1000);
        if (fs_Hz == 0) {
            fs_Hz = Inlines.silk_min(this.desiredInternal_fs_Hz, this.API_fs_Hz);
            fs_kHz = Inlines.silk_DIV32_16(fs_Hz, 1000);
        } else if (fs_Hz > this.API_fs_Hz || fs_Hz > this.maxInternal_fs_Hz || fs_Hz < this.minInternal_fs_Hz) {
            fs_Hz = this.API_fs_Hz;
            fs_Hz = Inlines.silk_min(fs_Hz, this.maxInternal_fs_Hz);
            fs_Hz = Inlines.silk_max(fs_Hz, this.minInternal_fs_Hz);
            fs_kHz = Inlines.silk_DIV32_16(fs_Hz, 1000);
        } else {
            if (this.sLP.transition_frame_no >= 256) {
                this.sLP.mode = 0;
            }
            if (this.allow_bandwidth_switch != 0 || encControl.opusCanSwitch != 0) {
                if (Inlines.silk_SMULBB(this.fs_kHz, 1000) > this.desiredInternal_fs_Hz) {
                    if (this.sLP.mode == 0) {
                        this.sLP.transition_frame_no = 256;
                        Arrays.MemSet(this.sLP.In_LP_State, 0, 2);
                    }
                    if (encControl.opusCanSwitch != 0) {
                        this.sLP.mode = 0;
                        fs_kHz = this.fs_kHz == 16 ? 12 : 8;
                    } else if (this.sLP.transition_frame_no <= 0) {
                        encControl.switchReady = 1;
                        encControl.maxBits -= encControl.maxBits * 5 / (encControl.payloadSize_ms + 5);
                    } else {
                        this.sLP.mode = -2;
                    }
                } else if (Inlines.silk_SMULBB(this.fs_kHz, 1000) < this.desiredInternal_fs_Hz) {
                    if (encControl.opusCanSwitch != 0) {
                        fs_kHz = this.fs_kHz == 8 ? 12 : 16;
                        this.sLP.transition_frame_no = 0;
                        Arrays.MemSet(this.sLP.In_LP_State, 0, 2);
                        this.sLP.mode = 1;
                    } else if (this.sLP.mode == 0) {
                        encControl.switchReady = 1;
                        encControl.maxBits -= encControl.maxBits * 5 / (encControl.payloadSize_ms + 5);
                    } else {
                        this.sLP.mode = 1;
                    }
                } else if (this.sLP.mode < 0) {
                    this.sLP.mode = 1;
                }
            }
        }
        return fs_kHz;
    }

    int silk_control_SNR(int TargetRate_bps) {
        int ret = SilkError.SILK_NO_ERROR;
        if ((TargetRate_bps = Inlines.silk_LIMIT(TargetRate_bps, 5000, 80000)) != this.TargetRate_bps) {
            this.TargetRate_bps = TargetRate_bps;
            int[] rateTable = this.fs_kHz == 8 ? SilkTables.silk_TargetRate_table_NB : (this.fs_kHz == 12 ? SilkTables.silk_TargetRate_table_MB : SilkTables.silk_TargetRate_table_WB);
            if (this.nb_subfr == 2) {
                TargetRate_bps -= 2200;
            }
            for (int k2 = 1; k2 < 8; ++k2) {
                if (TargetRate_bps > rateTable[k2]) continue;
                int frac_Q6 = Inlines.silk_DIV32(Inlines.silk_LSHIFT(TargetRate_bps - rateTable[k2 - 1], 6), rateTable[k2] - rateTable[k2 - 1]);
                this.SNR_dB_Q7 = Inlines.silk_LSHIFT(SilkTables.silk_SNR_table_Q1[k2 - 1], 6) + Inlines.silk_MUL(frac_Q6, SilkTables.silk_SNR_table_Q1[k2] - SilkTables.silk_SNR_table_Q1[k2 - 1]);
                break;
            }
        }
        return ret;
    }

    void silk_encode_do_VAD() {
        VoiceActivityDetection.silk_VAD_GetSA_Q8(this, this.inputBuf, 1);
        if (this.speech_activity_Q8 < 13) {
            this.indices.signalType = 0;
            ++this.noSpeechCounter;
            if (this.noSpeechCounter < 10) {
                this.inDTX = 0;
            } else if (this.noSpeechCounter > 30) {
                this.noSpeechCounter = 10;
                this.inDTX = 0;
            }
            this.VAD_flags[this.nFramesEncoded] = 0;
        } else {
            this.noSpeechCounter = 0;
            this.inDTX = 0;
            this.indices.signalType = 1;
            this.VAD_flags[this.nFramesEncoded] = 1;
        }
    }

    int silk_encode_frame(BoxedValueInt pnBytesOut, EntropyCoder psRangeEnc, int condCoding, int maxBits, int useCBR) {
        SilkEncoderControl sEncCtrl = new SilkEncoderControl();
        int ret = 0;
        EntropyCoder sRangeEnc_copy = new EntropyCoder();
        EntropyCoder sRangeEnc_copy2 = new EntropyCoder();
        SilkNSQState sNSQ_copy = new SilkNSQState();
        SilkNSQState sNSQ_copy2 = new SilkNSQState();
        byte LastGainIndex_copy2 = 0;
        int gainMult_upper = 0;
        int gainMult_lower = 0;
        int nBits_upper = 0;
        int nBits_lower = 0;
        this.indices.Seed = (byte)(this.frameCounter++ & 3);
        int x_frame = this.ltp_mem_length;
        this.sLP.silk_LP_variable_cutoff(this.inputBuf, 1, this.frame_length);
        System.arraycopy(this.inputBuf, 1, this.x_buf, x_frame + 5 * this.fs_kHz, this.frame_length);
        if (this.prefillFlag == 0) {
            short[] res_pitch = new short[this.la_pitch + this.frame_length + this.ltp_mem_length];
            int res_pitch_frame = this.ltp_mem_length;
            FindPitchLags.silk_find_pitch_lags(this, sEncCtrl, res_pitch, this.x_buf, x_frame);
            NoiseShapeAnalysis.silk_noise_shape_analysis(this, sEncCtrl, res_pitch, res_pitch_frame, this.x_buf, x_frame);
            FindPredCoefs.silk_find_pred_coefs(this, sEncCtrl, res_pitch, this.x_buf, x_frame, condCoding);
            ProcessGains.silk_process_gains(this, sEncCtrl, condCoding);
            int[] xfw_Q3 = new int[this.frame_length];
            Filters.silk_prefilter(this, sEncCtrl, xfw_Q3, this.x_buf, x_frame);
            this.silk_LBRR_encode(sEncCtrl, xfw_Q3, condCoding);
            int maxIter = 6;
            int gainMult_Q8 = 256;
            boolean found_lower = false;
            boolean found_upper = false;
            int gainsID = GainQuantization.silk_gains_ID(this.indices.GainsIndices, this.nb_subfr);
            int gainsID_lower = -1;
            int gainsID_upper = -1;
            sRangeEnc_copy.Assign(psRangeEnc);
            sNSQ_copy.Assign(this.sNSQ);
            byte seed_copy = this.indices.Seed;
            short ec_prevLagIndex_copy = this.ec_prevLagIndex;
            int ec_prevSignalType_copy = this.ec_prevSignalType;
            byte[] ec_buf_copy = new byte[1275];
            int iter = 0;
            while (true) {
                int nBits;
                if (gainsID == gainsID_lower) {
                    nBits = nBits_lower;
                } else if (gainsID == gainsID_upper) {
                    nBits = nBits_upper;
                } else {
                    if (iter > 0) {
                        psRangeEnc.Assign(sRangeEnc_copy);
                        this.sNSQ.Assign(sNSQ_copy);
                        this.indices.Seed = seed_copy;
                        this.ec_prevLagIndex = ec_prevLagIndex_copy;
                        this.ec_prevSignalType = ec_prevSignalType_copy;
                    }
                    if (this.nStatesDelayedDecision > 1 || this.warping_Q16 > 0) {
                        this.sNSQ.silk_NSQ_del_dec(this, this.indices, xfw_Q3, this.pulses, sEncCtrl.PredCoef_Q12, sEncCtrl.LTPCoef_Q14, sEncCtrl.AR2_Q13, sEncCtrl.HarmShapeGain_Q14, sEncCtrl.Tilt_Q14, sEncCtrl.LF_shp_Q14, sEncCtrl.Gains_Q16, sEncCtrl.pitchL, sEncCtrl.Lambda_Q10, sEncCtrl.LTP_scale_Q14);
                    } else {
                        this.sNSQ.silk_NSQ(this, this.indices, xfw_Q3, this.pulses, sEncCtrl.PredCoef_Q12, sEncCtrl.LTPCoef_Q14, sEncCtrl.AR2_Q13, sEncCtrl.HarmShapeGain_Q14, sEncCtrl.Tilt_Q14, sEncCtrl.LF_shp_Q14, sEncCtrl.Gains_Q16, sEncCtrl.pitchL, sEncCtrl.Lambda_Q10, sEncCtrl.LTP_scale_Q14);
                    }
                    EncodeIndices.silk_encode_indices(this, psRangeEnc, this.nFramesEncoded, 0, condCoding);
                    EncodePulses.silk_encode_pulses(psRangeEnc, this.indices.signalType, this.indices.quantOffsetType, this.pulses, this.frame_length);
                    nBits = psRangeEnc.tell();
                    if (useCBR == 0 && iter == 0 && nBits <= maxBits) break;
                }
                if (iter == maxIter) {
                    if (!found_lower || gainsID != gainsID_lower && nBits <= maxBits) break;
                    psRangeEnc.Assign(sRangeEnc_copy2);
                    Inlines.OpusAssert(sRangeEnc_copy2.offs <= 1275);
                    psRangeEnc.write_buffer(ec_buf_copy, 0, 0, sRangeEnc_copy2.offs);
                    this.sNSQ.Assign(sNSQ_copy2);
                    this.sShape.LastGainIndex = LastGainIndex_copy2;
                    break;
                }
                if (nBits > maxBits) {
                    if (!found_lower && iter >= 2) {
                        sEncCtrl.Lambda_Q10 = Inlines.silk_ADD_RSHIFT32(sEncCtrl.Lambda_Q10, sEncCtrl.Lambda_Q10, 1);
                        found_upper = false;
                        gainsID_upper = -1;
                    } else {
                        found_upper = true;
                        nBits_upper = nBits;
                        gainMult_upper = gainMult_Q8;
                        gainsID_upper = gainsID;
                    }
                } else {
                    if (nBits >= maxBits - 5) break;
                    found_lower = true;
                    nBits_lower = nBits;
                    gainMult_lower = gainMult_Q8;
                    if (gainsID != gainsID_lower) {
                        gainsID_lower = gainsID;
                        sRangeEnc_copy2.Assign(psRangeEnc);
                        Inlines.OpusAssert(psRangeEnc.offs <= 1275);
                        System.arraycopy(psRangeEnc.get_buffer(), 0, ec_buf_copy, 0, psRangeEnc.offs);
                        sNSQ_copy2.Assign(this.sNSQ);
                        LastGainIndex_copy2 = this.sShape.LastGainIndex;
                    }
                }
                if (!(found_lower & found_upper)) {
                    int gain_factor_Q16 = Inlines.silk_log2lin(Inlines.silk_LSHIFT(nBits - maxBits, 7) / this.frame_length + 2048);
                    gain_factor_Q16 = Inlines.silk_min_32(gain_factor_Q16, 131072);
                    if (nBits > maxBits) {
                        gain_factor_Q16 = Inlines.silk_max_32(gain_factor_Q16, 85197);
                    }
                    gainMult_Q8 = (short)Inlines.silk_SMULWB(gain_factor_Q16, gainMult_Q8);
                } else {
                    gainMult_Q8 = (short)(gainMult_lower + Inlines.silk_DIV32_16(Inlines.silk_MUL(gainMult_upper - gainMult_lower, maxBits - nBits_lower), nBits_upper - nBits_lower));
                    if (gainMult_Q8 > Inlines.silk_ADD_RSHIFT32(gainMult_lower, gainMult_upper - gainMult_lower, 2)) {
                        gainMult_Q8 = (short)Inlines.silk_ADD_RSHIFT32(gainMult_lower, gainMult_upper - gainMult_lower, 2);
                    } else if (gainMult_Q8 < Inlines.silk_SUB_RSHIFT32(gainMult_upper, gainMult_upper - gainMult_lower, 2)) {
                        gainMult_Q8 = (short)Inlines.silk_SUB_RSHIFT32(gainMult_upper, gainMult_upper - gainMult_lower, 2);
                    }
                }
                for (int i2 = 0; i2 < this.nb_subfr; ++i2) {
                    sEncCtrl.Gains_Q16[i2] = Inlines.silk_LSHIFT_SAT32(Inlines.silk_SMULWB(sEncCtrl.GainsUnq_Q16[i2], gainMult_Q8), 8);
                }
                this.sShape.LastGainIndex = sEncCtrl.lastGainIndexPrev;
                BoxedValueByte boxed_gainIndex = new BoxedValueByte(this.sShape.LastGainIndex);
                GainQuantization.silk_gains_quant(this.indices.GainsIndices, sEncCtrl.Gains_Q16, boxed_gainIndex, condCoding == 2 ? 1 : 0, this.nb_subfr);
                this.sShape.LastGainIndex = boxed_gainIndex.Val;
                gainsID = GainQuantization.silk_gains_ID(this.indices.GainsIndices, this.nb_subfr);
                ++iter;
            }
        }
        Arrays.MemMove(this.x_buf, this.frame_length, 0, this.ltp_mem_length + 5 * this.fs_kHz);
        if (this.prefillFlag != 0) {
            pnBytesOut.Val = 0;
            return ret;
        }
        this.prevLag = sEncCtrl.pitchL[this.nb_subfr - 1];
        this.prevSignalType = this.indices.signalType;
        this.first_frame_after_reset = 0;
        pnBytesOut.Val = Inlines.silk_RSHIFT(psRangeEnc.tell() + 7, 3);
        return ret;
    }

    void silk_LBRR_encode(SilkEncoderControl thisCtrl, int[] xfw_Q3, int condCoding) {
        int[] TempGains_Q16 = new int[this.nb_subfr];
        SideInfoIndices psIndices_LBRR = this.indices_LBRR[this.nFramesEncoded];
        SilkNSQState sNSQ_LBRR = new SilkNSQState();
        if (this.LBRR_enabled != 0 && this.speech_activity_Q8 > 77) {
            this.LBRR_flags[this.nFramesEncoded] = 1;
            sNSQ_LBRR.Assign(this.sNSQ);
            psIndices_LBRR.Assign(this.indices);
            System.arraycopy(thisCtrl.Gains_Q16, 0, TempGains_Q16, 0, this.nb_subfr);
            if (this.nFramesEncoded == 0 || this.LBRR_flags[this.nFramesEncoded - 1] == 0) {
                this.LBRRprevLastGainIndex = this.sShape.LastGainIndex;
                psIndices_LBRR.GainsIndices[0] = (byte)(psIndices_LBRR.GainsIndices[0] + this.LBRR_GainIncreases);
                psIndices_LBRR.GainsIndices[0] = (byte)Inlines.silk_min_int(psIndices_LBRR.GainsIndices[0], 63);
            }
            BoxedValueByte boxed_gainIndex = new BoxedValueByte(this.LBRRprevLastGainIndex);
            GainQuantization.silk_gains_dequant(thisCtrl.Gains_Q16, psIndices_LBRR.GainsIndices, boxed_gainIndex, condCoding == 2 ? 1 : 0, this.nb_subfr);
            this.LBRRprevLastGainIndex = boxed_gainIndex.Val;
            if (this.nStatesDelayedDecision > 1 || this.warping_Q16 > 0) {
                sNSQ_LBRR.silk_NSQ_del_dec(this, psIndices_LBRR, xfw_Q3, this.pulses_LBRR[this.nFramesEncoded], thisCtrl.PredCoef_Q12, thisCtrl.LTPCoef_Q14, thisCtrl.AR2_Q13, thisCtrl.HarmShapeGain_Q14, thisCtrl.Tilt_Q14, thisCtrl.LF_shp_Q14, thisCtrl.Gains_Q16, thisCtrl.pitchL, thisCtrl.Lambda_Q10, thisCtrl.LTP_scale_Q14);
            } else {
                sNSQ_LBRR.silk_NSQ(this, psIndices_LBRR, xfw_Q3, this.pulses_LBRR[this.nFramesEncoded], thisCtrl.PredCoef_Q12, thisCtrl.LTPCoef_Q14, thisCtrl.AR2_Q13, thisCtrl.HarmShapeGain_Q14, thisCtrl.Tilt_Q14, thisCtrl.LF_shp_Q14, thisCtrl.Gains_Q16, thisCtrl.pitchL, thisCtrl.Lambda_Q10, thisCtrl.LTP_scale_Q14);
            }
            System.arraycopy(TempGains_Q16, 0, thisCtrl.Gains_Q16, 0, this.nb_subfr);
        }
    }
}

