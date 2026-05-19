/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ACa
 *  Aea
 *  Ata
 *  BDa
 *  BEa
 *  BRa
 *  Bga
 *  Bpa
 *  Bsa
 *  Cra
 *  DCa
 *  DQa
 *  Dea
 *  EEa
 *  EQa
 *  ERa
 *  Efa
 *  Epa
 *  Ey
 *  FEa
 *  FPa
 *  FTa
 *  Fpa
 *  Gg
 *  Gl
 *  Gua
 *  HBa
 *  Hda
 *  ISa
 *  JCa
 *  JPa
 *  JQa
 *  JSa
 *  JTa
 *  Jfa
 *  KEa
 *  Kfa
 *  LQa
 *  Lqa
 *  Lz
 *  MCa
 *  MQa
 *  Mda
 *  NAa
 *  NOa
 *  NPa
 *  NQa
 *  NTa
 *  Nfa
 *  Oz
 *  PFa
 *  PTa
 *  Pba
 *  Pfa
 *  Ppa
 *  Pqa
 *  QDa
 *  QFa
 *  QSa
 *  Qda
 *  Qqa
 *  Qsa
 *  Qta
 *  RPa
 *  RQa
 *  Rda
 *  Rfa
 *  Rua
 *  SEa
 *  SOa
 *  SQa
 *  SRa
 *  Sfa
 *  Spa
 *  Sqa
 *  Ssa
 *  TPa
 *  Tfa
 *  Tpa
 *  URa
 *  Uaa
 *  Uqa
 *  Usa
 *  Uta
 *  VEa
 *  VFa
 *  VQa
 *  Vda
 *  Vua
 *  WFa
 *  WQa
 *  WSa
 *  Waa
 *  Wfa
 *  Wsa
 *  XFa
 *  XTa
 *  Xca
 *  Xda
 *  Xfa
 *  Xsa
 *  YSa
 *  Yba
 *  Ypa
 *  Yra
 *  ZOa
 *  ZRa
 *  ZX
 *  Zba
 *  Zpa
 *  Zta
 *  Zua
 *  aCa
 *  aPa
 *  aQa
 *  aSa
 *  aqa
 *  asa
 *  bDa
 *  bRa
 *  bSa
 *  bfa
 *  bpa
 *  bqa
 *  bua
 *  cFa
 *  cQa
 *  cRa
 *  cea
 *  cra
 *  dQa
 *  eAa
 *  eCa
 *  eDa
 *  eea
 *  efa
 *  fTa
 *  ffa
 *  fpa
 *  fsa
 *  gIa
 *  gca
 *  gga
 *  hTa
 *  hqa
 *  hra
 *  iFa
 *  iPa
 *  ifa
 *  isa
 *  jRa
 *  jpa
 *  jsa
 *  kAa
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  lCa
 *  lPa
 *  lca
 *  lqa
 *  mra
 *  nDa
 *  nQa
 *  ofa
 *  oqa
 *  pFa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  qCa
 *  qFa
 *  qta
 *  sfa
 *  tFa
 *  uOa
 *  uQa
 *  ura
 *  vCa
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  vda
 *  vpa
 *  wOa
 *  wPa
 *  wda
 *  wra
 *  xAa
 *  xOa
 *  xea
 *  yQa
 *  ysa
 *  zFa
 *  zTa
 *  zsa
 */
