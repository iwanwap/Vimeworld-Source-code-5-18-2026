/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  FPa
 *  JQa
 *  JSa
 *  Kga
 *  RA
 *  SQa
 *  YSa
 *  Yka
 *  iPa
 *  jRa
 *  vPa
 *  vRa
 *  yra
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class te_1 {
    public static List J(List list) {
        Object a2;
        List list2 = list;
        ArrayList<Yka> arrayList = new ArrayList<Yka>();
        Object object = a2 = list2.iterator();
        while (object.hasNext()) {
            Yka yka = te_1.J((Yka)a2.next());
            object = a2;
            arrayList.add(yka);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[] nArray, String string) {
        int n2;
        void a2;
        int[] nArray2 = nArray;
        int n3 = nArray2.length / AQa.P;
        Config.f(new StringBuilder().insert(3 >> 2, (String)a2).append(JQa.Ga).append(nArray2.length).append(BRa.l).append(n3).toString());
        int n4 = n2 = uSa.E;
        while (n4 < AQa.P) {
            int b22 = n2 * n3;
            float f2 = Float.intBitsToFloat(nArray2[b22 + uSa.E]);
            float f3 = Float.intBitsToFloat(nArray2[b22 + vRa.d]);
            float f4 = Float.intBitsToFloat(nArray2[b22 + uqa.g]);
            int n5 = nArray2[b22 + yRa.d];
            float f5 = Float.intBitsToFloat(nArray2[b22 + AQa.P]);
            float b22 = Float.intBitsToFloat(nArray2[b22 + tTa.h]);
            StringBuilder stringBuilder = new StringBuilder().insert(2 & 5, (String)a2).append(n2).append(gQa.e).append(f2).append(yra.t).append(f3).append(yra.t).append(f4).append(zua.A).append(n5).append(Yqa.s).append(f5).append(yra.t);
            Config.f(stringBuilder.append(b22).toString());
            n4 = ++n2;
        }
    }

    public static void J(RA rA) {
        RA rA2 = rA;
        if (rA2 != null) {
            int a22;
            Config.f(new StringBuilder().insert(3 >> 2, JSa.f).append(rA2).append(YSa.f).append(rA2.J()).append(iPa.Q).append(rA2.l()).append(SQa.j).append(rA2.f()).append(FPa.Y).append(rA2.J()).toString());
            DZ[] dZArray = DZ.values();
            int n2 = a22 = uSa.E;
            while (n2 < dZArray.length) {
                DZ dZ2 = dZArray[a22];
                List list = rA2.J(dZ2);
                te_1.J(dZ2.getName(), list, Hta.V);
                n2 = ++a22;
            }
            List a22 = rA2.J();
            te_1.J(MTa.s, a22, Hta.V);
        }
    }

    public static RA J(RA rA) {
        int a22;
        RA rA2 = rA;
        List list = te_1.J(rA2.J());
        DZ[] dZArray = DZ.values();
        ArrayList<DZ> arrayList = new ArrayList<DZ>();
        int n2 = a22 = uSa.E;
        while (n2 < dZArray.length) {
            Object object = dZArray[a22];
            object = te_1.J(rA2.J(object));
            arrayList.add((DZ)((Object)object));
            n2 = ++a22;
        }
        Kga a22 = new Kga(list, arrayList, rA2.J(), rA2.l(), rA2.J(), rA2.J());
        return a22;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, Yka yka, String string2) {
        void a2;
        String c2 = yka;
        String b2 = string;
        Config.f(new StringBuilder().insert(3 & 4, (String)a2).append(KPa.Z).append(c2.getClass().getName()).append(jRa.M).append(b2).append(ATa.D).append((Object)c2.J()).append(vPa.X).append(c2.J()).append(EPa.a).append(c2.J()).toString());
        te_1.J(c2.J(), new StringBuilder().insert(5 >> 3, Hta.V).append((String)a2).toString());
    }

    public te_1() {
        te_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String string, List list, String string2) {
        Iterator c2 = list;
        String b2 = string;
        Iterator iterator = c2 = c2.iterator();
        while (iterator.hasNext()) {
            void a2;
            Object e2 = c2.next();
            te_1.J(b2, (Yka)e2, (String)a2);
            iterator = c2;
        }
    }

    public static Yka J(Yka a2) {
        return new Yka((int[])a2.J().clone(), a2.J(), a2.J(), a2.J());
    }
}

