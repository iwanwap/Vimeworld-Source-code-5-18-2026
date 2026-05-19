/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  eu
 */
import java.util.function.Function;

public final class eu_1
implements Function {
    private static final eu instance = new eu_1();

    public Object apply(Object object) {
        Object b2 = object;
        eu_1 a2 = this;
        return ZR.A((b[])((b[])b2));
    }

    private eu_1() {
        eu_1 a2;
    }

    public static Function J() {
        return instance;
    }
}

