/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dg
 *  wd
 */
import java.util.function.ToIntFunction;

public final class dg_2
implements ToIntFunction {
    private static final dg I = new dg_2();

    public static ToIntFunction J() {
        return I;
    }

    public int applyAsInt(Object object) {
        Object b2 = object;
        dg_2 a2 = this;
        return ((wd)b2).J();
    }

    private dg_2() {
        dg_2 a2;
    }
}

