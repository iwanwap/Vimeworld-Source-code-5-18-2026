/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KO
 *  Nm
 *  lo
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class lo_2
extends Enum<lo>
implements Internal.EnumLite {
    public static final int LINE_VALUE = 2;
    public static final /* enum */ lo LINE;
    public static final /* enum */ lo DIRECTDRAW;
    public static final int BEAM_VALUE = 1;
    public static final int GROUP_VALUE = 0;
    public static final /* enum */ lo BEAM;
    public static final /* enum */ lo GROUP;
    public static final /* enum */ lo UNRECOGNIZED;
    private static final /* synthetic */ lo[] $VALUES;
    private final int value;
    private static final Internal.EnumLiteMap<lo> internalValueMap;
    public static final int DIRECTDRAW_VALUE = 3;
    public static final /* enum */ lo SPHERE;
    public static final int SPHERE_VALUE = 4;

    @Override
    public final int getNumber() {
        lo_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    @Deprecated
    public static lo valueOf(int a2) {
        return lo_2.forNumber(a2);
    }

    public static lo valueOf(String a2) {
        return Enum.valueOf(lo_2.class, a2);
    }

    public static Internal.EnumLiteMap<lo> internalGetValueMap() {
        return internalValueMap;
    }

    static {
        GROUP = new lo_2(uSa.E);
        BEAM = new lo_2(vRa.d);
        LINE = new lo_2(uqa.g);
        DIRECTDRAW = new lo_2(yRa.d);
        SPHERE = new lo_2(AQa.P);
        UNRECOGNIZED = new lo_2(pua.o);
        lo_2[] lo_2Array = new lo_2[uua.p];
        lo_2Array[uSa.E] = GROUP;
        lo_2Array[vRa.d] = BEAM;
        lo_2Array[uqa.g] = LINE;
        lo_2Array[yRa.d] = DIRECTDRAW;
        lo_2Array[AQa.P] = SPHERE;
        lo_2Array[tTa.h] = UNRECOGNIZED;
        $VALUES = lo_2Array;
        internalValueMap = new Nm();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static lo forNumber(int a2) {
        switch (a2) {
            case 0: {
                return GROUP;
            }
            case 1: {
                return BEAM;
            }
            case 2: {
                return LINE;
            }
            case 3: {
                return DIRECTDRAW;
            }
            case 4: {
                return SPHERE;
            }
        }
        return null;
    }

    public static lo[] values() {
        return (lo[])$VALUES.clone();
    }

    private lo_2(int n3) {
        int b2 = n3;
        lo_2 a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return KO.INSTANCE;
    }
}

