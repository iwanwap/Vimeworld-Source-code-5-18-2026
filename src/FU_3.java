/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FU
 *  ZR
 */
import java.util.function.Function;

public final class FU_3
implements Function {
    private static final FU instance = new FU_3();

    public Object apply(Object object) {
        Object b2 = object;
        FU_3 a2 = this;
        return ZR.c((b[])((b[])b2));
    }

    private FU_3() {
        FU_3 a2;
    }

    public static Function J() {
        return instance;
    }
}

