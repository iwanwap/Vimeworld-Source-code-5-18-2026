/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  iN
 *  nO
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class nO_2
extends Enum<nO>
implements Internal.EnumLite {
    private final int value;
    public static final int LINE_LOOP_VALUE = 1;
    public static final /* enum */ nO LINE_LOOP;
    private static final /* synthetic */ nO[] $VALUES;
    public static final int LINE_STRIP_VALUE = 0;
    public static final int LINES_VALUE = 2;
    public static final /* enum */ nO UNRECOGNIZED;
    public static final /* enum */ nO LINES;
    private static final Internal.EnumLiteMap<nO> internalValueMap;
    public static final /* enum */ nO LINE_STRIP;

    /*
     * Enabled aggressive block sorting
     */
    public static nO forNumber(int a2) {
        switch (a2) {
            case 0: {
                return LINE_STRIP;
            }
            case 1: {
                return LINE_LOOP;
            }
            case 2: {
                return LINES;
            }
        }
        return null;
    }

    public static nO[] values() {
        return (nO[])$VALUES.clone();
    }

    @Deprecated
    public static nO valueOf(int a2) {
        return nO_2.forNumber(a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return iN.INSTANCE;
    }

    private nO_2(int n3) {
        int b2 = n3;
        nO_2 a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumLiteMap<nO> internalGetValueMap() {
        return internalValueMap;
    }

    static {
        LINE_STRIP = new nO_2(uSa.E);
        LINE_LOOP = new nO_2(vRa.d);
        LINES = new nO_2(uqa.g);
        UNRECOGNIZED = new nO_2(pua.o);
        nO_2[] nO_2Array = new nO_2[AQa.P];
        nO_2Array[uSa.E] = LINE_STRIP;
        nO_2Array[vRa.d] = LINE_LOOP;
        nO_2Array[uqa.g] = LINES;
        nO_2Array[yRa.d] = UNRECOGNIZED;
        $VALUES = nO_2Array;
        internalValueMap = new ho();
    }

    public static nO valueOf(String a2) {
        return Enum.valueOf(nO_2.class, a2);
    }

    @Override
    public final int getNumber() {
        nO_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }
}

