/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  bq
 */
import java.io.InputStream;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class YP_2
implements Consumer {
    private final Kl J;
    private final CompletableFuture A;
    private final bq I;

    /*
     * WARNING - void declaration
     */
    public static Consumer J(bq bq2, CompletableFuture completableFuture, Kl kl2) {
        void b2;
        bq c2 = kl2;
        bq a2 = bq2;
        return new YP_2(a2, (CompletableFuture)b2, (Kl)c2);
    }

    /*
     * WARNING - void declaration
     */
    private YP_2(bq bq2, CompletableFuture completableFuture, Kl kl2) {
        void b2;
        void c2;
        YP_2 a2;
        YP_2 d2 = kl2;
        YP_2 yP_2 = a2 = this;
        a2.I = c2;
        yP_2.A = b2;
        yP_2.J = d2;
    }

    public void accept(Object object) {
        YP_2 a2;
        Object b2 = object;
        YP_2 yP_2 = a2 = this;
        bq.J((bq)yP_2.I, (CompletableFuture)yP_2.A, (Kl)a2.J, (InputStream)((InputStream)b2));
    }
}

