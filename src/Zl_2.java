/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  Sk
 */
import java.util.function.Predicate;

public final class Zl_2
implements Predicate {
    private final Kl I;

    public static Predicate J(Kl a2) {
        return new Zl_2(a2);
    }

    public boolean test(Object object) {
        Object b2 = object;
        Zl_2 a2 = this;
        return Sk.J((Kl)a2.I, (Kl)((Kl)b2));
    }

    private Zl_2(Kl kl2) {
        Zl_2 b2 = kl2;
        Zl_2 a2 = this;
        a2.I = b2;
    }
}

