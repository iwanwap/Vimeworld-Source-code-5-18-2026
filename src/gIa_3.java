/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  pqa
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.CustomBlock;

public final class gIa_3
implements D {
    public static final List<CustomBlock> registry = new ArrayList<CustomBlock>();

    /*
     * Exception decompiling
     */
    public static void J() {
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

    public gIa_3() {
        gIa_3 a2;
    }

    public static String J(String string) {
        int n2;
        String string2 = string;
        StringBuilder stringBuilder = new StringBuilder();
        int a2 = uSa.E;
        char[] cArray = string2.toCharArray();
        int n3 = cArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            char c2 = cArray[n2];
            if (c2 == pqa.ga) {
                a2 = vRa.d;
            } else if (a2 != 0) {
                stringBuilder.append(Character.toUpperCase(c2));
                a2 = uSa.E;
            } else {
                stringBuilder.append(c2);
            }
            n4 = ++n2;
        }
        return stringBuilder.toString();
    }
}

