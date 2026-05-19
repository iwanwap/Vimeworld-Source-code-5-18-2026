/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public final class Cp
implements Predicate {
    private final String I;

    public static Predicate J(String a2) {
        return new Cp(a2);
    }

    private Cp(String string) {
        String b2 = string;
        Cp a2 = this;
        a2.I = b2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        Cp a2 = this;
        return eq.J(a2.I, (Bp)b2);
    }
}

