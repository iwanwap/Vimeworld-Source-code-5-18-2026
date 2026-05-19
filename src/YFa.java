/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class YFa
extends Enum<YFa> {
    private static final /* synthetic */ YFa[] $VALUES;
    public static final /* enum */ YFa BOW;
    public static final /* enum */ YFa DRINK;
    public static final /* enum */ YFa BLOCK;
    public static final /* enum */ YFa NONE;
    public static final /* enum */ YFa EAT;

    static {
        NONE = new YFa();
        EAT = new YFa();
        DRINK = new YFa();
        BLOCK = new YFa();
        BOW = new YFa();
        YFa[] yFaArray = new YFa[tTa.h];
        yFaArray[uSa.E] = NONE;
        yFaArray[vRa.d] = EAT;
        yFaArray[uqa.g] = DRINK;
        yFaArray[yRa.d] = BLOCK;
        yFaArray[AQa.P] = BOW;
        $VALUES = yFaArray;
    }

    private YFa() {
        int a2 = n2;
        YFa yFa = this;
    }

    public static YFa valueOf(String a2) {
        return Enum.valueOf(YFa.class, a2);
    }

    public static YFa[] values() {
        return (YFa[])$VALUES.clone();
    }
}

