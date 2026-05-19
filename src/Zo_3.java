/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zo
 *  nN
 *  on
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Zo_3
extends Enum<Zo>
implements Internal.EnumLite {
    public static final int VERTICAL_VALUE = 1;
    private static final /* synthetic */ Zo[] $VALUES;
    private final int value;
    public static final /* enum */ Zo VERTICAL;
    public static final /* enum */ Zo NONE;
    public static final /* enum */ Zo HORIZONTAL;
    private static final Internal.EnumLiteMap<Zo> internalValueMap;
    public static final /* enum */ Zo UNRECOGNIZED;
    public static final int HORIZONTAL_VALUE = 2;
    public static final int NONE_VALUE = 0;

    @Deprecated
    public static Zo valueOf(int a2) {
        return Zo_3.forNumber(a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return on.INSTANCE;
    }

    public static Zo[] values() {
        return (Zo[])$VALUES.clone();
    }

    private Zo_3(int n3) {
        int b2 = n3;
        Zo_3 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Zo forNumber(int a2) {
        switch (a2) {
            case 0: {
                return NONE;
            }
            case 1: {
                return VERTICAL;
            }
            case 2: {
                return HORIZONTAL;
            }
        }
        return null;
    }

    static {
        NONE = new Zo_3(uSa.E);
        VERTICAL = new Zo_3(vRa.d);
        HORIZONTAL = new Zo_3(uqa.g);
        UNRECOGNIZED = new Zo_3(pua.o);
        Zo_3[] zo_3Array = new Zo_3[AQa.P];
        zo_3Array[uSa.E] = NONE;
        zo_3Array[vRa.d] = VERTICAL;
        zo_3Array[uqa.g] = HORIZONTAL;
        zo_3Array[yRa.d] = UNRECOGNIZED;
        $VALUES = zo_3Array;
        internalValueMap = new nN();
    }

    @Override
    public final int getNumber() {
        Zo_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Zo valueOf(String a2) {
        return Enum.valueOf(Zo_3.class, a2);
    }

    public static Internal.EnumLiteMap<Zo> internalGetValueMap() {
        return internalValueMap;
    }
}

