/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  NQa
 *  XTa
 *  Ysa
 *  ld
 *  pda
 *  vRa
 */
public final class pda_2
extends Enum<pda> {
    public static final /* enum */ pda RIGHT_PANTS_LEG;
    public static final /* enum */ pda CAPE;
    private final String partName;
    public static final /* enum */ pda LEFT_PANTS_LEG;
    private final int partMask;
    private final int partId;
    private static final /* synthetic */ pda[] $VALUES;
    private final ld field_179339_k;
    public static final /* enum */ pda JACKET;
    public static final /* enum */ pda LEFT_SLEEVE;
    public static final /* enum */ pda RIGHT_SLEEVE;
    public static final /* enum */ pda HAT;

    public int getPartId() {
        pda_2 a2;
        return a2.partId;
    }

    public static pda valueOf(String a2) {
        return Enum.valueOf(pda_2.class, a2);
    }

    public static pda[] values() {
        return (pda[])$VALUES.clone();
    }

    public String getPartName() {
        pda_2 a2;
        return a2.partName;
    }

    /*
     * WARNING - void declaration
     */
    private pda_2(int n3, String string2) {
        Object c2;
        void b2;
        pda_2 a2;
        pda_2 pda_22 = object;
        Object object = string2;
        pda_2 pda_23 = a2 = pda_22;
        a2.partId = b2;
        pda_23.partMask = vRa.d << b2;
        pda_23.partName = c2;
        pda_2 pda_24 = a2;
        pda_23.field_179339_k = new CZ(new StringBuilder().insert(3 & 4, zOa.b).append((String)c2).toString(), new Object[uSa.E]);
    }

    static {
        CAPE = new pda_2(uSa.E, NQa.Da);
        JACKET = new pda_2(vRa.d, Ysa.q);
        LEFT_SLEEVE = new pda_2(uqa.g, Iqa.Ja);
        RIGHT_SLEEVE = new pda_2(yRa.d, DPa.la);
        LEFT_PANTS_LEG = new pda_2(AQa.P, kua.n);
        RIGHT_PANTS_LEG = new pda_2(tTa.h, IPa.V);
        HAT = new pda_2(uua.p, BQa.e);
        pda_2[] pda_2Array = new pda_2[XTa.W];
        pda_2Array[uSa.E] = CAPE;
        pda_2Array[vRa.d] = JACKET;
        pda_2Array[uqa.g] = LEFT_SLEEVE;
        pda_2Array[yRa.d] = RIGHT_SLEEVE;
        pda_2Array[AQa.P] = LEFT_PANTS_LEG;
        pda_2Array[tTa.h] = RIGHT_PANTS_LEG;
        pda_2Array[uua.p] = HAT;
        $VALUES = pda_2Array;
    }

    public ld func_179326_d() {
        pda_2 a2;
        return a2.field_179339_k;
    }

    public int getPartMask() {
        pda_2 a2;
        return a2.partMask;
    }
}

