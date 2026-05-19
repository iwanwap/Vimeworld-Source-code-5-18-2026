/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RE
 *  wd
 */
import java.util.function.ToIntFunction;

public final class RE_3
implements ToIntFunction {
    private static final RE I = new RE_3();

    public static ToIntFunction J() {
        return I;
    }

    private RE_3() {
        RE_3 a2;
    }

    public int applyAsInt(Object object) {
        Object b2 = object;
        RE_3 a2 = this;
        return ((wd)b2).J();
    }
}

