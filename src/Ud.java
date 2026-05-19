/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Uf
 */
import java.util.function.Function;

public final class Ud
implements Function {
    private static final Ud I = new Ud();

    public static Function J() {
        return I;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Ud a2 = this;
        return new Uf((String)b2);
    }

    private Ud() {
        Ud a2;
    }
}

