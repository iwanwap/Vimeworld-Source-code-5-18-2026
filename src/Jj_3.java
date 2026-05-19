/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class Jj_3
implements Supplier {
    private final RJ A;
    private final String I;

    public static Supplier J(RJ rJ2, String string) {
        Object b2 = string;
        RJ a2 = rJ2;
        return new Jj_3(a2, (String)b2);
    }

    /*
     * WARNING - void declaration
     */
    private Jj_3(RJ rJ2, String string) {
        void b2;
        Jj_3 a2;
        String c2 = string;
        Jj_3 jj_3 = a2 = this;
        jj_3.A = b2;
        jj_3.I = c2;
    }

    public Object get() {
        Jj_3 a2;
        Jj_3 jj_3 = a2;
        return RJ.J(jj_3.A, jj_3.I);
    }
}

