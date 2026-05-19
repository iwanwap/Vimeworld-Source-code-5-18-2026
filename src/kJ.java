/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  bx
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class kJ
implements Consumer {
    private final bx I;

    public static Consumer J(bx a2) {
        return new kJ(a2);
    }

    public void accept(Object object) {
        Object b2 = object;
        kJ a2 = this;
        Kl.J((bx)a2.I, (CompletableFuture)((CompletableFuture)b2));
    }

    private kJ(bx bx2) {
        kJ b2 = bx2;
        kJ a2 = this;
        a2.I = b2;
    }
}

