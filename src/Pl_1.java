/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bk
 *  Pl
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Pl_1
extends Enum<Pl>
implements Internal.EnumLite {
    public static final int HUD_VALUE = 0;
    public static final /* enum */ Pl BEFORE_TOOLTIP;
    public static final /* enum */ Pl BEFORE_HUD;
    private final int value;
    public static final int BEFORE_CHAT_VALUE = 4;
    public static final /* enum */ Pl UNRECOGNIZED;
    public static final /* enum */ Pl BEFORE_CHAT;
    private static final /* synthetic */ Pl[] $VALUES;
    public static final int SCREEN_VALUE = 2;
    public static final /* enum */ Pl HUD;
    public static final /* enum */ Pl SCREEN;
    public static final int BEFORE_HUD_VALUE = 3;
    private static final Internal.EnumLiteMap<Pl> internalValueMap;
    public static final int BEFORE_TOOLTIP_VALUE = 1;

    @Override
    public final int getNumber() {
        Pl_1 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    @Deprecated
    public static Pl valueOf(int a2) {
        return Pl_1.forNumber(a2);
    }

    public static Internal.EnumLiteMap<Pl> internalGetValueMap() {
        return internalValueMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Pl forNumber(int a2) {
        switch (a2) {
            case 0: {
                return HUD;
            }
            case 1: {
                return BEFORE_TOOLTIP;
            }
            case 2: {
                return SCREEN;
            }
            case 3: {
                return BEFORE_HUD;
            }
            case 4: {
                return BEFORE_CHAT;
            }
        }
        return null;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Bk.INSTANCE;
    }

    public static Pl valueOf(String a2) {
        return Enum.valueOf(Pl_1.class, a2);
    }

    private Pl_1(int n3) {
        int b2 = n3;
        Pl_1 a2 = this;
        a2.value = b2;
    }

    public static Pl[] values() {
        return (Pl[])$VALUES.clone();
    }

    static {
        HUD = new Pl_1(uSa.E);
        BEFORE_TOOLTIP = new Pl_1(vRa.d);
        SCREEN = new Pl_1(uqa.g);
        BEFORE_HUD = new Pl_1(yRa.d);
        BEFORE_CHAT = new Pl_1(AQa.P);
        UNRECOGNIZED = new Pl_1(pua.o);
        Pl_1[] pl_1Array = new Pl_1[uua.p];
        pl_1Array[uSa.E] = HUD;
        pl_1Array[vRa.d] = BEFORE_TOOLTIP;
        pl_1Array[uqa.g] = SCREEN;
        pl_1Array[yRa.d] = BEFORE_HUD;
        pl_1Array[AQa.P] = BEFORE_CHAT;
        pl_1Array[tTa.h] = UNRECOGNIZED;
        $VALUES = pl_1Array;
        internalValueMap = new bL();
    }
}

