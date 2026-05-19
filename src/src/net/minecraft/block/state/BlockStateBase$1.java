/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.state;

import com.google.common.base.Function;
import java.util.Map;
import net.minecraft.block.properties.IProperty;

public final class BlockStateBase$1
implements Function {
    private static final String __OBFID = "CL_00002031";

    /*
     * WARNING - void declaration
     */
    public String J(Map.Entry entry) {
        void a2;
        BlockStateBase$1 blockStateBase$1 = this;
        if (a2 == null) {
            return gsa.f;
        }
        IProperty b2 = (IProperty)a2.getKey();
        return new StringBuilder().insert(5 >> 3, b2.J()).append(vTa.S).append(b2.J((Comparable)a2.getValue())).toString();
    }

    public Object apply(Object object) {
        Object b2 = object;
        BlockStateBase$1 a2 = this;
        return a2.J((Map.Entry)b2);
    }

    public BlockStateBase$1() {
        BlockStateBase$1 a2;
    }
}

