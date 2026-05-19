/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  cJ
 */
import java.io.InputStream;
import java.util.function.Consumer;

public final class El
implements Consumer {
    private final cJ A;
    private final Kl I;

    public void accept(Object object) {
        El a2;
        Object b2 = object;
        El el2 = a2 = this;
        cJ.J((cJ)el2.A, (Kl)el2.I, (InputStream)((InputStream)b2));
    }

    /*
     * WARNING - void declaration
     */
    private El(cJ cJ2, Kl kl2) {
        void b2;
        El a2;
        El c2 = kl2;
        El el2 = a2 = this;
        el2.A = b2;
        el2.I = c2;
    }

    public static Consumer J(cJ cJ2, Kl kl2) {
        cJ b2 = kl2;
        cJ a2 = cJ2;
        return new El(a2, (Kl)b2);
    }
}

