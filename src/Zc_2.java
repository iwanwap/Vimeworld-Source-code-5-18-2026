/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Qsa
 *  Zc
 *  bSa
 *  vRa
 *  ysa
 */
public final class Zc_2
extends Enum<Zc> {
    private final String genitiveSingular;
    private static int VIMERS;
    private final char symbol;
    private final String genitivePlural;
    public static final /* enum */ Zc VIMER;
    private static int COINS;
    private static final /* synthetic */ Zc[] $VALUES;
    public static final /* enum */ Zc COIN;
    private final rc color;
    private final String nominative;

    public rc getColor() {
        Zc_2 a2;
        return a2.color;
    }

    public String getGenitivePlural() {
        Zc_2 a2;
        return a2.genitivePlural;
    }

    public static Zc[] values() {
        return (Zc[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public String plurals(int n2, boolean bl) {
        void b2;
        Zc_2 a2;
        boolean c2 = bl;
        Zc_2 zc_2 = a2 = this;
        return Sg.J((int)b2, zc_2.nominative, zc_2.genitiveSingular, a2.genitivePlural, c2);
    }

    public static void setCoins(int a2) {
        COINS = a2;
    }

    static {
        COIN = new Zc_2((char)vqa.ga, ysa.X, PRa.N, mSa.fa, Bc.ea);
        VIMER = new Zc_2((char)SPa.K, bSa.y, Qsa.S, Zra.m, Bc.H);
        Zc_2[] zc_2Array = new Zc_2[uqa.g];
        zc_2Array[uSa.E] = COIN;
        zc_2Array[vRa.d] = VIMER;
        $VALUES = zc_2Array;
        COINS = uSa.E;
        VIMERS = uSa.E;
    }

    public String getNominative() {
        Zc_2 a2;
        return a2.nominative;
    }

    public static Zc valueOf(String a2) {
        return Enum.valueOf(Zc_2.class, a2);
    }

    public char getSymbol() {
        Zc_2 a2;
        return a2.symbol;
    }

    /*
     * WARNING - void declaration
     */
    private Zc_2(char c2, String string2, String string3, String string4, rc rc2) {
        Object f2;
        void c3;
        void b2;
        void d2;
        void e2;
        Zc_2 a2;
        Zc_2 zc_2 = object;
        Object object = rc2;
        Zc_2 zc_22 = a2 = zc_2;
        Zc_2 zc_23 = a2;
        a2.symbol = e2;
        zc_23.nominative = d2;
        zc_23.genitivePlural = b2;
        zc_22.genitiveSingular = c3;
        zc_22.color = f2;
    }

    public String plurals(int n2) {
        int b2 = n2;
        Zc_2 a2 = this;
        return a2.plurals(b2, uSa.E != 0);
    }

    public static int getCoins() {
        return COINS;
    }

    public static int getVimers() {
        return VIMERS;
    }

    public static void setVimers(int a2) {
        VIMERS = a2;
    }

    public String getGenitiveSingular() {
        Zc_2 a2;
        return a2.genitiveSingular;
    }
}

