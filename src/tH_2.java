/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  di
 */
import java.awt.Font;
import java.util.function.BiConsumer;

public final class tH_2
implements BiConsumer {
    private final cG A;
    private final Ii I;

    public static BiConsumer J(Ii ii2, cG cG2) {
        cG b2 = cG2;
        Ii a2 = ii2;
        return new tH_2(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private tH_2(Ii ii2, cG cG2) {
        void b2;
        tH_2 a2;
        cG c2 = cG2;
        tH_2 tH_22 = a2 = this;
        tH_22.I = b2;
        tH_22.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        tH_2 a2;
        Object c2 = object2;
        tH_2 tH_22 = a2 = this;
        di.J((Ii)tH_22.I, (cG)tH_22.A, (Font)((Font)b2), (Throwable)((Throwable)c2));
    }
}

