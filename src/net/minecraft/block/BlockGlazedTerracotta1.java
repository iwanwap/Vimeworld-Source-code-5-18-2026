/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  iea
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockGlazedTerracotta;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;

public final class BlockGlazedTerracotta1
extends BlockGlazedTerracotta {
    public static final PropertyEnum<iea> COLOR;

    @Override
    public int d() {
        return uSa.E;
    }

    @Override
    public IProperty<iea> J() {
        return COLOR;
    }

    static {
        iea[] ieaArray = new iea[AQa.P];
        ieaArray[uSa.E] = iea.WHITE;
        ieaArray[vRa.d] = iea.ORANGE;
        ieaArray[uqa.g] = iea.MAGENTA;
        ieaArray[yRa.d] = iea.LIGHT_BLUE;
        COLOR = PropertyEnum.J((String)Zra.L, iea.class, (Enum[])ieaArray);
    }

    public BlockGlazedTerracotta1() {
        BlockGlazedTerracotta1 a2;
        BlockGlazedTerracotta1 blockGlazedTerracotta1 = a2;
        blockGlazedTerracotta1.J(blockGlazedTerracotta1.blockState.J().J(FACING, DZ.NORTH).J(COLOR, iea.WHITE));
    }
}

