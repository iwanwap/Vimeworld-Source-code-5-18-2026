/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oS
 */
import java.util.function.Supplier;

public final class oS_2
implements Supplier {
    private static final oS instance = new oS_2();

    private oS_2() {
        oS_2 a2;
    }

    public static Supplier J() {
        return instance;
    }

    public Object get() {
        return St.f();
    }
}

