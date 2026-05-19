/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  ms
 */
import java.util.function.Supplier;

public final class ms_2
implements Supplier {
    private static final ms instance = new ms_2();

    public Object get() {
        return ZR.l();
    }

    public static Supplier J() {
        return instance;
    }

    private ms_2() {
        ms_2 a2;
    }
}

