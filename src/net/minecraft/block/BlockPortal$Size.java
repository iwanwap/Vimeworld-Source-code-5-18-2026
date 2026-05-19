/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  cQa
 *  vRa
 *  wOa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPortal$Size {
    private final RX axis;
    private final DZ field_150863_d;
    private XF field_150861_f;
    private int field_150868_h;
    private final Gg world;
    private int field_150862_g;
    private final DZ field_150866_c;
    private int field_150864_e;

    public static /* synthetic */ XF J(BlockPortal$Size a2) {
        return a2.field_150861_f;
    }

    public boolean J() {
        BlockPortal$Size a2;
        if (a2.field_150861_f != null && a2.field_150868_h >= uqa.g && a2.field_150868_h <= wOa.h && a2.field_150862_g >= yRa.d && a2.field_150862_g <= wOa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, DZ dZ2) {
        BlockPortal$Size blockPortal$Size;
        Object object;
        void a2;
        void b2;
        int c2;
        block3: {
            BlockPortal$Size blockPortal$Size2 = this;
            int n2 = c2 = uSa.E;
            while (n2 < cQa.o) {
                object = b2.offset((DZ)a2, c2);
                BlockPortal$Size blockPortal$Size3 = blockPortal$Size2;
                if (!blockPortal$Size3.J(blockPortal$Size3.world.J((XF)((Object)object)).J())) break;
                if (blockPortal$Size2.world.J(((XF)((Object)object)).down()).J() != QFa.X) {
                    blockPortal$Size = blockPortal$Size2;
                    break block3;
                }
                n2 = ++c2;
            }
            blockPortal$Size = blockPortal$Size2;
        }
        object = blockPortal$Size.world.J(b2.offset((DZ)a2, c2)).J();
        if (object == QFa.X) {
            return c2;
        }
        return uSa.E;
    }

    public int l() {
        BlockPortal$Size a2;
        return a2.field_150868_h;
    }

    public static /* synthetic */ int l(BlockPortal$Size a2) {
        return a2.field_150862_g;
    }

    public static /* synthetic */ int f(BlockPortal$Size a2) {
        return a2.field_150868_h;
    }

    public void J() {
        int n2;
        BlockPortal$Size blockPortal$Size = this;
        int n3 = n2 = uSa.E;
        while (n3 < blockPortal$Size.field_150868_h) {
            BlockPortal$Size blockPortal$Size2 = blockPortal$Size;
            XF xF2 = blockPortal$Size2.field_150861_f.offset(blockPortal$Size2.field_150866_c, n2);
            int n4 = uSa.E;
            while (n4 < blockPortal$Size.field_150862_g) {
                int a2;
                XF xF3 = xF2.up(a2);
                blockPortal$Size.world.J(xF3, QFa.rF.J().J(BlockPortal.AXIS, blockPortal$Size.axis), uqa.g);
                n4 = ++a2;
            }
            n3 = ++n2;
        }
    }

    public static /* synthetic */ int J(BlockPortal$Size a2) {
        return a2.field_150864_e;
    }

    /*
     * WARNING - void declaration
     */
    public BlockPortal$Size(Gg gg2, XF xF2, RX rX) {
        Object object;
        Object a22;
        void c2;
        Object d2 = xF2;
        BlockPortal$Size b2 = this;
        b2.field_150864_e = uSa.E;
        b2.world = c2;
        b2.axis = a22;
        if (b2.axis == RX.X) {
            object = d2;
            BlockPortal$Size blockPortal$Size = b2;
            blockPortal$Size.field_150863_d = DZ.EAST;
            blockPortal$Size.field_150866_c = DZ.WEST;
        } else {
            BlockPortal$Size blockPortal$Size = b2;
            blockPortal$Size.field_150863_d = DZ.NORTH;
            blockPortal$Size.field_150866_c = DZ.SOUTH;
            object = d2;
        }
        a22 = object;
        Object object2 = d2;
        while (object2.getY() > a22.getY() - wOa.h && d2.getY() > 0 && b2.J(c2.J(((XF)((Object)d2)).down()).J())) {
            object2 = ((XF)((Object)d2)).down();
        }
        int a22 = b2.J((XF)((Object)d2), b2.field_150863_d) - vRa.d;
        if (a22 >= 0) {
            BlockPortal$Size blockPortal$Size = b2;
            b2.field_150861_f = ((XF)((Object)d2)).offset(b2.field_150863_d, a22);
            BlockPortal$Size blockPortal$Size2 = b2;
            blockPortal$Size.field_150868_h = blockPortal$Size2.J(blockPortal$Size.field_150861_f, blockPortal$Size2.field_150866_c);
            if (blockPortal$Size.field_150868_h < uqa.g || b2.field_150868_h > wOa.h) {
                BlockPortal$Size blockPortal$Size3 = b2;
                blockPortal$Size3.field_150861_f = null;
                blockPortal$Size3.field_150868_h = uSa.E;
            }
        }
        if (b2.field_150861_f != null) {
            b2.field_150862_g = b2.J();
        }
    }

    public static /* synthetic */ DZ J(BlockPortal$Size a2) {
        return a2.field_150866_c;
    }

    public boolean J(Block block) {
        Block b2 = block;
        BlockPortal$Size a2 = this;
        if (b2.blockMaterial == Material.air || b2 == QFa.ic || b2 == QFa.rF) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        BlockPortal$Size a2;
        return a2.field_150862_g;
    }

    public int J() {
        BlockPortal$Size blockPortal$Size;
        BlockPortal$Size blockPortal$Size2;
        block6: {
            int a22;
            BlockPortal$Size blockPortal$Size3 = blockPortal$Size2 = this;
            blockPortal$Size2.field_150862_g = uSa.E;
            block0: while (blockPortal$Size3.field_150862_g < wOa.h) {
                int n2 = uSa.E;
                while (n2 < blockPortal$Size2.field_150868_h) {
                    int a22;
                    BlockPortal$Size blockPortal$Size4 = blockPortal$Size2;
                    BlockPortal$Size blockPortal$Size5 = blockPortal$Size2;
                    XF xF2 = blockPortal$Size4.field_150861_f.offset(blockPortal$Size5.field_150866_c, a22).up(blockPortal$Size2.field_150862_g);
                    Block block = blockPortal$Size4.world.J(xF2).J();
                    if (!blockPortal$Size5.J(block)) break block0;
                    if (block == QFa.rF) {
                        blockPortal$Size2.field_150864_e += vRa.d;
                    }
                    if (a22 == 0 ? (block = blockPortal$Size2.world.J(xF2.offset(blockPortal$Size2.field_150863_d)).J()) != QFa.X : a22 == blockPortal$Size2.field_150868_h - vRa.d && (block = blockPortal$Size2.world.J(xF2.offset(blockPortal$Size2.field_150866_c)).J()) != QFa.X) break block0;
                    n2 = ++a22;
                }
                BlockPortal$Size blockPortal$Size6 = blockPortal$Size2;
                blockPortal$Size3 = blockPortal$Size6;
                blockPortal$Size6.field_150862_g += vRa.d;
            }
            int n3 = a22 = uSa.E;
            while (n3 < blockPortal$Size2.field_150868_h) {
                BlockPortal$Size blockPortal$Size7 = blockPortal$Size2;
                if (blockPortal$Size7.world.J(blockPortal$Size7.field_150861_f.offset(blockPortal$Size2.field_150866_c, a22).up(blockPortal$Size2.field_150862_g)).J() != QFa.X) {
                    blockPortal$Size = blockPortal$Size2;
                    blockPortal$Size2.field_150862_g = uSa.E;
                    break block6;
                }
                n3 = ++a22;
            }
            blockPortal$Size = blockPortal$Size2;
        }
        if (blockPortal$Size.field_150862_g <= wOa.h && blockPortal$Size2.field_150862_g >= yRa.d) {
            return blockPortal$Size2.field_150862_g;
        }
        BlockPortal$Size blockPortal$Size8 = blockPortal$Size2;
        blockPortal$Size8.field_150861_f = null;
        blockPortal$Size8.field_150868_h = uSa.E;
        blockPortal$Size8.field_150862_g = uSa.E;
        return uSa.E;
    }
}

