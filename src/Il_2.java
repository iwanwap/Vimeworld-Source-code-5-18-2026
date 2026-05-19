/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Il_2
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new Il_2();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        Il_2 a2 = this;
        if (FK.forNumber(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Il_2() {
        Il_2 a2;
    }
}

