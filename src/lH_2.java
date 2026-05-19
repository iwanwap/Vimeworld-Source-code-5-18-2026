/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class lH_2
implements Supplier {
    private final RJ I;

    public Object get() {
        lH_2 a2;
        return RJ.C(a2.I);
    }

    private lH_2(RJ rJ2) {
        Object b2 = rJ2;
        lH_2 a2 = this;
        a2.I = b2;
    }

    public static Supplier J(RJ a2) {
        return new lH_2(a2);
    }
}

