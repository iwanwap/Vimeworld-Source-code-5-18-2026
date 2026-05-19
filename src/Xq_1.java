/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  xh
 */
import java.util.concurrent.Callable;

public final class Xq_1
implements Callable {
    private final xh I;

    public Object call() {
        Xq_1 a2;
        return fr.J(a2.I);
    }

    public static Callable J(xh a2) {
        return new Xq_1(a2);
    }

    private Xq_1(xh xh2) {
        Xq_1 b2 = xh2;
        Xq_1 a2 = this;
        a2.I = b2;
    }
}

