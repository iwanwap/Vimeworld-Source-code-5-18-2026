/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class Mj
implements Function {
    private final RJ I;

    public static Function J(RJ a2) {
        return new Mj(a2);
    }

    private Mj(RJ rJ2) {
        Object b2 = rJ2;
        Mj a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Mj a2 = this;
        return RJ.i(a2.I, (String)b2);
    }
}