import com.google.common.base.Function;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomSlab$Half;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.CustomBlock$CustomBlockTool;
import net.minecraft.block.CustomBlock$CustomBlockType;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eAa_3 {
    private yGa g;
    public static final UUID L;
    public boolean E;
    private String m;
    public static final ZX<ResourceLocation, eAa> C;
    public int i = ysa.s;
    public static Random M;
    private int k;
    public boolean j;
    private static final Map<Block, eAa> J;
    private eAa A;
    private String I;

    public boolean J(Block block) {
        Block b2 = block;
        eAa_3 a2 = this;
        return uSa.E != 0;
    }

    public boolean i() {
        eAa_3 a2;
        return a2.j;
    }

    public boolean l(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        return b2.J();
    }

    public static eAa l(int a2) {
        return (eAa_3)C.J(a2);
    }

    public static eAa J(Block a2) {
        return (eAa_3)J.get(a2);
    }

    public boolean M() {
        eAa_3 a2;
        return a2.E;
    }

    public Mda f(Mda mda2, Gg gg2, Sx sx2) {
        eAa_3 d2 = mda2;
        eAa_3 c2 = this;
        return d2;
    }

    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        float f5 = f4;
        eAa_3 a2 = this;
        return uSa.E != 0;
    }

    public boolean f(Mda mda2) {
        eAa_3 a2 = this;
        eAa_3 b2 = mda2;
        if (a2.J((Mda)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eAa f(int n2) {
        int b2 = n2;
        eAa_3 a2 = this;
        a2.k = b2;
        return a2;
    }

    public boolean e() {
        return uSa.E != 0;
    }

    public static int J(eAa a2) {
        if (a2 == null) {
            return uSa.E;
        }
        return C.J((Object)a2);
    }

    /*
     * WARNING - void declaration
     */
    public RY J(Gg gg2, Sx sx2, boolean bl2) {
        void c2;
        void a2;
        Lz b2;
        eAa_3 eAa_32 = this;
        void v0 = b2;
        int n2 = v0.d;
        int d2 = v0.X;
        double d3 = v0.la;
        float f2 = v0.Z + (double)b2.l();
        float f3 = v0.A;
        b2 = new Lz(d3, (double)f2, (double)f3);
        float f4 = Oz.C((float)(-d2 * Bua.ga - pua.j));
        d2 = (int)Oz.d((float)(-d2 * Bua.ga - pua.j));
        float f5 = -Oz.C((float)(-n2 * Bua.ga));
        n2 = (int)Oz.d((float)(-n2 * Bua.ga));
        float f6 = f4 * f5;
        d3 = DQa.S;
        Lz lz2 = b2.f((double)(d2 *= f5) * d3, (double)n2 * d3, (double)f6 * d3);
        void v1 = a2;
        return c2.J(b2, lz2, (boolean)v1, (v1 == false ? vRa.d : uSa.E) != 0, uSa.E != 0);
    }

    public eAa f() {
        eAa_3 a2;
        return a2.A;
    }

    private static void J(Block a2) {
        Block block = a2;
        Block block2 = a2;
        eAa_3.J(block2, new kda(block2));
    }

    public boolean J(Mda mda2, Mda mda3) {
        eAa_3 c2 = mda3;
        eAa_3 a2 = this;
        return uSa.E != 0;
    }

    public boolean d() {
        return uSa.E != 0;
    }

    public String C(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        return new StringBuilder().insert(2 & 5, zpa.a).append(a2.m).toString();
    }

    public oda J(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        if (b2.J()) {
            return oda.RARE;
        }
        return oda.COMMON;
    }

    public String l(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        return new StringBuilder().insert(5 >> 3, Mqa.y).append(Ey.f((String)new StringBuilder().insert(2 & 5, a2.f((Mda)b2)).append(tpa.N).toString())).toString().trim();
    }

    public boolean C() {
        eAa_3 a2;
        if (a2.k > 0 && !a2.E) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(Mda mda2, Sx sx2, Gl gl2) {
        eAa_3 d2 = gl2;
        eAa_3 a2 = this;
        return uSa.E != 0;
    }

    public eAa J(yGa yGa2) {
        yGa b2 = yGa2;
        eAa_3 a2 = this;
        a2.g = b2;
        return a2;
    }

    public boolean l() {
        return uSa.E != 0;
    }

    public Multimap<String, CEa> J() {
        return HashMultimap.create();
    }

    public eAa J() {
        eAa_3 a2;
        a2.j = vRa.d;
        return a2;
    }

    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        eAa_3 d2 = mda2;
        eAa_3 c2 = this;
        return d2;
    }

    public boolean J(Waa waa2) {
        eAa_3 b2 = waa2;
        eAa_3 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        eAa_3 a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
    }

    public eAa J(eAa eAa2) {
        eAa_3 b2 = eAa2;
        eAa_3 a2 = this;
        a2.A = b2;
        return a2;
    }

    public String J() {
        eAa_3 a2;
        return new StringBuilder().insert(2 & 5, zpa.a).append(a2.m).toString();
    }

    public static eAa l(String string) {
        String string2 = string;
        eAa_3 a2 = (eAa_3)C.J((Object)new ResourceLocation(string2));
        if (a2 == null) {
            try {
                return eAa_3.l(Integer.parseInt(string2));
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return a2;
    }

    public int l() {
        eAa_3 a2;
        return a2.k;
    }

    public yGa J() {
        eAa_3 a2;
        return a2.g;
    }

    public boolean J(Mda mda2, Gg gg2, Block block, XF xF2, Gl gl2) {
        eAa_3 eAa_32 = eAa_33;
        eAa_3 eAa_33 = gl2;
        eAa_3 a2 = eAa_32;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, String string, eAa eAa2) {
        void b2;
        eAa c2 = eAa2;
        int a2 = n2;
        eAa_3.J(a2, new ResourceLocation((String)b2), c2);
    }

    public eAa f(String string) {
        String b2 = string;
        eAa_3 a2 = this;
        a2.m = b2;
        return a2;
    }

    public eAa J(boolean bl2) {
        boolean b2 = bl2;
        eAa_3 a2 = this;
        a2.E = b2;
        return a2;
    }

    public boolean J(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        if (a2.f() == vRa.d && a2.C()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        eAa_3 a2;
        return a2.i;
    }

    public int J() {
        return uSa.E;
    }

    public void J(Mda mda2, Gg gg2, vL vL2, int n2, boolean bl2) {
        boolean bl3 = bl2;
        eAa_3 a2 = this;
    }

    public boolean J(Mda mda2, Gl gl2, Gl gl3) {
        eAa_3 d2 = gl3;
        eAa_3 a2 = this;
        return uSa.E != 0;
    }

    public int J(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        return uSa.E;
    }

    public eAa J(String string) {
        String b2 = string;
        eAa_3 a2 = this;
        a2.I = b2;
        return a2;
    }

    public int J(Mda mda2, int n2) {
        int c2 = n2;
        eAa_3 a2 = this;
        return Wsa.K;
    }

    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl2) {
        boolean bl3 = bl2;
        eAa_3 a2 = this;
    }

    public void J(Mda mda2, Gg gg2, Sx sx2, int n2) {
        int n3 = n2;
        eAa_3 a2 = this;
    }

    public void J(Mda mda2, Gg gg2, Sx object) {
        Object d2 = object;
        object = this;
    }

    public YFa J(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        return YFa.NONE;
    }

    public String f(Mda mda2) {
        Object b2 = mda2;
        Object a2 = this;
        if ((b2 = ((eAa_3)a2).C((Mda)b2)) == null) {
            return Mqa.y;
        }
        return Ey.f((String)b2);
    }

    public boolean f() {
        eAa_3 a2;
        if (a2.A != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public String J(Mda mda2) {
        eAa_3 b2 = mda2;
        eAa_3 a2 = this;
        return a2.I;
    }

    public int J(int n2) {
        int b2 = n2;
        eAa_3 a2 = this;
        return uSa.E;
    }

    public eAa J(int n2) {
        int b2 = n2;
        eAa_3 a2 = this;
        a2.i = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, ResourceLocation resourceLocation, eAa eAa2) {
        void b2;
        eAa c2 = eAa2;
        int a2 = n2;
        C.J(a2, (Object)b2, (Object)c2);
    }

    public static void J() {
        eAa_3.J(QFa.Gd, new ffa(QFa.Gd, QFa.Gd, (Function)new gga()).J(fpa.F));
        eAa_3.J(QFa.lf, (eAa)new qCa((Block)QFa.lf, uSa.E != 0));
        eAa_3.J(QFa.Bc, new ffa(QFa.Bc, QFa.Bc, (Function)new iFa()).J(aSa.P));
        eAa_3.J(QFa.yB);
        eAa_3.J(QFa.L, new ffa(QFa.L, QFa.L, (Function)new Qda()).J(yRa.Ja));
        eAa_3.J(QFa.Y, new ffa(QFa.Y, QFa.Y, (Function)new qFa()).J(uQa.Z));
        eAa_3.J(QFa.bg);
        eAa_3.J(QFa.R, new ffa((Block)QFa.R, (Block)QFa.R, (Function)new cFa()).J(dqa.la));
        eAa_3.J(QFa.Q);
        eAa_3.J(QFa.zE);
        eAa_3.J(QFa.b, new wDa(QFa.b, QFa.b, (Function)new Kfa()).J(Era.Ia));
        eAa_3.J(QFa.Za);
        eAa_3.J(QFa.UA, new ffa(QFa.UA, QFa.UA, (Function)new EEa()).J(MQa.T));
        eAa_3.J(QFa.hf, new ffa(QFa.hf, QFa.hf, (Function)new SEa()).J(MQa.T));
        eAa_3.J(QFa.nE, new ffa(QFa.nE, QFa.nE, (Function)new rFa()).J(MQa.T));
        eAa_3.J(QFa.vd, new MCa(QFa.vd).J(Fsa.Ja));
        eAa_3.J(QFa.Z, new MCa(QFa.Z).J(Fsa.Ja));
        eAa_3.J(QFa.ba, new ffa(QFa.ba, QFa.ba, (Function)new Bga()).J(uqa.ga));
        eAa_3.J(QFa.ye);
        eAa_3.J(QFa.xC);
        eAa_3.J(QFa.qA);
        eAa_3.J(QFa.EA);
        eAa_3.J(QFa.qC, new ffa(QFa.qC, QFa.qC, (Function)new Rfa()).J(Gua.Ga));
        eAa_3.J(QFa.ea);
        eAa_3.J(QFa.JC);
        eAa_3.J(QFa.g);
        eAa_3.J(QFa.bF, (eAa)new aCa((Block)QFa.bF));
        eAa_3.J(QFa.A);
        String[] stringArray = new String[Ypa.A];
        stringArray[uSa.E] = jpa.p;
        stringArray[vRa.d] = Xsa.J;
        stringArray[uqa.g] = kua.ga;
        stringArray[yRa.d] = eua.o;
        stringArray[AQa.P] = nqa.y;
        stringArray[tTa.h] = lQa.M;
        stringArray[uua.p] = SPa.Z;
        stringArray[XTa.W] = pPa.n;
        stringArray[Yqa.i] = yOa.R;
        stringArray[WOa.fa] = cRa.T;
        stringArray[NTa.C] = Lsa.W;
        stringArray[pPa.f] = Qqa.W;
        stringArray[lqa.s] = Ata.k;
        stringArray[uua.s] = NOa.E;
        stringArray[hpa.Z] = Iqa.Y;
        eAa_3.J(QFa.y, (eAa)new qCa((Block)QFa.y, vRa.d != 0).J(stringArray));
        eAa_3.J(QFa.BB);
        eAa_3.J(QFa.Nc, (eAa)new aCa((Block)QFa.Nc));
        eAa_3.J(QFa.cd, new nDa(QFa.cd).J(Xpa.r));
        eAa_3.J(QFa.zc, new ffa((Block)QFa.zc, (Block)QFa.zc, (Function)new pFa()).J(hpa.Ha));
        eAa_3.J(QFa.l, new ffa((Block)QFa.l, (Block)QFa.l, (Function)new Nfa()).J(NSa.t));
        eAa_3.J(QFa.vc);
        eAa_3.J(QFa.TC);
        eAa_3.J(QFa.WC);
        eAa_3.J(QFa.eB);
        eAa_3.J(QFa.Ib, new eCa((Block)QFa.Ib, QFa.Ib, QFa.Rd).J(QTa.ba));
        eAa_3.J(QFa.V);
        eAa_3.J(QFa.Lc);
        eAa_3.J(QFa.gA);
        eAa_3.J(QFa.h);
        eAa_3.J(QFa.X);
        eAa_3.J(QFa.FB);
        eAa_3.J(QFa.P);
        eAa_3.J(QFa.WA);
        eAa_3.J(QFa.dC);
        eAa_3.J(QFa.Ic);
        eAa_3.J(QFa.ca);
        eAa_3.J(QFa.IE);
        eAa_3.J(QFa.rd);
        eAa_3.J(QFa.Xb);
        eAa_3.J(QFa.CB);
        eAa_3.J(QFa.z);
        eAa_3.J(QFa.SA);
        eAa_3.J(QFa.We);
        eAa_3.J(QFa.ib);
        eAa_3.J(QFa.BC);
        eAa_3.J(QFa.Te);
        eAa_3.J(QFa.M);
        eAa_3.J(QFa.Ja);
        eAa_3.J(QFa.Hd);
        eAa_3.J(QFa.gC, (eAa)new ACa(QFa.gC));
        eAa_3.J(QFa.Ta);
        eAa_3.J(QFa.mb);
        eAa_3.J(QFa.dd);
        eAa_3.J(QFa.pd);
        eAa_3.J(QFa.nB);
        eAa_3.J(QFa.U);
        eAa_3.J(QFa.Qb);
        eAa_3.J(QFa.OA);
        eAa_3.J(QFa.md);
        eAa_3.J(QFa.Fc);
        eAa_3.J(QFa.IF);
        eAa_3.J(QFa.s);
        eAa_3.J(QFa.GA);
        eAa_3.J(QFa.VC);
        eAa_3.J(QFa.rc);
        eAa_3.J(QFa.NC);
        eAa_3.J(QFa.D);
        eAa_3.J(QFa.Od, new ffa(QFa.Od, QFa.Od, (Function)new Sfa()).J(ITa.X));
        eAa_3.J(QFa.v, new ffa(QFa.v, QFa.v, (Function)new dea()).J(Qsa.O));
        eAa_3.J(QFa.ma);
        eAa_3.J(QFa.BF);
        eAa_3.J(QFa.u);
        eAa_3.J(QFa.JB);
        eAa_3.J(QFa.HC);
        eAa_3.J(QFa.vC, (eAa)new qCa(QFa.vC, uSa.E != 0));
        eAa_3.J(QFa.Ad);
        eAa_3.J(QFa.yA);
        eAa_3.J(QFa.hb);
        eAa_3.J(QFa.tC);
        eAa_3.J(QFa.na);
        eAa_3.J(QFa.Cb);
        eAa_3.J(QFa.k);
        eAa_3.J(QFa.E);
        eAa_3.J(QFa.uB);
        eAa_3.J(QFa.pB, (eAa)new lCa(QFa.pB));
        eAa_3.J(QFa.Cf);
        eAa_3.J(QFa.iC);
        eAa_3.J(QFa.qB);
        eAa_3.J(QFa.rC);
        eAa_3.J(QFa.jE);
        eAa_3.J(QFa.hd);
        eAa_3.J(QFa.Zb);
        eAa_3.J(QFa.nA);
        eAa_3.J(QFa.eb, new eCa((Block)QFa.eb, QFa.eb, QFa.EC).J(PTa.c));
        eAa_3.J(QFa.oa);
        eAa_3.J(QFa.c);
        eAa_3.J(QFa.ta);
        eAa_3.J(QFa.r);
        eAa_3.J(QFa.Ab);
        eAa_3.J(QFa.Uc);
        eAa_3.J(QFa.ef);
        eAa_3.J(QFa.IB);
        eAa_3.J(QFa.Ac);
        eAa_3.J(QFa.jC);
        eAa_3.J(QFa.hc, new ffa(QFa.hc, QFa.hc, (Function)new eea()).J(iPa.o));
        eAa_3.J(QFa.uC);
        eAa_3.J(QFa.Sb, new Xfa(QFa.Sb).J(Ypa.G));
        eAa_3.J(QFa.TF);
        eAa_3.J(QFa.pc);
        eAa_3.J(QFa.n);
        eAa_3.J(QFa.Bd);
        eAa_3.J(QFa.Rc);
        eAa_3.J(QFa.Lb);
        eAa_3.J(QFa.la);
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = BQa.la;
        stringArray2[vRa.d] = Jpa.w;
        stringArray2[uqa.g] = QTa.Z;
        eAa_3.J(QFa.YA, new ffa(QFa.YA, QFa.YA, stringArray2).J(JTa.e));
        eAa_3.J(QFa.LC);
        eAa_3.J(QFa.gc);
        eAa_3.J(QFa.vb);
        eAa_3.J(QFa.za, new nDa(QFa.za).J(xOa.U));
        eAa_3.J(QFa.fE);
        eAa_3.J(QFa.Ob);
        eAa_3.J(QFa.uA);
        eAa_3.J(QFa.XE, new nDa(QFa.XE).J(Qqa.Aa));
        eAa_3.J(QFa.MB);
        eAa_3.J(QFa.Ea);
        eAa_3.J(QFa.C);
        eAa_3.J(QFa.HE);
        eAa_3.J(QFa.LA);
        eAa_3.J(QFa.iA);
        eAa_3.J(QFa.Ia, new Xda((Block)QFa.Ia, (Block)QFa.Ia, (Function)new pfa()).J(Ssa.v));
        eAa_3.J(QFa.VA, new nDa((Block)QFa.VA).J(dqa.U));
        eAa_3.J(QFa.KC, new nDa((Block)QFa.KC).J(uSa.Ha));
        eAa_3.J(QFa.xd, new ffa(QFa.xd, QFa.xd, (Function)new zFa()).J(Era.X));
        eAa_3.J(QFa.NA);
        eAa_3.J(QFa.ec, new ffa(QFa.ec, QFa.ec, (Function)new bfa()).J(pPa.Ma));
        eAa_3.J(QFa.eC);
        eAa_3.J(QFa.F, new eCa((Block)QFa.F, QFa.F, QFa.wC).J(ISa.Ka));
        eAa_3.J(QFa.Jd);
        eAa_3.J(QFa.bD);
        eAa_3.J(QFa.ja);
        eAa_3.J(QFa.Wf, new eCa((Block)QFa.Wf, QFa.Wf, QFa.bc).J(fTa.C));
        eAa_3.J(QFa.H);
        eAa_3.J(QFa.hB);
        eAa_3.J(QFa.Fb);
        eAa_3.J(QFa.Da);
        eAa_3.J(QFa.xb);
        eAa_3.J(QFa.fB, new nDa(QFa.fB).J(nqa.m));
        eAa_3.J(QFa.ZA, new nDa(QFa.ZA).J(WOa.d));
        eAa_3.J(QFa.IC);
        eAa_3.J(QFa.RA);
        eAa_3.J(QFa.Yb);
        eAa_3.J(QFa.Vc);
        eAa_3.J(QFa.zd, new ffa(QFa.zd, QFa.zd, (Function)new dDa()).J(vsa.m));
        eAa_3.J(QFa.Hc, new ffa(QFa.Hc, QFa.Hc, (Function)new BDa()).J(vsa.m));
        eAa_3.J(QFa.Nf, new ffa(QFa.Nf, QFa.Nf, (Function)new Pfa()).J(vsa.m));
        eAa_3.J(QFa.Ka);
        eAa_3.J(QFa.gg);
        eAa_3.J(QFa.BA);
        eAa_3.J(QFa.jb);
        eAa_3.J(QFa.GC);
        eAa_3.J(QFa.Dd);
        eAa_3.J(QFa.lC);
        eAa_3.J(QFa.DC);
        eAa_3.J(QFa.Kg, new ffa(QFa.Kg, QFa.Kg, (Function)new Dea()).J(Vua.d));
        eAa_3.J(QFa.mB);
        eAa_3.J(QFa.db);
        eAa_3.J(QFa.oB);
        eAa_3.J(QFa.q);
        eAa_3.J(QFa.Yc);
        eAa_3.J(QFa.sC);
        eAa_3.J(QFa.tA, new ffa(QFa.tA, QFa.tA, (Function)new yea()).J(Era.L));
        eAa_3.J(QFa.iB, (eAa)new bDa(QFa.iB, uSa.E));
        eAa_3.J(QFa.kB, (eAa)new bDa(QFa.kB, AQa.P));
        eAa_3.J(QFa.lE, (eAa)new bDa(QFa.lE, Yqa.i));
        eAa_3.J(QFa.lc, (eAa)new bDa(QFa.lc, lqa.s));
        eAa_3.J(QFa.wa);
        eAa_3.J(QFa.cb);
        eAa_3.J(QFa.J);
        eAa_3.J(QFa.od);
        eAa_3.J(QFa.yb);
        eAa_3.J(QFa.gB, new eCa((Block)QFa.gB, QFa.gB, QFa.Sa).J(FTa.D));
        eAa_3.J(QFa.he);
        eAa_3.J(QFa.bA);
        eAa_3.J(QFa.Wa, new eCa((Block)QFa.Wa, QFa.Wa, QFa.SC).J(yRa.ja));
        eAa_3.J(QFa.HA);
        eAa_3.J(QFa.JA, new eCa((Block)QFa.JA, QFa.JA, QFa.Ff).J(Psa.O));
        eAa_3.J(QFa.nc);
        eAa_3.J(QFa.Fd);
        eAa_3.J(QFa.kA);
        eAa_3.J(QFa.fd);
        eAa_3.J(QFa.DA);
        eAa_3.J(QFa.OC);
        eAa_3.J(QFa.fc);
        eAa_3.J(QFa.Bf);
        eAa_3.J(QFa.S);
        eAa_3.J(QFa.YB);
        eAa_3.J(QFa.XC);
        eAa_3.J(QFa.XB);
        eAa_3.J(QFa.G);
        eAa_3.J(QFa.gb);
        eAa_3.J(QFa.Bb);
        eAa_3.J(QFa.W);
        eAa_3.J(QFa.OB);
        eAa_3.J(QFa.XA);
        eAa_3.J(QFa.Ba);
        eAa_3.J(QFa.QA);
        eAa_3.J(QFa.qF);
        eAa_3.J(QFa.QC, new eCa((Block)QFa.QC, QFa.QC, QFa.EB).J(RPa.b));
        eAa_3.J(QFa.lB, new eCa((Block)QFa.lB, QFa.lB, QFa.DB).J(Mqa.X));
        eAa_3.J(QFa.lb, new eCa((Block)QFa.lb, QFa.lb, QFa.yC).J(fta.v));
        eAa_3.J(QFa.CA, new eCa((Block)QFa.CA, QFa.CA, QFa.MC).J(cPa.P));
        eAa_3.J(QFa.PC);
        eAa_3.J(QFa.Pc);
        eAa_3.J(QFa.RC);
        eAa_3.J(QFa.zC);
        eAa_3.J(QFa.MA);
        eAa_3.J(QFa.KB);
        eAa_3.J(QFa.Kc);
        eAa_3.J(QFa.NB);
        eAa_3.J(QFa.I);
        eAa_3.J(QFa.BD);
        eAa_3.J(QFa.iD);
        eAa_3.J(QFa.Eb);
        eAa_3.J(QFa.pA, new eCa((Block)QFa.pA, QFa.pA, QFa.aB).J(ypa.v));
        eAa_3.J(QFa.wB, new eCa((Block)QFa.wB, QFa.wB, QFa.VB).J(Gta.l));
        eAa_3.J(QFa.eA, new eCa((Block)QFa.eA, QFa.eA, QFa.WE).J(aua.S));
        eAa_3.J(QFa.id, new eCa((Block)QFa.id, QFa.id, QFa.O).J(TPa.E));
        eAa_3.J(QFa.bd);
        eAa_3.J(QFa.hg);
        eAa_3.J(QFa.qb);
        eAa_3.J(QFa.Jc);
        eAa_3.J(QFa.Oa);
        eAa_3.J(QFa.de);
        eAa_3.J(QFa.ZC);
        eAa_3.J(QFa.sf);
        eAa_3.J(QFa.sb);
        eAa_3.J(QFa.N);
        eAa_3.J(QFa.d);
        eAa_3.J(QFa.Ha);
        eAa_3.J(QFa.zb, new eCa((Block)QFa.zb, QFa.zb, QFa.e).J(fpa.Ja));
        eAa_3.J(QFa.Wd);
        eAa_3.J(QFa.Ef);
        eAa_3.J(QFa.hC, new eCa((Block)QFa.hC, QFa.hC, QFa.ed).J(kqa.e));
        eAa_3.J(QFa.B);
        eAa_3.J(QFa.cF);
        eAa_3.J(QFa.mf);
        eAa_3.J(QFa.sd, new eCa((Block)QFa.sd, QFa.sd, QFa.HB).J(ura.T));
        eAa_3.J(QFa.Ld);
        eAa_3.J(QFa.fC);
        eAa_3.J(QFa.ga);
        eAa_3.J(QFa.KA);
        eAa_3.J(QFa.UC, new eCa((Block)QFa.UC, QFa.UC, QFa.La).J(Spa.j));
        eAa_3.J(QFa.KE);
        eAa_3.J(QFa.Tc);
        eAa_3.J(QFa.qc, new eCa((Block)QFa.qc, QFa.qc, QFa.AB).J(osa.F));
        eAa_3.J(QFa.tc);
        eAa_3.J(QFa.Ra);
        eAa_3.J(QFa.Ya, new eCa((Block)QFa.Ya, QFa.Ya, QFa.tb).J(Fsa.t));
        eAa_3.J(QFa.Xa);
        eAa_3.J(QFa.wc, new eCa((Block)QFa.wc, QFa.wc, QFa.qa).J(Ppa.m));
        eAa_3.J(QFa.GF);
        eAa_3.J(QFa.Zc);
        eAa_3.J(QFa.vB);
        eAa_3.J(QFa.Dc);
        eAa_3.J(QFa.hD);
        eAa_3.J(QFa.VE);
        eAa_3.J(QFa.Ua);
        eAa_3.J(QFa.ad);
        eAa_3.J(QFa.Df);
        eAa_3.J(QFa.mD);
        eAa_3.J(QFa.SF);
        eAa_3.J(QFa.eD);
        eAa_3.J(QFa.K);
        eAa_3.J(QFa.FC);
        eAa_3.J(QFa.Yf);
        eAa_3.J(QFa.jB);
        eAa_3.J(QFa.SB);
        eAa_3.J(QFa.Ca);
        eAa_3.J(QFa.aA);
        eAa_3.J(QFa.ab);
        eAa_3.J(QFa.LB);
        eAa_3.J(QFa.uc);
        eAa_3.J(QFa.va);
        eAa_3.J(QFa.cA);
        eAa_3.J(QFa.ia);
        eAa_3.J(QFa.nC);
        eAa_3.J(QFa.Pa);
        eAa_3.J(QFa.Mg);
        eAa_3.J(QFa.bC);
        eAa_3.J(QFa.lA, new eCa((Block)QFa.lA, QFa.lA, QFa.ld).J(Jpa.Ia));
        eAa_3.J(QFa.rA);
        eAa_3.J(QFa.nd);
        eAa_3.J(QFa.Cc);
        eAa_3.J(QFa.aa);
        eAa_3.J(QFa.Sd);
        eAa_3.J(QFa.ya);
        eAa_3.J(QFa.xa);
        eAa_3.J(QFa.zf);
        eAa_3.J(QFa.jc);
        eAa_3.J(QFa.Pb);
        eAa_3.J(QFa.fa);
        eAa_3.J(QFa.ZD);
        eAa_3.J(QFa.GB);
        eAa_3.J(QFa.m);
        eAa_3.J(QFa.FA);
        eAa_3.J(QFa.wA);
        eAa_3.J(QFa.o);
        eAa_3.J(QFa.dA);
        eAa_3.J(QFa.dB);
        eAa_3.J(QFa.Gc);
        eAa_3.J(QFa.qd);
        eAa_3.J(QFa.PE);
        eAa_3.J(QFa.TD);
        eAa_3.J(QFa.sa);
        eAa_3.J(QFa.Gb);
        eAa_3.J(QFa.Va, new eCa((Block)QFa.Va, QFa.Va, QFa.wb).J(cQa.E));
        eAa_3.J(QFa.ac, new eCa((Block)QFa.ac, QFa.ac, QFa.kb).J(ysa.g));
        eAa_3.J(QFa.YC, new eCa((Block)QFa.YC, QFa.YC, QFa.xB).J(KPa.Ga));
        eAa_3.J(QFa.Se, new eCa((Block)QFa.Se, QFa.Se, QFa.Kd).J(vRa.j));
        eAa_3.J(QFa.xA, new eCa((Block)QFa.xA, QFa.xA, QFa.sB).J(cTa.Ka));
        eAa_3.J(QFa.x, new eCa((Block)QFa.x, QFa.x, QFa.AA).J(MTa.b));
        eAa_3.J(QFa.mC, new eCa((Block)QFa.mC, QFa.mC, QFa.TA).J(pqa.l));
        eAa_3.J(QFa.wE, new eCa((Block)QFa.wE, QFa.wE, QFa.Ma).J(DQa.A));
        eAa_3.J(QFa.Kb, new eCa((Block)QFa.Kb, QFa.Kb, QFa.rb).J(WQa.S));
        eAa_3.J(QFa.Qd, new eCa((Block)QFa.Qd, QFa.Qd, QFa.mA).J(NQa.v));
        eAa_3.J(QFa.Fa, new eCa((Block)QFa.Fa, QFa.Fa, QFa.a).J(Nra.g));
        eAa_3.J(QFa.Wb, new eCa((Block)QFa.Wb, QFa.Wb, QFa.ob).J(rpa.Aa));
        eAa_3.J(QFa.fb);
        eAa_3.J(QFa.Id);
        eAa_3.J(QFa.GD);
        eAa_3.J(QFa.Md);
        eAa_3.J(QFa.Mf);
        eAa_3.J(QFa.TB);
        eAa_3.J(QFa.Vb);
        eAa_3.J(QFa.Cd);
        eAa_3.J(QFa.pC);
        eAa_3.J(QFa.KD);
        eAa_3.J(QFa.kd);
        eAa_3.J(QFa.ra);
        eAa_3.J(QFa.Rb, new eCa((Block)QFa.Rb, QFa.Rb, QFa.bB).J(JQa.t));
        eAa_3.J(QFa.ua, new eCa((Block)QFa.ua, QFa.ua, QFa.aC).J(JPa.S));
        eAa_3.J(QFa.gF, new eCa((Block)QFa.gF, QFa.gF, QFa.j).J(wOa.o));
        eAa_3.J(QFa.RB);
        eAa_3.J(QFa.Ga);
        eAa_3.J(QFa.Mb);
        eAa_3.J(QFa.Tb);
        eAa_3.J(QFa.ub);
        eAa_3.J(QFa.zB);
        eAa_3.J(QFa.AE);
        eAa_3.J(QFa.WD);
        eAa_3.J(QFa.ha);
        eAa_3.J(QFa.Hb);
        eAa_3.J(QFa.PA);
        eAa_3.J(QFa.Wc);
        eAa_3.J(QFa.Ve);
        eAa_3.J(QFa.f);
        eAa_3.J(QFa.ZB);
        eAa_3.J(QFa.Ec);
        eAa_3.J(QFa.tB);
        eAa_3.J(QFa.CC);
        eAa_3.J(QFa.nb);
        eAa_3.J(QFa.cc);
        eAa_3.J(QFa.Qc);
        eAa_3.J(QFa.xc);
        eAa_3.J(QFa.sA);
        eAa_3.J(QFa.dc);
        eAa_3.J(QFa.JD);
        eAa_3.J(QFa.Xc);
        eAa_3.J(QFa.yc);
        eAa_3.J(QFa.rB);
        eAa_3.J(QFa.IA);
        eAa_3.J(QFa.oA);
        Iterator iterator = Block.blockRegistry.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                CustomBlock customBlock;
                CustomBlock customBlock2;
                Block block;
                block6: {
                    block8: {
                        block7: {
                            Object object;
                            String string;
                            CustomBlock$CustomBlockType customBlock$CustomBlockType;
                            block5: {
                                block = (Block)iterator.next();
                                customBlock2 = block.J();
                                if (customBlock2 == null) {
                                    iterator2 = iterator;
                                    continue;
                                }
                                CustomBlock customBlock3 = customBlock2;
                                customBlock$CustomBlockType = customBlock3.J();
                                string = gIa.J((String)customBlock3.J());
                                if (customBlock$CustomBlockType != CustomBlock$CustomBlockType.door) break block5;
                                object = new Efa(block);
                                CustomBlock customBlock4 = customBlock2;
                                object.f(string);
                                customBlock = customBlock4;
                                eAa_3.J(customBlock2.f(), customBlock4.J(), (eAa)object);
                                break block6;
                            }
                            if (customBlock$CustomBlockType != CustomBlock$CustomBlockType.slab) break block7;
                            if (!(block instanceof BlockCustomSlab$Half)) break block8;
                            object = (BlockSlab)Block.blockRegistry.J((ResourceLocation)customBlock2.l());
                            Block block2 = block;
                            Block block3 = block;
                            eAa_3.J(block3, new eCa(block3, (BlockSlab)block, (BlockSlab)object).J(string));
                            customBlock = customBlock2;
                            break block6;
                        }
                        eAa_3.J(block);
                    }
                    customBlock = customBlock2;
                }
                if (customBlock.J() == CustomBlock$CustomBlockTool.axe) {
                    BEa.I.add(block);
                    continue block0;
                }
                if (customBlock2.J() == CustomBlock$CustomBlockTool.pickaxe) {
                    vCa.I.add(block);
                    continue block0;
                }
                if (customBlock2.J() != CustomBlock$CustomBlockTool.shovel) continue block0;
                HBa.I.add(block);
                continue block0;
            }
            break;
        }
        eAa_3.J(hra.Ja, PRa.ca, new HBa(wda.IRON).f(osa.ja));
        eAa_3.J(vPa.S, jsa.x, new vCa(wda.IRON).f(rRa.b));
        eAa_3.J(aQa.K, uQa.K, new BEa(wda.IRON).f(Ira.Da));
        eAa_3.J(eta.g, oQa.V, new NDa().f(lQa.k));
        eAa_3.J(PQa.N, hra.I, new YCa(AQa.P, bpa.K, uSa.E != 0).f(hra.I));
        eAa_3.J(yRa.Ca, rSa.e, new Aea().f(rSa.e));
        eAa_3.J(pPa.fa, Spa.k, new eAa_3().f(Spa.k).J(yGa.m));
        eAa_3.J(aua.m, Zqa.N, new eDa().f(Zqa.N));
        eAa_3.J(UTa.c, nQa.a, new eAa_3().f(nQa.a).J(yGa.E));
        eAa_3.J(FTa.H, wsa.D, new eAa_3().f(ISa.O).J(yGa.E));
        eAa_3.J(ISa.S, nQa.y, new eAa_3().f(JSa.u).J(yGa.E));
        eAa_3.J(rua.E, TPa.fa, new xCa(wda.IRON).f(FTa.T));
        eAa_3.J(KPa.g, ZSa.p, new xCa(wda.WOOD).f(dua.V));
        eAa_3.J(Lsa.Z, NSa.F, new HBa(wda.WOOD).f(Fpa.K));
        eAa_3.J(mSa.F, Fsa.U, new vCa(wda.WOOD).f(Zua.N));
        eAa_3.J(Bsa.P, fpa.ma, new BEa(wda.WOOD).f(PRa.ja));
        eAa_3.J(ATa.M, osa.a, new xCa(wda.STONE).f(uOa.K));
        eAa_3.J(Bsa.z, MTa.I, new HBa(wda.STONE).f(cTa.E));
        eAa_3.J(Uta.H, jpa.b, new vCa(wda.STONE).f(zsa.u));
        eAa_3.J(RPa.f, zta.S, new BEa(wda.STONE).f(wta.t));
        eAa_3.J(Qta.Da, WQa.p, new xCa(wda.EMERALD).f(Pua.y));
        eAa_3.J(Uqa.F, aPa.d, new HBa(wda.EMERALD).f(zua.E));
        eAa_3.J(xra.k, Qta.ja, new vCa(wda.EMERALD).f(Ssa.f));
        eAa_3.J(Bua.J, kta.L, new BEa(wda.EMERALD).f(STa.n));
        eAa_3.J(Zqa.i, BPa.k, new eAa_3().J().f(BPa.k).J(yGa.E));
        eAa_3.J(csa.Q, FPa.C, new eAa_3().f(FPa.C).J(yGa.E));
        eAa_3.J(RQa.x, Qqa.e, new rCa(uua.p).f(cTa.M));
        eAa_3.J(MRa.M, dsa.ca, new xCa(wda.GOLD).f(xra.a));
        eAa_3.J(Rua.m, QSa.o, new HBa(wda.GOLD).f(nOa.B));
        eAa_3.J(aua.fa, POa.Ia, new vCa(wda.GOLD).f(zTa.S));
        eAa_3.J(LQa.Ja, lPa.Ga, new BEa(wda.GOLD).f(FRa.D));
        eAa_3.J(Xsa.y, AQa.r, new Uaa(QFa.Qa).f(AQa.r).J(yGa.E));
        eAa_3.J(fsa.E, vqa.D, new eAa_3().f(vqa.D).J(yGa.E));
        eAa_3.J(Psa.m, bsa.Y, new eAa_3().f(fsa.h).J(ZSa.a).J(yGa.E));
        eAa_3.J(LRa.u, lQa.Aa, new Hea(wda.WOOD).f(RPa.h));
        eAa_3.J(dua.k, EPa.u, new Hea(wda.STONE).f(zta.F));
        eAa_3.J(mSa.ja, FPa.Da, new Hea(wda.IRON).f(Wsa.h));
        eAa_3.J(Ssa.e, iPa.y, new Hea(wda.EMERALD).f(Jta.d));
        eAa_3.J(Qqa.S, Tqa.L, new Hea(wda.GOLD).f(uqa.Ja));
        eAa_3.J(Jpa.n, mPa.fa, new Xca(QFa.Aa, QFa.rd).f(JSa.l));
        eAa_3.J(EQa.T, lqa.y, new eAa_3().f(lqa.y).J(yGa.E));
        eAa_3.J(Eqa.u, gua.b, new YCa(tTa.h, Ora.D, uSa.E != 0).f(gua.b));
        eAa_3.J(yQa.R, mSa.Ja, new VEa(Tfa.LEATHER, uSa.E, uSa.E).f(bRa.u));
        eAa_3.J(isa.s, oua.Aa, new VEa(Tfa.LEATHER, uSa.E, vRa.d).f(asa.r));
        eAa_3.J(vpa.Ja, aQa.h, new VEa(Tfa.LEATHER, uSa.E, uqa.g).f(bRa.D));
        eAa_3.J(Asa.Ia, NPa.F, new VEa(Tfa.LEATHER, uSa.E, yRa.d).f(WPa.Ha));
        eAa_3.J(rRa.I, Jta.j, new VEa(Tfa.CHAIN, vRa.d, uSa.E).f(zTa.c));
        eAa_3.J(BPa.Ja, rta.r, new VEa(Tfa.CHAIN, vRa.d, vRa.d).f(Qsa.T));
        eAa_3.J(JSa.P, Qta.Ga, new VEa(Tfa.CHAIN, vRa.d, uqa.g).f(ySa.D));
        eAa_3.J(Zpa.Q, hQa.t, new VEa(Tfa.CHAIN, vRa.d, yRa.d).f(ROa.m));
        eAa_3.J(POa.C, gua.D, new VEa(Tfa.IRON, uqa.g, uSa.E).f(kqa.z));
        eAa_3.J(Tpa.W, rta.u, new VEa(Tfa.IRON, uqa.g, vRa.d).f(opa.r));
        eAa_3.J(ppa.F, iSa.Ga, new VEa(Tfa.IRON, uqa.g, uqa.g).f(Tqa.a));
        eAa_3.J(nOa.Z, cRa.t, new VEa(Tfa.IRON, uqa.g, yRa.d).f(Lsa.l));
        eAa_3.J(lPa.Ja, QSa.X, new VEa(Tfa.DIAMOND, yRa.d, uSa.E).f(Zta.c));
        eAa_3.J(MQa.i, Psa.C, new VEa(Tfa.DIAMOND, yRa.d, vRa.d).f(zta.L));
        eAa_3.J(csa.T, Fsa.y, new VEa(Tfa.DIAMOND, yRa.d, uqa.g).f(KPa.V));
        eAa_3.J(wua.O, xra.v, new VEa(Tfa.DIAMOND, yRa.d, yRa.d).f(Asa.H));
        eAa_3.J(QSa.fa, vPa.e, new VEa(Tfa.GOLD, AQa.P, uSa.E).f(rua.ia));
        eAa_3.J(YSa.I, LPa.E, new VEa(Tfa.GOLD, AQa.P, vRa.d).f(yQa.N));
        eAa_3.J(Tqa.Ca, bqa.h, new VEa(Tfa.GOLD, AQa.P, uqa.g).f(Ira.N));
        eAa_3.J(WSa.ja, Qpa.c, new VEa(Tfa.GOLD, AQa.P, yRa.d).f(pqa.w));
        eAa_3.J(PTa.q, lTa.z, new eAa_3().f(lTa.z).J(yGa.E));
        eAa_3.J(gQa.a, AQa.M, new YCa(yRa.d, bpa.K, vRa.d != 0).f(cPa.E));
        eAa_3.J(cQa.Z, BQa.g, new YCa(Yqa.i, xSa.la, vRa.d != 0).f(ITa.R));
        eAa_3.J(fTa.E, ysa.y, new vda(WFa.class).f(ysa.y));
        eAa_3.J(ATa.i, xqa.g, new AFa(AQa.P, pPa.c, uSa.E != 0).J().J(Hda.t.O, tTa.h, vRa.d, pqa.r).f(Epa.t));
        eAa_3.J(XTa.B, FPa.S, new PAa().f(FPa.S));
        eAa_3.J(bSa.l, vQa.o, new Efa(QFa.UB).f(Cra.Ka));
        iterator = new XFa(QFa.HF).f(Pua.z).J(ERa.C);
        eAa_3.J(bpa.U, Pua.z, (eAa)iterator);
        eAa_3.J(YSa.A, uQa.Ha, new XFa((Block)QFa.jd).f(oqa.z).J((eAa)iterator));
        eAa_3.J(BQa.W, eta.Ha, new XFa((Block)QFa.fA).f(Uta.Y).J((eAa)iterator));
        eAa_3.J(Upa.P, Iqa.H, new qba(Rda.RIDEABLE).f(Iqa.H));
        eAa_3.J(JQa.H, kTa.C, new kAa().f(kTa.C));
        eAa_3.J(Iqa.m, NSa.i, new Efa(QFa.oC).f(wua.Ga));
        eAa_3.J(rua.B, ATa.U, new Zba().f(ATa.U).J(nua.V));
        eAa_3.J(dQa.U, ERa.E, new wCa().f(ERa.E));
        eAa_3.J(wra.Z, wra.j, new wfa().f(wra.j));
        eAa_3.J(RPa.Ha, kTa.c, new eAa_3().f(kTa.c).J(yGa.E));
        eAa_3.J(fpa.h, csa.a, new xEa().f(Jra.fa).J((eAa)iterator));
        eAa_3.J(EQa.W, Wsa.f, new eAa_3().f(Wsa.f).J(yGa.E));
        eAa_3.J(hTa.X, Usa.Z, new eAa_3().f(nua.Z).J(yGa.E));
        eAa_3.J(osa.m, Gta.c, new Uaa((Block)QFa.ka).f(Gta.c).J(yGa.E));
        eAa_3.J(wua.Z, FTa.M, new eAa_3().f(FTa.M).J(yGa.g));
        eAa_3.J(xTa.h, Bta.Q, new ifa().f(Bta.Q).J(yGa.g));
        eAa_3.J(Vua.X, EPa.D, new eAa_3().f(QSa.j).J(yGa.g));
        eAa_3.J(BRa.h, iPa.q, new qba(Rda.CHEST).f(rSa.Fa));
        eAa_3.J(wPa.r, kPa.a, new qba(Rda.FURNACE).f(vTa.p));
        eAa_3.J(YSa.O, Bua.i, new jfa().f(Bua.i));
        eAa_3.J(vqa.h, Iqa.w, new eAa_3().f(Iqa.w).J(yGa.J));
        eAa_3.J(kua.B, VQa.k, new xea().f(rta.ha));
        eAa_3.J(fPa.P, Vua.Aa, new eAa_3().f(Vua.Aa).J(yGa.J));
        eAa_3.J(nQa.Ga, ITa.B, new eAa_3().f(KSa.Ha).J(sSa.a).J(yGa.E));
        eAa_3.J(SQa.g, PQa.c, new gfa(uSa.E != 0).f(PQa.c).J(vRa.d != 0));
        eAa_3.J(Pqa.fa, pua.z, new gfa(vRa.d != 0).f(PQa.c).J(vRa.d != 0));
        eAa_3.J(qsa.w, VPa.n, new Vda().f(Zta.L));
        eAa_3.J(Xpa.x, Uta.Ka, new eAa_3().f(Uta.Ka).J().J(yGa.g));
        eAa_3.J(fTa.Z, tSa.ja, new eAa_3().f(tSa.ja).J(rSa.L).J(yGa.E));
        eAa_3.J(rta.Da, jpa.Y, new Uaa(QFa.Le).J(vRa.d).f(jpa.Y).J(yGa.i));
        eAa_3.J(Bua.Z, Yua.Ia, new QDa().J(vRa.d).f(Yua.Ia));
        eAa_3.J(tTa.Ka, QSa.B, new Uaa((Block)QFa.t).f(MTa.fa).J(yGa.I));
        eAa_3.J(Bpa.x, Hra.w, new YCa(uqa.g, Nra.e, uSa.E != 0).f(Hra.w));
        eAa_3.J(LRa.N, Eqa.v, new Yba().f(Epa.Aa));
        eAa_3.J(sSa.e, Uqa.Fa, new xAa().f(Uqa.Fa));
        eAa_3.J(aPa.Y, SOa.Z, new YCa(uqa.g, bpa.K, uSa.E != 0).f(SOa.Z));
        eAa_3.J(NPa.v, Iqa.O, new Xca(QFa.i, QFa.rd).f(Xsa.O));
        eAa_3.J(UOa.y, Sqa.u, new Xca(QFa.Nb, QFa.rd).f(jRa.B));
        eAa_3.J(UTa.T, fpa.La, new YCa(yRa.d, bpa.K, vRa.d != 0).f(kta.Z));
        eAa_3.J(mPa.ga, ZRa.Aa, new YCa(Yqa.i, xSa.la, vRa.d != 0).f(QSa.A));
        eAa_3.J(Gta.Z, gua.H, new YCa(uqa.g, bpa.K, vRa.d != 0).J(Hda.L.O, Fsa.d, uSa.E, bpa.K).f(yRa.F));
        eAa_3.J(pua.Ca, qta.s, new YCa(uua.p, Ora.D, vRa.d != 0).f(PQa.O));
        eAa_3.J(LQa.ba, SRa.Ha, new YCa(AQa.P, Nra.e, vRa.d != 0).J(Hda.L.O, Fsa.d, uSa.E, xSa.la).f(ZSa.B));
        eAa_3.J(Era.c, JPa.Ha, new cea().f(Wsa.j));
        eAa_3.J(UOa.A, Mqa.i, new eAa_3().f(Cra.Z).J(yGa.E).J());
        eAa_3.J(ISa.V, Ora.r, new eAa_3().f(Hta.H).J(MQa.b).J(yGa.C));
        eAa_3.J(pQa.Fa, rQa.O, new eAa_3().f(nqa.b).J(yGa.E));
        eAa_3.J(vTa.I, bsa.C, new Xca(QFa.da, QFa.VC).f(UOa.la).J(IPa.g));
        eAa_3.J(Pua.N, rpa.Ha, new eca().f(rpa.Ha));
        eAa_3.J(Lsa.J, MTa.C, new PFa().f(RQa.fa));
        eAa_3.J(Vra.ia, kta.g, new YCa(uqa.g, xSa.la, uSa.E != 0).J(Hda.c.O, tTa.h, uSa.E, pqa.r).f(PTa.U).J(BQa.ja));
        eAa_3.J(Npa.k, URa.i, new eAa_3().f(vRa.F).J(uOa.B).J(yGa.C));
        eAa_3.J(bRa.t, pqa.R, new eAa_3().f(ura.N).J(DPa.Ka).J(yGa.C));
        eAa_3.J(BRa.Aa, Fua.V, new eAa_3().f(fta.w).J(aPa.w).J(yGa.C));
        eAa_3.J(gua.O, pqa.z, new Uaa(QFa.Jb).f(uSa.c).J(yGa.C));
        eAa_3.J(NOa.N, bsa.q, new Uaa((Block)QFa.cC).f(bsa.q).J(yGa.C));
        eAa_3.J(lqa.I, PQa.Ja, new Bfa().f(PTa.l));
        eAa_3.J(Qra.L, wsa.Aa, new eAa_3().f(nua.C).J(STa.f).J(yGa.C));
        eAa_3.J(Qta.U, VPa.h, new Pba().f(sSa.X));
        eAa_3.J(qta.N, vTa.t, new Jfa().f(Spa.ga));
        eAa_3.J(Zra.x, tpa.X, new efa().f(Ata.W));
        eAa_3.J(Wqa.o, pta.ia, new JCa().f(UTa.Ha).J(yGa.g));
        eAa_3.J(WSa.ha, lqa.n, new JDa().f(qQa.H).J(ERa.C));
        eAa_3.J(Jsa.U, zta.d, new eAa_3().f(zta.d).J(yGa.E));
        eAa_3.J(fpa.e, Yqa.Ja, new vda(FEa.class).f(LRa.D));
        eAa_3.J(nqa.C, Ura.Y, new Uaa(QFa.pb).f(csa.Ga).J(yGa.a));
        eAa_3.J(Uta.B, mra.E, new gca(yRa.d, Ora.D, QFa.FE, QFa.rd).f(Zta.t));
        eAa_3.J(vRa.Ca, LRa.a, new gca(vRa.d, bpa.K, QFa.LF, QFa.rd).f(LRa.a));
        eAa_3.J(iPa.E, eta.Q, new YCa(tTa.h, Ora.D, uSa.E != 0).f(APa.Z));
        eAa_3.J(psa.r, DQa.h, new YCa(uqa.g, bpa.K, uSa.E != 0).J(Hda.c.O, tTa.h, uSa.E, Ora.D).f(zOa.k));
        eAa_3.J(rta.i, Epa.Aa, new KEa().f(Fsa.M));
        eAa_3.J(jRa.k, hra.Y, new YCa(uua.p, pPa.c, uSa.E != 0).f(KQa.c).J(RQa.t).J(yGa.C));
        eAa_3.J(AQa.Ka, Qta.E, new NAa().f(Qta.E));
        eAa_3.J(Yra.L, wsa.F, new Wfa().f(opa.H));
        eAa_3.J(kra.m, jRa.Aa, new lca().f(csa.H).J(yGa.E));
        eAa_3.J(hra.i, bua.i, new YCa(Yqa.i, bpa.K, uSa.E != 0).f(Jta.p).J(yGa.i));
        eAa_3.J(GPa.T, eua.c, new VFa().f(eua.c));
        eAa_3.J(tua.ha, JTa.P, new uFa().f(rQa.I).J(yGa.g));
        eAa_3.J(Gua.w, STa.a, new tFa().J(vRa.d).f(yQa.A));
        eAa_3.J(ERa.P, SQa.p, new Uaa((Block)QFa.kc).f(SQa.p).J(yGa.I));
        eAa_3.J(BRa.ja, nQa.C, new eAa_3().f(nQa.C).J(yGa.E));
        eAa_3.J(bRa.R, SRa.u, new eAa_3().f(dsa.b).J(yGa.E));
        eAa_3.J(vpa.W, ZOa.Ga, new qba(Rda.TNT).f(EPa.B));
        eAa_3.J(lQa.q, tpa.r, new qba(Rda.HOPPER).f(PRa.C));
        eAa_3.J(vQa.F, Sqa.h, new eAa_3().f(mPa.Ja).J(yGa.E));
        eAa_3.J(zTa.n, Ora.e, new eAa_3().f(PRa.j).J(yGa.E));
        eAa_3.J(Jsa.H, MQa.O, new YCa(yRa.d, bpa.K, vRa.d != 0).f(nqa.F));
        eAa_3.J(Bpa.ga, uOa.o, new YCa(tTa.h, Ora.D, vRa.d != 0).f(pQa.p));
        eAa_3.J(vsa.S, AQa.S, new rCa(NTa.C).f(vQa.P));
        eAa_3.J(ATa.Ma, vsa.F, new eAa_3().f(Xpa.G).J(wsa.k).J(yGa.C));
        eAa_3.J(bsa.W, NQa.fa, new eAa_3().f(Qqa.s).J(yGa.E));
        eAa_3.J(Epa.C, Bua.Ja, new kEa().f(Vua.n).J(ERa.C));
        eAa_3.J(WRa.G, kpa.O, new eAa_3().f(xOa.Ka).J(vRa.d).J(yGa.g));
        eAa_3.J(LRa.A, Uqa.Ea, new eAa_3().f(PRa.B).J(vRa.d).J(yGa.g));
        eAa_3.J(bSa.Ka, GPa.X, new eAa_3().f(DQa.c).J(vRa.d).J(yGa.g));
        eAa_3.J(Uqa.O, yta.Z, new sfa().f(cra.N));
        eAa_3.J(wsa.fa, sSa.ja, new DCa().f(yQa.Ha));
        eAa_3.J(Jpa.s, bsa.P, new qba(Rda.COMMAND_BLOCK).f(Eqa.U).J((yGa)null));
        eAa_3.J(Gua.W, wua.B, new YCa(uqa.g, bpa.K, vRa.d != 0).f(Ora.K));
        eAa_3.J(BRa.u, Ora.v, new YCa(uua.p, xSa.la, vRa.d != 0).f(kpa.V));
        eAa_3.J(hTa.ca, VQa.M, (eAa)new ofa().J(VQa.M));
        eAa_3.J(PQa.D, MQa.Ka, new Efa(QFa.Ed).f(Sqa.v));
        eAa_3.J(Vra.F, Zta.D, new Efa(QFa.T).f(vQa.Ha));
        eAa_3.J(NTa.h, xOa.Q, new Efa(QFa.Na).f(oQa.ja));
        eAa_3.J(NQa.Q, ysa.l, new Efa(QFa.QB).f(POa.r));
        eAa_3.J(uOa.S, Epa.A, new Efa(QFa.vA).f(hqa.Da));
        eAa_3.J(fsa.k, Zqa.b, new Aba(aqa.H).f(bRa.Aa));
        eAa_3.J(tua.X, Upa.Ka, new Aba(hQa.Ja).f(bRa.Aa));
        eAa_3.J(Pqa.C, wua.G, new Aba(lTa.A).f(bRa.Aa));
        eAa_3.J(FTa.Z, DQa.L, new Aba(Bpa.Q).f(bRa.Aa));
        eAa_3.J(wua.H, Psa.G, new Aba(NOa.I).f(bRa.Aa));
        eAa_3.J(cQa.Ja, Hra.o, new Aba(rta.t).f(bRa.Aa));
        eAa_3.J(kra.P, BRa.Fa, new Aba(wPa.u).f(bRa.Aa));
        eAa_3.J(fta.g, dQa.p, new Aba(Uqa.e).f(bRa.Aa));
        eAa_3.J(Qta.D, WSa.K, new Aba(Wqa.a).f(bRa.Aa));
        eAa_3.J(Ira.l, PRa.H, new Aba(CRa.p).f(bRa.Aa));
        eAa_3.J(zTa.K, uua.L, new Aba(Ypa.M).f(bRa.Aa));
        eAa_3.J(WQa.b, PQa.o, new Aba(DQa.Ga).f(bRa.Aa));
        eAa_3.J(Vua.V, bpa.n, new Efa(QFa.Mc).f(Bra.M));
        eAa_3.J(STa.Z, Ppa.L, new Efa(QFa.hA).f(ZOa.Ia));
        eAa_3.J(Ora.y, LRa.m, new Efa(QFa.oc).f(Lqa.m));
        eAa_3.J(RQa.n, fTa.m, new Efa(QFa.PB).f(FTa.L));
        eAa_3.J(lPa.H, kra.B, new Efa(QFa.Db).f(ISa.C));
        eAa_3.J(kpa.Ga, bqa.ha, new Efa(QFa.td).f(hTa.V));
        eAa_3.J(dsa.f, MRa.Da, new xCa(wda.NETHERITE).f(XOa.I));
        eAa_3.J(Wqa.ia, Fsa.v, (eAa)new sDa());
        eAa_3.J(uua.d, Xsa.w, new VEa(Tfa.NETHERITE, yRa.d, uSa.E).f(xra.q));
        eAa_3.J(uua.N, wra.w, new VEa(Tfa.NETHERITE, yRa.d, vRa.d).f(aSa.Ka));
        eAa_3.J(Rua.l, Zpa.C, new VEa(Tfa.NETHERITE, yRa.d, uqa.g).f(SPa.y));
        eAa_3.J(MQa.a, Pqa.Ja, new VEa(Tfa.NETHERITE, yRa.d, yRa.d).f(uua.k));
    }

    public static void J(Block block, eAa eAa2) {
        Block b2 = eAa2;
        Block a2 = block;
        eAa_3.J(Block.J(a2), (ResourceLocation)Block.blockRegistry.f(a2), (eAa)b2);
        J.put(a2, (eAa)b2);
    }

    static {
        C = new ZX();
        J = Maps.newHashMap();
        L = UUID.fromString(uqa.X);
        M = new Random();
    }

    public float J(Mda mda2, Block block) {
        Block c2 = block;
        eAa_3 a2 = this;
        return pqa.r;
    }

    public eAa_3() {
        eAa_3 a2;
    }
}

