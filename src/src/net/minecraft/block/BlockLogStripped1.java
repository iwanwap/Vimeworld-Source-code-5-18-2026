/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  eAa
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockLog$EnumAxis;
import net.minecraft.block.BlockLogStripped1$1;
import net.minecraft.block.BlockLogStripped1$2;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockLogStripped1
extends BlockLog {
    public static final PropertyEnum<BlockPlanks$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockPlanks$EnumType.class, new BlockLogStripped1$1());

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLogStripped1 a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    public BlockLogStripped1() {
        BlockLogStripped1 a2;
        BlockLogStripped1 blockLogStripped1 = a2;
        blockLogStripped1.J(blockLogStripped1.blockState.J().J(VARIANT, BlockPlanks$EnumType.OAK).J(LOG_AXIS, BlockLog$EnumAxis.Y));
    }

    @Override
    public BlockState J() {
        BlockLogStripped1 a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = VARIANT;
        iPropertyArray[vRa.d] = LOG_AXIS;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockLogStripped1 blockLogStripped1 = this;
        int b2 = uSa.E;
        b2 |= a2.J(VARIANT).getMetadata();
        switch (BlockLogStripped1$2.$SwitchMap$net$minecraft$block$BlockLog$EnumAxis[((BlockLog$EnumAxis)((Object)a2.J(LOG_AXIS))).ordinal()]) {
            case 1: {
                return b2 |= AQa.P;
            }
            case 2: {
                return b2 |= Yqa.i;
            }
            case 3: {
                b2 |= lqa.s;
                return b2;
            }
        }
        return b2;
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLogStripped1 a2 = this;
        return new Mda(eAa.J((Block)a2), vRa.d, b2.J(VARIANT).getMetadata());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockLogStripped1 a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.OAK.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.SPRUCE.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.BIRCH.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.JUNGLE.getMetadata()));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public IBlockState J(int n2) {
        void a2;
        BlockLogStripped1 blockLogStripped1 = this;
        IBlockState b2 = blockLogStripped1.J().J(VARIANT, BlockPlanks$EnumType.byMetadata((a2 & yRa.d) % AQa.P));
        switch (a2 & lqa.s) {
            case 0: {
                return b2.J(LOG_AXIS, BlockLog$EnumAxis.Y);
            }
            case 4: {
                return b2.J(LOG_AXIS, BlockLog$EnumAxis.X);
            }
            case 8: {
                return b2.J(LOG_AXIS, BlockLog$EnumAxis.Z);
            }
        }
        return b2.J(LOG_AXIS, BlockLog$EnumAxis.NONE);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public MapColor J(IBlockState iBlockState) {
        void a2;
        BlockLogStripped1 blockLogStripped1 = this;
        BlockPlanks$EnumType b2 = a2.J(VARIANT);
        switch (BlockLogStripped1$2.$SwitchMap$net$minecraft$block$BlockLog$EnumAxis[((BlockLog$EnumAxis)((Object)a2.J(LOG_AXIS))).ordinal()]) {
            default: {
                switch (BlockLogStripped1$2.$SwitchMap$net$minecraft$block$BlockPlanks$EnumType[b2.ordinal()]) {
                    default: {
                        return BlockPlanks$EnumType.SPRUCE.func_181070_c();
                    }
                    case 2: {
                        return BlockPlanks$EnumType.DARK_OAK.func_181070_c();
                    }
                    case 3: {
                        return MapColor.quartzColor;
                    }
                    case 4: 
                }
                return BlockPlanks$EnumType.SPRUCE.func_181070_c();
            }
            case 4: 
        }
        return b2.func_181070_c();
    }
}

