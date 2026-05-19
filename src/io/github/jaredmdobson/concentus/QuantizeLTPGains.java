/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueByte;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SilkTables;
import io.github.jaredmdobson.concentus.VQ_WMat_EC;

class QuantizeLTPGains {
    QuantizeLTPGains() {
    }

    static void silk_quant_LTP_gains(short[] B_Q14, byte[] cbk_index, BoxedValueByte periodicity_index, BoxedValueInt sum_log_gain_Q7, int[] W_Q18, int mu_Q9, int lowComplexity, int nb_subfr) {
        int j2;
        byte[][] cbk_ptr_Q7;
        int k2;
        byte[] temp_idx = new byte[4];
        int min_rate_dist_Q14 = Integer.MAX_VALUE;
        int best_sum_log_gain_Q7 = 0;
        for (k2 = 0; k2 < 3; ++k2) {
            int gain_safety = 51;
            short[] cl_ptr_Q5 = SilkTables.silk_LTP_gain_BITS_Q5_ptrs[k2];
            cbk_ptr_Q7 = SilkTables.silk_LTP_vq_ptrs_Q7[k2];
            short[] cbk_gain_ptr_Q7 = SilkTables.silk_LTP_vq_gain_ptrs_Q7[k2];
            byte cbk_size = SilkTables.silk_LTP_vq_sizes[k2];
            int W_Q18_ptr = 0;
            int b_Q14_ptr = 0;
            int rate_dist_Q14 = 0;
            int sum_log_gain_tmp_Q7 = sum_log_gain_Q7.Val;
            for (j2 = 0; j2 < nb_subfr; ++j2) {
                int max_gain_Q7 = Inlines.silk_log2lin(5333 - sum_log_gain_tmp_Q7 + 896) - gain_safety;
                BoxedValueByte temp_idx_box = new BoxedValueByte(temp_idx[j2]);
                BoxedValueInt rate_dist_Q14_subfr_box = new BoxedValueInt(0);
                BoxedValueInt gain_Q7_box = new BoxedValueInt(0);
                VQ_WMat_EC.silk_VQ_WMat_EC(temp_idx_box, rate_dist_Q14_subfr_box, gain_Q7_box, B_Q14, b_Q14_ptr, W_Q18, W_Q18_ptr, cbk_ptr_Q7, cbk_gain_ptr_Q7, cl_ptr_Q5, mu_Q9, max_gain_Q7, cbk_size);
                int rate_dist_Q14_subfr = rate_dist_Q14_subfr_box.Val;
                int gain_Q7 = gain_Q7_box.Val;
                temp_idx[j2] = temp_idx_box.Val;
                rate_dist_Q14 = Inlines.silk_ADD_POS_SAT32(rate_dist_Q14, rate_dist_Q14_subfr);
                sum_log_gain_tmp_Q7 = Inlines.silk_max(0, sum_log_gain_tmp_Q7 + Inlines.silk_lin2log(gain_safety + gain_Q7) - 896);
                b_Q14_ptr += 5;
                W_Q18_ptr += 25;
            }
            if ((rate_dist_Q14 = Inlines.silk_min(0x7FFFFFFE, rate_dist_Q14)) < min_rate_dist_Q14) {
                min_rate_dist_Q14 = rate_dist_Q14;
                periodicity_index.Val = (byte)k2;
                System.arraycopy(temp_idx, 0, cbk_index, 0, nb_subfr);
                best_sum_log_gain_Q7 = sum_log_gain_tmp_Q7;
            }
            if (lowComplexity != 0 && rate_dist_Q14 < 12304) break;
        }
        cbk_ptr_Q7 = SilkTables.silk_LTP_vq_ptrs_Q7[periodicity_index.Val];
        for (j2 = 0; j2 < nb_subfr; ++j2) {
            for (k2 = 0; k2 < 5; ++k2) {
                B_Q14[j2 * 5 + k2] = (short)Inlines.silk_LSHIFT(cbk_ptr_Q7[cbk_index[j2]][k2], 7);
            }
        }
        sum_log_gain_Q7.Val = best_sum_log_gain_Q7;
    }
}

