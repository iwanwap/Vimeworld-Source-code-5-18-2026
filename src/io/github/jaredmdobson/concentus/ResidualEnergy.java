/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Filters;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SumSqrShift;

class ResidualEnergy {
    ResidualEnergy() {
    }

    static void silk_residual_energy(int[] nrgs, int[] nrgsQ, short[] x2, short[][] a_Q12, int[] gains, int subfr_length, int nb_subfr, int LPC_order) {
        int i2;
        BoxedValueInt rshift = new BoxedValueInt(0);
        BoxedValueInt energy = new BoxedValueInt(0);
        int x_ptr = 0;
        int offset = LPC_order + subfr_length;
        short[] LPC_res = new short[2 * offset];
        Inlines.OpusAssert((nb_subfr >> 1) * 2 == nb_subfr);
        for (i2 = 0; i2 < nb_subfr >> 1; ++i2) {
            Filters.silk_LPC_analysis_filter(LPC_res, 0, x2, x_ptr, a_Q12[i2], 0, 2 * offset, LPC_order);
            int LPC_res_ptr = LPC_order;
            for (int j2 = 0; j2 < 2; ++j2) {
                SumSqrShift.silk_sum_sqr_shift(energy, rshift, LPC_res, LPC_res_ptr, subfr_length);
                nrgs[i2 * 2 + j2] = energy.Val;
                nrgsQ[i2 * 2 + j2] = 0 - rshift.Val;
                LPC_res_ptr += offset;
            }
            x_ptr += 2 * offset;
        }
        i2 = 0;
        while (i2 < nb_subfr) {
            int lz1 = Inlines.silk_CLZ32(nrgs[i2]) - 1;
            int lz2 = Inlines.silk_CLZ32(gains[i2]) - 1;
            int tmp32 = Inlines.silk_LSHIFT32(gains[i2], lz2);
            tmp32 = Inlines.silk_SMMUL(tmp32, tmp32);
            nrgs[i2] = Inlines.silk_SMMUL(tmp32, Inlines.silk_LSHIFT32(nrgs[i2], lz1));
            int n2 = i2++;
            nrgsQ[n2] = nrgsQ[n2] + (lz1 + 2 * lz2 - 32 - 32);
        }
    }

    static int silk_residual_energy16_covar(short[] c2, int c_ptr, int[] wXX, int wXX_ptr, int[] wXx, int wxx, int D2, int cQ2) {
        int i2;
        int lshifts;
        int[] cn2 = new int[D2];
        Inlines.OpusAssert(D2 >= 0);
        Inlines.OpusAssert(D2 <= 16);
        Inlines.OpusAssert(cQ2 > 0);
        Inlines.OpusAssert(cQ2 < 16);
        int Qxtra = lshifts = 16 - cQ2;
        int c_max = 0;
        for (i2 = c_ptr; i2 < c_ptr + D2; ++i2) {
            c_max = Inlines.silk_max_32(c_max, Inlines.silk_abs(c2[i2]));
        }
        Qxtra = Inlines.silk_min_int(Qxtra, Inlines.silk_CLZ32(c_max) - 17);
        int w_max = Inlines.silk_max_32(wXX[wXX_ptr], wXX[wXX_ptr + D2 * D2 - 1]);
        Qxtra = Inlines.silk_min_int(Qxtra, Inlines.silk_CLZ32(Inlines.silk_MUL(D2, Inlines.silk_RSHIFT(Inlines.silk_SMULWB(w_max, c_max), 4))) - 5);
        Qxtra = Inlines.silk_max_int(Qxtra, 0);
        for (i2 = 0; i2 < D2; ++i2) {
            cn2[i2] = Inlines.silk_LSHIFT(c2[c_ptr + i2], Qxtra);
            Inlines.OpusAssert(Inlines.silk_abs(cn2[i2]) <= 32768);
        }
        lshifts -= Qxtra;
        int tmp = 0;
        for (i2 = 0; i2 < D2; ++i2) {
            tmp = Inlines.silk_SMLAWB(tmp, wXx[i2], cn2[i2]);
        }
        int nrg = Inlines.silk_RSHIFT(wxx, 1 + lshifts) - tmp;
        int tmp2 = 0;
        for (i2 = 0; i2 < D2; ++i2) {
            tmp = 0;
            int pRow = wXX_ptr + i2 * D2;
            for (int j2 = i2 + 1; j2 < D2; ++j2) {
                tmp = Inlines.silk_SMLAWB(tmp, wXX[pRow + j2], cn2[j2]);
            }
            tmp = Inlines.silk_SMLAWB(tmp, Inlines.silk_RSHIFT(wXX[pRow + i2], 1), cn2[i2]);
            tmp2 = Inlines.silk_SMLAWB(tmp2, tmp, cn2[i2]);
        }
        nrg = (nrg = Inlines.silk_ADD_LSHIFT32(nrg, tmp2, lshifts)) < 1 ? 1 : (nrg > Inlines.silk_RSHIFT(Integer.MAX_VALUE, lshifts + 2) ? 0x3FFFFFFF : Inlines.silk_LSHIFT(nrg, lshifts + 1));
        return nrg;
    }
}

