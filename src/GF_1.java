/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GF
 *  uE
 */
import java.util.function.Supplier;

public final class GF_1
implements Supplier {
    private static final GF I = new GF_1();

    private GF_1() {
        GF_1 a2;
    }

    public static Supplier J() {
        return I;
    }

    public Object get() {
        return uE.f();
    }
}

