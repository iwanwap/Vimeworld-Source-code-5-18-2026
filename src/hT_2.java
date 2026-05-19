/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  hT
 */
import java.util.function.Function;

public final class hT_2
implements Function {
    private static final hT instance = new hT_2();

    private hT_2() {
        hT_2 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        hT_2 a2 = this;
        return ZR.K((b[])((b[])b2));
    }

    public static Function J() {
        return instance;
    }
}

