/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  ERa
 *  Faa
 *  Gg
 *  Gl
 *  JPa
 *  Jy
 *  KZ
 *  MQa
 *  NTa
 *  Oz
 *  Qta
 *  RPa
 *  UZ
 *  Ufa
 *  Vua
 *  Waa
 *  Wea
 *  YSa
 *  Yfa
 *  ZRa
 *  aSa
 *  cga
 *  eAa
 *  fpa
 *  gFa
 *  gZ
 *  kta
 *  oA
 *  pqa
 *  psa
 *  pua
 *  rfa
 *  uga
 *  vL
 *  vPa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cga_3
extends Yfa
implements WC {
    public float C;
    private boolean j;
    public float J;
    public float A;

    public void J() {
        cga_3 a2;
        cga_3 cga_32 = a2;
        super.J();
        cga_32.aa.f(ERa.C, (byte)vRa.d);
    }

    public int H() {
        cga_3 a2;
        return a2.aa.J(ERa.C);
    }

    public void D(int n2) {
        cga_3 a2;
        int b2 = n2;
        cga_3 cga_32 = a2 = this;
        cga_3 cga_33 = a2;
        cga_33.aa.J(ERa.C, Byte.valueOf((byte)b2));
        cga_33.l(Vua.z * (float)b2, Vua.z * (float)b2);
        cga_33.l(cga_33.la, a2.Z, a2.A);
        int n3 = b2;
        cga_33.J(Kha.M).J((double)(n3 * n3));
        cga_33.J(Kha.j).J(psa.N + Nra.e * (float)b2);
        cga_32.A(cga_32.J());
        cga_32.A = b2;
    }

    public boolean w() {
        cga_3 cga_32 = this;
        Object a2 = new XF(Oz.f((double)cga_32.la), uSa.E, Oz.f((double)cga_32.A));
        cga_3 cga_33 = cga_32;
        Faa faa2 = cga_33.j.J((XF)((Object)a2));
        if (cga_33.j.J().J() == Fy.k && cga_32.R.nextInt(AQa.P) != vRa.d) {
            return uSa.E != 0;
        }
        if (cga_32.j.J() != sZ.PEACEFUL) {
            if (cga_32.j.J((XF)((Object)a2)) == Jy.g && cga_32.Z > ZRa.r && cga_32.Z < Qta.h && cga_32.R.nextFloat() < MQa.L && cga_32.R.nextFloat() < cga_32.j.J() && cga_32.j.C(new XF((vL)cga_32)) <= cga_32.R.nextInt(Yqa.i)) {
                return super.w();
            }
            if (cga_32.R.nextInt(NTa.C) == 0 && faa2.J(MTa.k).nextInt(NTa.C) == 0 && cga_32.Z < ITa.a) {
                return super.w();
            }
        }
        return uSa.E != 0;
    }

    public cga J() {
        cga_3 a2;
        return new cga_3((Gg)a2.j);
    }

    public void d(Gl gl2) {
        cga_3 a2;
        cga_3 b2 = gl2;
        cga_3 cga_32 = a2 = this;
        int n2 = cga_32.H();
        if (cga_32.l((vL)b2) && a2.J((vL)b2) < oQa.fa * (double)n2 * oQa.fa * (double)n2 && b2.J(gZ.J((Gl)a2), a2.I())) {
            cga_3 cga_33 = a2;
            cga_33.J(ZRa.L, pqa.r, (a2.R.nextFloat() - a2.R.nextFloat()) * psa.N + pqa.r);
            cga_33.J((Gl)cga_33, (vL)b2);
        }
    }

    public void W() {
        a.A *= Ora.D;
    }

    public String l() {
        cga_3 a2;
        return new StringBuilder().insert(3 & 4, dsa.T).append(a2.H() > vRa.d ? fpa.z : iSa.Ka).toString();
    }

    public String f() {
        cga_3 a2;
        return new StringBuilder().insert(3 & 4, dsa.T).append(a2.H() > vRa.d ? fpa.z : iSa.Ka).toString();
    }

    public void C(Sx sx2) {
        Object b2 = sx2;
        cga_3 a2 = this;
        if (a2.X()) {
            a2.d((Gl)b2);
        }
    }

    public void d() {
        cga_3 cga_32;
        cga_3 cga_33 = this;
        if (!cga_33.j.e && cga_33.j.J() == sZ.PEACEFUL && cga_33.H() > 0) {
            cga_33.J = vRa.d;
        }
        cga_3 cga_34 = cga_33;
        cga_3 cga_35 = cga_33;
        cga_34.C += (cga_35.A - cga_33.C) * MQa.L;
        cga_34.J = cga_35.C;
        super.d();
        if (cga_34.ha && !cga_33.j) {
            int n2;
            int n3 = cga_33.H();
            int n4 = n2 = uSa.E;
            while (n4 < n3 * Yqa.i) {
                cga_3 cga_36 = cga_33;
                float a2 = cga_36.R.nextFloat() * pua.j * kta.v;
                float f2 = cga_36.R.nextFloat() * MQa.L + MQa.L;
                float f3 = Oz.d((float)a2) * (float)n3 * MQa.L * f2;
                a2 = Oz.C((float)a2) * (float)n3 * MQa.L * f2;
                boolean bl = cga_36.j;
                UZ uZ = cga_36.J();
                double d2 = cga_36.la + (double)f3;
                float f4 = cga_36.A + (double)a2;
                int n5 = 4 ^ 5;
                bl.J(uZ, d2, cga_33.J().j, (double)f4, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n4 = ++n2;
            }
            if (cga_33.T()) {
                cga_3 cga_37 = cga_33;
                cga_37.J(cga_33.l(), cga_33.G(), ((cga_37.R.nextFloat() - cga_33.R.nextFloat()) * psa.N + pqa.r) / xSa.la);
            }
            cga_32 = cga_33;
            cga_33.A = vPa.b;
        } else {
            if (!cga_33.ha && cga_33.j) {
                cga_33.A = pqa.r;
            }
            cga_32 = cga_33;
        }
        cga_32.j = cga_33.ha;
        cga_33.W();
    }

    public int g() {
        cga_3 a2;
        return a2.R.nextInt(kTa.j) + NTa.C;
    }

    public void q() {
        cga_3 a2;
        a2.J(IPa.s);
        a2.t = vRa.d;
    }

    public float l() {
        cga_3 a2;
        return Jpa.y * a2.u;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        void a2;
        cga_3 cga_32 = this;
        void v0 = a2;
        super.J((Waa)v0);
        int b2 = v0.J(Upa.K);
        if (b2 < 0) {
            b2 = uSa.E;
        }
        cga_32.D(b2 + vRa.d);
        cga_32.j = a2.f(RPa.I);
    }

    public void k() {
        cga_3 cga_32;
        cga_3 cga_33 = cga_32 = this;
        int n2 = cga_33.H();
        if (!cga_33.j.e && n2 > vRa.d && cga_32.f() <= JPa.N) {
            int n3;
            int n4 = uqa.g + cga_32.R.nextInt(yRa.d);
            int n5 = n3 = uSa.E;
            while (n5 < n4) {
                float f2 = ((float)(n3 % uqa.g) - MQa.L) * (float)n2 / YSa.G;
                float f3 = ((float)(n3 / uqa.g) - MQa.L) * (float)n2 / YSa.G;
                cga_3 cga_34 = cga_32;
                cga_3 a2 = cga_34.J();
                if (cga_34.J()) {
                    a2.J(cga_32.e());
                }
                if (cga_32.Q()) {
                    a2.t();
                }
                a2.D(n2 / uqa.g);
                a2.f(cga_32.la + (double)f2, cga_32.Z + kTa.B, cga_32.A + (double)f3, cga_32.R.nextFloat() * CRa.ja, JPa.N);
                cga_32.j.f((vL)a2);
                n5 = ++n3;
            }
        }
        super.k();
    }

    public UZ J() {
        return UZ.SLIME;
    }

    public boolean T() {
        cga_3 a2;
        if (a2.H() > uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean X() {
        cga_3 a2;
        if (a2.H() > vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(vL vL2) {
        cga_3 b2 = vL2;
        cga_3 a2 = this;
        cga_3 cga_32 = b2;
        super.J((vL)cga_32);
        if (cga_32 instanceof DDa && a2.X()) {
            a2.d((Gl)b2);
        }
    }

    public boolean V() {
        cga_3 a2;
        if (a2.H() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(Waa waa2) {
        cga_3 b2 = waa2;
        cga_3 a2 = this;
        cga_3 cga_32 = b2;
        super.f((Waa)cga_32);
        cga_32.J(Upa.K, a2.H() - vRa.d);
        cga_32.J(RPa.I, a2.j);
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ2, oA oA2) {
        void a2;
        void b2;
        cga_3 cga_32 = this;
        int c2 = cga_32.R.nextInt(yRa.d);
        if (c2 < uqa.g && cga_32.R.nextFloat() < MQa.L * b2.f()) {
            ++c2;
        }
        c2 = vRa.d << c2;
        cga_3 cga_33 = cga_32;
        cga_33.D(c2);
        return super.J((KZ)b2, (oA)a2);
    }

    public cga_3(Gg gg2) {
        cga_3 a2;
        cga_3 b2 = gg2;
        cga_3 cga_32 = a2 = this;
        super((Gg)b2);
        cga_32.b = new wea((cga)a2);
        a2.D.J(vRa.d, (gFa)new Wea((cga)a2));
        cga_32.D.J(uqa.g, (gFa)new bEa((cga)a2));
        cga_32.D.J(yRa.d, (gFa)new Ufa((cga)a2));
        cga_32.D.J(tTa.h, (gFa)new rfa((cga)a2));
        cga_32.L.J(vRa.d, (gFa)new uga((Yfa)a2));
        cga_32.L.J(yRa.d, (gFa)new JGa(a2, DDa.class));
    }

    /*
     * WARNING - void declaration
     */
    public void d(int n2) {
        void a2;
        cga_3 cga_32 = this;
        if (a2 == ERa.C) {
            cga_3 cga_33 = cga_32;
            int b2 = cga_33.H();
            cga_33.l(Vua.z * (float)b2, Vua.z * (float)b2);
            cga_33.X = cga_33.t;
            cga_33.ba = cga_33.t;
            if (cga_33.L() && cga_32.R.nextInt(kTa.j) == 0) {
                cga_32.H();
            }
        }
        super.d((int)a2);
    }

    public String i() {
        cga_3 a2;
        return new StringBuilder().insert(3 >> 2, dsa.T).append(a2.H() > vRa.d ? fpa.z : iSa.Ka).toString();
    }

    public eAa J() {
        cga_3 a2;
        if (a2.H() == vRa.d) {
            return Gea.ua;
        }
        return null;
    }

    public int F() {
        return uSa.E;
    }

    public float G() {
        cga_3 a2;
        return Xpa.R * (float)a2.H();
    }

    public int I() {
        cga_3 a2;
        return a2.H();
    }
}

