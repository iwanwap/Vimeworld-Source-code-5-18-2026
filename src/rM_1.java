/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dn
 *  vRa
 */
import com.google.protobuf.Internal;

public final class rM_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new rM_1();

    private rM_1() {
        rM_1 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        rM_1 a2 = this;
        if (dn.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

