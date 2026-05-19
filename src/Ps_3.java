/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ps
 *  ZR
 */
import java.util.function.Function;

public final class Ps_3
implements Function {
    private static final Ps instance = new Ps_3();

    private Ps_3() {
        Ps_3 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Ps_3 a2 = this;
        return ZR.D((b[])((b[])b2));
    }

    public static Function J() {
        return instance;
    }
}

