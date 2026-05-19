/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  hra
 *  pua
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;

public class hx
extends bV {
    private static final IBlockState M;
    private final IBlockState k;
    private final boolean j;
    private static final IBlockState J;
    private final IBlockState A;
    private final int I;

    static {
        J = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.OAK);
        M = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.OAK).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        void b2;
        XF d2 = xF;
        hx a2 = this;
        int n2 = b2.nextInt(yRa.d) + a2.I;
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
                XF xF2;
                Object object;
                int n11;
                Object object2 = d2;
                a2.J((Gg)c2, ((XF)((Object)object2)).down());
                n6 = yRa.d;
                int n12 = uSa.E;
                int n13 = n5 = object2.getY() - n6 + n2;
                while (n13 <= d2.getY() + n2) {
                    n4 = n5 - (d2.getY() + n2);
                    n3 = n12 + vRa.d - n4 / uqa.g;
                    int n14 = d2.getX() - n3;
                    while (n14 <= d2.getX() + n3) {
                        int n15;
                        n6 = n15 - d2.getX();
                        int n16 = d2.getZ() - n3;
                        while (n16 <= d2.getZ() + n3) {
                            int n17 = n11 - d2.getZ();
                            if ((Math.abs(n6) != n3 || Math.abs(n17) != n3 || b2.nextInt(uqa.g) != 0 && n4 != 0) && ((object = c2.J(xF2 = new XF(n15, n5, n11)).J()).J() == Material.air || object.J() == Material.leaves || object.J() == Material.vine)) {
                                a2.J((Gg)c2, xF2, a2.k);
                            }
                            n16 = ++n11;
                        }
                        n14 = ++n15;
                    }
                    n13 = ++n5;
                }
                int n18 = n5 = uSa.E;
                while (n18 < n2) {
                    Block block2 = c2.J(d2.up(n5)).J();
                    if (block2.J() == Material.air || block2.J() == Material.leaves || block2.J() == Material.vine) {
                        hx hx2 = a2;
                        hx2.J((Gg)c2, d2.up(n5), hx2.A);
                        if (a2.j && n5 > 0) {
                            if (b2.nextInt(yRa.d) > 0 && c2.J(d2.add(pua.o, n5, uSa.E))) {
                                a2.J((Gg)c2, d2.add(pua.o, n5, uSa.E), BlockVine.EAST);
                            }
                            if (b2.nextInt(yRa.d) > 0 && c2.J(d2.add(vRa.d, n5, uSa.E))) {
                                a2.J((Gg)c2, d2.add(vRa.d, n5, uSa.E), BlockVine.WEST);
                            }
                            if (b2.nextInt(yRa.d) > 0 && c2.J(d2.add(uSa.E, n5, pua.o))) {
                                a2.J((Gg)c2, d2.add(uSa.E, n5, pua.o), BlockVine.SOUTH);
                            }
                            if (b2.nextInt(yRa.d) > 0 && c2.J(d2.add(uSa.E, n5, vRa.d))) {
                                a2.J((Gg)c2, d2.add(uSa.E, n5, vRa.d), BlockVine.NORTH);
                            }
                        }
                    }
                    n18 = ++n5;
                }
                if (a2.j) {
                    int n19 = n5 = d2.getY() - yRa.d + n2;
                    while (n19 <= d2.getY() + n2) {
                        int n20 = n5 - (d2.getY() + n2);
                        n3 = uqa.g - n20 / uqa.g;
                        zz zz3 = new zz();
                        int n21 = d2.getX() - n3;
                        while (n21 <= d2.getX() + n3) {
                            int n22 = d2.getZ() - n3;
                            while (n22 <= d2.getZ() + n3) {
                                zz zz4 = zz3;
                                zz4.func_181079_c(n6, n5, n11);
                                if (c2.J((XF)zz4).J().J() == Material.leaves) {
                                    zz zz5 = zz3;
                                    XF xF3 = zz5.west();
                                    xF2 = zz5.east();
                                    object = zz5.north();
                                    XF xF4 = zz5.south();
                                    if (b2.nextInt(AQa.P) == 0 && c2.J(xF3).J().J() == Material.air) {
                                        a2.f((Gg)c2, xF3, BlockVine.EAST);
                                    }
                                    if (b2.nextInt(AQa.P) == 0 && c2.J(xF2).J().J() == Material.air) {
                                        a2.f((Gg)c2, xF2, BlockVine.WEST);
                                    }
                                    if (b2.nextInt(AQa.P) == 0 && c2.J((XF)((Object)object)).J().J() == Material.air) {
                                        a2.f((Gg)c2, (XF)((Object)object), BlockVine.SOUTH);
                                    }
                                    if (b2.nextInt(AQa.P) == 0 && c2.J(xF4).J().J() == Material.air) {
                                        a2.f((Gg)c2, xF4, BlockVine.NORTH);
                                    }
                                }
                                n22 = ++n11;
                            }
                            n21 = ++n6;
                        }
                        n19 = ++n5;
                    }
                    if (b2.nextInt(tTa.h) == 0 && n2 > tTa.h) {
                        int n23 = n5 = uSa.E;
                        while (n23 < uqa.g) {
                            for (DZ dZ2 : LX.HORIZONTAL) {
                                if (b2.nextInt(AQa.P - n5) != 0) continue;
                                DZ dZ3 = dZ2.getOpposite();
                                a2.J((Gg)c2, b2.nextInt(yRa.d), d2.add(dZ3.getFrontOffsetX(), n2 - tTa.h + n5, dZ3.getFrontOffsetZ()), dZ2);
                            }
                            n23 = ++n5;
                        }
                    }
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
    private void f(Gg gg2, XF xF, PropertyBool propertyBool) {
        void a2;
        void c2;
        Object d2 = xF;
        hx b2 = this;
        hx hx2 = d2;
        b2.J((Gg)c2, (XF)((Object)hx2), (PropertyBool)a2);
        d2 = ((XF)((Object)hx2)).down();
        void v1 = c2;
        for (int i2 = AQa.P; v1.J((XF)((Object)d2)).J().J() == Material.air && i2 > 0; --i2) {
            hx hx3 = d2;
            b2.J((Gg)c2, (XF)((Object)hx3), (PropertyBool)a2);
            d2 = ((XF)((Object)hx3)).down();
            v1 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, int n2, XF xF, DZ dZ2) {
        Object e2;
        void c2;
        void b2;
        void d2;
        hx hx2 = object;
        Object object = dZ2;
        hx a2 = hx2;
        a2.J((Gg)d2, (XF)b2, QFa.p.J().J(BlockCocoa.AGE, (int)c2).J(BlockCocoa.FACING, e2));
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, XF xF, PropertyBool propertyBool) {
        void b2;
        void c2;
        Object d2 = propertyBool;
        hx a2 = this;
        a2.J((Gg)c2, (XF)b2, QFa.vC.J().J(d2, vRa.d != 0));
    }

    /*
     * WARNING - void declaration
     */
    public hx(boolean bl, int n2, IBlockState iBlockState, IBlockState iBlockState2, boolean bl2) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        hx a2;
        boolean bl3 = bl2;
        hx hx2 = a2 = this;
        hx hx3 = a2;
        super((boolean)e2);
        hx3.I = d2;
        hx3.A = c2;
        hx2.k = b2;
        hx2.j = f2;
    }

    public hx(boolean bl) {
        boolean b2 = bl;
        hx a2 = this;
        a2(b2, AQa.P, J, M, uSa.E != 0);
    }
}

