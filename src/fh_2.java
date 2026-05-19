/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class fh_2
implements Function {
    private final String I;

    public static Function J(String a2) {
        return new fh_2(a2);
    }

    public Object apply(Object object) {
        Object b2 = object;
        fh_2 a2 = this;
        return RJ.J(a2.I, (Bp)b2);
    }

    private fh_2(String string) {
        String b2 = string;
        fh_2 a2 = this;
        a2.I = b2;
    }
}

