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

public final class BlockGlazedTerracotta3
extends BlockGlazedTerracotta {
    public static final PropertyEnum<iea> COLOR;

    public BlockGlazedTerracotta3() {
        BlockGlazedTerracotta3 a2;
        BlockGlazedTerracotta3 blockGlazedTerracotta3 = a2;
        blockGlazedTerracotta3.J(blockGlazedTerracotta3.blockState.J().J(FACING, DZ.NORTH).J(COLOR, iea.SILVER));
    }

    static {
        iea[] ieaArray = new iea[AQa.P];
        ieaArray[uSa.E] = iea.SILVER;
        ieaArray[vRa.d] = iea.CYAN;
        ieaArray[uqa.g] = iea.PURPLE;
        ieaArray[yRa.d] = iea.BLUE;
        COLOR = PropertyEnum.J((String)Zra.L, iea.class, (Enum[])ieaArray);
    }

    @Override
    public IProperty<iea> J() {
        return COLOR;
    }

    @Override
    public int d() {
        return Yqa.i;
    }
}

