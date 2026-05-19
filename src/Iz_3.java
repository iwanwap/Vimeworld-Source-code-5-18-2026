/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gc
 */
import java.io.File;
import java.net.Proxy;
import java.util.Map;

public final class Iz_3
implements Runnable {
    public final /* synthetic */ Proxy M;
    public final /* synthetic */ Map k;
    public final /* synthetic */ String j;
    public final /* synthetic */ File J;
    public final /* synthetic */ gc A;
    public final /* synthetic */ int I;

    /*
     * WARNING - void declaration
     */
    public Iz_3(gc gc2, String string, Proxy proxy, Map map, File file, int n2) {
        void a2;
        Iz_3 iz_3;
        int n3 = n2;
        Iz_3 iz_32 = iz_3 = this;
        Iz_3 iz_33 = iz_3;
        iz_33.A = gc2;
        iz_33.j = string;
        iz_32.M = proxy;
        iz_32.k = map;
        iz_3.J = file;
        iz_3.I = a2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 11[WHILELOOP]
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

