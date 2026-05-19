/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 */
import java.util.function.Function;

public final class cU
implements Function {
    private static final cU instance = new cU();

    private cU() {
        cU a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        cU a2 = this;
        return ZR.e((b[])((b[])b2));
    }

    public static Function J() {
        return instance;
    }
}

