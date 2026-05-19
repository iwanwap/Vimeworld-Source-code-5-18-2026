/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  EQa
 *  Qqa
 *  pQa
 *  vRa
 *  vpa
 */
public final class YT
extends Enum<YT> {
    private final rc shownStatusColor;
    public static final /* enum */ YT VIME_PASS;
    private final char symbol;
    private static final /* synthetic */ YT[] $VALUES;
    public static final /* enum */ YT CHEST_ONLY;
    public static final /* enum */ YT BUYABLE;
    public static final /* enum */ YT ARCHIVED;
    private final String shownStatus;

    public String getShownStatus() {
        YT a2;
        return a2.shownStatus;
    }

    /*
     * WARNING - void declaration
     */
    private YT(char c2, String string2, rc rc2) {
        Object d2;
        void b2;
        void c3;
        YT a2;
        YT yT = object;
        Object object = rc2;
        YT yT2 = a2 = yT;
        a2.symbol = c3;
        yT2.shownStatus = b2;
        yT2.shownStatusColor = d2;
    }

    public static YT valueOf(String a2) {
        return Enum.valueOf(YT.class, a2);
    }

    static {
        ARCHIVED = new YT((char)vpa.y, BQa.u, Bc.Ba);
        CHEST_ONLY = new YT((char)pQa.R, Qqa.Ga, Bc.Ba);
        VIME_PASS = new YT((char)EQa.U, rua.L, Bc.Ba);
        BUYABLE = new YT((char)fPa.i, Mqa.y, Bc.Ba);
        YT[] yTArray = new YT[AQa.P];
        yTArray[uSa.E] = ARCHIVED;
        yTArray[vRa.d] = CHEST_ONLY;
        yTArray[uqa.g] = VIME_PASS;
        yTArray[yRa.d] = BUYABLE;
        $VALUES = yTArray;
    }

    public static YT[] values() {
        return (YT[])$VALUES.clone();
    }

    public rc getShownStatusColor() {
        YT a2;
        return a2.shownStatusColor;
    }

    public char getSymbol() {
        YT a2;
        return a2.symbol;
    }
}

