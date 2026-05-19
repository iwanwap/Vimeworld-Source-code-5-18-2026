/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IE
 *  qF
 */
import java.util.function.Predicate;

public final class Vf
implements Predicate {
    private static final Vf I = new Vf();

    private Vf() {
        Vf a2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        Vf a2 = this;
        return IE.J((qF)((qF)b2));
    }

    public static Predicate J() {
        return I;
    }
}

