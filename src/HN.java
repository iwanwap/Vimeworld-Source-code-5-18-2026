/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jO
 *  vRa
 */
import com.google.protobuf.Internal;

public final class HN
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new HN();

    private HN() {
        HN a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        HN a2 = this;
        if (jO.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

