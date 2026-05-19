/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EH
 *  YQ
 */
import java.util.function.Consumer;

public final class nH_3
implements Consumer {
    private final EH I;

    public void accept(Object object) {
        Object b2 = object;
        nH_3 a2 = this;
        Ni.J(a2.I, (YQ)b2);
    }

    private nH_3(EH eH2) {
        nH_3 b2 = eH2;
        nH_3 a2 = this;
        a2.I = b2;
    }

    public static Consumer J(EH a2) {
        return new nH_3(a2);
    }
}

