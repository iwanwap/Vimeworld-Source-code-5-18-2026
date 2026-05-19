/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fka
 *  Gl
 *  ISa
 *  Ika
 *  JPa
 *  Jla
 *  Lra
 *  MQa
 *  NTa
 *  Oz
 *  Qsa
 *  XTa
 *  aKa
 *  aSa
 *  jRa
 *  kpa
 *  kta
 *  mka
 *  nLa
 *  pDa
 *  pKa
 *  pqa
 *  psa
 *  pua
 *  sd
 *  uKa
 *  uOa
 *  vL
 *  vRa
 *  wOa
 */
import net.minecraft.client.model.ModelDragon;
import net.minecraft.util.ResourceLocation;

public final class Ika_2
extends ic<pDa> {
    private static final ResourceLocation j;
    public ModelDragon J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public void J(pDa pDa2, float f2, float f3, float f4) {
        void a2;
        void d2;
        float e2 = f2;
        Ika_2 c2 = this;
        void v0 = d2;
        e2 = (float)v0.J(XTa.W, (float)a2)[uSa.E];
        void v1 = d2;
        float b2 = (float)(v0.J(tTa.h, (float)a2)[vRa.d] - v1.J(NTa.C, (float)a2)[vRa.d]);
        uKa.J((float)(-e2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(b2 * FRa.Ga), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)JPa.N, (float)JPa.N, (float)pqa.r);
        if (v1.a > 0) {
            float f5;
            e2 = ((float)d2.a + a2 - pqa.r) / eta.e * ySa.Da;
            e2 = Oz.J((float)e2);
            if (f5 > pqa.r) {
                e2 = pqa.r;
            }
            uKa.J((float)(e2 * c2.J((Gl)d2)), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
    }

    public Ika_2(oLa oLa2) {
        Ika_2 a2;
        Object b2 = oLa2;
        Ika_2 ika_2 = a2 = this;
        super((oLa)b2, new ModelDragon(JPa.N), MQa.L);
        ika_2.J = (ModelDragon)ika_2.C;
        Ika_2 ika_22 = a2;
        ika_22.f(new Fka((Ika)ika_22));
        a2.f(new Jla());
    }

    /*
     * WARNING - void declaration
     */
    public void J(pDa pDa2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        Ika_2 h2 = pDa2;
        Ika_2 g2 = this;
        if (((pDa)h2).k > 0) {
            float f9 = (float)((pDa)h2).k / Qsa.U;
            uKa.I((int)Ira.A);
            uKa.K();
            uKa.J((int)jRa.m, (float)f9);
            g2.J(I);
            g2.C.J((vL)h2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
            uKa.J((int)jRa.m, (float)Nra.e);
            uKa.I((int)Jqa.e);
        }
        g2.f(h2);
        g2.C.J((vL)h2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
        if (((pDa)h2).ha > 0) {
            uKa.I((int)Jqa.e);
            uKa.z();
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.f((float)pqa.r, (float)JPa.N, (float)JPa.N, (float)MQa.L);
            g2.C.J((vL)h2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
            uKa.H();
            uKa.k();
            uKa.I((int)Ira.A);
        }
    }

    static {
        A = new ResourceLocation(csa.v);
        I = new ResourceLocation(ROa.f);
        j = new ResourceLocation(uOa.J);
    }

    public ResourceLocation J(pDa pDa2) {
        Ika_2 b2 = pDa2;
        Ika_2 a2 = this;
        return j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(pDa pDa2, double d2, double d3, double d4, float f2) {
        void b2;
        void c2;
        void d222;
        void a2;
        Ika_2 f222 = pDa2;
        Ika_2 e2 = this;
        Ika_2 ika_2 = f222;
        float f3 = Oz.d((float)(((float)((pDa)ika_2).g.J + a2) * psa.N)) / kta.v + MQa.L;
        f3 = (f3 * f3 + f3) * psa.N;
        Ika_2 ika_22 = f222;
        float f4 = (float)(((pDa)ika_2).g.la - ((pDa)ika_22).la - (((pDa)f222).c - ((pDa)f222).la) * (double)(pqa.r - a2));
        f3 = (float)((double)f3 + ((pDa)f222).g.Z - oua.i - ((pDa)f222).Z - (((pDa)f222).ba - ((pDa)f222).Z) * (double)(pqa.r - a2));
        float f5 = (float)(((pDa)ika_22).g.A - ((pDa)f222).A - (((pDa)f222).r - ((pDa)f222).A) * (double)(pqa.r - a2));
        float f6 = f4;
        float f7 = f5;
        float f8 = Oz.J((float)(f6 * f6 + f7 * f7));
        float f9 = f4;
        float f10 = f3;
        float f11 = f5;
        float f12 = Oz.J((float)(f9 * f9 + f10 * f10 + f11 * f11));
        uKa.e();
        uKa.J((float)((float)d222), (float)((float)c2 + kta.v), (float)((float)b2));
        uKa.J((float)((float)(-Math.atan2(f5, f4)) * Hra.Ga / pua.j - ISa.a), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)((float)(-Math.atan2(f8, f3)) * Hra.Ga / pua.j - ISa.a), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        pKa pKa2 = pKa.J();
        aKa d222 = pKa2.J();
        nLa.C();
        uKa.m();
        e2.J(A);
        uKa.F((int)gua.X);
        float f13 = JPa.N - ((float)((pDa)f222).g + a2) * Jpa.B;
        float f14 = f4;
        float f15 = f3;
        float f16 = f5;
        float f222 = Oz.J((float)(f14 * f14 + f15 * f15 + f16 * f16)) / Ura.m - ((float)((pDa)f222).g + a2) * Jpa.B;
        d222.J(tTa.h, mka.a);
        int n2 = a2 = uSa.E;
        while (n2 <= Yqa.i) {
            f3 = Oz.d((float)((float)(a2 % Yqa.i) * pua.j * kta.v / Qsa.k)) * wOa.w;
            f4 = Oz.C((float)((float)(a2 % Yqa.i) * pua.j * kta.v / Qsa.k)) * wOa.w;
            f5 = (float)(a2 % Yqa.i) * pqa.r / Qsa.k;
            aKa aKa2 = d222;
            aKa2.J((double)(f3 * psa.N), (double)(f4 * psa.N), aSa.V).J((double)f5, (double)f222).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
            aKa2.J((double)f3, (double)f4, (double)f12).J((double)f5, (double)f13).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
            n2 = ++a2;
        }
        pKa2.J();
        uKa.h();
        uKa.F((int)Zra.f);
        nLa.f();
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(pDa pDa2, double d2, double d3, double d4, float f2, float f3) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        float f5 = f3;
        Ika_2 a2 = this;
        void v0 = f4;
        KFa.J((sd)v0, uSa.E != 0);
        super.J(v0, (double)e2, (double)d5, (double)c2, (float)b2, (float)g2);
        if (v0.g != null) {
            a2.J((pDa)f4, (double)e2, (double)d5, (double)c2, (float)g2);
        }
    }
}

