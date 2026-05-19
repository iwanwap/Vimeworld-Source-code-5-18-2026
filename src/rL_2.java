/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class rL_2
implements b {
    private final Supplier I;

    @Override
    public float J() {
        rL_2 a2;
        return RJ.d(a2.I);
    }

    private rL_2(Supplier supplier) {
        Supplier b2 = supplier;
        rL_2 a2 = this;
        a2.I = b2;
    }

    public static b J(Supplier a2) {
        return new rL_2(a2);
    }
}

