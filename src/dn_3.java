/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jn
 *  XTa
 *  dn
 *  pua
 *  rM
 *  vRa
 */
import com.google.protobuf.Internal;

public final class dn_3
extends Enum<dn>
implements Internal.EnumLite {
    private static final Internal.EnumLiteMap<dn> internalValueMap;
    public static final /* enum */ dn SET_COLOR_ANIMATED;
    public static final /* enum */ dn SET_POINT;
    private static final /* synthetic */ dn[] $VALUES;
    public static final /* enum */ dn UNRECOGNIZED;
    public static final int SET_COLOR_ANIMATED_VALUE = 5;
    public static final int SET_POINT_VALUE = 1;
    public static final /* enum */ dn ADD_POINT;
    public static final int SET_POINT_ANIMATED_VALUE = 2;
    public static final /* enum */ dn SET_COLOR;
    public static final int SET_COLOR_VALUE = 4;
    private final int value;
    public static final int ADD_POINT_VALUE = 0;
    public static final int REMOVE_POINT_VALUE = 3;
    public static final /* enum */ dn REMOVE_POINT;
    public static final /* enum */ dn SET_POINT_ANIMATED;

    @Override
    public final int getNumber() {
        dn_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    @Deprecated
    public static dn valueOf(int a2) {
        return dn_3.forNumber(a2);
    }

    static {
        ADD_POINT = new dn_3(uSa.E);
        SET_POINT = new dn_3(vRa.d);
        SET_POINT_ANIMATED = new dn_3(uqa.g);
        REMOVE_POINT = new dn_3(yRa.d);
        SET_COLOR = new dn_3(AQa.P);
        SET_COLOR_ANIMATED = new dn_3(tTa.h);
        UNRECOGNIZED = new dn_3(pua.o);
        dn_3[] dn_3Array = new dn_3[XTa.W];
        dn_3Array[uSa.E] = ADD_POINT;
        dn_3Array[vRa.d] = SET_POINT;
        dn_3Array[uqa.g] = SET_POINT_ANIMATED;
        dn_3Array[yRa.d] = REMOVE_POINT;
        dn_3Array[AQa.P] = SET_COLOR;
        dn_3Array[tTa.h] = SET_COLOR_ANIMATED;
        dn_3Array[uua.p] = UNRECOGNIZED;
        $VALUES = dn_3Array;
        internalValueMap = new Jn();
    }

    public static dn valueOf(String a2) {
        return Enum.valueOf(dn_3.class, a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return rM.INSTANCE;
    }

    private dn_3(int n3) {
        int b2 = n3;
        dn_3 a2 = this;
        a2.value = b2;
    }

    public static dn[] values() {
        return (dn[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static dn forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ADD_POINT;
            }
            case 1: {
                return SET_POINT;
            }
            case 2: {
                return SET_POINT_ANIMATED;
            }
            case 3: {
                return REMOVE_POINT;
            }
            case 4: {
                return SET_COLOR;
            }
            case 5: {
                return SET_COLOR_ANIMATED;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<dn> internalGetValueMap() {
        return internalValueMap;
    }
}

