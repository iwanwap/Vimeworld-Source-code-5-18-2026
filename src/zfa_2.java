/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  ERa
 *  GGa
 *  Gg
 *  Gl
 *  Gua
 *  JPa
 *  MQa
 *  Mda
 *  NEa
 *  ODa
 *  Qsa
 *  Qta
 *  SIa
 *  Waa
 *  Yfa
 *  cEa
 *  eAa
 *  gFa
 *  gZ
 *  kqa
 *  kta
 *  lEa
 *  lFa
 *  lqa
 *  nHa
 *  oHa
 *  pqa
 *  pua
 *  qta
 *  uRa
 *  vL
 *  vRa
 *  yra
 *  zfa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zfa_2
extends hFa {
    private int m;
    private int C;
    private int i;
    private int M;
    private int k;

    public boolean Fa() {
        zfa_2 a2;
        if (a2.i < vRa.d && a2.j.J().f(Gua.H)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void s() {
        zfa_2 a2;
        zfa_2 zfa_22 = a2;
        super.s();
        zfa_22.J(Kha.j).J(VPa.W);
    }

    public void J(Waa waa2) {
        zfa_2 a2;
        zfa_2 b2 = waa2;
        zfa_2 zfa_22 = a2 = this;
        super.J((Waa)b2);
        zfa_22.aa.J(yta.Ka, Byte.valueOf((byte)(b2.f(uRa.M) ? vRa.d : uSa.E)));
        if (b2.J(lQa.la, zOa.v)) {
            a2.M = b2.J(lQa.la);
        }
        if (b2.J(qta.e, zOa.v)) {
            a2.m = b2.J(qta.e);
        }
        if (b2.f(yra.S)) {
            a2.N();
        }
    }

    public eAa J() {
        return Gea.xB;
    }

    @Override
    public String i() {
        return Psa.w;
    }

    @Override
    public void d() {
        zfa_2 zfa_22 = this;
        if (zfa_22.K()) {
            int a2;
            zfa_2 zfa_23 = zfa_22;
            zfa_23.k = zfa_23.C;
            if (zfa_23.v()) {
                zfa_22.D(vRa.d);
            }
            if ((a2 = zfa_22.I()) > 0 && zfa_22.C == 0) {
                zfa_22.J(eta.d, pqa.r, MQa.L);
            }
            zfa_2 zfa_24 = zfa_22;
            zfa_24.C += a2;
            if (zfa_24.C < 0) {
                zfa_22.C = uSa.E;
            }
            zfa_2 zfa_25 = zfa_22;
            if (zfa_25.C >= zfa_25.M) {
                zfa_2 zfa_26 = zfa_22;
                zfa_26.C = zfa_26.M;
                zfa_26.V();
            }
        }
        super.d();
    }

    public void D(int n2) {
        int b2 = n2;
        zfa_2 a2 = this;
        a2.aa.J(ERa.C, Byte.valueOf((byte)b2));
    }

    public void f(Waa waa2) {
        zfa_2 a2;
        zfa_2 b2 = waa2;
        zfa_2 zfa_22 = a2 = this;
        super.f((Waa)b2);
        if (zfa_22.aa.J(yta.Ka) == vRa.d) {
            b2.J(uRa.M, vRa.d != 0);
        }
        zfa_2 zfa_23 = b2;
        zfa_23.J(lQa.la, (short)a2.M);
        zfa_23.J(qta.e, (byte)a2.m);
        zfa_23.J(yra.S, a2.v());
    }

    public int I() {
        zfa_2 a2;
        return a2.aa.J(ERa.C);
    }

    public zfa_2(Gg gg2) {
        zfa_2 a2;
        zfa_2 b2 = gg2;
        zfa_2 zfa_22 = a2 = this;
        super((Gg)b2);
        zfa_22.M = Fsa.d;
        zfa_22.m = yRa.d;
        zfa_22.i = uSa.E;
        zfa_22.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        zfa_22.D.J(uqa.g, (gFa)new GGa((zfa)a2));
        zfa_22.D.J(yRa.d, (gFa)new lFa((bga)a2, ODa.class, lqa.ga, oua.i, JPa.ja));
        zfa_22.D.J(AQa.P, (gFa)new ADa((bga)a2, oua.i, uSa.E != 0));
        zfa_22.D.J(tTa.h, (gFa)new HDa(a2, Jra.A));
        zfa_22.D.J(uua.p, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        zfa_22.D.J(uua.p, (gFa)new SIa((Yfa)a2));
        zfa_22.L.J(vRa.d, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
        zfa_22.L.J(uqa.g, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
    }

    public void J() {
        zfa_2 a2;
        zfa_2 zfa_22 = a2;
        super.J();
        zfa_22.aa.f(ERa.C, (byte)pua.o);
        zfa_22.aa.f(yta.Ka, (byte)uSa.E);
        zfa_22.aa.f(yOa.B, (byte)uSa.E);
    }

    public void X() {
        a.i += vRa.d;
    }

    public boolean ba() {
        zfa_2 a2;
        if (a2.aa.J(yta.Ka) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int A() {
        zfa_2 a2;
        if (a2.C() == null) {
            return yRa.d;
        }
        return yRa.d + (int)(a2.f() - pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        void a2;
        zfa_2 b2;
        float c2 = f2;
        zfa_2 zfa_22 = b2 = this;
        super.f(c2, (float)a2);
        zfa_22.C = (int)((float)zfa_22.C + c2 * Ira.d);
        if (zfa_22.C > b2.M - tTa.h) {
            b2.C = b2.M - tTa.h;
        }
    }

    private void V() {
        zfa_2 zfa_22 = this;
        if (!zfa_22.j.e) {
            zfa_2 zfa_23 = zfa_22;
            boolean bl2 = zfa_23.j.J().f(kqa.N);
            float a2 = zfa_23.ba() ? kta.v : pqa.r;
            zfa_2 zfa_24 = zfa_22;
            zfa_2 zfa_25 = zfa_22;
            zfa_24.j.J((vL)zfa_25, zfa_24.la, zfa_25.Z, zfa_22.A, (float)zfa_22.m * a2, bl2);
            zfa_22.k();
        }
    }

    public boolean v() {
        zfa_2 a2;
        if (a2.aa.J(yOa.B) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public String f() {
        return Qta.F;
    }

    public void N() {
        zfa_2 a2;
        a2.aa.J(yOa.B, Byte.valueOf((byte)vRa.d));
    }

    public void J(cEa cEa2) {
        zfa_2 a2;
        zfa_2 b2 = cEa2;
        zfa_2 zfa_22 = a2 = this;
        super.J((cEa)b2);
        zfa_22.aa.J(yta.Ka, Byte.valueOf((byte)vRa.d));
    }

    public float l(float f2) {
        zfa_2 a2;
        float b2 = f2;
        zfa_2 zfa_22 = a2 = this;
        return ((float)a2.k + (float)(zfa_22.C - zfa_22.k) * b2) / (float)(a2.M - uqa.g);
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        zfa_2 a2 = this;
        Mda mda2 = ((Sx)((Object)b2)).K.f();
        if (mda2 != null && mda2.J() == Gea.S) {
            zfa_2 zfa_22 = a2;
            a2.j.J(zfa_22.la + kTa.B, a2.Z + kTa.B, a2.A + kTa.B, osa.l, pqa.r, a2.R.nextFloat() * Xpa.R + xSa.la);
            b2.u();
            if (!zfa_22.j.e) {
                a2.N();
                mda2.J(vRa.d, (Gl)b2);
                return vRa.d != 0;
            }
        }
        return super.J((Sx)((Object)b2));
    }

    public void J(gZ gZ2) {
        zfa_2 b2 = gZ2;
        zfa_2 a2 = this;
        zfa_2 zfa_22 = b2;
        super.J((gZ)zfa_22);
        if (zfa_22.f() instanceof lEa) {
            int n2 = eAa.J((eAa)Gea.Va);
            int n3 = eAa.J((eAa)Gea.V);
            int n4 = n2;
            n2 = n4 + a2.R.nextInt(n3 - n4 + vRa.d);
            a2.J(eAa.l((int)n2), vRa.d);
            return;
        }
        if (b2.f() instanceof zfa_2 && b2.f() != a2 && ((zfa_2)b2.f()).ba() && ((zfa_2)b2.f()).Fa()) {
            ((zfa_2)b2.f()).X();
            a2.J(new Mda(Gea.GB, vRa.d, AQa.P), JPa.N);
        }
    }

    @Override
    public boolean C(vL vL2) {
        zfa_2 b2 = vL2;
        zfa_2 a2 = this;
        return vRa.d != 0;
    }
}

