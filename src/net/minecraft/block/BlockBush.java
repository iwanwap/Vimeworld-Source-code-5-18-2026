/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  QFa
 *  ez
 *  psa
 *  vQa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockBush
extends Block {
    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void b2;
        BlockBush a2 = this;
        Object c2 = xF;
        if (super.J((Gg)b2, (XF)((Object)c2)) && a2.f(b2.J(((XF)((Object)c2)).down()).J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState) {
        void c2;
        XF d2 = xF;
        BlockBush b2 = this;
        return b2.f(c2.J(d2.down()).J());
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockBush a2 = this;
        return null;
    }

    public boolean f(Block block) {
        Block b2 = block;
        BlockBush a2 = this;
        if (b2 == QFa.lf || b2 == QFa.Bc || b2 == QFa.rd) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockBush b2 = this;
        b2.C((Gg)d2, (XF)c2, e2);
    }

    public BlockBush(Material material) {
        Material b2 = material;
        BlockBush a2 = this;
        Object object = b2;
        a2((Material)object, ((Material)object).J());
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    public BlockBush() {
        a2(Material.plants);
        BlockBush a2;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockBush b2 = this;
        Object d2 = xF;
        if (!b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2)) {
            void v0 = c2;
            b2.J((Gg)v0, (XF)((Object)d2), (IBlockState)a2, uSa.E);
            v0.J((XF)((Object)d2), QFa.HF.J(), yRa.d);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void a2;
        void c2;
        void d2;
        BlockBush b2;
        IBlockState e2 = iBlockState;
        BlockBush blockBush = b2 = this;
        super.J((Gg)d2, (XF)c2, e2, (Block)a2);
        blockBush.C((Gg)d2, (XF)c2, e2);
    }

    /*
     * WARNING - void declaration
     */
    public BlockBush(Material material, MapColor mapColor) {
        void a2;
        BlockBush b2;
        Material c22 = material;
        BlockBush blockBush = b2 = this;
        super(c22, (MapColor)a2);
        blockBush.J(vRa.d != 0);
        float c22 = psa.N;
        BlockBush blockBush2 = b2;
        blockBush2.J(MQa.L - c22, JPa.N, MQa.L - c22, MQa.L + c22, c22 * vQa.q, MQa.L + c22);
        blockBush2.J(yGa.a);
    }
}

