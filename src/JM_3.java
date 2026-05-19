/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ro
 *  vRa
 */
import com.google.protobuf.Internal;

public final class JM_3
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new JM_3();

    private JM_3() {
        JM_3 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        JM_3 a2 = this;
        if (Ro.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

