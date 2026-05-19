/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class hj_1
implements Function {
    private final RJ I;

    public Object apply(Object object) {
        Object b2 = object;
        hj_1 a2 = this;
        return RJ.d(a2.I, (String)b2);
    }

    private hj_1(RJ rJ2) {
        Object b2 = rJ2;
        hj_1 a2 = this;
        a2.I = b2;
    }

    public static Function J(RJ a2) {
        return new hj_1(a2);
    }
}

