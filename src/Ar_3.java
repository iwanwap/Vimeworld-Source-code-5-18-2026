/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ar
 *  vRa
 */
public final class Ar_3
extends Enum<Ar> {
    private static final /* synthetic */ Ar[] $VALUES;
    public static final /* enum */ Ar POSITION = new Ar_3();
    public static final /* enum */ Ar SCALE;
    public static final /* enum */ Ar ROTATION;

    private Ar_3() {
        int a2 = n2;
        Ar_3 ar_3 = this;
    }

    public static Ar valueOf(String a2) {
        return Enum.valueOf(Ar_3.class, a2);
    }

    static {
        ROTATION = new Ar_3();
        SCALE = new Ar_3();
        Ar_3[] ar_3Array = new Ar_3[yRa.d];
        ar_3Array[uSa.E] = POSITION;
        ar_3Array[vRa.d] = ROTATION;
        ar_3Array[uqa.g] = SCALE;
        $VALUES = ar_3Array;
    }

    public static Ar[] values() {
        return (Ar[])$VALUES.clone();
    }
}

