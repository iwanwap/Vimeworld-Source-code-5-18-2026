/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Inlines;

class SumSqrShift {
    SumSqrShift() {
    }

    static void silk_sum_sqr_shift(BoxedValueInt energy, BoxedValueInt shift, short[] x2, int x_ptr, int len) {
        int nrg_tmp;
        int i2;
        int nrg = 0;
        int shft = 0;
        --len;
        for (i2 = 0; i2 < len; i2 += 2) {
            nrg = Inlines.silk_SMLABB_ovflw(nrg, x2[x_ptr + i2], x2[x_ptr + i2]);
            if ((nrg = Inlines.silk_SMLABB_ovflw(nrg, x2[x_ptr + i2 + 1], x2[x_ptr + i2 + 1])) >= 0) continue;
            nrg = (int)Inlines.silk_RSHIFT_uint(nrg, 2);
            shft = 2;
            i2 += 2;
            break;
        }
        while (i2 < len) {
            nrg_tmp = Inlines.silk_SMULBB(x2[x_ptr + i2], x2[x_ptr + i2]);
            if ((nrg = (int)Inlines.silk_ADD_RSHIFT_uint(nrg, nrg_tmp = Inlines.silk_SMLABB_ovflw(nrg_tmp, x2[x_ptr + i2 + 1], x2[x_ptr + i2 + 1]), shft)) < 0) {
                nrg = (int)Inlines.silk_RSHIFT_uint(nrg, 2);
                shft += 2;
            }
            i2 += 2;
        }
        if (i2 == len) {
            nrg_tmp = Inlines.silk_SMULBB(x2[x_ptr + i2], x2[x_ptr + i2]);
            nrg = (int)Inlines.silk_ADD_RSHIFT_uint(nrg, nrg_tmp, shft);
        }
        if ((nrg & 0xC0000000) != 0) {
            nrg = (int)Inlines.silk_RSHIFT_uint(nrg, 2);
            shft += 2;
        }
        shift.Val = shft;
        energy.Val = nrg;
    }

    static void silk_sum_sqr_shift(BoxedValueInt energy, BoxedValueInt shift, short[] x2, int len) {
        int nrg_tmp;
        int i2;
        int nrg = 0;
        int shft = 0;
        --len;
        for (i2 = 0; i2 < len; i2 += 2) {
            nrg = Inlines.silk_SMLABB_ovflw(nrg, x2[i2], x2[i2]);
            if ((nrg = Inlines.silk_SMLABB_ovflw(nrg, x2[i2 + 1], x2[i2 + 1])) >= 0) continue;
            nrg = (int)Inlines.silk_RSHIFT_uint(nrg, 2);
            shft = 2;
            i2 += 2;
            break;
        }
        while (i2 < len) {
            nrg_tmp = Inlines.silk_SMULBB(x2[i2], x2[i2]);
            if ((nrg = (int)Inlines.silk_ADD_RSHIFT_uint(nrg, nrg_tmp = Inlines.silk_SMLABB_ovflw(nrg_tmp, x2[i2 + 1], x2[i2 + 1]), shft)) < 0) {
                nrg = (int)Inlines.silk_RSHIFT_uint(nrg, 2);
                shft += 2;
            }
            i2 += 2;
        }
        if (i2 == len) {
            nrg_tmp = Inlines.silk_SMULBB(x2[i2], x2[i2]);
            nrg = (int)Inlines.silk_ADD_RSHIFT_uint(nrg, nrg_tmp, shft);
        }
        if ((nrg & 0xC0000000) != 0) {
            nrg = (int)Inlines.silk_RSHIFT_uint(nrg, 2);
            shft += 2;
        }
        shift.Val = shft;
        energy.Val = nrg;
    }
}

