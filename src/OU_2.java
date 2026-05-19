/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ow
 *  vRa
 */
import java.util.concurrent.ThreadLocalRandom;

public final class OU_2
extends ow {
    private final int A;
    private final int I;

    public boolean J() {
        OU_2 oU_2 = this;
        int a2 = oU_2.J();
        if (a2 == oU_2.A) {
            return vRa.d != 0;
        }
        if (a2 == oU_2.I) {
            return uSa.E != 0;
        }
        throw new RuntimeException();
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        OU_2 a2 = this;
        a2.J(b2 ? a2.A : a2.I);
    }

    /*
     * WARNING - void declaration
     */
    public OU_2(boolean bl, int n2) {
        void b2;
        OU_2 a2;
        int c22 = n2;
        OU_2 oU_2 = a2 = this;
        super(uSa.E, c22);
        ThreadLocalRandom c22 = ThreadLocalRandom.current();
        oU_2.A = c22.nextInt();
        oU_2.I = c22.nextInt();
        oU_2.J((boolean)b2);
    }
}

