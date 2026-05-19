/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  I
 *  JPa
 *  Mda
 *  NTa
 *  QFa
 *  VQa
 *  Zpa
 *  eAa
 *  hTa
 *  pqa
 *  vQa
 *  vRa
 *  wOa
 *  wPa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockWall
extends Block {
    public static final PropertyBool SOUTH;
    public static final PropertyBool NORTH;
    public static final PropertyBool UP;
    public static final PropertyBool EAST;
    public static final PropertyBool WEST;
    public static final PropertyEnum<BlockWall$EnumType> VARIANT;

    @Override
    public String f() {
        BlockWall a2;
        return Ey.f((String)new StringBuilder().insert(2 & 5, a2.J()).append(VQa.ja).append(BlockWall$EnumType.NORMAL.getUnlocalizedName()).append(tpa.N).toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF, DZ dZ2) {
        Object d2 = dZ2;
        BlockWall a2 = this;
        if (d2 == DZ.DOWN) {
            void b2;
            void c2;
            return super.J((I)c2, (XF)b2, (DZ)((Object)d2));
        }
        return vRa.d != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF;
        BlockWall b2 = this;
        b2.J((I)c2, (XF)((Object)d2));
        b2.maxY = Bta.c;
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF) {
        BlockWall blockWall;
        void b22;
        BlockWall a2;
        XF c22 = xF;
        BlockWall blockWall2 = a2 = this;
        void v1 = b22;
        boolean b22 = a2.f((I)b22, c22.north());
        boolean bl = a2.f((I)v1, c22.south());
        boolean bl2 = blockWall2.f((I)v1, c22.west());
        boolean c22 = blockWall2.f((I)b22, c22.east());
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
            blockWall = a2;
        } else {
            if (!b22 && !bl && bl2 && c22) {
                f6 = rta.R;
                f4 = wPa.F;
                f5 = sOa.Ka;
            }
            blockWall = a2;
        }
        blockWall.J(f2, JPa.N, f4, f3, f6, f5);
    }

    @Override
    public BlockState J() {
        BlockWall a2;
        IProperty[] iPropertyArray = new IProperty[uua.p];
        iPropertyArray[uSa.E] = UP;
        iPropertyArray[vRa.d] = NORTH;
        iPropertyArray[uqa.g] = EAST;
        iPropertyArray[yRa.d] = WEST;
        iPropertyArray[AQa.P] = SOUTH;
        iPropertyArray[tTa.h] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockWall a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockWall blockWall = this;
        BlockWall$EnumType[] b2 = BlockWall$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockWall$EnumType blockWall$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockWall$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }

    public BlockWall(Block block) {
        BlockWall a2;
        Block b2 = block;
        BlockWall blockWall = a2 = this;
        super(b2.blockMaterial);
        blockWall.J(blockWall.blockState.J().J(UP, uSa.E != 0).J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0).J(VARIANT, BlockWall$EnumType.NORMAL));
        blockWall.J(b2.blockHardness.J());
        a2.l(b2.blockResistance / vQa.q);
        a2.J(b2.stepSound);
        a2.J(yGa.A);
        BlockCustomWall.WALL_BLOCKS.add(a2);
    }

    static {
        UP = PropertyBool.J(dsa.a);
        NORTH = PropertyBool.J(hTa.d);
        EAST = PropertyBool.J(Zpa.D);
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
        VARIANT = PropertyEnum.J(Xpa.Ka, BlockWall$EnumType.class);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, XF xF) {
        void a2;
        Block c2 = i2;
        BlockWall b2 = this;
        if ((c2 = c2.J((XF)a2).J()) == QFa.fE) {
            return uSa.E != 0;
        }
        if (!BlockCustomWall.WALL_BLOCKS.contains(c2) && !(c2 instanceof BlockFenceGate)) {
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
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void b2;
        void c2;
        XF d2 = xF;
        BlockWall a2 = this;
        return c2.J(UP, (!b2.J(d2.up()) ? vRa.d : uSa.E) != 0).J(NORTH, a2.f((I)b2, d2.north())).J(EAST, a2.f((I)b2, d2.east())).J(SOUTH, a2.f((I)b2, d2.south())).J(WEST, a2.f((I)b2, d2.west()));
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockWall a2 = this;
        return a2.J().J(VARIANT, BlockWall$EnumType.byMetadata(b2));
    }

    @Override
    public boolean J(I i2, XF xF) {
        Object c2 = xF;
        BlockWall a2 = this;
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockWall a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }
}

