/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class Lk_1
implements Function {
    private final RJ I;

    private Lk_1(RJ rJ2) {
        Object b2 = rJ2;
        Lk_1 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Lk_1 a2 = this;
        return RJ.e(a2.I, (String)b2);
    }

    public static Function J(RJ a2) {
        return new Lk_1(a2);
    }
}

