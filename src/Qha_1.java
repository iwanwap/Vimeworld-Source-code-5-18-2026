/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Eha
 *  JPa
 *  Maa
 *  NTa
 *  Pqa
 *  U
 *  aJa
 *  aPa
 *  bua
 *  cQa
 *  gHa
 *  kta
 *  pha
 *  pqa
 *  vRa
 *  wPa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.vector.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qha_1 {
    private int L;
    private final List<gHa> E;
    private gHa m;
    private int C;
    private float i;
    private Matrix4f M;
    private String k;
    private U j;
    private final Map<String, gHa> J;
    private float A;
    private final List<IIa> I;

    /*
     * Exception decompiling
     */
    private void J(aJa var1_2, JsonElement var2_3) throws Eha, IOException {
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
    public void J(String string, int n2, int n3) {
        void c2;
        void a2;
        void b2;
        Qha_1 qha_1 = this;
        Qha_1 d2 = new gHa((int)b2, (int)a2, vRa.d != 0);
        d2.J(JPa.N, JPa.N, JPa.N, JPa.N);
        qha_1.J.put((String)c2, (gHa)d2);
        if (b2 == qha_1.C && a2 == qha_1.L) {
            qha_1.E.add((gHa)d2);
        }
    }

    private gHa f(String string) {
        String b2 = string;
        Qha_1 a2 = this;
        if (b2 == null) {
            return null;
        }
        if (b2.equals(cQa.C)) {
            return a2.m;
        }
        return a2.J.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        IIa iIa;
        Iterator<gHa> c2;
        Qha_1 qha_1;
        Qha_1 qha_12 = qha_1 = this;
        qha_12.C = qha_12.m.C;
        qha_12.L = qha_12.m.m;
        qha_12.J();
        Iterator<gHa> iterator = c2 = qha_12.I.iterator();
        while (iterator.hasNext()) {
            iIa = (IIa)c2.next();
            iterator = c2;
            iIa.J(qha_1.M);
        }
        Iterator<gHa> iterator2 = c2 = qha_1.E.iterator();
        while (iterator2.hasNext()) {
            void a2;
            void b2;
            iIa = c2.next();
            iterator2 = c2;
            iIa.l((int)b2, (int)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public IIa J(String string, gHa gHa2, gHa gHa3) throws Eha, IOException {
        void a2;
        void b2;
        Object d2 = string;
        Qha_1 c2 = this;
        d2 = new IIa(c2.j, (String)d2, (gHa)b2, (gHa)a2);
        Qha_1 qha_1 = c2;
        Object object = d2;
        qha_1.I.add(qha_1.I.size(), (IIa)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(JsonElement jsonElement) throws Eha {
        Object a2;
        Qha_1 qha_1 = this;
        a2 = Maa.J((JsonElement)a2, (String)opa.Q);
        Object b2 = Maa.J((JsonObject)a2, (String)dua.T);
        Qha_1 qha_12 = qha_1;
        pha pha2 = qha_12.I.get(qha_12.I.size() - vRa.d).J().J((String)b2);
        if (pha2 == null) {
            throw new Eha(new StringBuilder().insert(5 >> 3, zua.b).append((String)b2).append(bua.J).toString());
        }
        b2 = new float[AQa.P];
        int n2 = uSa.E;
        Object object = a2 = Maa.J((JsonObject)a2, (String)Pqa.F).iterator();
        while (object.hasNext()) {
            JsonElement jsonElement2 = (JsonElement)a2.next();
            try {
                b2[n2] = Maa.J((JsonElement)jsonElement2, (String)wPa.O);
            }
            catch (Exception exception) {
                Eha eha2;
                Eha eha3 = eha2 = Eha.func_151379_a((Exception)exception);
                eha3.func_151380_a(yOa.t + n2 + XOa.D);
                throw eha3;
            }
            ++n2;
            object = a2;
        }
        switch (n2) {
            default: {
                return;
            }
            case 1: {
                pha2.J((float)b2[uSa.E]);
                return;
            }
            case 2: {
                pha2.J((float)b2[uSa.E], (float)b2[vRa.d]);
                return;
            }
            case 3: {
                pha2.J((float)b2[uSa.E], (float)b2[vRa.d], (float)b2[uqa.g]);
                return;
            }
            case 4: 
        }
        pha2.f((float)b2[uSa.E], (float)b2[vRa.d], (float)b2[uqa.g], (float)b2[yRa.d]);
    }

    public void J(float f2) {
        Qha_1 qha_1;
        float b2 = f2;
        Qha_1 a2 = this;
        if (b2 < a2.A) {
            Qha_1 qha_12 = a2;
            qha_1 = qha_12;
            qha_12.i += pqa.r - a2.A;
            qha_12.i += b2;
        } else {
            Qha_1 qha_13 = a2;
            qha_1 = qha_13;
            qha_13.i += b2 - a2.A;
        }
        qha_1.A = b2;
        Qha_1 qha_14 = a2;
        while (qha_14.i > eta.e) {
            Qha_1 qha_15 = a2;
            qha_14 = qha_15;
            qha_15.i -= eta.e;
        }
        Iterator<IIa> iterator = b2 = a2.I.iterator();
        while (iterator.hasNext()) {
            b2.next().J(a2.i / eta.e);
            iterator = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Qha_1(aJa aJa2, U u2, gHa gHa2, ResourceLocation resourceLocation) throws Eha, IOException, JsonSyntaxException {
        void d2;
        ResourceLocation e2;
        void c2;
        void b2;
        Qha_1 a2;
        Qha_1 qha_1 = resourceLocation2;
        ResourceLocation resourceLocation2 = resourceLocation;
        Qha_1 qha_12 = a2 = qha_1;
        Qha_1 qha_13 = a2;
        void v3 = b2;
        Qha_1 qha_14 = a2;
        Qha_1 qha_15 = a2;
        a2.I = Lists.newArrayList();
        a2.J = Maps.newHashMap();
        a2.E = Lists.newArrayList();
        qha_15.j = c2;
        qha_14.m = b2;
        qha_15.i = JPa.N;
        qha_14.A = JPa.N;
        a2.C = v3.M;
        qha_13.L = v3.k;
        qha_13.k = e2.toString();
        qha_12.J();
        qha_12.J((aJa)d2, e2);
    }

    public void f() {
        Object object;
        Iterator<IIa> a2;
        Qha_1 qha_1 = this;
        Iterator<IIa> iterator = a2 = qha_1.J.values().iterator();
        while (iterator.hasNext()) {
            object = (gHa)a2.next();
            iterator = a2;
            object.l();
        }
        Iterator<IIa> iterator2 = a2 = qha_1.I.iterator();
        while (iterator2.hasNext()) {
            object = a2.next();
            iterator2 = a2;
            ((IIa)object).f();
        }
        qha_1.I.clear();
    }

    private void J(JsonElement jsonElement) throws Eha {
        Object b2 = jsonElement;
        Qha_1 a2 = this;
        if (Maa.J((JsonElement)b2)) {
            Qha_1 qha_1 = a2;
            qha_1.J(((JsonElement)b2).getAsString(), a2.C, qha_1.L);
            return;
        }
        JsonObject jsonObject = Maa.J((JsonElement)b2, (String)aPa.n);
        b2 = Maa.J((JsonObject)jsonObject, (String)dua.T);
        int n2 = Maa.J((JsonObject)jsonObject, (String)oQa.R, (int)a2.C);
        int n3 = Maa.J((JsonObject)jsonObject, (String)NTa.x, (int)a2.L);
        if (a2.J.containsKey(b2)) {
            throw new Eha(new StringBuilder().insert(5 >> 3, (String)b2).append(Qra.ja).toString());
        }
        a2.J((String)b2, n2, n3);
    }

    public gHa J(String string) {
        String b2 = string;
        Qha_1 a2 = this;
        return a2.J.get(b2);
    }

    /*
     * Exception decompiling
     */
    public void J(aJa var1_1, ResourceLocation var2_3) throws Eha, IOException, JsonSyntaxException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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

    public final String J() {
        Qha_1 a2;
        return a2.k;
    }

    private void J() {
        Qha_1 a2;
        a2.M = new Matrix4f();
        a2.M.setIdentity();
        Qha_1 qha_1 = a2;
        qha_1.M.m00 = kta.v / (float)a2.m.C;
        qha_1.M.m11 = kta.v / (float)(-a2.m.m);
        a2.M.m22 = Ata.l;
        qha_1.M.m33 = pqa.r;
        qha_1.M.m03 = vqa.T;
        qha_1.M.m13 = pqa.r;
        qha_1.M.m23 = QTa.U;
    }
}

