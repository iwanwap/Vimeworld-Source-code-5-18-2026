/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockFlower;

public final class BlockFlower$EnumFlowerColor
extends Enum<BlockFlower$EnumFlowerColor> {
    public static final /* enum */ BlockFlower$EnumFlowerColor YELLOW = new BlockFlower$EnumFlowerColor();
    private static final /* synthetic */ BlockFlower$EnumFlowerColor[] $VALUES;
    public static final /* enum */ BlockFlower$EnumFlowerColor RED = new BlockFlower$EnumFlowerColor();

    static {
        BlockFlower$EnumFlowerColor[] blockFlower$EnumFlowerColorArray = new BlockFlower$EnumFlowerColor[uqa.g];
        blockFlower$EnumFlowerColorArray[uSa.E] = YELLOW;
        blockFlower$EnumFlowerColorArray[vRa.d] = RED;
        $VALUES = blockFlower$EnumFlowerColorArray;
    }

    public BlockFlower getBlock() {
        BlockFlower$EnumFlowerColor a2;
        if (a2 == YELLOW) {
            return QFa.zc;
        }
        return QFa.l;
    }

    public static BlockFlower$EnumFlowerColor valueOf(String a2) {
        return Enum.valueOf(BlockFlower$EnumFlowerColor.class, a2);
    }

    public static BlockFlower$EnumFlowerColor[] values() {
        return (BlockFlower$EnumFlowerColor[])$VALUES.clone();
    }

    private BlockFlower$EnumFlowerColor() {
        int a2 = n2;
        BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor = this;
    }
}

