/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cQa
 *  vRa
 *  wOa
 */
public final class wJ
extends Enum<wJ> {
    public static final /* enum */ wJ SCALEYANIM;
    private static final /* synthetic */ wJ[] $VALUES;
    public static final /* enum */ wJ SCALEYVAL_NOT_SET;
    public static final /* enum */ wJ SCALEY;
    private final int value;

    public static wJ valueOf(String a2) {
        return Enum.valueOf(wJ.class, a2);
    }

    public int getNumber() {
        wJ a2;
        return a2.value;
    }

    static {
        SCALEY = new wJ(wOa.h);
        SCALEYANIM = new wJ(cQa.o);
        SCALEYVAL_NOT_SET = new wJ(uSa.E);
        wJ[] wJArray = new wJ[yRa.d];
        wJArray[uSa.E] = SCALEY;
        wJArray[vRa.d] = SCALEYANIM;
        wJArray[uqa.g] = SCALEYVAL_NOT_SET;
        $VALUES = wJArray;
    }

    public static wJ[] values() {
        return (wJ[])$VALUES.clone();
    }

    private wJ(int n3) {
        int b2 = n3;
        wJ a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static wJ forNumber(int a2) {
        switch (a2) {
            case 21: {
                return SCALEY;
            }
            case 22: {
                return SCALEYANIM;
            }
            case 0: {
                return SCALEYVAL_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static wJ valueOf(int a2) {
        return wJ.forNumber(a2);
    }
}

