/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oi
 */
import com.google.common.base.Predicate;

public final class MG_2
implements Predicate {
    private final Oi I;

    public static Predicate J(Oi a2) {
        return new MG_2(a2);
    }

    public boolean apply(Object object) {
        Object b2 = object;
        MG_2 a2 = this;
        return Oi.J((Oi)a2.I, (gh)((gh)b2));
    }

    private MG_2(Oi oi2) {
        MG_2 b2 = oi2;
        MG_2 a2 = this;
        a2.I = b2;
    }
}

