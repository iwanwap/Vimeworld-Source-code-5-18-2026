/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  ERa
 *  ISa
 *  JSa
 *  LQa
 *  Lqa
 *  Lra
 *  NOa
 *  NTa
 *  Qsa
 *  RPa
 *  SQa
 *  Spa
 *  TQa
 *  Tpa
 *  UZ
 *  Uta
 *  XTa
 *  YSa
 *  Ypa
 *  ZRa
 *  aqa
 *  bRa
 *  cQa
 *  cRa
 *  fpa
 *  jsa
 *  kPa
 *  lqa
 *  oqa
 *  pPa
 *  ura
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  yQa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public final class UZ_2
extends Enum<UZ> {
    public static final /* enum */ UZ SPELL_MOB_AMBIENT;
    public static final /* enum */ UZ PORTAL;
    public static final /* enum */ UZ FLAME;
    public static final /* enum */ UZ WATER_WAKE;
    public static final /* enum */ UZ SNOWBALL;
    private final String particleName;
    public static final /* enum */ UZ ITEM_CRACK;
    public static final /* enum */ UZ SPELL;
    public static final /* enum */ UZ SPELL_WITCH;
    public static final /* enum */ UZ WATER_DROP;
    public static final /* enum */ UZ BLOCK_CRACK;
    public static final /* enum */ UZ CLOUD;
    public static final /* enum */ UZ CRIT;
    public static final /* enum */ UZ EXPLOSION_LARGE;
    public static final /* enum */ UZ FIREWORKS_SPARK;
    private final boolean shouldIgnoreRange;
    public static final /* enum */ UZ SPELL_INSTANT;
    public static final /* enum */ UZ WATER_SPLASH;
    public static final /* enum */ UZ HEART;
    public static final /* enum */ UZ SPELL_MOB;
    private final int particleID;
    public static final /* enum */ UZ MOB_APPEARANCE;
    public static final /* enum */ UZ VILLAGER_HAPPY;
    public static final /* enum */ UZ ITEM_TAKE;
    public static final /* enum */ UZ ENCHANTMENT_TABLE;
    public static final /* enum */ UZ SMOKE_NORMAL;
    private static final String[] PARTICLE_NAMES;
    public static final /* enum */ UZ WATER_BUBBLE;
    public static final /* enum */ UZ DRIP_LAVA;
    public static final /* enum */ UZ EXPLOSION_HUGE;
    public static final /* enum */ UZ SLIME;
    public static final /* enum */ UZ SNOW_SHOVEL;
    public static final /* enum */ UZ LAVA;
    private static final /* synthetic */ UZ[] $VALUES;
    public static final /* enum */ UZ FOOTSTEP;
    public static final /* enum */ UZ SUSPENDED_DEPTH;
    public static final /* enum */ UZ BLOCK_DUST;
    public static final /* enum */ UZ VILLAGER_ANGRY;
    private static final Map<Integer, UZ> PARTICLES;
    public static final /* enum */ UZ NOTE;
    public static final /* enum */ UZ TOWN_AURA;
    public static final /* enum */ UZ REDSTONE;
    public static final /* enum */ UZ EXPLOSION_NORMAL;
    public static final /* enum */ UZ CRIT_MAGIC;
    public static final /* enum */ UZ DRIP_WATER;
    public static final /* enum */ UZ BARRIER;
    public static final /* enum */ UZ SUSPENDED;
    private final int argumentCount;
    public static final /* enum */ UZ SMOKE_LARGE;

    public int getArgumentCount() {
        UZ_2 a2;
        return a2.argumentCount;
    }

    /*
     * WARNING - void declaration
     */
    private UZ_2(String string2, int n3, boolean bl, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        UZ_2 a2;
        int n5 = n4;
        UZ_2 uZ_2 = a2 = this;
        UZ_2 uZ_22 = a2;
        uZ_22.particleName = d2;
        uZ_22.particleID = c2;
        uZ_2.shouldIgnoreRange = b2;
        uZ_2.argumentCount = e2;
    }

    static {
        int n2;
        EXPLOSION_NORMAL = new UZ_2(Uta.t, uSa.E, vRa.d != 0);
        EXPLOSION_LARGE = new UZ_2(ZRa.Ja, vRa.d, vRa.d != 0);
        EXPLOSION_HUGE = new UZ_2(Bta.n, uqa.g, vRa.d != 0);
        FIREWORKS_SPARK = new UZ_2(bRa.h, yRa.d, uSa.E != 0);
        WATER_BUBBLE = new UZ_2(Wqa.ha, AQa.P, uSa.E != 0);
        WATER_SPLASH = new UZ_2(Cqa.J, tTa.h, uSa.E != 0);
        WATER_WAKE = new UZ_2(lqa.la, uua.p, uSa.E != 0);
        SUSPENDED = new UZ_2(ura.S, XTa.W, uSa.E != 0);
        SUSPENDED_DEPTH = new UZ_2(mSa.Ha, Yqa.i, uSa.E != 0);
        CRIT = new UZ_2(mSa.E, WOa.fa, uSa.E != 0);
        CRIT_MAGIC = new UZ_2(mSa.v, NTa.C, uSa.E != 0);
        SMOKE_NORMAL = new UZ_2(NOa.p, pPa.f, uSa.E != 0);
        SMOKE_LARGE = new UZ_2(TOa.o, lqa.s, uSa.E != 0);
        SPELL = new UZ_2(RPa.Fa, uua.s, uSa.E != 0);
        SPELL_INSTANT = new UZ_2(kPa.O, hpa.Z, uSa.E != 0);
        SPELL_MOB = new UZ_2(cRa.G, Ypa.A, uSa.E != 0);
        SPELL_MOB_AMBIENT = new UZ_2(kra.l, ERa.C, uSa.E != 0);
        SPELL_WITCH = new UZ_2(QTa.r, yta.Ka, uSa.E != 0);
        DRIP_WATER = new UZ_2(AQa.z, yOa.B, uSa.E != 0);
        DRIP_LAVA = new UZ_2(rQa.R, wOa.t, uSa.E != 0);
        VILLAGER_ANGRY = new UZ_2(zpa.O, kTa.j, uSa.E != 0);
        VILLAGER_HAPPY = new UZ_2(oqa.ja, wOa.h, uSa.E != 0);
        TOWN_AURA = new UZ_2(YSa.N, cQa.o, uSa.E != 0);
        NOTE = new UZ_2(JSa.W, AQa.ba, uSa.E != 0);
        PORTAL = new UZ_2(SQa.Q, osa.c, uSa.E != 0);
        ENCHANTMENT_TABLE = new UZ_2(bRa.X, kTa.g, uSa.E != 0);
        FLAME = new UZ_2(Lqa.j, ITa.E, uSa.E != 0);
        LAVA = new UZ_2(vQa.l, Lra.e, uSa.E != 0);
        FOOTSTEP = new UZ_2(Spa.Fa, EPa.O, uSa.E != 0);
        CLOUD = new UZ_2(wra.z, ITa.A, uSa.E != 0);
        REDSTONE = new UZ_2(KQa.f, Fsa.d, uSa.E != 0);
        SNOWBALL = new UZ_2(DQa.V, tua.U, uSa.E != 0);
        SNOW_SHOVEL = new UZ_2(tTa.ca, fPa.i, uSa.E != 0);
        SLIME = new UZ_2(DPa.I, Zqa.G, uSa.E != 0);
        HEART = new UZ_2(jsa.p, Tpa.z, uSa.E != 0);
        BARRIER = new UZ_2(fpa.E, TQa.ca, uSa.E != 0);
        ITEM_CRACK = new UZ_2(aqa.L, Qsa.Ha, uSa.E != 0, uqa.g);
        BLOCK_CRACK = new UZ_2(Jsa.u, LQa.c, uSa.E != 0, vRa.d);
        BLOCK_DUST = new UZ_2(mPa.l, ISa.E, uSa.E != 0, vRa.d);
        WATER_DROP = new UZ_2(yRa.L, CRa.L, uSa.E != 0);
        ITEM_TAKE = new UZ_2(yQa.B, wra.P, uSa.E != 0);
        MOB_APPEARANCE = new UZ_2(KQa.u, kra.U, vRa.d != 0);
        UZ_2[] uZ_2Array = new UZ_2[cQa.i];
        uZ_2Array[uSa.E] = EXPLOSION_NORMAL;
        uZ_2Array[vRa.d] = EXPLOSION_LARGE;
        uZ_2Array[uqa.g] = EXPLOSION_HUGE;
        uZ_2Array[yRa.d] = FIREWORKS_SPARK;
        uZ_2Array[AQa.P] = WATER_BUBBLE;
        uZ_2Array[tTa.h] = WATER_SPLASH;
        uZ_2Array[uua.p] = WATER_WAKE;
        uZ_2Array[XTa.W] = SUSPENDED;
        uZ_2Array[Yqa.i] = SUSPENDED_DEPTH;
        uZ_2Array[WOa.fa] = CRIT;
        uZ_2Array[NTa.C] = CRIT_MAGIC;
        uZ_2Array[pPa.f] = SMOKE_NORMAL;
        uZ_2Array[lqa.s] = SMOKE_LARGE;
        uZ_2Array[uua.s] = SPELL;
        uZ_2Array[hpa.Z] = SPELL_INSTANT;
        uZ_2Array[Ypa.A] = SPELL_MOB;
        uZ_2Array[ERa.C] = SPELL_MOB_AMBIENT;
        uZ_2Array[yta.Ka] = SPELL_WITCH;
        uZ_2Array[yOa.B] = DRIP_WATER;
        uZ_2Array[wOa.t] = DRIP_LAVA;
        uZ_2Array[kTa.j] = VILLAGER_ANGRY;
        uZ_2Array[wOa.h] = VILLAGER_HAPPY;
        uZ_2Array[cQa.o] = TOWN_AURA;
        uZ_2Array[AQa.ba] = NOTE;
        uZ_2Array[osa.c] = PORTAL;
        uZ_2Array[kTa.g] = ENCHANTMENT_TABLE;
        uZ_2Array[ITa.E] = FLAME;
        uZ_2Array[Lra.e] = LAVA;
        uZ_2Array[EPa.O] = FOOTSTEP;
        uZ_2Array[ITa.A] = CLOUD;
        uZ_2Array[Fsa.d] = REDSTONE;
        uZ_2Array[tua.U] = SNOWBALL;
        uZ_2Array[fPa.i] = SNOW_SHOVEL;
        uZ_2Array[Zqa.G] = SLIME;
        uZ_2Array[Tpa.z] = HEART;
        uZ_2Array[TQa.ca] = BARRIER;
        uZ_2Array[Qsa.Ha] = ITEM_CRACK;
        uZ_2Array[LQa.c] = BLOCK_CRACK;
        uZ_2Array[ISa.E] = BLOCK_DUST;
        uZ_2Array[CRa.L] = WATER_DROP;
        uZ_2Array[wra.P] = ITEM_TAKE;
        uZ_2Array[kra.U] = MOB_APPEARANCE;
        $VALUES = uZ_2Array;
        PARTICLES = Maps.newHashMap();
        ArrayList<String> arrayList = Lists.newArrayList();
        UZ[] uZArray = UZ_2.values();
        int n3 = uZArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            UZ uZ = uZArray[n2];
            PARTICLES.put(uZ.getParticleID(), uZ);
            if (!uZ.getParticleName().endsWith(IPa.W)) {
                arrayList.add(uZ.getParticleName());
            }
            n4 = ++n2;
        }
        ArrayList<String> arrayList2 = arrayList;
        PARTICLE_NAMES = arrayList2.toArray(new String[arrayList2.size()]);
    }

    public boolean hasArguments() {
        UZ_2 a2;
        if (a2.argumentCount > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static String[] getParticleNames() {
        return PARTICLE_NAMES;
    }

    public String getParticleName() {
        UZ_2 a2;
        return a2.particleName;
    }

    public static UZ valueOf(String a2) {
        return Enum.valueOf(UZ_2.class, a2);
    }

    public boolean getShouldIgnoreRange() {
        UZ_2 a2;
        return a2.shouldIgnoreRange;
    }

    public int getParticleID() {
        UZ_2 a2;
        return a2.particleID;
    }

    public static UZ getParticleFromId(int a2) {
        return (UZ_2)PARTICLES.get(a2);
    }

    /*
     * WARNING - void declaration
     */
    private UZ_2(String string2, int n3, boolean bl) {
        void d2;
        void b2;
        void c2;
        boolean bl2 = bl;
        UZ_2 a2 = this;
        a2((String)c2, (int)b2, (boolean)d2, uSa.E);
    }

    public static UZ[] values() {
        return (UZ[])$VALUES.clone();
    }
}

