/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 */
import java.util.function.Function;

public final class Ou
implements Function {
    private static final Ou instance = new Ou();

    public Object apply(Object object) {
        Object b2 = object;
        Ou a2 = this;
        return ZR.g((b[])((b[])b2));
    }

    private Ou() {
        Ou a2;
    }

    public static Function J() {
        return instance;
    }
}

