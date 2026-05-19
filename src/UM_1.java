/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LQa
 *  UM
 *  Ypa
 *  vRa
 */
public final class UM_1
extends Enum<UM> {
    public static final /* enum */ UM SCALEXEXPR;
    public static final /* enum */ UM SCALEXEXPRANIM;
    public static final /* enum */ UM SCALEX;
    private static final /* synthetic */ UM[] $VALUES;
    public static final /* enum */ UM SCALEXVAL_NOT_SET;
    private final int value;
    public static final /* enum */ UM SCALEXANIM;

    public int getNumber() {
        UM_1 a2;
        return a2.value;
    }

    @Deprecated
    public static UM valueOf(int a2) {
        return UM_1.forNumber(a2);
    }

    private UM_1(int n3) {
        int b2 = n3;
        UM_1 a2 = this;
        a2.value = b2;
    }

    static {
        SCALEX = new UM_1(hpa.Z);
        SCALEXANIM = new UM_1(Ypa.A);
        SCALEXEXPR = new UM_1(Fsa.d);
        SCALEXEXPRANIM = new UM_1(LQa.c);
        SCALEXVAL_NOT_SET = new UM_1(uSa.E);
        UM_1[] uM_1Array = new UM_1[tTa.h];
        uM_1Array[uSa.E] = SCALEX;
        uM_1Array[vRa.d] = SCALEXANIM;
        uM_1Array[uqa.g] = SCALEXEXPR;
        uM_1Array[yRa.d] = SCALEXEXPRANIM;
        uM_1Array[AQa.P] = SCALEXVAL_NOT_SET;
        $VALUES = uM_1Array;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static UM forNumber(int a2) {
        switch (a2) {
            case 14: {
                return SCALEX;
            }
            case 15: {
                return SCALEXANIM;
            }
            case 30: {
                return SCALEXEXPR;
            }
            case 37: {
                return SCALEXEXPRANIM;
            }
            case 0: {
                return SCALEXVAL_NOT_SET;
            }
        }
        return null;
    }

    public static UM valueOf(String a2) {
        return Enum.valueOf(UM_1.class, a2);
    }

    public static UM[] values() {
        return (UM[])$VALUES.clone();
    }
}

