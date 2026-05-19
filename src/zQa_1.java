/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  zQa
 */
public final class zQa_1
extends Enum<zQa> {
    public static final /* enum */ zQa STRETCH;
    private static final /* synthetic */ zQa[] $VALUES;
    public static final /* enum */ zQa FLEX_END;
    public static final /* enum */ zQa FLEX_START;
    public static final /* enum */ zQa CENTER;

    public static zQa[] values() {
        return (zQa[])$VALUES.clone();
    }

    public static zQa valueOf(String a2) {
        return Enum.valueOf(zQa_1.class, a2);
    }

    static {
        FLEX_START = new zQa_1();
        FLEX_END = new zQa_1();
        CENTER = new zQa_1();
        STRETCH = new zQa_1();
        zQa_1[] zQa_1Array = new zQa_1[AQa.P];
        zQa_1Array[uSa.E] = FLEX_START;
        zQa_1Array[vRa.d] = FLEX_END;
        zQa_1Array[uqa.g] = CENTER;
        zQa_1Array[yRa.d] = STRETCH;
        $VALUES = zQa_1Array;
    }

    private zQa_1() {
        int a2 = n2;
        zQa_1 zQa_12 = this;
    }
}

