/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Ypa
 *  uRa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockPressurePlate$1;
import net.minecraft.block.BlockPressurePlate$Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockPressurePlate
extends BlockBasePressurePlate {
    public static final PropertyBool POWERED = PropertyBool.J(uRa.M);
    private final BlockPressurePlate$Sensitivity sensitivity;

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPressurePlate a2 = this;
        return a2.J().J(POWERED, (b2 == vRa.d ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, int n2) {
        void b2;
        int c2 = n2;
        BlockPressurePlate a2 = this;
        return b2.J(POWERED, (c2 > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public BlockState J() {
        BlockPressurePlate a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    public BlockPressurePlate(Material material, BlockPressurePlate$Sensitivity blockPressurePlate$Sensitivity) {
        void b2;
        BlockPressurePlate a2;
        Object c2 = blockPressurePlate$Sensitivity;
        BlockPressurePlate blockPressurePlate = a2 = this;
        super((Material)b2);
        blockPressurePlate.J(blockPressurePlate.blockState.J().J(POWERED, uSa.E != 0));
        blockPressurePlate.sensitivity = c2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int l(Gg gg2, XF xF) {
        List list;
        List list2;
        xy a2;
        Object c2 = gg2;
        BlockPressurePlate b2 = this;
        a2 = b2.J((XF)a2);
        switch (BlockPressurePlate$1.$SwitchMap$net$minecraft$block$BlockPressurePlate$Sensitivity[b2.sensitivity.ordinal()]) {
            case 1: {
                list = list2 = c2.f((vL)null, a2);
                break;
            }
            case 2: {
                list = list2 = c2.J(Gl.class, a2);
                break;
            }
            default: {
                return uSa.E;
            }
        }
        if (!list.isEmpty()) {
            c2 = list2.iterator();
            while (c2.hasNext()) {
                if (((vL)c2.next()).g()) continue;
                return Ypa.A;
            }
        }
        return uSa.E;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPressurePlate a2 = this;
        if (b2.J(POWERED).booleanValue()) {
            return vRa.d;
        }
        return uSa.E;
    }

    @Override
    public int d(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPressurePlate a2 = this;
        if (b2.J(POWERED).booleanValue()) {
            return Ypa.A;
        }
        return uSa.E;
    }
}

