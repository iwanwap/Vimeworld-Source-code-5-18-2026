/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class FL
implements Function {
    private final RJ I;

    public static Function J(RJ a2) {
        return new FL(a2);
    }

    public Object apply(Object object) {
        Object b2 = object;
        FL a2 = this;
        return RJ.M(a2.I, (String)b2);
    }

    private FL(RJ rJ) {
        Object b2 = rJ;
        FL a2 = this;
        a2.I = b2;
    }
}

