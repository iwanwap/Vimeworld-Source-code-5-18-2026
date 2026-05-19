/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  Aaa
 *  Ata
 *  DDa
 *  ERa
 *  FPa
 *  Gg
 *  Gl
 *  Hba
 *  NPa
 *  NTa
 *  Oda
 *  Oz
 *  QFa
 *  Qia
 *  SIa
 *  Tga
 *  UZ
 *  Waa
 *  XTa
 *  Yfa
 *  Ypa
 *  eAa
 *  gFa
 *  gZ
 *  hra
 *  jsa
 *  kpa
 *  lqa
 *  mia
 *  nHa
 *  pPa
 *  pqa
 *  qGa
 *  tIa
 *  vL
 *  vRa
 *  vpa
 *  zfa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DDa_2
extends Eea {
    private int C;
    private int i;
    public Aaa M;
    private int k;

    public void J(byte by2) {
        byte b2 = by2;
        DDa_2 a2 = this;
        if (b2 == AQa.P) {
            a2.i = NTa.C;
            a2.J(Bta.S, pqa.r, pqa.r);
            return;
        }
        if (b2 == pPa.f) {
            a2.C = hra.i;
            return;
        }
        super.J(b2);
    }

    public DDa_2(Gg gg2) {
        DDa_2 a2;
        DDa_2 b2 = gg2;
        DDa_2 dDa_2 = a2 = this;
        super((Gg)b2);
        dDa_2.l(NPa.B, hpa.j);
        ((Hba)dDa_2.J()).J(vRa.d != 0);
        DDa_2 dDa_22 = a2;
        dDa_22.D.J(vRa.d, (gFa)new ADa((bga)a2, oua.i, vRa.d != 0));
        dDa_22.D.J(uqa.g, (gFa)new qGa((bga)a2, Tqa.ja, Ura.m));
        dDa_22.D.J(yRa.d, (gFa)new Tga((bga)a2, oQa.fa, vRa.d != 0));
        dDa_22.D.J(AQa.P, (gFa)new Qia((bga)a2, oua.i));
        dDa_22.D.J(tTa.h, (gFa)new tIa((DDa)a2));
        dDa_22.D.J(uua.p, (gFa)new HDa(a2, oQa.fa));
        dDa_22.D.J(XTa.W, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        dDa_22.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        dDa_22.L.J(vRa.d, (gFa)new mia((DDa)a2));
        dDa_22.L.J(uqa.g, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
        a2.L.J(yRa.d, (gFa)new Oda((bga)a2, Yfa.class, NTa.C, uSa.E != 0, vRa.d != 0, WC.I));
    }

    public void J(Waa waa2) {
        DDa_2 a2;
        DDa_2 b2 = waa2;
        DDa_2 dDa_2 = a2 = this;
        super.J((Waa)b2);
        dDa_2.k(b2.f(pPa.b));
    }

    public void F(boolean bl) {
        boolean b2 = bl;
        DDa_2 a2 = this;
        a2.C = b2 ? hra.i : uSa.E;
        a2.j.J((vL)a2, (byte)pPa.f);
    }

    public void J() {
        DDa_2 a2;
        DDa_2 dDa_2 = a2;
        super.J();
        dDa_2.aa.f(ERa.C, (byte)uSa.E);
    }

    public int g() {
        DDa_2 a2;
        return a2.i;
    }

    @Override
    public String f() {
        return Era.g;
    }

    @Override
    public String i() {
        return xSa.ga;
    }

    public void e(vL vL2) {
        DDa_2 b2 = vL2;
        DDa_2 a2 = this;
        if (b2 instanceof WC && !(b2 instanceof zfa) && a2.J().nextInt(kTa.j) == 0) {
            a2.C((Gl)b2);
        }
        super.e((vL)b2);
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        DDa_2 a2 = this;
        int b2 = a2.R.nextInt(yRa.d);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            a2.J(eAa.J((Block)QFa.l), vRa.d, BlockFlower$EnumFlowerType.POPPY.getMeta());
            n3 = ++c2;
        }
        c2 = yRa.d + a2.R.nextInt(yRa.d);
        int n4 = b2 = uSa.E;
        while (n4 < c2) {
            a2.J(Gea.GA, vRa.d);
            n4 = ++b2;
        }
    }

    public boolean C(vL vL2) {
        DDa_2 b2 = vL2;
        DDa_2 a2 = this;
        a2.i = NTa.C;
        DDa_2 dDa_2 = a2;
        a2.j.J((vL)dDa_2, (byte)AQa.P);
        boolean bl = b2.J(gZ.J((Gl)dDa_2), XTa.W + a2.R.nextInt(Ypa.A));
        if (bl) {
            DDa_2 dDa_22 = a2;
            DDa_2 dDa_23 = b2;
            dDa_23.J(((vL)dDa_23).Ea + rpa.ja);
            dDa_22.J((Gl)dDa_22, (vL)b2);
        }
        a2.J(Bta.S, pqa.r, pqa.r);
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public void r() {
        if ((a.k -= vRa.d) > 0) ** GOTO lbl12
        v0 = a;
        a.k = NPa.e + v0.R.nextInt(vpa.o);
        a.M = v0.j.J().J(new XF((vL)a), fPa.i);
        if (a.M == null) {
            v1 = a;
            v2 = v1;
            v1.W();
        } else {
            v3 = a;
            v3.J(v3.M.J(), (int)((float)a.M.l() * Ora.D));
lbl12:
            // 2 sources

            v2 = a;
        }
        super.r();
    }

    public boolean O() {
        DDa_2 a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Aaa J() {
        DDa_2 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void k(boolean bl) {
        void a2;
        DDa_2 dDa_2 = this;
        byte b2 = dDa_2.aa.J(ERa.C);
        if (a2 != false) {
            dDa_2.aa.J(ERa.C, Byte.valueOf((byte)(b2 | vRa.d)));
            return;
        }
        dDa_2.aa.J(ERa.C, Byte.valueOf((byte)(b2 & rQa.p)));
    }

    public void f(Waa waa2) {
        DDa_2 b2 = waa2;
        DDa_2 a2 = this;
        DDa_2 dDa_2 = b2;
        super.f((Waa)dDa_2);
        dDa_2.J(pPa.b, a2.O());
    }

    public void s() {
        DDa_2 a2;
        DDa_2 dDa_2 = a2;
        super.s();
        dDa_2.J(Kha.M).J(fqa.W);
        dDa_2.J(Kha.j).J(VPa.W);
    }

    public int I() {
        DDa_2 a2;
        return a2.C;
    }

    public void J(gZ gZ2) {
        DDa_2 b2 = gZ2;
        DDa_2 a2 = this;
        if (!a2.O() && a2.y != null && a2.M != null) {
            DDa_2 dDa_2 = a2;
            dDa_2.M.J(dDa_2.y.J(), kpa.w);
        }
        super.J((gZ)b2);
    }

    public void y() {
        DDa_2 dDa_2;
        DDa_2 dDa_22 = dDa_2 = this;
        super.y();
        if (dDa_22.i > 0) {
            dDa_2.i -= vRa.d;
        }
        if (dDa_2.C > 0) {
            dDa_2.C -= vRa.d;
        }
        if (dDa_2.i * dDa_2.i + dDa_2.f * dDa_2.f > Ata.I && dDa_2.R.nextInt(tTa.h) == 0) {
            int n2;
            int n3;
            DDa_2 dDa_23 = dDa_2;
            int a22 = Oz.f((double)dDa_23.la);
            IBlockState a22 = dDa_23.j.J(new XF(a22, n3 = Oz.f((double)(dDa_23.Z - Bua.Ia)), n2 = Oz.f((double)dDa_23.A)));
            if (a22.J().J() != Material.air) {
                int[] nArray = new int[vRa.d];
                nArray[uSa.E] = Block.l(a22);
                dDa_2.j.J(UZ.BLOCK_CRACK, dDa_2.la + ((double)dDa_2.R.nextFloat() - kTa.B) * (double)dDa_2.F, dDa_2.J().j + tpa.k, dDa_2.A + ((double)dDa_2.R.nextFloat() - kTa.B) * (double)dDa_2.F, FPa.T * ((double)dDa_2.R.nextFloat() - kTa.B), kTa.B, ((double)dDa_2.R.nextFloat() - kTa.B) * FPa.T, nArray);
            }
        }
    }

    public void J(XF xF2, Block block) {
        Object c2 = block;
        DDa_2 a2 = this;
        a2.J(jsa.Ha, pqa.r, pqa.r);
    }

    public int J(int n2) {
        int b2 = n2;
        DDa_2 a2 = this;
        return b2;
    }
}

