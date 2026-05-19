/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;

public final class BlockPumpkin$1
implements Predicate<IBlockState> {
    public BlockPumpkin$1() {
        BlockPumpkin$1 a2;
    }

    public boolean J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPumpkin$1 a2 = this;
        if (b2 != null && (b2.J() == QFa.s || b2.J() == QFa.NC)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

