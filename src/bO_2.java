/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bO
 *  vRa
 */
public final class bO_2
extends Enum<bO> {
    public static final /* enum */ bO ARCHIVE_NOT_SET;
    private final int value;
    private static final /* synthetic */ bO[] $VALUES;
    public static final /* enum */ bO RESOURCE;
    public static final /* enum */ bO PATH;

    static {
        PATH = new bO_2(vRa.d);
        RESOURCE = new bO_2(uqa.g);
        ARCHIVE_NOT_SET = new bO_2(uSa.E);
        bO_2[] bO_2Array = new bO_2[yRa.d];
        bO_2Array[uSa.E] = PATH;
        bO_2Array[vRa.d] = RESOURCE;
        bO_2Array[uqa.g] = ARCHIVE_NOT_SET;
        $VALUES = bO_2Array;
    }

    @Deprecated
    public static bO valueOf(int a2) {
        return bO_2.forNumber(a2);
    }

    private bO_2(int n3) {
        int b2 = n3;
        bO_2 a2 = this;
        a2.value = b2;
    }

    public static bO valueOf(String a2) {
        return Enum.valueOf(bO_2.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bO forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PATH;
            }
            case 2: {
                return RESOURCE;
            }
            case 0: {
                return ARCHIVE_NOT_SET;
            }
        }
        return null;
    }

    public static bO[] values() {
        return (bO[])$VALUES.clone();
    }

    public int getNumber() {
        bO_2 a2;
        return a2.value;
    }
}

