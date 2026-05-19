/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  CDa
 *  Cfa
 *  Cga
 *  DDa
 *  Dfa
 *  Dga
 *  EDa
 *  ERa
 *  FEa
 *  FPa
 *  Fpa
 *  GDa
 *  HFa
 *  ISa
 *  Iea
 *  Jp
 *  LQa
 *  Lra
 *  MEa
 *  NTa
 *  Nia
 *  ODa
 *  Oea
 *  QSa
 *  Qsa
 *  RGa
 *  Rea
 *  TDa
 *  TQa
 *  Tpa
 *  UEa
 *  WFa
 *  Wda
 *  XTa
 *  Yda
 *  Yea
 *  Ypa
 *  ZFa
 *  aea
 *  afa
 *  aga
 *  cQa
 *  cfa
 *  cga
 *  ega
 *  gea
 *  jFa
 *  jRa
 *  jea
 *  lEa
 *  lPa
 *  lqa
 *  mEa
 *  mFa
 *  nFa
 *  nda
 *  pDa
 *  pPa
 *  sFa
 *  uOa
 *  uda
 *  vL
 *  vRa
 *  vea
 *  vpa
 *  wOa
 *  wra
 *  xfa
 *  zEa
 *  zda
 *  zfa
 */
import java.util.EnumMap;

