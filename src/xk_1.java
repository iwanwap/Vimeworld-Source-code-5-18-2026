/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class xk_1
implements b {
    private final Supplier I;

    private xk_1(Supplier supplier) {
        Supplier b2 = supplier;
        xk_1 a2 = this;
        a2.I = b2;
    }

    public static b J(Supplier a2) {
        return new xk_1(a2);
    }

    @Override
    public float J() {
        xk_1 a2;
        return RJ.A(a2.I);
    }
}

