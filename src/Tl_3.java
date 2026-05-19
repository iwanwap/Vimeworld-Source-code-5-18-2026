/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class Tl_3
implements Function {
    private final RJ I;

    public Object apply(Object object) {
        Object b2 = object;
        Tl_3 a2 = this;
        return RJ.C(a2.I, (String)b2);
    }

    public static Function J(RJ a2) {
        return new Tl_3(a2);
    }

    private Tl_3(RJ rJ2) {
        Object b2 = rJ2;
        Tl_3 a2 = this;
        a2.I = b2;
    }
}

