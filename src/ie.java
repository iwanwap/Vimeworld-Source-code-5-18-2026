/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CF
 */
import java.util.function.Supplier;

public final class ie
implements Supplier {
    private static final ie I = new ie();

    public Object get() {
        return CF.l();
    }

    public static Supplier J() {
        return I;
    }

    private ie() {
        ie a2;
    }
}

