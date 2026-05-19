/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aq
 *  NQ
 *  NQa
 *  Usa
 *  XTa
 *  bpa
 *  bqa
 *  gr
 *  vRa
 *  yra
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KP_1
extends VQ<Aq, JsonObject> {
    private final Map<String, Fq> I;

    /*
     * Exception decompiling
     */
    @Override
    public Aq J(JsonObject var1_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 14[UNCONDITIONALDOLOOP]
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
    private NQ J(NQ nQ2, JsonArray jsonArray, JsonObject jsonObject) {
        NQ c2;
        Object object;
        Object object22;
        void b2;
        void a2;
        KP_1 kP_1 = this;
        Object d2 = null;
        UUID uUID = gr.J((JsonObject)a2, (String)Usa.w);
        if (b2 != null) {
            for (Object object22 : b2) {
                if (!gr.J((JsonObject)((JsonElement)object22).getAsJsonObject(), (String)Usa.w).equals(uUID)) continue;
                object = d2 = ((JsonElement)object22).getAsJsonObject();
                break;
            }
        } else {
            object = d2;
        }
        if (object == null) {
            d2 = a2;
        }
        KP_1 kP_12 = d2;
        String string = gr.J((JsonObject)((Object)kP_12), (String)dua.T);
        object22 = gr.J((JsonObject)((Object)kP_12), (String)hQa.i);
        d2 = gr.J((JsonObject)((Object)kP_12), (String)NQa.ja);
        NQ nQ3 = c2 = new NQ(c2, uUID, string, (float[])object22, (float[])d2);
        kP_1.J(nQ3, (JsonArray)b2, (JsonObject)a2);
        return nQ3;
    }

    public static /* synthetic */ int J(iR iR2, iR iR3) {
        iR b2 = iR3;
        iR a2 = iR2;
        return a2.A.ordinal() - b2.A.ordinal();
    }

    /*
     * WARNING - void declaration
     */
    private void J(NQ nQ2, JsonArray jsonArray, JsonElement jsonElement) {
        void c2;
        NQ a2;
        Object d2 = jsonArray;
        KP_1 b2 = this;
        if (a2.isJsonObject()) {
            NQ nQ3 = b2.J((NQ)c2, (JsonArray)d2, a2.getAsJsonObject());
            c2.J(nQ3);
            return;
        }
        String string = a2.getAsString();
        d2 = b2.I.get(string);
        if (d2 == null) {
            return;
        }
        if (((Fq)d2).J() != null) {
            NQ nQ4 = a2 = new NQ((NQ)c2, UUID.randomUUID(), null, ((Fq)d2).f(), ((Fq)d2).J());
            nQ4.J((Fq)d2);
            c2.J(nQ4);
            return;
        }
        c2.J((Fq)d2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, BufferedImage bufferedImage) {
        void a2;
        int n2;
        KP_1 kP_1 = this;
        int c2 = uSa.E;
        int n3 = n2 = uSa.E;
        while (n3 < a2.getWidth()) {
            int n4 = uSa.E;
            while (n4 < a2.getHeight()) {
                int n5;
                c2 += a2.getRGB(n2, n5++);
                n4 = n5;
            }
            n3 = ++n2;
        }
        if (c2 == 0) {
            void b2;
            kP_1.I.add(new StringBuilder().insert(3 ^ 3, bqa.q).append((String)b2).append(XTa.Z).toString());
        }
    }

    private static we J(String string) {
        String string2 = string;
        try {
            String[] a2 = string2.split(yra.t);
            byte[] byArray = Base64.getDecoder().decode(a2[vRa.d]);
            return new we(new ByteArrayInputStream(byArray));
        }
        catch (Exception a2) {
            throw new RuntimeException(a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(NQ nQ2, JsonArray jsonArray, JsonObject jsonObject) {
        int n2;
        Object d2 = jsonObject;
        KP_1 a2 = this;
        d2 = ((JsonObject)d2).getAsJsonArray(bpa.z);
        int n3 = n2 = uSa.E;
        while (n3 < ((JsonArray)d2).size()) {
            void b2;
            void c2;
            JsonElement jsonElement = ((JsonArray)d2).get(n2);
            a2.J((NQ)c2, (JsonArray)b2, jsonElement);
            n3 = ++n2;
        }
    }

    public KP_1() {
        KP_1 a2;
        KP_1 kP_1 = a2;
        kP_1.I = new HashMap<String, Fq>();
    }
}

