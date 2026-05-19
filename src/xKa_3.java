/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BLa
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  Cta
 *  DJa
 *  DQa
 *  Dha
 *  EQa
 *  ERa
 *  Epa
 *  FLa
 *  FPa
 *  FTa
 *  Fpa
 *  Gl
 *  Gua
 *  HEa
 *  HJa
 *  ISa
 *  JJa
 *  JPa
 *  JQa
 *  JSa
 *  JTa
 *  KTa
 *  Kna
 *  Kpa
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  MZ
 *  Mda
 *  Me
 *  NOa
 *  NPa
 *  NQa
 *  NTa
 *  PTa
 *  Ppa
 *  Pqa
 *  QFa
 *  QSa
 *  Qqa
 *  Qsa
 *  Qta
 *  RA
 *  RIa
 *  RPa
 *  RQa
 *  Rua
 *  SOa
 *  SQa
 *  SRa
 *  Sja
 *  Spa
 *  Sqa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  U
 *  URa
 *  Uka
 *  Uqa
 *  Usa
 *  Uta
 *  VQa
 *  Vua
 *  WQa
 *  WSa
 *  Wsa
 *  XE
 *  XSa
 *  XTa
 *  Xja
 *  Xsa
 *  YSa
 *  Yka
 *  Yla
 *  Ypa
 *  Yra
 *  Ysa
 *  ZOa
 *  ZRa
 *  Zpa
 *  Zta
 *  Zua
 *  aJa
 *  aKa
 *  aPa
 *  aQa
 *  aSa
 *  aqa
 *  asa
 *  bRa
 *  bpa
 *  bqa
 *  bua
 *  cJ
 *  cQa
 *  cRa
 *  cra
 *  dQa
 *  dpa
 *  eAa
 *  ez
 *  fTa
 *  fpa
 *  fsa
 *  hTa
 *  hqa
 *  hra
 *  iJa
 *  iPa
 *  iea
 *  isa
 *  j
 *  jRa
 *  jpa
 *  jsa
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  lPa
 *  lqa
 *  mka
 *  mra
 *  nQa
 *  oqa
 *  pJa
 *  pKa
 *  pPa
 *  pQa
 *  pY
 *  pqa
 *  psa
 *  pua
 *  qta
 *  tA
 *  uKa
 *  uOa
 *  uQa
 *  uRa
 *  ura
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  xKa
 *  xOa
 *  yQa
 *  yka
 *  yra
 *  ysa
 *  zTa
 *  zsa
 */
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCopper$EnumVariant;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockFroglight$EnumVariant;
import net.minecraft.block.BlockHugeMushroom$EnumType;
import net.minecraft.block.BlockIronOre$EnumType;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockPrismarine$EnumType;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.BlockStoneSlabNew$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.BlockWall$EnumType;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.CustomBlock$CustomBlockType;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xKa_3
implements j {
    private boolean L;
    private final aJa E;
    public float m;
    private static final String C = "CL_00001003";
    private boolean i;
    private static final ResourceLocation M = new ResourceLocation(SQa.k);
    public static boolean k = uSa.E;
    private final BLa j;
    public Fia J;
    private ModelResourceLocation A;
    public static int I = pua.o;

    /*
     * WARNING - void declaration
     */
    public void f(Mda mda2, int n2, int n3, iJa iJa2) {
        xKa_3 e2 = mda2;
        xKa_3 d2 = this;
        if (e2 != null && e2.J() != null) {
            d2.m += SPa.b;
            try {
                void a2;
                void b2;
                void c22;
                d2.J((Mda)e2, (int)c22, (int)b2, (iJa)a2);
            }
            catch (Throwable c22) {
                RIa c22 = RIa.J((Throwable)c22, (String)Nra.G);
                Dha dha2 = c22.J(sqa.Aa);
                dha2.J(MQa.E, (Callable)new DJa((xKa)d2, (Mda)e2));
                dha2.J(Era.z, (Callable)new yJa((xKa)d2, (Mda)e2));
                dha2.J(Fua.n, (Callable)new yka((xKa)d2, (Mda)e2));
                dha2.J(tpa.L, (Callable)new Yla((xKa)d2, (Mda)e2));
                throw new MZ(c22);
            }
            d2.m -= SPa.b;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(Mda mda2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        xKa_3 a2 = this;
        a2.f((Mda)c2, (int)b2, d2, null);
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, Yka yka2, int n2) {
        void a2;
        void v1;
        void c2;
        xKa_3 d2 = yka2;
        xKa_3 b2 = this;
        if (c2.f()) {
            void v0 = c2;
            v1 = v0;
            v0.J(d2.f());
            v0.J(d2.J());
        } else {
            void v2 = c2;
            v1 = v2;
            v2.J(d2.J());
        }
        v1.J((int)a2);
        b2.J((aKa)c2, (Yka)d2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, List list, int n2, Mda mda2) {
        void c2;
        void a2;
        void b2;
        xKa_3 xKa_32 = this;
        int n3 = (b2 & Wsa.K) == Wsa.K && a2 != null ? vRa.d : uSa.E;
        int n4 = uSa.E;
        int n5 = c2.size();
        int n6 = n4;
        while (n6 < n5) {
            void d2;
            Yka yka2 = (Yka)c2.get(n4);
            int e2 = b2;
            if (n3 != 0 && yka2.J()) {
                e2 = a2.J().J((Mda)a2, yka2.J());
                if (Config.Fa()) {
                    e2 = XE.J((Mda)a2, (int)yka2.J(), (int)e2);
                }
                if (FLa.ia) {
                    e2 = gLa.J(e2);
                }
                e2 = e2 & Wsa.K | b2 & gsa.X;
            }
            xKa_32.J((aKa)d2, yka2, e2);
            n6 = ++n4;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Block block, int n2, String string) {
        void b2;
        void c2;
        String d2 = string;
        xKa_3 a2 = this;
        a2.J(eAa.J((Block)c2), (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        xKa_3 a2 = this;
        a2.J((Mda)c2, (int)b2, d2, null);
    }

    private void J() {
        Enum enum_;
        int a22;
        xKa_3 xKa_32;
        xKa_3 xKa_33 = xKa_32 = this;
        xKa_33.J(QFa.Sb, qsa.h);
        xKa_33.J(QFa.Sb, vRa.d, opa.A);
        xKa_33.J(QFa.Sb, uqa.g, tTa.C);
        xKa_33.J(QFa.XE, iea.BLACK.getMetadata(), Xsa.v);
        xKa_33.J(QFa.XE, iea.BLUE.getMetadata(), CRa.K);
        xKa_33.J(QFa.XE, iea.BROWN.getMetadata(), vPa.K);
        xKa_33.J(QFa.XE, iea.CYAN.getMetadata(), Hta.M);
        xKa_33.J(QFa.XE, iea.GRAY.getMetadata(), Yra.y);
        xKa_33.J(QFa.XE, iea.GREEN.getMetadata(), Zta.fa);
        xKa_33.J(QFa.XE, iea.LIGHT_BLUE.getMetadata(), vPa.Ga);
        xKa_33.J(QFa.XE, iea.LIME.getMetadata(), sra.o);
        xKa_33.J(QFa.XE, iea.MAGENTA.getMetadata(), fta.s);
        xKa_33.J(QFa.XE, iea.ORANGE.getMetadata(), EPa.J);
        xKa_33.J(QFa.XE, iea.PINK.getMetadata(), aqa.Ga);
        xKa_33.J(QFa.XE, iea.PURPLE.getMetadata(), ypa.I);
        xKa_33.J(QFa.XE, iea.RED.getMetadata(), xOa.v);
        xKa_33.J(QFa.XE, iea.SILVER.getMetadata(), ypa.V);
        xKa_33.J(QFa.XE, iea.WHITE.getMetadata(), bsa.Ga);
        xKa_33.J(QFa.XE, iea.YELLOW.getMetadata(), Fpa.Ja);
        xKa_33.J(QFa.hc, BlockWall$EnumType.MOSSY.getMetadata(), xOa.i);
        xKa_33.J(QFa.hc, BlockWall$EnumType.NORMAL.getMetadata(), Qpa.H);
        xKa_33.J(QFa.Bc, BlockDirt$DirtType.COARSE_DIRT.getMetadata(), XTa.R);
        xKa_33.J(QFa.Bc, BlockDirt$DirtType.DIRT.getMetadata(), aSa.P);
        xKa_33.J(QFa.Bc, BlockDirt$DirtType.PODZOL.getMetadata(), WRa.B);
        xKa_33.J(QFa.Ia, BlockDoublePlant$EnumPlantType.FERN.getMeta(), mPa.h);
        xKa_33.J(QFa.Ia, BlockDoublePlant$EnumPlantType.GRASS.getMeta(), DPa.Q);
        xKa_33.J(QFa.Ia, BlockDoublePlant$EnumPlantType.PAEONIA.getMeta(), yra.i);
        xKa_33.J(QFa.Ia, BlockDoublePlant$EnumPlantType.ROSE.getMeta(), GPa.Ka);
        xKa_33.J(QFa.Ia, BlockDoublePlant$EnumPlantType.SUNFLOWER.getMeta(), dpa.g);
        xKa_33.J(QFa.Ia, BlockDoublePlant$EnumPlantType.SYRINGA.getMeta(), bpa.j);
        xKa_33.J(QFa.vd, BlockPlanks$EnumType.BIRCH.getMetadata(), Yua.Ja);
        xKa_33.J(QFa.vd, BlockPlanks$EnumType.JUNGLE.getMetadata(), dpa.b);
        xKa_33.J(QFa.vd, BlockPlanks$EnumType.OAK.getMetadata(), Ora.j);
        xKa_33.J(QFa.vd, BlockPlanks$EnumType.SPRUCE.getMetadata(), Bua.q);
        xKa_33.J(QFa.Z, BlockPlanks$EnumType.ACACIA.getMetadata() - AQa.P, sSa.w);
        xKa_33.J(QFa.Z, BlockPlanks$EnumType.DARK_OAK.getMetadata() - AQa.P, WQa.L);
        xKa_33.J(QFa.Z, uqa.g, Iqa.d);
        xKa_33.J(QFa.UA, BlockPlanks$EnumType.BIRCH.getMetadata(), mSa.Q);
        xKa_33.J(QFa.UA, BlockPlanks$EnumType.JUNGLE.getMetadata(), GPa.u);
        xKa_33.J(QFa.UA, BlockPlanks$EnumType.OAK.getMetadata(), ZOa.y);
        xKa_33.J(QFa.UA, BlockPlanks$EnumType.SPRUCE.getMetadata(), zua.d);
        xKa_33.J(QFa.hf, BlockPlanks$EnumType.ACACIA.getMetadata() - AQa.P, uRa.ja);
        xKa_33.J(QFa.hf, BlockPlanks$EnumType.DARK_OAK.getMetadata() - AQa.P, vRa.W);
        xKa_33.J(QFa.hf, BlockPlanks$EnumType.CRIMSON.getMetadata() - AQa.P, fTa.Ga);
        xKa_33.J(QFa.hf, BlockPlanks$EnumType.WARPED.getMetadata() - AQa.P, cPa.c);
        xKa_33.J(QFa.nE, BlockPlanks$EnumType.IRON.getMetadata() - Yqa.i, Gua.G);
        xKa_33.J(QFa.nE, BlockPlanks$EnumType.MANGROVE.getMetadata() - Yqa.i, BRa.t);
        xKa_33.J(QFa.nE, BlockPlanks$EnumType.CHERRY.getMetadata() - Yqa.i, iSa.ga);
        xKa_33.J(QFa.nE, BlockPlanks$EnumType.PALE_OAK.getMetadata() - Yqa.i, Yua.L);
        xKa_33.J(QFa.Od, BlockSilverfish$EnumType.CHISELED_STONEBRICK.getMetadata(), Vua.O);
        xKa_33.J(QFa.Od, BlockSilverfish$EnumType.COBBLESTONE.getMetadata(), Tpa.d);
        xKa_33.J(QFa.Od, BlockSilverfish$EnumType.CRACKED_STONEBRICK.getMetadata(), mra.Y);
        xKa_33.J(QFa.Od, BlockSilverfish$EnumType.MOSSY_STONEBRICK.getMetadata(), dsa.y);
        xKa_33.J(QFa.Od, BlockSilverfish$EnumType.STONE.getMetadata(), JPa.k);
        xKa_33.J(QFa.Od, BlockSilverfish$EnumType.STONEBRICK.getMetadata(), nOa.Ja);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.ACACIA.getMetadata(), xSa.Ha);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.BIRCH.getMetadata(), JTa.E);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.DARK_OAK.getMetadata(), fpa.R);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.JUNGLE.getMetadata(), ISa.A);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.OAK.getMetadata(), Hta.R);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.SPRUCE.getMetadata(), Ata.O);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.CRIMSON.getMetadata(), TOa.O);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.WARPED.getMetadata(), XTa.Q);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.MANGROVE.getMetadata(), psa.H);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.CHERRY.getMetadata(), Cra.p);
        xKa_33.J(QFa.L, BlockPlanks$EnumType.PALE_OAK.getMetadata(), EQa.ga);
        xKa_33.J(QFa.xd, BlockPrismarine$EnumType.BRICKS.getMetadata(), XOa.W);
        xKa_33.J(QFa.xd, BlockPrismarine$EnumType.DARK.getMetadata(), SOa.Y);
        xKa_33.J(QFa.xd, BlockPrismarine$EnumType.ROUGH.getMetadata(), Era.X);
        xKa_33.J(QFa.YA, BlockQuartz$EnumType.CHISELED.getMetadata(), isa.Z);
        xKa_33.J(QFa.YA, BlockQuartz$EnumType.DEFAULT.getMetadata(), nOa.c);
        xKa_33.J(QFa.YA, BlockQuartz$EnumType.LINES_Y.getMetadata(), kqa.y);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.ALLIUM.getMeta(), Rua.D);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.BLUE_ORCHID.getMeta(), opa.P);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.HOUSTONIA.getMeta(), vpa.k);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.ORANGE_TULIP.getMeta(), Ora.x);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.OXEYE_DAISY.getMeta(), xTa.X);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.PINK_TULIP.getMeta(), zta.ja);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.POPPY.getMeta(), tTa.Ia);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.RED_TULIP.getMeta(), FTa.fa);
        xKa_33.J(QFa.l, BlockFlower$EnumFlowerType.WHITE_TULIP.getMeta(), pPa.B);
        xKa_33.J(QFa.R, BlockSand$EnumType.RED_SAND.getMetadata(), Qpa.V);
        xKa_33.J(QFa.R, BlockSand$EnumType.SAND.getMetadata(), dqa.la);
        xKa_33.J(QFa.qC, BlockSandStone$EnumType.CHISELED.getMetadata(), cPa.N);
        xKa_33.J(QFa.qC, BlockSandStone$EnumType.DEFAULT.getMetadata(), zTa.M);
        xKa_33.J(QFa.qC, BlockSandStone$EnumType.SMOOTH.getMetadata(), BRa.N);
        xKa_33.J(QFa.ec, BlockRedSandstone$EnumType.CHISELED.getMetadata(), yta.e);
        xKa_33.J(QFa.ec, BlockRedSandstone$EnumType.DEFAULT.getMetadata(), SRa.M);
        xKa_33.J(QFa.ec, BlockRedSandstone$EnumType.SMOOTH.getMetadata(), Asa.Da);
        xKa_33.J(QFa.Y, BlockPlanks$EnumType.ACACIA.getMetadata(), VPa.j);
        xKa_33.J(QFa.Y, BlockPlanks$EnumType.BIRCH.getMetadata(), wOa.Da);
        xKa_33.J(QFa.Y, BlockPlanks$EnumType.DARK_OAK.getMetadata(), SOa.R);
        xKa_33.J(QFa.Y, BlockPlanks$EnumType.JUNGLE.getMetadata(), Uta.m);
        xKa_33.J(QFa.Y, BlockPlanks$EnumType.OAK.getMetadata(), mPa.g);
        xKa_33.J(QFa.Y, BlockPlanks$EnumType.SPRUCE.getMetadata(), FTa.E);
        xKa_33.J(QFa.ba, uSa.E, uqa.ga);
        xKa_33.J(QFa.ba, vRa.d, WOa.Ja);
        xKa_33.J(QFa.VA, iea.BLACK.getMetadata(), ppa.X);
        xKa_33.J(QFa.VA, iea.BLUE.getMetadata(), Sqa.a);
        xKa_33.J(QFa.VA, iea.BROWN.getMetadata(), zsa.A);
        xKa_33.J(QFa.VA, iea.CYAN.getMetadata(), zta.fa);
        xKa_33.J(QFa.VA, iea.GRAY.getMetadata(), pPa.L);
        xKa_33.J(QFa.VA, iea.GREEN.getMetadata(), cTa.B);
        xKa_33.J(QFa.VA, iea.LIGHT_BLUE.getMetadata(), lqa.A);
        xKa_33.J(QFa.VA, iea.LIME.getMetadata(), aqa.B);
        xKa_33.J(QFa.VA, iea.MAGENTA.getMetadata(), rpa.q);
        xKa_33.J(QFa.VA, iea.ORANGE.getMetadata(), BRa.R);
        xKa_33.J(QFa.VA, iea.PINK.getMetadata(), kta.n);
        xKa_33.J(QFa.VA, iea.PURPLE.getMetadata(), pqa.E);
        xKa_33.J(QFa.VA, iea.RED.getMetadata(), Era.J);
        xKa_33.J(QFa.VA, iea.SILVER.getMetadata(), opa.S);
        xKa_33.J(QFa.VA, iea.WHITE.getMetadata(), TPa.K);
        xKa_33.J(QFa.VA, iea.YELLOW.getMetadata(), Pua.w);
        xKa_33.J(QFa.KC, iea.BLACK.getMetadata(), SQa.f);
        xKa_33.J(QFa.KC, iea.BLUE.getMetadata(), Yua.E);
        xKa_33.J(QFa.KC, iea.BROWN.getMetadata(), xTa.Aa);
        xKa_33.J(QFa.KC, iea.CYAN.getMetadata(), zOa.j);
        xKa_33.J(QFa.KC, iea.GRAY.getMetadata(), Ssa.h);
        xKa_33.J(QFa.KC, iea.GREEN.getMetadata(), oqa.C);
        xKa_33.J(QFa.KC, iea.LIGHT_BLUE.getMetadata(), aSa.m);
        xKa_33.J(QFa.KC, iea.LIME.getMetadata(), Tqa.U);
        xKa_33.J(QFa.KC, iea.MAGENTA.getMetadata(), Jsa.X);
        xKa_33.J(QFa.KC, iea.ORANGE.getMetadata(), kTa.Ha);
        xKa_33.J(QFa.KC, iea.PINK.getMetadata(), Ypa.o);
        xKa_33.J(QFa.KC, iea.PURPLE.getMetadata(), rSa.I);
        xKa_33.J(QFa.KC, iea.RED.getMetadata(), WPa.j);
        xKa_33.J(QFa.KC, iea.SILVER.getMetadata(), zsa.g);
        xKa_33.J(QFa.KC, iea.WHITE.getMetadata(), NOa.W);
        xKa_3 xKa_34 = xKa_32;
        xKa_34.J(QFa.KC, iea.YELLOW.getMetadata(), Rua.k);
        xKa_34.J(QFa.za, iea.BLACK.getMetadata(), BRa.Ha);
        xKa_34.J(QFa.za, iea.BLUE.getMetadata(), Lsa.B);
        xKa_34.J(QFa.za, iea.BROWN.getMetadata(), aSa.ja);
        xKa_34.J(QFa.za, iea.CYAN.getMetadata(), pPa.V);
        xKa_34.J(QFa.za, iea.GRAY.getMetadata(), pua.r);
        xKa_34.J(QFa.za, iea.GREEN.getMetadata(), kpa.F);
        xKa_34.J(QFa.za, iea.LIGHT_BLUE.getMetadata(), UOa.T);
        xKa_34.J(QFa.za, iea.LIME.getMetadata(), wsa.l);
        xKa_34.J(QFa.za, iea.MAGENTA.getMetadata(), oQa.Ga);
        xKa_34.J(QFa.za, iea.ORANGE.getMetadata(), MQa.n);
        xKa_34.J(QFa.za, iea.PINK.getMetadata(), KTa.n);
        xKa_34.J(QFa.za, iea.PURPLE.getMetadata(), WRa.Q);
        xKa_34.J(QFa.za, iea.RED.getMetadata(), NPa.W);
        xKa_34.J(QFa.za, iea.SILVER.getMetadata(), yRa.ga);
        xKa_34.J(QFa.za, iea.WHITE.getMetadata(), tSa.m);
        xKa_34.J(QFa.za, iea.YELLOW.getMetadata(), ppa.M);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.ANDESITE.getMetadata(), BPa.F);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.ANDESITE_SMOOTH.getMetadata(), wsa.h);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.DIORITE.getMetadata(), pqa.K);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.DIORITE_SMOOTH.getMetadata(), pta.j);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.GRANITE.getMetadata(), kra.Aa);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.GRANITE_SMOOTH.getMetadata(), bsa.Da);
        xKa_34.J(QFa.Gd, BlockStone$EnumType.STONE.getMetadata(), fpa.F);
        xKa_34.J(QFa.v, BlockStoneBrick$EnumType.CRACKED.getMetadata(), psa.Fa);
        xKa_34.J(QFa.v, BlockStoneBrick$EnumType.DEFAULT.getMetadata(), csa.S);
        xKa_34.J(QFa.v, BlockStoneBrick$EnumType.CHISELED.getMetadata(), XSa.A);
        xKa_34.J(QFa.v, BlockStoneBrick$EnumType.MOSSY.getMetadata(), Rua.B);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.BRICK.getMetadata(), Tpa.Q);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.COBBLESTONE.getMetadata(), kra.E);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.WOOD.getMetadata(), Bsa.Da);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.NETHERBRICK.getMetadata(), Nta.c);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.QUARTZ.getMetadata(), Era.Ha);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.SAND.getMetadata(), TQa.B);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.SMOOTHBRICK.getMetadata(), wPa.ca);
        xKa_34.J(QFa.Ib, BlockStoneSlab$EnumType.STONE.getMetadata(), Fsa.Q);
        xKa_34.J(QFa.F, BlockStoneSlabNew$EnumType.RED_SANDSTONE.getMetadata(), FTa.d);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.DEAD_BUSH.getMeta(), BRa.o);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.FERN.getMeta(), kua.ga);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.GRASS.getMeta(), Zta.Ha);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.BLACK_CURRANT.getMeta(), eua.o);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.CACAO_BEANS.getMeta(), nqa.y);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.CORN.getMeta(), lQa.M);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.COTTON.getMeta(), SPa.Z);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.FLAX.getMeta(), pPa.n);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.GRAPE.getMeta(), yOa.R);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.HOPS.getMeta(), cRa.T);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.ONION.getMeta(), Lsa.W);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.RASPBERRY.getMeta(), Qqa.W);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.STRAWBERRY.getMeta(), Ata.k);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.TEALEAF.getMeta(), NOa.E);
        xKa_34.J(QFa.y, BlockTallGrass$EnumType.TOMATO.getMeta(), Iqa.Y);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.ACACIA.getMetadata(), vqa.H);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.BIRCH.getMetadata(), Psa.u);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.DARK_OAK.getMetadata(), bua.e);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.JUNGLE.getMetadata(), Psa.r);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.OAK.getMetadata(), hpa.Da);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.SPRUCE.getMetadata(), Ata.F);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.CRIMSON.getMetadata(), EQa.P);
        xKa_34.J(QFa.eb, BlockPlanks$EnumType.WARPED.getMetadata(), Bra.t);
        xKa_34.J(QFa.cd, iea.BLACK.getMetadata(), DQa.B);
        xKa_34.J(QFa.cd, iea.BLUE.getMetadata(), EQa.V);
        xKa_34.J(QFa.cd, iea.BROWN.getMetadata(), ISa.v);
        xKa_34.J(QFa.cd, iea.CYAN.getMetadata(), XOa.E);
        xKa_34.J(QFa.cd, iea.GRAY.getMetadata(), pta.O);
        xKa_34.J(QFa.cd, iea.GREEN.getMetadata(), Tpa.Da);
        xKa_34.J(QFa.cd, iea.LIGHT_BLUE.getMetadata(), BRa.Ka);
        xKa_34.J(QFa.cd, iea.LIME.getMetadata(), Ppa.c);
        xKa_34.J(QFa.cd, iea.MAGENTA.getMetadata(), MQa.k);
        xKa_34.J(QFa.cd, iea.ORANGE.getMetadata(), kra.Ma);
        xKa_34.J(QFa.cd, iea.PINK.getMetadata(), qsa.z);
        xKa_34.J(QFa.cd, iea.PURPLE.getMetadata(), Usa.L);
        xKa_34.J(QFa.cd, iea.RED.getMetadata(), PTa.k);
        xKa_34.J(QFa.cd, iea.SILVER.getMetadata(), fpa.p);
        xKa_34.J(QFa.cd, iea.WHITE.getMetadata(), ZOa.w);
        xKa_34.J(QFa.cd, iea.YELLOW.getMetadata(), vqa.Ga);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.IRON.getMeta(), MTa.p);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.AMETHYST.getMeta(), pqa.T);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.COPPER.getMeta(), Fpa.g);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.PLATINUM.getMeta(), vQa.X);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.SILVER.getMeta(), Ssa.Q);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.STONE_QUARTZ.getMeta(), Hra.E);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.TITANIUM.getMeta(), nqa.u);
        xKa_34.J(QFa.b, BlockIronOre$EnumType.BLACK_IRON.getMeta(), wOa.K);
        xKa_34.J(QFa.HE, Fua.M);
        xKa_34.J(QFa.gc, Gua.d);
        xKa_34.J(QFa.jC, Ura.c);
        xKa_34.J(QFa.bg, Zqa.w);
        xKa_34.J(QFa.ef, eua.z);
        xKa_34.J(QFa.gA, IPa.H);
        xKa_34.J(QFa.V, FTa.S);
        xKa_34.J(QFa.V, FTa.S);
        xKa_34.J(QFa.k, ZOa.v);
        xKa_34.J(QFa.vc, bsa.S);
        xKa_34.J(QFa.dd, Qra.Ha);
        xKa_34.J(QFa.pd, nua.Z);
        xKa_34.J(QFa.Ea, RQa.T);
        xKa_34.J(QFa.Za, isa.S);
        xKa_34.J(QFa.yB, ATa.ga);
        xKa_34.J(QFa.IE, Qpa.X);
        xKa_34.J(QFa.LA, Bsa.ja);
        xKa_34.J(QFa.Bd, csa.o);
        xKa_34.J(QFa.BB, BRa.o);
        xKa_34.J(QFa.g, wta.Ka);
        xKa_34.J(QFa.ca, dQa.I);
        xKa_34.J(QFa.Ic, ZSa.Aa);
        xKa_34.J(QFa.EA, wta.ja);
        xKa_34.J(QFa.vb, xqa.x);
        xKa_34.J(QFa.Ab, LQa.x);
        xKa_34.J(QFa.c, fpa.i);
        xKa_34.J(QFa.rC, ZOa.Ha);
        xKa_34.J(QFa.jE, cra.T);
        xKa_34.J(QFa.hd, hpa.E);
        xKa_34.J(QFa.U, oQa.t);
        xKa_34.J(QFa.Qb, lqa.h);
        xKa_34.J(QFa.OA, Spa.M);
        xKa_34.J(QFa.md, yra.v);
        xKa_34.J(QFa.Fc, dQa.K);
        xKa_34.J(QFa.IF, zta.k);
        xKa_34.J(QFa.Ad, wra.q);
        xKa_34.J(QFa.yA, mSa.e);
        xKa_34.J(QFa.hb, fsa.ha);
        xKa_34.J(QFa.tC, vqa.W);
        xKa_34.J(QFa.na, tua.z);
        xKa_34.J(QFa.Cb, WQa.j);
        xKa_34.J(QFa.Xb, Ata.Ga);
        xKa_34.J(QFa.ye, pQa.T);
        xKa_34.J(QFa.JB, ysa.o);
        xKa_34.J(QFa.rc, dua.z);
        xKa_34.J(QFa.JC, Zpa.U);
        xKa_34.J(QFa.WC, Tqa.ba);
        xKa_34.J(QFa.zE, pqa.ja);
        xKa_34.J(QFa.lf, Xsa.J);
        xKa_34.J(QFa.Q, wsa.w);
        xKa_34.J(QFa.MB, wsa.B);
        xKa_34.J(QFa.uA, fTa.j);
        xKa_34.J(QFa.n, yta.d);
        xKa_34.J(QFa.la, MQa.F);
        xKa_34.J(QFa.Ta, SRa.Q);
        xKa_34.J(QFa.u, xua.Ha);
        xKa_34.J(QFa.eB, Zpa.f);
        xKa_34.J(QFa.Ob, dua.A);
        xKa_34.J(QFa.nB, KSa.Z);
        xKa_34.J(QFa.IB, jRa.Ja);
        xKa_34.J(QFa.z, ISa.Aa);
        xKa_34.J(QFa.qA, Zua.Da);
        xKa_34.J(QFa.xC, Ata.A);
        xKa_34.J(QFa.ib, Eqa.W);
        xKa_34.J(QFa.pc, STa.G);
        xKa_34.J(QFa.NC, sSa.l);
        xKa_34.J(QFa.HC, sOa.e);
        xKa_34.J(QFa.h, aSa.A);
        xKa_34.J(QFa.uB, RQa.ja);
        xKa_3 xKa_35 = xKa_32;
        xKa_35.J(QFa.GA, pPa.g);
        xKa_35.J(QFa.Cf, fTa.c);
        xKa_35.J(QFa.iC, rRa.Ga);
        xKa_35.J(QFa.qB, Qqa.k);
        xKa_35.J(QFa.ea, Zqa.V);
        xKa_35.J(QFa.WA, ysa.r);
        xKa_35.J(QFa.X, xua.fa);
        xKa_35.J(QFa.C, TOa.J);
        xKa_35.J(QFa.Nc, isa.Ka);
        xKa_35.J(QFa.s, Qsa.c);
        xKa_35.J(QFa.Lb, Mqa.G);
        xKa_35.J(QFa.LC, Bra.Q);
        xKa_35.J(QFa.SA, aQa.w);
        xKa_35.J(QFa.Rc, cRa.V);
        xKa_35.J(QFa.nA, Era.r);
        xKa_35.J(QFa.M, WRa.t);
        xKa_35.J(QFa.Ja, Gua.o);
        xKa_35.J(QFa.TC, Zqa.r);
        xKa_35.J(QFa.oa, URa.I);
        xKa_35.J(QFa.eC, yQa.l);
        xKa_35.J(QFa.NA, TQa.O);
        xKa_35.J(QFa.iA, DPa.I);
        xKa_35.J(QFa.mb, Yra.p);
        xKa_35.J(QFa.gC, xua.B);
        xKa_35.J(QFa.VC, asa.I);
        xKa_35.J(QFa.Uc, Cta.q);
        xKa_35.J(QFa.bF, BRa.I);
        xKa_35.J(QFa.E, tua.f);
        xKa_35.J(QFa.Hd, Cra.O);
        xKa_35.J(QFa.BC, UOa.S);
        xKa_35.J(QFa.We, SRa.t);
        xKa_35.J(QFa.Lc, TOa.W);
        xKa_35.J(QFa.FB, Iqa.fa);
        xKa_35.J(QFa.D, SQa.N);
        xKa_35.J(QFa.r, oqa.m);
        xKa_35.J(QFa.vC, qta.J);
        xKa_35.J(QFa.pB, Jra.r);
        xKa_35.J(QFa.A, tua.S);
        xKa_35.J(QFa.uC, uQa.F);
        xKa_35.J(QFa.Te, ypa.D);
        xKa_35.J(QFa.zc, BlockFlower$EnumFlowerType.DANDELION.getMeta(), Era.M);
        xKa_35.J(QFa.dC, Qsa.Ga);
        xKa_35.J(QFa.TF, Npa.Da);
        xKa_35.J(QFa.ta, wOa.u);
        xKa_35.J(Gea.NB, PRa.ca);
        xKa_35.J(Gea.gB, jsa.x);
        xKa_35.J(Gea.ra, uQa.K);
        xKa_35.J(Gea.S, oQa.V);
        xKa_35.J(Gea.Mb, hra.I);
        xKa_35.J((eAa)Gea.cd, uSa.E, rSa.e);
        xKa_35.J((eAa)Gea.cd, vRa.d, NQa.Fa);
        xKa_35.J((eAa)Gea.cd, uqa.g, DQa.J);
        xKa_35.J((eAa)Gea.cd, yRa.d, asa.v);
        xKa_35.J(Gea.Ma, Spa.k);
        xKa_35.J(Gea.qc, uSa.E, Zqa.N);
        xKa_35.J(Gea.qc, vRa.d, Epa.S);
        xKa_35.J(Gea.b, nQa.a);
        xKa_35.J(Gea.GA, wsa.D);
        xKa_35.J(Gea.Bb, nQa.y);
        xKa_35.J(Gea.LA, TPa.fa);
        xKa_35.J(Gea.gc, ZSa.p);
        xKa_35.J(Gea.aC, NSa.F);
        xKa_35.J(Gea.kB, Fsa.U);
        xKa_35.J(Gea.qb, fpa.ma);
        xKa_35.J(Gea.jb, osa.a);
        xKa_35.J(Gea.Ea, MTa.I);
        xKa_35.J(Gea.P, jpa.b);
        xKa_35.J(Gea.Wc, zta.S);
        xKa_35.J(Gea.Ga, WQa.p);
        xKa_35.J(Gea.uc, aPa.d);
        xKa_35.J(Gea.zb, Qta.ja);
        xKa_35.J(Gea.Z, kta.L);
        xKa_35.J(Gea.t, BPa.k);
        xKa_35.J(Gea.hC, FPa.C);
        xKa_35.J(Gea.Na, Qqa.e);
        xKa_35.J(Gea.sa, dsa.ca);
        xKa_35.J(Gea.yb, QSa.o);
        xKa_35.J(Gea.l, POa.Ia);
        xKa_35.J(Gea.td, lPa.Ga);
        xKa_35.J(Gea.gd, AQa.r);
        xKa_35.J(Gea.ia, vqa.D);
        xKa_35.J(Gea.xB, bsa.Y);
        xKa_35.J(Gea.n, lQa.Aa);
        xKa_35.J(Gea.Fa, EPa.u);
        xKa_35.J(Gea.Sd, FPa.Da);
        xKa_35.J(Gea.Ic, iPa.y);
        xKa_35.J(Gea.ga, Tqa.L);
        xKa_35.J(Gea.o, mPa.fa);
        xKa_35.J(Gea.DC, lqa.y);
        xKa_35.J(Gea.Ra, gua.b);
        xKa_35.J((eAa)Gea.h, mSa.Ja);
        xKa_35.J((eAa)Gea.r, oua.Aa);
        xKa_35.J((eAa)Gea.W, aQa.h);
        xKa_35.J((eAa)Gea.ib, NPa.F);
        xKa_35.J((eAa)Gea.Nd, Jta.j);
        xKa_35.J((eAa)Gea.d, rta.r);
        xKa_35.J((eAa)Gea.e, Qta.Ga);
        xKa_35.J((eAa)Gea.ea, hQa.t);
        xKa_35.J((eAa)Gea.G, gua.D);
        xKa_35.J((eAa)Gea.x, rta.u);
        xKa_35.J((eAa)Gea.H, iSa.Ga);
        xKa_35.J((eAa)Gea.XC, cRa.t);
        xKa_35.J((eAa)Gea.ma, QSa.X);
        xKa_35.J((eAa)Gea.X, Psa.C);
        xKa_35.J((eAa)Gea.la, Fsa.y);
        xKa_35.J((eAa)Gea.Pa, xra.v);
        xKa_35.J((eAa)Gea.g, vPa.e);
        xKa_35.J((eAa)Gea.K, LPa.E);
        xKa_35.J((eAa)Gea.a, bqa.h);
        xKa_35.J((eAa)Gea.ab, Qpa.c);
        xKa_35.J(Gea.M, lTa.z);
        xKa_35.J(Gea.fa, AQa.M);
        xKa_35.J(Gea.kd, BQa.g);
        xKa_35.J(Gea.xa, ysa.y);
        xKa_35.J(Gea.pb, xqa.g);
        xKa_35.J(Gea.pb, vRa.d, xqa.g);
        xKa_35.J(Gea.O, FPa.S);
        xKa_35.J(Gea.YC, jpa.S);
        xKa_35.J(Gea.xc, MQa.Ka);
        xKa_35.J(Gea.hA, Zta.D);
        xKa_35.J(Gea.zA, xOa.Q);
        xKa_35.J(Gea.VA, ysa.l);
        xKa_35.J(Gea.CB, Epa.A);
        xKa_35.J(Gea.Ca, Pua.z);
        xKa_35.J(Gea.Ba, uQa.Ha);
        xKa_35.J(Gea.eb, eta.Ha);
        xKa_35.J(Gea.T, Iqa.H);
        xKa_35.J(Gea.NA, kTa.C);
        xKa_35.J(Gea.fd, NSa.i);
        xKa_35.J(Gea.zc, ATa.U);
        xKa_35.J(Gea.Pd, ERa.E);
        xKa_35.J(Gea.ba, wra.j);
        xKa_35.J(Gea.Xb, kTa.c);
        xKa_35.J(Gea.oa, csa.a);
        xKa_35.J(Gea.N, Wsa.f);
        xKa_35.J(Gea.c, Usa.Z);
        xKa_35.J(Gea.D, Gta.c);
        xKa_35.J(Gea.LB, FTa.M);
        xKa_35.J(Gea.Qa, Bta.Q);
        xKa_35.J(Gea.ua, EPa.D);
        xKa_35.J(Gea.A, iPa.q);
        xKa_35.J(Gea.Oa, kPa.a);
        xKa_35.J(Gea.C, Bua.i);
        xKa_35.J(Gea.Gb, Iqa.w);
        xKa_35.J((eAa)Gea.DA, VQa.k);
        xKa_35.J((eAa)Gea.DA, vRa.d, Era.S);
        xKa_35.J(Gea.lC, Vua.Aa);
        xKa_35.J(Gea.Sa, ITa.B);
        xKa_35.J(Gea.E, HEa.COD.getMetadata(), opa.D);
        xKa_35.J(Gea.E, HEa.SALMON.getMetadata(), Fpa.la);
        xKa_35.J(Gea.E, HEa.CLOWNFISH.getMetadata(), bRa.o);
        xKa_35.J(Gea.E, HEa.PUFFERFISH.getMetadata(), Bra.a);
        xKa_35.J(Gea.Ka, HEa.COD.getMetadata(), MRa.fa);
        xKa_35.J(Gea.Ka, HEa.SALMON.getMetadata(), QTa.ia);
        xKa_35.J(Gea.Q, iea.BLACK.getDyeDamage(), Yqa.l);
        xKa_35.J(Gea.Q, iea.RED.getDyeDamage(), Iqa.T);
        xKa_35.J(Gea.Q, iea.GREEN.getDyeDamage(), DPa.t);
        xKa_35.J(Gea.Q, iea.BROWN.getDyeDamage(), cQa.s);
        xKa_35.J(Gea.Q, iea.BLUE.getDyeDamage(), Ysa.T);
        xKa_35.J(Gea.Q, iea.PURPLE.getDyeDamage(), ySa.w);
        xKa_35.J(Gea.Q, iea.CYAN.getDyeDamage(), sSa.Fa);
        xKa_35.J(Gea.Q, iea.SILVER.getDyeDamage(), fqa.Y);
        xKa_35.J(Gea.Q, iea.GRAY.getDyeDamage(), Era.Z);
        xKa_35.J(Gea.Q, iea.PINK.getDyeDamage(), Eqa.Ga);
        xKa_35.J(Gea.Q, iea.LIME.getDyeDamage(), cTa.m);
        xKa_35.J(Gea.Q, iea.YELLOW.getDyeDamage(), Ssa.X);
        xKa_35.J(Gea.Q, iea.LIGHT_BLUE.getDyeDamage(), gQa.E);
        xKa_35.J(Gea.Q, iea.MAGENTA.getDyeDamage(), wsa.E);
        xKa_35.J(Gea.Q, iea.ORANGE.getDyeDamage(), Xpa.l);
        xKa_35.J(Gea.Q, iea.WHITE.getDyeDamage(), zua.u);
        xKa_35.J(Gea.Ya, Uta.Ka);
        xKa_35.J(Gea.hb, tSa.ja);
        xKa_35.J(Gea.Da, jpa.Y);
        xKa_35.J(Gea.QC, Yua.Ia);
        xKa_35.J(Gea.tA, QSa.B);
        xKa_35.J(Gea.ka, Hra.w);
        xKa_35.J((eAa)Gea.ja, Uqa.Fa);
        xKa_35.J(Gea.fA, SOa.Z);
        xKa_35.J(Gea.tb, Iqa.O);
        xKa_35.J(Gea.wc, Sqa.u);
        xKa_35.J(Gea.mC, fpa.La);
        xKa_35.J(Gea.y, ZRa.Aa);
        xKa_3 xKa_36 = xKa_32;
        xKa_36.J(Gea.od, gua.H);
        xKa_36.J(Gea.Aa, qta.s);
        xKa_36.J(Gea.Za, MQa.O);
        xKa_36.J(Gea.m, uOa.o);
        xKa_36.J(Gea.v, wua.B);
        xKa_36.J(Gea.JA, Ora.v);
        xKa_36.J(Gea.WB, vsa.F);
        xKa_36.J(Gea.w, NQa.fa);
        xKa_36.J(Gea.Ta, AQa.S);
        xKa_36.J(Gea.qa, SRa.Ha);
        xKa_36.J(Gea.Uc, JPa.Ha);
        xKa_36.J(Gea.q, Mqa.i);
        xKa_36.J(Gea.pa, Ora.r);
        xKa_36.J(Gea.hc, rQa.O);
        xKa_36.J(Gea.qA, bsa.C);
        xKa_36.j.J((eAa)Gea.aa, (Fb)new Uka((xKa)xKa_32));
        xKa_36.J(Gea.J, MTa.C);
        xKa_36.J(Gea.Kd, kta.g);
        xKa_36.J(Gea.B, URa.i);
        xKa_36.J(Gea.I, pqa.R);
        xKa_36.J(Gea.Xa, Fua.V);
        xKa_36.J(Gea.ub, pqa.z);
        xKa_36.J(Gea.Ab, bsa.q);
        xKa_36.J(Gea.da, PQa.Ja);
        xKa_36.J(Gea.Ja, wsa.Aa);
        xKa_36.j.J(Gea.SB, (Fb)new Sja((xKa)xKa_32));
        xKa_36.J(Gea.Tb, vTa.t);
        xKa_36.J(Gea.j, tpa.X);
        xKa_36.J(Gea.MC, pta.ia);
        xKa_36.J(Gea.kc, zta.d);
        xKa_36.J(Gea.Ia, Yqa.Ja);
        xKa_36.J(Gea.mB, Ura.Y);
        xKa_36.J(Gea.EB, mra.E);
        xKa_36.J(Gea.cA, LRa.a);
        xKa_36.J(Gea.jC, eta.Q);
        xKa_36.J(Gea.Qd, DQa.h);
        xKa_36.J((eAa)Gea.CC, Epa.Aa);
        xKa_36.J(Gea.Jd, hra.Y);
        xKa_36.J(Gea.GB, uSa.E, Fsa.l);
        xKa_36.J(Gea.GB, vRa.d, vRa.v);
        xKa_36.J(Gea.GB, uqa.g, VQa.ca);
        xKa_36.J(Gea.GB, yRa.d, bsa.B);
        xKa_36.J(Gea.GB, AQa.P, PTa.I);
        xKa_36.J(Gea.md, wsa.F);
        xKa_36.J(Gea.pA, jRa.Aa);
        xKa_36.J(Gea.mA, bua.i);
        xKa_36.J(Gea.OB, JTa.P);
        xKa_36.J(Gea.k, SQa.p);
        xKa_36.J(Gea.za, nQa.C);
        xKa_36.J(Gea.wA, SRa.u);
        xKa_36.J(Gea.na, ZOa.Ga);
        xKa_36.J(Gea.ld, tpa.r);
        xKa_36.J(Gea.U, Bua.Ja);
        xKa_36.J(Gea.La, kpa.O);
        xKa_36.J(Gea.Yc, Uqa.Ea);
        xKa_36.J(Gea.sd, GPa.X);
        xKa_36.J(Gea.i, yta.Z);
        xKa_36.J(Gea.F, sSa.ja);
        xKa_36.j.J(Gea.gC, (Fb)new jla((xKa)xKa_32));
        xKa_36.J(Gea.Va, Zqa.b);
        xKa_36.J(Gea.dc, Upa.Ka);
        xKa_36.J(Gea.Y, wua.G);
        xKa_36.J(Gea.ca, DQa.L);
        xKa_36.J(Gea.L, Psa.G);
        xKa_36.J(Gea.z, Hra.o);
        xKa_36.J(Gea.ya, BRa.Fa);
        xKa_36.J(Gea.Sb, dQa.p);
        xKa_36.J(Gea.rB, WSa.K);
        xKa_36.J(Gea.f, PRa.H);
        xKa_36.J(Gea.Ua, uua.L);
        xKa_36.J(Gea.V, PQa.o);
        xKa_36.J(Gea.Dd, Sqa.h);
        xKa_36.J(Gea.QA, Ora.e);
        xKa_36.j.J((eAa)Gea.ha, (Fb)new pJa((xKa)xKa_32));
        xKa_36.j.J((eAa)Gea.wa, (Fb)new JJa((xKa)xKa_32));
        xKa_36.J(QFa.Ac, ura.R);
        xKa_36.J(Gea.Wa, eua.c);
        xKa_36.J(Gea.u, bsa.P);
        xKa_36.J(QFa.fE, fpa.E);
        xKa_36.J(QFa.P, hqa.u);
        xKa_36.J(Gea.sb, lqa.n);
        xKa_36.J(QFa.ma, BlockHugeMushroom$EnumType.ALL_INSIDE.getMetadata(), WSa.k);
        xKa_36.J(QFa.BF, BlockHugeMushroom$EnumType.ALL_INSIDE.getMetadata(), nOa.m);
        xKa_36.J(QFa.Zb, Qqa.U);
        xKa_36.J(Gea.Lc, bpa.n);
        xKa_36.J(Gea.p, Ppa.L);
        xKa_36.J(Gea.HB, LRa.m);
        xKa_36.J(Gea.R, fTa.m);
        xKa_36.J(Gea.va, kra.B);
        xKa_36.J(Gea.Ha, bqa.ha);
        xKa_36.J(Gea.FC, MRa.Da);
        xKa_36.J((eAa)Gea.AA, Xsa.w);
        xKa_36.J((eAa)Gea.Mc, wra.w);
        xKa_36.J((eAa)Gea.TC, Zpa.C);
        xKa_36.J((eAa)Gea.ta, Pqa.Ja);
        xKa_36.J(QFa.Jd, Pqa.R);
        xKa_36.J(QFa.ja, EQa.f);
        xKa_36.J(QFa.bD, JTa.w);
        xKa_36.J(QFa.Wf, LRa.la);
        xKa_36.J(QFa.H, UTa.z);
        xKa_36.J(QFa.hB, rpa.b);
        xKa_36.J(QFa.Fb, aPa.X);
        xKa_36.J(QFa.Da, hTa.T);
        xKa_36.J(QFa.xb, nQa.Y);
        xKa_36.J(QFa.fB, iea.BLACK.getMetadata(), Ira.R);
        xKa_36.J(QFa.fB, iea.BLUE.getMetadata(), Bsa.s);
        xKa_36.J(QFa.fB, iea.BROWN.getMetadata(), zpa.z);
        xKa_36.J(QFa.fB, iea.CYAN.getMetadata(), Zua.T);
        xKa_36.J(QFa.fB, iea.GRAY.getMetadata(), wra.J);
        xKa_36.J(QFa.fB, iea.GREEN.getMetadata(), eua.f);
        xKa_36.J(QFa.fB, iea.LIGHT_BLUE.getMetadata(), qQa.W);
        xKa_36.J(QFa.fB, iea.LIME.getMetadata(), uSa.F);
        xKa_36.J(QFa.fB, iea.MAGENTA.getMetadata(), dQa.J);
        xKa_36.J(QFa.fB, iea.ORANGE.getMetadata(), gua.F);
        xKa_36.J(QFa.fB, iea.PINK.getMetadata(), xua.c);
        xKa_36.J(QFa.fB, iea.PURPLE.getMetadata(), Epa.v);
        xKa_36.J(QFa.fB, iea.RED.getMetadata(), IPa.ga);
        xKa_36.J(QFa.fB, iea.SILVER.getMetadata(), eta.j);
        xKa_36.J(QFa.fB, iea.WHITE.getMetadata(), LRa.Y);
        xKa_36.J(QFa.fB, iea.YELLOW.getMetadata(), Ata.L);
        xKa_36.J(QFa.ZA, iea.BLACK.getMetadata(), Ira.k);
        xKa_36.J(QFa.ZA, iea.BLUE.getMetadata(), PQa.b);
        xKa_36.J(QFa.ZA, iea.BROWN.getMetadata(), dpa.r);
        xKa_36.J(QFa.ZA, iea.CYAN.getMetadata(), qsa.T);
        xKa_36.J(QFa.ZA, iea.GRAY.getMetadata(), lqa.i);
        xKa_36.J(QFa.ZA, iea.GREEN.getMetadata(), tua.ba);
        xKa_36.J(QFa.ZA, iea.LIGHT_BLUE.getMetadata(), Ypa.c);
        xKa_36.J(QFa.ZA, iea.LIME.getMetadata(), nua.s);
        xKa_36.J(QFa.ZA, iea.MAGENTA.getMetadata(), Zqa.Aa);
        xKa_36.J(QFa.ZA, iea.ORANGE.getMetadata(), Pqa.y);
        xKa_36.J(QFa.ZA, iea.PINK.getMetadata(), wPa.a);
        xKa_36.J(QFa.ZA, iea.PURPLE.getMetadata(), fta.q);
        xKa_36.J(QFa.ZA, iea.RED.getMetadata(), cQa.n);
        xKa_36.J(QFa.ZA, iea.SILVER.getMetadata(), Lqa.Ga);
        xKa_36.J(QFa.ZA, iea.WHITE.getMetadata(), zsa.Ma);
        xKa_36.J(QFa.ZA, iea.YELLOW.getMetadata(), rpa.d);
        xKa_36.J(QFa.IC, qta.L);
        xKa_36.J(QFa.RA, TOa.x);
        xKa_36.J(QFa.Yb, Jra.O);
        xKa_36.J(QFa.Vc, zta.ca);
        xKa_36.J(QFa.zd, BlockPlanks$EnumType.BIRCH.getMetadata(), QSa.G);
        xKa_36.J(QFa.zd, BlockPlanks$EnumType.JUNGLE.getMetadata(), ypa.J);
        xKa_36.J(QFa.zd, BlockPlanks$EnumType.OAK.getMetadata(), uqa.ca);
        xKa_36.J(QFa.zd, BlockPlanks$EnumType.SPRUCE.getMetadata(), JTa.J);
        xKa_36.J(QFa.Hc, BlockPlanks$EnumType.ACACIA.getMetadata() - AQa.P, xTa.q);
        xKa_36.J(QFa.Hc, BlockPlanks$EnumType.DARK_OAK.getMetadata() - AQa.P, lQa.b);
        xKa_36.J(QFa.Hc, BlockPlanks$EnumType.CRIMSON.getMetadata() - AQa.P, SOa.i);
        xKa_36.J(QFa.Hc, BlockPlanks$EnumType.WARPED.getMetadata() - AQa.P, zta.z);
        xKa_36.J(QFa.Nf, BlockPlanks$EnumType.MANGROVE.getMetadata() - Yqa.i, rpa.S);
        xKa_36.J(QFa.Nf, BlockPlanks$EnumType.CHERRY.getMetadata() - Yqa.i, kpa.x);
        xKa_36.J(QFa.Nf, BlockPlanks$EnumType.PALE_OAK.getMetadata() - Yqa.i, tTa.l);
        xKa_36.J(QFa.Ka, Upa.I);
        xKa_36.J(QFa.gg, IPa.Ga);
        xKa_36.J(QFa.BA, tSa.D);
        xKa_36.J(QFa.jb, Gua.j);
        xKa_36.J(QFa.GC, oQa.r);
        xKa_36.J(QFa.Dd, BRa.J);
        xKa_36.J(QFa.lC, tTa.fa);
        xKa_36.J(QFa.DC, zOa.i);
        Object object = BlockFroglight$EnumVariant.values();
        int n2 = ((BlockFroglight$EnumVariant[])object).length;
        int n3 = a22 = uSa.E;
        while (n3 < n2) {
            enum_ = object[a22];
            xKa_32.J(QFa.Kg, ((BlockFroglight$EnumVariant)enum_).getMeta(), new StringBuilder().insert(2 & 5, ((BlockFroglight$EnumVariant)enum_).getName()).append(WOa.U).toString());
            n3 = ++a22;
        }
        xKa_3 xKa_37 = xKa_32;
        xKa_37.J(QFa.mB, Usa.K);
        xKa_37.J(QFa.db, XTa.E);
        xKa_37.J(QFa.oB, pqa.Q);
        xKa_37.J(QFa.q, wPa.c);
        xKa_37.J(QFa.Yc, STa.V);
        xKa_37.J(QFa.sC, Lsa.p);
        object = BlockCopper$EnumVariant.values();
        n2 = ((BlockCopper$EnumVariant[])object).length;
        int n4 = a22 = uSa.E;
        while (n4 < n2) {
            enum_ = object[a22];
            xKa_32.J(QFa.tA, ((BlockCopper$EnumVariant)enum_).getMeta(), ((BlockCopper$EnumVariant)enum_).getName());
            n4 = ++a22;
        }
        xKa_3 xKa_38 = xKa_32;
        xKa_38.J(QFa.iB, iea.WHITE.getMetadata(), vqa.y);
        xKa_38.J(QFa.iB, iea.ORANGE.getMetadata(), Zpa.M);
        xKa_38.J(QFa.iB, iea.MAGENTA.getMetadata(), Upa.g);
        xKa_38.J(QFa.iB, iea.LIGHT_BLUE.getMetadata(), JQa.p);
        xKa_38.J(QFa.kB, iea.YELLOW.getMetadata() - AQa.P, Yua.la);
        xKa_38.J(QFa.kB, iea.LIME.getMetadata() - AQa.P, Nta.la);
        xKa_38.J(QFa.kB, iea.PINK.getMetadata() - AQa.P, rQa.N);
        xKa_38.J(QFa.kB, iea.GRAY.getMetadata() - AQa.P, qsa.U);
        xKa_38.J(QFa.lE, iea.SILVER.getMetadata() - Yqa.i, yOa.G);
        xKa_38.J(QFa.lE, iea.CYAN.getMetadata() - Yqa.i, uQa.V);
        xKa_38.J(QFa.lE, iea.PURPLE.getMetadata() - Yqa.i, TPa.I);
        xKa_38.J(QFa.lE, iea.BLUE.getMetadata() - Yqa.i, qQa.q);
        xKa_38.J(QFa.lc, iea.BROWN.getMetadata() - lqa.s, PQa.Q);
        xKa_38.J(QFa.lc, iea.GREEN.getMetadata() - lqa.s, hTa.b);
        xKa_38.J(QFa.lc, iea.BLACK.getMetadata() - lqa.s, QTa.K);
        xKa_38.J(QFa.lc, iea.RED.getMetadata() - lqa.s, wOa.Ka);
        xKa_38.J(QFa.wa, ura.g);
        xKa_38.J(QFa.cb, ROa.C);
        xKa_38.J(QFa.J, ppa.O);
        xKa_38.J(QFa.od, EQa.w);
        xKa_38.J(QFa.yb, Tpa.F);
        xKa_38.J(QFa.Sa, Xpa.X);
        xKa_38.J(QFa.gB, Wsa.p);
        xKa_38.J(QFa.he, Ssa.S);
        xKa_38.J(QFa.bA, CRa.X);
        xKa_38.J(QFa.SC, xqa.h);
        xKa_38.J(QFa.Wa, Lqa.Ja);
        xKa_38.J(QFa.HA, sOa.N);
        xKa_38.J(QFa.Ff, Asa.z);
        xKa_38.J(QFa.JA, Eqa.l);
        xKa_38.J(QFa.nc, Gta.O);
        xKa_38.J(QFa.Fd, wra.U);
        xKa_38.J(QFa.kA, nQa.W);
        xKa_38.J(QFa.fd, CRa.ha);
        xKa_38.J(QFa.DA, Yua.ga);
        xKa_38.J(QFa.OC, Fua.s);
        xKa_38.J(QFa.fc, FRa.c);
        xKa_38.J(QFa.Bf, Fpa.g);
        xKa_38.J(QFa.S, asa.Aa);
        xKa_38.J(QFa.YB, cQa.V);
        xKa_38.J(QFa.XC, uOa.Ia);
        xKa_38.J(QFa.XB, Yua.F);
        xKa_38.J(QFa.G, kPa.Aa);
        xKa_38.J(QFa.gb, aPa.b);
        xKa_38.J(QFa.Bb, FTa.m);
        xKa_38.J(QFa.W, Cra.P);
        xKa_38.J(QFa.OB, Lqa.f);
        xKa_38.J(QFa.XA, Pqa.E);
        xKa_38.J(QFa.Ba, Xsa.u);
        xKa_38.J(QFa.QA, POa.Ja);
        xKa_38.J(QFa.qF, POa.I);
        xKa_38.J(QFa.EB, nQa.S);
        xKa_38.J(QFa.QC, Xsa.Ka);
        xKa_38.J(QFa.DB, Ira.fa);
        xKa_38.J(QFa.lB, oqa.V);
        xKa_38.J(QFa.yC, gQa.Q);
        xKa_38.J(QFa.lb, Uta.fa);
        xKa_38.J(QFa.MC, Sqa.fa);
        xKa_38.J(QFa.CA, LPa.ja);
        xKa_38.J(QFa.PC, Pqa.c);
        xKa_38.J(QFa.Pc, tSa.Z);
        xKa_38.J(QFa.RC, Gua.Da);
        xKa_38.J(QFa.zC, LRa.v);
        xKa_38.J(QFa.MA, Gua.Y);
        xKa_38.J(QFa.KB, Asa.D);
        xKa_38.J(QFa.Kc, ERa.A);
        xKa_38.J(QFa.NB, Sqa.H);
        xKa_38.J(QFa.I, Ora.Aa);
        xKa_38.J(QFa.BD, aSa.d);
        xKa_38.J(QFa.iD, Asa.Aa);
        xKa_38.J(QFa.Eb, cRa.W);
        xKa_38.J(QFa.aB, Jra.d);
        xKa_38.J(QFa.pA, rQa.V);
        xKa_38.J(QFa.VB, Cta.Ka);
        xKa_38.J(QFa.wB, Qsa.u);
        xKa_38.J(QFa.WE, lqa.X);
        xKa_38.J(QFa.eA, BPa.O);
        xKa_38.J(QFa.O, aua.ha);
        xKa_38.J(QFa.id, CRa.k);
        xKa_38.J(QFa.bd, bqa.w);
        xKa_38.J(QFa.hg, mra.p);
        xKa_38.J(QFa.qb, cRa.ia);
        xKa_38.J(QFa.Jc, Xpa.B);
        xKa_38.J(QFa.Oa, osa.d);
        xKa_38.J(QFa.de, gua.Ka);
        xKa_38.J(QFa.ZC, rpa.U);
        xKa_38.J(QFa.sf, iSa.B);
        xKa_38.J(QFa.sb, Jta.Ja);
        xKa_38.J(QFa.N, Ora.G);
        xKa_38.J(QFa.d, wOa.A);
        xKa_38.J(QFa.Ha, ZOa.la);
        xKa_38.J(QFa.e, bRa.Q);
        xKa_38.J(QFa.zb, LPa.R);
        xKa_38.J(QFa.Wd, wsa.C);
        xKa_38.J(QFa.Ef, Lsa.ga);
        xKa_38.J(QFa.ed, vpa.E);
        xKa_38.J(QFa.hC, Gta.p);
        xKa_38.J(QFa.B, ypa.o);
        xKa_38.J(QFa.cF, NSa.fa);
        xKa_38.J(QFa.mf, aqa.y);
        xKa_38.J(QFa.HB, aQa.H);
        xKa_38.J(QFa.sd, qsa.ja);
        xKa_38.J(QFa.Ld, Tqa.Ga);
        xKa_38.J(QFa.fC, KQa.fa);
        xKa_38.J(QFa.ga, EQa.Aa);
        xKa_38.J(QFa.KA, pta.Ca);
        xKa_38.J(QFa.La, vqa.t);
        xKa_38.J(QFa.UC, BPa.l);
        xKa_38.J(QFa.KE, tpa.s);
        xKa_38.J(QFa.Tc, xOa.k);
        xKa_38.J(QFa.AB, Uta.c);
        xKa_38.J(QFa.qc, Jpa.e);
        xKa_38.J(QFa.tc, NOa.R);
        xKa_38.J(QFa.Ra, oQa.E);
        xKa_38.J(QFa.tb, oqa.Ha);
        xKa_38.J(QFa.Ya, Uta.A);
        xKa_38.J(QFa.Xa, psa.K);
        xKa_38.J(QFa.qa, NOa.k);
        xKa_38.J(QFa.wc, Iqa.K);
        xKa_38.J(QFa.GF, iPa.a);
        xKa_38.J(QFa.Zc, hra.d);
        xKa_38.J(QFa.vB, gua.j);
        xKa_38.J(QFa.Dc, Bua.O);
        xKa_38.J(QFa.hD, EPa.ja);
        xKa_38.J(QFa.VE, vQa.Ga);
        xKa_38.J(QFa.Ua, Nra.U);
        xKa_38.J(QFa.ad, rta.h);
        xKa_38.J(QFa.Df, pua.J);
        xKa_38.J(QFa.mD, ATa.N);
        xKa_38.J(QFa.SF, ROa.I);
        xKa_38.J(QFa.eD, dpa.Ka);
        xKa_38.J(QFa.K, AQa.X);
        xKa_38.J(QFa.FC, ppa.Ka);
        xKa_38.J(QFa.Yf, zOa.c);
        xKa_38.J(QFa.jB, vsa.ja);
        xKa_38.J(QFa.SB, Bta.E);
        xKa_38.J(QFa.Ca, bRa.O);
        xKa_38.J(QFa.aA, VQa.Da);
        xKa_38.J(QFa.ab, Nra.L);
        xKa_38.J(QFa.LB, kpa.X);
        xKa_38.J(QFa.uc, FRa.N);
        xKa_38.J(QFa.va, yta.u);
        xKa_38.J(QFa.cA, nua.P);
        xKa_38.J(QFa.ia, Usa.P);
        xKa_38.J(QFa.nC, Bpa.ca);
        xKa_38.J(QFa.Pa, fpa.L);
        xKa_38.J(QFa.Mg, Jsa.E);
        xKa_38.J(QFa.bC, pta.K);
        xKa_38.J(QFa.ld, ROa.d);
        xKa_38.J(QFa.lA, ysa.z);
        xKa_38.J(QFa.rA, kTa.ga);
        xKa_38.J(QFa.nd, Hta.y);
        xKa_38.J(QFa.Cc, WSa.r);
        xKa_38.J(QFa.aa, aPa.V);
        xKa_38.J(QFa.Sd, yra.L);
        xKa_38.J(QFa.ya, pta.F);
        xKa_38.J(QFa.xa, rta.C);
        xKa_38.J(QFa.zf, mra.G);
        xKa_38.J(QFa.jc, MRa.J);
        xKa_38.J(QFa.Pb, Vra.Q);
        xKa_38.J(QFa.fa, psa.f);
        xKa_38.J(QFa.ZD, Epa.b);
        xKa_38.J(QFa.GB, Xpa.L);
        xKa_38.J(QFa.m, ZSa.n);
        xKa_38.J(QFa.FA, bqa.A);
        xKa_38.J(QFa.wA, jpa.C);
        xKa_38.J(QFa.o, eta.C);
        xKa_38.J(QFa.dA, Tqa.z);
        xKa_38.J(QFa.dB, YSa.t);
        xKa_38.J(QFa.Gc, eua.b);
        xKa_38.J(QFa.qd, qQa.D);
        xKa_38.J(QFa.PE, RPa.C);
        xKa_38.J(QFa.TD, JSa.ja);
        xKa_38.J(QFa.sa, uua.Ga);
        xKa_38.J(QFa.Gb, tSa.Ga);
        xKa_38.J(QFa.Va, bRa.i);
        xKa_38.J(QFa.wb, UOa.Y);
        xKa_38.J(QFa.ac, VPa.V);
        xKa_38.J(QFa.kb, FPa.K);
        xKa_38.J(QFa.YC, tTa.b);
        xKa_38.J(QFa.xB, Ysa.h);
        xKa_3 xKa_39 = xKa_32;
        xKa_39.J(QFa.Se, yOa.I);
        xKa_39.J(QFa.Kd, MQa.Q);
        xKa_39.J(QFa.xA, dpa.a);
        xKa_39.J(QFa.sB, Lqa.t);
        xKa_39.J(QFa.x, sra.Ja);
        xKa_39.J(QFa.AA, EPa.q);
        xKa_39.J(QFa.mC, Pqa.H);
        xKa_39.J(QFa.TA, dua.i);
        xKa_39.J(QFa.wE, pua.S);
        xKa_39.J(QFa.Ma, vqa.N);
        xKa_39.J(QFa.Kb, DQa.I);
        xKa_39.J(QFa.rb, cra.l);
        xKa_39.J(QFa.Qd, zsa.c);
        xKa_39.J(QFa.mA, bsa.d);
        xKa_39.J(QFa.Fa, EQa.g);
        xKa_39.J(QFa.a, bua.ga);
        xKa_39.J(QFa.Wb, Lra.S);
        xKa_39.J(QFa.ob, Jpa.I);
        xKa_39.J(QFa.fb, lqa.C);
        xKa_39.J(QFa.Id, Eqa.H);
        xKa_39.J(QFa.GD, XSa.o);
        xKa_39.J(QFa.Md, URa.k);
        xKa_39.J(QFa.Mf, fsa.ga);
        xKa_39.J(QFa.TB, yQa.n);
        xKa_39.J(QFa.Vb, tpa.w);
        xKa_39.J(QFa.Cd, Pua.n);
        xKa_39.J(QFa.pC, Yqa.v);
        xKa_39.J(QFa.KD, YSa.h);
        xKa_39.J(QFa.kd, SRa.x);
        xKa_39.J(QFa.ra, ysa.E);
        xKa_39.J(QFa.Rb, fta.k);
        xKa_39.J(QFa.bB, mSa.k);
        xKa_39.J(QFa.ua, Fua.r);
        xKa_39.J(QFa.aC, QSa.S);
        xKa_39.J(QFa.gF, Ssa.ca);
        xKa_39.J(QFa.j, wta.K);
        xKa_39.J(QFa.RB, sOa.R);
        xKa_39.J(QFa.Ga, ura.Da);
        xKa_39.J(QFa.Mb, zsa.q);
        xKa_39.J(QFa.Tb, PTa.N);
        xKa_39.J(QFa.ub, uqa.Z);
        xKa_39.J(QFa.zB, Gua.f);
        xKa_39.J(QFa.AE, hra.w);
        xKa_39.J(QFa.WD, Jra.p);
        xKa_39.J(QFa.ha, gQa.fa);
        xKa_39.J(QFa.Hb, FPa.W);
        xKa_39.J(QFa.PA, Rua.Q);
        xKa_39.J(QFa.Wc, Ppa.t);
        xKa_39.J(QFa.Ve, lqa.m);
        xKa_39.J(QFa.f, TOa.Z);
        xKa_39.J(QFa.ZB, fpa.Ha);
        xKa_39.J(QFa.Ec, NTa.Y);
        xKa_39.J(QFa.tB, aua.w);
        xKa_39.J(QFa.CC, qsa.m);
        xKa_39.J(QFa.nb, VQa.fa);
        xKa_39.J(QFa.cc, kPa.E);
        xKa_39.J(QFa.Qc, dQa.Fa);
        xKa_39.J(QFa.xc, jpa.z);
        xKa_39.J(QFa.sA, Lqa.Z);
        xKa_39.J(QFa.dc, KSa.c);
        xKa_39.J(QFa.JD, fta.i);
        xKa_39.J(QFa.Xc, Ppa.f);
        xKa_39.J(QFa.yc, nqa.v);
        xKa_39.J(QFa.rB, aqa.c);
        xKa_39.J(QFa.IA, kTa.e);
        xKa_39.J(QFa.oA, Era.ca);
        object = Block.blockRegistry.iterator();
        block2: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                Block block = (Block)object.next();
                CustomBlock a22 = block.J();
                if (a22 == null) {
                    object2 = object;
                    continue;
                }
                xKa_32.J(block, a22.J());
                if (a22.J() != CustomBlock$CustomBlockType.slab) continue block2;
                xKa_32.J(Block.blockRegistry.J((ResourceLocation)a22.l()), new StringBuilder().insert(3 & 4, a22.J()).append(dsa.fa).toString());
                continue block2;
            }
            break;
        }
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        xKa_3 a2 = this;
        a2.i = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(RA rA2, Mda mda2) {
        void b2;
        xKa_3 c2 = mda2;
        xKa_3 a2 = this;
        a2.J((RA)b2, pua.o, (Mda)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Mda mda2) {
        void a2;
        xKa_3 xKa_32 = this;
        xKa_3 b2 = xKa_32.j.J((Mda)a2);
        if (a2.J() != null) {
            if (!b2.l()) {
                uKa.l((float)kta.v, (float)kta.v, (float)kta.v);
            }
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(RA rA2, int n2) {
        void b2;
        int c2 = n2;
        xKa_3 a2 = this;
        a2.J((RA)b2, c2, (Mda)null);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, RA rA2) {
        void b2;
        xKa_3 c2 = rA2;
        xKa_3 a2 = this;
        if (b2 != null) {
            uKa.e();
            uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
            if (c2.f()) {
                uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                uKa.J((float)vPa.b, (float)vPa.b, (float)vPa.b);
                if (k) {
                    Bp.J(I);
                } else {
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                }
                uKa.o();
                HJa.I.J((Mda)b2);
            } else {
                if (Config.v()) {
                    c2 = Me.J((Mda)b2, (RA)c2, (ModelResourceLocation)a2.A);
                }
                uKa.J((float)vPa.b, (float)vPa.b, (float)vPa.b);
                void v0 = b2;
                a2.J((RA)c2, (Mda)v0);
                if (!(!v0.C() || Config.v() && Me.J((xKa)a2, (Mda)b2, (RA)c2))) {
                    a2.J((RA)c2);
                }
            }
            uKa.D();
        }
    }

    public BLa J() {
        xKa_3 a2;
        return a2.j;
    }

    private boolean J(iJa iJa2) {
        xKa_3 xKa_32;
        int n2;
        xKa_3 b2 = iJa2;
        xKa_3 a2 = this;
        if (((iJa)b2).scale.x < JPa.N) {
            n2 = vRa.d;
            xKa_32 = b2;
        } else {
            n2 = uSa.E;
            xKa_32 = b2;
        }
        return (n2 ^ (((iJa)xKa_32).scale.y < JPa.N ? vRa.d : uSa.E) ^ (((iJa)b2).scale.z < JPa.N ? vRa.d : uSa.E)) != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Kna kna2, Mda mda2, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        xKa_3 a2 = this;
        a2.J((Kna)d2, (Mda)c2, (int)b2, (int)e2, null);
    }

    /*
     * WARNING - void declaration
     */
    public xKa_3(aJa aJa2, Fia fia2) {
        void b2;
        xKa_3 a2;
        Object c2 = fia2;
        xKa_3 xKa_32 = a2 = this;
        xKa_3 xKa_33 = a2;
        a2.i = vRa.d;
        xKa_33.A = null;
        xKa_33.L = uSa.E;
        xKa_33.J = null;
        xKa_32.E = b2;
        xKa_32.J = c2;
        xKa_32.j = new BLa((Fia)c2);
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Gl gl2, Xja xja2) {
        void c2;
        Object d2 = gl2;
        xKa_3 b2 = this;
        if (c2 != null && d2 != null) {
            void a2;
            RA rA2 = b2.j.J((Mda)c2);
            if (d2 instanceof Sx) {
                d2 = (Sx)((Object)d2);
                d2 = b2.j.J((Mda)c2, (Sx)((Object)d2));
                b2.A = d2;
                if (d2 != null) {
                    rA2 = b2.j.J().J((ModelResourceLocation)d2);
                }
            }
            b2.J((Mda)c2, rA2, (Xja)a2);
            b2.A = null;
        }
    }

    public boolean J(Mda mda2) {
        xKa_3 b2 = mda2;
        xKa_3 a2 = this;
        if ((b2 = a2.j.J((Mda)b2)) == null) {
            return uSa.E != 0;
        }
        return b2.l();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Kna kna2, Mda mda2, int n2, int n3, String string) {
        xKa_3 f22 = mda2;
        xKa_3 d2 = this;
        if (f22 != null) {
            boolean bl2;
            void b2;
            void c2;
            aKa a2;
            if (((Mda)f22).E != vRa.d || a2 != null) {
                void e2;
                String string2;
                String string3 = string2 = a2 == null ? String.valueOf(((Mda)f22).E) : a2;
                if (a2 == null && ((Mda)f22).E < vRa.d) {
                    string2 = pY.RED + String.valueOf(((Mda)f22).E);
                }
                uKa.L();
                uKa.u();
                uKa.k();
                void v1 = e2;
                v1.J(string2, (float)(c2 + wOa.t - uqa.g - v1.J(string2)), (float)(b2 + uua.p + yRa.d), pua.o);
                uKa.P();
                uKa.J();
            }
            if (bl2 = f22.A()) {
                int e2 = (int)Math.round(SQa.t - (double)f22.f() * SQa.t / (double)f22.l());
                int f22 = (int)Math.round(pqa.o - (double)f22.f() * pqa.o / (double)f22.l());
                uKa.L();
                uKa.u();
                uKa.z();
                uKa.c();
                uKa.k();
                a2 = pKa.J().J();
                xKa_3 xKa_32 = d2;
                aKa aKa2 = a2;
                d2.J(aKa2, (int)(c2 + uqa.g), (int)(b2 + uua.s), uua.s, uqa.g, uSa.E, uSa.E, uSa.E, osa.Ja);
                xKa_32.J(aKa2, (int)(c2 + uqa.g), (int)(b2 + uua.s), lqa.s, vRa.d, (osa.Ja - f22) / AQa.P, ysa.s, uSa.E, osa.Ja);
                xKa_32.J(a2, (int)(c2 + uqa.g), (int)(b2 + uua.s), e2, vRa.d, osa.Ja - f22, f22, uSa.E, osa.Ja);
                uKa.B();
                uKa.K();
                uKa.H();
                uKa.P();
                uKa.J();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, Yka yka2) {
        void b2;
        xKa_3 c2 = yka2;
        xKa_3 a2 = this;
        c2 = c2.J().getDirectionVec();
        b2.l((float)c2.getX(), (float)c2.getY(), (float)c2.getZ());
    }

    /*
     * WARNING - void declaration
     */
    private void J(Block block, String string) {
        void b2;
        String c2 = string;
        xKa_3 a2 = this;
        a2.J((Block)b2, uSa.E, c2);
    }

    private void J(RA rA2) {
        xKa_3 b2 = rA2;
        xKa_3 a2 = this;
        if (!(Config.v() && !Me.J() || Config.h() && pA.eA)) {
            uKa.J(uSa.E != 0);
            uKa.I((int)Jqa.e);
            uKa.L();
            uKa.f((int)tua.C, (int)vRa.d);
            a2.E.J(M);
            if (Config.h() && !a2.L) {
                tA.J();
            }
            uKa.G((int)RQa.j);
            uKa.e();
            uKa.l((float)Qsa.k, (float)Qsa.k, (float)Qsa.k);
            uKa.J((float)((float)(Kpa.J() % tpa.Ja) / APa.O / Qsa.k), (float)JPa.N, (float)JPa.N);
            uKa.J((float)Qqa.x, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            xKa_3 xKa_32 = a2;
            xKa_32.J((RA)b2, Fua.ja);
            uKa.D();
            uKa.e();
            uKa.l((float)Qsa.k, (float)Qsa.k, (float)Qsa.k);
            uKa.J((float)(-((float)(Kpa.J() % vPa.H) / tpa.ja / Qsa.k)), (float)JPa.N, (float)JPa.N);
            uKa.J((float)FRa.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            xKa_32.J((RA)b2, Fua.ja);
            uKa.D();
            uKa.G((int)SQa.ca);
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.P();
            uKa.I((int)Ira.A);
            uKa.J(vRa.d != 0);
            xKa_32.E.J(WKa.C);
            if (Config.h() && !a2.L) {
                tA.f();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(RA rA2, int n2, Mda mda2) {
        void a2;
        void c2;
        int n3;
        int n4;
        int d2 = n2;
        xKa_3 b2 = this;
        if (k) {
            d2 = d2 == Fua.ja ? jI.J(d2, (float)jI.J(I) / NQa.Y) : jI.J(d2, I);
        }
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        boolean bl2 = Kpa.J().J().J();
        int n5 = n4 = Config.y() && bl2 ? vRa.d : uSa.E;
        if (n4 != 0) {
            aKa2.J(ez.SOLID);
        }
        aKa2.J(XTa.W, mka.L);
        DZ[] dZArray = DZ.VALUES;
        int n6 = DZ.VALUES.length;
        int n7 = n3 = uSa.E;
        while (n7 < n6) {
            DZ dZ2 = dZArray[n3];
            b2.J(aKa2, c2.J(dZ2), d2, (Mda)a2);
            n7 = ++n3;
        }
        b2.J(aKa2, c2.J(), d2, (Mda)a2);
        pKa2.J();
        if (n4 != 0) {
            aKa2.J((ez)null);
            uKa.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, RA rA2, Xja xja2) {
        void a2;
        ItemCameraTransforms itemCameraTransforms;
        void c2;
        void b2;
        xKa_3 xKa_32 = this;
        Object d2 = cJ.J((RA)b2);
        if (d2 == null) {
            d2 = WKa.C;
        }
        xKa_3 xKa_33 = xKa_32;
        xKa_33.E.J((ResourceLocation)d2);
        xKa_33.E.J((ResourceLocation)d2).J(uSa.E != 0, uSa.E != 0);
        xKa_33.J((Mda)c2);
        uKa.o();
        uKa.J((int)jRa.m, (float)Nra.e);
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.e();
        ItemCameraTransforms itemCameraTransforms2 = itemCameraTransforms = b2.J();
        itemCameraTransforms2.J((Xja)a2);
        if (xKa_32.J(itemCameraTransforms2.J((Xja)a2))) {
            uKa.M((int)Yua.O);
        }
        xKa_3 xKa_34 = xKa_32;
        xKa_34.J((Mda)c2, (RA)b2);
        uKa.M((int)Zra.W);
        uKa.D();
        uKa.E();
        uKa.k();
        xKa_34.E.J((ResourceLocation)d2);
        xKa_34.E.J((ResourceLocation)d2).J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2, int n3, iJa iJa2) {
        xKa_3 xKa_32;
        void a2;
        void b2;
        void c2;
        void d2;
        xKa_3 xKa_33 = this;
        xKa_33.L = vRa.d;
        RA rA2 = xKa_33.j.J((Mda)d2);
        uKa.e();
        Object e2 = cJ.J((RA)rA2);
        if (e2 == null) {
            e2 = WKa.C;
        }
        xKa_3 xKa_34 = xKa_33;
        xKa_34.E.J((ResourceLocation)e2);
        xKa_34.E.J((ResourceLocation)e2).J(uSa.E != 0, uSa.E != 0);
        uKa.o();
        uKa.K();
        uKa.J((int)jRa.m, (float)Nra.e);
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        xKa_33.J((int)c2, (int)b2, rA2.l());
        if (a2 != null) {
            xKa_32 = xKa_33;
            a2.J();
        } else {
            rA2.J().J(Xja.GUI);
            xKa_32 = xKa_33;
        }
        xKa_32.J((Mda)d2, rA2);
        uKa.c();
        uKa.E();
        uKa.L();
        uKa.D();
        xKa_3 xKa_35 = xKa_33;
        xKa_35.E.J((ResourceLocation)e2);
        xKa_35.E.J((ResourceLocation)e2).J();
        xKa_35.L = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Xja xja2) {
        xKa_3 c2 = mda2;
        xKa_3 b2 = this;
        if (c2 != null) {
            void a2;
            xKa_3 xKa_32 = b2;
            RA rA2 = xKa_32.j.J((Mda)c2);
            xKa_32.J((Mda)c2, rA2, (Xja)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        void f2;
        void e2;
        void j2;
        void b2;
        void c2;
        void d2;
        void g2;
        void h2;
        void i2;
        int n10 = n9;
        xKa_3 a2 = this;
        void v0 = i2;
        void v1 = h2;
        void v2 = i2;
        v2.J(XTa.W, mka.I);
        v2.J((double)(h2 + uSa.E), (double)(g2 + uSa.E), aSa.V).J((int)d2, (int)c2, (int)b2, (int)j2).M();
        i2.J((double)(v1 + uSa.E), (double)(g2 + e2), aSa.V).J((int)d2, (int)c2, (int)b2, (int)j2).M();
        v0.J((double)(v1 + f2), (double)(g2 + e2), aSa.V).J((int)d2, (int)c2, (int)b2, (int)j2).M();
        v0.J((double)(h2 + f2), (double)(g2 + uSa.E), aSa.V).J((int)d2, (int)c2, (int)b2, (int)j2).M();
        pKa.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, int n2, String string) {
        void b2;
        void c2;
        String d2 = string;
        xKa_3 a2 = this;
        a2.j.J((eAa)c2, (int)b2, new ModelResourceLocation(d2, ZOa.F));
    }

    public void J(U u2) {
        xKa_3 b2 = u2;
        xKa_3 a2 = this;
        a2.j.J();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, boolean bl2) {
        void b2;
        void c2;
        boolean d2 = bl2;
        xKa_3 a2 = this;
        uKa.J((float)((float)c2), (float)((float)b2), (float)(QTa.G + a2.m));
        uKa.J((float)Qsa.k, (float)Qsa.k, (float)JPa.N);
        uKa.l((float)pqa.r, (float)pqa.r, (float)vqa.T);
        uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
        if (d2) {
            uKa.l((float)ZRa.l, (float)ZRa.l, (float)ZRa.l);
            uKa.J((float)mPa.o, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)opa.z, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.P();
            return;
        }
        uKa.l((float)EPa.r, (float)EPa.r, (float)EPa.r);
        uKa.J((float)Hra.Ga, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.L();
    }

    /*
     * WARNING - void declaration
     */
    private void J(eAa eAa2, String string) {
        void b2;
        String c2 = string;
        xKa_3 a2 = this;
        a2.J((eAa)b2, uSa.E, c2);
    }
}

