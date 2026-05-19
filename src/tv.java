/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import java.util.function.BiConsumer;

public final class tv
implements BiConsumer {
    private final XW I;

    public static BiConsumer J(XW a2) {
        return new tv(a2);
    }

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        tv a2 = this;
        a2.I.J((uEa)b2, (Mda)c2);
    }

    private tv(XW xW2) {
        Object b2 = xW2;
        tv a2 = this;
        a2.I = b2;
    }
}

