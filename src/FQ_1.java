/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FQ
 */
import java.util.function.ToIntFunction;

public final class FQ_1
implements ToIntFunction {
    private static final FQ I = new FQ_1();

    private FQ_1() {
        FQ_1 a2;
    }

    public int applyAsInt(Object object) {
        Object b2 = object;
        FQ_1 a2 = this;
        return Bp.J((Integer)b2);
    }

    public static ToIntFunction J() {
        return I;
    }
}

