/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  ISa
 *  JPa
 *  Oz
 *  Yfa
 *  aSa
 *  kta
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Vfa_3 {
    public boolean M;
    public double k;
    public double j;
    public double J;
    public double A;
    public Yfa I;

    /*
     * WARNING - void declaration
     */
    public float J(float f2, float f3, float f4) {
        float f5;
        void a2;
        float f6;
        float b2;
        float d2 = f2;
        Vfa_3 c2 = this;
        b2 = Oz.f((float)(b2 - d2));
        if (f6 > a2) {
            b2 = a2;
        }
        if (b2 < -a2) {
            b2 = -a2;
        }
        d2 += b2;
        if (f5 < JPa.N) {
            return d2 += CRa.ja;
        }
        if (d2 > CRa.ja) {
            d2 -= CRa.ja;
        }
        return d2;
    }

    public boolean J() {
        Vfa_3 a2;
        return a2.M;
    }

    public double C() {
        Vfa_3 a2;
        return a2.J;
    }

    public Vfa_3(Yfa yfa2) {
        Vfa_3 a2;
        Vfa_3 b2 = yfa2;
        Vfa_3 vfa_3 = a2 = this;
        Vfa_3 vfa_32 = b2;
        a2.I = b2;
        a2.j = ((Yfa)vfa_32).la;
        vfa_3.k = ((Yfa)vfa_32).Z;
        vfa_3.A = ((Yfa)b2).A;
    }

    public double l() {
        Vfa_3 a2;
        return a2.k;
    }

    public void J() {
        Vfa_3 vfa_3;
        Vfa_3 vfa_32 = vfa_3 = this;
        vfa_32.I.M(JPa.N);
        if (vfa_32.M) {
            Vfa_3 vfa_33 = vfa_3;
            vfa_33.M = uSa.E;
            int a22 = Oz.f((double)(vfa_33.I.J().j + kTa.B));
            double d2 = vfa_33.j - vfa_3.I.la;
            double d3 = vfa_33.A - vfa_3.I.A;
            double d4 = vfa_33.k - (double)a22;
            double d5 = d2;
            double d6 = d4;
            double d7 = d3;
            if (d5 * d5 + d6 * d6 + d7 * d7 >= Ata.I) {
                float a22 = (float)(Oz.f((double)d3, (double)d2) * kta.Da / lQa.f) - ISa.a;
                Vfa_3 vfa_34 = vfa_3;
                vfa_3.I.X = vfa_34.J(vfa_34.I.X, a22, NSa.B);
                vfa_34.I.C((float)(vfa_3.J * vfa_3.I.J(Kha.j).f()));
                if (d4 > aSa.V) {
                    double d8 = d2;
                    double d9 = d3;
                    if (d8 * d8 + d9 * d9 < oua.i) {
                        vfa_3.I.J().J();
                    }
                }
            }
        }
    }

    public void J(double d2, double c2, double b2, double a2) {
        Vfa_3 e2;
        Vfa_3 vfa_3 = e2;
        Vfa_3 vfa_32 = e2;
        vfa_32.j = d2;
        vfa_32.k = c2;
        vfa_3.A = b2;
        vfa_3.J = a2;
        vfa_3.M = vRa.d;
    }

    public double f() {
        Vfa_3 a2;
        return a2.j;
    }

    public double J() {
        Vfa_3 a2;
        return a2.A;
    }
}

