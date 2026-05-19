/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  gEa
 *  lqa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class gEa_2
extends Enum<gEa>
implements D {
    private final String canonicalName;
    public static final /* enum */ gEa OPEN_URL;
    public static final /* enum */ gEa SUGGEST_COMMAND;
    private static final /* synthetic */ gEa[] $VALUES;
    private final boolean allowedInChat;
    public static final /* enum */ gEa OPEN_FILE;
    public static final /* enum */ gEa CHANGE_PAGE;
    public static final /* enum */ gEa RUN_COMMAND;
    public static final /* enum */ gEa TWITCH_USER_INFO;
    private static final Map<String, gEa> nameMapping;

    public static gEa getValueByCanonicalName(String a2) {
        return (gEa_2)nameMapping.get(a2);
    }

    public String getCanonicalName() {
        gEa_2 a2;
        return a2.canonicalName;
    }

    /*
     * WARNING - void declaration
     */
    private gEa_2(String string2, boolean bl) {
        void c2;
        void b2;
        gEa_2 a2;
        boolean bl2 = bl;
        gEa_2 gEa_22 = a2 = this;
        gEa_22.canonicalName = b2;
        gEa_22.allowedInChat = c2;
    }

    static {
        int n2;
        OPEN_URL = new gEa_2(xua.I, vRa.d != 0);
        OPEN_FILE = new gEa_2(uqa.ja, uSa.E != 0);
        RUN_COMMAND = new gEa_2(zpa.Q, vRa.d != 0);
        TWITCH_USER_INFO = new gEa_2(zta.X, uSa.E != 0);
        SUGGEST_COMMAND = new gEa_2(lqa.B, vRa.d != 0);
        CHANGE_PAGE = new gEa_2(SPa.d, vRa.d != 0);
        gEa_2[] gEa_2Array = new gEa_2[uua.p];
        gEa_2Array[uSa.E] = OPEN_URL;
        gEa_2Array[vRa.d] = OPEN_FILE;
        gEa_2Array[uqa.g] = RUN_COMMAND;
        gEa_2Array[yRa.d] = TWITCH_USER_INFO;
        gEa_2Array[AQa.P] = SUGGEST_COMMAND;
        gEa_2Array[tTa.h] = CHANGE_PAGE;
        $VALUES = gEa_2Array;
        nameMapping = Maps.newHashMap();
        gEa[] gEaArray = gEa_2.values();
        int n3 = gEaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            gEa gEa2 = gEaArray[n2];
            nameMapping.put(gEa2.getCanonicalName(), gEa2);
            n4 = ++n2;
        }
    }

    public static gEa[] values() {
        return (gEa[])$VALUES.clone();
    }

    public boolean shouldAllowInChat() {
        gEa_2 a2;
        return a2.allowedInChat;
    }

    public static gEa valueOf(String a2) {
        return Enum.valueOf(gEa_2.class, a2);
    }
}

