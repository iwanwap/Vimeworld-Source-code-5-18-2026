/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uE
 */
import java.util.function.Supplier;

public final class jf
implements Supplier {
    private static final jf I = new jf();

    public static Supplier J() {
        return I;
    }

    public Object get() {
        return uE.J();
    }

    private jf() {
        jf a2;
    }
}

