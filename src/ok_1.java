/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class ok_1
implements Supplier {
    private final RJ I;

    private ok_1(RJ rJ) {
        Object b2 = rJ;
        ok_1 a2 = this;
        a2.I = b2;
    }

    public Object get() {
        ok_1 a2;
        return RJ.G(a2.I);
    }

    public static Supplier J(RJ a2) {
        return new ok_1(a2);
    }
}

