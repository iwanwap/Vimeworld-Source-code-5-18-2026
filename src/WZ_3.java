/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WZ
 *  vRa
 */
public final class WZ_3
extends Enum<WZ> {
    public static final /* enum */ WZ OCEAN = new WZ_3();
    private static final /* synthetic */ WZ[] $VALUES;
    public static final /* enum */ WZ MEDIUM;
    public static final /* enum */ WZ WARM;
    public static final /* enum */ WZ COLD;

    static {
        COLD = new WZ_3();
        MEDIUM = new WZ_3();
        WARM = new WZ_3();
        WZ_3[] wZ_3Array = new WZ_3[AQa.P];
        wZ_3Array[uSa.E] = OCEAN;
        wZ_3Array[vRa.d] = COLD;
        wZ_3Array[uqa.g] = MEDIUM;
        wZ_3Array[yRa.d] = WARM;
        $VALUES = wZ_3Array;
    }

    public static WZ valueOf(String a2) {
        return Enum.valueOf(WZ_3.class, a2);
    }

    public static WZ[] values() {
        return (WZ[])$VALUES.clone();
    }

    private WZ_3() {
        int a2 = n2;
        WZ_3 wZ_3 = this;
    }
}

