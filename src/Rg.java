/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  r
 */
import java.util.function.Function;

public final class Rg
implements Function {
    private final r[] I;

    public Object apply(Object object) {
        Object b2 = object;
        Rg a2 = this;
        return RJ.J(a2.I, (Bp)b2);
    }

    private Rg(r[] rArray) {
        r[] b2 = rArray;
        r[] a2 = this;
        a2.I = b2;
    }

    public static Function J(r[] a2) {
        return new Rg(a2);
    }
}

