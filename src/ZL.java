/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oj
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class ZL
extends Enum<ZL>
implements Internal.EnumLite {
    private static final /* synthetic */ ZL[] $VALUES;
    public static final int DOTS_VALUE = 2;
    public static final int TRIM_VALUE = 1;
    public static final /* enum */ ZL UNRECOGNIZED;
    public static final /* enum */ ZL DOTS;
    private final int value;
    public static final /* enum */ ZL TRIM;
    public static final /* enum */ ZL VISIBLE;
    private static final Internal.EnumLiteMap<ZL> internalValueMap;
    public static final int VISIBLE_VALUE = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static ZL forNumber(int a2) {
        switch (a2) {
            case 0: {
                return VISIBLE;
            }
            case 1: {
                return TRIM;
            }
            case 2: {
                return DOTS;
            }
        }
        return null;
    }

    @Deprecated
    public static ZL valueOf(int a2) {
        return ZL.forNumber(a2);
    }

    static {
        VISIBLE = new ZL(uSa.E);
        TRIM = new ZL(vRa.d);
        DOTS = new ZL(uqa.g);
        UNRECOGNIZED = new ZL(pua.o);
        ZL[] zLArray = new ZL[AQa.P];
        zLArray[uSa.E] = VISIBLE;
        zLArray[vRa.d] = TRIM;
        zLArray[uqa.g] = DOTS;
        zLArray[yRa.d] = UNRECOGNIZED;
        $VALUES = zLArray;
        internalValueMap = new Dk();
    }

    @Override
    public final int getNumber() {
        ZL a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Oj.INSTANCE;
    }

    public static ZL valueOf(String a2) {
        return Enum.valueOf(ZL.class, a2);
    }

    public static Internal.EnumLiteMap<ZL> internalGetValueMap() {
        return internalValueMap;
    }

    private ZL(int n3) {
        int b2 = n3;
        ZL a2 = this;
        a2.value = b2;
    }

    public static ZL[] values() {
        return (ZL[])$VALUES.clone();
    }
}

