/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Sm
 *  vRa
 */
public final class Sm_2
extends Enum<Sm> {
    private static final /* synthetic */ Sm[] $VALUES;
    private final int value;
    public static final /* enum */ Sm TEXTCOLORVAL_NOT_SET;
    public static final /* enum */ Sm TEXTCOLOR;
    public static final /* enum */ Sm TEXTCOLORANIM;

    /*
     * Enabled aggressive block sorting
     */
    public static Sm forNumber(int a2) {
        switch (a2) {
            case 4: {
                return TEXTCOLOR;
            }
            case 5: {
                return TEXTCOLORANIM;
            }
            case 0: {
                return TEXTCOLORVAL_NOT_SET;
            }
        }
        return null;
    }

    private Sm_2(int n3) {
        int b2 = n3;
        Sm_2 a2 = this;
        a2.value = b2;
    }

    static {
        TEXTCOLOR = new Sm_2(AQa.P);
        TEXTCOLORANIM = new Sm_2(tTa.h);
        TEXTCOLORVAL_NOT_SET = new Sm_2(uSa.E);
        Sm_2[] sm_2Array = new Sm_2[yRa.d];
        sm_2Array[uSa.E] = TEXTCOLOR;
        sm_2Array[vRa.d] = TEXTCOLORANIM;
        sm_2Array[uqa.g] = TEXTCOLORVAL_NOT_SET;
        $VALUES = sm_2Array;
    }

    public int getNumber() {
        Sm_2 a2;
        return a2.value;
    }

    public static Sm valueOf(String a2) {
        return Enum.valueOf(Sm_2.class, a2);
    }

    public static Sm[] values() {
        return (Sm[])$VALUES.clone();
    }

    @Deprecated
    public static Sm valueOf(int a2) {
        return Sm_2.forNumber(a2);
    }
}

