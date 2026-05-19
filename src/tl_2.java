/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class tl_2
implements Supplier {
    private final RJ I;

    private tl_2(RJ rJ2) {
        Object b2 = rJ2;
        tl_2 a2 = this;
        a2.I = b2;
    }

    public Object get() {
        tl_2 a2;
        return RJ.J(a2.I);
    }

    public static Supplier J(RJ a2) {
        return new tl_2(a2);
    }
}

