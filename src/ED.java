/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  Oz
 *  XTa
 *  Yra
 *  aKa
 *  aSa
 *  cT
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  wPa
 */
import org.lwjgl.opengl.GL11;

public final class ED {
    private float f;
    private int F;
    private int g;
    private float L;
    private float E;
    private int m;
    private float C;
    private float i;
    private float M;
    private int k;
    private float j;
    private float J;
    private cT A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public ED(cT cT2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f6;
        void g2;
        void h2;
        void i2;
        ED j2;
        ED k2 = cT2;
        ED eD2 = j2 = this;
        ED eD3 = j2;
        ED eD4 = j2;
        ED eD5 = j2;
        ED eD6 = j2;
        ED eD7 = j2;
        ED eD8 = j2;
        ED eD9 = j2;
        eD9.A = null;
        j2.I = uSa.E;
        eD9.k = uSa.E;
        eD9.C = JPa.N;
        eD9.i = JPa.N;
        eD9.J = JPa.N;
        eD9.m = uSa.E;
        eD9.g = uSa.E;
        eD9.F = uSa.E;
        eD9.f = JPa.N;
        eD9.E = JPa.N;
        eD9.M = JPa.N;
        eD9.L = JPa.N;
        eD9.j = JPa.N;
        eD8.A = k2;
        eD8.I = i2;
        eD7.k = h2;
        eD7.C = g2;
        eD6.i = f6;
        eD6.J = e2;
        eD5.m = d2;
        eD5.g = c2;
        eD4.F = b2;
        eD4.f = a2;
        eD3.E = (float)i2 / ((cT)k2).textureWidth;
        eD3.M = (float)h2 / ((cT)k2).textureHeight;
        eD2.L = (float)(i2 + d2) / ((cT)k2).textureWidth;
        eD2.j = (float)(h2 + c2) / ((cT)k2).textureHeight;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(pKa pKa2, float f2, float f3, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        float f9;
        float f10;
        int n4;
        void d2;
        void e2;
        float a2;
        void b22;
        void h2;
        void f11;
        void i2;
        void g2;
        float c2;
        pKa pKa3 = pKa2;
        if (c2 < wPa.L) {
            c2 = wPa.L;
        }
        void var10_16 = g2 - i2;
        void var11_17 = f11 - h2;
        double d3 = Oz.l((float)var10_16) * (b22 / Yra.i);
        double d4 = Oz.l((float)var11_17) * (a2 / Yra.i);
        pKa pKa4 = pKa3;
        aKa b22 = pKa4.J();
        GL11.glNormal3f(JPa.N, JPa.N, vqa.T);
        aKa aKa2 = b22;
        aKa aKa3 = b22;
        aKa3.J(XTa.W, mka.A);
        aKa3.J(aSa.V, d4, aSa.V).J((double)i2, (double)f11).M();
        aKa2.J(d3, d4, aSa.V).J((double)g2, (double)f11).M();
        aKa2.J(d3, aSa.V, aSa.V).J((double)g2, (double)h2).M();
        aKa2.J(aSa.V, aSa.V, aSa.V).J((double)i2, (double)h2).M();
        pKa4.J();
        GL11.glNormal3f(JPa.N, JPa.N, pqa.r);
        aKa aKa4 = b22;
        aKa aKa5 = b22;
        aKa5.J(XTa.W, mka.A);
        aKa5.J(aSa.V, aSa.V, (double)c2).J((double)i2, (double)h2).M();
        aKa4.J(d3, aSa.V, (double)c2).J((double)g2, (double)h2).M();
        aKa4.J(d3, d4, (double)c2).J((double)g2, (double)f11).M();
        aKa4.J(aSa.V, d4, (double)c2).J((double)i2, (double)f11).M();
        pKa4.J();
        a2 = MQa.L * var10_16 / (float)e2;
        float f12 = MQa.L * var11_17 / (float)d2;
        GL11.glNormal3f(vqa.T, JPa.N, JPa.N);
        b22.J(XTa.W, mka.A);
        int n5 = n4 = uSa.E;
        while (n5 < e2) {
            f10 = (float)n4 / (float)e2;
            void j2 = i2 + var10_16 * f10 + a2;
            aKa aKa6 = b22;
            float f13 = f10;
            b22.J((double)f10 * d3, d4, (double)c2).J((double)j2, (double)f11).M();
            b22.J((double)f13 * d3, d4, aSa.V).J((double)j2, (double)f11).M();
            aKa6.J((double)f13 * d3, aSa.V, aSa.V).J((double)j2, (double)h2).M();
            aKa6.J((double)f10 * d3, aSa.V, (double)c2).J((double)j2, (double)h2).M();
            n5 = ++n4;
        }
        pKa3.J();
        GL11.glNormal3f(pqa.r, JPa.N, JPa.N);
        b22.J(XTa.W, mka.A);
        int n6 = n4 = uSa.E;
        while (n6 < e2) {
            f10 = (float)n4 / (float)e2;
            void j2 = i2 + var10_16 * f10 + a2;
            f9 = f10 + pqa.r / (float)e2;
            aKa aKa7 = b22;
            float f14 = f9;
            b22.J((double)f9 * d3, aSa.V, (double)c2).J((double)j2, (double)h2).M();
            b22.J((double)f14 * d3, aSa.V, aSa.V).J((double)j2, (double)h2).M();
            aKa7.J((double)f14 * d3, d4, aSa.V).J((double)j2, (double)f11).M();
            aKa7.J((double)f9 * d3, d4, (double)c2).J((double)j2, (double)f11).M();
            n6 = ++n4;
        }
        pKa3.J();
        GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
        b22.J(XTa.W, mka.A);
        int n7 = n4 = uSa.E;
        while (n7 < d2) {
            f10 = (float)n4 / (float)d2;
            void j2 = h2 + var11_17 * f10 + f12;
            f9 = f10 + pqa.r / (float)d2;
            aKa aKa8 = b22;
            b22.J(aSa.V, (double)f9 * d4, (double)c2).J((double)i2, (double)j2).M();
            aKa8.J(d3, (double)f9 * d4, (double)c2).J((double)g2, (double)j2).M();
            aKa8.J(d3, (double)f9 * d4, aSa.V).J((double)g2, (double)j2).M();
            aKa8.J(aSa.V, (double)f9 * d4, aSa.V).J((double)i2, (double)j2).M();
            n7 = ++n4;
        }
        pKa3.J();
        GL11.glNormal3f(JPa.N, vqa.T, JPa.N);
        b22.J(XTa.W, mka.A);
        int n8 = n4 = uSa.E;
        while (n8 < d2) {
            f10 = (float)n4 / (float)d2;
            void j2 = h2 + var11_17 * f10 + f12;
            aKa aKa9 = b22;
            aKa aKa10 = b22;
            aKa10.J(d3, (double)f10 * d4, (double)c2).J((double)g2, (double)j2).M();
            aKa10.J(aSa.V, (double)f10 * d4, (double)c2).J((double)i2, (double)j2).M();
            aKa9.J(aSa.V, (double)f10 * d4, aSa.V).J((double)i2, (double)j2).M();
            aKa9.J(d3, (double)f10 * d4, aSa.V).J((double)g2, (double)j2).M();
            n8 = ++n4;
        }
        pKa3.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(pKa pKa2, float f2) {
        void b2;
        ED a2;
        float c2 = f2;
        ED eD2 = a2 = this;
        ED eD3 = a2;
        uKa.J((float)(eD2.C * c2), (float)(eD3.i * c2), (float)(a2.J * c2));
        float f3 = eD2.E;
        float f4 = eD3.L;
        float f5 = eD2.M;
        float f6 = eD2.j;
        if (eD2.A.mirror) {
            ED eD4 = a2;
            f3 = eD4.L;
            f4 = eD4.E;
        }
        if (a2.A.mirrorV) {
            ED eD5 = a2;
            f5 = eD5.j;
            f6 = eD5.M;
        }
        ED eD6 = a2;
        ED.J((pKa)b2, f3, f5, f4, f6, eD6.m, eD6.g, c2 * (float)a2.F, a2.A.textureWidth, a2.A.textureHeight);
        uKa.J((float)(-a2.C * c2), (float)(-a2.i * c2), (float)(-a2.J * c2));
    }
}

