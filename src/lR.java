/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQ
 *  Nj
 *  vRa
 */
public final class lR
extends Enum<lR> {
    public static final /* enum */ lR BREAK_WORD;
    private static final /* synthetic */ lR[] $VALUES;
    public static final /* enum */ lR NORMAL;
    public static final /* enum */ lR NO_WRAP;

    public static lR valueOf(String a2) {
        return Enum.valueOf(lR.class, a2);
    }

    private lR() {
        int a2 = n2;
        lR lR2 = this;
    }

    static {
        NO_WRAP = new lR();
        NORMAL = new lR();
        BREAK_WORD = new lR();
        lR[] lRArray = new lR[yRa.d];
        lRArray[uSa.E] = NO_WRAP;
        lRArray[vRa.d] = NORMAL;
        lRArray[uqa.g] = BREAK_WORD;
        $VALUES = lRArray;
    }

    public static lR[] values() {
        return (lR[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static lR fromProto(Nj a2) {
        switch (EQ.J[a2.ordinal()]) {
            case 1: {
                return NO_WRAP;
            }
            case 2: {
                return NORMAL;
            }
        }
        return NO_WRAP;
    }
}

