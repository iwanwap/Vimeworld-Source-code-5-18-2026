/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  NTa
 *  Oz
 *  Yfa
 *  bpa
 *  eAa
 *  jFa
 *  mFa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  yDa
 */
public final class Iga_3
extends eGa {
    private mFa A;
    private int I;

    public Iga_3(mFa mFa2) {
        Iga_3 b2 = mFa2;
        Iga_3 a2 = this;
        super((Yfa)b2, mFa.class, vQa.q, WRa.e);
        a2.A = b2;
    }

    public void f() {
        Iga_3 iga_3;
        Iga_3 iga_32 = iga_3 = this;
        super.f();
        if (iga_32.I > 0) {
            Iga_3 iga_33 = iga_3;
            iga_33.I -= vRa.d;
            if (iga_33.I == 0) {
                int n2;
                yDa yDa2 = iga_3.A.J();
                int n3 = n2 = uSa.E;
                while (n3 < yDa2.f()) {
                    Iga_3 a22 = yDa2.J(n2);
                    Mda mda2 = null;
                    if (a22 != null) {
                        int n4;
                        Iga_3 iga_34;
                        eAa eAa2 = a22.J();
                        if ((eAa2 == Gea.Ra || eAa2 == Gea.cA || eAa2 == Gea.EB) && ((Mda)a22).E > yRa.d) {
                            Iga_3 iga_35 = a22;
                            iga_34 = iga_35;
                            n4 = ((Mda)iga_35).E / uqa.g;
                            ((Mda)iga_35).E -= n4;
                            mda2 = new Mda(eAa2, n4, a22.J());
                        } else {
                            if (eAa2 == Gea.DC && ((Mda)a22).E > tTa.h) {
                                Iga_3 iga_36 = a22;
                                n4 = ((Mda)iga_36).E / uqa.g / yRa.d * yRa.d;
                                int n5 = n4 / yRa.d;
                                ((Mda)iga_36).E -= n4;
                                mda2 = new Mda(Gea.Ra, n5, uSa.E);
                            }
                            iga_34 = a22;
                        }
                        if (((Mda)iga_34).E <= 0) {
                            yDa2.J(n2, (Mda)null);
                        }
                    }
                    if (mda2 != null) {
                        Iga_3 iga_37 = iga_3;
                        Iga_3 iga_38 = iga_3;
                        double d2 = iga_37.A.Z - osa.b + (double)iga_38.A.l();
                        jFa jFa2 = new jFa(iga_3.A.j, iga_3.A.la, d2, iga_3.A.A, mda2);
                        float a22 = bpa.K;
                        float f2 = iga_38.A.t;
                        float f3 = iga_37.A.d;
                        jFa jFa3 = jFa2;
                        float f4 = f2;
                        jFa2.f((double)(-Oz.d((float)(f4 / Hra.Ga * pua.j)) * Oz.C((float)(f3 / Hra.Ga * pua.j)) * a22));
                        jFa3.l((double)(Oz.C((float)(f4 / Hra.Ga * pua.j)) * Oz.C((float)(f3 / Hra.Ga * pua.j)) * a22));
                        jFa3.J((double)(-Oz.d((float)(f3 / Hra.Ga * pua.j)) * a22 + Nra.e));
                        jFa3.l();
                        iga_37.A.j.f((vL)jFa2);
                        return;
                    }
                    n3 = ++n2;
                }
            }
        }
    }

    public void l() {
        Iga_3 a2;
        Iga_3 iga_3 = a2;
        super.l();
        if (iga_3.A.O() && a2.M instanceof mFa && ((mFa)a2.M).Ha()) {
            a2.I = NTa.C;
            return;
        }
        a2.I = uSa.E;
    }
}

