/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dM
 *  vRa
 */
public final class dM_1
extends Enum<dM> {
    private static final /* synthetic */ dM[] $VALUES;
    private final int value;
    public static final /* enum */ dM ERRORTYPE = new dM_1(uqa.g);
    public static final /* enum */ dM SUCCESS = new dM_1(yRa.d);
    public static final /* enum */ dM RESULT_NOT_SET = new dM_1(uSa.E);

    static {
        dM_1[] dM_1Array = new dM_1[yRa.d];
        dM_1Array[uSa.E] = ERRORTYPE;
        dM_1Array[vRa.d] = SUCCESS;
        dM_1Array[uqa.g] = RESULT_NOT_SET;
        $VALUES = dM_1Array;
    }

    public static dM forNumber(int a2) {
        switch (a2) {
            case 2: {
                return ERRORTYPE;
            }
            case 3: {
                return SUCCESS;
            }
            case 0: {
                while (false) {
                }
                return RESULT_NOT_SET;
            }
        }
        return null;
    }

    private dM_1(int n3) {
        int b2 = n3;
        dM_1 a2 = this;
        a2.value = b2;
    }

    public int getNumber() {
        dM_1 a2;
        return a2.value;
    }

    @Deprecated
    public static dM valueOf(int a2) {
        return dM_1.forNumber(a2);
    }

    public static dM[] values() {
        return (dM[])$VALUES.clone();
    }

    public static dM valueOf(String a2) {
        return Enum.valueOf(dM_1.class, a2);
    }
}

