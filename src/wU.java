/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  jW
 *  vRa
 *  ysa
 */
import java.util.Random;

public final class wU
extends jW {
    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        Random d2 = random;
        wU b2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ysa.s) {
            void c2;
            void a2;
            XF xF2 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (QFa.HC.J((Gg)c2, xF2) && c2.J(xF2.down()).J() == QFa.lf) {
                c2.J(xF2, QFa.HC.J(), uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public wU() {
        wU a2;
    }
}

