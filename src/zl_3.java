/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ul
 *  vRa
 */
import com.google.protobuf.Internal;

public final class zl_3
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new zl_3();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        zl_3 a2 = this;
        if (Ul.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private zl_3() {
        zl_3 a2;
    }
}

