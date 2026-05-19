/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OH
 *  lqa
 *  mka
 *  vRa
 */
public final class OH_3
extends Enum<OH> {
    public final gC element;
    public static final /* enum */ OH LIGHT_DYNAMIC_BLOCKSKY;
    public static final /* enum */ OH POSITION_3F;
    public static final /* enum */ OH PADDING_1B;
    private static final /* synthetic */ OH[] $VALUES;
    public static final /* enum */ OH NORMAL_3B;
    public final int inputSize;
    public static final /* enum */ OH COLOR_4UB;

    public static OH valueOf(String a2) {
        return Enum.valueOf(OH_3.class, a2);
    }

    static {
        POSITION_3F = new OH_3(mka.C, lqa.s);
        COLOR_4UB = new OH_3(mka.d, AQa.P);
        NORMAL_3B = new OH_3(mka.k, yRa.d);
        PADDING_1B = new OH_3(mka.G, vRa.d);
        LIGHT_DYNAMIC_BLOCKSKY = new OH_3(mka.e, uSa.E);
        OH_3[] oH_3Array = new OH_3[tTa.h];
        oH_3Array[uSa.E] = POSITION_3F;
        oH_3Array[vRa.d] = COLOR_4UB;
        oH_3Array[uqa.g] = NORMAL_3B;
        oH_3Array[yRa.d] = PADDING_1B;
        oH_3Array[AQa.P] = LIGHT_DYNAMIC_BLOCKSKY;
        $VALUES = oH_3Array;
    }

    /*
     * WARNING - void declaration
     */
    private OH_3(gC gC2, int n3) {
        void c2;
        void b2;
        OH_3 a2;
        int n4 = n3;
        OH_3 oH_3 = a2 = this;
        oH_3.element = b2;
        oH_3.inputSize = c2;
    }

    public static OH[] values() {
        return (OH[])$VALUES.clone();
    }
}

