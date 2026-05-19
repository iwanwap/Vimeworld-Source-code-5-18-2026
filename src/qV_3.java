/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NCa
 *  Vx
 *  Waa
 *  XB
 *  dba
 *  tCa
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public class qV_3 {
    private List<Vx> j;
    private XB J;
    public Map<String, Vx> A;
    private Map<String, Short> I;

    public void f() {
        int a2;
        qV_3 qV_32 = this;
        int n2 = a2 = uSa.E;
        while (n2 < qV_32.j.size()) {
            Vx vx2 = qV_32.j.get(a2);
            if (vx2.J()) {
                Vx vx3 = vx2;
                qV_32.J(vx3);
                vx3.J(uSa.E != 0);
            }
            n2 = ++a2;
        }
    }

    private void J(Vx vx2) {
        qV_3 qV_32 = this;
        if (qV_32.J != null) {
            try {
                FileOutputStream a2;
                File b2 = qV_32.J.J(((Vx)a2).mapName);
                if (b2 != null) {
                    Waa waa2 = new Waa();
                    a2.f(waa2);
                    Waa waa3 = new Waa();
                    waa3.J(Qpa.B, (NCa)waa2);
                    a2 = new FileOutputStream(b2);
                    tCa.J((Waa)waa3, (OutputStream)a2);
                    a2.close();
                    return;
                }
            }
            catch (Exception b2) {
                b2.printStackTrace();
            }
        }
    }

    private void J() {
        qV_3 qV_32;
        block5: {
            qV_32 = this;
            qV_3 qV_33 = qV_32;
            qV_33.I.clear();
            if (qV_33.J != null) break block5;
            return;
        }
        try {
            File a2 = qV_32.J.J(tpa.j);
            if (a2 != null && a2.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(a2));
                Waa waa2 = tCa.J((DataInputStream)dataInputStream);
                dataInputStream.close();
                for (String string : waa2.J()) {
                    NCa nCa2 = waa2.J(string);
                    if (!(nCa2 instanceof dba)) continue;
                    short s2 = ((dba)nCa2).J();
                    qV_32.I.put(string, s2);
                }
            }
        }
        catch (Exception a2) {
            a2.printStackTrace();
        }
    }

    public int J(String string) {
        qV_3 qV_32;
        File a22;
        qV_3 qV_33 = this;
        Object b2 = qV_33.I.get(a22);
        if (b2 == null) {
            b2 = (short)uSa.E;
            qV_32 = qV_33;
        } else {
            b2 = (short)((Short)b2 + vRa.d);
            qV_32 = qV_33;
        }
        qV_32.I.put((String)((Object)a22), (Short)b2);
        if (qV_33.J == null) {
            return ((Short)b2).shortValue();
        }
        try {
            a22 = qV_33.J.J(tpa.j);
            if (a22 != null) {
                Object object;
                Waa waa2 = new Waa();
                Object object2 = object = qV_33.I.keySet().iterator();
                while (object2.hasNext()) {
                    String string2 = object.next();
                    short s2 = qV_33.I.get(string2);
                    object2 = object;
                    waa2.J(string2, s2);
                }
                Object object3 = object = new DataOutputStream(new FileOutputStream(a22));
                tCa.J((Waa)waa2, (DataOutput)object3);
                ((FilterOutputStream)object3).close();
            }
        }
        catch (Exception a22) {
            a22.printStackTrace();
        }
        return ((Short)b2).shortValue();
    }

    public qV_3(XB xB2) {
        qV_3 b2 = xB2;
        qV_3 a2 = this;
        a2.A = Maps.newHashMap();
        a2.j = Lists.newArrayList();
        a2.I = Maps.newHashMap();
        a2.J = b2;
        a2.J();
    }

    /*
     * Exception decompiling
     */
    public Vx J(Class<? extends Vx> var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK], 3[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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
    public void J(String string, Vx vx2) {
        void a2;
        String c2 = string;
        qV_3 b2 = this;
        if (b2.A.containsKey(c2)) {
            qV_3 qV_32 = b2;
            qV_32.j.remove(qV_32.A.remove(c2));
        }
        b2.A.put(c2, (Vx)a2);
        b2.j.add((Vx)a2);
    }
}

