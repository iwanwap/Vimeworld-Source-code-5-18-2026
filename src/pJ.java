/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class pJ
implements Supplier {
    private static final pJ I = new pJ();

    public Object get() {
        return RJ.H();
    }

    public static Supplier J() {
        return I;
    }

    private pJ() {
        pJ a2;
    }
}

