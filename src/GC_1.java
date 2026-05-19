/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  JPa
 *  KTa
 *  Kna
 *  Kpa
 *  Lra
 *  MQa
 *  NPa
 *  Oz
 *  SQa
 *  UG
 *  XTa
 *  Yfa
 *  Yra
 *  aKa
 *  aSa
 *  eS
 *  eb
 *  hy
 *  kpa
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  ui
 *  vL
 *  vRa
 *  xy
 *  ysa
 *  zU
 */
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.ImageShadow;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class GC_1<T extends vL> {
    private static final String k = "CL_00000992";
    private static final ResourceLocation j = new ResourceLocation(Yra.e);
    public float J;
    public final oLa A;
    public float I;

    /*
     * WARNING - void declaration
     */
    public static void J(xy xy2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        xy xy3 = xy2;
        uKa.z();
        pKa pKa2 = pKa.J();
        xy d5 = pKa2.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        xy xy4 = d5;
        xy xy5 = xy3;
        xy xy6 = d5;
        xy xy7 = xy3;
        xy xy8 = d5;
        xy xy9 = xy3;
        xy xy10 = d5;
        xy xy11 = xy3;
        xy xy12 = d5;
        xy xy13 = xy3;
        xy xy14 = d5;
        xy xy15 = xy3;
        xy xy16 = d5;
        xy xy17 = xy3;
        xy xy18 = d5;
        xy xy19 = xy3;
        xy xy20 = d5;
        xy20.f((double)c2, (double)b2, (double)a2);
        xy20.J(XTa.W, mka.J);
        d5.J(xy19.J, xy3.M, xy3.I).J(JPa.N, JPa.N, vqa.T).M();
        xy18.J(xy19.A, xy3.M, xy3.I).J(JPa.N, JPa.N, vqa.T).M();
        xy18.J(xy3.A, xy3.j, xy3.I).J(JPa.N, JPa.N, vqa.T).M();
        d5.J(xy17.J, xy3.j, xy3.I).J(JPa.N, JPa.N, vqa.T).M();
        xy16.J(xy17.J, xy3.j, xy3.k).J(JPa.N, JPa.N, pqa.r).M();
        xy16.J(xy3.A, xy3.j, xy3.k).J(JPa.N, JPa.N, pqa.r).M();
        d5.J(xy15.A, xy3.M, xy3.k).J(JPa.N, JPa.N, pqa.r).M();
        xy14.J(xy15.J, xy3.M, xy3.k).J(JPa.N, JPa.N, pqa.r).M();
        xy14.J(xy3.J, xy3.j, xy3.I).J(JPa.N, vqa.T, JPa.N).M();
        d5.J(xy13.A, xy3.j, xy3.I).J(JPa.N, vqa.T, JPa.N).M();
        xy12.J(xy13.A, xy3.j, xy3.k).J(JPa.N, vqa.T, JPa.N).M();
        xy12.J(xy3.J, xy3.j, xy3.k).J(JPa.N, vqa.T, JPa.N).M();
        d5.J(xy11.J, xy3.M, xy3.k).J(JPa.N, pqa.r, JPa.N).M();
        xy10.J(xy11.A, xy3.M, xy3.k).J(JPa.N, pqa.r, JPa.N).M();
        xy10.J(xy3.A, xy3.M, xy3.I).J(JPa.N, pqa.r, JPa.N).M();
        d5.J(xy9.J, xy3.M, xy3.I).J(JPa.N, pqa.r, JPa.N).M();
        xy8.J(xy9.J, xy3.j, xy3.k).J(vqa.T, JPa.N, JPa.N).M();
        xy8.J(xy3.J, xy3.M, xy3.k).J(vqa.T, JPa.N, JPa.N).M();
        d5.J(xy7.J, xy3.M, xy3.I).J(vqa.T, JPa.N, JPa.N).M();
        xy6.J(xy7.J, xy3.j, xy3.I).J(vqa.T, JPa.N, JPa.N).M();
        xy6.J(xy3.A, xy3.j, xy3.I).J(pqa.r, JPa.N, JPa.N).M();
        d5.J(xy5.A, xy3.M, xy3.I).J(pqa.r, JPa.N, JPa.N).M();
        xy4.J(xy5.A, xy3.M, xy3.k).J(pqa.r, JPa.N, JPa.N).M();
        xy4.J(xy3.A, xy3.j, xy3.k).J(pqa.r, JPa.N, JPa.N).M();
        pKa2.J();
        d5.f(aSa.V, aSa.V, aSa.V);
        uKa.H();
    }

    /*
     * WARNING - void declaration
     */
    private static float f(float f2, float f3, float f4, float f5, float f6, float f7) {
        void b2;
        void e2;
        void a2;
        void d2;
        float f8 = f5;
        float c2 = f2;
        return f8 + (c2 - d2) * a2 + (e2 - f8) * b2;
    }

    public oLa J() {
        GC_1 a2;
        return a2.A;
    }

    public Kna J() {
        GC_1 a2;
        return a2.A.J();
    }

    public void J(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        GC_1 a2 = this;
        a2.A.J.J(b2);
    }

    public GC_1(oLa oLa2) {
        oLa b2 = oLa2;
        GC_1 a2 = this;
        a2.J = pqa.r;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void l(T t2, double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        GC_1<T> g2 = t2;
        GC_1 f4 = this;
        f4.J(g2, (double)e2, (double)d5, (double)c2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(T t2, eb eb2, double d2, double d3, double d4) {
        void d5;
        void a2;
        void b2;
        void c2;
        GC_1<T> f2 = t2;
        GC_1 e2 = this;
        xy xy2 = f2.J();
        if (xy2.J() || xy2.J() == aSa.V) {
            xy2 = new xy(((vL)f2).la - KPa.y, ((vL)f2).Z - KPa.y, ((vL)f2).A - KPa.y, ((vL)f2).la + KPa.y, ((vL)f2).Z + KPa.y, ((vL)f2).A + KPa.y);
        }
        if (f2.J((double)c2, (double)b2, (double)a2) && (((vL)f2).Ja || d5.J(xy2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, double d2, double d3, double d4, String string, float f2, double d5) {
        void d6;
        void e2;
        void f3;
        String h2;
        void g2;
        GC_1 gC_1 = string2;
        String string2 = string;
        GC_1 c2 = gC_1;
        c2.J(g2, h2, (double)f3, (double)e2, (double)d6, ysa.s);
    }

    /*
     * WARNING - void declaration
     */
    private void f(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        GC_1 g222 = vL2;
        GC_1 f4 = this;
        if (!Config.h() || !pA.dA) {
            void c2;
            void d5;
            void e2;
            void a22322;
            MiniDotItem miniDotItem;
            Object object;
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            float f5 = f4.I;
            float f6 = JPa.N;
            int n2 = uSa.E;
            if (g222 instanceof Sx && (object = zU.M.f(g222.J())) != null && (miniDotItem = ((jU)object).J(eS.SHADOW)) != null && miniDotItem.model instanceof ImageShadow) {
                ImageShadow imageShadow = (ImageShadow)miniDotItem.model;
                ui ui2 = imageShadow.J();
                if (imageShadow.J()) {
                    Sx sx2 = (Sx)((Object)g222);
                    uKa.C((int)ui2.I);
                    n2 = vRa.d;
                    f6 = -MiniDotItem.J(sx2.Ma, sx2.ba, (float)a22322);
                    f5 *= imageShadow.f();
                    b2 *= imageShadow.J();
                }
            }
            if (n2 == 0) {
                f4.A.J.J(j);
            }
            object = f4.J();
            uKa.J(uSa.E != 0);
            if (g222 instanceof Yfa) {
                miniDotItem = (Yfa)g222;
                f5 *= miniDotItem.k();
                if (miniDotItem.Y()) {
                    f5 *= MQa.L;
                }
            }
            GC_1 gC_1 = g222;
            GC_1 gC_12 = g222;
            double d6 = ((vL)gC_1).V + (((vL)gC_12).la - ((vL)g222).V) * (double)a22322;
            double d7 = ((vL)gC_12).Ga + (((vL)g222).Z - ((vL)g222).Ga) * (double)a22322;
            double d8 = ((vL)gC_1).Ca + (((vL)g222).A - ((vL)g222).Ca) * (double)a22322;
            int g222 = Oz.f((double)(d6 - (double)f5));
            int a22322 = Oz.f((double)(d6 + (double)f5));
            n2 = Oz.f((double)(d7 - (double)f5));
            int n3 = Oz.f((double)d7);
            int n4 = Oz.f((double)(d8 - (double)f5));
            int n5 = Oz.f((double)(d8 + (double)f5));
            d6 = e2 - d6;
            d7 = d5 - d7;
            d8 = c2 - d8;
            pKa pKa2 = pKa.J();
            pKa2.J().J(XTa.W, mka.a);
            for (XF a22322 : XF.getAllInBoxMutable(new XF(g222, n2, n4), new XF(a22322, n3, n5))) {
                void b2;
                Block block = object.J(a22322.down()).J();
                if (block.J() == hy.INVISIBLE || object.C(a22322) <= yRa.d) continue;
                f4.J(block, (double)e2, (double)d5, (double)c2, a22322, (float)b2, f5, d6, d7, d8, f6);
            }
            pKa2.J();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.k();
            uKa.J(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Block block, double d2, double d3, double d4, XF xF, float f2, float f3, double d5, double d6, double d7, float f4) {
        Block l22 = block;
        GC_1 k2 = this;
        if (l22.l()) {
            double d8;
            double c2;
            void g22;
            double i2;
            float f5;
            aKa aKa2 = pKa.J().J();
            i2 = ((double)f5 - (i2 - ((double)g22.getY() + c2)) / KPa.y) * kTa.B * (double)k2.J().J((XF)g22);
            if (d8 >= aSa.V) {
                float a2;
                void h22;
                float e2;
                void j22;
                double b2;
                double d9;
                i2 = Oz.J((double)i2, (double)aSa.V, (double)oua.i);
                void v1 = g22;
                double d10 = (double)v1.getX() + l22.f() + d9;
                d9 = (double)v1.getX() + l22.J() + d9;
                c2 = (double)v1.getY() + l22.l() + c2 + Asa.W;
                double d11 = (double)v1.getZ() + l22.d() + b2;
                b2 = (double)v1.getZ() + l22.e() + b2;
                float l22 = (float)((j22 - d10) / KPa.y / (double)e2 + kTa.B);
                float g22 = (float)((j22 - d9) / KPa.y / (double)e2 + kTa.B);
                f5 = (float)((h22 - d11) / KPa.y / (double)e2 + kTa.B);
                e2 = (float)((h22 - b2) / KPa.y / (double)e2 + kTa.B);
                if (a2 != JPa.N) {
                    float j22 = MQa.L;
                    float f6 = MQa.L;
                    float h22 = (float)Math.cos(Math.toRadians(a2));
                    a2 = (float)Math.sin(Math.toRadians(a2));
                    aKa aKa3 = aKa2;
                    aKa aKa4 = aKa2;
                    GC_1.J(aKa4, d10, c2, d11, GC_1.J(l22, f5, j22, f6, h22, a2), GC_1.f(l22, f5, j22, f6, h22, a2), i2);
                    GC_1.J(aKa4, d10, c2, b2, GC_1.J(l22, e2, j22, f6, h22, a2), GC_1.f(l22, e2, j22, f6, h22, a2), i2);
                    GC_1.J(aKa3, d9, c2, b2, GC_1.J(g22, e2, j22, f6, h22, a2), GC_1.f(g22, e2, j22, f6, h22, a2), i2);
                    GC_1.J(aKa3, d9, c2, d11, GC_1.J(g22, f5, j22, f6, h22, a2), GC_1.f(g22, f5, j22, f6, h22, a2), i2);
                    return;
                }
                aKa aKa5 = aKa2;
                double d12 = d9;
                aKa aKa6 = aKa2;
                GC_1.J(aKa6, d10, c2, d11, l22, f5, i2);
                GC_1.J(aKa6, d10, c2, b2, l22, e2, i2);
                GC_1.J(aKa5, d12, c2, b2, g22, e2, i2);
                GC_1.J(aKa5, d12, c2, d11, g22, f5, i2);
            }
        }
    }

    public abstract ResourceLocation J(T var1);

    public boolean f(T t2) {
        Object b2 = t2;
        GC_1 a2 = this;
        UG uG = Ni.J((vL)b2);
        if (uG != null && uG.f()) {
            uKa.C((int)uG.J(null).I);
            return vRa.d != 0;
        }
        if ((b2 = a2.J(b2)) == null) {
            return uSa.E != 0;
        }
        a2.J((ResourceLocation)b2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, double d2, double d3, double d4) {
        GC_1 d5 = this;
        GC_1<T> e2 = t2;
        if (d5.J(e2)) {
            void a2;
            void b2;
            void c2;
            GC_1<T> gC_1 = e2;
            d5.J(gC_1, gC_1.J().l(), (double)c2, (double)b2, (double)a2, ysa.s);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, String string, double d2, double d3, double d4, int n2) {
        aKa f2;
        void a22;
        GC_1 gC_1 = this;
        void v0 = a22;
        if (f2.J(gC_1.A.B) <= (double)(v0 * v0)) {
            void e2;
            void b2;
            void c2;
            void d5;
            Kna a22 = gC_1.J();
            float g22 = ySa.Da;
            g22 = rta.D * g22;
            float f3 = MQa.L;
            if (f2 instanceof Gl) {
                float f4 = Ni.J((vL)f2);
                g22 *= f4;
                f3 *= f4;
            }
            uKa.e();
            uKa.J((float)((float)d5 + JPa.N), (float)((float)c2 + f2.u + f3), (float)((float)b2));
            GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
            GC_1 gC_12 = gC_1;
            uKa.J((float)(-gC_12.A.c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)gC_12.A.l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.l((float)(-g22), (float)(-g22), (float)g22);
            uKa.L();
            uKa.J(uSa.E != 0);
            uKa.u();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            pKa pKa2 = pKa.J();
            f2 = pKa2.J();
            int g22 = uSa.E;
            int n3 = a22.J((String)e2) / uqa.g;
            uKa.z();
            aKa aKa2 = f2;
            int n4 = n3;
            aKa aKa3 = f2;
            aKa3.J(XTa.W, mka.I);
            aKa3.J((double)(-n3 - vRa.d), (double)(pua.o + g22), aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
            f2.J((double)(-n4 - vRa.d), (double)(Yqa.i + g22), aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
            aKa2.J((double)(n4 + vRa.d), (double)(Yqa.i + g22), aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
            aKa2.J((double)(n3 + vRa.d), (double)(pua.o + g22), aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
            pKa2.J();
            uKa.H();
            Kna kna2 = a22;
            kna2.J((String)e2, -kna2.J((String)e2) / uqa.g, g22, STa.Ha);
            uKa.J();
            uKa.J(vRa.d != 0);
            Kna kna3 = a22;
            kna3.J((String)e2, -kna3.J((String)e2) / uqa.g, g22, pua.o);
            uKa.P();
            uKa.k();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.D();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        void c2;
        void e2;
        void b2;
        void d2;
        float f9 = f2;
        f2 = f7;
        float a2 = f9;
        void v1 = d2;
        return (float)(v1 + (a2 - v1) * b2 - (e2 - c2) * f8);
    }

    public boolean J(T t2) {
        GC_1<T> b2 = t2;
        GC_1 a2 = this;
        if (b2.G() && b2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Gg J() {
        GC_1 a2;
        return a2.A.j;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(aKa aKa2, double d2, double d3, double d4, float f2, float f3, double d5) {
        void a2;
        void g2;
        void c2;
        void d6;
        void e2;
        void f4;
        float f5 = f3;
        aKa b2 = aKa2;
        b2.J((double)f4, (double)e2, (double)d6).J((double)c2, (double)g2).J(pqa.r, pqa.r, pqa.r, (float)a2).M();
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        GC_1 g2 = vL2;
        GC_1 f4 = this;
        if (f4.A.b != null) {
            void a2;
            void c2;
            void d5;
            void e2;
            if (f4.A.b.Xa && f4.I > JPa.N && !g2.C() && f4.A.J()) {
                float f5;
                double d6 = f4.A.J(((vL)g2).la, ((vL)g2).Z, ((vL)g2).A);
                float b2 = (float)((oua.i - d6 / ZSa.o) * (double)f4.J);
                if ((double)f5 > aSa.V) {
                    f4.f((vL)g2, (double)e2, (double)d5, (double)c2, b2, (float)a2);
                }
            }
            if (!(!g2.e() || g2 instanceof Sx && ((Sx)((Object)g2)).t())) {
                f4.J((vL)g2, (double)e2, (double)d5, (double)c2, (float)a2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(vL vL2, double d2, double d3, double d4, float f2) {
        void b22;
        void c22;
        void d222;
        GC_1 f222 = vL2;
        GC_1 e2 = this;
        uKa.L();
        WKa wKa2 = Kpa.J().J();
        KLa a2 = wKa2.J(Hta.Y);
        KLa kLa2 = wKa2.J(tpa.d);
        uKa.e();
        uKa.J((float)((float)d222), (float)((float)c22), (float)((float)b22));
        GC_1 gC_1 = f222;
        float d222 = ((vL)gC_1).F * NPa.B;
        uKa.l((float)d222, (float)d222, (float)d222);
        pKa pKa2 = pKa.J();
        aKa c22 = pKa2.J();
        float f3 = MQa.L;
        float b22 = JPa.N;
        float f4 = ((vL)gC_1).u / d222;
        float f222 = (float)(((vL)gC_1).Z - f222.J().j);
        uKa.J((float)(-e2.A.c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)JPa.N, (float)(SQa.w + (float)((int)f4) * WRa.e));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        float f5 = JPa.N;
        int n2 = uSa.E;
        c22.J(XTa.W, mka.A);
        float f6 = f4;
        while (f6 > JPa.N) {
            KLa kLa3 = n2 % uqa.g == 0 ? a2 : kLa2;
            e2.J(WKa.C);
            KLa kLa4 = kLa3;
            float f7 = kLa4.l();
            float f8 = kLa4.J();
            float f9 = kLa3.C();
            float f10 = kLa4.f();
            if (n2 / uqa.g % uqa.g == 0) {
                float f11 = f9;
                f9 = f7;
                f7 = f11;
            }
            aKa aKa2 = c22;
            float f12 = f3;
            aKa aKa3 = c22;
            aKa3.J((double)(f3 - b22), (double)(JPa.N - f222), (double)f5).J((double)f9, (double)f10).M();
            aKa3.J((double)(-f3 - b22), (double)(JPa.N - f222), (double)f5).J((double)f7, (double)f10).M();
            aKa2.J((double)(-f12 - b22), (double)(NPa.B - f222), (double)f5).J((double)f7, (double)f8).M();
            aKa2.J((double)(f12 - b22), (double)(NPa.B - f222), (double)f5).J((double)f9, (double)f8).M();
            f222 -= KTa.r;
            f3 *= ATa.r;
            ++n2;
            f5 += kTa.J;
            f6 = f4 -= KTa.r;
        }
        pKa2.J();
        uKa.D();
        uKa.P();
    }
}

