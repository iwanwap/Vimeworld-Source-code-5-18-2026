/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.PitchAnalysisCore;

class Inlines {
    private static short[] sqrt_C = new short[]{23175, 11561, -3011, 1699, -664};
    private static short log2_C0 = (short)-6793;

    Inlines() {
    }

    static void OpusAssert(boolean condition) {
        if (!condition) {
            throw new AssertionError();
        }
    }

    static void OpusAssert(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError((Object)message);
        }
    }

    static long CapToUInt32(long val) {
        return 0xFFFFFFFFL & (long)((int)val);
    }

    static long CapToUInt32(int val) {
        return val;
    }

    static int MULT16_16SU(int a2, int b2) {
        return (short)a2 * (b2 & 0xFFFF);
    }

    static int MULT16_32_Q16(short a2, int b2) {
        return Inlines.ADD32(Inlines.MULT16_16((int)a2, Inlines.SHR(b2, 16)), Inlines.SHR(Inlines.MULT16_16SU(a2, b2 & 0xFFFF), 16));
    }

    static int MULT16_32_Q16(int a2, int b2) {
        return Inlines.ADD32(Inlines.MULT16_16(a2, Inlines.SHR(b2, 16)), Inlines.SHR(Inlines.MULT16_16SU(a2, b2 & 0xFFFF), 16));
    }

    static int MULT16_32_P16(short a2, int b2) {
        return Inlines.ADD32(Inlines.MULT16_16((int)a2, Inlines.SHR(b2, 16)), Inlines.PSHR(Inlines.MULT16_16SU(a2, b2 & 0xFFFF), 16));
    }

    static int MULT16_32_P16(int a2, int b2) {
        return Inlines.ADD32(Inlines.MULT16_16(a2, Inlines.SHR(b2, 16)), Inlines.PSHR(Inlines.MULT16_16SU(a2, b2 & 0xFFFF), 16));
    }

    static int MULT16_32_Q15(short a2, int b2) {
        return (a2 * (b2 >> 16) << 1) + (a2 * (b2 & 0xFFFF) >> 15);
    }

    static int MULT16_32_Q15(int a2, int b2) {
        return (a2 * (b2 >> 16) << 1) + (a2 * (b2 & 0xFFFF) >> 15);
    }

    static int MULT32_32_Q31(int a2, int b2) {
        return Inlines.ADD32(Inlines.ADD32(Inlines.SHL(Inlines.MULT16_16(Inlines.SHR(a2, 16), Inlines.SHR(b2, 16)), 1), Inlines.SHR(Inlines.MULT16_16SU(Inlines.SHR(a2, 16), b2 & 0xFFFF), 15)), Inlines.SHR(Inlines.MULT16_16SU(Inlines.SHR(b2, 16), a2 & 0xFFFF), 15));
    }

    static short QCONST16(float x2, int bits) {
        return (short)(0.5 + (double)(x2 * (float)(1 << bits)));
    }

    static int QCONST32(float x2, int bits) {
        return (int)(0.5 + (double)(x2 * (float)(1 << bits)));
    }

    static short NEG16(short x2) {
        return (short)(0 - x2);
    }

    static int NEG16(int x2) {
        return 0 - x2;
    }

    static int NEG32(int x2) {
        return 0 - x2;
    }

    static short EXTRACT16(int x2) {
        return (short)x2;
    }

    static int EXTEND32(short x2) {
        return x2;
    }

    static int EXTEND32(int x2) {
        return x2;
    }

    static short SHR16(short a2, int shift) {
        return (short)(a2 >> shift);
    }

    static int SHR16(int a2, int shift) {
        return a2 >> shift;
    }

    static short SHL16(short a2, int shift) {
        return (short)((a2 & 0xFFFF) << shift);
    }

    static int SHL16(int a2, int shift) {
        return (int)(0xFFFFFFFFFFFFFFFFL & (long)a2 << shift);
    }

    static int SHR32(int a2, int shift) {
        return a2 >> shift;
    }

    static int SHL32(int a2, int shift) {
        return (int)(0xFFFFFFFFFFFFFFFFL & (long)a2 << shift);
    }

    static int PSHR32(int a2, int shift) {
        return Inlines.SHR32(a2 + (Inlines.EXTEND32(1) << shift >> 1), shift);
    }

    static short PSHR16(short a2, int shift) {
        return Inlines.SHR16((short)(a2 + (1 << shift >> 1)), shift);
    }

    static int PSHR16(int a2, int shift) {
        return Inlines.SHR32(a2 + (1 << shift >> 1), shift);
    }

    static int VSHR32(int a2, int shift) {
        return shift > 0 ? Inlines.SHR32(a2, shift) : Inlines.SHL32(a2, -shift);
    }

    private static int SHR(int a2, int shift) {
        return a2 >> shift;
    }

    private static int SHL(int a2, int shift) {
        return Inlines.SHL32(a2, shift);
    }

    private static int SHR(short a2, int shift) {
        return a2 >> shift;
    }

    private static int SHL(short a2, int shift) {
        return Inlines.SHL32(a2, shift);
    }

    private static int PSHR(int a2, int shift) {
        return Inlines.SHR(a2 + (Inlines.EXTEND32(1) << shift >> 1), shift);
    }

    static int SATURATE(int x2, int a2) {
        return x2 > a2 ? a2 : (x2 < -a2 ? -a2 : x2);
    }

    static short SATURATE16(int x2) {
        return Inlines.EXTRACT16(x2 > Short.MAX_VALUE ? Short.MAX_VALUE : (x2 < Short.MIN_VALUE ? Short.MIN_VALUE : x2));
    }

    static short ROUND16(short x2, short a2) {
        return Inlines.EXTRACT16(Inlines.PSHR32(x2, a2));
    }

    static int ROUND16(int x2, int a2) {
        return Inlines.PSHR32(x2, a2);
    }

    static int PDIV32(int a2, int b2) {
        return a2 / b2;
    }

    static short HALF16(short x2) {
        return Inlines.SHR16(x2, 1);
    }

    static int HALF16(int x2) {
        return Inlines.SHR32(x2, 1);
    }

    static int HALF32(int x2) {
        return Inlines.SHR32(x2, 1);
    }

    static short ADD16(short a2, short b2) {
        return (short)(a2 + b2);
    }

    static int ADD16(int a2, int b2) {
        return a2 + b2;
    }

    static short SUB16(short a2, short b2) {
        return (short)(a2 - b2);
    }

    static int SUB16(int a2, int b2) {
        return a2 - b2;
    }

    static int ADD32(int a2, int b2) {
        return a2 + b2;
    }

    static int SUB32(int a2, int b2) {
        return a2 - b2;
    }

    static short MULT16_16_16(short a2, short b2) {
        return (short)(a2 * b2);
    }

    static int MULT16_16_16(int a2, int b2) {
        return a2 * b2;
    }

    static int MULT16_16(int a2, int b2) {
        return a2 * b2;
    }

    static int MULT16_16(short a2, short b2) {
        return a2 * b2;
    }

    static int MAC16_16(short c2, short a2, short b2) {
        return c2 + a2 * b2;
    }

    static int MAC16_16(int c2, short a2, short b2) {
        return c2 + a2 * b2;
    }

    static int MAC16_16(int c2, int a2, int b2) {
        return c2 + a2 * b2;
    }

    static int MAC16_32_Q15(int c2, short a2, short b2) {
        return Inlines.ADD32(c2, Inlines.ADD32(Inlines.MULT16_16((int)a2, Inlines.SHR(b2, 15)), Inlines.SHR(Inlines.MULT16_16((int)a2, b2 & Short.MAX_VALUE), 15)));
    }

    static int MAC16_32_Q15(int c2, int a2, int b2) {
        return Inlines.ADD32(c2, Inlines.ADD32(Inlines.MULT16_16(a2, Inlines.SHR(b2, 15)), Inlines.SHR(Inlines.MULT16_16(a2, b2 & Short.MAX_VALUE), 15)));
    }

    static int MAC16_32_Q16(int c2, short a2, short b2) {
        return Inlines.ADD32(c2, Inlines.ADD32(Inlines.MULT16_16((int)a2, Inlines.SHR(b2, 16)), Inlines.SHR(Inlines.MULT16_16SU(a2, b2 & 0xFFFF), 16)));
    }

    static int MAC16_32_Q16(int c2, int a2, int b2) {
        return Inlines.ADD32(c2, Inlines.ADD32(Inlines.MULT16_16(a2, Inlines.SHR(b2, 16)), Inlines.SHR(Inlines.MULT16_16SU(a2, b2 & 0xFFFF), 16)));
    }

    static int MULT16_16_Q11_32(short a2, short b2) {
        return Inlines.SHR(Inlines.MULT16_16(a2, b2), 11);
    }

    static int MULT16_16_Q11_32(int a2, int b2) {
        return Inlines.SHR(Inlines.MULT16_16(a2, b2), 11);
    }

    static short MULT16_16_Q11(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(a2, b2), 11);
    }

    static int MULT16_16_Q11(int a2, int b2) {
        return Inlines.SHR(Inlines.MULT16_16(a2, b2), 11);
    }

    static short MULT16_16_Q13(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(a2, b2), 13);
    }

    static int MULT16_16_Q13(int a2, int b2) {
        return Inlines.SHR(Inlines.MULT16_16(a2, b2), 13);
    }

    static short MULT16_16_Q14(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(a2, b2), 14);
    }

    static int MULT16_16_Q14(int a2, int b2) {
        return Inlines.SHR(Inlines.MULT16_16(a2, b2), 14);
    }

    static short MULT16_16_Q15(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(a2, b2), 15);
    }

    static int MULT16_16_Q15(int a2, int b2) {
        return Inlines.SHR(Inlines.MULT16_16(a2, b2), 15);
    }

    static short MULT16_16_P13(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.ADD32(4096, Inlines.MULT16_16(a2, b2)), 13);
    }

    static int MULT16_16_P13(int a2, int b2) {
        return Inlines.SHR(Inlines.ADD32(4096, Inlines.MULT16_16(a2, b2)), 13);
    }

    static short MULT16_16_P14(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.ADD32(8192, Inlines.MULT16_16(a2, b2)), 14);
    }

    static int MULT16_16_P14(int a2, int b2) {
        return Inlines.SHR(Inlines.ADD32(8192, Inlines.MULT16_16(a2, b2)), 14);
    }

    static short MULT16_16_P15(short a2, short b2) {
        return (short)Inlines.SHR(Inlines.ADD32(16384, Inlines.MULT16_16(a2, b2)), 15);
    }

    static int MULT16_16_P15(int a2, int b2) {
        return Inlines.SHR(Inlines.ADD32(16384, Inlines.MULT16_16(a2, b2)), 15);
    }

    static short DIV32_16(int a2, short b2) {
        return (short)(a2 / b2);
    }

    static int DIV32_16(int a2, int b2) {
        return a2 / b2;
    }

    static int DIV32(int a2, int b2) {
        return a2 / b2;
    }

    static short SAT16(int x2) {
        return (short)(x2 > Short.MAX_VALUE ? Short.MAX_VALUE : (short)(x2 < Short.MIN_VALUE ? Short.MIN_VALUE : (short)x2));
    }

    static short SIG2WORD16(int x2) {
        x2 = Inlines.PSHR32(x2, 12);
        x2 = Inlines.MAX32(x2, Short.MIN_VALUE);
        x2 = Inlines.MIN32(x2, Short.MAX_VALUE);
        return Inlines.EXTRACT16(x2);
    }

    static short MIN(short a2, short b2) {
        return a2 < b2 ? a2 : b2;
    }

    static short MAX(short a2, short b2) {
        return a2 > b2 ? a2 : b2;
    }

    static short MIN16(short a2, short b2) {
        return a2 < b2 ? a2 : b2;
    }

    static short MAX16(short a2, short b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int MIN16(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int MAX16(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static float MIN16(float a2, float b2) {
        return a2 < b2 ? a2 : b2;
    }

    static float MAX16(float a2, float b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int MIN(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int MAX(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int IMIN(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static long IMIN(long a2, long b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int IMAX(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int MIN32(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int MAX32(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static float MIN32(float a2, float b2) {
        return a2 < b2 ? a2 : b2;
    }

    static float MAX32(float a2, float b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int ABS16(int x2) {
        return x2 < 0 ? -x2 : x2;
    }

    static float ABS16(float x2) {
        return x2 < 0.0f ? -x2 : x2;
    }

    static short ABS16(short x2) {
        return x2 < 0 ? -x2 : x2;
    }

    static int ABS32(int x2) {
        return x2 < 0 ? -x2 : x2;
    }

    static int celt_udiv(int n2, int d2) {
        Inlines.OpusAssert(d2 > 0);
        return n2 / d2;
    }

    static int celt_sudiv(int n2, int d2) {
        Inlines.OpusAssert(d2 > 0);
        return n2 / d2;
    }

    static int celt_div(int a2, int b2) {
        return Inlines.MULT32_32_Q31(a2, Inlines.celt_rcp(b2));
    }

    static int celt_ilog2(int x2) {
        Inlines.OpusAssert(x2 > 0, "celt_ilog2() only defined for strictly positive numbers");
        return Inlines.EC_ILOG(x2) - 1;
    }

    static int celt_zlog2(int x2) {
        return x2 <= 0 ? 0 : Inlines.celt_ilog2(x2);
    }

    static int celt_maxabs16(int[] x2, int x_ptr, int len) {
        int maxval = 0;
        int minval = 0;
        for (int i2 = x_ptr; i2 < len + x_ptr; ++i2) {
            maxval = Inlines.MAX32(maxval, x2[i2]);
            minval = Inlines.MIN32(minval, x2[i2]);
        }
        return Inlines.MAX32(Inlines.EXTEND32(maxval), -Inlines.EXTEND32(minval));
    }

    static int celt_maxabs32(int[] x2, int x_ptr, int len) {
        int maxval = 0;
        int minval = 0;
        for (int i2 = x_ptr; i2 < x_ptr + len; ++i2) {
            maxval = Inlines.MAX32(maxval, x2[i2]);
            minval = Inlines.MIN32(minval, x2[i2]);
        }
        return Inlines.MAX32(maxval, 0 - minval);
    }

    static short celt_maxabs32(short[] x2, int x_ptr, int len) {
        short maxval = 0;
        short minval = 0;
        for (int i2 = x_ptr; i2 < x_ptr + len; ++i2) {
            maxval = Inlines.MAX16(maxval, x2[i2]);
            minval = Inlines.MIN16(minval, x2[i2]);
        }
        return Inlines.MAX(maxval, (short)(0 - minval));
    }

    static int FRAC_MUL16(int a2, int b2) {
        return 16384 + (short)a2 * (short)b2 >> 15;
    }

    static int isqrt32(long _val) {
        int g2 = 0;
        int bshift = Inlines.EC_ILOG(_val) - 1 >> 1;
        int b2 = 1 << bshift;
        do {
            long t2;
            if ((t2 = (long)((g2 << 1) + b2 << bshift)) <= _val) {
                g2 += b2;
                _val -= t2;
            }
            b2 >>= 1;
        } while (--bshift >= 0);
        return g2;
    }

    static int celt_sqrt(int x2) {
        if (x2 == 0) {
            return 0;
        }
        if (x2 >= 0x40000000) {
            return Short.MAX_VALUE;
        }
        int k2 = (Inlines.celt_ilog2(x2) >> 1) - 7;
        x2 = Inlines.VSHR32(x2, 2 * k2);
        short n2 = (short)(x2 - 32768);
        int rt2 = Inlines.ADD16(sqrt_C[0], Inlines.MULT16_16_Q15(n2, Inlines.ADD16(sqrt_C[1], Inlines.MULT16_16_Q15(n2, Inlines.ADD16(sqrt_C[2], Inlines.MULT16_16_Q15(n2, Inlines.ADD16(sqrt_C[3], Inlines.MULT16_16_Q15(n2, sqrt_C[4]))))))));
        rt2 = Inlines.VSHR32(rt2, 7 - k2);
        return rt2;
    }

    static int celt_rcp(int x2) {
        Inlines.OpusAssert(x2 > 0, "celt_rcp() only defined for positive values");
        int i2 = Inlines.celt_ilog2(x2);
        int n2 = Inlines.VSHR32(x2, i2 - 15) - 32768;
        int r2 = Inlines.ADD16(30840, Inlines.MULT16_16_Q15(-15420, n2));
        r2 = Inlines.SUB16(r2, Inlines.MULT16_16_Q15(r2, Inlines.ADD16(Inlines.MULT16_16_Q15(r2, n2), Inlines.ADD16(r2, Short.MIN_VALUE))));
        r2 = Inlines.SUB16(r2, Inlines.ADD16(1, Inlines.MULT16_16_Q15(r2, Inlines.ADD16(Inlines.MULT16_16_Q15(r2, n2), Inlines.ADD16(r2, Short.MIN_VALUE)))));
        return Inlines.VSHR32(Inlines.EXTEND32(r2), i2 - 16);
    }

    static int celt_rsqrt_norm(int x2) {
        int n2 = x2 - 32768;
        int r2 = Inlines.ADD16(23557, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(-13490, Inlines.MULT16_16_Q15(n2, 6713))));
        int r22 = Inlines.MULT16_16_Q15(r2, r2);
        int y2 = Inlines.SHL16(Inlines.SUB16(Inlines.ADD16(Inlines.MULT16_16_Q15(r22, n2), r22), 16384), 1);
        return Inlines.ADD16(r2, Inlines.MULT16_16_Q15(r2, Inlines.MULT16_16_Q15(y2, Inlines.SUB16(Inlines.MULT16_16_Q15(y2, 12288), 16384))));
    }

    static int frac_div32(int a2, int b2) {
        int shift = Inlines.celt_ilog2(b2) - 29;
        a2 = Inlines.VSHR32(a2, shift);
        b2 = Inlines.VSHR32(b2, shift);
        int rcp = Inlines.ROUND16(Inlines.celt_rcp(Inlines.ROUND16(b2, 16)), 3);
        int result = Inlines.MULT16_32_Q15(rcp, a2);
        int rem = Inlines.PSHR32(a2, 2) - Inlines.MULT32_32_Q31(result, b2);
        if ((result = Inlines.ADD32(result, Inlines.SHL32(Inlines.MULT16_32_Q15(rcp, rem), 2))) >= 0x20000000) {
            return Integer.MAX_VALUE;
        }
        if (result <= -536870912) {
            return -2147483647;
        }
        return Inlines.SHL32(result, 2);
    }

    static int celt_log2(int x2) {
        if (x2 == 0) {
            return -32767;
        }
        int i2 = Inlines.celt_ilog2(x2);
        int n2 = Inlines.VSHR32(x2, i2 - 15) - 32768 - 16384;
        int frac = Inlines.ADD16((int)log2_C0, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(15746, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(-5217, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(2545, Inlines.MULT16_16_Q15(n2, -1401))))))));
        return Inlines.SHL16((short)(i2 - 13), 10) + Inlines.SHR16(frac, 4);
    }

    static int celt_exp2_frac(int x2) {
        int frac = Inlines.SHL16(x2, 4);
        return Inlines.ADD16(16383, Inlines.MULT16_16_Q15(frac, Inlines.ADD16(22804, Inlines.MULT16_16_Q15(frac, Inlines.ADD16(14819, Inlines.MULT16_16_Q15(10204, frac))))));
    }

    static int celt_exp2(int x2) {
        int integer = Inlines.SHR16(x2, 10);
        if (integer > 14) {
            return 0x7F000000;
        }
        if (integer < -15) {
            return 0;
        }
        short frac = (short)Inlines.celt_exp2_frac((short)(x2 - Inlines.SHL16((short)integer, 10)));
        return Inlines.VSHR32(Inlines.EXTEND32((int)frac), -integer - 2);
    }

    static int celt_atan01(int x2) {
        return Inlines.MULT16_16_P15(x2, Inlines.ADD32(Short.MAX_VALUE, Inlines.MULT16_16_P15(x2, Inlines.ADD32(-21, Inlines.MULT16_16_P15(x2, Inlines.ADD32(-11943, Inlines.MULT16_16_P15(4936, x2)))))));
    }

    static int celt_atan2p(int y2, int x2) {
        if (y2 < x2) {
            int arg = Inlines.celt_div(Inlines.SHL32(Inlines.EXTEND32(y2), 15), x2);
            if (arg >= Short.MAX_VALUE) {
                arg = Short.MAX_VALUE;
            }
            return Inlines.SHR32(Inlines.celt_atan01(Inlines.EXTRACT16(arg)), 1);
        }
        int arg = Inlines.celt_div(Inlines.SHL32(Inlines.EXTEND32(x2), 15), y2);
        if (arg >= Short.MAX_VALUE) {
            arg = Short.MAX_VALUE;
        }
        return 25736 - Inlines.SHR16(Inlines.celt_atan01(Inlines.EXTRACT16(arg)), 1);
    }

    static int celt_cos_norm(int x2) {
        if ((x2 &= 0x1FFFF) > Inlines.SHL32(Inlines.EXTEND32(1), 16)) {
            x2 = Inlines.SUB32(Inlines.SHL32(Inlines.EXTEND32(1), 17), x2);
        }
        if ((x2 & Short.MAX_VALUE) != 0) {
            if (x2 < Inlines.SHL32(Inlines.EXTEND32(1), 15)) {
                return Inlines._celt_cos_pi_2(Inlines.EXTRACT16(x2));
            }
            return Inlines.NEG32(Inlines._celt_cos_pi_2(Inlines.EXTRACT16(65536 - x2)));
        }
        if ((x2 & 0xFFFF) != 0) {
            return 0;
        }
        if ((x2 & 0x1FFFF) != 0) {
            return -32767;
        }
        return Short.MAX_VALUE;
    }

    static int _celt_cos_pi_2(int x2) {
        int x22 = Inlines.MULT16_16_P15(x2, x2);
        return Inlines.ADD32(1, Inlines.MIN32(32766, Inlines.ADD32(Inlines.SUB16(Short.MAX_VALUE, x22), Inlines.MULT16_16_P15(x22, Inlines.ADD32(-7651, Inlines.MULT16_16_P15(x22, Inlines.ADD32(8277, Inlines.MULT16_16_P15(-626, x22))))))));
    }

    static short FLOAT2INT16(float x2) {
        if ((x2 *= 32768.0f) < -32768.0f) {
            x2 = -32768.0f;
        }
        if (x2 > 32767.0f) {
            x2 = 32767.0f;
        }
        return (short)x2;
    }

    static int silk_ROR32(int a32, int rot) {
        int m2 = 0 - rot;
        if (rot == 0) {
            return a32;
        }
        if (rot < 0) {
            return a32 << m2 | a32 >> 32 - m2;
        }
        return a32 << 32 - rot | a32 >> rot;
    }

    static int silk_MUL(int a32, int b32) {
        int ret = a32 * b32;
        return ret;
    }

    static int silk_MLA(int a32, int b32, int c32) {
        int ret = Inlines.silk_ADD32(a32, b32 * c32);
        Inlines.OpusAssert((long)ret == (long)a32 + (long)b32 * (long)c32);
        return ret;
    }

    static int silk_SMULTT(int a32, int b32) {
        return (a32 >> 16) * (b32 >> 16);
    }

    static int silk_SMLATT(int a32, int b32, int c32) {
        return Inlines.silk_ADD32(a32, (b32 >> 16) * (c32 >> 16));
    }

    static long silk_SMLALBB(long a64, short b16, short c16) {
        return Inlines.silk_ADD64(a64, b16 * c16);
    }

    static long silk_SMULL(int a32, int b32) {
        return (long)a32 * (long)b32;
    }

    static int silk_ADD32_ovflw(int a2, int b2) {
        return (int)((long)a2 + (long)b2);
    }

    static int silk_ADD32_ovflw(long a2, long b2) {
        return (int)(a2 + b2);
    }

    static int silk_SUB32_ovflw(int a2, int b2) {
        return (int)((long)a2 - (long)b2);
    }

    static int silk_MLA_ovflw(int a32, int b32, int c32) {
        return Inlines.silk_ADD32_ovflw((long)a32, (long)b32 * (long)c32);
    }

    static int silk_SMLABB_ovflw(int a32, int b32, int c32) {
        return Inlines.silk_ADD32_ovflw(a32, (short)b32 * (short)c32);
    }

    static int silk_SMULBB(int a32, int b32) {
        return (short)a32 * (short)b32;
    }

    static int silk_SMULWB(int a32, int b32) {
        return (int)((long)a32 * (long)((short)b32) >> 16);
    }

    static int silk_SMLABB(int a32, int b32, int c32) {
        return a32 + (short)b32 * (short)c32;
    }

    static int silk_DIV32_16(int a32, int b32) {
        return a32 / b32;
    }

    static int silk_DIV32(int a32, int b32) {
        return a32 / b32;
    }

    static short silk_ADD16(short a2, short b2) {
        short ret = (short)(a2 + b2);
        return ret;
    }

    static int silk_ADD32(int a2, int b2) {
        int ret = a2 + b2;
        return ret;
    }

    static long silk_ADD64(long a2, long b2) {
        long ret = a2 + b2;
        Inlines.OpusAssert(ret == Inlines.silk_ADD_SAT64(a2, b2));
        return ret;
    }

    static short silk_SUB16(short a2, short b2) {
        short ret = (short)(a2 - b2);
        Inlines.OpusAssert(ret == Inlines.silk_SUB_SAT16(a2, b2));
        return ret;
    }

    static int silk_SUB32(int a2, int b2) {
        int ret = a2 - b2;
        Inlines.OpusAssert(ret == Inlines.silk_SUB_SAT32(a2, b2));
        return ret;
    }

    static long silk_SUB64(long a2, long b2) {
        long ret = a2 - b2;
        Inlines.OpusAssert(ret == Inlines.silk_SUB_SAT64(a2, b2));
        return ret;
    }

    static int silk_SAT8(int a2) {
        return a2 > 127 ? 127 : (a2 < -128 ? -128 : a2);
    }

    static int silk_SAT16(int a2) {
        return a2 > Short.MAX_VALUE ? Short.MAX_VALUE : (a2 < Short.MIN_VALUE ? Short.MIN_VALUE : a2);
    }

    static int silk_SAT32(long a2) {
        return a2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (a2 < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int)a2);
    }

    static short silk_ADD_SAT16(short a16, short b16) {
        short res = (short)Inlines.silk_SAT16(Inlines.silk_ADD32(a16, b16));
        Inlines.OpusAssert(res == Inlines.silk_SAT16(a16 + b16));
        return res;
    }

    static int silk_ADD_SAT32(int a32, int b32) {
        int res = ((long)a32 + (long)b32 & Integer.MIN_VALUE) == 0L ? ((a32 & b32 & Integer.MIN_VALUE) != 0 ? Integer.MIN_VALUE : a32 + b32) : (((a32 | b32) & Integer.MIN_VALUE) == 0 ? Integer.MAX_VALUE : a32 + b32);
        Inlines.OpusAssert(res == Inlines.silk_SAT32((long)a32 + (long)b32));
        return res;
    }

    static long silk_ADD_SAT64(long a64, long b64) {
        long res = (a64 + b64 & Long.MIN_VALUE) == 0L ? ((a64 & b64 & Long.MIN_VALUE) != 0L ? Long.MIN_VALUE : a64 + b64) : (((a64 | b64) & Long.MIN_VALUE) == 0L ? Long.MAX_VALUE : a64 + b64);
        return res;
    }

    static short silk_SUB_SAT16(short a16, short b16) {
        short res = (short)Inlines.silk_SAT16(Inlines.silk_SUB32(a16, b16));
        Inlines.OpusAssert(res == Inlines.silk_SAT16(a16 - b16));
        return res;
    }

    static int silk_SUB_SAT32(int a32, int b32) {
        int res = ((long)a32 - (long)b32 & Integer.MIN_VALUE) == 0L ? ((a32 & (b32 ^ Integer.MIN_VALUE) & Integer.MIN_VALUE) != 0 ? Integer.MIN_VALUE : a32 - b32) : (((a32 ^ Integer.MIN_VALUE) & b32 & Integer.MIN_VALUE) != 0 ? Integer.MAX_VALUE : a32 - b32);
        Inlines.OpusAssert(res == Inlines.silk_SAT32((long)a32 - (long)b32));
        return res;
    }

    static long silk_SUB_SAT64(long a64, long b64) {
        long res = (a64 - b64 & Long.MIN_VALUE) == 0L ? ((a64 & (b64 ^ Long.MIN_VALUE) & Long.MIN_VALUE) != 0L ? Long.MIN_VALUE : a64 - b64) : (((a64 ^ Long.MIN_VALUE) & b64 & Long.MIN_VALUE) != 0L ? Long.MAX_VALUE : a64 - b64);
        return res;
    }

    static byte silk_ADD_POS_SAT8(byte a2, byte b2) {
        return (byte)((a2 + b2 & 0x80) != 0 ? 127 : a2 + b2);
    }

    static short silk_ADD_POS_SAT16(short a2, short b2) {
        return (short)((a2 + b2 & 0x8000) != 0 ? Short.MAX_VALUE : a2 + b2);
    }

    static int silk_ADD_POS_SAT32(int a2, int b2) {
        return (a2 + b2 & Integer.MIN_VALUE) != 0 ? Integer.MAX_VALUE : a2 + b2;
    }

    static long silk_ADD_POS_SAT64(long a2, long b2) {
        return (a2 + b2 & Long.MIN_VALUE) != 0L ? Long.MAX_VALUE : a2 + b2;
    }

    static byte silk_LSHIFT8(byte a2, int shift) {
        byte ret = (byte)(a2 << shift);
        return ret;
    }

    static short silk_LSHIFT16(short a2, int shift) {
        short ret = (short)(a2 << shift);
        return ret;
    }

    static int silk_LSHIFT32(int a2, int shift) {
        int ret = a2 << shift;
        return ret;
    }

    static long silk_LSHIFT64(long a2, int shift) {
        long ret = a2 << shift;
        return ret;
    }

    static int silk_LSHIFT(int a2, int shift) {
        int ret = a2 << shift;
        return ret;
    }

    static int silk_LSHIFT_ovflw(int a2, int shift) {
        return a2 << shift;
    }

    static int silk_LSHIFT_SAT32(int a2, int shift) {
        return Inlines.silk_LSHIFT32(Inlines.silk_LIMIT(a2, Inlines.silk_RSHIFT32(Integer.MIN_VALUE, shift), Inlines.silk_RSHIFT32(Integer.MAX_VALUE, shift)), shift);
    }

    static byte silk_RSHIFT8(byte a2, int shift) {
        return (byte)(a2 >> shift);
    }

    static short silk_RSHIFT16(short a2, int shift) {
        return (short)(a2 >> shift);
    }

    static int silk_RSHIFT32(int a2, int shift) {
        return a2 >> shift;
    }

    static int silk_RSHIFT(int a2, int shift) {
        return a2 >> shift;
    }

    static long silk_RSHIFT64(long a2, int shift) {
        return a2 >> shift;
    }

    static long silk_RSHIFT_uint(long a2, int shift) {
        return Inlines.CapToUInt32(a2) >> shift;
    }

    static int silk_ADD_LSHIFT(int a2, int b2, int shift) {
        int ret = a2 + (b2 << shift);
        return ret;
    }

    static int silk_ADD_LSHIFT32(int a2, int b2, int shift) {
        int ret = a2 + (b2 << shift);
        return ret;
    }

    static int silk_ADD_RSHIFT(int a2, int b2, int shift) {
        int ret = a2 + (b2 >> shift);
        return ret;
    }

    static int silk_ADD_RSHIFT32(int a2, int b2, int shift) {
        int ret = a2 + (b2 >> shift);
        return ret;
    }

    static long silk_ADD_RSHIFT_uint(long a2, long b2, int shift) {
        long ret = Inlines.CapToUInt32(a2 + (Inlines.CapToUInt32(b2) >> shift));
        return ret;
    }

    static int silk_SUB_LSHIFT32(int a2, int b2, int shift) {
        int ret = a2 - (b2 << shift);
        return ret;
    }

    static int silk_SUB_RSHIFT32(int a2, int b2, int shift) {
        int ret = a2 - (b2 >> shift);
        return ret;
    }

    static int silk_RSHIFT_ROUND(int a2, int shift) {
        int ret = shift == 1 ? (a2 >> 1) + (a2 & 1) : (a2 >> shift - 1) + 1 >> 1;
        return ret;
    }

    static long silk_RSHIFT_ROUND64(long a2, int shift) {
        long ret = shift == 1 ? (a2 >> 1) + (a2 & 1L) : (a2 >> shift - 1) + 1L >> 1;
        return ret;
    }

    static int silk_min(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int silk_max(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static float silk_min(float a2, float b2) {
        return a2 < b2 ? a2 : b2;
    }

    static float silk_max(float a2, float b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int SILK_CONST(float number, int scale) {
        return (int)((double)(number * (float)(1L << scale)) + 0.5);
    }

    static int silk_min_int(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static short silk_min_16(short a2, short b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int silk_min_32(int a2, int b2) {
        return a2 < b2 ? a2 : b2;
    }

    static long silk_min_64(long a2, long b2) {
        return a2 < b2 ? a2 : b2;
    }

    static int silk_max_int(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static short silk_max_16(short a2, short b2) {
        return a2 > b2 ? a2 : b2;
    }

    static int silk_max_32(int a2, int b2) {
        return a2 > b2 ? a2 : b2;
    }

    static long silk_max_64(long a2, long b2) {
        return a2 > b2 ? a2 : b2;
    }

    static float silk_LIMIT(float a2, float limit1, float limit2) {
        return limit1 > limit2 ? (a2 > limit1 ? limit1 : (a2 < limit2 ? limit2 : a2)) : (a2 > limit2 ? limit2 : (a2 < limit1 ? limit1 : a2));
    }

    static int silk_LIMIT(int a2, int limit1, int limit2) {
        return Inlines.silk_LIMIT_32(a2, limit1, limit2);
    }

    static int silk_LIMIT_int(int a2, int limit1, int limit2) {
        return Inlines.silk_LIMIT_32(a2, limit1, limit2);
    }

    static short silk_LIMIT_16(short a2, short limit1, short limit2) {
        return limit1 > limit2 ? (a2 > limit1 ? limit1 : (a2 < limit2 ? limit2 : a2)) : (a2 > limit2 ? limit2 : (a2 < limit1 ? limit1 : a2));
    }

    static int silk_LIMIT_32(int a2, int limit1, int limit2) {
        return limit1 > limit2 ? (a2 > limit1 ? limit1 : (a2 < limit2 ? limit2 : a2)) : (a2 > limit2 ? limit2 : (a2 < limit1 ? limit1 : a2));
    }

    static int silk_abs(int a2) {
        return a2 > 0 ? a2 : -a2;
    }

    static int silk_abs_int16(int a2) {
        return (a2 ^ a2 >> 15) - (a2 >> 15);
    }

    static int silk_abs_int32(int a2) {
        return (a2 ^ a2 >> 31) - (a2 >> 31);
    }

    static long silk_abs_int64(long a2) {
        return a2 > 0L ? a2 : -a2;
    }

    static long silk_sign(int a2) {
        return a2 > 0 ? 1L : (long)(a2 < 0 ? -1 : 0);
    }

    static int silk_RAND(int seed) {
        return Inlines.silk_MLA_ovflw(907633515, seed, 196314165);
    }

    static int silk_SMMUL(int a32, int b32) {
        return (int)Inlines.silk_RSHIFT64(Inlines.silk_SMULL(a32, b32), 32);
    }

    static int silk_SMLAWT(int a32, int b32, int c32) {
        int ret = a32 + (b32 >> 16) * (c32 >> 16) + ((b32 & 0xFFFF) * (c32 >> 16) >> 16);
        return ret;
    }

    static int silk_DIV32_varQ(int a32, int b32, int Qres) {
        Inlines.OpusAssert(b32 != 0);
        Inlines.OpusAssert(Qres >= 0);
        int a_headrm = Inlines.silk_CLZ32(Inlines.silk_abs(a32)) - 1;
        int a32_nrm = Inlines.silk_LSHIFT(a32, a_headrm);
        int b_headrm = Inlines.silk_CLZ32(Inlines.silk_abs(b32)) - 1;
        int b32_nrm = Inlines.silk_LSHIFT(b32, b_headrm);
        int b32_inv = Inlines.silk_DIV32_16(0x1FFFFFFF, Inlines.silk_RSHIFT(b32_nrm, 16));
        int result = Inlines.silk_SMULWB(a32_nrm, b32_inv);
        a32_nrm = Inlines.silk_SUB32_ovflw(a32_nrm, Inlines.silk_LSHIFT_ovflw(Inlines.silk_SMMUL(b32_nrm, result), 3));
        result = Inlines.silk_SMLAWB(result, a32_nrm, b32_inv);
        int lshift = 29 + a_headrm - b_headrm - Qres;
        if (lshift < 0) {
            return Inlines.silk_LSHIFT_SAT32(result, -lshift);
        }
        if (lshift < 32) {
            return Inlines.silk_RSHIFT(result, lshift);
        }
        return 0;
    }

    static int silk_INVERSE32_varQ(int b32, int Qres) {
        Inlines.OpusAssert(b32 != 0);
        Inlines.OpusAssert(Qres > 0);
        int b_headrm = Inlines.silk_CLZ32(Inlines.silk_abs(b32)) - 1;
        int b32_nrm = Inlines.silk_LSHIFT(b32, b_headrm);
        int b32_inv = Inlines.silk_DIV32_16(0x1FFFFFFF, (short)Inlines.silk_RSHIFT(b32_nrm, 16));
        int result = Inlines.silk_LSHIFT(b32_inv, 16);
        int err_Q32 = Inlines.silk_LSHIFT(0x20000000 - Inlines.silk_SMULWB(b32_nrm, b32_inv), 3);
        result = Inlines.silk_SMLAWW(result, err_Q32, b32_inv);
        int lshift = 61 - b_headrm - Qres;
        if (lshift <= 0) {
            return Inlines.silk_LSHIFT_SAT32(result, -lshift);
        }
        if (lshift < 32) {
            return Inlines.silk_RSHIFT(result, lshift);
        }
        return 0;
    }

    static int silk_SMLAWB(int a32, int b32, int c32) {
        int ret = a32 + Inlines.silk_SMULWB(b32, c32);
        return ret;
    }

    static int silk_SMULWT(int a32, int b32) {
        return (a32 >> 16) * (b32 >> 16) + ((a32 & 0xFFFF) * (b32 >> 16) >> 16);
    }

    static int silk_SMULBT(int a32, int b32) {
        return (short)a32 * (b32 >> 16);
    }

    static int silk_SMLABT(int a32, int b32, int c32) {
        return a32 + (short)b32 * (c32 >> 16);
    }

    static long silk_SMLAL(long a64, int b32, int c32) {
        return Inlines.silk_ADD64(a64, (long)b32 * (long)c32);
    }

    static int MatrixGetPointer(int row, int column, int N2) {
        return row * N2 + column;
    }

    static int MatrixGet(int[] Matrix_base_adr, int row, int column, int N2) {
        return Matrix_base_adr[row * N2 + column];
    }

    static short MatrixGet(short[] Matrix_base_adr, int row, int column, int N2) {
        return Matrix_base_adr[row * N2 + column];
    }

    static PitchAnalysisCore.silk_pe_stage3_vals MatrixGet(PitchAnalysisCore.silk_pe_stage3_vals[] Matrix_base_adr, int row, int column, int N2) {
        return Matrix_base_adr[row * N2 + column];
    }

    static int MatrixGet(int[] Matrix_base_adr, int matrix_ptr, int row, int column, int N2) {
        return Matrix_base_adr[matrix_ptr + row * N2 + column];
    }

    static short MatrixGet(short[] Matrix_base_adr, int matrix_ptr, int row, int column, int N2) {
        return Matrix_base_adr[matrix_ptr + row * N2 + column];
    }

    static void MatrixSet(int[] Matrix_base_adr, int matrix_ptr, int row, int column, int N2, int value) {
        Matrix_base_adr[matrix_ptr + row * N2 + column] = value;
    }

    static void MatrixSet(short[] Matrix_base_adr, int matrix_ptr, int row, int column, int N2, short value) {
        Matrix_base_adr[matrix_ptr + row * N2 + column] = value;
    }

    static void MatrixSet(int[] Matrix_base_adr, int row, int column, int N2, int value) {
        Matrix_base_adr[row * N2 + column] = value;
    }

    static void MatrixSet(short[] Matrix_base_adr, int row, int column, int N2, short value) {
        Matrix_base_adr[row * N2 + column] = value;
    }

    static int silk_SMULWW(int a32, int b32) {
        return Inlines.silk_MLA(Inlines.silk_SMULWB(a32, b32), a32, Inlines.silk_RSHIFT_ROUND(b32, 16));
    }

    static int silk_SMLAWW(int a32, int b32, int c32) {
        return Inlines.silk_MLA(Inlines.silk_SMLAWB(a32, b32, c32), b32, Inlines.silk_RSHIFT_ROUND(c32, 16));
    }

    static int silk_CLZ64(long input) {
        int in_upper = (int)Inlines.silk_RSHIFT64(input, 32);
        if (in_upper == 0) {
            return 32 + Inlines.silk_CLZ32((int)input);
        }
        return Inlines.silk_CLZ32(in_upper);
    }

    static int silk_CLZ32(int in32) {
        return in32 == 0 ? 32 : 32 - Inlines.EC_ILOG(in32);
    }

    static void silk_CLZ_FRAC(int input, BoxedValueInt lz2, BoxedValueInt frac_Q7) {
        int lzeros;
        lz2.Val = lzeros = Inlines.silk_CLZ32(input);
        frac_Q7.Val = Inlines.silk_ROR32(input, 24 - lzeros) & 0x7F;
    }

    static int silk_SQRT_APPROX(int x2) {
        if (x2 <= 0) {
            return 0;
        }
        BoxedValueInt boxed_lz = new BoxedValueInt(0);
        BoxedValueInt boxed_frac_Q7 = new BoxedValueInt(0);
        Inlines.silk_CLZ_FRAC(x2, boxed_lz, boxed_frac_Q7);
        int lz2 = boxed_lz.Val;
        int frac_Q7 = boxed_frac_Q7.Val;
        int y2 = (lz2 & 1) != 0 ? 32768 : 46214;
        y2 >>= Inlines.silk_RSHIFT(lz2, 1);
        y2 = Inlines.silk_SMLAWB(y2, y2, Inlines.silk_SMULBB(213, frac_Q7));
        return y2;
    }

    static int MUL32_FRAC_Q(int a32, int b32, int Q2) {
        return (int)Inlines.silk_RSHIFT_ROUND64(Inlines.silk_SMULL(a32, b32), Q2);
    }

    static int silk_lin2log(int inLin) {
        BoxedValueInt lz2 = new BoxedValueInt(0);
        BoxedValueInt frac_Q7 = new BoxedValueInt(0);
        Inlines.silk_CLZ_FRAC(inLin, lz2, frac_Q7);
        return Inlines.silk_LSHIFT(31 - lz2.Val, 7) + Inlines.silk_SMLAWB(frac_Q7.Val, Inlines.silk_MUL(frac_Q7.Val, 128 - frac_Q7.Val), 179);
    }

    static int silk_log2lin(int inLog_Q7) {
        if (inLog_Q7 < 0) {
            return 0;
        }
        if (inLog_Q7 >= 3967) {
            return Integer.MAX_VALUE;
        }
        int output = Inlines.silk_LSHIFT(1, Inlines.silk_RSHIFT(inLog_Q7, 7));
        int frac_Q7 = inLog_Q7 & 0x7F;
        output = inLog_Q7 < 2048 ? Inlines.silk_ADD_RSHIFT32(output, Inlines.silk_MUL(output, Inlines.silk_SMLAWB(frac_Q7, Inlines.silk_SMULBB(frac_Q7, 128 - frac_Q7), -174)), 7) : Inlines.silk_MLA(output, Inlines.silk_RSHIFT(output, 7), Inlines.silk_SMLAWB(frac_Q7, Inlines.silk_SMULBB(frac_Q7, 128 - frac_Q7), -174));
        return output;
    }

    static void silk_interpolate(short[] xi2, short[] x0, short[] x1, int ifact_Q2, int d2) {
        Inlines.OpusAssert(ifact_Q2 >= 0);
        Inlines.OpusAssert(ifact_Q2 <= 4);
        for (int i2 = 0; i2 < d2; ++i2) {
            xi2[i2] = (short)Inlines.silk_ADD_RSHIFT(x0[i2], Inlines.silk_SMULBB(x1[i2] - x0[i2], ifact_Q2), 2);
        }
    }

    static int silk_inner_prod_aligned_scale(short[] inVec1, short[] inVec2, int scale, int len) {
        int sum = 0;
        for (int i2 = 0; i2 < len; ++i2) {
            sum = Inlines.silk_ADD_RSHIFT32(sum, Inlines.silk_SMULBB(inVec1[i2], inVec2[i2]), scale);
        }
        return sum;
    }

    static void silk_scale_copy_vector16(short[] data_out, int data_out_ptr, short[] data_in, int data_in_ptr, int gain_Q16, int dataSize) {
        for (int i2 = 0; i2 < dataSize; ++i2) {
            data_out[data_out_ptr + i2] = (short)Inlines.silk_SMULWB(gain_Q16, data_in[data_in_ptr + i2]);
        }
    }

    static void silk_scale_vector32_Q26_lshift_18(int[] data1, int data1_ptr, int gain_Q26, int dataSize) {
        for (int i2 = data1_ptr; i2 < data1_ptr + dataSize; ++i2) {
            data1[i2] = (int)Inlines.silk_RSHIFT64(Inlines.silk_SMULL(data1[i2], gain_Q26), 8);
        }
    }

    static int silk_inner_prod(short[] inVec1, int inVec1_ptr, short[] inVec2, int inVec2_ptr, int len) {
        int xy2 = 0;
        for (int i2 = 0; i2 < len; ++i2) {
            xy2 = Inlines.MAC16_16(xy2, inVec1[inVec1_ptr + i2], inVec2[inVec2_ptr + i2]);
        }
        return xy2;
    }

    static int silk_inner_prod_self(short[] inVec, int inVec_ptr, int len) {
        int xy2 = 0;
        for (int i2 = inVec_ptr; i2 < inVec_ptr + len; ++i2) {
            xy2 = Inlines.MAC16_16(xy2, inVec[i2], inVec[i2]);
        }
        return xy2;
    }

    static long silk_inner_prod16_aligned_64(short[] inVec1, int inVec1_ptr, short[] inVec2, int inVec2_ptr, int len) {
        long sum = 0L;
        for (int i2 = 0; i2 < len; ++i2) {
            sum = Inlines.silk_SMLALBB(sum, inVec1[inVec1_ptr + i2], inVec2[inVec2_ptr + i2]);
        }
        return sum;
    }

    static long EC_MINI(long a2, long b2) {
        return a2 + (b2 - a2 & (long)(b2 < a2 ? -1 : 0));
    }

    static int EC_ILOG(long x2) {
        if (x2 == 0L) {
            return 1;
        }
        x2 |= x2 >> 1;
        x2 |= x2 >> 2;
        x2 |= x2 >> 4;
        x2 |= x2 >> 8;
        x2 |= x2 >> 16;
        long y2 = x2 - (x2 >> 1 & 0x55555555L);
        y2 = (y2 >> 2 & 0x33333333L) + (y2 & 0x33333333L);
        y2 = (y2 >> 4) + y2 & 0xF0F0F0FL;
        y2 += y2 >> 8;
        y2 += y2 >> 16;
        return (int)(y2 &= 0x3FL);
    }

    static int abs(int a2) {
        if (a2 < 0) {
            return 0 - a2;
        }
        return a2;
    }

    static int SignedByteToUnsignedInt(byte b2) {
        return b2 & 0xFF;
    }
}

