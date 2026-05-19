/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ym
 *  vRa
 */
import com.google.protobuf.Internal;

public final class zM_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new zM_1();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        zM_1 a2 = this;
        if (Ym.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private zM_1() {
        zM_1 a2;
    }
}

