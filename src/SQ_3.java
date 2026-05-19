/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qq
 *  vP
 */
import java.util.function.Consumer;

public final class SQ_3
implements Consumer {
    private final vP I;

    public void accept(Object object) {
        Object b2 = object;
        SQ_3 a2 = this;
        Qq.J((vP)a2.I, (Boolean)((Boolean)b2));
    }

    private SQ_3(vP vP2) {
        SQ_3 b2 = vP2;
        SQ_3 a2 = this;
        a2.I = b2;
    }

    public static Consumer J(vP a2) {
        return new SQ_3(a2);
    }
}

