/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Nk
implements b {
    private final Supplier I;

    @Override
    public float J() {
        Nk a2;
        return RJ.i(a2.I);
    }

    public static b J(Supplier a2) {
        return new Nk(a2);
    }

    private Nk(Supplier supplier) {
        Supplier b2 = supplier;
        Nk a2 = this;
        a2.I = b2;
    }
}

