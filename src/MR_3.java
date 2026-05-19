/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 *  bq
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class MR_3
implements BiConsumer {
    private final Consumer I;

    private MR_3(Consumer consumer) {
        Consumer b2 = consumer;
        MR_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        MR_3 a2 = this;
        bq.J((Consumer)a2.I, (YQ)((YQ)b2), (Throwable)((Throwable)c2));
    }

    public static BiConsumer J(Consumer a2) {
        return new MR_3(a2);
    }
}

