/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nj
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Gj_3
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new Gj_3();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        Gj_3 a2 = this;
        if (Nj.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Gj_3() {
        Gj_3 a2;
    }
}

