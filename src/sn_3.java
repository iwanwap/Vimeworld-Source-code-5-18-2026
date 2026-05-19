/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ao
 *  pua
 *  sn
 *  vRa
 */
import com.google.protobuf.Internal;

public final class sn_3
extends Enum<sn>
implements Internal.EnumLite {
    public static final int UNBIND_SELF_VALUE = 2;
    private static final /* synthetic */ sn[] $VALUES;
    public static final /* enum */ sn REMOVE_2D;
    public static final /* enum */ sn CALLBACK;
    public static final /* enum */ sn CHAT;
    public static final int REMOVE_2D_VALUE = 3;
    public static final /* enum */ sn UNBIND_SELF;
    private final int value;
    public static final /* enum */ sn UNBIND;
    public static final int CHAT_VALUE = 4;
    public static final int CALLBACK_VALUE = 0;
    public static final int UNBIND_VALUE = 1;
    public static final /* enum */ sn UNRECOGNIZED;
    private static final Internal.EnumLiteMap<sn> internalValueMap;

    @Override
    public final int getNumber() {
        sn_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    static {
        CALLBACK = new sn_3(uSa.E);
        UNBIND = new sn_3(vRa.d);
        UNBIND_SELF = new sn_3(uqa.g);
        REMOVE_2D = new sn_3(yRa.d);
        CHAT = new sn_3(AQa.P);
        UNRECOGNIZED = new sn_3(pua.o);
        sn_3[] sn_3Array = new sn_3[uua.p];
        sn_3Array[uSa.E] = CALLBACK;
        sn_3Array[vRa.d] = UNBIND;
        sn_3Array[uqa.g] = UNBIND_SELF;
        sn_3Array[yRa.d] = REMOVE_2D;
        sn_3Array[AQa.P] = CHAT;
        sn_3Array[tTa.h] = UNRECOGNIZED;
        $VALUES = sn_3Array;
        internalValueMap = new Go();
    }

    public static sn[] values() {
        return (sn[])$VALUES.clone();
    }

    @Deprecated
    public static sn valueOf(int a2) {
        return sn_3.forNumber(a2);
    }

    private sn_3(int n3) {
        int b2 = n3;
        sn_3 a2 = this;
        a2.value = b2;
    }

    public static sn valueOf(String a2) {
        return Enum.valueOf(sn_3.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sn forNumber(int a2) {
        switch (a2) {
            case 0: {
                return CALLBACK;
            }
            case 1: {
                return UNBIND;
            }
            case 2: {
                return UNBIND_SELF;
            }
            case 3: {
                return REMOVE_2D;
            }
            case 4: {
                return CHAT;
            }
        }
        return null;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Ao.INSTANCE;
    }

    public static Internal.EnumLiteMap<sn> internalGetValueMap() {
        return internalValueMap;
    }
}

