/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Mda
 *  QFa
 *  Ssa
 *  Tz
 *  Wsa
 *  XTa
 *  eAa
 *  kX
 *  pqa
 *  uY
 *  vRa
 *  wi
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoublePlant$EnumBlockHalf;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockDoublePlant
extends BlockBush
implements IGrowable {
    public static final PropertyEnum<BlockDoublePlant$EnumPlantType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockDoublePlant$EnumPlantType.class);
    public static final PropertyEnum<DZ> field_181084_N;
    public static final PropertyEnum<BlockDoublePlant$EnumBlockHalf> HALF;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        void c2;
        Object d2 = iBlockState;
        BlockDoublePlant a2 = this;
        if (d2.J(HALF) == BlockDoublePlant$EnumBlockHalf.UPPER) {
            if (c2.J(b2.down()).J() == a2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        d2 = c2.J(b2.up());
        if (d2.J() == a2 && super.J((Gg)c2, (XF)b2, (IBlockState)d2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF, int n2) {
        void b2;
        void c2;
        int d22 = n2;
        BlockDoublePlant a2 = this;
        BlockDoublePlant$EnumPlantType d22 = a2.J((I)c2, (XF)b2);
        if (d22 != BlockDoublePlant$EnumPlantType.GRASS && d22 != BlockDoublePlant$EnumPlantType.FERN) {
            return Wsa.K;
        }
        return wi.J((int)kX.J((I)c2, (XF)b2));
    }

    /*
     * WARNING - void declaration
     */
    public BlockDoublePlant$EnumPlantType J(I i2, XF xF) {
        void a2;
        void b2;
        BlockDoublePlant blockDoublePlant = this;
        Object c2 = b2.J((XF)a2);
        if (c2.J() == blockDoublePlant) {
            c2 = blockDoublePlant.J((IBlockState)c2, (I)b2, (XF)a2);
            return c2.J(VARIANT);
        }
        return BlockDoublePlant$EnumPlantType.FERN;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockDoublePlant a2 = this;
        if ((b2 & Yqa.i) > 0) {
            return a2.J().J(HALF, BlockDoublePlant$EnumBlockHalf.UPPER);
        }
        return a2.J().J(HALF, BlockDoublePlant$EnumBlockHalf.LOWER).J(VARIANT, BlockDoublePlant$EnumPlantType.byMetadata(b2 & XTa.W));
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDoublePlant a2 = this;
        if (b2.J(HALF) == BlockDoublePlant$EnumBlockHalf.UPPER) {
            return Yqa.i | b2.J(field_181084_N).getHorizontalIndex();
        }
        return b2.J(VARIANT).getMeta();
    }

    public BlockDoublePlant() {
        BlockDoublePlant a2;
        BlockDoublePlant blockDoublePlant = a2;
        super(Material.vine);
        blockDoublePlant.J(blockDoublePlant.blockState.J().J(VARIANT, BlockDoublePlant$EnumPlantType.SUNFLOWER).J(HALF, BlockDoublePlant$EnumBlockHalf.LOWER).J(field_181084_N, DZ.NORTH));
        blockDoublePlant.J(JPa.N);
        a2.J(soundTypeGrass);
        a2.f(Ssa.v);
    }

    @Override
    public BlockState J() {
        BlockDoublePlant a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = HALF;
        iPropertyArray[vRa.d] = VARIANT;
        iPropertyArray[uqa.g] = field_181084_N;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF, IBlockState iBlockState) {
        BlockDoublePlant blockDoublePlant = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockDoublePlant a2 = blockDoublePlant;
        return vRa.d != 0;
    }

    @Override
    public void J(I i2, XF xF) {
        Object c2 = xF;
        BlockDoublePlant a2 = this;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockDoublePlant blockDoublePlant = this;
        BlockDoublePlant$EnumPlantType[] b2 = BlockDoublePlant$EnumPlantType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockDoublePlant$EnumPlantType.getMeta()));
            n3 = ++d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, boolean bl) {
        void c2;
        Object e2 = gg2;
        BlockDoublePlant d2 = this;
        if ((e2 = d2.J((I)e2, (XF)c2)) != BlockDoublePlant$EnumPlantType.GRASS && e2 != BlockDoublePlant$EnumPlantType.FERN) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx) {
        BlockDoublePlant blockDoublePlant;
        void a2;
        void c2;
        void b2;
        BlockDoublePlant e2;
        block10: {
            BlockDoublePlant d2;
            block8: {
                block7: {
                    block9: {
                        e2 = gg2;
                        d2 = this;
                        if (b2.J(HALF) != BlockDoublePlant$EnumBlockHalf.UPPER) break block7;
                        if (e2.J(c2.down()).J() != d2) break block8;
                        if (a2.h.f()) break block9;
                        IBlockState iBlockState2 = e2.J(c2.down());
                        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = iBlockState2.J(VARIANT);
                        if (blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.FERN && blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.GRASS) {
                            e2.f(c2.down(), vRa.d != 0);
                        } else if (!((Gg)e2).e) {
                            if (a2.f() != null && a2.f().J() == Gea.ja) {
                                d2.J((Gg)e2, (XF)c2, iBlockState2, (Sx)a2);
                                e2.G(c2.down());
                            } else {
                                e2.f(c2.down(), vRa.d != 0);
                            }
                        } else {
                            e2.G(c2.down());
                        }
                        break block8;
                    }
                    e2.G(c2.down());
                    blockDoublePlant = d2;
                    break block10;
                }
                if (a2.h.f() && e2.J(c2.up()).J() == d2) {
                    e2.J(c2.up(), QFa.HF.J(), uqa.g);
                }
            }
            blockDoublePlant = d2;
        }
        super.J((Gg)e2, (XF)c2, (IBlockState)b2, (Sx)a2);
    }

    static {
        HALF = PropertyEnum.J(Fpa.H, BlockDoublePlant$EnumBlockHalf.class);
        field_181084_N = BlockDirectional.FACING;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void b2;
        BlockDoublePlant a2 = this;
        Object c2 = xF;
        if (super.J((Gg)b2, (XF)((Object)c2)) && b2.J(((XF)((Object)c2)).up())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockDoublePlant b2 = this;
        Object d2 = xF;
        if (!b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2)) {
            BlockDoublePlant blockDoublePlant;
            int n2 = a2.J(HALF) == BlockDoublePlant$EnumBlockHalf.UPPER ? vRa.d : uSa.E;
            Object object = n2 != 0 ? d2 : ((XF)((Object)d2)).up();
            Object object2 = n2 != 0 ? ((XF)((Object)d2)).down() : d2;
            d2 = n2 != 0 ? b2 : c2.J((XF)((Object)object)).J();
            Block block = blockDoublePlant = n2 != 0 ? c2.J((XF)((Object)object2)).J() : b2;
            if (d2 == b2) {
                c2.J((XF)((Object)object), QFa.HF.J(), uqa.g);
            }
            if (blockDoublePlant == b2) {
                c2.J((XF)((Object)object2), QFa.HF.J(), yRa.d);
                if (n2 == 0) {
                    b2.J((Gg)c2, (XF)((Object)object2), (IBlockState)a2, uSa.E);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx, XF xF, IBlockState iBlockState, uY uY2) {
        void c2;
        void b2;
        void e2;
        Sx f2 = sx;
        BlockDoublePlant d2 = this;
        if (e2.e || f2.f() == null || f2.f().J() != Gea.ja || b2.J(HALF) != BlockDoublePlant$EnumBlockHalf.LOWER || !d2.J((Gg)e2, (XF)c2, (IBlockState)b2, f2)) {
            void a2;
            super.J((Gg)e2, f2, (XF)c2, (IBlockState)b2, (uY)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockDoublePlant a2 = this;
        return a2.J((I)b2, (XF)((Object)c2)).getMeta();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void e2;
        XF f2 = xF;
        BlockDoublePlant d2 = this;
        e2.J(f2.up(), d2.J().J(HALF, BlockDoublePlant$EnumBlockHalf.UPPER), uqa.g);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDoublePlant a2 = this;
        if (b2.J(HALF) != BlockDoublePlant$EnumBlockHalf.UPPER && b2.J(VARIANT) != BlockDoublePlant$EnumPlantType.GRASS) {
            return b2.J(VARIANT).getMeta();
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF, BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n3 = n2;
        BlockDoublePlant a2 = this;
        d2.J((XF)c2, a2.J().J(HALF, BlockDoublePlant$EnumBlockHalf.LOWER).J(VARIANT, b2), (int)e2);
        d2.J(c2.up(), a2.J().J(HALF, BlockDoublePlant$EnumBlockHalf.UPPER), (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(Gg gg2, XF xF) {
        void a2;
        Object c2 = gg2;
        BlockDoublePlant b2 = this;
        IBlockState iBlockState = c2.J((XF)a2);
        if (iBlockState.J() != b2) {
            return vRa.d != 0;
        }
        if ((c2 = b2.J(iBlockState, (I)c2, (XF)a2).J(VARIANT)) == BlockDoublePlant$EnumPlantType.FERN || c2 == BlockDoublePlant$EnumPlantType.GRASS) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        Object d2 = iBlockState;
        BlockDoublePlant c2 = this;
        if (d2.J(HALF) == BlockDoublePlant$EnumBlockHalf.UPPER) {
            return null;
        }
        if ((d2 = d2.J(VARIANT)) == BlockDoublePlant$EnumPlantType.FERN) {
            return null;
        }
        if (d2 == BlockDoublePlant$EnumPlantType.GRASS) {
            void b2;
            if (b2.nextInt(Yqa.i) == 0) {
                return Gea.o;
            }
            return null;
        }
        return eAa.J((Block)c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF, IBlockState iBlockState) {
        void d2;
        Object e2 = xF;
        BlockDoublePlant b2 = this;
        BlockDoublePlant blockDoublePlant = b2;
        BlockDoublePlant.J((Gg)d2, (XF)((Object)e2), new Mda((Block)blockDoublePlant, vRa.d, blockDoublePlant.J((I)d2, (XF)((Object)e2)).getMeta()));
    }

    @Override
    public Block$EnumOffsetType J() {
        return Block$EnumOffsetType.XZ;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx) {
        void c2;
        void d2;
        void a2;
        Object e22 = iBlockState;
        BlockDoublePlant b2 = this;
        if ((e22 = e22.J(VARIANT)) != BlockDoublePlant$EnumPlantType.FERN && e22 != BlockDoublePlant$EnumPlantType.GRASS) {
            return uSa.E != 0;
        }
        a2.J(Tz.a[Block.J(b2)]);
        int e22 = (e22 == BlockDoublePlant$EnumPlantType.GRASS ? BlockTallGrass$EnumType.GRASS : BlockTallGrass$EnumType.FERN).getMeta();
        BlockDoublePlant.J((Gg)d2, (XF)c2, new Mda((Block)QFa.y, uqa.g, e22));
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void a2;
        IBlockState b2;
        Object d2 = iBlockState;
        BlockDoublePlant c2 = this;
        if (d2.J(HALF) == BlockDoublePlant$EnumBlockHalf.UPPER && (b2 = b2.J(a2.down())).J() == c2) {
            d2 = d2.J(VARIANT, b2.J(VARIANT));
        }
        return d2;
    }
}

