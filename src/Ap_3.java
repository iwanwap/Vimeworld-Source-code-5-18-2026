/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bq
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public final class Ap_3
implements Predicate {
    private final bq I;

    private Ap_3(bq bq2) {
        Ap_3 b2 = bq2;
        Ap_3 a2 = this;
        a2.I = b2;
    }

    public static Predicate J(bq a2) {
        return new Ap_3(a2);
    }

    public boolean test(Object object) {
        Object b2 = object;
        Ap_3 a2 = this;
        return bq.J((bq)a2.I, (CompletableFuture)((CompletableFuture)b2));
    }
}

