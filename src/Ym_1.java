/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ym
 *  im
 *  pua
 *  vRa
 *  zM
 */
import com.google.protobuf.Internal;

public final class Ym_1
extends Enum<Ym>
implements Internal.EnumLite {
    public static final /* enum */ Ym UNRECOGNIZED;
    private final int value;
    public static final /* enum */ Ym ACTION;
    private static final Internal.EnumLiteMap<Ym> internalValueMap;
    private static final /* synthetic */ Ym[] $VALUES;
    public static final int ACTION_VALUE = 0;

    @Deprecated
    public static Ym valueOf(int a2) {
        return Ym_1.forNumber(a2);
    }

    private Ym_1(int n3) {
        int b2 = n3;
        Ym_1 a2 = this;
        a2.value = b2;
    }

    public static Ym[] values() {
        return (Ym[])$VALUES.clone();
    }

    public static Internal.EnumLiteMap<Ym> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        Ym_1 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return zM.INSTANCE;
    }

    public static Ym valueOf(String a2) {
        return Enum.valueOf(Ym_1.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Ym forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ACTION;
            }
        }
        return null;
    }

    static {
        ACTION = new Ym_1(uSa.E);
        UNRECOGNIZED = new Ym_1(pua.o);
        Ym_1[] ym_1Array = new Ym_1[uqa.g];
        ym_1Array[uSa.E] = ACTION;
        ym_1Array[vRa.d] = UNRECOGNIZED;
        $VALUES = ym_1Array;
        internalValueMap = new im();
    }
}

