/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ypa
 *  eAa
 *  ez
 *  hy
 *  uY
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockMobSpawner
extends BlockContainer {
    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockMobSpawner a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockMobSpawner e2;
        BlockMobSpawner f222 = gg2;
        BlockMobSpawner blockMobSpawner = e2 = this;
        super.J((Gg)f222, (XF)d2, (IBlockState)c2, (float)b2, (int)a2);
        int f222 = Ypa.A + ((Gg)f222).v.nextInt(Ypa.A) + ((Gg)f222).v.nextInt(Ypa.A);
        blockMobSpawner.J((Gg)f222, (XF)d2, f222);
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockMobSpawner a2 = this;
        return new Caa();
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockMobSpawner a2 = this;
        return null;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockMobSpawner a2 = this;
        return null;
    }

    public BlockMobSpawner() {
        super(Material.rock);
        BlockMobSpawner a2;
    }
}

