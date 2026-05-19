/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  aga
 *  vL
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockFalling
extends Block {
    public static boolean fallInstantly;

    public BlockFalling(Material material) {
        Material b2 = material;
        BlockFalling a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockFalling e2 = gg2;
        BlockFalling d2 = this;
        if (!((Gg)e2).e) {
            void c2;
            d2.f((Gg)e2, (XF)c2);
        }
    }

    public void l(Gg gg2, XF object) {
        Object c2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        BlockFalling c2;
        BlockFalling d2 = gg2;
        BlockFalling blockFalling = c2 = this;
        d2.J((XF)b2, blockFalling, blockFalling.J((Gg)d2));
    }

    public void J(aga object) {
        BlockFalling b2 = object;
        object = this;
    }

    public static boolean l(Gg gg2, XF xF2) {
        Object b2 = xF2;
        Gg a2 = gg2;
        Block block = a2.J((XF)((Object)b2)).J();
        b2 = block.blockMaterial;
        if (block == QFa.ic || b2 == Material.air || b2 == Material.water || b2 == Material.lava) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        BlockFalling d2;
        BlockFalling e2 = gg2;
        BlockFalling blockFalling = d2 = this;
        e2.J((XF)c2, blockFalling, blockFalling.J((Gg)e2));
    }

    @Override
    public int J(Gg gg2) {
        BlockFalling b2 = gg2;
        BlockFalling a2 = this;
        return uqa.g;
    }

    public BlockFalling() {
        BlockFalling a2;
        BlockFalling blockFalling = a2;
        super(Material.sand);
        blockFalling.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockFalling a2 = this;
        if (!BlockFalling.l((Gg)b2, c2.down()) || c2.getY() < 0) return;
        int n2 = fPa.i;
        if (!fallInstantly) {
            int n3 = n2;
            if (b2.J(c2.add(-n2, -n2, -n2), c2.add(n3, n3, n3))) {
                aga aga2;
                if (b2.e) return;
                aga aga3 = aga2 = new aga((Gg)b2, (double)c2.getX() + kTa.B, (double)c2.getY(), (double)c2.getZ() + kTa.B, b2.J(c2));
                a2.J(aga3);
                b2.f((vL)aga3);
                return;
            }
        }
        void v2 = b2;
        void v3 = v2;
        v2.G(c2);
        XF xF3 = c2.down();
        while (BlockFalling.l((Gg)v3, xF3) && xF3.getY() > 0) {
            xF3 = xF3.down();
            v3 = b2;
        }
        if (xF3.getY() <= 0) return;
        b2.J(xF3.up(), a2.J());
    }
}

