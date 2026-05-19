/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  ES
 *  Epa
 *  FPa
 *  Gua
 *  NTa
 *  Ppa
 *  Qta
 *  Ssa
 *  TU
 *  XTa
 *  YSa
 *  cQa
 *  eS
 *  hTa
 *  jRa
 *  lqa
 *  pPa
 *  vRa
 *  wOa
 *  wPa
 */
public final class TU_1
extends Enum<TU> {
    public static final /* enum */ TU BODY;
    public static final /* enum */ TU HEAD;
    public static final /* enum */ TU PET;
    private final char symbol;
    public static final /* enum */ TU HOME;
    private static final /* synthetic */ TU[] $VALUES;
    public static final /* enum */ TU AURAS;
    private final boolean isNew;
    private final boolean shown;
    public static final /* enum */ TU ARMS;
    public static final /* enum */ TU DEATH;
    public static final /* enum */ TU ARROWS;
    private final eS[] categories;
    private final String displayName;
    public static final /* enum */ TU GRAFFITI;
    public static final /* enum */ TU EMOTES;
    public static final /* enum */ TU ARMOR;
    public static final /* enum */ TU PARTICLES;
    public static final /* enum */ TU LEGS;

    public static TU[] values() {
        return (TU[])$VALUES.clone();
    }

    public char getSymbol() {
        TU_1 a2;
        return a2.symbol;
    }

    /*
     * WARNING - void declaration
     */
    private TU_1(String string2, char c2, boolean bl, boolean bl2, eS ... eSArray) {
        void b2;
        eS[] f2;
        void d2;
        void c3;
        void e2;
        eS[] eSArray2 = eSArray3;
        eS[] eSArray3 = eSArray;
        eS[] a2 = eSArray2;
        a2.displayName = e2;
        a2.shown = c3;
        a2.symbol = d2;
        a2.categories = f2;
        a2.isNew = b2;
    }

    public String getDisplayName() {
        TU_1 a2;
        return a2.displayName;
    }

    public boolean isNew() {
        TU_1 a2;
        return a2.isNew;
    }

    /*
     * WARNING - void declaration
     */
    private TU_1(String string2, char c2, boolean bl, eS ... eSArray) {
        eS[] e2;
        void b2;
        void c3;
        void d2;
        eS[] eSArray2 = eSArray3;
        eS[] eSArray3 = eSArray;
        eS[] a2 = eSArray2;
    }

    public static TU valueOf(String a2) {
        return Enum.valueOf(TU_1.class, a2);
    }

    public boolean isShown() {
        TU_1 a2;
        return a2.shown;
    }

    public eS[] getCategories() {
        TU_1 a2;
        return a2.categories;
    }

    static {
        HOME = new TU_1(Qta.Ka, (char)ypa.N, vRa.d != 0, eS.values());
        HEAD = new TU_1(Ppa.x, (char)wOa.ca, vRa.d != 0, ES.HEAD.getSubtypes());
        BODY = new TU_1(nOa.q, (char)ZSa.g, vRa.d != 0, ES.BODY.getSubtypes());
        LEGS = new TU_1(ZSa.e, (char)jRa.e, vRa.d != 0, ES.LEGS.getSubtypes());
        ARMS = new TU_1(wPa.Ka, (char)ppa.T, vRa.d != 0, ES.ARMS.getSubtypes());
        eS[] eSArray = new eS[vRa.d];
        eSArray[uSa.E] = eS.PET;
        PET = new TU_1(FRa.Y, (char)FPa.H, vRa.d != 0, eSArray);
        eS[] eSArray2 = new eS[vRa.d];
        eSArray2[uSa.E] = eS.SHADOW;
        AURAS = new TU_1(Gua.ja, (char)ERa.Ha, vRa.d != 0, eSArray2);
        eS[] eSArray3 = new eS[vRa.d];
        eSArray3[uSa.E] = eS.PARTICLES;
        PARTICLES = new TU_1(Nra.J, (char)wsa.A, vRa.d != 0, eSArray3);
        GRAFFITI = new TU_1(vRa.p, (char)Epa.Y, uSa.E != 0, new eS[uSa.E]);
        eS[] eSArray4 = new eS[vRa.d];
        eSArray4[uSa.E] = eS.ARROW;
        ARROWS = new TU_1(hTa.x, (char)uSa.G, vRa.d != 0, eSArray4);
        eS[] eSArray5 = new eS[vRa.d];
        eSArray5[uSa.E] = eS.EMOTE;
        EMOTES = new TU_1(xua.a, (char)Ssa.k, vRa.d != 0, eSArray5);
        eS[] eSArray6 = new eS[vRa.d];
        eSArray6[uSa.E] = eS.ARMOR;
        ARMOR = new TU_1(Jqa.g, (char)cQa.ja, vRa.d != 0, eSArray6);
        eS[] eSArray7 = new eS[vRa.d];
        eSArray7[uSa.E] = eS.DEATH;
        DEATH = new TU_1(YSa.J, (char)tpa.K, vRa.d != 0, vRa.d != 0, eSArray7);
        TU_1[] tU_1Array = new TU_1[uua.s];
        tU_1Array[uSa.E] = HOME;
        tU_1Array[vRa.d] = HEAD;
        tU_1Array[uqa.g] = BODY;
        tU_1Array[yRa.d] = LEGS;
        tU_1Array[AQa.P] = ARMS;
        tU_1Array[tTa.h] = PET;
        tU_1Array[uua.p] = AURAS;
        tU_1Array[XTa.W] = PARTICLES;
        tU_1Array[Yqa.i] = GRAFFITI;
        tU_1Array[WOa.fa] = ARROWS;
        tU_1Array[NTa.C] = EMOTES;
        tU_1Array[pPa.f] = ARMOR;
        tU_1Array[lqa.s] = DEATH;
        $VALUES = tU_1Array;
    }
}

