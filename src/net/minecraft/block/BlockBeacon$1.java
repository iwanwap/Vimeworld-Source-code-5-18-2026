/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Faa
 *  Gg
 *  QFa
 *  Tf
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockBeacon$1$1;

public final class BlockBeacon$1
implements Runnable {
    public final /* synthetic */ XF val$glassPos;
    public final /* synthetic */ Gg val$worldIn;

    @Override
    public void run() {
        int n2;
        BlockBeacon$1 blockBeacon$1;
        BlockBeacon$1 blockBeacon$12 = blockBeacon$1 = this;
        Faa faa2 = blockBeacon$1.val$worldIn.J(blockBeacon$12.val$glassPos);
        int n3 = n2 = blockBeacon$12.val$glassPos.getY() - vRa.d;
        while (n3 >= 0) {
            Object a2 = new XF(blockBeacon$1.val$glassPos.getX(), n2, blockBeacon$1.val$glassPos.getZ());
            if (!faa2.J((XF)((Object)a2))) {
                return;
            }
            if (blockBeacon$1.val$worldIn.J((XF)((Object)a2)).J() == QFa.jC) {
                ((Tf)blockBeacon$1.val$worldIn).J((Runnable)new BlockBeacon$1$1(blockBeacon$1, (XF)((Object)a2)));
            }
            n3 = --n2;
        }
    }

    public BlockBeacon$1(Gg gg2, XF object) {
        Object a2 = object;
        object = this;
        ((BlockBeacon$1)object).val$worldIn = gg2;
        ((BlockBeacon$1)object).val$glassPos = a2;
    }
}

