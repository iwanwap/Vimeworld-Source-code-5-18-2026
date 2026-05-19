/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DL
 *  vRa
 */
public final class DL_1
extends Enum<DL> {
    public static final /* enum */ DL ZANIM;
    public static final /* enum */ DL ZVAL_NOT_SET;
    public static final /* enum */ DL Z;
    private static final /* synthetic */ DL[] $VALUES;
    private final int value;

    public static DL[] values() {
        return (DL[])$VALUES.clone();
    }

    @Deprecated
    public static DL valueOf(int a2) {
        return DL_1.forNumber(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DL forNumber(int a2) {
        switch (a2) {
            case 5: {
                return Z;
            }
            case 6: {
                return ZANIM;
            }
            case 0: {
                return ZVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        DL_1 a2;
        return a2.value;
    }

    static {
        Z = new DL_1(tTa.h);
        ZANIM = new DL_1(uua.p);
        ZVAL_NOT_SET = new DL_1(uSa.E);
        DL_1[] dL_1Array = new DL_1[yRa.d];
        dL_1Array[uSa.E] = Z;
        dL_1Array[vRa.d] = ZANIM;
        dL_1Array[uqa.g] = ZVAL_NOT_SET;
        $VALUES = dL_1Array;
    }

    public static DL valueOf(String a2) {
        return Enum.valueOf(DL_1.class, a2);
    }

    private DL_1(int n3) {
        int b2 = n3;
        DL_1 a2 = this;
        a2.value = b2;
    }
}

