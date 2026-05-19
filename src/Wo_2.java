/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RO
 *  Wo
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Wo_2
extends Enum<Wo>
implements Internal.EnumLite {
    public static final /* enum */ Wo HEAD;
    public static final int NONE_VALUE = 0;
    public static final /* enum */ Wo UNRECOGNIZED;
    public static final /* enum */ Wo BODY;
    public static final int HEAD_VALUE = 2;
    private static final /* synthetic */ Wo[] $VALUES;
    public static final int BODY_VALUE = 1;
    public static final /* enum */ Wo NONE;
    private static final Internal.EnumLiteMap<Wo> internalValueMap;
    private final int value;

    @Deprecated
    public static Wo valueOf(int a2) {
        return Wo_2.forNumber(a2);
    }

    static {
        NONE = new Wo_2(uSa.E);
        BODY = new Wo_2(vRa.d);
        HEAD = new Wo_2(uqa.g);
        UNRECOGNIZED = new Wo_2(pua.o);
        Wo_2[] wo_2Array = new Wo_2[AQa.P];
        wo_2Array[uSa.E] = NONE;
        wo_2Array[vRa.d] = BODY;
        wo_2Array[uqa.g] = HEAD;
        wo_2Array[yRa.d] = UNRECOGNIZED;
        $VALUES = wo_2Array;
        internalValueMap = new wo();
    }

    public static Internal.EnumLiteMap<Wo> internalGetValueMap() {
        return internalValueMap;
    }

    public static Wo[] values() {
        return (Wo[])$VALUES.clone();
    }

    private Wo_2(int n3) {
        int b2 = n3;
        Wo_2 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Wo forNumber(int a2) {
        switch (a2) {
            case 0: {
                return NONE;
            }
            case 1: {
                return BODY;
            }
            case 2: {
                return HEAD;
            }
        }
        return null;
    }

    @Override
    public final int getNumber() {
        Wo_2 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Wo valueOf(String a2) {
        return Enum.valueOf(Wo_2.class, a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return RO.INSTANCE;
    }
}

