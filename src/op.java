/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pQ
 */
import java.util.function.Supplier;

public final class op
implements Supplier {
    private static final op I = new op();

    public static Supplier J() {
        return I;
    }

    public Object get() {
        return pQ.e();
    }

    private op() {
        op a2;
    }
}

