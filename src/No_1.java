/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  No
 *  lqa
 *  vRa
 */
public final class No_1
extends Enum<No> {
    public static final /* enum */ No HEIGHTANIM;
    private final int value;
    public static final /* enum */ No HEIGHTEXPRANIM;
    private static final /* synthetic */ No[] $VALUES;
    public static final /* enum */ No HEIGHT;
    public static final /* enum */ No HEIGHTEXPR;
    public static final /* enum */ No HEIGHTVAL_NOT_SET;

    @Deprecated
    public static No valueOf(int a2) {
        return No_1.forNumber(a2);
    }

    public int getNumber() {
        No_1 a2;
        return a2.value;
    }

    public static No[] values() {
        return (No[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static No forNumber(int a2) {
        switch (a2) {
            case 3: {
                return HEIGHT;
            }
            case 4: {
                return HEIGHTANIM;
            }
            case 8: {
                return HEIGHTEXPR;
            }
            case 12: {
                return HEIGHTEXPRANIM;
            }
            case 0: {
                return HEIGHTVAL_NOT_SET;
            }
        }
        return null;
    }

    static {
        HEIGHT = new No_1(yRa.d);
        HEIGHTANIM = new No_1(AQa.P);
        HEIGHTEXPR = new No_1(Yqa.i);
        HEIGHTEXPRANIM = new No_1(lqa.s);
        HEIGHTVAL_NOT_SET = new No_1(uSa.E);
        No_1[] no_1Array = new No_1[tTa.h];
        no_1Array[uSa.E] = HEIGHT;
        no_1Array[vRa.d] = HEIGHTANIM;
        no_1Array[uqa.g] = HEIGHTEXPR;
        no_1Array[yRa.d] = HEIGHTEXPRANIM;
        no_1Array[AQa.P] = HEIGHTVAL_NOT_SET;
        $VALUES = no_1Array;
    }

    private No_1(int n3) {
        int b2 = n3;
        No_1 a2 = this;
        a2.value = b2;
    }

    public static No valueOf(String a2) {
        return Enum.valueOf(No_1.class, a2);
    }
}

