/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hE
 *  vRa
 */
public final class hE_2
extends Enum<hE> {
    public static final /* enum */ hE ARM;
    private static final /* synthetic */ hE[] $VALUES;
    public static final /* enum */ hE LEG;
    public static final /* enum */ hE NONE;
    public static final /* enum */ hE BODY;

    private hE_2() {
        int a2 = n2;
        hE_2 hE_22 = this;
    }

    public static hE valueOf(String a2) {
        return Enum.valueOf(hE_2.class, a2);
    }

    static {
        LEG = new hE_2();
        ARM = new hE_2();
        BODY = new hE_2();
        NONE = new hE_2();
        hE_2[] hE_2Array = new hE_2[AQa.P];
        hE_2Array[uSa.E] = LEG;
        hE_2Array[vRa.d] = ARM;
        hE_2Array[uqa.g] = BODY;
        hE_2Array[yRa.d] = NONE;
        $VALUES = hE_2Array;
    }

    public static hE[] values() {
        return (hE[])$VALUES.clone();
    }
}

