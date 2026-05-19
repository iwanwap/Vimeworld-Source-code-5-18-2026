/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lo
 *  vRa
 */
import com.google.protobuf.Internal;

public final class KO_2
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new KO_2();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        KO_2 a2 = this;
        if (lo.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private KO_2() {
        KO_2 a2;
    }
}

