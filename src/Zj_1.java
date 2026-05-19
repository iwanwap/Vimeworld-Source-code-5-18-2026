/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Zj_1
implements b {
    private final Supplier I;

    @Override
    public float J() {
        Zj_1 a2;
        return RJ.l(a2.I);
    }

    private Zj_1(Supplier supplier) {
        Supplier b2 = supplier;
        Zj_1 a2 = this;
        a2.I = b2;
    }

    public static b J(Supplier a2) {
        return new Zj_1(a2);
    }
}

