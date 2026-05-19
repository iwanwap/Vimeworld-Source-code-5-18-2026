/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aea
 *  Cf
 *  DQa
 *  Gg
 *  Gl
 *  Gua
 *  Hba
 *  ISa
 *  JPa
 *  Jy
 *  KZ
 *  MQa
 *  Mda
 *  NCa
 *  NPa
 *  NTa
 *  Nia
 *  Ofa
 *  Oz
 *  Pqa
 *  QFa
 *  QSa
 *  Tf
 *  UZ
 *  Usa
 *  VEa
 *  Vfa
 *  Vua
 *  Waa
 *  YDa
 *  Yda
 *  Yfa
 *  Ypa
 *  Zta
 *  aFa
 *  aSa
 *  aX
 *  dHa
 *  eAa
 *  hra
 *  jFa
 *  kGa
 *  kPa
 *  kqa
 *  kta
 *  oA
 *  oea
 *  pqa
 *  pua
 *  rAa
 *  vL
 *  vRa
 *  vfa
 *  waa
 *  wra
 *  xga
 *  yra
 *  ysa
 */
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Yfa_2
extends Gl {
    private Gl H;
    public int c;
    private boolean B;
    private Ofa d;
    private oea a;
    public Vfa b;
    private Mda[] l;
    public xaa e;
    private boolean G;
    public final xga D;
    public aFa f;
    public float[] F;
    private dHa g;
    public final xga L;
    private vL E;
    private Waa m;
    private boolean C;
    public Jy i;
    private static final String M = "CL_00001550";
    public XF k;
    public int j;
    public int A;

    /*
     * Enabled aggressive block sorting
     */
    public static eAa J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        switch (a2) {
            case 4: {
                if (b2 == 0) {
                    return Gea.h;
                }
                if (b2 == vRa.d) {
                    return Gea.g;
                }
                if (b2 == uqa.g) {
                    return Gea.Nd;
                }
                if (b2 == yRa.d) {
                    return Gea.G;
                }
                if (b2 == AQa.P) {
                    return Gea.ma;
                }
            }
            case 3: {
                if (b2 == 0) {
                    return Gea.r;
                }
                if (b2 == vRa.d) {
                    return Gea.K;
                }
                if (b2 == uqa.g) {
                    return Gea.d;
                }
                if (b2 == yRa.d) {
                    return Gea.x;
                }
                if (b2 == AQa.P) {
                    return Gea.X;
                }
            }
            case 2: {
                if (b2 == 0) {
                    return Gea.W;
                }
                if (b2 == vRa.d) {
                    return Gea.a;
                }
                if (b2 == uqa.g) {
                    return Gea.e;
                }
                if (b2 == yRa.d) {
                    return Gea.H;
                }
                if (b2 == AQa.P) {
                    return Gea.la;
                }
            }
            case 1: {
                if (b2 == 0) {
                    return Gea.ib;
                }
                if (b2 == vRa.d) {
                    return Gea.ab;
                }
                if (b2 == uqa.g) {
                    return Gea.ea;
                }
                if (b2 == yRa.d) {
                    return Gea.XC;
                }
                if (b2 != AQa.P) break;
                return Gea.Pa;
            }
        }
        return null;
    }

    public Yfa_2(Gg gg2) {
        Yfa_2 b22 = gg2;
        Yfa_2 a2 = this;
        super((Gg)b22);
        a2.l = new Mda[tTa.h];
        Yfa_2 yfa_2 = a2;
        Yfa_2 yfa_22 = a2;
        yfa_22.F = new float[tTa.h];
        yfa_22.j = uSa.E;
        yfa_2.i = null;
        yfa_2.k = null;
        Yfa_2 yfa_23 = a2;
        yfa_2.D = new xga(b22 != null && ((Gg)b22).H != null ? ((Gg)b22).H : null);
        a2.L = new xga(b22 != null && ((Gg)b22).H != null ? ((Gg)b22).H : null);
        a2.d = new Ofa((Yfa)a2);
        a2.b = new Vfa((Yfa)a2);
        a2.f = new aFa((Yfa)a2);
        a2.g = new dHa((Gl)a2);
        a2.e = a2.J((Gg)b22);
        a2.a = new oea((Yfa)a2);
        int n2 = b22 = uSa.E;
        while (n2 < a2.F.length) {
            a2.F[b22++] = Ura.b;
            n2 = b22;
        }
        UUID b22 = a2.J();
        a2.j = (int)(b22.getLeastSignificantBits() & Gua.R);
    }

    public void f(int n2, Mda mda2) {
        Yfa_2 c2 = mda2;
        Yfa_2 a2 = this;
        a2.l[b] = c2;
    }

    private boolean V() {
        Yfa_2 yfa_2 = this;
        if (yfa_2.Y()) {
            return uSa.E != 0;
        }
        if (yfa_2.ha > 0) {
            return uSa.E != 0;
        }
        if (yfa_2.g < kTa.j) {
            return uSa.E != 0;
        }
        Yfa_2 a2 = yfa_2.J();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (((Gg)a2).w.size() != vRa.d) {
            return uSa.E != 0;
        }
        a2 = (vL)((Gg)a2).w.get(uSa.E);
        Yfa_2 yfa_22 = yfa_2;
        double d2 = Math.max(Math.abs(yfa_22.la - ((vL)a2).la) - Zta.ba, aSa.V);
        double d3 = Math.max(Math.abs((double)(yfa_22.A - ((vL)a2).A)) - Zta.ba, aSa.V);
        double d4 = d2;
        double d5 = d3;
        if (!yfa_22.J(d4 * d4 + d5 * d5)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public oea J() {
        Yfa_2 a2;
        return a2.a;
    }

    private void N() {
        Yfa_2 a2;
        Yfa_2 yfa_2 = a2;
        yfa_2.s += vRa.d;
        if (yfa_2 instanceof hFa && a2.J(pqa.r) > MQa.L) {
            a2.s += uqa.g;
        }
        a2.n();
    }

    public void M(float f2) {
        float b2 = f2;
        Yfa_2 a2 = this;
        super.M(b2);
    }

    public boolean J(Class clazz) {
        Object b2 = clazz;
        Yfa_2 a2 = this;
        if (b2 != Yda.class) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void C(float f2) {
        Yfa_2 a2;
        float b2 = f2;
        Yfa_2 yfa_2 = a2 = this;
        super.C(b2);
        yfa_2.M(b2);
    }

    /*
     * Unable to fully structure code
     */
    private void W() {
        block4: {
            var2_1 = this;
            if (!var2_1.B || var2_1.m == null) ** GOTO lbl20
            if (!var2_1.m.J(NTa.j, AQa.P) || !var2_1.m.J(csa.R, AQa.P)) break block4;
            var1_2 = new UUID(var2_1.m.J(NTa.j), var2_1.m.J(csa.R));
            for (Gl var3_4 : var2_1.j.J(Gl.class, var2_1.J().f(Wqa.m, Wqa.m, Wqa.m))) {
                if (!var3_4.J().equals(var1_2)) continue;
                var2_1.E = var3_4;
                ** GOTO lbl20
            }
            ** GOTO lbl20
        }
        if (var2_1.m.J(DPa.ba, zOa.v) && var2_1.m.J(wua.q, zOa.v) && var2_1.m.J(Psa.V, zOa.v)) {
            var1_3 = new XF(var2_1.m.J(DPa.ba), var2_1.m.J(wua.q), var2_1.m.J(Psa.V));
            a = Nia.J((Gg)var2_1.j, (XF)var1_3);
            if (a == null) {
                a = Nia.f((Gg)var2_1.j, (XF)var1_3);
            }
            v0 = var2_1;
            var2_1.E = a;
        } else {
            var2_1.J((boolean)uSa.E, (boolean)vRa.d);
lbl20:
            // 4 sources

            v0 = var2_1;
        }
        v0.m = null;
    }

    public boolean N() {
        Yfa_2 a2;
        if (a2.j.J(a2.J(), (vL)a2)) {
            Yfa_2 yfa_2 = a2;
            if (a2.j.J((vL)yfa_2, yfa_2.J()).isEmpty() && !a2.j.C(a2.J())) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void t() {
        a.G = vRa.d;
    }

    public void J(byte by2) {
        byte b2 = by2;
        Yfa_2 a2 = this;
        if (b2 == kTa.j) {
            a2.Q();
            return;
        }
        super.J(b2);
    }

    public vL l() {
        Yfa_2 a2;
        return a2.E;
    }

    public boolean W() {
        Yfa_2 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        int b22;
        int n2;
        void a2;
        Yfa_2 yfa_2 = this;
        void v0 = a2;
        super.f((Waa)v0);
        v0.J(kPa.v, yfa_2.W());
        v0.J(NPa.q, yfa_2.G);
        Object object = new waa();
        int n3 = n2 = uSa.E;
        while (n3 < yfa_2.l.length) {
            Yfa_2 b22 = new Waa();
            if (yfa_2.l[n2] != null) {
                yfa_2.l[n2].J((Waa)b22);
            }
            object.J((NCa)b22);
            n3 = ++n2;
        }
        a2.J(yOa.M, (NCa)object);
        waa waa3 = new waa();
        int n4 = b22 = uSa.E;
        while (n4 < yfa_2.F.length) {
            waa3.J((NCa)new rAa(yfa_2.F[b22++]));
            n4 = b22;
        }
        void v3 = a2;
        v3.J(dua.ha, (NCa)waa3);
        v3.J(fta.ga, yfa_2.B);
        if (yfa_2.E != null) {
            void v4;
            Waa b22 = new Waa();
            if (yfa_2.E instanceof Gl) {
                v4 = a2;
                Waa waa4 = b22;
                waa4.J(NTa.j, yfa_2.E.J().getMostSignificantBits());
                waa4.J(csa.R, yfa_2.E.J().getLeastSignificantBits());
            } else {
                if (yfa_2.E instanceof YDa) {
                    object = ((YDa)yfa_2.E).f();
                    Waa waa5 = b22;
                    waa5.J(DPa.ba, object.getX());
                    waa5.J(wua.q, object.getY());
                    waa5.J(Psa.V, object.getZ());
                }
                v4 = a2;
            }
            v4.J(QSa.a, (NCa)b22);
        }
        if (yfa_2.t()) {
            a2.J(xTa.t, yfa_2.t());
        }
    }

    public void f(KZ kZ2) {
        int n2;
        Yfa_2 b22 = kZ2;
        Yfa_2 a2 = this;
        float b22 = b22.f();
        if (a2.J() != null && a2.R.nextFloat() < rta.o * b22) {
            kGa.J((Random)a2.R, (Mda)a2.J(), (int)((int)(eua.C + b22 * (float)a2.R.nextInt(yOa.B))));
        }
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            Mda mda2 = a2.J(n2);
            if (mda2 != null && a2.R.nextFloat() < MQa.L * b22) {
                kGa.J((Random)a2.R, (Mda)mda2, (int)((int)(eua.C + b22 * (float)a2.R.nextInt(yOa.B))));
            }
            n3 = ++n2;
        }
    }

    public float J(float f2, float f3) {
        float c2 = f3;
        Yfa_2 a2 = this;
        a2.g.J();
        return c2;
    }

    public void J(Waa waa2) {
        int n2;
        waa waa3;
        Yfa_2 b2 = waa2;
        Yfa_2 a2 = this;
        Yfa_2 yfa_2 = b2;
        super.J((Waa)yfa_2);
        if (yfa_2.J(kPa.v, vRa.d)) {
            a2.D(b2.f(kPa.v));
        }
        a2.G = b2.f(NPa.q);
        if (b2.J(yOa.M, WOa.fa)) {
            waa3 = b2.J(yOa.M, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < a2.l.length) {
                int n4 = n2++;
                a2.l[n4] = Mda.J((Waa)waa3.J(n4));
                n3 = n2;
            }
        }
        if (b2.J(dua.ha, WOa.fa)) {
            waa3 = b2.J(dua.ha, tTa.h);
            int n5 = n2 = uSa.E;
            while (n5 < waa3.J()) {
                int n6 = n2++;
                a2.F[n6] = waa3.J(n6);
                n5 = n2;
            }
        }
        a2.B = b2.f(fta.ga);
        if (a2.B && b2.J(QSa.a, NTa.C)) {
            a2.m = b2.J(QSa.a);
        }
        a2.G(b2.f(xTa.t));
    }

    public void r() {
    }

    public String A() {
        return null;
    }

    public void C(Gl gl2) {
        Yfa_2 b2 = gl2;
        Yfa_2 a2 = this;
        a2.H = b2;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Yfa_2 a2 = this;
        return a2.l[b2 + vRa.d];
    }

    public boolean t() {
        Yfa_2 a2;
        if (a2.aa.J(Ypa.A) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(boolean bl, int n2) {
        int n3;
        Yfa_2 yfa_2 = this;
        int n4 = n3 = uSa.E;
        while (n4 < yfa_2.J().length) {
            void a2;
            void b2;
            int c2;
            Yfa_2 yfa_22 = yfa_2;
            Mda mda2 = yfa_22.f(n3);
            int n5 = c2 = yfa_22.F[n3] > pqa.r ? vRa.d : uSa.E;
            if (mda2 != null && (b2 != false || c2 != 0) && yfa_2.R.nextFloat() - (float)a2 * Jpa.B < yfa_2.F[n3]) {
                if (c2 == 0 && mda2.d()) {
                    Mda mda3 = mda2;
                    c2 = Math.max(mda3.l() - kTa.g, vRa.d);
                    Yfa_2 yfa_23 = yfa_2;
                    int n6 = mda3.l() - yfa_23.R.nextInt(yfa_23.R.nextInt(c2) + vRa.d);
                    if (n6 > c2) {
                        n6 = c2;
                    }
                    if (n6 < vRa.d) {
                        n6 = vRa.d;
                    }
                    mda2.J(n6);
                }
                yfa_2.J(mda2, JPa.N);
            }
            n4 = ++n3;
        }
    }

    public Ofa J() {
        Yfa_2 a2;
        return a2.d;
    }

    public void w() {
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, boolean bl) {
        void b2;
        boolean c2 = bl;
        Yfa_2 a2 = this;
        a2.B = vRa.d;
        a2.E = b2;
        if (!a2.j.e && c2 && a2.j instanceof Tf) {
            Yfa_2 yfa_2 = a2;
            ((Tf)a2.j).J().f((vL)a2, (KC)new Bca(vRa.d, (vL)yfa_2, yfa_2.E));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2, float f3) {
        void b2;
        void a2;
        double d2;
        double d3;
        Yfa_2 d222 = vL2;
        Yfa_2 c2 = this;
        Yfa_2 yfa_2 = d222;
        double d4 = ((vL)yfa_2).la - c2.la;
        double d5 = ((vL)yfa_2).A - c2.A;
        if (yfa_2 instanceof Gl) {
            Gl gl2 = d222;
            d3 = gl2.Z + (double)gl2.l() - (c2.Z + (double)c2.l());
            d2 = d4;
        } else {
            d3 = (d222.J().j + d222.J().M) / KPa.y - (c2.Z + (double)c2.l());
            d2 = d4;
        }
        double d6 = d5;
        double d7 = Oz.J((double)(d2 * d4 + d6 * d6));
        float d222 = (float)(Oz.f((double)d5, (double)d4) * kta.Da / lQa.f) - ISa.a;
        float f4 = (float)(-(Oz.f((double)d3, (double)d7) * kta.Da / lQa.f));
        Yfa_2 yfa_22 = c2;
        yfa_22.d = (Ofa)yfa_22.J((float)yfa_22.d, f4, (float)a2);
        yfa_22.X = yfa_22.J(yfa_22.X, d222, (float)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, boolean bl2) {
        boolean c2 = bl2;
        Yfa_2 a2 = this;
        if (a2.B) {
            void b2;
            a2.B = uSa.E;
            a2.E = null;
            if (!a2.j.e && c2) {
                a2.J(Gea.i, vRa.d);
            }
            if (!a2.j.e && b2 != false && a2.j instanceof Tf) {
                ((Tf)a2.j).J().f((vL)a2, (KC)new Bca(vRa.d, (vL)a2, null));
            }
        }
    }

    public int j() {
        return Fua.J;
    }

    public void G(boolean bl) {
        boolean b2 = bl;
        Yfa_2 a2 = this;
        a2.aa.J(Ypa.A, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public boolean r() {
        Yfa_2 a2;
        if (!a2.S() && !(a2 instanceof WC)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void S() {
        Yfa_2 yfa_2 = this;
        Object a2 = yfa_2.A();
        if (a2 != null) {
            Yfa_2 yfa_22 = yfa_2;
            yfa_22.J((String)a2, yfa_2.G(), yfa_22.M());
        }
    }

    public Mda f(int n2) {
        int b2 = n2;
        Yfa_2 a2 = this;
        return a2.l[b2];
    }

    public final void A() {
        Yfa_2 a2;
        Yfa_2 yfa_2 = a2;
        yfa_2.s += vRa.d;
        yfa_2.j.H.J(hra.W);
        yfa_2.n();
        yfa_2.j.H.f();
        yfa_2.j.H.J(sqa.U);
        yfa_2.a.J();
        yfa_2.j.H.f();
        yfa_2.j.H.J(DPa.d);
        yfa_2.L.J();
        yfa_2.j.H.f();
        yfa_2.j.H.J(MRa.H);
        yfa_2.D.J();
        yfa_2.j.H.f();
        yfa_2.j.H.J(Vua.A);
        yfa_2.e.l();
        yfa_2.j.H.f();
        yfa_2.j.H.J(ppa.Ga);
        yfa_2.r();
        yfa_2.j.H.f();
        yfa_2.j.H.J(hQa.M);
        yfa_2.j.H.J(kPa.c);
        yfa_2.b.J();
        yfa_2.j.H.f(Qpa.y);
        yfa_2.d.J();
        yfa_2.j.H.f(Qra.h);
        yfa_2.f.f();
        yfa_2.j.H.f();
        yfa_2.j.H.f();
    }

    public int J(Sx sx2) {
        Yfa_2 yfa_2 = this;
        if (yfa_2.A > 0) {
            int b2;
            Yfa_2 yfa_22 = yfa_2;
            int a2 = yfa_22.A;
            Mda[] mdaArray = yfa_22.J();
            int n2 = b2 = uSa.E;
            while (n2 < mdaArray.length) {
                if (mdaArray[b2] != null && yfa_2.F[b2] <= pqa.r) {
                    a2 += vRa.d + yfa_2.R.nextInt(yRa.d);
                }
                n2 = ++b2;
            }
            return a2;
        }
        return yfa_2.A;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2) {
        void v0;
        void a2;
        int c2;
        void b2;
        Yfa_2 yfa_2 = this;
        if (b2 == zOa.v) {
            c2 = uSa.E;
            v0 = a2;
        } else {
            c2 = b2 - ySa.T + vRa.d;
            if (c2 < 0 || c2 >= yfa_2.l.length) {
                return uSa.E != 0;
            }
            v0 = a2;
        }
        if (v0 == null || Yfa_2.J((Mda)a2) == c2 || c2 == AQa.P && a2.J() instanceof kda) {
            yfa_2.f(c2, (Mda)a2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Mda J() {
        Yfa_2 a2;
        return a2.l[uSa.E];
    }

    public oA J(KZ kZ2, oA oA2) {
        Yfa_2 c2 = oA2;
        Yfa_2 a2 = this;
        a2.J(Kha.I).J(new CEa(Pqa.Q, a2.R.nextGaussian() * fPa.ca, vRa.d));
        return c2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int J(Mda a2) {
        if (a2.J() != eAa.J((Block)QFa.s) && a2.J() != Gea.GB) {
            if (a2.J() instanceof VEa) {
                switch (((VEa)a2.J()).j) {
                    case 0: {
                        return AQa.P;
                    }
                    case 1: {
                        return yRa.d;
                    }
                    case 2: {
                        return uqa.g;
                    }
                    case 3: {
                        return vRa.d;
                    }
                }
            }
            return uSa.E;
        }
        return AQa.P;
    }

    public void d() {
        Yfa_2 a2;
        if (Config.w() && a2.V()) {
            a2.N();
            return;
        }
        Yfa_2 yfa_2 = a2;
        super.d();
        if (!yfa_2.j.e) {
            a2.x();
        }
    }

    public boolean J(Sx sx2) {
        Gl b2 = sx2;
        Yfa_2 a2 = this;
        return uSa.E != 0;
    }

    public void J(boolean bl, int n2) {
        Yfa_2 yfa_2 = this;
        eAa b2 = yfa_2.J();
        if (b2 != null) {
            int a2;
            int c2 = yfa_2.R.nextInt(yRa.d);
            if (a2 > 0) {
                c2 += yfa_2.R.nextInt(a2 + vRa.d);
            }
            int n3 = a2 = uSa.E;
            while (n3 < c2) {
                yfa_2.J(b2, vRa.d);
                n3 = ++a2;
            }
        }
    }

    public Mda[] J() {
        Yfa_2 a2;
        return a2.l;
    }

    public void J() {
        Yfa_2 a2;
        Yfa_2 yfa_2 = a2;
        super.J();
        yfa_2.aa.f(Ypa.A, (byte)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        float f5;
        void c2;
        float d2 = f3;
        Yfa_2 b2 = this;
        d2 = Oz.f((float)(d2 - c2));
        if (f5 > a2) {
            d2 = a2;
        }
        if (d2 < -a2) {
            d2 = -a2;
        }
        return (float)(c2 + d2);
    }

    public void J(int n2, float f2) {
        float c2 = f2;
        Yfa_2 a2 = this;
        a2.F[b] = c2;
    }

    public void s() {
        Yfa_2 a2;
        Yfa_2 yfa_2 = a2;
        super.s();
        yfa_2.J().J(Kha.I).J(Zta.ba);
    }

    public final boolean l(Sx sx2) {
        Gl b2 = sx2;
        Yfa_2 a2 = this;
        if (a2.S() && a2.l() == b2) {
            a2.J(vRa.d != 0, (!b2.h.f() ? vRa.d : uSa.E) != 0);
            return vRa.d != 0;
        }
        Mda mda2 = b2.K.f();
        if (mda2 != null && mda2.J() == Gea.i && a2.r()) {
            if (!(a2 instanceof vfa) || !((vfa)a2).ba()) {
                a2.J((vL)b2, vRa.d != 0);
                mda2.E -= vRa.d;
                return vRa.d != 0;
            }
            if (((vfa)a2).f(b2)) {
                a2.J((vL)b2, vRa.d != 0);
                mda2.E -= vRa.d;
                return vRa.d != 0;
            }
        }
        if (a2.J((Sx)b2)) {
            return vRa.d != 0;
        }
        return super.l((Sx)b2);
    }

    public void D(boolean bl) {
        boolean b2 = bl;
        Yfa_2 a2 = this;
        a2.C = b2;
    }

    public xaa J(Gg gg2) {
        Yfa_2 b2 = gg2;
        Yfa_2 a2 = this;
        return new Hba((Yfa)a2, (Gg)b2);
    }

    public boolean w() {
        return vRa.d != 0;
    }

    public aFa J() {
        Yfa_2 a2;
        return a2.f;
    }

    public boolean h() {
        int a2;
        Yfa_2 yfa_2 = this;
        if (yfa_2.Ma) {
            return uSa.E != 0;
        }
        Cf cf2 = new Cf(uSa.E, uSa.E, uSa.E);
        int n2 = a2 = uSa.E;
        while (n2 < Yqa.i) {
            Yfa_2 yfa_22 = yfa_2;
            double d2 = yfa_2.la + (double)(((float)((a2 >> uSa.E) % uqa.g) - MQa.L) * yfa_2.F * xSa.la);
            double d3 = yfa_22.Z + (double)(((float)((a2 >> vRa.d) % uqa.g) - MQa.L) * Nra.e);
            int n3 = yfa_22.A + (double)(((float)((a2 >> uqa.g) % uqa.g) - MQa.L) * yfa_2.F * xSa.la);
            cf2.setXyz(d2, d3 + (double)yfa_2.l(), (double)n3);
            if (yfa_22.j.J((XF)cf2).J().e()) {
                return vRa.d != 0;
            }
            n2 = ++a2;
        }
        return uSa.E != 0;
    }

    public boolean S() {
        Yfa_2 a2;
        return a2.B;
    }

    public xaa J() {
        Yfa_2 a2;
        return a2.e;
    }

    public boolean J(Mda mda2) {
        Yfa_2 b2 = mda2;
        Yfa_2 a2 = this;
        return vRa.d != 0;
    }

    public boolean n() {
        return vRa.d != 0;
    }

    public int F() {
        return wra.P;
    }

    public void n() {
        Yfa_2 yfa_2 = this;
        if (yfa_2.G) {
            yfa_2.s = uSa.E;
            return;
        }
        Gl a2 = yfa_2.j.J((vL)yfa_2, pqa.q);
        if (a2 != null) {
            Gl gl2 = a2;
            double d2 = gl2.la - yfa_2.la;
            float f2 = gl2.Z - yfa_2.Z;
            Yfa_2 yfa_22 = yfa_2;
            float f3 = gl2.A - yfa_22.A;
            double d3 = d2;
            float f4 = f2;
            float f5 = f3;
            d2 = d3 * d3 + f4 * f4 + f5 * f5;
            if (yfa_22.n() && d2 > DQa.X) {
                yfa_2.k();
            }
            if (yfa_2.s > Jpa.z && yfa_2.R.nextInt(Lsa.E) == 0 && d2 > yra.Y && yfa_2.n()) {
                yfa_2.k();
                return;
            }
            if (d2 < yra.Y) {
                yfa_2.s = uSa.E;
            }
        }
    }

    public boolean x() {
        return uSa.E != 0;
    }

    public void y() {
        Yfa_2 yfa_2;
        Yfa_2 yfa_22 = yfa_2 = this;
        super.y();
        yfa_22.j.H.J(Usa.Ga);
        if (!yfa_22.j.e && yfa_2.W() && yfa_2.g == false && yfa_2.j.J().f(kqa.N)) {
            for (Yfa_2 a2 : yfa_2.j.J(jFa.class, yfa_2.J().f(oua.i, aSa.V, oua.i))) {
                if (((jFa)a2).J || a2.J() == null || a2.l()) continue;
                yfa_2.J((jFa)a2);
            }
        }
        yfa_2.j.H.f();
    }

    public void L() {
        Yfa_2 a2;
        Yfa_2 yfa_2 = a2;
        super.L();
        yfa_2.j.H.J(ysa.ca);
        if (yfa_2.K()) {
            int n2 = a2.c;
            a2.c = n2 + vRa.d;
            if (a2.R.nextInt(PRa.U) < n2) {
                Yfa_2 yfa_22 = a2;
                yfa_22.c = -yfa_22.j();
                yfa_22.S();
            }
        }
        a2.j.H.f();
    }

    public float k() {
        return pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    public void J(KZ kZ2) {
        void a22;
        Yfa_2 yfa_2 = this;
        if (yfa_2.R.nextFloat() < VPa.i * a22.f()) {
            int b2;
            float f2;
            Yfa_2 yfa_22 = yfa_2;
            int a22 = yfa_22.R.nextInt(uqa.g);
            float f3 = f2 = yfa_22.j.J() == sZ.HARD ? Nra.e : rta.o;
            if (yfa_2.R.nextFloat() < dua.a) {
                ++a22;
            }
            if (yfa_2.R.nextFloat() < dua.a) {
                ++a22;
            }
            if (yfa_2.R.nextFloat() < dua.a) {
                ++a22;
            }
            int n2 = b2 = yRa.d;
            while (n2 >= 0) {
                Mda mda2 = yfa_2.J(b2);
                if (b2 < yRa.d && yfa_2.R.nextFloat() < f2) {
                    return;
                }
                if (mda2 == null && (mda2 = Yfa_2.J(b2 + vRa.d, a22)) != null) {
                    yfa_2.f(b2 + vRa.d, new Mda((eAa)mda2));
                }
                n2 = --b2;
            }
        }
    }

    public Vfa J() {
        Yfa_2 a2;
        return a2.b;
    }

    public eAa J() {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void J(jFa var1_1) {
        block7: {
            block10: {
                block8: {
                    block11: {
                        block9: {
                            var2_2 = this;
                            b = a.J();
                            var5_3 = Yfa_2.J((Mda)b);
                            if (var5_3 <= pua.o) break block7;
                            var4_4 = vRa.d;
                            var3_5 = var2_2.f(var5_3);
                            if (var3_5 == null) ** GOTO lbl31
                            if (var5_3 != 0) break block8;
                            if (!(b.J() instanceof xCa) || var3_5.J() instanceof xCa) break block9;
                            v0 = var4_4 = vRa.d;
                            break block10;
                        }
                        if (!(b.J() instanceof xCa) || !(var3_5.J() instanceof xCa)) break block11;
                        var6_6 = (xCa)b.J();
                        var7_7 = (xCa)var3_5.J();
                        var4_4 = var6_6.J() != var7_7.J() ? (var6_6.J() > var7_7.J() ? vRa.d : uSa.E) : (b.J() > var3_5.J() || b.M() != false && var3_5.M() == false ? vRa.d : uSa.E);
                        ** GOTO lbl31
                    }
                    v0 = b.J() instanceof Aea && var3_5.J() instanceof Aea ? (var4_4 = b.M() != false && var3_5.M() == false ? vRa.d : uSa.E) : (var4_4 = uSa.E);
                    break block10;
                }
                if (b.J() instanceof VEa && !(var3_5.J() instanceof VEa)) {
                    v0 = var4_4 = vRa.d;
                } else {
                    if (b.J() instanceof VEa && var3_5.J() instanceof VEa) {
                        var6_6 = (VEa)b.J();
                        var7_8 = (VEa)var3_5.J();
                        var4_4 = var6_6.M != var7_8.M ? (var6_6.M > var7_8.M ? vRa.d : uSa.E) : (b.J() > var3_5.J() || b.M() != false && var3_5.M() == false ? vRa.d : uSa.E);
                    } else {
                        var4_4 = uSa.E;
                    }
lbl31:
                    // 4 sources

                    v0 = var4_4;
                }
            }
            if (v0 != 0 && var2_2.J((Mda)b)) {
                if (var3_5 != null && var2_2.R.nextFloat() - Nra.e < var2_2.F[var5_3]) {
                    var2_2.J(var3_5, JPa.N);
                }
                if (b.J() == Gea.b && a.f() != null && (var6_6 = var2_2.j.J(a.f())) != null) {
                    var6_6.J((aX)mY.o);
                }
                v1 = var2_2;
                v1.f(var5_3, (Mda)b);
                v1.F[var5_3] = kta.v;
                v1.G = vRa.d;
                var2_2.f((vL)a, vRa.d);
                a.k();
            }
        }
    }

    public int D() {
        return AQa.P;
    }

    public void x() {
        Yfa_2 a2;
        if (a2.m != null) {
            a2.W();
        }
        if (a2.B) {
            if (!a2.K()) {
                a2.J(vRa.d != 0, vRa.d != 0);
            }
            if (a2.E == null || a2.E.J) {
                a2.J(vRa.d != 0, vRa.d != 0);
            }
        }
    }

    public int A() {
        Yfa_2 yfa_2 = this;
        if (yfa_2.C() == null) {
            return yRa.d;
        }
        int a2 = (int)(yfa_2.f() - yfa_2.J() * bsa.Ka);
        if ((a2 -= (yRa.d - yfa_2.j.J().getDifficultyId()) * AQa.P) < 0) {
            a2 = uSa.E;
        }
        return a2 + yRa.d;
    }

    public boolean Q() {
        Yfa_2 a2;
        return a2.G;
    }

    public void Q() {
        Yfa_2 yfa_2 = this;
        if (yfa_2.j.e) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < kTa.j) {
                Yfa_2 yfa_22 = yfa_2;
                double d2 = yfa_22.R.nextGaussian() * GPa.g;
                double d3 = yfa_22.R.nextGaussian() * GPa.g;
                double d4 = yfa_22.R.nextGaussian() * GPa.g;
                double d5 = Wqa.m;
                int n3 = --1;
                yfa_22.j.J(UZ.EXPLOSION_NORMAL, yfa_2.la + (double)(yfa_2.R.nextFloat() * yfa_2.F * kta.v) - (double)yfa_2.F - d2 * d5, yfa_2.Z + (double)(yfa_2.R.nextFloat() * yfa_2.u) - d3 * d5, (double)(yfa_2.A + (double)(yfa_2.R.nextFloat() * yfa_2.F * kta.v) - (double)yfa_2.F - d4 * d5), d2, d3, d4, new int[uSa.E]);
                n2 = ++a2;
            }
        } else {
            yfa_2.j.J((vL)yfa_2, (byte)kTa.j);
        }
    }

    public Gl C() {
        Yfa_2 a2;
        return a2.H;
    }

    public boolean U() {
        Yfa_2 a2;
        if (super.U() && !a2.t()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

