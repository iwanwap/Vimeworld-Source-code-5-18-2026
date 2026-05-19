/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cg
 *  DQa
 *  EQa
 *  ERa
 *  JSa
 *  Jy
 *  KTa
 *  Kpa
 *  LE
 *  Lra
 *  NTa
 *  Ppa
 *  Pqa
 *  QSa
 *  Qqa
 *  Ssa
 *  TPa
 *  Tpa
 *  Vua
 *  WSa
 *  XTa
 *  Ysa
 *  Zpa
 *  aqa
 *  bRa
 *  hTa
 *  hqa
 *  jRa
 *  jpa
 *  pQa
 *  pua
 *  uOa
 *  uRa
 *  ura
 *  vRa
 *  yra
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tE {
    public static final int Y = 0;
    public int[] r;
    public static final int V = 128;
    public static final int z = 1;
    public int X;
    public static final int y = 2;
    public static final int U = 16;
    public static final int P = 6;
    public static final int u = 63;
    public static final int O = 5;
    public static final int t = 60;
    public static final int R = 9;
    public int[] Q;
    public int N;
    public static final int T = 128;
    public int p;
    public int n;
    public static final int s = 128;
    public String[] w;
    public static final int W = 1;
    public static final int q = 8;
    public boolean x;
    public static final int v = 0;
    public static final int o = 3;
    public String h;
    public static final int K = 3;
    public int[] H;
    public KLa[] c;
    public static final int B = 1;
    public static final int d = 2;
    public Jy[] a;
    public static final int b = 7;
    public String l;
    public int e;
    public static final int G = 2;
    public static final int D = 4;
    public String[] f;
    public static final int F = 6;
    public static final int g = 2;
    public static final int L = 4;
    public static final int E = 32;
    public int m;
    public static final int C = 8;
    public ze[] i;
    public int M;
    public int k;
    public static final int j = 1;
    public int J;
    public KLa[] A;
    public int I;

    private boolean D(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            Config.J(new StringBuilder().insert(2 & 5, lQa.P).append(b2).toString());
            return uSa.E != 0;
        }
        if (a2.f.length != XTa.W) {
            Config.J(new StringBuilder().insert(5 >> 3, WRa.T).append(b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public tE(Properties properties, String string) {
        void a2;
        tE b2;
        Properties c2 = properties;
        tE tE2 = b2 = this;
        tE tE3 = b2;
        tE tE4 = b2;
        tE tE5 = b2;
        tE tE6 = b2;
        tE tE7 = b2;
        tE tE8 = b2;
        tE tE9 = b2;
        tE tE10 = b2;
        b2.h = null;
        tE10.l = null;
        tE10.i = null;
        tE9.r = null;
        tE9.w = null;
        tE8.m = uSa.E;
        tE8.f = null;
        tE8.N = uSa.E;
        tE7.k = Ssa.u;
        tE6.a = null;
        tE7.I = uSa.E;
        tE6.J = ura.V;
        tE6.M = uSa.E;
        tE6.x = uSa.E;
        tE5.p = uSa.E;
        tE5.e = uSa.E;
        tE5.H = null;
        tE4.n = vRa.d;
        tE4.Q = null;
        tE4.X = vRa.d;
        tE3.c = null;
        tE2.A = null;
        LE lE2 = new LE(xTa.Z);
        tE3.h = lE2.f((String)a2);
        tE2.l = lE2.J((String)a2);
        tE2.i = lE2.f(c2.getProperty(aqa.a));
        tE2.r = lE2.J(c2.getProperty(LRa.f));
        tE2.w = tE2.f(c2.getProperty(Pqa.s));
        tE2.m = tE.l(c2.getProperty(UTa.e));
        tE2.f = tE2.J(c2.getProperty(ura.B));
        tE2.N = tE.d(c2.getProperty(TOa.fa));
        tE2.k = tE.f(c2.getProperty(ITa.Z));
        tE2.a = lE2.J(c2.getProperty(bRa.N));
        tE2.I = lE2.J(c2.getProperty(Nta.M), pua.o);
        tE2.J = lE2.J(c2.getProperty(mSa.ga), ura.V);
        tE2.M = lE2.J(c2.getProperty(KSa.o));
        tE2.x = LE.J((String)c2.getProperty(rSa.la));
        tE2.p = lE2.J(c2.getProperty(oQa.R));
        tE2.e = lE2.J(c2.getProperty(NTa.x));
        tE2.H = lE2.J(c2.getProperty(xra.C));
        tE2.n = tE.C(c2.getProperty(opa.a));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean A(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.h != null && a2.h.length() > 0) {
            if (a2.l == null) {
                Config.J(new StringBuilder().insert(2 & 5, xua.x).append(b2).toString());
                return uSa.E != 0;
            }
            if (a2.i == null) {
                a2.i = a2.J();
            }
            if (a2.w == null && a2.i == null) {
                a2.w = a2.J();
            }
            if (a2.i == null && a2.w == null) {
                Config.J(new StringBuilder().insert(3 & 4, uua.Z).append(b2).toString());
                return uSa.E != 0;
            }
            if (a2.m == 0) {
                Config.J(new StringBuilder().insert(3 ^ 3, Asa.q).append(b2).toString());
                return uSa.E != 0;
            }
            if (a2.f != null && a2.f.length > 0) {
                if (a2.N == 0) {
                    a2.N = a2.f();
                }
                if (a2.N == XOa.h) {
                    Config.J(new StringBuilder().insert(3 ^ 3, KTa.d).append(b2).toString());
                    return uSa.E != 0;
                }
                if (a2.M > 0) {
                    Config.J(new StringBuilder().insert(2 & 5, vTa.Ka).append(a2.M).toString());
                    return uSa.E != 0;
                }
                if ((a2.k & XOa.h) != 0) {
                    Config.J(new StringBuilder().insert(3 & 4, Lsa.ba).append(b2).toString());
                    return uSa.E != 0;
                }
                if ((a2.n & XOa.h) != 0) {
                    Config.J(new StringBuilder().insert(2 & 5, bRa.P).append(b2).toString());
                    return uSa.E != 0;
                }
                switch (a2.m) {
                    case 1: {
                        return a2.i(b2);
                    }
                    case 2: {
                        return a2.J(b2);
                    }
                    case 3: {
                        return a2.e(b2);
                    }
                    case 4: {
                        return a2.M(b2);
                    }
                    case 5: {
                        return a2.C(b2);
                    }
                    case 6: {
                        return a2.l(b2);
                    }
                    case 7: {
                        return a2.f(b2);
                    }
                    case 8: {
                        return a2.d(b2);
                    }
                    case 9: {
                        return a2.D(b2);
                    }
                }
                Config.J(new StringBuilder().insert(3 >> 2, Hta.S).append(b2).toString());
                return uSa.E != 0;
            }
            Config.J(new StringBuilder().insert(5 >> 3, Hta.Ga).append(b2).toString());
            return uSa.E != 0;
        }
        Config.J(new StringBuilder().insert(0, qQa.o).append(b2).toString());
        return uSa.E != 0;
    }

    private String[] J() {
        tE a2;
        if (tE.J(a2.h) == null) {
            return null;
        }
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = a2.h;
        return stringArray;
    }

    private boolean i(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            a2.f = a2.J(jpa.la);
        }
        if (a2.f.length < uOa.F) {
            Config.J(new StringBuilder().insert(3 & 4, nua.H).append(b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private static String f(String string) {
        String string2 = string;
        int a2 = string2.lastIndexOf(uOa.F);
        if (a2 < 0) {
            return Mqa.y;
        }
        return string2.substring(uSa.E, a2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean M(String string) {
        void a2;
        tE tE2 = this;
        if (tE2.f != null && tE2.f.length > 0) {
            if (tE2.H != null) {
                int n2;
                Object b22;
                if (tE2.H.length > tE2.f.length) {
                    Config.J(new StringBuilder().insert(2 & 5, NSa.L).append((String)a2).toString());
                    Object object = b22 = (Object)new int[tE2.f.length];
                    System.arraycopy(tE2.H, uSa.E, object, uSa.E, ((Object)object).length);
                    tE2.H = (int[])b22;
                }
                if (tE2.H.length < tE2.f.length) {
                    int n3;
                    Config.J(new StringBuilder().insert(3 >> 2, VPa.f).append((String)a2).toString());
                    b22 = new int[tE2.f.length];
                    System.arraycopy(tE2.H, uSa.E, b22, uSa.E, tE2.H.length);
                    tE tE3 = tE2;
                    n2 = ff.J(tE3.H);
                    int n4 = n3 = tE3.H.length;
                    while (n4 < ((Object)b22).length) {
                        b22[n3++] = n2;
                        n4 = n3;
                    }
                    tE2.H = (int[])b22;
                }
                tE2.Q = new int[tE2.H.length];
                int b22 = uSa.E;
                int n5 = n2 = uSa.E;
                while (n5 < tE2.H.length) {
                    tE2.Q[n2++] = b22 += tE2.H[n2];
                    n5 = n2;
                }
                tE2.X = b22;
                if (tE2.X <= 0) {
                    Config.J(new StringBuilder().insert(3 & 4, hqa.M).append(b22).toString());
                    tE2.X = vRa.d;
                }
            }
            return vRa.d != 0;
        }
        Config.J(new StringBuilder().insert(3 >> 2, xra.G).append((String)a2).toString());
        return uSa.E != 0;
    }

    private boolean e(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            a2.f = a2.J(sra.ga);
        }
        if (a2.f.length != vRa.d) {
            Config.J(new StringBuilder().insert(3 >> 2, TPa.o).append(b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private int f() {
        tE a2;
        if (a2.i != null) {
            return vRa.d;
        }
        if (a2.w != null) {
            return uqa.g;
        }
        return XOa.h;
    }

    private static int d(String a2) {
        if (a2 == null) {
            return uSa.E;
        }
        if (a2.equals(Lra.M)) {
            return vRa.d;
        }
        if (a2.equals(sra.F)) {
            return uqa.g;
        }
        if (a2.equals(cPa.J)) {
            return yRa.d;
        }
        Config.J(new StringBuilder().insert(3 ^ 3, Jra.Ia).append(a2).toString());
        return XOa.h;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        tE a2 = this;
        if (!Nf.J((int)b2, c2, a2.i)) {
            return uSa.E != 0;
        }
        return Nf.J(c2, a2.r);
    }

    private static int C(String a2) {
        if (a2 == null) {
            return vRa.d;
        }
        if (a2.equals(BQa.Y)) {
            return uqa.g;
        }
        if (a2.equals(JSa.H)) {
            return uua.p;
        }
        Config.J(new StringBuilder().insert(2 & 5, FRa.Ca).append(a2).toString());
        return vRa.d;
    }

    private boolean d(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            Config.J(new StringBuilder().insert(3 >> 2, rta.fa).append(b2).toString());
            return uSa.E != 0;
        }
        if (a2.f.length != XTa.W) {
            Config.J(new StringBuilder().insert(3 >> 2, WRa.T).append(b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public void J(WKa wKa) {
        Object b2 = wKa;
        tE a2 = this;
        if (a2.w != null) {
            a2.c = tE.J(a2.w, (WKa)((Object)b2));
        }
        if (a2.f != null) {
            a2.A = tE.J(a2.f, (WKa)((Object)b2));
        }
    }

    private static int l(String a2) {
        if (a2 == null) {
            return vRa.d;
        }
        if (!a2.equals(Jta.B) && !a2.equals(pQa.T)) {
            if (!a2.equals(Ppa.Aa) && !a2.equals(IPa.H)) {
                if (a2.equals(Ysa.K)) {
                    return uua.p;
                }
                if (a2.equals(JSa.z)) {
                    return yRa.d;
                }
                if (a2.equals(iSa.Y)) {
                    return AQa.P;
                }
                if (a2.equals(LRa.Q)) {
                    return tTa.h;
                }
                if (a2.equals(Ura.p)) {
                    return XTa.W;
                }
                if (!a2.equals(XOa.H) && !a2.equals(Vua.R)) {
                    if (!a2.equals(ERa.b) && !a2.equals(WOa.I)) {
                        Config.J(new StringBuilder().insert(5 >> 3, Hta.S).append(a2).toString());
                        return uSa.E;
                    }
                    return WOa.fa;
                }
                return Yqa.i;
            }
            return uqa.g;
        }
        return vRa.d;
    }

    public boolean J(int n2) {
        int b2 = n2;
        tE a2 = this;
        return Nf.J(b2, a2.i);
    }

    private String[] f(String string) {
        int n2;
        String[] b2 = string;
        tE a2 = this;
        if (b2 == null) {
            return null;
        }
        b2 = Config.J((String)b2, Tpa.E);
        int n3 = n2 = uSa.E;
        while (n3 < b2.length) {
            String string2 = b2[n2];
            if (string2.endsWith(KPa.C)) {
                String string3 = string2;
                string2 = string3.substring(uSa.E, string3.length() - AQa.P);
            }
            string2 = Cg.J((String)string2, (String)a2.l);
            b2[n2++] = string2;
            n3 = n2;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int[] nArray, int n2) {
        int n3;
        void b2;
        int c2 = n2;
        tE a2 = this;
        if (b2 == null) {
            return c2;
        }
        int n4 = n3 = uSa.E;
        while (n4 < ((void)b2).length) {
            void var4_6 = b2[n3];
            if (var4_6 > c2) {
                c2 = var4_6;
            }
            n4 = ++n3;
        }
        return c2;
    }

    private static int f(String string) {
        int n2;
        String string2 = string;
        if (string2 == null) {
            return Ssa.u;
        }
        String[] stringArray = Config.J(string2, uRa.p);
        int a2 = uSa.E;
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            int n4 = tE.J(stringArray[n2]);
            a2 |= n4;
            n3 = ++n2;
        }
        return a2;
    }

    private boolean C(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            Config.J(new StringBuilder().insert(3 & 4, xra.G).append(b2).toString());
            return uSa.E != 0;
        }
        if (a2.p > 0 && a2.p <= ERa.C) {
            if (a2.e > 0 && a2.e <= ERa.C) {
                tE tE2 = a2;
                if (a2.f.length != tE2.p * tE2.e) {
                    Config.J(new StringBuilder().insert(2 & 5, ypa.i).append(b2).toString());
                    return uSa.E != 0;
                }
                return vRa.d != 0;
            }
            Config.J(new StringBuilder().insert(2 & 5, tpa.f).append(b2).toString());
            return uSa.E != 0;
        }
        Config.J(new StringBuilder().insert(2 & 5, Yua.K).append(b2).toString());
        return uSa.E != 0;
    }

    private boolean l(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            Config.J(new StringBuilder().insert(2 & 5, Lra.D).append(b2).toString());
            return uSa.E != 0;
        }
        if (a2.f.length != AQa.P) {
            Config.J(new StringBuilder().insert(3 & 4, gua.Aa).append(b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private int[] J() {
        int n2;
        int n3;
        int a2;
        tE tE2;
        block5: {
            char c2;
            tE2 = this;
            if (!tE2.h.startsWith(Lra.M)) {
                return null;
            }
            int n4 = a2 = (n3 = Lra.M.length());
            while (n4 < tE2.h.length() && (c2 = tE2.h.charAt(a2)) >= QSa.p) {
                if (c2 > KSa.x) {
                    n2 = a2;
                    break block5;
                }
                n4 = ++a2;
            }
            n2 = a2;
        }
        if (n2 == n3) {
            return null;
        }
        String string = tE2.h.substring(n3, a2);
        if ((n3 = Config.J(string, pua.o)) < 0) {
            return null;
        }
        int[] nArray = new int[vRa.d];
        nArray[uSa.E] = n3;
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    private static KLa[] J(String[] stringArray, WKa wKa) {
        int n2;
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            return null;
        }
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        int n3 = n2 = uSa.E;
        while (n3 < stringArray2.length) {
            void a2;
            String string;
            String string2;
            Object b2 = stringArray2[n2];
            ResourceLocation resourceLocation = new ResourceLocation((String)b2);
            b2 = resourceLocation.f();
            String string3 = resourceLocation.J();
            if (!string3.contains(WSa.f)) {
                string3 = new StringBuilder().insert(5 >> 3, Ira.ca).append(string3).toString();
            }
            if (!Config.f(new ResourceLocation((String)b2, string2 = new StringBuilder().insert(3 >> 2, string3).append(KPa.C).toString()))) {
                Config.J(new StringBuilder().insert(3 ^ 3, CRa.A).append(string2).toString());
            }
            if ((string = string3).startsWith(string2 = Qqa.N)) {
                string = string3.substring(string2.length());
            }
            b2 = new ResourceLocation((String)b2, string);
            b2 = a2.J((ResourceLocation)b2);
            arrayList.add((String[])b2);
            n3 = ++n2;
        }
        ArrayList<String[]> arrayList2 = arrayList;
        KLa[] kLaArray = arrayList2.toArray(new KLa[arrayList2.size()]);
        return kLaArray;
    }

    private ze[] J() {
        int a2;
        tE tE2 = this;
        int[] nArray = tE2.J();
        if (nArray == null) {
            return null;
        }
        ze[] zeArray = new ze[nArray.length];
        int n2 = a2 = uSa.E;
        while (n2 < zeArray.length) {
            int n3 = a2;
            ze ze2 = new ze(nArray[a2]);
            zeArray[n3] = ze2;
            n2 = ++a2;
        }
        return zeArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private String[] J(String string) {
        int n2;
        void a2;
        String[] stringArray = this;
        if (a2 == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray2 = Config.J((String)a2, uRa.p);
        int n3 = n2 = uSa.E;
        while (true) {
            block12: {
                int n4;
                int n5;
                block13: {
                    int n6;
                    Object b2;
                    block9: {
                        String string2;
                        block10: {
                            int n7;
                            block11: {
                                if (n3 >= stringArray2.length) break block9;
                                string2 = stringArray2[n2];
                                if (!string2.contains(Vua.m) || ((String[])(b2 = Config.J(string2, Vua.m))).length != uqa.g) break block10;
                                n7 = Config.J(b2[uSa.E], pua.o);
                                n5 = Config.J(b2[vRa.d], pua.o);
                                if (n7 < 0 || n5 < 0) break block10;
                                if (n7 <= n5) break block11;
                                Config.J(new StringBuilder().insert(3 ^ 3, jRa.Ca).append(string2).append(EQa.x).append((String)a2).toString());
                                break block12;
                            }
                            n4 = n7;
                            break block13;
                        }
                        arrayList.add(string2);
                        break block12;
                    }
                    ArrayList<String> arrayList2 = arrayList;
                    String[] stringArray3 = arrayList2.toArray(new String[arrayList2.size()]);
                    int n8 = n6 = uSa.E;
                    while (true) {
                        String string3;
                        if (n8 >= stringArray3.length) {
                            return stringArray3;
                        }
                        b2 = stringArray3[n6];
                        if (!(((String)(b2 = Cg.J((String)b2, (String)stringArray.l))).startsWith(stringArray.l) || ((String)b2).startsWith(Qqa.N) || ((String)b2).startsWith(ITa.T))) {
                            b2 = new StringBuilder().insert(5 >> 3, stringArray.l).append(WSa.f).append((String)b2).toString();
                        }
                        if (((String)b2).endsWith(KPa.C)) {
                            Object object = b2;
                            b2 = ((String)object).substring(uSa.E, ((String)object).length() - AQa.P);
                        }
                        if (((String)b2).startsWith(string3 = Ira.ca)) {
                            b2 = ((String)b2).substring(string3.length());
                        }
                        if (((String)b2).startsWith(WSa.f)) {
                            b2 = ((String)b2).substring(vRa.d);
                        }
                        stringArray3[n6++] = b2;
                        n8 = n6;
                    }
                }
                while (n4 <= n5) {
                    int n9;
                    arrayList.add(String.valueOf(n9++));
                    n4 = n9;
                }
            }
            n3 = ++n2;
        }
    }

    public boolean J(KLa kLa2) {
        KLa b2 = kLa2;
        tE a2 = this;
        return Nf.J(b2, a2.c);
    }

    private static KLa J(String string) {
        String string2 = string;
        WKa wKa = Kpa.J().J();
        Object a2 = wKa.l(string2);
        if (a2 != null) {
            return a2;
        }
        a2 = wKa.l(new StringBuilder().insert(3 >> 2, UTa.Ga).append(string2).toString());
        return a2;
    }

    private static String J(String string) {
        String string2 = string;
        String a2 = string2;
        int n2 = a2.lastIndexOf(uOa.F);
        if (n2 >= 0) {
            a2 = string2.substring(n2 + vRa.d);
        }
        if ((n2 = a2.lastIndexOf(Bpa.Ha)) >= 0) {
            a2 = a2.substring(uSa.E, n2);
        }
        return a2;
    }

    public int J() {
        tE tE2 = this;
        int a2 = pua.o;
        tE tE3 = tE2;
        a2 = tE3.J(tE3.r, a2);
        if (tE3.i != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < tE2.i.length) {
                tE tE4 = tE2;
                int[] nArray = tE4.i[n2].J();
                a2 = tE4.J(nArray, a2);
                n3 = ++n2;
            }
        }
        return a2;
    }

    public boolean J(Jy jy) {
        tE b2 = jy;
        tE a2 = this;
        return Nf.J((Jy)b2, a2.a);
    }

    public static IProperty J(String string, Collection collection) {
        Iterator b2 = collection;
        String a2 = string;
        b2 = b2.iterator();
        while (b2.hasNext()) {
            Object e2 = b2.next();
            if (!a2.equals(((IProperty)e2).J())) continue;
            return (IProperty)e2;
        }
        return null;
    }

    public String toString() {
        tE a2;
        return new StringBuilder().insert(5 >> 3, mPa.i).append(a2.h).append(Bra.ca).append(a2.l).append(yra.b).append(Config.J(a2.i)).append(FRa.R).append(Config.J(a2.w)).toString();
    }

    private boolean f(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            Config.J(new StringBuilder().insert(3 & 4, xra.G).append(b2).toString());
            return uSa.E != 0;
        }
        if (a2.f.length != vRa.d) {
            Config.J(rQa.Q);
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private boolean J(String string) {
        String b2 = string;
        tE a2 = this;
        if (a2.f == null) {
            a2.f = a2.J(tSa.j);
        }
        if (a2.f.length != AQa.P) {
            Config.J(new StringBuilder().insert(3 ^ 3, gua.Aa).append(b2).toString());
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private static int J(String a2) {
        if (!(a2 = a2.toLowerCase()).equals(vsa.Ha) && !a2.equals(Nta.T)) {
            if (!a2.equals(JSa.z) && !a2.equals(dsa.a)) {
                if (a2.equals(hTa.d)) {
                    return AQa.P;
                }
                if (a2.equals(vsa.k)) {
                    return Yqa.i;
                }
                if (a2.equals(Zpa.D)) {
                    return fPa.i;
                }
                if (a2.equals(NTa.U)) {
                    return ERa.C;
                }
                if (a2.equals(APa.Q)) {
                    return Psa.M;
                }
                if (a2.equals(JSa.H)) {
                    return Ssa.u;
                }
                Config.J(new StringBuilder().insert(2 & 5, DQa.M).append(a2).toString());
                return XOa.h;
            }
            return uqa.g;
        }
        return vRa.d;
    }
}

