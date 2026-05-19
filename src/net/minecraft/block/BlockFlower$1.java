/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class BlockFlower$1
implements Predicate<BlockFlower$EnumFlowerType> {
    public final /* synthetic */ BlockFlower this$0;

    public BlockFlower$1(BlockFlower blockFlower) {
        BlockFlower b2 = blockFlower;
        BlockFlower$1 a2 = this;
        a2.this$0 = b2;
    }

    public boolean J(BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        BlockFlower$EnumFlowerType b2 = blockFlower$EnumFlowerType;
        BlockFlower$1 a2 = this;
        if (b2.getBlockType() == a2.this$0.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

