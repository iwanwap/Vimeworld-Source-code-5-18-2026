/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class zj_3
implements Supplier {
    private final RJ I;

    public static Supplier J(RJ a2) {
        return new zj_3(a2);
    }

    private zj_3(RJ rJ2) {
        Object b2 = rJ2;
        zj_3 a2 = this;
        a2.I = b2;
    }

    public Object get() {
        zj_3 a2;
        return RJ.M(a2.I);
    }
}

