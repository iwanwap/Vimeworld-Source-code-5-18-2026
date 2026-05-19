/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  XTa
 *  YSa
 *  Ypa
 *  aJa
 *  aKa
 *  aSa
 *  kta
 *  mka
 *  nLa
 *  pKa
 *  pqa
 *  qta
 *  ska
 *  uKa
 *  vL
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class lna_1
extends ska {
    private static final hKa m;
    private float C;
    private static final ResourceLocation k;
    private int j;
    private int J;
    private aJa I;

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        lna_1 lna_12 = this;
        int g22 = (int)(((float)lna_12.J + f8) * qta.D / (float)lna_12.j);
        if (g22 <= Ypa.A) {
            void a2;
            void c2;
            void d2;
            void b2;
            void e2;
            void h2;
            lna_1 lna_13 = lna_12;
            lna_1 lna_14 = lna_12;
            lna_14.I.J(k);
            float f9 = (float)(g22 % AQa.P) / YSa.G;
            float f10 = f9 + Nta.Ga;
            float g22 = (float)(g22 / AQa.P) / YSa.G;
            float f11 = g22 + Nta.Ga;
            float i2 = kta.v * lna_12.C;
            float f12 = (float)(lna_13.c + (lna_12.la - lna_12.c) * (double)f8 - C);
            float f13 = (float)(lna_14.ba + (lna_12.Z - lna_12.ba) * (double)f8 - k);
            f8 = (float)(lna_13.r + (lna_12.A - lna_12.r) * (double)f8 - j);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.L();
            nLa.C();
            void v2 = h2;
            float f14 = f12;
            void v4 = h2;
            v4.J(XTa.W, m);
            lna_1 lna_15 = lna_12;
            v4.J((double)(f12 - e2 * i2 - b2 * i2), (double)(f13 - d2 * i2), (double)(f8 - c2 * i2 - a2 * i2)).J((double)f10, (double)f11).J(lna_15.l, lna_15.a, (float)lna_12.J, pqa.r).J(uSa.E, YSa.c).J(JPa.N, pqa.r, JPa.N).M();
            lna_1 lna_16 = lna_12;
            h2.J((double)(f14 - e2 * i2 + b2 * i2), (double)(f13 + d2 * i2), (double)(f8 - c2 * i2 + a2 * i2)).J((double)f10, (double)g22).J(lna_16.l, lna_16.a, (float)lna_12.J, pqa.r).J(uSa.E, YSa.c).J(JPa.N, pqa.r, JPa.N).M();
            lna_1 lna_17 = lna_12;
            v2.J((double)(f14 + e2 * i2 + b2 * i2), (double)(f13 + d2 * i2), (double)(f8 + c2 * i2 + a2 * i2)).J((double)f9, (double)g22).J(lna_17.l, lna_17.a, (float)lna_12.J, pqa.r).J(uSa.E, YSa.c).J(JPa.N, pqa.r, JPa.N).M();
            lna_1 lna_18 = lna_12;
            v2.J((double)(f12 + e2 * i2 - b2 * i2), (double)(f13 - d2 * i2), (double)(f8 + c2 * i2 - a2 * i2)).J((double)f9, (double)f11).J(lna_18.l, lna_18.a, (float)lna_12.J, pqa.r).J(uSa.E, YSa.c).J(JPa.N, pqa.r, JPa.N).M();
            pKa.J().J();
            uKa.P();
        }
    }

    public void d() {
        lna_1 a2;
        lna_1 lna_12 = a2;
        lna_12.c = lna_12.la;
        lna_12.ba = lna_12.Z;
        lna_12.r = lna_12.A;
        lna_12.J += vRa.d;
        if (lna_12.J == a2.j) {
            a2.k();
        }
    }

    public int J() {
        return yRa.d;
    }

    static {
        k = new ResourceLocation(Vra.P);
        m = new hKa().J(mka.C).J(mka.b).J(mka.d).J(mka.e).J(mka.k).J(mka.G);
    }

    /*
     * WARNING - void declaration
     */
    public lna_1(aJa aJa2, Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void c2;
        void h2;
        void d8;
        void e2;
        void f2;
        lna_1 g2;
        lna_1 i2 = gg2;
        lna_1 lna_12 = g2 = this;
        super((Gg)i2, (double)f2, (double)e2, (double)d8, aSa.V, aSa.V, aSa.V);
        g2.I = h2;
        lna_1 lna_13 = g2;
        lna_12.j = uua.p + lna_13.R.nextInt(AQa.P);
        float f3 = lna_13.R.nextFloat() * Ora.D + Xpa.R;
        lna_12.J = (int)f3;
        lna_12.a = f3;
        lna_12.l = f3;
        g2.C = pqa.r - (float)c2 * MQa.L;
    }

    public int J(float f2) {
        float b2 = f2;
        lna_1 a2 = this;
        return LRa.V;
    }
}

