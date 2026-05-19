/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JM
 *  Ro
 *  kO
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Ro_3
extends Enum<Ro>
implements Internal.EnumLite {
    public static final int CLOSE_GUI_VALUE = 3;
    public static final /* enum */ Ro UNRECOGNIZED;
    public static final int URL_VALUE = 0;
    public static final /* enum */ Ro CHAT;
    public static final int CALLBACK_VALUE = 2;
    private static final Internal.EnumLiteMap<Ro> internalValueMap;
    public static final /* enum */ Ro CALLBACK;
    private static final /* synthetic */ Ro[] $VALUES;
    private final int value;
    public static final /* enum */ Ro CLOSE_GUI;
    public static final /* enum */ Ro URL;
    public static final int CHAT_VALUE = 1;

    /*
     * Enabled aggressive block sorting
     */
    public static Ro forNumber(int a2) {
        switch (a2) {
            case 0: {
                return URL;
            }
            case 1: {
                return CHAT;
            }
            case 2: {
                return CALLBACK;
            }
            case 3: {
                return CLOSE_GUI;
            }
        }
        return null;
    }

    public static Ro valueOf(String a2) {
        return Enum.valueOf(Ro_3.class, a2);
    }

    public static Internal.EnumLiteMap<Ro> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        Ro_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    private Ro_3(int n3) {
        int b2 = n3;
        Ro_3 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static Ro valueOf(int a2) {
        return Ro_3.forNumber(a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JM.INSTANCE;
    }

    public static Ro[] values() {
        return (Ro[])$VALUES.clone();
    }

    static {
        URL = new Ro_3(uSa.E);
        CHAT = new Ro_3(vRa.d);
        CALLBACK = new Ro_3(uqa.g);
        CLOSE_GUI = new Ro_3(yRa.d);
        UNRECOGNIZED = new Ro_3(pua.o);
        Ro_3[] ro_3Array = new Ro_3[tTa.h];
        ro_3Array[uSa.E] = URL;
        ro_3Array[vRa.d] = CHAT;
        ro_3Array[uqa.g] = CALLBACK;
        ro_3Array[yRa.d] = CLOSE_GUI;
        ro_3Array[AQa.P] = UNRECOGNIZED;
        $VALUES = ro_3Array;
        internalValueMap = new kO();
    }
}

