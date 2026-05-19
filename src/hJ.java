/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class hJ
extends Enum<hJ> {
    public static final /* enum */ hJ XANIM;
    public static final /* enum */ hJ XVAL_NOT_SET;
    private static final /* synthetic */ hJ[] $VALUES;
    public static final /* enum */ hJ X;
    private final int value;

    public static hJ valueOf(String a2) {
        return Enum.valueOf(hJ.class, a2);
    }

    private hJ(int n3) {
        int b2 = n3;
        hJ a2 = this;
        a2.value = b2;
    }

    public int getNumber() {
        hJ a2;
        return a2.value;
    }

    static {
        X = new hJ(vRa.d);
        XANIM = new hJ(uqa.g);
        XVAL_NOT_SET = new hJ(uSa.E);
        hJ[] hJArray = new hJ[yRa.d];
        hJArray[uSa.E] = X;
        hJArray[vRa.d] = XANIM;
        hJArray[uqa.g] = XVAL_NOT_SET;
        $VALUES = hJArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static hJ forNumber(int a2) {
        switch (a2) {
            case 1: {
                return X;
            }
            case 2: {
                return XANIM;
            }
            case 0: {
                return XVAL_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static hJ valueOf(int a2) {
        return hJ.forNumber(a2);
    }

    public static hJ[] values() {
        return (hJ[])$VALUES.clone();
    }
}

