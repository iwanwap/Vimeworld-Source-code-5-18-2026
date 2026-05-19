/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dpa
 *  zra
 */
import java.util.function.BiConsumer;

public final class ePa_3
implements BiConsumer {
    private final Dpa I;

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        ePa_3 a2 = this;
        Dpa.J((Dpa)a2.I, (String)((String)b2), (zra)((zra)c2));
    }

    private ePa_3(Dpa dpa2) {
        ePa_3 b2 = dpa2;
        ePa_3 a2 = this;
        a2.I = b2;
    }

    public static BiConsumer J(Dpa a2) {
        return new ePa_3(a2);
    }
}

