/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class iM
extends Enum<iM> {
    private static final /* synthetic */ iM[] $VALUES;
    public static final /* enum */ iM DATA_NOT_SET;
    public static final /* enum */ iM REMOVEUUID;
    public static final /* enum */ iM REMOVE;
    public static final /* enum */ iM EDIT;
    private final int value;
    public static final /* enum */ iM ADD;

    public static iM[] values() {
        return (iM[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static iM forNumber(int a2) {
        switch (a2) {
            case 2: {
                return ADD;
            }
            case 3: {
                return REMOVE;
            }
            case 5: {
                return REMOVEUUID;
            }
            case 4: {
                return EDIT;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    private iM(int n3) {
        int b2 = n3;
        iM a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static iM valueOf(int a2) {
        return iM.forNumber(a2);
    }

    public int getNumber() {
        iM a2;
        return a2.value;
    }

    static {
        ADD = new iM(uqa.g);
        REMOVE = new iM(yRa.d);
        REMOVEUUID = new iM(tTa.h);
        EDIT = new iM(AQa.P);
        DATA_NOT_SET = new iM(uSa.E);
        iM[] iMArray = new iM[tTa.h];
        iMArray[uSa.E] = ADD;
        iMArray[vRa.d] = REMOVE;
        iMArray[uqa.g] = REMOVEUUID;
        iMArray[yRa.d] = EDIT;
        iMArray[AQa.P] = DATA_NOT_SET;
        $VALUES = iMArray;
    }

    public static iM valueOf(String a2) {
        return Enum.valueOf(iM.class, a2);
    }
}

