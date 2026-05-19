/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tp
 */
import java.util.function.Predicate;

public final class ZP
implements Predicate {
    private final int J;
    private final int A;
    private final int I;

    public boolean test(Object object) {
        ZP a2;
        Object b2 = object;
        ZP zP = a2 = this;
        return tp.J((int)zP.A, (int)zP.J, (int)a2.I, (Bp)((Bp)b2));
    }

    /*
     * WARNING - void declaration
     */
    private ZP(int n2, int n3, int n4) {
        void b2;
        void c2;
        ZP a2;
        int d2 = n4;
        ZP zP = a2 = this;
        a2.A = c2;
        zP.J = b2;
        zP.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Predicate J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        return new ZP(a2, (int)b2, c2);
    }
}

