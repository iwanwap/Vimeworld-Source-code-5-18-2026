/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.google.protobuf.Internal;

public final class uJ
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new uJ();

    private uJ() {
        uJ a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        uJ a2 = this;
        if (bJ.forNumber(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

