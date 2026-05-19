/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class yJ
implements b {
    private final Supplier I;

    @Override
    public float J() {
        yJ a2;
        return RJ.G(a2.I);
    }

    private yJ(Supplier supplier) {
        Supplier b2 = supplier;
        yJ a2 = this;
        a2.I = b2;
    }

    public static b J(Supplier a2) {
        return new yJ(a2);
    }
}

