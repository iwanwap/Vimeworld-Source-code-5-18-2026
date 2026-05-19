/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  DQa
 *  Gg
 *  LGa
 *  NEa
 *  QFa
 *  SQa
 *  Yfa
 *  aQa
 *  bpa
 *  eAa
 *  fea
 *  gFa
 *  gZ
 *  oHa
 *  pqa
 *  vL
 *  vRa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qda
extends hFa {
    private Fea I;

    @Override
    public boolean w() {
        qda a2;
        if (super.w()) {
            if (a2.j.J((vL)a2, DQa.S) == null) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean O() {
        return vRa.d != 0;
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public double C() {
        return iSa.P;
    }

    @Override
    public String f() {
        return aQa.m;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(gZ gZ2, float f2) {
        void a2;
        qda b2 = this;
        qda c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (c2 instanceof GX || c2 == gZ.l) {
            b2.I.C();
        }
        return super.J((gZ)c2, (float)a2);
    }

    public qda(Gg gg2) {
        qda a2;
        qda b2 = gg2;
        qda qda2 = a2 = this;
        super((Gg)b2);
        qda2.l(Xpa.R, bpa.K);
        qda2.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        qda qda3 = a2;
        a2.I = new Fea(a2);
        qda2.D.J(yRa.d, (gFa)a2.I);
        qda qda4 = a2;
        qda4.D.J(AQa.P, (gFa)new ADa((bga)a2, Sx.class, oua.i, uSa.E != 0));
        qda4.D.J(tTa.h, (gFa)new fea(a2));
        qda4.L.J(vRa.d, (gFa)new IFa(a2, vRa.d != 0, new Class[uSa.E]));
        a2.L.J(uqa.g, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
    }

    public void J(XF xF, Block block) {
        Block c2 = block;
        qda a2 = this;
        a2.J(hQa.Y, VPa.i, pqa.r);
    }

    public eAa J() {
        return null;
    }

    @Override
    public void d() {
        qda a2;
        qda qda2 = a2;
        qda2.ba = qda2.X;
        super.d();
    }

    public String A() {
        return SQa.Y;
    }

    public LGa J() {
        return LGa.ARTHROPOD;
    }

    @Override
    public String i() {
        return vRa.t;
    }

    public float l() {
        return Nra.e;
    }

    @Override
    public float J(XF xF) {
        XF b2 = xF;
        qda a2 = this;
        if (a2.j.J(b2.down()).J() == QFa.Gd) {
            return FRa.Ga;
        }
        return super.J(b2);
    }

    @Override
    public void s() {
        qda a2;
        qda qda2 = a2;
        super.s();
        qda2.J(Kha.M).J(Wqa.Z);
        qda2.J(Kha.j).J(VPa.W);
        qda2.J(Kha.A).J(oua.i);
    }
}

