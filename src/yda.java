/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  JPa
 *  Lqa
 *  Mda
 *  Oz
 *  QFa
 *  Rda
 *  UZ
 *  Waa
 *  Yea
 *  aSa
 *  fpa
 *  gZ
 *  vRa
 */
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yda
extends Yea {
    public double j;
    public double J;
    private int A;

    /*
     * WARNING - void declaration
     */
    public yda(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        yda e2 = gg2;
        yda d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }

    public Rda J() {
        return Rda.FURNACE;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF, IBlockState iBlockState) {
        double d2;
        void b2;
        yda a2;
        Object c2 = iBlockState;
        yda yda2 = a2 = this;
        super.J((XF)b2, (IBlockState)c2);
        double d3 = yda2.j * a2.j + a2.J * a2.J;
        if (d2 > oQa.Ka && a2.i * a2.i + a2.f * a2.f > DPa.Ia) {
            d3 = Oz.J((double)d3);
            yda yda3 = a2;
            yda3.j /= d3;
            yda3.J /= d3;
            if (yda3.j * a2.i + a2.J * a2.f < aSa.V) {
                yda yda4 = a2;
                yda4.j = aSa.V;
                yda4.J = aSa.V;
                return;
            }
            yda yda5 = a2;
            yda5.j *= (d3 /= a2.e());
            yda5.J *= d3;
        }
    }

    public void J(Waa waa2) {
        yda a2;
        yda b2 = waa2;
        yda yda2 = a2 = this;
        yda yda3 = b2;
        super.J((Waa)b2);
        a2.j = yda3.J(nOa.K);
        yda2.J = yda3.J(fpa.Y);
        yda2.A = b2.J(Lqa.q);
    }

    public void A() {
        yda yda2;
        double d2;
        yda a2;
        double d3 = a2.j * a2.j + a2.J * a2.J;
        if (d2 > oQa.Ka) {
            d3 = Oz.J((double)d3);
            yda yda3 = a2;
            yda2 = yda3;
            yda3.j /= d3;
            yda3.J /= d3;
            d3 = oua.i;
            yda3.f(yda3.i * GPa.fa);
            yda3.J(yda3.Ea * aSa.V);
            yda3.l(yda3.f * GPa.fa);
            yda3.f(yda3.i + a2.j * d3);
            yda3.l(yda3.f + a2.J * d3);
        } else {
            yda yda4 = a2;
            yda2 = yda4;
            yda4.f(yda4.i * uua.G);
            yda4.J(yda4.Ea * aSa.V);
            yda4.l(yda4.f * uua.G);
        }
        super.A();
    }

    public void J(gZ gZ2) {
        yda b2 = gZ2;
        yda a2 = this;
        yda yda2 = b2;
        super.J((gZ)yda2);
        if (!yda2.l() && a2.j.J().f(qQa.y)) {
            a2.J(new Mda(QFa.Xb, vRa.d), JPa.N);
        }
    }

    public void D(boolean bl) {
        boolean b2 = bl;
        yda a2 = this;
        if (b2) {
            a2.aa.J(ERa.C, Byte.valueOf((byte)(a2.aa.J(ERa.C) | vRa.d)));
            return;
        }
        a2.aa.J(ERa.C, Byte.valueOf((byte)(a2.aa.J(ERa.C) & rQa.p)));
    }

    public void f(Waa waa2) {
        yda b2 = waa2;
        yda a2 = this;
        yda yda2 = b2;
        super.f((Waa)yda2);
        b2.J(nOa.K, a2.j);
        yda2.J(fpa.Y, a2.J);
        yda2.J(Lqa.q, (short)a2.A);
    }

    public yda(Gg gg2) {
        yda b2 = gg2;
        yda a2 = this;
        super((Gg)b2);
    }

    public void J() {
        yda a2;
        yda yda2 = a2;
        super.J();
        yda2.aa.f(ERa.C, new Byte((byte)uSa.E));
    }

    public void d() {
        yda a2;
        yda yda2 = a2;
        super.d();
        if (yda2.A > 0) {
            a2.A -= vRa.d;
        }
        if (a2.A <= 0) {
            yda yda3 = a2;
            yda3.j = yda3.J = aSa.V;
        }
        yda yda4 = a2;
        yda4.D((yda4.A > 0 ? vRa.d : uSa.E) != 0);
        if (a2.l() && a2.R.nextInt(AQa.P) == 0) {
            a2.j.J(UZ.SMOKE_LARGE, a2.la, a2.Z + Jra.A, (double)a2.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    public boolean l() {
        yda a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double e() {
        return iSa.P;
    }

    public boolean l(Sx sx) {
        Object b2 = sx;
        yda a2 = this;
        Mda mda2 = ((Sx)((Object)b2)).K.f();
        if (mda2 != null && mda2.J() == Gea.qc) {
            if (!((Sx)((Object)b2)).h.f() && (mda2.E -= vRa.d) == 0) {
                Object object = b2;
                ((Sx)((Object)object)).K.J(((Sx)((Object)object)).K.J, (Mda)null);
            }
            a2.A += csa.W;
        }
        yda yda2 = a2;
        yda2.j = yda2.la - ((Sx)((Object)b2)).la;
        yda2.J = yda2.A - ((Sx)((Object)b2)).A;
        return vRa.d != 0;
    }

    public IBlockState f() {
        yda a2;
        return (a2.l() ? QFa.CB : QFa.Xb).J().J(BlockFurnace.FACING, DZ.NORTH);
    }
}

