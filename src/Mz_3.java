/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mz
 *  Ypa
 *  vRa
 */
public final class Mz_3
extends Enum<Mz> {
    public static final /* enum */ Mz BLOCK;
    private static final /* synthetic */ Mz[] $VALUES;
    public final int defaultLightValue;
    public static final /* enum */ Mz SKY;

    public static Mz valueOf(String a2) {
        return Enum.valueOf(Mz_3.class, a2);
    }

    static {
        SKY = new Mz_3(Ypa.A);
        BLOCK = new Mz_3(uSa.E);
        Mz_3[] mz_3Array = new Mz_3[uqa.g];
        mz_3Array[uSa.E] = SKY;
        mz_3Array[vRa.d] = BLOCK;
        $VALUES = mz_3Array;
    }

    public static Mz[] values() {
        return (Mz[])$VALUES.clone();
    }

    private Mz_3(int n3) {
        int b2 = n3;
        Mz_3 a2 = this;
        a2.defaultLightValue = b2;
    }
}

