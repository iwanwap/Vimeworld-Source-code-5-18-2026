/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  ERa
 *  KA
 *  NT
 *  Ws
 *  gT
 *  pQa
 *  pqa
 *  pua
 *  sT
 *  vRa
 */
import java.awt.Color;

public final class sT_3 {
    public final /* synthetic */ CS g;
    public int L;
    private boolean E;
    private final int m;
    private final int C;
    public int i;
    private final int M;
    private final gT k;
    private final gT j;
    private final int J;
    private final int A;
    private final gT I;

    public void f() {
        sT_3 a2;
        sT_3 sT_32 = a2;
        sT_3 sT_33 = a2;
        sT_3 sT_34 = a2;
        sT_3 sT_35 = a2;
        sT_32.g.f(CS.J((CS)sT_33.g).Ea, mPa.X, sT_34.M + (sT_34.m - a2.m / AQa.P) / uqa.g, sT_35.A + (sT_35.C - Yqa.i) / uqa.g, pQa.P);
        sT_3 sT_36 = a2;
        sT_3 sT_37 = a2;
        KA.J((int)(sT_32.M + a2.m - a2.m / AQa.P), (int)sT_36.A, (int)(sT_36.M + a2.m), (int)(sT_37.A + sT_37.C), (int)uua.n);
        sT_3 sT_38 = a2;
        sT_3 sT_39 = a2;
        KA.J((int)(sT_33.M + a2.m - a2.m / AQa.P + vRa.d), (int)(a2.A + vRa.d), (int)(sT_38.M + sT_38.m - vRa.d), (int)(sT_39.A + sT_39.C - vRa.d), (int)a2.L);
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        sT_3 a2 = this;
        if (a2.E != b2) {
            sT_3 sT_32 = a2;
            sT_32.E = b2;
            sT_32.k.J = b2;
            sT_32.j.J = b2;
            sT_32.I.J = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sT_3(CS cS2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void h22;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        sT_3 a2;
        int n8 = n7;
        sT_3 sT_32 = a2 = this;
        sT_3 sT_33 = a2;
        a2.g = g2;
        a2.E = vRa.d;
        a2.J = f2;
        sT_33.M = e2;
        sT_33.A = d2;
        sT_32.m = c2;
        sT_32.C = b2;
        float[] h22 = Color.RGBtoHSB(h22 >> ERa.C & osa.Ja, h22 >> Yqa.i & osa.Ja, h22 & osa.Ja, null);
        sT_3 sT_34 = a2;
        sT_34.k = new Ws((CS)g2, (sT)a2, (int)f2, (int)e2, (int)(d2 + (AQa.P + b2)), (int)c2, (int)b2, LPa.Ja, h22[uSa.E]);
        CS.J((CS)g2).add(a2.k);
        a2.j = new NT((CS)g2, (sT)a2, (int)f2, (int)e2, (int)(d2 + (AQa.P + b2) * uqa.g), (int)c2, (int)b2, mSa.i, h22[vRa.d], pua.o);
        CS.l((CS)g2).add(a2.j);
        a2.I = new NT((CS)g2, (sT)a2, (int)f2, (int)e2, (int)(d2 + (AQa.P + b2) * yRa.d), (int)c2, (int)b2, fqa.t, h22[uqa.g], gsa.X);
        CS.f((CS)g2).add(a2.I);
        a2.J();
    }

    public void J() {
        sT_3 a2;
        sT_3 sT_32 = a2;
        sT_32.i = Color.HSBtoRGB(sT_32.k.J, pqa.r, pqa.r);
        sT_32.L = Color.HSBtoRGB(sT_32.k.J, a2.j.J, a2.I.J);
    }
}

