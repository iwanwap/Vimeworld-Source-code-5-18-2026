/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class jL_2
implements Function {
    private final RJ I;

    public static Function J(RJ a2) {
        return new jL_2(a2);
    }

    private jL_2(RJ rJ2) {
        Object b2 = rJ2;
        jL_2 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        jL_2 a2 = this;
        return RJ.J(a2.I, (String)b2);
    }
}

