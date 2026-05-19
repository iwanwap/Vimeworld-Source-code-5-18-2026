/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  Ata
 *  BRa
 *  Bpa
 *  Bsa
 *  CY
 *  Cb
 *  Cia
 *  Cra
 *  Cta
 *  DQa
 *  EB
 *  EQa
 *  ERa
 *  Epa
 *  FLa
 *  FPa
 *  FTa
 *  Fpa
 *  Gg
 *  Gl
 *  Gua
 *  HC
 *  Hda
 *  ISa
 *  JPa
 *  JQa
 *  JSa
 *  JTa
 *  KTa
 *  Kpa
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
 *  Nc
 *  PIa
 *  PTa
 *  Ppa
 *  Pqa
 *  QSa
 *  Qqa
 *  Qsa
 *  Qta
 *  Qx
 *  RB
 *  RPa
 *  RQa
 *  Rb
 *  Rua
 *  SQa
 *  SRa
 *  Spa
 *  Sqa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  URa
 *  Usa
 *  Uta
 *  VQa
 *  Vua
 *  Vw
 *  WQa
 *  WSa
 *  Wsa
 *  XE
 *  XTa
 *  Xsa
 *  YSa
 *  Yc
 *  Ypa
 *  Yra
 *  Ysa
 *  ZOa
 *  ZRa
 *  Zpa
 *  Zta
 *  Zua
 *  aKa
 *  aPa
 *  aQa
 *  aSa
 *  aqa
 *  asa
 *  bRa
 *  bSa
 *  bpa
 *  bqa
 *  cQa
 *  cRa
 *  cT
 *  cg
 *  cra
 *  dF
 *  dQa
 *  dpa
 *  eAa
 *  ez
 *  fpa
 *  fsa
 *  fua
 *  hTa
 *  hqa
 *  hra
 *  iPa
 *  isa
 *  jRa
 *  jsa
 *  kB
 *  kPa
 *  kc
 *  kpa
 *  kqa
 *  kta
 *  lB
 *  lPa
 *  ld
 *  lqa
 *  mka
 *  nLa
 *  nQa
 *  nka
 *  oqa
 *  pKa
 *  pPa
 *  pQa
 *  pqa
 *  pua
 *  qb
 *  qta
 *  tA
 *  tB
 *  uKa
 *  uOa
 *  uQa
 *  uRa
 *  uY
 *  ub
 *  ura
 *  uw
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  xOa
 *  xb
 *  yQa
 *  ysa
 *  zTa
 *  zsa
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import shadersmod.client.IShaderPack;
import shadersmod.client.ShaderPackDefault;
import shadersmod.client.ShaderPackNone;
import shadersmod.client.ShaderPackZip;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pA {
    public static final int Dc = 7;
    public static float rC;
    public static Uc fc;
    public static H Ac;
    public static boolean Nc;
    public static int KC;
    public static Uc WA;
    private static boolean[] Od;
    public static ContextCapabilities kA;
    public static int Ad;
    public static double Db;
    public static int wb;
    public static final int Ib = 8;
    public static Uc uB;
    public static String ZB;
    public static final int[] HA;
    public static float yC;
    public static final float[] UA;
    public static Uc SA;
    private static int qB;
    public static final IntBuffer[] oc;
    public static final IntBuffer JB;
    public static Uc db;
    public static IShaderPack Rc;
    public static boolean ZC;
    public static float oB;
    public static float YB;
    public static boolean Tc;
    public static int Cb;
    public static boolean IB;
    public static double Sc;
    public static final IntBuffer fC;
    private static ub[] qd;
    public static long Md;
    public static final IntBuffer bA;
    private static final Pattern cc;
    public static float Vb;
    public static final IntBuffer Qc;
    public static IntBuffer[] jA;
    public static EB RB;
    public static boolean pC;
    private static kc Id;
    public static float bC;
    public static final int mc = 10;
    public static int Jc;
    public static float IA;
    private static int[] Rd;
    public static float[] UB;
    public static Map<String, RB[]> Pb;
    public static int jc;
    public static final int[] Nb;
    private static final String[] LC;
    public static final int PC = 17;
    public static float bc;
    public static final float[] Gd;
    public static final float[] Ed;
    private static String Cd;
    public static float Gc;
    public static float JC;
    public static String Zb;
    public static float KA;
    public static final int OC = 6;
    private static final String[] wB;
    public static boolean[] VC;
    public static String MA;
    public static qb yc;
    public static boolean dA;
    public static float gA;
    public static final int Rb = 2;
    public static final String[] XB;
    private static String TB;
    public static Uc BB;
    public static float rA;
    public static float[] FB;
    public static double Ub;
    public static float id;
    private static final boolean Ob = true;
    public static final IntBuffer tc;
    public static Uc aA;
    public static long VB;
    public static final float[] nA;
    public static final FloatBuffer Bd;
    public static boolean NC;
    public static final int Hd = 3;
    public static final int bd = 32;
    public static boolean Hb;
    public static boolean Jb;
    public static final boolean[][] kC;
    public static final int Hc = 18;
    public static double lB;
    public static final float[] nB;
    public static final int[] aB;
    public static Map<Block, Integer> rd;
    private static final ByteBuffer dB;
    public static float[] yA;
    public static float[] ac;
    public static double YA;
    public static float lA;
    public static boolean Kc;
    public static final int OA = 28;
    public static float hd;
    public static float[] Kb;
    public static final FloatBuffer pB;
    public static int tC;
    public static float Oc;
    public static boolean eA;
    public static final int ic = 21;
    public static boolean pd;
    public static int[] ec;
    public static boolean Vc;
    public static float iB;
    public static boolean Pc;
    private static List<Integer> lC;
    public static boolean Jd;
    public static boolean mC;
    public static float Yc;
    public static final int eb = 22;
    public static int od;
    public static float Kd;
    public static float TC;
    public static final int fd = 0;
    public static String md;
    private static ub[] SB;
    public static boolean Nd;
    public static float wA;
    public static final float[] sd;
    public static final float[] VA;
    public static double Ab;
    public static boolean gc;
    public static int DC;
    public static boolean[] aC;
    public static int tA;
    public static final int kc = 29;
    public static boolean ib;
    public static File AA;
    public static boolean zc;
    public static lB[] GB;
    public static final FloatBuffer EB;
    public static boolean ub;
    public static int gd;
    public static final int jb = 8;
    public static final int td = 25;
    public static Uc NA;
    public static File HB;
    public static final int fA = 2;
    public static int JA;
    public static int jC;
    private static int[] Pd;
    public static final IntBuffer Uc;
    private static int FC;
    public static float rB;
    public static int zA;
    public static float Tb;
    public static float[] LB;
    public static EB Lc;
    public static final int Mc = 4;
    public static int[] pA;
    public static File uc;
    public static long qb;
    private static final int[] gC;
    public static float hc;
    public static final int OB = 27;
    public static boolean DA;
    public static boolean hC;
    public static long qA;
    public static float cd;
    public static final boolean Gb;
    public static int[] Wc;
    public static boolean yb;
    public static float XC;
    public static Uc WB;
    public static boolean[] MC;
    public static final FloatBuffer wc;
    private static int NB;
    public static final int cA = 8;
    public static String mA;
    public static String dc;
    public static int ld;
    public static final FloatBuffer CC;
    public static int hb;
    public static File zb;
    public static boolean YC;
    private static int GA;
    public static int ab;
    public static final int Qd = 26;
    public static final IntBuffer tb;
    public static final int kd = 14;
    private static final Pattern pb;
    public static final int gB = 31;
    private static final boolean kB;
    public static int CB;
    public static float mB;
    public static int xB;
    public static boolean hA;
    private static Gg Sd;
    public static final FloatBuffer Bb;
    private static String[] xc;
    public static final int[] LA;
    public static int Xb;
    public static final int Dd = 5;
    public static int QA;
    public static final int Ic = 3;
    private static final Pattern QC;
    public static final int qc = 9;
    public static int sb;
    public static final int Mb = 19;
    public static float Sb;
    public static final int Ra = 2;
    public static boolean oa;
    public static final FloatBuffer Wa;
    public static final int ua = 13;
    public static Uc Ua;
    public static int ra;
    public static int pa;
    public static final IntBuffer Ya;
    public static final int ta = 23;
    public static int wa;
    private static Map<String, String> va;
    public static float Pa;
    public static boolean Za;
    private static final int[] sa;
    public static boolean[] na;
    public static final int Na = 20;
    public static IntBuffer xa;
    public static final IntBuffer ya;
    public static float Oa;
    public static final FloatBuffer Qa;
    public static float Va;
    public static final FloatBuffer Sa;
    public static final FloatBuffer Ta;
    public static int Xa;
    public static final int qa = 30;
    public static boolean za;
    public static final IntBuffer ma;
    public static float La;
    private static final String[] ka;
    public static FLa da;
    public static final int Ba = 16;
    public static int aa;
    public static float ea;
    public static String Ea;
    private static boolean Ca;
    public static final int ia = 11;
    public static final IntBuffer Ma;
    public static int ba;
    public static int ha;
    public static boolean Fa;
    public static int Ia;
    public static final int la = 33;
    public static final int[] ga;
    private static final Pattern Da;
    public static int ca;
    public static String Ja;
    public static RB[] ja;
    public static final IntBuffer Ha;
    public static final boolean Ga = true;
    public static final int fa = 24;
    public static float[] Ka;
    public static float Aa;
    public static float S;
    public static Uc Z;
    public static hb Y;
    public static boolean r;
    public static Uc V;
    public static final String[] z;
    private static final int X = 1;
    private static int y;
    public static final int U = 1;
    private static String P;
    public static int u;
    private static String[] O;
    public static int t;
    public static float[] R;
    public static Properties Q;
    private static final int N = 2196;
    private static boolean T;
    public static long p;
    public static boolean[] n;
    public static int s;
    public static float w;
    public static float W;
    public static final float[] q;
    public static final int x = 12;
    private static int v;
    private static float[] o;
    public static int h;
    public static boolean K;
    private static final int H = 0;
    public static boolean c;
    public static int B;
    private static int[] d;
    public static final FloatBuffer a;
    public static final int b = 3;
    public static Properties l;
    public static boolean e;
    public static Kpa G;
    public static float D;
    public static final int f = 8;
    public static Uc F;
    public static int g;
    public static Uc L;
    public static boolean E;
    public static final FloatBuffer m;
    public static int C;
    public static long i;
    public static int M;
    public static boolean k;
    public static final int j = 8;
    public static int J;
    public static final int A = 15;
    public static float I;

    public static int e(String string) {
        String string2 = string;
        int a2 = EXTFramebufferObject.glCheckFramebufferStatusEXT(zsa.h);
        if (a2 != Iqa.Aa) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = a2;
            objectArray[vRa.d] = string2;
            System.err.format(ura.D, objectArray);
        }
        return a2;
    }

    public static void Ma() {
        pA.e(yRa.d);
    }

    public static void A(int a2) {
        GL11.glDisable(a2);
        pA.O();
    }

    public static String J() {
        if (Rc == null) {
            return null;
        }
        if (Rc instanceof ShaderPackNone) {
            return null;
        }
        return Rc.J();
    }

    public static void f(float f2) {
        float f3 = f2;
        vL a22 = G.J();
        double d2 = a22.V + (a22.la - a22.V) * (double)f3;
        vL vL2 = a22;
        double d3 = a22.Ga + (vL2.Z - a22.Ga) * (double)f3;
        double d4 = vL2.Ca + (a22.A - a22.Ca) * (double)f3;
        Sc = d2;
        lB = d3;
        Ub = d4;
        GL11.glGetFloat(Ppa.Q, (FloatBuffer)pB.position(uSa.E));
        Yc.J((FloatBuffer)((FloatBuffer)Sa.position(uSa.E)), (FloatBuffer)((FloatBuffer)pB.position(uSa.E)), (float[])UA, (float[])nB);
        pB.position(uSa.E);
        Sa.position(uSa.E);
        GL11.glGetFloat(TQa.g, (FloatBuffer)Bd.position(uSa.E));
        Yc.J((FloatBuffer)((FloatBuffer)EB.position(uSa.E)), (FloatBuffer)((FloatBuffer)Bd.position(uSa.E)), (float[])VA, (float[])Ed);
        Bd.position(uSa.E);
        EB.position(uSa.E);
        GL11.glViewport(uSa.E, uSa.E, sb, ld);
        GL11.glMatrixMode(WPa.s);
        GL11.glLoadIdentity();
        if (Fa) {
            GL11.glOrtho(-D, D, -D, D, ySa.Ja, ZSa.o);
        } else {
            GLU.gluPerspective(S, (float)sb / (float)ld, Yqa.C, Fpa.q);
        }
        GL11.glMatrixMode(SQa.ca);
        GL11.glLoadIdentity();
        fua.J((float)JPa.N, (float)JPa.N, (float)pua.Ja);
        fua.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        cd = pA.G.Ta.e(f3);
        rA = cd < wOa.w ? cd + rta.o : cd - wOa.w;
        float a22 = cd * UOa.s;
        float f4 = id > JPa.N ? a22 % id - id * MQa.L : JPa.N;
        float f5 = a22;
        if ((double)rA <= kTa.B) {
            fua.J((float)(f5 - f4), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            fua.J((float)rB, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            Aa = rA;
        } else {
            fua.J((float)(f5 + Hra.Ga - f4), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            fua.J((float)rB, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            Aa = rA - MQa.L;
        }
        if (Fa) {
            a22 = wA;
            f4 = a22 / kta.v;
            fua.J((float)((float)d2 % a22 - f4), (float)((float)d3 % a22 - f4), (float)((float)d4 % a22 - f4));
        }
        a22 = rA * Ypa.Ha;
        f4 = (float)Math.cos(a22);
        a22 = (float)Math.sin(a22);
        float f6 = rB * Ypa.Ha;
        float f7 = f4;
        float f8 = a22 * (float)Math.cos(f6);
        a22 *= (float)Math.sin(f6);
        if ((double)rA > kTa.B) {
            f7 = -f4;
            f8 = -f8;
            a22 = -a22;
        }
        pA.R[uSa.E] = f7;
        pA.R[vRa.d] = f8;
        pA.R[uqa.g] = a22;
        pA.R[yRa.d] = JPa.N;
        GL11.glGetFloat(Ppa.Q, (FloatBuffer)Ta.position(uSa.E));
        Yc.J((FloatBuffer)((FloatBuffer)CC.position(uSa.E)), (FloatBuffer)((FloatBuffer)Ta.position(uSa.E)), (float[])sd, (float[])nA);
        Ta.position(uSa.E);
        CC.position(uSa.E);
        GL11.glGetFloat(TQa.g, (FloatBuffer)m.position(uSa.E));
        Yc.J((FloatBuffer)((FloatBuffer)Bb.position(uSa.E)), (FloatBuffer)((FloatBuffer)m.position(uSa.E)), (float[])Gd, (float[])q);
        m.position(uSa.E);
        Bb.position(uSa.E);
        pA.J(Lqa.g, uSa.E != 0, pB);
        pA.J(ATa.f, uSa.E != 0, Sa);
        pA.J(RPa.V, uSa.E != 0, wc);
        pA.J(JQa.K, uSa.E != 0, Bd);
        pA.J(Tqa.l, uSa.E != 0, EB);
        pA.J(isa.Ga, uSa.E != 0, a);
        pA.J(zpa.Y, uSa.E != 0, Ta);
        pA.J(Uta.l, uSa.E != 0, CC);
        pA.J(Lqa.G, uSa.E != 0, m);
        pA.J(KTa.H, uSa.E != 0, Bb);
        if (!uw.a) {
            pA.G.z.ld = vRa.d;
        }
        pA.d(Jra.b);
    }

    public static void ea() {
        aKa aKa2 = pKa.J().J();
        float f2 = pA.G.z.kc * ERa.C;
        double d2 = (double)f2 * xra.e;
        double d3 = (double)f2 * LRa.L;
        double d4 = -d3;
        double d5 = -d2;
        double d6 = Zta.ba;
        double d7 = -lB;
        aKa aKa3 = aKa2;
        aKa aKa4 = aKa2;
        double d8 = d3;
        aKa aKa5 = aKa2;
        double d9 = d2;
        aKa aKa6 = aKa2;
        double d10 = d2;
        aKa aKa7 = aKa2;
        double d11 = d2;
        aKa aKa8 = aKa2;
        double d12 = d3;
        aKa aKa9 = aKa2;
        double d13 = d4;
        aKa aKa10 = aKa2;
        aKa aKa11 = aKa2;
        double d14 = d5;
        aKa aKa12 = aKa2;
        double d15 = d5;
        aKa aKa13 = aKa2;
        aKa aKa14 = aKa2;
        aKa2.J(XTa.W, mka.M);
        aKa14.J(d4, d7, d5).M();
        aKa14.J(d4, d6, d5).M();
        aKa13.J(d5, d6, d4).M();
        aKa13.J(d5, d7, d4).M();
        aKa2.J(d15, d7, d4).M();
        aKa12.J(d15, d6, d4).M();
        aKa12.J(d5, d6, d3).M();
        aKa2.J(d14, d7, d3).M();
        aKa11.J(d14, d7, d3).M();
        aKa11.J(d5, d6, d3).M();
        aKa10.J(d4, d6, d3).M();
        aKa10.J(d4, d7, d3).M();
        aKa2.J(d13, d7, d3).M();
        aKa9.J(d13, d6, d3).M();
        aKa9.J(d3, d6, d2).M();
        aKa2.J(d12, d7, d2).M();
        aKa8.J(d12, d7, d2).M();
        aKa8.J(d3, d6, d2).M();
        aKa2.J(d11, d6, d3).M();
        aKa7.J(d11, d7, d3).M();
        aKa7.J(d2, d7, d3).M();
        aKa2.J(d10, d6, d3).M();
        aKa6.J(d10, d6, d4).M();
        aKa6.J(d2, d7, d4).M();
        aKa2.J(d9, d7, d4).M();
        aKa5.J(d9, d6, d4).M();
        aKa5.J(d3, d6, d5).M();
        aKa2.J(d8, d7, d5).M();
        aKa4.J(d8, d7, d5).M();
        aKa4.J(d3, d6, d5).M();
        aKa3.J(d4, d6, d5).M();
        aKa3.J(d4, d7, d5).M();
        pKa.J().J();
    }

    public static boolean J(Cia a2) {
        if (!Vc) {
            return vRa.d != 0;
        }
        pA.d(Lsa.Da);
        if (eA) {
            return ib;
        }
        if (a2.z > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(String string, String string2) {
        String string3 = string;
        String b2 = va.get(string3);
        if (b2 == null) {
            void a2;
            return a2;
        }
        return b2;
    }

    public static int f() {
        return ec[Ad * uqa.g + vRa.d];
    }

    public static void la() {
        Jb = uSa.E;
        pA.J(fC);
        pA.e(YC ? yRa.d : uqa.g);
        pA.C();
    }

    private static void l(String a2) {
        zc.f(a2);
        pA.G.Ya.J().J((ld)new CY(a2));
    }

    public static void Ja() {
        pA.s();
    }

    public static void Ca() {
        FloatBuffer floatBuffer = Wa;
        floatBuffer.clear();
        GL11.glGetFloat(TQa.g, floatBuffer);
        floatBuffer.get(o, uSa.E, ERa.C);
        Yc.J((float[])UB, (float[])o, (float[])yA);
        Yc.J((float[])Ka, (float[])o, (float[])Kb);
        System.arraycopy(Aa == rA ? UB : Ka, uSa.E, FB, uSa.E, yRa.d);
        pA.J(nOa.S, UB[uSa.E], UB[vRa.d], UB[uqa.g]);
        pA.J(KTa.s, Ka[uSa.E], Ka[vRa.d], Ka[uqa.g]);
        pA.J(WQa.Q, FB[uSa.E], FB[vRa.d], FB[uqa.g]);
        pA.d(cRa.i);
    }

    public static String J(int n2) {
        int n3 = n2;
        String a2 = Integer.toString(n3);
        return new StringBuilder().insert(3 >> 2, Integer.toString(Integer.parseInt(a2.substring(vRa.d, yRa.d)))).append(VQa.ja).append(Integer.toString(Integer.parseInt(a2.substring(yRa.d, tTa.h)))).append(VQa.ja).append(Integer.toString(Integer.parseInt(a2.substring(tTa.h)))).toString();
    }

    public static void i(int a2) {
        GL11.glDisable(a2);
        if (a2 == BQa.Z) {
            pA.p();
            return;
        }
        if (a2 == jRa.V) {
            pA.O();
        }
    }

    public static boolean G() {
        return k;
    }

    /*
     * WARNING - void declaration
     */
    public static void f(float f2, float f3, float f4, float f5) {
        void a2;
        void c2;
        float d2 = f4;
        float b2 = f2;
        uKa.l((float)b2, (float)c2, (float)d2, (float)a2);
        rC = b2;
        Kd = c2;
        W = d2;
    }

    private static Properties J(IShaderPack iShaderPack) throws IOException {
        IShaderPack iShaderPack2 = iShaderPack;
        Properties properties = new Properties();
        Object a2 = new StringBuilder().insert(2 & 5, MA).append(WSa.f).append(iShaderPack2.J()).append(dQa.S).toString();
        if (((File)(a2 = new File(Kpa.J().p, (String)a2))).exists() && ((File)a2).isFile() && ((File)a2).canRead()) {
            a2 = new FileInputStream((File)a2);
            Properties properties2 = properties;
            properties2.load((InputStream)a2);
            ((FileInputStream)a2).close();
            return properties2;
        }
        return properties;
    }

    private static void da() {
        if (B != 0) {
            int n2;
            if (ca != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(ca);
                uKa.J((IntBuffer)Ma);
                uKa.J((IntBuffer)bA);
            }
            ca = EXTFramebufferObject.glGenFramebuffersEXT();
            EXTFramebufferObject.glBindFramebufferEXT(zsa.h, ca);
            GL11.glDrawBuffer(uSa.E);
            GL11.glReadBuffer(uSa.E);
            GL11.glGenTextures((IntBuffer)Ma.clear().limit(B));
            GL11.glGenTextures((IntBuffer)bA.clear().limit(ha));
            Ma.position(uSa.E);
            bA.position(uSa.E);
            int n3 = uSa.E;
            int n4 = n3;
            while (n4 < B) {
                uKa.C((int)Ma.get(n3));
                GL11.glTexParameterf(BQa.Z, LQa.P, XOa.f);
                GL11.glTexParameterf(BQa.Z, pQa.n, XOa.f);
                n2 = MC[n3] ? hqa.s : rSa.z;
                GL11.glTexParameteri(BQa.Z, lQa.E, n2);
                GL11.glTexParameteri(BQa.Z, wua.C, n2);
                if (n[n3]) {
                    GL11.glTexParameteri(BQa.Z, QSa.ca, Wsa.Ka);
                }
                GL11.glTexImage2D(BQa.Z, uSa.E, kTa.w, sb, ld, uSa.E, kTa.w, JPa.la, (FloatBuffer)null);
                n4 = ++n3;
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, zua.J, BQa.Z, Ma.get(uSa.E), uSa.E);
            pA.d(JPa.e);
            n3 = uSa.E;
            int n5 = n3;
            while (n5 < ha) {
                uKa.C((int)bA.get(n3));
                GL11.glTexParameterf(BQa.Z, LQa.P, XOa.f);
                GL11.glTexParameterf(BQa.Z, pQa.n, XOa.f);
                n2 = na[n3] ? hqa.s : rSa.z;
                GL11.glTexParameteri(BQa.Z, lQa.E, n2);
                GL11.glTexParameteri(BQa.Z, wua.C, n2);
                GL11.glTexImage2D(BQa.Z, uSa.E, rSa.Ka, sb, ld, uSa.E, NSa.U, aua.N, (ByteBuffer)null);
                int n6 = rua.t + n3;
                int n7 = bA.get(n3);
                EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, n6, BQa.Z, n7, uSa.E);
                pA.d(Tpa.w);
                n5 = ++n3;
            }
            uKa.C((int)uSa.E);
            if (ha > 0) {
                GL20.glDrawBuffers(Qc);
            }
            if ((n3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(zsa.h)) != Iqa.Aa) {
                pA.l(new StringBuilder().insert(3 & 4, wua.P).append(n3).append(hpa.b).toString());
                return;
            }
            zc.J(Gua.ga);
        }
    }

    static {
        Hb = uSa.E;
        pC = uSa.E;
        Tc = uSa.E;
        oa = uSa.E;
        QA = uSa.E;
        Pc = uSa.E;
        NB = uSa.E;
        qB = uSa.E;
        zA = uSa.E;
        t = uSa.E;
        pd = uSa.E;
        Jb = uSa.E;
        mC = uSa.E;
        K = uSa.E;
        eA = uSa.E;
        r = uSa.E;
        k = uSa.E;
        UB = new float[AQa.P];
        Ka = new float[AQa.P];
        FB = new float[AQa.P];
        LB = new float[AQa.P];
        R = new float[AQa.P];
        float[] fArray = new float[AQa.P];
        fArray[uSa.E] = JPa.N;
        fArray[vRa.d] = QTa.G;
        fArray[uqa.g] = JPa.N;
        fArray[yRa.d] = JPa.N;
        ac = fArray;
        float[] fArray2 = new float[AQa.P];
        fArray2[uSa.E] = JPa.N;
        fArray2[vRa.d] = QTa.G;
        fArray2[uqa.g] = JPa.N;
        fArray2[yRa.d] = JPa.N;
        yA = fArray2;
        float[] fArray3 = new float[AQa.P];
        fArray3[uSa.E] = JPa.N;
        fArray3[vRa.d] = pua.Ja;
        fArray3[uqa.g] = JPa.N;
        fArray3[yRa.d] = JPa.N;
        Kb = fArray3;
        o = new float[ERa.C];
        Md = nqa.i;
        p = nqa.i;
        qA = nqa.i;
        cd = JPa.N;
        rA = JPa.N;
        Aa = JPa.N;
        gd = uSa.E;
        VB = nqa.i;
        i = nqa.i;
        qb = nqa.i;
        Jc = uSa.E;
        iB = JPa.N;
        Oc = JPa.N;
        CB = uSa.E;
        Yc = JPa.N;
        I = JPa.N;
        bC = fqa.Ha;
        hd = Qsa.U;
        Tb = FRa.Ga;
        Kc = uSa.E;
        jc = uSa.E;
        Xb = uSa.E;
        yC = JPa.N;
        Va = JPa.N;
        YB = JPa.N;
        KA = JPa.N;
        ea = JPa.N;
        TC = pqa.r;
        c = uSa.E;
        od = vRa.d;
        gA = JPa.N;
        Vb = JPa.N;
        IB = uSa.E;
        YC = uSa.E;
        Nc = vRa.d;
        hb = NTa.C;
        wb = pPa.f;
        ra = lqa.s;
        hC = uSa.E;
        Jd = uSa.E;
        NC = uSa.E;
        ZC = uSa.E;
        E = uSa.E;
        gc = uSa.E;
        Nd = uSa.E;
        tC = uSa.E;
        g = uSa.E;
        Y = new hb(NPa.s);
        RB = new EB(cQa.v);
        Lc = new EB(LRa.s);
        ba = uSa.E;
        Za = uSa.E;
        sb = ura.V;
        ld = ura.V;
        J = ura.V;
        h = ura.V;
        S = ISa.a;
        D = aua.a;
        Fa = vRa.d;
        Sb = vqa.T;
        u = uSa.E;
        dA = uSa.E;
        za = uSa.E;
        Xa = uSa.E;
        DC = uSa.E;
        ha = uSa.E;
        B = uSa.E;
        Cb = uSa.E;
        C = uSa.E;
        KC = uSa.E;
        ca = uSa.E;
        Rd = new int[Yqa.i];
        Od = new boolean[Yqa.i];
        pa = uSa.E;
        String[] stringArray = new String[Zqa.G];
        stringArray[uSa.E] = Mqa.y;
        stringArray[vRa.d] = Era.O;
        stringArray[uqa.g] = kTa.N;
        stringArray[yRa.d] = aQa.e;
        stringArray[AQa.P] = wPa.W;
        stringArray[tTa.h] = CRa.h;
        stringArray[uua.p] = Yra.Ja;
        stringArray[XTa.W] = URa.p;
        stringArray[Yqa.i] = wsa.c;
        stringArray[WOa.fa] = APa.I;
        stringArray[NTa.C] = Wsa.e;
        stringArray[pPa.f] = bqa.la;
        stringArray[lqa.s] = BPa.S;
        stringArray[uua.s] = iSa.n;
        stringArray[hpa.Z] = Ssa.H;
        stringArray[Ypa.A] = WPa.I;
        stringArray[ERa.C] = NTa.Ma;
        stringArray[yta.Ka] = Jqa.j;
        stringArray[yOa.B] = QTa.t;
        stringArray[wOa.t] = ERa.w;
        stringArray[kTa.j] = Gua.Z;
        stringArray[wOa.h] = NTa.Q;
        stringArray[cQa.o] = Zra.z;
        stringArray[AQa.ba] = APa.K;
        stringArray[osa.c] = eua.R;
        stringArray[kTa.g] = vua.X;
        stringArray[ITa.E] = Qpa.N;
        stringArray[Lra.e] = PQa.w;
        stringArray[EPa.O] = iSa.E;
        stringArray[ITa.A] = xqa.u;
        stringArray[Fsa.d] = Gta.ja;
        stringArray[tua.U] = WSa.Y;
        stringArray[fPa.i] = Zta.z;
        wB = stringArray;
        int[] nArray = new int[Zqa.G];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = uSa.E;
        nArray[uqa.g] = vRa.d;
        nArray[yRa.d] = uqa.g;
        nArray[AQa.P] = vRa.d;
        nArray[tTa.h] = uqa.g;
        nArray[uua.p] = uqa.g;
        nArray[XTa.W] = yRa.d;
        nArray[Yqa.i] = XTa.W;
        nArray[WOa.fa] = XTa.W;
        nArray[NTa.C] = XTa.W;
        nArray[pPa.f] = XTa.W;
        nArray[lqa.s] = XTa.W;
        nArray[uua.s] = XTa.W;
        nArray[hpa.Z] = uqa.g;
        nArray[Ypa.A] = yRa.d;
        nArray[ERa.C] = yRa.d;
        nArray[yta.Ka] = uqa.g;
        nArray[yOa.B] = uqa.g;
        nArray[wOa.t] = yRa.d;
        nArray[kTa.j] = yRa.d;
        nArray[wOa.h] = uSa.E;
        nArray[cQa.o] = uSa.E;
        nArray[AQa.ba] = uSa.E;
        nArray[osa.c] = uSa.E;
        nArray[kTa.g] = uSa.E;
        nArray[ITa.E] = uSa.E;
        nArray[Lra.e] = uSa.E;
        nArray[EPa.O] = uSa.E;
        nArray[ITa.A] = uSa.E;
        nArray[Fsa.d] = uSa.E;
        nArray[tua.U] = Fsa.d;
        nArray[fPa.i] = Fsa.d;
        gC = nArray;
        Wc = new int[Zqa.G];
        Pd = new int[Zqa.G];
        GA = uSa.E;
        O = new String[Zqa.G];
        TB = null;
        jA = new IntBuffer[Zqa.G];
        xa = null;
        xc = new String[Zqa.G];
        Cd = null;
        P = null;
        d = new int[Zqa.G];
        v = uSa.E;
        FC = uSa.E;
        Q = null;
        l = null;
        Ac = null;
        ub = uSa.E;
        n = new boolean[uqa.g];
        aC = new boolean[uqa.g];
        MC = new boolean[uqa.g];
        VC = new boolean[Yqa.i];
        na = new boolean[Yqa.i];
        yb = vRa.d;
        ib = vRa.d;
        oB = Mqa.N;
        w = pqa.r;
        Oa = pqa.r;
        s = uSa.E;
        ab = uSa.E;
        JA = uSa.E;
        wa = uSa.E;
        Ia = uSa.E;
        M = uSa.E;
        e = vRa.d;
        DA = vRa.d;
        hA = vRa.d;
        uB = new Uc(rQa.r, NTa.Z, uSa.E);
        fc = new Uc(yOa.w, kua.x, uSa.E);
        tA = uSa.E;
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = hra.u;
        stringArray2[vRa.d] = isa.a;
        stringArray2[uqa.g] = ysa.R;
        z = stringArray2;
        String[] stringArray3 = new String[uqa.g];
        stringArray3[uSa.E] = hra.u;
        stringArray3[vRa.d] = uSa.z;
        XB = stringArray3;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = hqa.s;
        nArray2[vRa.d] = pQa.t;
        nArray2[uqa.g] = Spa.Ha;
        aB = nArray2;
        int[] nArray3 = new int[uqa.g];
        nArray3[uSa.E] = hqa.s;
        nArray3[vRa.d] = rSa.z;
        ga = nArray3;
        Rc = null;
        Vc = uSa.E;
        Zb = Wsa.fa;
        md = kqa.X;
        MA = cTa.O;
        mA = Vra.N;
        ja = null;
        GB = null;
        Pb = null;
        yc = new qb(dpa.fa, Fpa.L, uSa.E);
        Z = new Uc(rQa.r, NTa.Z, uSa.E);
        db = new Uc(yOa.w, kua.x, uSa.E);
        L = new Uc(kPa.Q, LQa.F, uSa.E);
        NA = new Uc(PRa.Ja, Ypa.E, uSa.E);
        F = new Uc(POa.s, cRa.f, uSa.E);
        V = new Uc(WQa.c, POa.H, uSa.E);
        WA = new Uc(lTa.V, rSa.ga, uSa.E);
        WB = new Uc(wra.m, oQa.M, uSa.E);
        BB = new Uc(rRa.Ja, Yqa.U, uSa.E);
        Ua = new Uc(Cra.X, Qta.M, uSa.E);
        aA = new Uc(ySa.a, Bpa.V, uSa.E);
        SA = new Uc(Epa.c, NSa.G, uSa.E);
        va = new HashMap<String, String>();
        Sd = null;
        lC = new ArrayList<Integer>();
        qd = null;
        SB = null;
        String[] stringArray4 = new String[uqa.g];
        stringArray4[uSa.E] = WPa.f;
        stringArray4[vRa.d] = NTa.Q;
        ka = stringArray4;
        kB = System.getProperty(Zra.Y, MRa.E).equals(oQa.l);
        hc = MQa.L;
        Pa = Ora.D;
        La = xSa.la;
        bc = vqa.T;
        rB = JPa.N;
        id = JPa.N;
        xB = uSa.E;
        wA = kta.v;
        jC = ERa.C;
        pA = new int[uqa.g];
        T = uSa.E;
        y = hra.Ja;
        HA = new int[ERa.C];
        LA = new int[Yqa.i];
        int[] nArray4 = new int[Yqa.i];
        nArray4[uSa.E] = uSa.E;
        nArray4[vRa.d] = vRa.d;
        nArray4[uqa.g] = uqa.g;
        nArray4[yRa.d] = yRa.d;
        nArray4[AQa.P] = XTa.W;
        nArray4[tTa.h] = Yqa.i;
        nArray4[uua.p] = WOa.fa;
        nArray4[XTa.W] = NTa.C;
        Nb = nArray4;
        kC = new boolean[Zqa.G][Yqa.i];
        dB = (ByteBuffer)BufferUtils.createByteBuffer(zsa.L).limit(uSa.E);
        nB = new float[ERa.C];
        UA = new float[ERa.C];
        Ed = new float[ERa.C];
        VA = new float[ERa.C];
        nA = new float[ERa.C];
        sd = new float[ERa.C];
        q = new float[ERa.C];
        Gd = new float[ERa.C];
        pB = pA.J(ERa.C);
        Sa = pA.J(ERa.C);
        Bd = pA.J(ERa.C);
        EB = pA.J(ERa.C);
        Ta = pA.J(ERa.C);
        CC = pA.J(ERa.C);
        m = pA.J(ERa.C);
        Bb = pA.J(ERa.C);
        wc = pA.J(ERa.C);
        a = pA.J(ERa.C);
        Wa = pA.J(ERa.C);
        Qa = pA.J(ERa.C);
        tc = pA.J(ERa.C);
        JB = pA.J(yRa.d);
        bA = pA.J(Yqa.i);
        Ma = pA.J(uqa.g);
        fC = pA.J(Yqa.i);
        Qc = pA.J(Yqa.i);
        ya = pA.J(Yqa.i);
        ma = pA.J(Yqa.i);
        tb = pA.J(Yqa.i);
        Uc = pA.J(Yqa.i);
        Ha = pA.J(Yqa.i);
        Ya = pA.J(Yqa.i);
        oc = pA.J(Zqa.G, Yqa.i);
        cc = Pattern.compile(aQa.C);
        Da = Pattern.compile(eua.e);
        pb = Pattern.compile(dpa.J);
        String[] stringArray5 = new String[fPa.i];
        stringArray5[uSa.E] = JSa.D;
        stringArray5[vRa.d] = Epa.J;
        stringArray5[uqa.g] = oua.O;
        stringArray5[yRa.d] = fsa.v;
        stringArray5[AQa.P] = isa.D;
        stringArray5[tTa.h] = TQa.o;
        stringArray5[uua.p] = mPa.V;
        stringArray5[XTa.W] = vqa.V;
        stringArray5[Yqa.i] = TQa.la;
        stringArray5[WOa.fa] = rua.Ga;
        stringArray5[NTa.C] = ysa.fa;
        stringArray5[pPa.f] = Psa.Z;
        stringArray5[lqa.s] = Npa.B;
        stringArray5[uua.s] = NPa.o;
        stringArray5[hpa.Z] = Npa.K;
        stringArray5[Ypa.A] = JSa.c;
        stringArray5[ERa.C] = Fpa.Da;
        stringArray5[yta.Ka] = ura.k;
        stringArray5[yOa.B] = gsa.D;
        stringArray5[wOa.t] = Zta.A;
        stringArray5[kTa.j] = xSa.b;
        stringArray5[wOa.h] = bRa.K;
        stringArray5[cQa.o] = Fsa.Y;
        stringArray5[AQa.ba] = aua.Ma;
        stringArray5[osa.c] = MTa.Fa;
        stringArray5[kTa.g] = Zra.G;
        stringArray5[ITa.E] = Fpa.k;
        stringArray5[Lra.e] = rRa.k;
        stringArray5[EPa.O] = ISa.D;
        stringArray5[ITa.A] = ATa.G;
        stringArray5[Fsa.d] = kta.N;
        stringArray5[tua.U] = KPa.R;
        LC = stringArray5;
        int[] nArray5 = new int[fPa.i];
        nArray5[uSa.E] = cRa.R;
        nArray5[vRa.d] = oQa.f;
        nArray5[uqa.g] = sOa.W;
        nArray5[yRa.d] = BRa.z;
        nArray5[AQa.P] = fsa.H;
        nArray5[tTa.h] = JSa.E;
        nArray5[uua.p] = opa.ca;
        nArray5[XTa.W] = fsa.p;
        nArray5[Yqa.i] = uSa.k;
        nArray5[WOa.fa] = nqa.W;
        nArray5[NTa.C] = Vra.U;
        nArray5[pPa.f] = zpa.U;
        nArray5[lqa.s] = wPa.y;
        nArray5[uua.s] = Ppa.i;
        nArray5[hpa.Z] = ZOa.k;
        nArray5[Ypa.A] = rSa.h;
        nArray5[ERa.C] = fqa.ia;
        nArray5[yta.Ka] = zTa.F;
        nArray5[yOa.B] = hqa.S;
        nArray5[wOa.t] = PTa.Y;
        nArray5[kTa.j] = NPa.Aa;
        nArray5[wOa.h] = mPa.G;
        nArray5[cQa.o] = NTa.o;
        nArray5[AQa.ba] = vQa.h;
        nArray5[osa.c] = JTa.G;
        nArray5[kTa.g] = Qqa.p;
        nArray5[ITa.E] = dQa.d;
        nArray5[Lra.e] = uRa.A;
        nArray5[EPa.O] = Jta.ga;
        nArray5[ITa.A] = Wqa.h;
        nArray5[Fsa.d] = dQa.E;
        nArray5[tua.U] = lTa.ca;
        sa = nArray5;
        QC = Pattern.compile(zOa.Y);
        ec = new int[fPa.i];
        Ad = uSa.E;
        Gb = Boolean.getBoolean(nQa.D);
        zb = new File(Kpa.J().p, xra.l);
        HB = new File(Kpa.J().p, MA);
        uc = new File(Kpa.J().p, mA);
        ya.limit(uSa.E);
        Ya.put(rua.t).position(uSa.E).limit(vRa.d);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void J(Rb rb, String string) {
        void var1_4;
        void b22 = var1_4;
        Rb a2 = rb;
        if (b22 == null) {
            String b22 = a2.getValueDefault();
        }
        switch (kB.I[a2.ordinal()]) {
            case 1: {
                void b22;
                tA = Config.J((String)b22, uSa.E);
                return;
            }
            case 2: {
                void b22;
                DA = Config.J((String)b22, vRa.d != 0);
                return;
            }
            case 3: {
                void b22;
                hA = Config.J((String)b22, vRa.d != 0);
                return;
            }
            case 4: {
                void b22;
                w = Config.J((String)b22, pqa.r);
                return;
            }
            case 5: {
                void b22;
                Oa = Config.J((String)b22, pqa.r);
                return;
            }
            case 6: {
                void b22;
                oB = Config.J((String)b22, Mqa.N);
                return;
            }
            case 7: {
                void b22;
                ib = Config.J((String)b22, vRa.d != 0);
                return;
            }
            case 8: {
                void b22;
                fc.J((String)b22);
                return;
            }
            case 9: {
                void b22;
                uB.J((String)b22);
                return;
            }
            case 10: {
                void b22;
                Ea = b22;
                return;
            }
            case 11: {
                void b22;
                yb = Config.J((String)b22, vRa.d != 0);
                return;
            }
            case 12: {
                void b22;
                e = Config.J((String)b22, vRa.d != 0);
                return;
            }
            case 13: {
                void b22;
                s = Config.J((String)b22, uSa.E);
                return;
            }
            case 14: {
                void b22;
                ab = Config.J((String)b22, uSa.E);
                return;
            }
            case 15: {
                void b22;
                JA = Config.J((String)b22, uSa.E);
                return;
            }
            case 16: {
                void b22;
                wa = Config.J((String)b22, uSa.E);
                return;
            }
            case 17: {
                void b22;
                wa = Config.J((String)b22, uSa.E);
                return;
            }
            case 18: {
                void b22;
                wa = Config.J((String)b22, uSa.E);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, Qra.a).append(a2).toString());
    }

    public static boolean D() {
        if (!WA.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String string, String string2) {
        String string3 = string;
        try {
            void a2;
            Object b2;
            Object object = b2 = new File(HB, new StringBuilder().insert(3 & 4, Gta.B).append(string3).toString());
            ((File)object).getParentFile().mkdirs();
            Config.J((File)object, (String)a2);
            return;
        }
        catch (IOException b2) {
            Config.J(new StringBuilder().insert(3 & 4, ERa.ja).append(string3).toString());
            b2.printStackTrace();
            return;
        }
    }

    private static void f(ub[] ubArray) {
        ub[] ubArray2 = ubArray;
        if (ubArray2 != null) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < ubArray2.length) {
                ub ub2 = ubArray2[a2];
                gLa.J(ub2.J().J());
                n2 = ++a2;
            }
        }
    }

    public static RB J(String a2) {
        return tc.J(a2, ja);
    }

    public static boolean A() {
        return uSa.E != 0;
    }

    public static void ma() {
        pA.e(vRa.d);
    }

    public static void Aa() {
        FloatBuffer floatBuffer = Wa;
        floatBuffer.clear();
        GL11.glGetFloat(TQa.g, floatBuffer);
        floatBuffer.get(o, uSa.E, ERa.C);
        Yc.J((float[])LB, (float[])o, (float[])ac);
        pA.J(qsa.Q, LB[uSa.E], LB[vRa.d], LB[uqa.g]);
    }

    public static void ga() {
        int n2;
        zc.J(NQa.a);
        if (l == null) {
            l = new dF();
        }
        Rb[] rbArray = Rb.values();
        int n3 = n2 = uSa.E;
        while (n3 < rbArray.length) {
            Rb rb = rbArray[n2];
            String string = rb.getPropertyKey();
            String string2 = pA.J(rb);
            l.setProperty(string, string2);
            n3 = ++n2;
        }
        try {
            FileWriter fileWriter = new FileWriter(uc);
            l.store(fileWriter, (String)null);
            fileWriter.close();
            return;
        }
        catch (Exception exception) {
            zc.f(new StringBuilder().insert(3 ^ 3, mPa.m).append(exception.getClass().getName()).append(Xpa.E).append(exception.getMessage()).toString());
            return;
        }
    }

    public static void ja() {
        YC = vRa.d;
        if (pa == uqa.g) {
            pA.e(yRa.d);
        }
    }

    public static int d(String string) {
        String string2 = string;
        int a2 = GL11.glGetError();
        if (a2 != 0 && uSa.E == 0) {
            if (a2 == MRa.Q) {
                int n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT(zsa.h);
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = a2;
                objectArray[vRa.d] = GLU.gluErrorString(a2);
                objectArray[uqa.g] = n2;
                objectArray[yRa.d] = string2;
                System.err.format(URa.N, objectArray);
                return a2;
            }
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a2;
            objectArray[vRa.d] = GLU.gluErrorString(a2);
            objectArray[uqa.g] = string2;
            System.err.format(eua.v, objectArray);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(int n2, String string, String string2) {
        int n3 = n2;
        pA.d(xTa.Ga);
        int c2 = ARBShaderObjects.glCreateProgramObjectARB();
        pA.d(NSa.a);
        if (c2 != 0) {
            void a2;
            String b2;
            E = uSa.E;
            gc = uSa.E;
            Nd = uSa.E;
            int n4 = pA.f(b2);
            int n5 = pA.C((String)a2);
            pA.d(NSa.a);
            if (n4 == 0 && n5 == 0) {
                ARBShaderObjects.glDeleteObjectARB(c2);
                c2 = uSa.E;
                return c2;
            }
            if (n4 != 0) {
                ARBShaderObjects.glAttachObjectARB(c2, n4);
                pA.d(gQa.v);
            }
            if (n5 != 0) {
                ARBShaderObjects.glAttachObjectARB(c2, n5);
                pA.d(gQa.v);
            }
            if (E) {
                ARBVertexShader.glBindAttribLocationARB(c2, hb, NTa.g);
                pA.d(NTa.g);
            }
            if (gc) {
                ARBVertexShader.glBindAttribLocationARB(c2, wb, qta.w);
                pA.d(qta.w);
            }
            if (Nd) {
                ARBVertexShader.glBindAttribLocationARB(c2, ra, aua.g);
                pA.d(aua.g);
            }
            ARBShaderObjects.glLinkProgramARB(c2);
            if (GL20.glGetProgrami(c2, FRa.G) != vRa.d) {
                zc.f(new StringBuilder().insert(3 ^ 3, JQa.d).append(c2).toString());
            }
            pA.J(c2, new StringBuilder().insert(3 ^ 3, b2).append(TOa.n).append((String)a2).toString());
            if (n4 != 0) {
                ARBShaderObjects.glDetachObjectARB(c2, n4);
                ARBShaderObjects.glDeleteObjectARB(n4);
            }
            if (n5 != 0) {
                ARBShaderObjects.glDetachObjectARB(c2, n5);
                ARBShaderObjects.glDeleteObjectARB(n5);
            }
            pA.Wc[n3] = c2;
            pA.e(n3);
            ARBShaderObjects.glValidateProgramARB(c2);
            pA.e(uSa.E);
            pA.J(c2, b2 + TOa.n + (String)a2);
            if (GL20.glGetProgrami(c2, iSa.r) != vRa.d) {
                b2 = SRa.b;
                pA.l(new StringBuilder().insert(3 & 4, wOa.l).append(b2).append(wB[n3]).append(b2).toString());
                ARBShaderObjects.glDeleteObjectARB(c2);
                c2 = uSa.E;
            }
        }
        return c2;
    }

    public static boolean i() {
        if (!WB.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean M() {
        if (!V.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void J(String string, IntBuffer intBuffer) {
        IntBuffer b2 = intBuffer;
        String a2 = string;
        StringBuilder stringBuilder = new StringBuilder(XOa.h);
        stringBuilder.append(a2).append(ISa.P).append(b2.position()).append(Bta.J).append(b2.limit()).append(pPa.q).append(b2.capacity()).append(xSa.Ga);
        int n2 = b2.limit();
        int n3 = uSa.E;
        int n4 = n3;
        while (n4 < n2) {
            stringBuilder.append(Tpa.E).append(b2.get(n3++));
            n4 = n3;
        }
        stringBuilder.append(XOa.D);
        zc.J(stringBuilder.toString());
    }

    private static RB[] f() {
        RB[] rBArray;
        try {
            int n2;
            rBArray = HC.J((IShaderPack)Rc, (String[])wB, lC);
            Properties properties = pA.J(Rc);
            int n3 = n2 = uSa.E;
            while (n3 < rBArray.length) {
                RB rB2 = rBArray[n2];
                String string = properties.getProperty(rB2.e());
                if (string != null) {
                    RB rB3 = rB2;
                    rB3.f();
                    if (!rB3.C(string)) {
                        Config.J(new StringBuilder().insert(3 >> 2, Xsa.g).append(rB2.e()).append(bpa.D).append(string).toString());
                    }
                }
                n3 = ++n2;
            }
        }
        catch (IOException iOException) {
            Config.J(new StringBuilder().insert(3 ^ 3, Bua.x).append(Rc.J()).toString());
            iOException.printStackTrace();
            return null;
        }
        return rBArray;
    }

    public static void Ia() {
        if (!eA) {
            if (DC >= yRa.d) {
                uKa.i((int)Qsa.j);
                GL11.glCopyTexSubImage2D(BQa.Z, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, zA, t);
                uKa.i((int)YSa.Ka);
            }
            uKa.J();
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.K();
            pA.e(kTa.j);
        }
    }

    private static void J(ub[] ubArray) {
        ub[] ubArray2 = ubArray;
        if (ubArray2 != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < ubArray2.length) {
                ub a2 = ubArray2[n2];
                uKa.i((int)(YSa.Ka + a2.J()));
                uKa.C((int)a2.J().J());
                n3 = ++n2;
            }
        }
    }

    private static IntBuffer J(int n2) {
        int n3 = n2;
        ByteBuffer byteBuffer = dB;
        int a2 = byteBuffer.limit();
        byteBuffer.position(a2).limit(a2 + n3 * AQa.P);
        return byteBuffer.asIntBuffer();
    }

    public static void f(String a2) {
        Ea = a2;
        l.setProperty(Rb.SHADER_PACK.getPropertyKey(), a2);
        pA.aa();
    }

    public static void Ka() {
        if (pd) {
            pA.e(yRa.d);
        }
    }

    public static void aa() {
        Object object;
        String string;
        boolean bl = Vc;
        int n2 = pA.C();
        Vc = uSa.E;
        if (Rc != null) {
            Rc.J();
            Rc = null;
            va.clear();
            lC.clear();
            ja = null;
            GB = null;
            Pb = null;
            yc.f();
            db.f();
            L.f();
            Z.f();
            pA.I();
        }
        int n3 = uSa.E;
        if (Config.ka()) {
            zc.J(new StringBuilder().insert(3 >> 2, Mqa.Ka).append(Config.i()).append(rRa.X).toString());
            n3 = vRa.d;
        }
        if (Config.m()) {
            zc.J(new StringBuilder().insert(5 >> 3, vTa.X).append(Config.d()).append(rRa.X).toString());
            n3 = vRa.d;
        }
        if (Config.ha()) {
            zc.J(aSa.M);
            n3 = vRa.d;
        }
        if (!(string = l.getProperty(Rb.SHADER_PACK.getPropertyKey(), md)).isEmpty() && !string.equals(Zb) && n3 == 0) {
            if (string.equals(md)) {
                Rc = new ShaderPackDefault();
                Vc = vRa.d;
            } else {
                try {
                    object = new File(HB, string);
                    if (object.isFile() && string.toLowerCase().endsWith(QTa.C)) {
                        Rc = new ShaderPackZip(string, (File)object);
                        Vc = vRa.d;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        if (Rc instanceof ShaderPackZip && !Gb && (object = Vw.J().J(new File(HB, string))) != Qx.ALLOWED) {
            Rc = null;
            Vc = uSa.E;
            Ea = Zb;
            l.setProperty(Rb.SHADER_PACK.getPropertyKey(), Zb);
        }
        if (Rc != null) {
            zc.J(new StringBuilder().insert(2 & 5, FRa.Ea).append(pA.J()).toString());
        } else {
            zc.J(Qta.i);
            Rc = new ShaderPackNone();
        }
        pA.s();
        pA.L();
        ja = pA.f();
        pA.H();
        int n4 = Vc != bl ? vRa.d : uSa.E;
        int n5 = n2 = pA.C() != n2 ? vRa.d : uSa.E;
        if (n4 != 0 || n2 != 0) {
            mka.J();
            pA.E();
            G.J();
        }
    }

    public static void Da() {
        if (pd) {
            pA.d(Jsa.Fa);
            pA.e(YC ? yRa.d : uqa.g);
            xb.J((Cb)Ac.J());
        }
    }

    private static void J(String a2) {
        pA.G.Ya.J().J((ld)new CY(a2));
    }

    public static int l(int a2) {
        pA.ec[pA.Ad * uqa.g + vRa.d] = ec[Ad * uqa.g + vRa.d] & jsa.U | a2 & yQa.j;
        return a2;
    }

    public static void J(Block a2) {
        pA.ec[(pA.Ad += vRa.d) * uqa.g] = Block.blockRegistry.J((ResourceLocation)((Object)a2)) & yQa.j | a2.J().ordinal() << ERa.C;
        pA.ec[pA.Ad * uqa.g + vRa.d] = uSa.E;
    }

    private static boolean J(Mda mda2) {
        Mda mda3 = mda2;
        if (mda3 == null) {
            return uSa.E != 0;
        }
        Object a2 = mda3.J();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!(a2 instanceof kda)) {
            return uSa.E != 0;
        }
        if ((a2 = ((kda)((Object)a2)).J()) == null) {
            return uSa.E != 0;
        }
        if (((Block)a2).J() == ez.TRANSLUCENT) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static RB[] J(Map<String, RB[]> map, RB[] rBArray) {
        void a2;
        int b232;
        RB[] rBArray2;
        Map<String, RB[]> map2 = map;
        HashSet<String> hashSet = new HashSet<String>();
        for (String b232 : map2.keySet()) {
            rBArray2 = map2.get(b232);
            int n2 = uSa.E;
            while (n2 < rBArray2.length) {
                int n3;
                RB rB2 = rBArray2[n3];
                if (rB2 != null) {
                    hashSet.add(rB2.e());
                }
                n2 = ++n3;
            }
        }
        ArrayList arrayList = new ArrayList();
        int n4 = b232 = uSa.E;
        while (n4 < ((void)a2).length) {
            String string;
            rBArray2 = a2[b232];
            if (rBArray2.l() && !hashSet.contains(string = rBArray2.e())) {
                arrayList.add(rBArray2);
            }
            n4 = ++b232;
        }
        Object object = arrayList;
        RB[] b232 = object.toArray(new RB[object.size()]);
        return b232;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(String string, String string2, String string3) {
        String string4 = string;
        int c2 = GL11.glGetError();
        if (c2 != 0) {
            void a2;
            void b2;
            Object[] objectArray = new Object[tTa.h];
            objectArray[uSa.E] = c2;
            objectArray[vRa.d] = GLU.gluErrorString(c2);
            objectArray[uqa.g] = string4;
            objectArray[yRa.d] = b2;
            objectArray[AQa.P] = a2;
            System.err.format(bpa.Ja, objectArray);
        }
        return c2;
    }

    public static InputStream J(String a2) {
        if (Rc == null) {
            return null;
        }
        return Rc.J(a2);
    }

    public static void ha() {
        qB = uSa.E;
    }

    public static void f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        GL11.glFogi(a2, b2);
        if (a2 == RQa.s) {
            xB = b2;
            if (Nc) {
                pA.J(ITa.g, xB);
            }
        }
    }

    public static void ia() {
        GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
        GL11.glBegin(XTa.W);
        GL11.glTexCoord2f(JPa.N, JPa.N);
        GL11.glVertex3f(JPa.N, JPa.N, JPa.N);
        GL11.glTexCoord2f(pqa.r, JPa.N);
        GL11.glVertex3f(pqa.r, JPa.N, JPa.N);
        GL11.glTexCoord2f(pqa.r, pqa.r);
        GL11.glVertex3f(pqa.r, pqa.r, JPa.N);
        GL11.glTexCoord2f(JPa.N, pqa.r);
        GL11.glVertex3f(JPa.N, pqa.r, JPa.N);
        GL11.glEnd();
    }

    public static void fa() {
    }

    public static void ka() {
        if (Pc) {
            Pc = uSa.E;
            zc.J(kpa.ha);
            for (Object v2 : G.J().J().values()) {
                if (!(v2 instanceof Ad)) continue;
                pA.J(((Ad)v2).J());
            }
        }
    }

    public static void Ha() {
    }

    public static void ca() {
        fua.J((float)(rB * pqa.r), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        pA.d(Wqa.T);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String J(Rb a2) {
        switch (kB.I[a2.ordinal()]) {
            case 1: {
                return Integer.toString(tA);
            }
            case 2: {
                return Boolean.toString(DA);
            }
            case 3: {
                return Boolean.toString(hA);
            }
            case 4: {
                return Float.toString(w);
            }
            case 5: {
                return Float.toString(Oa);
            }
            case 6: {
                return Float.toString(oB);
            }
            case 7: {
                return Boolean.toString(ib);
            }
            case 8: {
                return fc.l();
            }
            case 9: {
                return uB.l();
            }
            case 10: {
                return Ea;
            }
            case 11: {
                return Boolean.toString(yb);
            }
            case 12: {
                return Boolean.toString(e);
            }
            case 13: {
                return Integer.toString(s);
            }
            case 14: {
                return Integer.toString(ab);
            }
            case 15: {
                return Integer.toString(JA);
            }
            case 16: {
                return Integer.toString(wa);
            }
            case 17: {
                return Integer.toString(wa);
            }
            case 18: {
                return Integer.toString(wa);
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, Qra.a).append(a2).toString());
    }

    public static void Fa() {
        int n2;
        Object object;
        zc.J(Mqa.ca);
        try {
            if (!HB.exists()) {
                HB.mkdir();
            }
        }
        catch (Exception exception) {
            zc.f(new StringBuilder().insert(5 >> 3, NOa.n).append(HB).toString());
        }
        l = new dF();
        l.setProperty(Rb.SHADER_PACK.getPropertyKey(), Mqa.y);
        if (uc.exists()) {
            try {
                object = new FileReader(uc);
                l.load((Reader)object);
                ((InputStreamReader)object).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (!uc.exists()) {
            try {
                pA.ga();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        object = Rb.values();
        int n3 = n2 = uSa.E;
        while (n3 < ((Rb[])object).length) {
            Object object2 = object[n2];
            String string = object2.getPropertyKey();
            String string2 = object2.getValueDefault();
            pA.J((Rb)object2, l.getProperty(string, string2));
            n3 = ++n2;
        }
        pA.aa();
    }

    private static void J(File file) {
        File[] fileArray;
        File file2 = file;
        if (file2.exists() && file2.isDirectory() && (fileArray = file2.listFiles()) != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < fileArray.length) {
                File a2 = fileArray[n2];
                if (a2.isDirectory()) {
                    pA.J(a2);
                }
                a2.delete();
                n3 = ++n2;
            }
        }
    }

    public static void ba() {
        uKa.L();
        uKa.k();
    }

    public static boolean e() {
        if (!fc.J()) {
            return fc.f();
        }
        if (!db.J()) {
            return db.f();
        }
        return vRa.d != 0;
    }

    public static void v() {
        Nc = vRa.d;
        pA.J(ITa.g, xB);
    }

    public static void f(vL a2) {
        if (pd) {
            pA.e(ERa.C);
            pA.J(a2);
        }
    }

    public static ArrayList<String> J() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(Zb);
        arrayList.add(md);
        try {
            if (!HB.exists()) {
                HB.mkdir();
            }
            File[] fileArray = HB.listFiles();
            for (int i2 = uSa.E; i2 < fileArray.length; ++i2) {
                File file = fileArray[i2];
                String string = file.getName();
                if (!file.isFile() || !string.toLowerCase().endsWith(QTa.C)) continue;
                arrayList.add(string);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        Vw.J().J(HB);
        return arrayList;
    }

    public static void O() {
        Nc = uSa.E;
        pA.J(ITa.g, uSa.E);
    }

    public static void T() {
        pA.e(yRa.d);
    }

    public static void J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        pA.ec[(pA.Ad += vRa.d) * uqa.g] = a2 & yQa.j | b2 << ERa.C;
        pA.ec[pA.Ad * uqa.g + vRa.d] = uSa.E;
    }

    public static void X() {
        if (Jb) {
            pA.e(tTa.h);
            return;
        }
        if (pa == vRa.d) {
            pA.e(YC ? yRa.d : uqa.g);
        }
    }

    public static void J(vL vL2) {
        vL vL3 = vL2;
        if (pd && !eA && RB.J()) {
            int a2 = PIa.J((vL)vL3);
            RB.f(a2);
        }
    }

    public static void J(IntBuffer a2) {
        if (a2 == null) {
            a2 = ya;
        }
        if (xa != a2) {
            xa = a2;
            GL20.glDrawBuffers(xa);
        }
    }

    public static void V() {
        pA.d(cPa.Da);
        pA.e(cPa.Da);
        if (!eA) {
            pA.e(XTa.W);
        }
        pA.d(Cqa.i);
        pA.e(Cqa.i);
    }

    public static void N() {
        if (pd) {
            if (!eA) {
                pA.e(lqa.s);
                uKa.B();
                uKa.J(vRa.d != 0);
                return;
            }
            uKa.J(vRa.d != 0);
        }
    }

    public static void W() {
        if (Tc) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < Xa) {
                if ((FC & vRa.d << n2) != 0) {
                    uKa.i((int)(YSa.Ka + Nb[n2]));
                    GL11.glTexParameteri(BQa.Z, lQa.E, ITa.n);
                    GL30.glGenerateMipmap(BQa.Z);
                }
                n3 = ++n2;
            }
            uKa.i((int)YSa.Ka);
        }
    }

    public static void t() {
        if (DC >= uqa.g) {
            uKa.i((int)TOa.l);
            pA.d(kqa.d);
            GL11.glCopyTexSubImage2D(BQa.Z, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, zA, t);
            pA.d(QTa.b);
            uKa.i((int)YSa.Ka);
        }
        xb.J((Cb)Ac.J());
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, float f2, float f3, float f4) {
        String string2 = string;
        int d2 = Wc[pa];
        if (d2 != 0) {
            void a2;
            void b2;
            void c2;
            ARBShaderObjects.glUniform3fARB(ARBShaderObjects.glGetUniformLocationARB(d2, string2), (float)c2, (float)b2, (float)a2);
            pA.J(wB[pa], string2);
        }
    }

    public static void r() {
        if (pd) {
            xb.J((H)Ac);
            if (!eA) {
                pA.J(Ya);
            }
        }
    }

    public static void w() {
        if (!eA) {
            int n2;
            int n3;
            pA.d(aSa.q);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glMatrixMode(WPa.s);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho(aSa.V, oua.i, aSa.V, oua.i, aSa.V, oua.i);
            GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
            uKa.H();
            uKa.c();
            uKa.k();
            uKa.J();
            uKa.I((int)wOa.a);
            uKa.J(uSa.E != 0);
            uKa.L();
            if (B >= vRa.d) {
                uKa.i((int)zpa.A);
                uKa.C((int)Ma.get(uSa.E));
                if (B >= uqa.g) {
                    uKa.i((int)Fsa.Ga);
                    uKa.C((int)Ma.get(vRa.d));
                }
            }
            int n4 = n3 = uSa.E;
            while (n4 < Xa) {
                uKa.i((int)(YSa.Ka + Nb[n3]));
                uKa.C((int)HA[n3++]);
                n4 = n3;
            }
            uKa.i((int)Ssa.p);
            uKa.C((int)JB.get(uSa.E));
            if (DC >= uqa.g) {
                uKa.i((int)TOa.l);
                uKa.C((int)JB.get(vRa.d));
                if (DC >= yRa.d) {
                    uKa.i((int)Qsa.j);
                    uKa.C((int)JB.get(uqa.g));
                }
            }
            int n5 = n3 = uSa.E;
            while (n5 < ha) {
                uKa.i((int)(bRa.U + n3));
                uKa.C((int)bA.get(n3++));
                n5 = n3;
            }
            if (T) {
                uKa.i((int)(YSa.Ka + pA.Id.A));
                uKa.C((int)Id.J());
                GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
                GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
                GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
                GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
            }
            pA.J(SB);
            uKa.i((int)YSa.Ka);
            n3 = vRa.d;
            int n6 = n2 = uSa.E;
            while (n6 < Xa) {
                int n8 = rua.t + n2;
                n8 = Yqa.i + n2;
                EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, n7, BQa.Z, HA[n8], uSa.E);
                n6 = ++n2;
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, nka.Z, BQa.Z, JB.get(uSa.E), uSa.E);
            GL20.glDrawBuffers(fC);
            pA.d(pqa.h);
            n2 = uSa.E;
            int n9 = n2;
            while (n9 < Yqa.i) {
                if (Wc[wOa.h + n2] != 0) {
                    pA.e(wOa.h + n2);
                    pA.d(wB[wOa.h + n2]);
                    if (FC != 0) {
                        pA.W();
                    }
                    pA.ia();
                    int n10 = uSa.E;
                    while (n10 < Xa) {
                        int n11;
                        if (kC[wOa.h + n2][n11]) {
                            int n12 = LA[n11];
                            int n13 = pA.LA[n11] = Yqa.i - n12;
                            uKa.i((int)(YSa.Ka + Nb[n11]));
                            uKa.C((int)HA[n13 + n11]);
                            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, rua.t + n11, BQa.Z, HA[n12 + n11], uSa.E);
                        }
                        n10 = ++n11;
                    }
                    uKa.i((int)YSa.Ka);
                }
                n9 = ++n2;
            }
            pA.d(NTa.Q);
            K = uSa.E;
            G.J().J(vRa.d != 0);
            nka.J((int)nka.Q, (int)nka.l, (int)BQa.Z, (int)pA.G.J().i, (int)uSa.E);
            GL11.glViewport(uSa.E, uSa.E, pA.G.t, pA.G.k);
            if (FLa.ia) {
                int n11;
                boolean bl;
                int n12 = n2 = FLa.x != 0 ? vRa.d : uSa.E;
                if (n12 == 0) {
                    bl = vRa.d;
                    n11 = n2;
                } else {
                    bl = uSa.E;
                    n11 = n2;
                }
                uKa.J(n12 != 0, (boolean)bl, (n11 == 0 ? vRa.d : uSa.E) != 0, vRa.d != 0);
            }
            uKa.J(vRa.d != 0);
            GL11.glClearColor(rC, Kd, W, pqa.r);
            fua.J((int)EQa.ca);
            GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
            uKa.H();
            uKa.c();
            uKa.k();
            uKa.J();
            uKa.I((int)wOa.a);
            uKa.J(uSa.E != 0);
            pA.d(FTa.z);
            pA.e(ITa.A);
            pA.d(xqa.u);
            if (FC != 0) {
                pA.W();
            }
            pA.ia();
            pA.d(KSa.C);
            mC = vRa.d;
            uKa.P();
            uKa.H();
            uKa.K();
            uKa.B();
            uKa.I((int)Ira.A);
            uKa.J(vRa.d != 0);
            GL11.glPopMatrix();
            GL11.glMatrixMode(SQa.ca);
            GL11.glPopMatrix();
            pA.e(uSa.E);
        }
    }

    public static void J(int n2, int n3, int n4, int n5) {
        int d2 = n5;
        int a2 = n2;
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        if (eA) {
            GL11.glViewport(uSa.E, uSa.E, sb, ld);
            return;
        }
        GL11.glViewport(uSa.E, uSa.E, zA, t);
        EXTFramebufferObject.glBindFramebufferEXT(zsa.h, KC);
        K = vRa.d;
        uKa.h();
        uKa.J();
        pA.J(ya);
        pA.e(uqa.g);
        pA.d(FPa.r);
    }

    public static void S() {
        QA += vRa.d;
        Pc = vRa.d;
        zc.J(XOa.V);
        pA.G.Aa.J();
    }

    public static void J(Kpa a2) {
        pA.Q();
        G = a2;
        a2 = Kpa.J();
        kA = GLContext.getCapabilities();
        ZB = GL11.glGetString(zsa.ca);
        Ja = GL11.glGetString(PRa.m);
        dc = GL11.glGetString(Ora.J);
        zc.J(xra.g);
        zc.J(new StringBuilder().insert(2 & 5, yOa.f).append(ZB).toString());
        zc.J(new StringBuilder().insert(2 & 5, jRa.R).append(Ja).toString());
        zc.J(new StringBuilder().insert(5 >> 3, bRa.B).append(dc).toString());
        zc.J(new StringBuilder().insert(3 ^ 3, lTa.ha).append(pA.kA.OpenGL20 ? Tqa.j : pPa.I).append(pA.kA.OpenGL21 ? gQa.B : pPa.I).append(pA.kA.OpenGL30 ? bSa.f : pPa.I).append(pA.kA.OpenGL32 ? LRa.e : pPa.I).append(pA.kA.OpenGL40 ? QTa.x : pPa.I).toString());
        zc.J(new StringBuilder().insert(2 & 5, Sqa.e).append(GL11.glGetInteger(ATa.Ja)).toString());
        zc.J(new StringBuilder().insert(3 & 4, fPa.h).append(GL11.glGetInteger(Lra.j)).toString());
        zc.J(new StringBuilder().insert(3 >> 2, eta.y).append(GL11.glGetInteger(FTa.J)).toString());
        Tc = pA.kA.OpenGL30;
        pA.Fa();
    }

    public static void n() {
        pA.O();
        pA.C();
        pA.e(YC ? yRa.d : uqa.g);
    }

    private static int J(int n2, String string) {
        String b2 = string;
        int a2 = n2;
        if (a2 == 0) {
            if (b2.equals(EQa.Ga)) {
                return uSa.E;
            }
            if (b2.equals(Zpa.W)) {
                return vRa.d;
            }
            if (b2.equals(JQa.R)) {
                return uqa.g;
            }
            if (b2.equals(FPa.O)) {
                return yRa.d;
            }
            if (b2.equals(VQa.x) || b2.equals(Xpa.Z)) {
                return AQa.P;
            }
            if (b2.equals(Gta.ja)) {
                if (za) {
                    return tTa.h;
                }
                return AQa.P;
            }
            if (b2.equals(gsa.J)) {
                return tTa.h;
            }
            if (b2.equals(qQa.ia)) {
                return uua.p;
            }
            if (b2.equals(jRa.fa)) {
                return XTa.W;
            }
            if (b2.equals(zTa.m)) {
                return Yqa.i;
            }
            if (b2.equals(tua.Z)) {
                return WOa.fa;
            }
            if (b2.equals(KPa.U)) {
                return NTa.C;
            }
            if (b2.equals(Bta.k)) {
                return lqa.s;
            }
            if (b2.equals(tTa.Z) || b2.equals(vsa.p)) {
                return uua.s;
            }
            if (b2.equals(RQa.Ha)) {
                return hpa.Z;
            }
            if (b2.equals(WSa.ca)) {
                return Ypa.A;
            }
        }
        if (a2 == vRa.d) {
            if (b2.equals(Cra.r) || b2.equals(Cra.r)) {
                return uSa.E;
            }
            if (b2.equals(RQa.Ga) || b2.equals(LPa.O)) {
                return vRa.d;
            }
            if (b2.equals(SPa.q) || b2.equals(cTa.x)) {
                return uqa.g;
            }
            if (b2.equals(Jra.h) || b2.equals(NTa.Q)) {
                return yRa.d;
            }
            if (b2.equals(VQa.x) || b2.equals(Xpa.Z)) {
                return AQa.P;
            }
            if (b2.equals(Gta.ja)) {
                if (za) {
                    return tTa.h;
                }
                return AQa.P;
            }
            if (b2.equals(gsa.J)) {
                return tTa.h;
            }
            if (b2.equals(qQa.ia) || b2.equals(bqa.I)) {
                return uua.p;
            }
            if (b2.equals(BQa.x) || b2.equals(jRa.fa)) {
                return XTa.W;
            }
            if (b2.equals(uqa.B) || b2.equals(zTa.m)) {
                return Yqa.i;
            }
            if (b2.equals(Zta.q) || b2.equals(tua.Z)) {
                return WOa.fa;
            }
            if (b2.equals(Rua.f) || b2.equals(KPa.U)) {
                return NTa.C;
            }
            if (b2.equals(Bta.k)) {
                return pPa.f;
            }
            if (b2.equals(JQa.i)) {
                return lqa.s;
            }
            if (b2.equals(tTa.Z) || b2.equals(vsa.p)) {
                return uua.s;
            }
            if (b2.equals(RQa.Ha)) {
                return hpa.Z;
            }
            if (b2.equals(WSa.ca)) {
                return Ypa.A;
            }
        }
        return pua.o;
    }

    public static void x() {
        YC = uSa.E;
        if (pa == yRa.d) {
            pA.e(uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static ub[] J(Properties properties, int n2) {
        void a2;
        Properties properties2 = properties;
        String string = new StringBuilder().insert(3 >> 2, uQa.X).append(ka[a2]).append(VQa.ja).toString();
        ub[] ubArray = properties2.keySet();
        ArrayList<ub> arrayList = new ArrayList<ub>();
        for (String b222 : ubArray) {
            InputStream inputStream;
            int n3;
            String string2;
            block6: {
                if (!b222.startsWith(string)) continue;
                String string3 = b222.substring(string.length());
                string2 = properties2.getProperty(b222).trim();
                n3 = pA.J((int)a2, string3);
                if (n3 < 0) {
                    zc.C(new StringBuilder().insert(5 >> 3, Yra.m).append(b222).toString());
                    continue;
                }
                b222 = new StringBuilder().insert(3 ^ 3, Ata.h).append(cg.l((String)string2, (String)WSa.f)).toString();
                inputStream = Rc.J(b222);
                if (inputStream != null) break block6;
                zc.C(new StringBuilder().insert(3 & 4, Qta.I).append(string2).toString());
            }
            try {
                IOUtils.closeQuietly(inputStream);
                inputStream = new tB(b222);
                inputStream.J(G.J());
                ub ub2 = new ub(n3, b222, (H)((Object)inputStream));
                arrayList.add(ub2);
            }
            catch (IOException b222) {
                zc.C(new StringBuilder().insert(2 & 5, ERa.l).append(string2).toString());
                zc.C(new StringBuilder().insert(3 ^ 3, Mqa.y).append(b222.getClass().getName()).append(Xpa.E).append(b222.getMessage()).toString());
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        ArrayList<ub> arrayList2 = arrayList;
        ubArray = arrayList2.toArray(new ub[arrayList2.size()]);
        return ubArray;
    }

    public static void Q() {
        try {
            Class.forName(VQa.e);
        }
        catch (Throwable throwable) {
            return;
        }
        throw new RuntimeException(WQa.Ja);
    }

    private static void Z() {
        NB = pA.G.t;
        qB = pA.G.k;
        zA = Math.round((float)NB * w);
        t = Math.round((float)qB * w);
        pA.y();
    }

    private static RB[] f(RB[] rBArray) {
        int a22;
        RB[] rBArray2 = rBArray;
        ArrayList<RB> arrayList = new ArrayList<RB>();
        int n2 = a22 = uSa.E;
        while (n2 < rBArray2.length) {
            RB rB2 = rBArray2[a22];
            if (rB2.l()) {
                arrayList.add(rB2);
            }
            n2 = ++a22;
        }
        ArrayList<RB> arrayList2 = arrayList;
        RB[] a22 = arrayList2.toArray(new RB[arrayList2.size()]);
        return a22;
    }

    public static void p() {
        if (Jb) {
            pA.e(AQa.P);
            return;
        }
        if (pa == uqa.g || pa == yRa.d) {
            pA.e(vRa.d);
        }
    }

    private static int C(String string) {
        String string2 = string;
        int n2 = ARBShaderObjects.glCreateShaderObjectARB(vTa.fa);
        if (n2 == 0) {
            return uSa.E;
        }
        StringBuilder stringBuilder = new StringBuilder(BPa.D);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Rc.J(string2)));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB(n2);
            return uSa.E;
        }
        RB[] rBArray = pA.J(ja);
        ArrayList<String> arrayList = new ArrayList<String>();
        if (bufferedReader != null) {
            try {
                bufferedReader = HC.J((BufferedReader)bufferedReader, (String)string2, (IShaderPack)Rc, (int)uSa.E, arrayList, (int)uSa.E);
                while (true) {
                    Object object;
                    String a2;
                    if ((a2 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    String string3 = a2 = pA.J(a2, rBArray);
                    stringBuilder.append(string3).append((char)NTa.C);
                    if (string3.matches(WRa.c)) continue;
                    if (a2.matches(Jta.C)) {
                        if (B >= vRa.d) continue;
                        B = vRa.d;
                        continue;
                    }
                    if (a2.matches(MTa.v)) {
                        za = vRa.d;
                        if (B >= uqa.g) continue;
                        B = uqa.g;
                        continue;
                    }
                    if (a2.matches(vTa.b)) {
                        if (B >= vRa.d) continue;
                        B = vRa.d;
                        continue;
                    }
                    if (a2.matches(Nta.Y)) {
                        if (B >= uqa.g) continue;
                        B = uqa.g;
                        continue;
                    }
                    if (a2.matches(wPa.h)) {
                        if (ha >= vRa.d) continue;
                        ha = vRa.d;
                        continue;
                    }
                    if (a2.matches(dqa.t)) {
                        if (ha >= vRa.d) continue;
                        ha = vRa.d;
                        continue;
                    }
                    if (a2.matches(rRa.q)) {
                        if (ha >= uqa.g) continue;
                        ha = uqa.g;
                        continue;
                    }
                    if (a2.matches(xTa.l)) {
                        if (DC >= vRa.d) continue;
                        DC = vRa.d;
                        continue;
                    }
                    if (a2.matches(Ypa.D)) {
                        if (DC >= uqa.g) continue;
                        DC = uqa.g;
                        continue;
                    }
                    if (a2.matches(ppa.y)) {
                        if (DC >= yRa.d) continue;
                        DC = yRa.d;
                        continue;
                    }
                    if (a2.matches(rQa.Ia)) {
                        if (Rd[vRa.d] != rSa.Ka) continue;
                        pA.Rd[vRa.d] = PTa.Y;
                        continue;
                    }
                    if (Xa < tTa.h && a2.matches(aqa.j)) {
                        Xa = tTa.h;
                        continue;
                    }
                    if (Xa < uua.p && a2.matches(wua.t)) {
                        Xa = uua.p;
                        continue;
                    }
                    if (Xa < XTa.W && a2.matches(vpa.S)) {
                        Xa = XTa.W;
                        continue;
                    }
                    if (Xa < Yqa.i && a2.matches(Psa.R)) {
                        Xa = Yqa.i;
                        continue;
                    }
                    if (Xa < tTa.h && a2.matches(vPa.t)) {
                        Xa = tTa.h;
                        continue;
                    }
                    if (Xa < uua.p && a2.matches(oua.A)) {
                        Xa = uua.p;
                        continue;
                    }
                    if (Xa < XTa.W && a2.matches(Bra.ja)) {
                        Xa = XTa.W;
                        continue;
                    }
                    if (Xa < Yqa.i && a2.matches(Qpa.x)) {
                        Xa = Yqa.i;
                        continue;
                    }
                    if (a2.matches(fpa.k)) {
                        c = vRa.d;
                        continue;
                    }
                    String string4 = a2;
                    if (a2.matches(xSa.Q)) {
                        object = string4.split(yRa.ia, AQa.P);
                        zc.J(new StringBuilder().insert(2 & 5, nOa.ca).append(object[uqa.g]).toString());
                        J = h = Integer.parseInt(object[uqa.g]);
                        sb = ld = Math.round((float)J * Oa);
                        continue;
                    }
                    String string5 = a2;
                    if (string4.matches(rQa.d)) {
                        object = string5.split(wra.r);
                        zc.J(new StringBuilder().insert(5 >> 3, nOa.ca).append(object[vRa.d]).toString());
                        J = h = Integer.parseInt(object[vRa.d]);
                        sb = ld = Math.round((float)J * Oa);
                        continue;
                    }
                    String string6 = a2;
                    if (string5.matches(cRa.x)) {
                        object = string6.split(yRa.ia, AQa.P);
                        zc.J(new StringBuilder().insert(3 ^ 3, ZOa.Ka).append(object[uqa.g]).toString());
                        S = Float.parseFloat(object[uqa.g]);
                        Fa = uSa.E;
                        continue;
                    }
                    String string7 = a2;
                    if (string6.matches(hpa.q)) {
                        object = string7.split(yRa.ia, AQa.P);
                        zc.J(new StringBuilder().insert(3 & 4, dpa.Q).append(object[uqa.g]).toString());
                        D = Float.parseFloat(object[uqa.g]);
                        Fa = vRa.d;
                        continue;
                    }
                    String string8 = a2;
                    if (string7.matches(AQa.q)) {
                        object = string8.split(wra.r);
                        zc.J(new StringBuilder().insert(3 & 4, vsa.P).append(object[vRa.d]).toString());
                        D = Float.parseFloat(object[vRa.d]);
                        Fa = vRa.d;
                        continue;
                    }
                    String string9 = a2;
                    if (string8.matches(asa.h)) {
                        object = string9.split(wra.r);
                        zc.J(new StringBuilder().insert(2 & 5, Ura.E).append(object[vRa.d]).toString());
                        Sb = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    String string10 = a2;
                    if (string9.matches(WRa.Aa)) {
                        object = string10.split(wra.r);
                        zc.J(new StringBuilder().insert(3 & 4, Bsa.Q).append(object[vRa.d]).toString());
                        wA = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    if (string10.matches(osa.L)) {
                        zc.J(Jqa.U);
                        Arrays.fill(aC, vRa.d != 0);
                        continue;
                    }
                    if (a2.matches(Ppa.z)) {
                        zc.J(Yra.S);
                        Arrays.fill(VC, vRa.d != 0);
                        continue;
                    }
                    if (a2.matches(Zqa.g)) {
                        zc.J(hpa.O);
                        Arrays.fill(n, vRa.d != 0);
                        continue;
                    }
                    if (a2.matches(fsa.Z)) {
                        zc.J(Cra.R);
                        pA.n[uSa.E] = vRa.d;
                        continue;
                    }
                    if (a2.matches(dua.m)) {
                        zc.J(MTa.N);
                        pA.n[vRa.d] = vRa.d;
                        continue;
                    }
                    if (a2.matches(cra.b)) {
                        zc.J(kua.q);
                        pA.aC[uSa.E] = vRa.d;
                        continue;
                    }
                    if (a2.matches(JPa.x)) {
                        zc.J(dqa.Q);
                        pA.aC[vRa.d] = vRa.d;
                        continue;
                    }
                    if (a2.matches(rSa.M)) {
                        zc.J(MTa.Ia);
                        pA.VC[uSa.E] = vRa.d;
                        continue;
                    }
                    if (a2.matches(BRa.c)) {
                        zc.J(LQa.Ia);
                        pA.VC[vRa.d] = vRa.d;
                        continue;
                    }
                    if (a2.matches(fta.K)) {
                        zc.J(Rua.W);
                        pA.MC[uSa.E] = vRa.d;
                        continue;
                    }
                    if (a2.matches(kTa.ha)) {
                        zc.J(NPa.P);
                        pA.MC[vRa.d] = vRa.d;
                        continue;
                    }
                    if (a2.matches(ZRa.X)) {
                        zc.J(hpa.t);
                        pA.na[uSa.E] = vRa.d;
                        continue;
                    }
                    if (a2.matches(NQa.w)) {
                        zc.J(Bpa.r);
                        pA.na[vRa.d] = vRa.d;
                        continue;
                    }
                    String string11 = a2;
                    if (a2.matches(zOa.S)) {
                        object = string11.split(yRa.ia, AQa.P);
                        zc.J(new StringBuilder().insert(5 >> 3, xOa.G).append(object[uqa.g]).toString());
                        bC = Float.parseFloat(object[uqa.g]);
                        continue;
                    }
                    String string12 = a2;
                    if (string11.matches(Sqa.o)) {
                        object = string12.split(wra.r);
                        zc.J(new StringBuilder().insert(3 >> 2, xOa.G).append(object[vRa.d]).toString());
                        bC = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    String string13 = a2;
                    if (string12.matches(Epa.o)) {
                        object = string13.split(yRa.ia, AQa.P);
                        zc.J(new StringBuilder().insert(0, bRa.k).append(object[uqa.g]).toString());
                        hd = Float.parseFloat(object[uqa.g]);
                        continue;
                    }
                    String string14 = a2;
                    if (string13.matches(RQa.l)) {
                        object = string14.split(wra.r);
                        zc.J(new StringBuilder().insert(0, bRa.k).append(object[vRa.d]).toString());
                        hd = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    String string15 = a2;
                    if (string14.matches(ERa.e)) {
                        object = string15.split(wra.r);
                        zc.J(new StringBuilder().insert(0, kra.s).append(object[vRa.d]).toString());
                        Tb = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    String string16 = a2;
                    if (string15.matches(Qta.o)) {
                        object = string16.split(wra.r);
                        zc.J(new StringBuilder().insert(0, sSa.L).append(object[vRa.d]).toString());
                        TC = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    String string17 = a2;
                    if (string16.matches(cQa.r)) {
                        object = string17.split(wra.r);
                        zc.J(new StringBuilder().insert(0, EPa.V).append(object[vRa.d]).toString());
                        rB = Float.parseFloat(object[vRa.d]);
                        continue;
                    }
                    String string18 = a2;
                    if (string17.matches(vqa.q)) {
                        object = string18.split(wra.r);
                        zc.J(new StringBuilder().insert(0, kua.ha).append(object[vRa.d]).toString());
                        bc = Config.J(Float.parseFloat(object[vRa.d]), JPa.N, pqa.r);
                        continue;
                    }
                    if (string18.matches(NSa.e)) {
                        object = a2.split(wra.r);
                        int n3 = Integer.parseInt(object[vRa.d]);
                        if (n3 > vRa.d) {
                            zc.J(new StringBuilder().insert(0, Gta.f).append(n3).append(rRa.X).toString());
                            od = n3;
                            continue;
                        }
                        od = vRa.d;
                        continue;
                    }
                    String string19 = a2;
                    if (a2.matches(BRa.m)) {
                        object = string19.split(wra.r);
                        zc.J(Bpa.q);
                        zc.J(new StringBuilder().insert(0, Bta.h).append((String)object[vRa.d]).toString());
                        y = Integer.parseInt((String)object[vRa.d]);
                        T = vRa.d;
                        continue;
                    }
                    if (string19.matches(Jta.M)) {
                        object = cc.matcher(a2);
                        ((Matcher)object).matches();
                        Object object2 = object;
                        String string20 = ((Matcher)object2).group(vRa.d);
                        String string21 = ((Matcher)object2).group(uqa.g);
                        int n4 = pA.l(string20);
                        int n5 = pA.J(string21);
                        if (n4 < 0 || n5 == 0) continue;
                        pA.Rd[n4] = n5;
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = string20;
                        objectArray[vRa.d] = string21;
                        zc.J(Psa.I, objectArray);
                        continue;
                    }
                    if (a2.matches(lPa.U)) {
                        if (!string2.matches(yta.R)) continue;
                        object = Da.matcher(a2);
                        ((Matcher)object).matches();
                        String string22 = ((Matcher)object).group(vRa.d);
                        int n6 = pA.l(string22);
                        if (n6 < 0) continue;
                        pA.Od[n6] = uSa.E;
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = string22;
                        zc.J(Psa.T, objectArray);
                        continue;
                    }
                    if (a2.matches(ROa.V)) {
                        zc.J(wta.I);
                        pA.Rd[XTa.W] = PTa.Y;
                        continue;
                    }
                    if (a2.matches(Pua.D)) {
                        zc.J(bRa.Ga);
                        pA.Rd[XTa.W] = hqa.S;
                        continue;
                    }
                    if (a2.matches(iPa.f)) {
                        zc.J(Vua.v);
                        pA.Rd[XTa.W] = Vra.U;
                        continue;
                    }
                    if (a2.matches(cPa.u)) {
                        if (!string2.matches(yta.R) && !string2.matches(cra.i)) continue;
                        object = pb.matcher(a2);
                        ((Matcher)object).matches();
                        String string23 = ((Matcher)object).group(vRa.d);
                        int n7 = pA.l(string23);
                        if (n7 < 0) continue;
                        v |= vRa.d << n7;
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = string23;
                        zc.J(Usa.j, objectArray);
                        continue;
                    }
                    if (!a2.matches(Pqa.Ha)) continue;
                    object = a2.split(yRa.ia, AQa.P);
                    TB = object[uqa.g];
                }
            }
            catch (Exception a2) {
                zc.f(new StringBuilder().insert(0, rta.Z).append(string2).append(dqa.O).toString());
                a2.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(n2);
                return uSa.E;
            }
        }
        if (kB) {
            pA.J(string2, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB(n2, stringBuilder);
        ARBShaderObjects.glCompileShaderARB(n2);
        if (GL20.glGetShaderi(n2, DQa.y) != vRa.d) {
            zc.f(new StringBuilder().insert(0, tua.Ma).append(string2).toString());
        }
        pA.J(n2, string2, arrayList);
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(String string, String string2) {
        String string3 = string;
        int b2 = GL11.glGetError();
        if (b2 != 0) {
            void a2;
            Object[] objectArray = new Object[AQa.P];
            objectArray[uSa.E] = b2;
            objectArray[vRa.d] = GLU.gluErrorString(b2);
            objectArray[uqa.g] = string3;
            objectArray[yRa.d] = a2;
            System.err.format(Asa.i, objectArray);
        }
        return b2;
    }

    public static void R() {
        pA.d(Tqa.J);
        pA.e(Tqa.J);
        if (!eA) {
            pA.e(XTa.W);
        }
        pA.d(mPa.Q);
        pA.e(mPa.Q);
    }

    public static void M(int a2) {
        uKa.J((int)a2);
        if (Nc) {
            pA.J(ITa.g, a2);
        }
    }

    public static void Y() {
        pA.e(uqa.g);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(int n2) {
        int n3 = n2;
        pA.d(MRa.Aa);
        if (eA) {
            n3 = Fsa.d;
            if (Wc[Fsa.d] == 0) {
                ub = uSa.E;
                return;
            }
        }
        if (pa != n3) {
            pa = n3;
            ARBShaderObjects.glUseProgramObjectARB(Wc[n3]);
            if (Wc[n3] == 0) {
                ub = uSa.E;
                return;
            }
            if (pA.J(POa.F, wB[n3]) != 0) {
                pA.Wc[n3] = uSa.E;
            }
            IntBuffer a22 = jA[n3];
            if (K) {
                pA.J(a22);
                pA.J(wB[n3], Ira.Ha, O[n3]);
            }
            FC = d[n3];
            Y.J(Wc[pa]);
            RB.J(Wc[pa]);
            Lc.J(Wc[pa]);
            switch (n3) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 16: 
                case 18: 
                case 19: 
                case 20: {
                    ub = vRa.d;
                    pA.J(EQa.Ga, uSa.E);
                    pA.J(Zpa.W, vRa.d);
                    pA.J(JQa.R, uqa.g);
                    pA.J(FPa.O, yRa.d);
                    pA.J(Gta.ja, za ? tTa.h : AQa.P);
                    pA.J(Xpa.Z, AQa.P);
                    pA.J(VQa.x, AQa.P);
                    pA.J(gsa.J, tTa.h);
                    pA.J(qQa.ia, uua.p);
                    if (qd != null) {
                        pA.J(jRa.fa, XTa.W);
                        pA.J(zTa.m, Yqa.i);
                        pA.J(tua.Z, WOa.fa);
                        pA.J(KPa.U, NTa.C);
                    }
                    pA.J(Bta.k, lqa.s);
                    pA.J(vsa.p, uua.s);
                    pA.J(tTa.Z, uua.s);
                    pA.J(RQa.Ha, hpa.Z);
                    pA.J(WSa.ca, Ypa.A);
                    break;
                }
                default: {
                    ub = uSa.E;
                    break;
                }
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: {
                    ub = uSa.E;
                    pA.J(Vua.r, uSa.E);
                    pA.J(LPa.O, vRa.d);
                    pA.J(cTa.x, uqa.g);
                    pA.J(NTa.Q, yRa.d);
                    pA.J(jRa.fa, XTa.W);
                    pA.J(zTa.m, Yqa.i);
                    pA.J(tua.Z, WOa.fa);
                    pA.J(KPa.U, NTa.C);
                    pA.J(Cra.r, uSa.E);
                    pA.J(RQa.Ga, vRa.d);
                    pA.J(SPa.q, uqa.g);
                    pA.J(Jra.h, yRa.d);
                    pA.J(BQa.x, XTa.W);
                    pA.J(uqa.B, Yqa.i);
                    pA.J(Zta.q, WOa.fa);
                    pA.J(Rua.f, NTa.C);
                    pA.J(Gta.ja, za ? tTa.h : AQa.P);
                    pA.J(Xpa.Z, AQa.P);
                    pA.J(VQa.x, AQa.P);
                    pA.J(gsa.J, tTa.h);
                    pA.J(bqa.I, uua.p);
                    pA.J(qQa.ia, uua.p);
                    pA.J(Bta.k, pPa.f);
                    pA.J(JQa.i, lqa.s);
                    pA.J(vsa.p, uua.s);
                    pA.J(tTa.Z, uua.s);
                    pA.J(RQa.Ha, hpa.Z);
                    pA.J(WSa.ca, Ypa.A);
                    break;
                }
                case 30: 
                case 31: 
                case 32: {
                    pA.J(tSa.e, uSa.E);
                    pA.J(EQa.Ga, uSa.E);
                    pA.J(Zpa.W, vRa.d);
                    pA.J(JQa.R, uqa.g);
                    pA.J(FPa.O, yRa.d);
                    pA.J(Gta.ja, za ? tTa.h : AQa.P);
                    pA.J(Xpa.Z, AQa.P);
                    pA.J(VQa.x, AQa.P);
                    pA.J(gsa.J, tTa.h);
                    if (qd != null) {
                        pA.J(jRa.fa, XTa.W);
                        pA.J(zTa.m, Yqa.i);
                        pA.J(tua.Z, WOa.fa);
                        pA.J(KPa.U, NTa.C);
                    }
                    pA.J(vsa.p, uua.s);
                    pA.J(tTa.Z, uua.s);
                    pA.J(RQa.Ha, hpa.Z);
                    pA.J(WSa.ca, Ypa.A);
                }
            }
            a22 = pA.G.c != null ? pA.G.c.J() : null;
            eAa eAa2 = a22 != null ? a22.J() : null;
            int a22 = pua.o;
            Block block = null;
            if (eAa2 != null) {
                a22 = eAa.C.J((Object)eAa2);
                block = Block.blockRegistry.J((ResourceLocation)a22);
            }
            int n4 = block != null ? block.f() : uSa.E;
            pA.J(Psa.Aa, a22);
            pA.J(gsa.Da, n4);
            pA.J(ITa.g, Nc ? xB : uSa.E);
            pA.J(rRa.ga, IA, XC, JC);
            pA.J(vua.N, lA, Gc, mB);
            pA.J(IPa.i, (int)(Md % dua.Aa));
            pA.J(uOa.Y, (int)(Md / dua.Aa));
            pA.J(EPa.R, gd);
            pA.J(aPa.U, Jc);
            pA.J(Zua.U, iB);
            pA.J(nQa.Q, Oc);
            pA.J(Jra.N, rA);
            pA.J(Pqa.r, Aa);
            pA.J(ATa.Ha, Yc);
            pA.J(sOa.la, (float)zA / (float)t);
            pA.J(Lra.q, (float)zA);
            pA.J(Tqa.A, (float)t);
            pA.J(aQa.c, Yqa.C);
            pA.J(NOa.I, (float)(pA.G.z.kc * ERa.C));
            pA.J(nOa.S, UB[uSa.E], UB[vRa.d], UB[uqa.g]);
            pA.J(KTa.s, Ka[uSa.E], Ka[vRa.d], Ka[uqa.g]);
            pA.J(WQa.Q, FB[uSa.E], FB[vRa.d], FB[uqa.g]);
            pA.J(qsa.Q, LB[uSa.E], LB[vRa.d], LB[uqa.g]);
            pA.J(gua.M, (float)Ab, (float)YA, (float)Db);
            pA.J(JQa.S, (float)Sc, (float)lB, (float)Ub);
            pA.J(JQa.K, uSa.E != 0, Bd);
            pA.J(Tqa.l, uSa.E != 0, EB);
            pA.J(RPa.V, uSa.E != 0, wc);
            pA.J(Lqa.g, uSa.E != 0, pB);
            pA.J(ATa.f, uSa.E != 0, Sa);
            pA.J(isa.Ga, uSa.E != 0, a);
            if (B > 0) {
                pA.J(zpa.Y, uSa.E != 0, Ta);
                pA.J(Uta.l, uSa.E != 0, CC);
                pA.J(Lqa.G, uSa.E != 0, m);
                pA.J(KTa.H, uSa.E != 0, Bb);
            }
            pA.J(zpa.Ha, I);
            pA.J(isa.C, YB);
            pA.J(uRa.U, Xb & yQa.j, Xb >> ERa.C);
            pA.J(zTa.ca, Math.round(yC), Math.round(Va));
            pA.J(ZRa.q, pA[uSa.E], pA[vRa.d]);
            pA.J(jsa.Ja, jC);
            pA.J(dua.r, jc);
            pA.J(fPa.K, gA);
            pA.J(Mqa.v, Vb);
            pA.J(zua.r, pA.G.z.pa);
            pA.J(ZSa.ha, pA.G.z.ba ? vRa.d : uSa.E);
            pA.J(kpa.k, ea);
            pA.J(Xpa.T, tC, g);
            pA.J(POa.F, wB[n3]);
        }
    }

    public static void U() {
        pA.G.U.f();
    }

    public static boolean d() {
        return Ca;
    }

    public static void P() {
        uKa.k();
        pA.e(yRa.d);
    }

    public static void f(uY a2) {
        if (pd) {
            pA.d(iPa.Da);
            pA.e(uua.s);
            pA.J(a2);
        }
    }

    private static IntBuffer J(IntBuffer intBuffer) {
        int a2;
        IntBuffer intBuffer2;
        IntBuffer intBuffer3 = intBuffer2 = intBuffer;
        int n2 = intBuffer3.limit();
        int n3 = a2 = intBuffer3.position();
        while (n3 < n2) {
            intBuffer2.put(a2++, uSa.E);
            n3 = a2;
        }
        return intBuffer2;
    }

    public static void J(float f2) {
        float f3 = f2;
        vL a2 = G.J();
        double d2 = a2.V + (a2.la - a2.V) * (double)f3;
        vL vL2 = a2;
        double d3 = a2.Ga + (vL2.Z - a2.Ga) * (double)f3;
        double d4 = vL2.Ca + (a2.A - a2.Ca) * (double)f3;
        Sc = d2;
        lB = d3;
        Ub = d4;
        GL11.glGetFloat(Ppa.Q, (FloatBuffer)pB.position(uSa.E));
        Yc.J((FloatBuffer)((FloatBuffer)Sa.position(uSa.E)), (FloatBuffer)((FloatBuffer)pB.position(uSa.E)), (float[])UA, (float[])nB);
        pB.position(uSa.E);
        Sa.position(uSa.E);
        GL11.glGetFloat(TQa.g, (FloatBuffer)Bd.position(uSa.E));
        Yc.J((FloatBuffer)((FloatBuffer)EB.position(uSa.E)), (FloatBuffer)((FloatBuffer)Bd.position(uSa.E)), (float[])VA, (float[])Ed);
        Bd.position(uSa.E);
        EB.position(uSa.E);
        pA.d(Jra.b);
    }

    private static FloatBuffer J(int n2) {
        int n3 = n2;
        ByteBuffer byteBuffer = dB;
        int a2 = byteBuffer.limit();
        byteBuffer.position(a2).limit(a2 + n3 * AQa.P);
        return byteBuffer.asFloatBuffer();
    }

    public static void J(uY uY2) {
        uY uY3 = uY2;
        if (pd && !eA && Lc.J()) {
            int a2 = Block.J(uY3.J());
            Lc.f(a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(int n2, String string) {
        int n3 = n2;
        Object b2 = BufferUtils.createIntBuffer(vRa.d);
        ARBShaderObjects.glGetObjectParameterARB(n3, WSa.J, (IntBuffer)b2);
        int n4 = ((IntBuffer)b2).get();
        if (n4 > vRa.d) {
            void a2;
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer(n4);
            ((IntBuffer)b2).flip();
            ARBShaderObjects.glGetInfoLogARB(n3, (IntBuffer)b2, byteBuffer);
            b2 = new byte[n4];
            byteBuffer.get((byte[])b2);
            if (b2[n4 - vRa.d] == false) {
                b2[n4 - vRa.d] = NTa.C;
            }
            b2 = new String((byte[])b2);
            zc.J(new StringBuilder().insert(5 >> 3, Fpa.X).append((String)a2).append(SPa.O).append((String)b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public static boolean J(String string) {
        String string2 = string;
        if (string2 == null) {
            return uSa.E != 0;
        }
        if (string2.length() <= 0) {
            return uSa.E != 0;
        }
        int a2 = string2.lastIndexOf(WSa.f);
        if (a2 >= 0) {
            string2 = string2.substring(a2 + vRa.d);
        }
        return Arrays.asList(wB).contains(string2);
    }

    private static void s() {
        va = new HashMap<String, String>();
        if (Vc) {
            ArrayList<String> arrayList = new ArrayList<String>();
            String string = POa.V;
            String iterator2 = NOa.h;
            Object object = ppa.fa;
            arrayList.add((String)string + iterator2 + (String)object);
            if (!Config.J().pb.equals(iterator2)) {
                arrayList.add(new StringBuilder().insert(3 ^ 3, string).append(Config.J().pb).append((String)object).toString());
            }
            try {
                for (String string2 : arrayList) {
                    InputStream inputStream = Rc.J(string2);
                    if (inputStream == null) continue;
                    object = new Properties();
                    InputStream inputStream2 = inputStream;
                    Object object2 = object;
                    Kg.J(inputStream2, (Map)object2);
                    inputStream2.close();
                    Iterator<Object> iterator = ((Properties)object2).keySet().iterator();
                    while (iterator.hasNext()) {
                        Iterator<Object> iterator3;
                        Object object3 = iterator3.next();
                        String string3 = ((Properties)object).getProperty((String)object3);
                        va.put((String)object3, string3);
                        iterator = iterator3;
                    }
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static void y() {
        if (KC != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(KC);
            uKa.J((IntBuffer)JB);
            uKa.J((IntBuffer)tc);
        }
        KC = EXTFramebufferObject.glGenFramebuffersEXT();
        GL11.glGenTextures((IntBuffer)JB.clear().limit(DC));
        GL11.glGenTextures((IntBuffer)tc.clear().limit(ERa.C));
        JB.position(uSa.E);
        tc.position(uSa.E);
        tc.get(HA).position(uSa.E);
        EXTFramebufferObject.glBindFramebufferEXT(zsa.h, KC);
        GL20.glDrawBuffers(uSa.E);
        GL11.glReadBuffer(uSa.E);
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < DC) {
            uKa.C((int)JB.get(n2));
            GL11.glTexParameteri(BQa.Z, LQa.P, Zua.o);
            GL11.glTexParameteri(BQa.Z, pQa.n, Zua.o);
            GL11.glTexParameteri(BQa.Z, lQa.E, hqa.s);
            GL11.glTexParameteri(BQa.Z, wua.C, hqa.s);
            GL11.glTexParameteri(BQa.Z, zpa.p, hTa.Ja);
            GL11.glTexImage2D(BQa.Z, uSa.E, pPa.G, zA, t, uSa.E, pPa.P, Sqa.la, (FloatBuffer)null);
            n3 = ++n2;
        }
        EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, NOa.r, BQa.Z, JB.get(uSa.E), uSa.E);
        GL20.glDrawBuffers(fC);
        GL11.glReadBuffer(uSa.E);
        pA.d(GPa.L);
        n2 = uSa.E;
        int n4 = n2;
        while (n4 < Xa) {
            uKa.C((int)HA[n2]);
            GL11.glTexParameteri(BQa.Z, LQa.P, Zua.o);
            GL11.glTexParameteri(BQa.Z, pQa.n, Zua.o);
            GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            GL11.glTexImage2D(BQa.Z, uSa.E, Rd[n2], zA, t, uSa.E, NSa.U, aua.N, (ByteBuffer)null);
            int n5 = rua.t + n2;
            int n6 = HA[n2];
            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, n5, BQa.Z, n6, uSa.E);
            pA.d(uqa.Ka);
            n4 = ++n2;
        }
        int n7 = n2 = uSa.E;
        while (n7 < Xa) {
            uKa.C((int)HA[Yqa.i + n2]);
            GL11.glTexParameteri(BQa.Z, LQa.P, Zua.o);
            GL11.glTexParameteri(BQa.Z, pQa.n, Zua.o);
            GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            int n8 = Rd[n2];
            GL11.glTexImage2D(BQa.Z, uSa.E, n8, zA, t, uSa.E, NSa.U, aua.N, (ByteBuffer)null);
            pA.d(MQa.c);
            n7 = ++n2;
        }
        n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT(zsa.h);
        if (n2 == bSa.C) {
            int n9;
            pA.l(uSa.ga);
            int n10 = n9 = uSa.E;
            while (n10 < Xa) {
                uKa.C((int)tc.get(n9));
                GL11.glTexImage2D(BQa.Z, uSa.E, rSa.Ka, zA, t, uSa.E, NSa.U, aua.N, (ByteBuffer)null);
                int n11 = rua.t + n9;
                int n12 = tc.get(n9);
                EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, n11, BQa.Z, n12, uSa.E);
                pA.d(uqa.Ka);
                n10 = ++n9;
            }
            n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT(zsa.h);
            if (n2 == Iqa.Aa) {
                zc.J(fpa.ka);
            }
        }
        uKa.C((int)uSa.E);
        if (n2 != Iqa.Aa) {
            pA.l(new StringBuilder().insert(2 & 5, WPa.W).append(n2).append(hpa.b).toString());
            return;
        }
        zc.J(Vua.G);
    }

    public static void u() {
        Jb = vRa.d;
        Nc = vRa.d;
        pA.J(fC);
        pA.e(tTa.h);
        pA.J(rQa.p, uSa.E);
    }

    public static RB[] J(RB[] rBArray) {
        int a22;
        RB[] rBArray2 = rBArray;
        ArrayList<RB> arrayList = new ArrayList<RB>();
        int n2 = a22 = uSa.E;
        while (n2 < rBArray2.length) {
            RB rB2 = rBArray2[a22];
            if (rB2.C() && rB2.J()) {
                arrayList.add(rB2);
            }
            n2 = ++a22;
        }
        ArrayList<RB> arrayList2 = arrayList;
        RB[] a22 = arrayList2.toArray(new RB[arrayList2.size()]);
        return a22;
    }

    public static void q() {
        block30: {
            int n2;
            Object object;
            String string;
            int n3;
            int n4;
            if (!Hb) {
                Hb = vRa.d;
                n4 = vRa.d;
            } else {
                n4 = uSa.E;
            }
            if (pC) break block30;
            pA.d(fpa.ja);
            if (pA.J() != null) {
                // empty if block
            }
            if (!pA.kA.OpenGL20) {
                pA.l(NTa.G);
            }
            if (!pA.kA.GL_EXT_framebuffer_object) {
                pA.l(TPa.s);
            }
            fC.position(uSa.E).limit(Yqa.i);
            tc.position(uSa.E).limit(ERa.C);
            JB.position(uSa.E).limit(yRa.d);
            Qc.position(uSa.E).limit(Yqa.i);
            Ma.position(uSa.E).limit(uqa.g);
            bA.position(uSa.E).limit(Yqa.i);
            Xa = AQa.P;
            DC = vRa.d;
            ha = uSa.E;
            B = uSa.E;
            Cb = vRa.d;
            C = vRa.d;
            Arrays.fill(Rd, rSa.Ka);
            Arrays.fill(Od, vRa.d != 0);
            Arrays.fill(n, uSa.E != 0);
            Arrays.fill(aC, uSa.E != 0);
            Arrays.fill(MC, uSa.E != 0);
            Arrays.fill(VC, uSa.E != 0);
            Arrays.fill(na, uSa.E != 0);
            c = uSa.E;
            T = uSa.E;
            rB = JPa.N;
            wA = kta.v;
            Sb = vqa.T;
            bc = vqa.T;
            hC = uSa.E;
            Jd = uSa.E;
            NC = uSa.E;
            ZC = uSa.E;
            za = uSa.E;
            IB = uSa.E;
            pA.E();
            lB lB2 = tc.J(GB, ja, uSa.E != 0);
            String string2 = Mqa.y;
            if (Sd != null && lC.contains(n3 = pA.Sd.F.J())) {
                string2 = new StringBuilder().insert(3 & 4, wra.a).append(n3).append(WSa.f).toString();
            }
            if (kB) {
                pA.J(new File(HB, nua.U));
            }
            int n5 = n3 = uSa.E;
            while (n5 < Zqa.G) {
                String string3 = wB[n3];
                if (string3.equals(Mqa.y)) {
                    int n6 = n3;
                    int n7 = uSa.E;
                    pA.Pd[n6] = n7;
                    pA.Wc[n6] = n7;
                    pA.O[n3] = null;
                    pA.xc[n3] = null;
                    pA.d[n3] = uSa.E;
                } else {
                    TB = null;
                    Cd = null;
                    v = uSa.E;
                    string = new StringBuilder().insert(3 >> 2, string2).append(string3).toString();
                    if (lB2 != null && lB2.J(string)) {
                        zc.J(new StringBuilder().insert(3 & 4, fta.U).append(string).toString());
                        string3 = ROa.X;
                        string = new StringBuilder().insert(3 >> 2, string2).append(string3).toString();
                    }
                    object = new StringBuilder().insert(5 >> 3, Bua.f).append(string).toString();
                    n2 = pA.J(n3, (String)object + Cra.F, new StringBuilder().insert(5 >> 3, (String)object).append(gsa.j).toString());
                    if (n2 > 0) {
                        zc.J(new StringBuilder().insert(3 ^ 3, VQa.W).append(string).toString());
                    }
                    int n8 = n3;
                    int n9 = n2;
                    pA.Pd[n8] = n9;
                    pA.Wc[n8] = n9;
                    pA.O[n3] = n2 != 0 ? TB : null;
                    pA.xc[n3] = n2 != 0 ? Cd : null;
                    pA.d[n3] = n2 != 0 ? v : uSa.E;
                }
                n5 = ++n3;
            }
            n3 = GL11.glGetInteger(ATa.Ja);
            new HashMap();
            int n10 = uSa.E;
            int n11 = n10;
            while (n11 < Zqa.G) {
                block32: {
                    block34: {
                        block33: {
                            block31: {
                                Arrays.fill(kC[n10], uSa.E != 0);
                                if (n10 != ITa.A) break block31;
                                pA.jA[n10] = null;
                                break block32;
                            }
                            if (Wc[n10] != 0) break block33;
                            pA.jA[n10] = n10 == Fsa.d ? ya : Ya;
                            break block32;
                        }
                        string = O[n10];
                        if (string == null) break block34;
                        object = oc[n10];
                        n2 = string.length();
                        if (n2 > C) {
                            C = n2;
                        }
                        if (n2 > n3) {
                            n2 = n3;
                        }
                        pA.jA[n10] = object;
                        ((IntBuffer)object).limit(n2);
                        int n12 = uSa.E;
                        int n13 = n12;
                        while (n13 < n2) {
                            Object object2;
                            int n14;
                            block37: {
                                block35: {
                                    int n15;
                                    block36: {
                                        n14 = uSa.E;
                                        if (string.length() <= n12) break block35;
                                        n15 = string.charAt(n12) - QSa.p;
                                        if (n10 == Fsa.d) break block36;
                                        if (n15 < 0 || n15 > XTa.W) break block35;
                                        pA.kC[n10][n15] = vRa.d;
                                        n14 = n15 + rua.t;
                                        if (n15 > Cb) {
                                            Cb = n15;
                                        }
                                        if (n15 <= Xa) break block35;
                                        Xa = n15;
                                        object2 = object;
                                        break block37;
                                    }
                                    if (n15 >= 0 && n15 <= vRa.d) {
                                        n14 = n15 + rua.t;
                                        if (n15 > ha) {
                                            ha = n15;
                                        }
                                    }
                                }
                                object2 = object;
                            }
                            ((IntBuffer)object2).put(n12++, n14);
                            n13 = n12;
                        }
                        break block32;
                    }
                    if (n10 != Fsa.d && n10 != tua.U && n10 != fPa.i) {
                        pA.jA[n10] = fC;
                        C = Xa;
                        Arrays.fill(kC[n10], uSa.E, Xa, vRa.d != 0);
                    } else {
                        pA.jA[n10] = Qc;
                    }
                }
                n11 = ++n10;
            }
            Cb = Xa;
            ba = B > 0 ? vRa.d : uSa.E;
            dA = B > 0 ? vRa.d : uSa.E;
            zc.J(new StringBuilder().insert(2 & 5, SPa.H).append(Xa).toString());
            zc.J(new StringBuilder().insert(3 >> 2, Usa.n).append(DC).toString());
            zc.J(new StringBuilder().insert(0, KTa.G).append(ha).toString());
            zc.J(new StringBuilder().insert(0, kqa.F).append(B).toString());
            zc.J(new StringBuilder().insert(0, Lqa.c).append(Cb).toString());
            zc.J(new StringBuilder().insert(0, fsa.j).append(C).toString());
            fC.position(uSa.E).limit(C);
            tc.position(uSa.E).limit(Xa * uqa.g);
            n10 = uSa.E;
            int n16 = n10;
            while (n16 < C) {
                int n17 = n10++;
                fC.put(n17, rua.t + n17);
                n16 = n10;
            }
            if (C > n3) {
                pA.l(new StringBuilder().insert(0, vpa.X).append(C).append(xra.U).append(n3).toString());
            }
            Qc.position(uSa.E).limit(ha);
            n10 = uSa.E;
            int n18 = n10;
            while (n18 < ha) {
                int n19 = n10++;
                Qc.put(n19, rua.t + n19);
                n18 = n10;
            }
            int n20 = n10 = uSa.E;
            while (n20 < Zqa.G) {
                int n21 = n10;
                while (Wc[n21] == 0 && gC[n21] != n21) {
                    n21 = gC[n21];
                }
                if (n21 != n10 && n10 != Fsa.d) {
                    pA.Wc[n10] = Wc[n21];
                    pA.O[n10] = O[n21];
                    pA.jA[n10] = jA[n21];
                }
                n20 = ++n10;
            }
            pA.Z();
            pA.a();
            if (T) {
                pA.F();
            }
            if (Ac == null) {
                Ac = xb.J();
            }
            uKa.e();
            uKa.J((float)kPa.Ha, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            pA.ca();
            pA.Ca();
            uKa.D();
            pC = vRa.d;
            pA.G();
            pA.S();
            if (n4 == 0) {
                // empty if block
            }
            pA.d(VQa.B);
        }
    }

    public static void d(int a2) {
        GL11.glEnable(a2);
        pA.v();
    }

    private static String J(String string, RB[] rBArray) {
        RB[] b2 = rBArray;
        String a2 = string;
        if (b2 != null && b2.length > 0) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < b2.length) {
                RB rB2 = b2[n2];
                rB2.e();
                if (rB2.l(a2)) {
                    a2 = rB2.f();
                    return a2;
                }
                n3 = ++n2;
            }
            return a2;
        }
        return a2;
    }

    public pA() {
        pA a2;
    }

    public static void J(int n2, float f2, long l2) {
        float c2 = f2;
        int b2 = n2;
        if (!eA) {
            EXTFramebufferObject.glBindFramebufferEXT(zsa.h, KC);
            GL11.glViewport(uSa.E, uSa.E, zA, t);
            xa = null;
            xb.J((Cb)Ac.J());
            pA.e(uqa.g);
            pA.d(tpa.b);
        }
    }

    private static ByteBuffer J(int n2) {
        int n3 = n2;
        ByteBuffer byteBuffer = dB;
        int a2 = byteBuffer.limit();
        byteBuffer.position(a2).limit(a2 + n3);
        return byteBuffer.slice();
    }

    public static void z() {
        if (pd) {
            pA.e(ERa.C);
            pA.ka();
        }
    }

    public static int f(int a2) {
        pA.ec[pA.Ad * uqa.g] = ec[Ad * uqa.g] & yQa.j | a2 << ERa.C;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static IntBuffer[] J(int n2, int n3) {
        int b2;
        int n4 = n2;
        IntBuffer[] intBufferArray = new IntBuffer[n4];
        int n5 = b2 = uSa.E;
        while (n5 < n4) {
            void a2;
            intBufferArray[b2++] = pA.J((int)a2);
            n5 = b2;
        }
        return intBufferArray;
    }

    public static void o() {
        int n2;
        if (eA) {
            pA.d(LRa.F);
            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, zua.J, BQa.Z, Ma.get(uSa.E), uSa.E);
            GL11.glClearColor(pqa.r, pqa.r, pqa.r, pqa.r);
            GL20.glDrawBuffers(jA[Fsa.d]);
            pA.e(pQa.q);
            fua.J((int)osa.x);
            pA.d(pQa.q);
            return;
        }
        pA.d(TQa.H);
        if (Od[uSa.E]) {
            GL20.glDrawBuffers(rua.t);
            fua.J((int)qQa.O);
        }
        if (Od[vRa.d]) {
            GL20.glDrawBuffers(PQa.F);
            GL11.glClearColor(pqa.r, pqa.r, pqa.r, pqa.r);
            fua.J((int)qQa.O);
        }
        int n3 = n2 = uqa.g;
        while (n3 < Xa) {
            if (Od[n2]) {
                GL20.glDrawBuffers(rua.t + n2);
                GL11.glClearColor(JPa.N, JPa.N, JPa.N, JPa.N);
                fua.J((int)qQa.O);
            }
            n3 = ++n2;
        }
        pA.J(fC);
        pA.e(cPa.i);
        pA.d(cPa.i);
    }

    public static void h() {
        if (pd) {
            if (eA) {
                // empty if block
            }
            pA.e(YC ? yRa.d : uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void J(RB[] rBArray, IShaderPack iShaderPack) {
        RB[] rBArray2 = rBArray;
        Properties properties = new Properties();
        if (ja != null) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < rBArray2.length) {
                RB rB2 = rBArray2[b2];
                if (rB2.J() && rB2.C()) {
                    properties.setProperty(rB2.e(), rB2.d());
                }
                n2 = ++b2;
            }
        }
        try {
            void a2;
            pA.J((IShaderPack)a2, properties);
            return;
        }
        catch (IOException b2) {
            Config.J(new StringBuilder().insert(5 >> 3, bpa.ca).append(Rc.J()).toString());
            b2.printStackTrace();
            return;
        }
    }

    public static void C(int a2) {
        GL11.glEnable(a2);
        if (a2 == BQa.Z) {
            pA.X();
            return;
        }
        if (a2 == jRa.V) {
            pA.v();
        }
    }

    public static void m() {
        Za = vRa.d;
    }

    public static void J(boolean a2) {
    }

    public static boolean C() {
        if (!uB.J()) {
            return uB.f();
        }
        if (!Z.J()) {
            return Z.f();
        }
        return vRa.d != 0;
    }

    public static void E() {
        if (pA.C()) {
            hc = MQa.L;
            Pa = Ora.D;
            La = xSa.la;
            return;
        }
        hc = pqa.r;
        Pa = pqa.r;
        La = pqa.r;
    }

    public static boolean l() {
        if (!NA.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void K() {
        if (!eA && c) {
            Qa.clear();
            GL11.glReadPixels(zA / uqa.g, t / uqa.g, vRa.d, vRa.d, kTa.w, JPa.la, Qa);
            KA = Qa.get(uSa.E);
            float f2 = (float)qb * Jpa.B;
            float f3 = (float)Math.exp(Math.log(kTa.B) * (double)f2 / (double)TC);
            ea = ea * f3 + KA * (pqa.r - f3);
        }
    }

    public static boolean f() {
        if (!L.J()) {
            return L.f();
        }
        return vRa.d != 0;
    }

    public static void c() {
        if (pd && !eA) {
            pA.J(jA[ERa.C]);
        }
    }

    public static void B() {
        pA.J(ja, Rc);
    }

    public static void J(Mda a2) {
        k = pA.J(a2);
    }

    private static void L() {
        int n2;
        lC.clear();
        int n3 = n2 = oqa.n;
        while (n3 <= XOa.h) {
            String string = new StringBuilder().insert(2 & 5, KPa.F).append(n2).toString();
            if (Rc.J(string)) {
                lC.add(n2);
            }
            n3 = ++n2;
        }
        if (lC.size() > 0) {
            Integer[] integerArray = lC.toArray(new Integer[lC.size()]);
            Config.f(new StringBuilder().insert(3 ^ 3, lqa.c).append(Config.J((Object[])integerArray)).toString());
        }
    }

    public static boolean J() {
        if (!F.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void b() {
        if (pd && Wc[yOa.B] != Wc[uSa.E]) {
            pA.e(yOa.B);
            uKa.K();
            uKa.J((int)jRa.m, (float)JPa.N);
            uKa.f((int)Lra.k, (int)kpa.J);
        }
    }

    public static int J(int a2) {
        xB = a2;
        return a2;
    }

    private static void a() {
        Za = uSa.E;
        sb = Math.round((float)J * Oa);
        ld = Math.round((float)h * Oa);
        pA.da();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, int n2) {
        String string2 = string;
        int b2 = Wc[pa];
        if (b2 != 0) {
            void a2;
            ARBShaderObjects.glUniform1iARB(ARBShaderObjects.glGetUniformLocationARB(b2, string2), (int)a2);
            pA.J(wB[pa], string2);
        }
    }

    private static void H() {
        yc.f();
        db.f();
        L.f();
        Z.f();
        NA.f();
        F.f();
        V.f();
        WA.f();
        WB.f();
        BB.f();
        Ua.f();
        aA.f();
        SA.f();
        AC.J();
        if (Rc != null) {
            InputStream inputStream;
            String string;
            block4: {
                AC.J(Rc);
                string = Asa.E;
                inputStream = Rc.J(string);
                if (inputStream != null) break block4;
                return;
            }
            try {
                dF dF2 = new dF();
                InputStream inputStream2 = inputStream;
                dF2.load(inputStream2);
                inputStream2.close();
                dF dF3 = dF2;
                yc.J((Properties)dF2);
                db.J((Properties)dF3);
                L.J((Properties)dF2);
                Z.J((Properties)dF2);
                NA.J((Properties)dF2);
                F.J((Properties)dF2);
                V.J((Properties)dF2);
                WB.J((Properties)dF2);
                WA.J((Properties)dF2);
                BB.J((Properties)dF2);
                Ua.J((Properties)dF2);
                aA.J((Properties)dF2);
                SA.J((Properties)dF2);
                dF dF4 = dF2;
                GB = HC.J((Properties)dF4, (RB[])ja);
                Pb = HC.J((Properties)dF4, (lB[])GB, (RB[])ja);
                qd = pA.J((Properties)dF4, uSa.E);
                SB = pA.J((Properties)dF3, vRa.d);
                return;
            }
            catch (IOException iOException) {
                Config.J(new StringBuilder().insert(3 & 4, Fsa.r).append(string).toString());
            }
        }
    }

    public static void g() {
        if ((double)oB != oua.i) {
            fua.f((double)oua.i, (double)oua.i, (double)oB);
        }
    }

    private static void J(Gg gg2) {
        Gg gg3 = gg2;
        if (Sd != gg3) {
            Gg a22 = Sd;
            Sd = gg3;
            if (a22 != null && gg3 != null) {
                int a22 = a22.F.J();
                int n2 = gg3.F.J();
                a22 = lC.contains(a22) ? 1 : 0;
                n2 = lC.contains(n2) ? 1 : 0;
                if (a22 != 0 || n2 != 0) {
                    pA.J();
                }
            }
        }
    }

    public static float J() {
        if (Sb < JPa.N) {
            return vqa.T;
        }
        return D * Sb;
    }

    private static void I() {
        pA.f(qd);
        pA.f(SB);
        qd = null;
        SB = null;
    }

    public static RB[] J() {
        return ja;
    }

    private static int l(String a2) {
        if (!a2.equals(Cra.r) && !a2.equals(Vua.r)) {
            if (!a2.equals(RQa.Ga) && !a2.equals(LPa.O)) {
                if (!a2.equals(SPa.q) && !a2.equals(cTa.x)) {
                    if (!a2.equals(Jra.h) && !a2.equals(NTa.Q)) {
                        if (!a2.equals(BQa.x) && !a2.equals(jRa.fa)) {
                            if (!a2.equals(uqa.B) && !a2.equals(zTa.m)) {
                                if (!a2.equals(Zta.q) && !a2.equals(tua.Z)) {
                                    if (!a2.equals(Rua.f) && !a2.equals(KPa.U)) {
                                        return pua.o;
                                    }
                                    return XTa.W;
                                }
                                return uua.p;
                            }
                            return tTa.h;
                        }
                        return AQa.P;
                    }
                    return yRa.d;
                }
                return uqa.g;
            }
            return vRa.d;
        }
        return uSa.E;
    }

    public static void j() {
        pA.e(ERa.C);
    }

    private static void F() {
        if (Id == null) {
            Id = new kc(y, y);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, float f2) {
        String string2 = string;
        int b2 = Wc[pa];
        if (b2 != 0) {
            void a2;
            ARBShaderObjects.glUniform1fARB(ARBShaderObjects.glGetUniformLocationARB(b2, string2), (float)a2);
            pA.J(wB[pa], string2);
        }
    }

    public static void k() {
        tA += uqa.g;
        if ((tA = tA / uqa.g * uqa.g) > AQa.P) {
            tA = uSa.E;
        }
        tA = Config.J(tA, uSa.E, AQa.P);
    }

    private static void G() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        rd = new IdentityHashMap<Block, Integer>(vpa.Ja);
        if (rd.isEmpty()) {
            Object object5 = object4 = Block.blockRegistry.J().iterator();
            while (object5.hasNext()) {
                object3 = (ResourceLocation)object4.next();
                object2 = Block.blockRegistry.J((ResourceLocation)object3);
                Block block = Block.blockRegistry.J((ResourceLocation)object2);
                rd.put((Block)object2, (int)block);
                object5 = object4;
            }
        }
        object4 = null;
        try {
            object = object4 = new BufferedReader(new InputStreamReader(Rc.J(Jqa.c)));
        }
        catch (Exception exception) {
            object = object4;
        }
        if (object != null) {
            try {
                while ((object3 = ((BufferedReader)object4).readLine()) != null) {
                    object2 = QC.matcher((CharSequence)object3);
                    if (((Matcher)object2).matches()) {
                        Object object6 = object2;
                        String string = ((Matcher)object6).group(vRa.d);
                        int n2 = Integer.parseInt(((Matcher)object6).group(uqa.g));
                        Block block = Block.J(string);
                        if (block != null) {
                            rd.put(block, n2);
                            continue;
                        }
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = string;
                        zc.f(POa.P, objectArray);
                        continue;
                    }
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = object3;
                    zc.f(Ysa.X, objectArray);
                }
            }
            catch (Exception exception) {
                zc.C(LPa.o);
            }
        }
        if (object4 != null) {
            try {
                ((BufferedReader)object4).close();
                return;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3, float f4, float f5) {
        float d2 = f5;
        float a2 = f2;
        if (pd && !eA) {
            void b2;
            void c2;
            Y.J(a2, (float)c2, (float)b2, d2);
        }
    }

    public static void D() {
        if (pd) {
            pA.d(Jta.a);
            pA.e(uua.s);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        IA = a2 = f2;
        XC = b2;
        JC = c2;
    }

    private static int f(String string) {
        String string2 = string;
        int n2 = ARBShaderObjects.glCreateShaderObjectARB(ISa.I);
        if (n2 == 0) {
            return uSa.E;
        }
        StringBuilder stringBuilder = new StringBuilder(BPa.D);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Rc.J(string2)));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB(n2);
            return uSa.E;
        }
        RB[] rBArray = pA.J(ja);
        ArrayList<String> arrayList = new ArrayList<String>();
        if (bufferedReader != null) {
            try {
                bufferedReader = HC.J((BufferedReader)bufferedReader, (String)string2, (IShaderPack)Rc, (int)uSa.E, arrayList, (int)uSa.E);
                while (true) {
                    String a2;
                    if ((a2 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    String string3 = a2 = pA.J(a2, rBArray);
                    stringBuilder.append(string3).append((char)NTa.C);
                    if (string3.matches(jRa.E)) {
                        hC = vRa.d;
                        E = vRa.d;
                        continue;
                    }
                    if (a2.matches(PRa.Ka)) {
                        Jd = vRa.d;
                        gc = vRa.d;
                        continue;
                    }
                    if (a2.matches(PRa.Aa)) {
                        NC = vRa.d;
                        continue;
                    }
                    if (!a2.matches(osa.e)) continue;
                    ZC = vRa.d;
                    Nd = vRa.d;
                }
            }
            catch (Exception a2) {
                zc.f(new StringBuilder().insert(3 ^ 3, rta.Z).append(string2).append(dqa.O).toString());
                a2.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(n2);
                return uSa.E;
            }
        }
        if (kB) {
            pA.J(string2, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB(n2, stringBuilder);
        ARBShaderObjects.glCompileShaderARB(n2);
        if (GL20.glGetShaderi(n2, DQa.y) != vRa.d) {
            zc.f(new StringBuilder().insert(3 >> 2, pua.ba).append(string2).toString());
        }
        pA.J(n2, string2, arrayList);
        return n2;
    }

    public static void A() {
        if (pd) {
            pA.e(YC ? yRa.d : uqa.g);
        }
    }

    public static void i() {
        pA.d(Cta.l);
        pA.e(Cta.l);
        GL11.glMatrixMode(WPa.s);
        GL11.glPopMatrix();
        GL11.glMatrixMode(SQa.ca);
        GL11.glPopMatrix();
        uKa.f((int)Lra.k, (int)kpa.J);
        pA.d(hTa.C);
    }

    private static String J(boolean a2) {
        if (a2) {
            return wua.q;
        }
        return Ssa.D;
    }

    public static void M() {
        GL11.glMatrixMode(SQa.ca);
        GL11.glPushMatrix();
        GL11.glMatrixMode(WPa.s);
        GL11.glPushMatrix();
        GL11.glMatrixMode(SQa.ca);
        pA.e(wOa.t);
        pA.d(cQa.x);
        pA.e(cQa.x);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(int n2, String string, List<String> list) {
        void b2;
        void a2;
        int c22;
        int n3 = n2;
        BufferUtils.createIntBuffer(vRa.d);
        int n4 = GL20.glGetShaderi(n3, WSa.J);
        if (n4 <= vRa.d) {
            return vRa.d != 0;
        }
        int n5 = c22 = uSa.E;
        while (n5 < a2.size()) {
            String string2 = (String)a2.get(c22);
            StringBuilder stringBuilder = new StringBuilder().insert(2 & 5, Jsa.D).append(c22 + vRa.d).append(XTa.d);
            zc.J(stringBuilder.append(string2).toString());
            n5 = ++c22;
        }
        String c22 = GL20.glGetShaderInfoLog(n3, n4);
        zc.J(new StringBuilder().insert(3 ^ 3, Bpa.e).append((String)b2).append(SPa.O).append(c22).toString());
        return uSa.E != 0;
    }

    public static void l(int a2) {
        GL11.glDisable(a2);
        pA.p();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean J(ez a2) {
        switch (kB.A[a2.ordinal()]) {
            case 1: {
                return BB.f();
            }
            case 2: {
                return Ua.f();
            }
            case 3: {
                return aA.f();
            }
            case 4: {
                return SA.f();
            }
        }
        return uSa.E != 0;
    }

    public static void e() {
        pA.Aa();
        GL11.glColor3f(IA, XC, JC);
        pA.ea();
        GL11.glColor3f(lA, Gc, mB);
    }

    public static void d() {
        if (eA) {
            pA.d(ISa.k);
            return;
        }
        if (!mC) {
            pA.w();
        }
        pd = uSa.E;
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        pA.e(uSa.E);
        nLa.C();
        pA.d(KSa.f);
    }

    public static void C() {
        pA.ec[pA.Ad * uqa.g] = uSa.E;
        pA.ec[pA.Ad * uqa.g + vRa.d] = uSa.E;
        Ad -= vRa.d;
    }

    public static int J() {
        return ec[Ad * uqa.g];
    }

    public static void f(int a2) {
        GL11.glEnable(a2);
        pA.X();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Kpa kpa2, float f2, long l2) {
        void a2;
        int c22;
        void b2;
        Kpa kpa3;
        block21: {
            kpa3 = kpa2;
            pA.d(GPa.h);
            pA.J((Gg)pA.G.Ta);
            G = kpa3;
            pA.G.U.J(STa.Aa);
            da = pA.G.R;
            if (!pC) {
                try {
                    pA.q();
                }
                catch (IllegalStateException illegalStateException) {
                    if (!Config.J(illegalStateException.getMessage()).equals(Pua.O)) break block21;
                    pA.l(new StringBuilder().insert(2 & 5, ISa.n).append(illegalStateException.getMessage()).toString());
                    illegalStateException.printStackTrace();
                    pA.f(Zb);
                    return;
                }
            }
        }
        if (pA.G.t != NB || pA.G.k != qB) {
            pA.Z();
        }
        if (Za) {
            pA.a();
        }
        if ((qA = ((Md = pA.G.Ta.f()) - p) % dua.Aa) < nqa.i) {
            qA += dua.Aa;
        }
        p = Md;
        gd = pA.G.Ta.d();
        if ((Jc += vRa.d) >= JPa.B) {
            Jc = uSa.E;
        }
        VB = System.currentTimeMillis();
        if (i == nqa.i) {
            i = VB;
        }
        qb = VB - i;
        i = VB;
        iB = (float)qb / Jpa.r;
        Oc += iB;
        Oc %= dsa.v;
        Yc = kpa3.Ta.J((float)b2);
        float f3 = (float)qb * Jpa.B;
        f3 = (float)Math.exp(Math.log(kTa.B) * (double)f3 / (double)(I < Yc ? hd : bC));
        I = I * f3 + Yc * (pqa.r - f3);
        vL vL2 = G.J();
        if (vL2 != null) {
            zc = vL2 instanceof Gl && ((Gl)vL2).p() ? vRa.d : uSa.E;
            void v0 = b2;
            vL vL3 = vL2;
            YB = (float)vL2.Z * v0 + (float)vL3.Ga * (pqa.r - b2);
            Xb = vL3.J((float)v0);
            f3 = (float)qb * Jpa.B;
            float c22 = (float)Math.exp(Math.log(kTa.B) * (double)f3 / (double)Tb);
            yC = yC * c22 + (float)(Xb & yQa.j) * (pqa.r - c22);
            Va = Va * c22 + (float)(Xb >> ERa.C) * (pqa.r - c22);
            int n2 = jc = pA.G.z.ld == 0 && !zc && pA.G.c.J(Material.water) ? vRa.d : uSa.E;
            if (pA.G.c != null) {
                gA = JPa.N;
                if (pA.G.c.J(Hda.w)) {
                    gA = Config.J().R.J((Gl)pA.G.c, (float)b2);
                }
                Vb = JPa.N;
                if (pA.G.c.J(Hda.a)) {
                    Vb = Config.J((float)pA.G.c.J(Hda.a).l() / eta.e, JPa.N, pqa.r);
                }
            }
            Lz lz2 = XE.J((Lz)pA.G.Ta.J(vL2, (float)b2), (Gg)Sd, (vL)vL2, (float)b2);
            lA = (float)lz2.A;
            Gc = (float)lz2.j;
            mB = (float)lz2.J;
        }
        pd = vRa.d;
        mC = uSa.E;
        Ca = uSa.E;
        if (B >= vRa.d) {
            uKa.i((int)zpa.A);
            uKa.C((int)Ma.get(uSa.E));
            if (B >= uqa.g) {
                uKa.i((int)Fsa.Ga);
                uKa.C((int)Ma.get(vRa.d));
            }
        }
        uKa.i((int)YSa.Ka);
        int n3 = c22 = uSa.E;
        while (n3 < Xa) {
            uKa.C((int)HA[c22]);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
            uKa.C((int)HA[Yqa.i + c22]);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
            n3 = ++c22;
        }
        uKa.C((int)uSa.E);
        int n4 = c22 = uSa.E;
        while (n4 < AQa.P && AQa.P + c22 < Xa) {
            uKa.i((int)(rta.Ka + c22));
            uKa.C((int)tc.get(AQa.P + c22++));
            n4 = c22;
        }
        uKa.i((int)Ssa.p);
        uKa.C((int)JB.get(uSa.E));
        if (DC >= uqa.g) {
            uKa.i((int)TOa.l);
            uKa.C((int)JB.get(vRa.d));
            if (DC >= yRa.d) {
                uKa.i((int)Qsa.j);
                uKa.C((int)JB.get(uqa.g));
            }
        }
        int n5 = c22 = uSa.E;
        while (n5 < ha) {
            uKa.i((int)(bRa.U + c22));
            uKa.C((int)bA.get(c22++));
            n5 = c22;
        }
        if (T) {
            uKa.i((int)(YSa.Ka + pA.Id.A));
            uKa.C((int)Id.J());
            GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
            GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
        }
        pA.J(qd);
        uKa.i((int)YSa.Ka);
        Ab = Sc;
        YA = lB;
        Db = Ub;
        wc.position(uSa.E);
        pB.position(uSa.E);
        wc.put(pB);
        wc.position(uSa.E);
        pB.position(uSa.E);
        a.position(uSa.E);
        Bd.position(uSa.E);
        a.put(Bd);
        a.position(uSa.E);
        Bd.position(uSa.E);
        pA.d(Bta.d);
        tA.J((FLa)da, (int)uSa.E, (float)b2, (long)a2);
        pA.G.U.f();
        EXTFramebufferObject.glBindFramebufferEXT(zsa.h, KC);
        c22 = uSa.E;
        int n6 = c22;
        while (n6 < Xa) {
            pA.LA[c22] = uSa.E;
            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, rua.t + c22, BQa.Z, HA[c22++], uSa.E);
            n6 = c22;
        }
        pA.d(tSa.Y);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, boolean bl, FloatBuffer floatBuffer) {
        void a2;
        String string2 = string;
        int c2 = Wc[pa];
        if (c2 != 0 && a2 != null) {
            void b2;
            ARBShaderObjects.glUniformMatrix4ARB(ARBShaderObjects.glGetUniformLocationARB(c2, string2), (boolean)b2, (FloatBuffer)a2);
            pA.J(wB[pa], string2);
        }
    }

    public static void l() {
        Nc = vRa.d;
        pA.J(ERa.Ka, uSa.E);
        pA.e(uua.p);
    }

    public static void f() {
        if (pd) {
            pA.e(vRa.d);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void J(IShaderPack iShaderPack, Properties properties) throws IOException {
        void a2;
        IShaderPack iShaderPack2 = iShaderPack;
        Object b2 = new StringBuilder().insert(3 >> 2, MA).append(WSa.f).append(iShaderPack2.J()).append(dQa.S).toString();
        b2 = new File(Kpa.J().p, (String)b2);
        if (a2.isEmpty()) {
            ((File)b2).delete();
            return;
        }
        b2 = new FileOutputStream((File)b2);
        a2.store((OutputStream)b2, (String)null);
        Object object = b2;
        ((OutputStream)object).flush();
        ((FileOutputStream)object).close();
    }

    public static RB[] J(String string) {
        int n2;
        RB[] a2;
        String string2 = string;
        Object[] objectArray = (RB[])ja.clone();
        if (Pb == null) {
            if (GB != null) {
                a2 = new Nc(GB, (RB[])objectArray);
                objectArray = (RB[])Config.J(objectArray, a2, uSa.E);
            }
            objectArray = pA.f((RB[])objectArray);
            return objectArray;
        }
        a2 = string2 != null ? new StringBuilder().insert(3 & 4, asa.u).append(string2).toString() : bRa.b;
        if ((a2 = Pb.get(a2)) == null) {
            return new RB[uSa.E];
        }
        ArrayList<RB> arrayList = new ArrayList<RB>();
        int n3 = n2 = uSa.E;
        while (n3 < a2.length) {
            RB rB2 = a2[n2];
            if (rB2 == null) {
                arrayList.add(null);
            } else if (rB2 instanceof SB) {
                RB[] rBArray = pA.J(Pb, (RB[])objectArray);
                arrayList.addAll(Arrays.asList(rBArray));
            } else {
                arrayList.add(rB2);
            }
            n3 = ++n2;
        }
        ArrayList<RB> arrayList2 = arrayList;
        RB[] rBArray = arrayList2.toArray(new RB[arrayList2.size()]);
        return rBArray;
    }

    public static void J(Lz a2) {
        Lz lz2 = a2;
        lA = (float)lz2.A;
        Gc = (float)lz2.j;
        mB = (float)lz2.J;
        pA.J(vua.N, lA, Gc, mB);
    }

    public static void J(int a2) {
        pA.ec[(pA.Ad += vRa.d) * uqa.g] = a2 & yQa.j;
        pA.ec[pA.Ad * uqa.g + vRa.d] = uSa.E;
    }

    public static void J(cT cT2) {
        cT cT3;
        cT cT4 = cT3 = cT2;
        cT4.J();
        if (cT4.childModels != null) {
            int a2 = uSa.E;
            int n2 = cT3.childModels.size();
            int n3 = a2;
            while (n3 < n2) {
                pA.J((cT)cT3.childModels.get(a2++));
                n3 = a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, int n2, int n3) {
        String string2 = string;
        int c2 = Wc[pa];
        if (c2 != 0) {
            void a2;
            void b2;
            ARBShaderObjects.glUniform2iARB(ARBShaderObjects.glGetUniformLocationARB(c2, string2), (int)b2, (int)a2);
            pA.J(wB[pa], string2);
        }
    }

    private static int J(String string) {
        int a2;
        String string2 = string;
        string2 = string2.trim();
        int n2 = a2 = uSa.E;
        while (n2 < LC.length) {
            String string3 = LC[a2];
            if (string2.equals(string3)) {
                return sa[a2];
            }
            n2 = ++a2;
        }
        return uSa.E;
    }

    public static void J() {
        if (pC) {
            pA.d(zta.J);
            int n2 = uSa.E;
            int n3 = n2;
            while (n3 < Zqa.G) {
                if (Pd[n2] != 0) {
                    ARBShaderObjects.glDeleteObjectARB(Pd[n2]);
                    pA.d(KTa.m);
                }
                pA.Pd[n2] = uSa.E;
                pA.Wc[n2] = uSa.E;
                pA.O[n2] = null;
                pA.jA[n2] = null;
                pA.d[n2++] = uSa.E;
                n3 = n2;
            }
            if (KC != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(KC);
                KC = uSa.E;
                pA.d(xra.O);
            }
            if (ca != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(ca);
                ca = uSa.E;
                pA.d(FPa.N);
            }
            if (JB != null) {
                uKa.J((IntBuffer)JB);
                pA.J(JB);
                pA.d(Uta.u);
            }
            if (tc != null) {
                uKa.J((IntBuffer)tc);
                pA.J(tc);
                pA.d(dqa.c);
            }
            if (Ma != null) {
                uKa.J((IntBuffer)Ma);
                pA.J(Ma);
                pA.d(XTa.V);
            }
            if (bA != null) {
                uKa.J((IntBuffer)bA);
                pA.J(bA);
                pA.d(yOa.E);
            }
            if (fC != null) {
                pA.J(fC);
            }
            if (Id != null) {
                Id.J();
                Id = null;
            }
            zc.J(Ssa.q);
            ba = uSa.E;
            dA = uSa.E;
            pC = uSa.E;
            pA.d(QSa.Aa);
        }
    }

    public static void J(ModelBase modelBase) {
        ModelBase modelBase2 = modelBase;
        if (modelBase2 != null) {
            for (Object e2 : modelBase2.boxList) {
                if (!(e2 instanceof cT)) continue;
                pA.J((cT)e2);
            }
        }
    }
}

