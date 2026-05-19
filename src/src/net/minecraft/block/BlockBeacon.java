/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cz
 *  Gg
 *  Gl
 *  HA
 *  Mda
 *  Tz
 *  ez
 *  hy
 *  uY
 *  vQa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon$1;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockBeacon
extends BlockContainer {
    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockBeacon i2 = gg2;
        BlockBeacon h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof Cz) {
            void e2;
            e2.J((HA)((Cz)i2));
            e2.J(Tz.Ha);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        Object e2 = iBlockState;
        BlockBeacon b2 = this;
        e2 = d2.J((XF)c2);
        if (e2 instanceof Cz) {
            ((Cz)e2).M();
            d2.f((XF)c2, (Block)b2, vRa.d, uSa.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockBeacon f2 = gg2;
        BlockBeacon e2 = this;
        super.J((Gg)f2, (XF)d2, (IBlockState)c2, (Gl)b2, (Mda)a2);
        if (a2.l() && (f2 = f2.J((XF)d2)) instanceof Cz) {
            ((Cz)f2).J(a2.J());
        }
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockBeacon a2 = this;
        return new Cz();
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    public BlockBeacon() {
        BlockBeacon a2;
        BlockBeacon blockBeacon = a2;
        super(Material.glass, MapColor.diamondColor);
        blockBeacon.J(vQa.q);
        a2.J(yGa.g);
    }

    public static void f(Gg gg2, XF xF) {
        Object b2 = xF;
        Gg a2 = gg2;
        mz.I.submit(new BlockBeacon$1(a2, (XF)((Object)b2)));
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }
}

