/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  GDa
 *  ISa
 *  JPa
 *  Ofa
 *  Oz
 *  Vfa
 *  Yfa
 *  ZRa
 *  kta
 *  pua
 *  vRa
 */
public final class kfa_2
extends Vfa {
    private GDa I;

    public void J() {
        kfa_2 kfa_22 = this;
        if (kfa_22.M && !kfa_22.I.J().f()) {
            kfa_2 kfa_23 = kfa_22;
            double d2 = kfa_23.j - kfa_22.I.la;
            kfa_2 kfa_24 = kfa_22;
            double d3 = kfa_23.k - kfa_24.I.Z;
            double d4 = kfa_24.A - kfa_22.I.A;
            double d5 = d2;
            double d6 = d3;
            double d7 = d4;
            double d8 = d5 * d5 + d6 * d6 + d7 * d7;
            d8 = Oz.J((double)d8);
            d3 /= d8;
            float a22 = (float)(Oz.f((double)d4, (double)d2) * kta.Da / lQa.f) - ISa.a;
            kfa_2 kfa_25 = kfa_22;
            kfa_23.I.X = kfa_25.J(kfa_25.I.X, a22, NSa.B);
            kfa_23.I.ba = kfa_22.I.X;
            a22 = (float)(kfa_23.J * kfa_22.I.J(Kha.j).f());
            kfa_23.I.C(kfa_22.I.D() + (a22 - kfa_22.I.D()) * Mqa.N);
            double d9 = Math.sin((double)(kfa_23.I.g + kfa_22.I.M()) * kTa.B) * fPa.ca;
            double d10 = Math.cos(kfa_23.I.X * pua.j / Hra.Ga);
            double d11 = Math.sin(kfa_23.I.X * pua.j / Hra.Ga);
            kfa_23.I.f(kfa_22.I.i + d9 * d10);
            kfa_23.I.l(kfa_22.I.f + d9 * d11);
            d9 = Math.sin((double)(kfa_23.I.g + kfa_22.I.M()) * Bsa.x) * fPa.ca;
            kfa_23.I.J(kfa_22.I.Ea + d9 * (d11 + d10) * VPa.W);
            kfa_23.I.J(kfa_22.I.Ea + (double)kfa_22.I.D() * d3 * tpa.k);
            Ofa a22 = kfa_23.I.J();
            d2 = kfa_23.I.la + d2 / d8 * KPa.y;
            d3 = (double)kfa_23.I.l() + kfa_22.I.Z + d3 / d8 * oua.i;
            d4 = kfa_23.I.A + d4 / d8 * KPa.y;
            Ofa ofa2 = a22;
            d8 = ofa2.l();
            d9 = ofa2.f();
            d10 = ofa2.J();
            if (!ofa2.J()) {
                d8 = d2;
                d9 = d3;
                d10 = d4;
            }
            kfa_2 kfa_26 = kfa_22;
            double d12 = d8;
            double d13 = d9;
            double d14 = d10;
            kfa_26.I.J().J(d12 + (d2 - d12) * fqa.ca, d13 + (d3 - d13) * fqa.ca, d14 + (d4 - d14) * fqa.ca, FRa.Ga, ZRa.l);
            GDa.J((GDa)kfa_26.I, vRa.d != 0);
            return;
        }
        kfa_2 kfa_27 = kfa_22;
        kfa_27.I.C(JPa.N);
        GDa.J((GDa)kfa_27.I, uSa.E != 0);
    }

    public kfa_2(GDa gDa2) {
        kfa_2 b2 = gDa2;
        kfa_2 a2 = this;
        super((Yfa)b2);
        a2.I = b2;
    }
}

