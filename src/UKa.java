/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cQa
 *  vRa
 */
public final class UKa
extends Enum<UKa> {
    private static final UKa[] field_178199_k;
    private static final /* synthetic */ UKa[] $VALUES;
    public static final /* enum */ UKa WEST;
    private final int field_178201_i;
    private final int field_178191_g;
    private static final String __OBFID = "CL_00002514";
    private final int field_178200_h;
    public static final /* enum */ UKa SOUTH;
    public static final /* enum */ UKa DOWN;
    public static final /* enum */ UKa UP;
    public static final /* enum */ UKa EAST;
    public static final /* enum */ UKa NORTH;
    private final int field_178198_j;

    public static /* synthetic */ int access$200(UKa a2) {
        return a2.field_178191_g;
    }

    public static UKa getVertexTranslations(DZ a2) {
        return field_178199_k[a2.getIndex()];
    }

    public static /* synthetic */ int access$400(UKa a2) {
        return a2.field_178201_i;
    }

    public static UKa valueOf(String a2) {
        return Enum.valueOf(UKa.class, a2);
    }

    public static /* synthetic */ int access$500(UKa a2) {
        return a2.field_178198_j;
    }

    public static UKa[] values() {
        return (UKa[])$VALUES.clone();
    }

    public static /* synthetic */ int access$300(UKa a2) {
        return a2.field_178200_h;
    }

    static {
        DOWN = new UKa(Npa.ca, uSa.E, uSa.E, vRa.d, uqa.g, yRa.d);
        UP = new UKa(hQa.ca, vRa.d, uqa.g, yRa.d, uSa.E, vRa.d);
        NORTH = new UKa(aua.E, uqa.g, yRa.d, uSa.E, vRa.d, uqa.g);
        SOUTH = new UKa(hpa.a, yRa.d, uSa.E, vRa.d, uqa.g, yRa.d);
        WEST = new UKa(sra.t, AQa.P, yRa.d, uSa.E, vRa.d, uqa.g);
        EAST = new UKa(cQa.ca, tTa.h, vRa.d, uqa.g, yRa.d, uSa.E);
        UKa[] uKaArray = new UKa[uua.p];
        uKaArray[uSa.E] = DOWN;
        uKaArray[vRa.d] = UP;
        uKaArray[uqa.g] = NORTH;
        uKaArray[yRa.d] = SOUTH;
        uKaArray[AQa.P] = WEST;
        uKaArray[tTa.h] = EAST;
        $VALUES = uKaArray;
        field_178199_k = new UKa[uua.p];
        UKa.field_178199_k[DZ.DOWN.getIndex()] = DOWN;
        UKa.field_178199_k[DZ.UP.getIndex()] = UP;
        UKa.field_178199_k[DZ.NORTH.getIndex()] = NORTH;
        UKa.field_178199_k[DZ.SOUTH.getIndex()] = SOUTH;
        UKa.field_178199_k[DZ.WEST.getIndex()] = WEST;
        UKa.field_178199_k[DZ.EAST.getIndex()] = EAST;
    }

    /*
     * WARNING - void declaration
     */
    private UKa(String string2, int n3, int n4, int n5, int n6, int n7) {
        void g;
        void b2;
        void c2;
        void d2;
        UKa a2;
        int n8 = n7;
        UKa uKa2 = a2 = this;
        UKa uKa3 = a2;
        uKa3.field_178191_g = d2;
        uKa3.field_178200_h = c2;
        uKa2.field_178201_i = b2;
        uKa2.field_178198_j = g;
    }
}

