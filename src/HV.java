/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  jW
 *  vRa
 */
import java.util.Random;

public final class HV
extends jW {
    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        Random d2 = random;
        HV b2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < NTa.C) {
            void c2;
            void a2;
            XF xF2 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF2)) {
                Random random2 = d2;
                int n4 = vRa.d + random2.nextInt(random2.nextInt(yRa.d) + vRa.d);
                int n5 = uSa.E;
                while (n5 < n4) {
                    int n6;
                    if (QFa.dd.l((Gg)c2, xF2)) {
                        c2.J(xF2.up(n6), QFa.dd.J(), uqa.g);
                    }
                    n5 = ++n6;
                }
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public HV() {
        HV a2;
    }
}

