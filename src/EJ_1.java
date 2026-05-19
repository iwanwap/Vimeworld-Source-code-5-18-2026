/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EJ
 *  lqa
 *  pPa
 *  vRa
 */
public final class EJ_1
extends Enum<EJ> {
    public static final /* enum */ EJ ANGLEYVAL_NOT_SET;
    private static final /* synthetic */ EJ[] $VALUES;
    public static final /* enum */ EJ ANGLEY;
    public static final /* enum */ EJ ANGLEYANIM;
    public static final /* enum */ EJ ANGLEYANIMSMART;
    private final int value;

    /*
     * Enabled aggressive block sorting
     */
    public static EJ forNumber(int a2) {
        switch (a2) {
            case 11: {
                return ANGLEY;
            }
            case 12: {
                return ANGLEYANIM;
            }
            case 13: {
                return ANGLEYANIMSMART;
            }
            case 0: {
                return ANGLEYVAL_NOT_SET;
            }
        }
        return null;
    }

    public static EJ[] values() {
        return (EJ[])$VALUES.clone();
    }

    private EJ_1(int n3) {
        int b2 = n3;
        EJ_1 a2 = this;
        a2.value = b2;
    }

    public static EJ valueOf(String a2) {
        return Enum.valueOf(EJ_1.class, a2);
    }

    static {
        ANGLEY = new EJ_1(pPa.f);
        ANGLEYANIM = new EJ_1(lqa.s);
        ANGLEYANIMSMART = new EJ_1(uua.s);
        ANGLEYVAL_NOT_SET = new EJ_1(uSa.E);
        EJ_1[] eJ_1Array = new EJ_1[AQa.P];
        eJ_1Array[uSa.E] = ANGLEY;
        eJ_1Array[vRa.d] = ANGLEYANIM;
        eJ_1Array[uqa.g] = ANGLEYANIMSMART;
        eJ_1Array[yRa.d] = ANGLEYVAL_NOT_SET;
        $VALUES = eJ_1Array;
    }

    public int getNumber() {
        EJ_1 a2;
        return a2.value;
    }

    @Deprecated
    public static EJ valueOf(int a2) {
        return EJ_1.forNumber(a2);
    }
}

