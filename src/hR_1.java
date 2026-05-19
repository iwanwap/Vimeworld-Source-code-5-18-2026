/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tp
 */
import java.util.function.Predicate;

public final class hR_1
implements Predicate {
    private final int I;

    public static Predicate J(int a2) {
        return new hR_1(a2);
    }

    public boolean test(Object object) {
        Object b2 = object;
        hR_1 a2 = this;
        return tp.J((int)a2.I, (Bp)((Bp)b2));
    }

    private hR_1(int n2) {
        int b2 = n2;
        hR_1 a2 = this;
        a2.I = b2;
    }
}

