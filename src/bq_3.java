/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ap
 *  Aq
 *  JPa
 *  KP
 *  Kl
 *  MR
 *  Uqa
 *  YP
 *  YQ
 *  bq
 *  di
 *  iq
 *  jRa
 *  vRa
 *  wr
 *  xr
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bq_3 {
    private final Map<String, CompletableFuture<YQ>> J;
    private final List<iq> A;
    private final di I;

    public List<iq> J() {
        bq_3 a2;
        return a2.A;
    }

    public static /* synthetic */ boolean J(bq bq2, CompletableFuture completableFuture) {
        Object b2 = completableFuture;
        bq a2 = bq2;
        if (!((CompletableFuture)b2).isDone() || ((CompletableFuture)b2).isCompletedExceptionally()) {
            return uSa.E != 0;
        }
        if ((b2 = (YQ)((CompletableFuture)b2).getNow(null)) == null || ((YQ)b2).i > 0 || ((YQ)b2).A >= OT.e - Uqa.o) {
            return uSa.E != 0;
        }
        for (iq iq2 : b2.J()) {
            if (!iq2.J()) continue;
            a2.A.remove(iq2);
        }
        b2.J();
        return vRa.d != 0;
    }

    private void J(YQ yQ2) {
        YQ b2 = yQ2;
        bq_3 a2 = this;
        for (iq iq2 : b2.J()) {
            if (!iq2.J()) continue;
            a2.A.add(iq2);
        }
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ void J(bq var0, CompletableFuture var1_2, Kl var2_3, InputStream var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 0[TRYBLOCK]], but top level block is 8[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    public void J(Kl kl2, Consumer<YQ> consumer) {
        void a2;
        void b2;
        bq_3 bq_32 = this;
        CompletableFuture<YQ> completableFuture = bq_32.J.get(b2.J());
        if (completableFuture == null) {
            CompletableFuture c2 = new CompletableFuture();
            bq_32.J.put(b2.J(), c2);
            completableFuture = c2;
            b2.f().thenAccept(YP.J((bq)bq_32, (CompletableFuture)c2, (Kl)b2));
        }
        completableFuture.whenComplete(MR.J((Consumer)a2));
    }

    public void f() {
        bq_3 a2;
        a2.J.values().removeIf(Ap.J((bq)a2));
    }

    public static /* synthetic */ void J(Consumer consumer, YQ yQ2, Throwable throwable) {
        Consumer c2 = yQ2;
        Consumer b2 = consumer;
        if (c2 != null) {
            b2.accept(c2);
        }
    }

    public bq_3(di di2) {
        bq_3 a2;
        bq_3 b2 = di2;
        bq_3 bq_32 = a2 = this;
        bq_3 bq_33 = a2;
        bq_32.J = new HashMap<String, CompletableFuture<YQ>>();
        bq_32.A = new ArrayList<iq>();
        bq_32.I = b2;
    }

    private YQ J(BufferedInputStream bufferedInputStream) {
        Object b2 = bufferedInputStream;
        bq_3 a2 = this;
        JsonParser jsonParser = new JsonParser();
        b2 = jsonParser.parse(new InputStreamReader((InputStream)b2, StandardCharsets.UTF_8));
        b2 = new KP().J(((JsonElement)b2).getAsJsonObject());
        new xr().J((Aq)b2).C = a2.I;
        return new xr().J((Aq)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(bq bq2, YQ yQ2, CompletableFuture completableFuture) {
        void b2;
        CompletableFuture c2 = completableFuture;
        bq a2 = bq2;
        void v0 = b2;
        super.J((YQ)v0);
        c2.complete(v0);
    }

    public static /* synthetic */ void J(YQ yQ2, Throwable throwable) {
        Object b2 = throwable;
        YQ a2 = yQ2;
        if (a2 != null) {
            a2.J();
        }
    }

    public void J() {
        Object a2;
        bq_3 bq_32 = this;
        Object object = a2 = bq_32.J.values().iterator();
        while (object.hasNext()) {
            ((CompletableFuture)a2.next()).whenComplete(wr.J());
            object = a2;
        }
        bq_3 bq_33 = bq_32;
        bq_33.J.clear();
        bq_33.A.clear();
    }

    /*
     * WARNING - void declaration
     */
    private kP J(BufferedInputStream bufferedInputStream) throws IOException {
        void a2;
        bq_3 bq_32 = this;
        void v0 = a2;
        v0.mark(AQa.P);
        byte[] byArray = new byte[AQa.P];
        Object b2 = byArray;
        v0.read(byArray);
        a2.reset();
        if (b2[uSa.E] == JPa.ga) {
            return kP.JSON;
        }
        if (b2[uSa.E] == Fua.J && b2[vRa.d] == jRa.X && b2[uqa.g] == yRa.d && b2[yRa.d] == AQa.P) {
            return kP.ZIP;
        }
        return kP.UNKNOWN;
    }
}

