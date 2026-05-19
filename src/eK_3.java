/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class eK_3
implements Function {
    private final RJ I;

    public Object apply(Object object) {
        Object b2 = object;
        eK_3 a2 = this;
        return RJ.J(a2.I, (b[])b2);
    }

    public static Function J(RJ a2) {
        return new eK_3(a2);
    }

    private eK_3(RJ rJ2) {
        Object b2 = rJ2;
        eK_3 a2 = this;
        a2.I = b2;
    }
}

