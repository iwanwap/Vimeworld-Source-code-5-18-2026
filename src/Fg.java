/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  vRa
 */
public final class Fg
extends Enum<Fg> {
    private final rc backgroundHover;
    private final rc borderHover;
    public static final /* enum */ Fg LIME;
    public static final /* enum */ Fg YELLOW;
    private final rc background;
    private final rc border;
    private final rc foregroundHover;
    public static final /* enum */ Fg WHITE;
    public static final /* enum */ Fg SKY_BLUE;
    private static final /* synthetic */ Fg[] $VALUES;
    private final rc foreground;

    public rc getBorder() {
        Fg a2;
        return a2.border;
    }

    public static Fg valueOf(String a2) {
        return Enum.valueOf(Fg.class, a2);
    }

    public static Fg[] values() {
        return (Fg[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private Fg(rc rc2, rc rc3, rc rc4, rc rc5, rc rc6, rc rc7) {
        Object g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        Fg a2;
        Fg fg2 = object;
        Object object = rc7;
        Fg fg3 = a2 = fg2;
        Fg fg4 = a2;
        Fg fg5 = a2;
        fg5.foreground = f2;
        fg5.foregroundHover = e2;
        fg4.background = d2;
        fg4.backgroundHover = c2;
        fg3.border = b2;
        fg3.borderHover = g2;
    }

    public rc getForeground() {
        Fg a2;
        return a2.foreground;
    }

    public rc getBorderHover() {
        Fg a2;
        return a2.borderHover;
    }

    public rc getBackgroundHover() {
        Fg a2;
        return a2.backgroundHover;
    }

    public rc getBackground() {
        Fg a2;
        return a2.background;
    }

    public rc getForegroundHover() {
        Fg a2;
        return a2.foregroundHover;
    }

    static {
        YELLOW = new Fg(Bc.Ba, Bc.Ba, Bc.V, Bc.qc, Bc.Ta, Bc.V);
        LIME = new Fg(Bc.Ba, Bc.Ba, Bc.va, Bc.r, Bc.na, Bc.va);
        SKY_BLUE = new Fg(Bc.Ba, Bc.Ba, Bc.f, Bc.p, Bc.Bb, Bc.f);
        WHITE = new Fg(Bc.A, Bc.A, Bc.Ba, Bc.sa, Bc.qa, Bc.E);
        Fg[] fgArray = new Fg[AQa.P];
        fgArray[uSa.E] = YELLOW;
        fgArray[vRa.d] = LIME;
        fgArray[uqa.g] = SKY_BLUE;
        fgArray[yRa.d] = WHITE;
        $VALUES = fgArray;
    }
}

