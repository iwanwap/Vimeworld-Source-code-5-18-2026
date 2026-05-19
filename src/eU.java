/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Js
 */
import java.util.function.Predicate;

public final class eU
implements Predicate {
    private static final eU instance = new eU();

    public static Predicate J() {
        return instance;
    }

    public boolean test(Object object) {
        Object b2 = object;
        eU a2 = this;
        return ((Js)b2).f();
    }

    private eU() {
        eU a2;
    }
}

