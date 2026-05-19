/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  ERa
 *  Fpa
 *  KTa
 *  Lra
 *  NPa
 *  NTa
 *  Ppa
 *  Qsa
 *  Spa
 *  XTa
 *  Ypa
 *  cQa
 *  eS
 *  fpa
 *  lqa
 *  pPa
 *  pqa
 *  vRa
 *  wOa
 *  wPa
 */
public final class eS_1
extends Enum<eS> {
    public static final /* enum */ eS ARMS_ON_TOP;
    public static final /* enum */ eS EMOJI;
    public static final /* enum */ eS BODY;
    public static final /* enum */ eS PET;
    public static final /* enum */ eS PARTICLES;
    private final boolean combineable;
    public static final /* enum */ eS LEGS_ON_TOP;
    public static final /* enum */ eS BODY_FULL;
    public static final /* enum */ eS ARMS_FULL;
    public static final /* enum */ eS HEAD_ON_TOP;
    public static final /* enum */ eS ARMS;
    public static final /* enum */ eS PET_RIGHT;
    public static final /* enum */ eS LEGS_FULL;
    public static final /* enum */ eS LEGS;
    private static final /* synthetic */ eS[] $VALUES;
    public static final /* enum */ eS HEAD_DEFAULT;
    public static final /* enum */ eS PET_LEFT;
    public static final /* enum */ eS BODY_FRONT_TOP;
    public static final /* enum */ eS DEATH;
    public static final /* enum */ eS HEAD_FACE;
    private final String name;
    public static final /* enum */ eS BODY_FRONT_BOTTOM;
    public static final /* enum */ eS BODY_BACK;
    public static final /* enum */ eS HEAD;
    public static final /* enum */ eS LEGS_AROUND;
    public static final /* enum */ eS LEGS_DEFAULT;
    public static final /* enum */ eS ARMS_DEFAULT;
    public static final /* enum */ eS SHADOW;
    public static final /* enum */ eS EMOTE;
    public static final /* enum */ eS ARMOR;
    public static final /* enum */ eS ARMS_IN;
    public static final /* enum */ eS HEAD_FULL;
    public static final /* enum */ eS ARROW;
    private final boolean wearable;
    private final String textureName;
    public static final /* enum */ eS BODY_DEFAULT;

    static {
        HEAD = new eS_1(Ppa.x, WRa.q, vRa.d != 0, uSa.E != 0);
        HEAD_DEFAULT = new eS_1(Ppa.x, WRa.q, vRa.d != 0);
        HEAD_FULL = new eS_1(Ppa.x, WRa.q, vRa.d != 0);
        HEAD_ON_TOP = new eS_1(Ppa.x, WRa.q, vRa.d != 0);
        HEAD_FACE = new eS_1(Ppa.x, WRa.q, vRa.d != 0);
        BODY = new eS_1(nOa.q, Qsa.Ga, vRa.d != 0, uSa.E != 0);
        BODY_DEFAULT = new eS_1(nOa.q, Qsa.Ga, vRa.d != 0);
        BODY_FULL = new eS_1(nOa.q, Qsa.Ga, vRa.d != 0);
        BODY_BACK = new eS_1(nOa.q, Qsa.Ga, vRa.d != 0);
        BODY_FRONT_TOP = new eS_1(nOa.q, Qsa.Ga, vRa.d != 0);
        BODY_FRONT_BOTTOM = new eS_1(nOa.q, Qsa.Ga, vRa.d != 0);
        PET = new eS_1(NPa.m, fpa.y, vRa.d != 0);
        PET_LEFT = new eS_1(NPa.m, fpa.y, vRa.d != 0);
        PET_RIGHT = new eS_1(NPa.m, fpa.y, vRa.d != 0);
        ARMS = new eS_1(wPa.Ka, KTa.F, vRa.d != 0, uSa.E != 0);
        ARMS_DEFAULT = new eS_1(wPa.Ka, KTa.F, vRa.d != 0);
        ARMS_FULL = new eS_1(wPa.Ka, KTa.F, vRa.d != 0, uSa.E != 0);
        ARMS_ON_TOP = new eS_1(wPa.Ka, KTa.F, vRa.d != 0);
        ARMS_IN = new eS_1(wPa.Ka, KTa.F, vRa.d != 0);
        LEGS = new eS_1(ZSa.e, Fpa.p, vRa.d != 0, uSa.E != 0);
        LEGS_DEFAULT = new eS_1(ZSa.e, Fpa.p, vRa.d != 0, uSa.E != 0);
        LEGS_FULL = new eS_1(ZSa.e, Fpa.p, vRa.d != 0, uSa.E != 0);
        LEGS_ON_TOP = new eS_1(ZSa.e, Fpa.p, vRa.d != 0);
        LEGS_AROUND = new eS_1(ZSa.e, Fpa.p, vRa.d != 0);
        PARTICLES = new eS_1(Nra.J, gua.g, vRa.d != 0);
        ARMOR = new eS_1(Jqa.g, Ypa.R, vRa.d != 0, uSa.E != 0);
        SHADOW = new eS_1(EPa.U, Gta.ja, vRa.d != 0, uSa.E != 0);
        EMOTE = new eS_1(MRa.i, Nra.n, uSa.E != 0, uSa.E != 0);
        EMOJI = new eS_1(rta.H, Bsa.A, uSa.E != 0, uSa.E != 0);
        DEATH = new eS_1(NTa.u, wPa.m, vRa.d != 0, uSa.E != 0);
        ARROW = new eS_1(pqa.Y, Spa.k, vRa.d != 0, uSa.E != 0);
        eS_1[] eS_1Array = new eS_1[tua.U];
        eS_1Array[uSa.E] = HEAD;
        eS_1Array[vRa.d] = HEAD_DEFAULT;
        eS_1Array[uqa.g] = HEAD_FULL;
        eS_1Array[yRa.d] = HEAD_ON_TOP;
        eS_1Array[AQa.P] = HEAD_FACE;
        eS_1Array[tTa.h] = BODY;
        eS_1Array[uua.p] = BODY_DEFAULT;
        eS_1Array[XTa.W] = BODY_FULL;
        eS_1Array[Yqa.i] = BODY_BACK;
        eS_1Array[WOa.fa] = BODY_FRONT_TOP;
        eS_1Array[NTa.C] = BODY_FRONT_BOTTOM;
        eS_1Array[pPa.f] = PET;
        eS_1Array[lqa.s] = PET_LEFT;
        eS_1Array[uua.s] = PET_RIGHT;
        eS_1Array[hpa.Z] = ARMS;
        eS_1Array[Ypa.A] = ARMS_DEFAULT;
        eS_1Array[ERa.C] = ARMS_FULL;
        eS_1Array[yta.Ka] = ARMS_ON_TOP;
        eS_1Array[yOa.B] = ARMS_IN;
        eS_1Array[wOa.t] = LEGS;
        eS_1Array[kTa.j] = LEGS_DEFAULT;
        eS_1Array[wOa.h] = LEGS_FULL;
        eS_1Array[cQa.o] = LEGS_ON_TOP;
        eS_1Array[AQa.ba] = LEGS_AROUND;
        eS_1Array[osa.c] = PARTICLES;
        eS_1Array[kTa.g] = ARMOR;
        eS_1Array[ITa.E] = SHADOW;
        eS_1Array[Lra.e] = EMOTE;
        eS_1Array[EPa.O] = EMOJI;
        eS_1Array[ITa.A] = DEATH;
        eS_1Array[Fsa.d] = ARROW;
        $VALUES = eS_1Array;
    }

    public static eS[] values() {
        return (eS[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private eS_1(String string2, String string3, boolean bl) {
        void d2;
        void b2;
        void c2;
        boolean bl2 = bl;
        eS_1 a2 = this;
        a2((String)c2, (String)b2, (boolean)d2, vRa.d != 0);
    }

    public boolean isWearable() {
        eS_1 a2;
        return a2.wearable;
    }

    public String getTextureName() {
        eS_1 a2;
        return a2.textureName;
    }

    public static eS valueOf(String a2) {
        return Enum.valueOf(eS_1.class, a2);
    }

    public String getName() {
        eS_1 a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private eS_1(String string2, String string3, boolean bl, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        eS_1 a2;
        boolean bl3 = bl2;
        eS_1 eS_12 = a2 = this;
        eS_1 eS_13 = a2;
        eS_13.name = d2;
        eS_13.textureName = c2;
        eS_12.wearable = b2;
        eS_12.combineable = e2;
    }

    public boolean isEmote() {
        eS_1 a2;
        if (a2 == EMOTE || a2 == DEATH) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean isCombineable() {
        eS_1 a2;
        return a2.combineable;
    }

    public boolean isPet() {
        eS_1 a2;
        if (a2 == PET || a2 == PET_LEFT || a2 == PET_RIGHT) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

