/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pP
 */
import java.util.function.BiConsumer;

public final class GP_1
implements BiConsumer {
    private final pP I;

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        GP_1 a2 = this;
        pP.J((pP)a2.I, (String)((String)b2), (pp)((pp)c2));
    }

    private GP_1(pP pP2) {
        GP_1 b2 = pP2;
        GP_1 a2 = this;
        a2.I = b2;
    }

    public static BiConsumer J(pP a2) {
        return new GP_1(a2);
    }
}

