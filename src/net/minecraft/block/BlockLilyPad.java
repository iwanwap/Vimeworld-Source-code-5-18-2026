/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  QFa
 *  Spa
 *  Wda
 *  hra
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockLilyPad
extends BlockBush {
    @Override
    public int J(I i2, XF xF2, int n2) {
        int d2 = n2;
        BlockLilyPad a2 = this;
        return Jqa.G;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        Object d2 = xF2;
        BlockLilyPad b2 = this;
        return new xy((double)d2.getX() + b2.minX, (double)d2.getY() + b2.minY, (double)d2.getZ() + b2.minZ, (double)d2.getX() + b2.maxX, (double)d2.getY() + b2.maxY, (double)d2.getZ() + b2.maxZ);
    }

    @Override
    public int J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLilyPad a2 = this;
        return Spa.v;
    }

    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        XF d2 = xF2;
        BlockLilyPad b2 = this;
        if (d2.getY() >= 0 && d2.getY() < hra.Ja) {
            IBlockState c2;
            if ((c2 = c2.J(d2.down())).J().J() == Material.water && c2.J(BlockLiquid.LEVEL) == 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public BlockLilyPad() {
        BlockLilyPad blockLilyPad;
        BlockLilyPad blockLilyPad2 = blockLilyPad = this;
        float a2 = MQa.L;
        float f2 = vsa.J;
        blockLilyPad2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, f2, MQa.L + a2);
        blockLilyPad2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        BlockLilyPad g2;
        BlockLilyPad blockLilyPad = blockLilyPad2;
        BlockLilyPad blockLilyPad2 = vL2;
        BlockLilyPad a2 = blockLilyPad;
        if (g2 == null || !(g2 instanceof Wda)) {
            void b2;
            void c2;
            void d2;
            void e2;
            void f2;
            super.J((Gg)f2, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)g2);
        }
    }

    @Override
    public int J() {
        return Spa.v;
    }

    @Override
    public boolean f(Block block) {
        Block b2 = block;
        BlockLilyPad a2 = this;
        if (b2 == QFa.sc) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLilyPad a2 = this;
        return uSa.E;
    }
}

