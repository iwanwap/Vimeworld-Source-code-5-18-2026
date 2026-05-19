/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  zu
 */
import java.util.function.Supplier;

public final class zu_2
implements Supplier {
    private static final zu instance = new zu_2();

    public Object get() {
        return ZR.J();
    }

    public static Supplier J() {
        return instance;
    }

    private zu_2() {
        zu_2 a2;
    }
}

