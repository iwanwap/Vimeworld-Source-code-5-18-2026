/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Gl
 *  Gua
 *  MQa
 *  NEa
 *  NTa
 *  Qia
 *  Qsa
 *  SIa
 *  UZ
 *  XTa
 *  YSa
 *  Yfa
 *  aSa
 *  bpa
 *  eAa
 *  gFa
 *  gZ
 *  lPa
 *  nHa
 *  pqa
 *  vQa
 *  vRa
 *  zea
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Zfa
extends hFa {
    private int k;
    private float A;

    public boolean o() {
        Zfa a2;
        return a2.v();
    }

    @Override
    public void y() {
        Zfa zfa = this;
        if (!zfa.ha && zfa.Ea < aSa.V) {
            Zfa zfa2 = zfa;
            zfa2.J(zfa2.Ea * oQa.fa);
        }
        if (zfa.j.e) {
            int a2;
            if (zfa.R.nextInt(osa.c) == 0 && !zfa.c()) {
                Zfa zfa3 = zfa;
                zfa3.j.J(zfa3.la + kTa.B, zfa.Z + kTa.B, (double)(zfa.A + kTa.B), KSa.Ka, pqa.r + zfa.R.nextFloat(), zfa.R.nextFloat() * ZSa.q + bpa.K, uSa.E != 0);
            }
            int n2 = a2 = uSa.E;
            while (n2 < uqa.g) {
                int n3 = 3 & 5;
                zfa.j.J(UZ.SMOKE_LARGE, zfa.la + (zfa.R.nextDouble() - kTa.B) * (double)zfa.F, zfa.Z + zfa.R.nextDouble() * (double)zfa.u, (double)(zfa.A + (zfa.R.nextDouble() - kTa.B) * (double)zfa.F), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n2 = ++a2;
            }
        }
        super.y();
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        Zfa zfa = this;
    }

    @Override
    public boolean O() {
        return vRa.d != 0;
    }

    @Override
    public void s() {
        Zfa a2;
        Zfa zfa = a2;
        super.s();
        zfa.J(Kha.A).J(lPa.K);
        zfa.J(Kha.j).J(Qpa.o);
        zfa.J(Kha.I).J(CRa.N);
    }

    public int J(float f2) {
        float b2 = f2;
        Zfa a2 = this;
        return YSa.L;
    }

    public void J(boolean bl, int n2) {
        int b2;
        int c2 = n2;
        Zfa a2 = this;
        if (b2 != 0) {
            b2 = a2.R.nextInt(uqa.g + c2);
            int n3 = c2 = uSa.E;
            while (n3 < b2) {
                a2.J(Gea.q, vRa.d);
                n3 = ++c2;
            }
        }
    }

    public void J() {
        Zfa a2;
        Zfa zfa = a2;
        super.J();
        zfa.aa.f(ERa.C, new Byte((byte)uSa.E));
    }

    @Override
    public String f() {
        return Gua.D;
    }

    public void r() {
        Zfa a2;
        Zfa zfa = this;
        if (zfa.M()) {
            zfa.J(gZ.f, pqa.r);
        }
        Zfa zfa2 = zfa;
        zfa2.k -= vRa.d;
        if (zfa2.k <= 0) {
            zfa.k = ySa.T;
            zfa.A = MQa.L + (float)zfa.R.nextGaussian() * vQa.q;
        }
        if ((a2 = zfa.C()) != null && ((Gl)a2).Z + (double)a2.l() > zfa.Z + (double)zfa.l() + (double)zfa.A) {
            Zfa zfa3 = zfa;
            zfa3.J(zfa3.Ea + (osa.b - zfa.Ea) * osa.b);
            zfa3.t = vRa.d;
        }
        super.r();
    }

    public eAa J() {
        return Gea.q;
    }

    public boolean v() {
        Zfa a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String A() {
        return kTa.A;
    }

    public Zfa(Gg gg2) {
        Zfa a2;
        Zfa b2 = gg2;
        Zfa zfa = a2 = this;
        super((Gg)b2);
        zfa.A = MQa.L;
        zfa.z = vRa.d;
        zfa.A = NTa.C;
        zfa.D.J(AQa.P, (gFa)new zea(a2));
        zfa.D.J(tTa.h, (gFa)new Qia((bga)a2, oua.i));
        zfa.D.J(XTa.W, (gFa)new HDa(a2, oua.i));
        zfa.D.J(Yqa.i, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        zfa.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        zfa.L.J(vRa.d, (gFa)new IFa(a2, vRa.d != 0, new Class[uSa.E]));
        a2.L.J(uqa.g, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
    }

    /*
     * WARNING - void declaration
     */
    public void k(boolean bl) {
        Zfa zfa;
        void a2;
        Zfa zfa2 = this;
        byte b2 = zfa2.aa.J(ERa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | vRa.d);
            zfa = zfa2;
        } else {
            b2 = (byte)(b2 & rQa.p);
            zfa = zfa2;
        }
        zfa.aa.J(ERa.C, Byte.valueOf(b2));
    }

    public float J(float f2) {
        float b2 = f2;
        Zfa a2 = this;
        return pqa.r;
    }

    @Override
    public String i() {
        return nua.G;
    }
}

