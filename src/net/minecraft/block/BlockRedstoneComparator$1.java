/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockRedstoneComparator;

public final class BlockRedstoneComparator$1
implements Predicate<vL> {
    public final /* synthetic */ BlockRedstoneComparator this$0;
    public final /* synthetic */ DZ val$facing;

    public boolean J(vL vL2) {
        BlockRedstoneComparator$1 b2 = vL2;
        BlockRedstoneComparator$1 a2 = this;
        if (b2 != null && b2.J() == a2.val$facing) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockRedstoneComparator$1(BlockRedstoneComparator blockRedstoneComparator, DZ object) {
        void a2;
        Object b2 = object;
        object = this;
        ((BlockRedstoneComparator$1)object).this$0 = a2;
        ((BlockRedstoneComparator$1)object).val$facing = b2;
    }
}

