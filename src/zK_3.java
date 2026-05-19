/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class zK_3
implements Supplier {
    private final RJ I;

    public Object get() {
        zK_3 a2;
        return RJ.A(a2.I);
    }

    private zK_3(RJ rJ2) {
        Object b2 = rJ2;
        zK_3 a2 = this;
        a2.I = b2;
    }

    public static Supplier J(RJ a2) {
        return new zK_3(a2);
    }
}

