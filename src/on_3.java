/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zo
 *  vRa
 */
import com.google.protobuf.Internal;

public final class on_3
implements Internal.EnumVerifier {
    public static final Internal.EnumVerifier INSTANCE = new on_3();

    private on_3() {
        on_3 a2;
    }

    @Override
    public boolean isInRange(int n2) {
        int b2 = n2;
        on_3 a2 = this;
        if (Zo.forNumber((int)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

