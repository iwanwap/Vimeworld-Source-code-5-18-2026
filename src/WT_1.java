/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WT
 *  vRa
 */
public final class WT_1
extends Enum<WT> {
    public static final /* enum */ WT POSITION = new WT_1();
    public static final /* enum */ WT ROTATION = new WT_1();
    public static final /* enum */ WT SCALE = new WT_1();
    private static final /* synthetic */ WT[] $VALUES;

    public static WT valueOf(String a2) {
        return Enum.valueOf(WT_1.class, a2);
    }

    public static WT[] values() {
        return (WT[])$VALUES.clone();
    }

    static {
        WT_1[] wT_1Array = new WT_1[yRa.d];
        wT_1Array[uSa.E] = POSITION;
        wT_1Array[vRa.d] = ROTATION;
        wT_1Array[uqa.g] = SCALE;
        $VALUES = wT_1Array;
    }

    private WT_1() {
        int a2 = n2;
        WT_1 wT_1 = this;
    }
}

