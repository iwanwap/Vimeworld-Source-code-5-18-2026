/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bka
 *  Cla
 *  DQa
 *  Kpa
 *  QSa
 *  Uja
 *  aKa
 *  aSa
 *  bJa
 *  cja
 *  ez
 *  gka
 *  kla
 *  nka
 *  oJa
 *  uKa
 *  vRa
 *  wKa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vja {
    private final List<mja> m;
    private final Bka C;
    private final Queue<ListenableFutureTask<?>> i;
    private static final Logger M = LogManager.getLogger();
    private final mja k;
    private static final ThreadFactory j = new ThreadFactoryBuilder().setNameFormat(DQa.U).setDaemon(vRa.d != 0).build();
    private final JKa J;
    private final BlockingQueue<gka> A;
    private final BlockingQueue<oJa> I;

    public void f() {
        Object a2;
        vja vja2;
        vja vja3 = vja2 = this;
        vja vja4 = vja3;
        vja3.J();
        while (vja4.J(nqa.i)) {
            vja4 = vja2;
        }
        Object object = a2 = Lists.newArrayList();
        while (object.size() != tTa.h) {
            try {
                a2.add(vja2.J());
                object = a2;
            }
            catch (InterruptedException interruptedException) {
                object = a2;
            }
        }
        vja2.I.addAll((Collection<oJa>)a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, bJa bJa2) {
        void b2;
        vja a2;
        vja c2 = bJa2;
        vja vja2 = a2 = this;
        vja2.J.J((bJa)c2);
        vja2.J.J((aKa)b2);
    }

    public void J(oJa oJa2) {
        vja b2 = oJa2;
        vja a2 = this;
        a2.I.add((oJa)b2);
    }

    public gka J() throws InterruptedException {
        vja a2;
        return a2.A.take();
    }

    public oJa J() throws InterruptedException {
        vja a2;
        return a2.I.take();
    }

    public void J() {
        vja vja2 = this;
        while (!vja2.A.isEmpty()) {
            vja a2 = (gka)vja2.A.poll();
            if (a2 == null) continue;
            a2.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, int n2, Cla cla2) {
        void c2;
        void b2;
        vja d2 = cla2;
        vja a2 = this;
        GL11.glNewList((int)b2, Wqa.O);
        uKa.e();
        d2.d();
        a2.C.J((aKa)c2);
        uKa.D();
        GL11.glEndList();
    }

    public static /* synthetic */ BlockingQueue J(vja a2) {
        return a2.A;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public boolean l(Cla cla2) {
        void a2;
        vja vja2 = this;
        a2.J().lock();
        try {
            vja b2 = a2.J();
            if (b2 == null) {
                boolean bl;
                boolean bl2 = bl = vRa.d;
                return bl2;
            }
            b2.J(new ija(vja2, (gka)b2));
            boolean bl = vja2.A.offer((gka)b2);
            return bl;
        }
        finally {
            a2.J().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public boolean f(Cla cla2) {
        void a2;
        vja vja2 = this;
        a2.J().lock();
        try {
            vja b2 = a2.f();
            b2.J((Runnable)new kla(vja2, (gka)b2));
            boolean bl = vja2.A.offer((gka)b2);
            if (!bl) {
                b2.J();
            }
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            a2.J().unlock();
        }
    }

    public String J() {
        vja a2;
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = a2.A.size();
        objectArray[vRa.d] = a2.i.size();
        objectArray[uqa.g] = a2.I.size();
        return String.format(QSa.Ka, objectArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public ListenableFuture<Object> J(ez ez2, aKa aKa2, Cla cla2, cja cja2) {
        void a2;
        ListenableFutureTask<Object> d2;
        void b2;
        Object e2 = aKa2;
        vja c2 = this;
        if (Kpa.J().J()) {
            vja vja2;
            if (nka.J()) {
                vja vja3 = e2;
                vja2 = vja3;
                c2.J((aKa)vja3, b2.J(d2.ordinal()));
            } else {
                c2.J((aKa)e2, ((wKa)b2).J((ez)d2, (cja)a2), (Cla)b2);
                vja2 = e2;
            }
            vja2.f(aSa.V, aSa.V, aSa.V);
            return Futures.immediateFuture(null);
        }
        d2 = ListenableFutureTask.create((Runnable)new Uja(c2, (ez)d2, (aKa)e2, (Cla)b2, (cja)a2), null);
        e2 = c2.i;
        synchronized (e2) {
            c2.i.add(d2);
            return d2;
        }
    }

    public vja() {
        int a2;
        vja vja2 = this;
        vja2.m = Lists.newArrayList();
        vja2.A = Queues.newArrayBlockingQueue(ySa.T);
        vja2.I = Queues.newArrayBlockingQueue(tTa.h);
        vja vja3 = vja2;
        vja2.C = new Bka();
        vja2.J = new JKa();
        vja2.i = Queues.newArrayDeque();
        int n2 = a2 = uSa.E;
        while (n2 < uqa.g) {
            mja mja2 = new mja(vja2);
            j.newThread(mja2).start();
            vja2.m.add(mja2);
            n2 = ++a2;
        }
        int n3 = a2 = uSa.E;
        while (n3 < tTa.h) {
            vja2.I.add(new oJa());
            n3 = ++a2;
        }
        vja2.k = new mja(vja2, new oJa());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public boolean J(long l2) {
        boolean b22;
        block5: {
            void a2;
            void queue;
            vja vja2 = this;
            int b22 = uSa.E;
            do {
                int n2 = uSa.E;
                Queue<ListenableFutureTask<?>> queue2 = vja2.i;
                synchronized (queue2) {
                    if (!vja2.i.isEmpty()) {
                        vja2.i.poll().run();
                        n2 = vRa.d;
                        b22 = vRa.d;
                    }
                }
                if (a2 == nqa.i) break block5;
                if (n2 != 0) continue;
                return b22;
            } while ((queue = a2 - System.nanoTime()) >= nqa.i);
            return b22;
        }
        return b22;
    }

    /*
     * Exception decompiling
     */
    public boolean J(Cla var1_2) {
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
}

