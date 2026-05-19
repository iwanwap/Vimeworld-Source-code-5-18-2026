/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  SRa
 *  Sqa
 *  aPa
 *  hqa
 *  ica
 *  jba
 *  mca
 *  pPa
 *  pQa
 *  pY
 *  pua
 *  qca
 *  ura
 *  vL
 *  vRa
 *  wOa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class qca_2 {
    private static String[] i = null;
    private final Map<String, mca> M;
    private final ica[] k;
    private final Map<String, mca> j;
    private final Map<lb, List<ica>> J;
    private final Map<String, ica> A = Maps.newHashMap();
    private final Map<String, Map<ica, jba>> I;

    public qca_2() {
        qca_2 a2;
        a2.J = Maps.newHashMap();
        a2.I = Maps.newHashMap();
        a2.k = new ica[wOa.t];
        qca_2 qca_22 = a2;
        qca_22.j = Maps.newHashMap();
        qca_22.M = Maps.newHashMap();
    }

    /*
     * WARNING - void declaration
     */
    public Collection<jba> J(ica ica2) {
        qca_2 qca_22 = this;
        ArrayList<jba> arrayList = Lists.newArrayList();
        Iterator<Map<ica, jba>> b2 = qca_22.I.values().iterator();
        while (b2.hasNext()) {
            void a2;
            jba jba2 = (jba)((Map)b2.next()).get(a2);
            if (jba2 == null) continue;
            arrayList.add(jba2);
        }
        ArrayList<jba> arrayList2 = arrayList;
        Collections.sort(arrayList2, jba.j);
        return arrayList2;
    }

    public void C(ica object) {
        qca_2 b2 = object;
        object = this;
    }

    public void f(String string, ica object) {
        qca_2 c2 = object;
        object = this;
    }

    public Collection<ica> d() {
        qca_2 a2;
        return a2.A.values();
    }

    public Collection<String> C() {
        qca_2 a2;
        return a2.I.keySet();
    }

    public mca l(String string) {
        String b2 = string;
        qca_2 a2 = this;
        return a2.M.get(b2);
    }

    public void J(int n2, ica ica2) {
        qca_2 c2 = ica2;
        qca_2 a2 = this;
        a2.k[b] = c2;
    }

    /*
     * WARNING - void declaration
     */
    public ica J(String string, lb lb2) {
        void a2;
        void b2;
        qca_2 qca_22 = this;
        if (b2.length() > ERa.C) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, Sqa.X).append((String)b2).append(Yqa.d).toString());
        }
        qca_2 c2 = qca_22.J((String)b2);
        if (c2 != null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, pQa.e).append((String)b2).append(pPa.Ka).toString());
        }
        c2 = new ica((qca)qca_22, (String)b2, (lb)a2);
        List<ica> list = qca_22.J.get(a2);
        if (list == null) {
            list = Lists.newArrayList();
            qca_22.J.put((lb)a2, list);
        }
        list.add((ica)c2);
        qca_22.A.put((String)b2, (ica)c2);
        qca_22.J((ica)c2);
        return c2;
    }

    public void C(mca object) {
        qca_2 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void l(mca mca2) {
        void a2;
        qca_2 qca_22 = this;
        qca_22.j.remove(a2.J());
        Iterator b2 = a2.J().iterator();
        Iterator iterator = b2;
        while (iterator.hasNext()) {
            String string = (String)b2.next();
            iterator = b2;
            qca_22.M.remove(string);
        }
        qca_22.f((mca)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, ica ica2) {
        void a2;
        String c2 = string;
        qca_2 b2 = this;
        if (a2 == null) {
            Map<ica, jba> map = b2.I.remove(c2);
            if (map != null) {
                b2.J(c2);
                return;
            }
        } else {
            Map<ica, jba> map = b2.I.get(c2);
            if (map != null) {
                jba jba2 = map.remove(a2);
                if (map.size() < vRa.d) {
                    if (b2.I.remove(c2) != null) {
                        b2.J(c2);
                        return;
                    }
                } else if (jba2 != null) {
                    b2.f(c2, (ica)a2);
                }
            }
        }
    }

    public void l(ica object) {
        qca_2 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void f(ica ica2) {
        void a2;
        qca_2 qca_22 = this;
        qca_22.A.remove(a2.J());
        int b22 = uSa.E;
        int n2 = b22;
        while (n2 < wOa.t) {
            if (qca_22.J(b22) == a2) {
                qca_22.J(b22, (ica)null);
            }
            n2 = ++b22;
        }
        List<ica> b22 = qca_22.J.get(a2.J());
        if (b22 != null) {
            b22.remove(a2);
        }
        Object object = b22 = qca_22.I.values().iterator();
        while (object.hasNext()) {
            ((Map)b22.next()).remove(a2);
            object = b22;
        }
        qca_22.C((ica)a2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, ica ica2) {
        void a2;
        Map<ica, jba> c2 = string;
        qca_2 b2 = this;
        if ((c2 = b2.I.get(c2)) == null) {
            return uSa.E != 0;
        }
        if (c2.get(a2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ica J(int n2) {
        int b2 = n2;
        qca_2 a2 = this;
        return a2.k[b2];
    }

    public static int J(String string) {
        String a2;
        String string2 = string;
        if (string2.equalsIgnoreCase(Wqa.Y)) {
            return uSa.E;
        }
        if (string2.equalsIgnoreCase(hqa.i)) {
            return vRa.d;
        }
        if (string2.equalsIgnoreCase(aPa.i)) {
            return uqa.g;
        }
        if (string2.startsWith(SRa.Ga) && (a2 = pY.getValueByName((String)string2.substring(SRa.Ga.length()))) != null && a2.getColorIndex() >= 0) {
            return a2.getColorIndex() + yRa.d;
        }
        return pua.o;
    }

    public mca f(String string) {
        String b2 = string;
        qca_2 a2 = this;
        if (b2.length() > ERa.C) {
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, TOa.H).append(b2).append(Yqa.d).toString());
        }
        mca mca2 = a2.J(b2);
        if (mca2 != null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, ATa.H).append(b2).append(pPa.Ka).toString());
        }
        mca mca3 = mca2 = new mca((qca)a2, b2);
        a2.j.put(b2, mca3);
        a2.J(mca2);
        return mca3;
    }

    /*
     * WARNING - void declaration
     */
    public jba J(String string, ica ica2) {
        void a2;
        jba jba2;
        void b2;
        qca_2 qca_22 = this;
        if (b2.length() > ura.V) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, NSa.Z).append((String)b2).append(Yqa.d).toString());
        }
        Map<Object, jba> c2 = qca_22.I.get(b2);
        if (c2 == null) {
            c2 = Maps.newHashMap();
            qca_22.I.put((String)b2, c2);
        }
        if ((jba2 = (jba)c2.get(a2)) == null) {
            jba2 = new jba((qca)qca_22, (ica)a2, (String)b2);
            c2.put(a2, jba2);
        }
        return jba2;
    }

    public Map<ica, jba> J(String string) {
        Map<ica, jba> b2 = string;
        qca_2 a2 = this;
        if ((b2 = a2.I.get(b2)) == null) {
            b2 = Maps.newHashMap();
        }
        return b2;
    }

    public Collection<mca> l() {
        qca_2 a2;
        return a2.j.values();
    }

    public mca J(String string) {
        String b2 = string;
        qca_2 a2 = this;
        return a2.j.get(b2);
    }

    public Collection<jba> f() {
        qca_2 qca_22 = this;
        Iterator a2 = qca_22.I.values();
        ArrayList<jba> arrayList = Lists.newArrayList();
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            Map map = (Map)a2.next();
            iterator = a2;
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public void J(String object) {
        Object b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string) {
        void a2;
        qca_2 qca_22 = this;
        qca_2 b2 = qca_22.l((String)a2);
        if (b2 != null) {
            qca_22.J((String)a2, (mca)b2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, mca mca2) {
        void b2;
        qca_2 c2 = mca2;
        qca_2 a2 = this;
        if (a2.l((String)b2) != c2) {
            throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, Npa.C).append(c2.J()).append(TOa.G).toString());
        }
        a2.M.remove(b2);
        c2.J().remove(b2);
    }

    public void f(mca object) {
        qca_2 b2 = object;
        object = this;
    }

    public static String[] J() {
        if (i == null) {
            int n2;
            i = new String[wOa.t];
            int n3 = n2 = uSa.E;
            while (n3 < wOa.t) {
                int n4 = n2++;
                qca_2.i[n4] = qca_2.J(n4);
                n3 = n2;
            }
        }
        return i;
    }

    public void J(vL vL2) {
        Object b2 = vL2;
        qca_2 a2 = this;
        if (b2 != null && !(b2 instanceof Sx) && !b2.K()) {
            b2 = b2.J().toString();
            a2.J((String)b2, (ica)null);
            a2.J((String)b2);
        }
    }

    public void J(jba object) {
        qca_2 b2 = object;
        object = this;
    }

    public void J(mca object) {
        qca_2 b2 = object;
        object = this;
    }

    public boolean J(String string, String string2) {
        mca a2;
        String c2 = string;
        qca_2 b2 = this;
        if (c2.length() > ura.V) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, NSa.Z).append(c2).append(Yqa.d).toString());
        }
        if (!b2.j.containsKey(a2)) {
            return uSa.E != 0;
        }
        qca_2 qca_22 = b2;
        a2 = qca_22.J((String)a2);
        if (qca_22.l(c2) != null) {
            b2.J(c2);
        }
        b2.M.put(c2, a2);
        a2.J().add(c2);
        return vRa.d != 0;
    }

    public void J(ica object) {
        qca_2 b2 = object;
        object = this;
    }

    public ica J(String string) {
        String b2 = string;
        qca_2 a2 = this;
        return a2.A.get(b2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String J(int n2) {
        pY a2;
        int n3 = n2;
        switch (n3) {
            case 0: {
                return Wqa.Y;
            }
            case 1: {
                return hqa.i;
            }
            case 2: {
                return aPa.i;
            }
        }
        if (n3 >= yRa.d && n3 <= yOa.B && (a2 = pY.func_175744_a((int)(n3 - yRa.d))) != null && a2 != pY.RESET) {
            return new StringBuilder().insert(3 ^ 3, SRa.Ga).append(a2.getFriendlyName()).toString();
        }
        return null;
    }

    public Collection<ica> J(lb lb2) {
        Object b2 = lb2;
        qca_2 a2 = this;
        if ((b2 = (Collection)a2.J.get(b2)) == null) {
            return Lists.newArrayList();
        }
        return Lists.newArrayList(b2);
    }

    public Collection<String> J() {
        qca_2 a2;
        return a2.j.keySet();
    }
}

