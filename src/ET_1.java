/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ET
 *  ZR
 */
import java.util.function.Function;

public final class ET_1
implements Function {
    private static final ET instance = new ET_1();

    public static Function J() {
        return instance;
    }

    private ET_1() {
        ET_1 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        ET_1 a2 = this;
        return ZR.f((b[])((b[])b2));
    }
}

