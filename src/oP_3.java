/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  Oz
 *  XM
 *  aKa
 *  aSa
 *  k
 *  kta
 *  mka
 *  pKa
 *  pqa
 *  uKa
 */
public class oP_3
extends Bp {
    public float A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, float f2, float f3, float f4, float f5) {
        void f6;
        void b2;
        void c2;
        void d2;
        void e2;
        float f7 = f5;
        oP_3 a2 = this;
        void v0 = e2;
        v0.J((double)d2, (double)c2, aSa.V).M();
        v0.J((double)b2, (double)f6, aSa.V).M();
        v0.J(aSa.V, aSa.V, aSa.V).M();
    }

    @Override
    public float e() {
        oP_3 a2;
        return a2.I;
    }

    @Override
    public void J(long l2) {
        oP_3 oP_32;
        oP_3 oP_33 = oP_32 = this;
        float a2 = oP_33.A * CRa.ja;
        float f2 = (float)oP_33.I / kta.v;
        oP_3.J(oP_33.x.J);
        float f3 = f2;
        uKa.J((float)f3, (float)f3, (float)JPa.N);
        uKa.z();
        aKa aKa2 = pKa.J().J();
        aKa2.J(AQa.P, mka.M);
        if (a2 > JPa.N) {
            float b2 = -f2;
            if (a2 < nua.E) {
                b2 = -a2 / nua.E * f2;
            }
            oP_32.J(aKa2, JPa.N, -f2, b2, -f2);
        }
        if (a2 > nua.E) {
            float b2 = JPa.N;
            if (a2 < ISa.a) {
                b2 = -((nua.E - a2) / nua.E) * f2 - f2;
            }
            oP_32.J(aKa2, -f2, -f2, -f2, b2);
        }
        if (a2 > ISa.a) {
            float b2 = f2;
            if (a2 < Era.h) {
                b2 = -((ISa.a - a2) / nua.E) * f2;
            }
            oP_32.J(aKa2, -f2, JPa.N, -f2, b2);
        }
        if (a2 > Era.h) {
            float b2 = JPa.N;
            if (a2 < Hra.Ga) {
                b2 = -((Era.h - a2) / nua.E) * f2 - f2;
            }
            float f4 = f2;
            oP_32.J(aKa2, -f2, f4, b2, f4);
        }
        if (a2 > Hra.Ga) {
            float b2 = f2;
            if (a2 < BQa.p) {
                b2 = -((Hra.Ga - a2) / nua.E) * f2;
            }
            float f5 = f2;
            oP_32.J(aKa2, JPa.N, f5, b2, f5);
        }
        if (a2 > BQa.p) {
            float b2 = JPa.N;
            if (a2 < zta.B) {
                float f6 = f2;
                b2 = f6 + (BQa.p - a2) / nua.E * f6;
            }
            float f7 = f2;
            oP_32.J(aKa2, f7, f7, f7, b2);
        }
        if (a2 > zta.B) {
            float b2 = -f2;
            if (a2 < fta.c) {
                b2 = (zta.B - a2) / nua.E * f2;
            }
            float f8 = f2;
            oP_32.J(aKa2, f8, JPa.N, f8, b2);
        }
        if (a2 > fta.c) {
            float f9 = f2;
            oP_32.J(aKa2, f9, -f2, (CRa.ja - a2) / nua.E * f9, -f2);
        }
        pKa.J().J();
        uKa.H();
    }

    @Override
    public float d() {
        oP_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public oP_3(k k2, XM xM2) {
        void a2;
        oP_3 c2 = k2;
        oP_3 b2 = this;
        super((k)c2, (XM)a2);
        c2 = a2.getERadialProgressBar();
        b2.I = c2.getSize();
        b2.A = Oz.J((float)c2.getProgress(), (float)JPa.N, (float)pqa.r);
    }
}

