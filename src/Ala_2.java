/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ala
 *  MQa
 *  XTa
 *  cQa
 *  ika
 *  pqa
 *  vRa
 */
public final class Ala_2
extends Enum<Ala> {
    public final ika[] field_178287_k;
    public static final /* enum */ Ala UP;
    private static final /* synthetic */ Ala[] $VALUES;
    public final float field_178288_h;
    public final DZ[] field_178276_g;
    public static final /* enum */ Ala WEST;
    public final ika[] field_178284_l;
    public final boolean field_178289_i;
    public static final /* enum */ Ala DOWN;
    public static final /* enum */ Ala SOUTH;
    public static final /* enum */ Ala EAST;
    public final ika[] field_178285_m;
    public static final /* enum */ Ala NORTH;
    private static final Ala[] field_178282_n;
    public final ika[] field_178286_j;

    public static Ala[] values() {
        return (Ala[])$VALUES.clone();
    }

    public static Ala valueOf(String a2) {
        return Enum.valueOf(Ala_2.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private Ala_2(String string2, int n3, DZ[] dZArray, float f2, boolean bl, ika[] ikaArray, ika[] ikaArray2, ika[] ikaArray3, ika[] ikaArray4) {
        ika[] j2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f3;
        void g2;
        ika[] ikaArray5 = ikaArray6;
        ika[] ikaArray6 = ikaArray4;
        ika[] a2 = ikaArray5;
        a2.field_178276_g = g2;
        a2.field_178288_h = f3;
        a2.field_178289_i = e2;
        a2.field_178286_j = d2;
        a2.field_178287_k = c2;
        a2.field_178284_l = b2;
        a2.field_178285_m = j2;
    }

    static {
        DZ[] dZArray = new DZ[AQa.P];
        dZArray[uSa.E] = DZ.WEST;
        dZArray[vRa.d] = DZ.EAST;
        dZArray[uqa.g] = DZ.NORTH;
        dZArray[yRa.d] = DZ.SOUTH;
        ika[] ikaArray = new ika[Yqa.i];
        ikaArray[uSa.E] = ika.FLIP_WEST;
        ikaArray[vRa.d] = ika.SOUTH;
        ikaArray[uqa.g] = ika.FLIP_WEST;
        ikaArray[yRa.d] = ika.FLIP_SOUTH;
        ikaArray[AQa.P] = ika.WEST;
        ikaArray[tTa.h] = ika.FLIP_SOUTH;
        ikaArray[uua.p] = ika.WEST;
        ikaArray[XTa.W] = ika.SOUTH;
        ika[] ikaArray2 = new ika[Yqa.i];
        ikaArray2[uSa.E] = ika.FLIP_WEST;
        ikaArray2[vRa.d] = ika.NORTH;
        ikaArray2[uqa.g] = ika.FLIP_WEST;
        ikaArray2[yRa.d] = ika.FLIP_NORTH;
        ikaArray2[AQa.P] = ika.WEST;
        ikaArray2[tTa.h] = ika.FLIP_NORTH;
        ikaArray2[uua.p] = ika.WEST;
        ikaArray2[XTa.W] = ika.NORTH;
        ika[] ikaArray3 = new ika[Yqa.i];
        ikaArray3[uSa.E] = ika.FLIP_EAST;
        ikaArray3[vRa.d] = ika.NORTH;
        ikaArray3[uqa.g] = ika.FLIP_EAST;
        ikaArray3[yRa.d] = ika.FLIP_NORTH;
        ikaArray3[AQa.P] = ika.EAST;
        ikaArray3[tTa.h] = ika.FLIP_NORTH;
        ikaArray3[uua.p] = ika.EAST;
        ikaArray3[XTa.W] = ika.NORTH;
        ika[] ikaArray4 = new ika[Yqa.i];
        ikaArray4[uSa.E] = ika.FLIP_EAST;
        ikaArray4[vRa.d] = ika.SOUTH;
        ikaArray4[uqa.g] = ika.FLIP_EAST;
        ikaArray4[yRa.d] = ika.FLIP_SOUTH;
        ikaArray4[AQa.P] = ika.EAST;
        ikaArray4[tTa.h] = ika.FLIP_SOUTH;
        ikaArray4[uua.p] = ika.EAST;
        ikaArray4[XTa.W] = ika.SOUTH;
        DOWN = new Ala_2(Npa.ca, uSa.E, dZArray, MQa.L, vRa.d != 0, ikaArray, ikaArray2, ikaArray3, ikaArray4);
        DZ[] dZArray2 = new DZ[AQa.P];
        dZArray2[uSa.E] = DZ.EAST;
        dZArray2[vRa.d] = DZ.WEST;
        dZArray2[uqa.g] = DZ.NORTH;
        dZArray2[yRa.d] = DZ.SOUTH;
        ika[] ikaArray5 = new ika[Yqa.i];
        ikaArray5[uSa.E] = ika.EAST;
        ikaArray5[vRa.d] = ika.SOUTH;
        ikaArray5[uqa.g] = ika.EAST;
        ikaArray5[yRa.d] = ika.FLIP_SOUTH;
        ikaArray5[AQa.P] = ika.FLIP_EAST;
        ikaArray5[tTa.h] = ika.FLIP_SOUTH;
        ikaArray5[uua.p] = ika.FLIP_EAST;
        ikaArray5[XTa.W] = ika.SOUTH;
        ika[] ikaArray6 = new ika[Yqa.i];
        ikaArray6[uSa.E] = ika.EAST;
        ikaArray6[vRa.d] = ika.NORTH;
        ikaArray6[uqa.g] = ika.EAST;
        ikaArray6[yRa.d] = ika.FLIP_NORTH;
        ikaArray6[AQa.P] = ika.FLIP_EAST;
        ikaArray6[tTa.h] = ika.FLIP_NORTH;
        ikaArray6[uua.p] = ika.FLIP_EAST;
        ikaArray6[XTa.W] = ika.NORTH;
        ika[] ikaArray7 = new ika[Yqa.i];
        ikaArray7[uSa.E] = ika.WEST;
        ikaArray7[vRa.d] = ika.NORTH;
        ikaArray7[uqa.g] = ika.WEST;
        ikaArray7[yRa.d] = ika.FLIP_NORTH;
        ikaArray7[AQa.P] = ika.FLIP_WEST;
        ikaArray7[tTa.h] = ika.FLIP_NORTH;
        ikaArray7[uua.p] = ika.FLIP_WEST;
        ikaArray7[XTa.W] = ika.NORTH;
        ika[] ikaArray8 = new ika[Yqa.i];
        ikaArray8[uSa.E] = ika.WEST;
        ikaArray8[vRa.d] = ika.SOUTH;
        ikaArray8[uqa.g] = ika.WEST;
        ikaArray8[yRa.d] = ika.FLIP_SOUTH;
        ikaArray8[AQa.P] = ika.FLIP_WEST;
        ikaArray8[tTa.h] = ika.FLIP_SOUTH;
        ikaArray8[uua.p] = ika.FLIP_WEST;
        ikaArray8[XTa.W] = ika.SOUTH;
        UP = new Ala_2(hQa.ca, vRa.d, dZArray2, pqa.r, vRa.d != 0, ikaArray5, ikaArray6, ikaArray7, ikaArray8);
        DZ[] dZArray3 = new DZ[AQa.P];
        dZArray3[uSa.E] = DZ.UP;
        dZArray3[vRa.d] = DZ.DOWN;
        dZArray3[uqa.g] = DZ.EAST;
        dZArray3[yRa.d] = DZ.WEST;
        ika[] ikaArray9 = new ika[Yqa.i];
        ikaArray9[uSa.E] = ika.UP;
        ikaArray9[vRa.d] = ika.FLIP_WEST;
        ikaArray9[uqa.g] = ika.UP;
        ikaArray9[yRa.d] = ika.WEST;
        ikaArray9[AQa.P] = ika.FLIP_UP;
        ikaArray9[tTa.h] = ika.WEST;
        ikaArray9[uua.p] = ika.FLIP_UP;
        ikaArray9[XTa.W] = ika.FLIP_WEST;
        ika[] ikaArray10 = new ika[Yqa.i];
        ikaArray10[uSa.E] = ika.UP;
        ikaArray10[vRa.d] = ika.FLIP_EAST;
        ikaArray10[uqa.g] = ika.UP;
        ikaArray10[yRa.d] = ika.EAST;
        ikaArray10[AQa.P] = ika.FLIP_UP;
        ikaArray10[tTa.h] = ika.EAST;
        ikaArray10[uua.p] = ika.FLIP_UP;
        ikaArray10[XTa.W] = ika.FLIP_EAST;
        ika[] ikaArray11 = new ika[Yqa.i];
        ikaArray11[uSa.E] = ika.DOWN;
        ikaArray11[vRa.d] = ika.FLIP_EAST;
        ikaArray11[uqa.g] = ika.DOWN;
        ikaArray11[yRa.d] = ika.EAST;
        ikaArray11[AQa.P] = ika.FLIP_DOWN;
        ikaArray11[tTa.h] = ika.EAST;
        ikaArray11[uua.p] = ika.FLIP_DOWN;
        ikaArray11[XTa.W] = ika.FLIP_EAST;
        ika[] ikaArray12 = new ika[Yqa.i];
        ikaArray12[uSa.E] = ika.DOWN;
        ikaArray12[vRa.d] = ika.FLIP_WEST;
        ikaArray12[uqa.g] = ika.DOWN;
        ikaArray12[yRa.d] = ika.WEST;
        ikaArray12[AQa.P] = ika.FLIP_DOWN;
        ikaArray12[tTa.h] = ika.WEST;
        ikaArray12[uua.p] = ika.FLIP_DOWN;
        ikaArray12[XTa.W] = ika.FLIP_WEST;
        NORTH = new Ala_2(aua.E, uqa.g, dZArray3, xSa.la, vRa.d != 0, ikaArray9, ikaArray10, ikaArray11, ikaArray12);
        DZ[] dZArray4 = new DZ[AQa.P];
        dZArray4[uSa.E] = DZ.WEST;
        dZArray4[vRa.d] = DZ.EAST;
        dZArray4[uqa.g] = DZ.DOWN;
        dZArray4[yRa.d] = DZ.UP;
        ika[] ikaArray13 = new ika[Yqa.i];
        ikaArray13[uSa.E] = ika.UP;
        ikaArray13[vRa.d] = ika.FLIP_WEST;
        ikaArray13[uqa.g] = ika.FLIP_UP;
        ikaArray13[yRa.d] = ika.FLIP_WEST;
        ikaArray13[AQa.P] = ika.FLIP_UP;
        ikaArray13[tTa.h] = ika.WEST;
        ikaArray13[uua.p] = ika.UP;
        ikaArray13[XTa.W] = ika.WEST;
        ika[] ikaArray14 = new ika[Yqa.i];
        ikaArray14[uSa.E] = ika.DOWN;
        ikaArray14[vRa.d] = ika.FLIP_WEST;
        ikaArray14[uqa.g] = ika.FLIP_DOWN;
        ikaArray14[yRa.d] = ika.FLIP_WEST;
        ikaArray14[AQa.P] = ika.FLIP_DOWN;
        ikaArray14[tTa.h] = ika.WEST;
        ikaArray14[uua.p] = ika.DOWN;
        ikaArray14[XTa.W] = ika.WEST;
        ika[] ikaArray15 = new ika[Yqa.i];
        ikaArray15[uSa.E] = ika.DOWN;
        ikaArray15[vRa.d] = ika.FLIP_EAST;
        ikaArray15[uqa.g] = ika.FLIP_DOWN;
        ikaArray15[yRa.d] = ika.FLIP_EAST;
        ikaArray15[AQa.P] = ika.FLIP_DOWN;
        ikaArray15[tTa.h] = ika.EAST;
        ikaArray15[uua.p] = ika.DOWN;
        ikaArray15[XTa.W] = ika.EAST;
        ika[] ikaArray16 = new ika[Yqa.i];
        ikaArray16[uSa.E] = ika.UP;
        ikaArray16[vRa.d] = ika.FLIP_EAST;
        ikaArray16[uqa.g] = ika.FLIP_UP;
        ikaArray16[yRa.d] = ika.FLIP_EAST;
        ikaArray16[AQa.P] = ika.FLIP_UP;
        ikaArray16[tTa.h] = ika.EAST;
        ikaArray16[uua.p] = ika.UP;
        ikaArray16[XTa.W] = ika.EAST;
        SOUTH = new Ala_2(hpa.a, yRa.d, dZArray4, xSa.la, vRa.d != 0, ikaArray13, ikaArray14, ikaArray15, ikaArray16);
        DZ[] dZArray5 = new DZ[AQa.P];
        dZArray5[uSa.E] = DZ.UP;
        dZArray5[vRa.d] = DZ.DOWN;
        dZArray5[uqa.g] = DZ.NORTH;
        dZArray5[yRa.d] = DZ.SOUTH;
        ika[] ikaArray17 = new ika[Yqa.i];
        ikaArray17[uSa.E] = ika.UP;
        ikaArray17[vRa.d] = ika.SOUTH;
        ikaArray17[uqa.g] = ika.UP;
        ikaArray17[yRa.d] = ika.FLIP_SOUTH;
        ikaArray17[AQa.P] = ika.FLIP_UP;
        ikaArray17[tTa.h] = ika.FLIP_SOUTH;
        ikaArray17[uua.p] = ika.FLIP_UP;
        ikaArray17[XTa.W] = ika.SOUTH;
        ika[] ikaArray18 = new ika[Yqa.i];
        ikaArray18[uSa.E] = ika.UP;
        ikaArray18[vRa.d] = ika.NORTH;
        ikaArray18[uqa.g] = ika.UP;
        ikaArray18[yRa.d] = ika.FLIP_NORTH;
        ikaArray18[AQa.P] = ika.FLIP_UP;
        ikaArray18[tTa.h] = ika.FLIP_NORTH;
        ikaArray18[uua.p] = ika.FLIP_UP;
        ikaArray18[XTa.W] = ika.NORTH;
        ika[] ikaArray19 = new ika[Yqa.i];
        ikaArray19[uSa.E] = ika.DOWN;
        ikaArray19[vRa.d] = ika.NORTH;
        ikaArray19[uqa.g] = ika.DOWN;
        ikaArray19[yRa.d] = ika.FLIP_NORTH;
        ikaArray19[AQa.P] = ika.FLIP_DOWN;
        ikaArray19[tTa.h] = ika.FLIP_NORTH;
        ikaArray19[uua.p] = ika.FLIP_DOWN;
        ikaArray19[XTa.W] = ika.NORTH;
        ika[] ikaArray20 = new ika[Yqa.i];
        ikaArray20[uSa.E] = ika.DOWN;
        ikaArray20[vRa.d] = ika.SOUTH;
        ikaArray20[uqa.g] = ika.DOWN;
        ikaArray20[yRa.d] = ika.FLIP_SOUTH;
        ikaArray20[AQa.P] = ika.FLIP_DOWN;
        ikaArray20[tTa.h] = ika.FLIP_SOUTH;
        ikaArray20[uua.p] = ika.FLIP_DOWN;
        ikaArray20[XTa.W] = ika.SOUTH;
        WEST = new Ala_2(sra.t, AQa.P, dZArray5, Ora.D, vRa.d != 0, ikaArray17, ikaArray18, ikaArray19, ikaArray20);
        DZ[] dZArray6 = new DZ[AQa.P];
        dZArray6[uSa.E] = DZ.DOWN;
        dZArray6[vRa.d] = DZ.UP;
        dZArray6[uqa.g] = DZ.NORTH;
        dZArray6[yRa.d] = DZ.SOUTH;
        ika[] ikaArray21 = new ika[Yqa.i];
        ikaArray21[uSa.E] = ika.FLIP_DOWN;
        ikaArray21[vRa.d] = ika.SOUTH;
        ikaArray21[uqa.g] = ika.FLIP_DOWN;
        ikaArray21[yRa.d] = ika.FLIP_SOUTH;
        ikaArray21[AQa.P] = ika.DOWN;
        ikaArray21[tTa.h] = ika.FLIP_SOUTH;
        ikaArray21[uua.p] = ika.DOWN;
        ikaArray21[XTa.W] = ika.SOUTH;
        ika[] ikaArray22 = new ika[Yqa.i];
        ikaArray22[uSa.E] = ika.FLIP_DOWN;
        ikaArray22[vRa.d] = ika.NORTH;
        ikaArray22[uqa.g] = ika.FLIP_DOWN;
        ikaArray22[yRa.d] = ika.FLIP_NORTH;
        ikaArray22[AQa.P] = ika.DOWN;
        ikaArray22[tTa.h] = ika.FLIP_NORTH;
        ikaArray22[uua.p] = ika.DOWN;
        ikaArray22[XTa.W] = ika.NORTH;
        ika[] ikaArray23 = new ika[Yqa.i];
        ikaArray23[uSa.E] = ika.FLIP_UP;
        ikaArray23[vRa.d] = ika.NORTH;
        ikaArray23[uqa.g] = ika.FLIP_UP;
        ikaArray23[yRa.d] = ika.FLIP_NORTH;
        ikaArray23[AQa.P] = ika.UP;
        ikaArray23[tTa.h] = ika.FLIP_NORTH;
        ikaArray23[uua.p] = ika.UP;
        ikaArray23[XTa.W] = ika.NORTH;
        ika[] ikaArray24 = new ika[Yqa.i];
        ikaArray24[uSa.E] = ika.FLIP_UP;
        ikaArray24[vRa.d] = ika.SOUTH;
        ikaArray24[uqa.g] = ika.FLIP_UP;
        ikaArray24[yRa.d] = ika.FLIP_SOUTH;
        ikaArray24[AQa.P] = ika.UP;
        ikaArray24[tTa.h] = ika.FLIP_SOUTH;
        ikaArray24[uua.p] = ika.UP;
        ikaArray24[XTa.W] = ika.SOUTH;
        EAST = new Ala_2(cQa.ca, tTa.h, dZArray6, Ora.D, vRa.d != 0, ikaArray21, ikaArray22, ikaArray23, ikaArray24);
        Ala_2[] ala_2Array = new Ala_2[uua.p];
        ala_2Array[uSa.E] = DOWN;
        ala_2Array[vRa.d] = UP;
        ala_2Array[uqa.g] = NORTH;
        ala_2Array[yRa.d] = SOUTH;
        ala_2Array[AQa.P] = WEST;
        ala_2Array[tTa.h] = EAST;
        $VALUES = ala_2Array;
        field_178282_n = new Ala_2[uua.p];
        Ala_2.field_178282_n[DZ.DOWN.getIndex()] = DOWN;
        Ala_2.field_178282_n[DZ.UP.getIndex()] = UP;
        Ala_2.field_178282_n[DZ.NORTH.getIndex()] = NORTH;
        Ala_2.field_178282_n[DZ.SOUTH.getIndex()] = SOUTH;
        Ala_2.field_178282_n[DZ.WEST.getIndex()] = WEST;
        Ala_2.field_178282_n[DZ.EAST.getIndex()] = EAST;
    }

    public static Ala getNeighbourInfo(DZ a2) {
        return field_178282_n[a2.getIndex()];
    }
}

