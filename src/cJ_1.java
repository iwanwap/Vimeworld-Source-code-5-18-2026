/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GK
 *  Kl
 *  Kpa
 *  N
 *  NK
 *  Qqa
 *  Qta
 *  RA
 *  U
 *  Uj
 *  XTa
 *  cJ
 *  uQa
 *  vRa
 */
import com.google.common.collect.Sets;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cJ_1 {
    private final Map<ModelResourceLocation, RA> M;
    private final List<ResourceLocation> k;
    private final Set<Kl> j;
    private final Set<Kl> J;
    private final Map<RA, ResourceLocation> A;
    private final List<WKa> I;

    public static /* synthetic */ Map J(cJ a2) {
        return a2.M;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ void J(cJ var0, Kl var1_2, InputStream var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 0[TRYBLOCK]
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

    public cJ_1() {
        cJ_1 a2;
        cJ_1 cJ_12 = a2;
        a2.I = new ArrayList<WKa>();
        cJ_12.k = new ArrayList<ResourceLocation>();
        a2.M = new HashMap<ModelResourceLocation, RA>();
        a2.A = new IdentityHashMap<RA, ResourceLocation>();
        a2.j = new HashSet<Kl>();
        a2.J = Sets.newConcurrentHashSet();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(cJ cJ2, Kl kl2, Map map) {
        cJ cJ3;
        cJ c2 = kl2;
        cJ b2 = cJ2;
        if (!b2.J.contains(c2)) {
            return;
        }
        try {
            void a2;
            super.J((Kl)c2, (Map<String, byte[]>)a2);
            cJ3 = b2;
        }
        catch (Exception a2) {
            OT.b.error(new StringBuilder().insert(3 >> 2, eua.N).append(c2.J()).toString(), (Throwable)a2);
            cJ3 = b2;
        }
        cJ3.J.remove(c2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J(Kl kl2, Map<String, byte[]> map) {
        GK b2;
        Object object;
        Iterator a2;
        cJ_1 cJ_12 = this;
        byte[] byArray = (byte[])a2.get(rta.A);
        Object c22 = byArray;
        if (byArray == null) {
            throw new RuntimeException(Qpa.i);
        }
        Object object2 = new ArrayList<String>();
        try {
            c22 = IOUtils.readLines(new ByteArrayInputStream((byte[])c22)).iterator();
            block3: while (true) {
                Object object3 = c22;
                while (object3.hasNext()) {
                    object = c22.next();
                    if ((object = object.trim()).isEmpty()) continue block3;
                    if (object.startsWith(uQa.Y)) {
                        object3 = c22;
                        continue;
                    }
                    object2.add(object);
                    continue block3;
                }
                break;
            }
        }
        catch (IOException c22) {
            // empty catch block
        }
        if (cJ_12.k.contains(c22 = new ResourceLocation(zua.fa, new StringBuilder().insert(5 >> 3, ITa.W).append(b2.J()).toString()))) {
            OT.b.warn(new StringBuilder().insert(5 >> 3, fPa.Aa).append(c22).append(Qqa.la).toString());
            return;
        }
        object = new WKa(oua.D);
        new WKa(oua.D).I = vRa.d;
        b2 = new GK((Map)((Object)a2));
        Uj uj2 = new Uj((U)b2, (WKa)((Object)object), Kpa.J().J().J.J());
        uj2.J(object2);
        b2 = uj2.f();
        Iterator iterator = a2 = ((Ky)b2).J().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Kpa.J().J().J((ResourceLocation)c22, (H)object);
                cJ_12.I.add((WKa)((Object)object));
                cJ_12.k.add((ResourceLocation)c22);
                return;
            }
            object2 = (ModelResourceLocation)a2.next();
            RA rA2 = (RA)b2.J(object2);
            object2 = new ModelResourceLocation(wua.A, ((ResourceLocation)object2).J(), ((ModelResourceLocation)object2).l());
            iterator = a2;
            cJ_12.M.put((ModelResourceLocation)object2, rA2);
            cJ_12.A.put(rA2, (ResourceLocation)c22);
        }
    }

    public void l() {
        N<ModelResourceLocation, RA> n2 = this;
        Fia fia2 = Kpa.J().J().J;
        N<ModelResourceLocation, RA> a2 = fia2.A;
        Fia fia3 = fia2;
        fia3.A = new NK(n2, a2);
    }

    public void J(vN vN2) {
        String string;
        Object b2 = vN2;
        cJ_1 a2 = this;
        if (((vN)b2).hasPath()) {
            string = ((vN)b2).getPath();
        } else if (((vN)b2).hasResource()) {
            string = OT.i.C.J(((vN)b2).getResource());
        } else {
            throw new IllegalArgumentException(XTa.t);
        }
        b2 = OT.i.C.J(string);
        if (b2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, Qta.u).append(string).append(zua.I).toString());
        }
        if (!a2.j.add((Kl)b2)) {
            return;
        }
        a2.J.add((Kl)b2);
        b2.f().thenAccept(El.J((cJ)a2, (Kl)b2));
    }

    public void f() {
        Object a2;
        cJ_1 cJ_12 = this;
        Object object = a2 = cJ_12.I.iterator();
        while (object.hasNext()) {
            ((WKa)((Object)a2.next())).f();
            object = a2;
        }
    }

    public static boolean J() {
        if (!OT.i.G.J.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        Object a2;
        cJ_1 cJ_12 = this;
        Object object = a2 = cJ_12.k.iterator();
        while (object.hasNext()) {
            ResourceLocation resourceLocation = (ResourceLocation)a2.next();
            Kpa.J().J().f(resourceLocation);
            object = a2;
        }
        cJ_1 cJ_13 = cJ_12;
        cJ_13.k.clear();
        cJ_13.I.clear();
        cJ_13.M.clear();
        cJ_13.A.clear();
        cJ_13.j.clear();
        cJ_13.J.clear();
    }

    public static ResourceLocation J(RA a2) {
        return OT.i.G.A.get(a2);
    }
}

