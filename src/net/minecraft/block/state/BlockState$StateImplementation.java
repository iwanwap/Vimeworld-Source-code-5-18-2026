/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  lPa
 *  vRa
 *  zTa
 */
package net.minecraft.block.state;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState$1;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;

public final class BlockState$StateImplementation
extends BlockStateBase {
    private ImmutableTable<IProperty, Comparable, IBlockState> propertyValueTable;
    private final Block block;
    private final ImmutableMap<IProperty, Comparable> properties;

    /*
     * WARNING - void declaration
     */
    private BlockState$StateImplementation(Block block, ImmutableMap<IProperty, Comparable> immutableMap) {
        void b2;
        BlockState$StateImplementation a2;
        ImmutableMap<IProperty, Comparable> c2 = immutableMap;
        BlockState$StateImplementation blockState$StateImplementation = a2 = this;
        blockState$StateImplementation.block = b2;
        blockState$StateImplementation.properties = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Map<Map<IProperty, Comparable>, BlockState$StateImplementation> map) {
        BlockState$StateImplementation blockState$StateImplementation = this;
        if (blockState$StateImplementation.propertyValueTable != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (Object b2 : blockState$StateImplementation.properties.keySet()) {
            for (Comparable comparable : b2.J()) {
                void a2;
                if (comparable == blockState$StateImplementation.properties.get(b2)) continue;
                hashBasedTable.put(b2, comparable, a2.get(blockState$StateImplementation.J((IProperty)b2, comparable)));
            }
        }
        blockState$StateImplementation.propertyValueTable = ImmutableTable.copyOf(hashBasedTable);
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <T extends Comparable<T>, V extends T> IBlockState J(IProperty<T> iProperty, V v2) {
        void a2;
        IProperty<T> c2 = iProperty;
        BlockState$StateImplementation b2 = this;
        if (!b2.properties.containsKey(c2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, FTa.w).append(c2).append(zTa.Ja).append(b2.block.f()).toString());
        }
        if (!c2.J().contains(a2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, FTa.w).append(c2).append(rua.I).append(a2).append(vsa.j).append(Block.blockRegistry.f(b2.block)).append(zOa.E).toString());
        }
        if (b2.properties.get(c2) == a2) {
            return b2;
        }
        return (IBlockState)b2.propertyValueTable.get(c2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ BlockState$StateImplementation(Block block, ImmutableMap immutableMap, BlockState$1 blockState$1) {
        void c2;
        ImmutableMap d2 = immutableMap;
        BlockState$StateImplementation b2 = this;
        b2((Block)c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    private Map<IProperty, Comparable> J(IProperty iProperty, Comparable comparable) {
        void b2;
        Comparable c2 = comparable;
        BlockState$StateImplementation a2 = this;
        HashMap<IProperty, Comparable> hashMap = Maps.newHashMap(a2.properties);
        hashMap.put((IProperty)b2, c2);
        return hashMap;
    }

    @Override
    public ImmutableMap<IProperty, Comparable> J() {
        BlockState$StateImplementation a2;
        return a2.properties;
    }

    @Override
    public Block J() {
        BlockState$StateImplementation a2;
        return a2.block;
    }

    @Override
    public Collection<IProperty> J() {
        BlockState$StateImplementation a2;
        return Collections.unmodifiableCollection(a2.properties.keySet());
    }

    public int hashCode() {
        BlockState$StateImplementation a2;
        return a2.properties.hashCode();
    }

    @Override
    public <T extends Comparable<T>> T J(IProperty<T> iProperty) {
        IProperty<T> b2 = iProperty;
        BlockState$StateImplementation a2 = this;
        if (!a2.properties.containsKey(b2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, lPa.Ia).append(b2).append(zTa.Ja).append(a2.block.f()).toString());
        }
        return (T)((Comparable)b2.J().cast(a2.properties.get(b2)));
    }
}

