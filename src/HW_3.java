/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zU
 */
import java.util.Set;
import java.util.function.BiConsumer;

public final class HW_3
implements BiConsumer {
    private final Set I;

    /*
     * WARNING - void declaration
     */
    public void accept(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        HW_3 a2 = this;
        zU.J((Set)a2.I, (String)((String)b2), (XW)((XW)((Object)c2)));
    }

    private HW_3(Set set) {
        Set b2 = set;
        HW_3 a2 = this;
        a2.I = b2;
    }

    public static BiConsumer J(Set a2) {
        return new HW_3(a2);
    }
}

