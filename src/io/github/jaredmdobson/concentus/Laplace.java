/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;

class Laplace {
    private static final int LAPLACE_LOG_MINP = 0;
    private static final long LAPLACE_MINP = 1L;
    private static final int LAPLACE_NMIN = 16;

    Laplace() {
    }

    static long ec_laplace_get_freq1(long fs0, int decay) {
        long ft2 = Inlines.CapToUInt32(32736L - fs0);
        return Inlines.CapToUInt32(ft2 * (long)(16384 - decay)) >> 15;
    }

    static void ec_laplace_encode(EntropyCoder enc, BoxedValueInt value, long fs2, int decay) {
        int val = value.Val;
        long fl2 = 0L;
        if (val != 0) {
            int i2;
            int s2 = 0 - (val < 0 ? 1 : 0);
            val = val + s2 ^ s2;
            fl2 = fs2;
            fs2 = Laplace.ec_laplace_get_freq1(fs2, decay);
            for (i2 = 1; fs2 > 0L && i2 < val; ++i2) {
                fl2 = Inlines.CapToUInt32(fl2 + (fs2 *= 2L) + 2L);
                fs2 = Inlines.CapToUInt32(fs2 * (long)decay >> 15);
            }
            if (fs2 == 0L) {
                int ndi_max = (int)(32768L - fl2 + 1L - 1L) >> 0;
                ndi_max = ndi_max - s2 >> 1;
                int di2 = Inlines.IMIN(val - i2, ndi_max - 1);
                fl2 = Inlines.CapToUInt32(fl2 + (long)(2 * di2 + 1 + s2) * 1L);
                fs2 = Inlines.IMIN(1L, 32768L - fl2);
                value.Val = i2 + di2 + s2 ^ s2;
            } else {
                fl2 += Inlines.CapToUInt32(++fs2 & (long)(~s2));
            }
            Inlines.OpusAssert(fl2 + fs2 <= 32768L);
            Inlines.OpusAssert(fs2 > 0L);
        }
        enc.encode_bin(fl2, fl2 + fs2, 15);
    }

    static int ec_laplace_decode(EntropyCoder dec, long fs2, int decay) {
        int val = 0;
        long fm2 = dec.decode_bin(15);
        long fl2 = 0L;
        if (fm2 >= fs2) {
            ++val;
            fl2 = fs2;
            fs2 = Laplace.ec_laplace_get_freq1(fs2, decay) + 1L;
            while (fs2 > 1L && fm2 >= fl2 + 2L * fs2) {
                fl2 = Inlines.CapToUInt32(fl2 + (fs2 *= 2L));
                fs2 = Inlines.CapToUInt32((fs2 - 2L) * (long)decay >> 15);
                ++fs2;
                ++val;
            }
            if (fs2 <= 1L) {
                int di2 = (int)(fm2 - fl2) >> 1;
                val += di2;
                fl2 = Inlines.CapToUInt32(fl2 + Inlines.CapToUInt32((long)(2 * di2) * 1L));
            }
            if (fm2 < fl2 + fs2) {
                val = -val;
            } else {
                fl2 = Inlines.CapToUInt32(fl2 + fs2);
            }
        }
        Inlines.OpusAssert(fl2 < 32768L);
        Inlines.OpusAssert(fs2 > 0L);
        Inlines.OpusAssert(fl2 <= fm2);
        Inlines.OpusAssert(fm2 < Inlines.IMIN(fl2 + fs2, 32768L));
        dec.dec_update(fl2, Inlines.IMIN(fl2 + fs2, 32768L), 32768L);
        return val;
    }
}

