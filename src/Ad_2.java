/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CV
 *  EK
 *  ERa
 *  GC
 *  Gl
 *  Gua
 *  ISa
 *  JPa
 *  JTa
 *  Kna
 *  Kpa
 *  Lra
 *  MA
 *  MQa
 *  Mda
 *  NQa
 *  Oz
 *  PJa
 *  Qsa
 *  RQa
 *  VJa
 *  Wsa
 *  XTa
 *  Yaa
 *  Yra
 *  aKa
 *  aSa
 *  bpa
 *  bqa
 *  cRa
 *  dpa
 *  hra
 *  id
 *  jRa
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  mFa
 *  mka
 *  nka
 *  pKa
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  vL
 *  vQa
 *  vRa
 *  wOa
 *  xBa
 *  xJa
 *  zU
 */
import com.google.common.collect.Lists;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.model.ModelBase;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Ad_2<T extends Gl>
extends GC<T> {
    private static final VJa E;
    public FloatBuffer m;
    public ModelBase C;
    private static final Logger i;
    public static float M;
    public List<id<T>> k;
    public static float j;
    private static final String A = "CL_00001012";
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public void f(T t2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Ad_2<T> e2 = t2;
        Ad_2 d5 = this;
        uKa.J((float)((float)c2), (float)((float)b2), (float)((float)a2));
    }

    /*
     * WARNING - void declaration
     */
    private void J(T t2) {
        int n2;
        int n3;
        Ad_2 ad_2;
        void a2;
        Ad_2 ad_22 = this;
        Ad_2 b322 = Kpa.J();
        void v0 = a2;
        void v1 = a2;
        double d2 = v0.V + (v1.la - a2.V) * (double)((Kpa)b322).w.j.J() - b322.J().J();
        double d3 = v1.Ga + (a2.Z - a2.Ga) * (double)((Kpa)b322).w.j.J() - b322.J().l();
        Ad_2 ad_23 = b322;
        double d4 = v0.Ca + (a2.A - a2.Ca) * (double)((Kpa)b322).w.j.J() - ad_23.J().f();
        uKa.e();
        uKa.f((double)d2, (double)(d3 + (double)a2.l() + Yra.f), (double)d4);
        if (((Kpa)ad_23).z.ld == uqa.g) {
            Ad_2 ad_24 = b322;
            ad_2 = ad_24;
            uKa.J((float)(-ad_24.J().c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)(-ad_24.J().l), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        } else {
            Ad_2 ad_25 = b322;
            ad_2 = ad_25;
            uKa.J((float)(-((Kpa)ad_25).c.X), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)((Kpa)ad_25).c.d, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
        float b322 = ((Kpa)ad_2).c.J((vL)a2);
        float f2 = JTa.g;
        float f3 = Nra.e;
        d2 = hpa.y;
        float f4 = Ira.d;
        b322 = (float)((double)b322 <= d2 ? d2 * (double)f3 : (double)(b322 * f3));
        f2 *= b322;
        f2 = Math.min((float)((double)f4 * SPa.x), f2);
        uKa.l((float)(-f2), (float)(-f2), (float)psa.N);
        uKa.l((float)pqa.r, (float)pqa.r, (float)ZSa.r);
        uKa.L();
        int b322 = uSa.E;
        int n4 = n3 = uSa.E;
        while (n4 < tTa.h) {
            if (a2.f(n3) != null) {
                ++b322;
            }
            n4 = ++n3;
        }
        n3 = wOa.t;
        b322 = -(b322 * n3) / uqa.g;
        int n5 = n2 = uSa.E;
        while (n5 < tTa.h) {
            Mda mda2 = a2.f(n2);
            if (mda2 != null) {
                ad_22.J(mda2, b322, uSa.E);
                b322 += n3;
            }
            n5 = ++n2;
        }
        uKa.D();
        uKa.K();
        uKa.P();
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        Ad_2 ad_2 = this;
        float g2 = Ni.J((vL)f4);
        if (g2 == pqa.r) {
            super.J((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
            return;
        }
        float f5 = g2;
        uKa.l((float)f5, (float)f5, (float)f5);
        super.J((vL)f4, (double)(e2 / (double)g2), (double)(d5 / (double)g2), (double)(c2 / (double)g2), (float)b2, (float)a2);
        uKa.l((float)(pqa.r / g2), (float)(pqa.r / g2), (float)(pqa.r / g2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        void c2;
        void d5;
        void e2;
        Object object;
        void a2;
        Ad_2<T> g2 = t2;
        Ad_2 f4 = this;
        uKa.e();
        uKa.m();
        Ad_2 ad_2 = f4;
        ad_2.C.swingProgress = f4.f((T)((Object)g2), (float)a2);
        Ad_2<T> ad_22 = g2;
        ad_2.C.isRiding = ad_22.B();
        if (ad_22 instanceof Sx && jD.M && !(object = (Sx)((Object)g2)).t()) {
            try {
                if ((zU.M.f() || Kpa.J().c == g2) && ((Sx)((Object)g2)).m.J((double)e2, (double)d5, (double)c2, (float)a2)) {
                    if (MA.l((Gl)g2)) {
                        f4.J((T)((Object)g2), (double)e2, (double)d5, (double)c2);
                    }
                    uKa.h();
                    uKa.D();
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        try {
            object = Ni.J((vL)g2);
            if (object != null && object.F) {
                uKa.h();
                uKa.D();
                return;
            }
            if (object != null && object.C != null && object.C.J((vL)g2, (double)(e2 + (double)object.j), (double)(d5 + (double)object.i), (double)(c2 + (double)object.L), (float)b2, (float)a2)) {
                uKa.h();
                uKa.D();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        f4.C.isChild = g2.Y();
        try {
            float f5;
            float f6;
            Ad_2 ad_23 = f4;
            Ad_2<T> ad_24 = g2;
            float f7 = ad_23.J(((Gl)ad_24).Ma, ((Gl)ad_24).ba, (float)a2);
            float f8 = ad_23.J(((Gl)g2).ga, ((Gl)g2).t, (float)a2);
            float f9 = f8 - f7;
            if (f4.C.isRiding && ((Gl)g2).ja instanceof Gl) {
                float f10;
                Gl gl2;
                Gl gl3 = gl2 = (Gl)((Gl)g2).ja;
                f7 = f4.J(gl3.Ma, gl3.ba, (float)a2);
                f9 = f8 - f7;
                f6 = Oz.f((float)f9);
                if (f10 < Gua.Ja) {
                    f6 = Gua.Ja;
                }
                if (f6 >= lPa.l) {
                    f6 = lPa.l;
                }
                f7 = f8 - f6;
                float f11 = f6;
                if (f11 * f11 > cRa.L) {
                    f7 += f6 * psa.N;
                }
            }
            if (g2 == ((oLa)((Object)f4.A)).B) {
                Ad_2<T> ad_25 = g2;
                f5 = ((Gl)ad_25).h + (((Gl)ad_25).N - ((Gl)g2).h) * a2;
            } else {
                Ad_2<T> ad_26 = g2;
                f5 = ((Gl)ad_26).o + (((Gl)ad_26).d - ((Gl)g2).o) * a2;
            }
            float f12 = f5;
            Ad_2 ad_27 = f4;
            Ad_2<T> ad_28 = g2;
            Ad_2 ad_29 = f4;
            ad_29.f((T)((Object)g2), (double)e2, (double)d5, (double)c2);
            f6 = ad_29.J((T)((Object)g2), (float)a2);
            ad_27.J((T)((Object)ad_28), f6, f7, (float)a2);
            uKa.o();
            Ad_2<T> ad_210 = g2;
            f8 = Ni.J((vL)ad_210);
            uKa.l((float)(vqa.T * f8), (float)(vqa.T * f8), (float)f8);
            ad_27.J((T)((Object)ad_28), (float)a2);
            uKa.J((float)JPa.N, (float)bqa.ja, (float)JPa.N);
            Ad_2<T> ad_211 = g2;
            Ad_2<T> ad_212 = g2;
            f8 = ((Gl)ad_211).z + (((Gl)ad_211).U - ((Gl)ad_212).z) * a2;
            float f13 = ((Gl)ad_212).E - ((Gl)g2).U * (pqa.r - a2);
            if (ad_210.Y()) {
                f13 *= vQa.q;
            }
            if (f8 > pqa.r) {
                f8 = pqa.r;
            }
            uKa.K();
            Ad_2 ad_213 = f4;
            ad_213.C.J((Gl)g2, f13, f8, (float)a2);
            ad_213.C.J(f13, f8, f6, f9, f12, rRa.T, (vL)g2);
            if (ad_213.I) {
                Ad_2 ad_214 = f4;
                boolean bl = ad_214.J((Gl)g2);
                ad_214.J((T)((Object)g2), f13, f8, f6, f9, f12, rRa.T);
                if (bl) {
                    f4.f();
                }
            } else {
                Ad_2 ad_215 = f4;
                Ad_2<T> ad_216 = g2;
                boolean bl = ad_215.J((T)((Object)ad_216), (float)a2);
                ad_215.J((T)((Object)ad_216), f13, f8, f6, f9, f12, rRa.T);
                if (bl) {
                    f4.J();
                }
                uKa.J(vRa.d != 0);
                if (!(g2 instanceof Sx) || !((Sx)((Object)g2)).t()) {
                    f4.J((T)((Object)g2), f13, f8, (float)a2, f6, f9, f12, rRa.T);
                }
            }
            uKa.E();
        }
        catch (Exception exception) {
            i.error(Mqa.L, (Throwable)exception);
        }
        uKa.i((int)nka.P);
        uKa.H();
        uKa.i((int)nka.v);
        uKa.h();
        uKa.D();
        if (!f4.I) {
            super.l((vL)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
        }
    }

    public void J(T t2, float f2) {
        float c2 = f2;
        Ad_2 ad_2 = this;
    }

    public ModelBase J() {
        Ad_2 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2, float f3, float f4) {
        void a2;
        void c2;
        float d2 = f3;
        Ad_2 b2 = this;
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
    public void J(T t2, double d2, double d3, double d4) {
        Ad_2 d5 = this;
        Ad_2<T> e2 = t2;
        if (d5.f((id)e2)) {
            float f2;
            Ad_2<T> ad_2 = e2;
            double d6 = ad_2.J(((oLa)((Object)d5.A)).B);
            float f3 = f2 = ad_2.q() ? M : j;
            if (d6 < (double)(f3 * f3)) {
                void a2;
                void b2;
                void c2;
                String string;
                String string2;
                if (e2 instanceof Sx) {
                    string = string2 = e2.J() ? e2.e() : e2.J();
                } else {
                    Ad_2<T> ad_22 = e2;
                    string = e2 instanceof mFa ? (string2 = ad_22.J().l()) : (string2 = ad_22.J());
                }
                if (string.equals(TOa.t)) {
                    return;
                }
                uKa.J((int)jRa.m, (float)Nra.e);
                if (ts.A) {
                    d5.J((T)((Object)e2));
                }
                if (e2.q()) {
                    aKa aKa2;
                    Kna kna2 = d5.J();
                    uKa.e();
                    uKa.J((float)((float)c2), (float)((float)b2 + ((Gl)e2).u + MQa.L - (e2.Y() ? ((Gl)e2).u / kta.v : JPa.N)), (float)((float)a2));
                    GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
                    Ad_2 ad_23 = d5;
                    uKa.J((float)(-((oLa)((Object)ad_23.A)).c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                    uKa.J((float)((oLa)((Object)ad_23.A)).l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                    uKa.l((float)Mqa.r, (float)Mqa.r, (float)bpa.O);
                    uKa.J((float)JPa.N, (float)Npa.a, (float)JPa.N);
                    uKa.L();
                    uKa.J(uSa.E != 0);
                    uKa.B();
                    uKa.z();
                    uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                    int n2 = kna2.J(string2) / uqa.g;
                    pKa pKa2 = pKa.J();
                    aKa aKa3 = aKa2 = pKa2.J();
                    int n3 = n2;
                    aKa aKa4 = aKa2;
                    aKa4.J(XTa.W, mka.I);
                    aKa4.J((double)(-n2 - vRa.d), pqa.q, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    aKa2.J((double)(-n3 - vRa.d), Wqa.Z, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    aKa3.J((double)(n3 + vRa.d), Wqa.Z, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    aKa3.J((double)(n2 + vRa.d), pqa.q, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    pKa2.J();
                    uKa.H();
                    uKa.J(vRa.d != 0);
                    Kna kna3 = kna2;
                    kna3.J(string2, -kna3.J(string2) / uqa.g, uSa.E, STa.Ha);
                    uKa.P();
                    uKa.k();
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                    uKa.D();
                    return;
                }
                d5.J((vL)e2, (double)c2, (double)(b2 - (e2.Y() ? (double)(((Gl)e2).u / kta.v) : aSa.V)), (double)a2, string2, bpa.O, d6);
            }
        }
    }

    public float J(T t2) {
        Ad_2<T> b2 = t2;
        Ad_2 a2 = this;
        return ISa.a;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Mda mda2, int n2, int n3) {
        void a2;
        void b2;
        void c2;
        Ad_2 ad_2 = this;
        Ad_2 d2 = Kpa.J();
        uKa.e();
        d2.J().m = pua.Ja;
        uKa.l((float)pqa.r, (float)pqa.r, (float)Jpa.B);
        d2.J().f((Mda)c2, (int)b2, (int)(a2 + lqa.s));
        d2.J().m = JPa.N;
        uKa.D();
    }

    public void l() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean f(T t2) {
        void a2;
        int n2;
        Ad_2 ad_2 = this;
        Ad_2 b2 = Kpa.J().c;
        int n3 = n2 = !a2.f((Sx)((Object)b2)) ? vRa.d : uSa.E;
        if (a2 instanceof Sx && a2 != b2) {
            Yaa yaa2 = a2.J();
            b2 = b2.J();
            if (yaa2 != null) {
                xBa xBa2 = yaa2.J();
                switch (PJa.I[xBa2.ordinal()]) {
                    case 1: {
                        return n2 != 0;
                    }
                    case 2: {
                        return uSa.E != 0;
                    }
                    case 3: {
                        if (b2 == null) {
                            return n2 != 0;
                        }
                        if (yaa2.J((Yaa)b2) && (yaa2.J() || n2 != 0)) {
                            return vRa.d != 0;
                        }
                        return uSa.E != 0;
                    }
                    case 4: {
                        if (b2 == null) {
                            return n2 != 0;
                        }
                        if (!yaa2.J((Yaa)b2) && n2 != 0) {
                            return vRa.d != 0;
                        }
                        return uSa.E != 0;
                    }
                }
                return vRa.d != 0;
            }
        }
        if (Kpa.G() && a2 != ((oLa)((Object)ad_2.A)).B && n2 != 0 && a2.Aa == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        int n2;
        i = LogManager.getLogger();
        E = new VJa(ERa.C, ERa.C);
        j = EPa.r;
        M = Ura.m;
        int[] nArray = E.J();
        int n3 = n2 = uSa.E;
        while (n3 < hra.Ja) {
            nArray[n2++] = pua.o;
            n3 = n2;
        }
        E.f();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(T t2, float f2, boolean bl) {
        Ad_2 ad_2;
        Ad_2 b2;
        block6: {
            block5: {
                int d32;
                block4: {
                    void a2;
                    int n2;
                    void c2;
                    b2 = this;
                    float d32 = f2;
                    float f3 = c2.J(d32);
                    d32 = b2.J(c2, f3, d32);
                    int n3 = (d32 >> osa.c & osa.Ja) > 0 ? vRa.d : uSa.E;
                    int n4 = n2 = c2.ha > 0 || c2.a > 0 ? vRa.d : uSa.E;
                    if (Ni.J((vL)c2)) {
                        n2 = uSa.E;
                    }
                    if (n3 == 0 && n2 == 0) {
                        return uSa.E != 0;
                    }
                    if (n3 == 0 && a2 == false) {
                        return uSa.E != 0;
                    }
                    uKa.i((int)nka.v);
                    uKa.H();
                    GL11.glTexEnvi(ZSa.K, Psa.e, nka.m);
                    GL11.glTexEnvi(ZSa.K, nka.X, WPa.R);
                    GL11.glTexEnvi(ZSa.K, nka.Ka, nka.v);
                    GL11.glTexEnvi(ZSa.K, nka.Aa, nka.f);
                    GL11.glTexEnvi(ZSa.K, nka.D, tua.C);
                    GL11.glTexEnvi(ZSa.K, nka.e, tua.C);
                    GL11.glTexEnvi(ZSa.K, nka.B, dpa.j);
                    GL11.glTexEnvi(ZSa.K, nka.x, nka.v);
                    GL11.glTexEnvi(ZSa.K, nka.d, Lra.k);
                    uKa.i((int)nka.P);
                    uKa.H();
                    GL11.glTexEnvi(ZSa.K, Psa.e, nka.m);
                    GL11.glTexEnvi(ZSa.K, nka.X, nka.t);
                    GL11.glTexEnvi(ZSa.K, nka.Ka, nka.T);
                    GL11.glTexEnvi(ZSa.K, nka.Aa, nka.S);
                    GL11.glTexEnvi(ZSa.K, nka.Ja, nka.T);
                    GL11.glTexEnvi(ZSa.K, nka.D, tua.C);
                    GL11.glTexEnvi(ZSa.K, nka.e, tua.C);
                    GL11.glTexEnvi(ZSa.K, nka.j, Lra.k);
                    GL11.glTexEnvi(ZSa.K, nka.B, dpa.j);
                    GL11.glTexEnvi(ZSa.K, nka.x, nka.S);
                    GL11.glTexEnvi(ZSa.K, nka.d, Lra.k);
                    b2.m.position(uSa.E);
                    if (n2 == 0) break block4;
                    b2.m.put(pqa.r);
                    b2.m.put(JPa.N);
                    b2.m.put(JPa.N);
                    b2.m.put(bpa.K);
                    if (!Config.h()) break block5;
                    pA.J(pqa.r, JPa.N, JPa.N, bpa.K);
                    ad_2 = b2;
                    break block6;
                }
                float c2 = (float)(d32 >> osa.c & osa.Ja) / NQa.Y;
                float a2 = (float)(d32 >> ERa.C & osa.Ja) / NQa.Y;
                float f4 = (float)(d32 >> Yqa.i & osa.Ja) / NQa.Y;
                float d32 = (float)(d32 & osa.Ja) / NQa.Y;
                b2.m.put(a2);
                b2.m.put(f4);
                b2.m.put(d32);
                b2.m.put(pqa.r - c2);
                if (Config.h()) {
                    pA.J(a2, f4, d32, pqa.r - c2);
                }
            }
            ad_2 = b2;
        }
        ad_2.m.flip();
        GL11.glTexEnv(ZSa.K, rSa.Ga, b2.m);
        uKa.i((int)nka.c);
        uKa.H();
        uKa.C((int)E.J());
        GL11.glTexEnvi(ZSa.K, Psa.e, nka.m);
        GL11.glTexEnvi(ZSa.K, nka.X, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.Ka, nka.S);
        GL11.glTexEnvi(ZSa.K, nka.Aa, nka.P);
        GL11.glTexEnvi(ZSa.K, nka.D, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.e, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.B, dpa.j);
        GL11.glTexEnvi(ZSa.K, nka.x, nka.S);
        GL11.glTexEnvi(ZSa.K, nka.d, Lra.k);
        uKa.i((int)nka.v);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public float f(T t2, float f2) {
        void b2;
        float c2 = f2;
        Ad_2 a2 = this;
        return b2.f(c2);
    }

    /*
     * WARNING - void declaration
     */
    public float J(T t2, float f2) {
        void b2;
        float c2 = f2;
        Ad_2 a2 = this;
        return (float)b2.g + c2;
    }

    public <V extends Gl, U extends id<V>> boolean f(U u2) {
        Ad_2<Object> b2 = u2;
        Ad_2 a2 = this;
        return a2.k.add((id<T>)b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(T t2, float f2) {
        void b2;
        float c2 = f2;
        Ad_2 a2 = this;
        return a2.J(b2, c2, vRa.d != 0);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Ad_2 a2 = this;
        a2.I = b2;
    }

    public void f() {
        uKa.P();
        uKa.i((int)nka.v);
        uKa.H();
        uKa.i((int)nka.P);
        uKa.H();
        uKa.i((int)nka.v);
    }

    public int J(T t2, float f2, float f3) {
        float d2 = f3;
        Ad_2 a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gl gl2) {
        void a22;
        Ad_2 ad_2 = this;
        int b22 = Wsa.K;
        b22 = a22.e();
        float a22 = (float)(b22 >> ERa.C & osa.Ja) / NQa.Y;
        float f2 = (float)(b22 >> Yqa.i & osa.Ja) / NQa.Y;
        float b22 = (float)(b22 & osa.Ja) / NQa.Y;
        uKa.L();
        uKa.i((int)nka.v);
        uKa.f((float)a22, (float)f2, (float)b22, (float)pqa.r);
        uKa.z();
        uKa.i((int)nka.P);
        uKa.z();
        uKa.i((int)nka.v);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2;
        void g2;
        Ad_2 ad_2 = this;
        int h2 = !g2.C() ? vRa.d : uSa.E;
        int n3 = n2 = h2 == 0 && !g2.f((Sx)Kpa.J().c) ? vRa.d : uSa.E;
        if (h2 != 0 || n2 != 0) {
            void a2;
            void b2;
            void c2;
            void d2;
            void e2;
            void f8;
            if (!ad_2.f(g2)) {
                return;
            }
            h2 = Ni.J((vL)g2);
            if (EK.J((int)h2)) {
                n2 = vRa.d;
            }
            if (n2 != 0) {
                uKa.e();
                if (h2 == pua.o) {
                    h2 = pta.U;
                }
                uKa.J(uSa.E != 0);
                uKa.B();
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.J((int)jRa.m, (float)Qsa.V);
            }
            if (h2 != pua.o) {
                jI.J(h2);
            }
            CV.A = h2;
            ad_2.C.J((vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
            if (n2 != 0) {
                uKa.k();
                uKa.J((int)jRa.m, (float)Nra.e);
                uKa.D();
                uKa.J(vRa.d != 0);
            }
        }
    }

    public void J() {
        uKa.i((int)nka.v);
        uKa.H();
        GL11.glTexEnvi(ZSa.K, Psa.e, nka.m);
        GL11.glTexEnvi(ZSa.K, nka.X, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.Ka, nka.v);
        GL11.glTexEnvi(ZSa.K, nka.Aa, nka.f);
        GL11.glTexEnvi(ZSa.K, nka.D, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.e, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.B, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.x, nka.v);
        GL11.glTexEnvi(ZSa.K, nka.H, nka.f);
        GL11.glTexEnvi(ZSa.K, nka.d, Lra.k);
        GL11.glTexEnvi(ZSa.K, nka.q, Lra.k);
        uKa.i((int)nka.P);
        GL11.glTexEnvi(ZSa.K, Psa.e, nka.m);
        GL11.glTexEnvi(ZSa.K, nka.X, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.D, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.e, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.Ka, RQa.j);
        GL11.glTexEnvi(ZSa.K, nka.Aa, nka.S);
        GL11.glTexEnvi(ZSa.K, nka.B, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.d, Lra.k);
        GL11.glTexEnvi(ZSa.K, nka.x, RQa.j);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.i((int)nka.c);
        uKa.z();
        uKa.C((int)uSa.E);
        GL11.glTexEnvi(ZSa.K, Psa.e, nka.m);
        GL11.glTexEnvi(ZSa.K, nka.X, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.D, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.e, tua.C);
        GL11.glTexEnvi(ZSa.K, nka.Ka, RQa.j);
        GL11.glTexEnvi(ZSa.K, nka.Aa, nka.S);
        GL11.glTexEnvi(ZSa.K, nka.B, WPa.R);
        GL11.glTexEnvi(ZSa.K, nka.d, Lra.k);
        GL11.glTexEnvi(ZSa.K, nka.x, RQa.j);
        uKa.i((int)nka.v);
        if (Config.h()) {
            pA.J(JPa.N, JPa.N, JPa.N, JPa.N);
        }
    }

    public <V extends Gl, U extends id<V>> boolean J(U u2) {
        Ad_2<Object> b2 = u2;
        Ad_2 a2 = this;
        return a2.k.remove(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Ad_2 ad_2 = this;
        for (id<T> i222 : ad_2.k) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            void e2;
            void h2;
            boolean i222 = ad_2.J(h2, (float)e2, i222.J());
            i222.J((Gl)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
            if (!i222) continue;
            ad_2.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, float f2, float f3, float f4) {
        void d2;
        void b2;
        float e2 = f2;
        Ad_2 c2 = this;
        uKa.J((float)(Hra.Ga - b2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        if (d2.a > 0) {
            float f5;
            void a2;
            e2 = ((float)d2.a + a2 - pqa.r) / eta.e * ySa.Da;
            e2 = Oz.J((float)e2);
            if (f5 > pqa.r) {
                e2 = pqa.r;
            }
            uKa.J((float)(e2 * c2.J(d2)), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Ad_2(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        Ad_2 a2;
        float d2 = f2;
        Ad_2 ad_2 = a2 = this;
        super((oLa)c2);
        a2.m = xJa.J((int)AQa.P);
        a2.k = Lists.newArrayList();
        a2.I = uSa.E;
        ad_2.C = b2;
        ad_2.I = d2;
    }
}

