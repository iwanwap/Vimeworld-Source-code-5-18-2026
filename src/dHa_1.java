/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Gl
 *  JPa
 *  NTa
 *  Oz
 *  pqa
 *  qta
 *  vRa
 */
public final class dHa_1 {
    private int J;
    private float A;
    private Gl I;

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        float f5;
        void c2;
        float d2 = f3;
        dHa_1 b2 = this;
        d2 = Oz.f((float)(c2 - d2));
        if (f5 < -a2) {
            d2 = -a2;
        }
        if (d2 >= a2) {
            d2 = a2;
        }
        return (float)(c2 - d2);
    }

    public void J() {
        dHa_1 dHa_12;
        dHa_1 a2;
        dHa_1 dHa_13 = a2;
        double d2 = a2.I.la - dHa_13.I.c;
        double d3 = dHa_13.I.A - a2.I.r;
        double d4 = d2;
        double d5 = d3;
        if (d4 * d4 + d5 * d5 > Ata.I) {
            dHa_1 dHa_14 = a2;
            dHa_1 dHa_15 = a2;
            dHa_14.I.ba = dHa_15.I.X;
            dHa_1 dHa_16 = a2;
            dHa_14.I.t = dHa_16.J(a2.I.ba, dHa_16.I.t, CRa.d);
            dHa_14.A = dHa_15.I.t;
            dHa_14.J = uSa.E;
            return;
        }
        float f2 = CRa.d;
        if (Math.abs(a2.I.t - a2.A) > qta.D) {
            dHa_1 dHa_17 = a2;
            dHa_12 = dHa_17;
            dHa_17.J = uSa.E;
            dHa_17.A = dHa_17.I.t;
        } else {
            dHa_1 dHa_18 = a2;
            dHa_18.J += vRa.d;
            if (dHa_18.J > NTa.C) {
                f2 = Math.max(pqa.r - (float)(a2.J - NTa.C) / FRa.Ga, JPa.N) * CRa.d;
            }
            dHa_12 = a2;
        }
        dHa_1 dHa_19 = a2;
        dHa_12.I.ba = dHa_19.J(a2.I.t, dHa_19.I.ba, f2);
    }

    public dHa_1(Gl gl2) {
        dHa_1 b2 = gl2;
        dHa_1 a2 = this;
        a2.I = b2;
    }
}

