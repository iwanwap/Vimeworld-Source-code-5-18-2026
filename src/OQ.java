/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qq
 *  vP
 */
import java.util.function.Consumer;

public final class OQ
implements Consumer {
    private final vP I;

    public static Consumer J(vP a2) {
        return new OQ(a2);
    }

    public void accept(Object object) {
        Object b2 = object;
        OQ a2 = this;
        Qq.f((vP)a2.I, (Boolean)((Boolean)b2));
    }

    private OQ(vP vP2) {
        OQ b2 = vP2;
        OQ a2 = this;
        a2.I = b2;
    }
}

