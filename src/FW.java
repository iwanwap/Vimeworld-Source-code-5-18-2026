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
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;

public final class FW
extends bV {
    private static final IBlockState A = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.OAK);
    private static final IBlockState I = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.OAK).J(BlockOldLeaf.CHECK_DECAY, uSa.E != 0);

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, XF xF, PropertyBool propertyBool) {
        void c2;
        IBlockState a2;
        Object d2 = xF;
        FW b2 = this;
        a2 = QFa.vC.J().J(a2, vRa.d != 0);
        FW fW = d2;
        b2.J((Gg)c2, (XF)((Object)fW), a2);
        d2 = ((XF)((Object)fW)).down();
        void v1 = c2;
        for (int j = AQa.P; v1.J((XF)((Object)d2)).J().J() == Material.air && j > 0; --j) {
            FW fW2 = d2;
            b2.J((Gg)c2, (XF)((Object)fW2), a2);
            d2 = ((XF)((Object)fW2)).down();
            v1 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        void b2;
        void c2;
        Object d2 = xF;
        FW a2 = this;
        void v0 = c2;
        int n2 = b2.nextInt(AQa.P) + tTa.h;
        while (v0.J(((XF)((Object)d2)).down()).J().J() == Material.water) {
            d2 = ((XF)((Object)d2)).down();
            v0 = c2;
        }
        int n3 = vRa.d;
        if (d2.getY() >= vRa.d && d2.getY() + n2 + vRa.d <= hra.Ja) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = n7 = d2.getY();
            while (n8 <= d2.getY() + vRa.d + n2) {
                n6 = vRa.d;
                if (n7 == d2.getY()) {
                    n6 = uSa.E;
                }
                if (n7 >= d2.getY() + vRa.d + n2 - uqa.g) {
                    n6 = yRa.d;
                }
                zz zz2 = new zz();
                int n9 = d2.getX() - n6;
                while (n9 <= d2.getX() + n6 && n3 != 0) {
                    int n10 = d2.getZ() - n6;
                    while (n10 <= d2.getZ() + n6 && n3 != 0) {
                        if (n7 >= 0 && n7 < hra.Ja) {
                            Block block = c2.J((XF)zz2.func_181079_c(n5, n7, n4)).J();
                            if (block.J() != Material.air && block.J() != Material.leaves) {
                                if (block != QFa.sc && block != QFa.jd) {
                                    n3 = uSa.E;
                                } else if (n7 > d2.getY()) {
                                    n3 = uSa.E;
                                }
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
            Block block = c2.J(((XF)((Object)d2)).down()).J();
            if ((block == QFa.lf || block == QFa.Bc) && d2.getY() < hra.Ja - n2 - vRa.d) {
                XF xF2;
                Object object = d2;
                a2.J((Gg)c2, ((XF)((Object)object)).down());
                int n11 = n6 = object.getY() - yRa.d + n2;
                while (n11 <= d2.getY() + n2) {
                    int n12 = n6 - (d2.getY() + n2);
                    n5 = uqa.g - n12 / uqa.g;
                    int n13 = d2.getX() - n5;
                    while (n13 <= d2.getX() + n5) {
                        int n14 = n4 - d2.getX();
                        int n15 = d2.getZ() - n5;
                        while (n15 <= d2.getZ() + n5) {
                            int n16 = n3 - d2.getZ();
                            if ((Math.abs(n14) != n5 || Math.abs(n16) != n5 || b2.nextInt(uqa.g) != 0 && n12 != 0) && !c2.J(xF2 = new XF(n4, n6, n3)).J().J()) {
                                a2.J((Gg)c2, xF2, I);
                            }
                            n15 = ++n3;
                        }
                        n13 = ++n4;
                    }
                    n11 = ++n6;
                }
                int n17 = n6 = uSa.E;
                while (n17 < n2) {
                    Block block2 = c2.J(((XF)((Object)d2)).up(n6)).J();
                    if (block2.J() == Material.air || block2.J() == Material.leaves || block2 == QFa.jd || block2 == QFa.sc) {
                        a2.J((Gg)c2, ((XF)((Object)d2)).up(n6), A);
                    }
                    n17 = ++n6;
                }
                int n18 = n6 = d2.getY() - yRa.d + n2;
                while (n18 <= d2.getY() + n2) {
                    int n19 = n6 - (d2.getY() + n2);
                    n5 = uqa.g - n19 / uqa.g;
                    zz zz3 = new zz();
                    int n20 = d2.getX() - n5;
                    while (n20 <= d2.getX() + n5) {
                        int n21;
                        int n22 = d2.getZ() - n5;
                        while (n22 <= d2.getZ() + n5) {
                            zz zz4 = zz3;
                            zz4.func_181079_c(n21, n6, n3);
                            if (c2.J((XF)zz4).J().J() == Material.leaves) {
                                zz zz5 = zz3;
                                XF xF3 = zz5.west();
                                xF2 = zz5.east();
                                XF xF4 = zz5.north();
                                XF xF5 = zz5.south();
                                if (b2.nextInt(AQa.P) == 0 && c2.J(xF3).J().J() == Material.air) {
                                    a2.J((Gg)c2, xF3, BlockVine.EAST);
                                }
                                if (b2.nextInt(AQa.P) == 0 && c2.J(xF2).J().J() == Material.air) {
                                    a2.J((Gg)c2, xF2, BlockVine.WEST);
                                }
                                if (b2.nextInt(AQa.P) == 0 && c2.J(xF4).J().J() == Material.air) {
                                    a2.J((Gg)c2, xF4, BlockVine.SOUTH);
                                }
                                if (b2.nextInt(AQa.P) == 0 && c2.J(xF5).J().J() == Material.air) {
                                    a2.J((Gg)c2, xF5, BlockVine.NORTH);
                                }
                            }
                            n22 = ++n3;
                        }
                        n20 = ++n21;
                    }
                    n18 = ++n6;
                }
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public FW() {
        super(uSa.E != 0);
        FW a2;
    }
}

