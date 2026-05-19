/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  FPa
 *  JPa
 *  KA
 *  Kpa
 *  SQa
 *  Tpa
 *  XTa
 *  aSa
 *  bqa
 *  dQa
 *  gY
 *  hra
 *  nLa
 *  pqa
 *  pua
 *  sMa
 *  uKa
 *  vRa
 *  xKa
 */
import net.minecraft.util.ResourceLocation;

public final class hOa_2
extends KA {
    private static final ResourceLocation E = new ResourceLocation(Eqa.V);
    private boolean m;
    private int C;
    private int i;
    private long M;
    private gY k;
    private String j;
    private xKa J;
    private Kpa A;
    private String I;

    public void l() {
        hOa_2 a2;
        hOa_2 hOa_22 = a2;
        hOa_22.k = null;
        hOa_22.M = nqa.i;
    }

    public void f(gY gY2) {
        hOa_2 a2;
        hOa_2 b2 = gY2;
        hOa_2 hOa_22 = a2 = this;
        hOa_2 hOa_23 = a2;
        hOa_23.j = b2.f().f();
        hOa_23.I = b2.J();
        hOa_22.M = Kpa.J() + FPa.h;
        hOa_22.k = b2;
        hOa_22.m = vRa.d;
    }

    public void f() {
        hOa_2 hOa_22 = this;
        if (hOa_22.k != null && hOa_22.M != nqa.i && Kpa.J().c != null) {
            double d2;
            double d3;
            double d4 = (double)(Kpa.J() - hOa_22.M) / Wqa.Ea;
            if (!hOa_22.m) {
                if (d4 < aSa.V || d4 > oua.i) {
                    hOa_22.M = nqa.i;
                    return;
                }
            } else if (d4 > kTa.B) {
                d4 = kTa.B;
            }
            hOa_22.J();
            uKa.u();
            uKa.J(uSa.E != 0);
            d4 *= KPa.y;
            if (d3 > oua.i) {
                d4 = KPa.y - d4;
            }
            d4 *= FPa.T;
            d4 = oua.i - d4;
            if (d2 < aSa.V) {
                d4 = aSa.V;
            }
            double d5 = d4;
            d4 = d5 * d5;
            d4 *= d4;
            hOa_2 hOa_23 = hOa_22;
            int a2 = hOa_23.C - rRa.f;
            int n2 = uSa.E - (int)(d4 * Qra.l);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.H();
            hOa_23.A.J().J(E);
            uKa.L();
            hOa_23.f(a2, n2, zua.m, bqa.P, rRa.f, fPa.i);
            if (hOa_23.m) {
                hOa_22.A.Ea.J(hOa_22.I, a2 + Fsa.d, n2 + XTa.W, sOa.D, pua.o);
            } else {
                hOa_22.A.Ea.J(hOa_22.j, a2 + Fsa.d, n2 + XTa.W, DQa.ja);
                hOa_22.A.Ea.J(hOa_22.I, a2 + Fsa.d, n2 + yOa.B, pua.o);
            }
            nLa.J();
            uKa.L();
            uKa.o();
            uKa.a();
            uKa.P();
            hOa_2 hOa_24 = hOa_22;
            hOa_24.J.f(hOa_24.k.theItemStack, a2 + Yqa.i, n2 + Yqa.i);
            uKa.L();
            uKa.J(vRa.d != 0);
            uKa.J();
        }
    }

    public hOa_2(Kpa kpa2) {
        hOa_2 a2;
        hOa_2 b2 = kpa2;
        hOa_2 hOa_22 = a2 = this;
        hOa_22.A = b2;
        hOa_22.J = b2.J();
    }

    public void J(gY gY2) {
        hOa_2 b2 = gY2;
        hOa_2 a2 = this;
        a2.j = oha.J(vTa.ha, new Object[uSa.E]);
        hOa_2 hOa_22 = a2;
        a2.I = b2.f().f();
        hOa_22.M = Kpa.J();
        hOa_22.k = b2;
        hOa_22.m = uSa.E;
    }

    private void J() {
        hOa_2 hOa_22 = this;
        uKa.f((int)uSa.E, (int)uSa.E, (int)hOa_22.A.t, (int)hOa_22.A.k);
        uKa.G((int)WPa.s);
        uKa.y();
        uKa.G((int)SQa.ca);
        uKa.y();
        hOa_2 hOa_23 = hOa_22;
        hOa_23.C = hOa_23.A.t;
        hOa_23.i = hOa_23.A.k;
        hOa_2 a2 = new sMa(hOa_22.A);
        hOa_23.C = a2.f();
        hOa_23.i = a2.J();
        uKa.A((int)hra.Ja);
        uKa.G((int)WPa.s);
        uKa.y();
        uKa.J((double)aSa.V, (double)hOa_22.C, (double)hOa_22.i, (double)aSa.V, (double)Tpa.M, (double)Wqa.Ea);
        uKa.G((int)SQa.ca);
        uKa.y();
        uKa.J((float)JPa.N, (float)JPa.N, (float)dQa.o);
    }
}

