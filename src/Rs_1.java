/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rs
 *  ZR
 */
import java.util.function.Function;

public final class Rs_1
implements Function {
    private static final Rs instance = new Rs_1();

    private Rs_1() {
        Rs_1 a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Rs_1 a2 = this;
        return ZR.B((b[])((b[])b2));
    }
}

