/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dt
 *  kba
 */
import java.util.function.ToIntFunction;

public final class Dt_1
implements ToIntFunction {
    private static final Dt I = new Dt_1();

    private Dt_1() {
        Dt_1 a2;
    }

    public int applyAsInt(Object object) {
        Object b2 = object;
        Dt_1 a2 = this;
        return ((kba)b2).l();
    }

    public static ToIntFunction J() {
        return I;
    }
}

