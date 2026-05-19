/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class eIa
extends Enum<eIa> {
    public static final /* enum */ eIa ON_GROUND = new eIa();
    public static final /* enum */ eIa IN_AIR = new eIa();
    private static final /* synthetic */ eIa[] $VALUES;
    public static final /* enum */ eIa IN_WATER = new eIa();

    public static eIa valueOf(String a2) {
        return Enum.valueOf(eIa.class, a2);
    }

    private eIa() {
        int a2 = n2;
        eIa eIa2 = this;
    }

    static {
        eIa[] eIaArray = new eIa[yRa.d];
        eIaArray[uSa.E] = ON_GROUND;
        eIaArray[vRa.d] = IN_AIR;
        eIaArray[uqa.g] = IN_WATER;
        $VALUES = eIaArray;
    }

    public static eIa[] values() {
        return (eIa[])$VALUES.clone();
    }
}

