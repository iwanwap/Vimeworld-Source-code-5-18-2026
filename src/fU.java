/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 */
import java.util.function.Function;

public final class fU
implements Function {
    private static final fU instance = new fU();

    private fU() {
        fU a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        fU a2 = this;
        return ZR.C((b[])((b[])b2));
    }
}

