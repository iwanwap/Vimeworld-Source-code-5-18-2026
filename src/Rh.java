/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  di
 */
import java.util.concurrent.CompletableFuture;

public final class Rh
implements Runnable {
    private final di J;
    private final CompletableFuture A;
    private final String I;

    /*
     * WARNING - void declaration
     */
    public static Runnable J(di di2, String string, CompletableFuture completableFuture) {
        void b2;
        Object c2 = completableFuture;
        di a2 = di2;
        return new Rh(a2, (String)b2, (CompletableFuture)c2);
    }

    /*
     * WARNING - void declaration
     */
    private Rh(di di2, String string, CompletableFuture completableFuture) {
        void b2;
        void c2;
        Rh a2;
        CompletableFuture d2 = completableFuture;
        Rh rh2 = a2 = this;
        a2.J = c2;
        rh2.I = b2;
        rh2.A = d2;
    }

    @Override
    public void run() {
        Rh a2;
        Rh rh2 = a2;
        di.J((di)rh2.J, (String)rh2.I, (CompletableFuture)a2.A);
    }
}

