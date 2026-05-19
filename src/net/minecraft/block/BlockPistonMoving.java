/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  Lz
 *  QFa
 *  eAa
 *  nZ
 *  pqa
 *  uY
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPistonMoving
extends BlockContainer {
    public static final PropertyDirection FACING = BlockPistonExtension.FACING;
    public static final PropertyEnum<BlockPistonExtension$EnumPistonType> TYPE = BlockPistonExtension.TYPE;

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        BlockPistonMoving blockPistonMoving = this;
        nZ a2 = blockPistonMoving.J((I)c2, (XF)b2);
        if (a2 == null) {
            return null;
        }
        nZ nZ2 = a2;
        float d2 = nZ2.f(JPa.N);
        if (nZ2.J()) {
            d2 = pqa.r - d2;
        }
        return blockPistonMoving.J((Gg)c2, (XF)b2, a2.J(), d2, a2.J());
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        BlockPistonMoving blockPistonMoving = this;
        BlockPistonMoving d2 = c2.J((XF)b2);
        if (d2 instanceof nZ) {
            ((nZ)d2).l();
            return;
        }
        super.l((Gg)c2, (XF)b2, (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        DZ b2;
        BlockPistonMoving blockPistonMoving = this;
        nZ nZ2 = blockPistonMoving.J((I)b2, (XF)a2);
        if (nZ2 != null) {
            Block block = nZ2.J().J();
            if (block == blockPistonMoving || block.J() == Material.air) {
                return;
            }
            nZ nZ3 = nZ2;
            float c2 = nZ3.f(JPa.N);
            if (nZ3.J()) {
                c2 = pqa.r - c2;
            }
            Block block2 = block;
            block2.J((I)b2, (XF)a2);
            if (block2 == QFa.Nc || block == QFa.bF) {
                c2 = JPa.N;
            }
            b2 = nZ2.J();
            BlockPistonMoving blockPistonMoving2 = blockPistonMoving;
            Block block3 = block;
            BlockPistonMoving blockPistonMoving3 = blockPistonMoving;
            Block block4 = block;
            blockPistonMoving.minX = block4.f() - (double)((float)b2.getFrontOffsetX() * c2);
            blockPistonMoving3.minY = block4.l() - (double)((float)b2.getFrontOffsetY() * c2);
            blockPistonMoving3.minZ = block.d() - (double)((float)b2.getFrontOffsetZ() * c2);
            blockPistonMoving.maxX = block3.J() - (double)((float)b2.getFrontOffsetX() * c2);
            blockPistonMoving2.maxY = block3.C() - (double)((float)b2.getFrontOffsetY() * c2);
            blockPistonMoving2.maxZ = block.e() - (double)((float)b2.getFrontOffsetZ() * c2);
        }
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockPistonMoving a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockPistonMoving i2 = gg2;
        BlockPistonMoving h2 = this;
        if (!((Gg)i2).e && i2.J((XF)g2) == null) {
            i2.G((XF)g2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockPistonMoving a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = TYPE;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        BlockPistonMoving e2 = gg2;
        BlockPistonMoving d2 = this;
        if (!((Gg)e2).e) {
            void c2;
            e2.J((XF)c2);
        }
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockPistonMoving a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        void d2;
        void e2;
        Object f3 = iBlockState;
        BlockPistonMoving c2 = this;
        if (!e2.e && (f3 = c2.J((I)e2, (XF)d2)) != null) {
            f3 = f3.J();
            f3.J().J((Gg)e2, (XF)d2, (IBlockState)f3, uSa.E);
        }
    }

    @Override
    public boolean J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockPistonMoving a2 = this;
        return uSa.E != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockPistonMoving a2 = this;
        return null;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockPistonMoving blockPistonMoving = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (a2.J(TYPE) == BlockPistonExtension$EnumPistonType.STICKY) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static uY J(IBlockState iBlockState, DZ dZ2, boolean bl, boolean bl2) {
        void b2;
        void c2;
        boolean d2 = bl2;
        IBlockState a2 = iBlockState;
        return new nZ(a2, (DZ)c2, (boolean)b2, d2);
    }

    public BlockPistonMoving() {
        BlockPistonMoving a2;
        BlockPistonMoving blockPistonMoving = a2;
        super(Material.piston);
        blockPistonMoving.J(blockPistonMoving.blockState.J().J(FACING, DZ.NORTH).J(TYPE, BlockPistonExtension$EnumPistonType.DEFAULT));
        blockPistonMoving.J(vqa.T);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPistonMoving a2 = this;
        return a2.J().J(FACING, BlockPistonExtension.J(b2)).J(TYPE, (b2 & Yqa.i) > 0 ? BlockPistonExtension$EnumPistonType.STICKY : BlockPistonExtension$EnumPistonType.DEFAULT);
    }

    /*
     * WARNING - void declaration
     */
    private nZ J(I i2, XF xF2) {
        void a2;
        BlockPistonMoving c2 = i2;
        BlockPistonMoving b2 = this;
        if ((c2 = c2.J((XF)a2)) instanceof nZ) {
            return (nZ)c2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        IBlockState a2;
        Object d2 = xF2;
        BlockPistonMoving b2 = this;
        if ((a2 = c2.J((XF)((Object)(d2 = ((XF)((Object)d2)).offset(a2.J(FACING).getOpposite()))))).J() instanceof BlockPistonBase && a2.J(BlockPistonBase.EXTENDED).booleanValue()) {
            c2.G((XF)((Object)d2));
        }
    }

    @Override
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        BlockPistonMoving blockPistonMoving = blockPistonMoving2;
        BlockPistonMoving blockPistonMoving2 = lz3;
        BlockPistonMoving a2 = blockPistonMoving;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, DZ dZ2) {
        void c2;
        BlockPistonMoving blockPistonMoving = dZ3;
        DZ dZ3 = dZ2;
        BlockPistonMoving a2 = blockPistonMoving;
        if (c2.J() != a2 && c2.J().J() != Material.air) {
            DZ dZ4;
            DZ dZ5;
            void b2;
            DZ f3;
            void d2;
            xy e2;
            e2 = c2.J().J((Gg)e2, (XF)d2, (IBlockState)c2);
            if (e2 == null) {
                return null;
            }
            xy xy2 = e2;
            double d3 = xy2.J;
            double d4 = xy2.j;
            double d5 = xy2.I;
            double d6 = xy2.A;
            double d7 = xy2.M;
            double d8 = xy2.k;
            if (f3.getFrontOffsetX() < 0) {
                d3 -= (double)((float)f3.getFrontOffsetX() * b2);
                dZ5 = f3;
            } else {
                d6 -= (double)((float)f3.getFrontOffsetX() * b2);
                dZ5 = f3;
            }
            if (dZ5.getFrontOffsetY() < 0) {
                d4 -= (double)((float)f3.getFrontOffsetY() * b2);
                dZ4 = f3;
            } else {
                d7 -= (double)((float)f3.getFrontOffsetY() * b2);
                dZ4 = f3;
            }
            if (dZ4.getFrontOffsetZ() < 0) {
                d5 -= (double)((float)f3.getFrontOffsetZ() * b2);
            } else {
                d8 -= (double)((float)f3.getFrontOffsetZ() * b2);
            }
            return new xy(d3, d4, d5, d6, d7, d8);
        }
        return null;
    }

    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockPistonMoving a2 = this;
        return uSa.E != 0;
    }
}

