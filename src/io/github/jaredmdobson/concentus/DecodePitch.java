/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SilkTables;

class DecodePitch {
    DecodePitch() {
    }

    static void silk_decode_pitch(short lagIndex, byte contourIndex, int[] pitch_lags, int Fs_kHz, int nb_subfr) {
        byte[][] Lag_CB_ptr;
        if (Fs_kHz == 8) {
            if (nb_subfr == 4) {
                Lag_CB_ptr = SilkTables.silk_CB_lags_stage2;
            } else {
                Inlines.OpusAssert(nb_subfr == 2);
                Lag_CB_ptr = SilkTables.silk_CB_lags_stage2_10_ms;
            }
        } else if (nb_subfr == 4) {
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage3;
        } else {
            Inlines.OpusAssert(nb_subfr == 2);
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage3_10_ms;
        }
        int min_lag = Inlines.silk_SMULBB(2, Fs_kHz);
        int max_lag = Inlines.silk_SMULBB(18, Fs_kHz);
        int lag = min_lag + lagIndex;
        for (int k2 = 0; k2 < nb_subfr; ++k2) {
            pitch_lags[k2] = lag + Lag_CB_ptr[k2][contourIndex];
            pitch_lags[k2] = Inlines.silk_LIMIT(pitch_lags[k2], min_lag, max_lag);
        }
    }
}

