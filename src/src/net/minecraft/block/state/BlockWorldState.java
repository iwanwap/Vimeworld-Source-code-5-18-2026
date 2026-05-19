/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  uY
 *  vRa
 */
package net.minecraft.block.state;

import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockWorldState$1;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockWorldState {
    private IBlockState state;
    private final XF pos;
    private final Gg world;
    private uY tileEntity;
    private boolean tileEntityInitialized;
    private final boolean field_181628_c;

    /*
     * WARNING - void declaration
     */
    public BlockWorldState(Gg gg2, XF xF2, boolean bl) {
        void b2;
        void c2;
        BlockWorldState a2;
        boolean d2 = bl;
        BlockWorldState blockWorldState = a2 = this;
        a2.world = c2;
        blockWorldState.pos = b2;
        blockWorldState.field_181628_c = d2;
    }

    public static Predicate<BlockWorldState> J(Predicate<IBlockState> a2) {
        return new BlockWorldState$1(a2);
    }

    public XF J() {
        BlockWorldState a2;
        return a2.pos;
    }

    public uY J() {
        BlockWorldState a2;
        if (a2.tileEntity == null && !a2.tileEntityInitialized) {
            a2.tileEntity = a2.world.J(a2.pos);
            a2.tileEntityInitialized = vRa.d;
        }
        return a2.tileEntity;
    }

    public IBlockState J() {
        BlockWorldState a2;
        block2: {
            block3: {
                if (a2.state != null) break block2;
                if (a2.field_181628_c) break block3;
                BlockWorldState blockWorldState = a2;
                if (!blockWorldState.world.F(blockWorldState.pos)) break block2;
            }
            BlockWorldState blockWorldState = a2;
            blockWorldState.state = blockWorldState.world.J(blockWorldState.pos);
        }
        return a2.state;
    }
}

