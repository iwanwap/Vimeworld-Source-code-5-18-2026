/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  UI
 *  Yi
 *  uN
 *  vRa
 */
public final class UI_1
extends Enum<UI> {
    private static final /* synthetic */ UI[] $VALUES;
    public static final /* enum */ UI CLAMP = new UI_1();
    public static final /* enum */ UI REPEAT_MIPMAP;
    public static final /* enum */ UI REPEAT;

    private UI_1() {
        int a2 = n2;
        UI_1 uI_1 = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static UI fromProto(uN a2) {
        switch (Yi.I[a2.ordinal()]) {
            case 1: {
                return CLAMP;
            }
            case 2: {
                return REPEAT;
            }
            case 3: {
                return REPEAT_MIPMAP;
            }
        }
        return CLAMP;
    }

    public static UI[] values() {
        return (UI[])$VALUES.clone();
    }

    public int getMipmapLevel() {
        UI_1 a2;
        if (a2.hasMipmap()) {
            return Kpa.J().z.ea;
        }
        return uSa.E;
    }

    public static UI valueOf(String a2) {
        return Enum.valueOf(UI_1.class, a2);
    }

    static {
        REPEAT = new UI_1();
        REPEAT_MIPMAP = new UI_1();
        UI_1[] uI_1Array = new UI_1[yRa.d];
        uI_1Array[uSa.E] = CLAMP;
        uI_1Array[vRa.d] = REPEAT;
        uI_1Array[uqa.g] = REPEAT_MIPMAP;
        $VALUES = uI_1Array;
    }

    public boolean isRepeat() {
        UI_1 a2;
        if (a2 == REPEAT || a2 == REPEAT_MIPMAP) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasMipmap() {
        UI_1 a2;
        if (a2 == REPEAT_MIPMAP) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

