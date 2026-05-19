/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  XTa
 *  an
 *  bo
 *  gO
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class an_2
extends Enum<an>
implements Internal.EnumLite {
    public static final /* enum */ an TOP_RIGHT;
    public static final int CENTER_VALUE = 0;
    public static final /* enum */ an BOTTOM;
    public static final int BOTTOM_VALUE = 5;
    public static final int TOP_VALUE = 2;
    public static final int LEFT_VALUE = 8;
    public static final int RIGHT_VALUE = 7;
    public static final /* enum */ an BOTTOM_LEFT;
    public static final /* enum */ an TOP;
    public static final int BOTTOM_RIGHT_VALUE = 4;
    private final int value;
    private static final /* synthetic */ an[] $VALUES;
    public static final int TOP_LEFT_VALUE = 3;
    public static final /* enum */ an RIGHT;
    public static final /* enum */ an LEFT;
    public static final /* enum */ an CENTER;
    public static final int BOTTOM_LEFT_VALUE = 6;
    public static final int TOP_RIGHT_VALUE = 1;
    public static final /* enum */ an UNRECOGNIZED;
    public static final /* enum */ an TOP_LEFT;
    private static final Internal.EnumLiteMap<an> internalValueMap;
    public static final /* enum */ an BOTTOM_RIGHT;

    public static an valueOf(String a2) {
        return Enum.valueOf(an_2.class, a2);
    }

    public static an[] values() {
        return (an[])$VALUES.clone();
    }

    static {
        CENTER = new an_2(uSa.E);
        TOP_RIGHT = new an_2(vRa.d);
        TOP = new an_2(uqa.g);
        TOP_LEFT = new an_2(yRa.d);
        BOTTOM_RIGHT = new an_2(AQa.P);
        BOTTOM = new an_2(tTa.h);
        BOTTOM_LEFT = new an_2(uua.p);
        RIGHT = new an_2(XTa.W);
        LEFT = new an_2(Yqa.i);
        UNRECOGNIZED = new an_2(pua.o);
        an_2[] an_2Array = new an_2[NTa.C];
        an_2Array[uSa.E] = CENTER;
        an_2Array[vRa.d] = TOP_RIGHT;
        an_2Array[uqa.g] = TOP;
        an_2Array[yRa.d] = TOP_LEFT;
        an_2Array[AQa.P] = BOTTOM_RIGHT;
        an_2Array[tTa.h] = BOTTOM;
        an_2Array[uua.p] = BOTTOM_LEFT;
        an_2Array[XTa.W] = RIGHT;
        an_2Array[Yqa.i] = LEFT;
        an_2Array[WOa.fa] = UNRECOGNIZED;
        $VALUES = an_2Array;
        internalValueMap = new gO();
    }

    public static Internal.EnumLiteMap<an> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        an_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return bo.INSTANCE;
    }

    private an_2(int n3) {
        int b2 = n3;
        an_2 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static an forNumber(int a2) {
        switch (a2) {
            case 0: {
                return CENTER;
            }
            case 1: {
                return TOP_RIGHT;
            }
            case 2: {
                return TOP;
            }
            case 3: {
                return TOP_LEFT;
            }
            case 4: {
                return BOTTOM_RIGHT;
            }
            case 5: {
                return BOTTOM;
            }
            case 6: {
                return BOTTOM_LEFT;
            }
            case 7: {
                return RIGHT;
            }
            case 8: {
                return LEFT;
            }
        }
        return null;
    }

    @Deprecated
    public static an valueOf(int a2) {
        return an_2.forNumber(a2);
    }
}

