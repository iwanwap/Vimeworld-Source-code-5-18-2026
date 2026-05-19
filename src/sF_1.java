/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  Cia
 *  ERa
 *  Faa
 *  Gg
 *  QFa
 *  Qsa
 *  RPa
 *  Saa
 *  Zta
 *  cQa
 *  hd
 *  vL
 *  vRa
 *  zsa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import optifine.Config;

public final class sF_1 {
    public sF_1() {
        sF_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Cia cia2, Gg gg2) {
        vL vL2;
        hd hd2;
        void a2;
        Cia cia3 = cia2;
        if (cia3 != null) {
            int n2 = yRa.d;
            if (cia3.Qa) {
                n2 = vRa.d;
            }
            BlockLeavesBase.J((Block)QFa.sc, n2);
            BlockLeavesBase.J((Block)QFa.jd, n2);
        }
        if (a2 != null && (hd2 = a2.f()) != null && (vL2 = Config.J().J()) != null) {
            vL vL3 = vL2;
            int n3 = (int)vL3.la / ERa.C;
            int n4 = (int)vL3.A / ERa.C;
            int b22 = n3 - cQa.z;
            n3 += cQa.z;
            int n5 = n4 - cQa.z;
            n4 += cQa.z;
            int n6 = uSa.E;
            int n7 = b22 = b22;
            while (n7 < n3) {
                int n8 = n5;
                while (n8 < n4) {
                    Faa faa2;
                    int n9;
                    if (hd2.J(b22, n9) && (faa2 = hd2.J(b22, n9)) != null && !(faa2 instanceof Saa)) {
                        int n10 = b22 << AQa.P;
                        int n11 = n9 << AQa.P;
                        int n12 = n10 + ERa.C;
                        int n13 = n11 + ERa.C;
                        Cf cf2 = new Cf(uSa.E, uSa.E, uSa.E);
                        Cf cf3 = new Cf(uSa.E, uSa.E, uSa.E);
                        int n14 = n10 = n10;
                        while (n14 < n12) {
                            int n15 = n11;
                            while (n15 < n13) {
                                int n16;
                                Cf cf4 = cf2;
                                cf4.setXyz(n10, uSa.E, n16);
                                XF xF2 = a2.J((XF)cf4);
                                int n17 = uSa.E;
                                while (n17 < xF2.getY()) {
                                    int n18;
                                    Cf cf5 = cf3;
                                    cf5.setXyz(n10, n18, n16);
                                    if (a2.J((XF)cf5).J().J() == Material.water) {
                                        ++n6;
                                        a2.J(n10, n16, cf3.getY(), xF2.getY());
                                        break;
                                    }
                                    n17 = ++n18;
                                }
                                n15 = ++n16;
                            }
                            n14 = ++n10;
                        }
                    }
                    n8 = ++n9;
                }
                n7 = ++b22;
            }
            if (n6 > 0) {
                String b22 = Zta.Fa;
                if (Config.Ca()) {
                    b22 = Qsa.ca;
                }
                Config.f(new StringBuilder().insert(2 & 5, zsa.Ea).append(b22).append(RPa.R).append(n6).append(Ura.y).toString());
            }
        }
    }
}

