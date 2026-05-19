/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SQa
 *  bRa
 *  vRa
 *  vu
 */
public final class pR
extends Enum<pR> {
    public static final /* enum */ pR HOLD = new pR(tTa.p);
    public static final /* enum */ pR TOGGLE = new pR(SQa.fa);
    private static final /* synthetic */ pR[] $VALUES;
    public final String display;
    public static final /* enum */ pR ALWAYS = new pR(bRa.j);
    public static final pR[] values;

    public static pR[] values() {
        return (pR[])$VALUES.clone();
    }

    public static pR valueOf(String a2) {
        return Enum.valueOf(pR.class, a2);
    }

    private pR(String string2) {
        Object b2 = string2;
        pR a2 = this;
        a2.display = b2;
    }

    static {
        pR[] pRArray = new pR[yRa.d];
        pRArray[uSa.E] = HOLD;
        pRArray[vRa.d] = TOGGLE;
        pRArray[uqa.g] = ALWAYS;
        $VALUES = pRArray;
        values = pR.values();
    }

    /*
     * Enabled aggressive block sorting
     */
    public pR next() {
        pR a2;
        switch (vu.I[a2.ordinal()]) {
            case 1: {
                return TOGGLE;
            }
            case 2: {
                return ALWAYS;
            }
            case 3: {
                return HOLD;
            }
        }
        return HOLD;
    }
}

