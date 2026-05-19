/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  ru
 */
import java.util.function.Supplier;

public final class ru_2
implements Supplier {
    private static final ru instance = new ru_2();

    private ru_2() {
        ru_2 a2;
    }

    public Object get() {
        return ZR.C();
    }

    public static Supplier J() {
        return instance;
    }
}

