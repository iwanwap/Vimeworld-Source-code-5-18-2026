/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Lz
 *  MQa
 *  NPa
 *  QFa
 *  Spa
 *  ez
 *  pqa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor$1;
import net.minecraft.block.BlockTrapDoor$DoorHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockTrapDoor
extends Block {
    public static final PropertyEnum<BlockTrapDoor$DoorHalf> HALF;
    public static final PropertyBool OPEN;
    public static final PropertyDirection FACING;

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockTrapDoor a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = OPEN;
        iPropertyArray[uqa.g] = HALF;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2) {
        void b2;
        BlockTrapDoor a2;
        Object c2 = xF2;
        BlockTrapDoor blockTrapDoor = a2 = this;
        blockTrapDoor.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void f5;
        Object i2 = gg2;
        BlockTrapDoor h2 = this;
        i2 = h2.J();
        if (f5.getAxis().isHorizontal()) {
            void d2;
            i2 = i2.J(FACING, f5).J(OPEN, uSa.E != 0);
            i2 = i2.J(HALF, d2 > MQa.L ? BlockTrapDoor$DoorHalf.TOP : BlockTrapDoor$DoorHalf.BOTTOM);
        }
        return i2;
    }

    public void f(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockTrapDoor a2 = this;
        if (b2.J() == a2) {
            Boolean bl2;
            int n2 = b2.J(HALF) == BlockTrapDoor$DoorHalf.TOP ? vRa.d : uSa.E;
            Boolean bl3 = b2.J(OPEN);
            b2 = b2.J(FACING);
            if (n2 != 0) {
                bl2 = bl3;
                a2.J(JPa.N, rta.R, JPa.N, pqa.r, pqa.r, pqa.r);
            } else {
                a2.J(JPa.N, JPa.N, JPa.N, pqa.r, sqa.Z, pqa.r);
                bl2 = bl3;
            }
            if (bl2.booleanValue()) {
                if (b2 == DZ.NORTH) {
                    a2.J(JPa.N, JPa.N, rta.R, pqa.r, pqa.r, pqa.r);
                }
                if (b2 == DZ.SOUTH) {
                    a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, sqa.Z);
                }
                if (b2 == DZ.WEST) {
                    a2.J(rta.R, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                }
                if (b2 == DZ.EAST) {
                    a2.J(JPa.N, JPa.N, JPa.N, sqa.Z, pqa.r, pqa.r);
                }
            }
        }
    }

    public static DZ J(int a2) {
        switch (a2 & yRa.d) {
            case 0: {
                while (false) {
                }
                return DZ.NORTH;
            }
            case 1: {
                return DZ.SOUTH;
            }
            case 2: {
                return DZ.WEST;
            }
            default: {
                return DZ.EAST;
            }
        }
    }

    public BlockTrapDoor(Material material) {
        BlockTrapDoor a2;
        Material b2 = material;
        BlockTrapDoor blockTrapDoor = a2 = this;
        super(b2);
        blockTrapDoor.J(blockTrapDoor.blockState.J().J(FACING, DZ.NORTH).J(OPEN, uSa.E != 0).J(HALF, BlockTrapDoor$DoorHalf.BOTTOM));
        blockTrapDoor.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        blockTrapDoor.J(yGa.I);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockTrapDoor a2 = this;
        a2.f(b2.J((XF)((Object)c2)));
    }

    @Override
    public void f() {
        BlockTrapDoor a2;
        a2.J(JPa.N, fta.D, JPa.N, pqa.r, NPa.E, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        void a2;
        void b2;
        void d2;
        BlockTrapDoor c2;
        Object e2 = xF2;
        BlockTrapDoor blockTrapDoor = c2 = this;
        blockTrapDoor.J((I)d2, (XF)((Object)e2));
        return super.J((Gg)d2, (XF)((Object)e2), (Lz)b2, (Lz)a2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockTrapDoor blockTrapDoor = this;
        int b2 = uSa.E;
        b2 |= BlockTrapDoor.J(a2.J(FACING));
        if (a2.J(OPEN).booleanValue()) {
            b2 |= AQa.P;
        }
        if (a2.J(HALF) == BlockTrapDoor$DoorHalf.TOP) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockTrapDoor b2;
        Object d2 = xF2;
        BlockTrapDoor blockTrapDoor = b2 = this;
        blockTrapDoor.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        DZ d2 = dZ2;
        BlockTrapDoor a2 = this;
        if (!d2.getAxis().isVertical() && BlockTrapDoor.f(c2.J(b2.offset(d2.getOpposite())).J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
        OPEN = PropertyBool.J(xua.Ga);
        HALF = PropertyEnum.J(Fpa.H, BlockTrapDoor$DoorHalf.class);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockTrapDoor a2 = this;
        return a2.J().J(FACING, BlockTrapDoor.J(b2)).J(OPEN, ((b2 & AQa.P) != 0 ? vRa.d : uSa.E) != 0).J(HALF, (b2 & Yqa.i) == 0 ? BlockTrapDoor$DoorHalf.BOTTOM : BlockTrapDoor$DoorHalf.TOP);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockTrapDoor a2 = this;
        if (!b2.J((XF)((Object)c2)).J(OPEN).booleanValue()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        XF e2 = xF2;
        BlockTrapDoor c2 = this;
        if (!d2.e) {
            void a2;
            void b2;
            XF xF3 = e2.offset(b2.J(FACING).getOpposite());
            if (!BlockTrapDoor.f(d2.J(xF3).J())) {
                d2.G(e2);
                c2.J((Gg)d2, e2, (IBlockState)b2, uSa.E);
                return;
            }
            boolean bl2 = d2.k(e2);
            if ((bl2 || a2.C()) && b2.J(OPEN) != bl2) {
                XF xF4;
                int n2;
                void v0 = d2;
                v0.J(e2, b2.J(OPEN, bl2), uqa.g);
                Sx sx2 = null;
                if (bl2) {
                    n2 = Ira.m;
                    xF4 = e2;
                } else {
                    n2 = Spa.f;
                    xF4 = e2;
                }
                v0.J(sx2, n2, xF4, uSa.E);
            }
        }
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    private static boolean f(Block a2) {
        if (a2.blockMaterial.J() && a2.l() || a2 == QFa.rc || a2 instanceof BlockSlab || a2 instanceof BlockStairs) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void e2;
        void v2;
        int n2;
        void g2;
        void h2;
        Object i2 = iBlockState;
        BlockTrapDoor f5 = this;
        if (f5.blockMaterial == Material.iron) {
            return vRa.d != 0;
        }
        i2 = i2.J(OPEN);
        void v0 = h2;
        v0.J((XF)g2, (IBlockState)i2, uqa.g);
        if (i2.J(OPEN).booleanValue()) {
            n2 = Ira.m;
            v2 = g2;
        } else {
            n2 = Spa.f;
            v2 = g2;
        }
        v0.J((Sx)e2, n2, (XF)v2, uSa.E);
        return vRa.d != 0;
    }

    public static int J(DZ a2) {
        switch (BlockTrapDoor$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                while (false) {
                }
                return uSa.E;
            }
            case 2: {
                return vRa.d;
            }
            case 3: {
                return uqa.g;
            }
            default: {
                return yRa.d;
            }
        }
    }
}

