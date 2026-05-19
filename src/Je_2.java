/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CF
 */
import java.util.function.Consumer;

public final class Je_2
implements Consumer {
    private final pE I;

    public void accept(Object object) {
        Object b2 = object;
        Je_2 a2 = this;
        CF.J((pE)a2.I, (Boolean)((Boolean)b2));
    }

    private Je_2(pE pE2) {
        Object b2 = pE2;
        Je_2 a2 = this;
        a2.I = b2;
    }

    public static Consumer J(pE a2) {
        return new Je_2(a2);
    }
}

