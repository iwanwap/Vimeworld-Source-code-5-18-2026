/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  an
 *  vRa
 */
import com.google.protobuf.Internal;

public final class bo_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new bo_1();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        bo_1 a2 = this;
        if (an.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private bo_1() {
        bo_1 a2;
    }
}

