/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IP
 *  pQ
 */
import java.util.function.Supplier;

public final class IP_1
implements Supplier {
    private static final IP I = new IP_1();

    public static Supplier J() {
        return I;
    }

    private IP_1() {
        IP_1 a2;
    }

    public Object get() {
        return pQ.d();
    }
}

