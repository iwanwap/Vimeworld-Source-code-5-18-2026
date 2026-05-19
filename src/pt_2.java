/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class pt_2
implements Supplier {
    private final St arg$1;

    private pt_2(St st2) {
        Object b2 = st2;
        pt_2 a2 = this;
        a2.arg$1 = b2;
    }

    public static Supplier J(St a2) {
        return new pt_2(a2);
    }

    public Object get() {
        pt_2 a2;
        return St.l(a2.arg$1);
    }
}

