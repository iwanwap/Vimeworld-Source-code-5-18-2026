/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kh
 *  MQa
 *  Tpa
 *  UG
 *  UI
 *  XM
 *  XTa
 *  aSa
 *  k
 *  pg
 *  pqa
 *  qh
 *  rh
 *  rr
 *  uKa
 *  uQa
 *  vRa
 *  yra
 */
import java.awt.Image;
import java.awt.image.BufferedImage;

public final class yO
extends rr {
    private boolean f;
    private int F;
    private boolean g;
    private boolean L;
    private final UG[] E;
    private String m;
    private float C;
    private int i;
    private int M;
    private int k;
    private int j;
    private static final UI[] J;
    private int A;

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ BufferedImage J(int n2, int n3, BufferedImage bufferedImage, int n4, int n5) {
        void a2;
        void c2;
        void b2;
        int e2 = n3;
        int d2 = n2;
        BufferedImage bufferedImage2 = new BufferedImage(d2, e2, uqa.g);
        void v1 = b2;
        bufferedImage2.getGraphics().drawImage((Image)c2, uSa.E, uSa.E, d2, e2, (int)v1, (int)a2, (int)(v1 + d2), (int)(a2 + e2), null);
        return bufferedImage2;
    }

    private String J(int n2) {
        int b2 = n2;
        yO a2 = this;
        return new StringBuilder().insert(2 & 5, a2.m).append(MQa.w).append(a2.A).append(yra.t).append(a2.i).append(yra.t).append(a2.F).append(yra.t).append(a2.j).append(uQa.Y).append(b2).toString();
    }

    /*
     * Unable to fully structure code
     */
    private void J(int var1_2, float var2_4, float var3_5, float var4_6, float var5_7, float var6_8, float var7_9, float var8_10, float var9_11) {
        j = var1_2;
        i = this;
        if (f <= JPa.N || e <= JPa.N || i.E[j] == null) {
            return;
        }
        var10_12 = i.E[j].J((PG)i.k);
        var11_13 = var10_12.A;
        var12_14 = var10_12.j;
        var13_15 = var10_12.k;
        var14_16 = var10_12.J;
        if (b == JPa.N) ** GOTO lbl17
        if (j == uqa.g || j == tTa.h || j == Yqa.i) {
            var11_13 += (var13_15 - var11_13) * b;
            v0 = a;
        } else {
            v1 = var13_15;
            var13_15 = v1 - (v1 - var11_13) * b;
lbl17:
            // 2 sources

            v0 = a;
        }
        if (v0 == JPa.N) ** GOTO lbl25
        if (j == uua.p || j == XTa.W || j == Yqa.i) {
            var12_14 += (var14_16 - var12_14) * a;
            v2 = var10_12;
        } else {
            v3 = var14_16;
            var14_16 = v3 - (v3 - var12_14) * a;
lbl25:
            // 2 sources

            v2 = var10_12;
        }
        uKa.C((int)v2.I);
        Kh.J((float)h, (float)g, (float)f, (float)e, (float)var11_13, (float)var12_14, (float)(var13_15 * d), (float)(var14_16 * c));
    }

    /*
     * WARNING - void declaration
     */
    public yO(k k2, XM xM) {
        void a2;
        yO c2 = k2;
        yO b2 = this;
        super((k)c2, (XM)a2);
        b2.A = uSa.E;
        b2.i = uSa.E;
        b2.F = uSa.E;
        b2.j = uSa.E;
        b2.C = pqa.r;
        b2.L = uSa.E;
        b2.E = new UG[WOa.fa];
        yO yO2 = b2;
        yO2.f = uSa.E;
        yO2.g = uSa.E;
        yO2.M = uSa.E;
        yO2.k = uSa.E;
        c2 = a2.getEImage9Slice();
        if (c2.hasOffsetLeft()) {
            b2.A = c2.getOffsetLeft();
        }
        if (c2.hasOffsetRight()) {
            b2.i = c2.getOffsetRight();
        }
        if (c2.hasOffsetTop()) {
            b2.F = c2.getOffsetTop();
        }
        if (c2.hasOffsetBottom()) {
            b2.j = c2.getOffsetBottom();
        }
        if (c2.hasTextureScale()) {
            b2.C = c2.getTextureScale();
        }
        if (b2.j.f()) {
            b2.A();
            b2.L = vRa.d;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, BufferedImage bufferedImage, int n3, int n4, int n5, int n6) {
        void c2;
        void d2;
        void e2;
        void a2;
        void b2;
        int g = n2;
        yO f2 = this;
        if (f2.E[g] != null || b2 == false || a2 == false) {
            return;
        }
        int n7 = g;
        f2.E[n7] = OT.i.g.J(f2.J(n7), J[g], kr.J((int)b2, (int)a2, (BufferedImage)e2, (int)d2, (int)c2));
    }

    private void A() {
        yO yO2 = this;
        if (!(yO2.j instanceof vi) || !(((vi)yO2.j).J() instanceof pg)) {
            yO2.f = vRa.d;
            OT.b.warn(new StringBuilder().insert(3 ^ 3, Upa.F).append(yO2.I).append(Tpa.E).append(yO2.m).append(STa.k).toString());
            return;
        }
        yO yO3 = yO2;
        yO yO4 = yO2;
        yO3.M = yO3.j.J() - yO4.A - yO2.i;
        yO3.k = yO4.j.f() - yO2.F - yO2.j;
        BufferedImage a2 = ((pg)((vi)yO3.j).J()).J();
        if (yO2.M <= 0 || yO2.k <= 0) {
            yO2.f = vRa.d;
            OT.b.warn(new StringBuilder().insert(5 >> 3, yOa.c).append(yO2.I).append(Tpa.E).append(yO2.m).append(hpa.g).toString());
            return;
        }
        yO yO5 = yO2;
        yO yO6 = yO2;
        yO5.J(uSa.E, a2, uSa.E, uSa.E, yO6.A, yO6.F);
        yO yO7 = yO2;
        yO yO8 = yO2;
        yO7.J(vRa.d, a2, yO7.A, uSa.E, yO8.M, yO8.F);
        BufferedImage bufferedImage = a2;
        yO yO9 = yO2;
        yO5.J(uqa.g, bufferedImage, bufferedImage.getWidth() - yO2.i, uSa.E, yO9.i, yO9.F);
        yO yO10 = yO2;
        yO5.J(yRa.d, a2, uSa.E, yO10.F, yO10.A, yO2.k);
        yO yO11 = yO2;
        yO yO12 = yO2;
        yO5.J(AQa.P, a2, yO11.A, yO11.F, yO12.M, yO12.k);
        BufferedImage bufferedImage2 = a2;
        yO yO13 = yO2;
        yO5.J(tTa.h, bufferedImage2, bufferedImage2.getWidth() - yO2.i, yO13.F, yO13.i, yO2.k);
        Object object = a2;
        yO yO14 = yO2;
        yO5.J(uua.p, (BufferedImage)object, uSa.E, ((BufferedImage)object).getHeight() - yO2.j, yO14.A, yO14.j);
        Object object2 = a2;
        yO yO15 = yO2;
        yO5.J(XTa.W, (BufferedImage)object2, yO2.A, ((BufferedImage)object2).getHeight() - yO2.j, yO15.M, yO15.j);
        Object object3 = a2;
        yO yO16 = yO2;
        yO5.J(Yqa.i, (BufferedImage)object3, a2.getWidth() - yO2.i, ((BufferedImage)object3).getHeight() - yO2.j, yO16.i, yO16.j);
    }

    public void J(long l) {
        yO yO2 = this;
        if (yO2.f || yO2.j.I == rh.ERROR) {
            Kh.J((double)aSa.V, (double)aSa.V, (double)yO2.J(), (double)yO2.f(), (int)yO2.f(sra.ca), (double)yO2.I.f());
            return;
        }
        if (!yO2.L && yO2.j.f()) {
            yO2.L = vRa.d;
            yO2.A();
            return;
        }
        if (!yO2.g) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < WOa.fa) {
                if (yO2.E[a2] != null && !yO2.E[a2].f()) {
                    return;
                }
                n2 = ++a2;
            }
            yO2.g = vRa.d;
        }
        yO yO3 = yO2;
        float a2 = yO3.J();
        float f2 = yO3.f();
        float f3 = (float)yO3.A * yO2.C;
        float b2 = (float)yO3.F * yO2.C;
        float f4 = (float)yO3.i * yO2.C;
        float f5 = (float)yO3.j * yO2.C;
        a2 = a2 - f3 - f4;
        f2 = f2 - b2 - f5;
        float f6 = pqa.r / (float)yO2.M / yO2.C;
        float f7 = pqa.r / (float)yO2.k / yO2.C;
        float f8 = JPa.N;
        float f9 = JPa.N;
        uKa.H();
        yO.J((int)yO3.x.J);
        if (a2 < JPa.N) {
            f8 = -a2 / (f3 + f4);
            f3 *= pqa.r - f8;
            f4 *= pqa.r - f8;
            a2 = JPa.N;
        }
        if (f2 < JPa.N) {
            f9 = -f2 / (b2 + f5);
            b2 *= pqa.r - f9;
            f5 *= pqa.r - f9;
            f2 = JPa.N;
        }
        yO yO4 = yO2;
        yO4.J(uSa.E, JPa.N, JPa.N, f3, b2, pqa.r, pqa.r, f8, f9);
        float f10 = a2;
        yO4.J(vRa.d, f3, JPa.N, f10, b2, f10 * f6, pqa.r, JPa.N, f9);
        yO4.J(uqa.g, f3 + a2, JPa.N, f4, b2, pqa.r, pqa.r, f8, f9);
        float f11 = f2;
        yO4.J(yRa.d, JPa.N, b2, f3, f11, pqa.r, f11 * f7, f8, JPa.N);
        float f12 = a2;
        yO4.J(AQa.P, f3, b2, f12, f2, f12 * f6, f2 * f7, JPa.N, JPa.N);
        float f13 = f2;
        yO4.J(tTa.h, f3 + a2, b2, f4, f13, pqa.r, f13 * f7, f8, JPa.N);
        yO4.J(uua.p, JPa.N, b2 + f2, f3, f5, pqa.r, pqa.r, f8, f9);
        float f14 = a2;
        yO4.J(XTa.W, f3, b2 + f2, f14, f5, f14 * f6, pqa.r, JPa.N, f9);
        yO4.J(Yqa.i, f3 + a2, b2 + f2, f4, f5, pqa.r, pqa.r, f8, f9);
    }

    static {
        UI[] uIArray = new UI[WOa.fa];
        uIArray[uSa.E] = UI.CLAMP;
        uIArray[vRa.d] = UI.REPEAT;
        uIArray[uqa.g] = UI.CLAMP;
        uIArray[yRa.d] = UI.REPEAT;
        uIArray[AQa.P] = UI.REPEAT;
        uIArray[tTa.h] = UI.REPEAT;
        uIArray[uua.p] = UI.CLAMP;
        uIArray[XTa.W] = UI.REPEAT;
        uIArray[Yqa.i] = UI.CLAMP;
        J = uIArray;
    }

    public UG J(qh qh2) {
        yO b2 = qh2;
        yO a2 = this;
        ((qh)b2).M = UI.REPEAT_MIPMAP;
        ((qh)b2).J = vRa.d;
        a2.m = ((qh)b2).I;
        return super.J((qh)b2);
    }
}

