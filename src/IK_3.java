/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class IK_3
implements b {
    private final Supplier I;

    public static b J(Supplier a2) {
        return new IK_3(a2);
    }

    private IK_3(Supplier supplier) {
        Supplier b2 = supplier;
        IK_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        IK_3 a2;
        return RJ.C(a2.I);
    }
}

