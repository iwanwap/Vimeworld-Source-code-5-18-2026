/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  VP
 *  Vr
 */
import java.util.function.Predicate;

public final class rq_3
implements Predicate {
    private final String I;

    public static Predicate J(String a2) {
        return new rq_3(a2);
    }

    private rq_3(String string) {
        String b2 = string;
        rq_3 a2 = this;
        a2.I = b2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        rq_3 a2 = this;
        return Vr.f((String)a2.I, (VP)((VP)b2));
    }
}

