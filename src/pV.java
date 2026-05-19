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

public final class pV
extends jW {
    public pV() {
        pV a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        Random d2 = random;
        pV b2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < NTa.C) {
            void c2;
            void a2;
            void v1 = a2;
            int n4 = v1.getX() + d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i);
            int n5 = v1.getY() + d2.nextInt(AQa.P) - d2.nextInt(AQa.P);
            int n6 = v1.getZ() + d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i);
            if (c2.J(new XF(n4, n5, n6)) && QFa.pB.J((Gg)c2, new XF(n4, n5, n6))) {
                c2.J(new XF(n4, n5, n6), QFa.pB.J(), uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

