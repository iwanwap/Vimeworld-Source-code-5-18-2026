/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZR
 *  au
 */
import java.util.function.Supplier;

public final class au_1
implements Supplier {
    private static final au instance = new au_1();

    private au_1() {
        au_1 a2;
    }

    public Object get() {
        return ZR.A();
    }

    public static Supplier J() {
        return instance;
    }
}

