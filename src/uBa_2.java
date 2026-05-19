/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uBa
 *  vRa
 */
public final class uBa_2
extends Enum<uBa> {
    public static final /* enum */ uBa ENTITY_DIED;
    public static final /* enum */ uBa END_COMBAT;
    public static final /* enum */ uBa ENTER_COMBAT;
    private static final /* synthetic */ uBa[] $VALUES;

    private uBa_2() {
        int a2 = n2;
        uBa_2 uBa_22 = this;
    }

    public static uBa valueOf(String a2) {
        return Enum.valueOf(uBa_2.class, a2);
    }

    public static uBa[] values() {
        return (uBa[])$VALUES.clone();
    }

    static {
        ENTER_COMBAT = new uBa_2();
        END_COMBAT = new uBa_2();
        ENTITY_DIED = new uBa_2();
        uBa_2[] uBa_2Array = new uBa_2[yRa.d];
        uBa_2Array[uSa.E] = ENTER_COMBAT;
        uBa_2Array[vRa.d] = END_COMBAT;
        uBa_2Array[uqa.g] = ENTITY_DIED;
        $VALUES = uBa_2Array;
    }
}

