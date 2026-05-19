/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jH
 */
import java.util.function.Consumer;

public final class Gi_3
implements Consumer {
    private final long I;

    public static Consumer J(long a2) {
        return new Gi_3(a2);
    }

    private Gi_3(long a2) {
        Gi_3 b2;
        b2.I = a2;
    }

    public void accept(Object object) {
        Object b2 = object;
        Gi_3 a2 = this;
        jH.J((long)a2.I, (Bp)((Bp)b2));
    }
}

