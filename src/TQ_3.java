/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TQ
 *  pQ
 */
import java.util.function.Supplier;

public final class TQ_3
implements Supplier {
    private static final TQ I = new TQ_3();

    private TQ_3() {
        TQ_3 a2;
    }

    public Object get() {
        return pQ.J();
    }

    public static Supplier J() {
        return I;
    }
}

