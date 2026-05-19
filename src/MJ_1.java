/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class MJ_1
implements Supplier {
    private final RJ I;

    public static Supplier J(RJ a2) {
        return new MJ_1(a2);
    }

    public Object get() {
        MJ_1 a2;
        return RJ.f(a2.I);
    }

    private MJ_1(RJ rJ2) {
        Object b2 = rJ2;
        MJ_1 a2 = this;
        a2.I = b2;
    }
}

