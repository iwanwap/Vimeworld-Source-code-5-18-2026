/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  Gg
 *  Jy
 *  Mz
 *  QFa
 *  QSa
 *  Qqa
 *  XTa
 *  Ypa
 *  Zta
 *  jW
 *  lPa
 *  uRa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class Bw
extends jW {
    private Block I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        Material material;
        int n2;
        int d2;
        void b2;
        void c2;
        XF a2;
        Bw bw = this;
        XF xF2 = a2 = a2.add(Qqa.i, uSa.E, Qqa.i);
        while (xF2.getY() > tTa.h && c2.J(a2)) {
            xF2 = a2.down();
        }
        if (a2.getY() <= AQa.P) {
            return uSa.E != 0;
        }
        a2 = a2.down(AQa.P);
        boolean[] blArray = new boolean[QSa.ba];
        int n3 = b2.nextInt(AQa.P) + AQa.P;
        int n4 = d2 = uSa.E;
        while (n4 < n3) {
            void v2 = b2;
            double d3 = v2.nextDouble() * lPa.K + uRa.I;
            double d4 = v2.nextDouble() * FPa.T + KPa.y;
            double d5 = v2.nextDouble() * lPa.K + uRa.I;
            double d6 = v2.nextDouble() * (Zta.ba - d3 - KPa.y) + oua.i + d3 / KPa.y;
            double d7 = v2.nextDouble() * (Wqa.Z - d4 - FPa.T) + KPa.y + d4 / KPa.y;
            double d8 = v2.nextDouble() * (Zta.ba - d5 - KPa.y) + oua.i + d5 / KPa.y;
            int n5 = vRa.d;
            while (n5 < Ypa.A) {
                int n6;
                int n7 = vRa.d;
                while (n7 < Ypa.A) {
                    int n8;
                    int n9 = vRa.d;
                    while (n9 < XTa.W) {
                        int n10;
                        double d9 = ((double)n6 - d6) / (d3 / KPa.y);
                        double d10 = ((double)n10 - d7) / (d4 / KPa.y);
                        double d11 = ((double)n8 - d8) / (d5 / KPa.y);
                        double d12 = d9;
                        double d13 = d10;
                        double d14 = d11;
                        if (d12 * d12 + d13 * d13 + d14 * d14 < oua.i) {
                            blArray[(n6 * ERa.C + n8) * Yqa.i + n10] = vRa.d;
                        }
                        n9 = ++n10;
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++d2;
        }
        int n11 = d2 = uSa.E;
        while (n11 < ERa.C) {
            int n12 = uSa.E;
            while (n12 < ERa.C) {
                int n13;
                int n14 = uSa.E;
                while (n14 < Yqa.i) {
                    int n15;
                    int n16 = n15 = !blArray[(d2 * ERa.C + n13) * Yqa.i + n2] && (d2 < Ypa.A && blArray[((d2 + vRa.d) * ERa.C + n13) * Yqa.i + n2] || d2 > 0 && blArray[((d2 - vRa.d) * ERa.C + n13) * Yqa.i + n2] || n13 < Ypa.A && blArray[(d2 * ERa.C + n13 + vRa.d) * Yqa.i + n2] || n13 > 0 && blArray[(d2 * ERa.C + (n13 - vRa.d)) * Yqa.i + n2] || n2 < XTa.W && blArray[(d2 * ERa.C + n13) * Yqa.i + n2 + vRa.d] || n2 > 0 && blArray[(d2 * ERa.C + n13) * Yqa.i + (n2 - vRa.d)]) ? vRa.d : uSa.E;
                    if (n15 != 0) {
                        material = c2.J(a2.add(d2, n2, n13)).J().J();
                        if (n2 >= AQa.P && material.l()) {
                            return uSa.E != 0;
                        }
                        if (n2 < AQa.P && !material.i() && c2.J(a2.add(d2, n2, n13)).J() != bw.I) {
                            return uSa.E != 0;
                        }
                    }
                    n14 = ++n2;
                }
                n12 = ++n13;
            }
            n11 = ++d2;
        }
        int n17 = d2 = uSa.E;
        while (n17 < ERa.C) {
            int n18 = uSa.E;
            while (n18 < ERa.C) {
                int n19;
                int n20 = uSa.E;
                while (n20 < Yqa.i) {
                    if (blArray[(d2 * ERa.C + n19) * Yqa.i + n2]) {
                        c2.J(a2.add(d2, n2, n19), n2 >= AQa.P ? QFa.HF.J() : bw.I.J(), uqa.g);
                    }
                    n20 = ++n2;
                }
                n18 = ++n19;
            }
            n17 = ++d2;
        }
        int n21 = d2 = uSa.E;
        while (n21 < ERa.C) {
            int n22 = uSa.E;
            while (n22 < ERa.C) {
                int n23;
                int n24 = AQa.P;
                while (n24 < Yqa.i) {
                    XF xF3;
                    if (blArray[(d2 * ERa.C + n23) * Yqa.i + n2] && c2.J(xF3 = a2.add(d2, n2 - vRa.d, n23)).J() == QFa.Bc && c2.J(Mz.SKY, a2.add(d2, n2, n23)) > 0) {
                        material = c2.J(xF3);
                        if (((Jy)material).M.J() == QFa.uB) {
                            c2.J(xF3, QFa.uB.J(), uqa.g);
                        } else {
                            c2.J(xF3, QFa.lf.J(), uqa.g);
                        }
                    }
                    n24 = ++n2;
                }
                n22 = ++n23;
            }
            n21 = ++d2;
        }
        if (bw.I.J() == Material.lava) {
            int n25 = d2 = uSa.E;
            while (n25 < ERa.C) {
                int n26 = uSa.E;
                while (n26 < ERa.C) {
                    int n27;
                    int n28 = uSa.E;
                    while (n28 < Yqa.i) {
                        int n29;
                        int n30 = n29 = !blArray[(d2 * ERa.C + n27) * Yqa.i + n2] && (d2 < Ypa.A && blArray[((d2 + vRa.d) * ERa.C + n27) * Yqa.i + n2] || d2 > 0 && blArray[((d2 - vRa.d) * ERa.C + n27) * Yqa.i + n2] || n27 < Ypa.A && blArray[(d2 * ERa.C + n27 + vRa.d) * Yqa.i + n2] || n27 > 0 && blArray[(d2 * ERa.C + (n27 - vRa.d)) * Yqa.i + n2] || n2 < XTa.W && blArray[(d2 * ERa.C + n27) * Yqa.i + n2 + vRa.d] || n2 > 0 && blArray[(d2 * ERa.C + n27) * Yqa.i + (n2 - vRa.d)]) ? vRa.d : uSa.E;
                        if (n29 != 0 && (n2 < AQa.P || b2.nextInt(uqa.g) != 0) && c2.J(a2.add(d2, n2, n27)).J().J().i()) {
                            c2.J(a2.add(d2, n2, n27), QFa.Gd.J(), uqa.g);
                        }
                        n28 = ++n2;
                    }
                    n26 = ++n27;
                }
                n25 = ++d2;
            }
        }
        if (bw.I.J() == Material.water) {
            int n31 = d2 = uSa.E;
            while (n31 < ERa.C) {
                int n32 = uSa.E;
                while (n32 < ERa.C) {
                    int n33;
                    n2 = AQa.P;
                    if (c2.d(a2.add(d2, n2, n33))) {
                        c2.J(a2.add(d2, n2, n33), QFa.Ta.J(), uqa.g);
                    }
                    n32 = ++n33;
                }
                n31 = ++d2;
            }
        }
        return vRa.d != 0;
    }

    public Bw(Block block) {
        Object b2 = block;
        Bw a2 = this;
        a2.I = b2;
    }
}

