/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  di
 */
import java.io.InputStream;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class Bj_2
implements Consumer {
    private final CompletableFuture I;

    public void accept(Object object) {
        Object b2 = object;
        Bj_2 a2 = this;
        di.J((CompletableFuture)a2.I, (InputStream)((InputStream)b2));
    }

    public static Consumer J(CompletableFuture a2) {
        return new Bj_2(a2);
    }

    private Bj_2(CompletableFuture completableFuture) {
        CompletableFuture b2 = completableFuture;
        Bj_2 a2 = this;
        a2.I = b2;
    }
}

