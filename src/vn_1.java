/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  vn
 */
public final class vn_1
extends Enum<vn> {
    private static final /* synthetic */ vn[] $VALUES;
    private final int value;
    public static final /* enum */ vn DATA_NOT_SET;
    public static final /* enum */ vn MESSAGE;
    public static final /* enum */ vn URL;
    public static final /* enum */ vn CALLBACK;

    public static vn[] values() {
        return (vn[])$VALUES.clone();
    }

    public int getNumber() {
        vn_1 a2;
        return a2.value;
    }

    static {
        URL = new vn_1(uqa.g);
        MESSAGE = new vn_1(yRa.d);
        CALLBACK = new vn_1(AQa.P);
        DATA_NOT_SET = new vn_1(uSa.E);
        vn_1[] vn_1Array = new vn_1[AQa.P];
        vn_1Array[uSa.E] = URL;
        vn_1Array[vRa.d] = MESSAGE;
        vn_1Array[uqa.g] = CALLBACK;
        vn_1Array[yRa.d] = DATA_NOT_SET;
        $VALUES = vn_1Array;
    }

    @Deprecated
    public static vn valueOf(int a2) {
        return vn_1.forNumber(a2);
    }

    private vn_1(int n3) {
        int b2 = n3;
        vn_1 a2 = this;
        a2.value = b2;
    }

    public static vn valueOf(String a2) {
        return Enum.valueOf(vn_1.class, a2);
    }

    public static vn forNumber(int a2) {
        switch (a2) {
            case 2: {
                return URL;
            }
            case 3: {
                return MESSAGE;
            }
            case 4: {
                return CALLBACK;
            }
            case 0: {
                while (false) {
                }
                return DATA_NOT_SET;
            }
        }
        return null;
    }
}

