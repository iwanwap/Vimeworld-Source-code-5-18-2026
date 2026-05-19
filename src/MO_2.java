/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MO
 *  SM
 *  pua
 *  sO
 *  vRa
 */
import com.google.protobuf.Internal;

public final class MO_2
extends Enum<MO>
implements Internal.EnumLite {
    private static final Internal.EnumLiteMap<MO> internalValueMap;
    private final int value;
    public static final /* enum */ MO SET_ROW;
    public static final int INSERT_ROW_VALUE = 1;
    public static final int REMOVE_ROW_VALUE = 2;
    public static final /* enum */ MO REMOVE_ROW;
    public static final /* enum */ MO INSERT_ROW;
    public static final /* enum */ MO CLEAR;
    public static final int ADD_ROW_VALUE = 0;
    public static final int CLEAR_VALUE = 4;
    public static final int SET_ROW_VALUE = 3;
    private static final /* synthetic */ MO[] $VALUES;
    public static final /* enum */ MO UNRECOGNIZED;
    public static final /* enum */ MO ADD_ROW;

    @Deprecated
    public static MO valueOf(int a2) {
        return MO_2.forNumber(a2);
    }

    public static MO[] values() {
        return (MO[])$VALUES.clone();
    }

    public static MO valueOf(String a2) {
        return Enum.valueOf(MO_2.class, a2);
    }

    public static Internal.EnumLiteMap<MO> internalGetValueMap() {
        return internalValueMap;
    }

    static {
        ADD_ROW = new MO_2(uSa.E);
        INSERT_ROW = new MO_2(vRa.d);
        REMOVE_ROW = new MO_2(uqa.g);
        SET_ROW = new MO_2(yRa.d);
        CLEAR = new MO_2(AQa.P);
        UNRECOGNIZED = new MO_2(pua.o);
        MO_2[] mO_2Array = new MO_2[uua.p];
        mO_2Array[uSa.E] = ADD_ROW;
        mO_2Array[vRa.d] = INSERT_ROW;
        mO_2Array[uqa.g] = REMOVE_ROW;
        mO_2Array[yRa.d] = SET_ROW;
        mO_2Array[AQa.P] = CLEAR;
        mO_2Array[tTa.h] = UNRECOGNIZED;
        $VALUES = mO_2Array;
        internalValueMap = new SM();
    }

    private MO_2(int n3) {
        int b2 = n3;
        MO_2 a2 = this;
        a2.value = b2;
    }

    @Override
    public final int getNumber() {
        MO_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static MO forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ADD_ROW;
            }
            case 1: {
                return INSERT_ROW;
            }
            case 2: {
                return REMOVE_ROW;
            }
            case 3: {
                return SET_ROW;
            }
            case 4: {
                return CLEAR;
            }
        }
        return null;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return sO.INSTANCE;
    }
}

