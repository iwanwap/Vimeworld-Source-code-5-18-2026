/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.NLSF;
import io.github.jaredmdobson.concentus.SideInfoIndices;
import io.github.jaredmdobson.concentus.SilkChannelEncoder;
import io.github.jaredmdobson.concentus.SilkTables;

class EncodeIndices {
    EncodeIndices() {
    }

    static void silk_encode_indices(SilkChannelEncoder psEncC, EntropyCoder psRangeEnc, int FrameIndex, int encode_LBRR, int condCoding) {
        int i2;
        short[] ec_ix = new short[16];
        short[] pred_Q8 = new short[16];
        SideInfoIndices psIndices = encode_LBRR != 0 ? psEncC.indices_LBRR[FrameIndex] : psEncC.indices;
        int typeOffset = 2 * psIndices.signalType + psIndices.quantOffsetType;
        Inlines.OpusAssert(typeOffset >= 0 && typeOffset < 6);
        Inlines.OpusAssert(encode_LBRR == 0 || typeOffset >= 2);
        if (encode_LBRR != 0 || typeOffset >= 2) {
            psRangeEnc.enc_icdf(typeOffset - 2, SilkTables.silk_type_offset_VAD_iCDF, 8);
        } else {
            psRangeEnc.enc_icdf(typeOffset, SilkTables.silk_type_offset_no_VAD_iCDF, 8);
        }
        if (condCoding == 2) {
            Inlines.OpusAssert(psIndices.GainsIndices[0] >= 0 && psIndices.GainsIndices[0] < 41);
            psRangeEnc.enc_icdf(psIndices.GainsIndices[0], SilkTables.silk_delta_gain_iCDF, 8);
        } else {
            Inlines.OpusAssert(psIndices.GainsIndices[0] >= 0 && psIndices.GainsIndices[0] < 64);
            psRangeEnc.enc_icdf(Inlines.silk_RSHIFT(psIndices.GainsIndices[0], 3), SilkTables.silk_gain_iCDF[psIndices.signalType], 8);
            psRangeEnc.enc_icdf(psIndices.GainsIndices[0] & 7, SilkTables.silk_uniform8_iCDF, 8);
        }
        for (i2 = 1; i2 < psEncC.nb_subfr; ++i2) {
            Inlines.OpusAssert(psIndices.GainsIndices[i2] >= 0 && psIndices.GainsIndices[i2] < 41);
            psRangeEnc.enc_icdf(psIndices.GainsIndices[i2], SilkTables.silk_delta_gain_iCDF, 8);
        }
        psRangeEnc.enc_icdf(psIndices.NLSFIndices[0], psEncC.psNLSF_CB.CB1_iCDF, (psIndices.signalType >> 1) * psEncC.psNLSF_CB.nVectors, 8);
        NLSF.silk_NLSF_unpack(ec_ix, pred_Q8, psEncC.psNLSF_CB, psIndices.NLSFIndices[0]);
        Inlines.OpusAssert(psEncC.psNLSF_CB.order == psEncC.predictLPCOrder);
        for (i2 = 0; i2 < psEncC.psNLSF_CB.order; ++i2) {
            if (psIndices.NLSFIndices[i2 + 1] >= 4) {
                psRangeEnc.enc_icdf(8, psEncC.psNLSF_CB.ec_iCDF, ec_ix[i2], 8);
                psRangeEnc.enc_icdf(psIndices.NLSFIndices[i2 + 1] - 4, SilkTables.silk_NLSF_EXT_iCDF, 8);
                continue;
            }
            if (psIndices.NLSFIndices[i2 + 1] <= -4) {
                psRangeEnc.enc_icdf(0, psEncC.psNLSF_CB.ec_iCDF, ec_ix[i2], 8);
                psRangeEnc.enc_icdf(-psIndices.NLSFIndices[i2 + 1] - 4, SilkTables.silk_NLSF_EXT_iCDF, 8);
                continue;
            }
            psRangeEnc.enc_icdf(psIndices.NLSFIndices[i2 + 1] + 4, psEncC.psNLSF_CB.ec_iCDF, ec_ix[i2], 8);
        }
        if (psEncC.nb_subfr == 4) {
            Inlines.OpusAssert(psIndices.NLSFInterpCoef_Q2 >= 0 && psIndices.NLSFInterpCoef_Q2 < 5);
            psRangeEnc.enc_icdf(psIndices.NLSFInterpCoef_Q2, SilkTables.silk_NLSF_interpolation_factor_iCDF, 8);
        }
        if (psIndices.signalType == 2) {
            boolean encode_absolute_lagIndex = true;
            if (condCoding == 2 && psEncC.ec_prevSignalType == 2) {
                int delta_lagIndex = psIndices.lagIndex - psEncC.ec_prevLagIndex;
                if (delta_lagIndex < -8 || delta_lagIndex > 11) {
                    delta_lagIndex = 0;
                } else {
                    delta_lagIndex += 9;
                    encode_absolute_lagIndex = false;
                }
                Inlines.OpusAssert(delta_lagIndex >= 0 && delta_lagIndex < 21);
                psRangeEnc.enc_icdf(delta_lagIndex, SilkTables.silk_pitch_delta_iCDF, 8);
            }
            if (encode_absolute_lagIndex) {
                int pitch_high_bits = Inlines.silk_DIV32_16(psIndices.lagIndex, Inlines.silk_RSHIFT(psEncC.fs_kHz, 1));
                int pitch_low_bits = psIndices.lagIndex - Inlines.silk_SMULBB(pitch_high_bits, Inlines.silk_RSHIFT(psEncC.fs_kHz, 1));
                Inlines.OpusAssert(pitch_low_bits < psEncC.fs_kHz / 2);
                Inlines.OpusAssert(pitch_high_bits < 32);
                psRangeEnc.enc_icdf(pitch_high_bits, SilkTables.silk_pitch_lag_iCDF, 8);
                psRangeEnc.enc_icdf(pitch_low_bits, psEncC.pitch_lag_low_bits_iCDF, 8);
            }
            psEncC.ec_prevLagIndex = psIndices.lagIndex;
            Inlines.OpusAssert(psIndices.contourIndex >= 0);
            Inlines.OpusAssert(psIndices.contourIndex < 34 && psEncC.fs_kHz > 8 && psEncC.nb_subfr == 4 || psIndices.contourIndex < 11 && psEncC.fs_kHz == 8 && psEncC.nb_subfr == 4 || psIndices.contourIndex < 12 && psEncC.fs_kHz > 8 && psEncC.nb_subfr == 2 || psIndices.contourIndex < 3 && psEncC.fs_kHz == 8 && psEncC.nb_subfr == 2);
            psRangeEnc.enc_icdf(psIndices.contourIndex, psEncC.pitch_contour_iCDF, 8);
            Inlines.OpusAssert(psIndices.PERIndex >= 0 && psIndices.PERIndex < 3);
            psRangeEnc.enc_icdf(psIndices.PERIndex, SilkTables.silk_LTP_per_index_iCDF, 8);
            for (int k2 = 0; k2 < psEncC.nb_subfr; ++k2) {
                Inlines.OpusAssert(psIndices.LTPIndex[k2] >= 0 && psIndices.LTPIndex[k2] < 8 << psIndices.PERIndex);
                psRangeEnc.enc_icdf(psIndices.LTPIndex[k2], SilkTables.silk_LTP_gain_iCDF_ptrs[psIndices.PERIndex], 8);
            }
            if (condCoding == 0) {
                Inlines.OpusAssert(psIndices.LTP_scaleIndex >= 0 && psIndices.LTP_scaleIndex < 3);
                psRangeEnc.enc_icdf(psIndices.LTP_scaleIndex, SilkTables.silk_LTPscale_iCDF, 8);
            }
            Inlines.OpusAssert(condCoding == 0 || psIndices.LTP_scaleIndex == 0);
        }
        psEncC.ec_prevSignalType = psIndices.signalType;
        Inlines.OpusAssert(psIndices.Seed >= 0 && psIndices.Seed < 4);
        psRangeEnc.enc_icdf(psIndices.Seed, SilkTables.silk_uniform4_iCDF, 8);
    }
}

