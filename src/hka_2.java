/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  GC
 *  JPa
 *  Kpa
 *  XTa
 *  aKa
 *  aSa
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  vL
 */
import net.minecraft.util.ResourceLocation;

public final class hka_2
extends GC<oEa> {
    private float A;

    /*
     * WARNING - void declaration
     */
    public hka_2(oLa oLa2, float f2) {
        void b2;
        float c2 = f2;
        hka_2 a2 = this;
        super((oLa)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(oEa oEa2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        hka_2 hka_22 = this;
        uKa.e();
        hka_22.f((vL)f4);
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        uKa.o();
        hka_2 hka_23 = hka_22;
        hka_2 hka_24 = hka_22;
        uKa.l((float)hka_23.A, (float)hka_24.A, (float)hka_22.A);
        KLa g22 = Kpa.J().J().J().J(Gea.j);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        KLa kLa2 = g22;
        float g22 = kLa2.l();
        float f5 = kLa2.C();
        float f6 = kLa2.J();
        float f7 = kLa2.f();
        uKa.J((float)(Hra.Ga - hka_22.A.c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(-hka_23.A.l), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        aKa aKa3 = aKa2;
        aKa3.J(XTa.W, mka.g);
        aKa3.J(KPa.I, Nta.a, aSa.V).J((double)g22, (double)f7).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J(kTa.B, Nta.a, aSa.V).J((double)f5, (double)f7).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J(kTa.B, Bsa.x, aSa.V).J((double)f5, (double)f6).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J(KPa.I, Bsa.x, aSa.V).J((double)g22, (double)f6).J(JPa.N, pqa.r, JPa.N).M();
        pKa2.J();
        uKa.E();
        uKa.D();
        super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    public ResourceLocation J(oEa oEa2) {
        Object b2 = oEa2;
        hka_2 a2 = this;
        return WKa.C;
    }
}

