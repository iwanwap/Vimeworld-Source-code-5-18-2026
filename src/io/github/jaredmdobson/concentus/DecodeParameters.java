/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BWExpander;
import io.github.jaredmdobson.concentus.BoxedValueByte;
import io.github.jaredmdobson.concentus.DecodePitch;
import io.github.jaredmdobson.concentus.GainQuantization;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.NLSF;
import io.github.jaredmdobson.concentus.SilkChannelDecoder;
import io.github.jaredmdobson.concentus.SilkDecoderControl;
import io.github.jaredmdobson.concentus.SilkTables;

class DecodeParameters {
    DecodeParameters() {
    }

    static void silk_decode_parameters(SilkChannelDecoder psDec, SilkDecoderControl psDecCtrl, int condCoding) {
        int i2;
        short[] pNLSF_Q15 = new short[psDec.LPC_order];
        short[] pNLSF0_Q15 = new short[psDec.LPC_order];
        BoxedValueByte boxedLastGainIndex = new BoxedValueByte(psDec.LastGainIndex);
        GainQuantization.silk_gains_dequant(psDecCtrl.Gains_Q16, psDec.indices.GainsIndices, boxedLastGainIndex, condCoding == 2 ? 1 : 0, psDec.nb_subfr);
        psDec.LastGainIndex = boxedLastGainIndex.Val;
        NLSF.silk_NLSF_decode(pNLSF_Q15, psDec.indices.NLSFIndices, psDec.psNLSF_CB);
        NLSF.silk_NLSF2A(psDecCtrl.PredCoef_Q12[1], pNLSF_Q15, psDec.LPC_order);
        if (psDec.first_frame_after_reset == 1) {
            psDec.indices.NLSFInterpCoef_Q2 = (byte)4;
        }
        if (psDec.indices.NLSFInterpCoef_Q2 < 4) {
            for (i2 = 0; i2 < psDec.LPC_order; ++i2) {
                pNLSF0_Q15[i2] = (short)(psDec.prevNLSF_Q15[i2] + Inlines.silk_RSHIFT(Inlines.silk_MUL(psDec.indices.NLSFInterpCoef_Q2, pNLSF_Q15[i2] - psDec.prevNLSF_Q15[i2]), 2));
            }
            NLSF.silk_NLSF2A(psDecCtrl.PredCoef_Q12[0], pNLSF0_Q15, psDec.LPC_order);
        } else {
            System.arraycopy(psDecCtrl.PredCoef_Q12[1], 0, psDecCtrl.PredCoef_Q12[0], 0, psDec.LPC_order);
        }
        System.arraycopy(pNLSF_Q15, 0, psDec.prevNLSF_Q15, 0, psDec.LPC_order);
        if (psDec.lossCnt != 0) {
            BWExpander.silk_bwexpander(psDecCtrl.PredCoef_Q12[0], psDec.LPC_order, 63570);
            BWExpander.silk_bwexpander(psDecCtrl.PredCoef_Q12[1], psDec.LPC_order, 63570);
        }
        if (psDec.indices.signalType == 2) {
            byte Ix2;
            DecodePitch.silk_decode_pitch(psDec.indices.lagIndex, psDec.indices.contourIndex, psDecCtrl.pitchL, psDec.fs_kHz, psDec.nb_subfr);
            byte[][] cbk_ptr_Q7 = SilkTables.silk_LTP_vq_ptrs_Q7[psDec.indices.PERIndex];
            for (int k2 = 0; k2 < psDec.nb_subfr; ++k2) {
                Ix2 = psDec.indices.LTPIndex[k2];
                for (i2 = 0; i2 < 5; ++i2) {
                    psDecCtrl.LTPCoef_Q14[k2 * 5 + i2] = (short)Inlines.silk_LSHIFT(cbk_ptr_Q7[Ix2][i2], 7);
                }
            }
            Ix2 = psDec.indices.LTP_scaleIndex;
            psDecCtrl.LTP_scale_Q14 = SilkTables.silk_LTPScales_table_Q14[Ix2];
        } else {
            Arrays.MemSet(psDecCtrl.pitchL, 0, psDec.nb_subfr);
            Arrays.MemSet(psDecCtrl.LTPCoef_Q14, (short)0, 5 * psDec.nb_subfr);
            psDec.indices.PERIndex = 0;
            psDecCtrl.LTP_scale_Q14 = 0;
        }
    }
}

