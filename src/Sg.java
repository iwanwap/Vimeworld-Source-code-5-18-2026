/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  ISa
 *  JSa
 *  Kpa
 *  NTa
 *  TPa
 *  Vz
 *  XSa
 *  ld
 *  pPa
 *  pY
 *  uOa
 *  vRa
 *  zsa
 */
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sg {
    private static final Pattern I = Pattern.compile(XSa.R);

    private static pY J(char c2) {
        char c3 = c2;
        pY[] pYArray = pY.values();
        int n2 = pYArray.length;
        int n3 = uSa.E;
        int n4 = n3;
        char a2 = (char)n3;
        while (n4 < n2) {
            pY pY2 = pYArray[a2];
            if (pY2.toString().charAt(vRa.d) == c3) {
                return pY2;
            }
            a2 = (char)(a2 + 1);
            n4 = a2;
        }
        return null;
    }

    public static void l(String string) {
        String string2 = string;
        if (!I.matcher(string2).matches()) {
            return;
        }
        try {
            Desktop.getDesktop().browse(new URI(string2));
            return;
        }
        catch (Exception a22) {
            OT.b.error(new StringBuilder().insert(5 >> 3, zsa.F).append(a22.getMessage()).append(JSa.v).toString());
            a22.printStackTrace();
            try {
                Runtime.getRuntime().exec(new StringBuilder().insert(5 >> 3, Pua.S).append(string2).toString());
                return;
            }
            catch (IOException a22) {
                OT.b.error(hQa.d, (Throwable)a22);
                return;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static void J(Runnable var0) {
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

    public static void f(String a2) {
        if (a2.charAt(uSa.E) != uOa.F) {
            Kpa.J().Ya.J().J(a2);
        }
        Kpa.J().c.f(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ld J(String string) {
        Iterator iterator;
        int n2;
        String string2 = string;
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        String a2 = new CY(Mqa.y);
        int n3 = n2 = uSa.E;
        while (n3 < string2.length()) {
            char c2 = string2.charAt(n2);
            if (c2 == ISa.E || c2 == TPa.Aa) {
                pY pY2;
                if ((c2 = string2.charAt(++n2)) >= fPa.ga && c2 <= Jsa.ha) {
                    c2 = (char)(c2 + fPa.i);
                }
                if ((pY2 = Sg.J(c2)) != null) {
                    if (stringBuilder.length() > 0) {
                        String string3 = a2;
                        Vz vz2 = string3.J();
                        a2 = new CY(Mqa.y);
                        a2.J(new Vz().J(vz2));
                        string3.J(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        arrayList.add(string3);
                    }
                    switch (Ej.I[pY2.ordinal()]) {
                        case 1: {
                            a2.J().C(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 2: {
                            a2.J().J(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 3: {
                            a2.J().d(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 4: {
                            a2.J().k(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 5: {
                            a2.J().f(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 6: {
                            a2.J().D(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 7: {
                            a2.J().G(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 8: {
                            a2.J().i(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 9: {
                            a2.J().F(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 10: {
                            a2.J().M(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 11: {
                            a2.J().A(Boolean.valueOf(vRa.d != 0));
                            break;
                        }
                        case 12: {
                            pY2 = pY.WHITE;
                        }
                        default: {
                            a2 = new CY(Mqa.y);
                            a2.J().J(pY2);
                            break;
                        }
                    }
                }
            } else {
                stringBuilder.append(c2);
            }
            n3 = ++n2;
        }
        if (stringBuilder.length() > 0) {
            String string4 = a2;
            string4.J(stringBuilder.toString());
            arrayList.add(string4);
        }
        if (arrayList.isEmpty()) {
            arrayList.add((String)new CY(Mqa.y));
        }
        CY cY2 = new CY(Mqa.y);
        Iterator iterator2 = iterator = arrayList.iterator();
        while (iterator2.hasNext()) {
            ld ld2 = (ld)iterator.next();
            iterator2 = iterator;
            cY2.J(ld2);
        }
        return cY2;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(int n2, String string, String string2, String string3, boolean bl) {
        void a2;
        void b2;
        void c2;
        String e2;
        void d2;
        int n3 = n2;
        if (n3 < 0) {
            n3 = -n3;
        }
        Object object = n3 % NTa.C == vRa.d && n3 % ySa.T != pPa.f ? d2 : (e2 = n3 % NTa.C >= uqa.g && n3 % NTa.C <= AQa.P && (n3 % ySa.T < NTa.C || n3 % ySa.T >= kTa.j) ? c2 : b2);
        if (a2 != false) {
            e2 = n3 + e2;
        }
        return e2;
    }

    public static void J(String a2) {
        OT.b.info(a2);
    }

    public static void J(ld a2) {
        Kpa.J().c.J(a2);
    }

    public Sg() {
        Sg a2;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(int n2, String string, String string2, String string3) {
        void b2;
        void c2;
        String d2 = string3;
        int a2 = n2;
        return Sg.J(a2, (String)c2, (String)b2, d2, vRa.d != 0);
    }
}

