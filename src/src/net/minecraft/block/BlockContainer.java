/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  hy
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public abstract class BlockContainer
extends Block
implements ITileEntityProvider {
    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, int n2, int n3) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockContainer f2 = gg2;
        BlockContainer e2 = this;
        super.J((Gg)f2, (XF)d2, (IBlockState)c2, (int)b2, (int)a2);
        f2 = f2.J((XF)d2);
        if (f2 == null) {
            return uSa.E != 0;
        }
        return f2.J((int)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF2) {
        void b2;
        BlockContainer a2 = this;
        Object c2 = xF2;
        if (a2.f((Gg)b2, (XF)((Object)c2), DZ.NORTH) || a2.f((Gg)b2, (XF)((Object)c2), DZ.SOUTH) || a2.f((Gg)b2, (XF)((Object)c2), DZ.WEST) || a2.f((Gg)b2, (XF)((Object)c2), DZ.EAST)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockContainer b2 = this;
        void v0 = c2;
        super.l((Gg)v0, (XF)((Object)d2), (IBlockState)a2);
        v0.f((XF)((Object)d2));
    }

    @Override
    public hy J() {
        return hy.INVISIBLE;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        BlockContainer a2 = this;
        if (c2.J(b2.offset((DZ)((Object)d2))).J().J() == Material.cactus) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockContainer(Material material, MapColor mapColor) {
        void b2;
        MapColor c2 = mapColor;
        BlockContainer a2 = this;
        super((Material)b2, c2);
        a2.isBlockContainer = vRa.d;
    }

    public BlockContainer(Material material) {
        Material b2 = material;
        BlockContainer a2 = this;
        Object object = b2;
        a2((Material)object, ((Material)object).J());
    }
}

