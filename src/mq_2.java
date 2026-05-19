/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class mq_2
implements Supplier {
    private final mIa I;

    public Object get() {
        mq_2 a2;
        return Tp.J(a2.I);
    }

    public static Supplier J(mIa a2) {
        return new mq_2(a2);
    }

    private mq_2(mIa mIa2) {
        mIa b2 = mIa2;
        mq_2 a2 = this;
        a2.I = b2;
    }
}

