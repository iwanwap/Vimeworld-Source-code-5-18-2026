/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BJ
 */
import java.util.function.Supplier;

public final class BJ_1
implements Supplier {
    private static final BJ I = new BJ_1();

    private BJ_1() {
        BJ_1 a2;
    }

    public static Supplier J() {
        return I;
    }

    public Object get() {
        return RJ.J();
    }
}