public final class Jp_3
extends Enum<Jp> {
    public static final /* enum */ Jp MAGMA_CUBE;
    public static final /* enum */ Jp LEASH_HITCH;
    public static final /* enum */ Jp WITCH;
    public static final /* enum */ Jp FIREBALL;
    public static final /* enum */ Jp MINECART_CHEST;
    public static final /* enum */ Jp EXPERIENCE_ORB;
    private static final EnumMap<FK, Jp> reverse;
    public static final /* enum */ Jp SNOWMAN;
    public static final /* enum */ Jp PRIMED_TNT;
    public static final /* enum */ Jp SLIME;
    public static final /* enum */ Jp WITHER;
    public static final /* enum */ Jp SMALL_FIREBALL;
    public static final /* enum */ Jp MINECART_TNT;
    public static final /* enum */ Jp ARMOR_STAND;
    public static final /* enum */ Jp GIANT;
    public static final /* enum */ Jp THROWN_EXP_BOTTLE;
    public static final /* enum */ Jp PLAYER;
    public static final /* enum */ Jp MINECART_HOPPER;
    public static final /* enum */ Jp BAT;
    public static final /* enum */ Jp WITHER_SKULL;
    public static final /* enum */ Jp SNOWBALL;
    public static final /* enum */ Jp FALLING_BLOCK;
    public static final /* enum */ Jp MINECART_COMMAND;
    public static final /* enum */ Jp UNKNOWN;
    public static final /* enum */ Jp FIREWORK;
    public static final /* enum */ Jp CHICKEN;
    public static final /* enum */ Jp MINECART;
    public static final /* enum */ Jp MINECART_FURNACE;
    public static final /* enum */ Jp ENDERMITE;
    public static final /* enum */ Jp CAVE_SPIDER;
    public static final /* enum */ Jp ITEM_FRAME;
    public static final /* enum */ Jp GUARDIAN;
    public static final /* enum */ Jp BOAT;
    public static final /* enum */ Jp ENDER_DRAGON;
    public static final /* enum */ Jp PAINTING;
    public static final /* enum */ Jp SQUID;
    public static final /* enum */ Jp ZOMBIE;
    public static final /* enum */ Jp ARROW;
    public static final /* enum */ Jp BLAZE;
    public static final /* enum */ Jp VILLAGER;
    public static final /* enum */ Jp GHAST;
    public static final /* enum */ Jp SKELETON;
    public static final /* enum */ Jp ENDER_CRYSTAL;
    public final Class<? extends vL> clazz;
    public static final /* enum */ Jp WOLF;
    public static final /* enum */ Jp RABBIT;
    public static final /* enum */ Jp MINECART_MOB_SPAWNER;
    public static final /* enum */ Jp IRON_GOLEM;
    public static final /* enum */ Jp SHEEP;
    public static final /* enum */ Jp PIG;
    public static final /* enum */ Jp COW;
    public static final /* enum */ Jp ENTITY_HORSE;
    public static final /* enum */ Jp CREEPER;
    public final FK proto;
    private static final /* synthetic */ Jp[] $VALUES;
    public static final /* enum */ Jp ENDERMAN;
    public static final /* enum */ Jp ENDER_SIGNAL;
    public static final /* enum */ Jp PIG_ZOMBIE;
    public static final /* enum */ Jp OCELOT;
    public static final /* enum */ Jp SILVERFISH;
    public static final /* enum */ Jp SPIDER;
    public static final /* enum */ Jp ENDER_PEARL;
    public static final /* enum */ Jp MUSHROOM_COW;
    public static final /* enum */ Jp DROPPED_ITEM;

    public static Jp fromProto(FK a2) {
        return (Jp_3)reverse.getOrDefault(a2, UNKNOWN);
    }

    public static Jp[] values() {
        return (Jp[])$VALUES.clone();
    }

    static {
        int n2;
        UNKNOWN = new Jp_3(null, FK.UNRECOGNIZED);
        DROPPED_ITEM = new Jp_3(jFa.class, FK.DROPPED_ITEM);
        EXPERIENCE_ORB = new Jp_3(zEa.class, FK.EXPERIENCE_ORB);
        LEASH_HITCH = new Jp_3(Nia.class, FK.LEASH_HITCH);
        PAINTING = new Jp_3(WFa.class, FK.PAINTING);
        ARROW = new Jp_3(jea.class, FK.ARROW);
        SNOWBALL = new Jp_3(Pda.class, FK.SNOWBALL);
        FIREBALL = new Jp_3(oEa.class, FK.FIREBALL);
        SMALL_FIREBALL = new Jp_3(ZDa.class, FK.SMALL_FIREBALL);
        ENDER_PEARL = new Jp_3(Dfa.class, FK.ENDER_PEARL);
        ENDER_SIGNAL = new Jp_3(Dfa.class, FK.ENDER_SIGNAL);
        THROWN_EXP_BOTTLE = new Jp_3(CDa.class, FK.THROWN_EXP_BOTTLE);
        ITEM_FRAME = new Jp_3(FEa.class, FK.ITEM_FRAME);
        WITHER_SKULL = new Jp_3(afa.class, FK.WITHER_SKULL);
        PRIMED_TNT = new Jp_3(vFa.class, FK.PRIMED_TNT);
        FALLING_BLOCK = new Jp_3(aga.class, FK.FALLING_BLOCK);
        FIREWORK = new Jp_3(gea.class, FK.FIREWORK);
        ARMOR_STAND = new Jp_3(Oea.class, FK.ARMOR_STAND);
        MINECART_COMMAND = new Jp_3(RGa.class, FK.MINECART_COMMAND);
        BOAT = new Jp_3(Wda.class, FK.BOAT);
        MINECART = new Jp_3(Yea.class, FK.MINECART);
        MINECART_CHEST = new Jp_3(EDa.class, FK.MINECART_CHEST);
        MINECART_FURNACE = new Jp_3(yda.class, FK.MINECART_FURNACE);
        MINECART_TNT = new Jp_3(Cga.class, FK.MINECART_TNT);
        MINECART_HOPPER = new Jp_3(Cfa.class, FK.MINECART_HOPPER);
        MINECART_MOB_SPAWNER = new Jp_3(rEa.class, FK.MINECART_MOB_SPAWNER);
        CREEPER = new Jp_3(zfa.class, FK.CREEPER);
        SKELETON = new Jp_3(lEa.class, FK.SKELETON);
        SPIDER = new Jp_3(Dga.class, FK.SPIDER);
        GIANT = new Jp_3(UEa.class, FK.GIANT);
        ZOMBIE = new Jp_3(nda.class, FK.ZOMBIE);
        SLIME = new Jp_3(cga.class, FK.SLIME);
        GHAST = new Jp_3(Yda.class, FK.GHAST);
        PIG_ZOMBIE = new Jp_3(MEa.class, FK.PIG_ZOMBIE);
        ENDERMAN = new Jp_3(vea.class, FK.ENDERMAN);
        CAVE_SPIDER = new Jp_3(aea.class, FK.CAVE_SPIDER);
        SILVERFISH = new Jp_3(qda.class, FK.SILVERFISH);
        BLAZE = new Jp_3(Zfa.class, FK.BLAZE);
        MAGMA_CUBE = new Jp_3(ega.class, FK.MAGMA_CUBE);
        ENDER_DRAGON = new Jp_3(pDa.class, FK.ENDER_DRAGON);
        WITHER = new Jp_3(IDa.class, FK.WITHER);
        BAT = new Jp_3(mEa.class, FK.BAT);
        WITCH = new Jp_3(nFa.class, FK.WITCH);
        ENDERMITE = new Jp_3(uda.class, FK.ENDERMITE);
        GUARDIAN = new Jp_3(GDa.class, FK.GUARDIAN);
        PIG = new Jp_3(zda.class, FK.PIG);
        SHEEP = new Jp_3(ZFa.class, FK.SHEEP);
        COW = new Jp_3(aDa.class, FK.COW);
        CHICKEN = new Jp_3(aEa.class, FK.CHICKEN);
        SQUID = new Jp_3(HFa.class, FK.SQUID);
        WOLF = new Jp_3(xfa.class, FK.WOLF);
        MUSHROOM_COW = new Jp_3(TDa.class, FK.MUSHROOM_COW);
        SNOWMAN = new Jp_3(Iea.class, FK.SNOWMAN);
        OCELOT = new Jp_3(ODa.class, FK.OCELOT);
        IRON_GOLEM = new Jp_3(DDa.class, FK.IRON_GOLEM);
        ENTITY_HORSE = new Jp_3(Rea.class, FK.ENTITY_HORSE);
        RABBIT = new Jp_3(cfa.class, FK.RABBIT);
        VILLAGER = new Jp_3(mFa.class, FK.VILLAGER);
        ENDER_CRYSTAL = new Jp_3(sFa.class, FK.ENDER_CRYSTAL);
        PLAYER = new Jp_3(null, FK.PLAYER);
        Jp_3[] jp_3Array = new Jp_3[Psa.M];
        jp_3Array[uSa.E] = UNKNOWN;
        jp_3Array[vRa.d] = DROPPED_ITEM;
        jp_3Array[uqa.g] = EXPERIENCE_ORB;
        jp_3Array[yRa.d] = LEASH_HITCH;
        jp_3Array[AQa.P] = PAINTING;
        jp_3Array[tTa.h] = ARROW;
        jp_3Array[uua.p] = SNOWBALL;
        jp_3Array[XTa.W] = FIREBALL;
        jp_3Array[Yqa.i] = SMALL_FIREBALL;
        jp_3Array[WOa.fa] = ENDER_PEARL;
        jp_3Array[NTa.C] = ENDER_SIGNAL;
        jp_3Array[pPa.f] = THROWN_EXP_BOTTLE;
        jp_3Array[lqa.s] = ITEM_FRAME;
        jp_3Array[uua.s] = WITHER_SKULL;
        jp_3Array[hpa.Z] = PRIMED_TNT;
        jp_3Array[Ypa.A] = FALLING_BLOCK;
        jp_3Array[ERa.C] = FIREWORK;
        jp_3Array[yta.Ka] = ARMOR_STAND;
        jp_3Array[yOa.B] = MINECART_COMMAND;
        jp_3Array[wOa.t] = BOAT;
        jp_3Array[kTa.j] = MINECART;
        jp_3Array[wOa.h] = MINECART_CHEST;
        jp_3Array[cQa.o] = MINECART_FURNACE;
        jp_3Array[AQa.ba] = MINECART_TNT;
        jp_3Array[osa.c] = MINECART_HOPPER;
        jp_3Array[kTa.g] = MINECART_MOB_SPAWNER;
        jp_3Array[ITa.E] = CREEPER;
        jp_3Array[Lra.e] = SKELETON;
        jp_3Array[EPa.O] = SPIDER;
        jp_3Array[ITa.A] = GIANT;
        jp_3Array[Fsa.d] = ZOMBIE;
        jp_3Array[tua.U] = SLIME;
        jp_3Array[fPa.i] = GHAST;
        jp_3Array[Zqa.G] = PIG_ZOMBIE;
        jp_3Array[Tpa.z] = ENDERMAN;
        jp_3Array[TQa.ca] = CAVE_SPIDER;
        jp_3Array[Qsa.Ha] = SILVERFISH;
        jp_3Array[LQa.c] = BLAZE;
        jp_3Array[ISa.E] = MAGMA_CUBE;
        jp_3Array[CRa.L] = ENDER_DRAGON;
        jp_3Array[wra.P] = WITHER;
        jp_3Array[kra.U] = BAT;
        jp_3Array[cQa.i] = WITCH;
        jp_3Array[iSa.x] = ENDERMITE;
        jp_3Array[Yqa.D] = GUARDIAN;
        jp_3Array[wra.e] = PIG;
        jp_3Array[Bpa.Ha] = SHEEP;
        jp_3Array[uOa.F] = COW;
        jp_3Array[QSa.p] = CHICKEN;
        jp_3Array[jRa.q] = SQUID;
        jp_3Array[vpa.o] = WOLF;
        jp_3Array[cPa.Q] = MUSHROOM_COW;
        jp_3Array[FPa.F] = SNOWMAN;
        jp_3Array[Bpa.Z] = OCELOT;
        jp_3Array[GPa.C] = IRON_GOLEM;
        jp_3Array[Fpa.ca] = ENTITY_HORSE;
        jp_3Array[Upa.D] = RABBIT;
        jp_3Array[KSa.x] = VILLAGER;
        jp_3Array[lQa.R] = ENDER_CRYSTAL;
        jp_3Array[lPa.p] = PLAYER;
        $VALUES = jp_3Array;
        reverse = new EnumMap(FK.class);
        Jp[] jpArray = Jp_3.values();
        int n3 = jpArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Jp jp2 = jpArray[n2];
            reverse.put(jp2.proto, jp2);
            n4 = ++n2;
        }
    }

    public boolean test(vL vL2) {
        Jp_3 b2 = vL2;
        Jp_3 a2 = this;
        if (a2 == PLAYER) {
            return b2 instanceof Sx;
        }
        if (b2 != null && ((Object)((Object)b2)).getClass() == a2.clazz) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Jp_3(Class<? extends vL> clazz, FK fK2) {
        Enum c2;
        void b2;
        Jp_3 a2;
        Jp_3 jp_3 = enum_;
        Enum enum_ = fK2;
        Jp_3 jp_32 = a2 = jp_3;
        jp_32.clazz = b2;
        jp_32.proto = c2;
    }

    public static Jp valueOf(String a2) {
        return Enum.valueOf(Jp_3.class, a2);
    }
}

