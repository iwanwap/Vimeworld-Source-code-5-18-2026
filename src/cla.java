/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ala
 *  vRa
 */
public final class cla
extends Enum<cla> {
    public static final /* enum */ cla NORTH;
    public static final /* enum */ cla WEST;
    public static final /* enum */ cla SOUTH;
    private static final /* synthetic */ cla[] $VALUES;
    private static final cla[] facings;
    public static final /* enum */ cla EAST;
    public static final /* enum */ cla UP;
    public static final /* enum */ cla DOWN;
    private final ala[] vertexInfos;

    public static cla getFacing(DZ a2) {
        return facings[a2.getIndex()];
    }

    public static cla[] values() {
        return (cla[])$VALUES.clone();
    }

    static {
        ala[] alaArray = new ala[AQa.P];
        alaArray[uSa.E] = new ala(NJa.M, NJa.A, NJa.J, null);
        alaArray[vRa.d] = new ala(NJa.M, NJa.A, NJa.k, null);
        alaArray[uqa.g] = new ala(NJa.j, NJa.A, NJa.k, null);
        alaArray[yRa.d] = new ala(NJa.j, NJa.A, NJa.J, null);
        DOWN = new cla(alaArray);
        ala[] alaArray2 = new ala[AQa.P];
        alaArray2[uSa.E] = new ala(NJa.M, NJa.I, NJa.k, null);
        alaArray2[vRa.d] = new ala(NJa.M, NJa.I, NJa.J, null);
        alaArray2[uqa.g] = new ala(NJa.j, NJa.I, NJa.J, null);
        alaArray2[yRa.d] = new ala(NJa.j, NJa.I, NJa.k, null);
        UP = new cla(alaArray2);
        ala[] alaArray3 = new ala[AQa.P];
        alaArray3[uSa.E] = new ala(NJa.j, NJa.I, NJa.k, null);
        alaArray3[vRa.d] = new ala(NJa.j, NJa.A, NJa.k, null);
        alaArray3[uqa.g] = new ala(NJa.M, NJa.A, NJa.k, null);
        alaArray3[yRa.d] = new ala(NJa.M, NJa.I, NJa.k, null);
        NORTH = new cla(alaArray3);
        ala[] alaArray4 = new ala[AQa.P];
        alaArray4[uSa.E] = new ala(NJa.M, NJa.I, NJa.J, null);
        alaArray4[vRa.d] = new ala(NJa.M, NJa.A, NJa.J, null);
        alaArray4[uqa.g] = new ala(NJa.j, NJa.A, NJa.J, null);
        alaArray4[yRa.d] = new ala(NJa.j, NJa.I, NJa.J, null);
        SOUTH = new cla(alaArray4);
        ala[] alaArray5 = new ala[AQa.P];
        alaArray5[uSa.E] = new ala(NJa.M, NJa.I, NJa.k, null);
        alaArray5[vRa.d] = new ala(NJa.M, NJa.A, NJa.k, null);
        alaArray5[uqa.g] = new ala(NJa.M, NJa.A, NJa.J, null);
        alaArray5[yRa.d] = new ala(NJa.M, NJa.I, NJa.J, null);
        WEST = new cla(alaArray5);
        ala[] alaArray6 = new ala[AQa.P];
        alaArray6[uSa.E] = new ala(NJa.j, NJa.I, NJa.J, null);
        alaArray6[vRa.d] = new ala(NJa.j, NJa.A, NJa.J, null);
        alaArray6[uqa.g] = new ala(NJa.j, NJa.A, NJa.k, null);
        alaArray6[yRa.d] = new ala(NJa.j, NJa.I, NJa.k, null);
        EAST = new cla(alaArray6);
        cla[] claArray = new cla[uua.p];
        claArray[uSa.E] = DOWN;
        claArray[vRa.d] = UP;
        claArray[uqa.g] = NORTH;
        claArray[yRa.d] = SOUTH;
        claArray[AQa.P] = WEST;
        claArray[tTa.h] = EAST;
        $VALUES = claArray;
        facings = new cla[uua.p];
        cla.facings[NJa.A] = DOWN;
        cla.facings[NJa.I] = UP;
        cla.facings[NJa.k] = NORTH;
        cla.facings[NJa.J] = SOUTH;
        cla.facings[NJa.M] = WEST;
        cla.facings[NJa.j] = EAST;
    }

    private cla(ala[] alaArray) {
        ala[] b2 = alaArray;
        ala[] a2 = this;
        a2.vertexInfos = b2;
    }

    public ala func_179025_a(int n2) {
        int b2 = n2;
        cla a2 = this;
        return a2.vertexInfos[b2];
    }

    public static cla valueOf(String a2) {
        return Enum.valueOf(cla.class, a2);
    }
}

