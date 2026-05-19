/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  Dha
 *  Gg
 *  Gua
 *  JTa
 *  Jx
 *  KU
 *  Kv
 *  MD
 *  MZ
 *  NTa
 *  Nx
 *  RIa
 *  Vx
 *  Waa
 *  Xv
 *  YLa
 *  Ypa
 *  dpa
 *  mra
 *  nx
 *  rv
 *  vRa
 *  zTa
 */
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class RU
extends KU {
    private Kv structureData;
    public Map structureMap = Maps.newHashMap();
    private YLa structureLongMap;
    private static final String __OBFID = "CL_00000505";

    public abstract boolean J(int var1, int var2);

    public abstract Nx J(int var1, int var2);

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2) {
        RU b2;
        Gg c2 = gg2;
        RU rU2 = b2 = this;
        rU2.J(c2);
        for (Nx nx : rU2.structureMap.values()) {
            void a2;
            if (!nx.J() || !nx.J().J((MD)a2)) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, Nx nx) {
        void c2;
        void a2;
        RU b2;
        int d2 = n3;
        RU rU2 = b2 = this;
        rU2.structureData.J(a2.J((int)c2, d2), (int)c2, d2);
        rU2.structureData.J();
    }

    /*
     * WARNING - void declaration
     */
    public XF J(Gg gg2, XF xF2) {
        uU uU2;
        Object object;
        void a2;
        RU b2;
        Object c2 = gg2;
        RU rU2 = b2 = this;
        RU rU3 = b2;
        b2.worldObj = c2;
        rU3.J((Gg)c2);
        b2.rand.setSeed(c2.J());
        long l2 = rU3.rand.nextLong();
        long l3 = rU3.rand.nextLong();
        l2 = (long)(a2.getX() >> AQa.P) * l2;
        l3 = (long)(a2.getZ() >> AQa.P) * l3;
        rU2.rand.setSeed(l2 ^ l3 ^ c2.J());
        rU2.J((Gg)c2, a2.getX() >> AQa.P, a2.getZ() >> AQa.P, uSa.E, uSa.E, null);
        double d2 = Bra.o;
        c2 = null;
        for (Object object2 : b2.structureMap.values()) {
            double d3;
            object = (Nx)object2;
            if (!object.J()) continue;
            uU2 = (uU)object.J().get(uSa.E);
            XF xF3 = uU2.J();
            double d4 = xF3.distanceSq((MD)a2);
            if (!(d3 < d2)) continue;
            d2 = d4;
            c2 = xF3;
        }
        if (c2 != null) {
            return c2;
        }
        List list = b2.J();
        if (list != null) {
            Object object2;
            object2 = null;
            object = list.iterator();
            while (object.hasNext()) {
                double d5;
                uU2 = object.next();
                double d6 = ((XF)((Object)uU2)).distanceSq((MD)a2);
                if (!(d5 < d2)) continue;
                d2 = d6;
                object2 = (XF)((Object)uU2);
            }
            return object2;
        }
        return null;
    }

    public abstract String J();

    /*
     * WARNING - void declaration
     */
    public final void J(Gg gg2, int n2, int n3, int n4, int n5, oz oz2) {
        void e2;
        Nx f222;
        RU d2;
        int g2 = n3;
        RU rU2 = d2 = this;
        rU2.J((Gg)f222);
        if (!rU2.structureLongMap.J(Baa.J((int)e2, (int)g2))) {
            d2.rand.nextInt();
            try {
                if (d2.J((int)e2, g2)) {
                    RU rU3 = d2;
                    f222 = rU3.J((int)e2, g2);
                    RU rU4 = d2;
                    rU3.structureMap.put(Baa.J((int)e2, (int)g2), f222);
                    rU4.structureLongMap.J(Baa.J((int)e2, (int)g2), (Object)f222);
                    rU4.J((int)e2, g2, f222);
                    return;
                }
            }
            catch (Throwable f222) {
                RIa f222 = RIa.J((Throwable)f222, (String)Ypa.z);
                Dha c2 = f222.J(Gua.z);
                c2.J(zTa.h, (Callable)new nx(d2, (int)e2, g2));
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = (int)e2;
                objectArray[vRa.d] = g2;
                c2.J(dpa.W, (Object)String.format(oQa.ca, objectArray));
                Dha dha = c2;
                dha.J(SPa.z, (Callable)new rv(d2, (int)e2, g2));
                dha.J(tSa.Ka, (Callable)new Jx(d2));
                throw new MZ(f222);
            }
        }
    }

    public boolean J(XF xF2) {
        RU a2;
        Object b2 = xF2;
        RU rU2 = a2 = this;
        rU2.J(rU2.worldObj);
        if (rU2.J((XF)((Object)b2)) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2) {
        RU rU2 = this;
        if (rU2.structureData == null) {
            void a2;
            rU2.structureData = (Kv)a2.J(Kv.class, rU2.J());
            if (rU2.structureData == null) {
                rU2.structureData = new Kv(rU2.J());
                a2.J(rU2.J(), (Vx)rU2.structureData);
                return;
            }
            Waa waa2 = rU2.structureData.J();
            for (Object b22 : waa2.J()) {
                if ((b22 = waa2.J((String)b22)).J() != NTa.C || !(b22 = (Waa)b22).J(JTa.O) || !b22.J(mra.n)) continue;
                Object object = b22;
                int b22 = object.J(JTa.O);
                int n2 = object.J(mra.n);
                Nx nx2 = uv.J((Waa)object, (Gg)a2);
                if (nx2 == null) continue;
                rU2.structureMap.put(Baa.J((int)b22, (int)n2), nx2);
                rU2.structureLongMap.J(Baa.J((int)b22, (int)n2), (Object)nx2);
            }
        }
    }

    public List J() {
        return null;
    }

    public RU() {
        RU a2;
        RU rU2 = a2;
        rU2.structureLongMap = new YLa();
    }

    /*
     * Exception decompiling
     */
    public Nx J(XF var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[DOLOOP]], but top level block is 2[DOLOOP]
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
    public boolean J(Gg gg2, Random random, Baa baa2) {
        void c2;
        void a2;
        RU rU2 = this;
        void v0 = a2;
        RU rU3 = rU2;
        rU3.J((Gg)c2);
        int n2 = (v0.j << AQa.P) + Yqa.i;
        int n3 = (v0.A << AQa.P) + Yqa.i;
        int n4 = uSa.E;
        for (RU d2 : rU3.structureMap.values()) {
            void b2;
            if (!d2.J() || !d2.J((Baa)a2)) continue;
            int n5 = n2;
            if (!d2.J().J(n5, n3, n5 + Ypa.A, n3 + Ypa.A)) continue;
            RU rU4 = d2;
            int n6 = n2;
            rU4.J((Gg)c2, (Random)b2, new Xv(n6, n3, n6 + Ypa.A, n3 + Ypa.A));
            rU4.J((Baa)a2);
            n4 = vRa.d;
            rU2.J(d2.J(), d2.f(), (Nx)d2);
        }
        return n4 != 0;
    }
}

