/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  yS
 */
import java.util.function.Function;

public final class yS_1
implements Function {
    private static final yS instance = new yS_1();

    private yS_1() {
        yS_1 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        yS_1 a2 = this;
        return ZR.h((b[])((b[])b2));
    }

    public static Function J() {
        return instance;
    }
}

