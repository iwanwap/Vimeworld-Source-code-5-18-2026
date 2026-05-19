/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Gm_3
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new Gm_3();

    private Gm_3() {
        Gm_3 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        Gm_3 a2 = this;
        if (MM.forNumber(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

