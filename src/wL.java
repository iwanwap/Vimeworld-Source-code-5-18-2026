/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class wL
implements Supplier {
    private final RJ I;

    private wL(RJ rJ) {
        Object b2 = rJ;
        wL a2 = this;
        a2.I = b2;
    }

    public static Supplier J(RJ a2) {
        return new wL(a2);
    }

    public Object get() {
        wL a2;
        return RJ.i(a2.I);
    }
}

