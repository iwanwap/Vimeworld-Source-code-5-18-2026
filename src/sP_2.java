/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pQ
 *  sP
 */
import java.util.function.Supplier;

public final class sP_2
implements Supplier {
    private static final sP I = new sP_2();

    public static Supplier J() {
        return I;
    }

    private sP_2() {
        sP_2 a2;
    }

    public Object get() {
        return pQ.f();
    }
}

