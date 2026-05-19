/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ul
 *  gk
 *  pua
 *  vRa
 *  zl
 */
import com.google.protobuf.Internal;

public final class Ul_2
extends Enum<Ul>
implements Internal.EnumLite {
    private final int value;
    private static final Internal.EnumLiteMap<Ul> internalValueMap;
    public static final int EDIT_VALUE = 2;
    public static final int REMOVE_VALUE = 1;
    public static final int ADD_VALUE = 0;
    public static final /* enum */ Ul EDIT;
    public static final /* enum */ Ul ADD;
    public static final /* enum */ Ul UNRECOGNIZED;
    public static final /* enum */ Ul REMOVE;
    private static final /* synthetic */ Ul[] $VALUES;

    public static Internal.EnumVerifier internalGetVerifier() {
        return zl.INSTANCE;
    }

    private Ul_2(int n3) {
        int b2 = n3;
        Ul_2 a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumLiteMap<Ul> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        Ul_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    @Deprecated
    public static Ul valueOf(int a2) {
        return Ul_2.forNumber(a2);
    }

    public static Ul[] values() {
        return (Ul[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Ul forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ADD;
            }
            case 1: {
                return REMOVE;
            }
            case 2: {
                return EDIT;
            }
        }
        return null;
    }

    static {
        ADD = new Ul_2(uSa.E);
        REMOVE = new Ul_2(vRa.d);
        EDIT = new Ul_2(uqa.g);
        UNRECOGNIZED = new Ul_2(pua.o);
        Ul_2[] ul_2Array = new Ul_2[AQa.P];
        ul_2Array[uSa.E] = ADD;
        ul_2Array[vRa.d] = REMOVE;
        ul_2Array[uqa.g] = EDIT;
        ul_2Array[yRa.d] = UNRECOGNIZED;
        $VALUES = ul_2Array;
        internalValueMap = new gk();
    }

    public static Ul valueOf(String a2) {
        return Enum.valueOf(Ul_2.class, a2);
    }
}

