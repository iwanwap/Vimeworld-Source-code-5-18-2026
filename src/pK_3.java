/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class pK_3
implements Supplier {
    private final RJ I;

    public static Supplier J(RJ a2) {
        return new pK_3(a2);
    }

    public Object get() {
        pK_3 a2;
        return RJ.l(a2.I);
    }

    private pK_3(RJ rJ2) {
        Object b2 = rJ2;
        pK_3 a2 = this;
        a2.I = b2;
    }
}

