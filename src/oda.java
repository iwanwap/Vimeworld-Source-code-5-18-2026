/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  PTa
 *  pY
 *  vRa
 */
public final class oda
extends Enum<oda> {
    private static final /* synthetic */ oda[] $VALUES;
    public static final /* enum */ oda RARE;
    public static final /* enum */ oda UNCOMMON;
    public static final /* enum */ oda COMMON;
    public static final /* enum */ oda EPIC;
    public final pY rarityColor;
    public final String rarityName;

    public static oda[] values() {
        return (oda[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private oda(pY pY2, String string2) {
        Object c2;
        void b2;
        oda a2;
        oda oda2 = object;
        Object object = string2;
        oda oda3 = a2 = oda2;
        oda3.rarityColor = b2;
        oda3.rarityName = c2;
    }

    public static oda valueOf(String a2) {
        return Enum.valueOf(oda.class, a2);
    }

    static {
        COMMON = new oda(pY.WHITE, LPa.W);
        UNCOMMON = new oda(pY.YELLOW, eta.Ga);
        RARE = new oda(pY.AQUA, ITa.u);
        EPIC = new oda(pY.LIGHT_PURPLE, PTa.u);
        oda[] odaArray = new oda[AQa.P];
        odaArray[uSa.E] = COMMON;
        odaArray[vRa.d] = UNCOMMON;
        odaArray[uqa.g] = RARE;
        odaArray[yRa.d] = EPIC;
        $VALUES = odaArray;
    }
}

