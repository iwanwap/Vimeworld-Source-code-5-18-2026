/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  Mda
 *  QFa
 *  Tz
 *  eAa
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockDeadBush
extends BlockBush {
    @Override
    public boolean f(Block block) {
        Block b2 = block;
        BlockDeadBush a2 = this;
        if (b2 == QFa.R || b2 == QFa.MB || b2 == QFa.za || b2 == QFa.Bc) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockDeadBush() {
        BlockDeadBush blockDeadBush;
        BlockDeadBush blockDeadBush2 = blockDeadBush = this;
        super(Material.vine);
        float a2 = Xpa.R;
        blockDeadBush2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, xSa.la, MQa.L + a2);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDeadBush a2 = this;
        return MapColor.woodColor;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx, XF xF, IBlockState iBlockState, uY uY2) {
        void a2;
        void b2;
        void c2;
        void e2;
        Sx f2 = sx;
        BlockDeadBush d2 = this;
        if (!e2.e && f2.f() != null && f2.f().J() == Gea.ja) {
            f2.J(Tz.a[Block.J(d2)]);
            BlockDeadBush.J((Gg)e2, (XF)c2, new Mda((Block)QFa.BB, vRa.d, uSa.E));
            return;
        }
        super.J((Gg)e2, f2, (XF)c2, (IBlockState)b2, (uY)a2);
    }

    @Override
    public boolean f(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockDeadBush a2 = this;
        return vRa.d != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockDeadBush a2 = this;
        return null;
    }
}

