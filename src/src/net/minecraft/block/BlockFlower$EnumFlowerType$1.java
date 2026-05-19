/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class BlockFlower$EnumFlowerType$1
implements Predicate<BlockFlower$EnumFlowerType> {
    public final /* synthetic */ BlockFlower$EnumFlowerColor val$blockflower$enumflowercolor;

    public boolean J(BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        BlockFlower$EnumFlowerType b2 = blockFlower$EnumFlowerType;
        BlockFlower$EnumFlowerType$1 a2 = this;
        if (b2.getBlockType() == a2.val$blockflower$enumflowercolor) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockFlower$EnumFlowerType$1(BlockFlower$EnumFlowerColor object) {
        Object a2 = object;
        object = this;
        ((BlockFlower$EnumFlowerType$1)object).val$blockflower$enumflowercolor = a2;
    }
}

