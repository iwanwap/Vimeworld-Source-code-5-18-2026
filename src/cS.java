/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 */
import java.util.function.Function;

public final class cS
implements Function {
    private static final cS instance = new cS();

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        cS a2 = this;
        return ZR.a((b[])((b[])b2));
    }

    private cS() {
        cS a2;
    }
}

