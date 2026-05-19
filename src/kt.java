/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class kt
implements Supplier {
    private final St arg$1;

    public static Supplier J(St a2) {
        return new kt(a2);
    }

    private kt(St st) {
        Object b2 = st;
        kt a2 = this;
        a2.arg$1 = b2;
    }

    public Object get() {
        kt a2;
        return St.f(a2.arg$1);
    }
}

