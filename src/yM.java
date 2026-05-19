/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tn
 *  mM
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class yM
extends Enum<yM>
implements Internal.EnumLite {
    public static final /* enum */ yM UNRECOGNIZED;
    public static final /* enum */ yM TOP;
    public static final /* enum */ yM MIDDLE;
    public static final int MIDDLE_VALUE = 2;
    public static final /* enum */ yM BOTTOM;
    public static final int BOTTOM_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<yM> internalValueMap;
    public static final /* enum */ yM EYES;
    private static final /* synthetic */ yM[] $VALUES;
    public static final int EYES_VALUE = 1;
    public static final int TOP_VALUE = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static yM forNumber(int a2) {
        switch (a2) {
            case 0: {
                return TOP;
            }
            case 1: {
                return EYES;
            }
            case 2: {
                return MIDDLE;
            }
            case 3: {
                return BOTTOM;
            }
        }
        return null;
    }

    public static yM valueOf(String a2) {
        return Enum.valueOf(yM.class, a2);
    }

    public static yM[] values() {
        return (yM[])$VALUES.clone();
    }

    public static Internal.EnumLiteMap<yM> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static yM valueOf(int a2) {
        return yM.forNumber(a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return mM.INSTANCE;
    }

    static {
        TOP = new yM(uSa.E);
        EYES = new yM(vRa.d);
        MIDDLE = new yM(uqa.g);
        BOTTOM = new yM(yRa.d);
        UNRECOGNIZED = new yM(pua.o);
        yM[] yMArray = new yM[tTa.h];
        yMArray[uSa.E] = TOP;
        yMArray[vRa.d] = EYES;
        yMArray[uqa.g] = MIDDLE;
        yMArray[yRa.d] = BOTTOM;
        yMArray[AQa.P] = UNRECOGNIZED;
        $VALUES = yMArray;
        internalValueMap = new Tn();
    }

    private yM(int n3) {
        int b2 = n3;
        yM a2 = this;
        a2.value = b2;
    }

    @Override
    public final int getNumber() {
        yM a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }
}

