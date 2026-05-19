/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GDa
 *  Gg
 *  Gl
 *  JPa
 *  Kpa
 *  Lra
 *  MQa
 *  Oz
 *  Ssa
 *  Tpa
 *  aKa
 *  aSa
 *  cQa
 *  kpa
 *  nka
 *  pqa
 *  pua
 *  ska
 *  uKa
 *  vL
 *  vRa
 */
public final class rJa_3
extends ska {
    private Gl I;

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f5;
        rJa_3 c2 = this;
        if (c2.I != null) {
            void g2;
            float i2;
            void f9;
            oLa h2 = Kpa.J().J();
            h2.J(ska.C, ska.k, ska.j);
            float e2 = IPa.z;
            float d2 = ((float)c2.D + f9) / (float)c2.A;
            uKa.J(vRa.d != 0);
            uKa.B();
            uKa.J();
            uKa.f((int)Lra.k, (int)kpa.J);
            float f10 = i2 = xra.Ga;
            nka.J((int)nka.P, (float)f10, (float)f10);
            uKa.e();
            i2 = Yqa.C + MQa.L * Oz.d((float)(d2 * pua.j));
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)i2);
            uKa.J((float)JPa.N, (float)Ssa.la, (float)JPa.N);
            uKa.J((float)(Hra.Ga - g2.X), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)(gua.l - cQa.Ha * d2 - g2.d), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)JPa.N, (float)Tpa.S, (float)FRa.ca);
            float f11 = e2;
            uKa.l((float)f11, (float)f11, (float)f11);
            c2.I.X = c2.I.s = JPa.N;
            rJa_3 rJa_32 = c2;
            rJa_32.I.t = rJa_32.I.ga = JPa.N;
            h2.J((vL)c2.I, aSa.V, aSa.V, aSa.V, JPa.N, (float)f9);
            uKa.D();
            uKa.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public rJa_3(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        rJa_3 e2 = gg2;
        rJa_3 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2, aSa.V, aSa.V, aSa.V);
        d5.a = d5.J = pqa.r;
        d5.l = d5.J;
        rJa_3 rJa_32 = d5;
        rJa_32.f(aSa.V);
        rJa_32.J(aSa.V);
        rJa_32.l(aSa.V);
        rJa_32.m = JPa.N;
        rJa_32.A = Fsa.d;
    }

    public int J() {
        return yRa.d;
    }

    public void d() {
        rJa_3 rJa_32;
        rJa_3 rJa_33 = rJa_32 = this;
        super.d();
        if (rJa_33.I == null) {
            rJa_3 a2;
            rJa_3 rJa_34 = a2 = new GDa(rJa_32.j);
            rJa_34.N();
            rJa_32.I = rJa_34;
        }
    }
}

