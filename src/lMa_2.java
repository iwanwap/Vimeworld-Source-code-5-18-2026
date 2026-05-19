/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lMa
 *  vRa
 */
public final class lMa_2
extends Enum<lMa> {
    private static final /* synthetic */ lMa[] $VALUES;
    private final int type;
    public static final /* enum */ lMa NONE = new lMa_2(uSa.E);
    public static final /* enum */ lMa LINEAR = new lMa_2(uqa.g);

    public static lMa[] values() {
        return (lMa[])$VALUES.clone();
    }

    public int getTypeInt() {
        lMa_2 a2;
        return a2.type;
    }

    private lMa_2(int n3) {
        int b2 = n3;
        lMa_2 a2 = this;
        a2.type = b2;
    }

    static {
        lMa_2[] lMa_2Array = new lMa_2[uqa.g];
        lMa_2Array[uSa.E] = NONE;
        lMa_2Array[vRa.d] = LINEAR;
        $VALUES = lMa_2Array;
    }

    public static lMa valueOf(String a2) {
        return Enum.valueOf(lMa_2.class, a2);
    }
}

