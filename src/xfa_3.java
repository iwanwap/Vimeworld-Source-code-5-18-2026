/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  BRa
 *  Cta
 *  ERa
 *  FPa
 *  Gg
 *  Gl
 *  Hba
 *  JPa
 *  MQa
 *  Mda
 *  NEa
 *  NOa
 *  Oz
 *  Pha
 *  Qga
 *  Qsa
 *  Rea
 *  SIa
 *  Ssa
 *  UZ
 *  Uta
 *  Waa
 *  XTa
 *  Yda
 *  Yfa
 *  Ypa
 *  eAa
 *  fEa
 *  gFa
 *  gZ
 *  hea
 *  iea
 *  isa
 *  jea
 *  kta
 *  lEa
 *  nHa
 *  oHa
 *  pqa
 *  psa
 *  pua
 *  rGa
 *  ria
 *  sGa
 *  vIa
 *  vL
 *  vQa
 *  vRa
 *  vfa
 *  wEa
 *  wOa
 *  xfa
 *  ysa
 *  zfa
 */
import com.google.common.base.Predicate;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xfa_3
extends vfa {
    private float g;
    private boolean m;
    private float C;
    private boolean j;
    private float J;
    private float A;

    /*
     * WARNING - void declaration
     */
    public float f(float f2, float f3) {
        float f4;
        float f5;
        void a2;
        xfa_3 b2;
        float c2 = f2;
        xfa_3 xfa_32 = b2 = this;
        c2 = (xfa_32.g + (xfa_32.J - b2.g) * c2 + a2) / Ssa.la;
        if (f5 < JPa.N) {
            f4 = c2 = JPa.N;
        } else {
            if (c2 > pqa.r) {
                c2 = pqa.r;
            }
            f4 = c2;
        }
        return Oz.d((float)(f4 * pua.j)) * Oz.d((float)(c2 * pua.j * AQa.W)) * VPa.i * pua.j;
    }

    public boolean f(Mda mda2) {
        xfa_3 b2 = mda2;
        xfa_3 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (!(b2.J() instanceof YCa)) {
            return uSa.E != 0;
        }
        return ((YCa)b2.J()).A();
    }

    public boolean n() {
        xfa_3 a2;
        if (!a2.ba() && a2.g > Uta.F) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eAa J() {
        return eAa.l((int)pua.o);
    }

    public boolean Ha() {
        xfa_3 a2;
        return a2.m;
    }

    public void J(byte by2) {
        byte b2 = by2;
        xfa_3 a2 = this;
        if (b2 == Yqa.i) {
            xfa_3 xfa_32 = a2;
            xfa_32.j = vRa.d;
            xfa_32.J = JPa.N;
            xfa_32.g = JPa.N;
            return;
        }
        super.J(b2);
    }

    public void J(XF xF2, Block block) {
        Object c2 = block;
        xfa_3 a2 = this;
        a2.J(yta.V, VPa.i, pqa.r);
    }

    public float j() {
        xfa_3 a2;
        if (a2.Fa()) {
            return eta.b;
        }
        if (a2.ba()) {
            return (vTa.N - (eta.e - a2.aa.J(yOa.B)) * WRa.e) * pua.j;
        }
        return vRa.Aa;
    }

    public String A() {
        xfa_3 a2;
        if (a2.Fa()) {
            return NOa.d;
        }
        if (a2.R.nextInt(yRa.d) == 0) {
            if (a2.ba() && a2.aa.J(yOa.B) < FRa.Ga) {
                return xra.L;
            }
            return sqa.A;
        }
        return isa.l;
    }

    public void J() {
        xfa_3 a2;
        xfa_3 xfa_32 = a2;
        super.J();
        xfa_32.aa.f(yOa.B, new Float(a2.f()));
        xfa_32.aa.f(wOa.t, new Byte((byte)uSa.E));
        xfa_32.aa.f(kTa.j, new Byte((byte)iea.RED.getMetadata()));
    }

    public int F() {
        xfa_3 a2;
        if (a2.v()) {
            return kTa.j;
        }
        return super.F();
    }

    public void C(Gl gl2) {
        xfa_3 b2 = gl2;
        xfa_3 a2 = this;
        xfa_3 xfa_32 = b2;
        super.C((Gl)xfa_32);
        if (xfa_32 == null) {
            a2.H(uSa.E != 0);
            return;
        }
        if (!a2.ba()) {
            a2.H(vRa.d != 0);
        }
    }

    public iea J() {
        xfa_3 a2;
        return iea.byDyeDamage((int)(a2.aa.J(kTa.j) & Ypa.A));
    }

    public boolean ca() {
        xfa_3 a2;
        if (a2.aa.J(wOa.t) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(Waa waa2) {
        xfa_3 b2 = waa2;
        xfa_3 a2 = this;
        xfa_3 xfa_32 = b2;
        super.f((Waa)xfa_32);
        xfa_32.J(ysa.G, a2.Fa());
        xfa_32.J(Cta.S, (byte)a2.J().getDyeDamage());
    }

    public String i() {
        return wOa.ha;
    }

    /*
     * WARNING - void declaration
     */
    public void H(boolean bl2) {
        void a2;
        xfa_3 xfa_32 = this;
        byte b2 = xfa_32.aa.J(ERa.C);
        if (a2 != false) {
            xfa_32.aa.J(ERa.C, Byte.valueOf((byte)(b2 | uqa.g)));
            return;
        }
        xfa_32.aa.J(ERa.C, Byte.valueOf((byte)(b2 & ERa.Ka)));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gl gl2, Gl gl3) {
        xfa_3 c2 = gl2;
        xfa_3 b2 = this;
        if (!(c2 instanceof zfa) && !(c2 instanceof Yda)) {
            void a2;
            xfa_3 xfa_32;
            if (c2 instanceof xfa_3 && (xfa_32 = c2).ba() && xfa_32.d() == a2) {
                return uSa.E != 0;
            }
            if (c2 instanceof Sx && a2 instanceof Sx && !((Sx)a2).J((Sx)((Object)c2))) {
                return uSa.E != 0;
            }
            if (!(c2 instanceof Rea) || !((Rea)c2).ja()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public float G() {
        return Xpa.R;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2) {
        xfa_3 xfa_32;
        void a2;
        block16: {
            xfa_3 xfa_33;
            block15: {
                xfa_3 b2;
                block14: {
                    xfa_33 = this;
                    b2 = a2.K.f();
                    if (!xfa_33.ba()) break block14;
                    if (b2 != null) {
                        iea iea2;
                        if (b2.J() instanceof YCa) {
                            YCa yCa2 = (YCa)b2.J();
                            if (yCa2.A() && xfa_33.aa.J(yOa.B) < eta.e) {
                                if (!a2.h.f()) {
                                    ((Mda)b2).E -= vRa.d;
                                }
                                xfa_33.e(yCa2.f((Mda)b2));
                                if (((Mda)b2).E <= 0) {
                                    void v0 = a2;
                                    v0.K.J(v0.K.J, (Mda)null);
                                }
                                return vRa.d != 0;
                            }
                        } else if (b2.J() == Gea.Q && (iea2 = iea.byDyeDamage((int)b2.J())) != xfa_33.J()) {
                            xfa_33.J(iea2);
                            if (!a2.h.f() && (((Mda)b2).E -= vRa.d) <= 0) {
                                void v1 = a2;
                                v1.K.J(v1.K.J, (Mda)null);
                            }
                            return vRa.d != 0;
                        }
                    }
                    if (!xfa_33.f((Gl)a2) || xfa_33.j.e || xfa_33.f((Mda)b2)) break block15;
                    xfa_33.I.J((!xfa_33.v() ? vRa.d : uSa.E) != 0);
                    xfa_3 xfa_34 = xfa_33;
                    xfa_34.ja = uSa.E;
                    xfa_34.e.f();
                    xfa_34.C((Gl)null);
                    xfa_32 = xfa_33;
                    break block16;
                }
                if (b2 != null && b2.J() == Gea.Ya && !xfa_33.Fa()) {
                    if (!a2.h.f()) {
                        ((Mda)b2).E -= vRa.d;
                    }
                    if (((Mda)b2).E <= 0) {
                        void v4 = a2;
                        v4.K.J(v4.K.J, (Mda)null);
                    }
                    if (!xfa_33.j.e) {
                        xfa_3 xfa_35 = xfa_33;
                        if (xfa_33.R.nextInt(yRa.d) == 0) {
                            xfa_35.F(vRa.d != 0);
                            xfa_3 xfa_36 = xfa_33;
                            xfa_36.e.f();
                            xfa_36.C((Gl)null);
                            xfa_3 xfa_37 = xfa_33;
                            xfa_3 xfa_38 = xfa_33;
                            xfa_33.I.J(vRa.d != 0);
                            xfa_38.A(eta.e);
                            xfa_37.f(a2.J().toString());
                            xfa_38.j(vRa.d != 0);
                            xfa_37.j.J((vL)xfa_33, (byte)XTa.W);
                        } else {
                            xfa_35.j(uSa.E != 0);
                            xfa_33.j.J((vL)xfa_33, (byte)uua.p);
                        }
                    }
                    return vRa.d != 0;
                }
            }
            xfa_32 = xfa_33;
        }
        return super.J((Sx)a2);
    }

    public boolean Fa() {
        xfa_3 a2;
        if ((a2.aa.J(ERa.C) & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float C(float f2) {
        xfa_3 a2;
        float b2 = f2;
        xfa_3 xfa_32 = a2 = this;
        return wOa.w + (xfa_32.g + (xfa_32.J - a2.g) * b2) / kta.v * rta.o;
    }

    public void F(boolean bl2) {
        xfa_3 xfa_32;
        boolean b2 = bl2;
        xfa_3 a2 = this;
        boolean bl3 = b2;
        super.F(bl3);
        if (bl3) {
            xfa_3 xfa_33 = a2;
            xfa_32 = xfa_33;
            xfa_33.J(Kha.M).J(vQa.c);
        } else {
            xfa_3 xfa_34 = a2;
            xfa_32 = xfa_34;
            xfa_34.J(Kha.M).J(Wqa.Z);
        }
        xfa_32.J(Kha.A).J(FPa.T);
    }

    public float l(float f2) {
        xfa_3 a2;
        float b2 = f2;
        xfa_3 xfa_32 = a2 = this;
        return (xfa_32.C + (xfa_32.A - a2.C) * b2) * VPa.i * pua.j;
    }

    public void r() {
        xfa_3 a2;
        a2.aa.J(yOa.B, Float.valueOf(a2.f()));
    }

    public void d() {
        xfa_3 xfa_32;
        xfa_3 xfa_33;
        xfa_3 xfa_34 = xfa_33 = this;
        super.d();
        xfa_34.C = xfa_34.A;
        if (xfa_34.ca()) {
            xfa_3 xfa_35 = xfa_33;
            xfa_32 = xfa_35;
            xfa_35.A += (pqa.r - xfa_33.A) * Xpa.R;
        } else {
            xfa_3 xfa_36 = xfa_33;
            xfa_32 = xfa_36;
            xfa_36.A += (JPa.N - xfa_33.A) * Xpa.R;
        }
        if (xfa_32.M()) {
            xfa_3 xfa_37 = xfa_33;
            xfa_37.m = vRa.d;
            xfa_37.j = uSa.E;
            xfa_37.J = JPa.N;
            xfa_37.g = JPa.N;
            return;
        }
        if ((xfa_33.m || xfa_33.j) && xfa_33.j) {
            if (xfa_33.J == JPa.N) {
                xfa_3 xfa_38 = xfa_33;
                xfa_38.J(Gta.Aa, xfa_33.G(), (xfa_38.R.nextFloat() - xfa_33.R.nextFloat()) * psa.N + pqa.r);
            }
            xfa_3 xfa_39 = xfa_33;
            xfa_39.g = xfa_39.J;
            xfa_39.J += Yqa.C;
            if (xfa_39.g >= kta.v) {
                xfa_3 xfa_310 = xfa_33;
                xfa_310.m = uSa.E;
                xfa_310.j = uSa.E;
                xfa_310.g = JPa.N;
                xfa_310.J = JPa.N;
            }
            if (xfa_33.J > Xpa.R) {
                int n2;
                xfa_3 xfa_311 = xfa_33;
                float f2 = (float)xfa_311.J().j;
                int n3 = (int)(Oz.d((float)((xfa_311.J - Xpa.R) * pua.j)) * BRa.k);
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    xfa_3 xfa_312 = xfa_33;
                    xfa_3 xfa_313 = xfa_33;
                    float f3 = (xfa_312.R.nextFloat() * kta.v - pqa.r) * xfa_313.F * MQa.L;
                    float a2 = (xfa_312.R.nextFloat() * kta.v - pqa.r) * xfa_33.F * MQa.L;
                    int n5 = --1;
                    xfa_313.j.J(UZ.WATER_SPLASH, xfa_33.la + (double)f3, (double)(f2 + xSa.la), (double)(xfa_33.A + (double)a2), xfa_33.i, xfa_33.Ea, xfa_33.f, new int[uSa.E]);
                    n4 = ++n2;
                }
            }
        }
    }

    public boolean r() {
        xfa_3 a2;
        if (!a2.Fa() && super.r()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean C(vL vL2) {
        void a2;
        xfa_3 xfa_32 = this;
        boolean b2 = a2.J(gZ.J((Gl)xfa_32), (float)((int)xfa_32.J(Kha.A).f()));
        if (b2) {
            xfa_3 xfa_33 = xfa_32;
            xfa_33.J((Gl)xfa_33, (vL)a2);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        void b2;
        xfa_3 xfa_32 = this;
        if (xfa_32.J((gZ)b2)) {
            return uSa.E != 0;
        }
        xfa_3 c2 = b2.f();
        xfa_32.I.J(uSa.E != 0);
        if (c2 != null && !(c2 instanceof Sx) && !(c2 instanceof jea)) {
            a2 = (a2 + pqa.r) / kta.v;
        }
        return super.J((gZ)b2, (float)a2);
    }

    public int D() {
        return Yqa.i;
    }

    public xfa J(wEa wEa2) {
        xfa_3 xfa_32 = this;
        xfa_3 a2 = new xfa_3((Gg)xfa_32.j);
        String b2 = xfa_32.l();
        if (b2 != null && b2.trim().length() > 0) {
            xfa_3 xfa_33 = a2;
            xfa_33.f(b2);
            xfa_33.F(vRa.d != 0);
        }
        return a2;
    }

    public void J(Waa waa2) {
        xfa_3 b2 = waa2;
        xfa_3 a2 = this;
        xfa_3 xfa_32 = b2;
        super.J((Waa)b2);
        a2.H(xfa_32.f(ysa.G));
        if (xfa_32.J(Cta.S, zOa.v)) {
            a2.J(iea.byDyeDamage((int)b2.J(Cta.S)));
        }
    }

    public String f() {
        return ySa.s;
    }

    public void J(iea iea2) {
        xfa_3 b2 = iea2;
        xfa_3 a2 = this;
        a2.aa.J(kTa.j, Byte.valueOf((byte)(b2.getDyeDamage() & Ypa.A)));
    }

    public xfa_3(Gg gg2) {
        xfa_3 a2;
        xfa_3 b2 = gg2;
        xfa_3 xfa_32 = a2 = this;
        super((Gg)b2);
        xfa_32.l(xfa_3.d(), xSa.la);
        ((Hba)xfa_32.J()).J(vRa.d != 0);
        xfa_3 xfa_33 = a2;
        xfa_33.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        xfa_3 xfa_34 = a2;
        xfa_33.D.J(uqa.g, (gFa)xfa_34.I);
        xfa_34.D.J(yRa.d, (gFa)new Qga((Yfa)a2, Xpa.R));
        xfa_33.D.J(AQa.P, (gFa)new ADa((bga)((Object)a2), oua.i, vRa.d != 0));
        xfa_33.D.J(tTa.h, (gFa)new rGa((vfa)a2, oua.i, FRa.Ga, kta.v));
        xfa_33.D.J(uua.p, (gFa)new Pia((fEa)a2, oua.i));
        xfa_33.D.J(XTa.W, (gFa)new HDa((bga)((Object)a2), oua.i));
        xfa_33.D.J(Yqa.i, (gFa)new sGa((xfa)a2, Qsa.k));
        xfa_33.D.J(WOa.fa, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        xfa_33.D.J(WOa.fa, (gFa)new SIa((Yfa)a2));
        xfa_33.L.J(vRa.d, (gFa)new Pha((vfa)a2));
        xfa_33.L.J(uqa.g, (gFa)new vIa((vfa)a2));
        xfa_33.L.J(yRa.d, (gFa)new IFa((bga)((Object)a2), vRa.d != 0, new Class[uSa.E]));
        xfa_3 xfa_35 = a2;
        xfa_35.L.J(AQa.P, (gFa)new ria((vfa)a2, fEa.class, uSa.E != 0, (Predicate)new hea((xfa)a2)));
        xfa_35.L.J(tTa.h, (gFa)new NEa((bga)((Object)a2), lEa.class, uSa.E != 0));
        xfa_35.F(uSa.E != 0);
    }

    public void g(boolean bl2) {
        boolean b2 = bl2;
        xfa_3 a2 = this;
        if (b2) {
            a2.aa.J(wOa.t, Byte.valueOf((byte)vRa.d));
            return;
        }
        a2.aa.J(wOa.t, Byte.valueOf((byte)uSa.E));
    }

    public float l() {
        xfa_3 a2;
        return a2.u * xSa.la;
    }

    public boolean J(fEa fEa2) {
        xfa_3 b2 = fEa2;
        xfa_3 a2 = this;
        if (b2 == a2) {
            return uSa.E != 0;
        }
        if (!a2.ba()) {
            return uSa.E != 0;
        }
        if (!(b2 instanceof xfa_3)) {
            return uSa.E != 0;
        }
        if (!b2.ba()) {
            return uSa.E != 0;
        }
        if (b2.v()) {
            return uSa.E != 0;
        }
        if (a2.O() && b2.O()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void s() {
        xfa_3 xfa_32;
        xfa_3 a2;
        xfa_3 xfa_33 = a2;
        super.s();
        xfa_33.J(Kha.j).J(osa.b);
        if (xfa_33.ba()) {
            xfa_3 xfa_34 = a2;
            xfa_32 = xfa_34;
            xfa_34.J(Kha.M).J(vQa.c);
        } else {
            xfa_3 xfa_35 = a2;
            xfa_32 = xfa_35;
            xfa_35.J(Kha.M).J(Wqa.Z);
        }
        xfa_32.J().J(Kha.A);
        a2.J(Kha.A).J(KPa.y);
    }

    public void y() {
        xfa_3 a2;
        xfa_3 xfa_32 = a2;
        super.y();
        if (!xfa_32.j.e && a2.m && !a2.j && !a2.X() && a2.ha) {
            a2.j = vRa.d;
            a2.J = JPa.N;
            a2.g = JPa.N;
            a2.j.J((vL)a2, (byte)Yqa.i);
        }
        if (!a2.j.e && a2.C() == null && a2.Fa()) {
            a2.H(uSa.E != 0);
        }
    }
}

