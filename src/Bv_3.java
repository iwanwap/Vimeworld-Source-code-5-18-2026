/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  QFa
 *  hra
 *  pua
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class Bv_3
extends bV {
    private static final IBlockState A;
    private static final IBlockState I;

    public Bv_3(boolean bl) {
        boolean b2 = bl;
        Bv_3 a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void l(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Bv_3 a2 = this;
        a2.J((Gg)b2, (XF)((Object)c2), I);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void a2;
        void b22;
        Bv_3 bv_3 = this;
        int n2 = b22.nextInt(yRa.d) + b22.nextInt(yRa.d) + tTa.h;
        int n3 = vRa.d;
        if (a2.getY() >= vRa.d && a2.getY() + n2 + vRa.d <= hra.Ja) {
            int n4;
            int n5;
            void c2;
            int n6;
            int n7 = n6 = a2.getY();
            while (n7 <= a2.getY() + vRa.d + n2) {
                int d22 = vRa.d;
                if (n6 == a2.getY()) {
                    d22 = uSa.E;
                }
                if (n6 >= a2.getY() + vRa.d + n2 - uqa.g) {
                    d22 = uqa.g;
                }
                zz zz2 = new zz();
                int n8 = a2.getX() - d22;
                while (n8 <= a2.getX() + d22 && n3 != 0) {
                    int n9 = a2.getZ() - d22;
                    while (n9 <= a2.getZ() + d22 && n3 != 0) {
                        if (n6 >= 0 && n6 < hra.Ja) {
                            if (!bv_3.J(c2.J((XF)zz2.func_181079_c(n5, n6, n4)).J())) {
                                n3 = uSa.E;
                            }
                        } else {
                            n3 = uSa.E;
                        }
                        n9 = ++n4;
                    }
                    n8 = ++n5;
                }
                n7 = ++n6;
            }
            if (n3 == 0) {
                return uSa.E != 0;
            }
            Block block = c2.J(a2.down()).J();
            if ((block == QFa.lf || block == QFa.Bc) && a2.getY() < hra.Ja - n2 - vRa.d) {
                int n10;
                int n11;
                bv_3.J((Gg)c2, a2.down());
                DZ d22 = LX.HORIZONTAL.random((Random)b22);
                int n12 = n2 - b22.nextInt(AQa.P) - vRa.d;
                n5 = yRa.d - b22.nextInt(yRa.d);
                void v3 = a2;
                n4 = v3.getX();
                n3 = v3.getZ();
                int n13 = uSa.E;
                int n14 = n11 = uSa.E;
                while (n14 < n2) {
                    XF xF3;
                    Material material;
                    n10 = a2.getY() + n11;
                    if (n11 >= n12 && n5 > 0) {
                        n4 += d22.getFrontOffsetX();
                        --n5;
                        n3 += d22.getFrontOffsetZ();
                    }
                    if ((material = c2.J(xF3 = new XF(n4, n10, n3)).J().J()) == Material.air || material == Material.leaves) {
                        bv_3.l((Gg)c2, xF3);
                        n13 = n10;
                    }
                    n14 = ++n11;
                }
                XF xF4 = new XF(n4, n13, n3);
                int n15 = n10 = ERa.Ka;
                while (n15 <= yRa.d) {
                    int n16 = ERa.Ka;
                    while (n16 <= yRa.d) {
                        int n17;
                        if (Math.abs(n10) != yRa.d || Math.abs(n17) != yRa.d) {
                            bv_3.f((Gg)c2, xF4.add(n10, uSa.E, n17));
                        }
                        n16 = ++n17;
                    }
                    n15 = ++n10;
                }
                xF4 = xF4.up();
                int n18 = n10 = pua.o;
                while (n18 <= vRa.d) {
                    int n19 = pua.o;
                    while (n19 <= vRa.d) {
                        int n20;
                        bv_3.f((Gg)c2, xF4.add(n10, uSa.E, n20++));
                        n19 = n20;
                    }
                    n18 = ++n10;
                }
                void v9 = c2;
                XF xF5 = xF4;
                bv_3.f((Gg)c2, xF4.east(uqa.g));
                bv_3.f((Gg)c2, xF5.west(uqa.g));
                bv_3.f((Gg)v9, xF5.south(uqa.g));
                bv_3.f((Gg)v9, xF4.north(uqa.g));
                void v11 = a2;
                n4 = v11.getX();
                n3 = v11.getZ();
                DZ dZ2 = LX.HORIZONTAL.random((Random)b22);
                if (dZ2 != d22) {
                    int n21 = n12 - b22.nextInt(uqa.g) - vRa.d;
                    n13 = uSa.E;
                    int n22 = b22 = n21;
                    for (int i2 = vRa.d + b22.nextInt(yRa.d); n22 < n2 && i2 > 0; --i2) {
                        if (b22 >= vRa.d) {
                            int d22 = a2.getY() + b22;
                            XF xF6 = new XF(n4 += dZ2.getFrontOffsetX(), d22, n3 += dZ2.getFrontOffsetZ());
                            Material material = c2.J(xF6).J().J();
                            if (material == Material.air || material == Material.leaves) {
                                bv_3.l((Gg)c2, xF6);
                                n13 = d22;
                            }
                        }
                        n22 = ++b22;
                    }
                    if (n13 > 0) {
                        int d22;
                        XF b22 = new XF(n4, n13, n3);
                        int n23 = d22 = rQa.p;
                        while (n23 <= uqa.g) {
                            int n24 = rQa.p;
                            while (n24 <= uqa.g) {
                                int n25;
                                if (Math.abs(d22) != uqa.g || Math.abs(n25) != uqa.g) {
                                    bv_3.f((Gg)c2, b22.add(d22, uSa.E, n25));
                                }
                                n24 = ++n25;
                            }
                            n23 = ++d22;
                        }
                        b22 = b22.up();
                        int n26 = d22 = pua.o;
                        while (n26 <= vRa.d) {
                            int n27 = pua.o;
                            while (n27 <= vRa.d) {
                                int n28;
                                bv_3.f((Gg)c2, b22.add(d22, uSa.E, n28++));
                                n27 = n28;
                            }
                            n26 = ++d22;
                        }
                    }
                }
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    static {
        I = QFa.hf.J().J(BlockNewLog.VARIANT, BlockPlanks$EnumType.ACACIA);
        A = QFa.Z.J().J(BlockNewLeaf.VARIANT, BlockPlanks$EnumType.ACACIA).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF2) {
        void a2;
        void b2;
        Bv_3 bv_3 = this;
        Object c2 = b2.J((XF)a2).J().J();
        if (c2 == Material.air || c2 == Material.leaves) {
            bv_3.J((Gg)b2, (XF)a2, A);
        }
    }
}

