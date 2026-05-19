/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vt
 *  vRa
 */
public final class Vt_3
extends Enum<Vt> {
    public static final /* enum */ Vt CHEST;
    public static final /* enum */ Vt LEGGINGS;
    public static final /* enum */ Vt HELMET;
    public static final /* enum */ Vt BOOTS;
    private static final /* synthetic */ Vt[] $VALUES;

    static {
        HELMET = new Vt_3();
        CHEST = new Vt_3();
        LEGGINGS = new Vt_3();
        BOOTS = new Vt_3();
        Vt_3[] vt_3Array = new Vt_3[AQa.P];
        vt_3Array[uSa.E] = HELMET;
        vt_3Array[vRa.d] = CHEST;
        vt_3Array[uqa.g] = LEGGINGS;
        vt_3Array[yRa.d] = BOOTS;
        $VALUES = vt_3Array;
    }

    public static Vt valueOf(String a2) {
        return Enum.valueOf(Vt_3.class, a2);
    }

    private Vt_3() {
        int a2 = n2;
        Vt_3 vt_3 = this;
    }

    public static Vt[] values() {
        return (Vt[])$VALUES.clone();
    }
}

