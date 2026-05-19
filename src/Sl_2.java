/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public final class Sl_2
implements Consumer {
    private final byte[] I;

    public static Consumer J(byte[] a2) {
        return new Sl_2(a2);
    }

    private Sl_2(byte[] byArray) {
        Object b2 = byArray;
        Sl_2 a2 = this;
        a2.I = (byte[])b2;
    }

    public void accept(Object object) {
        Object b2 = object;
        Sl_2 a2 = this;
        Kl.J((byte[])a2.I, (CompletableFuture)((CompletableFuture)b2));
    }
}

