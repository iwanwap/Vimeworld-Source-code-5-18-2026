/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class wN
extends Enum<wN> {
    public static final /* enum */ wN HOVERCOLORVAL_NOT_SET;
    public static final /* enum */ wN HOVERCOLORANIM;
    private final int value;
    public static final /* enum */ wN HOVERCOLOR;
    private static final /* synthetic */ wN[] $VALUES;

    public static wN forNumber(int a2) {
        switch (a2) {
            case 2: {
                return HOVERCOLOR;
            }
            case 3: {
                return HOVERCOLORANIM;
            }
            case 0: {
                while (false) {
                }
                return HOVERCOLORVAL_NOT_SET;
            }
        }
        return null;
    }

    static {
        HOVERCOLOR = new wN(uqa.g);
        HOVERCOLORANIM = new wN(yRa.d);
        HOVERCOLORVAL_NOT_SET = new wN(uSa.E);
        wN[] wNArray = new wN[yRa.d];
        wNArray[uSa.E] = HOVERCOLOR;
        wNArray[vRa.d] = HOVERCOLORANIM;
        wNArray[uqa.g] = HOVERCOLORVAL_NOT_SET;
        $VALUES = wNArray;
    }

    public static wN valueOf(String a2) {
        return Enum.valueOf(wN.class, a2);
    }

    private wN(int n3) {
        int b2 = n3;
        wN a2 = this;
        a2.value = b2;
    }

    public int getNumber() {
        wN a2;
        return a2.value;
    }

    public static wN[] values() {
        return (wN[])$VALUES.clone();
    }

    @Deprecated
    public static wN valueOf(int a2) {
        return wN.forNumber(a2);
    }
}

