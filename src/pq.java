/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pQ
 */
import java.util.function.Function;

public final class pq
implements Function {
    private static final pq I = new pq();

    private pq() {
        pq a2;
    }

    public static Function J() {
        return I;
    }

    public Object apply(Object object) {
        Object b2 = object;
        pq a2 = this;
        return pQ.o((b[])((b[])b2));
    }
}

