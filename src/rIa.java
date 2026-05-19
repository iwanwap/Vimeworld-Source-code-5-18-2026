/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jia
 */
import java.util.List;

public final class rIa
implements Runnable {
    private final List A;
    private final u I;

    @Override
    public void run() {
        rIa a2;
        rIa rIa2 = a2;
        jia.lambda$processCommand$0((u)rIa2.I, (List)rIa2.A);
    }

    /*
     * WARNING - void declaration
     */
    private rIa(u u2, List list) {
        void b2;
        rIa a2;
        List c2 = list;
        rIa rIa2 = a2 = this;
        rIa2.I = b2;
        rIa2.A = c2;
    }

    public static Runnable J(u u2, List list) {
        List b2 = list;
        u a2 = u2;
        return new rIa(a2, b2);
    }
}

