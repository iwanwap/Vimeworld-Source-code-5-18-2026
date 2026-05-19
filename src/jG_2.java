/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class jG_2
implements Supplier {
    private final aj I;

    private jG_2(aj aj2) {
        Object b2 = aj2;
        jG_2 a2 = this;
        a2.I = b2;
    }

    public Object get() {
        jG_2 a2;
        return aj.J(a2.I);
    }

    public static Supplier J(aj a2) {
        return new jG_2(a2);
    }
}

