/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.NLSF;
import io.github.jaredmdobson.concentus.SilkChannelDecoder;
import io.github.jaredmdobson.concentus.SilkTables;

class DecodeIndices {
    DecodeIndices() {
    }

    static void silk_decode_indices(SilkChannelDecoder psDec, EntropyCoder psRangeDec, int FrameIndex, int decode_LBRR, int condCoding) {
        int i2;
        short[] ec_ix = new short[psDec.LPC_order];
        short[] pred_Q8 = new short[psDec.LPC_order];
        int Ix2 = decode_LBRR != 0 || psDec.VAD_flags[FrameIndex] != 0 ? psRangeDec.dec_icdf(SilkTables.silk_type_offset_VAD_iCDF, 8) + 2 : psRangeDec.dec_icdf(SilkTables.silk_type_offset_no_VAD_iCDF, 8);
        psDec.indices.signalType = (byte)Inlines.silk_RSHIFT(Ix2, 1);
        psDec.indices.quantOffsetType = (byte)(Ix2 & 1);
        if (condCoding == 2) {
            psDec.indices.GainsIndices[0] = (byte)psRangeDec.dec_icdf(SilkTables.silk_delta_gain_iCDF, 8);
        } else {
            psDec.indices.GainsIndices[0] = (byte)Inlines.silk_LSHIFT(psRangeDec.dec_icdf(SilkTables.silk_gain_iCDF[psDec.indices.signalType], 8), 3);
            psDec.indices.GainsIndices[0] = (byte)(psDec.indices.GainsIndices[0] + (byte)psRangeDec.dec_icdf(SilkTables.silk_uniform8_iCDF, 8));
        }
        for (i2 = 1; i2 < psDec.nb_subfr; ++i2) {
            psDec.indices.GainsIndices[i2] = (byte)psRangeDec.dec_icdf(SilkTables.silk_delta_gain_iCDF, 8);
        }
        psDec.indices.NLSFIndices[0] = (byte)psRangeDec.dec_icdf(psDec.psNLSF_CB.CB1_iCDF, (psDec.indices.signalType >> 1) * psDec.psNLSF_CB.nVectors, 8);
        NLSF.silk_NLSF_unpack(ec_ix, pred_Q8, psDec.psNLSF_CB, psDec.indices.NLSFIndices[0]);
        Inlines.OpusAssert(psDec.psNLSF_CB.order == psDec.LPC_order);
        for (i2 = 0; i2 < psDec.psNLSF_CB.order; ++i2) {
            Ix2 = psRangeDec.dec_icdf(psDec.psNLSF_CB.ec_iCDF, ec_ix[i2], 8);
            if (Ix2 == 0) {
                Ix2 -= psRangeDec.dec_icdf(SilkTables.silk_NLSF_EXT_iCDF, 8);
            } else if (Ix2 == 8) {
                Ix2 += psRangeDec.dec_icdf(SilkTables.silk_NLSF_EXT_iCDF, 8);
            }
            psDec.indices.NLSFIndices[i2 + 1] = (byte)(Ix2 - 4);
        }
        psDec.indices.NLSFInterpCoef_Q2 = psDec.nb_subfr == 4 ? (byte)psRangeDec.dec_icdf(SilkTables.silk_NLSF_interpolation_factor_iCDF, 8) : (byte)4;
        if (psDec.indices.signalType == 2) {
            int delta_lagIndex;
            boolean decode_absolute_lagIndex = true;
            if (condCoding == 2 && psDec.ec_prevSignalType == 2 && (delta_lagIndex = (int)psRangeDec.dec_icdf(SilkTables.silk_pitch_delta_iCDF, 8)) > 0) {
                psDec.indices.lagIndex = (short)(psDec.ec_prevLagIndex + (delta_lagIndex -= 9));
                decode_absolute_lagIndex = false;
            }
            if (decode_absolute_lagIndex) {
                psDec.indices.lagIndex = (short)(psRangeDec.dec_icdf(SilkTables.silk_pitch_lag_iCDF, 8) * Inlines.silk_RSHIFT(psDec.fs_kHz, 1));
                psDec.indices.lagIndex = (short)(psDec.indices.lagIndex + (short)psRangeDec.dec_icdf(psDec.pitch_lag_low_bits_iCDF, 8));
            }
            psDec.ec_prevLagIndex = psDec.indices.lagIndex;
            psDec.indices.contourIndex = (byte)psRangeDec.dec_icdf(psDec.pitch_contour_iCDF, 8);
            psDec.indices.PERIndex = (byte)psRangeDec.dec_icdf(SilkTables.silk_LTP_per_index_iCDF, 8);
            for (int k2 = 0; k2 < psDec.nb_subfr; ++k2) {
                psDec.indices.LTPIndex[k2] = (byte)psRangeDec.dec_icdf(SilkTables.silk_LTP_gain_iCDF_ptrs[psDec.indices.PERIndex], 8);
            }
            psDec.indices.LTP_scaleIndex = condCoding == 0 ? (byte)psRangeDec.dec_icdf(SilkTables.silk_LTPscale_iCDF, 8) : (byte)0;
        }
        psDec.ec_prevSignalType = psDec.indices.signalType;
        psDec.indices.Seed = (byte)psRangeDec.dec_icdf(SilkTables.silk_uniform4_iCDF, 8);
    }
}

