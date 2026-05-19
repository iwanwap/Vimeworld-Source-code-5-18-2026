/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  toa
 */
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public final class yNa
extends toa {
    private final Predicate<String> I;

    /*
     * WARNING - void declaration
     */
    public yNa(int n2, String string, boolean bl, Predicate<String> predicate) {
        Object e2;
        void b2;
        void c2;
        void d2;
        yNa yNa2 = object;
        Object object = predicate;
        yNa a2 = yNa2;
        super((int)d2, (String)c2, (boolean)b2);
        a2.I = Objects.firstNonNull(e2, Predicates.alwaysTrue());
    }

    public Predicate<String> J() {
        yNa a2;
        return a2.I;
    }
}

