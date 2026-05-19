/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OJ
 *  vRa
 */
public final class OJ_2
extends Enum<OJ> {
    public static final /* enum */ OJ YVAL_NOT_SET;
    private static final /* synthetic */ OJ[] $VALUES;
    public static final /* enum */ OJ YANIM;
    public static final /* enum */ OJ Y;
    private final int value;

    private OJ_2(int n3) {
        int b2 = n3;
        OJ_2 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static OJ valueOf(int a2) {
        return OJ_2.forNumber(a2);
    }

    public static OJ forNumber(int a2) {
        switch (a2) {
            case 3: {
                return Y;
            }
            case 4: {
                return YANIM;
            }
            case 0: {
                while (false) {
                }
                return YVAL_NOT_SET;
            }
        }
        return null;
    }

    public static OJ[] values() {
        return (OJ[])$VALUES.clone();
    }

    public int getNumber() {
        OJ_2 a2;
        return a2.value;
    }

    public static OJ valueOf(String a2) {
        return Enum.valueOf(OJ_2.class, a2);
    }

    static {
        Y = new OJ_2(yRa.d);
        YANIM = new OJ_2(AQa.P);
        YVAL_NOT_SET = new OJ_2(uSa.E);
        OJ_2[] oJ_2Array = new OJ_2[yRa.d];
        oJ_2Array[uSa.E] = Y;
        oJ_2Array[vRa.d] = YANIM;
        oJ_2Array[uqa.g] = YVAL_NOT_SET;
        $VALUES = oJ_2Array;
    }
}

