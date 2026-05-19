/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  wG
 */
import java.util.function.Function;

public final class uH
implements Function {
    private final wG I;

    public Object apply(Object object) {
        Object b2 = object;
        uH a2 = this;
        return wG.J((wG)a2.I, (String)((String)b2));
    }

    public static Function J(wG a2) {
        return new uH(a2);
    }

    private uH(wG wG2) {
        uH b2 = wG2;
        uH a2 = this;
        a2.I = b2;
    }
}

