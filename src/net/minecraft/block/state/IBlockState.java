/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.state;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;

public interface IBlockState {
    public ImmutableMap<IProperty, Comparable> J();

    public Collection<IProperty> J();

    public <T extends Comparable<T>> T J(IProperty<T> var1);

    public Block J();

    public <T extends Comparable<T>, V extends T> IBlockState J(IProperty<T> var1, V var2);

    public <T extends Comparable<T>> IBlockState J(IProperty<T> var1);
}

