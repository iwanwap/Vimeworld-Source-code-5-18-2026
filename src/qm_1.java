/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Do
 *  vRa
 */
import com.google.protobuf.Internal;

public final class qm_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new qm_1();

    private qm_1() {
        qm_1 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        qm_1 a2 = this;
        if (Do.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

