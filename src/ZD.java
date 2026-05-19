/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class ZD
implements Supplier {
    private final RF I;

    public static Supplier J(RF a2) {
        return new ZD(a2);
    }

    public Object get() {
        ZD a2;
        return RF.J(a2.I);
    }

    private ZD(RF rF) {
        Object b2 = rF;
        ZD a2 = this;
        a2.I = b2;
    }
}

