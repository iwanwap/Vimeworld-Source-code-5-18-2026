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

public final class BlockGlazedTerracotta2
extends BlockGlazedTerracotta {
    public static final PropertyEnum<iea> COLOR;

    static {
        iea[] ieaArray = new iea[AQa.P];
        ieaArray[uSa.E] = iea.YELLOW;
        ieaArray[vRa.d] = iea.LIME;
        ieaArray[uqa.g] = iea.PINK;
        ieaArray[yRa.d] = iea.GRAY;
        COLOR = PropertyEnum.J((String)Zra.L, iea.class, (Enum[])ieaArray);
    }

    @Override
    public int d() {
        return AQa.P;
    }

    @Override
    public IProperty<iea> J() {
        return COLOR;
    }

    public BlockGlazedTerracotta2() {
        BlockGlazedTerracotta2 a2;
        BlockGlazedTerracotta2 blockGlazedTerracotta2 = a2;
        blockGlazedTerracotta2.J(blockGlazedTerracotta2.blockState.J().J(FACING, DZ.NORTH).J(COLOR, iea.YELLOW));
    }
}

