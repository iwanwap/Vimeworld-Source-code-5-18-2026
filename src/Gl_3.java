/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Aga
 *  Ata
 *  Bpa
 *  EBa
 *  ERa
 *  FPa
 *  Gg
 *  Gl
 *  Gua
 *  Hda
 *  I
 *  ISa
 *  Ifa
 *  JPa
 *  Kda
 *  LGa
 *  Lz
 *  MQa
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  QFa
 *  RC
 *  SQa
 *  Spa
 *  Tf
 *  Tpa
 *  UZ
 *  Uqa
 *  Uta
 *  VEa
 *  WQa
 *  Waa
 *  XTa
 *  YSa
 *  Yaa
 *  Ypa
 *  Zpa
 *  aQa
 *  aSa
 *  bFa
 *  bpa
 *  cRa
 *  dQa
 *  dba
 *  eAa
 *  gZ
 *  iaa
 *  jFa
 *  jGa
 *  jea
 *  kGa
 *  kIa
 *  kPa
 *  kba
 *  kta
 *  lqa
 *  pP
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  rAa
 *  uDa
 *  ura
 *  uw
 *  vL
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  waa
 *  xfa
 *  xy
 *  yba
 *  yra
 *  ysa
 *  zEa
 */
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Gl_3
extends vL {
    public float ia;
    public float Ma;
    public float ba;
    public int ha;
    private final iaa Fa;
    public double Ia;
    public int la;
    public float ga;
    public int ca;
    private int Ja;
    public boolean ja;
    public float Ha;
    public float Ga;
    public double fa;
    public int Ka;
    private int Aa;
    private Ifa S;
    private float Z;
    public float Y;
    private static final UUID r = UUID.fromString(Spa.G);
    public boolean V;
    public float z;
    public Sx y;
    public float U;
    public float P;
    public float t;
    private Zv R;
    public int Q;
    public float N;
    private static final CEa T = new uDa(r, Uqa.V, osa.b, uqa.g).J(uSa.E != 0);
    public float p;
    private Gl n;
    public int s;
    public float w;
    public float q;
    private Gl x;
    public float v;
    public float h;
    public float K;
    public double H;
    public float B;
    public int a;
    private float l;
    public float G;
    public float D;
    public int f;
    public int F;
    public boolean g;
    public float L;
    public float E;
    public double m;
    private final Map<Integer, kba> C;
    public float i;
    public double M;
    public float k;
    private boolean j;
    public int J;
    private final Mda[] A;
    public float I;

    public void i() {
        Gl_3 gl_3;
        Gl_3 a2;
        a2.a = ((Random)((Object)a2.R)).nextDouble() >= gl_3.J(Kha.k).f() ? vRa.d : uSa.E;
    }

    public void J(byte by2) {
        byte b2 = by2;
        Gl_3 a2 = this;
        if (b2 == uqa.g) {
            a2.U = Ira.d;
            a2.Fa = (iaa)a2.J;
            a2.ha = a2.la = NTa.C;
            a2.k = JPa.N;
            if (a2.f() != null) {
                Gl_3 gl_3 = a2;
                gl_3.J(a2.f(), a2.G(), (((Random)((Object)gl_3.R)).nextFloat() - ((Random)((Object)a2.R)).nextFloat()) * psa.N + pqa.r);
            }
            a2.J(gZ.b, JPa.N);
            return;
        }
        if (b2 == yRa.d) {
            if (a2.i() != null) {
                Gl_3 gl_3 = a2;
                gl_3.J(a2.i(), a2.G(), (((Random)((Object)gl_3.R)).nextFloat() - ((Random)((Object)a2.R)).nextFloat()) * psa.N + pqa.r);
            }
            Gl_3 gl_3 = a2;
            gl_3.A(JPa.N);
            gl_3.J(gZ.b);
            return;
        }
        super.J(b2);
    }

    public boolean Z() {
        Gl_3 a2;
        if (a2.f() <= JPa.N) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract Mda f(int var1);

    public void A(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        a2.aa.J(uua.p, Float.valueOf(Oz.J((float)b2, (float)JPa.N, (float)a2.J())));
    }

    public void i(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        if (b2 < JPa.N) {
            b2 = JPa.N;
        }
        a2.l = b2;
    }

    public boolean E() {
        Gl_3 a2;
        if (a2.J == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void M(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        a2.ia = b2;
    }

    public void J(gZ gZ2) {
        vL a2;
        Gl_3 gl_3 = this;
        a2 = a2.f();
        Gl_3 gl_32 = gl_3;
        Gl_3 b222 = gl_32.l();
        if (gl_32.Q >= 0 && b222 != null) {
            Gl_3 gl_33 = gl_3;
            b222.J(gl_33, gl_33.Q);
        }
        if (a2 != null) {
            a2.J((Gl)gl_3);
        }
        Gl_3 gl_34 = gl_3;
        gl_34.g = vRa.d;
        gl_34.J().l();
        if (!gl_34.j.e) {
            int b222 = uSa.E;
            if (a2 instanceof Sx) {
                b222 = kGa.d((Gl)((Gl_3)a2));
            }
            if (gl_3.s() && gl_3.j.J().f(Gua.H)) {
                int n2;
                boolean bl;
                int n3;
                boolean bl2;
                Gl_3 gl_35 = gl_3;
                if (gl_35.Ka > 0) {
                    bl2 = vRa.d;
                    n3 = b222;
                } else {
                    bl2 = uSa.E;
                    n3 = b222;
                }
                gl_35.J(bl2, n3);
                Gl_3 gl_36 = gl_3;
                if (gl_36.Ka > 0) {
                    bl = vRa.d;
                    n2 = b222;
                } else {
                    bl = uSa.E;
                    n2 = b222;
                }
                gl_36.f(bl, n2);
                if (gl_3.Ka > 0 && ((Random)((Object)gl_3.R)).nextFloat() < POa.o + (float)b222 * Jpa.B) {
                    gl_3.p();
                }
            }
        }
        gl_3.j.J((vL)gl_3, (byte)yRa.d);
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(gZ var1_1, float var2_2) {
        var3_3 = this;
        if (var3_3.J((gZ)b)) {
            return (boolean)uSa.E;
        }
        if (var3_3.j.e) {
            return (boolean)uSa.E;
        }
        var3_3.s = uSa.E;
        if (v0.f() <= JPa.N) {
            return (boolean)uSa.E;
        }
        if (b.M() && var3_3.J(Hda.G)) {
            return (boolean)uSa.E;
        }
        if ((b == gZ.M || b == gZ.H) && var3_3.f(AQa.P) != null) {
            v1 = a;
            var3_3.f(AQa.P).J((int)(v1 * YSa.G + var3_3.R.nextFloat() * a * kta.v), (Gl)var3_3);
            a = v1 * wOa.w;
        }
        var3_3.U = Ira.d;
        var4_4 = vRa.d;
        if ((float)v2.Fa > (float)var3_3.J / kta.v) {
            if (a <= var3_3.Ha) {
                return (boolean)uSa.E;
            }
            v3 = var3_3;
            var3_3.J((gZ)b, (float)(a - var3_3.Ha));
            var3_3.Ha = a;
            var4_4 = uSa.E;
        } else {
            v4 = var3_3;
            var3_3.Ha = a;
            var3_3.Fa = (iaa)var3_3.J;
            var3_3.J((gZ)b, (float)a);
            v4.ha = v4.la = NTa.C;
            v3 = var3_3;
        }
        v3.k = JPa.N;
        c = b.f();
        if (c == null) ** GOTO lbl46
        if (c instanceof Gl_3) {
            var3_3.l((Gl)c);
        }
        if (c instanceof Sx) {
            v5 = var3_3;
            v5.Ka = ySa.T;
            v5.y = (Sx)c;
            v6 = var4_4;
        } else {
            if (c instanceof xfa && (var5_5 = (xfa)c).ba()) {
                v7 = var3_3;
                v7.Ka = ySa.T;
                v7.y = null;
            }
lbl46:
            // 4 sources

            v6 = var4_4;
        }
        if (v6 == 0) ** GOTO lbl68
        var3_3.j.J((vL)var3_3, (byte)uqa.g);
        if (b != gZ.f) {
            var3_3.i();
        }
        if (c != null) {
            v8 = c;
            var5_6 = v8.la - var3_3.la;
            var7_9 = v8.A - var3_3.A;
            v9 = var5_6;
            while (true) {
                v10 = var7_9;
                if (!(v9 * var5_6 + v10 * v10 < oQa.Ka)) break;
                var5_6 = (Math.random() - Math.random()) * SPa.x;
                var7_9 = (Math.random() - Math.random()) * SPa.x;
                v9 = var5_6;
            }
            v11 = var3_3;
            var3_3.k = (float)(Oz.f((double)var7_9, (double)var5_6) * kta.Da / lQa.f - (double)var3_3.X);
            var3_3.J(c, (float)a, var5_6, var7_9);
        } else {
            var3_3.k = (int)(Math.random() * KPa.y) * cRa.n;
lbl68:
            // 2 sources

            v11 = var3_3;
        }
        if (v11.f() <= JPa.N) {
            var5_7 = var3_3.i();
            if (var4_4 != 0 && var5_7 != null) {
                v12 = var3_3;
                v12.J(var5_7, var3_3.G(), v12.M());
            }
            var3_3.J((gZ)b);
        } else {
            var5_8 = var3_3.f();
            if (var4_4 != 0 && var5_8 != null) {
                v13 = var3_3;
                v13.J(var5_8, var3_3.G(), v13.M());
            }
        }
        return (boolean)vRa.d;
    }

    public String i() {
        return dQa.Ha;
    }

    public boolean z() {
        Gl_3 a2;
        if (a2.J == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float G() {
        return pqa.r;
    }

    public boolean p() {
        return uSa.E != 0;
    }

    public bA J(RC rC2) {
        Gl_3 b2 = rC2;
        Gl_3 a2 = this;
        return a2.J().f((RC)b2);
    }

    public void Z() {
        Gl_3 a2;
        Gl_3 gl_3 = a2;
        gl_3.J(gl_3.Ea + Tpa.fa);
    }

    public boolean J(kba kba2) {
        Gl_3 b2 = kba2;
        Gl_3 a2 = this;
        if (a2.J() == LGa.UNDEAD && ((b2 = b2.f()) == Hda.t.O || b2 == Hda.c.O)) {
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void l(boolean bl) {
        void a2;
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        super.l((boolean)a2);
        bA b2 = gl_32.J(Kha.j);
        if (b2.J(r) != null) {
            b2.f(T);
        }
        if (a2 != false) {
            b2.J(T);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void e(float f2) {
        float f3;
        Gl_3 gl_3 = this;
        float b2 = gl_3.f();
        if (f3 > JPa.N) {
            void a2;
            gl_3.A(b2 + a2);
        }
    }

    public boolean f(int n2) {
        int b2 = n2;
        Gl_3 a2 = this;
        return a2.C.containsKey(b2);
    }

    public Collection<kba> J() {
        Gl_3 a2;
        return a2.C.values();
    }

    public boolean R() {
        return uSa.E != 0;
    }

    public void A(int n2) {
        int b22 = n2;
        Gl_3 a2 = this;
        kba b22 = a2.C.remove(b22);
        if (b22 != null) {
            a2.f(b22);
        }
    }

    /*
     * WARNING - void declaration
     */
    public float f(float f2) {
        void a2;
        float f3;
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        float b2 = gl_32.i - gl_32.w;
        if (f3 < JPa.N) {
            b2 += pqa.r;
        }
        return gl_3.w + b2 * a2;
    }

    public void p() {
    }

    public boolean Y() {
        return uSa.E != 0;
    }

    public void R() {
        Gl_3 gl_3 = this;
        if (gl_3.C.isEmpty()) {
            Gl_3 gl_32 = gl_3;
            gl_32.E();
            gl_32.J(uSa.E != 0);
            return;
        }
        Gl_3 gl_33 = gl_3;
        int a2 = Qca.J(gl_33.C.values());
        gl_33.aa.J(Yqa.i, Byte.valueOf((byte)(Qca.J(gl_3.C.values()) ? vRa.d : uSa.E)));
        Gl_3 gl_34 = gl_3;
        gl_34.aa.J(XTa.W, Integer.valueOf(a2));
        gl_34.J(gl_34.f(Hda.k.O));
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2, double d2, double d3) {
        float e2 = f2;
        Gl_3 c2 = this;
        if (((Random)((Object)c2.R)).nextDouble() >= c2.J(Kha.k).f()) {
            void b2;
            void a2;
            Gl_3 gl_3 = c2;
            c2.t = vRa.d;
            void v1 = a2;
            float d4 = Oz.J((double)(b2 * b2 + v1 * v1));
            e2 = Xpa.R;
            gl_3.f(c2.i / KPa.y);
            gl_3.J(gl_3.Ea / KPa.y);
            gl_3.l(gl_3.f / KPa.y);
            gl_3.f(gl_3.i - b2 / (double)d4 * (double)e2);
            gl_3.J(gl_3.Ea + (double)e2);
            gl_3.l(gl_3.f - a2 / (double)d4 * (double)e2);
            if (gl_3.Ea > rpa.ja) {
                c2.J(rpa.ja);
            }
        }
    }

    public int k() {
        Gl_3 a2;
        return a2.Ja;
    }

    public void d(float f2) {
        float b2 = f2;
        Gl_3 gl_3 = this;
    }

    public void F() {
        Gl_3 a2;
        a2.J(gZ.c, pPa.T);
    }

    public boolean J(Yaa yaa2) {
        Gl_3 b2 = yaa2;
        Gl_3 a2 = this;
        if (a2.J() != null) {
            return a2.J().J((Yaa)b2);
        }
        return uSa.E != 0;
    }

    public kba J(Hda hda2) {
        Gl_3 b2 = hda2;
        Gl_3 a2 = this;
        return a2.C.get(((Hda)b2).O);
    }

    public void i(int n2) {
        int b2 = n2;
        Gl_3 a2 = this;
        a2.C.remove(b2);
    }

    public Yaa J() {
        Gl_3 a2;
        return a2.j.J().l(a2.J().toString());
    }

    public boolean C(vL vL2) {
        Gl_3 b2 = vL2;
        Gl_3 a2 = this;
        a2.i(b2);
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public float f(gZ gZ2, float f2) {
        int n2;
        void a2;
        void b2;
        Gl_3 gl_3 = this;
        if (b2.C()) {
            return (float)a2;
        }
        if (gl_3.J(Hda.u) && b2 != gZ.c) {
            int c2 = (gl_3.J(Hda.u).J() + vRa.d) * tTa.h;
            n2 = kTa.g - c2;
            a2 = a2 * (float)n2 / sSa.E;
        }
        if (a2 <= JPa.N) {
            return JPa.N;
        }
        int c2 = kGa.J((Mda[])gl_3.J(), (gZ)b2);
        if (c2 > kTa.j) {
            c2 = kTa.j;
        }
        if (c2 > 0 && c2 <= kTa.j) {
            n2 = kTa.g - c2;
            a2 = a2 * (float)n2 / sSa.E;
        }
        return (float)a2;
    }

    public void J(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        a2.t = b2;
    }

    public Random J() {
        Gl_3 a2;
        return a2.R;
    }

    public Lz f() {
        Gl_3 a2;
        return a2.J(pqa.r);
    }

    public void l(kba kba2) {
        Gl_3 b2 = kba2;
        Gl_3 a2 = this;
        a2.j = vRa.d;
        if (!a2.j.e) {
            Gl_3 gl_3 = a2;
            Hda.A[b2.f()].f((Gl)gl_3, gl_3.J(), b2.J());
        }
    }

    public void l(Gl gl2) {
        Gl_3 b2 = gl2;
        Gl_3 a2 = this;
        a2.x = b2;
        a2.Ja = a2.g ? 1 : 0;
    }

    public Gl l() {
        Gl_3 a2;
        if (a2.Fa.f() != null) {
            return a2.Fa.f();
        }
        if (a2.y != null) {
            return a2.y;
        }
        if (a2.x != null) {
            return a2.x;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(kba kba2, boolean bl) {
        void a2;
        Gl_3 c2 = kba2;
        Gl_3 b2 = this;
        b2.j = vRa.d;
        if (a2 != false && !b2.j.e) {
            Gl_3 gl_3 = b2;
            Hda.A[c2.f()].J((Gl)gl_3, gl_3.J(), c2.J());
            Gl_3 gl_32 = b2;
            Hda.A[c2.f()].f((Gl)gl_32, gl_32.J(), c2.J());
        }
    }

    public boolean U() {
        Gl_3 a2;
        if (!a2.j.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2, float f3) {
        float f4;
        Gl_3 a2;
        block24: {
            Gl_3 gl_3;
            block21: {
                float f5;
                float f6;
                void b2;
                float f7;
                float c2;
                block22: {
                    block23: {
                        Gl_3 gl_32;
                        c2 = f3;
                        a2 = this;
                        if (!a2.U()) break block21;
                        if (a2.L() && (!(a2 instanceof Sx) || !((Sx)((Object)a2)).h.J())) break block22;
                        if (a2.H() && (!(a2 instanceof Sx) || !((Sx)((Object)a2)).h.J())) break block23;
                        float f8 = XOa.v;
                        if (a2.ha != 0) {
                            f8 = a2.j.J((XF)new XF((int)Oz.f((double)a2.la), (int)(Oz.f((double)a2.J().j) - vRa.d), (int)Oz.f((double)a2.A))).J().slipperiness.J() * XOa.v;
                        }
                        float f9 = f8;
                        float f10 = opa.U / (f9 * f9 * f8);
                        if (a2.ha != 0) {
                            Gl_3 gl_32 = a2;
                            gl_32 = gl_32;
                            f7 = gl_33.D() * f10 * Nra.e;
                        } else {
                            Gl_3 gl_32 = a2;
                            gl_32 = gl_32;
                            f7 = gl_34.P;
                        }
                        gl_32.J((float)b2, c2, f7);
                        f8 = XOa.v;
                        if (a2.ha != 0) {
                            f8 = a2.j.J((XF)new XF((int)Oz.f((double)a2.la), (int)(Oz.f((double)a2.J().j) - vRa.d), (int)Oz.f((double)a2.A))).J().slipperiness.J() * XOa.v;
                        }
                        if (a2.l()) {
                            int n2;
                            float f11 = VPa.i;
                            Gl_3 gl_35 = a2;
                            gl_35.f(Oz.J((double)gl_35.i, (double)(-f11), (double)f11));
                            gl_35.l(Oz.J((double)gl_35.f, (double)(-f11), (double)f11));
                            gl_35.O = JPa.N;
                            if (gl_35.Ea < Hra.N) {
                                a2.J(Hra.N);
                            }
                            int n3 = n2 = a2.q() && a2 instanceof Sx ? vRa.d : uSa.E;
                            if (n2 != 0 && a2.Ea < aSa.V) {
                                a2.J(aSa.V);
                            }
                        }
                        Gl_3 gl_37 = a2;
                        gl_37 = a2;
                        gl_37.J(gl_36.i, gl_37.Ea, a2.f);
                        if (gl_36.ca != 0 && a2.l()) {
                            a2.J(iSa.P);
                        }
                        if (!(!a2.j.e || a2.j.F(new XF(a2.la, uSa.E, (int)a2.A)) && a2.j.J(new XF(a2.la, uSa.E, (int)a2.A)).d())) {
                            Gl_3 gl_38 = a2;
                            if (a2.Z > aSa.V) {
                                gl_38.J(Upa.N);
                            } else {
                                gl_38.J(aSa.V);
                            }
                        } else {
                            Gl_3 gl_39 = a2;
                            gl_39.J(gl_39.Ea - tSa.K);
                        }
                        double d2 = aSa.V;
                        if (a2.Ea != aSa.V) {
                            d2 = a2.Ea * SPa.x;
                        }
                        Gl_3 gl_3 = a2;
                        gl_3 = gl_3;
                        gl_310.f(gl_310.i * (double)f8);
                        gl_310.l(gl_310.f * (double)f8);
                        gl_310.J(gl_310.Ea - d2 * KPa.y);
                        break block24;
                    }
                    Gl_3 gl_311 = a2;
                    f6 = gl_311.Z;
                    gl_311.J((float)b2, c2, WRa.e);
                    gl_311.J(gl_311.i, a2.Ea, a2.f);
                    gl_311.f(gl_311.i * kTa.B);
                    gl_311.J(gl_311.Ea * kTa.B);
                    gl_311.l(gl_311.f * kTa.B);
                    gl_311.J(gl_311.Ea - GPa.g);
                    if (gl_311.ca != 0) {
                        Gl_3 gl_312 = a2;
                        if (gl_312.f(a2.i, gl_312.Ea + Zpa.ca - a2.Z + f6, a2.f)) {
                            a2.J(osa.b);
                        }
                    }
                    break block21;
                }
                Gl_3 gl_313 = a2;
                f6 = gl_313.Z;
                f7 = xSa.la;
                float f12 = WRa.e;
                float f13 = kGa.J((vL)gl_313);
                if (f5 > vQa.q) {
                    f13 = vQa.q;
                }
                if (a2.ha == 0) {
                    f13 *= MQa.L;
                }
                if (f13 > JPa.N) {
                    float f10 = f7;
                    f7 = f10 + (oQa.w - f10) * f13 / vQa.q;
                    float f11 = f12;
                    f12 = f11 + (a2.D() * pqa.r - f11) * f13 / vQa.q;
                }
                Gl_3 gl_314 = a2;
                gl_314.J((float)b2, c2, f12);
                Gl_3 gl_315 = a2;
                gl_315.J(gl_314.i, gl_315.Ea, a2.f);
                gl_314.f(gl_314.i * (double)f7);
                gl_314.J(gl_314.Ea * GPa.fa);
                gl_314.l(gl_314.f * (double)f7);
                gl_314.J(gl_314.Ea - GPa.g);
                if (gl_314.ca != 0) {
                    Gl_3 gl_316 = a2;
                    if (gl_316.f(a2.i, gl_316.Ea + Zpa.ca - a2.Z + f6, a2.f)) {
                        a2.J(osa.b);
                    }
                }
            }
            gl_3 = a2;
        }
        gl_3.z = a2.U;
        Gl_3 gl_3 = a2;
        int n4 = a2.la - gl_3.c;
        reference var5_10 = gl_3.A - a2.r;
        int n5 = n4;
        reference v23 = var5_10;
        float f16 = Oz.J((double)(n5 * n5 + v23 * v23)) * YSa.G;
        if (f4 > pqa.r) {
            f16 = pqa.r;
        }
        Gl_3 gl_317 = a2;
        gl_317.U += (f16 - a2.U) * Xpa.R;
        gl_317.E += a2.U;
    }

    public void d() {
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        super.d();
        if (!gl_32.j.e) {
            int n2;
            int n3 = gl_3.J();
            if (n3 > 0) {
                if (gl_3.F <= 0) {
                    gl_3.F = kTa.j * (Fsa.d - n3);
                }
                Gl_3 gl_33 = gl_3;
                gl_33.F -= vRa.d;
                if (gl_33.F <= 0) {
                    gl_3.M(n3 - vRa.d);
                }
            }
            int n4 = n2 = uSa.E;
            while (n4 < tTa.h) {
                Gl_3 gl_34 = gl_3;
                Mda mda2 = gl_34.A[n2];
                Mda mda3 = gl_34.f(n2);
                if (!Mda.J((Mda)mda3, (Mda)mda2)) {
                    Gl_3 gl_36 = gl_3;
                    gl_36 = gl_3;
                    ((Tf)gl_3.j).J().f((vL)gl_36, (KC)new Kda(gl_36.M(), n2, mda3));
                    if (mda2 != null) {
                        gl_3.S.f(mda2.J());
                    }
                    if (mda3 != null) {
                        gl_3.S.J(mda3.J());
                    }
                    gl_3.A[n2] = mda3 == null ? null : mda3.J();
                }
                n4 = ++n2;
            }
            if (gl_3.g % kTa.j == 0) {
                gl_3.J().l();
            }
        }
        Gl_3 gl_37 = gl_3;
        gl_37.y();
        Gl_3 gl_38 = gl_3;
        int n5 = gl_37.la - gl_38.c;
        reference var3_7 = gl_38.A - gl_3.r;
        int n6 = n5;
        reference v9 = var3_7;
        float f2 = n6 * n6 + v9 * v9;
        float f3 = gl_37.ba;
        float a2 = JPa.N;
        gl_37.I = gl_37.D;
        float f4 = JPa.N;
        if (f2 > bpa.s) {
            f4 = pqa.r;
            a2 = (float)Math.sqrt(f2) * vQa.q;
            f3 = (float)Oz.f((double)var3_7, (double)n5) * Hra.Ga / pua.j - ISa.a;
        }
        if (gl_3.i > JPa.N) {
            f3 = gl_3.X;
        }
        if (gl_3.ha == 0) {
            f4 = JPa.N;
        }
        Gl_3 gl_311 = gl_3;
        gl_311 = gl_311;
        gl_311 = gl_3;
        gl_3.D += (f4 - gl_3.D) * bpa.K;
        gl_311.j.H.J(eua.F);
        a2 = gl_39.J(f3, a2);
        gl_311.j.H.f();
        gl_39.j.H.J(iSa.K);
        while (gl_310.X - gl_3.s < xua.V) {
            Gl_3 gl_310 = gl_3;
            gl_310 = gl_310;
            gl_312.s -= CRa.ja;
        }
        Gl_3 gl_313 = gl_3;
        while (gl_313.X - gl_3.s >= Hra.Ga) {
            Gl_3 gl_313 = gl_3;
            gl_313 = gl_313;
            gl_314.s += CRa.ja;
        }
        Gl_3 gl_315 = gl_3;
        while (gl_315.ba - gl_3.Ma < xua.V) {
            Gl_3 gl_315 = gl_3;
            gl_315 = gl_315;
            gl_316.Ma -= CRa.ja;
        }
        Gl_3 gl_317 = gl_3;
        while (gl_317.ba - gl_3.Ma >= Hra.Ga) {
            Gl_3 gl_317 = gl_3;
            gl_317 = gl_317;
            gl_318.Ma += CRa.ja;
        }
        Gl_3 gl_319 = gl_3;
        while (gl_319.d - gl_3.o < xua.V) {
            Gl_3 gl_319 = gl_3;
            gl_319 = gl_319;
            gl_320.o -= CRa.ja;
        }
        Gl_3 gl_321 = gl_3;
        while (gl_321.d - gl_3.o >= Hra.Ga) {
            Gl_3 gl_321 = gl_3;
            gl_321 = gl_321;
            gl_322.o += CRa.ja;
        }
        Gl_3 gl_323 = gl_3;
        while (gl_323.t - gl_3.ga < xua.V) {
            Gl_3 gl_323 = gl_3;
            gl_323 = gl_323;
            gl_324.ga -= CRa.ja;
        }
        Gl_3 gl_325 = gl_3;
        while (gl_325.t - gl_3.ga >= Hra.Ga) {
            Gl_3 gl_325 = gl_3;
            gl_325 = gl_325;
            gl_326.ga += CRa.ja;
        }
        Gl_3 gl_327 = gl_3;
        gl_327.j.H.f();
        gl_327.v += a2;
        pP pP2 = Ni.J(gl_327);
        if (pP2 != null) {
            pP2.J((Gl)gl_3);
        }
    }

    public void Y() {
        a.j = vRa.d;
    }

    public void f(vL vL2, int n2) {
        Gl_3 c2 = vL2;
        Gl_3 b2 = this;
        if (!((vL)c2).J && !b2.j.e) {
            jGa a2 = ((Tf)b2.j).J();
            if (c2 instanceof jFa) {
                Gl_3 gl_3 = c2;
                Gl_3 gl_32 = c2;
                a2.f((vL)gl_32, (KC)new yba(gl_32.M(), b2.M()));
            }
            if (c2 instanceof jea) {
                Gl_3 gl_3 = c2;
                a2.f((vL)gl_3, (KC)new yba(gl_3.M(), b2.M()));
            }
            if (c2 instanceof zEa) {
                Gl_3 gl_3 = c2;
                a2.f((vL)gl_3, (KC)new yba(gl_3.M(), b2.M()));
            }
        }
    }

    public boolean J(Hda hda2) {
        Gl_3 b2 = hda2;
        Gl_3 a2 = this;
        return a2.C.containsKey(((Hda)b2).O);
    }

    /*
     * WARNING - void declaration
     */
    public void J(gZ gZ2, float f2) {
        void b2;
        float c2 = f2;
        Gl_3 a2 = this;
        if (!a2.J((gZ)b2)) {
            Gl_3 gl_3 = a2;
            c2 = gl_3.J((gZ)b2, c2);
            float f3 = c2 = gl_3.f((gZ)b2, c2);
            Gl_3 gl_32 = a2;
            c2 = Math.max(c2 - gl_32.A(), JPa.N);
            gl_32.i(gl_3.A() - (f3 - c2));
            if (c2 != JPa.N) {
                Gl_3 gl_33 = a2;
                f3 = gl_33.f();
                gl_33.A(f3 - c2);
                gl_33.J().J((gZ)b2, f3, c2);
                gl_33.i(gl_33.A() - c2);
            }
        }
    }

    public void U() {
        Gl_3 gl_3 = this;
        Iterator<Integer> iterator = gl_3.C.keySet().iterator();
        while (iterator.hasNext()) {
            Object a2 = iterator.next();
            a2 = gl_3.C.get(a2);
            if (gl_3.j.e) continue;
            iterator.remove();
            gl_3.f((kba)a2);
        }
    }

    public void P() {
        Gl_3 a2;
        Gl_3 gl_3 = a2;
        gl_3.J(gl_3.Ea + Tpa.fa);
    }

    public void i(vL vL2) {
        Gl_3 gl_3;
        Gl_3 b2 = vL2;
        Gl_3 a2 = this;
        if (b2 instanceof Gl_3) {
            a2.n = b2;
            gl_3 = a2;
        } else {
            gl_3 = a2;
            a2.n = null;
        }
        gl_3.Aa = a2.g ? 1 : 0;
    }

    public int G() {
        Gl_3 a2;
        return a2.s;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        Mda mda2;
        int b22;
        void a2;
        Gl_3 gl_3 = this;
        void v0 = a2;
        v0.J(FPa.i, gl_3.f());
        v0.J(XOa.C, (short)Math.ceil(gl_3.f()));
        v0.J(Bpa.l, (short)gl_3.ha);
        v0.J(ZSa.ca, gl_3.Ja);
        v0.J(lqa.o, (short)gl_3.a);
        Gl_3 gl_32 = gl_3;
        v0.J(Tpa.I, gl_32.A());
        waa waa3 = gl_32.J();
        int n2 = ((Mda[])waa3).length;
        int n3 = b22 = uSa.E;
        while (n3 < n2) {
            mda2 = waa3[b22];
            if (mda2 != null) {
                gl_3.S.f(mda2.J());
            }
            n3 = ++b22;
        }
        a2.J(Hra.i, (NCa)Kha.J(gl_3.J()));
        waa3 = gl_3.J();
        n2 = ((Mda[])waa3).length;
        int n4 = b22 = uSa.E;
        while (n4 < n2) {
            mda2 = waa3[b22];
            if (mda2 != null) {
                gl_3.S.J(mda2.J());
            }
            n4 = ++b22;
        }
        if (!gl_3.C.isEmpty()) {
            Iterator<kba> iterator;
            waa3 = new waa();
            Iterator<kba> iterator2 = iterator = gl_3.C.values().iterator();
            while (iterator2.hasNext()) {
                kba b22 = iterator.next();
                iterator2 = iterator;
                waa3.J((NCa)b22.J(new Waa()));
            }
            a2.J(dqa.ca, (NCa)waa3);
        }
    }

    private int D() {
        Gl_3 a2;
        if (a2.J(Hda.f)) {
            return uua.p - (vRa.d + a2.J(Hda.f).J()) * vRa.d;
        }
        if (a2.J(Hda.I)) {
            return uua.p + (vRa.d + a2.J(Hda.I).J()) * uqa.g;
        }
        return uua.p;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(uEa uEa2) {
        void a2;
        Gl_3 gl_3 = this;
        int b2 = a2 == uEa.HAND ? uSa.E : a2.ordinal() - vRa.d;
        return gl_3.J(b2);
    }

    public LGa J() {
        return LGa.UNDEFINED;
    }

    public String J(int n2) {
        int b2 = n2;
        Gl_3 a2 = this;
        if (b2 > AQa.P) {
            return ura.r;
        }
        return Ata.G;
    }

    public final void M(int n2) {
        int b2 = n2;
        Gl_3 a2 = this;
        a2.aa.J(WOa.fa, Byte.valueOf((byte)b2));
    }

    public float D() {
        Gl_3 a2;
        return a2.Z;
    }

    public Gl_3(Gg gg2) {
        Gl_3 b2 = gg2;
        Gl_3 a2 = this;
        super((Gg)b2);
        Gl_3 gl_3 = a2;
        a2.Fa = new iaa((Gl)a2);
        gl_3.C = Maps.newHashMap();
        a2.A = new Mda[tTa.h];
        Gl_3 gl_32 = a2;
        gl_32.J = kTa.j;
        gl_32.P = WRa.e;
        gl_32.j = vRa.d;
        gl_32.R = new Zv(uSa.E, tTa.h);
        gl_32.s();
        gl_32.A(gl_32.J());
        gl_32.h = vRa.d;
        gl_32.q = (float)((Math.random() + oua.i) * yra.d);
        gl_32.l(gl_32.la, a2.Z, (double)a2.A);
        gl_32.p = (float)Math.random() * ysa.k;
        gl_32.t = gl_32.X = (float)(Math.random() * lQa.f * KPa.y);
        gl_32.N = gl_32.d;
        gl_32.Ka = (int)Ora.D;
    }

    public abstract Mda[] J();

    public boolean P() {
        Gl_3 a2;
        if (a2.J() == LGa.UNDEAD) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        a2.ba = b2;
    }

    public Lz J(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        if (b2 == pqa.r) {
            Gl_3 gl_3 = a2;
            return gl_3.J(a2.d, gl_3.t);
        }
        Gl_3 gl_3 = a2;
        Gl_3 gl_32 = a2;
        float f3 = gl_3.o + (gl_3.d - gl_32.o) * b2;
        Gl_3 gl_33 = a2;
        b2 = gl_32.ga + (gl_33.t - gl_33.ga) * b2;
        return gl_3.J(f3, b2);
    }

    public float A() {
        Gl_3 a2;
        return a2.l;
    }

    public Ifa J() {
        Gl_3 a2;
        if (a2.S == null) {
            Gl_3 gl_3 = a2;
            gl_3.S = new Aga();
        }
        return a2.S;
    }

    public void s() {
        Gl_3 a2;
        a2.J().J(Kha.M);
        a2.J().J(Kha.k);
        a2.J().J(Kha.j);
    }

    public void y() {
        Gl_3 gl_3;
        Gl_3 gl_32;
        Gl_3 gl_33;
        Gl_3 a2;
        if (a2.R.f() > 0) {
            Gl_3 gl_34 = a2;
            gl_34.R.f(gl_34.R.f() - vRa.d);
        }
        if (a2.f > 0) {
            Gl_3 gl_33 = a2;
            gl_33 = gl_33;
            int n2 = gl_35.la + (a2.fa - a2.la) / (double)a2.f;
            Gl_3 gl_36 = a2;
            float f2 = gl_35.Z + (gl_36.Ia - a2.Z) / (double)a2.f;
            reference var5_3 = gl_36.A + (a2.M - a2.A) / (double)a2.f;
            double d2 = Oz.J((double)(gl_35.H - (double)a2.X));
            gl_35.X = (float)((double)gl_35.X + d2 / (double)a2.f);
            gl_35.d = (float)((double)gl_35.d + (a2.m - (double)a2.d) / (double)a2.f);
            gl_35.f -= vRa.d;
            gl_35.l(n2, f2, (double)var5_3);
            gl_35.C(gl_35.X, a2.d);
        } else {
            if (!a2.U()) {
                Gl_3 gl_37 = a2;
                gl_37.f(gl_37.i * vQa.fa);
                gl_37.J(gl_37.Ea * vQa.fa);
                gl_37.l(gl_37.f * vQa.fa);
            }
            gl_33 = a2;
        }
        if (Math.abs((double)gl_33.i) < SQa.F) {
            a2.f(aSa.V);
        }
        if (Math.abs(a2.Ea) < SQa.F) {
            a2.J(aSa.V);
        }
        if (Math.abs((double)a2.f) < SQa.F) {
            a2.l(aSa.V);
        }
        Gl_3 gl_38 = a2;
        gl_38.j.H.J(Uta.Ha);
        if (gl_38.Z()) {
            Gl_3 gl_32 = a2;
            gl_32 = gl_32;
            gl_39.ja = uSa.E;
            gl_39.l(JPa.N);
            gl_39.M(JPa.N);
            gl_39.B = JPa.N;
        } else {
            if (a2.U()) {
                Gl_3 gl_310 = a2;
                gl_310.j.H.J(Lsa.Ma);
                gl_310.A();
                gl_310.j.H.f();
            }
            gl_32 = a2;
        }
        gl_32.j.H.f();
        Gl_3 gl_311 = a2;
        gl_311.j.H.J(Qra.h);
        if (gl_311.ja) {
            Gl_3 gl_312 = a2;
            if (a2.L()) {
                gl_312.Z();
                gl_3 = a2;
            } else {
                Gl_3 gl_313 = a2;
                if (gl_312.H()) {
                    gl_313.P();
                    gl_3 = a2;
                } else {
                    Gl_3 gl_314;
                    boolean bl;
                    if (gl_313.ha != 0 && a2.R.f() == 0) {
                        bl = vRa.d;
                        gl_314 = a2;
                    } else {
                        bl = uSa.E;
                        gl_314 = a2;
                    }
                    Wx.J(bl, XHa.J((Gl)gl_314), null);
                    gl_3 = a2;
                }
            }
        } else {
            Gl_3 gl_3 = a2;
            gl_3 = gl_3;
            gl_315.R.f(uSa.E);
        }
        gl_3.j.H.f();
        Gl_3 gl_316 = a2;
        gl_316.j.H.J(sra.r);
        gl_316.l(gl_316.L * MQa.d);
        gl_316.M(gl_316.ia * MQa.d);
        gl_316.B *= ATa.r;
        gl_316.d(gl_316.L, a2.ia);
        gl_316.j.H.f();
        gl_316.j.H.J(WQa.t);
        if (uw.Q == vRa.d && a2 instanceof ANa) {
            a2.f();
        }
        a2.j.H.f();
    }

    public void u() {
        Gl_3 gl_3 = this;
        if (!gl_3.V || gl_3.ca >= gl_3.D() / uqa.g || gl_3.ca < 0) {
            Gl_3 a2;
            gl_3.ca = pua.o;
            gl_3.V = vRa.d;
            if (gl_3.j instanceof Tf) {
                Gl_3 gl_32 = gl_3;
                Gl_3 gl_33 = gl_3;
                ((Tf)gl_3.j).J().f((vL)gl_33, (KC)new EBa((vL)gl_33, uSa.E));
            }
            if ((a2 = Ni.J(gl_3)) != null) {
                a2.J(gq.ATTACK, uSa.E != 0);
            }
        }
    }

    public Gl f() {
        Gl_3 a2;
        return a2.x;
    }

    public void g() {
        Gl_3 a2;
        Gl_3 gl_3 = a2;
        super.g();
        gl_3.I = gl_3.D;
        gl_3.D = JPa.N;
        gl_3.O = JPa.N;
    }

    public void f(boolean bl, int n2) {
        int c2 = n2;
        Gl_3 gl_3 = this;
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2, float f3) {
        void a2;
        int n2;
        float c2 = f2;
        Gl_3 b2 = this;
        c2 = Oz.f((float)(c2 - b2.ba));
        Gl_3 gl_3 = b2;
        gl_3.ba += c2 * bpa.K;
        c2 = Oz.f((float)(gl_3.X - b2.ba));
        int n3 = n2 = c2 < kPa.Ha || c2 >= ISa.a ? vRa.d : uSa.E;
        if (c2 < Bua.D) {
            c2 = Bua.D;
        }
        if (c2 >= CRa.d) {
            c2 = CRa.d;
        }
        b2.ba = b2.X - c2;
        float f4 = c2;
        if (f4 * f4 > cRa.L) {
            b2.ba += c2 * psa.N;
        }
        if (n2 != 0) {
            a2 *= vqa.T;
        }
        return (float)a2;
    }

    public void l(vL vL2) {
        Gl_3 b2 = vL2;
        Gl_3 a2 = this;
        if (a2.ja != null && b2 == null) {
            if (!a2.j.e) {
                Gl_3 gl_3 = a2;
                gl_3.M((vL)gl_3.ja);
            }
            if (a2.ja != null) {
                a2.ja.Aa = null;
            }
            a2.ja = null;
            return;
        }
        super.l((vL)b2);
    }

    public void B() {
        Gl_3 a2;
        a2.J(gZ.c, YSa.G);
    }

    public void q() {
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        gl_32.J(gl_32.i());
        if (gl_32.J(Hda.e)) {
            Gl_3 gl_33 = gl_3;
            gl_33.J(gl_3.Ea + (double)((float)(gl_33.J(Hda.e).J() + vRa.d) * Nra.e));
        }
        if (gl_3.j()) {
            Gl_3 gl_34 = gl_3;
            float a2 = gl_34.X * Bua.ga;
            gl_34.f(gl_34.i - (double)(Oz.d((float)a2) * psa.N));
            gl_34.l(gl_34.f + (double)(Oz.C((float)a2) * psa.N));
        }
        gl_3.t = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2) {
        void a2;
        Gl_3 gl_3 = this;
        int b2 = kGa.f((vL)gl_3);
        if (b2 > 0 && ((Random)((Object)gl_3.R)).nextInt(b2 + vRa.d) > 0) {
            return (int)a2;
        }
        return (int)(a2 - vRa.d);
    }

    public void z() {
        int a2;
        Gl_3 gl_3;
        block2: {
            Gl_3 gl_32;
            block1: {
                block0: {
                    Gl_3 gl_33 = gl_3 = this;
                    a2 = gl_33.D();
                    if (!gl_33.V) break block0;
                    Gl_3 gl_34 = gl_3;
                    gl_34.ca += vRa.d;
                    if (gl_34.ca < a2) break block1;
                    gl_32 = gl_3;
                    gl_3.ca = uSa.E;
                    gl_3.V = uSa.E;
                    break block2;
                }
                gl_3.ca = uSa.E;
            }
            gl_32 = gl_3;
        }
        gl_32.i = (float)gl_3.ca / (float)a2;
    }

    public void o() {
    }

    /*
     * WARNING - void declaration
     */
    public void M(vL vL2) {
        int n2;
        void a22;
        Gl_3 gl_3 = this;
        void v0 = a22;
        double d2 = v0.la;
        void v1 = a22;
        double d3 = v0.J().j + (double)v1.u;
        Object object = v1.A;
        int a22 = vRa.d;
        int n3 = n2 = -a22;
        while (n3 <= a22) {
            int n4 = -a22;
            while (n4 < a22) {
                int b2;
                if (n2 != 0 || b2 != 0) {
                    Gl_3 gl_32 = gl_3;
                    int n5 = gl_32.la + (double)n2;
                    int n6 = (int)(gl_32.A + (double)b2);
                    xy xy2 = gl_32.J().C((double)n2, oua.i, (double)b2);
                    if (gl_32.j.J(xy2).isEmpty()) {
                        if (Gg.J((I)gl_3.j, (XF)new XF(n5, (int)gl_3.Z, n6))) {
                            Gl_3 gl_33 = gl_3;
                            gl_33.C(gl_3.la + (double)n2, gl_33.Z + oua.i, (double)(gl_3.A + (double)b2));
                            return;
                        }
                        if (Gg.J((I)gl_3.j, (XF)new XF(n5, (int)gl_3.Z - vRa.d, n6)) || gl_3.j.J(new XF(n5, (int)gl_3.Z - vRa.d, n6)).J().J() == Material.water) {
                            Gl_3 gl_34 = gl_3;
                            d2 = gl_34.la + (double)n2;
                            d3 = gl_34.Z + oua.i;
                            object = gl_34.A + (double)b2;
                        }
                    }
                }
                n4 = ++b2;
            }
            n3 = ++n2;
        }
        gl_3.C(d2, d3, (double)object);
    }

    public abstract Mda J();

    public void h() {
        int n2;
        Gl_3 gl_3 = this;
        Iterator<Integer> a22 = gl_3.C.keySet().iterator();
        while (a22.hasNext()) {
            Integer n3 = (Integer)a22.next();
            kba kba2 = gl_3.C.get(n3);
            if (!kba2.J((Gl)gl_3)) {
                if (gl_3.j.e) continue;
                a22.remove();
                gl_3.f(kba2);
                continue;
            }
            if (kba2.l() % Jpa.z != 0) continue;
            gl_3.J(kba2, uSa.E != 0);
        }
        if (gl_3.j) {
            if (!gl_3.j.e) {
                gl_3.R();
            }
            gl_3.j = uSa.E;
        }
        Gl_3 gl_32 = gl_3;
        int n4 = gl_32.aa.J(XTa.W);
        int n5 = n2 = gl_32.aa.J(Yqa.i) > 0 ? vRa.d : uSa.E;
        if (n4 > 0) {
            int n6;
            int a22 = uSa.E;
            Gl_3 gl_33 = gl_3;
            if (!gl_3.C()) {
                a22 = ((Random)((Object)gl_33.R)).nextBoolean() ? 1 : 0;
                n6 = n2;
            } else {
                a22 = ((Random)((Object)gl_33.R)).nextInt(Ypa.A) == 0 ? vRa.d : uSa.E;
                n6 = n2;
            }
            if (n6 != 0) {
                a22 &= ((Random)((Object)gl_3.R)).nextInt(tTa.h) == 0 ? vRa.d : uSa.E;
            }
            if (a22 != 0 && n4 > 0) {
                Gl_3 gl_34;
                UZ uZ;
                double d2 = (double)(n4 >> ERa.C & osa.Ja) / pqa.o;
                double d3 = (double)(n4 >> Yqa.i & osa.Ja) / pqa.o;
                double d4 = (double)(n4 >> uSa.E & osa.Ja) / pqa.o;
                boolean bl = gl_3.j;
                if (n2 != 0) {
                    uZ = UZ.SPELL_MOB_AMBIENT;
                    gl_34 = gl_3;
                } else {
                    uZ = UZ.SPELL_MOB;
                    gl_34 = gl_3;
                }
                bl.J(uZ, (double)(gl_34.la + (((Random)((Object)gl_3.R)).nextDouble() - kTa.B) * (double)gl_3.F), (double)(gl_3.Z + ((Random)((Object)gl_3.R)).nextDouble() * (double)gl_3.u), (double)(gl_3.A + (((Random)((Object)gl_3.R)).nextDouble() - kTa.B) * (double)gl_3.F), d2, d3, d4, new int[uSa.E]);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void L() {
        block22: {
            block20: {
                block21: {
                    v0 = var1_3 = this;
                    v0.w = v0.i;
                    super.L();
                    v0.j.H.J(eta.c);
                    a = v0 instanceof Sx;
                    if (!var1_3.K()) ** GOTO lbl18
                    if (var1_3.h()) {
                        v1 = var1_3;
                        v2 = v1;
                        v1.J(gZ.G, pqa.r);
                    } else {
                        if (a && !var1_3.j.J().J(var1_3.J())) {
                            var2_4 = var1_3.j.J().J(var1_3) + var1_3.j.J().f();
                            if (v3 < aSa.V) {
                                var1_3.J(gZ.G, (float)Math.max(vRa.d, Oz.f((double)(-var2_4 * var1_3.j.J().M()))));
                            }
                        }
lbl18:
                        // 6 sources

                        v2 = var1_3;
                    }
                    if (v2.k() || var1_3.j.e) {
                        var1_3.I();
                    }
                    v4 = var2_5 = a != false && ((Sx)var1_3).h.M != false ? vRa.d : uSa.E;
                    if (!var1_3.K()) break block20;
                    if (!var1_3.J(Material.water)) break block21;
                    if (!var1_3.R() && !var1_3.f(Hda.E.O) && var2_5 == 0) {
                        v5 = var1_3;
                        v5.e(v5.J(v5.i()));
                        if (v5.i() == yRa.Y) {
                            var1_3.e(uSa.E);
                            v6 = var3_7 = uSa.E;
                            while (v6 < Yqa.i) {
                                v7 = var1_3;
                                v8 = var1_3;
                                a = v7.R.nextFloat() - v8.R.nextFloat();
                                var2_6 = v7.R.nextFloat() - var1_3.R.nextFloat();
                                var4_8 = v8.R.nextFloat() - var1_3.R.nextFloat();
                                v9 = --1;
                                v7.j.J(UZ.WATER_BUBBLE, (double)(var1_3.la + (double)a), (double)(var1_3.Z + (double)var2_6), (double)(var1_3.A + (double)var4_8), (double)var1_3.i, var1_3.Ea, (double)var1_3.f, new int[uSa.E]);
                                v6 = ++var3_7;
                            }
                            var1_3.J(gZ.f, kta.v);
                        }
                    }
                    if (var1_3.j.e || !var1_3.B() || !(var1_3.ja instanceof Gl_3)) break block20;
                    var1_3.l((vL)null);
                    v10 = var1_3;
                    break block22;
                }
                var1_3.e(vpa.Ja);
            }
            v10 = var1_3;
        }
        if (v10.K() && var1_3.M()) {
            var1_3.I();
        }
        v11 = var1_3;
        v11.Ga = v11.G;
        if (v11.ha > 0) {
            var1_3.ha -= vRa.d;
        }
        if (var1_3.Fa > 0 && !(var1_3 instanceof bFa)) {
            var1_3.Fa -= vRa.d;
        }
        v12 = var1_3;
        if (var1_3.f() <= JPa.N) {
            v12.l();
            v13 = var1_3;
        } else {
            if (v12.J == 0 && var1_3.f() >= vQa.q) {
                var1_3.a = uSa.E;
            }
            v13 = var1_3;
        }
        if (v13.Ka > 0) {
            var1_3.Ka -= vRa.d;
            v14 = var1_3;
        } else {
            var1_3.y = null;
            v14 = var1_3;
        }
        if (v14.n != null && !var1_3.n.K()) {
            var1_3.n = null;
        }
        if (var1_3.x == null) ** GOTO lbl85
        v15 = var1_3;
        if (!var1_3.x.K()) {
            v15.l((Gl)((Gl_3)null));
            v16 = var1_3;
        } else {
            if (v15.g - var1_3.Ja > ySa.T) {
                var1_3.l((Gl)((Gl_3)null));
            }
lbl85:
            // 4 sources

            v16 = var1_3;
        }
        v16.h();
        v17 = var1_3;
        v17.K = v17.v;
        v17.Ma = v17.ba;
        v17.ga = v17.t;
        v17.h = v17.N;
        v17.s = (int)v17.X;
        v17.o = v17.d;
        v17.j.H.f();
    }

    public void C(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        a2.Z = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Mda mda2) {
        int n2;
        Gl_3 gl_3 = this;
        gl_3.J(lTa.i, xSa.la, xSa.la + gl_3.j.v.nextFloat() * Xpa.R);
        int n3 = n2 = uSa.E;
        while (n3 < tTa.h) {
            void a2;
            Gl_3 b2 = new Lz(((double)((Random)((Object)gl_3.R)).nextFloat() - kTa.B) * tpa.k, Math.random() * tpa.k + tpa.k, aSa.V);
            b2 = b2.f(-gl_3.d * pua.j / Hra.Ga);
            b2 = b2.J(-gl_3.X * pua.j / Hra.Ga);
            double d2 = (double)(-((Random)((Object)gl_3.R)).nextFloat()) * oQa.fa - aQa.r;
            Gl_3 gl_32 = gl_3;
            Lz lz2 = new Lz(((double)((Random)((Object)gl_32.R)).nextFloat() - kTa.B) * aQa.r, d2, oQa.fa);
            lz2 = lz2.f(-gl_3.d * pua.j / Hra.Ga);
            lz2 = lz2.J(-gl_3.X * pua.j / Hra.Ga);
            lz2 = lz2.f((double)gl_3.la, (double)(gl_3.Z + (double)gl_3.l()), (double)gl_3.A);
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = eAa.J((eAa)a2.J());
            gl_32.j.J(UZ.ITEM_CRACK, lz2.A, lz2.j, lz2.J, ((Lz)b2).A, ((Lz)b2).j + fPa.ca, ((Lz)b2).J, nArray);
            n3 = ++n2;
        }
    }

    public void G() {
        Gl_3 a2;
        Gl_3 gl_3 = a2;
        gl_3.ha = gl_3.la = NTa.C;
        a2.k = JPa.N;
    }

    public Mda J(uEa uEa2) {
        uEa b2 = uEa2;
        Gl_3 a2 = this;
        return a2.f(b2.ordinal());
    }

    public boolean K() {
        Gl_3 a2;
        if (a2.J == 0 && a2.f() > JPa.N) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l(float f2) {
        float b2 = f2;
        Gl_3 a2 = this;
        a2.L = b2;
    }

    public float i() {
        return LPa.S;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void h2;
        void c2;
        void d5;
        void e2;
        void f4;
        void g2;
        Gl_3 b2;
        int n3 = n2;
        Gl_3 gl_3 = b2 = this;
        Gl_3 gl_32 = b2;
        Gl_3 gl_33 = b2;
        gl_33.fa = g2;
        gl_33.Ia = f4;
        gl_32.M = e2;
        gl_32.H = (double)d5;
        gl_3.m = (double)c2;
        gl_3.f = h2;
    }

    public void e(vL vL2) {
        Gl_3 b2 = vL2;
        Gl_3 a2 = this;
        b2.J(a2);
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        Gl_3 gl_3 = this;
    }

    public float e() {
        Gl_3 a2;
        return a2.t;
    }

    public float M() {
        Gl_3 a2;
        if (a2.Y()) {
            return (((Random)((Object)a2.R)).nextFloat() - ((Random)((Object)a2.R)).nextFloat()) * psa.N + Ira.d;
        }
        return (((Random)((Object)a2.R)).nextFloat() - ((Random)((Object)a2.R)).nextFloat()) * psa.N + pqa.r;
    }

    public iaa J() {
        Gl_3 a2;
        return a2.Fa;
    }

    public void m() {
    }

    public boolean s() {
        Gl_3 a2;
        if (!a2.Y()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void E() {
        Gl_3 a2;
        Gl_3 gl_3 = a2;
        gl_3.aa.J(Yqa.i, Byte.valueOf((byte)uSa.E));
        gl_3.aa.J(XTa.W, Integer.valueOf(uSa.E));
    }

    public boolean l(vL vL2) {
        Gl_3 b2 = vL2;
        Gl_3 a2 = this;
        if (a2.j.J(new Lz((double)a2.la, (double)(a2.Z + (double)a2.l()), (double)a2.A), new Lz(((vL)b2).la, ((vL)b2).Z + (double)b2.l(), ((vL)b2).A)) == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public final float f() {
        Gl_3 a2;
        return a2.aa.J(uua.p);
    }

    public void f(kba kba2) {
        Gl_3 b2 = kba2;
        Gl_3 a2 = this;
        a2.j = vRa.d;
        if (!a2.j.e) {
            Gl_3 gl_3 = a2;
            Hda.A[b2.f()].J((Gl)gl_3, gl_3.J(), b2.J());
        }
    }

    public String f() {
        return Uqa.M;
    }

    public void J(kba kba2) {
        Gl_3 a2 = this;
        Gl_3 b2 = kba2;
        if (a2.J((kba)b2)) {
            if (a2.C.containsKey(b2.f())) {
                a2.C.get(b2.f()).J((kba)b2);
                Gl_3 gl_3 = a2;
                gl_3.J(gl_3.C.get(b2.f()), vRa.d != 0);
                return;
            }
            a2.C.put(b2.f(), (kba)b2);
            a2.l((kba)b2);
        }
    }

    public int l() {
        Gl_3 a2;
        return a2.Aa;
    }

    public abstract void f(int var1, Mda var2);

    public int J(Sx sx2) {
        Object b2 = sx2;
        Gl_3 a2 = this;
        return uSa.E;
    }

    public static /* synthetic */ void f(Gl a2) {
        Gl gl2 = a2;
        gl2.q();
        gl2.R.f(NTa.C);
    }

    public Gl J() {
        Gl_3 a2;
        return a2.n;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        void a22;
        Gl_3 b2;
        float c222 = f2;
        Gl_3 gl_3 = b2 = this;
        super.f(c222, (float)a22);
        kba kba2 = gl_3.J(Hda.e);
        float f4 = kba2 != null ? (float)(kba2.J() + vRa.d) : JPa.N;
        int c222 = Oz.f((float)((c222 - vQa.q - f4) * a22));
        if (c222 > 0) {
            Gl_3 gl_32 = b2;
            gl_32.J(gl_32.J(c222), pqa.r, pqa.r);
            gl_32.J(gZ.B, (float)c222);
            Gl_3 gl_33 = b2;
            c222 = Oz.f((double)gl_33.la);
            int a22 = Oz.f((double)(gl_33.Z - Bua.Ia));
            int n2 = Oz.f((double)gl_33.A);
            Object c222 = gl_33.j.J(new XF(c222, a22, n2)).J();
            if (((Block)c222).J() != Material.air) {
                c222 = ((Block)c222).stepSound;
                b2.J(((Block$SoundType)c222).J(), ((Block$SoundType)c222).f() * MQa.L, ((Block$SoundType)c222).J() * wOa.w);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public float J(gZ gZ2, float f2) {
        void b22;
        float c2 = f2;
        Gl_3 a2 = this;
        if (!b22.d()) {
            int b22 = kTa.g - a2.f();
            float f3 = c2 * (float)b22;
            a2.d(c2);
            c2 = f3 / sSa.E;
        }
        return c2;
    }

    public boolean y() {
        return uSa.E != 0;
    }

    public void A() {
    }

    public void l() {
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        gl_32.a += vRa.d;
        if (gl_32.a == kTa.j) {
            if (!gl_3.j.e && (gl_3.Ka > 0 || gl_3.y()) && gl_3.s() && gl_3.j.J().f(Gua.H)) {
                int a2;
                Gl_3 gl_33 = gl_3;
                int n2 = a2 = gl_33.J(gl_33.y);
                while (n2 > 0) {
                    int n3 = zEa.J((int)a2);
                    n2 = a2 - n3;
                    Gl_3 gl_34 = gl_3;
                    gl_3.j.f((vL)new zEa((Gg)gl_34.j, (double)gl_34.la, (double)gl_3.Z, (double)gl_3.A, n3));
                }
            }
            Gl_3 gl_35 = gl_3;
            gl_35.k();
            if (!Ni.J(gl_35)) {
                int a2;
                int n4 = a2 = uSa.E;
                while (n4 < kTa.j) {
                    Gl_3 gl_36 = gl_3;
                    double d2 = ((Random)((Object)gl_36.R)).nextGaussian() * GPa.g;
                    double d3 = ((Random)((Object)gl_36.R)).nextGaussian() * GPa.g;
                    double d4 = ((Random)((Object)gl_36.R)).nextGaussian() * GPa.g;
                    int n5 = --1;
                    gl_36.j.J(UZ.EXPLOSION_NORMAL, (double)(gl_3.la + (double)(((Random)((Object)gl_3.R)).nextFloat() * gl_3.F * kta.v) - (double)gl_3.F), (double)(gl_3.Z + (double)(((Random)((Object)gl_3.R)).nextFloat() * gl_3.u)), (double)(gl_3.A + (double)(((Random)((Object)gl_3.R)).nextFloat() * gl_3.F * kta.v) - (double)gl_3.F), d2, d3, d4, new int[uSa.E]);
                    n4 = ++a2;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(uEa uEa2, Mda mda2) {
        void b2;
        Gl_3 c2 = mda2;
        Gl_3 a2 = this;
        a2.f(b2.ordinal(), (Mda)c2);
    }

    public void A(boolean bl) {
        boolean b2 = bl;
        Gl_3 a2 = this;
        a2.ja = b2;
    }

    public void f() {
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        List list = gl_3.j.J((vL)gl_32, gl_32.J().f(Bua.Ia, aSa.V, Bua.Ia), Predicates.and(Kaa.A, new kIa((Gl)gl_3)));
        if (!list.isEmpty()) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < list.size()) {
                vL vL2 = (vL)list.get(a2);
                gl_3.e(vL2);
                n2 = ++a2;
            }
        }
    }

    public int f() {
        int n2;
        Gl_3 gl_3 = this;
        int n3 = uSa.E;
        Mda[] mdaArray = gl_3.J();
        int n4 = mdaArray.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            Gl_3 a22 = mdaArray[n2];
            if (a22 != null && a22.J() instanceof VEa) {
                int a22 = ((VEa)a22.J()).M;
                n3 += a22;
            }
            n5 = ++n2;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, boolean bl, Block block, XF xF2) {
        void b2;
        void d3;
        void a2;
        void c2;
        Object object = this;
        if (!object.L()) {
            object.d();
        }
        if (!object.j.e && object.O > vQa.q && c2 != false) {
            Gl_3 gl_3 = object;
            IBlockState iBlockState = gl_3.j.J((XF)a2);
            Block e22 = iBlockState.J();
            float f2 = Oz.f((float)(gl_3.O - vQa.q));
            if (e22.J() != Material.air) {
                double d4;
                double d5 = Math.min(psa.N + f2 / qta.D, FRa.Ga);
                if (d4 > vqa.c) {
                    d5 = vqa.c;
                }
                int e22 = (int)(rua.y * d5);
                int[] nArray = new int[vRa.d];
                nArray[uSa.E] = Block.l(iBlockState);
                ((Tf)object.j).J(UZ.BLOCK_DUST, (double)object.la, (double)object.Z, (double)object.A, e22, aSa.V, aSa.V, aSa.V, WQa.fa, nArray);
            }
        }
        super.J((double)d3, (boolean)c2, (Block)b2, (XF)a2);
    }

    public abstract Mda J(int var1);

    public boolean l() {
        int n2;
        int n3;
        Gl_3 gl_3;
        Gl_3 gl_32 = gl_3 = this;
        int a22 = Oz.f((double)gl_32.la);
        Block a22 = gl_32.j.J(new XF(a22, n3 = Oz.f((double)gl_32.J().j), n2 = Oz.f((double)gl_32.A))).J();
        if (!(a22 != QFa.z && a22 != QFa.vC || gl_3 instanceof Sx && ((Sx)((Object)gl_3)).t())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public final float J() {
        Gl_3 a2;
        return (float)a2.J(Kha.M).f();
    }

    public void J() {
        Gl_3 a2;
        Gl_3 gl_3 = a2;
        gl_3.aa.f(XTa.W, uSa.E);
        gl_3.aa.f(Yqa.i, (byte)uSa.E);
        gl_3.aa.f(WOa.fa, (byte)uSa.E);
        gl_3.aa.f(uua.p, Float.valueOf(pqa.r));
    }

    public void J(Waa waa2) {
        Gl_3 gl_3;
        waa waa3;
        Gl_3 b2 = waa2;
        Gl_3 a2 = this;
        Gl_3 gl_32 = b2;
        a2.i(gl_32.J(Tpa.I));
        if (gl_32.J(Hra.i, WOa.fa) && a2.j != null && !a2.j.e) {
            Kha.J(a2.J(), b2.J(Hra.i, NTa.C));
        }
        if (b2.J(dqa.ca, WOa.fa)) {
            int n2;
            waa3 = b2.J(dqa.ca, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < waa3.J()) {
                kba kba2 = kba.J((Waa)waa3.J(n2));
                if (kba2 != null) {
                    a2.C.put(kba2.f(), kba2);
                }
                n3 = ++n2;
            }
        }
        if (b2.J(FPa.i, zOa.v)) {
            Gl_3 gl_33 = a2;
            gl_3 = gl_33;
            gl_33.A(b2.J(FPa.i));
        } else {
            waa3 = b2.J(XOa.C);
            if (waa3 == null) {
                Gl_3 gl_34 = a2;
                gl_3 = gl_34;
                gl_34.A(gl_34.J());
            } else if (waa3.J() == tTa.h) {
                a2.A(((rAa)waa3).J());
                gl_3 = a2;
            } else {
                if (waa3.J() == uqa.g) {
                    a2.A((float)((dba)waa3).J());
                }
                gl_3 = a2;
            }
        }
        gl_3.ha = b2.J(Bpa.l);
        Gl_3 gl_35 = a2;
        gl_35.a = b2.J(lqa.o);
        gl_35.Ja = b2.J(ZSa.ca);
    }

    public boolean J(Gl gl2) {
        Gl_3 b2 = gl2;
        Gl_3 a2 = this;
        return a2.J(b2.J());
    }

    public final int J() {
        Gl_3 a2;
        return a2.aa.J(WOa.fa);
    }
}

