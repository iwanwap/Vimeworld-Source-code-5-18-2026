/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class rl_1
implements Function {
    private final RJ I;

    public static Function J(RJ a2) {
        return new rl_1(a2);
    }

    private rl_1(RJ rJ2) {
        Object b2 = rJ2;
        rl_1 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        rl_1 a2 = this;
        return RJ.f(a2.I, (String)b2);
    }
}

