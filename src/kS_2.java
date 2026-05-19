/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZM
 */
import java.io.InputStream;
import java.util.function.Consumer;

public final class kS_2
implements Consumer {
    private final ZM A;
    private final OT I;

    /*
     * WARNING - void declaration
     */
    private kS_2(OT oT2, ZM zM2) {
        void b2;
        kS_2 a2;
        kS_2 c2 = zM2;
        kS_2 kS_22 = a2 = this;
        kS_22.I = b2;
        kS_22.A = c2;
    }

    public static Consumer J(OT oT2, ZM zM2) {
        OT b2 = zM2;
        OT a2 = oT2;
        return new kS_2(a2, (ZM)b2);
    }

    public void accept(Object object) {
        kS_2 a2;
        Object b2 = object;
        kS_2 kS_22 = a2 = this;
        OT.J(kS_22.I, kS_22.A, (InputStream)b2);
    }
}

