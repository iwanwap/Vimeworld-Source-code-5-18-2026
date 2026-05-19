/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  LQa
 *  QFa
 *  jW
 *  lqa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.material.Material;

public final class SV_3
extends jW {
    public SV_3() {
        SV_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void a2;
        SV_3 d2 = gg2;
        SV_3 c2 = this;
        if (!d2.J((XF)a2)) {
            return uSa.E != 0;
        }
        if (d2.J(a2.up()).J() != QFa.GA) {
            return uSa.E != 0;
        }
        d2.J((XF)a2, QFa.rc.J(), uqa.g);
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < LQa.v) {
            void b2;
            XF xF3 = a2.add(b2.nextInt(Yqa.i) - b2.nextInt(Yqa.i), -b2.nextInt(lqa.s), b2.nextInt(Yqa.i) - b2.nextInt(Yqa.i));
            if (d2.J(xF3).J().J() == Material.air) {
                int n4;
                block8: {
                    int n5 = uSa.E;
                    DZ[] dZArray = DZ.values();
                    int n6 = dZArray.length;
                    int n7 = uSa.E;
                    while (n7 < n6) {
                        int n8;
                        DZ dZ2 = dZArray[n8];
                        if (d2.J(xF3.offset(dZ2)).J() == QFa.rc) {
                            ++n5;
                        }
                        if (n5 > vRa.d) {
                            n4 = n5;
                            break block8;
                        }
                        n7 = ++n8;
                    }
                    n4 = n5;
                }
                if (n4 == vRa.d) {
                    d2.J(xF3, QFa.rc.J(), uqa.g);
                }
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

