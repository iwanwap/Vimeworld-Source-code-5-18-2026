/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.FFTState;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.KissFFT;
import io.github.jaredmdobson.concentus.MDCTLookup;

class MDCT {
    MDCT() {
    }

    static void clt_mdct_forward(MDCTLookup l2, int[] input, int input_ptr, int[] output, int output_ptr, int[] window, int overlap, int shift, int stride) {
        int i2;
        FFTState st2 = l2.kfft[shift];
        int trig_ptr = 0;
        int scale_shift = st2.scale_shift - 1;
        short scale = st2.scale;
        int N2 = l2.n;
        short[] trig = l2.trig;
        for (i2 = 0; i2 < shift; ++i2) {
            trig_ptr += (N2 >>= 1);
        }
        int N22 = N2 >> 1;
        int N4 = N2 >> 2;
        int[] f2 = new int[N22];
        int[] f22 = new int[N4 * 2];
        int xp1 = input_ptr + (overlap >> 1);
        int xp2 = input_ptr + N22 - 1 + (overlap >> 1);
        int yp2 = 0;
        int wp1 = overlap >> 1;
        int wp2 = (overlap >> 1) - 1;
        for (i2 = 0; i2 < overlap + 3 >> 2; ++i2) {
            f2[yp2++] = Inlines.MULT16_32_Q15(window[wp2], input[xp1 + N22]) + Inlines.MULT16_32_Q15(window[wp1], input[xp2]);
            f2[yp2++] = Inlines.MULT16_32_Q15(window[wp1], input[xp1]) - Inlines.MULT16_32_Q15(window[wp2], input[xp2 - N22]);
            xp1 += 2;
            xp2 -= 2;
            wp1 += 2;
            wp2 -= 2;
        }
        wp1 = 0;
        wp2 = overlap - 1;
        while (i2 < N4 - (overlap + 3 >> 2)) {
            f2[yp2++] = input[xp2];
            f2[yp2++] = input[xp1];
            xp1 += 2;
            xp2 -= 2;
            ++i2;
        }
        while (i2 < N4) {
            f2[yp2++] = Inlines.MULT16_32_Q15(window[wp2], input[xp2]) - Inlines.MULT16_32_Q15(window[wp1], input[xp1 - N22]);
            f2[yp2++] = Inlines.MULT16_32_Q15(window[wp2], input[xp1]) + Inlines.MULT16_32_Q15(window[wp1], input[xp2 + N22]);
            xp1 += 2;
            xp2 -= 2;
            wp1 += 2;
            wp2 -= 2;
            ++i2;
        }
        int yp3 = 0;
        int t2 = trig_ptr;
        for (i2 = 0; i2 < N4; ++i2) {
            short t0 = trig[t2 + i2];
            short t1 = trig[t2 + N4 + i2];
            int re2 = f2[yp3++];
            int im2 = f2[yp3++];
            int yr2 = KissFFT.S_MUL(re2, t0) - KissFFT.S_MUL(im2, t1);
            int yi2 = KissFFT.S_MUL(im2, t0) + KissFFT.S_MUL(re2, t1);
            f22[2 * st2.bitrev[i2]] = Inlines.PSHR32(Inlines.MULT16_32_Q16((int)scale, yr2), scale_shift);
            f22[2 * st2.bitrev[i2] + 1] = Inlines.PSHR32(Inlines.MULT16_32_Q16((int)scale, yi2), scale_shift);
        }
        KissFFT.opus_fft_impl(st2, f22, 0);
        int fp2 = 0;
        int yp1 = output_ptr;
        int yp22 = output_ptr + stride * (N22 - 1);
        int t3 = trig_ptr;
        for (i2 = 0; i2 < N4; ++i2) {
            int yr3 = KissFFT.S_MUL(f22[fp2 + 1], trig[t3 + N4 + i2]) - KissFFT.S_MUL(f22[fp2], trig[t3 + i2]);
            int yi3 = KissFFT.S_MUL(f22[fp2], trig[t3 + N4 + i2]) + KissFFT.S_MUL(f22[fp2 + 1], trig[t3 + i2]);
            output[yp1] = yr3;
            output[yp22] = yi3;
            fp2 += 2;
            yp1 += 2 * stride;
            yp22 -= 2 * stride;
        }
    }

    static void clt_mdct_backward(MDCTLookup l2, int[] input, int input_ptr, int[] output, int output_ptr, int[] window, int overlap, int shift, int stride) {
        int i2;
        int trig = 0;
        int N2 = l2.n;
        for (i2 = 0; i2 < shift; ++i2) {
            trig += (N2 >>= 1);
        }
        int N22 = N2 >> 1;
        int N4 = N2 >> 2;
        int xp2 = input_ptr + stride * (N22 - 1);
        int yp2 = output_ptr + (overlap >> 1);
        short[] bitrev = l2.kfft[shift].bitrev;
        int bitrav_ptr = 0;
        for (i2 = 0; i2 < N4; ++i2) {
            short rev = bitrev[bitrav_ptr++];
            int ypr = yp2 + 2 * rev;
            output[ypr + 1] = KissFFT.S_MUL(input[xp2], l2.trig[trig + i2]) + KissFFT.S_MUL(input[input_ptr], l2.trig[trig + N4 + i2]);
            output[ypr] = KissFFT.S_MUL(input[input_ptr], l2.trig[trig + i2]) - KissFFT.S_MUL(input[xp2], l2.trig[trig + N4 + i2]);
            input_ptr += 2 * stride;
            xp2 -= 2 * stride;
        }
        KissFFT.opus_fft_impl(l2.kfft[shift], output, output_ptr + (overlap >> 1));
        int yp0 = output_ptr + (overlap >> 1);
        int yp1 = output_ptr + (overlap >> 1) + N22 - 2;
        int t2 = trig;
        int tN4m1 = t2 + N4 - 1;
        int tN2m1 = t2 + N22 - 1;
        for (i2 = 0; i2 < N4 + 1 >> 1; ++i2) {
            int re2 = output[yp0 + 1];
            int im2 = output[yp0];
            short t0 = l2.trig[t2 + i2];
            short t1 = l2.trig[t2 + N4 + i2];
            int yr2 = KissFFT.S_MUL(re2, t0) + KissFFT.S_MUL(im2, t1);
            int yi2 = KissFFT.S_MUL(re2, t1) - KissFFT.S_MUL(im2, t0);
            re2 = output[yp1 + 1];
            im2 = output[yp1];
            output[yp0] = yr2;
            output[yp1 + 1] = yi2;
            t0 = l2.trig[tN4m1 - i2];
            t1 = l2.trig[tN2m1 - i2];
            yr2 = KissFFT.S_MUL(re2, t0) + KissFFT.S_MUL(im2, t1);
            yi2 = KissFFT.S_MUL(re2, t1) - KissFFT.S_MUL(im2, t0);
            output[yp1] = yr2;
            output[yp0 + 1] = yi2;
            yp0 += 2;
            yp1 -= 2;
        }
        int xp1 = output_ptr + overlap - 1;
        yp1 = output_ptr;
        int wp1 = 0;
        int wp2 = overlap - 1;
        for (i2 = 0; i2 < overlap / 2; ++i2) {
            int x1 = output[xp1];
            int x2 = output[yp1];
            output[yp1++] = Inlines.MULT16_32_Q15(window[wp2], x2) - Inlines.MULT16_32_Q15(window[wp1], x1);
            output[xp1--] = Inlines.MULT16_32_Q15(window[wp1], x2) + Inlines.MULT16_32_Q15(window[wp2], x1);
            ++wp1;
            --wp2;
        }
    }
}

