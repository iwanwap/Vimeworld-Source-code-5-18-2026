/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 *  bq
 */
import java.util.concurrent.CompletableFuture;

public final class jQ_3
implements Runnable {
    private final CompletableFuture J;
    private final YQ A;
    private final bq I;

    @Override
    public void run() {
        jQ_3 a2;
        jQ_3 jQ_32 = a2;
        bq.J((bq)jQ_32.I, (YQ)jQ_32.A, (CompletableFuture)a2.J);
    }

    /*
     * WARNING - void declaration
     */
    private jQ_3(bq bq2, YQ yQ2, CompletableFuture completableFuture) {
        void b2;
        void c2;
        jQ_3 a2;
        CompletableFuture d2 = completableFuture;
        jQ_3 jQ_32 = a2 = this;
        a2.I = c2;
        jQ_32.A = b2;
        jQ_32.J = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(bq bq2, YQ yQ2, CompletableFuture completableFuture) {
        void b2;
        Object c2 = completableFuture;
        bq a2 = bq2;
        return new jQ_3(a2, (YQ)b2, (CompletableFuture)c2);
    }
}

