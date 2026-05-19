/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BLa
 *  C
 *  Cg
 *  ERa
 *  ISa
 *  JPa
 *  NC
 *  Oz
 *  QSa
 *  Rd
 *  TQa
 *  U
 *  URa
 *  asa
 *  bqa
 *  cra
 *  hqa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  xb
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class WKa
extends Rd
implements C {
    private static final String c = "CL_00001058";
    private static final boolean B = Boolean.parseBoolean(System.getProperty(URa.c, oQa.l));
    private final Map d;
    private int a;
    private int b;
    public int l;
    private final NC e;
    private int G;
    private boolean D;
    private final List f;
    private KLa[] F;
    private int g;
    private final String L;
    private final KLa E;
    private double m;
    public static final ResourceLocation C;
    private final Map i;
    public static final ResourceLocation M;
    private double k;
    private static final Logger j;
    private int J;
    public int A;
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, KLa kLa2) {
        void b2;
        KLa c2 = kLa2;
        WKa a2 = this;
        if (!a2.i.containsKey(b2)) {
            KLa kLa3 = c2;
            a2.i.put(b2, kLa3);
            if (kLa3.C() < 0) {
                int n2 = a2.G;
                a2.G = n2 + vRa.d;
                c2.J(n2);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        WKa wKa2 = this;
        wKa2.b = pua.o;
        wKa2.J = pua.o;
        wKa2.F = null;
        if (wKa2.a > 0) {
            void a2;
            void b2;
            WKa wKa3 = wKa2;
            wKa3.b = b2 / wKa3.a;
            wKa2.J = a2 / wKa2.a;
            wKa2.F = new KLa[wKa3.b * wKa2.J];
            wKa2.k = oua.i / (double)wKa2.b;
            wKa2.m = oua.i / (double)wKa2.J;
            for (Object c2 : wKa2.d.values()) {
                double d2 = kTa.B / (double)b2;
                double d3 = kTa.B / (double)a2;
                Object object = c2;
                Object object2 = c2;
                double d4 = (double)Math.min(((KLa)object).l(), ((KLa)object2).C()) + d2;
                double d5 = (double)Math.min(((KLa)object).J(), ((KLa)c2).f()) + d3;
                d2 = (double)Math.max(((KLa)object2).l(), ((KLa)c2).C()) - d2;
                d3 = (double)Math.max(((KLa)object).J(), ((KLa)c2).f()) - d3;
                int n4 = (int)(d4 / wKa2.k);
                int n5 = (int)(d5 / wKa2.m);
                int n6 = (int)(d2 / wKa2.k);
                int n7 = (int)(d3 / wKa2.m);
                int n8 = n4;
                while (n8 <= n6) {
                    int n9;
                    if (n9 >= 0 && n9 < wKa2.b) {
                        int n10 = n5;
                        while (n10 <= n7) {
                            int n11;
                            if (n11 >= 0 && n11 < wKa2.b) {
                                int n12 = n11 * wKa2.b + n9;
                                wKa2.F[n12] = c2;
                            } else {
                                Config.J(new StringBuilder().insert(3 & 4, KQa.Ka).append(n11).append(Bua.U).append(((KLa)c2).J()).toString());
                            }
                            n10 = ++n11;
                        }
                    } else {
                        Config.J(new StringBuilder().insert(3 & 4, QSa.N).append(n9).append(Bua.U).append(((KLa)c2).J()).toString());
                    }
                    n8 = ++n9;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(U u2, NC nC2) {
        void a2;
        WKa b2;
        WKa c2 = u2;
        WKa wKa2 = b2 = this;
        b2.i.clear();
        wKa2.G = uSa.E;
        a2.J(wKa2);
        if (wKa2.g >= AQa.P) {
            WKa wKa3 = b2;
            wKa3.g = wKa3.J(wKa3.i, (U)c2);
            Config.e(new StringBuilder().insert(3 ^ 3, TQa.fa).append(b2.g).toString());
        }
        WKa wKa4 = b2;
        wKa4.C();
        wKa4.l();
        b2.f((U)c2);
    }

    public boolean J() {
        int a2;
        WKa wKa2 = this;
        int n2 = uKa.f();
        if (n2 == (a2 = wKa2.J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f(KLa kLa2) {
        KLa b2 = kLa2;
        WKa a2 = this;
        return a2.J(b2.J(), b2);
    }

    /*
     * WARNING - void declaration
     */
    private int[] J(int n2) {
        void a2;
        Object b2;
        WKa wKa2 = this;
        Object object = b2 = new BufferedImage(ERa.C, ERa.C, uqa.g);
        ((BufferedImage)object).setRGB(uSa.E, uSa.E, ERa.C, ERa.C, gLa.j, uSa.E, ERa.C);
        b2 = Cg.l((BufferedImage)object, (int)a2);
        void v1 = a2;
        int[] nArray = new int[v1 * v1];
        void v2 = a2;
        ((BufferedImage)b2).getRGB(uSa.E, uSa.E, (int)v2, (int)v2, nArray, uSa.E, (int)v2);
        return nArray;
    }

    private boolean J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        WKa a2 = this;
        b2 = ((ResourceLocation)b2).J();
        return a2.J((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    private int J(Map map, U u2, int n2) {
        void a2;
        int n3;
        Object object;
        Object d232;
        Object object2;
        Iterator c222;
        WKa wKa2 = this;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (Map.Entry object32 : c222.entrySet()) {
            int n4;
            block7: {
                void b2;
                object2 = (KLa)object32.getValue();
                ResourceLocation n7 = new ResourceLocation(((KLa)object2).J());
                d232 = wKa2.J(n7, uSa.E);
                if (((KLa)object2).J((U)b2, n7)) continue;
                try {
                    Dimension n10;
                    IResource exception = b2.J((ResourceLocation)d232);
                    if (exception == null || (object = exception.J()) == null || (n10 = Cg.J((InputStream)object, (String)GPa.l)) == null) continue;
                    n3 = n10.width;
                    n4 = Oz.C((int)n3);
                    if (hashMap.containsKey(n4)) break block7;
                    hashMap.put(n4, vRa.d);
                }
                catch (Exception exception) {}
            }
            int n5 = (Integer)hashMap.get(n4);
            hashMap.put(n4, n5 + vRa.d);
        }
        int c222 = uSa.E;
        Set set = hashMap.keySet();
        object2 = new TreeSet(set);
        d232 = object2.iterator();
        Object object3 = d232;
        while (object3.hasNext()) {
            int n8 = (Integer)d232.next();
            int n9 = (Integer)hashMap.get(n8);
            c222 += n9;
            object3 = d232;
        }
        int d232 = ERa.C;
        int n6 = uSa.E;
        int n7 = c222 * a2 / ySa.T;
        object = object2.iterator();
        while (object.hasNext()) {
            int n8 = (Integer)object.next();
            n3 = (Integer)hashMap.get(n8);
            n6 += n3;
            if (n8 > d232) {
                d232 = n8;
            }
            if (n6 <= n7) continue;
            return d232;
        }
        return d232;
    }

    public String J() {
        WKa a2;
        return a2.L;
    }

    public KLa l(String string) {
        Object b2 = string;
        WKa a2 = this;
        b2 = new ResourceLocation((String)b2);
        return (KLa)a2.i.get(((ResourceLocation)b2).toString());
    }

    /*
     * WARNING - void declaration
     */
    public WKa(String string, NC nC2) {
        void b2;
        WKa c2 = nC2;
        WKa a2 = this;
        a2((String)b2, (NC)c2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public WKa(String string, boolean bl) {
        void b2;
        boolean c2 = bl;
        WKa a2 = this;
        a2((String)b2, null, c2);
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation J(ResourceLocation resourceLocation, int n2) {
        ResourceLocation resourceLocation2;
        void a2;
        Object b2 = this;
        ResourceLocation c2 = resourceLocation;
        if (b2.J(c2)) {
            if (a2 == false) {
                return new ResourceLocation(c2.f(), new StringBuilder().insert(3 & 4, c2.J()).append(KPa.C).toString());
            }
            return new ResourceLocation(c2.f(), new StringBuilder().insert(3 >> 2, c2.J()).append(ISa.m).append((int)a2).append(KPa.C).toString());
        }
        if (a2 == false) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = b2.L;
            objectArray[vRa.d] = c2.J();
            objectArray[uqa.g] = KPa.C;
            resourceLocation2 = new ResourceLocation(c2.f(), String.format(KSa.fa, objectArray));
            return resourceLocation2;
        }
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = b2.L;
        objectArray[vRa.d] = c2.J();
        objectArray[uqa.g] = (int)a2;
        objectArray[yRa.d] = KPa.C;
        resourceLocation2 = new ResourceLocation(c2.f(), String.format(bqa.Q, objectArray));
        return resourceLocation2;
    }

    public void d() {
        Object a2;
        WKa wKa2 = this;
        if (!wKa2.I && Config.h()) {
            xb.e = wKa2.J();
        }
        int n2 = uSa.E;
        int n3 = uSa.E;
        WKa wKa3 = wKa2;
        gLa.f(wKa3.J());
        Iterator iterator = wKa3.f.iterator();
        while (iterator.hasNext()) {
            a2 = (KLa)iterator.next();
            if (!wKa2.J((KLa)a2)) continue;
            Object object = a2;
            ((KLa)object).f();
            if (((KLa)object).g != null) {
                n2 = vRa.d;
            }
            if (((KLa)a2).e == null) continue;
            n3 = vRa.d;
        }
        if (!wKa2.I && Config.y()) {
            iterator = wKa2.f.iterator();
            while (iterator.hasNext()) {
                KLa kLa2;
                a2 = (KLa)iterator.next();
                if (!wKa2.J((KLa)a2) || (kLa2 = ((KLa)a2).h) == null) continue;
                if (a2 == Cg.W || a2 == Cg.Ga) {
                    kLa2.v = ((KLa)a2).v;
                }
                ((KLa)a2).e();
                kLa2.f();
            }
            gLa.f(wKa2.J());
        }
        if (!wKa2.I && Config.h()) {
            if (n2 != 0) {
                WKa wKa4 = wKa2;
                gLa.f(wKa4.J().A);
                iterator = wKa4.f.iterator();
                while (iterator.hasNext()) {
                    a2 = (KLa)iterator.next();
                    if (((KLa)a2).g == null || !wKa2.J((KLa)a2)) continue;
                    if (a2 == Cg.W || a2 == Cg.Ga) {
                        ((KLa)a2).g.v = ((KLa)a2).v;
                    }
                    ((KLa)a2).g.f();
                }
            }
            if (n3 != 0) {
                WKa wKa5 = wKa2;
                gLa.f(wKa5.J().J);
                iterator = wKa5.f.iterator();
                while (iterator.hasNext()) {
                    a2 = (KLa)iterator.next();
                    if (((KLa)a2).e == null || !wKa2.J((KLa)a2)) continue;
                    if (a2 == Cg.W || a2 == Cg.Ga) {
                        ((KLa)a2).g.v = ((KLa)a2).v;
                    }
                    ((KLa)a2).e.f();
                }
            }
            if (n2 != 0 || n3 != 0) {
                gLa.f(wKa2.J());
            }
        }
        if (!wKa2.I) {
            if (Config.h()) {
                xb.e = null;
            }
            BLa.k.clear();
        }
    }

    public void J(int n2) {
        int b2 = n2;
        WKa a2 = this;
        a2.g = b2;
    }

    public KLa f(String string) {
        Object b2 = string;
        WKa a2 = this;
        b2 = new ResourceLocation((String)b2);
        return (KLa)a2.i.get(((ResourceLocation)b2).toString());
    }

    /*
     * WARNING - void declaration
     */
    public KLa J(ResourceLocation resourceLocation) {
        void a2;
        WKa wKa2 = this;
        if (a2 == null) {
            throw new IllegalArgumentException(cra.G);
        }
        Object b2 = (KLa)wKa2.i.get(a2.toString());
        if (b2 == null) {
            Object object = b2 = KLa.J((ResourceLocation)a2);
            wKa2.i.put(a2.toString(), object);
            if (((KLa)object).C() < 0) {
                int n2 = wKa2.G;
                wKa2.G = n2 + vRa.d;
                ((KLa)b2).J(n2);
            }
        }
        return b2;
    }

    public void f() {
        WKa a2;
        a2.d();
    }

    public KLa J() {
        WKa a2;
        return a2.E;
    }

    public int C() {
        WKa a2;
        return a2.g;
    }

    private void C() {
        WKa wKa2;
        WKa wKa3 = wKa2 = this;
        int a22 = wKa3.f();
        int[] nArray = wKa3.J(a22);
        wKa3.E.C(a22);
        wKa3.E.l(a22);
        int[][] a22 = new int[wKa3.g + vRa.d][];
        a22[uSa.E] = nArray;
        int[][][] nArrayArray = new int[vRa.d][][];
        nArrayArray[uSa.E] = a22;
        wKa2.E.J(Lists.newArrayList(nArrayArray));
        int n2 = wKa2.G;
        wKa2.G = n2 + vRa.d;
        wKa2.E.J(n2);
    }

    public void J(U u2) throws IOException {
        WKa b2 = u2;
        WKa a2 = this;
        xb.L = b2;
        if (a2.e != null) {
            WKa wKa2 = a2;
            wKa2.J((U)b2, wKa2.e);
        }
    }

    static {
        j = LogManager.getLogger();
        M = new ResourceLocation(JPa.p);
        C = new ResourceLocation(asa.X);
    }

    /*
     * WARNING - void declaration
     */
    public KLa J(double d2, double d3) {
        void a2;
        void b22;
        WKa wKa2 = this;
        if (wKa2.F == null) {
            return null;
        }
        int b22 = (int)(b22 / wKa2.k);
        int c2 = (int)(a2 / wKa2.m) * wKa2.b + b22;
        if (c2 >= 0 && c2 <= wKa2.F.length) {
            return wKa2.F[c2];
        }
        return null;
    }

    public KLa J(String string) {
        Object b2 = string;
        WKa a2 = this;
        if ((b2 = (KLa)a2.d.get(b2)) == null) {
            b2 = a2.E;
        }
        return b2;
    }

    public int l() {
        WKa a2;
        return a2.G;
    }

    private boolean J(String string) {
        Object b2 = string;
        WKa a2 = this;
        if (((String)(b2 = ((String)b2).toLowerCase())).startsWith(ITa.T) || ((String)b2).startsWith(xua.g)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public WKa(String string, NC nC2, boolean bl) {
        void b2;
        void c2;
        WKa a2;
        boolean d2 = bl;
        WKa wKa2 = a2 = this;
        WKa wKa3 = a2;
        WKa wKa4 = a2;
        WKa wKa5 = a2;
        a2.I = uSa.E;
        wKa5.D = uSa.E;
        wKa4.F = null;
        wKa5.a = pua.o;
        wKa4.b = pua.o;
        wKa4.J = pua.o;
        wKa4.k = pqa.q;
        wKa4.m = pqa.q;
        wKa4.G = uSa.E;
        wKa4.l = uSa.E;
        wKa4.A = uSa.E;
        wKa4.f = Lists.newArrayList();
        wKa4.i = Maps.newHashMap();
        wKa3.d = Maps.newHashMap();
        WKa wKa6 = a2;
        wKa3.E = new KLa(JPa.p);
        wKa3.L = c2;
        wKa2.e = b2;
        wKa2.D = d2 && B ? vRa.d : uSa.E;
    }

    public WKa(String string) {
        Object b2 = string;
        WKa a2 = this;
        a2((String)b2, null);
    }

    private boolean J(KLa kLa2) {
        KLa b2 = kLa2;
        WKa a2 = this;
        if (b2 == Cg.c || b2 == Cg.B) {
            return Config.f();
        }
        if (b2 == Cg.b || b2 == Cg.R) {
            return Config.i();
        }
        if (b2 == Cg.Ma || b2 == Cg.Aa) {
            return Config.a();
        }
        if (b2 == Cg.V) {
            return Config.ga();
        }
        if (b2 == Cg.W || b2 == Cg.Ga) {
            return vRa.d != 0;
        }
        if (b2.J().startsWith(hqa.Z)) {
            return BLa.k.contains(b2);
        }
        return Config.R();
    }

    /*
     * Exception decompiling
     */
    public void f(U var1_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
    private int J(Map map, U u2) {
        void a2;
        WKa b2 = this;
        Object c22 = map;
        int c22 = b2.J((Map)c22, (U)a2, kTa.j);
        if (c22 < ERa.C) {
            c22 = ERa.C;
        }
        if ((c22 = Oz.C((int)c22)) > ERa.C) {
            Config.e(new StringBuilder().insert(3 >> 2, VPa.b).append(c22).toString());
        }
        if ((c22 = Oz.J((int)c22)) < AQa.P) {
            c22 = AQa.P;
        }
        return c22;
    }

    private int f() {
        WKa wKa2 = this;
        int a2 = vRa.d << wKa2.g;
        if (a2 < Yqa.i) {
            a2 = Yqa.i;
        }
        return a2;
    }
}

