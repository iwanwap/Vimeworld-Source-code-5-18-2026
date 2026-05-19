/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fn
 *  GO
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Fn_3
extends Enum<Fn>
implements Internal.EnumLite {
    private final int value;
    public static final /* enum */ Fn UNRECOGNIZED;
    public static final int ENTITY_VALUE = 0;
    private static final /* synthetic */ Fn[] $VALUES;
    private static final Internal.EnumLiteMap<Fn> internalValueMap;
    public static final /* enum */ Fn ENTITY;

    /*
     * Enabled aggressive block sorting
     */
    public static Fn forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ENTITY;
            }
        }
        return null;
    }

    private Fn_3(int n3) {
        int b2 = n3;
        Fn_3 a2 = this;
        a2.value = b2;
    }

    public static Internal.EnumLiteMap<Fn> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        Fn_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Fn valueOf(String a2) {
        return Enum.valueOf(Fn_3.class, a2);
    }

    @Deprecated
    public static Fn valueOf(int a2) {
        return Fn_3.forNumber(a2);
    }

    public static Fn[] values() {
        return (Fn[])$VALUES.clone();
    }

    static {
        ENTITY = new Fn_3(uSa.E);
        UNRECOGNIZED = new Fn_3(pua.o);
        Fn_3[] fn_3Array = new Fn_3[uqa.g];
        fn_3Array[uSa.E] = ENTITY;
        fn_3Array[vRa.d] = UNRECOGNIZED;
        $VALUES = fn_3Array;
        internalValueMap = new GO();
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return vo.INSTANCE;
    }
}

