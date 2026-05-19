/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  vRa
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$1;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockRailBase$Rail {
    private final List<XF> field_150657_g;
    private final Gg world;
    private final XF pos;
    private final boolean isPowered;
    private final BlockRailBase block;
    private IBlockState state;
    public final /* synthetic */ BlockRailBase this$0;

    /*
     * WARNING - void declaration
     */
    public BlockRailBase$Rail(BlockRailBase blockRailBase, Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState e2;
        void b2;
        void c2;
        void d2;
        BlockRailBase$Rail a2;
        BlockRailBase$Rail blockRailBase$Rail = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockRailBase$Rail blockRailBase$Rail2 = a2 = blockRailBase$Rail;
        BlockRailBase$Rail blockRailBase$Rail3 = a2;
        a2.this$0 = d2;
        a2.field_150657_g = Lists.newArrayList();
        blockRailBase$Rail3.world = c2;
        blockRailBase$Rail3.pos = b2;
        blockRailBase$Rail2.state = e2;
        blockRailBase$Rail2.block = (BlockRailBase)e2.J();
        BlockRailBase$Rail blockRailBase$Rail4 = a2;
        blockRailBase$Rail4.isPowered = blockRailBase$Rail4.block.isPowered;
        blockRailBase$Rail4.J(e2.J(d2.J()));
    }

    public int J() {
        BlockRailBase$Rail blockRailBase$Rail = this;
        int n2 = uSa.E;
        for (Object e2 : LX.HORIZONTAL) {
            BlockRailBase$Rail blockRailBase$Rail2 = blockRailBase$Rail;
            if (!blockRailBase$Rail2.f(blockRailBase$Rail2.pos.offset((DZ)((Object)e2)))) continue;
            ++n2;
        }
        return n2;
    }

    private boolean l(XF xF2) {
        Object b2 = xF2;
        Object a2 = this;
        if ((b2 = a2.J((XF)((Object)b2))) == null) {
            return uSa.E != 0;
        }
        ((BlockRailBase$Rail)b2).J();
        return super.J((BlockRailBase$Rail)a2);
    }

    private void J(BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection) {
        BlockRailBase$EnumRailDirection b2 = blockRailBase$EnumRailDirection;
        BlockRailBase$Rail a2 = this;
        a2.field_150657_g.clear();
        switch (BlockRailBase$1.$SwitchMap$net$minecraft$block$BlockRailBase$EnumRailDirection[b2.ordinal()]) {
            case 1: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                while (false) {
                }
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.north());
                BlockRailBase$Rail blockRailBase$Rail2 = a2;
                blockRailBase$Rail2.field_150657_g.add(blockRailBase$Rail2.pos.south());
                return;
            }
            case 2: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.west());
                BlockRailBase$Rail blockRailBase$Rail3 = a2;
                blockRailBase$Rail3.field_150657_g.add(blockRailBase$Rail3.pos.east());
                return;
            }
            case 3: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.west());
                BlockRailBase$Rail blockRailBase$Rail4 = a2;
                blockRailBase$Rail4.field_150657_g.add(blockRailBase$Rail4.pos.east().up());
                return;
            }
            case 4: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.west().up());
                BlockRailBase$Rail blockRailBase$Rail5 = a2;
                blockRailBase$Rail5.field_150657_g.add(blockRailBase$Rail5.pos.east());
                return;
            }
            case 5: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.north().up());
                BlockRailBase$Rail blockRailBase$Rail6 = a2;
                blockRailBase$Rail6.field_150657_g.add(blockRailBase$Rail6.pos.south());
                return;
            }
            case 6: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.north());
                BlockRailBase$Rail blockRailBase$Rail7 = a2;
                blockRailBase$Rail7.field_150657_g.add(blockRailBase$Rail7.pos.south().up());
                return;
            }
            case 7: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.east());
                BlockRailBase$Rail blockRailBase$Rail8 = a2;
                blockRailBase$Rail8.field_150657_g.add(blockRailBase$Rail8.pos.south());
                return;
            }
            case 8: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.west());
                BlockRailBase$Rail blockRailBase$Rail9 = a2;
                blockRailBase$Rail9.field_150657_g.add(blockRailBase$Rail9.pos.south());
                return;
            }
            case 9: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.west());
                BlockRailBase$Rail blockRailBase$Rail10 = a2;
                blockRailBase$Rail10.field_150657_g.add(blockRailBase$Rail10.pos.north());
                return;
            }
            case 10: {
                BlockRailBase$Rail blockRailBase$Rail = a2;
                blockRailBase$Rail.field_150657_g.add(blockRailBase$Rail.pos.east());
                BlockRailBase$Rail blockRailBase$Rail11 = a2;
                blockRailBase$Rail11.field_150657_g.add(blockRailBase$Rail11.pos.north());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private BlockRailBase$Rail J(XF xF2) {
        void a2;
        BlockRailBase$Rail blockRailBase$Rail = this;
        IBlockState iBlockState = blockRailBase$Rail.world.J((XF)a2);
        if (BlockRailBase.J(iBlockState)) {
            BlockRailBase blockRailBase = blockRailBase$Rail.this$0;
            blockRailBase.getClass();
            return new BlockRailBase$Rail(blockRailBase, blockRailBase$Rail.world, (XF)a2, iBlockState);
        }
        Object b2 = a2.up();
        iBlockState = blockRailBase$Rail.world.J((XF)((Object)b2));
        if (BlockRailBase.J(iBlockState)) {
            BlockRailBase blockRailBase = blockRailBase$Rail.this$0;
            blockRailBase.getClass();
            return new BlockRailBase$Rail(blockRailBase, blockRailBase$Rail.world, (XF)((Object)b2), iBlockState);
        }
        b2 = a2.down();
        iBlockState = blockRailBase$Rail.world.J((XF)((Object)b2));
        if (BlockRailBase.J(iBlockState)) {
            BlockRailBase blockRailBase = blockRailBase$Rail.this$0;
            blockRailBase.getClass();
            return new BlockRailBase$Rail(blockRailBase, blockRailBase$Rail.world, (XF)((Object)b2), iBlockState);
        }
        return null;
    }

    private void J() {
        int a2;
        BlockRailBase$Rail blockRailBase$Rail = this;
        int n2 = a2 = uSa.E;
        while (n2 < blockRailBase$Rail.field_150657_g.size()) {
            BlockRailBase$Rail blockRailBase$Rail2 = blockRailBase$Rail;
            BlockRailBase$Rail blockRailBase$Rail3 = blockRailBase$Rail2.J(blockRailBase$Rail2.field_150657_g.get(a2));
            if (blockRailBase$Rail3 != null && blockRailBase$Rail3.f(blockRailBase$Rail)) {
                blockRailBase$Rail.field_150657_g.set(a2, blockRailBase$Rail3.pos);
            } else {
                blockRailBase$Rail.field_150657_g.remove(a2);
                --a2;
            }
            n2 = ++a2;
        }
    }

    private boolean f(BlockRailBase$Rail blockRailBase$Rail) {
        BlockRailBase$Rail b2 = blockRailBase$Rail;
        BlockRailBase$Rail a2 = this;
        return a2.J(b2.pos);
    }

    private boolean f(XF xF2) {
        XF b2 = xF2;
        BlockRailBase$Rail a2 = this;
        if (BlockRailBase.l(a2.world, b2) || BlockRailBase.l(a2.world, b2.up()) || BlockRailBase.l(a2.world, b2.down())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private boolean J(BlockRailBase$Rail blockRailBase$Rail) {
        BlockRailBase$Rail a2 = this;
        BlockRailBase$Rail b2 = blockRailBase$Rail;
        if (a2.f(b2) || a2.field_150657_g.size() != uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockRailBase$Rail J(boolean bl, boolean bl2) {
        BlockRailBase$Rail blockRailBase$Rail;
        block33: {
            int b2;
            block32: {
                void a2;
                Object object;
                Object c2;
                XF xF2;
                XF xF3;
                XF xF4;
                XF xF5;
                block31: {
                    block29: {
                        boolean bl3;
                        boolean bl4;
                        boolean bl5;
                        boolean bl6;
                        block30: {
                            BlockRailBase$Rail blockRailBase$Rail2 = blockRailBase$Rail = this;
                            xF5 = blockRailBase$Rail2.pos.north();
                            xF4 = blockRailBase$Rail2.pos.south();
                            xF3 = blockRailBase$Rail2.pos.west();
                            xF2 = blockRailBase$Rail2.pos.east();
                            bl6 = blockRailBase$Rail2.l(xF5);
                            bl5 = blockRailBase$Rail2.l(xF4);
                            bl4 = blockRailBase$Rail2.l(xF3);
                            bl3 = blockRailBase$Rail2.l(xF2);
                            c2 = null;
                            if ((bl6 || bl5) && !bl4 && !bl3) {
                                c2 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
                            }
                            if ((bl4 || bl3) && !bl6 && !bl5) {
                                c2 = BlockRailBase$EnumRailDirection.EAST_WEST;
                            }
                            if (!blockRailBase$Rail.isPowered) {
                                if (bl5 && bl3 && !bl6 && !bl4) {
                                    c2 = BlockRailBase$EnumRailDirection.SOUTH_EAST;
                                }
                                if (bl5 && bl4 && !bl6 && !bl3) {
                                    c2 = BlockRailBase$EnumRailDirection.SOUTH_WEST;
                                }
                                if (bl6 && bl4 && !bl5 && !bl3) {
                                    c2 = BlockRailBase$EnumRailDirection.NORTH_WEST;
                                }
                                if (bl6 && bl3 && !bl5 && !bl4) {
                                    c2 = BlockRailBase$EnumRailDirection.NORTH_EAST;
                                }
                            }
                            if (c2 != null) break block29;
                            if (bl6 || bl5) {
                                c2 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
                            }
                            if (bl4 || bl3) {
                                c2 = BlockRailBase$EnumRailDirection.EAST_WEST;
                            }
                            if (blockRailBase$Rail.isPowered) break block29;
                            if (b2 == false) break block30;
                            if (bl5 && bl3) {
                                c2 = BlockRailBase$EnumRailDirection.SOUTH_EAST;
                            }
                            if (bl4 && bl5) {
                                c2 = BlockRailBase$EnumRailDirection.SOUTH_WEST;
                            }
                            if (bl3 && bl6) {
                                c2 = BlockRailBase$EnumRailDirection.NORTH_EAST;
                            }
                            if (!bl6 || !bl4) break block29;
                            object = c2 = BlockRailBase$EnumRailDirection.NORTH_WEST;
                            break block31;
                        }
                        if (bl6 && bl4) {
                            c2 = BlockRailBase$EnumRailDirection.NORTH_WEST;
                        }
                        if (bl3 && bl6) {
                            c2 = BlockRailBase$EnumRailDirection.NORTH_EAST;
                        }
                        if (bl4 && bl5) {
                            c2 = BlockRailBase$EnumRailDirection.SOUTH_WEST;
                        }
                        if (bl5 && bl3) {
                            c2 = BlockRailBase$EnumRailDirection.SOUTH_EAST;
                        }
                    }
                    object = c2;
                }
                if (object == BlockRailBase$EnumRailDirection.NORTH_SOUTH) {
                    if (BlockRailBase.l(blockRailBase$Rail.world, xF5.up())) {
                        c2 = BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
                    }
                    if (BlockRailBase.l(blockRailBase$Rail.world, xF4.up())) {
                        c2 = BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
                    }
                }
                if (c2 == BlockRailBase$EnumRailDirection.EAST_WEST) {
                    if (BlockRailBase.l(blockRailBase$Rail.world, xF2.up())) {
                        c2 = BlockRailBase$EnumRailDirection.ASCENDING_EAST;
                    }
                    if (BlockRailBase.l(blockRailBase$Rail.world, xF3.up())) {
                        c2 = BlockRailBase$EnumRailDirection.ASCENDING_WEST;
                    }
                }
                if (c2 == null) {
                    c2 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
                }
                BlockRailBase$Rail blockRailBase$Rail3 = blockRailBase$Rail;
                blockRailBase$Rail3.J((BlockRailBase$EnumRailDirection)((Object)c2));
                blockRailBase$Rail3.state = blockRailBase$Rail3.state.J(blockRailBase$Rail.block.J(), c2);
                if (a2 != false) break block32;
                BlockRailBase$Rail blockRailBase$Rail4 = blockRailBase$Rail;
                if (blockRailBase$Rail4.world.J(blockRailBase$Rail4.pos) == blockRailBase$Rail.state) break block33;
            }
            BlockRailBase$Rail blockRailBase$Rail5 = blockRailBase$Rail;
            blockRailBase$Rail5.world.J(blockRailBase$Rail5.pos, blockRailBase$Rail.state, yRa.d);
            b2 = uSa.E;
            int n2 = b2;
            while (n2 < blockRailBase$Rail.field_150657_g.size()) {
                BlockRailBase$Rail blockRailBase$Rail6 = blockRailBase$Rail;
                BlockRailBase$Rail a2 = blockRailBase$Rail6.J(blockRailBase$Rail6.field_150657_g.get(b2));
                if (a2 != null) {
                    BlockRailBase$Rail blockRailBase$Rail7 = a2;
                    blockRailBase$Rail7.J();
                    if (blockRailBase$Rail7.J(blockRailBase$Rail)) {
                        a2.J(blockRailBase$Rail);
                    }
                }
                n2 = ++b2;
            }
        }
        return blockRailBase$Rail;
    }

    private void J(BlockRailBase$Rail blockRailBase$Rail) {
        XF a2;
        BlockRailBase$Rail blockRailBase$Rail2 = this;
        blockRailBase$Rail2.field_150657_g.add(((BlockRailBase$Rail)((Object)a2)).pos);
        BlockRailBase$Rail blockRailBase$Rail3 = blockRailBase$Rail2;
        a2 = blockRailBase$Rail3.pos.north();
        XF xF2 = blockRailBase$Rail3.pos.south();
        XF xF3 = blockRailBase$Rail3.pos.west();
        XF xF4 = blockRailBase$Rail3.pos.east();
        boolean bl = blockRailBase$Rail3.J(a2);
        boolean bl2 = blockRailBase$Rail3.J(xF2);
        boolean bl3 = blockRailBase$Rail3.J(xF3);
        boolean bl4 = blockRailBase$Rail3.J(xF4);
        Object b2 = null;
        if (bl || bl2) {
            b2 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
        }
        if (bl3 || bl4) {
            b2 = BlockRailBase$EnumRailDirection.EAST_WEST;
        }
        if (!blockRailBase$Rail2.isPowered) {
            if (bl2 && bl4 && !bl && !bl3) {
                b2 = BlockRailBase$EnumRailDirection.SOUTH_EAST;
            }
            if (bl2 && bl3 && !bl && !bl4) {
                b2 = BlockRailBase$EnumRailDirection.SOUTH_WEST;
            }
            if (bl && bl3 && !bl2 && !bl4) {
                b2 = BlockRailBase$EnumRailDirection.NORTH_WEST;
            }
            if (bl && bl4 && !bl2 && !bl3) {
                b2 = BlockRailBase$EnumRailDirection.NORTH_EAST;
            }
        }
        if (b2 == BlockRailBase$EnumRailDirection.NORTH_SOUTH) {
            if (BlockRailBase.l(blockRailBase$Rail2.world, a2.up())) {
                b2 = BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
            }
            if (BlockRailBase.l(blockRailBase$Rail2.world, xF2.up())) {
                b2 = BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
            }
        }
        if (b2 == BlockRailBase$EnumRailDirection.EAST_WEST) {
            if (BlockRailBase.l(blockRailBase$Rail2.world, xF4.up())) {
                b2 = BlockRailBase$EnumRailDirection.ASCENDING_EAST;
            }
            if (BlockRailBase.l(blockRailBase$Rail2.world, xF3.up())) {
                b2 = BlockRailBase$EnumRailDirection.ASCENDING_WEST;
            }
        }
        if (b2 == null) {
            b2 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
        }
        BlockRailBase$Rail blockRailBase$Rail4 = blockRailBase$Rail2;
        blockRailBase$Rail2.state = blockRailBase$Rail4.state.J(blockRailBase$Rail2.block.J(), b2);
        BlockRailBase$Rail blockRailBase$Rail5 = blockRailBase$Rail2;
        blockRailBase$Rail4.world.J(blockRailBase$Rail5.pos, blockRailBase$Rail5.state, yRa.d);
    }

    public IBlockState J() {
        BlockRailBase$Rail a2;
        return a2.state;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(XF xF2) {
        int b2;
        BlockRailBase$Rail blockRailBase$Rail = this;
        int n2 = b2 = uSa.E;
        while (n2 < blockRailBase$Rail.field_150657_g.size()) {
            void a2;
            XF xF3 = blockRailBase$Rail.field_150657_g.get(b2);
            if (xF3.getX() == a2.getX() && xF3.getZ() == a2.getZ()) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }
}

