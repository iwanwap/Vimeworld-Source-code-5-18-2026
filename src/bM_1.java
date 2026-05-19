/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bM
 *  vRa
 */
public final class bM_1
extends Enum<bM> {
    public static final /* enum */ bM RESOURCE;
    private static final /* synthetic */ bM[] $VALUES;
    public static final /* enum */ bM PATH;
    public static final /* enum */ bM FONT_NOT_SET;
    private final int value;

    public int getNumber() {
        bM_1 a2;
        return a2.value;
    }

    static {
        PATH = new bM_1(vRa.d);
        RESOURCE = new bM_1(uqa.g);
        FONT_NOT_SET = new bM_1(uSa.E);
        bM_1[] bM_1Array = new bM_1[yRa.d];
        bM_1Array[uSa.E] = PATH;
        bM_1Array[vRa.d] = RESOURCE;
        bM_1Array[uqa.g] = FONT_NOT_SET;
        $VALUES = bM_1Array;
    }

    public static bM[] values() {
        return (bM[])$VALUES.clone();
    }

    @Deprecated
    public static bM valueOf(int a2) {
        return bM_1.forNumber(a2);
    }

    public static bM valueOf(String a2) {
        return Enum.valueOf(bM_1.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bM forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PATH;
            }
            case 2: {
                return RESOURCE;
            }
            case 0: {
                return FONT_NOT_SET;
            }
        }
        return null;
    }

    private bM_1(int n3) {
        int b2 = n3;
        bM_1 a2 = this;
        a2.value = b2;
    }
}

