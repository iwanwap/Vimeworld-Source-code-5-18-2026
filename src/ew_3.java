/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ew
 *  vRa
 */
public final class ew_3
extends Enum<ew> {
    public static final /* enum */ ew COOL_WARM = new ew_3();
    public static final /* enum */ ew HEAT_ICE = new ew_3();
    private static final /* synthetic */ ew[] $VALUES;
    public static final /* enum */ ew SPECIAL = new ew_3();

    public static ew[] values() {
        return (ew[])$VALUES.clone();
    }

    public static ew valueOf(String a2) {
        return Enum.valueOf(ew_3.class, a2);
    }

    private ew_3() {
        int a2 = n2;
        ew_3 ew_32 = this;
    }

    static {
        ew_3[] ew_3Array = new ew_3[yRa.d];
        ew_3Array[uSa.E] = COOL_WARM;
        ew_3Array[vRa.d] = HEAT_ICE;
        ew_3Array[uqa.g] = SPECIAL;
        $VALUES = ew_3Array;
    }
}

