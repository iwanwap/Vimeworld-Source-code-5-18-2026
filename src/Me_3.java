/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  Fpa
 *  Gl
 *  Hda
 *  JPa
 *  JQa
 *  JTa
 *  Kpa
 *  Lra
 *  Mda
 *  NQa
 *  NTa
 *  QSa
 *  Qsa
 *  RA
 *  RQa
 *  SQa
 *  Ssa
 *  TQa
 *  Tpa
 *  Uta
 *  VEa
 *  WQa
 *  WSa
 *  Waa
 *  XSa
 *  XTa
 *  YSa
 *  Ypa
 *  Yra
 *  ZOa
 *  ZRa
 *  Zpa
 *  aJa
 *  aqa
 *  bSa
 *  cQa
 *  cg
 *  cra
 *  eAa
 *  fg
 *  hra
 *  iPa
 *  isa
 *  jRa
 *  je
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  mra
 *  oka
 *  pPa
 *  pqa
 *  pua
 *  qta
 *  tA
 *  uKa
 *  uOa
 *  uQa
 *  vL
 *  vRa
 *  wOa
 *  waa
 *  xKa
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Me_3 {
    private static Map D;
    private static final int[][] f;
    public static final String F = "texture.potion_bottle_drinkable";
    private static oka g;
    public static final String L = "items/potion_bottle_splash";
    private static final int[] E;
    private static gE[][] m;
    private static gE[][] C;
    public static final String i = "items/potion_bottle_drinkable";
    public static final String M = "items/potion_overlay";
    public static final int k = 16384;
    public static final String j = "texture.potion_overlay";
    public static final int J = 63;
    public static final String A = "texture.potion_bottle_splash";
    private static boolean I;

    /*
     * WARNING - void declaration
     */
    private static void f(gE gE2, List list) {
        gE gE3 = gE2;
        if (gE3.D != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < gE3.D.length) {
                int b2 = gE3.D[n2];
                if (b2 <= 0) {
                    Config.J(new StringBuilder().insert(3 >> 2, ySa.C).append(b2).toString());
                } else {
                    void a2;
                    Me_3.J(gE3, (List)a2, b2);
                }
                n3 = ++n2;
            }
        }
    }

    private static gE[][] J(List list) {
        int n2;
        List list2 = list;
        gE[][] gEArray = new gE[list2.size()][];
        int n3 = n2 = uSa.E;
        while (n3 < list2.size()) {
            Object a2 = (List)list2.get(n2);
            if (a2 != null) {
                gE[] gEArray2 = a2 = a2.toArray(new gE[a2.size()]);
                Arrays.sort(a2, new Qf());
                gEArray[n2] = a2;
            }
            n3 = ++n2;
        }
        return gEArray;
    }

    public static void J(WKa wKa2) {
        WKa wKa3 = wKa2;
        C = null;
        m = null;
        I = vRa.d;
        if (Config.v()) {
            int a2;
            Me_3.J(cQa.M);
            IResourcePack[] iResourcePackArray = Config.J();
            int n2 = a2 = iResourcePackArray.length - vRa.d;
            while (n2 >= 0) {
                IResourcePack iResourcePack = iResourcePackArray[a2];
                Me_3.J(wKa3, iResourcePack);
                n2 = --a2;
            }
            Me_3.J(wKa3, Config.J());
            if (C.length <= 0) {
                C = null;
            }
            if (m.length <= 0) {
                m = null;
            }
        }
    }

    public static boolean J() {
        return I;
    }

    private static Comparator J() {
        return new Ag();
    }

    private static Map J() {
        if (D == null) {
            D = new LinkedHashMap();
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = uSa.E;
            D.put(wua.i, nArray);
            int[] nArray2 = new int[vRa.d];
            nArray2[uSa.E] = ERa.C;
            D.put(wta.m, nArray2);
            int[] nArray3 = new int[vRa.d];
            nArray3[uSa.E] = fPa.i;
            D.put(sra.j, nArray3);
            int[] nArray4 = new int[vRa.d];
            nArray4[uSa.E] = QSa.p;
            D.put(wsa.J, nArray4);
            D.put(WQa.u, Me_3.J(vRa.d));
            D.put(Ssa.T, Me_3.J(uqa.g));
            D.put(ZOa.A, Me_3.J(yRa.d));
            D.put(NQa.c, Me_3.J(AQa.P));
            D.put(wOa.f, Me_3.J(tTa.h));
            D.put(fPa.K, Me_3.J(uua.p));
            D.put(cPa.i, Me_3.J(XTa.W));
            D.put(Bra.T, Me_3.J(AQa.ba));
            D.put(Yra.X, Me_3.J(CRa.L));
            D.put(qta.i, Me_3.J(Fpa.ca));
            D.put(FPa.ca, Me_3.J(Yqa.i));
            D.put(RQa.W, Me_3.J(WOa.fa));
            D.put(isa.E, Me_3.J(NTa.C));
            D.put(XSa.W, Me_3.J(pPa.f));
            D.put(WSa.l, Me_3.J(Lra.e));
            D.put(YSa.u, Me_3.J(iSa.x));
            D.put(GPa.I, Me_3.J(lPa.p));
            D.put(lTa.fa, Me_3.J(lqa.s));
            D.put(fPa.V, Me_3.J(uua.s));
            D.put(bSa.W, Me_3.J(hpa.Z));
            D.put(oQa.Q, Me_3.J(Ypa.A));
            D.put(aqa.v, Me_3.J(tua.U));
            D.put(JTa.H, Me_3.J(uOa.F));
            D.put(Jta.fa, Me_3.J(Ssa.u));
        }
        return D;
    }

    /*
     * WARNING - void declaration
     */
    private static Map J(IResourcePack iResourcePack, boolean bl2) {
        int n2;
        void a2;
        IResourcePack iResourcePack2 = iResourcePack;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String[] b2 = a2 != false ? cra.B : TQa.N;
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = new StringBuilder().insert(3 >> 2, xTa.e).append((String)b2).toString();
        stringArray[vRa.d] = new StringBuilder().insert(3 & 4, zOa.L).append((String)b2).toString();
        b2 = stringArray;
        String[] stringArray2 = new String[vRa.d];
        stringArray2[uSa.E] = KPa.C;
        String[] stringArray3 = stringArray2;
        String[] stringArray4 = fg.J((IResourcePack)iResourcePack2, (String[])b2, (String[])stringArray3);
        int n3 = n2 = uSa.E;
        while (n3 < stringArray4.length) {
            String string = stringArray4[n2];
            Object object = Me_3.J(cg.J((String)string, (String[])b2, (String[])stringArray3), (boolean)a2, string);
            if (object != null) {
                string = new StringBuilder().insert(3 & 4, cg.J((String)string, (String[])stringArray3)).append(Jpa.R).toString();
                object = new gE((Properties)object, string);
                hashMap.put(string, object);
            }
            n3 = ++n2;
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(gE gE2, List list) {
        gE gE3 = gE2;
        if (gE3.F == uqa.g && gE3.a != null) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < hra.Ja) {
                if (gE3.a.J(b2)) {
                    void a2;
                    Me_3.J(gE3, (List)a2, b2);
                }
                n2 = ++b2;
            }
        }
    }

    private static Map J(IResourcePack iResourcePack) {
        Object a2;
        IResourcePack iResourcePack2 = iResourcePack;
        Object object = a2 = new HashMap();
        object.putAll(Me_3.J(iResourcePack2, uSa.E != 0));
        object.putAll(Me_3.J(iResourcePack2, vRa.d != 0));
        return object;
    }

    static {
        C = null;
        m = null;
        D = null;
        g = new oka();
        I = vRa.d;
        E = new int[uSa.E];
        f = new int[uSa.E][];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Gl gl2, Mda mda2, ModelBase modelBase, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int n2;
        void i2;
        Gl gl3 = gl2;
        if (m == null) {
            return uSa.E != 0;
        }
        if (Config.h() && pA.eA) {
            return uSa.E != 0;
        }
        if (i2 == null) {
            return uSa.E != 0;
        }
        int[][] e2 = Me_3.J((Mda)i2);
        if (e2.length <= 0) {
            return uSa.E != 0;
        }
        HashSet<Integer> hashSet = null;
        int n3 = uSa.E;
        aJa aJa2 = Config.J();
        int n4 = n2 = uSa.E;
        while (n4 < e2.length) {
            gE[] gEArray;
            int n5 = e2[n2][uSa.E];
            if (n5 >= 0 && n5 < m.length && (gEArray = m[n5]) != null) {
                int n6 = uSa.E;
                while (n6 < gEArray.length) {
                    int n7;
                    gE j22 = gEArray[n7];
                    if (hashSet == null) {
                        hashSet = new HashSet<Integer>();
                    }
                    if (hashSet.add(n5) && Me_3.J(j22, (Mda)i2, e2) && j22.i != null) {
                        void a2;
                        void b2;
                        void c2;
                        void d2;
                        void f9;
                        void g2;
                        void h2;
                        aJa aJa3 = aJa2;
                        gE gE2 = j22;
                        aJa3.J(gE2.i);
                        float f10 = gE2.J(aJa3);
                        if (n3 == 0) {
                            n3 = vRa.d;
                            if (Config.h()) {
                                tA.J();
                            }
                            uKa.B();
                            uKa.I((int)Jqa.e);
                            uKa.J(uSa.E != 0);
                        }
                        Object object = j22;
                        Vd.J(((gE)object).h, pqa.r);
                        uKa.L();
                        uKa.G((int)RQa.j);
                        uKa.y();
                        uKa.J((float)((gE)object).x, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                        float f11 = j22 = f10 / Qsa.k;
                        uKa.l((float)f11, (float)(j22 / kta.v), (float)f11);
                        float j22 = j22.W * (float)(Kpa.J() % tpa.Ja) / APa.O / Qsa.k;
                        uKa.J((float)JPa.N, (float)j22, (float)JPa.N);
                        uKa.G((int)SQa.ca);
                        h2.J((vL)gl3, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
                    }
                    n6 = ++n7;
                }
            }
            n4 = ++n2;
        }
        if (n3 != 0) {
            uKa.K();
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.G((int)RQa.j);
            uKa.y();
            uKa.G((int)SQa.ca);
            uKa.P();
            uKa.J(vRa.d != 0);
            uKa.I((int)Ira.A);
            uKa.k();
            if (Config.h()) {
                tA.f();
            }
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Mda mda2, int n2, String string) {
        void a2;
        int c22 = n2;
        Mda b2 = mda2;
        if (C == null) {
            return uSa.E != 0;
        }
        ResourceLocation c22 = Me_3.J(b2, c22, (String)a2);
        if (c22 == null) {
            return uSa.E != 0;
        }
        Config.J().J(c22);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(gE gE2, Mda mda2, int[][] nArray) {
        Object object;
        void a2;
        int n2;
        void b2;
        gE gE3 = gE2;
        eAa eAa2 = b2.J();
        if (gE3.B != null) {
            int c2 = b2.f();
            if (gE3.m != 0) {
                c2 &= gE3.m;
            }
            if (gE3.I) {
                n2 = eAa2.l();
                c2 = (int)((double)(c2 * ySa.T) / (double)n2);
            }
            if (!gE3.B.J(c2)) {
                return uSa.E != 0;
            }
        }
        if (gE3.j != null && !gE3.j.J(b2.E)) {
            return uSa.E != 0;
        }
        Object c2 = a2;
        if (gE3.a != null) {
            int n3;
            block18: {
                int n4;
                if (a2 == null) {
                    c2 = Me_3.J((Mda)b2);
                }
                n2 = uSa.E;
                int n5 = n4 = uSa.E;
                while (n5 < ((Object)c2).length) {
                    object = c2[n4][uSa.E];
                    if (gE3.a.J((int)object)) {
                        n3 = n2 = vRa.d;
                        break block18;
                    }
                    n5 = ++n4;
                }
                n3 = n2;
            }
            if (n3 == 0) {
                return uSa.E != 0;
            }
        }
        if (gE3.g != null) {
            int n6;
            block19: {
                int n7;
                if (c2 == null) {
                    c2 = Me_3.J((Mda)b2);
                }
                n2 = uSa.E;
                int n8 = n7 = uSa.E;
                while (n8 < ((Object)c2).length) {
                    object = c2[n7][vRa.d];
                    if (gE3.g.J((int)object)) {
                        n6 = n2 = vRa.d;
                        break block19;
                    }
                    n8 = ++n7;
                }
                n6 = n2;
            }
            if (n6 == 0) {
                return uSa.E != 0;
            }
        }
        if (gE3.A != null) {
            int n9;
            Waa waa2 = b2.J();
            int n10 = n9 = uSa.E;
            while (n10 < gE3.A.length) {
                je je2 = gE3.A[n9];
                if (!je2.J(waa2)) {
                    return uSa.E != 0;
                }
                n10 = ++n9;
            }
        }
        return vRa.d != 0;
    }

    private static List J(gE[][] gEArray) {
        gE[][] gEArray2 = gEArray;
        ArrayList<gE[][]> arrayList = new ArrayList<gE[][]>();
        if (gEArray2 != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < gEArray2.length) {
                gE[] gEArray3 = gEArray2[n2];
                Object a2 = null;
                if (gEArray3 != null) {
                    a2 = new ArrayList<gE>(Arrays.asList(gEArray3));
                }
                arrayList.add((gE[][])a2);
                n3 = ++n2;
            }
        }
        return arrayList;
    }

    private static int J(String string) {
        int a2;
        String string2 = string;
        String string3 = new StringBuilder().insert(3 >> 2, pqa.i).append(string2).toString();
        Hda[] hdaArray = Hda.A;
        int n2 = a2 = uSa.E;
        while (n2 < hdaArray.length) {
            String string4;
            Hda hda2 = hdaArray[a2];
            if (hda2 != null && string3.equals(string4 = hda2.J())) {
                return hda2.J();
            }
            n2 = ++a2;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    private static ResourceLocation J(Mda mda2, int n2, String string) {
        void a2;
        void b22;
        Mda mda3 = mda2;
        gE gE2 = Me_3.J(mda3, yRa.d);
        if (gE2 == null) {
            return null;
        }
        if (gE2.c == null) {
            return null;
        }
        Object object = mda3.J();
        if (!(object instanceof VEa)) {
            return null;
        }
        object = ((VEa)object).J().getName();
        StringBuffer c2 = new StringBuffer();
        c2.append(uQa.X);
        c2.append((String)object);
        c2.append(JQa.B);
        c2.append((int)b22);
        if (a2 != null) {
            c2.append(IPa.W);
            c2.append((String)a2);
        }
        String b22 = c2.toString();
        return (ResourceLocation)gE2.c.get(b22);
    }

    /*
     * WARNING - void declaration
     */
    private static Properties J(String string, boolean bl2, String string2) {
        int n2;
        StringBuffer a2;
        void b2;
        String string3 = string;
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = ZRa.e;
        stringArray[vRa.d] = jRa.G;
        if (cg.J((String)string3, (String[])stringArray)) {
            return null;
        }
        if (string3.equals(uqa.Ga) && b2 == false) {
            Properties properties;
            int n3 = eAa.J((eAa)Gea.J);
            Properties properties2 = properties = new Properties();
            properties.put(Zpa.x, xua.Aa);
            properties2.put(opa.u, new StringBuilder().insert(3 ^ 3, Mqa.y).append(n3).toString());
            return properties2;
        }
        int n4 = eAa.J((eAa)Gea.aa);
        int[] nArray = (int[])Me_3.J().get(string3);
        if (nArray == null) {
            Config.J(new StringBuilder().insert(5 >> 3, CRa.O).append((String)((Object)a2)).toString());
            return null;
        }
        a2 = new StringBuffer();
        int n5 = n2 = uSa.E;
        while (n5 < nArray.length) {
            int c2 = nArray[n2];
            if (b2 != false) {
                c2 |= qQa.O;
            }
            if (n2 > 0) {
                a2.append(Tpa.E);
            }
            a2.append(c2);
            n5 = ++n2;
        }
        n2 = CRa.u;
        Properties c2 = new Properties();
        c2.put(Zpa.x, xua.Aa);
        c2.put(opa.u, new StringBuilder().insert(5 >> 3, Mqa.y).append(n4).toString());
        c2.put(lQa.I, new StringBuilder().insert(5 >> 3, Mqa.y).append(a2.toString()).toString());
        c2.put(kra.Ja, new StringBuilder().insert(5 >> 3, Mqa.y).append(n2).toString());
        Properties properties = c2;
        if (b2 != false) {
            properties.put(mra.r, string3);
            return c2;
        }
        properties.put(kTa.U, string3);
        return c2;
    }

    private static int[] J(int a2) {
        int[] nArray = new int[AQa.P];
        nArray[uSa.E] = a2;
        nArray[vRa.d] = a2 + ERa.C;
        nArray[uqa.g] = a2 + fPa.i;
        nArray[yRa.d] = a2 + QSa.p;
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static RA J(Mda mda2, RA rA2, ModelResourceLocation modelResourceLocation) {
        void a2;
        Mda c2 = rA2;
        Mda b2 = mda2;
        if (c2.l()) {
            return c2;
        }
        if (C == null) {
            return c2;
        }
        gE gE2 = Me_3.J(b2, vRa.d);
        if (gE2 == null) {
            return c2;
        }
        return gE2.J((ModelResourceLocation)a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void J(WKa wKa2, IResourcePack iResourcePack) {
        int b22;
        Object object;
        int n2;
        Object[] objectArray;
        void a2;
        WKa wKa3 = wKa2;
        Object[] objectArray2 = fg.J((IResourcePack)a2, (String)rta.B, (String)Jpa.R, (String[])null);
        Map map = Me_3.J((IResourcePack)a2);
        if (map.size() > 0) {
            Set set = map.keySet();
            objectArray = set.toArray(new String[set.size()]);
            objectArray2 = (String[])Config.J(objectArray2, objectArray);
        }
        Arrays.sort(objectArray2);
        List list = Me_3.J(C);
        objectArray = Me_3.J(m);
        int n3 = n2 = uSa.E;
        while (n3 < objectArray2.length) {
            block15: {
                Object b22 = objectArray2[n2];
                Config.f(new StringBuilder().insert(3 & 4, Jsa.c).append((String)b22).toString());
                try {
                    object = null;
                    if (map.containsKey(b22)) {
                        object = (gE)map.get(b22);
                    }
                    if (object == null) {
                        Object object2 = new ResourceLocation((String)b22);
                        if ((object2 = a2.J((ResourceLocation)object2)) == null) {
                            Config.J(new StringBuilder().insert(5 >> 3, xra.X).append((String)b22).toString());
                            break block15;
                        }
                        Properties properties = new Properties();
                        properties.load((InputStream)object2);
                        object = new gE(properties, (String)b22);
                    }
                    if (((gE)object).J((String)b22)) {
                        Object object3 = object;
                        ((gE)object).J(wKa3);
                        Me_3.f((gE)object3, list);
                        Me_3.J((gE)object3, (List)objectArray);
                    }
                }
                catch (FileNotFoundException fileNotFoundException) {
                    Config.J(new StringBuilder().insert(3 >> 2, xra.X).append((String)b22).toString());
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            n3 = ++n2;
        }
        C = Me_3.J(list);
        m = Me_3.J((List)objectArray);
        Comparator comparator = Me_3.J();
        int n4 = b22 = uSa.E;
        while (n4 < C.length) {
            object = C[b22];
            if (object != null) {
                Arrays.sort(object, comparator);
            }
            n4 = ++b22;
        }
        int n5 = b22 = uSa.E;
        while (n5 < m.length) {
            object = m[b22];
            if (object != null) {
                Arrays.sort(object, comparator);
            }
            n5 = ++b22;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(gE gE2, List list, int n2) {
        void b2;
        void a2;
        gE gE3 = gE2;
        void v0 = a2;
        while (v0 >= b2.size()) {
            v0 = a2;
            b2.add(null);
        }
        List<gE> c2 = (List)b2.get((int)a2);
        if (c2 == null) {
            c2 = new ArrayList<gE>();
            b2.set((int)a2, c2);
        }
        c2.add(gE3);
    }

    public Me_3() {
        Me_3 a2;
    }

    public static void J() {
        if (C != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < C.length) {
                gE[] gEArray = C[n2];
                if (gEArray != null) {
                    int n4 = uSa.E;
                    while (n4 < gEArray.length) {
                        int n5;
                        gE gE2 = gEArray[n5];
                        if (gE2 != null && gE2.F == vRa.d) {
                            WKa wKa2 = Kpa.J().J();
                            gE2.J(wKa2, g);
                        }
                        n4 = ++n5;
                    }
                }
                n3 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(xKa xKa2, Mda mda2, RA rA2) {
        int n2;
        void b2;
        xKa xKa3 = xKa2;
        if (m == null) {
            return uSa.E != 0;
        }
        if (b2 == null) {
            return uSa.E != 0;
        }
        int[][] nArray = Me_3.J((Mda)b2);
        if (nArray.length <= 0) {
            return uSa.E != 0;
        }
        HashSet<Integer> hashSet = null;
        int n3 = uSa.E;
        aJa aJa2 = Config.J();
        int n4 = n2 = uSa.E;
        while (n4 < nArray.length) {
            gE[] gEArray;
            int n5 = nArray[n2][uSa.E];
            if (n5 >= 0 && n5 < m.length && (gEArray = m[n5]) != null) {
                int n6 = uSa.E;
                while (n6 < gEArray.length) {
                    int n7;
                    gE c2 = gEArray[n7];
                    if (hashSet == null) {
                        hashSet = new HashSet<Integer>();
                    }
                    if (hashSet.add(n5) && Me_3.J(c2, (Mda)b2, nArray) && c2.i != null) {
                        void a2;
                        aJa aJa3 = aJa2;
                        gE gE2 = c2;
                        aJa3.J(gE2.i);
                        float f2 = gE2.J(aJa3);
                        if (n3 == 0) {
                            n3 = vRa.d;
                            uKa.J(uSa.E != 0);
                            uKa.I((int)Jqa.e);
                            uKa.L();
                            uKa.G((int)RQa.j);
                        }
                        Object object = c2;
                        Vd.J(((gE)object).h, pqa.r);
                        uKa.e();
                        uKa.l((float)(f2 / kta.v), (float)(f2 / kta.v), (float)(f2 / kta.v));
                        uKa.J((float)(((gE)object).W * (float)(Kpa.J() % tpa.Ja) / APa.O / Qsa.k), (float)JPa.N, (float)JPa.N);
                        uKa.J((float)c2.x, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                        xKa3.J((RA)a2, pua.o);
                        uKa.D();
                    }
                    n6 = ++n7;
                }
            }
            n4 = ++n2;
        }
        if (n3 != 0) {
            uKa.K();
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.G((int)SQa.ca);
            uKa.P();
            uKa.I((int)Ira.A);
            uKa.J(vRa.d != 0);
            aJa2.J(WKa.C);
        }
        return n3 != 0;
    }

    private static void J(String string) {
        InputStream inputStream;
        String string2;
        block4: {
            string2 = string;
            ResourceLocation a2 = new ResourceLocation(string2);
            inputStream = Config.J(a2);
            if (inputStream != null) break block4;
            return;
        }
        try {
            Properties properties;
            Config.f(new StringBuilder().insert(3 >> 2, Uta.v).append(string2).toString());
            Properties properties2 = properties = new Properties();
            properties2.load(inputStream);
            inputStream.close();
            I = Config.J(properties2.getProperty(iPa.i), vRa.d != 0);
            return;
        }
        catch (FileNotFoundException a2) {
            return;
        }
        catch (IOException a2) {
            a2.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static gE J(Mda mda2, int n2) {
        Mda mda3 = mda2;
        if (C == null) {
            return null;
        }
        if (mda3 == null) {
            return null;
        }
        int b2 = eAa.J((eAa)mda3.J());
        if (b2 >= 0 && b2 < C.length && (b2 = C[b2]) != null) {
            int n3;
            int n4 = n3 = uSa.E;
            while (n4 < b2.length) {
                void a2;
                gE gE2 = b2[n3];
                if (gE2.F == a2 && Me_3.J(gE2, mda3, (int[][])null)) {
                    return gE2;
                }
                n4 = ++n3;
            }
        }
        return null;
    }

    private static int[][] J(Mda mda2) {
        Mda a2;
        Mda mda3 = mda2;
        waa waa2 = a2 = mda3.J() == Gea.ha ? Gea.ha.J(mda3) : mda3.J();
        if (a2 != null && a2.J() > 0) {
            int n2;
            int[][] nArray = new int[a2.J()][uqa.g];
            int n3 = n2 = uSa.E;
            while (n3 < a2.J()) {
                Waa waa3 = a2.J(n2);
                short s2 = waa3.J(QTa.O);
                short s3 = waa3.J(Jra.ca);
                nArray[n2][uSa.E] = s2;
                int[] nArray2 = nArray[n2];
                nArray2[vRa.d] = s3;
                n3 = ++n2;
            }
            return nArray;
        }
        return f;
    }
}

