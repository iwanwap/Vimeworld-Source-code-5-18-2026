/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jk
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Wk
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new Wk();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        Wk a2 = this;
        if (jk.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Wk() {
        Wk a2;
    }
}

