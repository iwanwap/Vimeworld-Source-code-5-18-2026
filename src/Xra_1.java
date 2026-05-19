/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dpa
 */
import java.util.function.Predicate;

public final class Xra_1
implements Predicate {
    private final byte[] I;

    public boolean test(Object object) {
        Object b2 = object;
        Xra_1 a2 = this;
        return Dpa.J((byte[])a2.I, (byte[])((byte[])b2));
    }

    public static Predicate J(byte[] a2) {
        return new Xra_1(a2);
    }

    private Xra_1(byte[] byArray) {
        Object b2 = byArray;
        Xra_1 a2 = this;
        a2.I = (byte[])b2;
    }
}

