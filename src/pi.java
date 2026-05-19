/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KH
 */
import java.util.function.ToDoubleFunction;

public final class pi
implements ToDoubleFunction {
    private static final pi I = new pi();

    public double applyAsDouble(Object object) {
        Object b2 = object;
        pi a2 = this;
        return KH.l((KH)((KH)b2));
    }

    private pi() {
        pi a2;
    }

    public static ToDoubleFunction J() {
        return I;
    }
}

