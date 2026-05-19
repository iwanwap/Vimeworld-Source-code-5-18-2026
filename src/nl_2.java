/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class nl_2
implements Function {
    private final RJ I;

    private nl_2(RJ rJ2) {
        Object b2 = rJ2;
        nl_2 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        nl_2 a2 = this;
        return RJ.D(a2.I, (String)b2);
    }

    public static Function J(RJ a2) {
        return new nl_2(a2);
    }
}

