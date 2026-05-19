/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.state;

import com.google.common.base.Function;
import net.minecraft.block.properties.IProperty;

public final class BlockState$1
implements Function<IProperty, String> {
    public String J(IProperty iProperty) {
        IProperty b2 = iProperty;
        BlockState$1 a2 = this;
        if (b2 == null) {
            return gsa.f;
        }
        return b2.J();
    }

    public BlockState$1() {
        BlockState$1 a2;
    }
}

