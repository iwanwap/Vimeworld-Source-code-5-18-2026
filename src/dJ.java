/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class dJ
implements Consumer {
    private final Throwable I;

    public static Consumer J(Throwable a2) {
        return new dJ(a2);
    }

    private dJ(Throwable throwable) {
        Throwable b2 = throwable;
        dJ a2 = this;
        a2.I = b2;
    }

    public void accept(Object object) {
        Object b2 = object;
        dJ a2 = this;
        Kl.J((Throwable)a2.I, (CompletableFuture)((CompletableFuture)b2));
    }
}

