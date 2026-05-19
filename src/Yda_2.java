/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  ERa
 *  Gg
 *  KDa
 *  Mea
 *  Qfa
 *  Waa
 *  XTa
 *  YSa
 *  Yda
 *  Yfa
 *  Zpa
 *  aX
 *  eAa
 *  eEa
 *  gFa
 *  gZ
 *  lqa
 *  uga
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Yda_2
extends KDa
implements WC {
    private int k;

    public void J(Waa waa2) {
        Yda_2 b2 = waa2;
        Yda_2 a2 = this;
        Yda_2 yda_2 = b2;
        super.J((Waa)yda_2);
        if (yda_2.J(UOa.Ha, zOa.v)) {
            a2.k = b2.J(UOa.Ha);
        }
    }

    public void d() {
        Yda_2 a2;
        Yda_2 yda_2 = a2;
        super.d();
        if (!yda_2.j.e && a2.j.J() == sZ.PEACEFUL) {
            a2.k();
        }
    }

    public int I() {
        Yda_2 a2;
        return a2.k;
    }

    public Yda_2(Gg gg2) {
        Yda_2 a2;
        Yda_2 b2 = gg2;
        Yda_2 yda_2 = a2 = this;
        super((Gg)b2);
        yda_2.k = vRa.d;
        yda_2.l(YSa.G, YSa.G);
        yda_2.z = vRa.d;
        yda_2.A = tTa.h;
        Yda_2 yda_22 = a2;
        yda_2.b = new Mea((Yda)a2);
        yda_2.D.J(tTa.h, (gFa)new Qfa((Yda)a2));
        yda_2.D.J(XTa.W, (gFa)new eEa((Yda)a2));
        yda_2.D.J(XTa.W, (gFa)new mfa((Yda)a2));
        yda_2.L.J(vRa.d, (gFa)new uga((Yfa)a2));
    }

    public void k(boolean bl) {
        boolean b2 = bl;
        Yda_2 a2 = this;
        a2.aa.J(ERa.C, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public String A() {
        return NSa.q;
    }

    public void s() {
        Yda_2 a2;
        Yda_2 yda_2 = a2;
        super.s();
        yda_2.J(Kha.M).J(Wqa.m);
        yda_2.J(Kha.I).J(fqa.W);
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        int c2;
        void a2;
        Yda_2 yda_2 = this;
        int b2 = yda_2.R.nextInt(uqa.g) + yda_2.R.nextInt(vRa.d + a2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            yda_2.J(Gea.pa, vRa.d);
            n3 = ++c2;
        }
        b2 = yda_2.R.nextInt(yRa.d) + yda_2.R.nextInt(vRa.d + a2);
        int n4 = c2 = uSa.E;
        while (n4 < b2) {
            yda_2.J(Gea.xB, vRa.d);
            n4 = ++c2;
        }
    }

    public String i() {
        return lqa.Ka;
    }

    public void f(Waa waa2) {
        Yda_2 b2 = waa2;
        Yda_2 a2 = this;
        Yda_2 yda_2 = b2;
        super.f((Waa)yda_2);
        yda_2.J(UOa.Ha, a2.k);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        Yda_2 b2 = this;
        Yda_2 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (Ata.W.equals(c2.J()) && c2.f() instanceof Sx) {
            Yda_2 yda_2 = c2;
            super.J((gZ)yda_2, Jpa.r);
            ((Sx)yda_2.f()).J((aX)mY.c);
            return vRa.d != 0;
        }
        return super.J((gZ)c2, (float)a2);
    }

    public float l() {
        return Zpa.o;
    }

    public boolean w() {
        Yda_2 a2;
        if (a2.R.nextInt(kTa.j) == 0 && super.w() && a2.j.J() != sZ.PEACEFUL) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int D() {
        return vRa.d;
    }

    public String f() {
        return sra.Ka;
    }

    public boolean V() {
        Yda_2 a2;
        if (a2.aa.J(ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float G() {
        return FRa.Ga;
    }

    public void J() {
        Yda_2 a2;
        Yda_2 yda_2 = a2;
        super.J();
        yda_2.aa.f(ERa.C, (byte)uSa.E);
    }

    public eAa J() {
        return Gea.xB;
    }
}

