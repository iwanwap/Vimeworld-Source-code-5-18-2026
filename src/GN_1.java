/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GN
 *  TQa
 *  XTa
 *  vRa
 */
public final class GN_1
extends Enum<GN> {
    public static final /* enum */ GN YEXPRANIM;
    public static final /* enum */ GN YANIM;
    private final int value;
    public static final /* enum */ GN Y;
    public static final /* enum */ GN YVAL_NOT_SET;
    public static final /* enum */ GN YEXPR;
    private static final /* synthetic */ GN[] $VALUES;

    /*
     * Enabled aggressive block sorting
     */
    public static GN forNumber(int a2) {
        switch (a2) {
            case 7: {
                return Y;
            }
            case 8: {
                return YANIM;
            }
            case 28: {
                return YEXPR;
            }
            case 35: {
                return YEXPRANIM;
            }
            case 0: {
                return YVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        GN_1 a2;
        return a2.value;
    }

    public static GN[] values() {
        return (GN[])$VALUES.clone();
    }

    private GN_1(int n3) {
        int b2 = n3;
        GN_1 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static GN valueOf(int a2) {
        return GN_1.forNumber(a2);
    }

    public static GN valueOf(String a2) {
        return Enum.valueOf(GN_1.class, a2);
    }

    static {
        Y = new GN_1(XTa.W);
        YANIM = new GN_1(Yqa.i);
        YEXPR = new GN_1(EPa.O);
        YEXPRANIM = new GN_1(TQa.ca);
        YVAL_NOT_SET = new GN_1(uSa.E);
        GN_1[] gN_1Array = new GN_1[tTa.h];
        gN_1Array[uSa.E] = Y;
        gN_1Array[vRa.d] = YANIM;
        gN_1Array[uqa.g] = YEXPR;
        gN_1Array[yRa.d] = YEXPRANIM;
        gN_1Array[AQa.P] = YVAL_NOT_SET;
        $VALUES = gN_1Array;
    }
}

