/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Vk_3
implements b {
    private final Supplier I;

    private Vk_3(Supplier supplier) {
        Supplier b2 = supplier;
        Vk_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        Vk_3 a2;
        return RJ.f(a2.I);
    }

    public static b J(Supplier a2) {
        return new Vk_3(a2);
    }
}

