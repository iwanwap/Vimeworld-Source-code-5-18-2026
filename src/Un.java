/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CM
 *  lN
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Un
extends Enum<Un>
implements Internal.EnumLite {
    public static final /* enum */ Un UNRECOGNIZED;
    private final int value;
    public static final int VELOCITY_VALUE = 1;
    public static final /* enum */ Un MOVE;
    private static final Internal.EnumLiteMap<Un> internalValueMap;
    public static final /* enum */ Un VELOCITY;
    private static final /* synthetic */ Un[] $VALUES;
    public static final int MOVE_VALUE = 0;

    public static Un valueOf(String a2) {
        return Enum.valueOf(Un.class, a2);
    }

    @Deprecated
    public static Un valueOf(int a2) {
        return Un.forNumber(a2);
    }

    public static Un[] values() {
        return (Un[])$VALUES.clone();
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CM.INSTANCE;
    }

    public static Internal.EnumLiteMap<Un> internalGetValueMap() {
        return internalValueMap;
    }

    private Un(int n3) {
        int b2 = n3;
        Un a2 = this;
        a2.value = b2;
    }

    static {
        MOVE = new Un(uSa.E);
        VELOCITY = new Un(vRa.d);
        UNRECOGNIZED = new Un(pua.o);
        Un[] unArray = new Un[yRa.d];
        unArray[uSa.E] = MOVE;
        unArray[vRa.d] = VELOCITY;
        unArray[uqa.g] = UNRECOGNIZED;
        $VALUES = unArray;
        internalValueMap = new lN();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Un forNumber(int a2) {
        switch (a2) {
            case 0: {
                return MOVE;
            }
            case 1: {
                return VELOCITY;
            }
        }
        return null;
    }

    @Override
    public final int getNumber() {
        Un a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }
}

