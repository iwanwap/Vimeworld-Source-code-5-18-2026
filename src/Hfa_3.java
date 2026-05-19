/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Hfa
 *  Spa
 *  jpa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class Hfa_3
extends Enum<Hfa>
implements D {
    public static final /* enum */ Hfa SHOW_ENTITY;
    private final String canonicalName;
    public static final /* enum */ Hfa SHOW_ACHIEVEMENT;
    public static final /* enum */ Hfa SHOW_TEXT;
    private final boolean allowedInChat;
    public static final /* enum */ Hfa SHOW_ITEM;
    private static final Map<String, Hfa> nameMapping;
    private static final /* synthetic */ Hfa[] $VALUES;

    public static Hfa valueOf(String a2) {
        return Enum.valueOf(Hfa_3.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private Hfa_3(String string2, boolean bl2) {
        void c2;
        void b2;
        Hfa_3 a2;
        boolean bl3 = bl2;
        Hfa_3 hfa_3 = a2 = this;
        hfa_3.canonicalName = b2;
        hfa_3.allowedInChat = c2;
    }

    public static Hfa getValueByCanonicalName(String a2) {
        return (Hfa_3)nameMapping.get(a2);
    }

    public boolean shouldAllowInChat() {
        Hfa_3 a2;
        return a2.allowedInChat;
    }

    static {
        int n2;
        SHOW_TEXT = new Hfa_3(BPa.b, vRa.d != 0);
        SHOW_ACHIEVEMENT = new Hfa_3(Qra.e, vRa.d != 0);
        SHOW_ITEM = new Hfa_3(jpa.B, vRa.d != 0);
        SHOW_ENTITY = new Hfa_3(Spa.U, vRa.d != 0);
        Hfa_3[] hfa_3Array = new Hfa_3[AQa.P];
        hfa_3Array[uSa.E] = SHOW_TEXT;
        hfa_3Array[vRa.d] = SHOW_ACHIEVEMENT;
        hfa_3Array[uqa.g] = SHOW_ITEM;
        hfa_3Array[yRa.d] = SHOW_ENTITY;
        $VALUES = hfa_3Array;
        nameMapping = Maps.newHashMap();
        Hfa[] hfaArray = Hfa_3.values();
        int n3 = hfaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Hfa hfa2 = hfaArray[n2];
            nameMapping.put(hfa2.getCanonicalName(), hfa2);
            n4 = ++n2;
        }
    }

    public static Hfa[] values() {
        return (Hfa[])$VALUES.clone();
    }

    public String getCanonicalName() {
        Hfa_3 a2;
        return a2.canonicalName;
    }
}

