/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JB
 *  VP
 *  Vr
 */
import java.util.function.Predicate;

public final class jR_2
implements Predicate {
    private final JB I;

    public static Predicate J(JB a2) {
        return new jR_2(a2);
    }

    public boolean test(Object object) {
        Object b2 = object;
        jR_2 a2 = this;
        return Vr.J((JB)a2.I, (VP)((VP)b2));
    }

    private jR_2(JB jB2) {
        jR_2 b2 = jB2;
        jR_2 a2 = this;
        a2.I = b2;
    }
}

