/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  NTa
 *  XTa
 *  cQa
 *  ika
 *  lqa
 *  pPa
 *  vQa
 *  vRa
 */
public final class ika_3
extends Enum<ika> {
    public static final /* enum */ ika FLIP_SOUTH;
    public static final /* enum */ ika FLIP_NORTH;
    public static final /* enum */ ika FLIP_DOWN;
    private static final /* synthetic */ ika[] $VALUES;
    public static final /* enum */ ika SOUTH;
    public final int field_178229_m;
    public static final /* enum */ ika DOWN;
    public static final /* enum */ ika FLIP_EAST;
    public static final /* enum */ ika FLIP_WEST;
    public static final /* enum */ ika FLIP_UP;
    public static final /* enum */ ika WEST;
    public static final /* enum */ ika EAST;
    public static final /* enum */ ika NORTH;
    public static final /* enum */ ika UP;

    /*
     * WARNING - void declaration
     */
    private ika_3(String string2, int n3, DZ dZ2, boolean bl2) {
        void e2;
        void b2;
        boolean bl3 = bl2;
        ika_3 a2 = this;
        a2.field_178229_m = b2.getIndex() + (e2 != false ? DZ.values().length : uSa.E);
    }

    public static ika[] values() {
        return (ika[])$VALUES.clone();
    }

    public static ika valueOf(String a2) {
        return Enum.valueOf(ika_3.class, a2);
    }

    static {
        DOWN = new ika_3(Npa.ca, uSa.E, DZ.DOWN, uSa.E != 0);
        UP = new ika_3(hQa.ca, vRa.d, DZ.UP, uSa.E != 0);
        NORTH = new ika_3(aua.E, uqa.g, DZ.NORTH, uSa.E != 0);
        SOUTH = new ika_3(hpa.a, yRa.d, DZ.SOUTH, uSa.E != 0);
        WEST = new ika_3(sra.t, AQa.P, DZ.WEST, uSa.E != 0);
        EAST = new ika_3(cQa.ca, tTa.h, DZ.EAST, uSa.E != 0);
        FLIP_DOWN = new ika_3(KSa.w, uua.p, DZ.DOWN, vRa.d != 0);
        FLIP_UP = new ika_3(qsa.Ha, XTa.W, DZ.UP, vRa.d != 0);
        FLIP_NORTH = new ika_3(BQa.Ea, Yqa.i, DZ.NORTH, vRa.d != 0);
        FLIP_SOUTH = new ika_3(vQa.W, WOa.fa, DZ.SOUTH, vRa.d != 0);
        FLIP_WEST = new ika_3(Cta.D, NTa.C, DZ.WEST, vRa.d != 0);
        FLIP_EAST = new ika_3(IPa.Q, pPa.f, DZ.EAST, vRa.d != 0);
        ika_3[] ika_3Array = new ika_3[lqa.s];
        ika_3Array[uSa.E] = DOWN;
        ika_3Array[vRa.d] = UP;
        ika_3Array[uqa.g] = NORTH;
        ika_3Array[yRa.d] = SOUTH;
        ika_3Array[AQa.P] = WEST;
        ika_3Array[tTa.h] = EAST;
        ika_3Array[uua.p] = FLIP_DOWN;
        ika_3Array[XTa.W] = FLIP_UP;
        ika_3Array[Yqa.i] = FLIP_NORTH;
        ika_3Array[WOa.fa] = FLIP_SOUTH;
        ika_3Array[NTa.C] = FLIP_WEST;
        ika_3Array[pPa.f] = FLIP_EAST;
        $VALUES = ika_3Array;
    }
}

