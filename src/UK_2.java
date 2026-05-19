/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Bsa
 *  Cra
 *  DQa
 *  EQa
 *  ERa
 *  Epa
 *  FTa
 *  Fpa
 *  Gua
 *  ISa
 *  JPa
 *  JQa
 *  JTa
 *  KTa
 *  LJa
 *  Lqa
 *  MQa
 *  N
 *  NC
 *  NOa
 *  NPa
 *  NQa
 *  NTa
 *  OLa
 *  PTa
 *  Ppa
 *  Pqa
 *  QFa
 *  QSa
 *  Qqa
 *  RA
 *  RPa
 *  RQa
 *  Rja
 *  Rua
 *  SOa
 *  SQa
 *  SRa
 *  Sha
 *  Sqa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  U
 *  UK
 *  Usa
 *  Uta
 *  VQa
 *  Vua
 *  WGa
 *  WQa
 *  WSa
 *  Wsa
 *  XJa
 *  XSa
 *  XTa
 *  Xsa
 *  YSa
 *  Yka
 *  Ypa
 *  Yra
 *  Ysa
 *  ZOa
 *  Zpa
 *  Zta
 *  Zua
 *  aPa
 *  aSa
 *  aqa
 *  asa
 *  bRa
 *  bha
 *  bpa
 *  bqa
 *  bua
 *  cQa
 *  cRa
 *  dQa
 *  dpa
 *  eAa
 *  fTa
 *  fpa
 *  hTa
 *  hha
 *  hqa
 *  iJa
 *  isa
 *  jpa
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  lPa
 *  lqa
 *  mGa
 *  mga
 *  mra
 *  oKa
 *  oka
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  tJa
 *  uQa
 *  uRa
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  xOa
 *  yQa
 *  yra
 *  zTa
 *  zsa
 */
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCopper$EnumVariant;
import net.minecraft.block.BlockFroglight$EnumVariant;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UK_2 {
    private final U c;
    private static final Set<ResourceLocation> B;
    public Map<eAa, List<String>> d;
    private static final Joiner a;
    public Map<String, ResourceLocation> b;
    private final oka l;
    public static final ModelResourceLocation e;
    private static final fKa G;
    public Ky<ModelResourceLocation, RA> D;
    private static final fKa f;
    private final WKa F;
    public static final ModelResourceLocation g;
    private final oKa L;
    private final LJa E;
    private static final fKa m;
    private static final Map<String, String> C;
    public final Map<ResourceLocation, fKa> i;
    private final Map<ResourceLocation, KLa> M;
    private static final fKa k;
    private static final Logger j;
    private final Map<ResourceLocation, tJa> J;
    public final Map<ModelResourceLocation, XJa> A;
    private static final fKa I;

    private void A() {
        UK_2 uK_2;
        UK_2 uK_22 = uK_2 = this;
        uK_22.J(uK_22.L.J().J());
        OLa[] oLaArray = new OLa[vRa.d];
        oLaArray[uSa.E] = new OLa(new ResourceLocation(g.J()), AGa.X0_Y0, uSa.E != 0, vRa.d);
        uK_22.A.put(g, new XJa(g.l(), Lists.newArrayList(oLaArray)));
        OLa[] oLaArray2 = new OLa[vRa.d];
        oLaArray2[uSa.E] = new OLa(new ResourceLocation(e.J()), AGa.X0_Y0, uSa.E != 0, vRa.d);
        uK_2.A.put(e, new XJa(e.l(), Lists.newArrayList(oLaArray2)));
        ResourceLocation a2 = new ResourceLocation(Yqa.Ja);
        UK_2 uK_23 = uK_2;
        tJa tJa2 = uK_23.J(null, a2);
        uK_23.J(tJa2, new ModelResourceLocation(a2, AQa.t));
        uK_23.J(tJa2, new ModelResourceLocation(a2, Epa.Aa));
        uK_23.e();
        uK_23.C();
    }

    /*
     * WARNING - void declaration
     */
    public UK_2(U u2, WKa wKa2, oKa oKa2) {
        void b2;
        void c2;
        UK_2 a2;
        UK_2 d2 = oKa2;
        UK_2 uK_2 = a2 = this;
        UK_2 uK_22 = a2;
        a2.M = Maps.newHashMap();
        a2.i = Maps.newLinkedHashMap();
        a2.A = Maps.newLinkedHashMap();
        UK_2 uK_23 = a2;
        a2.E = new LJa();
        a2.l = new oka();
        a2.D = new Ky();
        a2.b = Maps.newLinkedHashMap();
        uK_22.J = Maps.newHashMap();
        uK_22.d = Maps.newIdentityHashMap();
        uK_22.c = c2;
        uK_2.F = b2;
        uK_2.L = d2;
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation l(ResourceLocation resourceLocation) {
        UK_2 uK_2 = this;
        for (Map.Entry entry : uK_2.i.entrySet()) {
            void a2;
            fKa fKa2 = (fKa)entry.getValue();
            if (fKa2 == null || !a2.equals(fKa2.J())) continue;
            return (ResourceLocation)entry.getKey();
        }
        return null;
    }

    public Set<ResourceLocation> f() {
        Iterator a2;
        UK_2 uK_2 = this;
        HashSet<ResourceLocation> hashSet = Sets.newHashSet();
        Iterator iterator = a2 = Lists.newArrayList(uK_2.A.keySet());
        Collections.sort(iterator, new mga((UK)uK_2));
        a2 = iterator.iterator();
        while (a2.hasNext()) {
            ModelResourceLocation modelResourceLocation = (ModelResourceLocation)a2.next();
            for (Object object : uK_2.A.get(modelResourceLocation).J()) {
                if ((object = uK_2.i.get(object.J())) == null) {
                    j.warn(new StringBuilder().insert(3 ^ 3, Fua.D).append(modelResourceLocation).toString());
                    continue;
                }
                hashSet.addAll(uK_2.J((fKa)object));
            }
        }
        HashSet<ResourceLocation> hashSet2 = hashSet;
        hashSet2.addAll(B);
        return hashSet2;
    }

    public N<ModelResourceLocation, RA> J() {
        UK_2 a2;
        UK_2 uK_2 = a2;
        uK_2.A();
        uK_2.d();
        uK_2.l();
        uK_2.i();
        uK_2.f();
        return uK_2.D;
    }

    private boolean f(fKa fKa2) {
        fKa b2 = fKa2;
        UK_2 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (b2.J() == I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private boolean J(fKa fKa2) {
        Object b2 = fKa2;
        UK_2 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if ((b2 = ((fKa)b2).J()) == m || b2 == k || b2 == G) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Map J(UK a2) {
        return a2.M;
    }

    public void i() {
        UK_2 uK_2 = this;
        for (ResourceLocation a2 : uK_2.b.values()) {
            fKa fKa2 = uK_2.i.get(a2);
            if (uK_2.J(fKa2)) {
                fKa fKa3 = uK_2.J(fKa2);
                if (fKa3 != null) {
                    fKa3.name = a2.toString();
                }
                uK_2.i.put(a2, fKa3);
                continue;
            }
            if (!uK_2.f(fKa2)) continue;
            uK_2.i.put(a2, fKa2);
        }
        for (KLa a2 : uK_2.M.values()) {
            if (a2.J()) continue;
            a2.d();
        }
    }

    private ResourceLocation f(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        UK_2 a2 = this;
        return new ResourceLocation(b2.f(), new StringBuilder().insert(3 >> 2, IPa.q).append(b2.J()).append(Epa.k).toString());
    }

    /*
     * WARNING - void declaration
     */
    private Yka J(GJa gJa2, Rja rja2, KLa kLa2, DZ dZ2, AGa aGa2, boolean bl) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        GJa g2 = gJa2;
        UK_2 f2 = this;
        Object object = g2;
        return f2.E.J(((GJa)object).positionFrom, ((GJa)object).positionTo, (Rja)e2, (KLa)d2, (DZ)c2, (AGa)b2, g2.partRotation, (boolean)a2, g2.shade);
    }

    private fKa J(fKa fKa2) {
        UK_2 a2;
        fKa b2 = fKa2;
        UK_2 uK_2 = a2 = this;
        return uK_2.l.J(uK_2.F, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(tJa tJa2, ModelResourceLocation modelResourceLocation) {
        void a2;
        UK_2 c2 = tJa2;
        UK_2 b2 = this;
        c2 = c2.J(a2.l());
        b2.A.put((ModelResourceLocation)a2, (XJa)c2);
    }

    private void M() {
        ResourceLocation resourceLocation;
        UK_2 uK_2 = this;
        ArrayDeque<ResourceLocation> arrayDeque = Queues.newArrayDeque();
        HashSet<Object> hashSet = Sets.newHashSet();
        for (ResourceLocation object : uK_2.i.keySet()) {
            hashSet.add(object);
            resourceLocation = uK_2.i.get(object).J();
            if (resourceLocation == null) continue;
            arrayDeque.add(resourceLocation);
        }
        ArrayDeque<ResourceLocation> arrayDeque2 = arrayDeque;
        while (!arrayDeque2.isEmpty()) {
            ResourceLocation a2;
            block6: {
                a2 = (ResourceLocation)arrayDeque.pop();
                if (uK_2.i.get(a2) == null) break block6;
                arrayDeque2 = arrayDeque;
                continue;
            }
            try {
                UK_2 uK_22 = uK_2;
                fKa fKa2 = uK_22.J(a2);
                uK_22.i.put(a2, fKa2);
                resourceLocation = fKa2.J();
                if (resourceLocation != null && !hashSet.contains(resourceLocation)) {
                    arrayDeque.add(resourceLocation);
                }
            }
            catch (Exception exception) {
                j.warn(new StringBuilder().insert(5 >> 3, kqa.l).append(a.join(uK_2.J(a2))).append(vqa.fa).append(a2).append(XTa.Z).toString(), (Throwable)exception);
            }
            hashSet.add(a2);
            arrayDeque2 = arrayDeque;
        }
    }

    public static /* synthetic */ String J(BlockFroglight$EnumVariant a2) {
        return new StringBuilder().insert(5 >> 3, a2.getName()).append(WOa.U).toString();
    }

    private void J(Map<IBlockState, ModelResourceLocation> map) {
        Iterator a2;
        UK_2 uK_2 = this;
        for (Map.Entry b22 : a2.entrySet()) {
            IBlockState iBlockState = (IBlockState)b22.getKey();
            ModelResourceLocation b22 = (ModelResourceLocation)b22.getValue();
            iBlockState = uK_2.J(iBlockState, (ResourceLocation)b22);
            try {
                uK_2.J((tJa)iBlockState, b22);
            }
            catch (Exception exception) {
                try {
                    j.warn(new StringBuilder().insert(3 ^ 3, CRa.H).append(b22.l()).append(WRa.k).append(b22).toString());
                }
                catch (Exception exception2) {
                    j.warn(new StringBuilder().insert(3 ^ 3, mSa.j).append(b22).toString(), (Throwable)exception2);
                }
            }
        }
    }

    private ResourceLocation J(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        UK_2 a2 = this;
        return new ResourceLocation(b2.f(), new StringBuilder().insert(2 & 5, dqa.b).append(b2.J()).append(Epa.k).toString());
    }

    public void e() {
        UK_2 uK_2 = this;
        for (ModelResourceLocation modelResourceLocation : uK_2.A.keySet()) {
            Iterator iterator = uK_2.A.get(modelResourceLocation).J().iterator();
            while (iterator.hasNext()) {
                ResourceLocation a2 = ((OLa)iterator.next()).J();
                if (uK_2.i.get(a2) != null) continue;
                try {
                    Object object = a2;
                    uK_2.i.put((ResourceLocation)object, uK_2.J((ResourceLocation)object));
                }
                catch (Exception exception) {
                    j.warn(new StringBuilder().insert(2 & 5, Zra.a).append(a2).append(vsa.s).append(modelResourceLocation).append(XTa.Z).toString(), (Throwable)exception);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    private tJa J(IBlockState var1_2, ResourceLocation var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
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

    public void d() {
        Object a2;
        UK_2 uK_2;
        UK_2 uK_22 = uK_2 = this;
        uK_22.M();
        Object object = a2 = uK_22.i.values().iterator();
        while (object.hasNext()) {
            ((fKa)a2.next()).f(uK_2.i);
            object = a2;
        }
        fKa.J(uK_2.i);
    }

    private Set<ResourceLocation> J() {
        UK_2 uK_2 = this;
        HashSet<ResourceLocation> hashSet = Sets.newHashSet();
        for (ResourceLocation a22 : uK_2.b.values()) {
            ResourceLocation resourceLocation;
            Object object;
            Iterator<Object> iterator;
            fKa a22 = uK_2.i.get(a22);
            if (a22 == null) continue;
            hashSet.add(new ResourceLocation(a22.J(SRa.l)));
            if (uK_2.J(a22)) {
                Iterator iterator2 = oka.I.iterator();
                while (iterator2.hasNext()) {
                    HashSet<ResourceLocation> hashSet2;
                    object = (String)iterator.next();
                    resourceLocation = new ResourceLocation(a22.J((String)object));
                    if (a22.J() == k && !WKa.M.equals(resourceLocation)) {
                        hashSet2 = hashSet;
                        KLa.f(resourceLocation.toString());
                    } else {
                        if (a22.J() == G && !WKa.M.equals(resourceLocation)) {
                            KLa.J(resourceLocation.toString());
                        }
                        hashSet2 = hashSet;
                    }
                    hashSet2.add(resourceLocation);
                    iterator2 = iterator;
                }
                continue;
            }
            if (uK_2.f(a22)) continue;
            iterator = a22.J().iterator();
            while (iterator.hasNext()) {
                object = (GJa)iterator.next();
                Object object2 = ((GJa)object).mapFaces.values().iterator();
                while (object2.hasNext()) {
                    Object object3 = (Rja)resourceLocation.next();
                    object3 = new ResourceLocation(a22.J(object3.texture));
                    object2 = resourceLocation;
                    hashSet.add((ResourceLocation)object3);
                }
            }
        }
        return hashSet;
    }

    public ResourceLocation J(String string) {
        Object b2 = string;
        UK_2 a2 = this;
        b2 = new ResourceLocation((String)b2);
        return new ResourceLocation(((ResourceLocation)b2).f(), new StringBuilder().insert(3 ^ 3, ZOa.R).append(((ResourceLocation)b2).J()).toString());
    }

    /*
     * WARNING - void declaration
     */
    private List<String> J(eAa eAa2) {
        void a2;
        UK_2 uK_2 = this;
        List<String> b2 = uK_2.d.get(a2);
        if (b2 == null) {
            b2 = Collections.singletonList(((ResourceLocation)eAa.C.f((Object)a2)).toString());
        }
        return b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void C() {
        UK_2 uK_2 = this;
        uK_2.J();
        Iterator iterator = eAa.C.iterator();
        block14: while (iterator.hasNext()) {
            eAa eAa2 = (eAa)iterator.next();
            Iterator<String> iterator2 = uK_2.J(eAa2).iterator();
            while (true) {
                Object a22;
                ResourceLocation resourceLocation;
                block17: {
                    Object object;
                    block18: {
                        if (!iterator2.hasNext()) continue block14;
                        String string = iterator2.next();
                        UK_2 uK_22 = uK_2;
                        resourceLocation = uK_22.J(string);
                        uK_22.b.put(string, resourceLocation);
                        if (uK_22.i.get(resourceLocation) != null) continue;
                        Block block = Block.f(eAa.J((eAa)eAa2));
                        if (block == null || block.J() == null || block.J().J() == null) break block17;
                        a22 = null;
                        CustomBlock customBlock = block.J();
                        Map<String, String> map = customBlock.f();
                        switch (mGa.I[customBlock.J().ordinal()]) {
                            case 1: 
                            case 2: {
                                object = a22 = new fKa(new ResourceLocation(Zra.o), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 3: {
                                object = a22 = new fKa(new ResourceLocation(psa.L), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 4: {
                                object = a22 = new fKa(new ResourceLocation(bqa.C), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(kPa.Ha, JPa.N, JPa.N), new Vector3f(JPa.N, rRa.T, lQa.Ca), new Vector3f(vTa.N, vTa.N, vTa.N)), new iJa(new Vector3f(JPa.N, opa.z, sSa.E), new Vector3f(JPa.N, rta.o, Mqa.N), new Vector3f(rRa.C, rRa.C, rRa.C)), iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 5: {
                                object = a22 = new fKa(new ResourceLocation(Qpa.A), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, new iJa(new Vector3f(JPa.N, Hra.Ga, JPa.N), new Vector3f(JPa.N, JPa.N, JPa.N), new Vector3f(pqa.r, pqa.r, pqa.r)), iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 6: {
                                a22 = new fKa(new ResourceLocation(bsa.R), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                ResourceLocation resourceLocation2 = new ResourceLocation(resourceLocation.f(), new StringBuilder().insert(2 & 5, resourceLocation.J()).append(dsa.fa).toString());
                                object = a22;
                                uK_2.i.put(resourceLocation2, new fKa(new ResourceLocation(KPa.J), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0)));
                                break block18;
                            }
                            case 7: {
                                object = a22 = new fKa(new ResourceLocation(Bsa.f), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 8: {
                                object = a22 = new fKa(new ResourceLocation(cPa.Y), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(FRa.Ga, pua.e, RQa.Ka), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, new iJa(new Vector3f(JPa.N, JPa.N, JPa.N), new Vector3f(Mqa.N, JPa.N, JPa.N), new Vector3f(pqa.r, pqa.r, pqa.r)), iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 9: {
                                object = a22 = new fKa(new ResourceLocation(ISa.t), map, vRa.d != 0, vRa.d != 0, new ItemCameraTransforms(new iJa(new Vector3f(JPa.N, JPa.N, Hra.Ga), new Vector3f(JPa.N, vqa.M, lQa.D), new Vector3f(MRa.K, MRa.K, MRa.K)), iJa.DEFAULT, iJa.DEFAULT, new iJa(new Vector3f(JPa.N, ISa.a, JPa.N), new Vector3f(JPa.N, JPa.N, JPa.N), new Vector3f(pqa.r, pqa.r, pqa.r)), iJa.DEFAULT, iJa.DEFAULT, uSa.E != 0));
                                break block18;
                            }
                            case 10: {
                                break;
                            }
                            case 11: 
                        }
                        object = a22;
                    }
                    if (object == null) continue;
                    uK_2.i.put(resourceLocation, (fKa)a22);
                    continue;
                }
                try {
                    UK_2 uK_23 = uK_2;
                    a22 = uK_23.J(resourceLocation);
                    uK_23.i.put(resourceLocation, (fKa)a22);
                }
                catch (Exception a22) {
                    j.warn(new StringBuilder().insert(5 >> 3, aPa.Q).append(resourceLocation).append(iSa.f).append(eAa.C.f((Object)eAa2)).append(XTa.Z).toString(), (Throwable)a22);
                    continue;
                }
                break;
            }
            break;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    private Set<ResourceLocation> J(fKa fKa2) {
        void a2;
        UK_2 uK_2 = this;
        HashSet<ResourceLocation> hashSet = Sets.newHashSet();
        Iterator<GJa> iterator = a2.J().iterator();
        while (iterator.hasNext()) {
            Iterator<Rja> iterator2 = iterator.next().mapFaces.values().iterator();
            while (iterator2.hasNext()) {
                Iterator<Rja> iterator3;
                Object b2 = iterator3.next();
                b2 = new ResourceLocation(a2.J(((Rja)b2).texture));
                iterator2 = iterator3;
                hashSet.add((ResourceLocation)b2);
            }
        }
        HashSet<ResourceLocation> hashSet2 = hashSet;
        hashSet2.add(new ResourceLocation(a2.J(SRa.l)));
        return hashSet2;
    }

    private List<ResourceLocation> J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        UK_2 a2 = this;
        ResourceLocation[] resourceLocationArray = new ResourceLocation[vRa.d];
        resourceLocationArray[uSa.E] = b2;
        ArrayList<ResourceLocation> arrayList = Lists.newArrayList(resourceLocationArray);
        UK_2 uK_2 = a2;
        while ((b2 = uK_2.l((ResourceLocation)b2)) != null) {
            uK_2 = a2;
            arrayList.add(uSa.E, (ResourceLocation)b2);
        }
        return arrayList;
    }

    static {
        ResourceLocation[] resourceLocationArray = new ResourceLocation[yOa.B];
        resourceLocationArray[uSa.E] = new ResourceLocation(Ura.g);
        resourceLocationArray[vRa.d] = new ResourceLocation(yta.J);
        resourceLocationArray[uqa.g] = new ResourceLocation(Ata.ga);
        resourceLocationArray[yRa.d] = new ResourceLocation(asa.Q);
        resourceLocationArray[AQa.P] = new ResourceLocation(yQa.M);
        resourceLocationArray[tTa.h] = new ResourceLocation(sSa.y);
        resourceLocationArray[uua.p] = new ResourceLocation(LPa.m);
        resourceLocationArray[XTa.W] = new ResourceLocation(Yqa.fa);
        resourceLocationArray[Yqa.i] = new ResourceLocation(kTa.O);
        resourceLocationArray[WOa.fa] = new ResourceLocation(vTa.C);
        resourceLocationArray[NTa.C] = new ResourceLocation(LPa.c);
        resourceLocationArray[pPa.f] = new ResourceLocation(csa.K);
        resourceLocationArray[lqa.s] = new ResourceLocation(RPa.Ka);
        resourceLocationArray[uua.s] = new ResourceLocation(iSa.U);
        resourceLocationArray[hpa.Z] = new ResourceLocation(gQa.J);
        resourceLocationArray[Ypa.A] = new ResourceLocation(Ora.L);
        resourceLocationArray[ERa.C] = new ResourceLocation(Wsa.k);
        resourceLocationArray[yta.Ka] = new ResourceLocation(qsa.H);
        B = Sets.newHashSet(resourceLocationArray);
        j = LogManager.getLogger();
        g = new ModelResourceLocation(STa.u, FRa.I);
        e = new ModelResourceLocation(rua.M, uqa.Ga);
        C = Maps.newHashMap();
        a = Joiner.on(Pqa.V);
        m = fKa.deserialize(SQa.v);
        k = fKa.deserialize(SQa.v);
        G = fKa.deserialize(SQa.v);
        I = fKa.deserialize(SQa.v);
        f = fKa.deserialize(Ssa.z);
        C.put(FRa.I, Lqa.M);
        UK_2.m.name = DPa.ca;
        UK_2.k.name = zua.Ga;
        UK_2.G.name = cTa.Z;
        UK_2.I.name = kqa.R;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fKa J(ResourceLocation var1_1) throws IOException {
        block10: {
            var2_3 = this;
            b = a.J();
            if (bqa.C.equals(b)) {
                return UK_2.m;
            }
            if (NPa.p.equals(b)) {
                return UK_2.k;
            }
            if (lPa.Q.equals(b)) {
                return UK_2.G;
            }
            if (Gta.u.equals(b)) {
                return UK_2.I;
            }
            if (rua.M.equals(b)) {
                return UK_2.f;
            }
            if (b.startsWith(eua.Ja)) {
                var4_4 = b.split(WSa.f, AQa.P);
                var3_6 = var4_4[uqa.g];
                var5_8 = CustomBlock.J(var4_4[yRa.d]);
                var6_10 = new ResourceLocation(APa.m, new StringBuilder().insert(2 & 5, dqa.P).append(var3_6).toString());
                return new fKa(var6_10, var5_8, (boolean)vRa.d, (boolean)vRa.d, ItemCameraTransforms.DEFAULT);
            }
            if (!b.startsWith(Yua.p)) break block10;
            var3_7 = b.substring(Yua.p.length());
            var5_9 = UK_2.C.get(var3_7);
            if (var5_9 == null) {
                throw new FileNotFoundException(a.toString());
            }
            var4_5 = new StringReader((String)var5_9);
            v0 /* !! */  = var4_5;
            ** GOTO lbl32
        }
        var3_7 = var2_3.c.J(var2_3.J((ResourceLocation)a));
        var4_5 = new InputStreamReader(var3_7.J(), Charsets.UTF_8);
        try {
            v0 /* !! */  = var4_5;
lbl32:
            // 2 sources

            var5_9 = fKa.deserialize(v0 /* !! */ );
            var5_9.name = a.toString();
            var3_7 = var5_9;
            return var3_7;
        }
        finally {
            var4_5.close();
        }
    }

    public void l() {
        UK_2 uK_2 = this;
        Object a2 = uK_2.f();
        a2.addAll(uK_2.J());
        a2.remove(WKa.M);
        a2 = new hha((UK)uK_2, (Set)a2);
        UK_2 uK_22 = uK_2;
        uK_2.F.J(uK_22.c, (NC)a2);
        uK_22.M.put(new ResourceLocation(JPa.p), uK_2.F.J());
    }

    /*
     * WARNING - void declaration
     */
    private RA J(fKa fKa2, AGa aGa2, boolean bl) {
        void c2;
        UK_2 uK_2 = this;
        KLa kLa2 = uK_2.M.get(new ResourceLocation(c2.J(SRa.l)));
        kLa2 = new WGa((fKa)c2).J(kLa2);
        for (GJa gJa2 : c2.J()) {
            for (DZ dZ2 : gJa2.mapFaces.keySet()) {
                void a2;
                void b2;
                UK_2 d2 = gJa2.mapFaces.get((Object)dZ2);
                KLa kLa3 = uK_2.M.get(new ResourceLocation(c2.J(((Rja)d2).texture)));
                if (((Rja)d2).cullFace == null) {
                    kLa2.J(uK_2.J(gJa2, (Rja)d2, kLa3, dZ2, (AGa)b2, (boolean)a2));
                    continue;
                }
                kLa2.J(b2.rotateFace(((Rja)d2).cullFace), uK_2.J(gJa2, (Rja)d2, kLa3, dZ2, (AGa)b2, (boolean)a2));
            }
        }
        return kLa2.J();
    }

    public void f() {
        Object object;
        UK_2 uK_2 = this;
        for (ModelResourceLocation a2 : uK_2.A.keySet()) {
            object = new Sha();
            int n2 = uSa.E;
            for (OLa oLa2 : uK_2.A.get(a2).J()) {
                fKa fKa2 = uK_2.i.get(oLa2.J());
                if (fKa2 != null && fKa2.C()) {
                    ++n2;
                    object.J(uK_2.J(fKa2, oLa2.J(), oLa2.J()), oLa2.J());
                    continue;
                }
                j.warn(new StringBuilder().insert(2 & 5, Fua.D).append(a2).toString());
            }
            if (n2 == 0) {
                j.warn(new StringBuilder().insert(3 ^ 3, wOa.ga).append(a2).toString());
                continue;
            }
            if (n2 == vRa.d) {
                uK_2.D.J(a2, object.J());
                continue;
            }
            uK_2.D.J(a2, object.J());
        }
        for (Map.Entry a2 : uK_2.b.entrySet()) {
            object = (ResourceLocation)a2.getValue();
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation((String)a2.getKey(), ZOa.F);
            fKa fKa3 = uK_2.i.get(object);
            if (fKa3 != null && fKa3.C()) {
                UK_2 uK_22 = uK_2;
                if (uK_2.f(fKa3)) {
                    uK_22.D.J(modelResourceLocation, new tha(fKa3.J()));
                    continue;
                }
                uK_22.D.J(modelResourceLocation, uK_2.J(fKa3, AGa.X0_Y0, uSa.E != 0));
                continue;
            }
            j.warn(new StringBuilder().insert(3 & 4, Fua.D).append(object).toString());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J() {
        block13: {
            block12: {
                block11: {
                    var2_3 = this;
                    v0 = new String[XTa.W];
                    v0[uSa.E] = fpa.F;
                    v0[vRa.d] = kra.Aa;
                    v0[uqa.g] = bsa.Da;
                    v0[yRa.d] = pqa.K;
                    v0[AQa.P] = pta.j;
                    v0[tTa.h] = BPa.F;
                    v0[uua.p] = wsa.h;
                    var2_3.d.put(eAa.J((Block)QFa.Gd), Lists.newArrayList(v0));
                    v1 = new String[yRa.d];
                    v1[uSa.E] = aSa.P;
                    v1[vRa.d] = XTa.R;
                    v1[uqa.g] = WRa.B;
                    var2_3.d.put(eAa.J((Block)QFa.Bc), Lists.newArrayList(v1));
                    v2 = new String[pPa.f];
                    v2[uSa.E] = Hta.R;
                    v2[vRa.d] = Ata.O;
                    v2[uqa.g] = JTa.E;
                    v2[yRa.d] = ISa.A;
                    v2[AQa.P] = xSa.Ha;
                    v2[tTa.h] = fpa.R;
                    v2[uua.p] = TOa.O;
                    v2[XTa.W] = XTa.Q;
                    v2[Yqa.i] = psa.H;
                    v2[WOa.fa] = Cra.p;
                    v2[NTa.C] = EQa.ga;
                    var2_3.d.put(eAa.J((Block)QFa.L), Lists.newArrayList(v2));
                    v3 = new String[uua.p];
                    v3[uSa.E] = mPa.g;
                    v3[vRa.d] = FTa.E;
                    v3[uqa.g] = wOa.Da;
                    v3[yRa.d] = Uta.m;
                    v3[AQa.P] = VPa.j;
                    v3[tTa.h] = SOa.R;
                    var2_3.d.put(eAa.J((Block)QFa.Y), Lists.newArrayList(v3));
                    v4 = new String[uqa.g];
                    v4[uSa.E] = dqa.la;
                    v4[vRa.d] = Qpa.V;
                    var2_3.d.put(eAa.J((Block)QFa.R), Lists.newArrayList(v4));
                    v5 = new String[Yqa.i];
                    v5[uSa.E] = MTa.p;
                    v5[vRa.d] = pqa.T;
                    v5[uqa.g] = Fpa.g;
                    v5[yRa.d] = vQa.X;
                    v5[AQa.P] = Ssa.Q;
                    v5[tTa.h] = Hra.E;
                    v5[uua.p] = nqa.u;
                    v5[XTa.W] = wOa.K;
                    var2_3.d.put(eAa.J((Block)QFa.b), Lists.newArrayList(v5));
                    v6 = new String[AQa.P];
                    v6[uSa.E] = ZOa.y;
                    v6[vRa.d] = zua.d;
                    v6[uqa.g] = mSa.Q;
                    v6[yRa.d] = GPa.u;
                    var2_3.d.put(eAa.J((Block)QFa.UA), Lists.newArrayList(v6));
                    v7 = new String[AQa.P];
                    v7[uSa.E] = Ora.j;
                    v7[vRa.d] = Bua.q;
                    v7[uqa.g] = Yua.Ja;
                    v7[yRa.d] = dpa.b;
                    var2_3.d.put(eAa.J((Block)QFa.vd), Lists.newArrayList(v7));
                    v8 = new String[uqa.g];
                    v8[uSa.E] = uqa.ga;
                    v8[vRa.d] = WOa.Ja;
                    var2_3.d.put(eAa.J((Block)QFa.ba), Lists.newArrayList(v8));
                    v9 = new String[yRa.d];
                    v9[uSa.E] = zTa.M;
                    v9[vRa.d] = cPa.N;
                    v9[uqa.g] = BRa.N;
                    var2_3.d.put(eAa.J((Block)QFa.qC), Lists.newArrayList(v9));
                    v10 = new String[yRa.d];
                    v10[uSa.E] = SRa.M;
                    v10[vRa.d] = yta.e;
                    v10[uqa.g] = Asa.Da;
                    var2_3.d.put(eAa.J((Block)QFa.ec), Lists.newArrayList(v10));
                    v11 = new String[Ypa.A];
                    v11[uSa.E] = BRa.o;
                    v11[vRa.d] = Zta.Ha;
                    v11[uqa.g] = kua.ga;
                    v11[yRa.d] = eua.o;
                    v11[AQa.P] = nqa.y;
                    v11[tTa.h] = lQa.M;
                    v11[uua.p] = SPa.Z;
                    v11[XTa.W] = pPa.n;
                    v11[Yqa.i] = yOa.R;
                    v11[WOa.fa] = cRa.T;
                    v11[NTa.C] = Lsa.W;
                    v11[pPa.f] = Qqa.W;
                    v11[lqa.s] = Ata.k;
                    v11[uua.s] = NOa.E;
                    v11[hpa.Z] = Iqa.Y;
                    var2_3.d.put(eAa.J((Block)QFa.y), Lists.newArrayList(v11));
                    v12 = new String[vRa.d];
                    v12[uSa.E] = BRa.o;
                    var2_3.d.put(eAa.J((Block)QFa.BB), Lists.newArrayList(v12));
                    v13 = new String[ERa.C];
                    v13[uSa.E] = DQa.B;
                    v13[vRa.d] = PTa.k;
                    v13[uqa.g] = Tpa.Da;
                    v13[yRa.d] = ISa.v;
                    v13[AQa.P] = EQa.V;
                    v13[tTa.h] = Usa.L;
                    v13[uua.p] = XOa.E;
                    v13[XTa.W] = fpa.p;
                    v13[Yqa.i] = pta.O;
                    v13[WOa.fa] = qsa.z;
                    v13[NTa.C] = Ppa.c;
                    v13[pPa.f] = vqa.Ga;
                    v13[lqa.s] = BRa.Ka;
                    v13[uua.s] = MQa.k;
                    v13[hpa.Z] = kra.Ma;
                    v13[Ypa.A] = ZOa.w;
                    var2_3.d.put(eAa.J((Block)QFa.cd), Lists.newArrayList(v13));
                    v14 = new String[vRa.d];
                    v14[uSa.E] = Era.M;
                    var2_3.d.put(eAa.J((Block)QFa.zc), Lists.newArrayList(v14));
                    v15 = new String[WOa.fa];
                    v15[uSa.E] = tTa.Ia;
                    v15[vRa.d] = opa.P;
                    v15[uqa.g] = Rua.D;
                    v15[yRa.d] = vpa.k;
                    v15[AQa.P] = FTa.fa;
                    v15[tTa.h] = Ora.x;
                    v15[uua.p] = pPa.B;
                    v15[XTa.W] = zta.ja;
                    v15[Yqa.i] = xTa.X;
                    var2_3.d.put(eAa.J((Block)QFa.l), Lists.newArrayList(v15));
                    v16 = new String[XTa.W];
                    v16[uSa.E] = Fsa.Q;
                    v16[vRa.d] = TQa.B;
                    v16[uqa.g] = kra.E;
                    v16[yRa.d] = Tpa.Q;
                    v16[AQa.P] = wPa.ca;
                    v16[tTa.h] = Nta.c;
                    v16[uua.p] = Era.Ha;
                    var2_3.d.put(eAa.J((Block)QFa.Ib), Lists.newArrayList(v16));
                    v17 = new String[vRa.d];
                    v17[uSa.E] = FTa.d;
                    var2_3.d.put(eAa.J((Block)QFa.F), Lists.newArrayList(v17));
                    v18 = new String[ERa.C];
                    v18[uSa.E] = ppa.X;
                    v18[vRa.d] = Era.J;
                    v18[uqa.g] = cTa.B;
                    v18[yRa.d] = zsa.A;
                    v18[AQa.P] = Sqa.a;
                    v18[tTa.h] = pqa.E;
                    v18[uua.p] = zta.fa;
                    v18[XTa.W] = opa.S;
                    v18[Yqa.i] = pPa.L;
                    v18[WOa.fa] = kta.n;
                    v18[NTa.C] = aqa.B;
                    v18[pPa.f] = Pua.w;
                    v18[lqa.s] = lqa.A;
                    v18[uua.s] = rpa.q;
                    v18[hpa.Z] = BRa.R;
                    v18[Ypa.A] = TPa.K;
                    var2_3.d.put(eAa.J((Block)QFa.VA), Lists.newArrayList(v18));
                    v19 = new String[uua.p];
                    v19[uSa.E] = JPa.k;
                    v19[vRa.d] = Tpa.d;
                    v19[uqa.g] = nOa.Ja;
                    v19[yRa.d] = dsa.y;
                    v19[AQa.P] = mra.Y;
                    v19[tTa.h] = Vua.O;
                    var2_3.d.put(eAa.J((Block)QFa.Od), Lists.newArrayList(v19));
                    v20 = new String[AQa.P];
                    v20[uSa.E] = csa.S;
                    v20[vRa.d] = Rua.B;
                    v20[uqa.g] = psa.Fa;
                    v20[yRa.d] = XSa.A;
                    var2_3.d.put(eAa.J((Block)QFa.v), Lists.newArrayList(v20));
                    v21 = new String[Yqa.i];
                    v21[uSa.E] = hpa.Da;
                    v21[vRa.d] = Ata.F;
                    v21[uqa.g] = Psa.u;
                    v21[yRa.d] = Psa.r;
                    v21[AQa.P] = vqa.H;
                    v21[tTa.h] = bua.e;
                    v21[uua.p] = EQa.P;
                    v21[XTa.W] = Bra.t;
                    var2_3.d.put(eAa.J((Block)QFa.eb), Lists.newArrayList(v21));
                    v22 = new String[uqa.g];
                    v22[uSa.E] = Qpa.H;
                    v22[vRa.d] = xOa.i;
                    var2_3.d.put(eAa.J((Block)QFa.hc), Lists.newArrayList(v22));
                    v23 = new String[yRa.d];
                    v23[uSa.E] = qsa.h;
                    v23[vRa.d] = opa.A;
                    v23[uqa.g] = tTa.C;
                    var2_3.d.put(eAa.J((Block)QFa.Sb), Lists.newArrayList(v23));
                    v24 = new String[yRa.d];
                    v24[uSa.E] = nOa.c;
                    v24[vRa.d] = isa.Z;
                    v24[uqa.g] = kqa.y;
                    var2_3.d.put(eAa.J((Block)QFa.YA), Lists.newArrayList(v24));
                    v25 = new String[ERa.C];
                    v25[uSa.E] = BRa.Ha;
                    v25[vRa.d] = NPa.W;
                    v25[uqa.g] = kpa.F;
                    v25[yRa.d] = aSa.ja;
                    v25[AQa.P] = Lsa.B;
                    v25[tTa.h] = WRa.Q;
                    v25[uua.p] = pPa.V;
                    v25[XTa.W] = yRa.ga;
                    v25[Yqa.i] = pua.r;
                    v25[WOa.fa] = KTa.n;
                    v25[NTa.C] = wsa.l;
                    v25[pPa.f] = ppa.M;
                    v25[lqa.s] = UOa.T;
                    v25[uua.s] = oQa.Ga;
                    v25[hpa.Z] = MQa.n;
                    v25[Ypa.A] = tSa.m;
                    var2_3.d.put(eAa.J((Block)QFa.za), Lists.newArrayList(v25));
                    v26 = new String[ERa.C];
                    v26[uSa.E] = SQa.f;
                    v26[vRa.d] = WPa.j;
                    v26[uqa.g] = oqa.C;
                    v26[yRa.d] = xTa.Aa;
                    v26[AQa.P] = Yua.E;
                    v26[tTa.h] = rSa.I;
                    v26[uua.p] = zOa.j;
                    v26[XTa.W] = zsa.g;
                    v26[Yqa.i] = Ssa.h;
                    v26[WOa.fa] = Ypa.o;
                    v26[NTa.C] = Tqa.U;
                    v26[pPa.f] = Rua.k;
                    v26[lqa.s] = aSa.m;
                    v26[uua.s] = Jsa.X;
                    v26[hpa.Z] = kTa.Ha;
                    v26[Ypa.A] = NOa.W;
                    var2_3.d.put(eAa.J((Block)QFa.KC), Lists.newArrayList(v26));
                    v27 = new String[yRa.d];
                    v27[uSa.E] = sSa.w;
                    v27[vRa.d] = WQa.L;
                    v27[uqa.g] = Iqa.d;
                    var2_3.d.put(eAa.J((Block)QFa.Z), Lists.newArrayList(v27));
                    v28 = new String[AQa.P];
                    v28[uSa.E] = uRa.ja;
                    v28[vRa.d] = vRa.W;
                    v28[uqa.g] = fTa.Ga;
                    v28[yRa.d] = cPa.c;
                    var2_3.d.put(eAa.J((Block)QFa.hf), Lists.newArrayList(v28));
                    v29 = new String[AQa.P];
                    v29[uSa.E] = Gua.G;
                    v29[vRa.d] = BRa.t;
                    v29[uqa.g] = iSa.ga;
                    v29[yRa.d] = Yua.L;
                    var2_3.d.put(eAa.J((Block)QFa.nE), Lists.newArrayList(v29));
                    v30 = new String[yRa.d];
                    v30[uSa.E] = Era.X;
                    v30[vRa.d] = XOa.W;
                    v30[uqa.g] = SOa.Y;
                    var2_3.d.put(eAa.J((Block)QFa.xd), Lists.newArrayList(v30));
                    v31 = new String[ERa.C];
                    v31[uSa.E] = Xsa.v;
                    v31[vRa.d] = xOa.v;
                    v31[uqa.g] = Zta.fa;
                    v31[yRa.d] = vPa.K;
                    v31[AQa.P] = CRa.K;
                    v31[tTa.h] = ypa.I;
                    v31[uua.p] = Hta.M;
                    v31[XTa.W] = ypa.V;
                    v31[Yqa.i] = Yra.y;
                    v31[WOa.fa] = aqa.Ga;
                    v31[NTa.C] = sra.o;
                    v31[pPa.f] = Fpa.Ja;
                    v31[lqa.s] = vPa.Ga;
                    v31[uua.s] = fta.s;
                    v31[hpa.Z] = EPa.J;
                    v31[Ypa.A] = bsa.Ga;
                    var2_3.d.put(eAa.J((Block)QFa.XE), Lists.newArrayList(v31));
                    v32 = new String[uua.p];
                    v32[uSa.E] = dpa.g;
                    v32[vRa.d] = bpa.j;
                    v32[uqa.g] = DPa.Q;
                    v32[yRa.d] = mPa.h;
                    v32[AQa.P] = GPa.Ka;
                    v32[tTa.h] = yra.i;
                    var2_3.d.put(eAa.J((Block)QFa.Ia), Lists.newArrayList(v32));
                    v33 = new String[AQa.P];
                    v33[uSa.E] = rSa.e;
                    v33[vRa.d] = NQa.Fa;
                    v33[uqa.g] = DQa.J;
                    v33[yRa.d] = asa.v;
                    var2_3.d.put((eAa)Gea.cd, Lists.newArrayList(v33));
                    v34 = new String[uqa.g];
                    v34[uSa.E] = Zqa.N;
                    v34[vRa.d] = Epa.S;
                    var2_3.d.put(Gea.qc, Lists.newArrayList(v34));
                    v35 = new String[uqa.g];
                    v35[uSa.E] = VQa.k;
                    v35[vRa.d] = Era.S;
                    var2_3.d.put((eAa)Gea.DA, Lists.newArrayList(v35));
                    v36 = new String[AQa.P];
                    v36[uSa.E] = opa.D;
                    v36[vRa.d] = Fpa.la;
                    v36[uqa.g] = bRa.o;
                    v36[yRa.d] = Bra.a;
                    var2_3.d.put(Gea.E, Lists.newArrayList(v36));
                    v37 = new String[uqa.g];
                    v37[uSa.E] = MRa.fa;
                    v37[vRa.d] = QTa.ia;
                    var2_3.d.put(Gea.Ka, Lists.newArrayList(v37));
                    v38 = new String[ERa.C];
                    v38[uSa.E] = Yqa.l;
                    v38[vRa.d] = Iqa.T;
                    v38[uqa.g] = DPa.t;
                    v38[yRa.d] = cQa.s;
                    v38[AQa.P] = Ysa.T;
                    v38[tTa.h] = ySa.w;
                    v38[uua.p] = sSa.Fa;
                    v38[XTa.W] = fqa.Y;
                    v38[Yqa.i] = Era.Z;
                    v38[WOa.fa] = Eqa.Ga;
                    v38[NTa.C] = cTa.m;
                    v38[pPa.f] = Ssa.X;
                    v38[lqa.s] = gQa.E;
                    v38[uua.s] = wsa.E;
                    v38[hpa.Z] = Xpa.l;
                    v38[Ypa.A] = zua.u;
                    var2_3.d.put(Gea.Q, Lists.newArrayList(v38));
                    v39 = new String[uqa.g];
                    v39[uSa.E] = zta.Y;
                    v39[vRa.d] = Ura.k;
                    var2_3.d.put(Gea.aa, Lists.newArrayList(v39));
                    v40 = new String[tTa.h];
                    v40[uSa.E] = Fsa.l;
                    v40[vRa.d] = vRa.v;
                    v40[uqa.g] = VQa.ca;
                    v40[yRa.d] = bsa.B;
                    v40[AQa.P] = PTa.I;
                    var2_3.d.put(Gea.GB, Lists.newArrayList(v40));
                    v41 = new String[vRa.d];
                    v41[uSa.E] = wra.q;
                    var2_3.d.put(eAa.J((Block)QFa.Ad), Lists.newArrayList(v41));
                    v42 = new String[vRa.d];
                    v42[uSa.E] = oQa.t;
                    var2_3.d.put(eAa.J((Block)QFa.U), Lists.newArrayList(v42));
                    v43 = new String[vRa.d];
                    v43[uSa.E] = jpa.S;
                    var2_3.d.put(Gea.YC, Lists.newArrayList(v43));
                    v44 = new String[ERa.C];
                    v44[uSa.E] = Ira.R;
                    v44[vRa.d] = IPa.ga;
                    v44[uqa.g] = eua.f;
                    v44[yRa.d] = zpa.z;
                    v44[AQa.P] = Bsa.s;
                    v44[tTa.h] = Epa.v;
                    v44[uua.p] = Zua.T;
                    v44[XTa.W] = eta.j;
                    v44[Yqa.i] = wra.J;
                    v44[WOa.fa] = xua.c;
                    v44[NTa.C] = uSa.F;
                    v44[pPa.f] = Ata.L;
                    v44[lqa.s] = qQa.W;
                    v44[uua.s] = dQa.J;
                    v44[hpa.Z] = gua.F;
                    v44[Ypa.A] = LRa.Y;
                    var2_3.d.put(eAa.J((Block)QFa.fB), Lists.newArrayList(v44));
                    v45 = new String[ERa.C];
                    v45[uSa.E] = Ira.k;
                    v45[vRa.d] = cQa.n;
                    v45[uqa.g] = tua.ba;
                    v45[yRa.d] = dpa.r;
                    v45[AQa.P] = PQa.b;
                    v45[tTa.h] = fta.q;
                    v45[uua.p] = qsa.T;
                    v45[XTa.W] = Lqa.Ga;
                    v45[Yqa.i] = lqa.i;
                    v45[WOa.fa] = wPa.a;
                    v45[NTa.C] = nua.s;
                    v45[pPa.f] = rpa.d;
                    v45[lqa.s] = Ypa.c;
                    v45[uua.s] = Zqa.Aa;
                    v45[hpa.Z] = Pqa.y;
                    v45[Ypa.A] = zsa.Ma;
                    var2_3.d.put(eAa.J((Block)QFa.ZA), Lists.newArrayList(v45));
                    v46 = new String[AQa.P];
                    v46[uSa.E] = uqa.ca;
                    v46[vRa.d] = JTa.J;
                    v46[uqa.g] = QSa.G;
                    v46[yRa.d] = ypa.J;
                    var2_3.d.put(eAa.J((Block)QFa.zd), Lists.newArrayList(v46));
                    v47 = new String[AQa.P];
                    v47[uSa.E] = xTa.q;
                    v47[vRa.d] = lQa.b;
                    v47[uqa.g] = SOa.i;
                    v47[yRa.d] = zta.z;
                    var2_3.d.put(eAa.J((Block)QFa.Hc), Lists.newArrayList(v47));
                    v48 = new String[yRa.d];
                    v48[uSa.E] = rpa.S;
                    v48[vRa.d] = kpa.x;
                    v48[uqa.g] = tTa.l;
                    var2_3.d.put(eAa.J((Block)QFa.Nf), Lists.newArrayList(v48));
                    var2_3.d.put(eAa.J((Block)QFa.Kg), Lists.newArrayList(BlockFroglight$EnumVariant.values()).stream().map(bha.J()).collect(Collectors.toList()));
                    var2_3.d.put(eAa.J((Block)QFa.tA), Lists.newArrayList(BlockCopper$EnumVariant.values()).stream().map(Gia.J()).collect(Collectors.toList()));
                    v49 = new String[AQa.P];
                    v49[uSa.E] = JQa.p;
                    v49[vRa.d] = Upa.g;
                    v49[uqa.g] = Zpa.M;
                    v49[yRa.d] = vqa.y;
                    var2_3.d.put(eAa.J((Block)QFa.iB), Lists.newArrayList(v49));
                    v50 = new String[AQa.P];
                    v50[uSa.E] = qsa.U;
                    v50[vRa.d] = rQa.N;
                    v50[uqa.g] = Nta.la;
                    v50[yRa.d] = Yua.la;
                    var2_3.d.put(eAa.J((Block)QFa.kB), Lists.newArrayList(v50));
                    v51 = new String[AQa.P];
                    v51[uSa.E] = qQa.q;
                    v51[vRa.d] = TPa.I;
                    v51[uqa.g] = uQa.V;
                    v51[yRa.d] = yOa.G;
                    var2_3.d.put(eAa.J((Block)QFa.lE), Lists.newArrayList(v51));
                    v52 = new String[AQa.P];
                    v52[uSa.E] = QTa.K;
                    v52[vRa.d] = wOa.Ka;
                    v52[uqa.g] = hTa.b;
                    v52[yRa.d] = PQa.Q;
                    var2_3.d.put(eAa.J((Block)QFa.lc), Lists.newArrayList(v52));
                    var4_4 = new HashSet<String>();
                    try lbl-1000:
                    // 2 sources

                    {
                        for (IResource var3_7 : var2_3.c.J(new ResourceLocation(YSa.Aa))) {
                            try {
                                var1_5 = IOUtils.readLines(var3_7.J()).iterator();
lbl588:
                                // 2 sources

                                while (true) {
                                    v53 = var1_5;
                                    while (v53.hasNext()) {
                                        var5_8 = var1_5.next();
                                        if ((var5_8 = var5_8.trim()).isEmpty()) {
                                            v53 = var1_5;
                                            continue;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    break block11;
                                    break;
                                }
                            }
                            catch (Throwable var1_6) {
                                IOUtils.closeQuietly(var3_7.J());
                                throw var1_6;
                            }
                        }
                        break block12;
                    }
                    catch (FileNotFoundException a) {
                        v54 = var2_3;
                        break block13;
                    }
                    catch (IOException a) {
                        UK_2.j.warn(oua.Ha, (Throwable)a);
                        break block12;
                    }
lbl-1000:
                    // 1 sources

                    {
                        var4_4.add(new StringBuilder().insert(2 & 5, hqa.Z).append(var5_8).toString());
                        ** continue;
                    }
                }
                IOUtils.closeQuietly(var3_7.J());
                ** GOTO lbl-1000
            }
            v54 = var2_3;
        }
        v54.d.put(Gea.s, new ArrayList<E>(var4_4));
    }
}

