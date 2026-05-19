/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Px
 *  Qx
 *  Vw
 *  Zua
 *  vRa
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Vw_2
extends Thread {
    private static Vw j;
    private final Map<String, Qx> J;
    private final Object A;
    private final Queue<Px> I;

    public static /* synthetic */ List J(String a2) {
        return new ArrayList();
    }

    public Vw_2() {
        Vw_2 a2;
        Vw_2 vw_2 = a2;
        a2.A = new Object();
        vw_2.J = new ConcurrentHashMap<String, Qx>();
        a2.I = new ConcurrentLinkedQueue<Px>();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private Qx J(File file, boolean bl) {
        Vw_2 b2;
        Object c2 = file;
        Vw_2 vw_2 = b2 = this;
        String string = vw_2.J((File)c2);
        Qx qx = vw_2.J.get(string);
        if (qx == null) {
            void a2;
            b2.J.put(string, Qx.VALIDATING);
            qx = Qx.VALIDATING;
            b2.I.add(new Px((File)c2, string));
            if (a2 != false) {
                c2 = b2.A;
                synchronized (c2) {
                    b2.A.notify();
                    return qx;
                }
            }
        }
        return qx;
    }

    public synchronized Qx f(File file) {
        File b2 = file;
        Vw_2 a2 = this;
        return a2.J(b2, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public synchronized Qx J(File file) {
        Vw_2 vw_2 = this;
        long l2 = System.currentTimeMillis();
        do {
            void a2;
            Vw_2 b2;
            if ((b2 = vw_2.J((File)a2, vRa.d != 0)) != Qx.VALIDATING) {
                return b2;
            }
            try {
                Thread.sleep(Zua.B);
            }
            catch (InterruptedException interruptedException) {
                return Qx.ERROR;
            }
        } while (System.currentTimeMillis() - l2 < vua.Fa);
        return Qx.ERROR;
    }

    public static synchronized Vw J() {
        if (j == null) {
            j = new Vw_2();
            j.start();
        }
        return j;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void J(File file) {
        Object b2 = file;
        Vw_2 a2 = this;
        if ((b2 = b2.listFiles()) != null) {
            int n2;
            int n3 = ((File[])b2).length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                File file2 = b2[n2];
                if (file2.isFile() && file2.getName().endsWith(QTa.C)) {
                    a2.J(file2, uSa.E != 0);
                }
                n4 = ++n2;
            }
            b2 = a2.A;
            synchronized (b2) {
                a2.A.notify();
                return;
            }
        }
    }

    private String J(File file) {
        File b2 = file;
        Vw_2 a2 = this;
        return new StringBuilder().insert(3 ^ 3, b2.getName()).append(b2.length()).append(b2.lastModified()).toString();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
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
}

