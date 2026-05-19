/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 */
package net.minecraft.block.state;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateBase$1;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockStateBase
implements IBlockState {
    private int metadata;
    private int blockId;
    private ResourceLocation blockLocation;
    private static final Joiner COMMA_JOINER = Joiner.on((char)Yqa.D);
    private static final Function MAP_ENTRY_TO_STRING = new BlockStateBase$1();
    private static final String __OBFID = "CL_00002032";
    private int blockStateId;

    /*
     * WARNING - void declaration
     */
    public static Object J(Collection collection, Object object) {
        Collection collection2 = collection;
        Iterator b2 = collection2.iterator();
        while (b2.hasNext()) {
            void a2;
            if (!b2.next().equals(a2)) continue;
            if (b2.hasNext()) {
                return b2.next();
            }
            return collection2.iterator().next();
        }
        return b2.next();
    }

    public int l() {
        BlockStateBase a2;
        if (a2.blockId < 0) {
            a2.blockId = Block.J(a2.J());
        }
        return a2.blockId;
    }

    public int f() {
        BlockStateBase a2;
        if (a2.metadata < 0) {
            a2.metadata = a2.J().f(a2);
        }
        return a2.metadata;
    }

    public BlockStateBase() {
        BlockStateBase a2;
        BlockStateBase blockStateBase = a2;
        a2.blockId = pua.o;
        blockStateBase.blockStateId = pua.o;
        blockStateBase.metadata = pua.o;
        blockStateBase.blockLocation = null;
    }

    public ResourceLocation J() {
        BlockStateBase a2;
        if (a2.blockLocation == null) {
            a2.blockLocation = (ResourceLocation)Block.blockRegistry.f(a2.J());
        }
        return a2.blockLocation;
    }

    public int J() {
        BlockStateBase a2;
        if (a2.blockStateId < 0) {
            a2.blockStateId = Block.l(a2);
        }
        return a2.blockStateId;
    }

    public String toString() {
        BlockStateBase blockStateBase = this;
        StringBuilder a2 = new StringBuilder();
        BlockStateBase blockStateBase2 = blockStateBase;
        a2.append(Block.blockRegistry.f(blockStateBase2.J()));
        if (!blockStateBase2.J().isEmpty()) {
            a2.append(dqa.X);
            COMMA_JOINER.appendTo(a2, Iterables.transform(blockStateBase.J().entrySet(), MAP_ENTRY_TO_STRING));
            a2.append(XOa.D);
        }
        return a2.toString();
    }

    public IBlockState J(IProperty iProperty) {
        IProperty b2 = iProperty;
        BlockStateBase a2 = this;
        Object object = b2;
        BlockStateBase blockStateBase = a2;
        return blockStateBase.J(object, (Comparable)BlockStateBase.J(object.J(), blockStateBase.J(b2)));
    }

    public ImmutableTable<IProperty, Comparable, IBlockState> J() {
        return null;
    }
}

