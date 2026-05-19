/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Oz
 *  aSa
 *  dpa
 *  pqa
 *  ska
 *  vL
 *  vRa
 *  wOa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class Bja_2
extends ska {
    public void d() {
        Bja_2 bja_2;
        Bja_2 bja_22 = bja_2 = this;
        bja_22.c = bja_22.la;
        bja_22.ba = bja_22.Z;
        bja_22.r = bja_22.A;
        bja_22.J(bja_22.Ea - (double)bja_2.m);
        bja_22.J(bja_22.i, bja_2.Ea, bja_2.f);
        bja_22.f(bja_22.i * uua.G);
        bja_22.J(bja_22.Ea * uua.G);
        bja_22.l(bja_22.f * uua.G);
        int n2 = bja_22.A;
        bja_22.A = n2 - vRa.d;
        if (n2 <= 0) {
            bja_2.k();
        }
        if (bja_2.ha) {
            if (Math.random() < kTa.B) {
                bja_2.k();
            }
            Bja_2 bja_23 = bja_2;
            bja_23.f(bja_23.i * dpa.X);
            bja_23.l(bja_23.f * dpa.X);
        }
        Object a2 = new XF((vL)bja_2);
        IBlockState iBlockState = bja_2.j.J((XF)((Object)a2));
        Block block = iBlockState.J();
        block.J((I)bja_2.j, (XF)((Object)a2));
        a2 = iBlockState.J().J();
        if (((Material)a2).l() || ((Material)a2).i()) {
            Bja_2 bja_24;
            double d2 = aSa.V;
            if (iBlockState.J() instanceof BlockLiquid) {
                d2 = pqa.r - BlockLiquid.J(iBlockState.J(BlockLiquid.LEVEL));
                bja_24 = bja_2;
            } else {
                d2 = block.C();
                bja_24 = bja_2;
            }
            d2 = (double)Oz.f((double)bja_24.Z) + d2;
            if (bja_2.Z < d2) {
                bja_2.k();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Bja_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Bja_2 d5;
        Bja_2 e2 = gg2;
        Bja_2 bja_2 = d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2, aSa.V, aSa.V, aSa.V);
        bja_2.f(bja_2.i * osa.b);
        bja_2.J(Math.random() * Bua.Ia + Tqa.Ia);
        bja_2.l(bja_2.f * osa.b);
        bja_2.l = pqa.r;
        bja_2.a = pqa.r;
        bja_2.J = pqa.r;
        bja_2.M(wOa.t + d5.R.nextInt(AQa.P));
        bja_2.l(Jpa.B, Jpa.B);
        bja_2.m = iSa.fa;
        bja_2.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P));
    }
}

