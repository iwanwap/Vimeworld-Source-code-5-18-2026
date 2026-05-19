/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gl
 *  Oz
 *  Yfa
 *  Zta
 *  gFa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qga_1
extends gFa {
    public Gl J;
    public Yfa A;
    public float I;

    public void l() {
        Qga_1 qga_1;
        Qga_1 qga_12 = qga_1 = this;
        double d2 = qga_12.J.la - qga_1.A.la;
        Qga_1 qga_13 = qga_1;
        double d3 = qga_12.J.A - qga_13.A.A;
        double d4 = d2;
        double d5 = d3;
        float a2 = Oz.J((double)(d4 * d4 + d5 * d5));
        qga_13.A.f(qga_1.A.i + d2 / (double)a2 * kTa.B * GPa.fa + qga_1.A.i * Bua.Ia);
        qga_12.A.l(qga_1.A.f + d3 / (double)a2 * kTa.B * GPa.fa + qga_1.A.f * Bua.Ia);
        qga_12.A.J((double)qga_1.I);
    }

    public boolean l() {
        Qga_1 a2;
        if (!a2.A.ha) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        double d2;
        Qga_1 a2;
        Qga_1 qga_1 = a2;
        qga_1.J = qga_1.A.C();
        if (qga_1.J == null) {
            return uSa.E != 0;
        }
        Qga_1 qga_12 = a2;
        double d3 = qga_12.A.J((vL)qga_12.J);
        if (d2 >= FPa.T && d3 <= Zta.ba) {
            if (!a2.A.ha) {
                return uSa.E != 0;
            }
            if (a2.A.J().nextInt(tTa.h) == 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Qga_1(Yfa yfa, float f2) {
        void b2;
        float c2 = f2;
        Qga_1 a2 = this;
        a2.A = b2;
        a2.I = c2;
        a2.J(tTa.h);
    }
}

