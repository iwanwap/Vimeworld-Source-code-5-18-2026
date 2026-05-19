/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uE
 */
import java.util.function.Consumer;

public final class Rf_2
implements Consumer {
    private final uE I;

    public static Consumer J(uE a2) {
        return new Rf_2(a2);
    }

    private Rf_2(uE uE2) {
        Rf_2 b2 = uE2;
        Rf_2 a2 = this;
        a2.I = b2;
    }

    public void accept(Object object) {
        Object b2 = object;
        Rf_2 a2 = this;
        uE.J((uE)a2.I, (Boolean)((Boolean)b2));
    }
}

