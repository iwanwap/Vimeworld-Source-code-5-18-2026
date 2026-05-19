/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  Cta
 *  DQa
 *  EQa
 *  ERa
 *  Epa
 *  Ey
 *  FPa
 *  FTa
 *  Fpa
 *  Gg
 *  Gl
 *  Gua
 *  I
 *  ISa
 *  JPa
 *  JQa
 *  JSa
 *  JTa
 *  KTa
 *  LQa
 *  Lqa
 *  Lra
 *  Lz
 *  MQa
 *  Mda
 *  NOa
 *  NPa
 *  NQa
 *  NTa
 *  Ox
 *  PTa
 *  Ppa
 *  Pqa
 *  QSa
 *  Qqa
 *  Qsa
 *  Qta
 *  RPa
 *  RQa
 *  Rua
 *  SOa
 *  SQa
 *  SRa
 *  Spa
 *  Sqa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  Tz
 *  URa
 *  Uqa
 *  Usa
 *  Uta
 *  VQa
 *  Vua
 *  WQa
 *  WSa
 *  Wsa
 *  XSa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  Yra
 *  Ysa
 *  ZOa
 *  ZRa
 *  Zpa
 *  Zta
 *  Zua
 *  aPa
 *  aQa
 *  aSa
 *  aqa
 *  asa
 *  bRa
 *  bSa
 *  bpa
 *  bqa
 *  bua
 *  cQa
 *  cRa
 *  cra
 *  dQa
 *  dpa
 *  eAa
 *  eX
 *  ez
 *  fTa
 *  fpa
 *  fsa
 *  gIa
 *  hTa
 *  hqa
 *  hra
 *  hy
 *  iPa
 *  isa
 *  jFa
 *  jRa
 *  jpa
 *  jsa
 *  kGa
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  lPa
 *  lqa
 *  mra
 *  nQa
 *  oqa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  uOa
 *  uQa
 *  uRa
 *  uY
 *  ura
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  xOa
 *  xy
 *  yQa
 *  yra
 *  ysa
 *  zEa
 *  zTa
 *  zsa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block$1;
