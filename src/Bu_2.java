/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bu
 *  vRa
 */
public final class Bu_2
extends Enum<Bu> {
    public static final /* enum */ Bu CATMULLROM;
    private static final /* synthetic */ Bu[] $VALUES;
    public static final /* enum */ Bu LINEAR;

    public static Bu valueOf(String a2) {
        return Enum.valueOf(Bu_2.class, a2);
    }

    private Bu_2() {
        int a2 = n2;
        Bu_2 bu_2 = this;
    }

    public static Bu[] values() {
        return (Bu[])$VALUES.clone();
    }

    static {
        LINEAR = new Bu_2();
        CATMULLROM = new Bu_2();
        Bu_2[] bu_2Array = new Bu_2[uqa.g];
        bu_2Array[uSa.E] = LINEAR;
        bu_2Array[vRa.d] = CATMULLROM;
        $VALUES = bu_2Array;
    }
}

