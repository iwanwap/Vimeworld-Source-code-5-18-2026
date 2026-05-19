/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CF
 */
import java.util.function.Supplier;

public final class bg
implements Supplier {
    private static final bg I = new bg();

    private bg() {
        bg a2;
    }

    public Object get() {
        return CF.J();
    }

    public static Supplier J() {
        return I;
    }
}

