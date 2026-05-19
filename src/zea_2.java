/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gl
 *  MQa
 *  Oz
 *  gFa
 *  kta
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zea_2
extends gFa {
    private int J;
    private Zfa A;
    private int I;

    public void J() {
        zea_2 a2;
        a2.A.k(uSa.E != 0);
    }

    public void l() {
        a.I = uSa.E;
    }

    public zea_2(Zfa zfa2) {
        zea_2 a2;
        Object b2 = zfa2;
        zea_2 zea_22 = a2 = this;
        zea_22.A = b2;
        zea_22.J(yRa.d);
    }

    public void f() {
        zea_2 zea_22;
        double d2;
        zea_2 zea_23;
        zea_2 zea_24 = zea_23 = this;
        zea_24.J -= vRa.d;
        zea_2 a2 = zea_24.A.C();
        double d3 = zea_24.A.J((vL)a2);
        if (d2 < FPa.T) {
            if (zea_23.J <= 0) {
                zea_23.J = kTa.j;
                zea_23.A.C((vL)a2);
            }
            zea_2 zea_25 = zea_23;
            zea_22 = zea_25;
            zea_25.A.J().J(((Gl)a2).la, ((Gl)a2).Z, ((Gl)a2).A, oua.i);
        } else if (d3 < ZSa.o) {
            zea_2 zea_26 = a2;
            double d4 = ((Gl)zea_26).la - zea_23.A.la;
            double d5 = zea_26.J().j + (double)(((Gl)a2).u / kta.v) - (zea_23.A.Z + (double)(zea_23.A.u / kta.v));
            zea_2 zea_27 = zea_23;
            double d6 = ((Gl)zea_26).A - zea_27.A.A;
            if (zea_27.J <= 0) {
                zea_2 zea_28;
                zea_2 zea_29 = zea_23;
                zea_29.I += vRa.d;
                if (zea_29.I == vRa.d) {
                    zea_2 zea_210 = zea_23;
                    zea_28 = zea_210;
                    zea_210.J = Psa.M;
                    zea_210.A.k(vRa.d != 0);
                } else if (zea_23.I <= AQa.P) {
                    zea_28 = zea_23;
                    zea_23.J = uua.p;
                } else {
                    zea_2 zea_211 = zea_23;
                    zea_28 = zea_211;
                    zea_211.J = ySa.T;
                    zea_211.I = uSa.E;
                    zea_211.A.k(uSa.E != 0);
                }
                if (zea_28.I > vRa.d) {
                    int n2;
                    float f2 = Oz.J((float)Oz.J((double)d3)) * MQa.L;
                    zea_23.A.j.J((Sx)null, WRa.S, new XF((int)zea_23.A.la, (int)zea_23.A.Z, (int)zea_23.A.A), uSa.E);
                    int n3 = n2 = uSa.E;
                    while (n3 < vRa.d) {
                        ZDa zDa2 = new ZDa(zea_23.A.j, (Gl)zea_23.A, d4 + zea_23.A.J().nextGaussian() * (double)f2, d5, d6 + zea_23.A.J().nextGaussian() * (double)f2);
                        zea_2 zea_212 = zea_23;
                        new ZDa(zea_23.A.j, (Gl)zea_23.A, d4 + zea_23.A.J().nextGaussian() * (double)f2, d5, d6 + zea_23.A.J().nextGaussian() * (double)f2).Z = zea_212.A.Z + (double)(zea_23.A.u / kta.v) + kTa.B;
                        zea_212.A.j.f((vL)zDa2);
                        n3 = ++n2;
                    }
                }
            }
            zea_2 zea_213 = zea_23;
            zea_22 = zea_213;
            zea_213.A.J().J((vL)a2, FRa.Ga, FRa.Ga);
        } else {
            zea_2 zea_214 = zea_23;
            zea_22 = zea_214;
            zea_214.A.J().f();
            zea_214.A.J().J(((Gl)a2).la, ((Gl)a2).Z, ((Gl)a2).A, oua.i);
        }
        super.f();
    }

    public boolean f() {
        zea_2 zea_22 = this;
        zea_2 a2 = zea_22.A.C();
        if (a2 != null && a2.K()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

