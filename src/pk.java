/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  cJ
 */
import java.util.Map;

public final class pk
implements Runnable {
    private final cJ J;
    private final Map A;
    private final Kl I;

    @Override
    public void run() {
        pk a2;
        pk pk2 = a2;
        cJ.J((cJ)pk2.J, (Kl)pk2.I, (Map)a2.A);
    }

    /*
     * WARNING - void declaration
     */
    private pk(cJ cJ2, Kl kl, Map map) {
        void b2;
        void c2;
        pk a2;
        Map d2 = map;
        pk pk2 = a2 = this;
        a2.J = c2;
        pk2.I = b2;
        pk2.A = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(cJ cJ2, Kl kl, Map map) {
        void b2;
        Object c2 = map;
        cJ a2 = cJ2;
        return new pk(a2, (Kl)b2, (Map)c2);
    }
}

