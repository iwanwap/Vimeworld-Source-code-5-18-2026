/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zu
 *  dt
 */
import java.util.function.ToDoubleFunction;

public final class Zu_3
implements ToDoubleFunction {
    private static final Zu instance = new Zu_3();

    public static ToDoubleFunction J() {
        return instance;
    }

    private Zu_3() {
        Zu_3 a2;
    }

    public double applyAsDouble(Object object) {
        Object b2 = object;
        Zu_3 a2 = this;
        return us.J((dt)b2);
    }
}

