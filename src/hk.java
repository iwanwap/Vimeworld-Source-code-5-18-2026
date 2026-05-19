/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  vRa
 */
public final class hk
extends Enum<hk> {
    public static final /* enum */ hk ANGLEXANIMSMART;
    private static final /* synthetic */ hk[] $VALUES;
    public static final /* enum */ hk ANGLEXANIM;
    public static final /* enum */ hk ANGLEX;
    private final int value;
    public static final /* enum */ hk ANGLEXVAL_NOT_SET;

    public static hk valueOf(String a2) {
        return Enum.valueOf(hk.class, a2);
    }

    @Deprecated
    public static hk valueOf(int a2) {
        return hk.forNumber(a2);
    }

    public static hk[] values() {
        return (hk[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static hk forNumber(int a2) {
        switch (a2) {
            case 8: {
                return ANGLEX;
            }
            case 9: {
                return ANGLEXANIM;
            }
            case 10: {
                return ANGLEXANIMSMART;
            }
            case 0: {
                return ANGLEXVAL_NOT_SET;
            }
        }
        return null;
    }

    static {
        ANGLEX = new hk(Yqa.i);
        ANGLEXANIM = new hk(WOa.fa);
        ANGLEXANIMSMART = new hk(NTa.C);
        ANGLEXVAL_NOT_SET = new hk(uSa.E);
        hk[] hkArray = new hk[AQa.P];
        hkArray[uSa.E] = ANGLEX;
        hkArray[vRa.d] = ANGLEXANIM;
        hkArray[uqa.g] = ANGLEXANIMSMART;
        hkArray[yRa.d] = ANGLEXVAL_NOT_SET;
        $VALUES = hkArray;
    }

    public int getNumber() {
        hk a2;
        return a2.value;
    }

    private hk(int n3) {
        int b2 = n3;
        hk a2 = this;
        a2.value = b2;
    }
}

