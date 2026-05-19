/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  VP
 *  Vr
 */
import java.util.function.Predicate;

public final class tP_1
implements Predicate {
    private final String I;

    public boolean test(Object object) {
        Object b2 = object;
        tP_1 a2 = this;
        return Vr.J((String)a2.I, (VP)((VP)b2));
    }

    public static Predicate J(String a2) {
        return new tP_1(a2);
    }

    private tP_1(String string) {
        String b2 = string;
        tP_1 a2 = this;
        a2.I = b2;
    }
}

