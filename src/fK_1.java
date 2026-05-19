/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  XTa
 *  fK
 *  vRa
 */
public final class fK_1
extends Enum<fK> {
    public static final /* enum */ fK INVENTORYNAME;
    public static final /* enum */ fK GUITYPE;
    public static final /* enum */ fK ENTITYTYPE;
    private final int value;
    public static final /* enum */ fK CLASSNAME;
    public static final /* enum */ fK KEY;
    public static final /* enum */ fK DATA_NOT_SET;
    private static final /* synthetic */ fK[] $VALUES;
    public static final /* enum */ fK ELEMENTID;

    /*
     * Enabled aggressive block sorting
     */
    public static fK forNumber(int a2) {
        switch (a2) {
            case 3: {
                return GUITYPE;
            }
            case 4: {
                return ELEMENTID;
            }
            case 5: {
                return KEY;
            }
            case 6: {
                return INVENTORYNAME;
            }
            case 9: {
                return CLASSNAME;
            }
            case 10: {
                return ENTITYTYPE;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        fK_1 a2;
        return a2.value;
    }

    @Deprecated
    public static fK valueOf(int a2) {
        return fK_1.forNumber(a2);
    }

    public static fK valueOf(String a2) {
        return Enum.valueOf(fK_1.class, a2);
    }

    public static fK[] values() {
        return (fK[])$VALUES.clone();
    }

    static {
        GUITYPE = new fK_1(yRa.d);
        ELEMENTID = new fK_1(AQa.P);
        KEY = new fK_1(tTa.h);
        INVENTORYNAME = new fK_1(uua.p);
        CLASSNAME = new fK_1(WOa.fa);
        ENTITYTYPE = new fK_1(NTa.C);
        DATA_NOT_SET = new fK_1(uSa.E);
        fK_1[] fK_1Array = new fK_1[XTa.W];
        fK_1Array[uSa.E] = GUITYPE;
        fK_1Array[vRa.d] = ELEMENTID;
        fK_1Array[uqa.g] = KEY;
        fK_1Array[yRa.d] = INVENTORYNAME;
        fK_1Array[AQa.P] = CLASSNAME;
        fK_1Array[tTa.h] = ENTITYTYPE;
        fK_1Array[uua.p] = DATA_NOT_SET;
        $VALUES = fK_1Array;
    }

    private fK_1(int n3) {
        int b2 = n3;
        fK_1 a2 = this;
        a2.value = b2;
    }
}

