/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.state;

import java.util.Comparator;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;

public final class BlockState$2
implements Comparator<IProperty> {
    public final /* synthetic */ BlockState this$0;

    /*
     * WARNING - void declaration
     */
    public int J(IProperty iProperty, IProperty iProperty2) {
        void b2;
        IProperty c2 = iProperty2;
        BlockState$2 a2 = this;
        return b2.J().compareTo(c2.J());
    }

    public BlockState$2(BlockState blockState) {
        BlockState b2 = blockState;
        BlockState$2 a2 = this;
        a2.this$0 = b2;
    }
}

