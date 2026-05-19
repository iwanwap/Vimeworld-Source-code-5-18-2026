/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CF
 *  Dg
 */
import java.util.function.Supplier;

public final class Dg_3
implements Supplier {
    private static final Dg I = new Dg_3();

    private Dg_3() {
        Dg_3 a2;
    }

    public static Supplier J() {
        return I;
    }

    public Object get() {
        return CF.f();
    }
}

