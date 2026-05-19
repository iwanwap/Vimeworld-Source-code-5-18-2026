/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  iea
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockGlazedTerracotta;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;

public final class BlockGlazedTerracotta4
extends BlockGlazedTerracotta {
    public static final PropertyEnum<iea> COLOR;

    @Override
    public int d() {
        return lqa.s;
    }

    public BlockGlazedTerracotta4() {
        BlockGlazedTerracotta4 a2;
        BlockGlazedTerracotta4 blockGlazedTerracotta4 = a2;
        blockGlazedTerracotta4.J(blockGlazedTerracotta4.blockState.J().J(FACING, DZ.NORTH).J(COLOR, iea.BROWN));
    }

    static {
        iea[] ieaArray = new iea[AQa.P];
        ieaArray[uSa.E] = iea.BROWN;
        ieaArray[vRa.d] = iea.GREEN;
        ieaArray[uqa.g] = iea.RED;
        ieaArray[yRa.d] = iea.BLACK;
        COLOR = PropertyEnum.J((String)Zra.L, iea.class, (Enum[])ieaArray);
    }

    @Override
    public IProperty<iea> J() {
        return COLOR;
    }
}

