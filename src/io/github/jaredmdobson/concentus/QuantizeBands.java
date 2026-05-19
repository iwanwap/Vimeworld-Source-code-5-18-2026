/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.CeltTables;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Laplace;

class QuantizeBands {
    private static final int[] pred_coef = new int[]{29440, 26112, 21248, 16384};
    private static final int[] beta_coef = new int[]{30147, 22282, 12124, 6554};
    private static final int beta_intra = 4915;
    private static short[] small_energy_icdf = new short[]{2, 1, 0};

    QuantizeBands() {
    }

    static int loss_distortion(int[][] eBands, int[][] oldEBands, int start, int end, int len, int C2) {
        int dist = 0;
        int c2 = 0;
        do {
            for (int i2 = start; i2 < end; ++i2) {
                int d2 = Inlines.SUB16(Inlines.SHR16(eBands[c2][i2], 3), Inlines.SHR16(oldEBands[c2][i2], 3));
                dist = Inlines.MAC16_16(dist, d2, d2);
            }
        } while (++c2 < C2);
        return Inlines.MIN32(200, Inlines.SHR32(dist, 14));
    }

    static int quant_coarse_energy_impl(CeltMode m2, int start, int end, int[][] eBands, int[][] oldEBands, int budget, int tell, short[] prob_model, int[][] error, EntropyCoder enc, int C2, int LM2, int intra, int max_decay, int lfe) {
        int beta;
        int coef;
        int badness = 0;
        int[] prev = new int[]{0, 0};
        if (tell + 3 <= budget) {
            enc.enc_bit_logp(intra, 3);
        }
        if (intra != 0) {
            coef = 0;
            beta = 4915;
        } else {
            beta = beta_coef[LM2];
            coef = pred_coef[LM2];
        }
        for (int i2 = start; i2 < end; ++i2) {
            int c2 = 0;
            do {
                int x2 = eBands[c2][i2];
                int oldE = Inlines.MAX16(-9216, oldEBands[c2][i2]);
                int f2 = Inlines.SHL32(Inlines.EXTEND32(x2), 7) - Inlines.PSHR32(Inlines.MULT16_16(coef, oldE), 8) - prev[c2];
                int qi2 = f2 + 65536 >> 17;
                short decay_bound = Inlines.EXTRACT16(Inlines.MAX32(-28672, Inlines.SUB32(oldEBands[c2][i2], max_decay)));
                if (qi2 < 0 && x2 < decay_bound && (qi2 += Inlines.SHR16(Inlines.SUB16((int)decay_bound, x2), 10)) > 0) {
                    qi2 = 0;
                }
                int qi0 = qi2;
                tell = enc.tell();
                int bits_left = budget - tell - 3 * C2 * (end - i2);
                if (i2 != start && bits_left < 30) {
                    if (bits_left < 24) {
                        qi2 = Inlines.IMIN(1, qi2);
                    }
                    if (bits_left < 16) {
                        qi2 = Inlines.IMAX(-1, qi2);
                    }
                }
                if (lfe != 0 && i2 >= 2) {
                    qi2 = Inlines.IMIN(qi2, 0);
                }
                if (budget - tell >= 15) {
                    int pi2 = 2 * Inlines.IMIN(i2, 20);
                    BoxedValueInt boxed_qi = new BoxedValueInt(qi2);
                    Laplace.ec_laplace_encode(enc, boxed_qi, prob_model[pi2] << 7, prob_model[pi2 + 1] << 6);
                    qi2 = boxed_qi.Val;
                } else if (budget - tell >= 2) {
                    enc.enc_icdf(2 * qi2 ^ 0 - ((qi2 = Inlines.IMAX(-1, Inlines.IMIN(qi2, 1))) < 0 ? 1 : 0), small_energy_icdf, 2);
                } else if (budget - tell >= 1) {
                    qi2 = Inlines.IMIN(0, qi2);
                    enc.enc_bit_logp(-qi2, 1);
                } else {
                    qi2 = -1;
                }
                error[c2][i2] = Inlines.PSHR32(f2, 7) - Inlines.SHL16(qi2, 10);
                badness += Inlines.abs(qi0 - qi2);
                int q2 = Inlines.SHL32(qi2, 10);
                int tmp = Inlines.PSHR32(Inlines.MULT16_16(coef, oldE), 8) + prev[c2] + Inlines.SHL32(q2, 7);
                tmp = Inlines.MAX32(-3670016, tmp);
                oldEBands[c2][i2] = Inlines.PSHR32(tmp, 7);
                prev[c2] = prev[c2] + Inlines.SHL32(q2, 7) - Inlines.MULT16_16(beta, Inlines.PSHR32(q2, 8));
            } while (++c2 < C2);
        }
        return lfe != 0 ? 0 : badness;
    }

