/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  ERa
 *  Ek
 *  FPa
 *  Fpa
 *  HJ
 *  Hj
 *  Kl
 *  Kpa
 *  NTa
 *  Oo
 *  Ppa
 *  QSa
 *  Qo
 *  Qta
 *  Sk
 *  Usa
 *  VQa
 *  WL
 *  XTa
 *  Ypa
 *  Zl
 *  aPa
 *  bx
 *  dpa
 *  ij
 *  jRa
 *  kK
 *  kqa
 *  lqa
 *  pPa
 *  uQa
 *  vPa
 *  vRa
 *  vpa
 *  wPa
 *  zTa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sk_2 {
    private final Map<String, Kl> m;
    private final Map<String, Kl> C;
    private static final char[] i;
    private final Set<Integer> M;
    private static final Executor k;
    public static final String j = "resource/";
    private final Map<Integer, Kl> J;
    private static final String A = "https://texteria.vimeworld.com/file/";
    private final Object I;

    /*
     * Exception decompiling
     */
    private void J(bx var1_2, String var2_3, int var3_4) throws Exception {
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J(sm sm2) {
        Iterator<Qo> a2;
        Sk_2 sk_2 = this;
        a2 = ((sm)((Object)a2)).getResourcesList().iterator();
        block7: while (true) {
            Iterator<Qo> iterator = a2;
            while (iterator.hasNext()) {
                Sk_2 b2;
                Qo qo2 = a2.next();
                Object object = sk_2.I;
                synchronized (object) {
                    b2 = sk_2.J.get(qo2.getId());
                }
                if (b2 == null) {
                    iterator = a2;
                    continue;
                }
                if (qo2.hasRemote() && qo2.getRemote()) {
                    if (((Kl)b2).j != kK.SERVER) continue block7;
                    iterator = a2;
                    Sk_2 sk_22 = b2;
                    ((Kl)sk_22).j = kK.REMOTE;
                    ((Kl)sk_22).A.set(uSa.E != 0);
                    sk_2.f((Kl)sk_22);
                    continue;
                }
                if (qo2.hasHasMore() && qo2.getHasMore()) {
                    if (((Kl)b2).J == null) {
                        Sk_2 sk_23 = b2;
                        ((Kl)sk_23).J = new ByteArrayOutputStream();
                    }
                    try {
                        qo2.getValue().writeTo(((Kl)b2).J);
                        iterator = a2;
                    }
                    catch (IOException iOException) {
                        iterator = a2;
                    }
                    continue;
                }
                if (((Kl)b2).J != null) {
                    Sk_2 sk_24;
                    try {
                        qo2.getValue().writeTo(((Kl)b2).J);
                        sk_24 = sk_2;
                    }
                    catch (IOException iOException) {
                        sk_24 = sk_2;
                    }
                    sk_24.J(b2.J(), ((Kl)b2).J.toByteArray());
                    iterator = a2;
                    ((Kl)b2).J = null;
                    continue;
                }
                sk_2.J(b2.J(), qo2.getValue().toByteArray());
                iterator = a2;
            }
            break;
        }
    }

    private void f(Kl kl2) {
        Sk_2 b2 = kl2;
        Sk_2 a2 = this;
        if (b2 == null || b2.J().isDone() || ((Kl)b2).A.getAndSet(vRa.d != 0)) {
            return;
        }
        if (((Kl)b2).j == kK.SERVER) {
            a2.M.add(b2.J());
            return;
        }
        if (((Kl)b2).j == kK.REMOTE) {
            bx bx2 = OT.i.D.J(new StringBuilder().insert(3 ^ 3, zTa.b).append(b2.J()).toString());
            Sk_2.J(Ek.J((Sk)a2, (bx)bx2, (Kl)b2));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Kl J(String string) {
        Object b2;
        String a2;
        Sk_2 sk_2 = this;
        if (a2.startsWith(rSa.ba) || a2.startsWith(Ppa.g)) {
            Object object = sk_2.I;
            synchronized (object) {
                block10: {
                    b2 = sk_2.m.get(a2);
                    if (b2 == null) break block10;
                    return b2;
                }
                b2 = new Kl(a2);
                sk_2.m.put(a2, (Kl)b2);
            }
            object = sk_2.J(a2, (String)null);
            Object object2 = b2;
            if (!object.J()) {
                Object object3 = object2;
                Sk_2.J(ij.J((Sk)sk_2, (bx)object, (Kl)object3));
                return b2;
            }
            object2.J((bx)object);
            return b2;
        }
        if (a2.startsWith(uQa.Y)) {
            a2 = a2.substring(vRa.d);
        }
        b2 = sk_2.I;
        synchronized (b2) {
            Kl kl2;
            Kl kl3 = kl2 = sk_2.C.get(a2);
            sk_2.f(kl3);
            return kl3;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void J(ByteBuffer var1_1, List<Integer> var2_2, kK var3_3) {
        var7_4 = this;
        var4_5 = new byte[ERa.C];
        v0 = b = b.iterator();
        while (v0.hasNext()) {
            var5_6 = (Integer)b.next();
            c.get(var4_5);
            var6_7 = Sk_2.J(var4_5);
            d = var7_4.C.get(var6_7);
            if (d != null) ** GOTO lbl29
            var8_8 = OT.i.D.J(new StringBuilder().insert(3 & 4, zTa.b).append(var6_7).toString());
            if (!var8_8.J()) {
                v1 = var6_7;
                v2 = var6_7;
                d = new Kl(v2);
                var7_4.C.put(v2, (Kl)d);
                d.j = a;
                v3 = d;
            } else {
                v4 = var6_7;
                d = new Kl(v4, var8_8);
                var7_4.C.put(v4, (Kl)d);
lbl29:
                // 2 sources

                v3 = d;
            }
            v3.J(var5_6);
            v0 = b;
            var7_4.J.put(var5_6, (Kl)d);
        }
    }

    public static /* synthetic */ void f(Runnable runnable) {
        Runnable runnable2 = runnable;
        try {
            runnable2.run();
            return;
        }
        catch (Throwable a2) {
            OT.b.warn(wPa.Z, a2);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String J(byte[] byArray, int n2, int n3) {
        void b2;
        void a2;
        byte[] byArray2 = byArray;
        char[] cArray = new char[a2 * uqa.g];
        void c2 = b2;
        int n4 = uSa.E;
        void v0 = c2;
        while (v0 < b2 + a2) {
            cArray[n4++] = i[byArray2[c2] >>> AQa.P & Ypa.A];
            int n5 = n4++;
            char c3 = i[byArray2[c2] & Ypa.A];
            cArray[n5] = c3;
            v0 = ++c2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public bx J(String string, String string2) {
        void a2;
        Object c2 = string;
        Sk_2 b2 = this;
        c2 = new StringBuilder().insert(5 >> 3, xua.A).append(DigestUtils.md5Hex(((String)c2).getBytes())).toString();
        if (a2 != null) {
            c2 = new StringBuilder().insert(5 >> 3, (String)c2).append(VQa.ja).append((String)a2).toString();
        }
        return OT.i.D.J((String)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(Sk sk2, bx bx2, Kl kl2) {
        void a2;
        Sk c22 = bx2;
        Sk b2 = sk2;
        try {
            super.J((bx)c22, a2.J(), gsa.Y);
            a2.J((bx)c22);
            return;
        }
        catch (Exception c22) {
            OT.b.warn(new StringBuilder().insert(3 ^ 3, Qta.u).append(a2.J()).append(rRa.a).toString(), (Throwable)c22);
            a2.J((Throwable)c22);
            return;
        }
    }

    public Sk_2() {
        Sk_2 a2;
        Sk_2 sk_2 = a2;
        a2.I = new Object();
        sk_2.C = new HashMap<String, Kl>();
        a2.J = new HashMap<Integer, Kl>();
        a2.m = new HashMap<String, Kl>();
        a2.M = new HashSet<Integer>();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(LN lN2) {
        Sk_2 sk_2 = this;
        Object b2 = sk_2.I;
        synchronized (b2) {
            void a2;
            Sk_2 sk_22 = sk_2;
            void v1 = a2;
            sk_22.J(a2.getLocalResources().asReadOnlyByteBuffer(), v1.getLocalIdsList(), kK.SERVER);
            sk_22.J(v1.getRemoteResources().asReadOnlyByteBuffer(), a2.getRemoteIdsList(), kK.REMOTE);
            return;
        }
    }

    public void f() {
        Sk_2 a2;
        Sk_2 sk_2 = a2;
        sk_2.C.clear();
        sk_2.J.clear();
        sk_2.m.clear();
        sk_2.M.clear();
    }

    public static /* synthetic */ boolean J(Kl kl2, Kl kl3) {
        Kl b2 = kl3;
        Kl a2 = kl2;
        if (b2 == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public bx J(String string, String string2, int n2) throws Exception {
        void c2;
        Object d2 = string2;
        Object b2 = this;
        if (!(d2 = ((Sk_2)b2).J((String)c2, (String)d2)).J()) {
            void a2;
            ((Sk_2)b2).J((bx)d2, (String)c2, (int)a2);
        }
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public String J(int n2) {
        void a2;
        Sk_2 sk_2 = this;
        Sk_2 b2 = sk_2.J((int)a2);
        if (b2 == null) {
            return new StringBuilder().insert(3 ^ 3, kqa.G).append((int)a2).append(hpa.b).toString();
        }
        return new StringBuilder().insert(2 & 5, uQa.Y).append(b2.J()).toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        Sk_2 sk_2 = this;
        if (sk_2.M.isEmpty()) {
            return;
        }
        Object a2 = sk_2.I;
        synchronized (a2) {
            OT.J((Oo)Oo.J().setResourceRequest(fM.J().addAllResources(sk_2.M)).build());
            sk_2.M.clear();
            return;
        }
    }

    static {
        k = new ThreadPoolExecutor(lqa.s, lqa.s, nqa.i, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>)new Hj(null), new ThreadFactoryBuilder().setDaemon(vRa.d != 0).setNameFormat(vPa.j).build());
        char[] cArray = new char[ERa.C];
        cArray[uSa.E] = QSa.p;
        cArray[vRa.d] = jRa.q;
        cArray[uqa.g] = vpa.o;
        cArray[yRa.d] = cPa.Q;
        cArray[AQa.P] = FPa.F;
        cArray[tTa.h] = Bpa.Z;
        cArray[uua.p] = GPa.C;
        cArray[XTa.W] = Fpa.ca;
        cArray[Yqa.i] = Upa.D;
        cArray[WOa.fa] = KSa.x;
        cArray[NTa.C] = Hta.k;
        cArray[pPa.f] = dpa.A;
        cArray[lqa.s] = zOa.v;
        cArray[uua.s] = ySa.T;
        cArray[hpa.Z] = zTa.C;
        cArray[Ypa.A] = jRa.v;
        i = cArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void J(String string, byte[] byArray) {
        Kl kl2;
        Object object;
        block15: {
            void a2;
            void b2;
            Sk_2 sk_2 = this;
            object = sk_2.I;
            // MONITORENTER : object
            kl2 = sk_2.C.computeIfAbsent((String)b2, HJ.J());
            // MONITOREXIT : object
            if (kl2.J().isDone()) {
                return;
            }
            object = OT.i.D.J(new StringBuilder().insert(3 >> 2, zTa.b).append((String)b2).toString());
            try {
                Throwable throwable;
                FileOutputStream c2;
                block16: {
                    c2 = object.J();
                    throwable = null;
                    ((OutputStream)c2).write((byte[])a2);
                    if (c2 == null) break block15;
                    if (throwable == null) break block16;
                    try {
                        ((OutputStream)c2).close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    break block15;
                }
                ((OutputStream)c2).close();
                break block15;
                catch (Throwable throwable3) {
                    try {
                        throwable = throwable3;
                        throw throwable;
                    }
                    catch (Throwable throwable4) {
                        Throwable throwable5;
                        if (c2 != null) {
                            if (throwable != null) {
                                try {
                                    ((OutputStream)c2).close();
                                    throwable5 = throwable4;
                                    throw throwable5;
                                }
                                catch (Throwable throwable6) {
                                    throwable5 = throwable4;
                                    throwable.addSuppressed(throwable6);
                                    throw throwable5;
                                }
                            }
                            ((OutputStream)c2).close();
                        }
                        throwable5 = throwable4;
                        throw throwable5;
                    }
                }
            }
            catch (Exception c2) {
                object.f();
                kl2.J((Throwable)c2);
                OT.b.warn(new StringBuilder().insert(3 >> 2, aPa.r).append((String)b2).append(xTa.Ka).append(((void)a2).length).toString(), (Throwable)c2);
                return;
            }
        }
        object.J(gsa.Y);
        kl2.J((bx)object);
    }

    public static String J(byte[] a2) {
        return Sk_2.J(a2, uSa.E, a2.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(Kl kl2) {
        Sk_2 sk_2 = this;
        Object b2 = sk_2.I;
        synchronized (b2) {
            void a2;
            sk_2.J.values().removeIf(Zl.J((Kl)a2));
            sk_2.C.remove(a2.J());
            OT.i.D.J(new StringBuilder().insert(5 >> 3, zTa.b).append(a2.J()).toString()).f();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Kl J(int n2) {
        Sk_2 sk_2 = this;
        Object b2 = sk_2.I;
        synchronized (b2) {
            Kl a2;
            Kl kl2 = a2 = sk_2.J.get((int)a2);
            sk_2.f(kl2);
            return kl2;
        }
    }

    public static void J(Runnable a2) {
        k.execute(WL.J((Runnable)a2));
    }

    public static Kl J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        try {
            InputStream a2 = Kpa.J().J().J(resourceLocation2).J();
            Kl kl2 = new Kl(resourceLocation2.toString());
            kl2.J(IOUtils.toByteArray(a2));
            return kl2;
        }
        catch (Exception a2) {
            throw new RuntimeException(new StringBuilder().insert(2 & 5, Usa.U).append(resourceLocation2).toString(), a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Sk sk2, bx bx2, Kl kl2) {
        void a2;
        Sk c22 = bx2;
        Sk b2 = sk2;
        try {
            super.J((bx)c22, LRa.Z + a2.J(), gsa.Y);
            a2.J((bx)c22);
            return;
        }
        catch (Throwable c22) {
            OT.b.warn(new StringBuilder().insert(5 >> 3, Qta.u).append(a2.J()).append(rRa.a).toString(), c22);
            a2.J(c22);
            return;
        }
    }
}

