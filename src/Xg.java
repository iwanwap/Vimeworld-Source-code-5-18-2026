/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Xg
implements Supplier {
    private final RJ I;

    private Xg(RJ rJ2) {
        Object b2 = rJ2;
        Xg a2 = this;
        a2.I = b2;
    }

    public Object get() {
        Xg a2;
        return RJ.d(a2.I);
    }

    public static Supplier J(RJ a2) {
        return new Xg(a2);
    }
}