    static void quant_coarse_energy(CeltMode m2, int start, int end, int effEnd, int[][] eBands, int[][] oldEBands, int budget, int[][] error, EntropyCoder enc, int C2, int LM2, int nbAvailableBytes, int force_intra, BoxedValueInt delayedIntra, int two_pass, int loss_rate, int lfe) {
        EntropyCoder enc_start_state = new EntropyCoder();
        int badness1 = 0;
        int intra = force_intra != 0 || two_pass == 0 && delayedIntra.Val > 2 * C2 * (end - start) && nbAvailableBytes > (end - start) * C2 ? 1 : 0;
        int intra_bias = budget * delayedIntra.Val * loss_rate / (C2 * 512);
        int new_distortion = QuantizeBands.loss_distortion(eBands, oldEBands, start, effEnd, m2.nbEBands, C2);
        int tell = enc.tell();
        if (tell + 3 > budget) {
            intra = 0;
            two_pass = 0;
        }
        int max_decay = 16384;
        if (end - start > 10) {
            max_decay = Inlines.MIN32(max_decay, Inlines.SHL32(nbAvailableBytes, 7));
        }
        if (lfe != 0) {
            max_decay = 3072;
        }
        enc_start_state.Assign(enc);
        int[][] oldEBands_intra = Arrays.InitTwoDimensionalArrayInt(C2, m2.nbEBands);
        int[][] error_intra = Arrays.InitTwoDimensionalArrayInt(C2, m2.nbEBands);
        System.arraycopy(oldEBands[0], 0, oldEBands_intra[0], 0, m2.nbEBands);
        if (C2 == 2) {
            System.arraycopy(oldEBands[1], 0, oldEBands_intra[1], 0, m2.nbEBands);
        }
        if (two_pass != 0 || intra != 0) {
            badness1 = QuantizeBands.quant_coarse_energy_impl(m2, start, end, eBands, oldEBands_intra, budget, tell, CeltTables.e_prob_model[LM2][1], error_intra, enc, C2, LM2, 1, max_decay, lfe);
        }
        if (intra == 0) {
            EntropyCoder enc_intra_state = new EntropyCoder();
            byte[] intra_bits = null;
            int tell_intra = enc.tell_frac();
            enc_intra_state.Assign(enc);
            int nstart_bytes = enc_start_state.range_bytes();
            int nintra_bytes = enc_intra_state.range_bytes();
            int intra_buf = nstart_bytes;
            int save_bytes = nintra_bytes - nstart_bytes;
            if (save_bytes != 0) {
                intra_bits = new byte[save_bytes];
                System.arraycopy(enc_intra_state.get_buffer(), intra_buf, intra_bits, 0, save_bytes);
            }
            enc.Assign(enc_start_state);
            int badness2 = QuantizeBands.quant_coarse_energy_impl(m2, start, end, eBands, oldEBands, budget, tell, CeltTables.e_prob_model[LM2][intra], error, enc, C2, LM2, 0, max_decay, lfe);
            if (two_pass != 0 && (badness1 < badness2 || badness1 == badness2 && enc.tell_frac() + intra_bias > tell_intra)) {
                enc.Assign(enc_intra_state);
                if (intra_bits != null) {
                    enc_intra_state.write_buffer(intra_bits, 0, intra_buf, nintra_bytes - nstart_bytes);
                }
                System.arraycopy(oldEBands_intra[0], 0, oldEBands[0], 0, m2.nbEBands);
                System.arraycopy(error_intra[0], 0, error[0], 0, m2.nbEBands);
                if (C2 == 2) {
                    System.arraycopy(oldEBands_intra[1], 0, oldEBands[1], 0, m2.nbEBands);
                    System.arraycopy(error_intra[1], 0, error[1], 0, m2.nbEBands);
                }
                intra = 1;
            }
        } else {
            System.arraycopy(oldEBands_intra[0], 0, oldEBands[0], 0, m2.nbEBands);
            System.arraycopy(error_intra[0], 0, error[0], 0, m2.nbEBands);
            if (C2 == 2) {
                System.arraycopy(oldEBands_intra[1], 0, oldEBands[1], 0, m2.nbEBands);
                System.arraycopy(error_intra[1], 0, error[1], 0, m2.nbEBands);
            }
        }
        delayedIntra.Val = intra != 0 ? new_distortion : Inlines.ADD32(Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(pred_coef[LM2], pred_coef[LM2]), delayedIntra.Val), new_distortion);
    }

    static void quant_fine_energy(CeltMode m2, int start, int end, int[][] oldEBands, int[][] error, int[] fine_quant, EntropyCoder enc, int C2) {
        for (int i2 = start; i2 < end; ++i2) {
            int frac = 1 << fine_quant[i2];
            if (fine_quant[i2] <= 0) continue;
            int c2 = 0;
            do {
                int q2;
                if ((q2 = error[c2][i2] + 512 >> 10 - fine_quant[i2]) > frac - 1) {
                    q2 = frac - 1;
                }
                if (q2 < 0) {
                    q2 = 0;
                }
                enc.enc_bits(q2, fine_quant[i2]);
                int offset = Inlines.SUB16(Inlines.SHR32(Inlines.SHL32(q2, 10) + 512, fine_quant[i2]), 512);
                int[] nArray = oldEBands[c2];
                int n2 = i2;
                nArray[n2] = nArray[n2] + offset;
                int[] nArray2 = error[c2];
                int n3 = i2;
                nArray2[n3] = nArray2[n3] - offset;
            } while (++c2 < C2);
        }
    }

    static void quant_energy_finalise(CeltMode m2, int start, int end, int[][] oldEBands, int[][] error, int[] fine_quant, int[] fine_priority, int bits_left, EntropyCoder enc, int C2) {
        for (int prio = 0; prio < 2; ++prio) {
            for (int i2 = start; i2 < end && bits_left >= C2; ++i2) {
                if (fine_quant[i2] >= 8 || fine_priority[i2] != prio) continue;
                int c2 = 0;
                do {
                    int q2 = error[c2][i2] < 0 ? 0 : 1;
                    enc.enc_bits(q2, 1);
                    int offset = Inlines.SHR16(Inlines.SHL16(q2, 10) - 512, fine_quant[i2] + 1);
                    int[] nArray = oldEBands[c2];
                    int n2 = i2;
                    nArray[n2] = nArray[n2] + offset;
                    --bits_left;
                } while (++c2 < C2);
            }
        }
    }

    static void unquant_coarse_energy(CeltMode m2, int start, int end, int[] oldEBands, int intra, EntropyCoder dec, int C2, int LM2) {
        int beta;
        int coef;
        short[] prob_model = CeltTables.e_prob_model[LM2][intra];
        int[] prev = new int[]{0, 0};
        if (intra != 0) {
            coef = 0;
            beta = 4915;
        } else {
            beta = beta_coef[LM2];
            coef = pred_coef[LM2];
        }
        int budget = dec.storage * 8;
        for (int i2 = start; i2 < end; ++i2) {
            int c2 = 0;
            do {
                int qi2;
                Inlines.OpusAssert(c2 < 2);
                int tell = dec.tell();
                if (budget - tell >= 15) {
                    int pi2 = 2 * Inlines.IMIN(i2, 20);
                    qi2 = Laplace.ec_laplace_decode(dec, prob_model[pi2] << 7, prob_model[pi2 + 1] << 6);
                } else if (budget - tell >= 2) {
                    qi2 = dec.dec_icdf(small_energy_icdf, 2);
                    qi2 = qi2 >> 1 ^ -(qi2 & 1);
                } else {
                    qi2 = budget - tell >= 1 ? 0 - dec.dec_bit_logp(1L) : -1;
                }
                int q2 = Inlines.SHL32(qi2, 10);
                oldEBands[i2 + c2 * m2.nbEBands] = Inlines.MAX16(-9216, oldEBands[i2 + c2 * m2.nbEBands]);
                int tmp = Inlines.PSHR32(Inlines.MULT16_16(coef, oldEBands[i2 + c2 * m2.nbEBands]), 8) + prev[c2] + Inlines.SHL32(q2, 7);
                tmp = Inlines.MAX32(-3670016, tmp);
                oldEBands[i2 + c2 * m2.nbEBands] = Inlines.PSHR32(tmp, 7);
                prev[c2] = prev[c2] + Inlines.SHL32(q2, 7) - Inlines.MULT16_16(beta, Inlines.PSHR32(q2, 8));
            } while (++c2 < C2);
        }
    }

    static void unquant_fine_energy(CeltMode m2, int start, int end, int[] oldEBands, int[] fine_quant, EntropyCoder dec, int C2) {
        for (int i2 = start; i2 < end; ++i2) {
            if (fine_quant[i2] <= 0) continue;
            int c2 = 0;
            do {
                int q2 = dec.dec_bits(fine_quant[i2]);
                int offset = Inlines.SUB16(Inlines.SHR32(Inlines.SHL32(q2, 10) + 512, fine_quant[i2]), 512);
                int n2 = i2 + c2 * m2.nbEBands;
                oldEBands[n2] = oldEBands[n2] + offset;
            } while (++c2 < C2);
        }
    }

    static void unquant_energy_finalise(CeltMode m2, int start, int end, int[] oldEBands, int[] fine_quant, int[] fine_priority, int bits_left, EntropyCoder dec, int C2) {
        for (int prio = 0; prio < 2; ++prio) {
            for (int i2 = start; i2 < end && bits_left >= C2; ++i2) {
                if (fine_quant[i2] >= 8 || fine_priority[i2] != prio) continue;
                int c2 = 0;
                do {
                    int q2 = dec.dec_bits(1);
                    int offset = Inlines.SHR16(Inlines.SHL16(q2, 10) - 512, fine_quant[i2] + 1);
                    int n2 = i2 + c2 * m2.nbEBands;
                    oldEBands[n2] = oldEBands[n2] + offset;
                    --bits_left;
                } while (++c2 < C2);
            }
        }
    }

    static void amp2Log2(CeltMode m2, int effEnd, int end, int[][] bandE, int[][] bandLogE, int C2) {
        int c2 = 0;
        do {
            int i2;
            for (i2 = 0; i2 < effEnd; ++i2) {
                bandLogE[c2][i2] = Inlines.celt_log2(Inlines.SHL32(bandE[c2][i2], 2)) - Inlines.SHL16((int)CeltTables.eMeans[i2], 6);
            }
            for (i2 = effEnd; i2 < end; ++i2) {
                bandLogE[c2][i2] = -14336;
            }
        } while (++c2 < C2);
    }

    static void amp2Log2(CeltMode m2, int effEnd, int end, int[] bandE, int[] bandLogE, int bandLogE_ptr, int C2) {
        int c2 = 0;
        do {
            int i2;
            for (i2 = 0; i2 < effEnd; ++i2) {
                bandLogE[bandLogE_ptr + c2 * m2.nbEBands + i2] = Inlines.celt_log2(Inlines.SHL32(bandE[i2 + c2 * m2.nbEBands], 2)) - Inlines.SHL16((int)CeltTables.eMeans[i2], 6);
            }
            for (i2 = effEnd; i2 < end; ++i2) {
                bandLogE[bandLogE_ptr + c2 * m2.nbEBands + i2] = -14336;
            }
        } while (++c2 < C2);
    }
}

