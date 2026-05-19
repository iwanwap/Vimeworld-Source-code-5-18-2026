/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class yI_1
implements Supplier {
    private final aj I;

    private yI_1(aj aj2) {
        Object b2 = aj2;
        yI_1 a2 = this;
        a2.I = b2;
    }

    public Object get() {
        yI_1 a2;
        return aj.C(a2.I);
    }

    public static Supplier J(aj a2) {
        return new yI_1(a2);
    }
}

