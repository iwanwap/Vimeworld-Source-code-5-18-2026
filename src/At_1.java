/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  At
 */
import java.util.function.Function;

public final class At_1
implements Function {
    private static final At instance = new At_1();

    private At_1() {
        At_1 a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        At_1 a2 = this;
        return St.e((b[])b2);
    }
}

