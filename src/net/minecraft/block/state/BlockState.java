/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  Wz
 *  ey
 */
package net.minecraft.block.state;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState$1;
import net.minecraft.block.state.BlockState$2;
import net.minecraft.block.state.BlockState$StateImplementation;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockState {
    private final Block block;
    private final ImmutableList<IBlockState> validStates;
    private static final Function<IProperty, String> GET_NAME_FUNC;
    private static final Joiner COMMA_JOINER;
    private final ImmutableList<IProperty> properties;

    /*
     * WARNING - void declaration
     */
    public BlockState(Block block, IProperty ... iPropertyArray) {
        Object object;
        void b2;
        LinkedHashMap<Map<IProperty, Comparable>, BlockState$StateImplementation> a2;
        BlockState blockState = this;
        void v0 = a2;
        blockState.block = b2;
        void v1 = a2;
        Arrays.sort(v0, new BlockState$2(blockState));
        blockState.properties = ImmutableList.copyOf(v0);
        a2 = Maps.newLinkedHashMap();
        ArrayList<BlockState$StateImplementation> arrayList = Lists.newArrayList();
        Iterator c2 = ey.J(blockState.J()).iterator();
        Iterator<Object> iterator = c2;
        while (iterator.hasNext()) {
            object = (List)c2.next();
            Map map = Wz.J(blockState.properties, (Iterable)object);
            BlockState$StateImplementation blockState$StateImplementation = new BlockState$StateImplementation((Block)b2, ImmutableMap.copyOf(map), null);
            iterator = c2;
            a2.put(map, blockState$StateImplementation);
            arrayList.add(blockState$StateImplementation);
        }
        Iterator iterator2 = c2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            object = (BlockState$StateImplementation)c2.next();
            iterator2 = c2;
            ((BlockState$StateImplementation)object).J(a2);
        }
        blockState.validStates = ImmutableList.copyOf(arrayList);
    }

    public ImmutableList<IBlockState> J() {
        BlockState a2;
        return a2.validStates;
    }

    public Block J() {
        BlockState a2;
        return a2.block;
    }

    public String toString() {
        BlockState a2;
        return Objects.toStringHelper(a2).add(Lra.M, Block.blockRegistry.f(a2.block)).add(gua.k, Iterables.transform(a2.properties, GET_NAME_FUNC)).toString();
    }

    static {
        COMMA_JOINER = Joiner.on(TOa.n);
        GET_NAME_FUNC = new BlockState$1();
    }

    private List<Iterable<Comparable>> J() {
        int a2;
        BlockState blockState = this;
        ArrayList<Iterable<Comparable>> arrayList = Lists.newArrayList();
        int n2 = a2 = uSa.E;
        while (n2 < blockState.properties.size()) {
            Object e2 = blockState.properties.get(a2);
            arrayList.add(((IProperty)e2).J());
            n2 = ++a2;
        }
        return arrayList;
    }

    public Collection<IProperty> J() {
        BlockState a2;
        return a2.properties;
    }

    public IBlockState J() {
        BlockState a2;
        return (IBlockState)a2.validStates.get(uSa.E);
    }
}

