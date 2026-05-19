/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  Bsa
 *  ERa
 *  Faa
 *  Gg
 *  Lqa
 *  NCa
 *  NOa
 *  NTa
 *  Oy
 *  PIa
 *  Rv
 *  SOa
 *  Waa
 *  XTa
 *  XX
 *  Ypa
 *  fpa
 *  hTa
 *  iPa
 *  iY
 *  lqa
 *  mB
 *  oZ
 *  tCa
 *  uOa
 *  uY
 *  vL
 *  vRa
 *  wX
 *  waa
 *  wra
 *  yc
 *  yra
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sy_1
implements yc,
mB {
    private final File k;
    private Set<Baa> j;
    private Map<Baa, Waa> J;
    private static final Logger A = LogManager.getLogger();
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public void f(Baa baa2, Waa waa2) {
        Sy_1 c2 = baa2;
        Sy_1 b2 = this;
        if (!b2.j.contains(c2)) {
            void a2;
            b2.J.put((Baa)c2, (Waa)a2);
        }
        Rv.J().J((mB)b2);
    }

    /*
     * Exception decompiling
     */
    public boolean J() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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
    private void J(Baa baa2, Waa waa2) throws IOException {
        void a2;
        Object c2 = baa2;
        Sy_1 b2 = this;
        Sy_1 sy_1 = c2;
        Object object = c2 = iY.J((File)b2.k, (int)((Baa)sy_1).j, (int)((Baa)sy_1).A);
        tCa.J((Waa)a2, (DataOutput)object);
        ((FilterOutputStream)object).close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        Sy_1 sy_1 = this;
        try {
            sy_1.I = vRa.d;
            block2: while (true) {
                Sy_1 sy_12 = sy_1;
                while (true) {
                    if (!sy_12.J()) continue block2;
                    sy_12 = sy_1;
                }
                break;
            }
        }
        catch (Throwable a2) {
            sy_1.I = uSa.E;
            throw a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(Gg gg2, int n2, int n3, Waa waa2) {
        void d2;
        void b2;
        void c2;
        Sy_1 e2;
        Sy_1 sy_1 = sy_12;
        Sy_1 sy_12 = waa2;
        Sy_1 a2 = sy_1;
        if (!e2.J(xua.s, NTa.C)) {
            A.error(new StringBuilder().insert(3 ^ 3, hTa.m).append((int)c2).append(yra.t).append((int)b2).append(xqa.v).toString());
            return null;
        }
        if (!(e2 = e2.J(xua.s)).J(rua.Ha, WOa.fa)) {
            A.error(new StringBuilder().insert(3 ^ 3, hTa.m).append((int)c2).append(yra.t).append((int)b2).append(eua.X).toString());
            return null;
        }
        Faa faa2 = a2.J((Gg)d2, (Waa)e2);
        if (!faa2.J((int)c2, (int)b2)) {
            A.error(new StringBuilder().insert(3 ^ 3, hTa.m).append((int)c2).append(yra.t).append((int)b2).append(WOa.e).append((int)c2).append(TOa.n).append((int)b2).append(yOa.U).append(faa2.I).append(TOa.n).append(faa2.G).append(hpa.b).toString());
            Sy_1 sy_13 = e2;
            sy_13.J(Bta.z, (int)c2);
            sy_13.J(wra.k, (int)b2);
            faa2 = a2.J((Gg)d2, (Waa)e2);
        }
        return faa2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Faa faa2, Gg gg2, Waa waa2) {
        Object object;
        Sy_1 d2;
        Object object2;
        Object object3;
        Waa waa3;
        XX xX22;
        int n2;
        void b2;
        void c2;
        void a2;
        Sy_1 sy_1 = this;
        void v0 = a2;
        v0.J(fpa.Ia, (byte)vRa.d);
        v0.J(Bta.z, c2.I);
        v0.J(wra.k, c2.G);
        v0.J(Psa.F, b2.l());
        v0.J(vsa.R, c2.J());
        v0.J(iPa.ga, c2.J());
        v0.J(rua.Da, c2.C());
        void v1 = c2;
        v0.J(zta.D, v1.J());
        waa waa4 = v1.J();
        waa waa5 = new waa();
        int n3 = !b2.F.f() ? vRa.d : uSa.E;
        int n4 = ((XX[])waa4).length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            xX22 = waa4[n2];
            if (xX22 != null) {
                waa waa6;
                waa3 = new Waa();
                XX xX3 = xX22;
                waa3.J(wua.q, (byte)(xX3.J() >> AQa.P & osa.Ja));
                object3 = new byte[xX3.J().length];
                object2 = new wX();
                d2 = null;
                int n6 = uSa.E;
                while (n6 < xX22.J().length) {
                    int n7;
                    char c3 = xX22.J()[n7];
                    int n8 = n7 & Ypa.A;
                    int n9 = n7 >> Yqa.i & Ypa.A;
                    int n10 = n7 >> AQa.P & Ypa.A;
                    if (c3 >> lqa.s != 0) {
                        if (d2 == null) {
                            d2 = new wX();
                        }
                        d2.J(n8, n9, n10, c3 >> lqa.s);
                    }
                    object3[n7] = (byte)(c3 >> AQa.P & osa.Ja);
                    object2.J(n8, n9, n10, c3 & Ypa.A);
                    n6 = ++n7;
                }
                Waa waa7 = waa3;
                waa7.J(ySa.H, object3);
                waa7.J(Lqa.o, object2.J());
                if (d2 != null) {
                    waa3.J(Hta.b, d2.J());
                }
                waa3.J(fqa.p, xX22.f().J());
                Waa waa8 = waa3;
                if (n3 != 0) {
                    waa8.J(KPa.s, xX22.J().J());
                    waa6 = waa5;
                } else {
                    waa8.J(KPa.s, new byte[xX22.f().J().length]);
                    waa6 = waa5;
                }
                waa6.J((NCa)waa3);
            }
            n5 = ++n2;
        }
        void v8 = a2;
        v8.J(rua.Ha, (NCa)waa5);
        v8.J(vqa.Ka, c2.J());
        c2.J(uSa.E != 0);
        waa4 = new waa();
        int n11 = n4 = uSa.E;
        while (n11 < c2.J().length) {
            for (XX xX22 : c2.J()[n4]) {
                if (!xX22.J(waa3 = new Waa())) continue;
                c2.J(vRa.d != 0);
                waa4.J((NCa)waa3);
            }
            n11 = ++n4;
        }
        a2.J(Bua.S, (NCa)waa4);
        waa waa9 = new waa();
        Object object4 = object = c2.J().values().iterator();
        while (object4.hasNext()) {
            xX22 = (uY)object.next();
            waa3 = new Waa();
            object4 = object;
            Waa waa10 = waa3;
            xX22.J(waa10);
            waa9.J((NCa)waa10);
        }
        a2.J(GPa.B, (NCa)waa9);
        object = b2.J((Faa)c2, uSa.E != 0);
        if (object != null) {
            long l2 = b2.l();
            object3 = new waa();
            object2 = object.iterator();
            Iterator iterator = object2;
            while (iterator.hasNext()) {
                d2 = (Oy)object2.next();
                Waa waa11 = new Waa();
                ResourceLocation resourceLocation = (ResourceLocation)Block.blockRegistry.f(d2.getBlock());
                waa11.J(IPa.Fa, resourceLocation == null ? Mqa.y : resourceLocation.toString());
                iterator = object2;
                Waa waa12 = waa11;
                waa12.J(rRa.X, ((Oy)d2).position.getX());
                waa12.J(uOa.Ja, ((Oy)d2).position.getY());
                waa12.J(oua.v, ((Oy)d2).position.getZ());
                waa12.J(xra.d, (int)(((Oy)d2).scheduledTime - l2));
                waa12.J(NOa.m, ((Oy)d2).priority);
                object3.J((NCa)waa12);
            }
            a2.J(Bsa.L, (NCa)object3);
        }
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, Faa faa2) throws oZ, IOException {
        void b2;
        Sy_1 sy_1 = this;
        b2.d();
        try {
            void a2;
            Sy_1 c2 = new Waa();
            Waa waa2 = new Waa();
            c2.J(xua.s, (NCa)waa2);
            Sy_1 sy_12 = sy_1;
            sy_12.J((Faa)a2, (Gg)b2, waa2);
            sy_12.f(a2.J(), (Waa)c2);
            return;
        }
        catch (Exception c2) {
            A.error(UOa.ja, (Throwable)c2);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private Faa J(Gg gg2, Waa waa2) {
        waa waa3;
        waa waa4;
        waa waa5;
        wX wX2;
        Object object;
        Object c2;
        XX xX2;
        int n2;
        void b2;
        void a2;
        Sy_1 sy_1 = this;
        void v0 = a2;
        int n3 = v0.J(Bta.z);
        int n4 = v0.J(wra.k);
        Faa faa2 = new Faa((Gg)b2, n3, n4);
        void v1 = a2;
        Faa faa3 = faa2;
        void v3 = a2;
        faa2.J(v3.J(vsa.R));
        faa3.C(v3.f(iPa.ga));
        faa3.f(a2.f(rua.Da));
        faa2.f(v1.J(zta.D));
        waa waa6 = v1.J(rua.Ha, NTa.C);
        XX[] xXArray = new XX[ERa.C];
        int n5 = !b2.F.f() ? vRa.d : uSa.E;
        int n6 = n2 = uSa.E;
        while (n6 < waa6.J()) {
            Waa waa7 = waa6.J(n2);
            byte by2 = waa7.J(wua.q);
            xX2 = new XX(by2 << AQa.P, n5 != 0);
            c2 = waa7.J(ySa.H);
            Waa waa8 = waa7;
            object = new wX(waa8.J(Lqa.o));
            wX2 = waa8.J(Hta.b, XTa.W) ? new wX(waa7.J(Hta.b)) : null;
            char[] cArray = new char[((Object)c2).length];
            int n7 = uSa.E;
            while (n7 < cArray.length) {
                int n8;
                int n9 = n8 & Ypa.A;
                int n10 = n8 >> Yqa.i & Ypa.A;
                int n11 = n8 >> AQa.P & Ypa.A;
                int n12 = wX2 != null ? wX2.J(n9, n10, n11) : uSa.E;
                int n13 = n8++;
                cArray[n13] = (char)(n12 << lqa.s | (c2[n13] & osa.Ja) << AQa.P | object.J(n9, n10, n11));
                n7 = n8;
            }
            XX xX3 = xX2;
            xX3.J(cArray);
            XX xX4 = xX2;
            xX3.f(new wX(waa7.J(fqa.p)));
            if (n5 != 0) {
                xX2.J(new wX(waa7.J(KPa.s)));
            }
            xX2.J();
            xXArray[by2] = xX2;
            n6 = ++n2;
        }
        faa2.J(xXArray);
        if (a2.J(vqa.Ka, XTa.W)) {
            faa2.J(a2.J(vqa.Ka));
        }
        if ((waa5 = a2.J(Bua.S, NTa.C)) != null) {
            int n14;
            int n15 = n14 = uSa.E;
            while (n15 < waa5.J()) {
                Waa waa9 = waa5.J(n14);
                xX2 = PIa.J((Waa)waa9, (Gg)b2);
                faa2.J(vRa.d != 0);
                if (xX2 != null) {
                    faa2.f((vL)xX2);
                    Waa waa10 = waa9;
                    while (waa10.J(SOa.Ga, NTa.C)) {
                        wX2 = PIa.J((Waa)object.J(SOa.Ga), (Gg)b2);
                        if (wX2 != null) {
                            wX wX3 = wX2;
                            faa2.f((vL)wX3);
                            c2.l((vL)wX3);
                        }
                        c2 = wX2;
                        waa10 = object.J(SOa.Ga);
                    }
                }
                n15 = ++n14;
            }
        }
        if ((waa4 = a2.J(GPa.B, NTa.C)) != null) {
            int n16;
            int n17 = n16 = uSa.E;
            while (n17 < waa4.J()) {
                xX2 = waa4.J(n16);
                c2 = uY.J((Waa)xX2);
                if (c2 != null) {
                    faa2.J((uY)c2);
                }
                n17 = ++n16;
            }
        }
        if (a2.J(Bsa.L, WOa.fa) && (waa3 = a2.J(Bsa.L, NTa.C)) != null) {
            int n18;
            int n19 = n18 = uSa.E;
            while (n19 < waa3.J()) {
                void v16;
                Object object2 = c2 = waa3.J(n18);
                if (c2.J(IPa.Fa, Yqa.i)) {
                    object = Block.J(object2.J(IPa.Fa));
                    v16 = b2;
                } else {
                    object = Block.f(object2.J(IPa.Fa));
                    v16 = b2;
                }
                v16.l(new XF(c2.J(rRa.X), c2.J(uOa.Ja), c2.J(oua.v)), (Block)object, c2.J(xra.d), c2.J(NOa.m));
                n19 = ++n18;
            }
        }
        return faa2;
    }

    public Sy_1(File file) {
        Sy_1 a2;
        File b2 = file;
        Sy_1 sy_1 = a2 = this;
        Sy_1 sy_12 = a2;
        sy_12.J = new ConcurrentHashMap<Baa, Waa>();
        sy_1.j = Collections.newSetFromMap(new ConcurrentHashMap());
        sy_1.I = uSa.E;
        sy_1.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(Gg gg2, int n2, int n3) throws IOException {
        void c2;
        void a2;
        void b2;
        Sy_1 sy_1 = this;
        Sy_1 d2 = new Baa((int)b2, (int)a2);
        if ((d2 = sy_1.J.get(d2)) == null) {
            DataInputStream dataInputStream = iY.J((File)sy_1.k, (int)b2, (int)a2);
            if (dataInputStream == null) {
                return null;
            }
            d2 = tCa.J((DataInputStream)dataInputStream);
        }
        return sy_1.J((Gg)c2, (int)b2, (int)a2, (Waa)d2);
    }

    public void J(Gg gg2, Faa object) throws IOException {
        Sy_1 c2 = object;
        object = this;
    }
}

