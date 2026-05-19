/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  pPa
 *  vRa
 */
public final class YN
extends Enum<YN> {
    public static final /* enum */ YN WIDTHANIM;
    private final int value;
    public static final /* enum */ YN WIDTH;
    public static final /* enum */ YN WIDTHEXPRANIM;
    public static final /* enum */ YN WIDTHVAL_NOT_SET;
    private static final /* synthetic */ YN[] $VALUES;
    public static final /* enum */ YN WIDTHEXPR;

    /*
     * Enabled aggressive block sorting
     */
    public static YN forNumber(int a2) {
        switch (a2) {
            case 1: {
                return WIDTH;
            }
            case 2: {
                return WIDTHANIM;
            }
            case 7: {
                return WIDTHEXPR;
            }
            case 11: {
                return WIDTHEXPRANIM;
            }
            case 0: {
                return WIDTHVAL_NOT_SET;
            }
        }
        return null;
    }

    private YN(int n3) {
        int b2 = n3;
        YN a2 = this;
        a2.value = b2;
    }

    public int getNumber() {
        YN a2;
        return a2.value;
    }

    public static YN[] values() {
        return (YN[])$VALUES.clone();
    }

    @Deprecated
    public static YN valueOf(int a2) {
        return YN.forNumber(a2);
    }

    public static YN valueOf(String a2) {
        return Enum.valueOf(YN.class, a2);
    }

    static {
        WIDTH = new YN(vRa.d);
        WIDTHANIM = new YN(uqa.g);
        WIDTHEXPR = new YN(XTa.W);
        WIDTHEXPRANIM = new YN(pPa.f);
        WIDTHVAL_NOT_SET = new YN(uSa.E);
        YN[] yNArray = new YN[tTa.h];
        yNArray[uSa.E] = WIDTH;
        yNArray[vRa.d] = WIDTHANIM;
        yNArray[uqa.g] = WIDTHEXPR;
        yNArray[yRa.d] = WIDTHEXPRANIM;
        yNArray[AQa.P] = WIDTHVAL_NOT_SET;
        $VALUES = yNArray;
    }
}

