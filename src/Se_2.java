/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Epa
 *  Gg
 *  Gua
 *  NTa
 *  RPa
 *  RQa
 *  SOa
 *  SQa
 *  Spa
 *  URa
 *  VQa
 *  WSa
 *  XTa
 *  YSa
 *  Yfa
 *  Ysa
 *  ZJa
 *  Zua
 *  aQa
 *  bD
 *  bSa
 *  cra
 *  dpa
 *  hTa
 *  hqa
 *  kpa
 *  kta
 *  lPa
 *  oqa
 *  pua
 *  uRa
 *  vL
 *  vPa
 *  vRa
 *  wPa
 *  wra
 *  yQa
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Se_2 {
    private static boolean E;
    public static final String m = ".properties";
    public static final String C = "textures/entity/";
    private static final String[] i;
    private static ZJa M;
    private static Random k;
    public static final String j = "mcpatcher/mob/";
    private static boolean J;
    private static Map A;
    public static final String I = ".png";

    public Se_2() {
        Se_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static ResourceLocation J(ResourceLocation resourceLocation, int n2) {
        void a22;
        ResourceLocation resourceLocation2 = resourceLocation;
        if (resourceLocation2 == null) {
            return null;
        }
        String string = resourceLocation2.J();
        int b22 = string.lastIndexOf(Bpa.Ha);
        if (b22 < 0) {
            return null;
        }
        String string2 = string;
        string = string2.substring(uSa.E, b22);
        String b22 = string2.substring(b22);
        String a22 = new StringBuilder().insert(2 & 5, string).append((int)a22).append(b22).toString();
        return new ResourceLocation(resourceLocation2.f(), a22);
    }

    private static bD f(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        String string = resourceLocation2.J();
        ResourceLocation a2 = (bD)A.get(string);
        if (a2 == null) {
            a2 = Se_2.J(resourceLocation2);
            A.put(string, a2);
        }
        return a2;
    }

    public static ResourceLocation l(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        Object a2 = resourceLocation2.J();
        if (!((String)a2).startsWith(yQa.Q)) {
            return null;
        }
        a2 = new StringBuilder().insert(3 >> 2, hQa.T).append(((String)a2).substring(yQa.Q.length())).toString();
        return new ResourceLocation(resourceLocation2.f(), (String)a2);
    }

    public static void f() {
        A.clear();
        if (Config.Q()) {
            Se_2.J();
        }
    }

    private static ResourceLocation[] J(ResourceLocation resourceLocation) {
        int a22;
        ResourceLocation resourceLocation2 = resourceLocation;
        ArrayList<ResourceLocation> arrayList = new ArrayList<ResourceLocation>();
        arrayList.add(resourceLocation2);
        ResourceLocation resourceLocation3 = Se_2.l(resourceLocation2);
        if (resourceLocation3 == null) {
            return null;
        }
        int n2 = a22 = vRa.d;
        while (n2 < arrayList.size() + NTa.C) {
            int n3 = a22 + vRa.d;
            ResourceLocation resourceLocation4 = Se_2.J(resourceLocation3, n3);
            if (Config.f(resourceLocation4)) {
                arrayList.add(resourceLocation4);
            }
            n2 = ++a22;
        }
        if (arrayList.size() <= vRa.d) {
            return null;
        }
        ArrayList<ResourceLocation> arrayList2 = arrayList;
        ResourceLocation[] a22 = arrayList2.toArray(new ResourceLocation[arrayList2.size()]);
        Config.f(new StringBuilder().insert(2 & 5, bSa.v).append(resourceLocation2.J()).append(BRa.A).append(a22.length).toString());
        return a22;
    }

    public static void J(vL vL2, Gg gg2) {
        vL b2 = gg2;
        vL a2 = vL2;
        if (a2 instanceof Yfa && b2 != null) {
            Yfa yfa = (Yfa)a2;
            yfa.k = yfa.J();
            yfa.i = b2.J(yfa.k);
            b2 = Config.J();
            if (b2 != null && (b2 = b2.J(a2.M())) instanceof Yfa) {
                yfa.j = b2 = (int)(((Yfa)b2).J().getLeastSignificantBits() & Gua.R);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, Gg gg3) {
        void a2;
        Gg gg4 = gg2;
        if (a2 != null) {
            int b2;
            List list = a2.J();
            int n2 = b2 = uSa.E;
            while (n2 < list.size()) {
                Object e2 = list.get(b2);
                Se_2.J((vL)e2, (Gg)a2);
                n2 = ++b2;
            }
        }
    }

    private static void J() {
        M = Config.J();
        if (M != null) {
            E = vRa.d;
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add(vPa.h);
            arrayList.add(Wqa.Ia);
            arrayList.add(xua.k);
            arrayList.add(VQa.r);
            arrayList.add(lPa.ga);
            arrayList.add(LPa.F);
            arrayList.add(gua.H);
            arrayList.add(pua.D);
            arrayList.add(tTa.s);
            arrayList.add(BQa.fa);
            arrayList.add(Jsa.J);
            arrayList.add(tua.Ka);
            arrayList.add(AQa.p);
            arrayList.add(MTa.Q);
            arrayList.add(WSa.Aa);
            arrayList.add(Epa.j);
            arrayList.add(kta.G);
            arrayList.add(dpa.ja);
            arrayList.add(Tqa.u);
            arrayList.add(YSa.C);
            arrayList.add(ROa.N);
            arrayList.add(Spa.P);
            arrayList.add(BPa.K);
            arrayList.add(Zra.Fa);
            arrayList.add(uRa.L);
            arrayList.add(Zua.d);
            arrayList.add(hqa.X);
            arrayList.add(SQa.A);
            arrayList.add(wra.b);
            arrayList.add(qsa.d);
            arrayList.add(wta.R);
            arrayList.add(Jqa.n);
            arrayList.add(kpa.C);
            arrayList.add(hTa.j);
            arrayList.add(RPa.Q);
            arrayList.add(APa.d);
            arrayList.add(CRa.v);
            arrayList.add(RQa.e);
            arrayList.add(cra.Ha);
            arrayList.add(SOa.p);
            arrayList.add(hQa.G);
            arrayList.add(AQa.l);
            arrayList.add(wta.N);
            arrayList.add(Vra.Ha);
            int n2 = uSa.E;
            int n3 = n2;
            while (n3 < arrayList.size()) {
                Object object = (String)arrayList.get(n2);
                object = new StringBuilder().insert(3 >> 2, yQa.Q).append((String)object).append(KPa.C).toString();
                if (!Config.f((ResourceLocation)(object = new ResourceLocation((String)object)))) {
                    Config.J(new StringBuilder().insert(2 & 5, Bpa.O).append(object).toString());
                }
                Se_2.f((ResourceLocation)object);
                n3 = ++n2;
            }
        }
    }

    static {
        A = new HashMap();
        M = null;
        E = uSa.E;
        k = new Random();
        J = uSa.E;
        String[] stringArray = new String[NTa.C];
        stringArray[uSa.E] = YSa.ba;
        stringArray[vRa.d] = oqa.fa;
        stringArray[uqa.g] = tua.m;
        stringArray[yRa.d] = Lsa.F;
        stringArray[AQa.P] = DPa.p;
        stringArray[tTa.h] = oqa.fa;
        stringArray[uua.p] = wPa.t;
        stringArray[XTa.W] = aQa.U;
        stringArray[Yqa.i] = KQa.s;
        stringArray[WOa.fa] = Qpa.h;
        i = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static bD J(ResourceLocation resourceLocation, ResourceLocation resourceLocation2) {
        InputStream inputStream;
        void a2;
        block6: {
            String b2;
            block5: {
                ResourceLocation resourceLocation3 = resourceLocation;
                ResourceLocation resourceLocation4 = resourceLocation3;
                b2 = resourceLocation4.J();
                Config.f(new StringBuilder().insert(3 >> 2, bSa.v).append(a2.J()).append(BRa.A).append(b2).toString());
                inputStream = Config.J(resourceLocation4);
                if (inputStream != null) break block5;
                Config.J(new StringBuilder().insert(3 ^ 3, URa.l).append(b2).toString());
                return null;
            }
            Properties properties = new Properties();
            InputStream inputStream2 = inputStream;
            properties.load(inputStream2);
            inputStream2.close();
            inputStream = new bD(properties, b2, (ResourceLocation)a2);
            if (inputStream.J(b2)) break block6;
            return null;
        }
        try {
            return inputStream;
        }
        catch (FileNotFoundException b2) {
            Config.J(new StringBuilder().insert(2 & 5, Ysa.n).append(a2.J()).toString());
            return null;
        }
        catch (IOException b2) {
            b2.printStackTrace();
            return null;
        }
    }

    private static bD J(ResourceLocation resourceLocation) {
        bD a2;
        ResourceLocation resourceLocation2;
        ResourceLocation resourceLocation3 = resourceLocation2 = resourceLocation;
        String string = resourceLocation3.J();
        ResourceLocation resourceLocation4 = Se_2.f(resourceLocation3);
        if (resourceLocation4 != null && (a2 = Se_2.J(resourceLocation4, resourceLocation2)) != null) {
            return a2;
        }
        a2 = Se_2.J(resourceLocation2);
        return new bD(string, (ResourceLocation[])a2);
    }

    private static String J(String string) {
        int n2;
        String string2 = string;
        int n3 = n2 = uSa.E;
        while (n3 < i.length) {
            String a2 = i[n2];
            if (string2.endsWith(a2)) {
                String string3 = string2;
                return string3.substring(uSa.E, string3.length() - a2.length());
            }
            n3 = ++n2;
        }
        return null;
    }

    private static ResourceLocation f(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        Object object = Se_2.l(resourceLocation2);
        if (object == null) {
            return null;
        }
        ResourceLocation resourceLocation3 = object;
        object = resourceLocation3.f();
        Object a2 = resourceLocation3.J();
        String string = a2;
        if (((String)a2).endsWith(KPa.C)) {
            Object object2 = a2;
            string = ((String)object2).substring(uSa.E, ((String)object2).length() - KPa.C.length());
        }
        a2 = new StringBuilder().insert(3 & 4, string).append(Jpa.R).toString();
        if (Config.f((ResourceLocation)(a2 = new ResourceLocation((String)object, (String)a2)))) {
            return a2;
        }
        a2 = Se_2.J(string);
        if (a2 == null) {
            return null;
        }
        if (Config.f((ResourceLocation)(object = new ResourceLocation((String)object, (String)a2 + Jpa.R)))) {
            return object;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ResourceLocation J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        if (J) {
            return resourceLocation2;
        }
        try {
            J = vRa.d;
            if (!E) {
                Se_2.J();
            }
            if (M != null) {
                Object a2;
                Object object = Se_2.M.q;
                if (!(object instanceof Yfa)) {
                    ResourceLocation resourceLocation3 = resourceLocation2;
                    a2 = resourceLocation3;
                    return a2;
                }
                Yfa yfa = (Yfa)object;
                a2 = resourceLocation2.J();
                if (!((String)a2).startsWith(yQa.Q)) {
                    object = resourceLocation2;
                    a2 = object;
                    return a2;
                }
                object = Se_2.f(resourceLocation2);
                if (object == null) {
                    a2 = resourceLocation2;
                    ResourceLocation resourceLocation4 = a2;
                    return resourceLocation4;
                }
                a2 = object.J(resourceLocation2, yfa);
                ResourceLocation resourceLocation5 = a2;
                return resourceLocation5;
            }
            ResourceLocation resourceLocation6 = resourceLocation2;
            return resourceLocation6;
        }
        finally {
            J = uSa.E;
        }
    }
}

