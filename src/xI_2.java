/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class xI_2
implements Supplier {
    private final aj I;

    public static Supplier J(aj a2) {
        return new xI_2(a2);
    }

    public Object get() {
        xI_2 a2;
        return aj.f(a2.I);
    }

    private xI_2(aj aj2) {
        Object b2 = aj2;
        xI_2 a2 = this;
        a2.I = b2;
    }
}

