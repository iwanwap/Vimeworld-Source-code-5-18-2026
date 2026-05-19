/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bl
 *  vRa
 */
import com.google.protobuf.Internal;

public final class ck_2
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new ck_2();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        ck_2 a2 = this;
        if (Bl.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private ck_2() {
        ck_2 a2;
    }
}

