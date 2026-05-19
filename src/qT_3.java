/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  qT
 */
import java.util.function.Function;

public final class qT_3
implements Function {
    private static final qT instance = new qT_3();

    private qT_3() {
        qT_3 a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        qT_3 a2 = this;
        return ZR.b((b[])((b[])b2));
    }
}

