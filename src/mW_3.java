/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lw
 *  vRa
 */
import java.util.concurrent.ThreadLocalRandom;

public class mW_3 {
    private final int j;
    private int J;
    private final Lw A;
    private Lw I;

    public long J() {
        mW_3 a2;
        return Lw.J((Lw)a2.I) ^ Lw.J((Lw)a2.A);
    }

    public void J(long a2) {
        mW_3 b2;
        int n2 = b2.J;
        b2.J = n2 + vRa.d;
        if (n2 >= b2.j) {
            b2.J = uSa.E;
            Lw.J((Lw)b2.A, (long)ThreadLocalRandom.current().nextLong());
            mW_3 mW_32 = b2;
            mW_32.I = new Lw(a2 ^ Lw.J((Lw)b2.A));
            return;
        }
        Lw.J((Lw)b2.I, (long)(a2 ^ Lw.J((Lw)b2.A)));
    }

    /*
     * WARNING - void declaration
     */
    public mW_3(long l2, int n2) {
        void b2;
        int c2 = n2;
        mW_3 a2 = this;
        a2.j = c2;
        mW_3 mW_32 = a2;
        a2.I = new Lw(nqa.i);
        a2.A = new Lw(ThreadLocalRandom.current().nextLong());
        a2.J((long)b2);
    }
}

