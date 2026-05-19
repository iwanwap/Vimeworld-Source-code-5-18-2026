/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rO
 *  vRa
 */
public final class rO_1
extends Enum<rO> {
    public static final /* enum */ rO ISOMETRICCLICK;
    public static final /* enum */ rO ISOMETRICMOUSEPOSITION;
    public static final /* enum */ rO ACTION_NOT_SET;
    public static final /* enum */ rO CALLBACK;
    public static final /* enum */ rO RESOURCEREQUEST;
    private final int value;
    private static final /* synthetic */ rO[] $VALUES;

    /*
     * Enabled aggressive block sorting
     */
    public static rO forNumber(int a2) {
        switch (a2) {
            case 1: {
                return CALLBACK;
            }
            case 2: {
                return RESOURCEREQUEST;
            }
            case 3: {
                return ISOMETRICMOUSEPOSITION;
            }
            case 4: {
                return ISOMETRICCLICK;
            }
            case 0: {
                return ACTION_NOT_SET;
            }
        }
        return null;
    }

    public static rO valueOf(String a2) {
        return Enum.valueOf(rO_1.class, a2);
    }

    public int getNumber() {
        rO_1 a2;
        return a2.value;
    }

    private rO_1(int n3) {
        int b2 = n3;
        rO_1 a2 = this;
        a2.value = b2;
    }

    public static rO[] values() {
        return (rO[])$VALUES.clone();
    }

    static {
        CALLBACK = new rO_1(vRa.d);
        RESOURCEREQUEST = new rO_1(uqa.g);
        ISOMETRICMOUSEPOSITION = new rO_1(yRa.d);
        ISOMETRICCLICK = new rO_1(AQa.P);
        ACTION_NOT_SET = new rO_1(uSa.E);
        rO_1[] rO_1Array = new rO_1[tTa.h];
        rO_1Array[uSa.E] = CALLBACK;
        rO_1Array[vRa.d] = RESOURCEREQUEST;
        rO_1Array[uqa.g] = ISOMETRICMOUSEPOSITION;
        rO_1Array[yRa.d] = ISOMETRICCLICK;
        rO_1Array[AQa.P] = ACTION_NOT_SET;
        $VALUES = rO_1Array;
    }

    @Deprecated
    public static rO valueOf(int a2) {
        return rO_1.forNumber(a2);
    }
}

