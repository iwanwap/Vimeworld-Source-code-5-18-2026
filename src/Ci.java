/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Ci
implements Supplier {
    private final aj I;

    private Ci(aj aj2) {
        Object b2 = aj2;
        Ci a2 = this;
        a2.I = b2;
    }

    public Object get() {
        Ci a2;
        return aj.d(a2.I);
    }

    public static Supplier J(aj a2) {
        return new Ci(a2);
    }
}

