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
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class kw_3
extends bV {
    private static final IBlockState J = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.BIRCH);
    private static final IBlockState A = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.BIRCH).J(BlockOldLeaf.CHECK_DECAY, uSa.E != 0);
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        void b2;
        XF d2 = xF;
        kw_3 a2 = this;
        int n2 = b2.nextInt(yRa.d) + tTa.h;
        if (a2.I) {
            n2 += b2.nextInt(XTa.W);
        }
        int n3 = vRa.d;
        if (d2.getY() >= vRa.d && d2.getY() + n2 + vRa.d <= hra.Ja) {
            int n4;
            int n5;
            void c2;
            int n6;
            int n7;
            int n8 = n7 = d2.getY();
            while (n8 <= d2.getY() + vRa.d + n2) {
                n6 = vRa.d;
                if (n7 == d2.getY()) {
                    n6 = uSa.E;
                }
                if (n7 >= d2.getY() + vRa.d + n2 - uqa.g) {
                    n6 = uqa.g;
                }
                zz zz2 = new zz();
                int n9 = d2.getX() - n6;
                while (n9 <= d2.getX() + n6 && n3 != 0) {
                    int n10 = d2.getZ() - n6;
                    while (n10 <= d2.getZ() + n6 && n3 != 0) {
                        if (n7 >= 0 && n7 < hra.Ja) {
                            if (!a2.J(c2.J((XF)zz2.func_181079_c(n5, n7, n4)).J())) {
                                n3 = uSa.E;
                            }
                        } else {
                            n3 = uSa.E;
                        }
                        n10 = ++n4;
                    }
                    n9 = ++n5;
                }
                n8 = ++n7;
            }
            if (n3 == 0) {
                return uSa.E != 0;
            }
            Block block = c2.J(d2.down()).J();
            if ((block == QFa.lf || block == QFa.Bc || block == QFa.rd) && d2.getY() < hra.Ja - n2 - vRa.d) {
                Object object = d2;
                a2.J((Gg)c2, ((XF)((Object)object)).down());
                int n11 = n6 = object.getY() - yRa.d + n2;
                while (n11 <= d2.getY() + n2) {
                    int n12 = n6 - (d2.getY() + n2);
                    n5 = vRa.d - n12 / uqa.g;
                    int n13 = d2.getX() - n5;
                    while (n13 <= d2.getX() + n5) {
                        n3 = n4 - d2.getX();
                        int n14 = d2.getZ() - n5;
                        while (n14 <= d2.getZ() + n5) {
                            XF xF2;
                            Block block2;
                            int n15;
                            int n16 = n15 - d2.getZ();
                            if ((Math.abs(n3) != n5 || Math.abs(n16) != n5 || b2.nextInt(uqa.g) != 0 && n12 != 0) && ((block2 = c2.J(xF2 = new XF(n4, n6, n15)).J()).J() == Material.air || block2.J() == Material.leaves)) {
                                a2.J((Gg)c2, xF2, A);
                            }
                            n14 = ++n15;
                        }
                        n13 = ++n4;
                    }
                    n11 = ++n6;
                }
                int n17 = n6 = uSa.E;
                while (n17 < n2) {
                    Block block3 = c2.J(d2.up(n6)).J();
                    if (block3.J() == Material.air || block3.J() == Material.leaves) {
                        a2.J((Gg)c2, d2.up(n6), J);
                    }
                    n17 = ++n6;
                }
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public kw_3(boolean bl, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        kw_3 a2 = this;
        super((boolean)b2);
        a2.I = c2;
    }
}

