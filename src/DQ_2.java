/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public final class DQ_2
implements Predicate {
    private final String I;

    public boolean test(Object object) {
        Object b2 = object;
        DQ_2 a2 = this;
        return Tp.J(a2.I, (mIa)b2);
    }

    private DQ_2(String string) {
        String b2 = string;
        DQ_2 a2 = this;
        a2.I = b2;
    }

    public static Predicate J(String a2) {
        return new DQ_2(a2);
    }
}

