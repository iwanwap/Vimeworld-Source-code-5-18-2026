/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Bsa
 *  Cia
 *  DQa
 *  EQa
 *  ERa
 *  FTa
 *  Gg
 *  ISa
 *  JPa
 *  JQa
 *  JTa
 *  Kpa
 *  LQa
 *  Lra
 *  MQa
 *  NOa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qqa
 *  Qsa
 *  Qta
 *  RPa
 *  RQa
 *  Rua
 *  SOa
 *  SRa
 *  Se
 *  Spa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  Tsa
 *  UAa
 *  URa
 *  Uha
 *  Usa
 *  VS
 *  WSa
 *  Wsa
 *  XE
 *  XSa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  ZJa
 *  ZOa
 *  ZRa
 *  Zpa
 *  aqa
 *  bSa
 *  bpa
 *  bua
 *  cQa
 *  cra
 *  dQa
 *  dpa
 *  hTa
 *  hqa
 *  hra
 *  iPa
 *  jRa
 *  jg
 *  kFa
 *  kPa
 *  kqa
 *  kta
 *  lqa
 *  mra
 *  nQa
 *  oqa
 *  pPa
 *  pQa
 *  pda
 *  pe
 *  pma
 *  pqa
 *  psa
 *  pua
 *  qta
 *  rna
 *  sF
 *  sMa
 *  uQa
 *  vPa
 *  vRa
 *  vf
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  xOa
 *  ysa
 *  zTa
 *  zU
 *  zsa
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import optifine.Config;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cia_1 {
    public List<String> Ab;
    public boolean gc;
    public boolean DC;
    public boolean aC;
    private static final String[] tA;
    public int kc;
    private static final Logger ib;
    public boolean AA;
    public static final int zc = 2;
    public float GB;
    public static final int EB = 3;
    public mIa ub;
    public mIa gd;
    public mIa jb;
    public int td;
    public int NA;
    public int HB;
    public boolean fA;
    public mIa JA;
    public boolean jC;
    public int Pd;
    public boolean Uc;
    private static final int[] FC;
    private static final String[] rB;
    private Map<rna, Float> zA;
    public int Tb;
    public int LB;
    public boolean Lc;
    public boolean Mc;
    public mIa pA;
    public int uc;
    public boolean qb;
    public boolean gC;
    public int hc;
    public boolean OB;
    public int DA;
    public static final int hC = 4;
    public boolean qA;
    private static final String[] cd;
    public mIa Gb;
    public mIa Wc;
    public mIa yb;
    public boolean XC;
    public mIa WB;
    public float MC;
    public mIa wc;
    public float NB;
    public int cA;
    public boolean mA;
    public boolean dc;
    public int ld;
    public boolean CC;
    public float hb;
    private File zb;
    public int YC;
    public boolean GA;
    public boolean ab;
    private final Set Qd;
    public boolean tb;
    public mIa kd;
    public String pb;
    public boolean gB;
    public int kB;
    public mIa CB;
    public int mB;
    public static final int xB = 1;
    public boolean hA;
    public float Sd;
    public int Bb;
    public mIa xc;
    public float LA;
    public int Xb;
    public float Dd;
    public mIa QA;
    public float Ic;
    public boolean QC;
    public boolean qc;
    public List<String> sb;
    public float Mb;
    public mIa Sb;
    public boolean Ra;
    public int oa;
    public boolean Wa;
    public boolean ua;
    public Kpa Ua;
    public int ra;
    public float pa;
    public int Ya;
    public mIa ta;
    public boolean wa;
    public float va;
    public boolean Pa;
    public boolean Za;
    public static final String sa = "Default";
    private static final String[] na;
    public boolean Na;
    public float xa;
    public String ya;
    public boolean Oa;
    public boolean Qa;
    public int Va;
    public boolean Sa;
    public boolean Ta;
    public boolean Xa;
    public kFa qa;
    public int za;
    public int ma;
    public boolean La;
    public boolean ka;
    public boolean da;
    public float Ba;
    public boolean aa;
    public int ea;
    public boolean Ea;
    public boolean Ca;
    public mIa ia;
    public sZ Ma;
    public boolean ba;
    public float ha;
    public int Fa;
    private static final String[] Ia;
    public boolean la;
    public boolean ga;
    public boolean Da;
    public boolean ca;
    public mIa Ja;
    public mIa[] ja;
    public boolean Ha;
    public mIa[] Ga;
    public boolean fa;
    public boolean Ka;
    public static final int Aa = 1;
    public float S;
    public boolean Z;
    public float Y;
    public boolean r;
    public mIa V;
    public int z;
    public float X;
    public boolean y;
    public int U;
    public int P;
    public boolean u;
    public int O;
    public boolean t;
    public boolean R;
    public int Q;
    private static final Gson N;
    public String T;
    public int p;
    public boolean n;
    public static final int s = 0;
    public boolean w;
    public static final int W = 2;
    public mIa q;
    private static final String x = "CL_00000650";
    public mIa v;
    private static final String[] o;
    private static final ParameterizedType h;
    public boolean K;
    public mIa H;
    public boolean c;
    public boolean B;
    public String d;
    private static final String[] a;
    public boolean b;
    public boolean l;
    private File e;
    public boolean G;
    public boolean D;
    private static final String[] f;
    public int F;
    public boolean g;
    public mIa L;
    public mIa E;
    public mIa m;
    private static final String[] C;
    public boolean i;
    public static final int M = 0;
    private static final int[] k;
    public boolean j;
    public boolean J;
    public boolean A;
    public mIa I;

    /*
     * WARNING - void declaration
     */
    public void J(mIa mIa2, int n2) {
        void b2;
        int c2 = n2;
        Cia_1 a2 = this;
        b2.setKeyCode(c2);
        a2.d();
    }

    /*
     * WARNING - void declaration
     */
    public void f(Fha fha, float f2) {
        void b2;
        float c2 = f2;
        Cia_1 a2 = this;
        void v0 = b2;
        a2.J((Fha)v0, c2);
        if (v0 == Fha.SENSITIVITY) {
            a2.MC = c2;
        }
        if (b2 == Fha.FOV) {
            a2.LA = c2;
        }
        if (b2 == Fha.GAMMA) {
            a2.pa = c2;
        }
        if (b2 == Fha.FRAMERATE_LIMIT) {
            a2.HB = (int)c2;
            a2.y = uSa.E;
            if (a2.HB <= 0) {
                Cia_1 cia_1 = a2;
                cia_1.HB = (int)Fha.FRAMERATE_LIMIT.getValueMax();
                cia_1.y = vRa.d;
            }
            a2.J();
        }
        if (b2 == Fha.CHAT_OPACITY) {
            a2.xa = c2;
            a2.Ua.Ya.J().f();
        }
        if (b2 == Fha.CHAT_HEIGHT_FOCUSED) {
            a2.va = c2;
            a2.Ua.Ya.J().f();
        }
        if (b2 == Fha.CHAT_HEIGHT_UNFOCUSED) {
            a2.GB = c2;
            a2.Ua.Ya.J().f();
        }
        if (b2 == Fha.CHAT_WIDTH) {
            a2.Sd = c2;
            a2.Ua.Ya.J().f();
        }
        if (b2 == Fha.CHAT_SCALE) {
            a2.X = c2;
            a2.Ua.Ya.J().f();
        }
        if (b2 == Fha.MIPMAP_LEVELS) {
            int n2 = a2.ea;
            a2.ea = (int)c2;
            if ((float)n2 != c2) {
                Cia_1 cia_1 = a2;
                Cia_1 cia_12 = a2;
                cia_1.Ua.J().J(cia_12.ea);
                cia_1.Ua.J().J(WKa.C);
                cia_12.Ua.J().f(uSa.E != 0, (a2.ea > 0 ? vRa.d : uSa.E) != 0);
                a2.Ua.J();
            }
        }
        if (b2 == Fha.BLOCK_ALTERNATIVES) {
            a2.GA = !a2.GA ? vRa.d : uSa.E;
            a2.Ua.Aa.J();
        }
        if (b2 == Fha.RENDER_DISTANCE) {
            a2.kc = (int)c2;
            a2.Ua.Aa.d();
        }
        if (b2 == Fha.STREAM_BYTES_PER_PIXEL) {
            a2.Dd = c2;
        }
        if (b2 == Fha.STREAM_VOLUME_MIC) {
            a2.NB = c2;
        }
        if (b2 == Fha.STREAM_VOLUME_SYSTEM) {
            a2.Mb = c2;
        }
        if (b2 == Fha.STREAM_KBPS) {
            a2.hb = c2;
        }
        if (b2 == Fha.STREAM_FPS) {
            a2.ha = c2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f(Fha var1_1, int var2_2) {
        c /* !! */  = var1_1;
        b = this /* !! */ ;
        v0 /* !! */  = c /* !! */ ;
        b.J((Fha)v0 /* !! */ , (int)a);
        if (v0 /* !! */  == Fha.INVERT_MOUSE) {
            b.QC = b.QC == false ? vRa.d : uSa.E;
            v1 = (int)b.QC;
        }
        if (c /* !! */  != Fha.GUI_SCALE) ** GOTO lbl19
        var4_3 = b.F;
        b.F = uSa.E;
        var3_4 = new sMa(Kpa.J());
        var3_5 = Math.max(AQa.P, Math.min(var3_4.l() + vRa.d, Cia_1.C.length));
        b.F = var4_3;
        if (b.F >= var3_5) {
            v2 /* !! */  = c /* !! */ ;
            b.F = uSa.E;
        } else {
            b.F = (b.F + a) % var3_5;
lbl19:
            // 2 sources

            v2 /* !! */  = c /* !! */ ;
        }
        if (v2 /* !! */  == Fha.PARTICLES) {
            b.kB = (b.kB + a) % yRa.d;
        }
        if (c /* !! */  == Fha.VIEW_BOBBING) {
            b.Ha = b.Ha == false ? vRa.d : uSa.E;
            v3 = (int)b.Ha;
        }
        if (c /* !! */  == Fha.RENDER_CLOUDS) {
            b.z = (b.z + a) % yRa.d;
        }
        if (c /* !! */  == Fha.FORCE_UNICODE_FONT) {
            b.Lc = b.Lc == false ? vRa.d : uSa.E;
            b.Ua.Ea.f((boolean)(b.Ua.J().J() != false || b.Lc != false ? vRa.d : uSa.E));
        }
        if (c /* !! */  == Fha.FBO_ENABLE) {
            b.qA = b.qA == false ? vRa.d : uSa.E;
            v4 = (int)b.qA;
        }
        if (c /* !! */  == Fha.ANAGLYPH) {
            if (!b.B && Config.h()) {
                Config.J(Kg.J(Ppa.o), Kg.J(qsa.p));
                return;
            }
            b.B = b.B == false ? vRa.d : uSa.E;
            b.Ua.i();
        }
        if (c /* !! */  == Fha.GRAPHICS) {
            b.u = b.u == false ? vRa.d : uSa.E;
            v5 = b;
            v5.C();
            v5.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.AMBIENT_OCCLUSION) {
            v6 = b;
            v6.oa = (v6.oa + a) % yRa.d;
            v6.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.CHAT_VISIBILITY) {
            b.qa = kFa.getEnumChatVisibility((int)((b.qa.getChatVisibility() + a) % yRa.d));
        }
        if (c /* !! */  == Fha.STREAM_COMPRESSION) {
            b.Pd = (b.Pd + a) % yRa.d;
        }
        if (c /* !! */  == Fha.STREAM_SEND_METADATA) {
            b.DC = b.DC == false ? vRa.d : uSa.E;
            v7 = (int)b.DC;
        }
        if (c /* !! */  == Fha.STREAM_CHAT_ENABLED) {
            b.Xb = (b.Xb + a) % yRa.d;
        }
        if (c /* !! */  == Fha.STREAM_CHAT_USER_FILTER) {
            b.ra = (b.ra + a) % yRa.d;
        }
        if (c /* !! */  == Fha.STREAM_MIC_TOGGLE_BEHAVIOR) {
            b.Va = (b.Va + a) % uqa.g;
        }
        if (c /* !! */  == Fha.CHAT_LINKS) {
            b.Mc = b.Mc == false ? vRa.d : uSa.E;
            v8 = (int)b.Mc;
        }
        if (c /* !! */  == Fha.CHAT_LINKS_PROMPT) {
            b.la = b.la == false ? vRa.d : uSa.E;
            v9 = (int)b.la;
        }
        if (c /* !! */  == Fha.SNOOPER_ENABLED) {
            b.qc = b.qc == false ? vRa.d : uSa.E;
            v10 = (int)b.qc;
        }
        if (c /* !! */  == Fha.TOUCHSCREEN) {
            b.tb = b.tb == false ? vRa.d : uSa.E;
            v11 = (int)b.tb;
        }
        if (c /* !! */  == Fha.USE_FULLSCREEN) {
            b.ab = b.ab == false ? vRa.d : uSa.E;
            v12 = (int)b.ab;
            if (b.Ua.F() != b.ab) {
                b.Ua.b();
            }
        }
        if (c /* !! */  == Fha.ENABLE_VSYNC) {
            b.y = b.y == false ? vRa.d : uSa.E;
            Display.setVSyncEnabled(b.y);
        }
        if (c /* !! */  == Fha.USE_VBO) {
            b.hA = b.hA == false ? vRa.d : uSa.E;
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.BLOCK_ALTERNATIVES) {
            b.GA = b.GA == false ? vRa.d : uSa.E;
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.REDUCED_DEBUG_INFO) {
            b.Na = b.Na == false ? vRa.d : uSa.E;
            v13 = (int)b.Na;
        }
        if (c /* !! */  == Fha.ENTITY_SHADOWS) {
            b.Xa = b.Xa == false ? vRa.d : uSa.E;
        }
        b.d();
    }

    public int J() {
        Cia_1 a2;
        if (a2.kc >= AQa.P) {
            return a2.z;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private static int l(int n2, int[] nArray) {
        void a2;
        int n3 = n2;
        int b2 = Cia_1.f(n3, (int[])a2);
        if (b2 < 0) {
            return (int)a2[uSa.E];
        }
        if (++b2 >= ((void)a2).length) {
            b2 = uSa.E;
        }
        return (int)a2[b2];
    }

    /*
     * WARNING - void declaration
     */
    public void J(pda pda2, boolean bl) {
        Cia_1 cia_1;
        void a2;
        Cia_1 c2 = pda2;
        Cia_1 b2 = this;
        if (a2 != false) {
            Cia_1 cia_12 = b2;
            cia_1 = cia_12;
            cia_12.Qd.add(c2);
        } else {
            Cia_1 cia_13 = b2;
            cia_1 = cia_13;
            cia_13.Qd.remove(c2);
        }
        cia_1.e();
    }

    /*
     * WARNING - void declaration
     */
    private String f(Fha fha) {
        void a2;
        Cia_1 cia_1 = this;
        Object b2 = oha.J(a2.getEnumString(), new Object[uSa.E]) + Xpa.E;
        if (b2 == null) {
            b2 = a2.getEnumString();
        }
        if (a2 == Fha.RENDER_DISTANCE) {
            int n2 = (int)cia_1.J((Fha)a2);
            String string = oha.J(xqa.l, new Object[uSa.E]);
            int n3 = uqa.g;
            if (n2 >= AQa.P) {
                string = oha.J(TQa.c, new Object[uSa.E]);
                n3 = AQa.P;
            }
            if (n2 >= Yqa.i) {
                string = oha.J(MTa.A, new Object[uSa.E]);
                n3 = Yqa.i;
            }
            if (n2 >= ERa.C) {
                string = oha.J(UOa.fa, new Object[uSa.E]);
                n3 = ERa.C;
            }
            if (n2 >= fPa.i) {
                string = Kg.J(cra.L);
                n3 = fPa.i;
            }
            n3 = cia_1.kc - n3;
            String string2 = string;
            if (n3 > 0) {
                string2 = new StringBuilder().insert(3 ^ 3, string).append(NQa.C).toString();
            }
            return new StringBuilder().insert(5 >> 3, (String)b2).append(n2).append(Tpa.E).append(string2).append(Mqa.y).toString();
        }
        if (a2 == Fha.FOG_FANCY) {
            switch (cia_1.p) {
                case 1: {
                    return new StringBuilder().insert(5 >> 3, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(3 >> 2, (String)b2).append(Kg.J()).toString();
                }
                case 3: {
                    return new StringBuilder().insert(3 ^ 3, (String)b2).append(Kg.f()).toString();
                }
            }
            return new StringBuilder().insert(3 >> 2, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.FOG_START) {
            return new StringBuilder().insert(3 ^ 3, (String)b2).append(cia_1.S).toString();
        }
        if (a2 == Fha.MIPMAP_TYPE) {
            switch (cia_1.U) {
                case 0: {
                    return new StringBuilder().insert(3 >> 2, (String)b2).append(Kg.J(ySa.J)).toString();
                }
                case 1: {
                    return new StringBuilder().insert(5 >> 3, (String)b2).append(Kg.J(LRa.ca)).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J(YSa.g)).toString();
                }
                case 3: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J(xqa.b)).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(ySa.J).toString();
        }
        if (a2 == Fha.SMOOTH_FPS) {
            StringBuilder stringBuilder;
            if (cia_1.Ta) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SMOOTH_WORLD) {
            StringBuilder stringBuilder;
            if (cia_1.K) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.CLOUDS) {
            switch (cia_1.td) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
                case 3: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
        }
        if (a2 == Fha.TREES) {
            switch (cia_1.ma) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
                default: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
                }
                case 4: 
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.J(ITa.H)).toString();
        }
        if (a2 == Fha.DROPPED_ITEMS) {
            switch (cia_1.NA) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
        }
        if (a2 == Fha.RAIN) {
            switch (cia_1.P) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
                case 3: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
        }
        if (a2 == Fha.ANIMATED_WATER) {
            switch (cia_1.cA) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J(gsa.G)).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.l()).toString();
        }
        if (a2 == Fha.ANIMATED_LAVA) {
            switch (cia_1.hc) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J(gsa.G)).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.l()).toString();
        }
        if (a2 == Fha.ANIMATED_FIRE) {
            StringBuilder stringBuilder;
            if (cia_1.Ca) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_PORTAL) {
            StringBuilder stringBuilder;
            if (cia_1.J) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_REDSTONE) {
            StringBuilder stringBuilder;
            if (cia_1.ca) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_EXPLOSION) {
            StringBuilder stringBuilder;
            if (cia_1.XC) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_FLAME) {
            StringBuilder stringBuilder;
            if (cia_1.jC) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_SMOKE) {
            StringBuilder stringBuilder;
            if (cia_1.CC) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.VOID_PARTICLES) {
            StringBuilder stringBuilder;
            if (cia_1.Sa) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.WATER_PARTICLES) {
            StringBuilder stringBuilder;
            if (cia_1.gC) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.PORTAL_PARTICLES) {
            StringBuilder stringBuilder;
            if (cia_1.Ra) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.POTION_PARTICLES) {
            StringBuilder stringBuilder;
            if (cia_1.Ka) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.FIREWORK_PARTICLES) {
            StringBuilder stringBuilder;
            if (cia_1.r) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.DRIPPING_WATER_LAVA) {
            StringBuilder stringBuilder;
            if (cia_1.w) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_TERRAIN) {
            StringBuilder stringBuilder;
            if (cia_1.c) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.ANIMATED_TEXTURES) {
            StringBuilder stringBuilder;
            if (cia_1.OB) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.RAIN_SPLASH) {
            StringBuilder stringBuilder;
            if (cia_1.ga) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.LAGOMETER) {
            StringBuilder stringBuilder;
            if (cia_1.Wa) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SHOW_FPS) {
            StringBuilder stringBuilder;
            if (cia_1.l) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.AUTOSAVE_TICKS) {
            if (cia_1.uc <= wra.P) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J(Psa.f)).toString();
            }
            if (cia_1.uc <= hra.i) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J(zOa.r)).toString();
            }
            if (cia_1.uc <= rSa.B) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J(Qra.R)).toString();
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.J(Ata.Ia)).toString();
        }
        if (a2 == Fha.BETTER_GRASS) {
            switch (cia_1.O) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.CONNECTED_TEXTURES) {
            switch (cia_1.za) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.WEATHER) {
            StringBuilder stringBuilder;
            if (cia_1.gc) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SKY) {
            StringBuilder stringBuilder;
            if (cia_1.ua) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.STARS) {
            StringBuilder stringBuilder;
            if (cia_1.La) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SUN_MOON) {
            StringBuilder stringBuilder;
            if (cia_1.Pa) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.VIGNETTE) {
            switch (cia_1.mB) {
                case 1: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
                }
                case 2: {
                    return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
                }
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
        }
        if (a2 == Fha.CHUNK_UPDATES) {
            return new StringBuilder().insert(0, (String)b2).append(cia_1.LB).toString();
        }
        if (a2 == Fha.CHUNK_UPDATES_DYNAMIC) {
            StringBuilder stringBuilder;
            if (cia_1.n) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.TIME) {
            if (cia_1.Ya == vRa.d) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J(tpa.p)).toString();
            }
            if (cia_1.Ya == uqa.g) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J(Lra.E)).toString();
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
        }
        if (a2 == Fha.CLEAR_WATER) {
            StringBuilder stringBuilder;
            if (cia_1.Qa) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.AA_LEVEL) {
            StringBuilder stringBuilder;
            String string = Mqa.y;
            if (cia_1.Q != Config.i()) {
                string = new StringBuilder().insert(0, nQa.T).append(Kg.J(rta.ja)).append(hpa.b).toString();
            }
            if (cia_1.Q == 0) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.f()).append(string).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(cia_1.Q).append(string).toString();
        }
        if (a2 == Fha.AF_LEVEL) {
            if (cia_1.Fa == vRa.d) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.f()).toString();
            }
            return new StringBuilder().insert(0, (String)b2).append(cia_1.Fa).toString();
        }
        if (a2 == Fha.PROFILER) {
            StringBuilder stringBuilder;
            if (cia_1.AA) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.BETTER_SNOW) {
            StringBuilder stringBuilder;
            if (cia_1.gB) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SWAMP_COLORS) {
            StringBuilder stringBuilder;
            if (cia_1.fa) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.RANDOM_MOBS) {
            StringBuilder stringBuilder;
            if (cia_1.j) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SMOOTH_BIOMES) {
            StringBuilder stringBuilder;
            if (cia_1.A) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.CUSTOM_FONTS) {
            StringBuilder stringBuilder;
            if (cia_1.da) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.CUSTOM_COLORS) {
            StringBuilder stringBuilder;
            if (cia_1.Oa) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.CUSTOM_SKY) {
            StringBuilder stringBuilder;
            if (cia_1.g) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.SHOW_CAPES) {
            StringBuilder stringBuilder;
            if (cia_1.Ea) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.CUSTOM_ITEMS) {
            StringBuilder stringBuilder;
            if (cia_1.ka) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.NATURAL_TEXTURES) {
            StringBuilder stringBuilder;
            if (cia_1.aC) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.FAST_MATH) {
            StringBuilder stringBuilder;
            if (cia_1.Uc) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.FAST_RENDER) {
            StringBuilder stringBuilder;
            if (cia_1.Za) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.TRANSLUCENT_BLOCKS) {
            if (cia_1.Bb == vRa.d) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.d()).toString();
            }
            if (cia_1.Bb == uqa.g) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J()).toString();
            }
            return new StringBuilder().insert(0, (String)b2).append(Kg.C()).toString();
        }
        if (a2 == Fha.LAZY_CHUNK_LOADING) {
            StringBuilder stringBuilder;
            if (cia_1.R) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.DYNAMIC_FOV) {
            StringBuilder stringBuilder;
            if (cia_1.fA) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.DYNAMIC_LIGHTS) {
            int n4 = Cia_1.f(cia_1.DA, k);
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(rB, n4)).toString();
        }
        if (a2 == Fha.FULLSCREEN_MODE) {
            StringBuilder stringBuilder;
            if (cia_1.ya.equals(xqa.A)) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.C()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(cia_1.ya).toString();
        }
        if (a2 == Fha.HELD_ITEM_TOOLTIPS) {
            StringBuilder stringBuilder;
            if (cia_1.D) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(Kg.l()).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(Kg.f()).toString();
        }
        if (a2 == Fha.FRAMERATE_LIMIT) {
            StringBuilder stringBuilder;
            float f2 = cia_1.J((Fha)a2);
            if (f2 == JPa.N) {
                return new StringBuilder().insert(0, (String)b2).append(Kg.J(ROa.z)).toString();
            }
            if (f2 == Fha.access$000((Fha)a2)) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(oha.J(APa.ca, new Object[uSa.E])).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append((int)f2).append(oua.w).toString();
        }
        return null;
    }

    public float J(Fha fha) {
        Object b2 = fha;
        Cia_1 a2 = this;
        if (b2 == Fha.CLOUD_HEIGHT) {
            return a2.Y;
        }
        if (b2 == Fha.AO_LEVEL) {
            return a2.Ba;
        }
        if (b2 == Fha.AA_LEVEL) {
            return a2.Q;
        }
        if (b2 == Fha.AF_LEVEL) {
            return a2.Fa;
        }
        if (b2 == Fha.MIPMAP_TYPE) {
            return a2.U;
        }
        if (b2 == Fha.FRAMERATE_LIMIT) {
            if ((float)a2.HB == Fha.FRAMERATE_LIMIT.getValueMax() && a2.y) {
                return JPa.N;
            }
            return a2.HB;
        }
        if (b2 == Fha.FOV) {
            return a2.LA;
        }
        if (b2 == Fha.GAMMA) {
            return a2.pa;
        }
        if (b2 == Fha.SATURATION) {
            return a2.Ic;
        }
        if (b2 == Fha.SENSITIVITY) {
            return a2.MC;
        }
        if (b2 == Fha.CHAT_OPACITY) {
            return a2.xa;
        }
        if (b2 == Fha.CHAT_HEIGHT_FOCUSED) {
            return a2.va;
        }
        if (b2 == Fha.CHAT_HEIGHT_UNFOCUSED) {
            return a2.GB;
        }
        if (b2 == Fha.CHAT_SCALE) {
            return a2.X;
        }
        if (b2 == Fha.CHAT_WIDTH) {
            return a2.Sd;
        }
        if (b2 == Fha.FRAMERATE_LIMIT) {
            return a2.HB;
        }
        if (b2 == Fha.MIPMAP_LEVELS) {
            return a2.ea;
        }
        if (b2 == Fha.RENDER_DISTANCE) {
            return a2.kc;
        }
        if (b2 == Fha.STREAM_BYTES_PER_PIXEL) {
            return a2.Dd;
        }
        if (b2 == Fha.STREAM_VOLUME_MIC) {
            return a2.NB;
        }
        if (b2 == Fha.STREAM_VOLUME_SYSTEM) {
            return a2.Mb;
        }
        if (b2 == Fha.STREAM_KBPS) {
            return a2.hb;
        }
        if (b2 == Fha.STREAM_FPS) {
            return a2.ha;
        }
        return JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Fha fha, float f2) {
        void a2;
        Object c22 = fha;
        Cia_1 b2 = this;
        if (c22 == Fha.CLOUD_HEIGHT) {
            b2.Y = a2;
            b2.Ua.Aa.e();
        }
        if (c22 == Fha.AO_LEVEL) {
            b2.Ba = a2;
            b2.Ua.Aa.J();
        }
        if (c22 == Fha.MIPMAP_TYPE) {
            int c22 = (int)a2;
            b2.U = Config.J(c22, uSa.E, yRa.d);
            b2.Ua.i();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Cia_1(Kpa kpa2, File file) {
        void b2;
        Cia_1 a2;
        File c2 = file;
        Cia_1 cia_1 = a2 = this;
        Cia_1 cia_12 = a2;
        a2.MC = MQa.L;
        a2.kc = pua.o;
        a2.Ha = vRa.d;
        a2.qA = vRa.d;
        a2.HB = sOa.D;
        a2.z = uqa.g;
        a2.u = vRa.d;
        a2.oa = uqa.g;
        a2.Ab = Lists.newArrayList();
        a2.sb = Lists.newArrayList();
        a2.qa = kFa.FULL;
        a2.Mc = vRa.d;
        a2.la = vRa.d;
        a2.xa = pqa.r;
        a2.qc = vRa.d;
        a2.y = vRa.d;
        a2.hA = uSa.E;
        a2.GA = vRa.d;
        a2.Na = uSa.E;
        a2.i = vRa.d;
        a2.Qd = Sets.newHashSet(pda.values());
        a2.D = vRa.d;
        a2.X = pqa.r;
        a2.Sd = pqa.r;
        a2.GB = RQa.F;
        a2.va = pqa.r;
        a2.Z = vRa.d;
        cia_12.ea = AQa.P;
        cia_1.zA = Maps.newEnumMap(rna.class);
        cia_12.Dd = MQa.L;
        cia_1.NB = pqa.r;
        cia_1.Mb = pqa.r;
        cia_1.hb = vRa.o;
        cia_1.ha = Wqa.k;
        cia_1.Pd = vRa.d;
        cia_1.DC = vRa.d;
        cia_1.T = Mqa.y;
        cia_1.Xb = uSa.E;
        cia_1.ra = uSa.E;
        cia_1.Va = uSa.E;
        cia_1.dc = vRa.d;
        cia_1.Xa = vRa.d;
        Cia_1 cia_13 = a2;
        cia_1.yb = new mIa(XTa.n, yOa.B, Jta.l);
        cia_1.WB = new mIa(hra.N, ERa.C, Jta.l);
        cia_1.QA = new mIa(uQa.c, Tpa.z, MRa.q);
        cia_1.E = new mIa(ROa.W, kTa.g, MRa.q);
        cia_1.V = new mIa(rua.K, uSa.E, MRa.q);
        cia_1.jb = new mIa(Qra.ca, yta.Ka, xSa.z);
        cia_1.L = new mIa(vRa.B, Fsa.d, xSa.z);
        cia_1.JA = new mIa(hTa.I, tua.U, xSa.z);
        cia_1.gd = new mIa(BQa.Ga, fPa.i, xSa.z);
        cia_1.ta = new mIa(rpa.k, KSa.x, xSa.z);
        cia_1.ia = new mIa(qta.q, cQa.i, xSa.z);
        cia_1.CB = new mIa(jRa.Ia, ITa.A, xSa.z);
        cia_1.xc = new mIa(XSa.Q, yOa.B, vqa.k);
        cia_1.pA = new mIa(Yqa.W, tTa.N, MRa.q);
        cia_1.ub = new mIa(FTa.r, ERa.C, MRa.q);
        cia_1.H = new mIa(DPa.x, mra.Z, MRa.q);
        cia_1.I = new mIa(Zra.T, xSa.r, MRa.q);
        cia_1.wc = new mIa(rta.la, kTa.j, ZOa.b);
        cia_1.q = new mIa(Jra.y, Ypa.A, ZOa.b);
        cia_1.Wc = new mIa(LPa.V, Bpa.Z, ZOa.b);
        cia_1.v = new mIa(wPa.j, Psa.M, DQa.Q);
        cia_1.Sb = new mIa(Qpa.M, Ssa.u, DQa.Q);
        cia_1.Gb = new mIa(yta.B, uSa.E, DQa.Q);
        cia_1.m = new mIa(LQa.B, Jqa.S, DQa.Q);
        cia_1.kd = new mIa(rSa.ja, uSa.E, DQa.Q);
        mIa[] mIaArray = new mIa[WOa.fa];
        mIaArray[uSa.E] = new mIa(Ira.w, uqa.g, vqa.k);
        mIaArray[vRa.d] = new mIa(vRa.x, yRa.d, vqa.k);
        mIaArray[uqa.g] = new mIa(sqa.h, AQa.P, vqa.k);
        mIaArray[yRa.d] = new mIa(Qqa.Q, tTa.h, vqa.k);
        mIaArray[AQa.P] = new mIa(Mqa.g, uua.p, vqa.k);
        mIaArray[tTa.h] = new mIa(fPa.Ma, XTa.W, vqa.k);
        mIaArray[uua.p] = new mIa(WSa.v, Yqa.i, vqa.k);
        mIaArray[XTa.W] = new mIa(nua.f, WOa.fa, vqa.k);
        mIaArray[Yqa.i] = new mIa(oqa.j, NTa.C, vqa.k);
        cia_1.Ga = mIaArray;
        Cia_1 cia_14 = a2;
        cia_14.p = vRa.d;
        cia_14.S = xSa.la;
        cia_14.U = uSa.E;
        cia_14.wa = uSa.E;
        cia_14.Ta = uSa.E;
        cia_14.K = Config.r();
        cia_14.R = Config.r();
        cia_14.Ba = pqa.r;
        cia_14.Q = uSa.E;
        cia_14.Fa = vRa.d;
        cia_14.td = uSa.E;
        cia_14.Y = JPa.N;
        cia_14.ma = uSa.E;
        cia_14.P = uSa.E;
        cia_14.NA = uSa.E;
        cia_14.O = yRa.d;
        cia_14.uc = rSa.B;
        cia_14.Wa = uSa.E;
        cia_14.AA = uSa.E;
        cia_14.l = uSa.E;
        cia_14.gc = vRa.d;
        cia_14.ua = vRa.d;
        cia_14.La = vRa.d;
        cia_14.Pa = vRa.d;
        cia_14.mB = uSa.E;
        cia_14.LB = vRa.d;
        cia_14.n = uSa.E;
        cia_14.Ya = uSa.E;
        cia_14.Qa = uSa.E;
        cia_14.gB = uSa.E;
        cia_14.ya = xqa.A;
        cia_14.fa = vRa.d;
        cia_14.j = vRa.d;
        cia_14.A = vRa.d;
        cia_14.da = vRa.d;
        cia_14.Oa = vRa.d;
        cia_14.g = vRa.d;
        cia_14.Ea = vRa.d;
        cia_14.za = uqa.g;
        cia_14.ka = vRa.d;
        cia_14.aC = uSa.E;
        cia_14.Uc = uSa.E;
        cia_14.Za = vRa.d;
        cia_14.Bb = uSa.E;
        cia_14.fA = vRa.d;
        cia_14.DA = yRa.d;
        cia_14.cA = uSa.E;
        cia_14.hc = uSa.E;
        cia_14.Ca = vRa.d;
        cia_14.J = vRa.d;
        cia_14.ca = vRa.d;
        cia_14.XC = vRa.d;
        cia_14.jC = vRa.d;
        cia_14.CC = vRa.d;
        cia_14.Sa = vRa.d;
        cia_14.gC = vRa.d;
        cia_14.ga = vRa.d;
        cia_14.Ra = vRa.d;
        cia_14.Ka = vRa.d;
        cia_14.r = vRa.d;
        cia_14.w = vRa.d;
        cia_14.c = vRa.d;
        cia_14.OB = vRa.d;
        mIa[] mIaArray2 = new mIa[kTa.g];
        mIaArray2[uSa.E] = a2.H;
        mIaArray2[vRa.d] = a2.pA;
        mIaArray2[uqa.g] = a2.jb;
        mIaArray2[yRa.d] = a2.L;
        mIaArray2[AQa.P] = a2.JA;
        mIaArray2[tTa.h] = a2.gd;
        mIaArray2[uua.p] = a2.ta;
        mIaArray2[XTa.W] = a2.ia;
        mIaArray2[Yqa.i] = a2.CB;
        mIaArray2[WOa.fa] = a2.ub;
        mIaArray2[NTa.C] = a2.xc;
        mIaArray2[pPa.f] = a2.wc;
        mIaArray2[lqa.s] = a2.q;
        mIaArray2[uua.s] = a2.I;
        mIaArray2[hpa.Z] = a2.Wc;
        mIaArray2[Ypa.A] = a2.v;
        mIaArray2[ERa.C] = a2.Sb;
        mIaArray2[yta.Ka] = a2.Gb;
        mIaArray2[yOa.B] = a2.m;
        mIaArray2[wOa.t] = a2.kd;
        mIaArray2[kTa.j] = a2.E;
        mIaArray2[wOa.h] = a2.V;
        mIaArray2[cQa.o] = a2.QA;
        mIaArray2[AQa.ba] = a2.WB;
        mIaArray2[osa.c] = a2.yb;
        cia_14.ja = ArrayUtils.addAll(mIaArray2, a2.Ga);
        Cia_1 cia_15 = a2;
        Cia_1 cia_16 = a2;
        cia_16.Ma = sZ.NORMAL;
        cia_16.d = Mqa.y;
        cia_16.LA = UOa.d;
        cia_16.pb = NOa.h;
        cia_15.Lc = uSa.E;
        a2.Ua = b2;
        cia_15.zb = new File(c2, oQa.y);
        a2.e = new File(c2, iSa.q);
        a2.HB = (int)Fha.FRAMERATE_LIMIT.getValueMax();
        a2.Ja = new mIa(vPa.x, Bpa.Ha, DQa.Q);
        a2.ja = ArrayUtils.add(a2.ja, a2.Ja);
        Cia_1 cia_17 = a2;
        cia_17.ja = Tsa.J((mIa[])cia_17.ja);
        cia_17.ja = VS.J((mIa[])cia_17.ja);
        Fha.RENDER_DISTANCE.setValueMax(Ura.m);
        cia_17.kc = Yqa.i;
        cia_17.i();
        Config.J((Cia)cia_17);
    }

    public void A() {
        Cia_1 cia_1 = this;
        try {
            Object a2;
            Object object = a2 = new PrintWriter(new FileWriter(cia_1.e));
            ((PrintWriter)a2).println(rta.y + cia_1.kc);
            ((PrintWriter)object).println(new StringBuilder().insert(2 & 5, BQa.w).append(cia_1.p).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(2 & 5, lqa.d).append(cia_1.S).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 ^ 3, xOa.ja).append(cia_1.U).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(2 & 5, Zpa.l).append(cia_1.wa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(2 & 5, hra.y).append(cia_1.Ta).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 >> 2, Usa.d).append(cia_1.K).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 & 4, Spa.A).append(cia_1.Ba).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(5 >> 3, URa.Z).append(cia_1.td).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(5 >> 3, AQa.a).append(cia_1.Y).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 & 4, xTa.v).append(cia_1.ma).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, cQa.I).append(cia_1.NA).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, JTa.l).append(cia_1.P).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, pQa.Y).append(cia_1.cA).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, STa.z).append(cia_1.hc).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, ZSa.D).append(cia_1.Ca).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Ira.a).append(cia_1.J).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Ura.z).append(cia_1.ca).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, bua.t).append(cia_1.XC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Rua.Ha).append(cia_1.jC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, oqa.r).append(cia_1.CC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, ATa.u).append(cia_1.Sa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, EPa.k).append(cia_1.gC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, BQa.v).append(cia_1.Ra).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, ATa.m).append(cia_1.Ka).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, SPa.M).append(cia_1.r).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, kqa.P).append(cia_1.w).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, STa.I).append(cia_1.c).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, qQa.c).append(cia_1.OB).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, fPa.Ia).append(cia_1.ga).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, hqa.r).append(cia_1.Wa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, ROa.Ga).append(cia_1.l).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Xsa.o).append(cia_1.uc).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, zTa.T).append(cia_1.O).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, SRa.s).append(cia_1.za).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, xOa.a).append(cia_1.gc).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Spa.V).append(cia_1.ua).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, UTa.a).append(cia_1.La).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, bpa.ga).append(cia_1.Pa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Yua.Ga).append(cia_1.mB).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Ypa.x).append(cia_1.LB).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Qpa.m).append(cia_1.n).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Ppa.s).append(cia_1.Ya).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Ata.Ha).append(cia_1.Qa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, qsa.I).append(cia_1.Q).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, DQa.C).append(cia_1.Fa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, kua.Z).append(cia_1.AA).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Spa.Y).append(cia_1.gB).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, oqa.L).append(cia_1.fa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, LPa.u).append(cia_1.j).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, rua.G).append(cia_1.A).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, cPa.j).append(cia_1.da).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Ypa.v).append(cia_1.Oa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, XOa.Ha).append(cia_1.ka).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, iPa.Ka).append(cia_1.g).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, UTa.j).append(cia_1.Ea).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, DQa.p).append(cia_1.aC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, nqa.Z).append(cia_1.R).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, qQa.T).append(cia_1.fA).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, SOa.g).append(cia_1.DA).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, fta.C).append(cia_1.ya).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, ysa.W).append(cia_1.Uc).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, vPa.P).append(cia_1.Za).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, oQa.c).append(cia_1.Bb).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, rSa.C).append(cia_1.Ja.getKeyDescription()).append(Era.Aa).append(cia_1.Ja.getKeyCode()).toString());
            ((PrintWriter)a2).close();
            return;
        }
        catch (Exception a2) {
            Config.J(GPa.M);
            a2.printStackTrace();
            return;
        }
    }

    public static String J(int a2) {
        if (a2 < 0) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2 + zTa.C;
            return oha.J(Bpa.H, objectArray);
        }
        if (a2 < hra.Ja) {
            return Keyboard.getKeyName(a2);
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = Character.valueOf((char)(a2 - hra.Ja));
        return String.format(cra.U, objectArray).toUpperCase();
    }

    public float J(rna rna2) {
        Cia_1 b2 = rna2;
        Cia_1 a2 = this;
        if (!a2.zA.containsKey(b2)) {
            return pqa.r;
        }
        return a2.zA.get(b2).floatValue();
    }

    /*
     * Exception decompiling
     */
    public void i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 8[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void M() {
        Cia_1 a2;
        if (a2.Ua.d() && a2.Ua.J() != null) {
            Config.waterOpacityChanged = vRa.d;
        }
        Cia_1 cia_1 = a2;
        sF.J((Cia)cia_1, (Gg)cia_1.Ua.Ta);
    }

    public void e() {
        Cia_1 cia_1 = this;
        if (cia_1.Ua.c != null) {
            Iterator iterator;
            int a2 = uSa.E;
            Iterator iterator2 = iterator = cia_1.Qd.iterator();
            while (iterator2.hasNext()) {
                Object e2 = iterator.next();
                a2 |= ((pda)e2).getPartMask();
                iterator2 = iterator;
            }
            Cia_1 cia_12 = cia_1;
            cia_1.Ua.c.F.J((KC)new UAa(cia_12.pb, cia_12.kc, cia_1.qa, a2));
        }
    }

    public boolean J() {
        Cia_1 a2;
        return a2.dc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        Cia_1 cia_1;
        Cia_1 cia_12 = this;
        try {
            mIa mIa2;
            int n2;
            Object object;
            Object a2;
            Object object2 = a2 = new PrintWriter(new FileWriter(cia_12.zb));
            ((PrintWriter)a2).println(lqa.Q + zU.M.f());
            ((PrintWriter)object2).println(new StringBuilder().insert(3 & 4, kta.m).append(cia_12.QC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(5 >> 3, PQa.r).append(cia_12.MC).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(2 & 5, Ora.n).append((cia_12.LA - UOa.d) / ZRa.l).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(2 & 5, Jpa.H).append(cia_12.pa).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 ^ 3, sra.w).append(cia_12.Ic).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 & 4, Hta.B).append(cia_12.kc).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(2 & 5, Yqa.t).append(cia_12.F).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 >> 2, JQa.G).append(cia_12.kB).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(3 & 4, yta.L).append(cia_12.Ha).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(5 >> 3, Wsa.u).append(cia_12.B).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, vsa.d).append(cia_12.HB).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, rua.Ma).append(cia_12.qA).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, dQa.b).append(cia_12.Ma.getDifficultyId()).toString());
            ((PrintWriter)a2).println(new StringBuilder().insert(0, pQa.a).append(cia_12.u).toString());
            Cia_1 cia_13 = cia_12;
            ((PrintWriter)a2).println(new StringBuilder().insert(0, Jra.j).append(cia_13.oa).toString());
            switch (cia_13.z) {
                case 0: {
                    Object object3 = a2;
                    object = object3;
                    ((PrintWriter)object3).println(APa.Ga);
                    break;
                }
                case 1: {
                    Object object4 = a2;
                    object = object4;
                    ((PrintWriter)object4).println(sSa.K);
                    break;
                }
                case 2: {
                    ((PrintWriter)a2).println(fqa.ja);
                }
                default: {
                    object = a2;
                }
            }
            ((PrintWriter)object).println(new StringBuilder().insert(0, Jsa.W).append(N.toJson(cia_12.Ab)).toString());
            Object object5 = a2;
            ((PrintWriter)object5).println(new StringBuilder().insert(0, oua.B).append(N.toJson(cia_12.sb)).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, cTa.p).append(cia_12.d).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Bsa.I).append(cia_12.pb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Ira.la).append(cia_12.qa.getChatVisibility()).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Jta.Da).append(cia_12.Mc).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, KQa.G).append(cia_12.la).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, qQa.b).append(cia_12.xa).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, VPa.u).append(cia_12.qc).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Nra.P).append(cia_12.ab).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, NOa.V).append(cia_12.y).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Zqa.R).append(cia_12.hA).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, rta.m).append(cia_12.qb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, EPa.g).append(cia_12.aa).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, rSa.S).append(cia_12.i).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, fta.f).append(cia_12.tb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Hra.u).append(cia_12.Tb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Asa.ja).append(cia_12.YC).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, vpa.ga).append(cia_12.D).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, xOa.S).append(cia_12.va).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, sqa.s).append(cia_12.GB).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, WPa.l).append(cia_12.X).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, YSa.k).append(cia_12.Sd).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, JQa.Aa).append(cia_12.Z).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, kTa.Ja).append(cia_12.ea).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, vPa.F).append(cia_12.Dd).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Hta.Ja).append(cia_12.NB).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, mSa.y).append(cia_12.Mb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, ISa.T).append(cia_12.hb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Rua.p).append(cia_12.ha).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, WRa.D).append(cia_12.Pd).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, hQa.N).append(cia_12.DC).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, zta.w).append(cia_12.T).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Jqa.s).append(cia_12.Xb).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, gQa.s).append(cia_12.ra).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, pta.X).append(cia_12.Va).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, cQa.T).append(cia_12.Lc).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, RPa.ga).append(cia_12.GA).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, JPa.Fa).append(cia_12.Na).toString());
            ((PrintWriter)object5).println(new StringBuilder().insert(0, Iqa.i).append(cia_12.dc).toString());
            Cia_1 cia_14 = cia_12;
            ((PrintWriter)object5).println(new StringBuilder().insert(0, xTa.K).append(cia_14.Xa).toString());
            mIa[] mIaArray = cia_14.ja;
            int n3 = cia_14.ja.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                mIa2 = mIaArray[n2];
                ((PrintWriter)a2).println(new StringBuilder().insert(0, rSa.C).append(mIa2.getKeyDescription()).append(Era.Aa).append(mIa2.getKeyCode()).toString());
                n4 = ++n2;
            }
            mIaArray = rna.values();
            n3 = mIaArray.length;
            int n5 = n2 = uSa.E;
            while (n5 < n3) {
                mIa2 = mIaArray[n2];
                ((PrintWriter)a2).println(new StringBuilder().insert(0, Jpa.A).append(mIa2.getCategoryName()).append(Era.Aa).append(cia_12.J((rna)mIa2)).toString());
                n5 = ++n2;
            }
            mIaArray = pda.values();
            n3 = mIaArray.length;
            int n6 = n2 = uSa.E;
            while (n6 < n3) {
                mIa2 = mIaArray[n2];
                ((PrintWriter)a2).println(new StringBuilder().insert(0, Bpa.h).append(mIa2.getPartName()).append(Era.Aa).append(cia_12.Qd.contains(mIa2)).toString());
                n6 = ++n2;
            }
            ((PrintWriter)a2).close();
            cia_1 = cia_12;
        }
        catch (Exception a2) {
            ib.error(GPa.M, (Throwable)a2);
            cia_1 = cia_12;
        }
        cia_1.A();
        cia_12.e();
    }

    private static String J(String[] stringArray, int n2) {
        int b2 = n2;
        String[] a2 = stringArray;
        if (b2 < 0 || b2 >= a2.length) {
            b2 = uSa.E;
        }
        return oha.J(a2[b2], new Object[uSa.E]);
    }

    public static boolean J(mIa mIa2) {
        mIa mIa3 = mIa2;
        int a2 = mIa3.getKeyCode();
        if (a2 >= mra.Z && a2 <= osa.Ja) {
            if (mIa3.getKeyCode() == 0) {
                return uSa.E != 0;
            }
            if (mIa3.getKeyCode() < 0) {
                return Mouse.isButtonDown(mIa3.getKeyCode() + ySa.T);
            }
            return Keyboard.isKeyDown(mIa3.getKeyCode());
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean J(Fha fha) {
        Fha b2 = fha;
        Cia_1 a2 = this;
        switch (bia.A[b2.ordinal()]) {
            case 1: {
                return a2.QC;
            }
            case 2: {
                return a2.Ha;
            }
            case 3: {
                return a2.B;
            }
            case 4: {
                return a2.qA;
            }
            case 5: {
                return a2.Mc;
            }
            case 6: {
                return a2.la;
            }
            case 7: {
                return a2.qc;
            }
            case 8: {
                return a2.ab;
            }
            case 9: {
                return a2.y;
            }
            case 10: {
                return a2.hA;
            }
            case 11: {
                return a2.tb;
            }
            case 12: {
                return a2.DC;
            }
            case 14: {
                return a2.Lc;
            }
            case 15: {
                return a2.GA;
            }
            case 16: {
                return a2.Na;
            }
            case 17: {
                return a2.Xa;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(rna rna2, float f2) {
        void b2;
        float c2 = f2;
        Cia_1 a2 = this;
        a2.zA.put((rna)b2, Float.valueOf(c2));
        a2.Ua.J().J((rna)b2, c2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void C() {
        Cia_1 a2;
        switch (a2.td) {
            case 1: {
                a2.z = vRa.d;
                return;
            }
            case 2: {
                a2.z = uqa.g;
                return;
            }
            case 3: {
                a2.z = uSa.E;
                return;
            }
        }
        Cia_1 cia_1 = a2;
        if (a2.u) {
            cia_1.z = uqa.g;
            return;
        }
        cia_1.z = vRa.d;
    }

    public Set J() {
        Cia_1 a2;
        return ImmutableSet.copyOf(a2.Qd);
    }

    public void l() {
        Cia_1 a2;
        Cia_1 cia_1 = a2;
        cia_1.kc = Yqa.i;
        cia_1.Ha = vRa.d;
        cia_1.B = uSa.E;
        cia_1.HB = (int)Fha.FRAMERATE_LIMIT.getValueMax();
        cia_1.y = uSa.E;
        cia_1.J();
        cia_1.ea = AQa.P;
        cia_1.u = vRa.d;
        cia_1.oa = uqa.g;
        cia_1.z = uqa.g;
        cia_1.LA = UOa.d;
        cia_1.pa = JPa.N;
        cia_1.F = uSa.E;
        cia_1.kB = uSa.E;
        cia_1.D = vRa.d;
        cia_1.hA = uSa.E;
        cia_1.GA = vRa.d;
        cia_1.Lc = uSa.E;
        cia_1.p = vRa.d;
        cia_1.S = xSa.la;
        cia_1.U = uSa.E;
        cia_1.wa = uSa.E;
        cia_1.Ta = uSa.E;
        Config.i();
        cia_1.K = Config.r();
        cia_1.R = Config.r();
        cia_1.Uc = uSa.E;
        cia_1.Za = uSa.E;
        cia_1.Bb = uSa.E;
        cia_1.fA = vRa.d;
        cia_1.DA = yRa.d;
        cia_1.Ba = pqa.r;
        cia_1.Q = uSa.E;
        cia_1.Fa = vRa.d;
        cia_1.td = uSa.E;
        cia_1.Y = JPa.N;
        cia_1.ma = uSa.E;
        cia_1.P = uSa.E;
        cia_1.O = yRa.d;
        cia_1.uc = rSa.B;
        cia_1.Wa = uSa.E;
        cia_1.l = uSa.E;
        cia_1.AA = uSa.E;
        cia_1.gc = vRa.d;
        cia_1.ua = vRa.d;
        cia_1.La = vRa.d;
        cia_1.Pa = vRa.d;
        cia_1.mB = uSa.E;
        cia_1.LB = vRa.d;
        cia_1.n = uSa.E;
        cia_1.Ya = uSa.E;
        cia_1.Qa = uSa.E;
        cia_1.gB = uSa.E;
        cia_1.ya = xqa.A;
        cia_1.fa = vRa.d;
        cia_1.j = vRa.d;
        cia_1.A = vRa.d;
        cia_1.da = vRa.d;
        cia_1.Oa = vRa.d;
        cia_1.ka = vRa.d;
        cia_1.g = vRa.d;
        cia_1.Ea = vRa.d;
        cia_1.za = uqa.g;
        cia_1.aC = uSa.E;
        cia_1.cA = uSa.E;
        cia_1.hc = uSa.E;
        cia_1.Ca = vRa.d;
        cia_1.J = vRa.d;
        cia_1.ca = vRa.d;
        cia_1.XC = vRa.d;
        cia_1.jC = vRa.d;
        cia_1.CC = vRa.d;
        cia_1.Sa = vRa.d;
        cia_1.gC = vRa.d;
        cia_1.ga = vRa.d;
        cia_1.Ra = vRa.d;
        cia_1.Ka = vRa.d;
        cia_1.r = vRa.d;
        cia_1.w = vRa.d;
        cia_1.c = vRa.d;
        cia_1.OB = vRa.d;
        pA.f(pA.Zb);
        pA.tA = uSa.E;
        pA.J();
        pA.ga();
        cia_1.M();
        cia_1.Ua.i();
        cia_1.d();
    }

    /*
     * WARNING - void declaration
     */
    private static int f(int n2, int[] nArray) {
        void a2;
        int b2;
        int n3 = n2;
        int n4 = b2 = uSa.E;
        while (n4 < ((void)a2).length) {
            if (a2[b2] == n3) {
                return b2;
            }
            n4 = ++b2;
        }
        return pua.o;
    }

    public Cia_1() {
        Cia_1 a2;
        Cia_1 cia_1 = a2;
        Cia_1 cia_12 = a2;
        a2.MC = MQa.L;
        a2.kc = pua.o;
        a2.Ha = vRa.d;
        a2.qA = vRa.d;
        a2.HB = sOa.D;
        a2.z = uqa.g;
        a2.u = vRa.d;
        a2.oa = uqa.g;
        a2.Ab = Lists.newArrayList();
        a2.sb = Lists.newArrayList();
        a2.qa = kFa.FULL;
        a2.Mc = vRa.d;
        a2.la = vRa.d;
        a2.xa = pqa.r;
        a2.qc = vRa.d;
        a2.y = vRa.d;
        a2.hA = uSa.E;
        a2.GA = vRa.d;
        a2.Na = uSa.E;
        a2.i = vRa.d;
        a2.Qd = Sets.newHashSet(pda.values());
        a2.D = vRa.d;
        a2.X = pqa.r;
        a2.Sd = pqa.r;
        a2.GB = RQa.F;
        a2.va = pqa.r;
        a2.Z = vRa.d;
        cia_12.ea = AQa.P;
        cia_1.zA = Maps.newEnumMap(rna.class);
        cia_12.Dd = MQa.L;
        cia_1.NB = pqa.r;
        cia_1.Mb = pqa.r;
        cia_1.hb = vRa.o;
        cia_1.ha = Wqa.k;
        cia_1.Pd = vRa.d;
        cia_1.DC = vRa.d;
        cia_1.T = Mqa.y;
        cia_1.Xb = uSa.E;
        cia_1.ra = uSa.E;
        cia_1.Va = uSa.E;
        cia_1.dc = vRa.d;
        cia_1.Xa = vRa.d;
        Cia_1 cia_13 = a2;
        cia_1.yb = new mIa(XTa.n, yOa.B, Jta.l);
        cia_1.WB = new mIa(hra.N, ERa.C, Jta.l);
        cia_1.QA = new mIa(uQa.c, Tpa.z, MRa.q);
        cia_1.E = new mIa(ROa.W, kTa.g, MRa.q);
        cia_1.V = new mIa(rua.K, uSa.E, MRa.q);
        cia_1.jb = new mIa(Qra.ca, yta.Ka, xSa.z);
        cia_1.L = new mIa(vRa.B, Fsa.d, xSa.z);
        cia_1.JA = new mIa(hTa.I, tua.U, xSa.z);
        cia_1.gd = new mIa(BQa.Ga, fPa.i, xSa.z);
        cia_1.ta = new mIa(rpa.k, KSa.x, xSa.z);
        cia_1.ia = new mIa(qta.q, cQa.i, xSa.z);
        cia_1.CB = new mIa(jRa.Ia, ITa.A, xSa.z);
        cia_1.xc = new mIa(XSa.Q, yOa.B, vqa.k);
        cia_1.pA = new mIa(Yqa.W, tTa.N, MRa.q);
        cia_1.ub = new mIa(FTa.r, ERa.C, MRa.q);
        cia_1.H = new mIa(DPa.x, mra.Z, MRa.q);
        cia_1.I = new mIa(Zra.T, xSa.r, MRa.q);
        cia_1.wc = new mIa(rta.la, kTa.j, ZOa.b);
        cia_1.q = new mIa(Jra.y, Ypa.A, ZOa.b);
        cia_1.Wc = new mIa(LPa.V, Bpa.Z, ZOa.b);
        cia_1.v = new mIa(wPa.j, Psa.M, DQa.Q);
        cia_1.Sb = new mIa(Qpa.M, Ssa.u, DQa.Q);
        cia_1.Gb = new mIa(yta.B, uSa.E, DQa.Q);
        cia_1.m = new mIa(LQa.B, Jqa.S, DQa.Q);
        cia_1.kd = new mIa(rSa.ja, uSa.E, DQa.Q);
        mIa[] mIaArray = new mIa[WOa.fa];
        mIaArray[uSa.E] = new mIa(Ira.w, uqa.g, vqa.k);
        mIaArray[vRa.d] = new mIa(vRa.x, yRa.d, vqa.k);
        mIaArray[uqa.g] = new mIa(sqa.h, AQa.P, vqa.k);
        mIaArray[yRa.d] = new mIa(Qqa.Q, tTa.h, vqa.k);
        mIaArray[AQa.P] = new mIa(Mqa.g, uua.p, vqa.k);
        mIaArray[tTa.h] = new mIa(fPa.Ma, XTa.W, vqa.k);
        mIaArray[uua.p] = new mIa(WSa.v, Yqa.i, vqa.k);
        mIaArray[XTa.W] = new mIa(nua.f, WOa.fa, vqa.k);
        mIaArray[Yqa.i] = new mIa(oqa.j, NTa.C, vqa.k);
        cia_1.Ga = mIaArray;
        Cia_1 cia_14 = a2;
        cia_14.p = vRa.d;
        cia_14.S = xSa.la;
        cia_14.U = uSa.E;
        cia_14.wa = uSa.E;
        cia_14.Ta = uSa.E;
        cia_14.K = Config.r();
        cia_14.R = Config.r();
        cia_14.Ba = pqa.r;
        cia_14.Q = uSa.E;
        cia_14.Fa = vRa.d;
        cia_14.td = uSa.E;
        cia_14.Y = JPa.N;
        cia_14.ma = uSa.E;
        cia_14.P = uSa.E;
        cia_14.NA = uSa.E;
        cia_14.O = yRa.d;
        cia_14.uc = rSa.B;
        cia_14.Wa = uSa.E;
        cia_14.AA = uSa.E;
        cia_14.l = uSa.E;
        cia_14.gc = vRa.d;
        cia_14.ua = vRa.d;
        cia_14.La = vRa.d;
        cia_14.Pa = vRa.d;
        cia_14.mB = uSa.E;
        cia_14.LB = vRa.d;
        cia_14.n = uSa.E;
        cia_14.Ya = uSa.E;
        cia_14.Qa = uSa.E;
        cia_14.gB = uSa.E;
        cia_14.ya = xqa.A;
        cia_14.fa = vRa.d;
        cia_14.j = vRa.d;
        cia_14.A = vRa.d;
        cia_14.da = vRa.d;
        cia_14.Oa = vRa.d;
        cia_14.g = vRa.d;
        cia_14.Ea = vRa.d;
        cia_14.za = uqa.g;
        cia_14.ka = vRa.d;
        cia_14.aC = uSa.E;
        cia_14.Uc = uSa.E;
        cia_14.Za = vRa.d;
        cia_14.Bb = uSa.E;
        cia_14.fA = vRa.d;
        cia_14.DA = yRa.d;
        cia_14.cA = uSa.E;
        cia_14.hc = uSa.E;
        cia_14.Ca = vRa.d;
        cia_14.J = vRa.d;
        cia_14.ca = vRa.d;
        cia_14.XC = vRa.d;
        cia_14.jC = vRa.d;
        cia_14.CC = vRa.d;
        cia_14.Sa = vRa.d;
        cia_14.gC = vRa.d;
        cia_14.ga = vRa.d;
        cia_14.Ra = vRa.d;
        cia_14.Ka = vRa.d;
        cia_14.r = vRa.d;
        cia_14.w = vRa.d;
        cia_14.c = vRa.d;
        cia_14.OB = vRa.d;
        mIa[] mIaArray2 = new mIa[kTa.g];
        mIaArray2[uSa.E] = a2.H;
        mIaArray2[vRa.d] = a2.pA;
        mIaArray2[uqa.g] = a2.jb;
        mIaArray2[yRa.d] = a2.L;
        mIaArray2[AQa.P] = a2.JA;
        mIaArray2[tTa.h] = a2.gd;
        mIaArray2[uua.p] = a2.ta;
        mIaArray2[XTa.W] = a2.ia;
        mIaArray2[Yqa.i] = a2.CB;
        mIaArray2[WOa.fa] = a2.ub;
        mIaArray2[NTa.C] = a2.xc;
        mIaArray2[pPa.f] = a2.wc;
        mIaArray2[lqa.s] = a2.q;
        mIaArray2[uua.s] = a2.I;
        mIaArray2[hpa.Z] = a2.Wc;
        mIaArray2[Ypa.A] = a2.v;
        mIaArray2[ERa.C] = a2.Sb;
        mIaArray2[yta.Ka] = a2.Gb;
        mIaArray2[yOa.B] = a2.m;
        mIaArray2[wOa.t] = a2.kd;
        mIaArray2[kTa.j] = a2.E;
        mIaArray2[wOa.h] = a2.V;
        mIaArray2[cQa.o] = a2.QA;
        mIaArray2[AQa.ba] = a2.WB;
        mIaArray2[osa.c] = a2.yb;
        cia_14.ja = ArrayUtils.addAll(mIaArray2, a2.Ga);
        Cia_1 cia_15 = a2;
        cia_15.Ma = sZ.NORMAL;
        cia_15.d = Mqa.y;
        cia_15.LA = UOa.d;
        cia_15.pb = NOa.h;
        cia_15.Lc = uSa.E;
    }

    private float J(String string) {
        String b2 = string;
        Cia_1 a2 = this;
        if (b2.equals(oQa.l)) {
            return pqa.r;
        }
        if (b2.equals(MRa.E)) {
            return JPa.N;
        }
        return Float.parseFloat(b2);
    }

    /*
     * Exception decompiling
     */
    public void f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 4[CATCHBLOCK]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     */
    public String J(Fha fha) {
        void a2;
        Object object = this;
        Object b2 = ((Cia_1)object).f((Fha)a2);
        if (b2 != null) {
            return b2;
        }
        b2 = oha.J(a2.getEnumString(), new Object[uSa.E]) + Xpa.E;
        if (a2.getEnumFloat()) {
            StringBuilder stringBuilder;
            void v0 = a2;
            float f2 = ((Cia_1)object).J((Fha)v0);
            float f3 = a2.normalizeValue(f2);
            if (v0 == Fha.SENSITIVITY) {
                StringBuilder stringBuilder2;
                if (f3 == JPa.N) {
                    return new StringBuilder().insert(5 >> 3, (String)b2).append(oha.J(dsa.N, new Object[uSa.E])).toString();
                }
                if (f3 == pqa.r) {
                    stringBuilder2 = new StringBuilder();
                    return stringBuilder2.insert(2 & 5, (String)b2).append(oha.J(Bra.b, new Object[uSa.E])).toString();
                }
                stringBuilder2 = new StringBuilder();
                return stringBuilder2.insert(3 & 4, (String)b2).append((int)(f3 * Qsa.U)).append(Wqa.fa).toString();
            }
            if (a2 == Fha.FOV) {
                StringBuilder stringBuilder3;
                if (f2 == UOa.d) {
                    return new StringBuilder().insert(2 & 5, (String)b2).append(oha.J(zpa.Ja, new Object[uSa.E])).toString();
                }
                if (f2 == Hra.ja) {
                    stringBuilder3 = new StringBuilder();
                    return stringBuilder3.insert(2 & 5, (String)b2).append(oha.J(dpa.y, new Object[uSa.E])).toString();
                }
                stringBuilder3 = new StringBuilder();
                return stringBuilder3.insert(3 ^ 3, (String)b2).append((int)f2).toString();
            }
            if (a2 == Fha.FRAMERATE_LIMIT) {
                StringBuilder stringBuilder4;
                if (f2 == Fha.access$000((Fha)a2)) {
                    stringBuilder4 = new StringBuilder();
                    return stringBuilder4.insert(3 ^ 3, (String)b2).append(oha.J(APa.ca, new Object[uSa.E])).toString();
                }
                stringBuilder4 = new StringBuilder();
                return stringBuilder4.insert(3 >> 2, (String)b2).append((int)f2).append(oua.w).toString();
            }
            if (a2 == Fha.RENDER_CLOUDS) {
                StringBuilder stringBuilder5;
                if (f2 == Fha.access$100((Fha)a2)) {
                    stringBuilder5 = new StringBuilder();
                    return stringBuilder5.insert(2 & 5, (String)b2).append(oha.J(JTa.c, new Object[uSa.E])).toString();
                }
                stringBuilder5 = new StringBuilder();
                return stringBuilder5.insert(0, (String)b2).append((int)f2 + XOa.h).toString();
            }
            if (a2 == Fha.GAMMA) {
                StringBuilder stringBuilder6;
                if (f3 == JPa.N) {
                    return new StringBuilder().insert(0, (String)b2).append(oha.J(hQa.s, new Object[uSa.E])).toString();
                }
                if (f3 == pqa.r) {
                    stringBuilder6 = new StringBuilder();
                    return stringBuilder6.insert(0, (String)b2).append(oha.J(APa.C, new Object[uSa.E])).toString();
                }
                stringBuilder6 = new StringBuilder();
                return stringBuilder6.insert(0, (String)b2).append(NQa.C).append((int)(f3 * QTa.G)).append(Wqa.fa).toString();
            }
            if (a2 == Fha.SATURATION) {
                return new StringBuilder().insert(0, (String)b2).append((int)(f3 * uSa.A)).append(Wqa.fa).toString();
            }
            if (a2 == Fha.CHAT_OPACITY) {
                return new StringBuilder().insert(0, (String)b2).append((int)(f3 * ISa.a + FRa.Ga)).append(Wqa.fa).toString();
            }
            if (a2 == Fha.CHAT_HEIGHT_UNFOCUSED) {
                return new StringBuilder().insert(0, (String)b2).append(pma.f((float)f3)).append(bSa.T).toString();
            }
            if (a2 == Fha.CHAT_HEIGHT_FOCUSED) {
                return new StringBuilder().insert(0, (String)b2).append(pma.f((float)f3)).append(bSa.T).toString();
            }
            if (a2 == Fha.CHAT_WIDTH) {
                return new StringBuilder().insert(0, (String)b2).append(pma.J((float)f3)).append(bSa.T).toString();
            }
            if (a2 == Fha.RENDER_DISTANCE) {
                return new StringBuilder().insert(0, (String)b2).append((int)f2).append(Ura.y).toString();
            }
            if (a2 == Fha.MIPMAP_LEVELS) {
                StringBuilder stringBuilder7;
                if (f2 == JPa.N) {
                    stringBuilder7 = new StringBuilder();
                    return stringBuilder7.insert(0, (String)b2).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
                }
                stringBuilder7 = new StringBuilder();
                return stringBuilder7.insert(0, (String)b2).append((int)f2).toString();
            }
            if (a2 == Fha.STREAM_FPS) {
                return new StringBuilder().insert(0, (String)b2).append(Oz.J((float)(FRa.Ga + f3 * SPa.b))).append(oua.w).toString();
            }
            if (a2 == Fha.STREAM_KBPS) {
                return new StringBuilder().insert(0, (String)b2).append(Oz.J((float)(vRa.q + f3 * bsa.u))).append(ERa.m).toString();
            }
            if (a2 == Fha.STREAM_BYTES_PER_PIXEL) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Float.valueOf(f3);
                return new StringBuilder().insert(0, (String)b2).append(String.format(cTa.u, objectArray)).toString();
            }
            if (f3 == JPa.N) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append((int)(f3 * QTa.G)).append(Wqa.fa).toString();
        }
        if (a2.getEnumBoolean()) {
            StringBuilder stringBuilder;
            boolean bl = ((Cia_1)object).J((Fha)a2);
            if (bl) {
                stringBuilder = new StringBuilder();
                return stringBuilder.insert(0, (String)b2).append(oha.J(ppa.H, new Object[uSa.E])).toString();
            }
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, (String)b2).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
        }
        if (a2 == Fha.GUI_SCALE) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(C, ((Cia_1)object).F)).toString();
        }
        if (a2 == Fha.CHAT_VISIBILITY) {
            return new StringBuilder().insert(0, (String)b2).append(oha.J(((Cia_1)object).qa.getResourceKey(), new Object[uSa.E])).toString();
        }
        if (a2 == Fha.PARTICLES) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(f, ((Cia_1)object).kB)).toString();
        }
        if (a2 == Fha.AMBIENT_OCCLUSION) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(o, ((Cia_1)object).oa)).toString();
        }
        if (a2 == Fha.STREAM_COMPRESSION) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(Ia, ((Cia_1)object).Pd)).toString();
        }
        if (a2 == Fha.STREAM_CHAT_ENABLED) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(a, ((Cia_1)object).Xb)).toString();
        }
        if (a2 == Fha.STREAM_CHAT_USER_FILTER) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(cd, ((Cia_1)object).ra)).toString();
        }
        if (a2 == Fha.STREAM_MIC_TOGGLE_BEHAVIOR) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(tA, ((Cia_1)object).Va)).toString();
        }
        if (a2 == Fha.RENDER_CLOUDS) {
            return new StringBuilder().insert(0, (String)b2).append(Cia_1.J(na, ((Cia_1)object).z)).toString();
        }
        if (a2 == Fha.GRAPHICS) {
            if (((Cia_1)object).u) {
                return new StringBuilder().insert(0, (String)b2).append(oha.J(LRa.X, new Object[uSa.E])).toString();
            }
            String string = Bra.K;
            return new StringBuilder().insert(0, (String)b2).append(oha.J(Bra.K, new Object[uSa.E])).toString();
        }
        return b2;
    }

    private static int J(int n2, int[] nArray) {
        int a2 = n2;
        int[] b2 = nArray;
        if (Cia_1.f(a2, b2) < 0) {
            return b2[uSa.E];
        }
        return a2;
    }

    public void J() {
        Cia_1 a2;
        Display.setVSyncEnabled(a2.y);
    }

    public void J(pda pda2) {
        Cia_1 cia_1;
        Cia_1 b2 = pda2;
        Cia_1 a2 = this;
        if (!a2.J().contains(b2)) {
            Cia_1 cia_12 = a2;
            cia_1 = cia_12;
            cia_12.Qd.add(b2);
        } else {
            Cia_1 cia_13 = a2;
            cia_1 = cia_13;
            cia_13.Qd.remove(b2);
        }
        cia_1.e();
    }

    static {
        ib = LogManager.getLogger();
        N = new Gson();
        h = new Uha();
        String[] stringArray = new String[pPa.f];
        stringArray[uSa.E] = Qpa.fa;
        stringArray[vRa.d] = gua.I;
        stringArray[uqa.g] = wPa.M;
        stringArray[yRa.d] = TPa.f;
        stringArray[AQa.P] = aqa.b;
        stringArray[tTa.h] = wua.l;
        stringArray[uua.p] = wua.V;
        stringArray[XTa.W] = kPa.Da;
        stringArray[Yqa.i] = Gta.V;
        stringArray[WOa.fa] = Ata.m;
        stringArray[NTa.C] = hra.H;
        C = stringArray;
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = osa.v;
        stringArray2[vRa.d] = MRa.Y;
        stringArray2[uqa.g] = PRa.g;
        f = stringArray2;
        String[] stringArray3 = new String[yRa.d];
        stringArray3[uSa.E] = zsa.G;
        stringArray3[vRa.d] = EQa.K;
        stringArray3[uqa.g] = csa.z;
        o = stringArray3;
        String[] stringArray4 = new String[yRa.d];
        stringArray4[uSa.E] = dqa.Z;
        stringArray4[vRa.d] = Qta.J;
        stringArray4[uqa.g] = Xsa.la;
        Ia = stringArray4;
        String[] stringArray5 = new String[yRa.d];
        stringArray5[uSa.E] = eta.A;
        stringArray5[vRa.d] = pQa.b;
        stringArray5[uqa.g] = VPa.c;
        a = stringArray5;
        String[] stringArray6 = new String[yRa.d];
        stringArray6[uSa.E] = aua.u;
        stringArray6[vRa.d] = Lra.Ka;
        stringArray6[uqa.g] = Pua.o;
        cd = stringArray6;
        String[] stringArray7 = new String[uqa.g];
        stringArray7[uSa.E] = lqa.Y;
        stringArray7[vRa.d] = Tpa.m;
        tA = stringArray7;
        String[] stringArray8 = new String[yRa.d];
        stringArray8[uSa.E] = tSa.Ha;
        stringArray8[vRa.d] = Bra.K;
        stringArray8[uqa.g] = LRa.X;
        na = stringArray8;
        int[] nArray = new int[AQa.P];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = vRa.d;
        nArray[uqa.g] = AQa.P;
        nArray[yRa.d] = uqa.g;
        FC = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = yRa.d;
        nArray2[vRa.d] = vRa.d;
        nArray2[uqa.g] = uqa.g;
        k = nArray2;
        String[] stringArray9 = new String[yRa.d];
        stringArray9[uSa.E] = tSa.Ha;
        stringArray9[vRa.d] = Bra.K;
        stringArray9[uqa.g] = LRa.X;
        rB = stringArray9;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void J(Fha var1_1, int var2_2) {
        block93: {
            block92: {
                c /* !! */  = var1_1;
                b = this /* !! */ ;
                if (c /* !! */  != Fha.FOG_FANCY) break block92;
                switch (b.p) lbl-1000:
                // 2 sources

                {
                    case 1: {
                        if (false) ** GOTO lbl-1000
                        b.p = uqa.g;
                        if (Config.s()) break;
                        v0 /* !! */  = c /* !! */ ;
                        b.p = yRa.d;
                        break block93;
                    }
                    case 2: {
                        b.p = yRa.d;
                        v0 /* !! */  = c /* !! */ ;
                        break block93;
                    }
                    case 3: {
                        b.p = vRa.d;
                        v0 /* !! */  = c /* !! */ ;
                        break block93;
                    }
                    default: {
                        b.p = vRa.d;
                    }
                }
            }
            v0 /* !! */  = c /* !! */ ;
        }
        if (v0 /* !! */  == Fha.FOG_START) {
            v1 = b;
            v1.S += psa.N;
            if (v1.S > pQa.N) {
                b.S = psa.N;
            }
        }
        if (c /* !! */  == Fha.SMOOTH_FPS) {
            b.Ta = b.Ta == false ? vRa.d : uSa.E;
            v2 = (int)b.Ta;
        }
        if (c /* !! */  == Fha.SMOOTH_WORLD) {
            b.K = b.K == false ? vRa.d : uSa.E;
            Config.l();
        }
        if (c /* !! */  == Fha.CLOUDS) {
            v3 = b;
            v3.td += vRa.d;
            if (v3.td > yRa.d) {
                b.td = uSa.E;
            }
            v4 = b;
            v4.C();
            v4.Ua.Aa.e();
        }
        if (c /* !! */  == Fha.TREES) {
            v5 = b;
            v5.ma = Cia_1.l(v5.ma, Cia_1.FC);
            v5.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.DROPPED_ITEMS) {
            v6 = b;
            v6.NA += vRa.d;
            if (v6.NA > uqa.g) {
                b.NA = uSa.E;
            }
        }
        if (c /* !! */  == Fha.RAIN) {
            v7 = b;
            v7.P += vRa.d;
            if (v7.P > yRa.d) {
                b.P = uSa.E;
            }
        }
        if (c /* !! */  == Fha.ANIMATED_WATER) {
            v8 = b;
            v8.cA += vRa.d;
            if (v8.cA == vRa.d) {
                b.cA += vRa.d;
            }
            if (b.cA > uqa.g) {
                b.cA = uSa.E;
            }
        }
        if (c /* !! */  == Fha.ANIMATED_LAVA) {
            v9 = b;
            v9.hc += vRa.d;
            if (v9.hc == vRa.d) {
                b.hc += vRa.d;
            }
            if (b.hc > uqa.g) {
                b.hc = uSa.E;
            }
        }
        if (c /* !! */  == Fha.ANIMATED_FIRE) {
            b.Ca = b.Ca == false ? vRa.d : uSa.E;
            v10 = (int)b.Ca;
        }
        if (c /* !! */  == Fha.ANIMATED_PORTAL) {
            b.J = b.J == false ? vRa.d : uSa.E;
            v11 = (int)b.J;
        }
        if (c /* !! */  == Fha.ANIMATED_REDSTONE) {
            b.ca = b.ca == false ? vRa.d : uSa.E;
            v12 = (int)b.ca;
        }
        if (c /* !! */  == Fha.ANIMATED_EXPLOSION) {
            b.XC = b.XC == false ? vRa.d : uSa.E;
            v13 = (int)b.XC;
        }
        if (c /* !! */  == Fha.ANIMATED_FLAME) {
            b.jC = b.jC == false ? vRa.d : uSa.E;
            v14 = (int)b.jC;
        }
        if (c /* !! */  == Fha.ANIMATED_SMOKE) {
            b.CC = b.CC == false ? vRa.d : uSa.E;
            v15 = (int)b.CC;
        }
        if (c /* !! */  == Fha.VOID_PARTICLES) {
            b.Sa = b.Sa == false ? vRa.d : uSa.E;
            v16 = (int)b.Sa;
        }
        if (c /* !! */  == Fha.WATER_PARTICLES) {
            b.gC = b.gC == false ? vRa.d : uSa.E;
            v17 = (int)b.gC;
        }
        if (c /* !! */  == Fha.PORTAL_PARTICLES) {
            b.Ra = b.Ra == false ? vRa.d : uSa.E;
            v18 = (int)b.Ra;
        }
        if (c /* !! */  == Fha.POTION_PARTICLES) {
            b.Ka = b.Ka == false ? vRa.d : uSa.E;
            v19 = (int)b.Ka;
        }
        if (c /* !! */  == Fha.FIREWORK_PARTICLES) {
            b.r = b.r == false ? vRa.d : uSa.E;
            v20 = (int)b.r;
        }
        if (c /* !! */  == Fha.DRIPPING_WATER_LAVA) {
            b.w = b.w == false ? vRa.d : uSa.E;
            v21 = (int)b.w;
        }
        if (c /* !! */  == Fha.ANIMATED_TERRAIN) {
            b.c = b.c == false ? vRa.d : uSa.E;
            v22 = (int)b.c;
        }
        if (c /* !! */  == Fha.ANIMATED_TEXTURES) {
            b.OB = b.OB == false ? vRa.d : uSa.E;
            v23 = (int)b.OB;
        }
        if (c /* !! */  == Fha.RAIN_SPLASH) {
            b.ga = b.ga == false ? vRa.d : uSa.E;
            v24 = (int)b.ga;
        }
        if (c /* !! */  == Fha.LAGOMETER) {
            b.Wa = b.Wa == false ? vRa.d : uSa.E;
            v25 = (int)b.Wa;
        }
        if (c /* !! */  == Fha.SHOW_FPS) {
            b.l = b.l == false ? vRa.d : uSa.E;
            v26 = (int)b.l;
        }
        if (c /* !! */  == Fha.AUTOSAVE_TICKS) {
            v27 = b;
            v27.uc *= NTa.C;
            if (v27.uc > NQa.ca) {
                b.uc = wra.P;
            }
        }
        if (c /* !! */  == Fha.BETTER_GRASS) {
            v28 = b;
            v28.O += vRa.d;
            if (v28.O > yRa.d) {
                b.O = vRa.d;
            }
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.CONNECTED_TEXTURES) {
            v29 = b;
            v29.za += vRa.d;
            if (v29.za > yRa.d) {
                b.za = vRa.d;
            }
            if (b.za != uqa.g) {
                b.Ua.i();
            }
        }
        if (c /* !! */  == Fha.WEATHER) {
            b.gc = b.gc == false ? vRa.d : uSa.E;
            v30 = (int)b.gc;
        }
        if (c /* !! */  == Fha.SKY) {
            b.ua = b.ua == false ? vRa.d : uSa.E;
            v31 = (int)b.ua;
        }
        if (c /* !! */  == Fha.STARS) {
            b.La = b.La == false ? vRa.d : uSa.E;
            v32 = (int)b.La;
        }
        if (c /* !! */  == Fha.SUN_MOON) {
            b.Pa = b.Pa == false ? vRa.d : uSa.E;
            v33 = (int)b.Pa;
        }
        if (c /* !! */  == Fha.VIGNETTE) {
            v34 = b;
            v34.mB += vRa.d;
            if (v34.mB > uqa.g) {
                b.mB = uSa.E;
            }
        }
        if (c /* !! */  == Fha.CHUNK_UPDATES) {
            v35 = b;
            v35.LB += vRa.d;
            if (v35.LB > tTa.h) {
                b.LB = vRa.d;
            }
        }
        if (c /* !! */  == Fha.CHUNK_UPDATES_DYNAMIC) {
            b.n = b.n == false ? vRa.d : uSa.E;
            v36 = (int)b.n;
        }
        if (c /* !! */  == Fha.TIME) {
            v37 = b;
            v37.Ya += vRa.d;
            if (v37.Ya > uqa.g) {
                b.Ya = uSa.E;
            }
        }
        if (c /* !! */  == Fha.CLEAR_WATER) {
            b.Qa = b.Qa == false ? vRa.d : uSa.E;
            b.M();
        }
        if (c /* !! */  == Fha.PROFILER) {
            b.AA = b.AA == false ? vRa.d : uSa.E;
            v38 = (int)b.AA;
        }
        if (c /* !! */  == Fha.BETTER_SNOW) {
            b.gB = b.gB == false ? vRa.d : uSa.E;
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.SWAMP_COLORS) {
            b.fa = b.fa == false ? vRa.d : uSa.E;
            XE.J();
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.RANDOM_MOBS) {
            b.j = b.j == false ? vRa.d : uSa.E;
            Se.f();
        }
        if (c /* !! */  == Fha.SMOOTH_BIOMES) {
            b.A = b.A == false ? vRa.d : uSa.E;
            XE.J();
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.CUSTOM_FONTS) {
            b.da = b.da == false ? vRa.d : uSa.E;
            v39 = b;
            v39.Ua.Ea.J(Config.J());
            v39.Ua.xa.J(Config.J());
        }
        if (c /* !! */  == Fha.CUSTOM_COLORS) {
            b.Oa = b.Oa == false ? vRa.d : uSa.E;
            XE.f();
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.CUSTOM_ITEMS) {
            b.ka = b.ka == false ? vRa.d : uSa.E;
            b.Ua.i();
        }
        if (c /* !! */  == Fha.CUSTOM_SKY) {
            b.g = b.g == false ? vRa.d : uSa.E;
            jg.J();
        }
        if (c /* !! */  == Fha.SHOW_CAPES) {
            b.Ea = b.Ea == false ? vRa.d : uSa.E;
            v40 = (int)b.Ea;
        }
        if (c /* !! */  == Fha.NATURAL_TEXTURES) {
            b.aC = b.aC == false ? vRa.d : uSa.E;
            pe.J();
            b.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.FAST_MATH) {
            Oz.M = b.Uc = b.Uc == false ? vRa.d : uSa.E;
        }
        if (c /* !! */  == Fha.FAST_RENDER) {
            if (!b.Za && Config.h()) {
                Config.J(Kg.J(KSa.V), Kg.J(NSa.j));
                return;
            }
            b.Za = b.Za == false ? vRa.d : uSa.E;
            v41 = (int)b.Za;
            if (b.Za) {
                b.Ua.R.A();
            }
            Config.d();
        }
        if (c /* !! */  == Fha.TRANSLUCENT_BLOCKS) {
            if (b.Bb == 0) {
                b.Bb = vRa.d;
                v42 = b;
            } else if (b.Bb == vRa.d) {
                v42 = b;
                b.Bb = uqa.g;
            } else if (b.Bb == uqa.g) {
                v42 = b;
                b.Bb = uSa.E;
            } else {
                v42 = b;
                b.Bb = uSa.E;
            }
            v42.Ua.Aa.J();
        }
        if (c /* !! */  == Fha.LAZY_CHUNK_LOADING) {
            b.R = b.R == false ? vRa.d : uSa.E;
            Config.i();
            if (!Config.r()) {
                b.R = uSa.E;
            }
            b.Ua.Aa.J();
        }
        if (c /* !! */  != Fha.FULLSCREEN_MODE) ** GOTO lbl262
        a = Arrays.asList(Config.f());
        if (b.ya.equals(xqa.A)) {
            b.ya = a.get(uSa.E);
            v43 /* !! */  = c /* !! */ ;
        } else {
            var3_4 = a.indexOf(b.ya);
            if (var3_4 < 0) {
                v43 /* !! */  = c /* !! */ ;
                b.ya = xqa.A;
            } else if (++var3_4 >= a.size()) {
                v43 /* !! */  = c /* !! */ ;
                b.ya = xqa.A;
            } else {
                b.ya = a.get(var3_4);
lbl262:
                // 2 sources

                v43 /* !! */  = c /* !! */ ;
            }
        }
        if (v43 /* !! */  == Fha.DYNAMIC_FOV) {
            b.fA = b.fA == false ? vRa.d : uSa.E;
            v44 = (int)b.fA;
        }
        if (c /* !! */  == Fha.DYNAMIC_LIGHTS) {
            v45 = b;
            v45.DA = Cia_1.l(v45.DA, Cia_1.k);
            vf.J((ZJa)v45.Ua.Aa);
        }
        if (c /* !! */  == Fha.HELD_ITEM_TOOLTIPS) {
            b.D = b.D == false ? vRa.d : uSa.E;
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Cia_1 a2 = this;
        int n2 = b2 ? uSa.E : uqa.g;
        Cia_1 cia_1 = a2;
        Cia_1 cia_12 = a2;
        Cia_1 cia_13 = a2;
        Cia_1 cia_14 = a2;
        Cia_1 cia_15 = a2;
        cia_15.hc = a2.cA = n2;
        cia_15.Ca = b2;
        cia_14.ca = a2.J = b2;
        cia_14.XC = b2;
        cia_13.CC = a2.jC = b2;
        cia_13.Sa = b2;
        cia_12.ga = a2.gC = b2;
        cia_12.Ra = b2;
        cia_1.r = a2.Ka = b2;
        cia_1.kB = b2 ? uSa.E : uqa.g;
        Cia_1 cia_16 = a2;
        cia_16.c = a2.w = b2;
        cia_16.OB = b2;
    }
}

