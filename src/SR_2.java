/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SR
 *  ZR
 */
import java.util.function.Supplier;

public final class SR_2
implements Supplier {
    private static final SR instance = new SR_2();

    public Object get() {
        return ZR.f();
    }

    private SR_2() {
        SR_2 a2;
    }

    public static Supplier J() {
        return instance;
    }
}

