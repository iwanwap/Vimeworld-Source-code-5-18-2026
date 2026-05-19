/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  ERa
 *  FPa
 *  Gg
 *  Gl
 *  Hba
 *  IGa
 *  LC
 *  NEa
 *  NTa
 *  Oz
 *  QFa
 *  SIa
 *  Yfa
 *  Zua
 *  eAa
 *  gFa
 *  gZ
 *  lqa
 *  nHa
 *  pqa
 *  psa
 *  vL
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class Iea_2
extends Eea
implements LC {
    public void y() {
        Iea_2 iea_2;
        Iea_2 iea_22 = iea_2 = this;
        super.y();
        if (!iea_22.j.e) {
            int n2;
            Iea_2 iea_23 = iea_2;
            int n3 = Oz.f((double)iea_23.la);
            int n4 = Oz.f((double)iea_23.Z);
            int a2 = Oz.f((double)iea_23.A);
            if (iea_23.M()) {
                iea_2.J(gZ.f, pqa.r);
            }
            XF xF2 = new XF(n3, uSa.E, a2);
            XF xF3 = new XF(n3, n4, a2);
            if (iea_2.j.J(xF2).J(xF3) > pqa.r) {
                iea_2.J(gZ.k, pqa.r);
            }
            int n5 = n2 = uSa.E;
            while (n5 < AQa.P) {
                Iea_2 iea_24 = iea_2;
                n3 = Oz.f((double)(iea_24.la + (double)((float)(n2 % uqa.g * uqa.g - vRa.d) * rta.o)));
                XF xF4 = new XF(n3, n4 = Oz.f((double)iea_24.Z), a2 = Oz.f((double)(iea_24.A + (double)((float)(n2 / uqa.g % uqa.g * uqa.g - vRa.d) * rta.o))));
                if (iea_24.j.J(xF4).J().J() == Material.air) {
                    XF xF5 = new XF(n3, uSa.E, a2);
                    if (iea_2.j.J(xF5).J(xF4) < xSa.la && QFa.gC.J(iea_2.j, xF4)) {
                        iea_2.j.J(xF4, QFa.gC.J());
                    }
                }
                n5 = ++n2;
            }
        }
    }

    public float l() {
        return rRa.C;
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        Iea_2 a2 = this;
        int b2 = a2.R.nextInt(ERa.C);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            a2.J(Gea.Pd, vRa.d);
            n3 = ++c2;
        }
    }

    public void s() {
        Iea_2 a2;
        Iea_2 iea_2 = a2;
        super.s();
        iea_2.J(Kha.M).J(FPa.T);
        iea_2.J(Kha.j).J(Bua.Ia);
    }

    public eAa J() {
        return Gea.Pd;
    }

    public Iea_2(Gg gg2) {
        Iea_2 a2;
        Iea_2 b2 = gg2;
        Iea_2 iea_2 = a2 = this;
        super((Gg)b2);
        iea_2.l(ZSa.q, Zua.D);
        ((Hba)iea_2.J()).J(vRa.d != 0);
        Iea_2 iea_22 = a2;
        iea_22.D.J(vRa.d, (gFa)new IGa((LC)a2, Qpa.Aa, kTa.j, FRa.Ga));
        iea_22.D.J(uqa.g, (gFa)new HDa(a2, oua.i));
        iea_22.D.J(yRa.d, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        iea_22.D.J(AQa.P, (gFa)new SIa((Yfa)a2));
        iea_22.L.J(vRa.d, (gFa)new NEa((bga)a2, Yfa.class, NTa.C, vRa.d != 0, uSa.E != 0, WC.A));
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2) {
        void b22;
        float c22 = f2;
        Iea_2 a2 = this;
        Pda c22 = new Pda(a2.j, (Gl)a2);
        void v0 = b22;
        void v1 = b22;
        double d2 = v0.Z + (double)v1.l() - Tqa.T;
        double d3 = v1.la - a2.la;
        double d4 = v0.A - a2.A;
        double d5 = d3;
        double d6 = d4;
        float b22 = Oz.J((double)(d5 * d5 + d6 * d6)) * psa.N;
        c22.J(d3, (d2 -= c22.Z) + (double)b22, d4, ySa.Da, Fua.Y);
        a2.J(EQa.R, pqa.r, pqa.r / (a2.J().nextFloat() * Xpa.R + xSa.la));
        a2.j.f((vL)c22);
    }
}

