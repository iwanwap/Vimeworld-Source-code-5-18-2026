/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  uY
 */
package net.minecraft.block;

import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockSourceImpl
implements dc {
    private final XF pos;
    private final Gg worldObj;

    @Override
    public double l() {
        BlockSourceImpl a2;
        return (double)a2.pos.getX() + kTa.B;
    }

    @Override
    public double J() {
        BlockSourceImpl a2;
        return (double)a2.pos.getY() + kTa.B;
    }

    public Gg J() {
        BlockSourceImpl a2;
        return a2.worldObj;
    }

    @Override
    public XF J() {
        BlockSourceImpl a2;
        return a2.pos;
    }

    @Override
    public double f() {
        BlockSourceImpl a2;
        return (double)a2.pos.getZ() + kTa.B;
    }

    /*
     * WARNING - void declaration
     */
    public BlockSourceImpl(Gg gg2, XF xF2) {
        void b2;
        BlockSourceImpl a2;
        Object c2 = xF2;
        BlockSourceImpl blockSourceImpl = a2 = this;
        blockSourceImpl.worldObj = b2;
        blockSourceImpl.pos = c2;
    }

    @Override
    public <T extends uY> T J() {
        BlockSourceImpl a2;
        BlockSourceImpl blockSourceImpl = a2;
        return (T)blockSourceImpl.worldObj.J(blockSourceImpl.pos);
    }

    @Override
    public int J() {
        BlockSourceImpl blockSourceImpl;
        BlockSourceImpl blockSourceImpl2 = blockSourceImpl = this;
        IBlockState a2 = blockSourceImpl2.worldObj.J(blockSourceImpl2.pos);
        return a2.J().f(a2);
    }
}

