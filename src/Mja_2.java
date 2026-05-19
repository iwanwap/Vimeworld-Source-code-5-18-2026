/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Dla
 *  Gl
 *  JPa
 *  Oz
 *  Qsa
 *  SOa
 *  id
 *  kta
 *  lqa
 *  pda
 *  pqa
 *  pua
 *  uKa
 *  vL
 */
public final class Mja_2
implements id {
    private static final String A = "CL_00002425";
    private final Dla I;

    public Mja_2(Dla dla2) {
        Mja_2 b2 = dla2;
        Mja_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        XW i2 = xW2;
        Mja_2 h2 = this;
        if (i2.S() && !i2.C() && i2.J(pda.CAPE) && i2.l() != null) {
            void e2;
            Object object = i2;
            jI.J(Ni.J((vL)i2));
            Object object2 = i2;
            h2.I.J(((XW)((Object)object2)).l());
            uKa.e();
            uKa.J((float)JPa.N, (float)JPa.N, (float)Mqa.N);
            double d2 = ((XW)((Object)object2)).B + (i2.C - i2.B) * (double)e2 - (i2.c + (i2.la - i2.c) * (double)e2);
            Object object3 = i2;
            double d3 = ((XW)((Object)object)).o + (((XW)((Object)object3)).k - i2.o) * (double)e2 - (i2.ba + (i2.Z - i2.ba) * (double)e2);
            double d4 = ((XW)((Object)object3)).p + (i2.Y - i2.p) * (double)e2 - (i2.r + (i2.A - i2.r) * (double)e2);
            Object object4 = i2;
            float g2 = ((XW)((Object)object)).Ma + (((XW)((Object)object4)).ba - ((XW)((Object)object4)).Ma) * e2;
            double d5 = Oz.d((float)(g2 * pua.j / Hra.Ga));
            double d6 = -Oz.C((float)(g2 * pua.j / Hra.Ga));
            g2 = (float)d3 * FRa.Ga;
            g2 = Oz.J((float)g2, (float)NSa.b, (float)Ura.m);
            float f9 = (float)(d2 * d5 + d4 * d6) * QTa.G;
            float d7 = (float)(d2 * d6 - d4 * d5) * QTa.G;
            if (f9 < JPa.N) {
                f9 = JPa.N;
            }
            if (f9 > Qsa.B) {
                f9 = Qsa.B;
            }
            Object object5 = i2;
            float c2 = ((XW)((Object)object5)).Z + (((XW)((Object)object5)).S - i2.Z) * e2;
            Object object6 = i2;
            g2 += Oz.d((float)((((XW)((Object)object6)).M + (((XW)((Object)object6)).e - i2.M) * e2) * lqa.ga)) * Ura.m * c2;
            if (object5.q()) {
                g2 += sSa.E;
                uKa.J((float)JPa.N, (float)Ata.D, (float)SOa.B);
            }
            uKa.J((float)(lqa.ga + f9 / kta.v + g2), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)(d7 / kta.v), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.J((float)(-d7 / kta.v), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            h2.I.J().l(rRa.T);
            uKa.D();
        }
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f9;
        void g2;
        void h2;
        float f10 = f8;
        Mja_2 a2 = this;
        a2.J((XW)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
    }
}

