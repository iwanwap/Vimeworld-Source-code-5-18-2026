/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueByte;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.BoxedValueShort;
import io.github.jaredmdobson.concentus.CeltPitchXCorr;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Resampler;
import io.github.jaredmdobson.concentus.SilkTables;
import io.github.jaredmdobson.concentus.Sort;
import io.github.jaredmdobson.concentus.SumSqrShift;

class PitchAnalysisCore {
    private static final int SCRATCH_SIZE = 22;
    private static final int SF_LENGTH_4KHZ = 20;
    private static final int SF_LENGTH_8KHZ = 40;
    private static final int MIN_LAG_4KHZ = 8;
    private static final int MIN_LAG_8KHZ = 16;
    private static final int MAX_LAG_4KHZ = 72;
    private static final int MAX_LAG_8KHZ = 143;
    private static final int CSTRIDE_4KHZ = 65;
    private static final int CSTRIDE_8KHZ = 132;
    private static final int D_COMP_MIN = 13;
    private static final int D_COMP_MAX = 147;
    private static final int D_COMP_STRIDE = 134;

    PitchAnalysisCore() {
    }

    static int silk_pitch_analysis_core(short[] frame, int[] pitch_out, BoxedValueShort lagIndex, BoxedValueByte contourIndex, BoxedValueInt LTPCorr_Q15, int prevLag, int search_thres1_Q16, int search_thres2_Q13, int Fs_kHz, int complexity, int nb_subfr) {
        int CCmax_new;
        int nb_cbk_search;
        byte[][] Lag_CB_ptr;
        int prevLag_log2_Q7;
        int j2;
        int energy_target;
        int length_d_srch;
        int sum;
        int d2;
        int cross_corr;
        int basis_ptr;
        short[] basis;
        int k2;
        int i2;
        int[] filt_state = new int[6];
        int[] d_srch = new int[24];
        int[] CC2 = new int[11];
        Inlines.OpusAssert(Fs_kHz == 8 || Fs_kHz == 12 || Fs_kHz == 16);
        Inlines.OpusAssert(complexity >= 0);
        Inlines.OpusAssert(complexity <= 2);
        Inlines.OpusAssert(search_thres1_Q16 >= 0 && search_thres1_Q16 <= 65536);
        Inlines.OpusAssert(search_thres2_Q13 >= 0 && search_thres2_Q13 <= 8192);
        int frame_length = (20 + nb_subfr * 5) * Fs_kHz;
        int frame_length_4kHz = (20 + nb_subfr * 5) * 4;
        int frame_length_8kHz = (20 + nb_subfr * 5) * 8;
        int sf_length = 5 * Fs_kHz;
        int min_lag = 2 * Fs_kHz;
        int max_lag = 18 * Fs_kHz - 1;
        short[] frame_8kHz = new short[frame_length_8kHz];
        if (Fs_kHz == 16) {
            Arrays.MemSet(filt_state, 0, 2);
            Resampler.silk_resampler_down2(filt_state, frame_8kHz, frame, frame_length);
        } else if (Fs_kHz == 12) {
            Arrays.MemSet(filt_state, 0, 6);
            Resampler.silk_resampler_down2_3(filt_state, frame_8kHz, frame, frame_length);
        } else {
            Inlines.OpusAssert(Fs_kHz == 8);
            System.arraycopy(frame, 0, frame_8kHz, 0, frame_length_8kHz);
        }
        Arrays.MemSet(filt_state, 0, 2);
        short[] frame_4kHz = new short[frame_length_4kHz];
        Resampler.silk_resampler_down2(filt_state, frame_4kHz, frame_8kHz, frame_length_8kHz);
        for (i2 = frame_length_4kHz - 1; i2 > 0; --i2) {
            frame_4kHz[i2] = Inlines.silk_ADD_SAT16(frame_4kHz[i2], frame_4kHz[i2 - 1]);
        }
        BoxedValueInt boxed_energy = new BoxedValueInt(0);
        BoxedValueInt boxed_shift = new BoxedValueInt(0);
        SumSqrShift.silk_sum_sqr_shift(boxed_energy, boxed_shift, frame_4kHz, frame_length_4kHz);
        int energy = boxed_energy.Val;
        int shift = boxed_shift.Val;
        if (shift > 0) {
            shift = Inlines.silk_RSHIFT(shift, 1);
            for (i2 = 0; i2 < frame_length_4kHz; ++i2) {
                frame_4kHz[i2] = Inlines.silk_RSHIFT16(frame_4kHz[i2], shift);
            }
        }
        short[] C2 = new short[nb_subfr * 132];
        int[] xcorr32 = new int[65];
        Arrays.MemSet(C2, (short)0, (nb_subfr >> 1) * 65);
        short[] target = frame_4kHz;
        int target_ptr = Inlines.silk_LSHIFT(20, 2);
        for (k2 = 0; k2 < nb_subfr >> 1; ++k2) {
            basis = target;
            basis_ptr = target_ptr - 8;
            CeltPitchXCorr.pitch_xcorr(target, target_ptr, target, target_ptr - 72, xcorr32, 40, 65);
            cross_corr = xcorr32[64];
            int normalizer = Inlines.silk_inner_prod_self(target, target_ptr, 40);
            normalizer = Inlines.silk_ADD32(normalizer, Inlines.silk_inner_prod_self(basis, basis_ptr, 40));
            normalizer = Inlines.silk_ADD32(normalizer, Inlines.silk_SMULBB(40, 4000));
            Inlines.MatrixSet(C2, k2, 0, 65, (short)Inlines.silk_DIV32_varQ(cross_corr, normalizer, 14));
            for (d2 = 9; d2 <= 72; ++d2) {
                cross_corr = xcorr32[72 - d2];
                normalizer = Inlines.silk_ADD32(normalizer, Inlines.silk_SMULBB(basis[--basis_ptr], basis[basis_ptr]) - Inlines.silk_SMULBB(basis[basis_ptr + 40], basis[basis_ptr + 40]));
                Inlines.MatrixSet(C2, k2, d2 - 8, 65, (short)Inlines.silk_DIV32_varQ(cross_corr, normalizer, 14));
            }
            target_ptr += 40;
        }
        if (nb_subfr == 4) {
            for (i2 = 72; i2 >= 8; --i2) {
                sum = Inlines.MatrixGet(C2, 0, i2 - 8, 65) + Inlines.MatrixGet(C2, 1, i2 - 8, 65);
                sum = Inlines.silk_SMLAWB(sum, sum, Inlines.silk_LSHIFT(-i2, 4));
                C2[i2 - 8] = (short)sum;
            }
        } else {
            for (i2 = 72; i2 >= 8; --i2) {
                sum = Inlines.silk_LSHIFT(C2[i2 - 8], 1);
                sum = Inlines.silk_SMLAWB(sum, sum, Inlines.silk_LSHIFT(-i2, 4));
                C2[i2 - 8] = (short)sum;
            }
        }
        Inlines.OpusAssert(3 * (length_d_srch = Inlines.silk_ADD_LSHIFT32(4, complexity, 1)) <= 24);
        Sort.silk_insertion_sort_decreasing_int16(C2, d_srch, 65, length_d_srch);
        short Cmax = C2[0];
        if (Cmax < 3277) {
            Arrays.MemSet(pitch_out, 0, nb_subfr);
            LTPCorr_Q15.Val = 0;
            lagIndex.Val = 0;
            contourIndex.Val = 0;
            return 1;
        }
        int threshold = Inlines.silk_SMULWB(search_thres1_Q16, Cmax);
        for (i2 = 0; i2 < length_d_srch; ++i2) {
            if (C2[i2] <= threshold) {
                length_d_srch = i2;
                break;
            }
            d_srch[i2] = Inlines.silk_LSHIFT(d_srch[i2] + 8, 1);
        }
        Inlines.OpusAssert(length_d_srch > 0);
        short[] d_comp = new short[134];
        for (i2 = 13; i2 < 147; ++i2) {
            d_comp[i2 - 13] = 0;
        }
        for (i2 = 0; i2 < length_d_srch; ++i2) {
            d_comp[d_srch[i2] - 13] = 1;
        }
        for (i2 = 146; i2 >= 16; --i2) {
            int n2 = i2 - 13;
            d_comp[n2] = (short)(d_comp[n2] + (short)(d_comp[i2 - 1 - 13] + d_comp[i2 - 2 - 13]));
        }
        length_d_srch = 0;
        for (i2 = 16; i2 < 144; ++i2) {
            if (d_comp[i2 + 1 - 13] <= 0) continue;
            d_srch[length_d_srch] = i2;
            ++length_d_srch;
        }
        for (i2 = 146; i2 >= 16; --i2) {
            int n3 = i2 - 13;
            d_comp[n3] = (short)(d_comp[n3] + (short)(d_comp[i2 - 1 - 13] + d_comp[i2 - 2 - 13] + d_comp[i2 - 3 - 13]));
        }
        int length_d_comp = 0;
        for (i2 = 16; i2 < 147; ++i2) {
            if (d_comp[i2 - 13] <= 0) continue;
            d_comp[length_d_comp] = (short)(i2 - 2);
            ++length_d_comp;
        }
        boxed_energy.Val = 0;
        boxed_shift.Val = 0;
        SumSqrShift.silk_sum_sqr_shift(boxed_energy, boxed_shift, frame_8kHz, frame_length_8kHz);
        energy = boxed_energy.Val;
        shift = boxed_shift.Val;
        if (shift > 0) {
            shift = Inlines.silk_RSHIFT(shift, 1);
            for (i2 = 0; i2 < frame_length_8kHz; ++i2) {
                frame_8kHz[i2] = Inlines.silk_RSHIFT16(frame_8kHz[i2], shift);
            }
        }
        Arrays.MemSet(C2, (short)0, nb_subfr * 132);
        target = frame_8kHz;
        target_ptr = 160;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            energy_target = Inlines.silk_ADD32(Inlines.silk_inner_prod(target, target_ptr, target, target_ptr, 40), 1);
            for (j2 = 0; j2 < length_d_comp; ++j2) {
                basis = target;
                d2 = d_comp[j2];
                basis_ptr = target_ptr - d2;
                cross_corr = Inlines.silk_inner_prod(target, target_ptr, basis, basis_ptr, 40);
                if (cross_corr > 0) {
                    int energy_basis = Inlines.silk_inner_prod_self(basis, basis_ptr, 40);
                    Inlines.MatrixSet(C2, k2, d2 - 14, 132, (short)Inlines.silk_DIV32_varQ(cross_corr, Inlines.silk_ADD32(energy_target, energy_basis), 14));
                    continue;
                }
                Inlines.MatrixSet(C2, k2, d2 - 14, 132, (short)0);
            }
            target_ptr += 40;
        }
        int CCmax = Integer.MIN_VALUE;
        int CCmax_b = Integer.MIN_VALUE;
        int CBimax = 0;
        int lag = -1;
        if (prevLag > 0) {
            if (Fs_kHz == 12) {
                prevLag = Inlines.silk_DIV32_16(Inlines.silk_LSHIFT(prevLag, 1), 3);
            } else if (Fs_kHz == 16) {
                prevLag = Inlines.silk_RSHIFT(prevLag, 1);
            }
            prevLag_log2_Q7 = Inlines.silk_lin2log(prevLag);
        } else {
            prevLag_log2_Q7 = 0;
        }
        Inlines.OpusAssert(search_thres2_Q13 == Inlines.silk_SAT16(search_thres2_Q13));
        if (nb_subfr == 4) {
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage2;
            nb_cbk_search = Fs_kHz == 8 && complexity > 0 ? 11 : 3;
        } else {
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage2_10_ms;
            nb_cbk_search = 3;
        }
        for (k2 = 0; k2 < length_d_srch; ++k2) {
            d2 = d_srch[k2];
            for (j2 = 0; j2 < nb_cbk_search; ++j2) {
                CC2[j2] = 0;
                for (i2 = 0; i2 < nb_subfr; ++i2) {
                    int d_subfr = d2 + Lag_CB_ptr[i2][j2];
                    CC2[j2] = CC2[j2] + Inlines.MatrixGet(C2, i2, d_subfr - 14, 132);
                }
            }
            CCmax_new = Integer.MIN_VALUE;
            int CBimax_new = 0;
            for (i2 = 0; i2 < nb_cbk_search; ++i2) {
                if (CC2[i2] <= CCmax_new) continue;
                CCmax_new = CC2[i2];
                CBimax_new = i2;
            }
            int lag_log2_Q7 = Inlines.silk_lin2log(d2);
            Inlines.OpusAssert(lag_log2_Q7 == Inlines.silk_SAT16(lag_log2_Q7));
            Inlines.OpusAssert(nb_subfr * 1638 == Inlines.silk_SAT16(nb_subfr * 1638));
            int CCmax_new_b = CCmax_new - Inlines.silk_RSHIFT(Inlines.silk_SMULBB(nb_subfr * 1638, lag_log2_Q7), 7);
            Inlines.OpusAssert(nb_subfr * 1638 == Inlines.silk_SAT16(nb_subfr * 1638));
            if (prevLag > 0) {
                int delta_lag_log2_sqr_Q7 = lag_log2_Q7 - prevLag_log2_Q7;
                Inlines.OpusAssert(delta_lag_log2_sqr_Q7 == Inlines.silk_SAT16(delta_lag_log2_sqr_Q7));
                delta_lag_log2_sqr_Q7 = Inlines.silk_RSHIFT(Inlines.silk_SMULBB(delta_lag_log2_sqr_Q7, delta_lag_log2_sqr_Q7), 7);
                int prev_lag_bias_Q13 = Inlines.silk_RSHIFT(Inlines.silk_SMULBB(nb_subfr * 1638, LTPCorr_Q15.Val), 15);
                prev_lag_bias_Q13 = Inlines.silk_DIV32(Inlines.silk_MUL(prev_lag_bias_Q13, delta_lag_log2_sqr_Q7), delta_lag_log2_sqr_Q7 + 64);
                CCmax_new_b -= prev_lag_bias_Q13;
            }
            if (CCmax_new_b <= CCmax_b || CCmax_new <= Inlines.silk_SMULBB(nb_subfr, search_thres2_Q13) || SilkTables.silk_CB_lags_stage2[0][CBimax_new] > 16) continue;
            CCmax_b = CCmax_new_b;
            CCmax = CCmax_new;
            lag = d2;
            CBimax = CBimax_new;
        }
        if (lag == -1) {
            Arrays.MemSet(pitch_out, 0, nb_subfr);
            LTPCorr_Q15.Val = 0;
            lagIndex.Val = 0;
            contourIndex.Val = 0;
            return 1;
        }
        LTPCorr_Q15.Val = Inlines.silk_LSHIFT(Inlines.silk_DIV32_16(CCmax, nb_subfr), 2);
        Inlines.OpusAssert(LTPCorr_Q15.Val >= 0);
        if (Fs_kHz > 8) {
            short[] input_frame_ptr;
            boxed_energy.Val = 0;
            boxed_shift.Val = 0;
            SumSqrShift.silk_sum_sqr_shift(boxed_energy, boxed_shift, frame, frame_length);
            energy = boxed_energy.Val;
            shift = boxed_shift.Val;
            if (shift > 0) {
                short[] scratch_mem = new short[frame_length];
                shift = Inlines.silk_RSHIFT(shift, 1);
                for (i2 = 0; i2 < frame_length; ++i2) {
                    scratch_mem[i2] = Inlines.silk_RSHIFT16(frame[i2], shift);
                }
                input_frame_ptr = scratch_mem;
            } else {
                input_frame_ptr = frame;
            }
            int CBimax_old = CBimax;
            Inlines.OpusAssert(lag == Inlines.silk_SAT16(lag));
            lag = Fs_kHz == 12 ? Inlines.silk_RSHIFT(Inlines.silk_SMULBB(lag, 3), 1) : (Fs_kHz == 16 ? Inlines.silk_LSHIFT(lag, 1) : Inlines.silk_SMULBB(lag, 3));
            lag = Inlines.silk_LIMIT_int(lag, min_lag, max_lag);
            int start_lag = Inlines.silk_max_int(lag - 2, min_lag);
            int end_lag = Inlines.silk_min_int(lag + 2, max_lag);
            int lag_new = lag;
            CBimax = 0;
            CCmax = Integer.MIN_VALUE;
            for (k2 = 0; k2 < nb_subfr; ++k2) {
                pitch_out[k2] = lag + 2 * SilkTables.silk_CB_lags_stage2[k2][CBimax_old];
            }
            if (nb_subfr == 4) {
                nb_cbk_search = SilkTables.silk_nb_cbk_searchs_stage3[complexity];
                Lag_CB_ptr = SilkTables.silk_CB_lags_stage3;
            } else {
                nb_cbk_search = 12;
                Lag_CB_ptr = SilkTables.silk_CB_lags_stage3_10_ms;
            }
            silk_pe_stage3_vals[] energies_st3 = new silk_pe_stage3_vals[nb_subfr * nb_cbk_search];
            silk_pe_stage3_vals[] cross_corr_st3 = new silk_pe_stage3_vals[nb_subfr * nb_cbk_search];
            for (int c2 = 0; c2 < nb_subfr * nb_cbk_search; ++c2) {
                energies_st3[c2] = new silk_pe_stage3_vals();
                cross_corr_st3[c2] = new silk_pe_stage3_vals();
            }
            PitchAnalysisCore.silk_P_Ana_calc_corr_st3(cross_corr_st3, input_frame_ptr, start_lag, sf_length, nb_subfr, complexity);
            PitchAnalysisCore.silk_P_Ana_calc_energy_st3(energies_st3, input_frame_ptr, start_lag, sf_length, nb_subfr, complexity);
            int lag_counter = 0;
            Inlines.OpusAssert(lag == Inlines.silk_SAT16(lag));
            int contour_bias_Q15 = Inlines.silk_DIV32_16(1638, lag);
            target = input_frame_ptr;
            target_ptr = 20 * Fs_kHz;
            energy_target = Inlines.silk_ADD32(Inlines.silk_inner_prod_self(target, target_ptr, nb_subfr * sf_length), 1);
            for (d2 = start_lag; d2 <= end_lag; ++d2) {
                for (j2 = 0; j2 < nb_cbk_search; ++j2) {
                    cross_corr = 0;
                    energy = energy_target;
                    for (k2 = 0; k2 < nb_subfr; ++k2) {
                        cross_corr = Inlines.silk_ADD32(cross_corr, Inlines.MatrixGet((silk_pe_stage3_vals[])cross_corr_st3, (int)k2, (int)j2, (int)nb_cbk_search).Values[lag_counter]);
                        Inlines.OpusAssert((energy = Inlines.silk_ADD32(energy, Inlines.MatrixGet((silk_pe_stage3_vals[])energies_st3, (int)k2, (int)j2, (int)nb_cbk_search).Values[lag_counter])) >= 0);
                    }
                    if (cross_corr > 0) {
                        CCmax_new = Inlines.silk_DIV32_varQ(cross_corr, energy, 14);
                        int diff = Short.MAX_VALUE - Inlines.silk_MUL(contour_bias_Q15, j2);
                        Inlines.OpusAssert(diff == Inlines.silk_SAT16(diff));
                        CCmax_new = Inlines.silk_SMULWB(CCmax_new, diff);
                    } else {
                        CCmax_new = 0;
                    }
                    if (CCmax_new <= CCmax || d2 + SilkTables.silk_CB_lags_stage3[0][j2] > max_lag) continue;
                    CCmax = CCmax_new;
                    lag_new = d2;
                    CBimax = j2;
                }
                ++lag_counter;
            }
            for (k2 = 0; k2 < nb_subfr; ++k2) {
                pitch_out[k2] = lag_new + Lag_CB_ptr[k2][CBimax];
                pitch_out[k2] = Inlines.silk_LIMIT(pitch_out[k2], min_lag, 18 * Fs_kHz);
            }
            lagIndex.Val = (short)(lag_new - min_lag);
            contourIndex.Val = (byte)CBimax;
        } else {
            for (k2 = 0; k2 < nb_subfr; ++k2) {
                pitch_out[k2] = lag + Lag_CB_ptr[k2][CBimax];
                pitch_out[k2] = Inlines.silk_LIMIT(pitch_out[k2], 16, 144);
            }
            lagIndex.Val = (short)(lag - 16);
            contourIndex.Val = (byte)CBimax;
        }
        Inlines.OpusAssert(lagIndex.Val >= 0);
        return 0;
    }

    private static void silk_P_Ana_calc_corr_st3(silk_pe_stage3_vals[] cross_corr_st3, short[] frame, int start_lag, int sf_length, int nb_subfr, int complexity) {
        int nb_cbk_search;
        byte[][] Lag_CB_ptr;
        byte[][] Lag_range_ptr;
        Inlines.OpusAssert(complexity >= 0);
        Inlines.OpusAssert(complexity <= 2);
        if (nb_subfr == 4) {
            Lag_range_ptr = SilkTables.silk_Lag_range_stage3[complexity];
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage3;
            nb_cbk_search = SilkTables.silk_nb_cbk_searchs_stage3[complexity];
        } else {
            Inlines.OpusAssert(nb_subfr == 2);
            Lag_range_ptr = SilkTables.silk_Lag_range_stage3_10_ms;
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage3_10_ms;
            nb_cbk_search = 12;
        }
        int[] scratch_mem = new int[22];
        int[] xcorr32 = new int[22];
        int target_ptr = Inlines.silk_LSHIFT(sf_length, 2);
        for (int k2 = 0; k2 < nb_subfr; ++k2) {
            int j2;
            int lag_counter = 0;
            byte lag_high = Lag_range_ptr[k2][1];
            int lag_low = Lag_range_ptr[k2][0];
            Inlines.OpusAssert(lag_high - lag_low + 1 <= 22);
            CeltPitchXCorr.pitch_xcorr(frame, target_ptr, frame, target_ptr - start_lag - lag_high, xcorr32, sf_length, lag_high - lag_low + 1);
            for (j2 = lag_low; j2 <= lag_high; ++j2) {
                Inlines.OpusAssert(lag_counter < 22);
                scratch_mem[lag_counter] = xcorr32[lag_high - j2];
                ++lag_counter;
            }
            byte delta = Lag_range_ptr[k2][0];
            for (int i2 = 0; i2 < nb_cbk_search; ++i2) {
                int idx = Lag_CB_ptr[k2][i2] - delta;
                for (j2 = 0; j2 < 5; ++j2) {
                    Inlines.OpusAssert(idx + j2 < 22);
                    Inlines.OpusAssert(idx + j2 < lag_counter);
                    Inlines.MatrixGet((silk_pe_stage3_vals[])cross_corr_st3, (int)k2, (int)i2, (int)nb_cbk_search).Values[j2] = scratch_mem[idx + j2];
                }
            }
            target_ptr += sf_length;
        }
    }

    static void silk_P_Ana_calc_energy_st3(silk_pe_stage3_vals[] energies_st3, short[] frame, int start_lag, int sf_length, int nb_subfr, int complexity) {
        int nb_cbk_search;
        byte[][] Lag_CB_ptr;
        byte[][] Lag_range_ptr;
        Inlines.OpusAssert(complexity >= 0);
        Inlines.OpusAssert(complexity <= 2);
        if (nb_subfr == 4) {
            Lag_range_ptr = SilkTables.silk_Lag_range_stage3[complexity];
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage3;
            nb_cbk_search = SilkTables.silk_nb_cbk_searchs_stage3[complexity];
        } else {
            Inlines.OpusAssert(nb_subfr == 2);
            Lag_range_ptr = SilkTables.silk_Lag_range_stage3_10_ms;
            Lag_CB_ptr = SilkTables.silk_CB_lags_stage3_10_ms;
            nb_cbk_search = 12;
        }
        int[] scratch_mem = new int[22];
        int target_ptr = Inlines.silk_LSHIFT(sf_length, 2);
        for (int k2 = 0; k2 < nb_subfr; ++k2) {
            int i2;
            int lag_counter = 0;
            int basis_ptr = target_ptr - (start_lag + Lag_range_ptr[k2][0]);
            int energy = Inlines.silk_inner_prod_self(frame, basis_ptr, sf_length);
            Inlines.OpusAssert(energy >= 0);
            scratch_mem[lag_counter] = energy;
            ++lag_counter;
            int lag_diff = Lag_range_ptr[k2][1] - Lag_range_ptr[k2][0] + 1;
            for (i2 = 1; i2 < lag_diff; ++i2) {
                Inlines.OpusAssert((energy -= Inlines.silk_SMULBB(frame[basis_ptr + sf_length - i2], frame[basis_ptr + sf_length - i2])) >= 0);
                energy = Inlines.silk_ADD_SAT32(energy, Inlines.silk_SMULBB(frame[basis_ptr - i2], frame[basis_ptr - i2]));
                Inlines.OpusAssert(energy >= 0);
                Inlines.OpusAssert(lag_counter < 22);
                scratch_mem[lag_counter] = energy;
                ++lag_counter;
            }
            byte delta = Lag_range_ptr[k2][0];
            for (i2 = 0; i2 < nb_cbk_search; ++i2) {
                int idx = Lag_CB_ptr[k2][i2] - delta;
                for (int j2 = 0; j2 < 5; ++j2) {
                    Inlines.OpusAssert(idx + j2 < 22);
                    Inlines.OpusAssert(idx + j2 < lag_counter);
                    Inlines.MatrixGet((silk_pe_stage3_vals[])energies_st3, (int)k2, (int)i2, (int)nb_cbk_search).Values[j2] = scratch_mem[idx + j2];
                    Inlines.OpusAssert(Inlines.MatrixGet((silk_pe_stage3_vals[])energies_st3, (int)k2, (int)i2, (int)nb_cbk_search).Values[j2] >= 0);
                }
            }
            target_ptr += sf_length;
        }
    }

    static class silk_pe_stage3_vals {
        public final int[] Values = new int[5];

        silk_pe_stage3_vals() {
        }
    }
}

