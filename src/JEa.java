/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  NTa
 *  QSa
 *  Tpa
 *  WQa
 *  XTa
 *  Ypa
 *  Zua
 *  asa
 *  bqa
 *  cQa
 *  cRa
 *  fsa
 *  lqa
 *  mra
 *  pPa
 *  vRa
 *  wOa
 *  wra
 *  ysa
 */
public final class JEa
extends Enum<JEa> {
    public final String title;
    public static final /* enum */ JEa COURBET;
    public static final /* enum */ JEa VOID;
    public static final /* enum */ JEa BOMB;
    public static final /* enum */ JEa POOL;
    public static final /* enum */ JEa WITHER;
    public static final /* enum */ JEa FIGHTERS;
    public static final /* enum */ JEa WASTELAND;
    public static final /* enum */ JEa GRAHAM;
    public static final /* enum */ JEa AZTEC_2;
    public final int sizeY;
    public static final /* enum */ JEa KEBAB;
    public static final /* enum */ JEa SKELETON;
    public static final /* enum */ JEa CREEBET;
    public static final /* enum */ JEa DONKEY_KONG;
    public static final /* enum */ JEa BUST;
    public static final /* enum */ JEa MATCH;
    public final int offsetY;
    public final int sizeX;
    public static final /* enum */ JEa SUNSET;
    public static final /* enum */ JEa PLANT;
    public static final /* enum */ JEa SEA;
    public static final /* enum */ JEa AZTEC;
    public static final int field_180001_A;
    public static final /* enum */ JEa SKULL_AND_ROSES;
    public final int offsetX;
    public static final /* enum */ JEa POINTER;
    public static final /* enum */ JEa BURNING_SKULL;
    private static final /* synthetic */ JEa[] $VALUES;
    public static final /* enum */ JEa WANDERER;
    public static final /* enum */ JEa ALBAN;
    public static final /* enum */ JEa PIGSCENE;
    public static final /* enum */ JEa STAGE;

    public static JEa valueOf(String a2) {
        return Enum.valueOf(JEa.class, a2);
    }

    static {
        KEBAB = new JEa(asa.q, ERa.C, ERa.C, uSa.E, uSa.E);
        AZTEC = new JEa(kra.D, ERa.C, ERa.C, ERa.C, uSa.E);
        ALBAN = new JEa(bqa.X, ERa.C, ERa.C, fPa.i, uSa.E);
        AZTEC_2 = new JEa(TOa.Da, ERa.C, ERa.C, QSa.p, uSa.E);
        BOMB = new JEa(Zua.v, ERa.C, ERa.C, ysa.s, uSa.E);
        PLANT = new JEa(Tpa.A, ERa.C, ERa.C, Fua.J, uSa.E);
        WASTELAND = new JEa(iSa.l, ERa.C, ERa.C, zua.m, uSa.E);
        POOL = new JEa(Cra.U, fPa.i, ERa.C, uSa.E, fPa.i);
        COURBET = new JEa(csa.N, fPa.i, ERa.C, fPa.i, fPa.i);
        SEA = new JEa(dua.l, fPa.i, ERa.C, ysa.s, fPa.i);
        SUNSET = new JEa(fsa.s, fPa.i, ERa.C, zua.m, fPa.i);
        CREEBET = new JEa(Iqa.g, fPa.i, ERa.C, XOa.h, fPa.i);
        WANDERER = new JEa(wra.M, ERa.C, fPa.i, uSa.E, ysa.s);
        GRAHAM = new JEa(uqa.J, ERa.C, fPa.i, ERa.C, ysa.s);
        MATCH = new JEa(uua.r, fPa.i, fPa.i, uSa.E, XOa.h);
        BUST = new JEa(ZSa.k, fPa.i, fPa.i, fPa.i, XOa.h);
        STAGE = new JEa(sqa.G, fPa.i, fPa.i, ysa.s, XOa.h);
        VOID = new JEa(WQa.O, fPa.i, fPa.i, zua.m, XOa.h);
        SKULL_AND_ROSES = new JEa(Zra.ca, fPa.i, fPa.i, XOa.h, XOa.h);
        WITHER = new JEa(wra.y, fPa.i, fPa.i, rRa.f, XOa.h);
        FIGHTERS = new JEa(mra.a, ysa.s, fPa.i, uSa.E, zua.m);
        POINTER = new JEa(rSa.x, ysa.s, ysa.s, uSa.E, ppa.f);
        PIGSCENE = new JEa(dqa.Ja, ysa.s, ysa.s, ysa.s, ppa.f);
        BURNING_SKULL = new JEa(mra.N, ysa.s, ysa.s, XOa.h, ppa.f);
        SKELETON = new JEa(cRa.S, ysa.s, QSa.p, ppa.f, ysa.s);
        DONKEY_KONG = new JEa(XTa.ga, ysa.s, QSa.p, ppa.f, BRa.E);
        JEa[] jEaArray = new JEa[ITa.E];
        jEaArray[uSa.E] = KEBAB;
        jEaArray[vRa.d] = AZTEC;
        jEaArray[uqa.g] = ALBAN;
        jEaArray[yRa.d] = AZTEC_2;
        jEaArray[AQa.P] = BOMB;
        jEaArray[tTa.h] = PLANT;
        jEaArray[uua.p] = WASTELAND;
        jEaArray[XTa.W] = POOL;
        jEaArray[Yqa.i] = COURBET;
        jEaArray[WOa.fa] = SEA;
        jEaArray[NTa.C] = SUNSET;
        jEaArray[pPa.f] = CREEBET;
        jEaArray[lqa.s] = WANDERER;
        jEaArray[uua.s] = GRAHAM;
        jEaArray[hpa.Z] = MATCH;
        jEaArray[Ypa.A] = BUST;
        jEaArray[ERa.C] = STAGE;
        jEaArray[yta.Ka] = VOID;
        jEaArray[yOa.B] = SKULL_AND_ROSES;
        jEaArray[wOa.t] = WITHER;
        jEaArray[kTa.j] = FIGHTERS;
        jEaArray[wOa.h] = POINTER;
        jEaArray[cQa.o] = PIGSCENE;
        jEaArray[AQa.ba] = BURNING_SKULL;
        jEaArray[osa.c] = SKELETON;
        jEaArray[kTa.g] = DONKEY_KONG;
        $VALUES = jEaArray;
        field_180001_A = Zra.ca.length();
    }

    /*
     * WARNING - void declaration
     */
    private JEa(String string2, int n3, int n4, int n5, int n6) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        JEa a2;
        int n7 = n6;
        JEa jEa2 = a2 = this;
        JEa jEa3 = a2;
        a2.title = e2;
        jEa3.sizeX = d2;
        jEa3.sizeY = c2;
        jEa2.offsetX = b2;
        jEa2.offsetY = f2;
    }

    public static JEa[] values() {
        return (JEa[])$VALUES.clone();
    }
}

