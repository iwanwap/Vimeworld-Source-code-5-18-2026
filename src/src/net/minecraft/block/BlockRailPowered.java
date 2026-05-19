/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  XTa
 *  uRa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailPowered$1;
import net.minecraft.block.BlockRailPowered$2;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockRailPowered
extends BlockRailBase {
    public static final PropertyBool POWERED;
    public static final PropertyEnum<BlockRailBase$EnumRailDirection> SHAPE;

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRailPowered a2 = this;
        return a2.J().J(SHAPE, BlockRailBase$EnumRailDirection.byMetadata(b2 & XTa.W)).J(POWERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    public BlockRailPowered() {
        BlockRailPowered a2;
        BlockRailPowered blockRailPowered = a2;
        super(vRa.d != 0);
        blockRailPowered.J(blockRailPowered.blockState.J().J(SHAPE, BlockRailBase$EnumRailDirection.NORTH_SOUTH).J(POWERED, uSa.E != 0));
    }

    static {
        SHAPE = PropertyEnum.J(TOa.S, BlockRailBase$EnumRailDirection.class, new BlockRailPowered$1());
        POWERED = PropertyBool.J(uRa.M);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl, int n2) {
        void e2;
        BlockRailPowered blockRailPowered;
        void b2;
        void d22;
        void a2;
        void var3_12;
        void f22 = var3_12;
        BlockRailPowered c2 = this;
        if (a2 >= Yqa.i) {
            return uSa.E != 0;
        }
        void v0 = d22;
        int d22 = v0.getX();
        int n3 = v0.getY();
        int n4 = v0.getZ();
        int n5 = vRa.d;
        BlockRailBase$EnumRailDirection f22 = f22.J(SHAPE);
        switch (BlockRailPowered$2.$SwitchMap$net$minecraft$block$BlockRailBase$EnumRailDirection[f22.ordinal()]) {
            case 1: {
                if (b2 != false) {
                    blockRailPowered = c2;
                    ++n4;
                    break;
                }
                --n4;
                blockRailPowered = c2;
                break;
            }
            case 2: {
                if (b2 != false) {
                    blockRailPowered = c2;
                    --d22;
                    break;
                }
                ++d22;
                blockRailPowered = c2;
                break;
            }
            case 3: {
                if (b2 != false) {
                    --d22;
                } else {
                    ++d22;
                    n5 = uSa.E;
                    ++n3;
                }
                f22 = BlockRailBase$EnumRailDirection.EAST_WEST;
                blockRailPowered = c2;
                break;
            }
            case 4: {
                if (b2 != false) {
                    ++n3;
                    n5 = uSa.E;
                    --d22;
                } else {
                    ++d22;
                }
                f22 = BlockRailBase$EnumRailDirection.EAST_WEST;
                blockRailPowered = c2;
                break;
            }
            case 5: {
                if (b2 != false) {
                    ++n4;
                } else {
                    --n4;
                    n5 = uSa.E;
                    ++n3;
                }
                f22 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
                blockRailPowered = c2;
                break;
            }
            case 6: {
                if (b2 != false) {
                    ++n3;
                    n5 = uSa.E;
                    ++n4;
                } else {
                    --n4;
                }
                f22 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
            }
            default: {
                blockRailPowered = c2;
            }
        }
        void v2 = e2;
        if (blockRailPowered.J((Gg)e2, new XF(d22, n3, n4), (boolean)b2, (int)a2, (BlockRailBase$EnumRailDirection)f22)) {
            return vRa.d != 0;
        }
        if (n5 != 0 && c2.J((Gg)e2, new XF(d22, n3 - vRa.d, n4), (boolean)b2, (int)a2, (BlockRailBase$EnumRailDirection)f22)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        int n2;
        void b2;
        XF e2 = xF2;
        BlockRailPowered c2 = this;
        int a2 = b2.J(POWERED).booleanValue();
        int n3 = n2 = d2.k(e2) || c2.J((Gg)d2, e2, (IBlockState)b2, vRa.d != 0, uSa.E) || c2.J((Gg)d2, e2, (IBlockState)b2, uSa.E != 0, uSa.E) ? vRa.d : uSa.E;
        if (n2 != a2) {
            void v1 = b2;
            d2.J(e2, v1.J(POWERED, n2 != 0), yRa.d);
            d2.f(e2.down(), (Block)c2);
            if (v1.J(SHAPE).isAscending()) {
                d2.f(e2.up(), (Block)c2);
            }
        }
    }

    @Override
    public BlockState J() {
        BlockRailPowered a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = SHAPE;
        iPropertyArray[vRa.d] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IProperty<BlockRailBase$EnumRailDirection> J() {
        return SHAPE;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, boolean bl, int n2, BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection) {
        void a2;
        void d2;
        void e2;
        BlockRailPowered blockRailPowered = this;
        IBlockState iBlockState = e2.J((XF)d2);
        if (iBlockState.J() != blockRailPowered) {
            return uSa.E != 0;
        }
        Object f2 = iBlockState.J(SHAPE);
        if (a2 != BlockRailBase$EnumRailDirection.EAST_WEST || f2 != BlockRailBase$EnumRailDirection.NORTH_SOUTH && f2 != BlockRailBase$EnumRailDirection.ASCENDING_NORTH && f2 != BlockRailBase$EnumRailDirection.ASCENDING_SOUTH) {
            if (a2 != BlockRailBase$EnumRailDirection.NORTH_SOUTH || f2 != BlockRailBase$EnumRailDirection.EAST_WEST && f2 != BlockRailBase$EnumRailDirection.ASCENDING_EAST && f2 != BlockRailBase$EnumRailDirection.ASCENDING_WEST) {
                if (iBlockState.J(POWERED).booleanValue()) {
                    void b2;
                    void c2;
                    if (e2.k((XF)d2)) {
                        return vRa.d != 0;
                    }
                    return blockRailPowered.J((Gg)e2, (XF)d2, iBlockState, (boolean)c2, (int)(b2 + vRa.d));
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockRailPowered blockRailPowered = this;
        int b2 = uSa.E;
        b2 |= a2.J(SHAPE).getMetadata();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }
}

