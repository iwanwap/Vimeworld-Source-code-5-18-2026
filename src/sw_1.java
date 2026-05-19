/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  jW
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class sw_1
extends jW {
    private int A;
    private Block I;

    public sw_1(int n2) {
        int b2 = n2;
        sw_1 a2 = this;
        a2.I = QFa.pd;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        void b22;
        void c2;
        Object d2 = xF2;
        sw_1 a2 = this;
        if (c2.J((XF)((Object)d2)).J().J() != Material.water) {
            return uSa.E != 0;
        }
        int b22 = b22.nextInt(a2.A - uqa.g) + uqa.g;
        int n3 = vRa.d;
        int n4 = n2 = d2.getX() - b22;
        while (n4 <= d2.getX() + b22) {
            int n5 = d2.getZ() - b22;
            while (n5 <= d2.getZ() + b22) {
                int n6;
                int n7 = n2 - d2.getX();
                int n8 = n6 - d2.getZ();
                int n9 = n7;
                int n10 = n8;
                int n11 = b22;
                if (n9 * n9 + n10 * n10 <= n11 * n11) {
                    int n12 = n7 = d2.getY() - n3;
                    while (n12 <= d2.getY() + n3) {
                        XF xF3 = new XF(n2, n7, n6);
                        Block block = c2.J(xF3).J();
                        if (block == QFa.Bc || block == QFa.pd) {
                            c2.J(xF3, a2.I.J(), uqa.g);
                        }
                        n12 = ++n7;
                    }
                }
                n5 = ++n6;
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }
}

