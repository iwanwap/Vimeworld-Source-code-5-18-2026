/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class aJ_2
implements b {
    private final Supplier I;

    @Override
    public float J() {
        aJ_2 a2;
        return RJ.M(a2.I);
    }

    private aJ_2(Supplier supplier) {
        Supplier b2 = supplier;
        aJ_2 a2 = this;
        a2.I = b2;
    }

    public static b J(Supplier a2) {
        return new aJ_2(a2);
    }
}

