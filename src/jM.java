/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CO
 *  bn
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class jM
extends Enum<jM>
implements Internal.EnumLite {
    public static final /* enum */ jM VERTICAL;
    public static final /* enum */ jM UNRECOGNIZED;
    public static final /* enum */ jM HORIZONTAL;
    public static final int HORIZONTAL_VALUE = 0;
    public static final int VERTICAL_VALUE = 1;
    public static final /* enum */ jM BOTH;
    private static final /* synthetic */ jM[] $VALUES;
    public static final int BOTH_VALUE = 2;
    private static final Internal.EnumLiteMap<jM> internalValueMap;
    private final int value;

    public static Internal.EnumLiteMap<jM> internalGetValueMap() {
        return internalValueMap;
    }

    private jM(int n3) {
        int b2 = n3;
        jM a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CO.INSTANCE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static jM forNumber(int a2) {
        switch (a2) {
            case 0: {
                return HORIZONTAL;
            }
            case 1: {
                return VERTICAL;
            }
            case 2: {
                return BOTH;
            }
        }
        return null;
    }

    @Override
    public final int getNumber() {
        jM a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static jM[] values() {
        return (jM[])$VALUES.clone();
    }

    public static jM valueOf(String a2) {
        return Enum.valueOf(jM.class, a2);
    }

    @Deprecated
    public static jM valueOf(int a2) {
        return jM.forNumber(a2);
    }

    static {
        HORIZONTAL = new jM(uSa.E);
        VERTICAL = new jM(vRa.d);
        BOTH = new jM(uqa.g);
        UNRECOGNIZED = new jM(pua.o);
        jM[] jMArray = new jM[AQa.P];
        jMArray[uSa.E] = HORIZONTAL;
        jMArray[vRa.d] = VERTICAL;
        jMArray[uqa.g] = BOTH;
        jMArray[yRa.d] = UNRECOGNIZED;
        $VALUES = jMArray;
        internalValueMap = new bn();
    }
}

