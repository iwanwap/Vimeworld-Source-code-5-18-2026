/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BU
 *  ZR
 */
import java.util.function.Function;

public final class BU_1
implements Function {
    private static final BU instance = new BU_1();

    private BU_1() {
        BU_1 a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        BU_1 a2 = this;
        return ZR.F((b[])((b[])b2));
    }
}

