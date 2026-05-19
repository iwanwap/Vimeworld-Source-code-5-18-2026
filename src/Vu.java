/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 */
import java.util.function.Function;

public final class Vu
implements Function {
    private static final Vu instance = new Vu();

    public Object apply(Object object) {
        Object b2 = object;
        Vu a2 = this;
        return ZR.m((b[])((b[])b2));
    }

    public static Function J() {
        return instance;
    }

    private Vu() {
        Vu a2;
    }
}

