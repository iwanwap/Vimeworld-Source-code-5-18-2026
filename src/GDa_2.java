/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FBa
 *  GDa
 *  Gg
 *  Gl
 *  HEa
 *  Hda
 *  ISa
 *  JPa
 *  Lz
 *  MQa
 *  Mda
 *  NEa
 *  NQa
 *  NTa
 *  QFa
 *  Qia
 *  Qsa
 *  SIa
 *  SQa
 *  Sqa
 *  UZ
 *  Waa
 *  XDa
 *  XTa
 *  YSa
 *  Yfa
 *  Zta
 *  aSa
 *  bFa
 *  cRa
 *  dZ
 *  gFa
 *  gZ
 *  hqa
 *  hra
 *  iPa
 *  isa
 *  jsa
 *  kba
 *  kfa
 *  kta
 *  lPa
 *  lqa
 *  nHa
 *  pqa
 *  psa
 *  pua
 *  qea
 *  qta
 *  vL
 *  vRa
 *  vpa
 *  xca
 *  yQa
 *  zDa
 */
import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GDa_2
extends hFa {
    private Gl a;
    private float b;
    private float l;
    private float f;
    private float g;
    private boolean m;
    private float C;
    private int k;
    private HDa I;

    public xaa J(Gg gg2) {
        GDa_2 b2 = gg2;
        GDa_2 a2 = this;
        return new xca((Yfa)a2, (Gg)b2);
    }

    public void N() {
        GDa_2 a2;
        a2.k(vRa.d != 0);
        a2.C = a2.f = pqa.r;
    }

    public int I() {
        GDa_2 a2;
        if (a2.Fa()) {
            return Psa.M;
        }
        return Fua.J;
    }

    public boolean Fa() {
        GDa_2 a2;
        return a2.l(AQa.P);
    }

    public boolean ba() {
        GDa_2 a2;
        return a2.l(uqa.g);
    }

    public void d(int n2) {
        int b2 = n2;
        GDa_2 a2 = this;
        int n3 = b2;
        super.d(n3);
        if (n3 == ERa.C) {
            if (a2.Fa() && a2.F < pqa.r) {
                a2.l(iPa.d, iPa.d);
                return;
            }
        } else if (b2 == yta.Ka) {
            GDa_2 gDa_2 = a2;
            gDa_2.k = uSa.E;
            gDa_2.a = null;
        }
    }

    @Override
    public void y() {
        GDa_2 gDa_2;
        GDa_2 gDa_22 = this;
        if (gDa_22.j.e) {
            GDa_2 a2;
            GDa_2 gDa_23;
            GDa_2 gDa_24;
            GDa_2 gDa_25 = gDa_22;
            gDa_25.g = gDa_25.l;
            if (!gDa_25.L()) {
                GDa_2 gDa_26;
                GDa_2 gDa_27;
                gDa_22.b = kta.v;
                if (gDa_27.Ea > aSa.V && gDa_22.m && !gDa_22.c()) {
                    GDa_2 gDa_28 = gDa_22;
                    gDa_28.j.J(gDa_28.la, gDa_22.Z, gDa_22.A, isa.N, pqa.r, pqa.r, uSa.E != 0);
                }
                gDa_22.m = gDa_26.Ea < aSa.V && gDa_22.j.J(new XF((vL)gDa_22).down(), uSa.E != 0) ? vRa.d : uSa.E;
                gDa_24 = gDa_22;
            } else if (gDa_22.ba()) {
                if (gDa_22.b < MQa.L) {
                    gDa_22.b = YSa.G;
                    gDa_24 = gDa_22;
                } else {
                    gDa_22.b += (MQa.L - gDa_22.b) * Nra.e;
                    gDa_24 = gDa_22;
                }
            } else {
                GDa_2 gDa_29 = gDa_22;
                gDa_24 = gDa_29;
                gDa_29.b += (Mqa.N - gDa_22.b) * psa.N;
            }
            gDa_24.l += gDa_22.b;
            GDa_2 gDa_210 = gDa_22;
            gDa_210.C = gDa_210.f;
            if (!gDa_210.L()) {
                gDa_22.f = gDa_22.R.nextFloat();
                gDa_23 = gDa_22;
            } else {
                GDa_2 gDa_211 = gDa_22;
                if (gDa_22.ba()) {
                    gDa_211.f += (JPa.N - gDa_22.f) * rta.o;
                    gDa_23 = gDa_22;
                } else {
                    gDa_211.f += (pqa.r - gDa_22.f) * iSa.fa;
                    gDa_23 = gDa_22;
                }
            }
            if (gDa_23.ba() && gDa_22.L()) {
                int n2;
                a2 = gDa_22.J(JPa.N);
                int n3 = n2 = uSa.E;
                while (n3 < uqa.g) {
                    int n4 = 2 ^ 3;
                    gDa_22.j.J(UZ.WATER_BUBBLE, gDa_22.la + (gDa_22.R.nextDouble() - kTa.B) * (double)gDa_22.F - ((Lz)a2).A * Bta.c, gDa_22.Z + gDa_22.R.nextDouble() * (double)gDa_22.u - ((Lz)a2).j * Bta.c, gDa_22.A + (gDa_22.R.nextDouble() - kTa.B) * (double)gDa_22.F - ((Lz)a2).J * Bta.c, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    n3 = ++n2;
                }
            }
            if (gDa_22.v()) {
                if (gDa_22.k < gDa_22.I()) {
                    gDa_22.k += vRa.d;
                }
                if ((a2 = gDa_22.d()) != null) {
                    double d2;
                    GDa_2 gDa_212 = gDa_22;
                    gDa_22.J().J((vL)a2, ISa.a, ISa.a);
                    gDa_212.J().J();
                    double d3 = gDa_212.d(JPa.N);
                    GDa_2 gDa_213 = a2;
                    double d4 = ((Gl)gDa_213).la - gDa_22.la;
                    double d5 = ((Gl)gDa_213).Z + (double)(((Gl)a2).u * MQa.L) - (gDa_22.Z + (double)gDa_22.l());
                    double d6 = ((Gl)a2).A - gDa_22.A;
                    double d7 = d4;
                    double d8 = d5;
                    double d9 = d6;
                    double d10 = Math.sqrt(d7 * d7 + d8 * d8 + d9 * d9);
                    d4 /= d10;
                    d5 /= d10;
                    d6 /= d10;
                    double d11 = d2 = gDa_212.R.nextDouble();
                    while (d11 < d10) {
                        d11 = d2 + (lqa.x - d3 + gDa_22.R.nextDouble() * (qta.S - d3));
                        gDa_22.j.J(UZ.WATER_BUBBLE, gDa_22.la + d4 * d2, gDa_22.Z + d5 * d2 + (double)gDa_22.l(), gDa_22.A + d6 * d2, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    }
                }
            }
        }
        GDa_2 gDa_214 = gDa_22;
        if (gDa_22.H) {
            gDa_214.e(vpa.Ja);
            gDa_2 = gDa_22;
        } else {
            if (gDa_214.ha) {
                GDa_2 gDa_215 = gDa_22;
                gDa_215.J(gDa_215.Ea + kTa.B);
                gDa_215.f(gDa_215.i + (double)((gDa_22.R.nextFloat() * kta.v - pqa.r) * Xpa.R));
                gDa_215.l(gDa_215.f + (double)((gDa_22.R.nextFloat() * kta.v - pqa.r) * Xpa.R));
                gDa_215.X = gDa_215.R.nextFloat() * CRa.ja;
                gDa_215.d(uSa.E != 0);
                gDa_215.t = vRa.d;
            }
            gDa_2 = gDa_22;
        }
        if (gDa_2.v()) {
            gDa_22.X = gDa_22.t;
        }
        super.y();
    }

    public int j() {
        return rRa.f;
    }

    private void F(boolean bl) {
        boolean b2 = bl;
        GDa_2 a2 = this;
        a2.f(uqa.g, b2);
    }

    public void f(Waa waa2) {
        GDa_2 b2 = waa2;
        GDa_2 a2 = this;
        GDa_2 gDa_2 = b2;
        super.f((Waa)gDa_2);
        gDa_2.J(Nta.V, a2.Fa());
    }

    public boolean N() {
        GDa_2 a2;
        if (a2.j.J(a2.J(), (vL)a2)) {
            GDa_2 gDa_2 = a2;
            if (a2.j.J((vL)gDa_2, gDa_2.J()).isEmpty()) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public GDa_2(Gg gg2) {
        GDa_2 a2;
        GDa_2 b2 = gg2;
        GDa_2 gDa_2 = a2 = this;
        super((Gg)b2);
        gDa_2.A = NTa.C;
        gDa_2.l(Sqa.g, Sqa.g);
        gDa_2.D.J(AQa.P, (gFa)new XDa((GDa)a2));
        b2 = new Qia((bga)a2, oua.i);
        gDa_2.D.J(tTa.h, (gFa)b2);
        GDa_2 gDa_22 = a2;
        a2.I = new HDa(a2, oua.i, Fua.J);
        gDa_2.D.J(XTa.W, (gFa)a2.I);
        GDa_2 gDa_23 = a2;
        GDa_2 gDa_24 = a2;
        gDa_24.D.J(Yqa.i, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        gDa_24.D.J(Yqa.i, (gFa)new nHa((Yfa)a2, GDa_2.class, Fua.Y, Jpa.B));
        gDa_24.D.J(WOa.fa, (gFa)new SIa((Yfa)a2));
        a2.I.J(yRa.d);
        b2.J(yRa.d);
        gDa_23.L.J(vRa.d, (gFa)new NEa((bga)a2, Gl.class, NTa.C, vRa.d != 0, uSa.E != 0, (Predicate)new qea((GDa)a2)));
        a2.b = (float)new kfa((GDa)a2);
        gDa_23.g = gDa_23.l = gDa_23.R.nextFloat();
    }

    public float d(float f2) {
        float b2 = f2;
        GDa_2 a2 = this;
        return ((float)a2.k + b2) / (float)a2.I();
    }

    private void D(int n2) {
        int b2 = n2;
        GDa_2 a2 = this;
        a2.aa.J(yta.Ka, Integer.valueOf(b2));
    }

    @Override
    public void s() {
        GDa_2 a2;
        GDa_2 gDa_2 = a2;
        super.s();
        gDa_2.J(Kha.A).J(lPa.K);
        gDa_2.J(Kha.j).J(kTa.B);
        gDa_2.J(Kha.I).J(Zta.ba);
        gDa_2.J(Kha.M).J(gua.V);
    }

    public void k(boolean bl) {
        boolean b2 = bl;
        GDa_2 a2 = this;
        boolean bl2 = b2;
        a2.f(AQa.P, bl2);
        if (bl2) {
            GDa_2 gDa_2 = a2;
            gDa_2.l(iPa.d, iPa.d);
            gDa_2.J(Kha.j).J(osa.b);
            gDa_2.J(Kha.A).J(Wqa.Z);
            gDa_2.J(Kha.M).J(ERa.t);
            gDa_2.t();
            gDa_2.I.f(hra.i);
        }
    }

    public void r() {
        GDa_2 gDa_2;
        GDa_2 gDa_22 = gDa_2 = this;
        super.r();
        if (gDa_22.Fa()) {
            if ((gDa_2.g + gDa_2.M()) % PRa.ga == false) {
                Hda hda2 = Hda.I;
                for (GDa_2 a2 : gDa_2.j.f(bFa.class, (Predicate)new zDa((GDa)gDa_2))) {
                    if (a2.J(hda2) && a2.J(hda2).J() >= uqa.g && a2.J(hda2).l() >= PRa.ga) continue;
                    GDa_2 gDa_23 = a2;
                    ((bFa)gDa_23).I.J((KC)new FBa(NTa.C, JPa.N));
                    GDa_2 gDa_24 = a2;
                    gDa_23.J(new kba(hda2.O, MTa.g, uqa.g));
                }
            }
            if (!gDa_2.T()) {
                GDa_2 gDa_25 = gDa_2;
                gDa_25.J(new XF((vL)gDa_25), ERa.C);
            }
        }
    }

    public float C(float f2) {
        GDa_2 a2;
        float b2 = f2;
        GDa_2 gDa_2 = a2 = this;
        return gDa_2.g + (gDa_2.l - a2.g) * b2;
    }

    public float l() {
        GDa_2 a2;
        return a2.u * MQa.L;
    }

    public Gl d() {
        GDa_2 gDa_2 = this;
        if (!gDa_2.v()) {
            return null;
        }
        if (gDa_2.j.e) {
            if (gDa_2.a != null) {
                return gDa_2.a;
            }
            GDa_2 gDa_22 = gDa_2;
            GDa_2 a2 = gDa_22.j.J(gDa_22.aa.J(yta.Ka));
            if (a2 instanceof Gl) {
                gDa_2.a = (Gl)a2;
                return gDa_2.a;
            }
            return null;
        }
        return gDa_2.C();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void d(float f2, float f3) {
        void b2;
        float c2 = f3;
        GDa_2 a2 = this;
        if (a2.U()) {
            if (a2.L()) {
                GDa_2 gDa_2 = a2;
                gDa_2.J((float)b2, c2, Nra.e);
                GDa_2 gDa_22 = a2;
                gDa_22.J(gDa_2.i, gDa_22.Ea, a2.f);
                gDa_2.f(gDa_2.i * hqa.l);
                gDa_2.J(gDa_2.Ea * hqa.l);
                gDa_2.l(gDa_2.f * hqa.l);
                if (gDa_2.ba() || a2.C() != null) return;
                GDa_2 gDa_23 = a2;
                gDa_23.J(gDa_23.Ea - SQa.F);
                return;
            }
            super.d((float)b2, c2);
            return;
        }
        super.d((float)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        void v0;
        void b2;
        int c2 = n2;
        GDa_2 a2 = this;
        int n3 = a2.R.nextInt(yRa.d) + a2.R.nextInt(c2 + vRa.d);
        if (n3 > 0) {
            a2.J(new Mda(Gea.Dd, n3, uSa.E), pqa.r);
        }
        if (a2.R.nextInt(yRa.d + c2) > vRa.d) {
            v0 = b2;
            a2.J(new Mda(Gea.E, vRa.d, HEa.COD.getMetadata()), pqa.r);
        } else {
            if (a2.R.nextInt(yRa.d + c2) > vRa.d) {
                a2.J(new Mda(Gea.QA, vRa.d, uSa.E), pqa.r);
            }
            v0 = b2;
        }
        if (v0 != false && a2.Fa()) {
            a2.J(new Mda(QFa.ba, vRa.d, vRa.d), pqa.r);
        }
    }

    public boolean v() {
        GDa_2 a2;
        if (a2.aa.J(yta.Ka) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public String f() {
        GDa_2 a2;
        if (!a2.L()) {
            return APa.h;
        }
        if (a2.Fa()) {
            return JPa.R;
        }
        return WOa.X;
    }

    public void J(Waa waa2) {
        GDa_2 a2;
        GDa_2 b2 = waa2;
        GDa_2 gDa_2 = a2 = this;
        super.J((Waa)b2);
        gDa_2.k(b2.f(Nta.V));
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public void J() {
        GDa_2 a2;
        GDa_2 gDa_2 = a2;
        super.J();
        gDa_2.aa.f(ERa.C, uSa.E);
        gDa_2.aa.f(yta.Ka, uSa.E);
    }

    public void p() {
        GDa_2 gDa_2 = this;
        GDa_2 a2 = ((By)dZ.J((Random)gDa_2.R, Fga.J())).J(gDa_2.R);
        gDa_2.J((Mda)a2, pqa.r);
    }

    @Override
    public boolean O() {
        return vRa.d != 0;
    }

    public String A() {
        GDa_2 a2;
        if (!a2.L()) {
            return NQa.R;
        }
        if (a2.Fa()) {
            return Qra.r;
        }
        return YSa.b;
    }

    @Override
    public String i() {
        GDa_2 a2;
        if (!a2.L()) {
            return jsa.b;
        }
        if (a2.Fa()) {
            return Zta.ja;
        }
        return yQa.q;
    }

    public int F() {
        return cRa.n;
    }

    public static /* synthetic */ void J(GDa gDa2, int n2) {
        int b2 = n2;
        GDa a2 = gDa2;
        super.D(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(gZ gZ2, float f2) {
        void a2;
        GDa_2 c2 = gZ2;
        GDa_2 b2 = this;
        if (!b2.ba() && !c2.J() && c2.J() instanceof Gl) {
            Gl gl2 = (Gl)c2.J();
            if (!c2.l()) {
                gl2.J(gZ.J((vL)b2), kta.v);
                gl2.J(lTa.y, MQa.L, pqa.r);
            }
        }
        b2.I.C();
        return super.J((gZ)c2, (float)a2);
    }

    public static /* synthetic */ HDa J(GDa a2) {
        return a2.I;
    }

    @Override
    public boolean w() {
        GDa_2 a2;
        if ((a2.R.nextInt(kTa.j) == 0 || !a2.j.l(new XF((vL)a2))) && super.w()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(GDa gDa2, boolean bl) {
        boolean b2 = bl;
        GDa a2 = gDa2;
        super.F(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, boolean bl) {
        void b2;
        void a2;
        GDa_2 gDa_2 = this;
        int c2 = gDa_2.aa.J(ERa.C);
        if (a2 != false) {
            gDa_2.aa.J(ERa.C, Integer.valueOf(c2 | b2));
            return;
        }
        gDa_2.aa.J(ERa.C, Integer.valueOf(c2 & (b2 ^ pua.o)));
    }

    public float l(float f2) {
        GDa_2 a2;
        float b2 = f2;
        GDa_2 gDa_2 = a2 = this;
        return gDa_2.C + (gDa_2.f - a2.C) * b2;
    }

    private boolean l(int n2) {
        int b2 = n2;
        GDa_2 a2 = this;
        if ((a2.aa.J(ERa.C) & b2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public float J(XF xF) {
        Object b2 = xF;
        GDa_2 a2 = this;
        if (a2.j.J((XF)((Object)b2)).J().J() == Material.water) {
            return FRa.Ga + a2.j.J((XF)((Object)b2)) - MQa.L;
        }
        return super.J((XF)((Object)b2));
    }
}

