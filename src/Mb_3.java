/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mb
 *  sC
 */
import java.util.function.Supplier;

public final class Mb_3
implements Supplier {
    private static final Mb I = new Mb_3();

    public static Supplier J() {
        return I;
    }

    private Mb_3() {
        Mb_3 a2;
    }

    public Object get() {
        return new sC();
    }
}

