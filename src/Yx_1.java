/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hv
 *  Nv
 */
import java.util.function.Predicate;

public final class Yx_1
implements Predicate {
    private final int I;

    public boolean test(Object object) {
        Object b2 = object;
        Yx_1 a2 = this;
        return Nv.J((int)a2.I, (Hv)((Hv)b2));
    }

    public static Predicate J(int a2) {
        return new Yx_1(a2);
    }

    private Yx_1(int n2) {
        int b2 = n2;
        Yx_1 a2 = this;
        a2.I = b2;
    }
}

