/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 *  aN
 *  cP
 */
import java.util.function.Consumer;

public final class yr
implements Consumer {
    private final cP A;
    private final aN I;

    public void accept(Object object) {
        yr a2;
        Object b2 = object;
        yr yr2 = a2 = this;
        cP.J((cP)yr2.A, (aN)yr2.I, (YQ)((YQ)b2));
    }

    public static Consumer J(cP cP2, aN aN2) {
        cP b2 = aN2;
        cP a2 = cP2;
        return new yr(a2, (aN)b2);
    }

    /*
     * WARNING - void declaration
     */
    private yr(cP cP2, aN aN2) {
        void b2;
        yr a2;
        yr c2 = aN2;
        yr yr2 = a2 = this;
        yr2.A = b2;
        yr2.I = c2;
    }
}

