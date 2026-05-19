/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ysa
 *  bz
 *  uQa
 *  vRa
 */
public final class bz_1
extends Enum<bz> {
    public static final /* enum */ bz ANY_VALUE = new bz_1(uQa.P, uSa.E);
    private static final String __OBFID = "CL_00002151";
    public static final /* enum */ bz NUMERICAL_VALUE;
    private static final bz[] $VALUES;
    public static final /* enum */ bz BOOLEAN_VALUE;
    private static final /* synthetic */ bz[] $VALUES$;

    static {
        BOOLEAN_VALUE = new bz_1(Ysa.C, vRa.d);
        NUMERICAL_VALUE = new bz_1(wta.Aa, uqa.g);
        bz_1[] bz_1Array = new bz_1[yRa.d];
        bz_1Array[uSa.E] = ANY_VALUE;
        bz_1Array[vRa.d] = BOOLEAN_VALUE;
        bz_1Array[uqa.g] = NUMERICAL_VALUE;
        $VALUES$ = bz_1Array;
        bz_1[] bz_1Array2 = new bz_1[yRa.d];
        bz_1Array2[uSa.E] = ANY_VALUE;
        bz_1Array2[vRa.d] = BOOLEAN_VALUE;
        bz_1Array2[uqa.g] = NUMERICAL_VALUE;
        $VALUES = bz_1Array2;
    }

    public static bz valueOf(String a2) {
        return Enum.valueOf(bz_1.class, a2);
    }

    private bz_1(String string2, int n3) {
        int c2 = n2;
        bz_1 bz_12 = this;
    }

    public static bz[] values() {
        return (bz[])$VALUES$.clone();
    }
}

