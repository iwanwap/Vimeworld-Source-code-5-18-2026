/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  XTa
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

public final class rx_3
extends bV {
    private static final IBlockState A = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.SPRUCE);
    private static final IBlockState I = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.SPRUCE).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void b22;
        XF d2 = xF2;
        rx_3 a2 = this;
        int n2 = b22.nextInt(tTa.h) + XTa.W;
        int n3 = n2 - b22.nextInt(uqa.g) - yRa.d;
        int n4 = n2 - n3;
        int b22 = vRa.d + b22.nextInt(n4 + vRa.d);
        n4 = vRa.d;
        if (d2.getY() >= vRa.d && d2.getY() + n2 + vRa.d <= hra.Ja) {
            int n5;
            int n6;
            void c2;
            int n7;
            int n8;
            int n9 = n8 = d2.getY();
            while (n9 <= d2.getY() + vRa.d + n2 && n4 != 0) {
                n7 = vRa.d;
                n7 = n8 - d2.getY() < n3 ? uSa.E : b22;
                zz zz2 = new zz();
                int n10 = d2.getX() - n7;
                while (n10 <= d2.getX() + n7 && n4 != 0) {
                    int n11 = d2.getZ() - n7;
                    while (n11 <= d2.getZ() + n7 && n4 != 0) {
                        if (n8 >= 0 && n8 < hra.Ja) {
                            if (!a2.J(c2.J((XF)zz2.func_181079_c(n6, n8, n5)).J())) {
                                n4 = uSa.E;
                            }
                        } else {
                            n4 = uSa.E;
                        }
                        n11 = ++n5;
                    }
                    n10 = ++n6;
                }
                n9 = ++n8;
            }
            if (n4 == 0) {
                return uSa.E != 0;
            }
            Block block = c2.J(d2.down()).J();
            if ((block == QFa.lf || block == QFa.Bc) && d2.getY() < hra.Ja - n2 - vRa.d) {
                int n12;
                Object object = d2;
                a2.J((Gg)c2, ((XF)((Object)object)).down());
                n7 = uSa.E;
                int n13 = n12 = object.getY() + n2;
                while (n13 >= d2.getY() + n3) {
                    int n14 = d2.getX() - n7;
                    while (n14 <= d2.getX() + n7) {
                        n5 = n6 - d2.getX();
                        int n15 = d2.getZ() - n7;
                        while (n15 <= d2.getZ() + n7) {
                            XF xF3;
                            int n16 = n4 - d2.getZ();
                            if (!(Math.abs(n5) == n7 && Math.abs(n16) == n7 && n7 > 0 || c2.J(xF3 = new XF(n6, n12, n4)).J().J())) {
                                a2.J((Gg)c2, xF3, I);
                            }
                            n15 = ++n4;
                        }
                        n14 = ++n6;
                    }
                    if (n7 >= vRa.d && n12 == d2.getY() + n3 + vRa.d) {
                        --n7;
                    } else if (n7 < b22) {
                        ++n7;
                    }
                    n13 = --n12;
                }
                int n17 = n12 = uSa.E;
                while (n17 < n2 - vRa.d) {
                    Block block2 = c2.J(d2.up(n12)).J();
                    if (block2.J() == Material.air || block2.J() == Material.leaves) {
                        a2.J((Gg)c2, d2.up(n12), A);
                    }
                    n17 = ++n12;
                }
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public rx_3() {
        super(uSa.E != 0);
        rx_3 a2;
    }
}

