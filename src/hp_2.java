/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  wI
 */
import java.util.function.BiConsumer;

public final class hp_2
implements BiConsumer {
    private final wI I;

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        hp_2 a2 = this;
        Bp.J(a2.I, (String)b2, (Bp)c2);
    }

    public static BiConsumer J(wI a2) {
        return new hp_2(a2);
    }

    private hp_2(wI wI2) {
        hp_2 b2 = wI2;
        hp_2 a2 = this;
        a2.I = b2;
    }
}

