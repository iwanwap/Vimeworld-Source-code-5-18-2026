/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  ISa
 *  JPa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  SQa
 *  XTa
 *  aKa
 *  aSa
 *  jea
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  vL
 *  vQa
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class cka_1
extends GC<jea> {
    public static final ResourceLocation I = new ResourceLocation(Qsa.C);

    /*
     * WARNING - void declaration
     */
    public void J(jea jea2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        int n2;
        void a2;
        void c2;
        void d5;
        void e2;
        void f4;
        cka_1 cka_12 = this;
        cka_12.f((vL)f4);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        void v0 = f4;
        void v1 = f4;
        uKa.J((float)(v0.s + (v1.X - f4.s) * a2 - ISa.a), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        void v2 = f4;
        uKa.J((float)(v0.o + (v2.d - v2.o) * a2), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        int g22 = uSa.E;
        float f5 = JPa.N;
        float f6 = MQa.L;
        float f7 = (float)(uSa.E + g22 * NTa.C) / Ura.m;
        float f8 = (float)(tTa.h + g22 * NTa.C) / Ura.m;
        float f9 = JPa.N;
        float f10 = kua.Fa;
        float f11 = (float)(tTa.h + g22 * NTa.C) / Ura.m;
        float g22 = (float)(NTa.C + g22 * NTa.C) / Ura.m;
        float f12 = ROa.w;
        uKa.o();
        float f13 = (float)v1.k - a2;
        if (f13 > JPa.N) {
            float f14 = -Oz.d((float)(f13 * vQa.q)) * f13;
            uKa.J((float)f14, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
        uKa.J((float)nua.E, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        float f15 = f12;
        uKa.l((float)f15, (float)f15, (float)f15);
        uKa.J((float)NQa.m, (float)JPa.N, (float)JPa.N);
        GL11.glNormal3f(f12, JPa.N, JPa.N);
        aKa aKa3 = aKa2;
        aKa aKa4 = aKa2;
        aKa aKa5 = aKa2;
        aKa5.J(XTa.W, mka.A);
        aKa5.J(cPa.L, SQa.E, SQa.E).J((double)f9, (double)f11).M();
        aKa5.J(cPa.L, SQa.E, KPa.y).J((double)f10, (double)f11).M();
        aKa5.J(cPa.L, KPa.y, KPa.y).J((double)f10, (double)g22).M();
        aKa4.J(cPa.L, KPa.y, SQa.E).J((double)f9, (double)g22).M();
        pKa2.J();
        GL11.glNormal3f(-f12, JPa.N, JPa.N);
        aKa4.J(XTa.W, mka.A);
        aKa3.J(cPa.L, KPa.y, SQa.E).J((double)f9, (double)f11).M();
        aKa3.J(cPa.L, KPa.y, KPa.y).J((double)f10, (double)f11).M();
        aKa3.J(cPa.L, SQa.E, KPa.y).J((double)f10, (double)g22).M();
        aKa3.J(cPa.L, SQa.E, SQa.E).J((double)f9, (double)g22).M();
        pKa2.J();
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            GL11.glNormal3f(JPa.N, JPa.N, f12);
            aKa aKa6 = aKa2;
            aKa6.J(XTa.W, mka.A);
            aKa6.J(cTa.Y, SQa.E, aSa.V).J((double)f5, (double)f7).M();
            aKa6.J(Wqa.Z, SQa.E, aSa.V).J((double)f6, (double)f7).M();
            aKa6.J(Wqa.Z, KPa.y, aSa.V).J((double)f6, (double)f8).M();
            aKa6.J(cTa.Y, KPa.y, aSa.V).J((double)f5, (double)f8).M();
            pKa2.J();
            n3 = ++n2;
        }
        uKa.E();
        uKa.D();
        super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    public cka_1(oLa oLa2) {
        Object b2 = oLa2;
        cka_1 a2 = this;
        super((oLa)b2);
    }

    public ResourceLocation J(jea jea2) {
        cka_1 b2 = jea2;
        cka_1 a2 = this;
        return I;
    }
}

