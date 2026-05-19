/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YOa
 *  vRa
 */
public final class YOa_2
extends Enum<YOa> {
    public static final /* enum */ YOa OUTDATED_CLIENT;
    private static final /* synthetic */ YOa[] $VALUES;
    public static final /* enum */ YOa TIMEOUT;

    public static YOa[] values() {
        return (YOa[])$VALUES.clone();
    }

    static {
        TIMEOUT = new YOa_2();
        OUTDATED_CLIENT = new YOa_2();
        YOa_2[] yOa_2Array = new YOa_2[uqa.g];
        yOa_2Array[uSa.E] = TIMEOUT;
        yOa_2Array[vRa.d] = OUTDATED_CLIENT;
        $VALUES = yOa_2Array;
    }

    private YOa_2() {
        int a2 = n2;
        YOa_2 yOa_2 = this;
    }

    public static YOa valueOf(String a2) {
        return Enum.valueOf(YOa_2.class, a2);
    }
}

