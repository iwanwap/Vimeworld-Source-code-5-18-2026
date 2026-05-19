/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class sl_3
implements Function {
    private final RJ I;

    public Object apply(Object object) {
        Object b2 = object;
        sl_3 a2 = this;
        return RJ.A(a2.I, (String)b2);
    }

    public static Function J(RJ a2) {
        return new sl_3(a2);
    }

    private sl_3(RJ rJ2) {
        Object b2 = rJ2;
        sl_3 a2 = this;
        a2.I = b2;
    }
}

