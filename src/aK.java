/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class aK
implements Function {
    private final RJ I;

    public static Function J(RJ a2) {
        return new aK(a2);
    }

    private aK(RJ rJ) {
        Object b2 = rJ;
        aK a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        aK a2 = this;
        return RJ.k(a2.I, (String)b2);
    }
}

