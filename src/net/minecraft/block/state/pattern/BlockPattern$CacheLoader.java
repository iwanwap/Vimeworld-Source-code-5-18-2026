/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 */
package net.minecraft.block.state.pattern;

import com.google.common.cache.CacheLoader;
import net.minecraft.block.state.BlockWorldState;

public final class BlockPattern$CacheLoader
extends CacheLoader<XF, BlockWorldState> {
    private final Gg world;
    private final boolean field_181626_b;

    /*
     * WARNING - void declaration
     */
    public BlockPattern$CacheLoader(Gg gg2, boolean bl) {
        void b2;
        BlockPattern$CacheLoader a2;
        boolean c2 = bl;
        BlockPattern$CacheLoader blockPattern$CacheLoader = a2 = this;
        blockPattern$CacheLoader.world = b2;
        blockPattern$CacheLoader.field_181626_b = c2;
    }

    public BlockWorldState J(XF xF2) throws Exception {
        Object b2 = xF2;
        BlockPattern$CacheLoader a2 = this;
        return new BlockWorldState(a2.world, (XF)((Object)b2), a2.field_181626_b);
    }
}

