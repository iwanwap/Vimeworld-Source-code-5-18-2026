/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  hra
 *  jW
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.BlockHugeMushroom$EnumType;
import net.minecraft.block.material.Material;

public final class qv_2
extends jW {
    private Block I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        block38: {
            int n2;
            int n3;
            int n4;
            void c2;
            int n5;
            int n6;
            void b22;
            XF d2 = xF2;
            qv_2 a2 = this;
            if (a2.I == null) {
                a2.I = b22.nextBoolean() ? QFa.ma : QFa.BF;
            }
            int b22 = b22.nextInt(yRa.d) + AQa.P;
            int n7 = vRa.d;
            if (d2.getY() < vRa.d || d2.getY() + b22 + vRa.d >= hra.Ja) break block38;
            int n8 = n6 = d2.getY();
            while (n8 <= d2.getY() + vRa.d + b22) {
                n5 = yRa.d;
                if (n6 <= d2.getY() + yRa.d) {
                    n5 = uSa.E;
                }
                zz zz2 = new zz();
                int n9 = d2.getX() - n5;
                while (n9 <= d2.getX() + n5 && n7 != 0) {
                    int n10 = d2.getZ() - n5;
                    while (n10 <= d2.getZ() + n5 && n7 != 0) {
                        if (n6 >= 0 && n6 < hra.Ja) {
                            Block block = c2.J((XF)zz2.func_181079_c(n4, n6, n3)).J();
                            if (block.J() != Material.air && block.J() != Material.leaves) {
                                n7 = uSa.E;
                            }
                        } else {
                            n7 = uSa.E;
                        }
                        n10 = ++n3;
                    }
                    n9 = ++n4;
                }
                n8 = ++n6;
            }
            if (n7 == 0) {
                return uSa.E != 0;
            }
            Block block = c2.J(d2.down()).J();
            if (block != QFa.Bc && block != QFa.lf && block != QFa.uB) {
                return uSa.E != 0;
            }
            n5 = d2.getY() + b22;
            if (a2.I == QFa.BF) {
                n5 = d2.getY() + b22 - yRa.d;
            }
            int n11 = n2 = n5;
            while (n11 <= d2.getY() + b22) {
                n4 = vRa.d;
                if (n2 < d2.getY() + b22) {
                    ++n4;
                }
                if (a2.I == QFa.ma) {
                    n4 = yRa.d;
                }
                Object object = d2;
                n3 = object.getX() - n4;
                int n12 = object.getX() + n4;
                n7 = object.getZ() - n4;
                int n13 = object.getZ() + n4;
                int n14 = n3;
                while (n14 <= n12) {
                    int n15 = n7;
                    while (n15 <= n13) {
                        int n16;
                        block40: {
                            XF xF3;
                            BlockHugeMushroom$EnumType blockHugeMushroom$EnumType;
                            block39: {
                                int n17;
                                int n18;
                                int n19 = tTa.h;
                                if (n5 == n3) {
                                    n18 = n16;
                                    --n19;
                                } else {
                                    if (n5 == n12) {
                                        ++n19;
                                    }
                                    n18 = n16;
                                }
                                if (n18 == n7) {
                                    n17 = n19 -= 3;
                                } else {
                                    if (n16 == n13) {
                                        n19 += 3;
                                    }
                                    n17 = n19;
                                }
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.byMetadata(n17);
                                if (a2.I != QFa.ma && n2 >= d2.getY() + b22) break block39;
                                if ((n5 == n3 || n5 == n12) && (n16 == n7 || n16 == n13)) break block40;
                                if (n5 == d2.getX() - (n4 - vRa.d) && n16 == n7) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.NORTH_WEST;
                                }
                                if (n5 == n3 && n16 == d2.getZ() - (n4 - vRa.d)) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.NORTH_WEST;
                                }
                                if (n5 == d2.getX() + (n4 - vRa.d) && n16 == n7) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.NORTH_EAST;
                                }
                                if (n5 == n12 && n16 == d2.getZ() - (n4 - vRa.d)) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.NORTH_EAST;
                                }
                                if (n5 == d2.getX() - (n4 - vRa.d) && n16 == n13) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.SOUTH_WEST;
                                }
                                if (n5 == n3 && n16 == d2.getZ() + (n4 - vRa.d)) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.SOUTH_WEST;
                                }
                                if (n5 == d2.getX() + (n4 - vRa.d) && n16 == n13) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.SOUTH_EAST;
                                }
                                if (n5 == n12 && n16 == d2.getZ() + (n4 - vRa.d)) {
                                    blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.SOUTH_EAST;
                                }
                            }
                            if (blockHugeMushroom$EnumType == BlockHugeMushroom$EnumType.CENTER && n2 < d2.getY() + b22) {
                                blockHugeMushroom$EnumType = BlockHugeMushroom$EnumType.ALL_INSIDE;
                            }
                            if (!(d2.getY() < d2.getY() + b22 - vRa.d && blockHugeMushroom$EnumType == BlockHugeMushroom$EnumType.ALL_INSIDE || c2.J(xF3 = new XF(n5, n2, n16)).J().J())) {
                                qv_2 qv_22 = a2;
                                qv_22.J((Gg)c2, xF3, qv_22.I.J().J(BlockHugeMushroom.VARIANT, blockHugeMushroom$EnumType));
                            }
                        }
                        n15 = ++n16;
                    }
                    n14 = ++n5;
                }
                n11 = ++n2;
            }
            int n20 = n2 = uSa.E;
            while (n20 < b22) {
                Block block2 = c2.J(d2.up(n2)).J();
                if (!block2.J()) {
                    qv_2 qv_23 = a2;
                    qv_23.J((Gg)c2, d2.up(n2), qv_23.I.J().J(BlockHugeMushroom.VARIANT, BlockHugeMushroom$EnumType.STEM));
                }
                n20 = ++n2;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public qv_2(Block block) {
        Object b2 = block;
        qv_2 a2 = this;
        super(vRa.d != 0);
        a2.I = b2;
    }

    public qv_2() {
        super(uSa.E != 0);
        qv_2 a2;
    }
}

