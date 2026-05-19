/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 */
import com.google.common.base.Predicate;

public final class IKa
implements Predicate {
    private static final IKa I = new IKa();

    private IKa() {
        IKa a2;
    }

    public static Predicate J() {
        return I;
    }

    public boolean apply(Object object) {
        Object b2 = object;
        IKa a2 = this;
        return ((vL)b2).E();
    }
}

