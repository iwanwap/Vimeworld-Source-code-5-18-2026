/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class sJ_1
implements Function {
    private final RJ I;

    private sJ_1(RJ rJ) {
        Object b2 = rJ;
        sJ_1 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        sJ_1 a2 = this;
        return RJ.l(a2.I, (String)b2);
    }

    public static Function J(RJ a2) {
        return new sJ_1(a2);
    }
}

