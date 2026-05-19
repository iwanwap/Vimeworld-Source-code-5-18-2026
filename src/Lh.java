/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Lh
implements Supplier {
    private final RJ I;

    public static Supplier J(RJ a2) {
        return new Lh(a2);
    }

    public Object get() {
        Lh a2;
        return RJ.k(a2.I);
    }

    private Lh(RJ rJ) {
        Object b2 = rJ;
        Lh a2 = this;
        a2.I = b2;
    }
}

