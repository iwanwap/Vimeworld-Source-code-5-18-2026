/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  DX
 *  ERa
 *  Gg
 *  JPa
 *  NPa
 *  NTa
 *  Oz
 *  QFa
 *  Tf
 *  WSa
 *  YLa
 *  aSa
 *  kY
 *  oqa
 *  pqa
 *  pua
 *  taa
 *  vL
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kY_1 {
    private final YLa j;
    private final List<Long> J;
    private final Random A;
    private final Tf I;

    public kY_1(Tf tf) {
        kY_1 a2;
        kY_1 b2 = tf;
        kY_1 kY_12 = a2 = this;
        kY_1 kY_13 = a2;
        kY_13.j = new YLa();
        kY_12.J = Lists.newArrayList();
        kY_12.I = b2;
        kY_12.A = new Random(b2.J());
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2) {
        int b22;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        double d2;
        int n9;
        double d3;
        int n10;
        void a2;
        kY_1 kY_12 = this;
        int n11 = ERa.C;
        double d4 = pqa.q;
        void v0 = a2;
        int n12 = Oz.f((double)v0.la);
        int n13 = Oz.f((double)v0.Z);
        int n14 = Oz.f((double)v0.A);
        int n15 = n12;
        int n16 = n14;
        int n17 = uSa.E;
        int n18 = kY_12.A.nextInt(AQa.P);
        zz zz2 = new zz();
        int n19 = n10 = n12 - n11;
        while (n19 <= n12 + n11) {
            d3 = (double)n10 + kTa.B - a2.la;
            int n20 = n14 - n11;
            while (n20 <= n14 + n11) {
                d2 = (double)n9 + kTa.B - a2.A;
                int n21 = kY_12.I.l() - vRa.d;
                while (n21 >= 0) {
                    int b22;
                    if (kY_12.I.J((XF)zz2.func_181079_c(n10, b22, n9))) {
                        int n22 = b22;
                        while (n22 > 0 && kY_12.I.J((XF)zz2.func_181079_c(n10, b22 - vRa.d, n9))) {
                            n22 = --b22;
                        }
                        int n23 = n18;
                        block4: while (n23 < n18 + AQa.P) {
                            n7 = n8 % uqa.g;
                            n6 = vRa.d - n7;
                            if (n8 % AQa.P >= uqa.g) {
                                n7 = -n7;
                                n6 = -n6;
                            }
                            int n24 = uSa.E;
                            while (n24 < yRa.d) {
                                int n25 = uSa.E;
                                while (n25 < AQa.P) {
                                    int n26 = pua.o;
                                    while (n26 < AQa.P) {
                                        int n27;
                                        n3 = n10 + (n5 - vRa.d) * n7 + n4 * n6;
                                        n2 = b22 + n27;
                                        int n28 = n9 + (n5 - vRa.d) * n6 - n4 * n7;
                                        zz2.func_181079_c(n3, n2, n28);
                                        if (n27 < 0 && !kY_12.I.J((XF)zz2).J().J().i() || n27 >= 0 && !kY_12.I.J((XF)zz2)) break block4;
                                        n26 = ++n27;
                                    }
                                    n25 = ++n5;
                                }
                                n24 = ++n4;
                            }
                            double d5 = (double)b22 + kTa.B - a2.Z;
                            double d6 = d3;
                            double d7 = d5;
                            double d8 = d2;
                            double d9 = d6 * d6 + d7 * d7 + d8 * d8;
                            if (d4 < aSa.V || d9 < d4) {
                                d4 = d9;
                                n15 = n10;
                                n13 = b22;
                                n16 = n9;
                                n17 = n8 % AQa.P;
                            }
                            n23 = ++n8;
                        }
                    }
                    n21 = --b22;
                }
                n20 = ++n9;
            }
            n19 = ++n10;
        }
        if (d4 < aSa.V) {
            int n29 = n10 = n12 - n11;
            while (n29 <= n12 + n11) {
                d3 = (double)n10 + kTa.B - a2.la;
                int n30 = n14 - n11;
                while (n30 <= n14 + n11) {
                    d2 = (double)n9 + kTa.B - a2.A;
                    int n31 = kY_12.I.l() - vRa.d;
                    while (n31 >= 0) {
                        int b22;
                        if (kY_12.I.J((XF)zz2.func_181079_c(n10, b22, n9))) {
                            int n32 = b22;
                            while (n32 > 0 && kY_12.I.J((XF)zz2.func_181079_c(n10, b22 - vRa.d, n9))) {
                                n32 = --b22;
                            }
                            int n33 = n18;
                            block12: while (n33 < n18 + uqa.g) {
                                n7 = n8 % uqa.g;
                                n6 = vRa.d - n7;
                                int n34 = uSa.E;
                                while (n34 < AQa.P) {
                                    int n35;
                                    int n36 = pua.o;
                                    while (n36 < AQa.P) {
                                        int n37 = n10 + (n35 - vRa.d) * n7;
                                        n3 = b22 + n5;
                                        n2 = n9 + (n35 - vRa.d) * n6;
                                        zz2.func_181079_c(n37, n3, n2);
                                        if (n5 < 0 && !kY_12.I.J((XF)zz2).J().J().i() || n5 >= 0 && !kY_12.I.J((XF)zz2)) break block12;
                                        n36 = ++n5;
                                    }
                                    n34 = ++n35;
                                }
                                double d10 = (double)b22 + kTa.B - a2.Z;
                                double d11 = d3;
                                double d12 = d10;
                                double d13 = d2;
                                double d14 = d11 * d11 + d12 * d12 + d13 * d13;
                                if (d4 < aSa.V || d14 < d4) {
                                    d4 = d14;
                                    n15 = n10;
                                    n13 = b22;
                                    n16 = n9;
                                    n17 = n8 % uqa.g;
                                }
                                n33 = ++n8;
                            }
                        }
                        n31 = --b22;
                    }
                    n30 = ++n9;
                }
                n29 = ++n10;
            }
        }
        n10 = n15;
        int n38 = n13;
        int n39 = n16;
        n9 = n17 % uqa.g;
        int n40 = vRa.d - n9;
        if (n17 % AQa.P >= uqa.g) {
            n9 = -n9;
            n40 = -n40;
        }
        if (d4 < aSa.V) {
            int n41;
            n38 = n13 = Oz.f((int)n13, (int)NPa.e, (int)(kY_12.I.l() - NTa.C));
            int n42 = n41 = pua.o;
            while (n42 <= vRa.d) {
                int n43 = vRa.d;
                while (n43 < yRa.d) {
                    int b22;
                    int n44 = pua.o;
                    while (n44 < yRa.d) {
                        n7 = n10 + (b22 - vRa.d) * n9 + n41 * n40;
                        n6 = n38 + n8;
                        n4 = n39 + (b22 - vRa.d) * n40 - n41 * n9;
                        n5 = n8 < 0 ? vRa.d : uSa.E;
                        kY_12.I.J(new XF(n7, n6, n4), n5 != 0 ? QFa.X.J() : QFa.HF.J());
                        n44 = ++n8;
                    }
                    n43 = ++b22;
                }
                n42 = ++n41;
            }
        }
        IBlockState iBlockState = QFa.rF.J().J(BlockPortal.AXIS, n9 != 0 ? RX.X : RX.Z);
        int n45 = b22 = uSa.E;
        while (n45 < AQa.P) {
            int n46 = n8 = uSa.E;
            while (n46 < AQa.P) {
                int n47 = pua.o;
                while (n47 < AQa.P) {
                    n6 = n10 + (n8 - vRa.d) * n9;
                    n4 = n38 + n7;
                    n5 = n39 + (n8 - vRa.d) * n40;
                    int n48 = n8 == 0 || n8 == yRa.d || n7 == pua.o || n7 == yRa.d ? vRa.d : uSa.E;
                    kY_12.I.J(new XF(n6, n4, n5), n48 != 0 ? QFa.X.J() : iBlockState, uqa.g);
                    n47 = ++n7;
                }
                n46 = ++n8;
            }
            int n49 = n8 = uSa.E;
            while (n49 < AQa.P) {
                int n50 = pua.o;
                while (n50 < AQa.P) {
                    n6 = n10 + (n8 - vRa.d) * n9;
                    n4 = n38 + n7;
                    n5 = n39 + (n8 - vRa.d) * n40;
                    XF xF2 = new XF(n6, n4, n5);
                    kY_1 kY_13 = kY_12;
                    XF xF3 = xF2;
                    kY_13.I.f(xF3, kY_13.I.J(xF3).J());
                    n50 = ++n7;
                }
                n49 = ++n8;
            }
            n45 = ++b22;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        void a2;
        kY_1 kY_12 = this;
        if (a2 % WSa.Ia == nqa.i) {
            Iterator<Long> b2 = kY_12.J.iterator();
            a2 -= WOa.D;
            while (b2.hasNext()) {
                Long l3 = (Long)b2.next();
                taa taa2 = (taa)kY_12.j.J(l3.longValue());
                if (taa2 != null && taa2.lastUpdateTime >= a2) continue;
                b2.remove();
                kY_12.j.f(l3.longValue());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, float f2) {
        double d2;
        XF xF2;
        kY_1 c2 = vL2;
        kY_1 b2 = this;
        double d3 = pqa.q;
        kY_1 kY_12 = c2;
        int n2 = Oz.f((double)((vL)kY_12).la);
        int n3 = Oz.f((double)((vL)kY_12).A);
        int n4 = vRa.d;
        XF xF3 = XF.ORIGIN;
        long l2 = Baa.J((int)n2, (int)n3);
        if (b2.j.J(l2)) {
            xF2 = (taa)b2.j.J(l2);
            d3 = aSa.V;
            xF3 = xF2;
            ((taa)xF2).lastUpdateTime = b2.I.l();
            n4 = uSa.E;
            d2 = d3;
        } else {
            int n5;
            xF2 = new XF((vL)c2);
            int n6 = n5 = oqa.n;
            while (n6 <= XOa.h) {
                int n7 = oqa.n;
                while (n7 <= XOa.h) {
                    int n8;
                    XF xF4 = xF2;
                    XF xF5 = xF4.add(n5, b2.I.l() - vRa.d - xF4.getY(), n8);
                    while (xF5.getY() >= 0) {
                        XF xF6;
                        XF xF7 = xF6.down();
                        if (b2.I.J(xF6).J() == QFa.rF) {
                            kY_1 kY_13 = b2;
                            while (kY_13.I.J(xF7 = xF6.down()).J() == QFa.rF) {
                                xF6 = xF7;
                                kY_13 = b2;
                            }
                            double d4 = xF6.distanceSq(xF2);
                            if (d3 < aSa.V || d4 < d3) {
                                d3 = d4;
                                xF3 = xF6;
                            }
                        }
                        xF5 = xF7;
                    }
                    n7 = ++n8;
                }
                n6 = ++n5;
            }
            d2 = d3;
        }
        if (d2 >= aSa.V) {
            void a2;
            kY_1 kY_14;
            if (n4 != 0) {
                kY_1 kY_15 = b2;
                kY_1 kY_16 = b2;
                kY_15.j.J(l2, (Object)new taa((kY)kY_16, xF3, kY_16.I.l()));
                kY_15.J.add(l2);
            }
            XF xF8 = xF3;
            double d5 = (double)xF8.getX() + kTa.B;
            double d6 = (double)xF8.getY() + kTa.B;
            double d7 = (double)xF8.getZ() + kTa.B;
            BlockPattern$PatternHelper blockPattern$PatternHelper = QFa.rF.J((Gg)b2.I, xF3);
            n2 = blockPattern$PatternHelper.f().rotateY().getAxisDirection() == DX.NEGATIVE ? vRa.d : uSa.E;
            d3 = blockPattern$PatternHelper.f().getAxis() == RX.X ? (double)blockPattern$PatternHelper.J().getZ() : (double)blockPattern$PatternHelper.J().getX();
            d6 = (double)(blockPattern$PatternHelper.J().getY() + vRa.d) - c2.l().j * (double)blockPattern$PatternHelper.J();
            if (n2 != 0) {
                d3 += oua.i;
            }
            if (blockPattern$PatternHelper.f().getAxis() == RX.X) {
                d7 = d3 + (oua.i - c2.l().A) * (double)blockPattern$PatternHelper.f() * (double)blockPattern$PatternHelper.f().rotateY().getAxisDirection().getOffset();
            } else {
                d5 = d3 + (oua.i - c2.l().A) * (double)blockPattern$PatternHelper.f() * (double)blockPattern$PatternHelper.f().rotateY().getAxisDirection().getOffset();
            }
            float f3 = JPa.N;
            float f4 = JPa.N;
            float f5 = JPa.N;
            float f6 = JPa.N;
            if (blockPattern$PatternHelper.f().getOpposite() == c2.f()) {
                f3 = pqa.r;
                f4 = pqa.r;
                kY_14 = c2;
            } else if (blockPattern$PatternHelper.f().getOpposite() == c2.f().getOpposite()) {
                f3 = vqa.T;
                f4 = vqa.T;
                kY_14 = c2;
            } else if (blockPattern$PatternHelper.f().getOpposite() == c2.f().rotateY()) {
                f5 = pqa.r;
                f6 = vqa.T;
                kY_14 = c2;
            } else {
                f5 = vqa.T;
                f6 = pqa.r;
                kY_14 = c2;
            }
            d3 = ((vL)kY_14).i;
            kY_1 kY_17 = c2;
            double d8 = ((vL)kY_17).f;
            kY_17.f(d3 * (double)f3 + d8 * (double)f6);
            kY_17.l(d3 * (double)f5 + d8 * (double)f4);
            ((vL)kY_17).X = a2 - (float)(c2.f().getOpposite().getHorizontalIndex() * Jsa.ha) + (float)(blockPattern$PatternHelper.f().getHorizontalIndex() * Jsa.ha);
            kY_1 kY_18 = c2;
            kY_17.f(d5, d6, d7, ((vL)kY_18).X, ((vL)kY_18).d);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2) {
        kY_1 c2 = vL2;
        kY_1 b2 = this;
        if (b2.I.F.J() != vRa.d) {
            void a2;
            if (!b2.J((vL)c2, (float)a2)) {
                b2.J((vL)c2);
                b2.J((vL)c2, (float)a2);
                return;
            }
        } else {
            int n2;
            kY_1 kY_12 = c2;
            int a2 = Oz.f((double)((vL)kY_12).la);
            int n3 = Oz.f((double)((vL)kY_12).Z) - vRa.d;
            int n4 = Oz.f((double)((vL)kY_12).A);
            int n5 = vRa.d;
            int n6 = uSa.E;
            int n7 = n2 = rQa.p;
            while (n7 <= uqa.g) {
                int n8 = rQa.p;
                while (n8 <= uqa.g) {
                    int n9;
                    int n10 = pua.o;
                    while (n10 < yRa.d) {
                        int n11;
                        int n12 = a2 + n9 * n5 + n2 * n6;
                        int n13 = n3 + n11;
                        int n14 = n4 + n9 * n6 - n2 * n5;
                        int n15 = n11 < 0 ? vRa.d : uSa.E;
                        b2.I.J(new XF(n12, n13, n14), n15 != 0 ? QFa.X.J() : QFa.HF.J());
                        n10 = ++n11;
                    }
                    n8 = ++n9;
                }
                n7 = ++n2;
            }
            kY_1 kY_13 = c2;
            kY_13.f(a2, n3, n4, ((vL)c2).X, JPa.N);
            kY_13.f(aSa.V);
            kY_13.J(aSa.V);
            kY_13.l(aSa.V);
        }
    }
}

