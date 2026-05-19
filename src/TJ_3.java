/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TJ
 *  vRa
 */
public final class TJ_3
extends Enum<TJ> {
    public static final /* enum */ TJ SCALEANIM;
    private static final /* synthetic */ TJ[] $VALUES;
    public static final /* enum */ TJ SCALE;
    private final int value;
    public static final /* enum */ TJ SCALEVAL_NOT_SET;

    public static TJ valueOf(String a2) {
        return Enum.valueOf(TJ_3.class, a2);
    }

    static {
        SCALE = new TJ_3(yta.Ka);
        SCALEANIM = new TJ_3(yOa.B);
        SCALEVAL_NOT_SET = new TJ_3(uSa.E);
        TJ_3[] tJ_3Array = new TJ_3[yRa.d];
        tJ_3Array[uSa.E] = SCALE;
        tJ_3Array[vRa.d] = SCALEANIM;
        tJ_3Array[uqa.g] = SCALEVAL_NOT_SET;
        $VALUES = tJ_3Array;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static TJ forNumber(int a2) {
        switch (a2) {
            case 17: {
                return SCALE;
            }
            case 18: {
                return SCALEANIM;
            }
            case 0: {
                return SCALEVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        TJ_3 a2;
        return a2.value;
    }

    @Deprecated
    public static TJ valueOf(int a2) {
        return TJ_3.forNumber(a2);
    }

    private TJ_3(int n3) {
        int b2 = n3;
        TJ_3 a2 = this;
        a2.value = b2;
    }

    public static TJ[] values() {
        return (TJ[])$VALUES.clone();
    }
}

