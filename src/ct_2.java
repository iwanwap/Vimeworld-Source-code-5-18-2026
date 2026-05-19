/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  ct
 */
import java.util.function.Supplier;

public final class ct_2
implements Supplier {
    private static final ct instance = new ct_2();

    private ct_2() {
        ct_2 a2;
    }

    public Object get() {
        return ZR.e();
    }

    public static Supplier J() {
        return instance;
    }
}

