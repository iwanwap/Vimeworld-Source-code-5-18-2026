/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  vRa
 */
public final class AY_2
extends Enum<AY> {
    public static final /* enum */ AY BLOCK;
    public static final /* enum */ AY ENTITY;
    public static final /* enum */ AY MISS;
    private static final /* synthetic */ AY[] $VALUES;

    static {
        MISS = new AY_2();
        BLOCK = new AY_2();
        ENTITY = new AY_2();
        AY_2[] aY_2Array = new AY_2[yRa.d];
        aY_2Array[uSa.E] = MISS;
        aY_2Array[vRa.d] = BLOCK;
        aY_2Array[uqa.g] = ENTITY;
        $VALUES = aY_2Array;
    }

    public static AY valueOf(String a2) {
        return Enum.valueOf(AY_2.class, a2);
    }

    private AY_2() {
        int a2 = n2;
        AY_2 aY_2 = this;
    }

    public static AY[] values() {
        return (AY[])$VALUES.clone();
    }
}

