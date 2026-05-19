/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Fpa
 *  GC
 *  JPa
 *  MQa
 *  NOa
 *  Oz
 *  WFa
 *  XTa
 *  Yra
 *  aKa
 *  hqa
 *  kta
 *  mka
 *  nka
 *  pKa
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  wOa
 */
import net.minecraft.util.ResourceLocation;

public final class Sla
extends GC<WFa> {
    private static final ResourceLocation I = new ResourceLocation(NOa.Q);

    public Sla(oLa oLa2) {
        Object b2 = oLa2;
        Sla a2 = this;
        super((oLa)b2);
    }

    public ResourceLocation J(WFa wFa) {
        Sla b2 = wFa;
        Sla a2 = this;
        return I;
    }

    /*
     * WARNING - void declaration
     */
    private void J(WFa wFa, float f2, float f3) {
        void b22;
        void a22;
        Sla d22 = wFa;
        Sla c2 = this;
        Sla sla = d22;
        int n2 = Oz.f((double)((WFa)sla).la);
        int a22 = Oz.f((double)(((WFa)sla).Z + (double)(a22 / Yra.i)));
        int n3 = Oz.f((double)((WFa)sla).A);
        DZ dZ2 = ((WFa)sla).j;
        if (dZ2 == DZ.NORTH) {
            n2 = Oz.f((double)(((WFa)d22).la + (double)(b22 / Yra.i)));
        }
        if (dZ2 == DZ.WEST) {
            n3 = Oz.f((double)(((WFa)d22).A - (double)(b22 / Yra.i)));
        }
        if (dZ2 == DZ.SOUTH) {
            n2 = Oz.f((double)(((WFa)d22).la - (double)(b22 / Yra.i)));
        }
        if (dZ2 == DZ.EAST) {
            n3 = Oz.f((double)(((WFa)d22).A + (double)(b22 / Yra.i)));
        }
        int d22 = c2.A.j.J(new XF(n2, a22, n3), uSa.E);
        int b22 = d22 % opa.w;
        nka.J((int)nka.P, (float)b22, (float)(d22 /= opa.w));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    private void J(WFa wFa, int n2, int n3, int n4, int n5) {
        int n6;
        void c2;
        void d2;
        Sla sla = this;
        float f2 = (float)(-d2) / kta.v;
        float f3 = (float)(-c2) / kta.v;
        float f4 = MQa.L;
        float f5 = wOa.w;
        float f6 = rta.R;
        float f7 = JPa.N;
        float f8 = rRa.T;
        float f9 = wOa.w;
        float f10 = rta.R;
        float f11 = cTa.k;
        float f12 = cTa.k;
        float f13 = hqa.k;
        float f14 = hqa.k;
        float f15 = JPa.N;
        float f16 = rRa.T;
        int n7 = n6 = uSa.E;
        while (n7 < d2 / ERa.C) {
            int n8 = uSa.E;
            while (n8 < c2 / ERa.C) {
                aKa aKa2;
                void a2;
                void b2;
                void e2;
                int n9;
                float f17 = f2 + (float)((n6 + vRa.d) * ERa.C);
                float f18 = f2 + (float)(n6 * ERa.C);
                float f19 = f3 + (float)((n9 + vRa.d) * ERa.C);
                float f20 = f3 + (float)(n9 * ERa.C);
                sla.J((WFa)e2, (f17 + f18) / kta.v, (f19 + f20) / kta.v);
                float f21 = (float)(b2 + d2 - n6 * ERa.C) / Fpa.q;
                float f22 = (float)(b2 + d2 - (n6 + vRa.d) * ERa.C) / Fpa.q;
                float f23 = (float)(a2 + c2 - n9 * ERa.C) / Fpa.q;
                float f24 = (float)(a2 + c2 - (n9 + vRa.d) * ERa.C) / Fpa.q;
                pKa pKa2 = pKa.J();
                aKa aKa3 = aKa2 = pKa2.J();
                float f25 = f18;
                aKa aKa4 = aKa2;
                float f26 = f17;
                aKa aKa5 = aKa2;
                float f27 = f17;
                aKa aKa6 = aKa2;
                aKa aKa7 = aKa2;
                aKa aKa8 = aKa2;
                aKa aKa9 = aKa2;
                aKa aKa10 = aKa2;
                aKa aKa11 = aKa2;
                aKa aKa12 = aKa2;
                aKa aKa13 = aKa2;
                aKa13.J(XTa.W, mka.g);
                aKa13.J((double)f17, (double)f20, (double)(-f4)).J((double)f22, (double)f23).J(JPa.N, JPa.N, vqa.T).M();
                aKa12.J((double)f18, (double)f20, (double)(-f4)).J((double)f21, (double)f23).J(JPa.N, JPa.N, vqa.T).M();
                aKa12.J((double)f18, (double)f19, (double)(-f4)).J((double)f21, (double)f24).J(JPa.N, JPa.N, vqa.T).M();
                aKa11.J((double)f17, (double)f19, (double)(-f4)).J((double)f22, (double)f24).J(JPa.N, JPa.N, vqa.T).M();
                aKa11.J((double)f17, (double)f19, (double)f4).J((double)f5, (double)f7).J(JPa.N, JPa.N, pqa.r).M();
                aKa10.J((double)f18, (double)f19, (double)f4).J((double)f6, (double)f7).J(JPa.N, JPa.N, pqa.r).M();
                aKa10.J((double)f18, (double)f20, (double)f4).J((double)f6, (double)f8).J(JPa.N, JPa.N, pqa.r).M();
                aKa9.J((double)f17, (double)f20, (double)f4).J((double)f5, (double)f8).J(JPa.N, JPa.N, pqa.r).M();
                aKa9.J((double)f17, (double)f19, (double)(-f4)).J((double)f9, (double)f11).J(JPa.N, pqa.r, JPa.N).M();
                aKa8.J((double)f18, (double)f19, (double)(-f4)).J((double)f10, (double)f11).J(JPa.N, pqa.r, JPa.N).M();
                aKa8.J((double)f18, (double)f19, (double)f4).J((double)f10, (double)f12).J(JPa.N, pqa.r, JPa.N).M();
                aKa7.J((double)f17, (double)f19, (double)f4).J((double)f9, (double)f12).J(JPa.N, pqa.r, JPa.N).M();
                aKa7.J((double)f17, (double)f20, (double)f4).J((double)f9, (double)f11).J(JPa.N, vqa.T, JPa.N).M();
                aKa6.J((double)f18, (double)f20, (double)f4).J((double)f10, (double)f11).J(JPa.N, vqa.T, JPa.N).M();
                aKa6.J((double)f18, (double)f20, (double)(-f4)).J((double)f10, (double)f12).J(JPa.N, vqa.T, JPa.N).M();
                aKa2.J((double)f27, (double)f20, (double)(-f4)).J((double)f9, (double)f12).J(JPa.N, vqa.T, JPa.N).M();
                aKa5.J((double)f27, (double)f19, (double)f4).J((double)f14, (double)f15).J(vqa.T, JPa.N, JPa.N).M();
                aKa5.J((double)f17, (double)f20, (double)f4).J((double)f14, (double)f16).J(vqa.T, JPa.N, JPa.N).M();
                aKa2.J((double)f26, (double)f20, (double)(-f4)).J((double)f13, (double)f16).J(vqa.T, JPa.N, JPa.N).M();
                aKa4.J((double)f26, (double)f19, (double)(-f4)).J((double)f13, (double)f15).J(vqa.T, JPa.N, JPa.N).M();
                aKa4.J((double)f18, (double)f19, (double)(-f4)).J((double)f14, (double)f15).J(pqa.r, JPa.N, JPa.N).M();
                aKa2.J((double)f25, (double)f20, (double)(-f4)).J((double)f14, (double)f16).J(pqa.r, JPa.N, JPa.N).M();
                aKa3.J((double)f25, (double)f20, (double)f4).J((double)f13, (double)f16).J(pqa.r, JPa.N, JPa.N).M();
                aKa3.J((double)f18, (double)f19, (double)f4).J((double)f13, (double)f15).J(pqa.r, JPa.N, JPa.N).M();
                pKa2.J();
                n8 = ++n9;
            }
            n7 = ++n6;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(WFa wFa, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        Sla g2 = wFa;
        Sla f4 = this;
        uKa.e();
        uKa.f((double)e2, (double)d5, (double)c2);
        uKa.J((float)(Hra.Ga - b2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.o();
        f4.f((vL)g2);
        JEa jEa2 = ((WFa)g2).I;
        float f5 = rRa.T;
        uKa.l((float)f5, (float)f5, (float)f5);
        JEa jEa3 = jEa2;
        JEa jEa4 = jEa2;
        f4.J((WFa)g2, jEa3.sizeX, jEa3.sizeY, jEa4.offsetX, jEa4.offsetY);
        uKa.E();
        uKa.D();
        super.l((vL)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

