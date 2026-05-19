/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bl
 *  XTa
 *  ck
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Bl_3
extends Enum<Bl>
implements Internal.EnumLite {
    public static final int LOOK_AT_ENTITY_TYPE_VALUE = 5;
    public static final /* enum */ Bl ALWAYS = new Bl_3(uSa.E);
    private static final /* synthetic */ Bl[] $VALUES;
    private final int value;
    public static final int ALWAYS_VALUE = 0;
    public static final int KEYBOARD_VALUE = 1;
    public static final int BLOCK_VALUE = 3;
    public static final /* enum */ Bl BLOCK;
    public static final /* enum */ Bl UNRECOGNIZED;
    private static final Internal.EnumLiteMap<Bl> internalValueMap;
    public static final /* enum */ Bl LOOK_AT_ENTITY_TYPE;
    public static final int LOOK_AT_ENTITY_ID_VALUE = 4;
    public static final /* enum */ Bl KEYBOARD;
    public static final /* enum */ Bl DEBUGBB;
    public static final int DEBUGBB_VALUE = 2;
    public static final /* enum */ Bl LOOK_AT_ENTITY_ID;

    public static Internal.EnumVerifier internalGetVerifier() {
        return ck.INSTANCE;
    }

    static {
        KEYBOARD = new Bl_3(vRa.d);
        DEBUGBB = new Bl_3(uqa.g);
        BLOCK = new Bl_3(yRa.d);
        LOOK_AT_ENTITY_ID = new Bl_3(AQa.P);
        LOOK_AT_ENTITY_TYPE = new Bl_3(tTa.h);
        UNRECOGNIZED = new Bl_3(pua.o);
        Bl_3[] bl_3Array = new Bl_3[XTa.W];
        bl_3Array[uSa.E] = ALWAYS;
        bl_3Array[vRa.d] = KEYBOARD;
        bl_3Array[uqa.g] = DEBUGBB;
        bl_3Array[yRa.d] = BLOCK;
        bl_3Array[AQa.P] = LOOK_AT_ENTITY_ID;
        bl_3Array[tTa.h] = LOOK_AT_ENTITY_TYPE;
        bl_3Array[uua.p] = UNRECOGNIZED;
        $VALUES = bl_3Array;
        internalValueMap = new GJ();
    }

    public static Internal.EnumLiteMap<Bl> internalGetValueMap() {
        return internalValueMap;
    }

    public static Bl valueOf(String a2) {
        return Enum.valueOf(Bl_3.class, a2);
    }

    private Bl_3(int n3) {
        int b2 = n3;
        Bl_3 a2 = this;
        a2.value = b2;
    }

    @Override
    public final int getNumber() {
        Bl_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Bl forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ALWAYS;
            }
            case 1: {
                return KEYBOARD;
            }
            case 2: {
                return DEBUGBB;
            }
            case 3: {
                return BLOCK;
            }
            case 4: {
                return LOOK_AT_ENTITY_ID;
            }
            case 5: {
                return LOOK_AT_ENTITY_TYPE;
            }
        }
        return null;
    }

    public static Bl[] values() {
        return (Bl[])$VALUES.clone();
    }

    @Deprecated
    public static Bl valueOf(int a2) {
        return Bl_3.forNumber(a2);
    }
}

