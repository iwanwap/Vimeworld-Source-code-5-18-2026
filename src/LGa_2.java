/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LGa
 *  vRa
 */
public final class LGa_2
extends Enum<LGa> {
    public static final /* enum */ LGa ARTHROPOD;
    public static final /* enum */ LGa UNDEAD;
    public static final /* enum */ LGa UNDEFINED;
    private static final /* synthetic */ LGa[] $VALUES;

    private LGa_2() {
        int a2 = n2;
        LGa_2 lGa_2 = this;
    }

    static {
        UNDEFINED = new LGa_2();
        UNDEAD = new LGa_2();
        ARTHROPOD = new LGa_2();
        LGa_2[] lGa_2Array = new LGa_2[yRa.d];
        lGa_2Array[uSa.E] = UNDEFINED;
        lGa_2Array[vRa.d] = UNDEAD;
        lGa_2Array[uqa.g] = ARTHROPOD;
        $VALUES = lGa_2Array;
    }

    public static LGa valueOf(String a2) {
        return Enum.valueOf(LGa_2.class, a2);
    }

    public static LGa[] values() {
        return (LGa[])$VALUES.clone();
    }
}

