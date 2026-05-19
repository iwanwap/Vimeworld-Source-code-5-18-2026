/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Epa
 *  RA
 *  Yka
 *  ZOa
 *  fTa
 *  jpa
 *  jsa
 *  nQa
 *  qta
 *  te
 *  uOa
 *  vQa
 *  vRa
 *  wOa
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class EE_3 {
    private static List d;
    private static List a;
    private static List b;
    private static RA l;
    private static RA e;
    private static RA G;
    private static List D;
    private static RA f;
    private static RA F;
    private static RA g;
    private static RA L;
    private static RA E;
    private static RA m;
    private static RA C;
    private static List i;
    private static RA M;
    private static RA k;
    private static List j;
    private static RA J;
    private static RA A;
    private static List I;

    private static RA f(RA rA2) {
        int n2;
        Object object;
        int n3;
        RA rA3 = rA2;
        if (rA3 == null) {
            return null;
        }
        if (rA3.J().size() > 0) {
            Config.J(new StringBuilder().insert(3 >> 2, Ata.Q).append(rA3.J().size()).append(Hta.N).append(rA3).toString());
            return rA3;
        }
        DZ[] dZArray = DZ.VALUES;
        int n4 = n3 = uSa.E;
        while (n4 < dZArray.length) {
            object = dZArray[n3];
            List list = rA3.J((DZ)((Object)object));
            if (list.size() != vRa.d) {
                Config.J(new StringBuilder().insert(5 >> 3, kTa.s).append(object).append(Epa.w).append(list.size()).append(Hta.N).append(rA3).toString());
                return rA3;
            }
            n4 = ++n3;
        }
        RA rA4 = te.J((RA)rA3);
        object = new List[dZArray.length];
        int n5 = n2 = uSa.E;
        while (n5 < dZArray.length) {
            object = dZArray[n2];
            object = rA4.J((DZ)((Object)object));
            Yka yka2 = (Yka)object.get(uSa.E);
            yka2 = new Yka((int[])yka2.J().clone(), yka2.J(), yka2.J(), yka2.J());
            int[] nArray = yka2.J();
            int[] nArray2 = (int[])nArray.clone();
            int a2 = nArray.length / AQa.P;
            int[] nArray3 = nArray;
            int[] nArray4 = nArray;
            System.arraycopy(nArray3, uSa.E * a2, nArray2, yRa.d * a2, a2);
            System.arraycopy(nArray4, vRa.d * a2, nArray2, uqa.g * a2, a2);
            System.arraycopy(nArray3, uqa.g * a2, nArray2, vRa.d * a2, a2);
            System.arraycopy(nArray4, yRa.d * a2, nArray2, uSa.E * a2, a2);
            System.arraycopy(nArray2, uSa.E, nArray, uSa.E, nArray2.length);
            object.add(yka2);
            n5 = ++n2;
        }
        return rA4;
    }

    /*
     * WARNING - void declaration
     */
    public static RA J(String string, List list) {
        String string2 = string;
        Object object = Config.J();
        if (object == null) {
            return null;
        }
        if (Config.J(new ResourceLocation(new StringBuilder().insert(3 >> 2, IPa.q).append(string2).append(sra.S).toString())) != Config.J()) {
            return null;
        }
        if (Config.J(new ResourceLocation(new StringBuilder().insert(5 >> 3, uOa.r).append(string2).append(sra.S).toString())) != Config.J()) {
            return null;
        }
        Object b2 = new ModelResourceLocation(new StringBuilder().insert(3 ^ 3, string2).append(qta.k).toString(), AQa.t);
        if ((b2 = ((Fia)object).J((ModelResourceLocation)b2)) != null && b2 != ((Fia)object).J()) {
            void a2;
            Iterator iterator;
            object = b2.J();
            if (object.size() == 0) {
                return b2;
            }
            if (object.size() != uua.p) {
                return null;
            }
            Iterator iterator2 = iterator = object.iterator();
            while (iterator2.hasNext()) {
                Object e2 = iterator.next();
                List list2 = b2.J(((Yka)e2).J());
                if (list2.size() > 0) {
                    return null;
                }
                list2.add(e2);
                iterator2 = iterator;
            }
            object.clear();
            a2.add(string2 + qta.k);
            return b2;
        }
        return null;
    }

    static {
        L = null;
        k = null;
        g = null;
        E = null;
        m = null;
        l = null;
        C = null;
        D = null;
        b = null;
        a = null;
        j = null;
        I = null;
        d = null;
        i = null;
        f = null;
        J = null;
        A = null;
        M = null;
        G = null;
        e = null;
        F = null;
    }

    private static List J(RA a2) {
        if (a2 == null) {
            return null;
        }
        return a2.J();
    }

    public static void J() {
        ArrayList arrayList = new ArrayList();
        L = EE_3.J(LRa.x, arrayList);
        k = EE_3.J(vQa.O, arrayList);
        g = EE_3.J(wOa.S, arrayList);
        E = EE_3.J(nQa.U, arrayList);
        m = EE_3.J(jpa.j, arrayList);
        l = EE_3.J(fTa.N, arrayList);
        C = EE_3.J(ZOa.C, arrayList);
        D = EE_3.J(L);
        b = EE_3.J(k);
        a = EE_3.J(g);
        j = EE_3.J(E);
        I = EE_3.J(m);
        d = EE_3.J(l);
        i = EE_3.J(C);
        f = EE_3.f(L);
        J = EE_3.f(k);
        A = EE_3.f(g);
        M = EE_3.f(E);
        G = EE_3.f(m);
        e = EE_3.f(l);
        F = EE_3.f(C);
        if (arrayList.size() > 0) {
            Config.f(new StringBuilder().insert(2 & 5, jsa.A).append(Config.J(arrayList.toArray())).toString());
        }
    }

    public EE_3() {
        EE_3 a2;
    }

    public static RA J(RA rA2) {
        RA rA3 = rA2;
        if (!Config.E()) {
            return rA3;
        }
        Object a2 = rA3.J();
        if (a2 == D) {
            return f;
        }
        if (a2 == b) {
            return J;
        }
        if (a2 == a) {
            return A;
        }
        if (a2 == j) {
            return M;
        }
        if (a2 == I) {
            return G;
        }
        if (a2 == d) {
            return e;
        }
        return rA3;
    }
}

