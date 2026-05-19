/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  Tpa
 *  pM
 *  vRa
 */
public final class pM_2
extends Enum<pM> {
    public static final /* enum */ pM XEXPR;
    public static final /* enum */ pM XVAL_NOT_SET;
    private static final /* synthetic */ pM[] $VALUES;
    private final int value;
    public static final /* enum */ pM XANIM;
    public static final /* enum */ pM XEXPRANIM;
    public static final /* enum */ pM X;

    static {
        X = new pM_2(tTa.h);
        XANIM = new pM_2(uua.p);
        XEXPR = new pM_2(Lra.e);
        XEXPRANIM = new pM_2(Tpa.z);
        XVAL_NOT_SET = new pM_2(uSa.E);
        pM_2[] pM_2Array = new pM_2[tTa.h];
        pM_2Array[uSa.E] = X;
        pM_2Array[vRa.d] = XANIM;
        pM_2Array[uqa.g] = XEXPR;
        pM_2Array[yRa.d] = XEXPRANIM;
        pM_2Array[AQa.P] = XVAL_NOT_SET;
        $VALUES = pM_2Array;
    }

    @Deprecated
    public static pM valueOf(int a2) {
        return pM_2.forNumber(a2);
    }

    private pM_2(int n3) {
        int b2 = n3;
        pM_2 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static pM forNumber(int a2) {
        switch (a2) {
            case 5: {
                return X;
            }
            case 6: {
                return XANIM;
            }
            case 27: {
                return XEXPR;
            }
            case 34: {
                return XEXPRANIM;
            }
            case 0: {
                return XVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        pM_2 a2;
        return a2.value;
    }

    public static pM[] values() {
        return (pM[])$VALUES.clone();
    }

    public static pM valueOf(String a2) {
        return Enum.valueOf(pM_2.class, a2);
    }
}

