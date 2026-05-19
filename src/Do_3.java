/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Do
 *  lM
 *  pua
 *  qm
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Do_3
extends Enum<Do>
implements Internal.EnumLite {
    private final int value;
    private static final Internal.EnumLiteMap<Do> internalValueMap;
    public static final /* enum */ Do UNRECOGNIZED;
    private static final /* synthetic */ Do[] $VALUES;
    public static final int EDIT_VALUE = 2;
    public static final int REMOVE_VALUE = 1;
    public static final /* enum */ Do REMOVE;
    public static final /* enum */ Do EDIT;
    public static final /* enum */ Do ADD;
    public static final int ADD_VALUE = 0;

    public static Do[] values() {
        return (Do[])$VALUES.clone();
    }

    public static Do valueOf(String a2) {
        return Enum.valueOf(Do_3.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Do forNumber(int a2) {
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

    public static Internal.EnumLiteMap<Do> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return qm.INSTANCE;
    }

    static {
        ADD = new Do_3(uSa.E);
        REMOVE = new Do_3(vRa.d);
        EDIT = new Do_3(uqa.g);
        UNRECOGNIZED = new Do_3(pua.o);
        Do_3[] do_3Array = new Do_3[AQa.P];
        do_3Array[uSa.E] = ADD;
        do_3Array[vRa.d] = REMOVE;
        do_3Array[uqa.g] = EDIT;
        do_3Array[yRa.d] = UNRECOGNIZED;
        $VALUES = do_3Array;
        internalValueMap = new lM();
    }

    @Override
    public final int getNumber() {
        Do_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    private Do_3(int n3) {
        int b2 = n3;
        Do_3 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static Do valueOf(int a2) {
        return Do_3.forNumber(a2);
    }
}

