/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ok
 */
import java.util.function.Supplier;

public final class Ok_2
implements Supplier {
    private static final Ok I = new Ok_2();

    public Object get() {
        return RJ.i();
    }

    public static Supplier J() {
        return I;
    }

    private Ok_2() {
        Ok_2 a2;
    }
}

