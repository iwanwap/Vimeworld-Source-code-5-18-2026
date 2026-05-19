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
 *  vQa
 *  vRa
 *  wOa
 *  wPa
 *  xy
 */
package net.minecraft.block;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockCustomWall
extends Block {
    public static final PropertyBool EAST;
    public static final PropertyBool NORTH;
    public static final PropertyBool WEST;
    public static final PropertyBool UP;
    public static final Set<Block> WALL_BLOCKS;
    public static final PropertyBool SOUTH;

    @Override
    public boolean J(I i2, XF xF) {
        Object c2 = xF;
        BlockCustomWall a2 = this;
        return uSa.E != 0;
    }

    static {
        WALL_BLOCKS = Collections.newSetFromMap(new IdentityHashMap());
        UP = PropertyBool.J(dsa.a);
        NORTH = PropertyBool.J(hTa.d);
        EAST = PropertyBool.J(Zpa.D);
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void b2;
        void c2;
        XF d2 = xF;
        BlockCustomWall a2 = this;
        return c2.J(UP, (!b2.J(d2.up()) ? vRa.d : uSa.E) != 0).J(NORTH, a2.f((I)b2, d2.north())).J(EAST, a2.f((I)b2, d2.east())).J(SOUTH, a2.f((I)b2, d2.south())).J(WEST, a2.f((I)b2, d2.west()));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF;
        BlockCustomWall b2 = this;
        b2.J((I)c2, (XF)((Object)d2));
        b2.maxY = Bta.c;
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF, DZ dZ2) {
        Object d2 = dZ2;
        BlockCustomWall a2 = this;
        if (d2 == DZ.DOWN) {
            void b2;
            void c2;
            return super.J((I)c2, (XF)b2, (DZ)((Object)d2));
        }
        return vRa.d != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCustomWall a2 = this;
        return uSa.E;
    }

    public BlockCustomWall(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCustomWall a2 = this;
        a2(b2.J());
    }

    @Override
    public BlockState J() {
        BlockCustomWall a2;
        IProperty[] iPropertyArray = new IProperty[tTa.h];
        iPropertyArray[uSa.E] = UP;
        iPropertyArray[vRa.d] = NORTH;
        iPropertyArray[uqa.g] = EAST;
        iPropertyArray[yRa.d] = WEST;
        iPropertyArray[AQa.P] = SOUTH;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockCustomWall(Block block) {
        BlockCustomWall a2;
        Block b2 = block;
        BlockCustomWall blockCustomWall = a2 = this;
        super(b2.blockMaterial);
        blockCustomWall.J(blockCustomWall.blockState.J().J(UP, Boolean.FALSE).J(NORTH, Boolean.FALSE).J(EAST, Boolean.FALSE).J(SOUTH, Boolean.FALSE).J(WEST, Boolean.FALSE));
        blockCustomWall.J(b2.blockHardness.J());
        a2.l(b2.blockResistance / vQa.q);
        a2.J(b2.stepSound);
        a2.J(yGa.A);
        WALL_BLOCKS.add(a2);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, XF xF) {
        void a2;
        Block c2 = i2;
        BlockCustomWall b2 = this;
        if ((c2 = c2.J((XF)a2).J()) == QFa.fE) {
            return uSa.E != 0;
        }
        if (!WALL_BLOCKS.contains(c2) && !(c2 instanceof BlockFenceGate)) {
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

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF) {
        BlockCustomWall blockCustomWall;
        void b22;
        BlockCustomWall a2;
        XF c22 = xF;
        BlockCustomWall blockCustomWall2 = a2 = this;
        void v1 = b22;
        boolean b22 = a2.f((I)b22, c22.north());
        boolean bl = a2.f((I)v1, c22.south());
        boolean bl2 = blockCustomWall2.f((I)v1, c22.west());
        boolean c22 = blockCustomWall2.f((I)b22, c22.east());
        float f2 = rta.o;
        float f3 = wOa.w;
        float f4 = rta.o;
        float f5 = wOa.w;
        float f6 = pqa.r;
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
        if (b22 && bl && !bl2 && !c22) {
            f6 = rta.R;
            f2 = wPa.F;
            f3 = sOa.Ka;
            blockCustomWall = a2;
        } else {
            if (!b22 && !bl && bl2 && c22) {
                f6 = rta.R;
                f4 = wPa.F;
                f5 = sOa.Ka;
            }
            blockCustomWall = a2;
        }
        blockCustomWall.J(f2, JPa.N, f4, f3, f6, f5);
    }
}

