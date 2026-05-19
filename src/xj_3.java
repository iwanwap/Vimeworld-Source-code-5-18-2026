/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class xj_3
implements b {
    private final Supplier I;

    @Override
    public float J() {
        xj_3 a2;
        return RJ.D(a2.I);
    }

    private xj_3(Supplier supplier) {
        Supplier b2 = supplier;
        xj_3 a2 = this;
        a2.I = b2;
    }

    public static b J(Supplier a2) {
        return new xj_3(a2);
    }
}

