/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SumSqrShift;

class CorrelateMatrix {
    CorrelateMatrix() {
    }

    static void silk_corrVector(short[] x2, int x_ptr, short[] t2, int t_ptr, int L2, int order, int[] Xt2, int rshifts) {
        int ptr1 = x_ptr + order - 1;
        int ptr2 = t_ptr;
        if (rshifts > 0) {
            for (int lag = 0; lag < order; ++lag) {
                int inner_prod = 0;
                for (int i2 = 0; i2 < L2; ++i2) {
                    inner_prod += Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[ptr1 + i2], t2[ptr2 + i2]), rshifts);
                }
                Xt2[lag] = inner_prod;
                --ptr1;
            }
        } else {
            Inlines.OpusAssert(rshifts == 0);
            for (int lag = 0; lag < order; ++lag) {
                Xt2[lag] = Inlines.silk_inner_prod(x2, ptr1, t2, ptr2, L2);
                --ptr1;
            }
        }
    }

    static void silk_corrMatrix(short[] x2, int x_ptr, int L2, int order, int head_room, int[] XX2, int XX_ptr, BoxedValueInt rshifts) {
        int j2;
        int i2;
        BoxedValueInt boxed_energy = new BoxedValueInt(0);
        BoxedValueInt boxed_rshifts_local = new BoxedValueInt(0);
        SumSqrShift.silk_sum_sqr_shift(boxed_energy, boxed_rshifts_local, x2, x_ptr, L2 + order - 1);
        int energy = boxed_energy.Val;
        int rshifts_local = boxed_rshifts_local.Val;
        int head_room_rshifts = Inlines.silk_max(head_room - Inlines.silk_CLZ32(energy), 0);
        energy = Inlines.silk_RSHIFT32(energy, head_room_rshifts);
        rshifts_local += head_room_rshifts;
        for (i2 = x_ptr; i2 < x_ptr + order - 1; ++i2) {
            energy -= Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[i2], x2[i2]), rshifts_local);
        }
        if (rshifts_local < rshifts.Val) {
            energy = Inlines.silk_RSHIFT32(energy, rshifts.Val - rshifts_local);
            rshifts_local = rshifts.Val;
        }
        Inlines.MatrixSet(XX2, XX_ptr, 0, 0, order, energy);
        int ptr1 = x_ptr + order - 1;
        for (j2 = 1; j2 < order; ++j2) {
            energy = Inlines.silk_SUB32(energy, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[ptr1 + L2 - j2], x2[ptr1 + L2 - j2]), rshifts_local));
            energy = Inlines.silk_ADD32(energy, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[ptr1 - j2], x2[ptr1 - j2]), rshifts_local));
            Inlines.MatrixSet(XX2, XX_ptr, j2, j2, order, energy);
        }
        int ptr2 = x_ptr + order - 2;
        if (rshifts_local > 0) {
            for (int lag = 1; lag < order; ++lag) {
                energy = 0;
                for (i2 = 0; i2 < L2; ++i2) {
                    energy += Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[ptr1 + i2], x2[ptr2 + i2]), rshifts_local);
                }
                Inlines.MatrixSet(XX2, XX_ptr, lag, 0, order, energy);
                Inlines.MatrixSet(XX2, XX_ptr, 0, lag, order, energy);
                for (j2 = 1; j2 < order - lag; ++j2) {
                    energy = Inlines.silk_SUB32(energy, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[ptr1 + L2 - j2], x2[ptr2 + L2 - j2]), rshifts_local));
                    energy = Inlines.silk_ADD32(energy, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(x2[ptr1 - j2], x2[ptr2 - j2]), rshifts_local));
                    Inlines.MatrixSet(XX2, XX_ptr, lag + j2, j2, order, energy);
                    Inlines.MatrixSet(XX2, XX_ptr, j2, lag + j2, order, energy);
                }
                --ptr2;
            }
        } else {
            for (int lag = 1; lag < order; ++lag) {
                energy = Inlines.silk_inner_prod(x2, ptr1, x2, ptr2, L2);
                Inlines.MatrixSet(XX2, XX_ptr, lag, 0, order, energy);
                Inlines.MatrixSet(XX2, XX_ptr, 0, lag, order, energy);
                for (j2 = 1; j2 < order - lag; ++j2) {
                    energy = Inlines.silk_SUB32(energy, Inlines.silk_SMULBB(x2[ptr1 + L2 - j2], x2[ptr2 + L2 - j2]));
                    energy = Inlines.silk_SMLABB(energy, x2[ptr1 - j2], x2[ptr2 - j2]);
                    Inlines.MatrixSet(XX2, XX_ptr, lag + j2, j2, order, energy);
                    Inlines.MatrixSet(XX2, XX_ptr, j2, lag + j2, order, energy);
                }
                --ptr2;
            }
        }
        rshifts.Val = rshifts_local;
    }
}

