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

public final class Uv_1
extends bV {
    private static final IBlockState A;
    private static final IBlockState I;

    public Uv_1(boolean bl) {
        boolean b2 = bl;
        Uv_1 a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF, int n2) {
        void a2;
        int n3;
        void b22;
        Uv_1 uv_1 = this;
        void v0 = b22;
        int b22 = v0.getX();
        int n4 = v0.getY();
        int n5 = v0.getZ();
        zz zz2 = new zz();
        int n6 = n3 = uSa.E;
        while (n6 <= a2 + vRa.d) {
            int d2 = vRa.d;
            if (n3 == 0) {
                d2 = uSa.E;
            }
            if (n3 >= a2 - vRa.d) {
                d2 = uqa.g;
            }
            int n7 = -d2;
            while (n7 <= d2) {
                int n8;
                int n9 = -d2;
                while (n9 <= d2) {
                    int n10;
                    void c2;
                    if (!uv_1.J(c2.J((XF)zz2.func_181079_c(b22 + n8, n4 + n3, n5 + n10)).J())) {
                        return uSa.E != 0;
                    }
                    n9 = ++n10;
                }
                n7 = ++n8;
            }
            n6 = ++n3;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, int n2, int n3, int n4) {
        void d2;
        void a2;
        void b2;
        int e22 = n2;
        Uv_1 c2 = this;
        XF e22 = new XF(e22, (int)b2, (int)a2);
        if (d2.J(e22).J().J() == Material.air) {
            c2.J((Gg)d2, e22, A);
        }
    }

    static {
        I = QFa.hf.J().J(BlockNewLog.VARIANT, BlockPlanks$EnumType.DARK_OAK);
        A = QFa.Z.J().J(BlockNewLeaf.VARIANT, BlockPlanks$EnumType.DARK_OAK).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF) {
        void b2;
        Uv_1 a2 = this;
        Object c2 = xF;
        if (a2.J(b2.J((XF)((Object)c2)).J())) {
            a2.J((Gg)b2, (XF)((Object)c2), I);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        DZ a2;
        void b2;
        Uv_1 uv_1 = this;
        int n2 = b2.nextInt(yRa.d) + b2.nextInt(uqa.g) + uua.p;
        void v0 = a2;
        int n3 = v0.getX();
        int n4 = v0.getY();
        int n5 = v0.getZ();
        if (n4 >= vRa.d && n4 + n2 + vRa.d < hra.Ja) {
            int n6;
            int d2;
            void c2;
            XF xF2 = ((XF)((Object)a2)).down();
            Block block = c2.J(xF2).J();
            if (block != QFa.lf && block != QFa.Bc) {
                return uSa.E != 0;
            }
            if (!uv_1.J((Gg)c2, (XF)((Object)a2), n2)) {
                return uSa.E != 0;
            }
            void v1 = c2;
            XF xF3 = xF2;
            uv_1.J((Gg)c2, xF2);
            uv_1.J((Gg)c2, xF3.east());
            uv_1.J((Gg)v1, xF3.south());
            uv_1.J((Gg)v1, xF2.south().east());
            a2 = LX.HORIZONTAL.random((Random)b2);
            int n7 = n2 - b2.nextInt(AQa.P);
            int n8 = uqa.g - b2.nextInt(yRa.d);
            int n9 = n3;
            int n10 = n5;
            int n11 = n4 + n2 - vRa.d;
            int n12 = d2 = uSa.E;
            while (n12 < n2) {
                XF xF4;
                Material material;
                if (d2 >= n7 && n8 > 0) {
                    n9 += a2.getFrontOffsetX();
                    --n8;
                    n10 += a2.getFrontOffsetZ();
                }
                if ((material = c2.J(xF4 = new XF(n9, n6 = n4 + d2, n10)).J().J()) == Material.air || material == Material.leaves) {
                    void v4 = c2;
                    XF xF5 = xF4;
                    uv_1.f((Gg)c2, xF4);
                    uv_1.f((Gg)c2, xF5.east());
                    uv_1.f((Gg)v4, xF5.south());
                    uv_1.f((Gg)v4, xF4.east().south());
                }
                n12 = ++d2;
            }
            int n13 = d2 = rQa.p;
            while (n13 <= 0) {
                int n14 = rQa.p;
                while (n14 <= 0) {
                    int n15 = pua.o;
                    Uv_1 uv_12 = uv_1;
                    void v9 = c2;
                    uv_1.J((Gg)c2, n9 + d2, n11 + n15, n10 + n6);
                    uv_1.J((Gg)v9, vRa.d + n9 - d2, n11 + n15, n10 + n6);
                    uv_12.J((Gg)v9, n9 + d2, n11 + n15, vRa.d + n10 - n6);
                    uv_12.J((Gg)c2, vRa.d + n9 - d2, n11 + n15, vRa.d + n10 - n6);
                    if (!(d2 <= rQa.p && n6 <= pua.o || d2 == pua.o && n6 == rQa.p)) {
                        n15 = vRa.d;
                        Uv_1 uv_13 = uv_1;
                        void v11 = c2;
                        uv_1.J((Gg)c2, n9 + d2, n11 + n15, n10 + n6);
                        uv_1.J((Gg)v11, vRa.d + n9 - d2, n11 + n15, n10 + n6);
                        uv_13.J((Gg)v11, n9 + d2, n11 + n15, vRa.d + n10 - n6);
                        uv_13.J((Gg)c2, vRa.d + n9 - d2, n11 + n15, vRa.d + n10 - n6);
                    }
                    n14 = ++n6;
                }
                n13 = ++d2;
            }
            if (b2.nextBoolean()) {
                Uv_1 uv_14 = uv_1;
                void v13 = c2;
                int n16 = n9;
                uv_1.J((Gg)c2, n16, n11 + uqa.g, n10);
                uv_1.J((Gg)v13, n16 + vRa.d, n11 + uqa.g, n10);
                uv_14.J((Gg)v13, n9 + vRa.d, n11 + uqa.g, n10 + vRa.d);
                uv_14.J((Gg)c2, n9, n11 + uqa.g, n10 + vRa.d);
            }
            int n17 = d2 = ERa.Ka;
            while (n17 <= AQa.P) {
                int n18 = ERa.Ka;
                while (n18 <= AQa.P) {
                    if (!(d2 == ERa.Ka && n6 == ERa.Ka || d2 == ERa.Ka && n6 == AQa.P || d2 == AQa.P && n6 == ERa.Ka || d2 == AQa.P && n6 == AQa.P || Math.abs(d2) >= yRa.d && Math.abs(n6) >= yRa.d)) {
                        uv_1.J((Gg)c2, n9 + d2, n11, n10 + n6);
                    }
                    n18 = ++n6;
                }
                n17 = ++d2;
            }
            int n19 = d2 = pua.o;
            while (n19 <= uqa.g) {
                int n20 = pua.o;
                while (n20 <= uqa.g) {
                    if ((d2 < 0 || d2 > vRa.d || n6 < 0 || n6 > vRa.d) && b2.nextInt(yRa.d) <= 0) {
                        int n21;
                        int n22 = b2.nextInt(yRa.d) + uqa.g;
                        int n23 = n21 = uSa.E;
                        while (n23 < n22) {
                            int n24 = n11 - n21 - vRa.d;
                            uv_1.f((Gg)c2, new XF(n3 + d2, n24, n5 + n6));
                            n23 = ++n21;
                        }
                        int n25 = n21 = pua.o;
                        while (n25 <= vRa.d) {
                            int n26 = pua.o;
                            while (n26 <= vRa.d) {
                                uv_1.J((Gg)c2, n9 + d2 + n21, n11, n10 + n6 + a2++);
                                n26 = a2;
                            }
                            n25 = ++n21;
                        }
                        int n27 = n21 = rQa.p;
                        while (n27 <= uqa.g) {
                            int n28 = rQa.p;
                            while (n28 <= uqa.g) {
                                if (Math.abs(n21) != uqa.g || Math.abs(a2) != uqa.g) {
                                    uv_1.J((Gg)c2, n9 + d2 + n21, n11 - vRa.d, n10 + n6 + a2);
                                }
                                n28 = ++a2;
                            }
                            n27 = ++n21;
                        }
                    }
                    n20 = ++n6;
                }
                n19 = ++d2;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

