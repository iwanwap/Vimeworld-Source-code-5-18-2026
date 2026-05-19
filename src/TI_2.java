/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TI
 *  vRa
 */
public final class TI_2
extends Enum<TI> {
    private static final /* synthetic */ TI[] $VALUES;
    public static final /* enum */ TI DISABLED;
    public static final /* enum */ TI ENABLED;
    public static final /* enum */ TI AUTO;

    private TI_2() {
        int a2 = n2;
        TI_2 tI_2 = this;
    }

    public static TI[] values() {
        return (TI[])$VALUES.clone();
    }

    public static TI valueOf(String a2) {
        return Enum.valueOf(TI_2.class, a2);
    }

    static {
        AUTO = new TI_2();
        ENABLED = new TI_2();
        DISABLED = new TI_2();
        TI_2[] tI_2Array = new TI_2[yRa.d];
        tI_2Array[uSa.E] = AUTO;
        tI_2Array[vRa.d] = ENABLED;
        tI_2Array[uqa.g] = DISABLED;
        $VALUES = tI_2Array;
    }
}

