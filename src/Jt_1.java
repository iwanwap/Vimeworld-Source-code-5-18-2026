/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jt
 *  ZR
 */
import java.util.function.Function;

public final class Jt_1
implements Function {
    private static final Jt instance = new Jt_1();

    public Object apply(Object object) {
        Object b2 = object;
        Jt_1 a2 = this;
        return ZR.l((b[])((b[])b2));
    }

    private Jt_1() {
        Jt_1 a2;
    }

    public static Function J() {
        return instance;
    }
}

