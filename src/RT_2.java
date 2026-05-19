/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RT
 *  ZR
 */
import java.util.function.Function;

public final class RT_2
implements Function {
    private static final RT instance = new RT_2();

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        RT_2 a2 = this;
        return ZR.L((b[])((b[])b2));
    }

    private RT_2() {
        RT_2 a2;
    }
}

