/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class TK_2
implements b {
    private final Supplier I;

    public static b J(Supplier a2) {
        return new TK_2(a2);
    }

    private TK_2(Supplier supplier) {
        Supplier b2 = supplier;
        TK_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        TK_2 a2;
        return RJ.e(a2.I);
    }
}

