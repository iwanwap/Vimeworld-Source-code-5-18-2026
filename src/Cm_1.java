/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cm
 *  Qsa
 *  lqa
 *  pPa
 *  vRa
 */
public final class Cm_1
extends Enum<Cm> {
    public static final /* enum */ Cm ROTATEVAL_NOT_SET;
    public static final /* enum */ Cm ROTATEANIM;
    private final int value;
    public static final /* enum */ Cm ROTATE;
    public static final /* enum */ Cm ROTATEANIMSMART;
    public static final /* enum */ Cm ROTATEEXPR;
    public static final /* enum */ Cm ROTATEEXPRANIM;
    private static final /* synthetic */ Cm[] $VALUES;

    public static Cm[] values() {
        return (Cm[])$VALUES.clone();
    }

    @Deprecated
    public static Cm valueOf(int a2) {
        return Cm_1.forNumber(a2);
    }

    public int getNumber() {
        Cm_1 a2;
        return a2.value;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Cm forNumber(int a2) {
        switch (a2) {
            case 11: {
                return ROTATE;
            }
            case 12: {
                return ROTATEANIM;
            }
            case 13: {
                return ROTATEANIMSMART;
            }
            case 29: {
                return ROTATEEXPR;
            }
            case 36: {
                return ROTATEEXPRANIM;
            }
            case 0: {
                return ROTATEVAL_NOT_SET;
            }
        }
        return null;
    }

    static {
        ROTATE = new Cm_1(pPa.f);
        ROTATEANIM = new Cm_1(lqa.s);
        ROTATEANIMSMART = new Cm_1(uua.s);
        ROTATEEXPR = new Cm_1(ITa.A);
        ROTATEEXPRANIM = new Cm_1(Qsa.Ha);
        ROTATEVAL_NOT_SET = new Cm_1(uSa.E);
        Cm_1[] cm_1Array = new Cm_1[uua.p];
        cm_1Array[uSa.E] = ROTATE;
        cm_1Array[vRa.d] = ROTATEANIM;
        cm_1Array[uqa.g] = ROTATEANIMSMART;
        cm_1Array[yRa.d] = ROTATEEXPR;
        cm_1Array[AQa.P] = ROTATEEXPRANIM;
        cm_1Array[tTa.h] = ROTATEVAL_NOT_SET;
        $VALUES = cm_1Array;
    }

    private Cm_1(int n3) {
        int b2 = n3;
        Cm_1 a2 = this;
        a2.value = b2;
    }

    public static Cm valueOf(String a2) {
        return Enum.valueOf(Cm_1.class, a2);
    }
}

