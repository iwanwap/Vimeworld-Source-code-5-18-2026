/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Hba
 *  JPa
 *  MEa
 *  Mda
 *  OIa
 *  SIa
 *  Waa
 *  XTa
 *  Yfa
 *  Yra
 *  aX
 *  bpa
 *  cEa
 *  eAa
 *  fEa
 *  gFa
 *  lqa
 *  nHa
 *  oHa
 *  pqa
 *  vL
 *  vPa
 *  vRa
 *  wEa
 *  xGa
 *  zda
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zda_2
extends fEa {
    private final xGa I;

    public void s() {
        zda_2 a2;
        zda_2 zda_22 = a2;
        super.s();
        zda_22.J(Kha.M).J(Wqa.m);
        zda_22.J(Kha.j).J(VPa.W);
    }

    public zda_2(Gg gg2) {
        zda_2 a2;
        zda_2 b2 = gg2;
        zda_2 zda_22 = a2 = this;
        super((Gg)b2);
        zda_22.l(ATa.r, ATa.r);
        ((Hba)zda_22.J()).J(vRa.d != 0);
        zda_2 zda_23 = a2;
        zda_23.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        zda_23.D.J(vRa.d, (gFa)new nfa((bga)((Object)a2), Qpa.Aa));
        zda_2 zda_24 = a2;
        a2.I = new xGa((Yfa)a2, bpa.K);
        zda_23.D.J(uqa.g, (gFa)a2.I);
        zda_2 zda_25 = a2;
        zda_25.D.J(yRa.d, (gFa)new Pia(a2, oua.i));
        zda_25.D.J(AQa.P, (gFa)new OIa((bga)((Object)a2), JPa.ja, Gea.md, uSa.E != 0));
        zda_25.D.J(AQa.P, (gFa)new OIa((bga)((Object)a2), JPa.ja, Gea.EB, uSa.E != 0));
        zda_25.D.J(tTa.h, (gFa)new AIa(a2, Yra.f));
        zda_25.D.J(uua.p, (gFa)new HDa((bga)((Object)a2), oua.i));
        zda_25.D.J(XTa.W, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        zda_25.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
    }

    public boolean v() {
        zda_2 a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f(Mda mda2) {
        zda_2 b2 = mda2;
        zda_2 a2 = this;
        if (b2 != null && b2.J() == Gea.EB) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String i() {
        return Hra.P;
    }

    public void J(XF xF, Block block) {
        Object c2 = block;
        zda_2 a2 = this;
        a2.J(ypa.e, VPa.i, pqa.r);
    }

    public xGa J() {
        zda_2 a2;
        return a2.I;
    }

    public boolean x() {
        zda_2 zda_22 = this;
        zda_2 a2 = ((Sx)zda_22.Aa).J();
        if (a2 != null && a2.J() == Gea.md) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        zda_2 a2 = this;
        int b2 = a2.R.nextInt(yRa.d) + vRa.d + a2.R.nextInt(vRa.d + c2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            if (a2.o()) {
                a2.J(Gea.kd, vRa.d);
            } else {
                a2.J(Gea.fa, vRa.d);
            }
            n3 = ++c2;
        }
        if (a2.v()) {
            a2.J(Gea.NA, vRa.d);
        }
    }

    public void J(Waa waa2) {
        zda_2 a2;
        zda_2 b2 = waa2;
        zda_2 zda_22 = a2 = this;
        super.J((Waa)b2);
        zda_22.F(b2.f(rta.d));
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        void b2;
        float c2 = f3;
        zda_2 a2 = this;
        void v0 = b2;
        super.f((float)v0, c2);
        if (v0 > eua.C && a2.Aa instanceof Sx) {
            ((Sx)a2.Aa).J((aX)mY.e);
        }
    }

    public boolean J(Sx sx2) {
        zda_2 a2 = this;
        Object b2 = sx2;
        if (super.J((Sx)((Object)b2))) {
            return vRa.d != 0;
        }
        if (!a2.v() || a2.j.e || a2.Aa != null && a2.Aa != b2) {
            return uSa.E != 0;
        }
        b2.l((vL)a2);
        return vRa.d != 0;
    }

    public String A() {
        return vPa.J;
    }

    public void J(cEa cEa2) {
        zda_2 b2 = cEa2;
        zda_2 a2 = this;
        if (!a2.j.e && !a2.J) {
            b2 = new MEa(a2.j);
            zda_2 zda_22 = a2;
            zda_2 zda_23 = b2;
            zda_23.f(uSa.E, new Mda(Gea.sa));
            zda_2 zda_24 = a2;
            zda_23.f(a2.la, a2.Z, a2.A, zda_24.X, zda_24.d);
            b2.G(zda_22.t());
            if (zda_22.J()) {
                zda_2 zda_25 = b2;
                zda_25.J(a2.e());
                zda_25.f(a2.a());
            }
            a2.j.f((vL)b2);
            a2.k();
        }
    }

    public void J() {
        zda_2 a2;
        zda_2 zda_22 = a2;
        super.J();
        zda_22.aa.f(ERa.C, (byte)uSa.E);
    }

    public String f() {
        return vPa.J;
    }

    public void f(Waa waa2) {
        zda_2 b2 = waa2;
        zda_2 a2 = this;
        zda_2 zda_22 = b2;
        super.f((Waa)zda_22);
        zda_22.J(rta.d, a2.v());
    }

    public void F(boolean bl) {
        boolean b2 = bl;
        zda_2 a2 = this;
        if (b2) {
            a2.aa.J(ERa.C, Byte.valueOf((byte)vRa.d));
            return;
        }
        a2.aa.J(ERa.C, Byte.valueOf((byte)uSa.E));
    }

    public eAa J() {
        zda_2 a2;
        if (a2.o()) {
            return Gea.kd;
        }
        return Gea.fa;
    }

    public zda J(wEa wEa2) {
        zda_2 b2 = wEa2;
        zda_2 a2 = this;
        return new zda_2(a2.j);
    }
}

