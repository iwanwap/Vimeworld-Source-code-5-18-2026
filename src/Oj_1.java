/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Oj_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new Oj_1();

    private Oj_1() {
        Oj_1 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        Oj_1 a2 = this;
        if (ZL.forNumber(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

