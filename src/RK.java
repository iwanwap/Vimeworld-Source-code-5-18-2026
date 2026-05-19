/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class RK
implements Supplier {
    private static final RK I = new RK();

    public static Supplier J() {
        return I;
    }

    private RK() {
        RK a2;
    }

    public Object get() {
        return RJ.a();
    }
}

