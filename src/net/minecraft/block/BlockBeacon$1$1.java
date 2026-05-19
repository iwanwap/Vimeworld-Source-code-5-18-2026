/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cz
 *  QFa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon$1;

public final class BlockBeacon$1$1
implements Runnable {
    public final /* synthetic */ XF val$blockpos;
    public final /* synthetic */ BlockBeacon$1 this$0;

    @Override
    public void run() {
        BlockBeacon$1$1 blockBeacon$1$1 = this;
        BlockBeacon$1$1 a2 = blockBeacon$1$1.this$0.val$worldIn.J(blockBeacon$1$1.val$blockpos);
        if (a2 instanceof Cz) {
            ((Cz)a2).M();
            blockBeacon$1$1.this$0.val$worldIn.f(blockBeacon$1$1.val$blockpos, (Block)QFa.jC, vRa.d, uSa.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    public BlockBeacon$1$1(BlockBeacon$1 blockBeacon$1, XF object) {
        void a2;
        Object b2 = object;
        object = this;
        ((BlockBeacon$1$1)object).this$0 = a2;
        ((BlockBeacon$1$1)object).val$blockpos = b2;
    }
}

