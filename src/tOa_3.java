/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gqa
 */
import java.util.function.Consumer;

public final class tOa_3
implements Runnable {
    private final Consumer A;
    private final Gqa I;

    /*
     * WARNING - void declaration
     */
    private tOa_3(Gqa gqa2, Consumer consumer) {
        void b2;
        tOa_3 a2;
        Consumer c2 = consumer;
        tOa_3 tOa_32 = a2 = this;
        tOa_32.I = b2;
        tOa_32.A = c2;
    }

    public static Runnable J(Gqa gqa2, Consumer consumer) {
        Object b2 = consumer;
        Gqa a2 = gqa2;
        return new tOa_3(a2, (Consumer)b2);
    }

    @Override
    public void run() {
        tOa_3 a2;
        tOa_3 tOa_32 = a2;
        Gqa.J((Gqa)tOa_32.I, (Consumer)tOa_32.A);
    }
}

