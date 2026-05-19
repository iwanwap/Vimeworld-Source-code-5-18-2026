/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.google.protobuf.Internal;

public final class mM_1
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new mM_1();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        mM_1 a2 = this;
        if (yM.forNumber(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private mM_1() {
        mM_1 a2;
    }
}

