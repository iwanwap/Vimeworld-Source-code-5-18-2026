/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;

public final class BlockStem$1
implements Predicate<DZ> {
    public BlockStem$1() {
        BlockStem$1 a2;
    }

    public boolean J(DZ dZ2) {
        Object b2 = dZ2;
        BlockStem$1 a2 = this;
        if (b2 != DZ.DOWN) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

