/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  ISa
 *  tn
 *  vRa
 */
public final class tn_2
extends Enum<tn> {
    private final int value;
    public static final /* enum */ tn SCALEYEXPRANIM;
    public static final /* enum */ tn SCALEYANIM;
    public static final /* enum */ tn SCALEY;
    public static final /* enum */ tn SCALEYVAL_NOT_SET;
    public static final /* enum */ tn SCALEYEXPR;
    private static final /* synthetic */ tn[] $VALUES;

    private tn_2(int n3) {
        int b2 = n3;
        tn_2 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static tn valueOf(int a2) {
        return tn_2.forNumber(a2);
    }

    public static tn[] values() {
        return (tn[])$VALUES.clone();
    }

    static {
        SCALEY = new tn_2(ERa.C);
        SCALEYANIM = new tn_2(yta.Ka);
        SCALEYEXPR = new tn_2(tua.U);
        SCALEYEXPRANIM = new tn_2(ISa.E);
        SCALEYVAL_NOT_SET = new tn_2(uSa.E);
        tn_2[] tn_2Array = new tn_2[tTa.h];
        tn_2Array[uSa.E] = SCALEY;
        tn_2Array[vRa.d] = SCALEYANIM;
        tn_2Array[uqa.g] = SCALEYEXPR;
        tn_2Array[yRa.d] = SCALEYEXPRANIM;
        tn_2Array[AQa.P] = SCALEYVAL_NOT_SET;
        $VALUES = tn_2Array;
    }

    public static tn valueOf(String a2) {
        return Enum.valueOf(tn_2.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static tn forNumber(int a2) {
        switch (a2) {
            case 16: {
                return SCALEY;
            }
            case 17: {
                return SCALEYANIM;
            }
            case 31: {
                return SCALEYEXPR;
            }
            case 38: {
                return SCALEYEXPRANIM;
            }
            case 0: {
                return SCALEYVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        tn_2 a2;
        return a2.value;
    }
}

