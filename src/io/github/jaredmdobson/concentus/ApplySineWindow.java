/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;

class ApplySineWindow {
    private static final short[] freq_table_Q16 = new short[]{12111, 9804, 8235, 7100, 6239, 5565, 5022, 4575, 4202, 3885, 3612, 3375, 3167, 2984, 2820, 2674, 2542, 2422, 2313, 2214, 2123, 2038, 1961, 1889, 1822, 1760, 1702};

    ApplySineWindow() {
    }

    static void silk_apply_sine_window(short[] px_win, int px_win_ptr, short[] px2, int px_ptr, int win_type, int length) {
        int S1_Q16;
        int S0_Q16;
        Inlines.OpusAssert(win_type == 1 || win_type == 2);
        Inlines.OpusAssert(length >= 16 && length <= 120);
        Inlines.OpusAssert((length & 3) == 0);
        int k2 = (length >> 2) - 4;
        Inlines.OpusAssert(k2 >= 0 && k2 <= 26);
        short f_Q16 = freq_table_Q16[k2];
        int c_Q16 = Inlines.silk_SMULWB(f_Q16, -f_Q16);
        Inlines.OpusAssert(c_Q16 >= Short.MIN_VALUE);
        if (win_type == 1) {
            S0_Q16 = 0;
            S1_Q16 = f_Q16 + Inlines.silk_RSHIFT(length, 3);
        } else {
            S0_Q16 = 65536;
            S1_Q16 = 65536 + Inlines.silk_RSHIFT(c_Q16, 1) + Inlines.silk_RSHIFT(length, 4);
        }
        for (k2 = 0; k2 < length; k2 += 4) {
            int pxwk = px_win_ptr + k2;
            int pxk = px_ptr + k2;
            px_win[pxwk] = (short)Inlines.silk_SMULWB(Inlines.silk_RSHIFT(S0_Q16 + S1_Q16, 1), px2[pxk]);
            px_win[pxwk + 1] = (short)Inlines.silk_SMULWB(S1_Q16, px2[pxk + 1]);
            S0_Q16 = Inlines.silk_SMULWB(S1_Q16, c_Q16) + Inlines.silk_LSHIFT(S1_Q16, 1) - S0_Q16 + 1;
            S0_Q16 = Inlines.silk_min(S0_Q16, 65536);
            px_win[pxwk + 2] = (short)Inlines.silk_SMULWB(Inlines.silk_RSHIFT(S0_Q16 + S1_Q16, 1), px2[pxk + 2]);
            px_win[pxwk + 3] = (short)Inlines.silk_SMULWB(S0_Q16, px2[pxk + 3]);
            S1_Q16 = Inlines.silk_SMULWB(S0_Q16, c_Q16) + Inlines.silk_LSHIFT(S0_Q16, 1) - S1_Q16;
            S1_Q16 = Inlines.silk_min(S1_Q16, 65536);
        }
    }
}

