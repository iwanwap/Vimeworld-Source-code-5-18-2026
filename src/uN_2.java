/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FO
 *  Sn
 *  pua
 *  uN
 *  vRa
 */
import com.google.protobuf.Internal;

public final class uN_2
extends Enum<uN>
implements Internal.EnumLite {
    private static final /* synthetic */ uN[] $VALUES;
    public static final /* enum */ uN REPEAT;
    public static final /* enum */ uN UNRECOGNIZED;
    public static final /* enum */ uN CLAMP;
    private static final Internal.EnumLiteMap<uN> internalValueMap;
    public static final int CLAMP_VALUE = 0;
    private final int value;
    public static final int REPEAT_VALUE = 1;
    public static final /* enum */ uN REPEAT_MIPMAP;
    public static final int REPEAT_MIPMAP_VALUE = 2;

    static {
        CLAMP = new uN_2(uSa.E);
        REPEAT = new uN_2(vRa.d);
        REPEAT_MIPMAP = new uN_2(uqa.g);
        UNRECOGNIZED = new uN_2(pua.o);
        uN_2[] uN_2Array = new uN_2[AQa.P];
        uN_2Array[uSa.E] = CLAMP;
        uN_2Array[vRa.d] = REPEAT;
        uN_2Array[uqa.g] = REPEAT_MIPMAP;
        uN_2Array[yRa.d] = UNRECOGNIZED;
        $VALUES = uN_2Array;
        internalValueMap = new Sn();
    }

    public static uN[] values() {
        return (uN[])$VALUES.clone();
    }

    private uN_2(int n3) {
        int b2 = n3;
        uN_2 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static uN forNumber(int a2) {
        switch (a2) {
            case 0: {
                return CLAMP;
            }
            case 1: {
                return REPEAT;
            }
            case 2: {
                return REPEAT_MIPMAP;
            }
        }
        return null;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return FO.INSTANCE;
    }

    @Deprecated
    public static uN valueOf(int a2) {
        return uN_2.forNumber(a2);
    }

    public static Internal.EnumLiteMap<uN> internalGetValueMap() {
        return internalValueMap;
    }

    public static uN valueOf(String a2) {
        return Enum.valueOf(uN_2.class, a2);
    }

    @Override
    public final int getNumber() {
        uN_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }
}

