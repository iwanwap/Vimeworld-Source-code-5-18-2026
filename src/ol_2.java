/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class ol_2
implements Function {
    private final RJ I;

    private ol_2(RJ rJ) {
        Object b2 = rJ;
        ol_2 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        ol_2 a2 = this;
        return RJ.f(a2.I, (b[])b2);
    }

    public static Function J(RJ a2) {
        return new ol_2(a2);
    }
}

