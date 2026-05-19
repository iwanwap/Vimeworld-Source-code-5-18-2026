/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fn
 *  vRa
 */
import com.google.protobuf.Internal;

public final class vo
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new vo();

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        vo a2 = this;
        if (Fn.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private vo() {
        vo a2;
    }
}

