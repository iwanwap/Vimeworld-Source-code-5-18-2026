/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  MQa
 *  Mda
 *  Mz
 *  Ox
 *  QFa
 *  Tz
 *  ez
 *  kGa
 *  pPa
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockIce
extends BlockBreakable {
    @Override
    public ez J() {
        return ez.TRANSLUCENT;
    }

    public BlockIce() {
        super(Material.ice, uSa.E != 0);
        BlockIce a2;
        a2.slipperiness = new Ox(MQa.d);
        a2.J(vRa.d != 0);
        a2.J(yGa.A);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockIce a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx2, XF xF2, IBlockState iBlockState, uY uY2) {
        void e2;
        void b2;
        Material d2;
        XF f2 = xF2;
        BlockIce c2 = this;
        void v0 = d2;
        v0.J(Tz.a[Block.J(c2)]);
        v0.D(POa.o);
        if (c2.G() && kGa.f((Gl)d2)) {
            Mda a2 = c2.J((IBlockState)b2);
            if (a2 != null) {
                BlockIce.J((Gg)e2, f2, a2);
                return;
            }
        } else {
            if (e2.F.C()) {
                e2.G(f2);
                return;
            }
            int a2 = kGa.J((Gl)d2);
            void v1 = e2;
            c2.J((Gg)v1, f2, (IBlockState)b2, a2);
            d2 = v1.J(f2.down()).J().J();
            if (d2.f() || d2.l()) {
                e2.J(f2, QFa.jd.J());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        Object e2 = xF2;
        BlockIce c2 = this;
        if (d2.J(Mz.BLOCK, (XF)((Object)e2)) > pPa.f - c2.C()) {
            if (d2.F.C()) {
                d2.G((XF)((Object)e2));
                return;
            }
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), v0.J((XF)((Object)e2)), uSa.E);
            d2.J((XF)((Object)e2), QFa.sc.J());
        }
    }

    @Override
    public int l() {
        return uSa.E;
    }
}

