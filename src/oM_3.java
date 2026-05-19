/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  oM
 *  vRa
 */
public final class oM_3
extends Enum<oM> {
    private final int value;
    public static final /* enum */ oM COLORVAL_NOT_SET;
    public static final /* enum */ oM COLOR;
    public static final /* enum */ oM COLORANIM;
    private static final /* synthetic */ oM[] $VALUES;

    /*
     * Enabled aggressive block sorting
     */
    public static oM forNumber(int a2) {
        switch (a2) {
            case 9: {
                return COLOR;
            }
            case 10: {
                return COLORANIM;
            }
            case 0: {
                return COLORVAL_NOT_SET;
            }
        }
        return null;
    }

    public static oM valueOf(String a2) {
        return Enum.valueOf(oM_3.class, a2);
    }

    public int getNumber() {
        oM_3 a2;
        return a2.value;
    }

    public static oM[] values() {
        return (oM[])$VALUES.clone();
    }

    @Deprecated
    public static oM valueOf(int a2) {
        return oM_3.forNumber(a2);
    }

    static {
        COLOR = new oM_3(WOa.fa);
        COLORANIM = new oM_3(NTa.C);
        COLORVAL_NOT_SET = new oM_3(uSa.E);
        oM_3[] oM_3Array = new oM_3[yRa.d];
        oM_3Array[uSa.E] = COLOR;
        oM_3Array[vRa.d] = COLORANIM;
        oM_3Array[uqa.g] = COLORVAL_NOT_SET;
        $VALUES = oM_3Array;
    }

    private oM_3(int n3) {
        int b2 = n3;
        oM_3 a2 = this;
        a2.value = b2;
    }
}

