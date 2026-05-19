/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aC
 *  cA
 */
import java.util.function.Supplier;

public final class aC_2
implements Supplier {
    private static final aC I = new aC_2();

    public static Supplier J() {
        return I;
    }

    private aC_2() {
        aC_2 a2;
    }

    public Object get() {
        return new cA();
    }
}

