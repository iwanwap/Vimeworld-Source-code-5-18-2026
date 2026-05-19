/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;

class LinearAlgebra {
    LinearAlgebra() {
    }

    static void silk_solve_LDL(int[] A2, int A_ptr, int M2, int[] b2, int[] x_Q16) {
        Inlines.OpusAssert(M2 <= 16);
        int[] L_Q16 = new int[M2 * M2];
        int[] Y2 = new int[16];
        int[] inv_D = new int[32];
        LinearAlgebra.silk_LDL_factorize(A2, A_ptr, M2, L_Q16, inv_D);
        LinearAlgebra.silk_LS_SolveFirst(L_Q16, M2, b2, Y2);
        LinearAlgebra.silk_LS_divide_Q16(Y2, inv_D, M2);
        LinearAlgebra.silk_LS_SolveLast(L_Q16, M2, Y2, x_Q16);
    }

    private static void silk_LDL_factorize(int[] A2, int A_ptr, int M2, int[] L_Q16, int[] inv_D) {
        int[] v_Q0 = new int[M2];
        int[] D_Q0 = new int[M2];
        Inlines.OpusAssert(M2 <= 16);
        boolean status = true;
        int diag_min_value = Inlines.silk_max_32(Inlines.silk_SMMUL(Inlines.silk_ADD_SAT32(A2[A_ptr], A2[A_ptr + Inlines.silk_SMULBB(M2, M2) - 1]), 21475), 512);
        block0: for (int loop_count = 0; loop_count < M2 && status; ++loop_count) {
            status = false;
            for (int j2 = 0; j2 < M2; ++j2) {
                int i2;
                int[] scratch1 = L_Q16;
                int scratch1_ptr = Inlines.MatrixGetPointer(j2, 0, M2);
                int tmp_32 = 0;
                for (i2 = 0; i2 < j2; ++i2) {
                    v_Q0[i2] = Inlines.silk_SMULWW(D_Q0[i2], scratch1[scratch1_ptr + i2]);
                    tmp_32 = Inlines.silk_SMLAWW(tmp_32, v_Q0[i2], scratch1[scratch1_ptr + i2]);
                }
                tmp_32 = Inlines.silk_SUB32(Inlines.MatrixGet(A2, A_ptr, j2, j2, M2), tmp_32);
                if (tmp_32 < diag_min_value) {
                    tmp_32 = Inlines.silk_SUB32(Inlines.silk_SMULBB(loop_count + 1, diag_min_value), tmp_32);
                    for (i2 = 0; i2 < M2; ++i2) {
                        Inlines.MatrixSet(A2, A_ptr, i2, i2, M2, Inlines.silk_ADD32(Inlines.MatrixGet(A2, A_ptr, i2, i2, M2), tmp_32));
                    }
                    status = true;
                    continue block0;
                }
                D_Q0[j2] = tmp_32;
                int one_div_diag_Q36 = Inlines.silk_INVERSE32_varQ(tmp_32, 36);
                int one_div_diag_Q40 = Inlines.silk_LSHIFT(one_div_diag_Q36, 4);
                int err = Inlines.silk_SUB32(0x1000000, Inlines.silk_SMULWW(tmp_32, one_div_diag_Q40));
                int one_div_diag_Q48 = Inlines.silk_SMULWW(err, one_div_diag_Q40);
                inv_D[j2 * 2 + 0] = one_div_diag_Q36;
                inv_D[j2 * 2 + 1] = one_div_diag_Q48;
                Inlines.MatrixSet(L_Q16, j2, j2, M2, 65536);
                scratch1 = A2;
                scratch1_ptr = Inlines.MatrixGetPointer(j2, 0, M2) + A_ptr;
                int[] scratch2 = L_Q16;
                int scratch2_ptr = Inlines.MatrixGetPointer(j2 + 1, 0, M2);
                for (i2 = j2 + 1; i2 < M2; ++i2) {
                    tmp_32 = 0;
                    for (int k2 = 0; k2 < j2; ++k2) {
                        tmp_32 = Inlines.silk_SMLAWW(tmp_32, v_Q0[k2], scratch2[scratch2_ptr + k2]);
                    }
                    tmp_32 = Inlines.silk_SUB32(scratch1[scratch1_ptr + i2], tmp_32);
                    Inlines.MatrixSet(L_Q16, i2, j2, M2, Inlines.silk_ADD32(Inlines.silk_SMMUL(tmp_32, one_div_diag_Q48), Inlines.silk_RSHIFT(Inlines.silk_SMULWW(tmp_32, one_div_diag_Q36), 4)));
                    scratch2_ptr += M2;
                }
            }
        }
        Inlines.OpusAssert(!status);
    }

    private static void silk_LS_divide_Q16(int[] T2, int[] inv_D, int M2) {
        for (int i2 = 0; i2 < M2; ++i2) {
            int one_div_diag_Q36 = inv_D[i2 * 2 + 0];
            int one_div_diag_Q48 = inv_D[i2 * 2 + 1];
            int tmp_32 = T2[i2];
            T2[i2] = Inlines.silk_ADD32(Inlines.silk_SMMUL(tmp_32, one_div_diag_Q48), Inlines.silk_RSHIFT(Inlines.silk_SMULWW(tmp_32, one_div_diag_Q36), 4));
        }
    }

    private static void silk_LS_SolveFirst(int[] L_Q16, int M2, int[] b2, int[] x_Q16) {
        for (int i2 = 0; i2 < M2; ++i2) {
            int ptr32 = Inlines.MatrixGetPointer(i2, 0, M2);
            int tmp_32 = 0;
            for (int j2 = 0; j2 < i2; ++j2) {
                tmp_32 = Inlines.silk_SMLAWW(tmp_32, L_Q16[ptr32 + j2], x_Q16[j2]);
            }
            x_Q16[i2] = Inlines.silk_SUB32(b2[i2], tmp_32);
        }
    }

    private static void silk_LS_SolveLast(int[] L_Q16, int M2, int[] b2, int[] x_Q16) {
        for (int i2 = M2 - 1; i2 >= 0; --i2) {
            int ptr32 = Inlines.MatrixGetPointer(0, i2, M2);
            int tmp_32 = 0;
            for (int j2 = M2 - 1; j2 > i2; --j2) {
                tmp_32 = Inlines.silk_SMLAWW(tmp_32, L_Q16[ptr32 + Inlines.silk_SMULBB(j2, M2)], x_Q16[j2]);
            }
            x_Q16[i2] = Inlines.silk_SUB32(b2[i2], tmp_32);
        }
    }
}

