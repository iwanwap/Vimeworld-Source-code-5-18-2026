/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gj
 *  Nj
 *  ak
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Nj_3
extends Enum<Nj>
implements Internal.EnumLite {
    private static final /* synthetic */ Nj[] $VALUES;
    public static final /* enum */ Nj NORMAL;
    public static final int NORMAL_VALUE = 1;
    private final int value;
    public static final /* enum */ Nj NO_WRAP;
    private static final Internal.EnumLiteMap<Nj> internalValueMap;
    public static final /* enum */ Nj UNRECOGNIZED;
    public static final int NO_WRAP_VALUE = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static Nj forNumber(int a2) {
        switch (a2) {
            case 0: {
                return NO_WRAP;
            }
            case 1: {
                return NORMAL;
            }
        }
        return null;
    }

    static {
        NO_WRAP = new Nj_3(uSa.E);
        NORMAL = new Nj_3(vRa.d);
        UNRECOGNIZED = new Nj_3(pua.o);
        Nj_3[] nj_3Array = new Nj_3[yRa.d];
        nj_3Array[uSa.E] = NO_WRAP;
        nj_3Array[vRa.d] = NORMAL;
        nj_3Array[uqa.g] = UNRECOGNIZED;
        $VALUES = nj_3Array;
        internalValueMap = new ak();
    }

    private Nj_3(int n3) {
        int b2 = n3;
        Nj_3 a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Gj.INSTANCE;
    }

    public static Internal.EnumLiteMap<Nj> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        Nj_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    @Deprecated
    public static Nj valueOf(int a2) {
        return Nj_3.forNumber(a2);
    }

    public static Nj valueOf(String a2) {
        return Enum.valueOf(Nj_3.class, a2);
    }

    public static Nj[] values() {
        return (Nj[])$VALUES.clone();
    }
}

