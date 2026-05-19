/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YC
 *  vRa
 */
public final class YC_2
extends Enum<YC> {
    public static final /* enum */ YC COLUMN;
    public static final /* enum */ YC ROW;
    private static final /* synthetic */ YC[] $VALUES;

    public static YC[] values() {
        return (YC[])$VALUES.clone();
    }

    private YC_2() {
        int a2 = n2;
        YC_2 yC_2 = this;
    }

    public static YC valueOf(String a2) {
        return Enum.valueOf(YC_2.class, a2);
    }

    static {
        ROW = new YC_2();
        COLUMN = new YC_2();
        YC_2[] yC_2Array = new YC_2[uqa.g];
        yC_2Array[uSa.E] = ROW;
        yC_2Array[vRa.d] = COLUMN;
        $VALUES = yC_2Array;
    }
}

