/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  mu
 */
import java.util.function.Supplier;

public final class mu_2
implements Supplier {
    private static final mu instance = new mu_2();

    public Object get() {
        return ZR.i();
    }

    private mu_2() {
        mu_2 a2;
    }

    public static Supplier J() {
        return instance;
    }
}

