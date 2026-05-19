/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Yk_1
implements Supplier {
    private final RJ I;

    private Yk_1(RJ rJ2) {
        Object b2 = rJ2;
        Yk_1 a2 = this;
        a2.I = b2;
    }

    public static Supplier J(RJ a2) {
        return new Yk_1(a2);
    }

    public Object get() {
        Yk_1 a2;
        return RJ.D(a2.I);
    }
}