import net.minecraft.block.Block$2;
import net.minecraft.block.Block$3;
import net.minecraft.block.Block$4;
import net.minecraft.block.Block$5;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockBanner$BlockBannerHanging;
import net.minecraft.block.BlockBanner$BlockBannerStanding;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBone;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.block.BlockBrewingStand;
import net.minecraft.block.BlockBuddingAmethyst;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockClay;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.block.BlockCompressedPowered;
import net.minecraft.block.BlockConcretePowder;
import net.minecraft.block.BlockCopper;
import net.minecraft.block.BlockCopper$EnumVariant;
import net.minecraft.block.BlockCopperGrate;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockCross;
import net.minecraft.block.BlockCustomFacing;
import net.minecraft.block.BlockCustomLeaves;
import net.minecraft.block.BlockCustomPillar;
import net.minecraft.block.BlockCustomSlab$Double;
import net.minecraft.block.BlockCustomSlab$Half;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDoubleStoneSlab;
import net.minecraft.block.BlockDoubleStoneSlabNew;
import net.minecraft.block.BlockDoubleWoodSlab;
import net.minecraft.block.BlockDragonEgg;
import net.minecraft.block.BlockDropper;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.BlockEndPortal;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockFroglight;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockGlazedTerracotta1;
import net.minecraft.block.BlockGlazedTerracotta2;
import net.minecraft.block.BlockGlazedTerracotta3;
import net.minecraft.block.BlockGlazedTerracotta4;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.BlockHalfStoneSlab;
import net.minecraft.block.BlockHalfStoneSlabNew;
import net.minecraft.block.BlockHalfWoodSlab;
import net.minecraft.block.BlockHardenedClay;
import net.minecraft.block.BlockHay;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockIronOre;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.BlockLogStripped1;
import net.minecraft.block.BlockLogStripped2;
import net.minecraft.block.BlockLogStripped3;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.BlockMobSpawner;
import net.minecraft.block.BlockMud;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.BlockNetherBrick;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.BlockNetherrack;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockNewLog2;
import net.minecraft.block.BlockNote;
import net.minecraft.block.BlockObserver;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockPackedIce;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.BlockPotato;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlate$Sensitivity;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.BlockPrismarine$EnumType;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockPurpurSlab$Double;
import net.minecraft.block.BlockPurpurSlab$Half;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailDetector;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.BlockRedFlower;
import net.minecraft.block.BlockRedSandstone;
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSculk;
import net.minecraft.block.BlockSeaLantern;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlime;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockSnowBlock;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.BlockSponge;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockStem;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.block.BlockVerticalSlab;
import net.minecraft.block.BlockVine;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockWallSign;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.BlockYellowFlower;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.CustomBlock$CustomBlockMaterial;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Block {
    public Ox blockHardness;
    public static final Block$SoundType soundTypeMetal;
    public double maxZ;
    public double minZ;
    public static final Block$SoundType soundTypeCloth;
    public double maxY;
    private IBlockState defaultBlockState;
    public Block$SoundType stepSound;
    public final BlockState blockState;
    public final MapColor field_181083_K;
    public static final eX BLOCK_STATE_IDS;
    public static final Block$SoundType soundTypePiston;
    public double minX;
    public boolean useNeighborBrightness;
    public boolean translucent;
    public static final Block$SoundType soundTypeSnow;
    private yGa displayOnCreativeTab;
    public boolean fullBlock;
    public double maxX;
    public static final Block$SoundType soundTypeGrass;
    public boolean isBlockContainer;
    public float blockResistance;
    public boolean needsRandomTick;
    public static final Block$SoundType soundTypeLadder;
    private CustomBlock customBlock;
    public float blockParticleGravity;
    private String unlocalizedName;
    public static final Block$SoundType soundTypeSand;
    public static final py<ResourceLocation, Block> blockRegistry;
    public static final Block$SoundType soundTypeAnvil;
    public static final Block$SoundType SLIME_SOUND;
    public boolean enableStats;
    public final Material blockMaterial;
    public int lightOpacity;
    public Ox slipperiness;
    public static final Block$SoundType soundTypeStone;
    private static final ResourceLocation AIR_ID;
    public double minY;
    public static final Block$SoundType soundTypeWood;
    public int lightValue;
    public static final Block$SoundType soundTypeGlass;
    public static final Block$SoundType soundTypeGravel;

    public int J(Gg gg2) {
        Block b2 = gg2;
        Block a2 = this;
        return NTa.C;
    }

    public boolean a() {
        Block a2;
        return a2.isBlockContainer;
    }

    public void J(Gg gg2, XF xF2, NZ object) {
        Object d2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, XF xF2, DZ dZ2) {
        void c2;
        Object d2 = xF2;
        Block b2 = this;
        return c2.J((XF)((Object)d2)).J().J().i();
    }

    public void J(Gg gg2, XF xF2, Sx object) {
        Object d2 = object;
        object = this;
    }

    public boolean J(Block block) {
        Block a2 = this;
        Block b2 = block;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Gg gg2, XF xF2, vL object) {
        Block d2 = object;
        object = this;
    }

    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Block a2 = this;
        return uSa.E;
    }

    public Block f() {
        Block a2;
        a2.enableStats = uSa.E;
        return a2;
    }

    public final void J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Block a2 = this;
        a2.defaultBlockState = b2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, ResourceLocation resourceLocation, Block block) {
        void b2;
        Block c2 = block;
        int a2 = n2;
        blockRegistry.J(a2, (ResourceLocation)b2, c2);
    }

    public boolean H() {
        return uSa.E != 0;
    }

    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, int n2, int n3) {
        int n4 = n3;
        Block a2 = this;
        return uSa.E != 0;
    }

    public boolean g() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, XF xF2, Mda mda2) {
        Gg gg3 = gg2;
        if (!gg3.e && gg3.J().f(Qta.Ja)) {
            void a2;
            void b2;
            float c2 = MQa.L;
            Gg gg4 = gg3;
            double d2 = (double)(gg4.v.nextFloat() * c2) + (double)(pqa.r - c2) * kTa.B;
            double d3 = (double)(gg4.v.nextFloat() * c2) + (double)(pqa.r - c2) * kTa.B;
            double d4 = (double)(gg4.v.nextFloat() * c2) + (double)(pqa.r - c2) * kTa.B;
            jFa jFa2 = new jFa(gg3, (double)b2.getX() + d2, (double)b2.getY() + d3, (double)b2.getZ() + d4, (Mda)a2);
            jFa2.l();
            gg4.f((vL)jFa2);
        }
    }

    public int C() {
        Block a2;
        return a2.lightOpacity;
    }

    public Block l(float f2) {
        float b2 = f2;
        Block a2 = this;
        a2.blockResistance = b2 * vQa.q;
        return a2;
    }

    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Block block = object;
        Object object = dZ2;
        Block a2 = block;
        return uSa.E;
    }

    public float J() {
        Block a2;
        if (a2.d()) {
            return psa.N;
        }
        return pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, DZ dZ2, Mda mda2) {
        void c2;
        void d2;
        Object e2 = dZ2;
        Block b2 = this;
        return b2.J((Gg)d2, (XF)c2, (DZ)((Object)e2));
    }

    public ez J() {
        return ez.SOLID;
    }

    public void l(Gg gg2, XF xF2, IBlockState object) {
        Object d2 = object;
        object = this;
    }

    public boolean I() {
        Block a2;
        return a2.enableStats;
    }

    public boolean J(IBlockState iBlockState, boolean bl2) {
        boolean c2 = bl2;
        Block a2 = this;
        return a2.j();
    }

    public void f() {
    }

    /*
     * WARNING - void declaration
     */
    public final void J(Gg gg2, XF xF2, IBlockState iBlockState, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n3 = n2;
        Block a2 = this;
        a2.J((Gg)d2, (XF)c2, (IBlockState)b2, pqa.r, (int)e2);
    }

    public static int l(IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        Block a2 = iBlockState2.J();
        return Block.J(a2) + (a2.f(iBlockState2) << lqa.s);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void c2;
        void d2;
        void e2;
        Block g2 = gg2;
        Block f2 = this;
        if ((g2 = f2.J((Gg)g2, (XF)e2, (IBlockState)d2)) != null && c2.J((xy)g2)) {
            void b2;
            b2.add(g2);
        }
    }

    public boolean j() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        Block f3 = gg2;
        Block e2 = this;
        if (!((Gg)f3).e) {
            int n3;
            void a2;
            int n4 = e2.J((int)a2, ((Gg)f3).v);
            int n5 = n3 = uSa.E;
            while (n5 < n4) {
                void c2;
                eAa eAa2;
                void b2;
                if (((Gg)f3).v.nextFloat() <= b2 && (eAa2 = e2.J((IBlockState)c2, ((Gg)f3).v, (int)a2)) != null) {
                    void d2;
                    Block.J((Gg)f3, (XF)d2, new Mda(eAa2, vRa.d, e2.C((IBlockState)c2)));
                }
                n5 = ++n3;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void J() {
        Block.J(uSa.E, AIR_ID, new BlockAir().f(BPa.h));
        Block block = new BlockStone().J(Ira.d).l(FRa.Ga).J(soundTypePiston).f(fpa.F);
        Block.J(vRa.d, fpa.F, block);
        Block.J(uqa.g, Xsa.J, new BlockGrass().J(Ora.D).J(soundTypeGrass).f(Xsa.J));
        Block.J(yRa.d, aSa.P, new BlockDirt().J(MQa.L).J(soundTypeGravel).f(aSa.P));
        Object object = new Block(Material.rock).J(kta.v).l(FRa.Ga).J(soundTypePiston).f(csa.S).J(yGa.A);
        Block.J(AQa.P, ATa.ga, (Block)object);
        Object object2 = new BlockPlanks().J(kta.v).l(eua.C).J(soundTypeWood).f(yRa.Ja);
        Block.J(tTa.h, yOa.k, (Block)object2);
        Block.J(uua.p, uQa.Z, new BlockSapling().J(JPa.N).J(soundTypeGrass).f(uQa.Z));
        Block.J(XTa.W, Zqa.w, new Block(Material.rock).J().l(Jra.T).J(soundTypePiston).f(Zqa.w).f().J(yGa.A));
        Block.J(Yqa.i, Zua.r, new BlockDynamicLiquid(Material.water).J(QTa.G).J(yRa.d).f(wua.i).f());
        Block.J(WOa.fa, wua.i, new BlockStaticLiquid(Material.water).J(QTa.G).J(yRa.d).f(wua.i).f());
        Block.J(NTa.C, gQa.M, new BlockDynamicLiquid(Material.lava).J(QTa.G).f(pqa.r).f(vQa.l).f());
        Block.J(pPa.f, vQa.l, new BlockStaticLiquid(Material.lava).J(QTa.G).f(pqa.r).f(vQa.l).f());
        Block.J(lqa.s, dqa.la, new BlockSand().J(MQa.L).J(soundTypeSand).f(dqa.la));
        Block.J(uua.s, wsa.w, new BlockGravel().J(Ora.D).J(soundTypeGravel).f(wsa.w));
        Block.J(hpa.Z, pqa.ja, new BlockOre().J(vQa.q).l(eua.C).J(soundTypePiston).f(Pqa.L));
        Block.J(Ypa.A, MTa.p, new BlockIronOre().J(vQa.q).l(eua.C).J(soundTypePiston).f(Era.Ia));
        Block.J(ERa.C, isa.S, new BlockOre().J(vQa.q).l(eua.C).J(soundTypePiston).f(EQa.y));
        Block.J(yta.Ka, MQa.T, new BlockOldLog().f(MQa.T));
        Block.J(yOa.B, Fsa.Ja, new BlockOldLeaf().f(Fsa.Ja));
        Block.J(wOa.t, uqa.ga, new BlockSponge().J(Ora.D).J(soundTypeGrass).f(uqa.ga));
        Block.J(kTa.j, pQa.T, new BlockGlass(Material.glass, uSa.E != 0).J(bpa.K).J(soundTypeGlass).f(pQa.T));
        Block.J(wOa.h, Ata.A, new BlockOre().J(vQa.q).l(eua.C).J(soundTypePiston).f(qsa.S));
        Block.J(cQa.o, Zua.Da, new Block(Material.iron, MapColor.lapisColor).J(vQa.q).l(eua.C).J(soundTypePiston).f(yta.T).J(yGa.A));
        Block.J(AQa.ba, wta.ja, new BlockDispenser().J(Bpa.w).J(soundTypePiston).f(wta.ja));
        Object object3 = new BlockSandStone().J(soundTypePiston).J(xSa.la).f(Gua.Ga);
        Block.J(osa.c, zTa.M, (Block)object3);
        Block.J(kTa.g, Zqa.V, new BlockNote().J(xSa.la).f(tTa.m));
        Block.J(ITa.E, Yua.Ia, new BlockBed().J(soundTypeWood).J(psa.N).f(Yua.Ia).f());
        Block.J(Lra.e, Zpa.U, new BlockRailPowered().J(ZSa.q).J(soundTypeMetal).f(Bua.Da));
        Block.J(EPa.O, wta.Ka, new BlockRailDetector().J(ZSa.q).J(soundTypeMetal).f(yra.J));
        Block.J(ITa.A, BRa.I, new BlockPistonBase(vRa.d != 0).f(bSa.A));
        Block.J(Fsa.d, tua.S, new BlockWeb().J(vRa.d).J(YSa.G).f(tua.S));
        Block.J(tua.U, tua.K, new BlockTallGrass().J(JPa.N).J(soundTypeGrass).f(tua.K));
        Block.J(fPa.i, eta.M, new BlockDeadBush().J(JPa.N).J(soundTypeGrass).f(eta.M));
        Block.J(Zqa.G, isa.Ka, new BlockPistonBase(uSa.E != 0).f(kta.k));
        Block.J(Tpa.z, WQa.Ka, new BlockPistonExtension().f(kta.k));
        Block.J(TQa.ca, psa.fa, new BlockColored(Material.cloth).J(xSa.la).J(soundTypeCloth).f(Xpa.r));
        Block.J(Qsa.Ha, Gta.fa, (Block)new BlockPistonMoving());
        Block.J(LQa.c, Tqa.W, new BlockYellowFlower().J(JPa.N).J(soundTypeGrass).f(yQa.P));
        Block.J(ISa.E, rpa.X, new BlockRedFlower().J(JPa.N).J(soundTypeGrass).f(ROa.H));
        Object object4 = new BlockMushroom().J(JPa.N).J(soundTypeGrass).f(Mqa.N).f(bsa.E);
        Block.J(CRa.L, bsa.S, (Block)object4);
        Block block2 = new BlockMushroom().J(JPa.N).J(soundTypeGrass).f(bsa.E);
        Block.J(wra.P, Zqa.r, block2);
        Block.J(kra.U, Tqa.ba, new Block(Material.iron, MapColor.goldColor).J(vQa.q).l(FRa.Ga).J(soundTypeMetal).f(JSa.j).J(yGa.A));
        Block.J(cQa.i, Zpa.f, new Block(Material.iron, MapColor.ironColor).J(eua.C).l(FRa.Ga).J(soundTypeMetal).f(sSa.j).J(yGa.A));
        Block.J(iSa.x, XOa.a, new BlockDoubleStoneSlab().J(kta.v).l(FRa.Ga).J(soundTypePiston).f(QTa.ba));
        Block.J(Yqa.D, Fsa.Q, new BlockHalfStoneSlab().J(kta.v).l(FRa.Ga).J(soundTypePiston).f(QTa.ba));
        Object object5 = new Block(Material.rock, MapColor.redColor).J(kta.v).l(FRa.Ga).J(soundTypePiston).f(Wsa.f).J(yGa.A);
        Block.J(wra.e, FTa.S, (Block)object5);
        Block.J(Bpa.Ha, TOa.W, new BlockTNT().J(JPa.N).J(soundTypeGrass).f(TOa.W));
        Block.J(uOa.F, IPa.H, new BlockBookshelf().J(Ira.d).J(soundTypeWood).f(IPa.H));
        Block.J(QSa.p, aSa.A, new Block(Material.rock).J(kta.v).l(FRa.Ga).J(soundTypePiston).f(Qra.D).J(yGa.A));
        Block.J(jRa.q, xua.fa, new BlockObsidian().J(SPa.b).l(xqa.O).J(soundTypePiston).f(xua.fa));
        Block.J(vpa.o, Iqa.fa, new BlockTorch().J(JPa.N).f(pqa.Ha).J(soundTypeWood).f(Iqa.fa));
        Block.J(cPa.Q, LRa.g, new BlockFire().J(JPa.N).f(pqa.r).J(soundTypeCloth).f(LRa.g).f());
        Block.J(FPa.F, hqa.u, new BlockMobSpawner().J(eua.C).J(soundTypeMetal).f(wOa.P).f());
        Block.J(Bpa.Z, ysa.r, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.OAK)).f(SPa.N));
        Block.J(GPa.C, Qsa.Ga, new BlockChest(uSa.E).J(MTa.y).J(soundTypeWood).f(Qsa.Ga));
        Block.J(Fpa.ca, uQa.z, new BlockRedstoneWire().J(JPa.N).J(soundTypeStone).f(xOa.Z).f());
        Block.J(Upa.D, ZSa.Aa, new BlockOre().J(vQa.q).l(eua.C).J(soundTypePiston).f(Vra.M));
        Block.J(KSa.x, dQa.I, new Block(Material.iron, MapColor.diamondColor).J(eua.C).l(FRa.Ga).J(soundTypeMetal).f(ISa.B).J(yGa.A));
        Block.J(lQa.R, Qpa.X, new BlockWorkbench().J(MTa.y).J(soundTypeWood).f(qQa.p));
        Block.J(lPa.p, lqa.y, new BlockCrops().f(Eqa.ja));
        Block block3 = new BlockFarmland().J(Ora.D).J(soundTypeGravel).f(Ora.O);
        Block.J(Psa.M, Ora.O, block3);
        Block.J(tua.w, Ata.Ga, new BlockFurnace(uSa.E != 0).J(Bpa.w).J(soundTypePiston).f(Ata.Ga).J(yGa.a));
        Block.J(ITa.V, MQa.u, new BlockFurnace(vRa.d != 0).J(Bpa.w).J(soundTypePiston).f(xOa.B).f(Ata.Ga));
        Block.J(Ssa.u, tTa.x, new BlockStandingSign().J(pqa.r).J(soundTypeWood).f(FPa.S).f());
        Block.J(ysa.s, vQa.o, new BlockDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(Cra.Ka).f());
        Block.J(fPa.ga, ISa.Aa, new BlockLadder().J(Xpa.R).J(soundTypeLadder).f(ISa.Aa));
        Block.J(SPa.T, aQa.w, new BlockRail().J(ZSa.q).J(soundTypeMetal).f(aQa.w));
        Block.J(Vra.b, SRa.t, new BlockStairs(((Block)object).J()).f(aSa.Y));
        Block.J(WPa.L, gsa.P, new BlockWallSign().J(pqa.r).J(soundTypeWood).f(FPa.S).f());
        Block.J(Cra.S, Eqa.W, new BlockLever().J(MQa.L).J(soundTypeWood).f(Eqa.W));
        Block.J(NPa.e, UOa.S, new BlockPressurePlate(Material.rock, BlockPressurePlate$Sensitivity.MOBS).J(MQa.L).J(soundTypePiston).f(STa.q));
        Block.J(hqa.K, NSa.i, new BlockDoor(Material.iron).J(eua.C).J(soundTypeMetal).f(wua.Ga).f());
        Block.J(Eqa.Ka, ypa.D, new BlockPressurePlate(Material.wood, BlockPressurePlate$Sensitivity.EVERYTHING).J(MQa.L).J(soundTypeWood).f(yQa.y));
        Block.J(Pua.Ka, WRa.t, new BlockRedstoneOre(uSa.E != 0).J(vQa.q).l(eua.C).J(soundTypePiston).f(pPa.e).J(yGa.A));
        Block.J(bqa.Ga, Zpa.K, new BlockRedstoneOre(vRa.d != 0).f(Jpa.y).J(vQa.q).l(eua.C).J(soundTypePiston).f(pPa.e));
        Block.J(jRa.X, rta.e, new BlockRedstoneTorch(uSa.E != 0).J(JPa.N).J(soundTypeWood).f(Bpa.D));
        Block.J(NPa.i, Gua.o, new BlockRedstoneTorch(vRa.d != 0).J(JPa.N).f(MQa.L).J(soundTypeWood).f(Bpa.D).J(yGa.I));
        Block.J(uqa.b, Cra.O, new BlockButtonStone().J(MQa.L).J(soundTypePiston).f(hpa.e));
        Block.J(RQa.b, xua.B, new BlockSnow().J(Nra.e).J(soundTypeSnow).f(Yra.p).J(uSa.E));
        Block.J(vPa.Ka, SRa.Q, new BlockIce().J(MQa.L).J(yRa.d).J(soundTypeGlass).f(SRa.Q));
        Block.J(Fua.J, Yra.p, new BlockSnowBlock().J(psa.N).J(soundTypeSnow).f(Yra.p));
        Block.J(csa.A, Qra.Ha, new BlockCactus().J(Xpa.R).J(soundTypeCloth).f(Qra.Ha));
        Block.J(aqa.Aa, nua.Z, new BlockClay().J(Ora.D).J(soundTypeGravel).f(nua.Z));
        Block.J(pPa.ja, Gta.c, new BlockReed().J(JPa.N).J(soundTypeGrass).f(Gta.c).f());
        Block.J(Vua.J, KSa.Z, new BlockJukebox().J(kta.v).l(FRa.Ga).J(soundTypePiston).f(KSa.Z));
        Block.J(Ira.ga, AQa.A, new BlockFence(Material.wood, BlockPlanks$EnumType.OAK.func_181070_c()).J(kta.v).l(eua.C).J(soundTypeWood).f(AQa.A));
        Block[] blockArray = new BlockPumpkin().J(pqa.r).J(soundTypeWood).f(Qsa.c);
        Block.J(Bra.C, Qsa.c, (Block)blockArray);
        Block.J(Jqa.S, pPa.g, new BlockNetherrack().J(Xpa.R).J(soundTypePiston).f(Spa.S));
        Block.J(ZRa.D, asa.I, new BlockSoulSand().J(MQa.L).J(soundTypeSand).f(gsa.Aa));
        Block.J(bSa.Da, dua.z, new BlockGlowstone(Material.glass).J(bpa.K).J(soundTypeGlass).f(pqa.r).f(rpa.Z));
        Block.J(Jsa.ha, SQa.Q, new BlockPortal().J(vqa.T).J(soundTypeGlass).f(wOa.w).f(SQa.Q));
        Block.J(rRa.R, sSa.l, new BlockPumpkin().J(pqa.r).J(soundTypeWood).f(pqa.r).f(yOa.j));
        Block.J(iSa.ca, jpa.Y, new BlockCake().J(MQa.L).J(soundTypeCloth).f(jpa.Y).f());
        Block.J(fPa.t, Qpa.d, new BlockRedstoneRepeater(uSa.E != 0).J(JPa.N).J(soundTypeWood).f(MTa.fa).f());
        Block.J(bpa.I, sra.U, new BlockRedstoneRepeater(vRa.d != 0).J(JPa.N).J(soundTypeWood).f(MTa.fa).f());
        Block.J(pqa.ga, NSa.m, new BlockStainedGlass(Material.glass).J(bpa.K).J(soundTypeGlass).f(dqa.U));
        Block.J(zua.m, SQa.N, new BlockTrapDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(SQa.N).f());
        Block.J(Hta.k, kPa.X, new BlockSilverfish().J(wOa.w).f(ITa.X));
        Block block4 = new BlockStoneBrick().J(Ira.d).l(FRa.Ga).J(soundTypePiston).f(Qsa.O);
        Block.J(dpa.A, csa.S, block4);
        Block.J(zOa.v, WSa.k, new BlockHugeMushroom(Material.wood, MapColor.dirtColor, (Block)object4).J(psa.N).J(soundTypeWood).f(bsa.E));
        Block.J(ySa.T, nOa.m, new BlockHugeMushroom(Material.wood, MapColor.redColor, block2).J(psa.N).J(soundTypeWood).f(bsa.E));
        Block.J(zTa.C, xua.Ha, new BlockPane(Material.iron, vRa.d != 0).J(eua.C).l(FRa.Ga).J(soundTypeMetal).f(Rua.G));
        Block.J(jRa.v, ysa.o, new BlockPane(Material.glass, uSa.E != 0).J(bpa.K).J(soundTypeGlass).f(tTa.la));
        object4 = new BlockMelon().J(pqa.r).J(soundTypeWood).f(SOa.Z);
        Block.J(Bsa.E, sOa.e, (Block)object4);
        Block.J(Lqa.h, Uqa.g, new BlockStem((Block)blockArray).J(JPa.N).J(soundTypeWood).f(bSa.R));
        Block.J(xua.S, bRa.q, new BlockStem((Block)object4).J(JPa.N).J(soundTypeWood).f(bSa.R));
        Block.J(Yra.j, qta.J, new BlockVine().J(psa.N).J(soundTypeGrass).f(qta.J));
        Block.J(jpa.E, Tpa.Aa, new BlockFenceGate(BlockPlanks$EnumType.OAK).J(kta.v).l(eua.C).J(soundTypeWood).f(bsa.z));
        Block.J(Jra.o, ZOa.v, new BlockStairs(((Block)object5).J()).f(Jqa.O));
        Block.J(rSa.i, tua.f, new BlockStairs(block4.J().J(BlockStoneBrick.VARIANT, BlockStoneBrick$EnumType.DEFAULT)).f(FPa.l));
        Block.J(Iqa.M, RQa.ja, new BlockMycelium().J(Ora.D).J(soundTypeGrass).f(cPa.p));
        Block.J(fPa.z, Jra.r, new BlockLilyPad().J(JPa.N).J(soundTypeGrass).f(Jra.r));
        object4 = new BlockNetherBrick().J(kta.v).l(FRa.Ga).J(soundTypePiston).f(fqa.l).J(yGa.A);
        Block.J(BRa.E, fTa.c, (Block)object4);
        Block.J(XSa.C, rRa.Ga, new BlockFence(Material.rock, MapColor.netherrackColor).J(kta.v).l(FRa.Ga).J(soundTypePiston).f(PQa.Ka));
        Block.J(WSa.o, Qqa.k, new BlockStairs(((Block)object4).J()).f(KSa.L));
        Block.J(pta.ba, bsa.C, new BlockNetherWart().f(xra.D));
        Block.J(rQa.s, ZOa.Ha, new BlockEnchantmentTable().J(eua.C).l(xqa.O).f(Zra.n));
        Block.J(Ppa.K, pqa.z, new BlockBrewingStand().J(MQa.L).f(Mqa.N).f(uSa.c));
        Block.J(Zta.Q, bsa.q, new BlockCauldron().J(kta.v).f(bsa.q));
        Block.J(yta.g, Bra.X, new BlockEndPortal(Material.portal).J(vqa.T).l(Jra.T));
        Block.J(sOa.D, cra.T, new BlockEndPortalFrame().J(soundTypeGlass).f(Mqa.N).J(vqa.T).f(PRa.c).l(Jra.T).J(yGa.a));
        Block.J(APa.J, hpa.E, new Block(Material.rock, MapColor.sandColor).J(vQa.q).l(qta.D).J(soundTypePiston).f(bpa.h).J(yGa.A));
        Block.J(Zta.Ma, Qqa.U, new BlockDragonEgg().J(vQa.q).l(qta.D).J(soundTypePiston).f(Mqa.N).f(Uqa.ba));
        Block.J(JPa.ga, Era.r, new BlockRedstoneLight(uSa.E != 0).J(bpa.K).J(soundTypeGlass).f(Jra.ga).J(yGa.I));
        Block.J(cPa.Ea, xSa.t, new BlockRedstoneLight(vRa.d != 0).J(bpa.K).J(soundTypeGlass).f(Jra.ga));
        Block.J(ySa.Z, JPa.Da, new BlockDoubleWoodSlab().J(kta.v).l(eua.C).J(soundTypeWood).f(PTa.c));
        Block.J(rQa.i, Cra.Aa, new BlockHalfWoodSlab().J(kta.v).l(eua.C).J(soundTypeWood).f(PTa.c));
        Block.J(cRa.h, ZRa.K, new BlockCocoa().J(psa.N).l(eua.C).J(soundTypeWood).f(ZRa.K));
        Block.J(XOa.h, URa.I, new BlockStairs(((Block)object3).J().J(BlockSandStone.TYPE, BlockSandStone$EnumType.SMOOTH)).f(Tqa.r));
        Block.J(rpa.F, fpa.i, new BlockOre().J(vQa.q).l(eua.C).J(soundTypePiston).f(xOa.t));
        Block.J(GPa.G, wOa.u, new BlockEnderChest().J(xTa.S).l(Jpa.r).J(soundTypePiston).f(KSa.S).f(MQa.L));
        Block.J(vRa.Ea, oqa.m, new BlockTripWireHook().f(LPa.p));
        Block.J(gsa.Ja, Hra.c, new BlockTripWire().f(Zta.ha));
        Block.J(ITa.Da, LQa.x, new Block(Material.iron, MapColor.emeraldColor).J(eua.C).l(FRa.Ga).J(soundTypeMetal).f(Pqa.v).J(yGa.A));
        Block.J(Qqa.Ja, Cta.q, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.SPRUCE)).f(Ora.Ha));
        Block.J(RQa.R, eua.z, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.BIRCH)).f(MQa.p));
        Block.J(PRa.D, jRa.Ja, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.JUNGLE)).f(Upa.u));
        Block.J(ATa.L, ura.R, new BlockCommandBlock().J().l(Jra.T).f(Yua.B));
        Block.J(Ypa.Z, Ura.c, new BlockBeacon().f(Ura.c).f(pqa.r));
        Block.J(iPa.ca, Qpa.H, new BlockWall((Block)object).f(iPa.o));
        Block.J(Bua.v, Ura.Y, new BlockFlowerPot().J(JPa.N).J(soundTypeStone).f(csa.Ga));
        Block.J(SQa.i, Zta.t, new BlockCarrot().f(Zta.t));
        Block.J(Fsa.D, vTa.G, new BlockPotato().f(vTa.G));
        Block.J(NQa.L, uQa.F, new BlockButtonWood().J(MQa.L).J(soundTypeWood).f(hpa.e));
        Block.J(FTa.A, Qta.E, new BlockSkull().J(pqa.r).J(soundTypePiston).f(Qta.E));
        Block.J(Cta.a, Ypa.G, new BlockAnvil().J(eua.C).J(soundTypeAnvil).l(xqa.O).f(Ypa.G));
        Block.J(sOa.x, Npa.Da, new BlockChest(vRa.d).J(MTa.y).J(soundTypeWood).f(sqa.O));
        Block.J(Zqa.Ga, STa.G, new BlockPressurePlateWeighted(Material.iron, Ypa.A, MapColor.goldColor).J(MQa.L).J(soundTypeWood).f(Bra.J));
        Block.J(dpa.Ga, yta.d, new BlockPressurePlateWeighted(Material.iron, Jpa.Ha).J(MQa.L).J(soundTypeWood).f(ZOa.Aa));
        Block.J(gQa.V, Vra.w, new BlockRedstoneComparator(uSa.E != 0).J(JPa.N).J(soundTypeWood).f(SQa.p).f());
        Block.J(Jpa.Ha, pqa.N, new BlockRedstoneComparator(vRa.d != 0).J(JPa.N).f(Jpa.y).J(soundTypeWood).f(SQa.p).f());
        Block.J(Uqa.s, csa.o, (Block)new BlockDaylightDetector(uSa.E != 0));
        Block.J(kpa.Ha, cRa.V, new BlockCompressedPowered(Material.iron, MapColor.tntColor).J(eua.C).l(FRa.Ga).J(soundTypeMetal).f(bua.U).J(yGa.I));
        Block.J(Pua.k, Mqa.G, new BlockOre(MapColor.netherrackColor).J(vQa.q).l(eua.C).J(soundTypePiston).f(dsa.b));
        Block.J(Epa.u, MQa.F, new BlockHopper().J(vQa.q).l(Qsa.k).J(soundTypeMetal).f(MQa.F));
        object = new BlockQuartz().J(soundTypePiston).J(xSa.la).f(JTa.e);
        Block.J(BQa.Q, nOa.c, (Block)object);
        Block.J(yRa.r, Bra.Q, new BlockStairs(((Block)object).J().J(BlockQuartz.VARIANT, BlockQuartz$EnumType.DEFAULT)).f(Xsa.W));
        Block.J(Epa.ja, Gua.d, new BlockRailPowered().J(ZSa.q).J(soundTypeMetal).f(BRa.S));
        Block.J(EPa.l, xqa.x, new BlockDropper().J(Bpa.w).J(soundTypePiston).f(xqa.x));
        Block.J(Qta.A, oQa.N, new BlockColored(Material.rock).J(oQa.z).l(BRa.k).J(soundTypePiston).f(xOa.U));
        Block.J(rRa.f, IPa.Ia, new BlockStainedGlassPane().J(bpa.K).J(soundTypeGlass).f(XTa.w));
        Block.J(QSa.R, ATa.h, new BlockNewLeaf().f(Fsa.Ja));
        Block.J(vua.y, Lsa.U, new BlockNewLog().f(MQa.T));
        Block.J(fta.l, Fua.M, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.ACACIA)).f(vRa.H));
        Block.J(yOa.a, Bsa.ja, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.DARK_OAK)).f(WOa.u));
        Block.J(Yqa.o, DPa.I, new BlockSlime().f(DPa.I).J(SLIME_SOUND));
        Block.J(UTa.R, fpa.E, new BlockBarrier().f(fpa.E));
        Block.J(TPa.Aa, dua.A, new BlockTrapDoor(Material.iron).J(eua.C).J(soundTypeMetal).f(xSa.k).f());
        object = new BlockPrismarine().J(Ira.d).l(FRa.Ga).J(soundTypePiston).f(Era.X);
        Block.J(tua.i, Era.X, (Block)object);
        Block.J(SPa.l, TQa.O, new BlockSeaLantern(Material.glass).J(bpa.K).J(soundTypeGlass).f(pqa.r).f(RQa.ga));
        Block.J(JTa.M, fTa.j, new BlockHay().J(MQa.L).J(soundTypeGrass).f(Bta.X).J(yGa.A));
        Block.J(Jqa.q, hpa.f, new BlockCarpet().J(Nra.e).J(soundTypeCloth).f(Qqa.Aa).J(uSa.E));
        Block.J(ERa.T, wsa.B, new BlockHardenedClay().J(oQa.z).l(BRa.k).J(soundTypePiston).f(Jra.u));
        Block.J(bpa.fa, RQa.T, new Block(Material.rock, MapColor.blackColor).J(eua.C).l(FRa.Ga).J(soundTypePiston).f(WRa.U).J(yGa.A));
        Block.J(Yra.J, TOa.J, new BlockPackedIce().J(MQa.L).J(soundTypeGlass).f(mra.K));
        Block.J(Bsa.n, Fsa.x, (Block)new BlockDoublePlant());
        Block.J(MTa.U, Sqa.ha, new BlockBanner$BlockBannerStanding().J(pqa.r).J(soundTypeWood).f(VQa.M).f());
        Block.J(mPa.Ia, ITa.x, new BlockBanner$BlockBannerHanging().J(pqa.r).J(soundTypeWood).f(VQa.M).f());
        Block.J(DPa.J, RPa.W, (Block)new BlockDaylightDetector(vRa.d != 0));
        block2 = new BlockRedSandstone().J(soundTypePiston).J(xSa.la).f(pPa.Ma);
        Block.J(Fsa.H, SRa.M, block2);
        Block.J(cRa.n, yQa.l, new BlockStairs(block2.J().J(BlockRedSandstone.TYPE, BlockRedSandstone$EnumType.SMOOTH)).f(dua.Ia));
        Block.J(Eqa.S, SQa.ha, new BlockDoubleStoneSlabNew().J(kta.v).l(FRa.Ga).J(soundTypePiston).f(ISa.Ka));
        Block.J(Bsa.H, Lra.C, new BlockHalfStoneSlabNew().J(kta.v).l(FRa.Ga).J(soundTypePiston).f(ISa.Ka));
        Block.J(xua.r, mSa.e, new BlockFenceGate(BlockPlanks$EnumType.SPRUCE).J(kta.v).l(eua.C).J(soundTypeWood).f(bsa.a));
        Block.J(kTa.T, fsa.ha, new BlockFenceGate(BlockPlanks$EnumType.BIRCH).J(kta.v).l(eua.C).J(soundTypeWood).f(Zua.W));
        Block.J(cQa.q, vqa.W, new BlockFenceGate(BlockPlanks$EnumType.JUNGLE).J(kta.v).l(eua.C).J(soundTypeWood).f(WOa.A));
        Block.J(jpa.d, tua.z, new BlockFenceGate(BlockPlanks$EnumType.DARK_OAK).J(kta.v).l(eua.C).J(soundTypeWood).f(tua.ga));
        Block.J(JQa.O, WQa.j, new BlockFenceGate(BlockPlanks$EnumType.ACACIA).J(kta.v).l(eua.C).J(soundTypeWood).f(kqa.K));
        Block.J(sqa.x, lqa.h, new BlockFence(Material.wood, BlockPlanks$EnumType.SPRUCE.func_181070_c()).J(kta.v).l(eua.C).J(soundTypeWood).f(PRa.Q));
        Block.J(kua.D, Spa.M, new BlockFence(Material.wood, BlockPlanks$EnumType.BIRCH.func_181070_c()).J(kta.v).l(eua.C).J(soundTypeWood).f(Gta.k));
        Block.J(Bpa.s, yra.v, new BlockFence(Material.wood, BlockPlanks$EnumType.JUNGLE.func_181070_c()).J(kta.v).l(eua.C).J(soundTypeWood).f(Rua.N));
        Block.J(tTa.L, dQa.K, new BlockFence(Material.wood, BlockPlanks$EnumType.DARK_OAK.func_181070_c()).J(kta.v).l(eua.C).J(soundTypeWood).f(yQa.k));
        Block.J(ppa.f, zta.k, new BlockFence(Material.wood, BlockPlanks$EnumType.ACACIA.func_181070_c()).J(kta.v).l(eua.C).J(soundTypeWood).f(qsa.i));
        Block.J(sOa.S, MQa.Ka, new BlockDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(Sqa.v).f());
        Block.J(UTa.L, Zta.D, new BlockDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(vQa.Ha).f());
        Block.J(xqa.W, xOa.Q, new BlockDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(oQa.ja).f());
        Block.J(pta.c, ysa.l, new BlockDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(POa.r).f());
        Block.J(Bpa.a, Epa.A, new BlockDoor(Material.wood).J(vQa.q).J(soundTypeWood).f(hqa.Da).f());
        blockArray = new Block(Material.rock, MapColor.magentaColor).J(Ira.d).l(FRa.Ga).J(soundTypePiston).J(yGa.A).f(Bpa.z);
        Block.J(Tqa.K, Pqa.R, (Block)blockArray);
        Block.J(bqa.P, JTa.w, new BlockCustomPillar(Material.rock, MapColor.magentaColor).J(Ira.d).l(FRa.Ga).J(soundTypePiston).J(yGa.A).f(Wsa.w));
        Block.J(Bta.la, EQa.f, new BlockStairs(blockArray.J()).f(rSa.Ja));
        Block.J(zOa.a, BQa.X, new BlockPurpurSlab$Double().J(kta.v).l(FRa.Ga).J(soundTypeStone).f(fTa.C));
        Block.J(kTa.Fa, LRa.la, new BlockPurpurSlab$Half().J(kta.v).l(FRa.Ga).J(soundTypeStone).f(fTa.C));
        blockArray = new Block(Material.rock).J(soundTypeStone).J(xSa.la).J(yGa.A).f(Ysa.H);
        Block.J(NSa.ga, UTa.z, (Block)blockArray);
        Block.J(xra.ja, rpa.b, new BlockMagma().J(MQa.L).J(soundTypeStone).f(rpa.b));
        Block.J(Yra.v, aPa.X, new Block(Material.grass, MapColor.redColor).J(yGa.A).J(pqa.r).J(soundTypeWood).f(xTa.a));
        Block block5 = new BlockNetherBrick().J(kta.v).l(FRa.Ga).J(soundTypeStone).f(Gta.W);
        Block.J(QSa.w, hTa.T, block5);
        Block.J(Gua.e, nQa.Y, new BlockBone().J(soundTypeStone).f(UOa.X));
        Block.J(EPa.G, nqa.m, new BlockColored(Material.rock).J(Ssa.la).J(soundTypePiston).f(nqa.m));
        Block.J(kra.w, ATa.F, new BlockConcretePowder().J(MQa.L).J(soundTypeSand).f(WOa.d));
        Block.J(FPa.e, qta.L, new Block(Material.rock, MapColor.netherrackColor).J(Xpa.R).J(soundTypePiston).J(yGa.A).f(wta.V));
        Block.J(DQa.Aa, TOa.x, new Block(Material.rock, MapColor.cyanColor).J(Xpa.R).J(soundTypePiston).J(yGa.A).f(ISa.s));
        Block.J(bsa.X, Jra.O, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.CRIMSON)).f(hra.O));
        Block.J(Pqa.i, zta.ca, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.WARPED)).f(sqa.P));
        Block.J(ZOa.d, qQa.A, new BlockLogStripped1().f(vsa.m));
        Block.J(vTa.y, xua.Ka, new BlockLogStripped2().f(vsa.m));
        Block.J(qQa.J, EQa.p, new BlockLogStripped3().f(vsa.m));
        Block.J(bSa.a, Upa.I, new Block(Material.sponge).J(Ora.D).J(soundTypeGrass).f(Zra.ga).J(yGa.A));
        Block.J(Zpa.I, IPa.Ga, new Block(Material.rock, MapColor.terracottaWhiteColor).J(wOa.w).J(yGa.A).f(IPa.Ga));
        Block.J(AQa.Ha, tSa.D, new Block(Material.amethyst, Material.amethyst.J()).J(Ira.d).J(yGa.A).f(tSa.D));
        Block.J(Mqa.ja, Gua.j, new BlockBuddingAmethyst().J(Ira.d).J(yGa.A).f(kua.Da));
        Block.J(fPa.b, oQa.r, new BlockCustomPillar(Material.rock, MapColor.blackColor).J(oQa.z).l(fPa.ha).J(yGa.A).f(oQa.r));
        Block.J(YSa.c, BRa.J, new Block(Material.rock, MapColor.blackColor).J(oQa.z).l(fPa.ha).J(yGa.A).f(uua.f));
        Block.J(Yqa.Da, tTa.fa, new BlockSculk().J(psa.N).J(yGa.A).f(tTa.fa));
        Block.J(qQa.Z, zOa.i, new Block(Material.rock, MapColor.blackColor).f(lTa.T).J(SPa.b).l(xqa.O).J(soundTypePiston).J(yGa.A).f(AQa.Q));
        Block.J(rQa.e, Vua.d, new BlockFroglight().f(Vua.d));
        Block.J(cPa.Ma, Usa.K, new BlockCustomFacing(Material.wood, MapColor.yellowColor).J(bpa.K).J(soundTypeWood).f(iSa.v));
        Block.J(Xsa.z, XTa.E, new Block(Material.moss, MapColor.greenColor).J(Nra.e).J(yGa.A).f(vsa.U));
        Block block6 = new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(lqa.ga).J(yGa.A).f(tTa.W);
        Block.J(Hta.d, pqa.Q, block6);
        Block block7 = new BlockMud().J(MQa.L).f(wPa.c);
        Block.J(tua.G, wPa.c, block7);
        Block.J(Lsa.L, STa.V, new Block(Material.ground, MapColor.cyanColor).J(pqa.r).l(vQa.q).J(soundTypeGravel).J(yGa.A).f(xua.f));
        block7 = new Block(Material.rock, MapColor.terracottaLightGrayColor).J(Ira.d).l(vQa.q).J(soundTypeStone).J(yGa.A).f(Cta.F);
        Block.J(vPa.a, Lsa.p, block7);
        Object object6 = new BlockCopper().f(Era.L);
        Block.J(vqa.Y, Era.L, (Block)object6);
        Block.J(hQa.a, rSa.K, (Block)new BlockGlazedTerracotta1());
        Block.J(gQa.P, fqa.n, (Block)new BlockGlazedTerracotta2());
        Block.J(yRa.T, eta.ga, (Block)new BlockGlazedTerracotta3());
        Block.J(fTa.Ja, Xpa.w, (Block)new BlockGlazedTerracotta4());
        Block.J(rRa.S, ura.g, new BlockObserver().J(vQa.q).J(soundTypePiston).J(yGa.I).f(ura.g));
        Block.J(sqa.e, hqa.A, new BlockNewLog2().f(MQa.T));
        Block block8 = object6;
        object6 = block8.J().J(BlockCopper.VARIANT, BlockCopper$EnumVariant.OXIDIZED_CUT_COPPER);
        Object object7 = block8.J().J(BlockCopper.VARIANT, BlockCopper$EnumVariant.WEATHERED_CUT_COPPER);
        Object object8 = block8.J().J(BlockCopper.VARIANT, BlockCopper$EnumVariant.EXPOSED_CUT_COPPER);
        Object object9 = block8.J().J(BlockCopper.VARIANT, BlockCopper$EnumVariant.CUT_COPPER);
        IBlockState iBlockState = block4.J().J(BlockStoneBrick.VARIANT, BlockStoneBrick$EnumType.MOSSY);
        Block block9 = block;
        IBlockState iBlockState2 = block9.J().J(BlockStone.VARIANT, BlockStone$EnumType.GRANITE);
        IBlockState iBlockState3 = block9.J().J(BlockStone.VARIANT, BlockStone$EnumType.ANDESITE);
        IBlockState iBlockState4 = block9.J().J(BlockStone.VARIANT, BlockStone$EnumType.DIORITE);
        Block block10 = object;
        IBlockState iBlockState5 = block10.J().J(BlockPrismarine.VARIANT, BlockPrismarine$EnumType.BRICKS);
        IBlockState iBlockState6 = block10.J().J(BlockPrismarine.VARIANT, BlockPrismarine$EnumType.DARK);
        Block.J(Jpa.z, ROa.C, new Block(Material.rock, MapColor.blackColor).J(NSa.B).l(xqa.O).J(yGa.A).f(bua.c).f());
        Block block11 = new Block(Material.wood, MapColor.yellowColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(lTa.I).f();
        Block.J(Sqa.c, ppa.O, block11);
        Block.J(Psa.l, EQa.w, new BlockCustomPillar(Material.rock, MapColor.blackColor).J(oQa.z).l(BRa.k).J(yGa.A).f(XTa.K).f());
        Block block12 = new Block(Material.rock, MapColor.blackColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(Tpa.F).f();
        Block.J(Fpa.S, Tpa.F, block12);
        Block block13 = new BlockCustomSlab$Half(block12).J(kta.v).l(FRa.Ga).J(yGa.A).f(FTa.D).f();
        Block.J(rta.G, Wsa.p, block13);
        Block.J(Ssa.ba, Xpa.X, new BlockCustomSlab$Double(block12, block13).J(kta.v).l(FRa.Ga).J(yGa.A).f(FTa.D).f());
        Block.J(Eqa.Ha, Ssa.S, new BlockStairs(block12.J()).f(qsa.k).f());
        block13 = new Block(Material.rock, MapColor.blackColor).J(kta.v).l(FRa.Ga).J(yGa.A).f(Gta.R).f();
        Block.J(asa.F, CRa.X, block13);
        Block block14 = new BlockCustomSlab$Half(block13).J(kta.v).l(FRa.Ga).J(yGa.A).f(yRa.ja).f();
        Block.J(aSa.la, Lqa.Ja, block14);
        Block.J(Nta.p, xqa.h, new BlockCustomSlab$Double(block13, block14).J(kta.v).l(FRa.Ga).J(yGa.A).f(yRa.ja).f());
        block14 = new Block(Material.rock, MapColor.blackColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(JSa.Q).f();
        Block.J(FTa.u, sOa.N, block14);
        Block block15 = new BlockCustomSlab$Half(block14).J(kta.v).l(FRa.Ga).J(yGa.A).f(Psa.O).f();
        Block.J(Jpa.Ja, Eqa.l, block15);
        Block.J(GPa.Ga, Asa.z, new BlockCustomSlab$Double(block14, block15).J(kta.v).l(FRa.Ga).J(yGa.A).f(Psa.O).f());
        Block.J(vua.I, Gta.O, new BlockStairs(block14.J()).f(bSa.p).f());
        Block.J(hQa.q, wra.U, new Block(Material.rock, MapColor.blackColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(Ypa.I).f());
        Block.J(rSa.fa, nQa.W, new Block(Material.rock, MapColor.blackColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(PQa.z).f());
        Block.J(aua.f, CRa.ha, new Block(Material.rock, MapColor.blackColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(vpa.Z).f());
        block15 = new Block(Material.wood, MapColor.yellowColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(FPa.R).f();
        Block.J(GPa.Ja, Yua.ga, block15);
        Block.J(RPa.v, Fua.s, new BlockCustomPillar(Material.wood, MapColor.yellowColor).J(kta.v).l(rpa.V).J(soundTypeWood).J(yGa.A).f(fpa.Z).f());
        Block.J(vpa.Ha, FRa.c, new BlockCustomPillar(Material.wood, MapColor.yellowColor).J(kta.v).l(rpa.V).J(soundTypeWood).J(yGa.A).f(LRa.T).f());
        Block.J(BQa.Fa, Fpa.g, new Block(Material.rock, MapColor.stoneColor).J(vQa.q).l(eua.C).J(yGa.A).f(sqa.fa).f());
        Block.J(FRa.g, asa.Aa, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(Vua.Z).f());
        Block.J(KQa.T, cQa.V, new Block(Material.rock, MapColor.warpedNyliumColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Nta.N).f());
        Block.J(Jsa.s, uOa.Ia, new Block(Material.rock, MapColor.warpedStemColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(nua.F).f());
        Block.J(Lsa.fa, Yua.F, new Block(Material.rock, MapColor.terracottaLightGrayColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(BQa.o).f());
        Block.J(SRa.S, kPa.Aa, new Block(Material.rock, MapColor.adobeColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(MRa.o).f());
        Block.J(TPa.h, aPa.b, new Block(Material.rock, MapColor.warpedNyliumColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(wta.J).f());
        Block.J(tua.R, FTa.m, new Block(Material.rock, MapColor.warpedStemColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(rpa.G).f());
        Block.J(LPa.K, Cra.P, new Block(Material.rock, MapColor.terracottaLightGrayColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Uqa.Ia).f());
        Block.J(fsa.I, Lqa.f, new Block(Material.rock, MapColor.adobeColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(nQa.P).f());
        Block.J(ura.Ja, Pqa.E, new BlockStairs((IBlockState)object6).f(bqa.Ja).f());
        Block.J(KPa.ca, Xsa.u, new BlockStairs((IBlockState)object7).f(Bua.Y).f());
        Block.J(xqa.d, POa.Ja, new BlockStairs((IBlockState)object8).f(Ira.Z).f());
        Block.J(tSa.g, POa.I, new BlockStairs((IBlockState)object9).f(Lsa.Ga).f());
        Block block16 = new BlockCustomSlab$Half((IBlockState)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(RPa.b).f();
        Block.J(TQa.D, Xsa.Ka, block16);
        Block.J(uua.P, nQa.S, new BlockCustomSlab$Double((IBlockState)object6, block16).J(vQa.q).l(FRa.Ga).J(yGa.A).f(RPa.b).f());
        object6 = new BlockCustomSlab$Half((IBlockState)object7).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Mqa.X).f();
        Block.J(kpa.r, oqa.V, (Block)object6);
        Block.J(xqa.t, Ira.fa, new BlockCustomSlab$Double((IBlockState)object7, (Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Mqa.X).f());
        object6 = new BlockCustomSlab$Half((IBlockState)object8).J(vQa.q).l(FRa.Ga).J(yGa.A).f(fta.v).f();
        Block.J(APa.e, Uta.fa, (Block)object6);
        Block.J(hqa.la, gQa.Q, new BlockCustomSlab$Double((IBlockState)object8, (Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(fta.v).f());
        object6 = new BlockCustomSlab$Half((IBlockState)object9).J(vQa.q).l(FRa.Ga).J(yGa.A).f(cPa.P).f();
        Block.J(aPa.o, LPa.ja, (Block)object6);
        Block.J(fpa.ga, Sqa.fa, new BlockCustomSlab$Double((IBlockState)object9, (Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(cPa.P).f());
        Block.J(KQa.W, Pqa.c, new Block(Material.rock, MapColor.adobeColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Bra.c).f());
        Block.J(uOa.Ka, tSa.Z, new Block(Material.rock, MapColor.warpedStemColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(kqa.fa).f());
        Block.J(XSa.U, Gua.Da, new Block(Material.rock, MapColor.terracottaLightGrayColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(zsa.e).f());
        Block.J(sra.fa, LRa.v, new Block(Material.rock, MapColor.warpedNyliumColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(vpa.D).f());
        object6 = new Block(Material.rock, MapColor.warpedNyliumColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(SOa.m).f();
        Block.J(Fpa.d, Gua.Y, (Block)object6);
        object7 = new Block(Material.rock, MapColor.warpedStemColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Vra.Ka).f();
        Block.J(isa.o, Asa.D, (Block)object7);
        object8 = new Block(Material.rock, MapColor.terracottaLightGrayColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Jpa.N).f();
        Block.J(Vua.B, ERa.A, (Block)object8);
        object9 = new Block(Material.rock, MapColor.adobeColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(pua.O).f();
        Block.J(Qra.S, Sqa.H, (Block)object9);
        Block.J(tpa.H, Ora.Aa, new BlockStairs(((Block)object6).J()).f(Uqa.j).f());
        Block.J(vua.l, aSa.d, new BlockStairs(((Block)object7).J()).f(Ypa.u).f());
        Block.J(KPa.Y, Asa.Aa, new BlockStairs(((Block)object8).J()).f(qQa.ja).f());
        Block.J(pua.M, cRa.W, new BlockStairs(((Block)object9).J()).f(zpa.K).f());
        block16 = new BlockCustomSlab$Half((Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(ypa.v).f();
        Block.J(nqa.R, rQa.V, block16);
        Block.J(Pua.f, Jra.d, new BlockCustomSlab$Double((Block)object6, block16).J(vQa.q).l(FRa.Ga).J(yGa.A).f(ypa.v).f());
        object6 = new BlockCustomSlab$Half((Block)object7).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Gta.l).f();
        Block.J(Bpa.m, Qsa.u, (Block)object6);
        Block.J(dua.c, Cta.Ka, new BlockCustomSlab$Double((Block)object7, (Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Gta.l).f());
        object6 = new BlockCustomSlab$Half((Block)object8).J(vQa.q).l(FRa.Ga).J(yGa.A).f(aua.S).f();
        Block.J(kta.l, BPa.O, (Block)object6);
        Block.J(Bpa.G, lqa.X, new BlockCustomSlab$Double((Block)object8, (Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(aua.S).f());
        object6 = new BlockCustomSlab$Half((Block)object9).J(vQa.q).l(FRa.Ga).J(yGa.A).f(TPa.E).f();
        Block.J(GPa.b, CRa.k, (Block)object6);
        Block.J(Yqa.F, aua.ha, new BlockCustomSlab$Double((Block)object9, (Block)object6).J(vQa.q).l(FRa.Ga).J(yGa.A).f(TPa.E).f());
        Block.J(nQa.h, bqa.w, new BlockCopperGrate(Material.rock, MapColor.adobeColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(mra.V).f());
        Block.J(nqa.L, mra.p, new BlockCopperGrate(Material.rock, MapColor.terracottaLightGrayColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Iqa.ga).f());
        Block.J(pua.k, cRa.ia, new BlockCopperGrate(Material.rock, MapColor.warpedStemColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(qsa.y).f());
        Block.J(TOa.A, Xpa.B, new BlockCopperGrate(Material.rock, MapColor.warpedNyliumColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Lqa.P).f());
        Block.J(Qsa.ga, osa.d, new BlockCopperGrate(Material.rock, MapColor.adobeColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Jta.S).f());
        Block.J(Lsa.Y, gua.Ka, new BlockCopperGrate(Material.rock, MapColor.terracottaLightGrayColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(Eqa.e).f());
        Block.J(rRa.Q, rpa.U, new BlockCopperGrate(Material.rock, MapColor.warpedStemColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(WPa.Q).f());
        Block.J(ZSa.L, iSa.B, new BlockCopperGrate(Material.rock, MapColor.warpedNyliumColor).J(vQa.q).l(FRa.Ga).J(yGa.A).f(yRa.n).f());
        Block.J(fPa.m, Jta.Ja, new Block(Material.rock).J(eua.C).l(FRa.Ga).J(yGa.A).f(wOa.b).f());
        Block.J(xra.M, Ora.G, new Block(Material.rock, MapColor.adobeColor).J(eua.C).l(FRa.Ga).J(yGa.A).f(uRa.y).f());
        Block.J(Wsa.x, wOa.A, new Block(Material.rock, MapColor.goldColor).J(eua.C).l(FRa.Ga).J(yGa.A).f(BPa.j).f());
        object6 = new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(ZOa.la).f();
        Block.J(jRa.l, ZOa.la, (Block)object6);
        object7 = new BlockCustomSlab$Half((Block)object6).J(Ira.d).l(FRa.Ga).J(yGa.A).f(fpa.Ja).f();
        Block.J(Jra.K, LPa.R, (Block)object7);
        Block.J(kra.o, bRa.Q, new BlockCustomSlab$Double((Block)object6, (Block)object7).J(Ira.d).l(FRa.Ga).J(yGa.A).f(fpa.Ja).f());
        Block.J(vTa.d, wsa.C, new BlockStairs(((Block)object6).J()).f(TQa.W).f());
        object7 = new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(xTa.E).f();
        Block.J(NSa.S, Lsa.ga, (Block)object7);
        object8 = new BlockCustomSlab$Half((Block)object7).J(Ira.d).l(FRa.Ga).J(yGa.A).f(kqa.e).f();
        Block.J(LQa.Ma, Gta.p, (Block)object8);
        Block.J(Yua.m, vpa.E, new BlockCustomSlab$Double((Block)object7, (Block)object8).J(Ira.d).l(FRa.Ga).J(yGa.A).f(kqa.e).f());
        Block.J(jsa.u, ypa.o, new BlockStairs(((Block)object7).J()).f(vsa.g).f());
        Block.J(POa.J, NSa.fa, new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(SQa.R).f());
        object8 = new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(Lra.R).f();
        Block.J(Pua.T, aqa.y, (Block)object8);
        object9 = new BlockCustomSlab$Half((Block)object8).J(Ira.d).l(FRa.Ga).J(yGa.A).f(ura.T).f();
        Block.J(VQa.G, qsa.ja, (Block)object9);
        Block.J(Jpa.Ga, aQa.H, new BlockCustomSlab$Double((Block)object8, (Block)object9).J(Ira.d).l(FRa.Ga).J(yGa.A).f(ura.T).f());
        Block.J(yra.fa, Tqa.Ga, new BlockStairs(((Block)object8).J()).f(kra.i).f());
        Block.J(hpa.Y, KQa.fa, new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(LRa.b).f());
        object9 = new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(nqa.g).f();
        Block.J(nqa.e, EQa.Aa, (Block)object9);
        Block.J(RQa.L, pta.Ca, new BlockStairs(((Block)object9).J()).f(jpa.A).f());
        block16 = new BlockCustomSlab$Half((Block)object9).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(Spa.j).f();
        Block.J(Era.p, BPa.l, block16);
        Block.J(Jsa.ja, vqa.t, new BlockCustomSlab$Double((Block)object9, block16).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(Spa.j).f());
        block16 = new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(xra.x).f();
        Block.J(mPa.J, tpa.s, block16);
        Block.J(Fua.o, xOa.k, new BlockStairs(block16.J()).f(SRa.ja).f());
        Block block17 = new BlockCustomSlab$Half(block16).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(osa.F).f();
        Block.J(lPa.ca, Jpa.e, block17);
        Block.J(TPa.e, Uta.c, new BlockCustomSlab$Double(block16, block17).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(osa.F).f());
        block17 = new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(dsa.J).f();
        Block.J(cra.r, NOa.R, block17);
        Block.J(rua.m, oQa.E, new BlockStairs(block17.J()).f(gua.ja).f());
        Block block18 = new BlockCustomSlab$Half(block17).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(Fsa.t).f();
        Block.J(URa.h, Uta.A, block18);
        Block.J(JQa.f, oqa.Ha, new BlockCustomSlab$Double(block17, block18).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(Fsa.t).f());
        Block.J(hqa.p, psa.K, new BlockStairs(block6.J()).f(aua.H).f());
        block18 = new BlockCustomSlab$Half(block6).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(Ppa.m).f();
        Block.J(BQa.t, Iqa.K, block18);
        Block.J(XTa.M, NOa.k, new BlockCustomSlab$Double(block6, block18).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(Ppa.m).f());
        Block.J(kra.a, iPa.a, new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(opa.G).f());
        Block.J(NQa.K, hra.d, new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(WRa.R).f());
        Block.J(Lsa.V, gua.j, new Block(Material.rock, MapColor.deepslateColor).J(Bpa.w).l(FRa.Ga).J(yGa.A).f(gsa.W).f());
        Block.J(jRa.ba, Bua.O, new Block(Material.rock, MapColor.grayColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(JTa.h).f());
        Block.J(pPa.O, EPa.ja, new Block(Material.rock, MapColor.grayColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(cRa.m).f());
        Block.J(ZOa.p, vQa.Ga, new Block(Material.rock, MapColor.grayColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(kta.y).f());
        Block.J(kta.a, Nra.U, new Block(Material.rock, MapColor.grayColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(IPa.f).f());
        Block.J(Vra.Da, rta.h, new Block(Material.rock, MapColor.grayColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(bsa.n).f());
        Block.J(Uqa.v, pua.J, new Block(Material.rock, MapColor.blueColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(Jra.ja).f());
        Block.J(dQa.F, ATa.N, new Block(Material.rock, MapColor.pinkColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(LQa.Ba).f());
        Block.J(AQa.ja, ROa.I, new Block(Material.rock, MapColor.purpleColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(lqa.j).f());
        Block.J(xra.T, dpa.Ka, new Block(Material.rock, MapColor.redColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(GPa.Ha).f());
        Block.J(rQa.w, AQa.X, new Block(Material.rock, MapColor.yellowColor).J(Ira.d).l(FRa.Ga).J(yGa.A).f(zta.u).f());
        Block.J(kqa.i, ppa.Ka, new BlockCustomPillar(Material.wood, MapColor.adobeColor).J(FRa.Ga).l(tSa.r).J(soundTypeWood).J(yGa.A).f(SQa.q).f());
        Block.J(Tqa.Aa, zOa.c, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(xOa.g).f());
        Block.J(kqa.v, vsa.ja, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(Ura.C).f());
        Block.J(TQa.Q, Bta.E, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(nQa.X).f());
        Block.J(cRa.D, bRa.O, new Block(Material.rock, MapColor.netherrackColor).J(vQa.q).l(eua.C).J(yGa.A).f(rRa.e).f());
        Block.J(zTa.Ka, VQa.Da, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(kta.w).f());
        Block.J(JSa.U, Nra.L, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(VPa.J).f());
        Block.J(ZSa.h, kpa.X, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(xTa.b).f());
        Block.J(hTa.A, FRa.N, new Block(Material.rock, MapColor.deepslateColor).J(Jta.r).l(eua.C).J(yGa.A).f(Usa.Ha).f());
        Block.J(xua.b, yta.u, new Block(Material.rock, MapColor.deepslateColor).J(sSa.h).l(xqa.O).J(yGa.A).f(fqa.V).f());
        Block.J(Spa.x, nua.P, new Block(Material.rock, MapColor.greenColor).J(MQa.L).l(UTa.k).J(yGa.A).f(NTa.Ja).f());
        Block.J(rQa.Ka, Usa.P, new Block(Material.rock).J(Ira.d).l(hQa.p).J(yGa.A).f(SRa.p).f());
        Block.J(ERa.q, Bpa.ca, new Block(Material.rock, MapColor.ironColor).J(Bpa.w).l(dpa.u).J(yGa.A).f(Bpa.ca).f());
        Block.J(Hra.O, fpa.L, new Block(Material.rock).J(yGa.A).f(uqa.O).f());
        block18 = new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(fqa.Ka).f();
        Block.J(Jqa.C, Jsa.E, block18);
        Block.J(rQa.K, pta.K, new BlockStairs(block18.J()).f(WPa.m).f());
        Block block19 = new BlockCustomSlab$Half(block18).J(Ira.d).l(FRa.Ga).J(yGa.A).f(Jpa.Ia).f();
        Block.J(wta.d, ysa.z, block19);
        Block.J(vua.v, ROa.d, new BlockCustomSlab$Double(block18, block19).J(Ira.d).l(FRa.Ga).J(yGa.A).f(Jpa.Ia).f());
        Block.J(xra.V, kTa.ga, new Block(Material.rock).J(Ira.d).l(FRa.Ga).J(yGa.A).f(yRa.C).f());
        Block.J(qsa.Ka, Hta.y, new BlockCustomWall(block4).f(Eqa.p).f());
        Block.J(FRa.Ia, WSa.r, new BlockCustomWall(iBlockState).f(vPa.A).f());
        Block.J(Ata.R, aPa.V, new BlockCustomWall(iBlockState2).f(kra.d).f());
        Block.J(bsa.Z, yra.L, new BlockCustomWall(iBlockState3).f(mra.m).f());
        Block.J(POa.Y, pta.F, new BlockCustomWall(iBlockState4).f(oqa.l).f());
        Block.J(wOa.Ga, rta.C, new BlockCustomWall(block18).f(uQa.M).f());
        Block.J(Ypa.y, mra.G, new BlockCustomWall((Block)object5).f(rQa.S).f());
        Block.J(sra.Y, MRa.J, new BlockCustomWall((Block)object).f(DPa.fa).f());
        Block.J(aPa.s, Vra.Q, new BlockCustomWall((Block)object3).f(WPa.r).f());
        Block.J(vRa.ca, psa.f, new BlockCustomWall(block2).f(uqa.I).f());
        Block.J(wOa.C, Epa.b, new BlockCustomWall(block7).f(Jta.t).f());
        Block.J(WQa.Y, Xpa.L, new BlockCustomWall((Block)object4).f(Npa.Ia).f());
        Block.J(ZSa.F, ZSa.n, new BlockCustomWall(block5).f(jpa.H).f());
        Block.J(Bta.p, bqa.A, new BlockCustomWall((Block)blockArray).f(sra.d).f());
        Block.J(rua.i, jpa.C, new BlockCustomWall(block12).f(NSa.ca).f());
        Block.J(xOa.K, eta.C, new BlockCustomWall(block14).f(Mqa.q).f());
        Block.J(hpa.T, Tqa.z, new BlockCustomWall(block13).f(uua.fa).f());
        Block.J(Gta.y, YSa.t, new BlockCustomWall((Block)object6).f(Qqa.X).f());
        Block.J(PTa.s, eua.b, new BlockCustomWall((Block)object7).f(Fsa.o).f());
        Block.J(kta.x, qQa.D, new BlockCustomWall((Block)object8).f(Epa.B).f());
        Block.J(fqa.f, RPa.C, new BlockCustomWall((Block)object9).f(Jpa.W).f());
        Block.J(pPa.R, JSa.ja, new BlockCustomWall(block16).f(gsa.T).f());
        Block.J(Zra.J, uua.Ga, new BlockCustomWall(block17).f(ura.O).f());
        Block.J(ISa.Y, tSa.Ga, new BlockCustomWall(block6).f(STa.D).f());
        object3 = new BlockCustomSlab$Half(iBlockState).J(Ira.d).l(FRa.Ga).J(yGa.A).f(cQa.E).f();
        Block.J(isa.la, bRa.i, (Block)object3);
        Block.J(lPa.v, UOa.Y, new BlockCustomSlab$Double(iBlockState, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(cQa.E).f());
        object3 = new BlockCustomSlab$Half(iBlockState2).J(Ira.d).l(FRa.Ga).J(yGa.A).f(ysa.g).f();
        Block.J(bSa.b, VPa.V, (Block)object3);
        Block.J(QSa.F, FPa.K, new BlockCustomSlab$Double(iBlockState2, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(ysa.g).f());
        object3 = new BlockCustomSlab$Half(iBlockState3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(KPa.Ga).f();
        Block.J(cRa.j, tTa.b, (Block)object3);
        Block.J(PTa.S, Ysa.h, new BlockCustomSlab$Double(iBlockState3, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(KPa.Ga).f());
        object3 = new BlockCustomSlab$Half(iBlockState4).J(Ira.d).l(FRa.Ga).J(yGa.A).f(vRa.j).f();
        Block.J(ROa.fa, yOa.I, (Block)object3);
        Block.J(Yra.r, MQa.Q, new BlockCustomSlab$Double(iBlockState4, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(vRa.j).f());
        object3 = new BlockCustomSlab$Half((Block)object).J(Ira.d).l(FRa.Ga).J(yGa.A).f(cTa.Ka).f();
        Block.J(Wsa.Ha, dpa.a, (Block)object3);
        Block.J(nqa.O, Lqa.t, new BlockCustomSlab$Double((Block)object, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(cTa.Ka).f());
        object3 = new BlockCustomSlab$Half(iBlockState5).J(Ira.d).l(FRa.Ga).J(yGa.A).f(MTa.b).f();
        Block.J(tua.C, sra.Ja, (Block)object3);
        Block.J(Wqa.w, EPa.q, new BlockCustomSlab$Double(iBlockState5, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(MTa.b).f());
        object3 = new BlockCustomSlab$Half(iBlockState6).J(Ira.d).l(FRa.Ga).J(yGa.A).f(pqa.l).f();
        Block.J(Lra.k, Pqa.H, (Block)object3);
        Block.J(kpa.J, dua.i, new BlockCustomSlab$Double(iBlockState6, (Block)object3).J(Ira.d).l(FRa.Ga).J(yGa.A).f(pqa.l).f());
        object3 = new BlockCustomSlab$Half(block7).J(Ira.d).l(eua.C).J(yGa.A).f(DQa.A).f();
        Block.J(Nra.c, pua.S, (Block)object3);
        Block.J(Yqa.r, vqa.N, new BlockCustomSlab$Double(block7, (Block)object3).J(Ira.d).l(eua.C).J(yGa.A).f(DQa.A).f());
        object3 = new BlockCustomSlab$Half(block5).J(kta.v).l(FRa.Ga).J(yGa.A).f(WQa.S).f();
        Block.J(Qpa.Q, DQa.I, (Block)object3);
        Block.J(qQa.C, cra.l, new BlockCustomSlab$Double(block5, (Block)object3).J(kta.v).l(FRa.Ga).J(yGa.A).f(WQa.S).f());
        object3 = new BlockCustomSlab$Half((Block)blockArray).J(vQa.q).l(qta.D).J(yGa.A).f(NQa.v).f();
        Block.J(zua.p, zsa.c, (Block)object3);
        Block.J(Bua.N, bsa.d, new BlockCustomSlab$Double((Block)blockArray, (Block)object3).J(vQa.q).l(qta.D).J(yGa.A).f(NQa.v).f());
        object3 = new BlockCustomSlab$Half(block15).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(Nra.g).f();
        Block.J(Nta.Ja, EQa.g, (Block)object3);
        Block.J(ppa.i, bua.ga, new BlockCustomSlab$Double(block15, (Block)object3).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(Nra.g).f());
        object3 = new BlockCustomSlab$Half(block11).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(rpa.Aa).f();
        Block.J(bsa.Ha, Lra.S, (Block)object3);
        Block.J(rta.k, Jpa.I, new BlockCustomSlab$Double(block11, (Block)object3).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(rpa.Aa).f());
        Block.J(zua.R, lqa.C, new BlockStairs(iBlockState).f(tTa.O).f());
        Block.J(Zra.s, Eqa.H, new BlockStairs(iBlockState2).f(Ora.f).f());
        Block.J(Ypa.F, XSa.o, new BlockStairs(iBlockState3).f(fpa.Ka).f());
        Block.J(EQa.j, URa.k, new BlockStairs(iBlockState4).f(kua.d).f());
        Block.J(Sqa.Y, fsa.ga, new BlockStairs(((Block)object).J()).f(KSa.r).f());
        Block.J(VQa.d, yQa.n, new BlockStairs(iBlockState5).f(ppa.w).f());
        Block.J(AQa.B, tpa.w, new BlockStairs(iBlockState6).f(Zra.O).f());
        Block.J(bRa.A, Pua.n, new BlockStairs(block7.J()).f(XTa.e).f());
        Block.J(Zqa.U, Yqa.v, new BlockStairs(block5.J()).f(lPa.P).f());
        Block.J(NQa.Aa, YSa.h, new BlockStairs(blockArray.J()).f(uqa.i).f());
        Block.J(ySa.n, SRa.x, new BlockStairs(block15.J()).f(KQa.v).f());
        Block.J(zOa.A, ysa.E, new BlockStairs(block11.J()).f(KTa.X).f());
        object = new BlockCustomSlab$Half(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.MANGROVE)).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(JQa.t).f();
        Block.J(Lsa.g, fta.k, (Block)object);
        Block.J(fPa.Y, mSa.k, new BlockCustomSlab$Double(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.MANGROVE), (Block)object).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(JQa.t).f());
        object = new BlockCustomSlab$Half(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.CHERRY)).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(JPa.S).f();
        Block.J(tua.Y, Fua.r, (Block)object);
        Block.J(ZRa.B, QSa.S, new BlockCustomSlab$Double(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.CHERRY), (Block)object).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(JPa.S).f());
        object = new BlockCustomSlab$Half(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.PALE_OAK)).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(wOa.o).f();
        Block.J(yra.k, Ssa.ca, (Block)object);
        Block.J(Qra.w, wta.K, new BlockCustomSlab$Double(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.PALE_OAK), (Block)object).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.A).f(wOa.o).f());
        Block.J(Lsa.E, sOa.R, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.MANGROVE)).f(iPa.fa).f());
        Block.J(Uta.G, ura.Da, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.CHERRY)).f(hqa.j).f());
        Block.J(ZRa.a, zsa.q, new BlockStairs(((Block)object2).J().J(BlockPlanks.VARIANT, BlockPlanks$EnumType.PALE_OAK)).f(cPa.K).f());
        Block.J(Epa.O, PTa.N, new BlockFence(Material.wood).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.a).f(mra.y).f());
        Block.J(wta.F, uqa.Z, new BlockFence(Material.wood, MapColor.warpedStemColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.a).f(yRa.g).f());
        Block.J(cPa.a, Gua.f, new BlockFence(Material.wood, MapColor.redColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.a).f(Jqa.B).f());
        Block.J(lQa.W, hra.w, new BlockFence(Material.wood, MapColor.terracottaWhiteColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.a).f(SOa.Aa).f());
        Block.J(NSa.Y, Jra.p, new BlockFence(Material.wood, MapColor.quartzColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.a).f(vsa.N).f());
        Block.J(Ysa.l, gQa.fa, new BlockFence(Material.wood, MapColor.yellowColor).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.a).f(nua.w).f());
        Block.J(fqa.s, FPa.W, new BlockFenceGate(BlockPlanks$EnumType.CRIMSON).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.I).f(yRa.a).f());
        Block.J(LPa.Q, Rua.Q, new BlockFenceGate(BlockPlanks$EnumType.WARPED).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.I).f(QTa.f).f());
        Block.J(XOa.L, Ppa.t, new BlockFenceGate(BlockPlanks$EnumType.MANGROVE).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.I).f(yOa.d).f());
        Block.J(Bra.u, lqa.m, new BlockFenceGate(BlockPlanks$EnumType.CHERRY).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.I).f(ypa.p).f());
        Block.J(TQa.Aa, TOa.Z, new BlockFenceGate(BlockPlanks$EnumType.PALE_OAK).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.I).f(Lsa.x).f());
        Block.J(vua.F, fpa.Ha, new BlockFenceGate(BlockPlanks$EnumType.PALE_OAK).J(kta.v).l(eua.C).J(soundTypeWood).J(yGa.I).f(Nta.k).f());
        Block.J(qsa.D, bpa.n, new BlockDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).J(yGa.I).f(Bra.M).f());
        Block.J(Lsa.N, Ppa.L, new BlockDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).J(yGa.I).f(ZOa.Ia).f());
        Block.J(cQa.c, LRa.m, new BlockDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).J(yGa.I).f(Lqa.m).f());
        Block.J(Wqa.Aa, fTa.m, new BlockDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).J(yGa.I).f(FTa.L).f());
        Block.J(ITa.c, kra.B, new BlockDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).J(yGa.I).f(ISa.C).f());
        Block.J(dqa.M, bqa.ha, new BlockDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).J(yGa.I).f(hTa.V).f());
        Block.J(zsa.D, NTa.Y, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(Yra.G).f());
        Block.J(bqa.z, aua.w, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(Epa.X).f());
        Block.J(jRa.ga, qsa.m, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(Eqa.D).f());
        Block.J(Epa.V, VQa.fa, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(wua.X).f());
        Block.J(Uqa.ca, kPa.E, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(Jsa.j).f());
        Block.J(Eqa.Aa, dQa.Fa, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(KSa.n).f());
        Block.J(Wqa.G, jpa.z, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(ZSa.V).f());
        Block.J(aua.Ga, Lqa.Z, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(ura.b).f());
        Block.J(uqa.k, KSa.c, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(FTa.Ka).f());
        Block.J(Lqa.Q, fta.i, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(GPa.U).f());
        Block.J(LQa.Aa, Ppa.f, new BlockTrapDoor(Material.wood).J(vQa.q).l(eua.C).J(soundTypeWood).f(ZRa.Ka).f());
        Block.J(mPa.d, nqa.v, new BlockTrapDoor(Material.iron).J(vQa.q).l(FRa.Ga).f(IPa.K).f());
        Block.J(PRa.v, aqa.c, new BlockTrapDoor(Material.iron).J(vQa.q).l(FRa.Ga).f(iSa.c).f());
        Block.J(tSa.o, kTa.e, new BlockTrapDoor(Material.iron).J(vQa.q).l(FRa.Ga).f(dsa.X).f());
        Block.J(kra.j, Era.ca, new BlockTrapDoor(Material.iron).J(vQa.q).l(FRa.Ga).f(pQa.x).f());
        object = gIa.registry.iterator();
        while (true) {
            Object object10;
            block26: {
                block25: {
                    if (!object.hasNext()) {
                        blockRegistry.J();
                        object = blockRegistry.iterator();
                        break;
                    }
                    object2 = (CustomBlock)object.next();
                    object3 = ((CustomBlock)object2).J().getMaterial();
                    object4 = null;
                    block2 = null;
                    object5 = null;
                    if (((CustomBlock)object2).J() != CustomBlock$CustomBlockMaterial.leaves) break block25;
                    object10 = object4 = new BlockCustomLeaves();
                    break block26;
                }
                switch (Block$5.$SwitchMap$net$minecraft$block$CustomBlock$CustomBlockType[((CustomBlock)object2).J().ordinal()]) {
                    case 1: {
                        object10 = object4 = new Block((Material)object3);
                        break block26;
                    }
                    case 2: {
                        object10 = object4 = new BlockCross((Material)object3);
                        break block26;
                    }
                    case 3: {
                        object10 = object4 = new BlockCustomFacing((Material)object3, MapColor.blackColor);
                        break block26;
                    }
                    case 4: {
                        object10 = object4 = new BlockCustomPillar((Material)object3);
                        break block26;
                    }
                    case 5: {
                        object10 = object4 = new BlockStairs(blockRegistry.J(new ResourceLocation(((CustomBlock)object2).l())).J());
                        break block26;
                    }
                    case 6: {
                        if (((CustomBlock)object2).l() == 0) {
                            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, bRa.l).append(((CustomBlock)object2).J()).append(BRa.X).toString());
                        }
                        blockArray = blockRegistry.J(new ResourceLocation(((CustomBlock)object2).l())).J();
                        object4 = new BlockCustomSlab$Half((IBlockState)blockArray);
                        block2 = new BlockCustomSlab$Double((IBlockState)blockArray, (Block)object4);
                        object5 = dsa.fa;
                        object10 = object4;
                        break block26;
                    }
                    case 7: {
                        block4 = blockRegistry.J(new ResourceLocation(((CustomBlock)object2).l()));
                        object10 = object4 = new BlockVerticalSlab(block4);
                        break block26;
                    }
                    case 8: {
                        object10 = object4 = new BlockCustomWall(blockRegistry.J(new ResourceLocation(((CustomBlock)object2).l())).J());
                        break block26;
                    }
                    case 9: {
                        object10 = object4 = new BlockFence((Material)object3);
                        break block26;
                    }
                    case 10: {
                        break;
                    }
                    case 11: 
                }
                object10 = object4;
            }
            if (object10 == null) {
                throw new RuntimeException(yta.Aa);
            }
            Block[] blockArray2 = new Block[uqa.g];
            blockArray2[uSa.E] = object4;
            blockArray2[vRa.d] = block2;
            blockArray = blockArray2;
            int n2 = blockArray2.length;
            int n3 = uSa.E;
            while (n3 < n2) {
                int n4;
                block6 = blockArray[n4];
                if (block6 != null) {
                    block6.J(((CustomBlock)object2).l());
                    block6.l(((CustomBlock)object2).J());
                    block6.J(((CustomBlock)object2).J().getSoundType());
                    block6.f(gIa.J((String)((CustomBlock)object2).J()));
                    block6.f();
                    block6.f(((CustomBlock)object2).f());
                    Block block20 = block6;
                    block20.J((CustomBlock)object2);
                    block20.J(yGa.A);
                }
                n3 = ++n4;
            }
            Block.J(((CustomBlock)object2).f(), ((CustomBlock)object2).J(), (Block)object4);
            if (block2 == null) continue;
            Block.J(((CustomBlock)object2).l(), new StringBuilder().insert(3 ^ 3, ((CustomBlock)object2).J()).append((String)object5).toString(), block2);
        }
        while (object.hasNext()) {
            int n5;
            object2 = (Block)object.next();
            if (((Block)object2).blockMaterial == Material.air) {
                ((Block)object2).useNeighborBrightness = uSa.E;
                continue;
            }
            int n6 = uSa.E;
            boolean bl2 = object2 instanceof BlockStairs;
            int n7 = object2 instanceof BlockSlab || object2 instanceof BlockVerticalSlab ? vRa.d : uSa.E;
            int n8 = object2 == block3 ? vRa.d : uSa.E;
            Object object11 = object2;
            boolean bl3 = ((Block)object11).translucent;
            int n9 = n5 = ((Block)object11).lightOpacity == 0 ? vRa.d : uSa.E;
            if (bl2 || n7 != 0 || n8 != 0 || bl3 || n5 != 0) {
                n6 = vRa.d;
            }
            ((Block)object2).useNeighborBrightness = n6;
        }
        object = blockRegistry.iterator();
        block16: while (object.hasNext()) {
            object2 = (Block)object.next();
            Object object12 = ((Block)object2).f().J().iterator();
            while (true) {
                if (!object12.hasNext()) continue block16;
                object4 = (IBlockState)object3.next();
                int n10 = blockRegistry.J((ResourceLocation)object2) << AQa.P | ((Block)object2).f((IBlockState)object4);
                BLOCK_STATE_IDS.J(object4, n10);
                object12 = object3;
            }
            break;
        }
        return;
    }

    public Block J(Block$SoundType block$SoundType) {
        Block$SoundType b2 = block$SoundType;
        Block a2 = this;
        a2.stepSound = b2;
        return a2;
    }

    public float J(vL vL2) {
        Block b2 = vL2;
        Block a2 = this;
        return a2.blockResistance / eua.C;
    }

    public void J(Gg gg2, XF object) {
        Object c2 = object;
        object = this;
    }

    public boolean J(I i2, XF xF2) {
        Object c2 = xF2;
        Block a2 = this;
        if (!a2.blockMaterial.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String toString() {
        Block a2;
        return new StringBuilder().insert(3 ^ 3, aua.Ha).append(blockRegistry.f(a2)).append(Iqa.f).toString();
    }

    public void J(IBlockState iBlockState, Gg gg2, XF xF2, Block block, XF xF3) {
        Block block2 = object;
        Object object = xF3;
        Block a2 = block2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        Block a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
    }

    public Block J(yGa yGa2) {
        yGa b2 = yGa2;
        Block a2 = this;
        a2.displayOnCreativeTab = b2;
        return a2;
    }

    public int J(Random random) {
        Random b2 = random;
        Block a2 = this;
        return vRa.d;
    }

    public BlockState f() {
        Block a2;
        return a2.blockState;
    }

    public final double e() {
        Block a2;
        return a2.maxZ;
    }

    /*
     * WARNING - void declaration
     */
    public int f(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Block a2 = this;
        return a2.C(b2.J((XF)((Object)c2)));
    }

    public boolean f(Gg gg2, XF xF2) {
        Object c2 = xF2;
        Block a2 = this;
        return uSa.E != 0;
    }

    public int J(int n2, Random random) {
        Random c2 = random;
        Block a2 = this;
        return a2.J(c2);
    }

    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Block block = random2;
        Random random2 = random;
        Block a2 = block;
    }

    public int J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        Block a2 = this;
        return uSa.E;
    }

    public void J(I i2, XF object) {
        Object c2 = object;
        object = this;
    }

    public int l() {
        Block a2;
        return a2.blockMaterial.J();
    }

    static {
        AIR_ID = new ResourceLocation(BPa.h);
        blockRegistry = new py(AIR_ID);
        BLOCK_STATE_IDS = new eX();
        soundTypeStone = new Block$SoundType(fpa.F, pqa.r, pqa.r);
        soundTypeWood = new Block$SoundType(yRa.Ja, pqa.r, pqa.r);
        soundTypeGravel = new Block$SoundType(wsa.w, pqa.r, pqa.r);
        soundTypeGrass = new Block$SoundType(Xsa.J, pqa.r, pqa.r);
        soundTypePiston = new Block$SoundType(fpa.F, pqa.r, pqa.r);
        soundTypeMetal = new Block$SoundType(fpa.F, pqa.r, Ira.d);
        soundTypeGlass = new Block$1(fpa.F, pqa.r, pqa.r);
        soundTypeCloth = new Block$SoundType(Xpa.r, pqa.r, pqa.r);
        soundTypeSand = new Block$SoundType(dqa.la, pqa.r, pqa.r);
        soundTypeSnow = new Block$SoundType(Yra.p, pqa.r, pqa.r);
        soundTypeLadder = new Block$2(ISa.Aa, pqa.r, pqa.r);
        soundTypeAnvil = new Block$3(Ypa.G, bpa.K, pqa.r);
        SLIME_SOUND = new Block$4(DPa.I, pqa.r, pqa.r);
    }

    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        Block block = block2;
        Block block2 = vL2;
        Block a2 = block;
    }

    public final double d() {
        Block a2;
        return a2.minZ;
    }

    public static Block f(int a2) {
        return blockRegistry.J((ResourceLocation)a2);
    }

    /*
     * WARNING - void declaration
     */
    public final void J(float f2, float f3, float f4, float f5, float f6, float f7) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        Block a2;
        float f9 = f7;
        Block block = a2 = this;
        Block block2 = a2;
        Block block3 = a2;
        block3.minX = (double)f8;
        block3.minY = (double)e2;
        block2.minZ = (double)d2;
        block2.maxX = (double)c2;
        block.maxY = (double)b2;
        block.maxZ = (double)g2;
    }

    private boolean l(Lz lz2) {
        Block b2 = lz2;
        Block a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((Lz)b2).A >= a2.minX && ((Lz)b2).A <= a2.maxX && ((Lz)b2).j >= a2.minY && ((Lz)b2).j <= a2.maxY) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Block$EnumOffsetType J() {
        return Block$EnumOffsetType.NONE;
    }

    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        Block block = block2;
        Block block2 = mda2;
        Block a2 = block;
    }

    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        Block a2 = this;
        return eAa.J((Block)a2);
    }

    public void f(Gg gg2, XF xF2, IBlockState object) {
        Object d2 = object;
        object = this;
    }

    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Block block = random2;
        Random random2 = random;
        Block a2 = block;
    }

    public boolean F() {
        return uSa.E != 0;
    }

    public CustomBlock J() {
        Block a2;
        return a2.customBlock;
    }

    public static boolean J(Block block, Block block2) {
        Block b2 = block2;
        Block a2 = block;
        if (a2 != null && b2 != null) {
            if (a2 == b2) {
                return vRa.d != 0;
            }
            return a2.J(b2);
        }
        return uSa.E != 0;
    }

    public Block J(int n2) {
        int b2 = n2;
        Block a2 = this;
        a2.lightOpacity = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Sx sx2, XF xF2, IBlockState iBlockState, uY uY2) {
        void c2;
        void e2;
        void b2;
        void d2;
        Block block = block2;
        Block block2 = uY2;
        Block a2 = block;
        void v1 = d2;
        v1.J(Tz.a[Block.J(a2)]);
        v1.D(POa.o);
        if (a2.G() && kGa.f((Gl)d2)) {
            Block f2 = a2.J((IBlockState)b2);
            if (f2 != null) {
                Block.J((Gg)e2, (XF)c2, (Mda)f2);
                return;
            }
        } else {
            int f2 = kGa.J((Gl)d2);
            a2.J((Gg)e2, (XF)c2, (IBlockState)b2, f2);
        }
    }

    public IBlockState J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Block a2 = this;
        return b2;
    }

    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        Block block2 = block3;
        Block block3 = block;
        Block a2 = block2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, String string, Block block) {
        void b2;
        Block c2 = block;
        int a2 = n2;
        Block.J(a2, new ResourceLocation((String)b2), c2);
    }

    public int f() {
        Block a2;
        return a2.lightValue;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Block a2 = this;
        return b2.J((XF)((Object)c2)).J().blockMaterial.d();
    }

    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Block a2 = this;
        return a2.field_181083_K;
    }

    private boolean f(Lz lz2) {
        Block b2 = lz2;
        Block a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((Lz)b2).A >= a2.minX && ((Lz)b2).A <= a2.maxX && ((Lz)b2).J >= a2.minZ && ((Lz)b2).J <= a2.maxZ) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean k() {
        return vRa.d != 0;
    }

    public final IBlockState J() {
        Block a2;
        return a2.defaultBlockState;
    }

    public Material J() {
        Block a2;
        return a2.blockMaterial;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, vL vL2, float f2) {
        void e2;
        void b2;
        float f3 = f2;
        Block a2 = this;
        b2.f((float)e2, pqa.r);
    }

    public boolean G() {
        Block a2;
        if (a2.l() && !a2.isBlockContainer) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static IBlockState f(int n2) {
        int n3 = n2;
        int n4 = n3 & qQa.Fa;
        int a2 = n3 >> lqa.s & Ypa.A;
        return Block.f(n4).J(a2);
    }

    public boolean D() {
        Block a2;
        return a2.useNeighborBrightness;
    }

    public void J(CustomBlock customBlock) {
        CustomBlock b2 = customBlock;
        Block a2 = this;
        a2.customBlock = b2;
    }

    public static int J(Block a2) {
        return (int)blockRegistry.J((ResourceLocation)((Object)a2));
    }

    public Block J() {
        Block a2;
        Block block = a2;
        block.J(vqa.T);
        return block;
    }

    /*
     * WARNING - void declaration
     */
    public Block(Material material, MapColor mapColor) {
        void a2;
        Block b2;
        Material c2 = material;
        Block block = b2 = this;
        Block block2 = b2;
        b2.blockHardness = new Ox(JPa.N);
        block2.enableStats = vRa.d;
        b2.stepSound = soundTypeStone;
        b2.blockParticleGravity = pqa.r;
        b2.slipperiness = new Ox(Ora.D);
        b2.blockMaterial = c2;
        block.field_181083_K = a2;
        b2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        block.fullBlock = block.g();
        block.lightOpacity = block.g() ? osa.Ja : uSa.E;
        b2.translucent = !c2.C() ? vRa.d : uSa.E;
        Block block3 = b2;
        block3.blockState = block3.J();
        block3.J(block3.blockState.J());
    }

    public void J(Gg gg2, vL vL2) {
        Block c2 = vL2;
        Block a2 = this;
        c2.J(aSa.V);
    }

    public Block f(float f2) {
        float b2 = f2;
        Block a2 = this;
        a2.lightValue = (int)(qta.D * b2);
        return a2;
    }

    public BlockState J() {
        Block a2;
        return new BlockState(a2, new IProperty[uSa.E]);
    }

    public final double C() {
        Block a2;
        return a2.maxY;
    }

    public boolean A() {
        Block a2;
        if (a2.blockMaterial.J() && a2.l() && !a2.C()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Block J(float f2) {
        Block a2;
        Block block;
        float b2 = f2;
        (a2 = this).blockHardness = new Ox(b2);
        if (block.blockResistance < b2 * eua.C) {
            a2.blockResistance = b2 * eua.C;
        }
        return a2;
    }

    public boolean i() {
        Block a2;
        return a2.translucent;
    }

    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Block block = object;
        Object object = dZ2;
        Block a2 = block;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        void c2;
        Object d2 = xF2;
        Block b2 = this;
        return b2.J((Gg)c2, (XF)((Object)d2));
    }

    private boolean J(Lz lz2) {
        Block b2 = lz2;
        Block a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((Lz)b2).j >= a2.minY && ((Lz)b2).j <= a2.maxY && ((Lz)b2).J >= a2.minZ && ((Lz)b2).J <= a2.maxZ) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, int n2) {
        void c2;
        int d2 = n2;
        Block a2 = this;
        if (!c2.e) {
            int n3 = d2;
            while (n3 > 0) {
                void b2;
                int n4 = zEa.J((int)d2);
                n3 = d2 - n4;
                void v1 = c2;
                void v2 = c2;
                v2.f((vL)new zEa((Gg)v2, (double)b2.getX() + kTa.B, (double)b2.getY() + kTa.B, (double)b2.getZ() + kTa.B, n4));
            }
        }
    }

    public boolean M() {
        Block a2;
        return a2.needsRandomTick;
    }

    public void J(Gg gg2, XF xF2, IBlockState object) {
        Object d2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public int f(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Block a2 = this;
        void v0 = b2;
        Block block = v0.J((XF)((Object)c2)).J();
        int n2 = v0.J((XF)((Object)c2), block.f());
        if (n2 == 0 && block instanceof BlockSlab) {
            c2 = ((XF)((Object)c2)).down();
            void v1 = b2;
            block = v1.J((XF)((Object)c2)).J();
            return v1.J((XF)((Object)c2), block.f());
        }
        return n2;
    }

    public Lz J(Gg gg2, XF xF2, vL vL2, Lz lz2) {
        Block e2;
        Block block = block2;
        Block block2 = lz2;
        Block a2 = block;
        return e2;
    }

    public final double l() {
        Block a2;
        return a2.minY;
    }

    public Block J(boolean bl2) {
        boolean b2 = bl2;
        Block a2 = this;
        a2.needsRandomTick = b2;
        return a2;
    }

    public IBlockState J(int n2) {
        int b2 = n2;
        Block a2 = this;
        return a2.J();
    }

    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        IBlockState d2 = iBlockState;
        Block c2 = this;
        return d2;
    }

    public boolean e() {
        Block a2;
        if (a2.blockMaterial.f() && a2.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public final double f() {
        Block a2;
        return a2.minX;
    }

    public boolean d() {
        Block a2;
        if (a2.blockMaterial.f() && a2.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        Block a2 = this;
        return eAa.J((Block)a2);
    }

    public int J(I i2, XF xF2, int n2) {
        int d2 = n2;
        Block a2 = this;
        return Wsa.K;
    }

    public static Block J(eAa a2) {
        if (a2 instanceof kda) {
            return ((kda)a2).J();
        }
        return null;
    }

    public Block f(String string) {
        String b2 = string;
        Block a2 = this;
        a2.unlocalizedName = b2;
        return a2;
    }

    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        float f5 = f4;
        Block a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        Lz a2;
        Object b2;
        void c2;
        Lz d2;
        Block block;
        Block block2 = block = this;
        block2.J((I)d2, (XF)c2);
        b2 = b2.f((double)(-c2.getX()), (double)(-c2.getY()), (double)(-c2.getZ()));
        a2 = a2.f((double)(-c2.getX()), (double)(-c2.getY()), (double)(-c2.getZ()));
        Lz lz4 = b2;
        d2 = lz4.l(a2, block.minX);
        Lz lz5 = lz4.l(a2, block.maxX);
        Lz lz6 = lz4.f(a2, block.minY);
        Lz lz7 = lz4.f(a2, block.maxY);
        Lz lz8 = lz4.J(a2, block.minZ);
        a2 = lz4.J(a2, block.maxZ);
        if (!block2.J(d2)) {
            d2 = null;
        }
        if (!block.J(lz5)) {
            lz5 = null;
        }
        if (!block.f(lz6)) {
            lz6 = null;
        }
        if (!block.f(lz7)) {
            lz7 = null;
        }
        if (!block.l(lz8)) {
            lz8 = null;
        }
        if (!block.l(a2)) {
            a2 = null;
        }
        Block e2 = null;
        if (d2 != null && (e2 == null || b2.l(d2) < b2.l((Lz)e2))) {
            e2 = d2;
        }
        if (lz5 != null && (e2 == null || b2.l(lz5) < b2.l((Lz)e2))) {
            e2 = lz5;
        }
        if (lz6 != null && (e2 == null || b2.l(lz6) < b2.l((Lz)e2))) {
            e2 = lz6;
        }
        if (lz7 != null && (e2 == null || b2.l(lz7) < b2.l((Lz)e2))) {
            e2 = lz7;
        }
        if (lz8 != null && (e2 == null || b2.l(lz8) < b2.l((Lz)e2))) {
            e2 = lz8;
        }
        if (a2 != null && (e2 == null || b2.l(a2) < b2.l((Lz)e2))) {
            e2 = a2;
        }
        if (e2 == null) {
            return null;
        }
        b2 = null;
        if (e2 == d2) {
            b2 = DZ.WEST;
        }
        if (e2 == lz5) {
            b2 = DZ.EAST;
        }
        if (e2 == lz6) {
            b2 = DZ.DOWN;
        }
        if (e2 == lz7) {
            b2 = DZ.UP;
        }
        if (e2 == lz8) {
            b2 = DZ.NORTH;
        }
        if (e2 == a2) {
            b2 = DZ.SOUTH;
        }
        return new RY(e2.f(c2.getX(), c2.getY(), c2.getZ()), (DZ)((Object)b2), (XF)c2);
    }

    public boolean C() {
        return uSa.E != 0;
    }

    public String f() {
        Block a2;
        return Ey.f((String)new StringBuilder().insert(5 >> 3, a2.J()).append(tpa.N).toString());
    }

    public float J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        Block a2 = this;
        return a2.blockHardness.J();
    }

    /*
     * WARNING - void declaration
     */
    public float J(Sx sx2, Gg gg2, XF xF2) {
        void c2;
        float f2;
        void a2;
        Block d22 = gg2;
        Block b2 = this;
        float d22 = b2.J((Gg)d22, (XF)a2);
        if (f2 < JPa.N) {
            return JPa.N;
        }
        if (!c2.J(b2)) {
            return c2.J(b2) / d22 / QTa.G;
        }
        return c2.J(b2) / d22 / NSa.B;
    }

    public yGa J() {
        Block a2;
        return a2.displayOnCreativeTab;
    }

    public boolean l() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        Block a2 = this;
        if (d2 == DZ.DOWN && a2.minY > aSa.V) {
            return vRa.d != 0;
        }
        if (d2 == DZ.UP && a2.maxY < oua.i) {
            return vRa.d != 0;
        }
        if (d2 == DZ.NORTH && a2.minZ > aSa.V) {
            return vRa.d != 0;
        }
        if (d2 == DZ.SOUTH && a2.maxZ < oua.i) {
            return vRa.d != 0;
        }
        if (d2 == DZ.WEST && a2.minX > aSa.V) {
            return vRa.d != 0;
        }
        if (d2 == DZ.EAST && a2.maxX < oua.i) {
            return vRa.d != 0;
        }
        if (!c2.J((XF)b2).J().g()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public hy J() {
        return hy.MODEL;
    }

    /*
     * WARNING - void declaration
     */
    public final int J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Block a2 = this;
        return a2.J((I)b2, (XF)((Object)c2), uSa.E);
    }

    public String J() {
        Block a2;
        return new StringBuilder().insert(3 >> 2, JQa.j).append(a2.unlocalizedName).toString();
    }

    public static Block J(String string) {
        String string2 = string;
        ResourceLocation a2 = new ResourceLocation(string2);
        if (blockRegistry.J(a2) != false) {
            return blockRegistry.J(a2);
        }
        try {
            return blockRegistry.J((ResourceLocation)Integer.parseInt(string2));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public xy J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        Block a2 = this;
        return new xy((double)c2.getX() + a2.minX, (double)c2.getY() + a2.minY, (double)c2.getZ() + a2.minZ, (double)c2.getX() + a2.maxX, (double)c2.getY() + a2.maxY, (double)c2.getZ() + a2.maxZ);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Random e2;
        void b2;
        void c2;
        void d2;
        Block block = random2;
        Random random2 = random;
        Block a2 = block;
        a2.f((Gg)d2, (XF)c2, (IBlockState)b2, e2);
    }

    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Block a2 = this;
        if (b2 != null && !b2.J().isEmpty()) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, Ysa.B).append(b2).append(ZOa.s).toString());
        }
        return uSa.E;
    }

    public int J() {
        return Wsa.K;
    }

    public boolean f() {
        Block a2;
        if (!a2.blockMaterial.i() && !a2.blockMaterial.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Block(Material material) {
        Material b2 = material;
        Block a2 = this;
        Object object = b2;
        a2((Material)object, ((Material)object).J());
    }

    public boolean J(NZ nZ2) {
        NZ b2 = nZ2;
        Block a2 = this;
        return vRa.d != 0;
    }

    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        Object d2 = xF2;
        Block b2 = this;
        return new xy((double)d2.getX() + b2.minX, (double)d2.getY() + b2.minY, (double)d2.getZ() + b2.minZ, (double)d2.getX() + b2.maxX, (double)d2.getY() + b2.maxY, (double)d2.getZ() + b2.maxZ);
    }

    public final double J() {
        Block a2;
        return a2.maxX;
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void i2;
        int n3 = n2;
        Block b2 = this;
        return b2.J((int)i2);
    }

    public int J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Block a2 = this;
        return Wsa.K;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(IBlockState iBlockState) {
        Block block = this;
        int n2 = uSa.E;
        Block b2 = eAa.J((Block)block);
        if (b2 != null && b2.M()) {
            void a2;
            n2 = block.f((IBlockState)a2);
        }
        return new Mda((eAa)b2, vRa.d, n2);
    }

    public boolean J() {
        Block a2;
        return a2.fullBlock;
    }

    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        Block block = object;
        Object object = sx2;
        Block a2 = block;
    }
}

