/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  GC
 *  JPa
 *  MQa
 *  NQa
 *  Oz
 *  XE
 *  XTa
 *  aKa
 *  aSa
 *  bpa
 *  kta
 *  mka
 *  nka
 *  pKa
 *  pqa
 *  uKa
 *  vL
 *  wOa
 *  zEa
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class YKa_1
extends GC {
    private static final String A = "CL_00000993";
    private static final ResourceLocation I = new ResourceLocation(vTa.ba);

    /*
     * WARNING - void declaration
     */
    public void J(zEa zEa2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        int n2;
        void a2;
        void f4;
        void c2;
        void d5;
        void e2;
        YKa_1 yKa_1 = this;
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        yKa_1.f((vL)f4);
        void v0 = f4;
        int n3 = v0.f();
        float f5 = (float)(n3 % AQa.P * ERa.C + uSa.E) / EPa.r;
        float f6 = (float)(n3 % AQa.P * ERa.C + ERa.C) / EPa.r;
        float f7 = (float)(n3 / AQa.P * ERa.C + uSa.E) / EPa.r;
        float f8 = (float)(n3 / AQa.P * ERa.C + ERa.C) / EPa.r;
        float f9 = pqa.r;
        float f10 = MQa.L;
        float f11 = rta.o;
        int g2 = v0.J((float)a2);
        int n4 = g2 % opa.w;
        nka.J((int)nka.P, (float)((float)n4 / pqa.r), (float)((float)(g2 /= opa.w) / pqa.r));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        float f12 = ((float)v0.J + a2) / kta.v;
        g2 = (int)((Oz.d((float)(f12 + JPa.N)) + pqa.r) * MQa.L * NQa.Y);
        int n5 = (int)((Oz.d((float)(f12 + TOa.L)) + pqa.r) * Nra.e * NQa.Y);
        YKa_1 yKa_12 = yKa_1;
        uKa.J((float)(Hra.Ga - ((oLa)((Object)yKa_12.A)).c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(-((oLa)((Object)yKa_12.A)).l), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.l((float)bpa.K, (float)bpa.K, (float)bpa.K);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        aKa2.J(XTa.W, mka.D);
        int n6 = osa.Ja;
        if (Config.Fa() && (n2 = XE.J((float)f12)) >= 0) {
            g2 = n2 >> ERa.C & osa.Ja;
            n6 = n2 >> Yqa.i & osa.Ja;
            n5 = n2 >> uSa.E & osa.Ja;
        }
        aKa aKa3 = aKa2;
        aKa2.J((double)(JPa.N - f10), (double)(JPa.N - f11), aSa.V).J((double)f5, (double)f8).J(g2, n6, n5, XOa.h).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J((double)(f9 - f10), (double)(JPa.N - f11), aSa.V).J((double)f6, (double)f8).J(g2, n6, n5, XOa.h).J(JPa.N, pqa.r, JPa.N).M();
        aKa3.J((double)(f9 - f10), (double)(pqa.r - f11), aSa.V).J((double)f6, (double)f7).J(g2, n6, n5, XOa.h).J(JPa.N, pqa.r, JPa.N).M();
        aKa2.J((double)(JPa.N - f10), (double)(pqa.r - f11), aSa.V).J((double)f5, (double)f7).J(g2, n6, n5, XOa.h).J(JPa.N, pqa.r, JPa.N).M();
        pKa2.J();
        uKa.k();
        uKa.E();
        uKa.D();
        super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void l(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        float f5 = f3;
        YKa_1 a2 = this;
        a2.J((zEa)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)g2);
    }

    public ResourceLocation J(zEa zEa2) {
        YKa_1 b2 = zEa2;
        YKa_1 a2 = this;
        return I;
    }

    public ResourceLocation J(vL vL2) {
        YKa_1 b2 = vL2;
        YKa_1 a2 = this;
        return a2.J((zEa)b2);
    }

    public YKa_1(oLa oLa2) {
        Object b2 = oLa2;
        YKa_1 a2 = this;
        super((oLa)b2);
        a2.I = (ResourceLocation)VPa.i;
        a2.J = wOa.w;
    }
}

