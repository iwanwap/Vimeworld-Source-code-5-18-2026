/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NS
 */
import java.util.function.Function;

public final class NS_1
implements Function {
    private static final NS instance = new NS_1();

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        NS_1 a2 = this;
        return St.C((b[])b2);
    }

    private NS_1() {
        NS_1 a2;
    }
}

