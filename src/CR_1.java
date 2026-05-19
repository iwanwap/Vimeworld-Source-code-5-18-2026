/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CR
 *  Pl
 *  dP
 *  vRa
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class CR_1
extends Enum<CR> {
    public static final /* enum */ CR BEFORE_HUD = new CR_1();
    private static final /* synthetic */ CR[] $VALUES;
    public static final /* enum */ CR HUD;
    public static final /* enum */ CR BEFORE_TOOLTIP;
    public static final CR[] REVERSED_RENDER_ORDER;
    public static final /* enum */ CR SCREEN;
    public static final /* enum */ CR BEFORE_CHAT;

    private CR_1() {
        int a2 = n2;
        CR_1 cR_1 = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static CR fromProto(Pl a2) {
        switch (dP.I[a2.ordinal()]) {
            case 1: {
                return BEFORE_HUD;
            }
            case 2: {
                return BEFORE_CHAT;
            }
            case 3: {
                return HUD;
            }
            case 4: {
                return BEFORE_TOOLTIP;
            }
            case 5: {
                return SCREEN;
            }
        }
        return HUD;
    }

    public static CR[] values() {
        return (CR[])$VALUES.clone();
    }

    public static CR valueOf(String a2) {
        return Enum.valueOf(CR_1.class, a2);
    }

    static {
        BEFORE_CHAT = new CR_1();
        HUD = new CR_1();
        BEFORE_TOOLTIP = new CR_1();
        SCREEN = new CR_1();
        CR_1[] cR_1Array = new CR_1[tTa.h];
        cR_1Array[uSa.E] = BEFORE_HUD;
        cR_1Array[vRa.d] = BEFORE_CHAT;
        cR_1Array[uqa.g] = HUD;
        cR_1Array[yRa.d] = BEFORE_TOOLTIP;
        cR_1Array[AQa.P] = SCREEN;
        $VALUES = cR_1Array;
        List<CR> list = Arrays.asList(CR_1.values());
        Collections.reverse(list);
        REVERSED_RENDER_ORDER = (CR[])list.toArray(new CR_1[uSa.E]);
    }
}

