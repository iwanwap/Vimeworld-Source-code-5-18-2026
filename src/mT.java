/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class mT
implements Function {
    private static final mT instance = new mT();

    private mT() {
        mT a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        mT a2 = this;
        return St.D((b[])b2);
    }
}

