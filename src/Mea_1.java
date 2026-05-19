/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  Vfa
 *  Yda
 *  Yfa
 *  vL
 *  vRa
 *  xy
 */
public final class Mea_1
extends Vfa {
    private int A;
    private Yda I;

    public Mea_1(Yda yda2) {
        Mea_1 b2 = yda2;
        Mea_1 a2 = this;
        super((Yfa)b2);
        a2.I = b2;
    }

    public void J() {
        Mea_1 a2;
        if (a2.M) {
            Mea_1 mea_1 = a2;
            double d2 = mea_1.j - a2.I.la;
            Mea_1 mea_12 = a2;
            double d3 = mea_1.k - mea_12.I.Z;
            int n2 = mea_12.A - a2.I.A;
            double d4 = d2;
            double d5 = d3;
            int n3 = n2;
            double d6 = d4 * d4 + d5 * d5 + n3 * n3;
            int n4 = mea_1.A;
            mea_1.A = n4 - vRa.d;
            if (n4 <= 0) {
                Mea_1 mea_13 = a2;
                mea_13.A += a2.I.J().nextInt(tTa.h) + uqa.g;
                d6 = Oz.J((double)d6);
                Mea_1 mea_14 = a2;
                if (mea_14.J(mea_13.j, mea_14.k, a2.A, d6)) {
                    Mea_1 mea_15 = a2;
                    Mea_1 mea_16 = a2;
                    mea_15.I.f(mea_16.I.i + d2 / d6 * tpa.k);
                    mea_15.I.J(a2.I.Ea + d3 / d6 * tpa.k);
                    mea_16.I.l(a2.I.f + n2 / d6 * tpa.k);
                    return;
                }
                a2.M = uSa.E;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(double d2, double d3, double d4, double d5) {
        int n2;
        void b2;
        void c2;
        void a2;
        void d6;
        Mea_1 mea_1 = this;
        d6 = (d6 - mea_1.I.la) / a2;
        c2 = (c2 - mea_1.I.Z) / a2;
        b2 = (b2 - mea_1.I.A) / a2;
        Mea_1 e2 = mea_1.I.J();
        int n3 = n2 = vRa.d;
        while ((double)n3 < a2) {
            if (!mea_1.I.j.J((vL)mea_1.I, (xy)(e2 = e2.C((double)d6, (double)c2, (double)b2))).isEmpty()) {
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

