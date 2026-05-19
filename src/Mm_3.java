/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mm
 *  vRa
 */
public final class Mm_3
extends Enum<Mm> {
    public static final /* enum */ Mm COLOR = new Mm_3(yRa.d);
    public static final /* enum */ Mm COLORANIM = new Mm_3(AQa.P);
    private final int value;
    public static final /* enum */ Mm COLORVAL_NOT_SET = new Mm_3(uSa.E);
    private static final /* synthetic */ Mm[] $VALUES;

    public static Mm valueOf(String a2) {
        return Enum.valueOf(Mm_3.class, a2);
    }

    private Mm_3(int n3) {
        int b2 = n3;
        Mm_3 a2 = this;
        a2.value = b2;
    }

    public static Mm[] values() {
        return (Mm[])$VALUES.clone();
    }

    public int getNumber() {
        Mm_3 a2;
        return a2.value;
    }

    static {
        Mm_3[] mm_3Array = new Mm_3[yRa.d];
        mm_3Array[uSa.E] = COLOR;
        mm_3Array[vRa.d] = COLORANIM;
        mm_3Array[uqa.g] = COLORVAL_NOT_SET;
        $VALUES = mm_3Array;
    }

    public static Mm forNumber(int a2) {
        switch (a2) {
            case 3: {
                return COLOR;
            }
            case 4: {
                return COLORANIM;
            }
            case 0: {
                while (false) {
                }
                return COLORVAL_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static Mm valueOf(int a2) {
        return Mm_3.forNumber(a2);
    }
}

