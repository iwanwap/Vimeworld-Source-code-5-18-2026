/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Spa
 *  pqa
 *  uRa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockFenceGate
extends BlockDirectional {
    public static final PropertyBool OPEN = PropertyBool.J(xua.Ga);
    public static final PropertyBool IN_WALL;
    public static final PropertyBool POWERED;

    @Override
    public BlockState J() {
        BlockFenceGate a2;
        IProperty[] iPropertyArray = new IProperty[AQa.P];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = OPEN;
        iPropertyArray[uqa.g] = POWERED;
        iPropertyArray[yRa.d] = IN_WALL;
        return new BlockState(a2, iPropertyArray);
    }

    static {
        POWERED = PropertyBool.J(uRa.M);
        IN_WALL = PropertyBool.J(FRa.L);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void a2;
        void c2;
        boolean bl;
        void d2;
        IBlockState e2 = iBlockState;
        BlockFenceGate b2 = this;
        if (!d2.e && ((bl = d2.k((XF)c2)) || a2.C())) {
            if (bl && !e2.J(OPEN).booleanValue() && !e2.J(POWERED).booleanValue()) {
                void v0 = d2;
                v0.J((XF)c2, e2.J(OPEN, vRa.d != 0).J(POWERED, vRa.d != 0), uqa.g);
                v0.J((Sx)null, Ira.m, (XF)c2, uSa.E);
                return;
            }
            if (!bl && e2.J(OPEN).booleanValue() && e2.J(POWERED).booleanValue()) {
                void v1 = d2;
                v1.J((XF)c2, e2.J(OPEN, uSa.E != 0).J(POWERED, uSa.E != 0), uqa.g);
                v1.J((Sx)null, Spa.f, (XF)c2, uSa.E);
                return;
            }
            if (bl != e2.J(POWERED)) {
                d2.J((XF)c2, e2.J(POWERED, bl), uqa.g);
            }
        }
    }

    public BlockFenceGate(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockFenceGate a2;
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockFenceGate blockFenceGate = a2 = this;
        super(Material.wood, b2.func_181070_c());
        blockFenceGate.J(blockFenceGate.blockState.J().J(OPEN, uSa.E != 0).J(POWERED, uSa.E != 0).J(IN_WALL, uSa.E != 0));
        blockFenceGate.J(yGa.I);
    }

    @Override
    public boolean J(I i2, XF xF, DZ dZ2) {
        Object d2 = dZ2;
        BlockFenceGate a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void b2;
        XF c2 = xF;
        BlockFenceGate a2 = this;
        if (b2.J(c2.down()).J().J().i()) {
            return super.J((Gg)b2, c2);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void b2;
        IBlockState c2;
        XF d2 = xF;
        BlockFenceGate a2 = this;
        RX rX = c2.J(FACING).getAxis();
        if (rX == RX.Z && (BlockCustomWall.WALL_BLOCKS.contains(b2.J(d2.west()).J()) || BlockCustomWall.WALL_BLOCKS.contains(b2.J(d2.east()).J())) || rX == RX.X && (BlockCustomWall.WALL_BLOCKS.contains(b2.J(d2.north()).J()) || BlockCustomWall.WALL_BLOCKS.contains(b2.J(d2.south()).J()))) {
            c2 = c2.J(IN_WALL, vRa.d != 0);
        }
        return c2;
    }

    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockFenceGate i2;
        BlockFenceGate blockFenceGate = blockFenceGate2;
        BlockFenceGate blockFenceGate2 = gl2;
        BlockFenceGate a2 = blockFenceGate;
        return a2.J().J(FACING, i2.J()).J(OPEN, uSa.E != 0).J(POWERED, uSa.E != 0).J(IN_WALL, uSa.E != 0);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
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
        BlockFenceGate blockFenceGate = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getHorizontalIndex();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        if (a2.J(OPEN).booleanValue()) {
            b2 |= AQa.P;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockFenceGate a2 = this;
        if (b2.J((XF)((Object)c2)).J(FACING).getAxis() == RX.Z) {
            a2.J(JPa.N, JPa.N, MRa.K, pqa.r, pqa.r, Jpa.y);
            return;
        }
        a2.J(MRa.K, JPa.N, JPa.N, Jpa.y, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void v4;
        int n2;
        void e2;
        void g;
        void v1;
        void h;
        Object i2 = iBlockState;
        BlockFenceGate f5 = this;
        if (i2.J(OPEN).booleanValue()) {
            i2 = i2.J(OPEN, uSa.E != 0);
            void v0 = h;
            v1 = v0;
            v0.J((XF)g, (IBlockState)i2, uqa.g);
        } else {
            DZ d2 = DZ.fromAngle(e2.X);
            if (i2.J(FACING) == d2.getOpposite()) {
                i2 = i2.J(FACING, d2);
            }
            i2 = i2.J(OPEN, vRa.d != 0);
            void v2 = h;
            v1 = v2;
            v2.J((XF)g, (IBlockState)i2, uqa.g);
        }
        if (i2.J(OPEN).booleanValue()) {
            n2 = Ira.m;
            v4 = g;
        } else {
            n2 = Spa.f;
            v4 = g;
        }
        v1.J((Sx)e2, n2, (XF)v4, uSa.E);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockFenceGate a2 = this;
        return b2.J((XF)((Object)c2)).J(OPEN);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockFenceGate a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2)).J(OPEN, ((b2 & AQa.P) != 0 ? vRa.d : uSa.E) != 0).J(POWERED, ((b2 & Yqa.i) != 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        Object d2 = xF;
        BlockFenceGate b2 = this;
        if (a2.J(OPEN).booleanValue()) {
            return null;
        }
        if (a2.J(FACING).getAxis() == RX.Z) {
            return new xy((double)d2.getX(), (double)d2.getY(), (double)((float)d2.getZ() + MRa.K), (double)(d2.getX() + vRa.d), (double)((float)d2.getY() + Ira.d), (double)((float)d2.getZ() + Jpa.y));
        }
        return new xy((double)((float)d2.getX() + MRa.K), (double)d2.getY(), (double)d2.getZ(), (double)((float)d2.getX() + Jpa.y), (double)((float)d2.getY() + Ira.d), (double)(d2.getZ() + vRa.d));
    }
}

