/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Cz
 *  JPa
 *  LQa
 *  Lra
 *  Ola
 *  Oz
 *  Spa
 *  XTa
 *  aKa
 *  aSa
 *  jRa
 *  kpa
 *  mka
 *  pKa
 *  pQa
 *  pqa
 *  psa
 *  uKa
 *  vRa
 *  zsa
 */
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class LKa_2
extends Ola<Cz> {
    private static final ResourceLocation I = new ResourceLocation(zsa.I);

    /*
     * WARNING - void declaration
     */
    public void J(Cz cz2, double d2, double d3, double d4, float f2, int n2) {
        void f3;
        LKa_2 lKa_2 = this;
        float a2 = f3.J();
        uKa.J((int)jRa.m, (float)Nra.e);
        if (a2 > JPa.N) {
            int n3;
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            uKa.I();
            List list = f3.J();
            int n4 = uSa.E;
            int n5 = n3 = uSa.E;
            while (n5 < list.size()) {
                void c2;
                void d5;
                void e2;
                void b2;
                VX g22 = (VX)list.get(n3);
                int n6 = n4 + g22.J();
                lKa_2.J(I);
                GL11.glTexParameterf(BQa.Z, LQa.P, FRa.T);
                GL11.glTexParameterf(BQa.Z, pQa.n, FRa.T);
                uKa.L();
                uKa.m();
                uKa.k();
                uKa.J(vRa.d != 0);
                uKa.J((int)Lra.k, (int)vRa.d, (int)vRa.d, (int)uSa.E);
                double d6 = (double)f3.f().l() + (double)b2;
                double d7 = Oz.l((double)(-d6 * iSa.P - (double)Oz.f((double)(-d6 * tpa.k))));
                aKa aKa3 = aKa2;
                Object object = g22;
                float g22 = ((VX)object).J()[uSa.E];
                float f4 = ((VX)object).J()[vRa.d];
                float f5 = ((VX)object).J()[uqa.g];
                d6 = d6 * psa.k * Spa.s;
                double d8 = kTa.B + Math.cos(d6 + Pua.r) * iSa.P;
                double d9 = kTa.B + Math.sin(d6 + Pua.r) * iSa.P;
                double d10 = kTa.B + Math.cos(d6 + Cra.k) * iSa.P;
                double d11 = kTa.B + Math.sin(d6 + Cra.k) * iSa.P;
                double d12 = kTa.B + Math.cos(d6 + Qpa.Z) * iSa.P;
                double d13 = kTa.B + Math.sin(d6 + Qpa.Z) * iSa.P;
                double d14 = kTa.B + Math.cos(d6 + Psa.ga) * iSa.P;
                double d15 = kTa.B + Math.sin(d6 + Psa.ga) * iSa.P;
                double d16 = aSa.V;
                double d17 = oua.i;
                double d18 = pqa.q + d7;
                double d19 = (double)((float)((VX)object).J() * a2) * vqa.c + d18;
                void v3 = e2;
                aKa aKa4 = aKa2;
                void v5 = e2;
                aKa aKa5 = aKa2;
                void v7 = e2;
                aKa aKa6 = aKa2;
                void v9 = e2;
                aKa aKa7 = aKa2;
                void v11 = e2;
                aKa aKa8 = aKa2;
                aKa2.J(XTa.W, mka.a);
                aKa8.J((double)(e2 + d8), (double)(d5 + (double)n6), (double)(c2 + d9)).J(oua.i, d19).J(g22, f4, f5, pqa.r).M();
                aKa8.J((double)(e2 + d8), (double)(d5 + (double)n4), (double)(c2 + d9)).J(oua.i, d18).J(g22, f4, f5, pqa.r).M();
                aKa2.J((double)(v11 + d10), (double)(d5 + (double)n4), (double)(c2 + d11)).J(aSa.V, d18).J(g22, f4, f5, pqa.r).M();
                aKa7.J((double)(v11 + d10), (double)(d5 + (double)n6), (double)(c2 + d11)).J(aSa.V, d19).J(g22, f4, f5, pqa.r).M();
                aKa7.J((double)(e2 + d14), (double)(d5 + (double)n6), (double)(c2 + d15)).J(oua.i, d19).J(g22, f4, f5, pqa.r).M();
                aKa2.J((double)(v9 + d14), (double)(d5 + (double)n4), (double)(c2 + d15)).J(oua.i, d18).J(g22, f4, f5, pqa.r).M();
                aKa6.J((double)(v9 + d12), (double)(d5 + (double)n4), (double)(c2 + d13)).J(aSa.V, d18).J(g22, f4, f5, pqa.r).M();
                aKa6.J((double)(e2 + d12), (double)(d5 + (double)n6), (double)(c2 + d13)).J(aSa.V, d19).J(g22, f4, f5, pqa.r).M();
                aKa2.J((double)(v7 + d10), (double)(d5 + (double)n6), (double)(c2 + d11)).J(oua.i, d19).J(g22, f4, f5, pqa.r).M();
                aKa5.J((double)(v7 + d10), (double)(d5 + (double)n4), (double)(c2 + d11)).J(oua.i, d18).J(g22, f4, f5, pqa.r).M();
                aKa5.J((double)(e2 + d14), (double)(d5 + (double)n4), (double)(c2 + d15)).J(aSa.V, d18).J(g22, f4, f5, pqa.r).M();
                aKa2.J((double)(v5 + d14), (double)(d5 + (double)n6), (double)(c2 + d15)).J(aSa.V, d19).J(g22, f4, f5, pqa.r).M();
                aKa4.J((double)(v5 + d12), (double)(d5 + (double)n6), (double)(c2 + d13)).J(oua.i, d19).J(g22, f4, f5, pqa.r).M();
                aKa4.J((double)(e2 + d12), (double)(d5 + (double)n4), (double)(c2 + d13)).J(oua.i, d18).J(g22, f4, f5, pqa.r).M();
                aKa2.J((double)(v3 + d8), (double)(d5 + (double)n4), (double)(c2 + d9)).J(aSa.V, d18).J(g22, f4, f5, pqa.r).M();
                aKa3.J((double)(v3 + d8), (double)(d5 + (double)n6), (double)(c2 + d9)).J(aSa.V, d19).J(g22, f4, f5, pqa.r).M();
                pKa2.J();
                uKa.B();
                uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                uKa.J(uSa.E != 0);
                d6 = iSa.P;
                d8 = Jra.A;
                d9 = iSa.P;
                d10 = iSa.P;
                d11 = Jra.A;
                d12 = Jra.A;
                d13 = Jra.A;
                d14 = aSa.V;
                d15 = oua.i;
                d16 = pqa.q + d7;
                d17 = (double)((float)g22.J() * a2) + d16;
                void v13 = e2;
                aKa aKa9 = aKa2;
                void v15 = e2;
                aKa aKa10 = aKa2;
                void v17 = e2;
                aKa aKa11 = aKa2;
                void v19 = e2;
                aKa aKa12 = aKa2;
                void v21 = e2;
                aKa aKa13 = aKa2;
                aKa2.J(XTa.W, mka.a);
                aKa13.J((double)(e2 + iSa.P), (double)(d5 + (double)n6), (double)(c2 + iSa.P)).J(oua.i, d17).J(g22, f4, f5, Mqa.N).M();
                aKa13.J((double)(e2 + iSa.P), (double)(d5 + (double)n4), (double)(c2 + iSa.P)).J(oua.i, d16).J(g22, f4, f5, Mqa.N).M();
                aKa2.J((double)(v21 + Jra.A), (double)(d5 + (double)n4), (double)(c2 + iSa.P)).J(aSa.V, d16).J(g22, f4, f5, Mqa.N).M();
                aKa12.J((double)(v21 + Jra.A), (double)(d5 + (double)n6), (double)(c2 + iSa.P)).J(aSa.V, d17).J(g22, f4, f5, Mqa.N).M();
                aKa12.J((double)(e2 + Jra.A), (double)(d5 + (double)n6), (double)(c2 + Jra.A)).J(oua.i, d17).J(g22, f4, f5, Mqa.N).M();
                aKa2.J((double)(v19 + Jra.A), (double)(d5 + (double)n4), (double)(c2 + Jra.A)).J(oua.i, d16).J(g22, f4, f5, Mqa.N).M();
                aKa11.J((double)(v19 + iSa.P), (double)(d5 + (double)n4), (double)(c2 + Jra.A)).J(aSa.V, d16).J(g22, f4, f5, Mqa.N).M();
                aKa11.J((double)(e2 + iSa.P), (double)(d5 + (double)n6), (double)(c2 + Jra.A)).J(aSa.V, d17).J(g22, f4, f5, Mqa.N).M();
                aKa2.J((double)(v17 + Jra.A), (double)(d5 + (double)n6), (double)(c2 + iSa.P)).J(oua.i, d17).J(g22, f4, f5, Mqa.N).M();
                aKa10.J((double)(v17 + Jra.A), (double)(d5 + (double)n4), (double)(c2 + iSa.P)).J(oua.i, d16).J(g22, f4, f5, Mqa.N).M();
                aKa10.J((double)(e2 + Jra.A), (double)(d5 + (double)n4), (double)(c2 + Jra.A)).J(aSa.V, d16).J(g22, f4, f5, Mqa.N).M();
                aKa2.J((double)(v15 + Jra.A), (double)(d5 + (double)n6), (double)(c2 + Jra.A)).J(aSa.V, d17).J(g22, f4, f5, Mqa.N).M();
                aKa9.J((double)(v15 + iSa.P), (double)(d5 + (double)n6), (double)(c2 + Jra.A)).J(oua.i, d17).J(g22, f4, f5, Mqa.N).M();
                aKa9.J((double)(e2 + iSa.P), (double)(d5 + (double)n4), (double)(c2 + Jra.A)).J(oua.i, d16).J(g22, f4, f5, Mqa.N).M();
                aKa2.J((double)(v13 + iSa.P), (double)(d5 + (double)n4), (double)(c2 + iSa.P)).J(aSa.V, d16).J(g22, f4, f5, Mqa.N).M();
                aKa3.J((double)(v13 + iSa.P), (double)(d5 + (double)n6), (double)(c2 + iSa.P)).J(aSa.V, d17).J(g22, f4, f5, Mqa.N).M();
                pKa2.J();
                uKa.P();
                uKa.H();
                uKa.J(vRa.d != 0);
                n4 = n6;
                n5 = ++n3;
            }
            uKa.d();
        }
    }

    public LKa_2() {
        LKa_2 a2;
    }

    public boolean J() {
        return vRa.d != 0;
    }
}

