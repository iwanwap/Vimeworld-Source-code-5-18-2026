/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  vRa
 */
public final class PO
extends Enum<PO> {
    private static final /* synthetic */ PO[] $VALUES;
    public static final /* enum */ PO MASKIMAGE_NOT_SET;
    public static final /* enum */ PO MASKIMAGERESOURCE;
    public static final /* enum */ PO MASKIMAGEPATH;
    public static final /* enum */ PO MASKELEMENT;
    private final int value;

    public int getNumber() {
        PO a2;
        return a2.value;
    }

    public static PO forNumber(int a2) {
        switch (a2) {
            case 6: {
                return MASKIMAGEPATH;
            }
            case 7: {
                return MASKIMAGERESOURCE;
            }
            case 9: {
                return MASKELEMENT;
            }
            case 0: {
                while (false) {
                }
                return MASKIMAGE_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static PO valueOf(int a2) {
        return PO.forNumber(a2);
    }

    public static PO valueOf(String a2) {
        return Enum.valueOf(PO.class, a2);
    }

    public static PO[] values() {
        return (PO[])$VALUES.clone();
    }

    static {
        MASKIMAGEPATH = new PO(uua.p);
        MASKIMAGERESOURCE = new PO(XTa.W);
        MASKELEMENT = new PO(WOa.fa);
        MASKIMAGE_NOT_SET = new PO(uSa.E);
        PO[] pOArray = new PO[AQa.P];
        pOArray[uSa.E] = MASKIMAGEPATH;
        pOArray[vRa.d] = MASKIMAGERESOURCE;
        pOArray[uqa.g] = MASKELEMENT;
        pOArray[yRa.d] = MASKIMAGE_NOT_SET;
        $VALUES = pOArray;
    }

    private PO(int n3) {
        int b2 = n3;
        PO a2 = this;
        a2.value = b2;
    }
}

