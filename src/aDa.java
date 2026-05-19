/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Hba
 *  Mda
 *  OIa
 *  SIa
 *  XTa
 *  Yfa
 *  eAa
 *  fEa
 *  gFa
 *  lqa
 *  nHa
 *  oHa
 *  pPa
 *  pqa
 *  vRa
 *  wEa
 */
import net.minecraft.block.Block;

public class aDa
extends fEa {
    public boolean J(Sx sx2) {
        Sx b2 = sx2;
        aDa a2 = this;
        Mda mda2 = b2.K.f();
        if (mda2 != null && mda2.J() == Gea.Ca && !b2.h.f() && !a2.Y()) {
            int n2 = mda2.E;
            mda2.E = n2 - vRa.d;
            if (n2 == vRa.d) {
                Sx sx3 = b2;
                sx3.K.J(sx3.K.J, new Mda(Gea.oa));
            } else if (!b2.K.f(new Mda(Gea.oa))) {
                b2.J(new Mda(Gea.oa, vRa.d, uSa.E), uSa.E != 0);
            }
            return vRa.d != 0;
        }
        return super.J(b2);
    }

    public String i() {
        return mPa.Ga;
    }

    public String A() {
        return CRa.I;
    }

    public float G() {
        return Xpa.R;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        int c2;
        void a2;
        aDa aDa2 = this;
        int b2 = aDa2.R.nextInt(yRa.d) + aDa2.R.nextInt(vRa.d + a2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            aDa2.J(Gea.Xb, vRa.d);
            n3 = ++c2;
        }
        b2 = aDa2.R.nextInt(yRa.d) + vRa.d + aDa2.R.nextInt(vRa.d + a2);
        int n4 = c2 = uSa.E;
        while (n4 < b2) {
            if (aDa2.o()) {
                aDa2.J(Gea.y, vRa.d);
            } else {
                aDa2.J(Gea.mC, vRa.d);
            }
            n4 = ++c2;
        }
    }

    public aDa(Gg gg2) {
        aDa a2;
        aDa b2 = gg2;
        aDa aDa2 = a2 = this;
        super((Gg)b2);
        aDa2.l(ATa.r, Jsa.Z);
        ((Hba)aDa2.J()).J(vRa.d != 0);
        aDa aDa3 = a2;
        aDa3.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        aDa3.D.J(vRa.d, (gFa)new nfa((bga)((Object)a2), KPa.y));
        aDa3.D.J(uqa.g, (gFa)new Pia(a2, oua.i));
        aDa3.D.J(yRa.d, (gFa)new OIa((bga)((Object)a2), Qpa.Aa, Gea.DC, uSa.E != 0));
        aDa3.D.J(AQa.P, (gFa)new AIa(a2, Qpa.Aa));
        aDa3.D.J(tTa.h, (gFa)new HDa((bga)((Object)a2), oua.i));
        aDa3.D.J(uua.p, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        aDa3.D.J(XTa.W, (gFa)new SIa((Yfa)a2));
    }

    public float l() {
        aDa a2;
        return a2.u;
    }

    public void s() {
        aDa a2;
        aDa aDa2 = a2;
        super.s();
        aDa2.J(Kha.M).J(Wqa.m);
        aDa2.J(Kha.j).J(Bua.Ia);
    }

    public eAa J() {
        return Gea.Xb;
    }

    public aDa J(wEa wEa2) {
        aDa b2 = wEa2;
        aDa a2 = this;
        return new aDa(a2.j);
    }

    public String f() {
        return mPa.Ga;
    }

    public void J(XF xF, Block block) {
        Object c2 = block;
        aDa a2 = this;
        a2.J(pPa.Fa, VPa.i, pqa.r);
    }
}

