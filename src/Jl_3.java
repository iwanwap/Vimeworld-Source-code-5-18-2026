/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Jl_3
implements Supplier {
    private final RJ I;

    public Object get() {
        Jl_3 a2;
        return RJ.e(a2.I);
    }

    private Jl_3(RJ rJ2) {
        Object b2 = rJ2;
        Jl_3 a2 = this;
        a2.I = b2;
    }

    public static Supplier J(RJ a2) {
        return new Jl_3(a2);
    }
}

