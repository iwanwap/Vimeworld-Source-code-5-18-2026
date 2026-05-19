/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Mda
 *  Qsa
 *  RA
 *  UK
 *  VQa
 *  Yka
 *  ZOa
 *  bRa
 *  cJ
 *  eAa
 *  hqa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BLa_3 {
    public static final Set<KLa> k = Collections.newSetFromMap(new IdentityHashMap());
    private final Map<eAa, Fb> j;
    private final Fia J;
    private final Map<Integer, ModelResourceLocation> A;
    private final Map<Integer, RA> I;

    /*
     * Unable to fully structure code
     */
    public RA J(Mda var1_1) {
        var3_2 = this;
        v0 = a;
        var5_3 = v0.J();
        b = null;
        var4_4 = sDa.e((Mda)v0);
        if (var4_4 == null) ** GOTO lbl13
        var2_5 = new ModelResourceLocation(new StringBuilder().insert(3 ^ 3, hqa.Z).append(var4_4).toString(), ZOa.F);
        b = var3_2.J.J((ModelResourceLocation)var2_5);
        if (b == var3_2.J.J() && cJ.J()) {
            v1 = b = var3_2.J.J(UK.e);
        } else {
            var3_2.J((RA)b);
lbl13:
            // 2 sources

            v1 = b;
        }
        if (v1 == null) {
            v2 = var3_2;
            b = v2.J(var5_3, v2.J((Mda)a));
        }
        if (b == null && (var2_5 = var3_2.j.get(var5_3)) != null) {
            b = var3_2.J.J(var2_5.J((Mda)a));
        }
        if (b == null) {
            b = var3_2.J.J();
        }
        return b;
    }

    /*
     * WARNING - void declaration
     */
    private int J(eAa eAa2, int n2) {
        void b2;
        int c2 = n2;
        BLa_3 a2 = this;
        return eAa.J((eAa)b2) << ERa.C | c2;
    }

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation J(Mda mda2, Sx sx2) {
        String string;
        void a2;
        String string2;
        Object c2 = mda2;
        BLa_3 b2 = this;
        BLa_3 bLa_3 = c2;
        eAa eAa2 = bLa_3.J();
        String string3 = sDa.e((Mda)bLa_3);
        ModelResourceLocation modelResourceLocation = null;
        String string4 = string2 = string3 == null ? APa.m : wua.A;
        if (eAa2 == Gea.DA && a2.E != null) {
            modelResourceLocation = new ModelResourceLocation(new ResourceLocation(string2, (string3 == null ? VQa.k : string3) + fta.G), ZOa.F);
            string = string3;
        } else {
            if (eAa2 == Gea.cd && a2.l() != null) {
                int n2 = c2.C() - a2.j();
                Object object = c2 = string3 == null ? rSa.e : string3;
                if (n2 >= yOa.B) {
                    c2 = new StringBuilder().insert(3 ^ 3, (String)c2).append(bRa.y).toString();
                } else if (n2 > uua.s) {
                    c2 = new StringBuilder().insert(5 >> 3, (String)c2).append(Qsa.la).toString();
                } else if (n2 > 0) {
                    c2 = new StringBuilder().insert(2 & 5, (String)c2).append(Nta.Q).toString();
                }
                modelResourceLocation = new ModelResourceLocation(new ResourceLocation(string2, (String)c2), ZOa.F);
            }
            string = string3;
        }
        if (string != null && modelResourceLocation != null) {
            RA rA2 = b2.J.J(modelResourceLocation);
            if (rA2 == b2.J.J() && cJ.J()) {
                modelResourceLocation = UK.e;
                return modelResourceLocation;
            }
            b2.J(rA2);
        }
        return modelResourceLocation;
    }

    public Fia J() {
        BLa_3 a2;
        return a2.J;
    }

    public int J(Mda mda2) {
        BLa_3 b2 = mda2;
        BLa_3 a2 = this;
        if (b2.d()) {
            return uSa.E;
        }
        return b2.J();
    }

    /*
     * WARNING - void declaration
     */
    public KLa J(eAa eAa2, int n2) {
        void b2;
        int c2 = n2;
        BLa_3 a2 = this;
        return a2.J(new Mda((eAa)b2, vRa.d, c2)).J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, Fb fb2) {
        void b2;
        Fb c2 = fb2;
        BLa_3 a2 = this;
        a2.j.put((eAa)b2, c2);
    }

    public void J() {
        Iterator<Map.Entry<Integer, ModelResourceLocation>> iterator;
        BLa_3 bLa_3;
        BLa_3 bLa_32 = bLa_3 = this;
        bLa_32.I.clear();
        Iterator<Map.Entry<Integer, ModelResourceLocation>> iterator2 = iterator = bLa_32.A.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, ModelResourceLocation> a2 = iterator.next();
            bLa_3.I.put((Integer)a2.getKey(), bLa_3.J.J((ModelResourceLocation)a2.getValue()));
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(RA rA2) {
        void a2;
        BLa_3 bLa_3 = this;
        if (a2 != null) {
            int n2;
            DZ[] dZArray;
            DZ[] dZArray2 = dZArray = a2.J().iterator();
            while (dZArray2.hasNext()) {
                Yka yka = (Yka)dZArray.next();
                k.add(yka.J());
                dZArray2 = dZArray;
            }
            dZArray = DZ.VALUES;
            int n3 = DZ.VALUES.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                Object b2 = dZArray[n2];
                b2 = a2.J((DZ)((Object)b2)).iterator();
                Object object = b2;
                while (object.hasNext()) {
                    Yka yka = (Yka)b2.next();
                    k.add(yka.J());
                    object = b2;
                }
                n4 = ++n2;
            }
        }
    }

    public KLa J(eAa eAa2) {
        BLa_3 b2 = eAa2;
        BLa_3 a2 = this;
        return a2.J((eAa)b2, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, int n2, ModelResourceLocation modelResourceLocation) {
        void b2;
        void c2;
        ModelResourceLocation d2 = modelResourceLocation;
        BLa_3 a2 = this;
        a2.A.put(a2.J((eAa)c2, (int)b2), d2);
        a2.I.put(a2.J((eAa)c2, (int)b2), a2.J.J(d2));
    }

    public BLa_3(Fia fia2) {
        BLa_3 a2;
        Fia b2 = fia2;
        BLa_3 bLa_3 = a2 = this;
        a2.A = Maps.newHashMap();
        bLa_3.I = Maps.newHashMap();
        bLa_3.j = Maps.newHashMap();
        bLa_3.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public RA J(eAa eAa2, int n2) {
        void b2;
        int c2 = n2;
        BLa_3 a2 = this;
        return a2.I.get(a2.J((eAa)b2, c2));
    }
}

