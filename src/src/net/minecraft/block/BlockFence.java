/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  NTa
 *  QFa
 *  Zpa
 *  hTa
 *  pqa
 *  sfa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockFence
extends Block {
    public static final PropertyBool NORTH = PropertyBool.J(hTa.d);
    public static final PropertyBool WEST;
    public static final PropertyBool EAST;
    public static final PropertyBool SOUTH;

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockFence a2 = this;
        return vRa.d != 0;
    }

    static {
        EAST = PropertyBool.J(Zpa.D);
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void e2;
        BlockFence i2 = gg2;
        BlockFence h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        return sfa.J((Sx)e2, (Gg)i2, (XF)g2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        BlockFence blockFence;
        BlockFence blockFence2 = blockFence = this;
        void v1 = f2;
        boolean bl = blockFence.f((I)f2, e2.north());
        boolean bl2 = blockFence.f((I)v1, e2.south());
        boolean bl3 = blockFence2.f((I)v1, e2.west());
        boolean bl4 = blockFence2.f((I)f2, e2.east());
        float f3 = MRa.K;
        float f4 = Jpa.y;
        float f5 = MRa.K;
        float g2 = Jpa.y;
        if (bl) {
            f5 = JPa.N;
        }
        if (bl2) {
            g2 = pqa.r;
        }
        if (bl || bl2) {
            blockFence.J(f3, JPa.N, f5, f4, Ira.d, g2);
            super.J((Gg)f2, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        }
        f5 = MRa.K;
        g2 = Jpa.y;
        if (bl3) {
            f3 = JPa.N;
        }
        if (bl4) {
            f4 = pqa.r;
        }
        if (bl3 || bl4 || !bl && !bl2) {
            blockFence.J(f3, JPa.N, f5, f4, Ira.d, g2);
            super.J((Gg)f2, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        }
        if (bl) {
            f5 = JPa.N;
        }
        if (bl2) {
            g2 = pqa.r;
        }
        blockFence.J(f3, JPa.N, f5, f4, pqa.r, g2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void b22;
        BlockFence a2;
        XF c22 = xF2;
        BlockFence blockFence = a2 = this;
        void v1 = b22;
        boolean b22 = a2.f((I)b22, c22.north());
        boolean bl = a2.f((I)v1, c22.south());
        boolean bl2 = blockFence.f((I)v1, c22.west());
        boolean c22 = blockFence.f((I)b22, c22.east());
        float f2 = MRa.K;
        float f3 = Jpa.y;
        float f4 = MRa.K;
        float f5 = Jpa.y;
        if (b22) {
            f4 = JPa.N;
        }
        if (bl) {
            f5 = pqa.r;
        }
        if (bl2) {
            f2 = JPa.N;
        }
        if (c22) {
            f3 = pqa.r;
        }
        a2.J(f2, JPa.N, f4, f3, pqa.r, f5);
    }

    public BlockFence(Material material) {
        Material b2 = material;
        BlockFence a2 = this;
        Object object = b2;
        a2((Material)object, ((Material)object).J());
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFence a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void b2;
        void c2;
        XF d2 = xF2;
        BlockFence a2 = this;
        return c2.J(NORTH, a2.f((I)b2, d2.north())).J(EAST, a2.f((I)b2, d2.east())).J(SOUTH, a2.f((I)b2, d2.south())).J(WEST, a2.f((I)b2, d2.west()));
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockFence a2;
        IProperty[] iPropertyArray = new IProperty[AQa.P];
        iPropertyArray[uSa.E] = NORTH;
        iPropertyArray[vRa.d] = EAST;
        iPropertyArray[uqa.g] = WEST;
        iPropertyArray[yRa.d] = SOUTH;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, XF xF2) {
        void a2;
        Block c2 = i2;
        BlockFence b2 = this;
        if ((c2 = c2.J((XF)a2).J()) == QFa.fE) {
            return uSa.E != 0;
        }
        if (!(c2 instanceof BlockFence && c2.blockMaterial == b2.blockMaterial || c2 instanceof BlockFenceGate)) {
            if (c2.blockMaterial.J() && c2.l()) {
                if (c2.blockMaterial != Material.gourd) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockFence(Material material, MapColor mapColor) {
        void b2;
        BlockFence a2;
        MapColor c2 = mapColor;
        BlockFence blockFence = a2 = this;
        super((Material)b2, c2);
        blockFence.J(blockFence.blockState.J().J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0));
        blockFence.J(yGa.a);
    }

    @Override
    public boolean J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockFence a2 = this;
        return uSa.E != 0;
    }
}

