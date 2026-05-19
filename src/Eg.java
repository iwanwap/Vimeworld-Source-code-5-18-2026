/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class Eg
implements IntFunction {
    private static final Eg I = new Eg();

    private Eg() {
        Eg a2;
    }

    public static IntFunction J() {
        return I;
    }

    public Object apply(int n2) {
        int b2 = n2;
        Eg a2 = this;
        return hF.f(b2);
    }
}

