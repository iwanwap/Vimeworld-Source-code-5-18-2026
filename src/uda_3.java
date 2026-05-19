/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  DQa
 *  Gg
 *  LGa
 *  NEa
 *  Qsa
 *  SIa
 *  SQa
 *  UZ
 *  Uta
 *  Waa
 *  XTa
 *  Yfa
 *  aQa
 *  bpa
 *  eAa
 *  gFa
 *  nHa
 *  oHa
 *  pqa
 *  vL
 *  vRa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uda_3
extends hFa {
    private int k;
    private boolean I;

    public float l() {
        return Nra.e;
    }

    @Override
    public boolean w() {
        uda_3 a2;
        if (super.w()) {
            if (a2.j.J((vL)a2, DQa.S) == null) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public uda_3(Gg gg2) {
        uda_3 a2;
        uda_3 b2 = gg2;
        uda_3 uda_32 = a2 = this;
        super((Gg)b2);
        uda_32.k = uSa.E;
        uda_32.I = uSa.E;
        uda_32.A = yRa.d;
        uda_32.l(Xpa.R, bpa.K);
        uda_32.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        uda_32.D.J(uqa.g, (gFa)new ADa((bga)a2, Sx.class, oua.i, uSa.E != 0));
        uda_32.D.J(yRa.d, (gFa)new HDa(a2, oua.i));
        uda_32.D.J(XTa.W, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        uda_32.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        uda_32.L.J(vRa.d, (gFa)new IFa(a2, vRa.d != 0, new Class[uSa.E]));
        a2.L.J(uqa.g, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
    }

    public void J(Waa waa2) {
        uda_3 a2;
        uda_3 b2 = waa2;
        uda_3 uda_32 = a2 = this;
        uda_3 uda_33 = b2;
        super.J((Waa)uda_33);
        uda_32.k = uda_33.J(yta.v);
        uda_32.I = b2.f(wta.S);
    }

    public boolean v() {
        uda_3 a2;
        return a2.I;
    }

    @Override
    public String i() {
        return vRa.t;
    }

    @Override
    public void d() {
        uda_3 a2;
        uda_3 uda_32 = a2;
        uda_32.ba = uda_32.X;
        super.d();
    }

    @Override
    public void s() {
        uda_3 a2;
        uda_3 uda_32 = a2;
        super.s();
        uda_32.J(Kha.M).J(Wqa.Z);
        uda_32.J(Kha.j).J(VPa.W);
        uda_32.J(Kha.A).J(KPa.y);
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public eAa J() {
        return null;
    }

    public void k(boolean bl) {
        boolean b2 = bl;
        uda_3 a2 = this;
        a2.I = b2;
    }

    public void J(XF xF2, Block block) {
        Block c2 = block;
        uda_3 a2 = this;
        a2.J(hQa.Y, VPa.i, pqa.r);
    }

    @Override
    public void y() {
        uda_3 uda_32;
        uda_3 uda_33 = uda_32 = this;
        super.y();
        if (uda_33.j.e) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < uqa.g) {
                int n3 = 3 & 5;
                uda_32.j.J(UZ.PORTAL, uda_32.la + (uda_32.R.nextDouble() - kTa.B) * (double)uda_32.F, uda_32.Z + uda_32.R.nextDouble() * (double)uda_32.u, uda_32.A + (uda_32.R.nextDouble() - kTa.B) * (double)uda_32.F, (uda_32.R.nextDouble() - kTa.B) * KPa.y, -uda_32.R.nextDouble(), (uda_32.R.nextDouble() - kTa.B) * KPa.y, new int[uSa.E]);
                n2 = ++a2;
            }
        } else {
            if (!uda_32.Q()) {
                uda_32.k += vRa.d;
            }
            if (uda_32.k >= Uta.F) {
                uda_32.k();
            }
        }
    }

    @Override
    public boolean O() {
        return vRa.d != 0;
    }

    public LGa J() {
        return LGa.ARTHROPOD;
    }

    @Override
    public String f() {
        return aQa.m;
    }

    public String A() {
        return SQa.Y;
    }

    public void f(Waa waa2) {
        uda_3 b2 = waa2;
        uda_3 a2 = this;
        uda_3 uda_32 = b2;
        super.f((Waa)uda_32);
        uda_32.J(yta.v, a2.k);
        uda_32.J(wta.S, a2.I);
    }
}

