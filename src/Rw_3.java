/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  hra
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class Rw_3
extends bV {
    private static final IBlockState A;
    private static final IBlockState I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void b2;
        XF d2 = xF2;
        Rw_3 a2 = this;
        int n2 = b2.nextInt(AQa.P) + uua.p;
        int n3 = vRa.d + b2.nextInt(uqa.g);
        int n4 = n2 - n3;
        int n5 = uqa.g + b2.nextInt(uqa.g);
        int n6 = vRa.d;
        if (d2.getY() >= vRa.d && d2.getY() + n2 + vRa.d <= hra.Ja) {
            int n7;
            int n8;
            void c2;
            int n9;
            int n10;
            int n11 = n10 = d2.getY();
            while (n11 <= d2.getY() + vRa.d + n2 && n6 != 0) {
                n9 = vRa.d;
                n9 = n10 - d2.getY() < n3 ? uSa.E : n5;
                zz zz2 = new zz();
                int n12 = d2.getX() - n9;
                while (n12 <= d2.getX() + n9 && n6 != 0) {
                    int n13 = d2.getZ() - n9;
                    while (n13 <= d2.getZ() + n9 && n6 != 0) {
                        if (n10 >= 0 && n10 < hra.Ja) {
                            Block block = c2.J((XF)zz2.func_181079_c(n8, n10, n7)).J();
                            if (block.J() != Material.air && block.J() != Material.leaves) {
                                n6 = uSa.E;
                            }
                        } else {
                            n6 = uSa.E;
                        }
                        n13 = ++n7;
                    }
                    n12 = ++n8;
                }
                n11 = ++n10;
            }
            if (n6 == 0) {
                return uSa.E != 0;
            }
            Block block = c2.J(d2.down()).J();
            if ((block == QFa.lf || block == QFa.Bc || block == QFa.rd) && d2.getY() < hra.Ja - n2 - vRa.d) {
                int n14;
                a2.J((Gg)c2, d2.down());
                n9 = b2.nextInt(uqa.g);
                int n15 = vRa.d;
                n8 = uSa.E;
                int n16 = n7 = uSa.E;
                while (n16 <= n4) {
                    Object object = d2;
                    int n17 = object.getY() + n2 - n7;
                    int n18 = object.getX() - n9;
                    while (n18 <= d2.getX() + n9) {
                        n6 = n3 - d2.getX();
                        int n19 = d2.getZ() - n9;
                        while (n19 <= d2.getZ() + n9) {
                            XF xF3;
                            int n20;
                            int n21 = n20 - d2.getZ();
                            if (!(Math.abs(n6) == n9 && Math.abs(n21) == n9 && n9 > 0 || c2.J(xF3 = new XF(n3, n17, n20)).J().J())) {
                                a2.J((Gg)c2, xF3, A);
                            }
                            n19 = ++n20;
                        }
                        n18 = ++n3;
                    }
                    if (n9 >= n15) {
                        n9 = n8;
                        n8 = vRa.d;
                        if (++n15 > n5) {
                            n15 = n5;
                        }
                    } else {
                        ++n9;
                    }
                    n16 = ++n7;
                }
                n7 = b2.nextInt(yRa.d);
                int n22 = n14 = uSa.E;
                while (n22 < n2 - n7) {
                    Block block2 = c2.J(d2.up(n14)).J();
                    if (block2.J() == Material.air || block2.J() == Material.leaves) {
                        a2.J((Gg)c2, d2.up(n14), I);
                    }
                    n22 = ++n14;
                }
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public Rw_3(boolean bl2) {
        boolean b2 = bl2;
        Rw_3 a2 = this;
        super(b2);
    }

    static {
        I = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.SPRUCE);
        A = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.SPRUCE).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
    }
}

