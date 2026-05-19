/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  iL
 *  vRa
 */
public final class iL_3
extends Enum<iL> {
    private static final /* synthetic */ iL[] $VALUES;
    public static final /* enum */ iL SCALEZ = new iL_3(AQa.ba);
    public static final /* enum */ iL SCALEZANIM = new iL_3(osa.c);
    private final int value;
    public static final /* enum */ iL SCALEZVAL_NOT_SET = new iL_3(uSa.E);

    /*
     * Enabled aggressive block sorting
     */
    public static iL forNumber(int a2) {
        switch (a2) {
            case 23: {
                return SCALEZ;
            }
            case 24: {
                return SCALEZANIM;
            }
            case 0: {
                return SCALEZVAL_NOT_SET;
            }
        }
        return null;
    }

    public static iL valueOf(String a2) {
        return Enum.valueOf(iL_3.class, a2);
    }

    public static iL[] values() {
        return (iL[])$VALUES.clone();
    }

    private iL_3(int n3) {
        int b2 = n3;
        iL_3 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static iL valueOf(int a2) {
        return iL_3.forNumber(a2);
    }

    static {
        iL_3[] iL_3Array = new iL_3[yRa.d];
        iL_3Array[uSa.E] = SCALEZ;
        iL_3Array[vRa.d] = SCALEZANIM;
        iL_3Array[uqa.g] = SCALEZVAL_NOT_SET;
        $VALUES = iL_3Array;
    }

    public int getNumber() {
        iL_3 a2;
        return a2.value;
    }
}

