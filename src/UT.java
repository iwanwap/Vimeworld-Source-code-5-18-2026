/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class UT
implements Function {
    private static final UT instance = new UT();

    public Object apply(Object object) {
        Object b2 = object;
        UT a2 = this;
        return St.d((b[])b2);
    }

    private UT() {
        UT a2;
    }

    public static Function J() {
        return instance;
    }
}

