/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ln
 */
import java.io.InputStream;
import java.util.UUID;
import java.util.function.Consumer;

public final class VR
implements Consumer {
    private final OT J;
    private final ln A;
    private final UUID I;

    public void accept(Object object) {
        VR a2;
        Object b2 = object;
        VR vR = a2 = this;
        OT.J(vR.J, vR.A, a2.I, (InputStream)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(OT oT, ln ln2, UUID uUID) {
        void b2;
        UUID c2 = uUID;
        OT a2 = oT;
        return new VR(a2, (ln)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    private VR(OT oT, ln ln2, UUID uUID) {
        void b2;
        void c2;
        VR a2;
        UUID d2 = uUID;
        VR vR = a2 = this;
        a2.J = c2;
        vR.A = b2;
        vR.I = d2;
    }
}

