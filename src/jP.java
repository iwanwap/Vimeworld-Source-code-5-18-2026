/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tp
 */
import java.util.UUID;
import java.util.function.Predicate;

public final class jP
implements Predicate {
    private final UUID I;

    public static Predicate J(UUID a2) {
        return new jP(a2);
    }

    public boolean test(Object object) {
        Object b2 = object;
        jP a2 = this;
        return tp.J((UUID)a2.I, (Bp)((Bp)b2));
    }

    private jP(UUID uUID) {
        UUID b2 = uUID;
        jP a2 = this;
        a2.I = b2;
    }
}

