/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  GC
 *  JPa
 *  Kpa
 *  Lz
 *  MQa
 *  Oz
 *  SOa
 *  XTa
 *  Yra
 *  aKa
 *  aSa
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  vL
 */
import net.minecraft.util.ResourceLocation;

public final class iLa_3
extends GC<Fga> {
    private static final ResourceLocation I = new ResourceLocation(PRa.T);

    public ResourceLocation J(Fga fga2) {
        Object b2 = fga2;
        iLa_3 a2 = this;
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Fga fga2, double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        Object g2 = fga2;
        iLa_3 f4 = this;
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        uKa.o();
        uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
        f4.f((vL)g2);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        uKa.J((float)(Hra.Ga - f4.A.c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(-f4.A.l), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        aKa aKa3 = aKa2;
        aKa2.J(XTa.W, mka.g);
        aKa3.J(KPa.I, KPa.I, aSa.V).J(BQa.R, SOa.J).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J(kTa.B, KPa.I, aSa.V).J(fqa.ca, SOa.J).J(JPa.N, pqa.r, JPa.N).M();
        aKa2.J(kTa.B, kTa.B, aSa.V).J(fqa.ca, fqa.ca).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J(KPa.I, kTa.B, aSa.V).J(BQa.R, fqa.ca).J(JPa.N, pqa.r, JPa.N).M();
        pKa2.J();
        uKa.E();
        uKa.D();
        if (((Fga)((Object)g2)).v != null) {
            void b2;
            int n2;
            void a2;
            Object object = g2;
            float f5 = Oz.d((float)(Oz.J((float)((Fga)((Object)object)).v.f((float)a2)) * pua.j));
            Lz lz2 = new Lz(APa.g, mPa.ia, LPa.e);
            Object object2 = g2;
            lz2 = lz2.f((float)(-(((Fga)((Object)object2)).v.o + (((Fga)((Object)g2)).v.d - ((Fga)((Object)g2)).v.o) * a2) * pua.j / Hra.Ga));
            lz2 = lz2.J(-(((Fga)((Object)g2)).v.s + (((Fga)((Object)g2)).v.X - ((Fga)((Object)g2)).v.s) * a2) * pua.j / Hra.Ga);
            lz2 = lz2.J(f5 * MQa.L);
            lz2 = lz2.f(-f5 * ZSa.q);
            float f6 = ((Fga)((Object)object)).v.c + (((Fga)((Object)g2)).v.la - ((Fga)((Object)g2)).v.c) * (double)a2 + lz2.A;
            double d6 = ((Fga)((Object)object2)).v.ba + (((Fga)((Object)g2)).v.Z - ((Fga)((Object)g2)).v.ba) * (double)a2 + lz2.j;
            double d7 = ((Fga)((Object)object)).v.r + (((Fga)((Object)g2)).v.A - ((Fga)((Object)g2)).v.r) * (double)a2 + lz2.J;
            double d8 = ((Fga)((Object)object)).v.l();
            if (f4.A.b != null && f4.A.b.ld > 0 || ((Fga)((Object)g2)).v != Kpa.J().c) {
                Object object3 = g2;
                Object object4 = g2;
                float f7 = (((Fga)((Object)object3)).v.Ma + (((Fga)((Object)object4)).v.ba - ((Fga)((Object)g2)).v.Ma) * a2) * pua.j / Hra.Ga;
                double d9 = Oz.d((float)f7);
                double d10 = Oz.C((float)f7);
                f6 = ((Fga)((Object)object3)).v.c + (((Fga)((Object)g2)).v.la - ((Fga)((Object)g2)).v.c) * (double)a2 - d10 * LPa.e - d9 * Jra.A;
                d6 = ((Fga)((Object)object4)).v.ba + d8 + (((Fga)((Object)g2)).v.Z - ((Fga)((Object)g2)).v.ba) * (double)a2 - BQa.ia;
                d7 = ((Fga)((Object)object3)).v.r + (((Fga)((Object)g2)).v.A - ((Fga)((Object)g2)).v.r) * (double)a2 - d9 * LPa.e + d10 * Jra.A;
                d8 = ((Fga)((Object)object3)).v.q() ? Fua.l : aSa.V;
            }
            Object object5 = g2;
            Object object6 = g2;
            reference var22_18 = ((Fga)((Object)object5)).c + (((Fga)((Object)object6)).la - ((Fga)((Object)g2)).c) * (double)a2;
            double d11 = ((Fga)((Object)object6)).ba + (((Fga)((Object)g2)).Z - ((Fga)((Object)g2)).ba) * (double)a2 + VPa.W;
            double d12 = ((Fga)((Object)object5)).r + (((Fga)((Object)g2)).A - ((Fga)((Object)g2)).r) * (double)a2;
            f6 = (float)((double)(f6 - var22_18));
            d6 = (double)((float)(d6 - d11)) + d8;
            d7 = (float)(d7 - d12);
            uKa.z();
            uKa.L();
            aKa2.J(yRa.d, mka.I);
            int n3 = n2 = uSa.E;
            while (n3 <= ERa.C) {
                float f8;
                float f7 = f8 = (float)n2 / Yra.i;
                aKa2.J((double)(e2 + f6 * (double)f8), (double)(d5 + d6 * (double)(f7 * f7 + f8) * kTa.B + VPa.W), (double)(c2 + d7 * (double)f8)).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                n3 = ++n2;
            }
            pKa2.J();
            uKa.P();
            uKa.H();
            super.l((vL)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
        }
    }

    public iLa_3(oLa oLa2) {
        Object b2 = oLa2;
        iLa_3 a2 = this;
        super((oLa)b2);
    }
}

