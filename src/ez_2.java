/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  ez
 *  isa
 *  vRa
 */
public final class ez_2
extends Enum<ez> {
    private final String layerName;
    public static final /* enum */ ez CUTOUT;
    public static final /* enum */ ez TRANSLUCENT;
    private static final /* synthetic */ ez[] $VALUES;
    public static final /* enum */ ez SOLID;
    public static final /* enum */ ez CUTOUT_MIPPED;

    public String toString() {
        ez_2 a2;
        return a2.layerName;
    }

    public static ez valueOf(String a2) {
        return Enum.valueOf(ez_2.class, a2);
    }

    public static ez[] values() {
        return (ez[])$VALUES.clone();
    }

    private ez_2(String string2) {
        Object b2 = string2;
        ez_2 a2 = this;
        a2.layerName = b2;
    }

    static {
        SOLID = new ez_2(bsa.F);
        CUTOUT_MIPPED = new ez_2(isa.Da);
        CUTOUT = new ez_2(NTa.L);
        TRANSLUCENT = new ez_2(NTa.a);
        ez_2[] ez_2Array = new ez_2[AQa.P];
        ez_2Array[uSa.E] = SOLID;
        ez_2Array[vRa.d] = CUTOUT_MIPPED;
        ez_2Array[uqa.g] = CUTOUT;
        ez_2Array[yRa.d] = TRANSLUCENT;
        $VALUES = ez_2Array;
    }
}

