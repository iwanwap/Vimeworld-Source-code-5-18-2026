/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yfa
 *  gFa
 *  kPa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SIa_3
extends gFa {
    private Yfa j;
    private double J;
    private int A;
    private double I;

    public boolean l() {
        SIa_3 a2;
        if (a2.A >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        SIa_3 a2;
        double d2 = kPa.Z * a2.j.J().nextDouble();
        SIa_3 sIa_3 = a2;
        double d3 = d2;
        sIa_3.J = Math.cos(d3);
        sIa_3.I = Math.sin(d3);
        a2.A = kTa.j + a2.j.J().nextInt(kTa.j);
    }

    public SIa_3(Yfa yfa2) {
        SIa_3 a2;
        SIa_3 b2 = yfa2;
        SIa_3 sIa_3 = a2 = this;
        sIa_3.j = b2;
        sIa_3.J(yRa.d);
    }

    public boolean f() {
        SIa_3 a2;
        if (a2.j.J().nextFloat() < WRa.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        SIa_3 a2;
        SIa_3 sIa_3 = a2;
        sIa_3.A -= vRa.d;
        sIa_3.j.J().J(a2.j.la + a2.J, a2.j.Z + (double)a2.j.l(), a2.j.A + a2.I, FRa.Ga, (float)a2.j.F());
    }
}

