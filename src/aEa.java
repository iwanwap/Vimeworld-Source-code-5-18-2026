/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  Gl
 *  JPa
 *  MQa
 *  Mda
 *  NTa
 *  OIa
 *  Oz
 *  SIa
 *  Waa
 *  XTa
 *  Yfa
 *  Yra
 *  aQa
 *  aSa
 *  bua
 *  eAa
 *  fEa
 *  gFa
 *  kta
 *  lqa
 *  nHa
 *  oHa
 *  pqa
 *  psa
 *  pua
 *  vPa
 *  vRa
 *  wEa
 */
import net.minecraft.block.Block;

public final class aEa
extends fEa {
    public int D;
    public boolean E;
    public float m;
    public float C;
    public float j;
    public float J;
    public float A;

    public boolean v() {
        aEa a2;
        return a2.E;
    }

    public void s() {
        aEa a2;
        aEa aEa2 = a2;
        super.s();
        aEa2.J(Kha.M).J(FPa.T);
        aEa2.J(Kha.j).J(VPa.W);
    }

    public String i() {
        return bua.fa;
    }

    public int J(Sx sx2) {
        Object b2 = sx2;
        aEa a2 = this;
        if (a2.v()) {
            return NTa.C;
        }
        return super.J((Sx)((Object)b2));
    }

    public boolean f(Mda mda2) {
        aEa b2 = mda2;
        aEa a2 = this;
        if (b2 != null && b2.J() == Gea.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void F(boolean bl) {
        boolean b2 = bl;
        aEa a2 = this;
        a2.E = b2;
    }

    public void M() {
        aEa aEa2;
        aEa aEa3 = aEa2 = this;
        super.M();
        float f2 = Oz.d((float)(aEa3.ba * pua.j / Hra.Ga));
        float f3 = Oz.C((float)(aEa3.ba * pua.j / Hra.Ga));
        float a2 = Nra.e;
        float f4 = JPa.N;
        aEa3.Aa.l(aEa2.la + (double)(a2 * f2), aEa2.Z + (double)(aEa2.u * MQa.L) + aEa2.Aa.C() + (double)f4, (double)(aEa2.A - (double)(a2 * f3)));
        if (aEa3.Aa instanceof Gl) {
            ((Gl)aEa2.Aa).ba = aEa2.ba;
        }
    }

    public boolean n() {
        aEa a2;
        if (a2.v() && a2.Aa == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public aEa(Gg gg2) {
        aEa a2;
        aEa b2 = gg2;
        aEa aEa2 = a2 = this;
        super((Gg)b2);
        aEa2.m = pqa.r;
        aEa2.l(Xpa.R, ZSa.q);
        aEa2.D = aEa2.R.nextInt(MTa.g) + MTa.g;
        aEa2.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        aEa2.D.J(vRa.d, (gFa)new nfa((bga)((Object)a2), qQa.V));
        aEa2.D.J(uqa.g, (gFa)new Pia(a2, oua.i));
        aEa2.D.J(yRa.d, (gFa)new OIa((bga)((Object)a2), oua.i, Gea.o, uSa.E != 0));
        aEa2.D.J(AQa.P, (gFa)new AIa(a2, Yra.f));
        aEa2.D.J(tTa.h, (gFa)new HDa((bga)((Object)a2), oua.i));
        aEa2.D.J(uua.p, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        aEa2.D.J(XTa.W, (gFa)new SIa((Yfa)a2));
    }

    public void J(XF xF2, Block block) {
        Object c2 = block;
        aEa a2 = this;
        a2.J(BPa.G, VPa.i, pqa.r);
    }

    public aEa J(wEa wEa2) {
        aEa b2 = wEa2;
        aEa a2 = this;
        return new aEa((Gg)a2.j);
    }

    public float l() {
        aEa a2;
        return a2.u;
    }

    public eAa J() {
        return Gea.ia;
    }

    public void J(Waa waa2) {
        aEa b2 = waa2;
        aEa a2 = this;
        aEa aEa2 = b2;
        super.J((Waa)b2);
        a2.E = aEa2.f(vPa.o);
        if (aEa2.J(Yua.v)) {
            a2.D = b2.J(Yua.v);
        }
    }

    public String f() {
        return bua.fa;
    }

    public void y() {
        aEa a2;
        aEa aEa2 = a2;
        super.y();
        aEa2.j = aEa2.J;
        aEa2.A = aEa2.C;
        aEa2.C = (float)((double)aEa2.C + (double)(a2.ha ? pua.o : AQa.P) * aQa.r);
        aEa aEa3 = a2;
        aEa3.C = Oz.J((float)aEa3.C, (float)JPa.N, (float)pqa.r);
        if (!aEa3.ha && a2.m < pqa.r) {
            a2.m = pqa.r;
        }
        aEa aEa4 = a2;
        aEa4.m = (float)((double)aEa4.m * Tqa.ja);
        if (!aEa4.ha && a2.Ea < aSa.V) {
            aEa aEa5 = a2;
            aEa5.J(aEa5.Ea * oQa.fa);
        }
        aEa aEa6 = a2;
        aEa6.J += a2.m * kta.v;
        if (!(aEa6.j.e || a2.Y() || a2.v() || (a2.D -= vRa.d) > 0)) {
            aEa aEa7 = a2;
            aEa7.J(Era.o, pqa.r, (aEa7.R.nextFloat() - a2.R.nextFloat()) * psa.N + pqa.r);
            aEa7.J(Gea.C, vRa.d);
            a2.D = a2.R.nextInt(MTa.g) + MTa.g;
        }
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        aEa a2 = this;
        int b2 = a2.R.nextInt(yRa.d) + a2.R.nextInt(vRa.d + c2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            a2.J(Gea.ia, vRa.d);
            n3 = ++c2;
        }
        if (a2.o()) {
            a2.J(Gea.Aa, vRa.d);
            return;
        }
        a2.J(Gea.od, vRa.d);
    }

    public String A() {
        return BPa.M;
    }

    public void f(Waa waa2) {
        aEa b2 = waa2;
        aEa a2 = this;
        aEa aEa2 = b2;
        super.f((Waa)aEa2);
        aEa2.J(vPa.o, a2.E);
        aEa2.J(Yua.v, a2.D);
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        aEa aEa2 = this;
    }
}

