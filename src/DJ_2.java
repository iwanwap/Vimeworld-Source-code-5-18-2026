/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DJ
 *  vRa
 */
public final class DJ_2
extends Enum<DJ> {
    private static final /* synthetic */ DJ[] $VALUES;
    public static final /* enum */ DJ ADD = new DJ_2(uqa.g);
    private final int value;
    public static final /* enum */ DJ DATA_NOT_SET;
    public static final /* enum */ DJ EDIT;
    public static final /* enum */ DJ REMOVE;

    @Deprecated
    public static DJ valueOf(int a2) {
        return DJ_2.forNumber(a2);
    }

    private DJ_2(int n3) {
        int b2 = n3;
        DJ_2 a2 = this;
        a2.value = b2;
    }

    static {
        REMOVE = new DJ_2(yRa.d);
        EDIT = new DJ_2(AQa.P);
        DATA_NOT_SET = new DJ_2(uSa.E);
        DJ_2[] dJ_2Array = new DJ_2[AQa.P];
        dJ_2Array[uSa.E] = ADD;
        dJ_2Array[vRa.d] = REMOVE;
        dJ_2Array[uqa.g] = EDIT;
        dJ_2Array[yRa.d] = DATA_NOT_SET;
        $VALUES = dJ_2Array;
    }

    public static DJ[] values() {
        return (DJ[])$VALUES.clone();
    }

    public static DJ forNumber(int a2) {
        switch (a2) {
            case 2: {
                return ADD;
            }
            case 3: {
                return REMOVE;
            }
            case 4: {
                return EDIT;
            }
            case 0: {
                while (false) {
                }
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    public static DJ valueOf(String a2) {
        return Enum.valueOf(DJ_2.class, a2);
    }

    public int getNumber() {
        DJ_2 a2;
        return a2.value;
    }
}

