/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 */
import java.util.List;
import java.util.function.Consumer;

public final class Af_3
implements Consumer {
    private final List I;

    public void accept(Object object) {
        Object b2 = object;
        Af_3 a2 = this;
        boolean bl2 = a2.I.add((YQ)b2);
    }

    private Af_3(List list) {
        List b2 = list;
        Af_3 a2 = this;
        a2.I = b2;
    }

    public static Consumer J(List a2) {
        return new Af_3(a2);
    }
}

