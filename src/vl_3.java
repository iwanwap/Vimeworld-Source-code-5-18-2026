/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class vl_3
implements b {
    private final Supplier I;

    @Override
    public float J() {
        vl_3 a2;
        return RJ.J(a2.I);
    }

    public static b J(Supplier a2) {
        return new vl_3(a2);
    }

    private vl_3(Supplier supplier) {
        Supplier b2 = supplier;
        vl_3 a2 = this;
        a2.I = b2;
    }
}

