/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  eS
 */
import java.util.function.Function;

public final class SS
implements Function {
    private final eS arg$1;

    public static Function J(eS a2) {
        return new SS(a2);
    }

    public Object apply(Object object) {
        Object b2 = object;
        SS a2 = this;
        return BS.J((eS)a2.arg$1, (eS)((eS)b2));
    }

    private SS(eS eS2) {
        SS b2 = eS2;
        SS a2 = this;
        a2.arg$1 = b2;
    }
}

