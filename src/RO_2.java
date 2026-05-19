/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Wo
 *  vRa
 */
import com.google.protobuf.Internal;

public final class RO_2
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new RO_2();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        RO_2 a2 = this;
        if (Wo.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private RO_2() {
        RO_2 a2;
    }
}

