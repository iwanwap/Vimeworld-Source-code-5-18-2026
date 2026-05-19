/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nO
 *  vRa
 */
import com.google.protobuf.Internal;

public final class iN_2
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new iN_2();

    private iN_2() {
        iN_2 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        iN_2 a2 = this;
        if (nO.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

