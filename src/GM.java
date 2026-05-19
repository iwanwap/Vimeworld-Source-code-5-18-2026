/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class GM
extends Enum<GM> {
    private static final /* synthetic */ GM[] $VALUES;
    private final int value;
    public static final /* enum */ GM ELEMENTID2D;
    public static final /* enum */ GM CALLBACK;
    public static final /* enum */ GM DATA_NOT_SET;
    public static final /* enum */ GM MESSAGE;
    public static final /* enum */ GM UNBIND;

    public int getNumber() {
        GM a2;
        return a2.value;
    }

    private GM(int n3) {
        int b2 = n3;
        GM a2 = this;
        a2.value = b2;
    }

    public static GM valueOf(String a2) {
        return Enum.valueOf(GM.class, a2);
    }

    @Deprecated
    public static GM valueOf(int a2) {
        return GM.forNumber(a2);
    }

    static {
        CALLBACK = new GM(uqa.g);
        UNBIND = new GM(yRa.d);
        ELEMENTID2D = new GM(AQa.P);
        MESSAGE = new GM(tTa.h);
        DATA_NOT_SET = new GM(uSa.E);
        GM[] gMArray = new GM[tTa.h];
        gMArray[uSa.E] = CALLBACK;
        gMArray[vRa.d] = UNBIND;
        gMArray[uqa.g] = ELEMENTID2D;
        gMArray[yRa.d] = MESSAGE;
        gMArray[AQa.P] = DATA_NOT_SET;
        $VALUES = gMArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static GM forNumber(int a2) {
        switch (a2) {
            case 2: {
                return CALLBACK;
            }
            case 3: {
                return UNBIND;
            }
            case 4: {
                return ELEMENTID2D;
            }
            case 5: {
                return MESSAGE;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    public static GM[] values() {
        return (GM[])$VALUES.clone();
    }
}

