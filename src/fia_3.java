/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  CZ
 *  ERa
 *  FGa
 *  Gg
 *  Hha
 *  Mha
 *  NOa
 *  OCa
 *  Oz
 *  PIa
 *  Via
 *  WQa
 *  XTa
 *  YGa
 *  Zpa
 *  aPa
 *  bFa
 *  cia
 *  fHa
 *  fsa
 *  gGa
 *  kPa
 *  kqa
 *  ld
 *  mha
 *  pY
 *  pqa
 *  psa
 *  pua
 *  sha
 *  tga
 *  uOa
 *  vL
 *  vRa
 *  xy
 *  ysa
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fia_3 {
    private static final Pattern j = Pattern.compile(STa.B);
    private static final Pattern J;
    private static final Set<String> A;
    private static final Pattern I;

    public static boolean f(String string) {
        int n2;
        String string2 = string;
        Object a2 = j.matcher(string2);
        if (!((Matcher)a2).matches()) {
            return uSa.E != 0;
        }
        Map<String, String> map = a2;
        a2 = fia_3.J(((Matcher)((Object)map)).group(uqa.g));
        String string3 = ((Matcher)((Object)map)).group(vRa.d);
        int n3 = n2 = !ysa.M.equals(string3) && !dsa.w.equals(string3) ? vRa.d : uSa.E;
        if (fia_3.J(a2, eua.ca, n2) != vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static XF J(Map<String, String> map, XF xF2) {
        Object b2 = xF2;
        Map<String, String> a2 = map;
        return new XF(fia_3.J(a2, rRa.X, b2.getX()), fia_3.J(a2, uOa.Ja, b2.getY()), fia_3.J(a2, oua.v, b2.getZ()));
    }

    /*
     * WARNING - void declaration
     */
    private static <T extends vL> List<T> J(Map<String, String> map, Class<? extends T> clazz, List<Predicate<vL>> list, String string, Gg gg2, XF xF2) {
        void e2;
        void b2;
        void a2;
        void c2;
        Map<String, String> map2 = map;
        ArrayList f2 = Lists.newArrayList();
        String string2 = fia_3.J(map2, Zpa.x);
        string2 = string2 != null && string2.startsWith(dqa.O) ? string2.substring(vRa.d) : string2;
        int n2 = !c2.equals(dsa.w) ? vRa.d : uSa.E;
        int n3 = c2.equals(pqa.v) && string2 != null ? vRa.d : uSa.E;
        Map<String, String> map3 = map2;
        int d22 = fia_3.J(map3, WQa.ja, uSa.E);
        int n4 = fia_3.J(map3, kqa.A, uSa.E);
        int n5 = fia_3.J(map3, MRa.A, uSa.E);
        int n6 = fia_3.J(map3, pqa.v, pua.o);
        Predicate predicate = Predicates.and(d22);
        Predicate<vL> predicate2 = Predicates.and(Kaa.j, predicate);
        if (a2 != null) {
            int n7;
            void v1 = b2;
            int n8 = v1.w.size();
            int n9 = n8 = n8 < (n7 = v1.Q.size()) / ERa.C ? vRa.d : uSa.E;
            if (!(map2.containsKey(WQa.ja) || map2.containsKey(kqa.A) || map2.containsKey(MRa.A))) {
                if (n6 >= 0) {
                    xy xy2 = new xy((double)(a2.getX() - n6), (double)(a2.getY() - n6), (double)(a2.getZ() - n6), (double)(a2.getX() + n6 + vRa.d), (double)(a2.getY() + n6 + vRa.d), (double)(a2.getZ() + n6 + vRa.d));
                    if (n2 != 0 && n8 != 0 && n3 == 0) {
                        f2.addAll(b2.f((Class)e2, predicate2));
                    } else {
                        f2.addAll(b2.J((Class)e2, xy2, predicate2));
                    }
                } else if (c2.equals(ysa.M)) {
                    f2.addAll(b2.f((Class)e2, predicate));
                } else if (!(c2.equals(NOa.m) || c2.equals(pqa.v) && n3 == 0)) {
                    f2.addAll(b2.J((Class)e2, predicate2));
                } else {
                    f2.addAll(b2.f((Class)e2, predicate2));
                }
            } else {
                xy xy3 = fia_3.J((XF)a2, d22, n4, n5);
                if (n2 != 0 && n8 != 0 && n3 == 0) {
                    cia d22 = new cia(xy3);
                    f2.addAll(b2.f((Class)e2, Predicates.and(predicate2, d22)));
                } else {
                    f2.addAll(b2.J((Class)e2, xy3, predicate2));
                }
            }
        } else {
            if (c2.equals(ysa.M)) {
                Object object = f2;
                object.addAll(b2.f((Class)e2, predicate));
                return object;
            }
            if (!(c2.equals(NOa.m) || c2.equals(pqa.v) && n3 == 0)) {
                Object object = f2;
                object.addAll(b2.J((Class)e2, predicate2));
                return object;
            }
            f2.addAll(b2.f((Class)e2, predicate2));
        }
        return f2;
    }

    private static List<Predicate<vL>> J(Map<String, String> map, String string) {
        int n2;
        Object a2;
        int n3;
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        Object b2 = fia_3.J(map2, Zpa.x);
        int n4 = n3 = b2 != null && ((String)b2).startsWith(dqa.O) ? vRa.d : uSa.E;
        if (n3 != 0) {
            b2 = ((String)b2).substring(vRa.d);
        }
        int n5 = !((String)a2).equals(dsa.w) ? vRa.d : uSa.E;
        int n6 = n2 = ((String)a2).equals(pqa.v) && b2 != null ? vRa.d : uSa.E;
        if (!(b2 != null && ((String)a2).equals(dsa.w) || n2 != 0)) {
            if (n5 != 0) {
                ArrayList<Predicate<vL>> arrayList2 = arrayList;
                arrayList2.add(new GHa());
                return arrayList2;
            }
        } else {
            a2 = b2;
            arrayList.add((Predicate<vL>)new Hha((String)a2, n3 != 0));
        }
        return arrayList;
    }

    public static Map<String, Integer> J(Map<String, String> map) {
        Map<String, String> map2 = map;
        HashMap<String, Integer> hashMap = Maps.newHashMap();
        for (String a2 : map2.keySet()) {
            if (!a2.startsWith(psa.W) || a2.length() <= psa.W.length()) continue;
            hashMap.put(a2.substring(psa.W.length()), Oz.J((String)map2.get(a2), (int)vRa.d));
        }
        return hashMap;
    }

    private static List<Predicate<vL>> e(Map<String, String> map) {
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        Map<String, String> map3 = map2;
        int n2 = fia_3.J(map3, gQa.G, pua.o);
        int a2 = fia_3.J(map3, iSa.W, pua.o);
        if (n2 > pua.o || a2 > pua.o) {
            arrayList.add((Predicate<vL>)new mha(n2, a2));
        }
        return arrayList;
    }

    static {
        I = Pattern.compile(nqa.n);
        J = Pattern.compile(Hta.t);
        String[] stringArray = new String[Yqa.i];
        stringArray[uSa.E] = rRa.X;
        stringArray[vRa.d] = uOa.Ja;
        stringArray[uqa.g] = oua.v;
        stringArray[yRa.d] = WQa.ja;
        stringArray[AQa.P] = kqa.A;
        stringArray[tTa.h] = MRa.A;
        stringArray[uua.p] = rRa.o;
        stringArray[XTa.W] = pqa.v;
        A = Sets.newHashSet(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private static <T extends vL> List<T> J(List<T> object, Map<String, String> map, u u2, Class<? extends T> clazz, String string, XF xF2) {
        void c2;
        vL vL2;
        vL d2;
        int e22;
        List<T> f2;
        List<T> b2;
        block6: {
            block5: {
                void a2;
                block4: {
                    void e22;
                    List<T> list = object;
                    object = string;
                    b2 = list;
                    e22 = fia_3.J((Map<String, String>)e22, eua.ca, !((String)((Object)f2)).equals(ysa.M) && !((String)((Object)f2)).equals(dsa.w) ? vRa.d : uSa.E);
                    if (((String)((Object)f2)).equals(NOa.m) || ((String)((Object)f2)).equals(ysa.M) || ((String)((Object)f2)).equals(dsa.w)) break block4;
                    if (!((String)((Object)f2)).equals(pqa.v)) break block5;
                    vL2 = d2;
                    Collections.shuffle(b2);
                    break block6;
                }
                if (a2 != null) {
                    Collections.sort(b2, new gGa((XF)a2));
                }
            }
            vL2 = d2;
        }
        d2 = vL2.J();
        if (d2 != null && c2.isAssignableFrom(d2.getClass()) && e22 == vRa.d && b2.contains(d2) && !pqa.v.equals(f2)) {
            vL[] vLArray = new vL[vRa.d];
            vLArray[uSa.E] = d2;
            b2 = Lists.newArrayList(vLArray);
        }
        if (e22 != 0) {
            if (e22 < 0) {
                Collections.reverse(b2);
            }
            b2 = b2.subList(uSa.E, Math.min(Math.abs(e22), b2.size()));
        }
        return b2;
    }

    private static List<Predicate<vL>> d(Map<String, String> map) {
        int n2;
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        if (map2.containsKey(Npa.i) || map2.containsKey(Lsa.ha)) {
            Map<String, String> map3 = map2;
            n2 = fia_3.J(fia_3.J(map3, Npa.i, uSa.E));
            int a2 = fia_3.J(fia_3.J(map3, Lsa.ha, sSa.e));
            arrayList.add((Predicate<vL>)new YGa(n2, a2));
        }
        if (map2.containsKey(fsa.Q) || map2.containsKey(kPa.Ka)) {
            Map<String, String> map4 = map2;
            n2 = fia_3.J(fia_3.J(map4, fsa.Q, uSa.E));
            int a2 = fia_3.J(fia_3.J(map4, kPa.Ka, sSa.e));
            arrayList.add((Predicate<vL>)new fHa(n2, a2));
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(Map<String, String> map, String string, int n2) {
        void b2;
        int c2 = n2;
        Map<String, String> a2 = map;
        if (a2.containsKey(b2)) {
            return Oz.J((String)a2.get(b2), (int)c2);
        }
        return c2;
    }

    private static <T extends vL> boolean J(u u2, Map<String, String> map) {
        Object b2 = map;
        u a2 = u2;
        Object object = b2 = (b2 = fia_3.J((Map<String, String>)b2, Zpa.x)) != null && ((String)b2).startsWith(dqa.O) ? ((String)b2).substring(vRa.d) : b2;
        if (b2 != null && !PIa.J((String)b2)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            b2 = new CZ(Bsa.b, objectArray);
            b2.J().J(pY.RED);
            a2.J((ld)b2);
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private static boolean J(Map<String, String> map) {
        Map<String, String> map2 = map;
        for (String string : A) {
            if (!map2.containsKey(string)) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static List<Predicate<vL>> J(Map<String, String> map, XF xF2) {
        void a2;
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        Map<String, String> map3 = map2;
        int b2 = fia_3.J(map3, rRa.o, pua.o);
        int n2 = fia_3.J(map3, pqa.v, pua.o);
        if (a2 != null && (b2 >= 0 || n2 >= 0)) {
            int n3 = b2;
            int n4 = n3 * n3;
            int n5 = n2;
            int n6 = n5 * n5;
            arrayList.add((Predicate<vL>)new sha((XF)a2, b2, n4, n2, n6));
        }
        return arrayList;
    }

    private static List<Predicate<vL>> C(Map<String, String> map) {
        Map<String, String> map2 = map;
        ArrayList a2 = Lists.newArrayList();
        int n2 = fia_3.J(map2, gsa.R, Daa.NOT_SET.getID());
        if (n2 != Daa.NOT_SET.getID()) {
            a2.add(new cHa(n2));
        }
        return a2;
    }

    private static xy J(XF xF2, int n2, int n3, int n4) {
        int b2;
        int c2;
        int d2 = n4;
        XF a2 = xF2;
        int n5 = c2 < 0 ? vRa.d : uSa.E;
        int n6 = b2 < 0 ? vRa.d : uSa.E;
        int n7 = d2 < 0 ? vRa.d : uSa.E;
        int n8 = a2.getX() + (n5 != 0 ? c2 : uSa.E);
        int n9 = a2.getY() + (n6 != 0 ? b2 : uSa.E);
        int n10 = a2.getZ() + (n7 != 0 ? d2 : uSa.E);
        c2 = a2.getX() + (n5 != 0 ? uSa.E : c2) + vRa.d;
        b2 = a2.getY() + (n6 != 0 ? uSa.E : b2) + vRa.d;
        d2 = a2.getZ() + (n7 != 0 ? uSa.E : d2) + vRa.d;
        return new xy((double)n8, (double)n9, (double)n10, (double)c2, (double)b2, (double)d2);
    }

    public static bFa J(u u2, String string) {
        String b2 = string;
        u a2 = u2;
        return fia_3.J(a2, b2, bFa.class);
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends vL> T J(u u2, String string, Class<? extends T> clazz) {
        void a2;
        List<T> c2 = string;
        u b2 = u2;
        if ((c2 = fia_3.J(b2, (String)((Object)c2), a2)).size() == vRa.d) {
            return (T)((vL)c2.get(uSa.E));
        }
        return null;
    }

    private static List<Predicate<vL>> l(Map<String, String> map) {
        int n2;
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        Object a2 = fia_3.J(map2, yRa.Ka);
        int n3 = n2 = a2 != null && ((String)a2).startsWith(dqa.O) ? vRa.d : uSa.E;
        if (n2 != 0) {
            a2 = ((String)a2).substring(vRa.d);
        }
        if (a2 != null) {
            arrayList.add((Predicate<vL>)new tga((String)a2, n2 != 0));
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private static List<Gg> J(u u2, Map<String, String> map) {
        void a2;
        u u3 = u2;
        ArrayList b2 = Lists.newArrayList();
        if (fia_3.J((Map<String, String>)a2)) {
            Object object = b2;
            object.add(u3.J());
            return object;
        }
        Object object = b2;
        Collections.addAll(object, OCa.J().G);
        return object;
    }

    private static Map<String, String> J(String string) {
        Object a2;
        String string2 = string;
        HashMap<String, String> hashMap = Maps.newHashMap();
        if (string2 == null) {
            return hashMap;
        }
        int n2 = uSa.E;
        int n3 = pua.o;
        Object object = a2 = I.matcher(string2);
        while (((Matcher)object).find()) {
            String string3;
            String string4 = null;
            switch (n2++) {
                case 0: {
                    while (false) {
                    }
                    string3 = string4 = rRa.X;
                    break;
                }
                case 1: {
                    string3 = string4 = uOa.Ja;
                    break;
                }
                case 2: {
                    string3 = string4 = oua.v;
                    break;
                }
                case 3: {
                    string4 = pqa.v;
                }
                default: {
                    string3 = string4;
                }
            }
            if (string3 != null && ((Matcher)a2).group(vRa.d).length() > 0) {
                hashMap.put(string4, ((Matcher)a2).group(vRa.d));
            }
            Object object2 = a2;
            object = object2;
            n3 = ((Matcher)object2).end();
        }
        if (n3 < string2.length()) {
            Object object3 = a2 = J.matcher(n3 == pua.o ? string2 : string2.substring(n3));
            while (((Matcher)object3).find()) {
                Object object4 = a2;
                object3 = object4;
                hashMap.put(((Matcher)a2).group(vRa.d), ((Matcher)object4).group(uqa.g));
            }
        }
        return hashMap;
    }

    private static String J(Map<String, String> map, String string) {
        String b2 = string;
        Map<String, String> a2 = map;
        return a2.get(b2);
    }

    public static ld J(u u2, String string) {
        Object b2 = string;
        u a2 = u2;
        if ((b2 = fia_3.J(a2, (String)b2, vL.class)).isEmpty()) {
            return null;
        }
        ArrayList<ld> arrayList = Lists.newArrayList();
        Object object = b2 = b2.iterator();
        while (object.hasNext()) {
            vL vL2 = (vL)b2.next();
            object = b2;
            arrayList.add(vL2.J());
        }
        return Mha.join(arrayList);
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends vL> List<T> J(u u2, String string, Class<? extends T> clazz) {
        Object b2;
        u u3 = u2;
        if (((Matcher)(b2 = j.matcher((CharSequence)b2))).matches() && u3.J(vRa.d, eua.Y)) {
            void a2;
            Map<String, String> c2 = fia_3.J(((Matcher)b2).group(uqa.g));
            if (!fia_3.J(u3, c2)) {
                return Collections.emptyList();
            }
            b2 = ((Matcher)b2).group(vRa.d);
            XF xF2 = fia_3.J(c2, u3.J());
            Object object = fia_3.J(u3, c2);
            ArrayList<T> arrayList = Lists.newArrayList();
            object = object.iterator();
            while (object.hasNext()) {
                Gg gg2 = (Gg)object.next();
                if (gg2 == null) continue;
                ArrayList<Predicate<vL>> arrayList2 = Lists.newArrayList();
                arrayList2.addAll(fia_3.J(c2, (String)b2));
                arrayList2.addAll(fia_3.e(c2));
                arrayList2.addAll(fia_3.C(c2));
                arrayList2.addAll(fia_3.l(c2));
                arrayList2.addAll(fia_3.J(c2));
                arrayList2.addAll(fia_3.f(c2));
                arrayList2.addAll(fia_3.J(c2, xF2));
                arrayList2.addAll(fia_3.d(c2));
                arrayList.addAll(fia_3.J(c2, a2, arrayList2, (String)b2, gg2, xF2));
            }
            return fia_3.J(arrayList, c2, u3, a2, (String)b2, xF2);
        }
        return Collections.emptyList();
    }

    private static List<Predicate<vL>> f(Map<String, String> map) {
        int n2;
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        Object a2 = fia_3.J(map2, dua.T);
        int n3 = n2 = a2 != null && ((String)a2).startsWith(dqa.O) ? vRa.d : uSa.E;
        if (n2 != 0) {
            a2 = ((String)a2).substring(vRa.d);
        }
        if (a2 != null) {
            arrayList.add((Predicate<vL>)new Via((String)a2, n2 != 0));
        }
        return arrayList;
    }

    private static List<Predicate<vL>> J(Map<String, String> map) {
        Map<String, String> map2 = map;
        ArrayList<Predicate<vL>> arrayList = Lists.newArrayList();
        Map<String, Object> a2 = fia_3.J(map2);
        if (a2 != null && a2.size() > 0) {
            arrayList.add((Predicate<vL>)new FGa(a2));
        }
        return arrayList;
    }

    public static int J(int a2) {
        if ((a2 %= aPa.Y) >= rRa.f) {
            a2 -= 360;
        }
        if (a2 < 0) {
            a2 += 360;
        }
        return a2;
    }

    public static boolean J(String a2) {
        return j.matcher(a2).matches();
    }

    public fia_3() {
        fia_3 a2;
    }
}

