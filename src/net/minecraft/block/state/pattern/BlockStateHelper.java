/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockStateHelper
implements Predicate<IBlockState> {
    private final BlockState blockstate;
    private final Map<IProperty, Predicate> propertyPredicates;

    /*
     * WARNING - void declaration
     */
    public boolean J(IBlockState iBlockState) {
        void a2;
        BlockStateHelper blockStateHelper = this;
        if (a2 != null && a2.J().equals(blockStateHelper.blockstate.J())) {
            for (Map.Entry<IProperty, Predicate> b2 : blockStateHelper.propertyPredicates.entrySet()) {
                Object t2 = a2.J(b2.getKey());
                if (b2.getValue().apply(t2)) continue;
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static BlockStateHelper J(Block a2) {
        return new BlockStateHelper(a2.f());
    }

    /*
     * WARNING - void declaration
     */
    public <V extends Comparable<V>> BlockStateHelper J(IProperty<V> iProperty, Predicate<? extends V> predicate) {
        void a2;
        IProperty<V> c2 = iProperty;
        BlockStateHelper b2 = this;
        if (!b2.blockstate.J().contains(c2)) {
            throw new IllegalArgumentException(b2.blockstate + LRa.K + c2);
        }
        BlockStateHelper blockStateHelper = b2;
        blockStateHelper.propertyPredicates.put(c2, (Predicate)a2);
        return blockStateHelper;
    }

    private BlockStateHelper(BlockState blockState) {
        BlockState b2 = blockState;
        BlockStateHelper a2 = this;
        a2.propertyPredicates = Maps.newHashMap();
        a2.blockstate = b2;
    }
}

