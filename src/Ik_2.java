/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class Ik_2
implements Function {
    private final RJ I;

    private Ik_2(RJ rJ2) {
        Object b2 = rJ2;
        Ik_2 a2 = this;
        a2.I = b2;
    }

    public static Function J(RJ a2) {
        return new Ik_2(a2);
    }

    public Object apply(Object object) {
        Object b2 = object;
        Ik_2 a2 = this;
        return RJ.G(a2.I, (String)b2);
    }
}

