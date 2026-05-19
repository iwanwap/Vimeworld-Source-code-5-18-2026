/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  Oz
 *  QFa
 *  XTa
 *  jW
 *  pqa
 *  pua
 *  vRa
 *  vpa
 *  wOa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class IV_3
extends jW {
    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        int n3;
        int n4;
        int n5;
        void b2;
        XF a2;
        void c2;
        IV_3 iV_3 = this;
        void v0 = c2;
        while (v0.J(a2) && a2.getY() > uqa.g) {
            a2 = a2.down();
            v0 = c2;
        }
        if (c2.J(a2).J() != QFa.mb) {
            return uSa.E != 0;
        }
        a2 = a2.up(b2.nextInt(AQa.P));
        int n6 = b2.nextInt(AQa.P) + XTa.W;
        int n7 = n6 / AQa.P + b2.nextInt(uqa.g);
        if (n7 > vRa.d && b2.nextInt(Psa.M) == 0) {
            a2 = a2.up(NTa.C + b2.nextInt(Fsa.d));
        }
        int n8 = n5 = uSa.E;
        while (n8 < n6) {
            float f2 = (pqa.r - (float)n5 / (float)n6) * (float)n7;
            n4 = Oz.f((float)f2);
            int n9 = -n4;
            while (n9 <= n4) {
                int d2;
                float f3 = (float)Oz.f((int)d2) - rta.o;
                int n10 = -n4;
                while (n10 <= n4) {
                    int n11;
                    block20: {
                        block19: {
                            float f4 = (float)Oz.f((int)n11) - rta.o;
                            if (d2 == 0 && n11 == 0) break block19;
                            float f5 = f3;
                            float f6 = f4;
                            float f7 = f2;
                            if (!(f5 * f5 + f6 * f6 <= f7 * f7)) break block20;
                        }
                        if (d2 != -n4 && d2 != n4 && n11 != -n4 && n11 != n4 || b2.nextFloat() <= wOa.w) {
                            Block block = c2.J(a2.add(d2, n5, n11)).J();
                            if (block.J() == Material.air || block == QFa.Bc || block == QFa.mb || block == QFa.Ta) {
                                iV_3.J((Gg)c2, a2.add(d2, n5, n11), QFa.C.J());
                            }
                            if (n5 != 0 && n4 > vRa.d && ((block = c2.J(a2.add(d2, -n5, n11)).J()).J() == Material.air || block == QFa.Bc || block == QFa.mb || block == QFa.Ta)) {
                                iV_3.J((Gg)c2, a2.add(d2, -n5, n11), QFa.C.J());
                            }
                        }
                    }
                    n10 = ++n11;
                }
                n9 = ++d2;
            }
            n8 = ++n5;
        }
        n5 = n7 - vRa.d;
        if (n5 < 0) {
            n3 = n5 = uSa.E;
        } else {
            if (n5 > vRa.d) {
                n5 = vRa.d;
            }
            n3 = n5;
        }
        int n12 = n2 = -n3;
        while (n12 <= n5) {
            int n13 = -n5;
            while (n13 <= n5) {
                Block block;
                Object d2 = a2.add(n2, pua.o, n4);
                int n14 = vpa.o;
                if (Math.abs(n2) == vRa.d && Math.abs(n4) == vRa.d) {
                    n14 = b2.nextInt(tTa.h);
                }
                while (d2.getY() > vpa.o && ((block = c2.J((XF)((Object)d2)).J()).J() == Material.air || block == QFa.Bc || block == QFa.mb || block == QFa.Ta || block == QFa.C)) {
                    iV_3.J((Gg)c2, (XF)((Object)d2), QFa.C.J());
                    d2 = ((XF)((Object)d2)).down();
                    if (--n14 > 0) continue;
                    d2 = ((XF)((Object)d2)).down(b2.nextInt(tTa.h) + vRa.d);
                    n14 = b2.nextInt(tTa.h);
                }
                n13 = ++n4;
            }
            n12 = ++n2;
        }
        return vRa.d != 0;
    }

    public IV_3() {
        IV_3 a2;
    }
}

