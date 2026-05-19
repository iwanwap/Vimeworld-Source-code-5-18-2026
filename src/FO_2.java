/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uN
 *  vRa
 */
import com.google.protobuf.Internal;

public final class FO_2
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new FO_2();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        FO_2 a2 = this;
        if (uN.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private FO_2() {
        FO_2 a2;
    }
}

