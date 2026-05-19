/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  kFa
 *  vRa
 */
public final class kFa_1
extends Enum<kFa> {
    private static final kFa[] ID_LOOKUP;
    private static final /* synthetic */ kFa[] $VALUES;
    private final int chatVisibility;
    public static final /* enum */ kFa HIDDEN;
    public static final /* enum */ kFa FULL;
    public static final /* enum */ kFa SYSTEM;
    private final String resourceKey;

    public static kFa[] values() {
        return (kFa[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private kFa_1(int n3, String string2) {
        Object c2;
        void b2;
        kFa_1 a2;
        kFa_1 kFa_12 = object;
        Object object = string2;
        kFa_1 kFa_13 = a2 = kFa_12;
        kFa_13.chatVisibility = b2;
        kFa_13.resourceKey = c2;
    }

    public String getResourceKey() {
        kFa_1 a2;
        return a2.resourceKey;
    }

    public int getChatVisibility() {
        kFa_1 a2;
        return a2.chatVisibility;
    }

    public static kFa getEnumChatVisibility(int a2) {
        return ID_LOOKUP[a2 % ID_LOOKUP.length];
    }

    static {
        int n2;
        FULL = new kFa_1(uSa.E, Cra.e);
        SYSTEM = new kFa_1(vRa.d, zua.C);
        HIDDEN = new kFa_1(uqa.g, lQa.g);
        kFa_1[] kFa_1Array = new kFa_1[yRa.d];
        kFa_1Array[uSa.E] = FULL;
        kFa_1Array[vRa.d] = SYSTEM;
        kFa_1Array[uqa.g] = HIDDEN;
        $VALUES = kFa_1Array;
        ID_LOOKUP = new kFa_1[kFa_1.values().length];
        kFa[] kFaArray = kFa_1.values();
        int n3 = kFaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            kFa kFa2;
            kFa_1.ID_LOOKUP[kFa2.chatVisibility] = kFa2 = kFaArray[n2];
            n4 = ++n2;
        }
    }

    public static kFa valueOf(String a2) {
        return Enum.valueOf(kFa_1.class, a2);
    }
}

