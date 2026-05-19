/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  sn
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Ao_3
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new Ao_3();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        Ao_3 a2 = this;
        if (sn.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Ao_3() {
        Ao_3 a2;
    }
}

