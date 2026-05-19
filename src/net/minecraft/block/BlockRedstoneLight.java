/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  eAa
 *  pqa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockRedstoneLight
extends Block {
    private final boolean isOn;

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneLight a2 = this;
        return new Mda(QFa.nA);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockRedstoneLight a2 = this;
        return eAa.J((Block)QFa.nA);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        BlockRedstoneLight e2 = gg2;
        BlockRedstoneLight d2 = this;
        if (!((Gg)e2).e) {
            void c2;
            if (d2.isOn && !e2.k((XF)c2)) {
                e2.J((XF)c2, d2, AQa.P);
                return;
            }
            if (!d2.isOn && e2.k((XF)c2)) {
                e2.J((XF)c2, QFa.jA.J(), uqa.g);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        BlockRedstoneLight e2 = gg2;
        BlockRedstoneLight d2 = this;
        if (!((Gg)e2).e && d2.isOn && !e2.k((XF)c2)) {
            e2.J((XF)c2, QFa.nA.J(), uqa.g);
        }
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockRedstoneLight a2 = this;
        return eAa.J((Block)QFa.nA);
    }

    public BlockRedstoneLight(boolean bl2) {
        boolean b2 = bl2;
        BlockRedstoneLight a2 = this;
        super(Material.redstoneLight);
        a2.isOn = b2;
        if (a2.isOn) {
            a2.f(pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        BlockRedstoneLight d2 = gg2;
        BlockRedstoneLight c2 = this;
        if (!((Gg)d2).e) {
            void b2;
            if (c2.isOn && !d2.k((XF)b2)) {
                d2.J((XF)b2, QFa.nA.J(), uqa.g);
                return;
            }
            if (!c2.isOn && d2.k((XF)b2)) {
                d2.J((XF)b2, QFa.jA.J(), uqa.g);
            }
        }
    }
}

