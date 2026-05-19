/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  uS
 */
import java.util.function.Supplier;

public final class uS_1
implements Supplier {
    private static final uS instance = new uS_1();

    public Object get() {
        return ZR.d();
    }

    private uS_1() {
        uS_1 a2;
    }

    public static Supplier J() {
        return instance;
    }
}

