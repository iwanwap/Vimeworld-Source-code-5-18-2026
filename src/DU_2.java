/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DU
 *  ZR
 */
import java.util.function.Function;

public final class DU_2
implements Function {
    private static final DU instance = new DU_2();

    public Object apply(Object object) {
        Object b2 = object;
        DU_2 a2 = this;
        return ZR.i((b[])((b[])b2));
    }

    private DU_2() {
        DU_2 a2;
    }

    public static Function J() {
        return instance;
    }
}

