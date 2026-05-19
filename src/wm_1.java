/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WN
 *  vRa
 */
import com.google.protobuf.Internal;

public final class wm_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new wm_1();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        wm_1 a2 = this;
        if (WN.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private wm_1() {
        wm_1 a2;
    }
}

