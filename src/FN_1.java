/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FN
 *  vRa
 */
public final class FN_1
extends Enum<FN> {
    private final int value;
    public static final /* enum */ FN WIDTH = new FN_1(uqa.g);
    public static final /* enum */ FN WIDTHVAL_NOT_SET;
    private static final /* synthetic */ FN[] $VALUES;
    public static final /* enum */ FN WIDTHANIM;

    private FN_1(int n3) {
        int b2 = n3;
        FN_1 a2 = this;
        a2.value = b2;
    }

    public static FN valueOf(String a2) {
        return Enum.valueOf(FN_1.class, a2);
    }

    public static FN forNumber(int a2) {
        switch (a2) {
            case 2: {
                return WIDTH;
            }
            case 3: {
                return WIDTHANIM;
            }
            case 0: {
                while (false) {
                }
                return WIDTHVAL_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static FN valueOf(int a2) {
        return FN_1.forNumber(a2);
    }

    public static FN[] values() {
        return (FN[])$VALUES.clone();
    }

    static {
        WIDTHANIM = new FN_1(yRa.d);
        WIDTHVAL_NOT_SET = new FN_1(uSa.E);
        FN_1[] fN_1Array = new FN_1[yRa.d];
        fN_1Array[uSa.E] = WIDTH;
        fN_1Array[vRa.d] = WIDTHANIM;
        fN_1Array[uqa.g] = WIDTHVAL_NOT_SET;
        $VALUES = fN_1Array;
    }

    public int getNumber() {
        FN_1 a2;
        return a2.value;
    }
}

