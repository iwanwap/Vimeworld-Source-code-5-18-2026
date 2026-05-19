/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AB
 *  qc
 */
import java.util.function.Supplier;

public final class qc_1
implements Supplier {
    private static final qc I = new qc_1();

    public Object get() {
        return new AB();
    }

    private qc_1() {
        qc_1 a2;
    }

    public static Supplier J() {
        return I;
    }
}

