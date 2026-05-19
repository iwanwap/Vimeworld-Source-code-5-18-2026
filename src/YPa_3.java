/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dpa
 */
import java.util.function.BiConsumer;

public final class YPa_3
implements BiConsumer {
    private final Dpa I;

    public static BiConsumer J(Dpa a2) {
        return new YPa_3(a2);
    }

    private YPa_3(Dpa dpa2) {
        YPa_3 b2 = dpa2;
        YPa_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        YPa_3 a2 = this;
        Dpa.J((Dpa)a2.I, (byte[])((byte[])b2), (byte[])((byte[])c2));
    }
}

