/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cg
 *  Cra
 *  DQa
 *  EQa
 *  ERa
 *  JPa
 *  JSa
 *  LJa
 *  MQa
 *  NQa
 *  PTa
 *  Qqa
 *  RA
 *  Rja
 *  SRa
 *  Tfa
 *  Tpa
 *  Usa
 *  VEa
 *  VQa
 *  Vua
 *  WE
 *  WGa
 *  WSa
 *  Yka
 *  Ypa
 *  ZRa
 *  Zpa
 *  aJa
 *  aQa
 *  aqa
 *  bpa
 *  cQa
 *  cg
 *  eAa
 *  fTa
 *  jRa
 *  je
 *  kqa
 *  mra
 *  oka
 *  pqa
 *  pua
 *  qD
 *  uKa
 *  uOa
 *  uQa
 *  uRa
 *  vRa
 *  wPa
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeSet;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gE {
    public float W;
    public int q;
    public float x;
    public static final int v = 1;
    public static final int o = 2;
    public int h;
    public Map<String, RA> K;
    public Map<String, String> H;
    public Map c;
    public qD B;
    private int d;
    public qD a;
    public String b;
    public Map l;
    public RA e;
    public KLa G;
    public int[] D;
    public static final int f = 3;
    public int F;
    public qD g;
    public float L;
    public String E;
    public int m;
    public int C;
    public ResourceLocation i;
    private int M;
    public static final int k = 0;
    public qD j;
    public String J;
    public je[] A;
    public boolean I;

    public float f(aJa aJa2) {
        gE b22 = aJa2;
        gE a2 = this;
        if (a2.d <= 0) {
            if (a2.i != null) {
                int b22 = b22.J(a2.i).J();
                int n2 = uKa.f();
                uKa.C((int)b22);
                a2.d = GL11.glGetTexLevelParameteri(BQa.Z, uSa.E, MQa.X);
                uKa.C((int)n2);
            }
            if (a2.d <= 0) {
                a2.d = ERa.C;
            }
        }
        return a2.d;
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, String string2, String string3, String string4, String string5, int n2, Map<String, String> map) {
        void d2;
        void a2;
        void b2;
        void c2;
        String g2 = string2;
        String f2 = string;
        if (f2 == null) {
            f2 = g2;
        }
        if (f2 == null) {
            void e2;
            f2 = e2;
        }
        if (f2 != null) {
            g2 = KPa.C;
            if (f2.endsWith(g2)) {
                String string6 = f2;
                f2 = string6.substring(uSa.E, string6.length() - g2.length());
            }
            f2 = gE.J(f2, (String)c2);
            return f2;
        }
        if (b2 == yRa.d) {
            return null;
        }
        if (a2 != null && (g2 = (String)a2.get(Xpa.fa)) != null) {
            return g2;
        }
        g2 = d2;
        int e2 = g2.lastIndexOf(uOa.F);
        if (e2 >= 0) {
            g2 = d2.substring(e2 + vRa.d);
        }
        if ((e2 = g2.lastIndexOf(Bpa.Ha)) >= 0) {
            g2 = g2.substring(uSa.E, e2);
        }
        g2 = gE.J(g2, (String)c2);
        return g2;
    }

    private static String J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        if (!((a2 = Cg.J((String)a2, (String)b2)).startsWith(b2) || a2.startsWith(Qqa.N) || a2.startsWith(ITa.T))) {
            a2 = new StringBuilder().insert(3 ^ 3, b2).append(WSa.f).append(a2).toString();
        }
        if (a2.endsWith(KPa.C)) {
            String string3 = a2;
            a2 = string3.substring(uSa.E, string3.length() - AQa.P);
        }
        if (a2.startsWith(b2 = Ira.ca)) {
            a2 = a2.substring(b2.length());
        }
        if (a2.startsWith(WSa.f)) {
            a2 = a2.substring(vRa.d);
        }
        return a2;
    }

    private String[] J() {
        gE gE2 = this;
        if (gE2.F == vRa.d && gE2.D.length == vRa.d) {
            VEa vEa2;
            Object object = eAa.l((int)gE2.D[uSa.E]);
            if (object == Gea.aa && gE2.B != null && gE2.B.J() > 0) {
                WE wE2 = gE2.B.J(uSa.E);
                int n2 = wE2.f();
                int a2 = (n2 & qQa.O) != 0 ? vRa.d : uSa.E;
                gE gE3 = gE2;
                String string = gE3.J(gE3.H, NQa.E, aQa.G);
                String string2 = null;
                if (a2 != 0) {
                    gE gE4 = gE2;
                    string2 = gE4.J(gE4.H, mra.r, Cra.v);
                } else {
                    gE gE5 = gE2;
                    string2 = gE5.J(gE5.H, kTa.U, cQa.Da);
                }
                String[] stringArray = new String[uqa.g];
                stringArray[uSa.E] = string;
                stringArray[vRa.d] = string2;
                return stringArray;
            }
            if (object instanceof VEa && (vEa2 = (VEa)object).J() == Tfa.LEATHER) {
                String string = kTa.c;
                Object a2 = Bta.R;
                if (vEa2.j == 0) {
                    a2 = Bta.R;
                }
                if (vEa2.j == vRa.d) {
                    a2 = TOa.m;
                }
                if (vEa2.j == uqa.g) {
                    a2 = wPa.q;
                }
                if (vEa2.j == yRa.d) {
                    a2 = Usa.R;
                }
                String string3 = new StringBuilder().insert(5 >> 3, string).append(IPa.W).append((String)a2).toString();
                gE gE6 = gE2;
                String string4 = gE6.J(gE6.H, new StringBuilder().insert(3 >> 2, uQa.X).append(string3).toString(), new StringBuilder().insert(3 ^ 3, ITa.w).append(string3).toString());
                object = gE6.J(gE6.H, new StringBuilder().insert(5 >> 3, uQa.X).append(string3).append(DQa.r).toString(), new StringBuilder().insert(3 >> 2, ITa.w).append(string3).append(DQa.r).toString());
                String[] stringArray = new String[uqa.g];
                stringArray[uSa.E] = string4;
                stringArray[vRa.d] = object;
                return stringArray;
            }
        }
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = gE2.J;
        return stringArray;
    }

    public boolean J(String string) {
        String b2 = string;
        gE a2 = this;
        if (a2.E != null && a2.E.length() > 0) {
            if (a2.b == null) {
                Config.J(new StringBuilder().insert(2 & 5, xua.x).append(b2).toString());
                return uSa.E != 0;
            }
            if (a2.F == 0) {
                Config.J(new StringBuilder().insert(3 ^ 3, tua.y).append(b2).toString());
                return uSa.E != 0;
            }
            if ((a2.F == vRa.d || a2.F == yRa.d) && a2.D == null) {
                Config.J(new StringBuilder().insert(3 & 4, VPa.Aa).append(b2).toString());
                return uSa.E != 0;
            }
            if (a2.J == null && a2.H == null) {
                Config.J(new StringBuilder().insert(3 ^ 3, PTa.b).append(b2).toString());
                return uSa.E != 0;
            }
            if (a2.F == uqa.g && a2.a == null) {
                Config.J(new StringBuilder().insert(5 >> 3, fTa.G).append(b2).toString());
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        Config.J(new StringBuilder().insert(2 & 5, qQa.o).append(b2).toString());
        return uSa.E != 0;
    }

    public gE(Properties properties, String string) {
        String a2;
        gE b2;
        Properties c2 = properties;
        gE gE2 = b2 = this;
        Properties properties2 = c2;
        gE gE3 = b2;
        gE gE4 = b2;
        void v4 = a2;
        gE gE5 = b2;
        gE gE6 = b2;
        gE gE7 = b2;
        gE gE8 = b2;
        gE gE9 = b2;
        gE gE10 = b2;
        gE gE11 = b2;
        gE gE12 = b2;
        gE gE13 = b2;
        gE gE14 = b2;
        gE gE15 = b2;
        gE15.E = null;
        gE15.b = null;
        gE15.F = vRa.d;
        gE14.D = null;
        gE14.J = null;
        gE13.H = null;
        gE12.B = null;
        gE13.I = uSa.E;
        gE12.m = uSa.E;
        gE11.j = null;
        gE11.a = null;
        gE10.g = null;
        gE9.A = null;
        gE10.h = vRa.d;
        gE9.W = JPa.N;
        gE9.x = JPa.N;
        gE9.C = uSa.E;
        gE9.L = pqa.r;
        gE9.q = uSa.E;
        gE8.i = null;
        gE8.c = null;
        gE7.G = null;
        gE7.l = null;
        gE6.e = null;
        gE5.K = null;
        gE6.M = uSa.E;
        gE5.d = uSa.E;
        b2.E = gE.f((String)v4);
        b2.b = gE.J((String)v4);
        gE4.F = b2.J(c2.getProperty(Zpa.x));
        gE4.D = gE3.J(c2.getProperty(opa.u), c2.getProperty(POa.Z));
        gE2.H = gE.J(properties2, gE3.b);
        Properties properties3 = c2;
        gE gE16 = b2;
        gE2.J = gE.J(properties2.getProperty(EQa.Ga), properties3.getProperty(sra.F), c2.getProperty(kqa.Ha), a2, gE16.b, gE16.F, b2.H);
        a2 = properties3.getProperty(lQa.I);
        if (a2 != null) {
            String string2 = a2;
            b2.I = string2.contains(Wqa.fa);
            string2.replace(Wqa.fa, Mqa.y);
            b2.B = b2.J(a2);
            b2.m = b2.J(c2.getProperty(kra.Ja), uSa.E);
        }
        gE gE17 = b2;
        Properties properties4 = c2;
        Properties properties5 = c2;
        gE gE18 = b2;
        gE18.j = gE18.J(c2.getProperty(UTa.N));
        b2.a = gE18.J(c2.getProperty(ZRa.s));
        b2.g = b2.J(c2.getProperty(uRa.Da));
        b2.A = b2.J(properties5);
        b2.h = Vd.J(properties5.getProperty(csa.G));
        b2.W = b2.J(c2.getProperty(TOa.Ha), JPa.N);
        b2.x = b2.J(c2.getProperty(NQa.ja), JPa.N);
        b2.C = b2.J(properties4.getProperty(aqa.I), uSa.E);
        gE17.q = gE17.J(properties4.getProperty(Pua.v), uSa.E);
        b2.L = gE17.J(c2.getProperty(bpa.V), pqa.r);
    }

    private boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation J(ResourceLocation resourceLocation) {
        void a2;
        gE gE2 = this;
        Object b2 = a2.J();
        b2 = cg.l((String)b2, (String)Qqa.N);
        b2 = cg.J((String)b2, (String)KPa.C);
        return new ResourceLocation(a2.f(), (String)b2);
    }

    /*
     * WARNING - void declaration
     */
    private static RA J(WKa wKa2, oka oka2, String[] stringArray, boolean bl) {
        void a2;
        fKa c2;
        Object d2 = stringArray;
        WKa b2 = wKa2;
        d2 = gE.J(d2);
        c2 = c2.J(b2, (fKa)d2);
        return gE.J(b2, c2, (boolean)a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int[] J(String string, String string2) {
        int n2;
        TreeSet<Integer> a2;
        String[] b2;
        gE gE2 = this;
        if (b2 == null) {
            b2 = a2;
        }
        if (b2 == null) {
            return null;
        }
        b2 = b2.trim();
        a2 = new TreeSet<Integer>();
        b2 = Config.J((String)b2, Tpa.E);
        int n3 = n2 = uSa.E;
        while (true) {
            block10: {
                int n4;
                int n5;
                int n6;
                block14: {
                    int n7;
                    Object c2;
                    block11: {
                        int n8;
                        String[] stringArray;
                        block13: {
                            block12: {
                                if (n3 >= b2.length) break block11;
                                c2 = b2[n2];
                                n7 = Config.J((String)c2, pua.o);
                                if (n7 < 0) break block12;
                                a2.add(new Integer(n7));
                                break block10;
                            }
                            if (!((String)c2).contains(Vua.m) || (stringArray = Config.J((String)c2, Vua.m)).length != uqa.g) break block13;
                            n8 = Config.J(stringArray[uSa.E], pua.o);
                            n6 = Config.J(stringArray[vRa.d], pua.o);
                            if (n8 < 0 || n6 < 0) break block13;
                            n5 = Math.min(n8, n6);
                            n6 = Math.max(n8, n6);
                            n4 = n5 = n5;
                            break block14;
                        }
                        if ((stringArray = eAa.l((String)c2)) == null) {
                            Config.J(new StringBuilder().insert(2 & 5, vua.u).append((String)c2).toString());
                            break block10;
                        } else {
                            n8 = eAa.J((eAa)stringArray);
                            if (n8 < 0) {
                                Config.J(new StringBuilder().insert(3 ^ 3, vua.u).append((String)c2).toString());
                                break block10;
                            } else {
                                a2.add(new Integer(n8));
                            }
                        }
                        break block10;
                    }
                    TreeSet<Integer> treeSet = a2;
                    Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
                    c2 = new int[integerArray.length];
                    int n9 = n7 = uSa.E;
                    while (true) {
                        if (n9 >= ((Object)c2).length) {
                            return c2;
                        }
                        int n10 = n7++;
                        c2[n10] = integerArray[n10];
                        n9 = n7;
                    }
                }
                while (n4 <= n6) {
                    a2.add(new Integer(n5++));
                    n4 = n5;
                }
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(String string, int n2) {
        void a2;
        Object c2 = string;
        gE b2 = this;
        if (c2 == null) {
            return (int)a2;
        }
        int n3 = Config.J((String)(c2 = ((String)c2).trim()), ypa.L);
        if (n3 == ypa.L) {
            Config.J(new StringBuilder().insert(3 & 4, DPa.Fa).append((String)c2).toString());
            return (int)a2;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    private qD J(String string) {
        int n2;
        void a2;
        gE gE2 = this;
        if (a2 == null) {
            return null;
        }
        String[] stringArray = Config.J((String)a2, Tpa.E);
        qD qD2 = new qD();
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            Object b2 = stringArray[n2];
            if ((b2 = gE2.J((String)b2)) == null) {
                Config.J(new StringBuilder().insert(2 & 5, PRa.w).append((String)a2).toString());
                return null;
            }
            qD2.J((WE)b2);
            n3 = ++n2;
        }
        return qD2;
    }

    private static fKa J(String[] stringArray) {
        Object object;
        String[] stringArray2 = stringArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(MQa.I);
        int a22 = uSa.E;
        int n2 = a22;
        while (n2 < stringArray2.length) {
            object = stringArray2[a22];
            if (a22 > 0) {
                stringBuffer.append(TOa.n);
            }
            StringBuilder stringBuilder = new StringBuilder().insert(3 ^ 3, Upa.z).append(a22).append(bpa.o).append((String)object);
            stringBuffer.append(stringBuilder.append(SRa.b).toString());
            n2 = ++a22;
        }
        stringBuffer.append(wua.a);
        String a22 = stringBuffer.toString();
        object = fKa.deserialize(a22);
        return object;
    }

    public RA J(ModelResourceLocation modelResourceLocation) {
        Object b2 = modelResourceLocation;
        gE a2 = this;
        if (b2 != null && a2.H != null) {
            b2 = ((ResourceLocation)b2).J();
            if (a2.K != null && (b2 = a2.K.get(b2)) != null) {
                return b2;
            }
        }
        return a2.e;
    }

    private static String f(String string) {
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

    private int J(String string) {
        String b2 = string;
        gE a2 = this;
        if (b2 == null) {
            return vRa.d;
        }
        if (b2.equals(xua.Aa)) {
            return vRa.d;
        }
        if (b2.equals(uSa.m)) {
            return uqa.g;
        }
        if (b2.equals(Ypa.R)) {
            return yRa.d;
        }
        Config.J(new StringBuilder().insert(5 >> 3, Hta.S).append(b2).toString());
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private String J(Map<String, String> map, String string, String string2) {
        void b2;
        void a2;
        Object d2 = map;
        gE c2 = this;
        if (d2 == null) {
            return a2;
        }
        if ((d2 = (String)d2.get(b2)) == null) {
            return a2;
        }
        return d2;
    }

    public float J(aJa aJa2) {
        gE b22 = aJa2;
        gE a2 = this;
        if (a2.M <= 0) {
            if (a2.i != null) {
                int b22 = b22.J(a2.i).J();
                int n2 = uKa.f();
                uKa.C((int)b22);
                a2.M = GL11.glGetTexLevelParameteri(BQa.Z, uSa.E, mPa.H);
                uKa.C((int)n2);
            }
            if (a2.M <= 0) {
                a2.M = ERa.C;
            }
        }
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    private static RA J(WKa wKa2, fKa fKa2, boolean bl) {
        void b2;
        WKa wKa3 = wKa2;
        AGa aGa2 = AGa.X0_Y0;
        boolean bl2 = uSa.E;
        KLa kLa2 = wKa3.l(b2.J(SRa.l));
        kLa2 = new WGa((fKa)b2).J(kLa2);
        for (GJa gJa2 : b2.J()) {
            for (DZ dZ2 : gJa2.mapFaces.keySet()) {
                void a2;
                WKa c2 = gJa2.mapFaces.get((Object)dZ2);
                if (a2 == false) {
                    WKa wKa4 = c2;
                    c2 = new Rja(((Rja)c2).cullFace, pua.o, ((Rja)wKa4).texture, ((Rja)wKa4).blockFaceUV);
                }
                KLa kLa3 = wKa3.l(b2.J(((Rja)c2).texture));
                dZ2 = gE.J(gJa2, (Rja)c2, kLa3, dZ2, aGa2, bl2);
                if (((Rja)c2).cullFace == null) {
                    kLa2.J((Yka)dZ2);
                    continue;
                }
                kLa2.J(aGa2.rotateFace(((Rja)c2).cullFace), (Yka)dZ2);
            }
        }
        return kLa2.J();
    }

    private je[] J(Properties properties) {
        je[] jeArray;
        Map a2;
        gE gE2 = this;
        String string = MTa.H;
        if ((a2 = gE.f((Properties)a2, string)).size() <= 0) {
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        je[] jeArray2 = jeArray = a2.keySet().iterator();
        while (jeArray2.hasNext()) {
            Object b2 = jeArray.next();
            String string2 = (String)a2.get(b2);
            b2 = ((String)b2).substring(string.length());
            b2 = new je((String)b2, string2);
            jeArray2 = jeArray;
            arrayList.add(b2);
        }
        ArrayList<Object> arrayList2 = arrayList;
        jeArray = arrayList2.toArray(new je[arrayList2.size()]);
        return jeArray;
    }

    private ResourceLocation J(String string) {
        Object a2;
        gE gE2 = this;
        if (a2 == null) {
            return null;
        }
        ResourceLocation resourceLocation = new ResourceLocation((String)a2);
        a2 = resourceLocation.f();
        Object b2 = resourceLocation.J();
        if (!((String)b2).contains(WSa.f)) {
            b2 = new StringBuilder().insert(3 ^ 3, Ira.ca).append((String)b2).toString();
        }
        if (!Config.f((ResourceLocation)(a2 = new ResourceLocation((String)a2, (String)(b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(KPa.C).toString()))))) {
            Config.J(new StringBuilder().insert(3 & 4, CRa.A).append((String)b2).toString());
        }
        return a2;
    }

    public String toString() {
        gE a2;
        return new StringBuilder().insert(5 >> 3, Mqa.y).append(a2.b).append(WSa.f).append(a2.E).append(jRa.M).append(a2.F).append(gQa.k).append(Config.J(a2.D)).append(wta.v).append(a2.J).toString();
    }

    private static String J(String string) {
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
    private static Map f(Properties properties, String string) {
        Properties properties2 = properties;
        LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<Object, String>();
        for (Object b2 : properties2.keySet()) {
            void a2;
            String string2 = properties2.getProperty((String)b2);
            if (!((String)b2).startsWith((String)a2)) continue;
            linkedHashMap.put(b2, string2);
        }
        return linkedHashMap;
    }

    /*
     * WARNING - void declaration
     */
    private static Yka J(GJa gJa2, Rja rja2, KLa kLa2, DZ dZ2, AGa aGa2, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        GJa a2;
        boolean bl2 = bl;
        GJa gJa3 = a2 = gJa2;
        return new LJa().J(gJa3.positionFrom, gJa3.positionTo, (Rja)e2, (KLa)d2, (DZ)c2, (AGa)b2, a2.partRotation, (boolean)f2, a2.shade);
    }

    /*
     * WARNING - void declaration
     */
    public void J(WKa wKa2) {
        void a2;
        gE gE2 = this;
        if (gE2.J != null) {
            gE gE3 = gE2;
            gE3.i = gE3.J(gE3.J);
            if (gE3.F == vRa.d) {
                gE gE4 = gE2;
                ResourceLocation resourceLocation = gE4.J(gE4.i);
                gE4.G = a2.J(resourceLocation);
            }
        }
        if (gE2.H != null) {
            gE gE5 = gE2;
            gE2.c = new HashMap();
            gE5.l = new HashMap();
            for (String string : gE2.H.keySet()) {
                Object b2 = gE2.H.get(string);
                gE gE6 = gE2;
                b2 = gE6.J((String)b2);
                gE6.c.put(string, b2);
                if (gE6.F != vRa.d) continue;
                gE gE7 = gE2;
                b2 = gE7.J((ResourceLocation)b2);
                b2 = a2.J((ResourceLocation)b2);
                gE7.l.put(string, b2);
            }
        }
    }

    private WE J(String string) {
        int b2;
        String a2;
        gE gE2 = this;
        if (a2 == null) {
            return null;
        }
        if ((a2 = a2.trim()).length() - a2.replace(Vua.m, Mqa.y).length() > vRa.d) {
            Config.J(new StringBuilder().insert(2 & 5, JSa.G).append(a2).toString());
            return null;
        }
        String[] stringArray = Config.J(a2, TOa.T);
        int[] nArray = new int[stringArray.length];
        int n2 = b2 = uSa.E;
        while (n2 < stringArray.length) {
            String string2 = stringArray[b2];
            int n3 = Config.J(string2, pua.o);
            if (n3 < 0) {
                Config.J(new StringBuilder().insert(3 & 4, JSa.G).append(a2).toString());
                return null;
            }
            nArray[b2++] = n3;
            n2 = b2;
        }
        if (nArray.length == vRa.d) {
            b2 = nArray[uSa.E];
            if (a2.startsWith(Vua.m)) {
                return new WE(uSa.E, b2);
            }
            if (a2.endsWith(Vua.m)) {
                return new WE(b2, osa.Ja);
            }
            int n4 = b2;
            return new WE(n4, n4);
        }
        if (nArray.length == uqa.g) {
            b2 = Math.min(nArray[uSa.E], nArray[vRa.d]);
            int n5 = Math.max(nArray[uSa.E], nArray[vRa.d]);
            return new WE(b2, n5);
        }
        Config.J(new StringBuilder().insert(3 & 4, JSa.G).append(a2).toString());
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static Map J(Properties properties, String string) {
        Properties properties2 = properties;
        Object object = uQa.X;
        if ((object = gE.f(properties2, (String)object)).size() <= 0) {
            return null;
        }
        Iterator b2 = object.keySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = b2 = b2.iterator();
        while (iterator.hasNext()) {
            void a2;
            Object e2 = b2.next();
            String string2 = (String)object.get(e2);
            string2 = gE.J(string2, (String)a2);
            iterator = b2;
            linkedHashMap.put(e2, string2);
        }
        return linkedHashMap;
    }

    /*
     * WARNING - void declaration
     */
    private float J(String string, float f2) {
        void a2;
        Object c2 = string;
        gE b2 = this;
        if (c2 == null) {
            return (float)a2;
        }
        float f3 = Config.J((String)(c2 = ((String)c2).trim()), CRa.V);
        if (f3 == CRa.V) {
            Config.J(new StringBuilder().insert(2 & 5, fTa.t).append((String)c2).toString());
            return (float)a2;
        }
        return f3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(WKa wKa2, oka oka2) {
        void a2;
        void b2;
        gE gE2;
        gE gE3 = gE2 = this;
        String[] stringArray = gE3.J();
        boolean bl = gE3.J();
        gE3.e = gE.J((WKa)b2, (oka)a2, stringArray, bl);
        if (gE3.F == vRa.d && gE2.H != null) {
            for (String c2 : gE2.H.keySet()) {
                RA rA2 = gE2.H.get(c2);
                c2 = cg.l((String)c2, (String)uQa.X);
                if (!c2.startsWith(rSa.e) && !c2.startsWith(VQa.k)) continue;
                RA rA3 = new String[vRa.d];
                rA3[uSa.E] = rA2;
                rA2 = rA3;
                rA2 = gE.J((WKa)b2, (oka)a2, (String[])rA2, bl);
                if (gE2.K == null) {
                    gE gE4 = gE2;
                    gE4.K = new HashMap<String, RA>();
                }
                gE2.K.put(c2, rA2);
            }
        }
    }
}

