/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Ct_3
implements Supplier {
    private final St arg$1;

    public Object get() {
        Ct_3 a2;
        return St.C(a2.arg$1);
    }

    private Ct_3(St st2) {
        Object b2 = st2;
        Ct_3 a2 = this;
        a2.arg$1 = b2;
    }

    public static Supplier J(St a2) {
        return new Ct_3(a2);
    }
}

