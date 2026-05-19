/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eS
 */
import java.util.function.Consumer;

public final class sx_1
implements Consumer {
    private final eS I;

    public static Consumer J(eS a2) {
        return new sx_1(a2);
    }

    public void accept(Object object) {
        Object b2 = object;
        sx_1 a2 = this;
        jU.J(a2.I, (jU)b2);
    }

    private sx_1(eS eS2) {
        sx_1 b2 = eS2;
        sx_1 a2 = this;
        a2.I = b2;
    }
}

