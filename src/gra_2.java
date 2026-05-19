/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gra
 *  vRa
 */
public final class gra_2
extends Enum<gra> {
    public static final /* enum */ gra CENTER;
    private static final /* synthetic */ gra[] $VALUES;
    public static final /* enum */ gra FLEX_END;
    public static final /* enum */ gra FLEX_START;
    public static final /* enum */ gra SPACE_AROUND;
    public static final /* enum */ gra SPACE_EVENLY;
    public static final /* enum */ gra SPACE_BETWEEN;

    public static gra valueOf(String a2) {
        return Enum.valueOf(gra_2.class, a2);
    }

    private gra_2() {
        int a2 = n2;
        gra_2 gra_22 = this;
    }

    static {
        FLEX_START = new gra_2();
        FLEX_END = new gra_2();
        CENTER = new gra_2();
        SPACE_BETWEEN = new gra_2();
        SPACE_AROUND = new gra_2();
        SPACE_EVENLY = new gra_2();
        gra_2[] gra_2Array = new gra_2[uua.p];
        gra_2Array[uSa.E] = FLEX_START;
        gra_2Array[vRa.d] = FLEX_END;
        gra_2Array[uqa.g] = CENTER;
        gra_2Array[yRa.d] = SPACE_BETWEEN;
        gra_2Array[AQa.P] = SPACE_AROUND;
        gra_2Array[tTa.h] = SPACE_EVENLY;
        $VALUES = gra_2Array;
    }

    public static gra[] values() {
        return (gra[])$VALUES.clone();
    }
}

