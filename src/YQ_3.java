/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AQ
 *  Gl
 *  JPa
 *  KTa
 *  Kna
 *  Kpa
 *  Lra
 *  MP
 *  MQa
 *  NPa
 *  NQa
 *  Qsa
 *  SQa
 *  Wsa
 *  XTa
 *  YSa
 *  aKa
 *  aSa
 *  asa
 *  bSa
 *  di
 *  iq
 *  jRa
 *  kpa
 *  kta
 *  mFa
 *  mka
 *  nLa
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  xJa
 *  xy
 *  ysa
 *  zp
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class YQ_3 {
    private final Map<String, pp> F;
    public boolean g;
    public int L;
    public int E = ysa.s;
    public final List<zp> m;
    public di C;
    public int i;
    private final List<iq> M;
    private int k;
    private static final ResourceLocation j = new ResourceLocation(asa.X);
    private boolean J;
    public long A;
    public final List<zp> I;

    public iq J(int n2) {
        int b2 = n2;
        YQ_3 a2 = this;
        return a2.M.get(b2);
    }

    public void J(pp pp2) {
        pp b2 = pp2;
        YQ_3 a2 = this;
        a2.F.put(b2.J(), b2);
    }

    public Map<String, pp> J() {
        YQ_3 a2;
        return a2.F;
    }

    private void l() {
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2, double d2, double d3, double d4, float f2) {
        void a2;
        void b2;
        void c2;
        void d5;
        YQ_3 f3 = vL2;
        YQ_3 e2 = this;
        YQ_3 yQ_3 = f3;
        e2.A = OT.e;
        e2.f((vL)yQ_3, (double)d5, (double)c2, (double)b2, Nra.e, (float)a2);
        if (yQ_3.G() && f3.J()) {
            e2.J((vL)f3, (double)d5, (double)c2, (double)b2);
        }
        if (f3.o()) {
            e2.J((vL)f3, (double)d5, (double)c2, (double)b2, (float)a2);
        }
    }

    private boolean J(vL vL2) {
        YQ_3 b2 = vL2;
        YQ_3 a2 = this;
        if (b2 instanceof Gl && !Ni.J((vL)b2) && (((Gl)b2).ha > 0 || ((Gl)b2).a > 0)) {
            uKa.f((float)pqa.r, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f() {
        Iterator<iq> a2;
        YQ_3 yQ_3 = this;
        Fi fi2 = yQ_3.M.get((int)uSa.E).M.M;
        if (!yQ_3.J) {
            YQ_3 yQ_32 = yQ_3;
            yQ_32.J = vRa.d;
            yQ_32.C.f(fi2);
            uKa.C((int)fi2.J);
            Iterator<iq> iterator = a2 = yQ_32.M.iterator();
            while (iterator.hasNext()) {
                iq iq2 = a2.next();
                iterator = a2;
                iq2.J();
            }
        } else {
            uKa.C((int)fi2.J);
            a2 = yQ_3.M.iterator();
            Iterator<iq> iterator = a2;
            while (iterator.hasNext()) {
                iq iq3 = (iq)a2.next();
                iterator = a2;
                iq3.J = vRa.d;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2, float f3, int n2, int n3, float f4, float f5, float f6, float f7) {
        void h22;
        void g2;
        void b2;
        void e2;
        void j22;
        void i2;
        int n4 = n2;
        YQ_3 f8 = this;
        f8.A = OT.e;
        if (i2 != null && i2.C()) {
            return;
        }
        uKa.J();
        uKa.K();
        uKa.o();
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        if (f8.g) {
            uKa.h();
        } else {
            uKa.m();
        }
        uKa.e();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.J((float)((float)j22), (float)((float)e2), (float)vua.ha);
        float j22 = KTa.r;
        void v0 = b2 *= j22;
        uKa.l((float)v0, (float)(-b2), (float)v0);
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)Era.h, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        nLa.J();
        uKa.J((float)opa.z, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)(vqa.T / j22), (float)JPa.N);
        uKa.J((float)(-g2), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)(Hra.Ga - h22), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)(pqa.r / j22), (float)JPa.N);
        int h22 = i2 == null ? pua.o : Ni.J((vL)i2);
        f8.J(Nra.e, vRa.d != 0, uSa.E != 0, h22, JPa.N);
        uKa.D();
        uKa.u();
        uKa.c();
        uKa.E();
        nLa.C();
    }

    public pp J(String string) {
        String b2 = string;
        YQ_3 a2 = this;
        return a2.F.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(vL vL2, double d2, double d3, double d4) {
        String string;
        String string2;
        YQ_3 e2 = vL2;
        YQ_3 d5 = this;
        if (e2 instanceof Sx) {
            string = string2 = e2.J() ? e2.e() : e2.J();
        } else {
            YQ_3 yQ_3 = e2;
            string = e2 instanceof mFa ? (string2 = yQ_3.J().l()) : (string2 = yQ_3.J());
        }
        if (string.equals(TOa.t)) {
            return;
        }
        double d6 = ypa.X;
        Kpa kpa2 = Kpa.J();
        oLa oLa2 = kpa2.J();
        double d7 = d6;
        if (d5.J((vL)e2, kpa2.J()) <= d7 * d7) {
            void a2;
            void b2;
            void c2;
            uKa.e();
            float f2 = Wsa.l;
            float f3 = MQa.L;
            if (e2 instanceof Gl) {
                float f4 = Ni.J((vL)e2);
                f2 *= f4;
                f3 *= f4;
            }
            uKa.J((float)((float)c2), (float)((float)(b2 + (double)((vL)e2).u + (double)f3)), (float)((float)a2));
            GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
            oLa oLa3 = oLa2;
            uKa.J((float)(-oLa3.c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)oLa3.l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.l((float)(-f2), (float)(-f2), (float)f2);
            uKa.L();
            uKa.J(uSa.E != 0);
            uKa.u();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.z();
            Kna kna2 = kpa2.Ea;
            pKa pKa2 = pKa.J();
            e2 = pKa2;
            Kna kna3 = kna2;
            float f5 = (float)kna3.J(string2) / kta.v;
            YQ_3 yQ_3 = e2 = e2.J();
            float f6 = f5;
            YQ_3 yQ_32 = e2;
            yQ_32.J(XTa.W, mka.I);
            yQ_32.J((double)(-f5) - oua.i, pqa.q, aSa.V).J(uSa.E, uSa.E, uSa.E, ysa.s).M();
            e2.J((double)(-f6) - oua.i, Wqa.Z, aSa.V).J(uSa.E, uSa.E, uSa.E, ysa.s).M();
            yQ_3.J((double)f6 + oua.i, Wqa.Z, aSa.V).J(uSa.E, uSa.E, uSa.E, ysa.s).M();
            yQ_3.J((double)f5 + oua.i, pqa.q, aSa.V).J(uSa.E, uSa.E, uSa.E, ysa.s).M();
            pKa2.J();
            uKa.H();
            kna3.l(string2, -f5, JPa.N, STa.Ha, uSa.E != 0);
            uKa.J();
            uKa.J(vRa.d != 0);
            kna2.l(string2, -f5, JPa.N, pua.o, uSa.E != 0);
            uKa.P();
            uKa.k();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.D();
        }
    }

    public void J(iq iq2) {
        YQ_3 b2 = iq2;
        YQ_3 a2 = this;
        a2.M.add((iq)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        float a2;
        void c2;
        void d222;
        void v0;
        void e22;
        YQ_3 g2 = vL2;
        YQ_3 f4 = this;
        uKa.e();
        if (f4.g) {
            uKa.h();
            v0 = e22;
        } else {
            uKa.m();
            v0 = e22;
        }
        uKa.f((double)v0, (double)d222, (double)c2);
        YQ_3 yQ_3 = f4;
        YQ_3 yQ_32 = g2;
        a2 = yQ_3.J((vL)yQ_32, a2);
        uKa.o();
        YQ_3 yQ_33 = g2;
        float e22 = Ni.J((vL)g2);
        uKa.l((float)(YSa.d * e22), (float)(bSa.V * e22), (float)(bSa.V * e22));
        int n2 = Ni.J((vL)yQ_33);
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        boolean bl = yQ_3.J((vL)yQ_32);
        int d222 = !yQ_33.C() ? vRa.d : uSa.E;
        int n3 = d222 == 0 && !g2.f((Sx)Kpa.J().c) ? vRa.d : uSa.E;
        f4.J((float)b2, d222 != 0, n3 != 0, n2, a2);
        if (bl) {
            f4.l();
        }
        uKa.h();
        uKa.D();
    }

    public void J(vL vL2, float f2, float f3, float f4) {
        float e2 = f3;
        YQ_3 b2 = this;
        uKa.J((float)(CRa.ja - e2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    private void J(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        YQ_3 g22 = vL2;
        YQ_3 f4 = this;
        uKa.J(uSa.E != 0);
        uKa.z();
        uKa.L();
        uKa.m();
        uKa.k();
        YQ_3 yQ_3 = g22;
        float g22 = ((vL)yQ_3).F / kta.v;
        float b2 = ((vL)yQ_3).u;
        MP.J((xy)new xy((double)(e2 - (double)g22), (double)d5, (double)(c2 - (double)g22), (double)(e2 + (double)g22), (double)(d5 + (double)b2), (double)(c2 + (double)g22)), (int)osa.Ja, (int)osa.Ja, (int)uSa.E, (int)osa.Ja);
        uKa.H();
        uKa.P();
        uKa.h();
        uKa.k();
        uKa.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2, float f3, float f4) {
        void a2;
        void c2;
        float d2 = f3;
        YQ_3 b2 = this;
        float f5 = d2 = d2 - c2;
        while (f5 < xua.V) {
            f5 = d2 + CRa.ja;
        }
        float f6 = d2;
        while (f6 >= Hra.Ga) {
            f6 = d2 - CRa.ja;
        }
        return (float)(c2 + a2 * d2);
    }

    /*
     * WARNING - void declaration
     */
    private double J(vL vL2, vL vL3) {
        void a2;
        YQ_3 c2 = vL2;
        YQ_3 b2 = this;
        void v0 = a2;
        double d2 = v0.la - ((vL)c2).la;
        double d3 = v0.Z - ((vL)c2).Z;
        double d4 = v0.A - ((vL)c2).A;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public void J() {
        iq iq2;
        Iterator<zp> a2;
        YQ_3 yQ_3 = this;
        Iterator<zp> iterator = a2 = yQ_3.M.iterator();
        while (iterator.hasNext()) {
            iq2 = (iq)a2.next();
            iterator = a2;
            yQ_3.C.J(iq2.M.M);
        }
        Iterator<zp> iterator2 = a2 = yQ_3.I.iterator();
        while (iterator2.hasNext()) {
            iq2 = a2.next();
            if (iq2.f()) {
                iterator2 = a2;
                continue;
            }
            iq2.f();
            iterator2 = a2;
        }
        if (yQ_3.k != pua.o) {
            GL11.glDeleteLists(yQ_3.k, vRa.d);
            yQ_3.k = pua.o;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, boolean bl, boolean bl2, int n2, float f3) {
        void c2;
        void d22;
        int n3 = n2;
        YQ_3 b2 = this;
        if (d22 != false || c2 != false) {
            void v3;
            void e2;
            void f42;
            b2.f();
            uKa.e();
            Color d22 = new Color((int)f42, vRa.d != 0);
            uKa.f((float)((float)d22.getRed() / NQa.Y), (float)((float)d22.getGreen() / NQa.Y), (float)((float)d22.getBlue() / NQa.Y), (float)((c2 != false ? (float)d22.getAlpha() * VPa.i : (float)d22.getAlpha()) / NQa.Y));
            if (c2 != false || d22.getAlpha() < osa.Ja) {
                uKa.J(uSa.E != 0);
                uKa.B();
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.J((int)jRa.m, (float)Qsa.V);
            }
            if (b2.m.isEmpty()) {
                if (b2.k == pua.o) {
                    Iterator<zp> iterator;
                    YQ_3 yQ_3 = b2;
                    yQ_3.k = xJa.J((int)vRa.d);
                    GL11.glNewList(yQ_3.k, Wqa.O);
                    mr f42 = new mr();
                    AQ aQ2 = new AQ();
                    void v1 = e2;
                    f42.f((float)v1, (float)v1, (float)v1);
                    Iterator<zp> iterator2 = iterator = yQ_3.I.iterator();
                    while (iterator2.hasNext()) {
                        zp zp2 = iterator.next();
                        if (zp2.f()) {
                            iterator2 = iterator;
                            continue;
                        }
                        zp2.J(f42, aQ2);
                        iterator2 = iterator;
                    }
                    aQ2.J();
                    GL11.glEndList();
                }
                uKa.l((int)b2.k);
                v3 = c2;
            } else {
                Iterator<zp> f42;
                Iterator<zp> iterator = f42 = b2.I.iterator();
                while (iterator.hasNext()) {
                    zp zp3 = f42.next();
                    if (zp3.f()) {
                        iterator = f42;
                        continue;
                    }
                    if (pua.y.equals(zp3.I)) {
                        void a2;
                        uKa.e();
                        uKa.J((float)(-a2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                        iterator = f42;
                        zp3.J((float)e2);
                        uKa.D();
                        continue;
                    }
                    zp3.J((float)e2);
                    iterator = f42;
                }
                v3 = c2;
            }
            if (v3 != false || d22.getAlpha() < osa.Ja) {
                uKa.k();
                uKa.J((int)jRa.m, (float)Nra.e);
                uKa.J(vRa.d != 0);
            }
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.D();
        }
    }

    public YQ_3() {
        YQ_3 a2;
        a2.L = fPa.i;
        YQ_3 yQ_3 = a2;
        a2.M = new ArrayList<iq>();
        a2.g = uSa.E;
        a2.i = uSa.E;
        a2.A = OT.e;
        a2.I = new ArrayList<zp>();
        a2.m = new ArrayList<zp>();
        a2.F = new HashMap<String, pp>();
        a2.k = pua.o;
    }

    public List<iq> J() {
        YQ_3 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    private void J(vL vL2, double d2, double d3, double d4, float f2) {
        void b22;
        void c22;
        void d222;
        YQ_3 f222 = vL2;
        YQ_3 e2 = this;
        uKa.L();
        Kpa a2 = Kpa.J();
        WKa wKa2 = a2.J();
        KLa kLa2 = wKa2.J(Hta.Y);
        KLa kLa3 = wKa2.J(tpa.d);
        uKa.e();
        uKa.J((float)((float)d222), (float)((float)c22), (float)((float)b22));
        YQ_3 yQ_3 = f222;
        YQ_3 yQ_32 = f222;
        float d222 = ((vL)yQ_3).F * NPa.B * Ni.J((vL)yQ_32);
        uKa.l((float)d222, (float)d222, (float)d222);
        pKa pKa2 = pKa.J();
        aKa c22 = pKa2.J();
        float f3 = MQa.L;
        float b22 = JPa.N;
        float f4 = ((vL)yQ_3).u / d222;
        float f222 = (float)(((vL)yQ_32).Z - f222.J().j);
        uKa.J((float)(-a2.J().c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)JPa.N, (float)(SQa.w + (float)((int)f4) * WRa.e));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        float f5 = JPa.N;
        int n2 = uSa.E;
        float f6 = f4;
        c22.J(XTa.W, mka.A);
        while (f6 > JPa.N) {
            KLa kLa4 = n2 % uqa.g == 0 ? kLa2 : kLa3;
            a2.J().J(j);
            KLa kLa5 = kLa4;
            float f7 = kLa5.l();
            float f8 = kLa5.J();
            float f9 = kLa4.C();
            float f10 = kLa5.f();
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

    public float J(vL vL2, float f2) {
        YQ_3 c22 = vL2;
        YQ_3 b2 = this;
        if (c22 instanceof Gl) {
            Gl a2 = (Gl)c22;
            float f3 = Kpa.J().w.j.J();
            YQ_3 yQ_3 = b2;
            Gl gl2 = a2;
            float c22 = b2.J(a2.Ma, gl2.ba, f3);
            float cfr_ignored_0 = yQ_3.J(gl2.ga, a2.X, f3) - c22;
            yQ_3.J((vL)c22, JPa.N, c22, f3);
            return c22;
        }
        return JPa.N;
    }
}

