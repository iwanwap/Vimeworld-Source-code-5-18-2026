/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dS
 */
import java.util.function.ToDoubleFunction;

public final class IS
implements ToDoubleFunction {
    private static final IS instance = new IS();

    public static ToDoubleFunction J() {
        return instance;
    }

    public double applyAsDouble(Object object) {
        Object b2 = object;
        IS a2 = this;
        return dS.J((vT)((vT)b2));
    }

    private IS() {
        IS a2;
    }
}

