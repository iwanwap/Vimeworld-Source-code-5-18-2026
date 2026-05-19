/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  sL
 *  vRa
 */
import com.google.protobuf.Internal;

public final class IL
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new IL();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        IL a2 = this;
        if (sL.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private IL() {
        IL a2;
    }
}

