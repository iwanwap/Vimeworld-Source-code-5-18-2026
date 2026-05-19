/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eI
 *  iG
 */
import java.util.function.ToLongFunction;

public final class iG_2
implements ToLongFunction {
    private static final iG I = new iG_2();

    private iG_2() {
        iG_2 a2;
    }

    public long applyAsLong(Object object) {
        Object b2 = object;
        iG_2 a2 = this;
        return eI.J((qI)((qI)b2));
    }

    public static ToLongFunction J() {
        return I;
    }
}

