/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class qg
implements Supplier {
    private final aj I;

    public static Supplier J(aj a2) {
        return new qg(a2);
    }

    public Object get() {
        qg a2;
        return aj.l(a2.I);
    }

    private qg(aj aj2) {
        Object b2 = aj2;
        qg a2 = this;
        a2.I = b2;
    }
}

