/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class BK
implements Supplier {
    private static final BK I = new BK();

    public Object get() {
        return RJ.e();
    }

    public static Supplier J() {
        return I;
    }

    private BK() {
        BK a2;
    }
}

