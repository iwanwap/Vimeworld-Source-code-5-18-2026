/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cl
 *  jk
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class jk_3
extends Enum<jk>
implements Internal.EnumLite {
    private static final /* synthetic */ jk[] $VALUES;
    public static final int CENTER_VALUE = 0;
    private static final Internal.EnumLiteMap<jk> internalValueMap;
    public static final /* enum */ jk RIGHT;
    public static final /* enum */ jk UNRECOGNIZED;
    public static final /* enum */ jk LEFT;
    public static final /* enum */ jk CENTER;
    public static final int LEFT_VALUE = 1;
    public static final int RIGHT_VALUE = 2;
    private final int value;

    /*
     * Enabled aggressive block sorting
     */
    public static jk forNumber(int a2) {
        switch (a2) {
            case 0: {
                return CENTER;
            }
            case 1: {
                return LEFT;
            }
            case 2: {
                return RIGHT;
            }
        }
        return null;
    }

    public static jk valueOf(String a2) {
        return Enum.valueOf(jk_3.class, a2);
    }

    static {
        CENTER = new jk_3(uSa.E);
        LEFT = new jk_3(vRa.d);
        RIGHT = new jk_3(uqa.g);
        UNRECOGNIZED = new jk_3(pua.o);
        jk_3[] jk_3Array = new jk_3[AQa.P];
        jk_3Array[uSa.E] = CENTER;
        jk_3Array[vRa.d] = LEFT;
        jk_3Array[uqa.g] = RIGHT;
        jk_3Array[yRa.d] = UNRECOGNIZED;
        $VALUES = jk_3Array;
        internalValueMap = new Cl();
    }

    @Override
    public final int getNumber() {
        jk_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Wk.INSTANCE;
    }

    private jk_3(int n3) {
        int b2 = n3;
        jk_3 a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumLiteMap<jk> internalGetValueMap() {
        return internalValueMap;
    }

    public static jk[] values() {
        return (jk[])$VALUES.clone();
    }

    @Deprecated
    public static jk valueOf(int a2) {
        return jk_3.forNumber(a2);
    }
}

