/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CF
 */
import java.util.function.Consumer;

public final class dE_2
implements Consumer {
    private final pE[] I;

    public static Consumer J(pE[] a2) {
        return new dE_2(a2);
    }

    public void accept(Object object) {
        Object b2 = object;
        dE_2 a2 = this;
        CF.J((pE[])a2.I, (Boolean)((Boolean)b2));
    }

    private dE_2(pE[] pEArray) {
        pE[] b2 = pEArray;
        pE[] a2 = this;
        a2.I = b2;
    }
}

