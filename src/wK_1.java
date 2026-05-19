/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ypa
 *  vRa
 *  wK
 */
public final class wK_1
extends Enum<wK> {
    private static final /* synthetic */ wK[] $VALUES;
    private final int value;
    public static final /* enum */ wK ANGLEZANIMSMART;
    public static final /* enum */ wK ANGLEZANIM;
    public static final /* enum */ wK ANGLEZVAL_NOT_SET;
    public static final /* enum */ wK ANGLEZ;

    public static wK valueOf(String a2) {
        return Enum.valueOf(wK_1.class, a2);
    }

    public static wK[] values() {
        return (wK[])$VALUES.clone();
    }

    static {
        ANGLEZ = new wK_1(hpa.Z);
        ANGLEZANIM = new wK_1(Ypa.A);
        ANGLEZANIMSMART = new wK_1(ERa.C);
        ANGLEZVAL_NOT_SET = new wK_1(uSa.E);
        wK_1[] wK_1Array = new wK_1[AQa.P];
        wK_1Array[uSa.E] = ANGLEZ;
        wK_1Array[vRa.d] = ANGLEZANIM;
        wK_1Array[uqa.g] = ANGLEZANIMSMART;
        wK_1Array[yRa.d] = ANGLEZVAL_NOT_SET;
        $VALUES = wK_1Array;
    }

    @Deprecated
    public static wK valueOf(int a2) {
        return wK_1.forNumber(a2);
    }

    public int getNumber() {
        wK_1 a2;
        return a2.value;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static wK forNumber(int a2) {
        switch (a2) {
            case 14: {
                return ANGLEZ;
            }
            case 15: {
                return ANGLEZANIM;
            }
            case 16: {
                return ANGLEZANIMSMART;
            }
            case 0: {
                return ANGLEZVAL_NOT_SET;
            }
        }
        return null;
    }

    private wK_1(int n3) {
        int b2 = n3;
        wK_1 a2 = this;
        a2.value = b2;
    }
}

