/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oJ
 *  vRa
 *  wOa
 */
public final class oJ_3
extends Enum<oJ> {
    public static final /* enum */ oJ SCALEX = new oJ_3(wOa.t);
    public static final /* enum */ oJ SCALEXANIM = new oJ_3(kTa.j);
    public static final /* enum */ oJ SCALEXVAL_NOT_SET = new oJ_3(uSa.E);
    private final int value;
    private static final /* synthetic */ oJ[] $VALUES;

    private oJ_3(int n3) {
        int b2 = n3;
        oJ_3 a2 = this;
        a2.value = b2;
    }

    public static oJ[] values() {
        return (oJ[])$VALUES.clone();
    }

    public int getNumber() {
        oJ_3 a2;
        return a2.value;
    }

    @Deprecated
    public static oJ valueOf(int a2) {
        return oJ_3.forNumber(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static oJ forNumber(int a2) {
        switch (a2) {
            case 19: {
                return SCALEX;
            }
            case 20: {
                return SCALEXANIM;
            }
            case 0: {
                return SCALEXVAL_NOT_SET;
            }
        }
        return null;
    }

    public static oJ valueOf(String a2) {
        return Enum.valueOf(oJ_3.class, a2);
    }

    static {
        oJ_3[] oJ_3Array = new oJ_3[yRa.d];
        oJ_3Array[uSa.E] = SCALEX;
        oJ_3Array[vRa.d] = SCALEXANIM;
        oJ_3Array[uqa.g] = SCALEXVAL_NOT_SET;
        $VALUES = oJ_3Array;
    }
}

