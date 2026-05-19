/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  QFa
 *  hra
 *  jW
 *  sFa
 *  vL
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;

public final class Pv_2
extends jW {
    private Block I;

    public Pv_2(Block block) {
        Object b2 = block;
        Pv_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void c2;
        XF d2 = xF2;
        Pv_2 a2 = this;
        if (c2.J(d2) && c2.J(d2.down()).J() == a2.I) {
            sFa sFa2;
            int n2;
            int n3;
            int n4;
            int n5;
            void b2;
            void v0 = b2;
            int n6 = v0.nextInt(fPa.i) + uua.p;
            int n7 = v0.nextInt(AQa.P) + vRa.d;
            zz zz2 = new zz();
            int n8 = n5 = d2.getX() - n7;
            while (n8 <= d2.getX() + n7) {
                int n9 = d2.getZ() - n7;
                while (n9 <= d2.getZ() + n7) {
                    n4 = n5 - d2.getX();
                    n2 = n3 - d2.getZ();
                    int n10 = n4;
                    int n11 = n2;
                    int n12 = n7;
                    if (n10 * n10 + n11 * n11 <= n12 * n12 + vRa.d && c2.J((XF)zz2.func_181079_c(n5, d2.getY() - vRa.d, n3)).J() != a2.I) {
                        return uSa.E != 0;
                    }
                    n9 = ++n3;
                }
                n8 = ++n5;
            }
            int n13 = n5 = d2.getY();
            while (n13 < d2.getY() + n6 && n5 < hra.Ja) {
                int n14 = d2.getX() - n7;
                while (n14 <= d2.getX() + n7) {
                    int n15 = d2.getZ() - n7;
                    while (n15 <= d2.getZ() + n7) {
                        n2 = n3 - d2.getX();
                        int n16 = n4 - d2.getZ();
                        int n17 = n2;
                        int n18 = n16;
                        int n19 = n7;
                        if (n17 * n17 + n18 * n18 <= n19 * n19 + vRa.d) {
                            c2.J(new XF(n3, n5, n4), QFa.X.J(), uqa.g);
                        }
                        n15 = ++n4;
                    }
                    n14 = ++n3;
                }
                n13 = ++n5;
            }
            sFa sFa3 = sFa2 = new sFa((Gg)c2);
            sFa3.f((double)((float)d2.getX() + MQa.L), (double)(d2.getY() + n6), (double)((float)d2.getZ() + MQa.L), b2.nextFloat() * CRa.ja, JPa.N);
            c2.f((vL)sFa3);
            c2.J(d2.up(n6), QFa.bg.J(), uqa.g);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

