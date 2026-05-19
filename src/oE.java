/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  vRa
 */
public final class oE
extends Enum<oE> {
    public static final /* enum */ oE LIME;
    public static final /* enum */ oE SKY_BLUE;
    private final rc subtitleColor;
    private static final /* synthetic */ oE[] $VALUES;
    private final rc background;
    private final rc border;
    public static final /* enum */ oE YELLOW;
    private final rc titleColor;

    public static oE valueOf(String a2) {
        return Enum.valueOf(oE.class, a2);
    }

    public rc getBackground() {
        oE a2;
        return a2.background;
    }

    static {
        YELLOW = new oE(Bc.Ba, Bc.Ba, Bc.oa, Bc.S);
        LIME = new oE(Bc.Ba, Bc.Ba, Bc.Ya, Bc.k);
        SKY_BLUE = new oE(Bc.Ba, Bc.Ba, Bc.I, Bc.sb);
        oE[] oEArray = new oE[yRa.d];
        oEArray[uSa.E] = YELLOW;
        oEArray[vRa.d] = LIME;
        oEArray[uqa.g] = SKY_BLUE;
        $VALUES = oEArray;
    }

    /*
     * WARNING - void declaration
     */
    private oE(rc rc2, rc rc3, rc rc4, rc rc5) {
        Object e2;
        void b2;
        void c2;
        void d2;
        oE a2;
        oE oE2 = object;
        Object object = rc5;
        oE oE3 = a2 = oE2;
        oE oE4 = a2;
        oE4.titleColor = d2;
        oE4.subtitleColor = c2;
        oE3.background = b2;
        oE3.border = e2;
    }

    public static oE[] values() {
        return (oE[])$VALUES.clone();
    }

    public rc getBorder() {
        oE a2;
        return a2.border;
    }

    public rc getSubtitleColor() {
        oE a2;
        return a2.subtitleColor;
    }

    public rc getTitleColor() {
        oE a2;
        return a2.titleColor;
    }
}

