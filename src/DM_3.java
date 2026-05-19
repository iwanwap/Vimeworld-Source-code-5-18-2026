/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DM
 *  vRa
 */
public final class DM_3
extends Enum<DM> {
    private static final /* synthetic */ DM[] $VALUES;
    public static final /* enum */ DM SIZEEXPR;
    public static final /* enum */ DM SIZEANIM;
    public static final /* enum */ DM SIZEVAL_NOT_SET;
    private final int value;
    public static final /* enum */ DM SIZEEXPRANIM;
    public static final /* enum */ DM SIZE;

    static {
        SIZE = new DM_3(uqa.g);
        SIZEANIM = new DM_3(yRa.d);
        SIZEEXPR = new DM_3(AQa.P);
        SIZEEXPRANIM = new DM_3(tTa.h);
        SIZEVAL_NOT_SET = new DM_3(uSa.E);
        DM_3[] dM_3Array = new DM_3[tTa.h];
        dM_3Array[uSa.E] = SIZE;
        dM_3Array[vRa.d] = SIZEANIM;
        dM_3Array[uqa.g] = SIZEEXPR;
        dM_3Array[yRa.d] = SIZEEXPRANIM;
        dM_3Array[AQa.P] = SIZEVAL_NOT_SET;
        $VALUES = dM_3Array;
    }

    public static DM valueOf(String a2) {
        return Enum.valueOf(DM_3.class, a2);
    }

    private DM_3(int n3) {
        int b2 = n3;
        DM_3 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static DM valueOf(int a2) {
        return DM_3.forNumber(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DM forNumber(int a2) {
        switch (a2) {
            case 2: {
                return SIZE;
            }
            case 3: {
                return SIZEANIM;
            }
            case 4: {
                return SIZEEXPR;
            }
            case 5: {
                return SIZEEXPRANIM;
            }
            case 0: {
                return SIZEVAL_NOT_SET;
            }
        }
        return null;
    }

    public static DM[] values() {
        return (DM[])$VALUES.clone();
    }

    public int getNumber() {
        DM_3 a2;
        return a2.value;
    }
}

