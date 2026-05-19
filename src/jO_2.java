/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jO
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class jO_2
extends Enum<jO>
implements Internal.EnumLite {
    public static final int LINES_VALUE = 1;
    public static final /* enum */ jO UNRECOGNIZED;
    public static final /* enum */ jO POINTS;
    private static final Internal.EnumLiteMap<jO> internalValueMap;
    public static final /* enum */ jO LINES;
    public static final int POINTS_VALUE = 2;
    public static final int FILL_VALUE = 0;
    private static final /* synthetic */ jO[] $VALUES;
    public static final /* enum */ jO FILL;
    private final int value;

    @Override
    public final int getNumber() {
        jO_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HN.INSTANCE;
    }

    public static jO[] values() {
        return (jO[])$VALUES.clone();
    }

    public static Internal.EnumLiteMap<jO> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static jO valueOf(int a2) {
        return jO_2.forNumber(a2);
    }

    static {
        FILL = new jO_2(uSa.E);
        LINES = new jO_2(vRa.d);
        POINTS = new jO_2(uqa.g);
        UNRECOGNIZED = new jO_2(pua.o);
        jO_2[] jO_2Array = new jO_2[AQa.P];
        jO_2Array[uSa.E] = FILL;
        jO_2Array[vRa.d] = LINES;
        jO_2Array[uqa.g] = POINTS;
        jO_2Array[yRa.d] = UNRECOGNIZED;
        $VALUES = jO_2Array;
        internalValueMap = new cM();
    }

    public static jO valueOf(String a2) {
        return Enum.valueOf(jO_2.class, a2);
    }

    private jO_2(int n3) {
        int b2 = n3;
        jO_2 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static jO forNumber(int a2) {
        switch (a2) {
            case 0: {
                return FILL;
            }
            case 1: {
                return LINES;
            }
            case 2: {
                return POINTS;
            }
        }
        return null;
    }
}

