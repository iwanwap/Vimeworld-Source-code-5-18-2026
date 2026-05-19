/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  PI
 *  Tg
 *  asa
 *  vRa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dh_2 {
    private final Map<String, Tg> k;
    private long j;
    private final Set<Tg> J;
    private Tg[] A;
    private boolean I;

    public static /* synthetic */ int J(Tg tg2, Tg tg3) {
        Tg b2 = tg3;
        Tg a2 = tg2;
        return Float.compare(b2.j, a2.j);
    }

    /*
     * WARNING - void declaration
     */
    public void f(String string) {
        Dh_2 dh_2 = this;
        for (Tg tg2 : dh_2.J) {
            void a2;
            if (!tg2.I.startsWith((String)a2)) continue;
            tg2.e();
        }
    }

    public void f() {
        Object a2;
        Dh_2 dh_2 = this;
        Object object = a2 = dh_2.J.iterator();
        while (object.hasNext()) {
            ((Tg)a2.next()).e();
            object = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string) {
        Dh_2 dh_2 = this;
        for (Tg tg2 : dh_2.J) {
            void a2;
            if (!tg2.I.equals(a2)) continue;
            tg2.e();
        }
    }

    public void f(Tg tg2) {
        Dh_2 b2 = tg2;
        Dh_2 a2 = this;
        if (a2.k.put(((Tg)b2).I, (Tg)b2) != null) {
            a2.J(((Tg)b2).I);
        }
        a2.J.add((Tg)b2);
        a2.I = vRa.d;
    }

    public void J(Tg tg2) {
        Dh_2 b2 = tg2;
        Dh_2 a2 = this;
        a2.k.remove(((Tg)b2).I, b2);
        a2.J.remove(b2);
        a2.I = vRa.d;
    }

    public boolean J() {
        Dh_2 a2;
        return a2.J.isEmpty();
    }

    public Tg[] J() {
        Dh_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public Tg[] J(long l2) {
        Dh_2 dh_2;
        void a2;
        Dh_2 dh_22 = this;
        if (dh_22.I || a2 - dh_22.j > asa.fa) {
            Tg tg2;
            dh_22.I = uSa.E;
            dh_22.j = a2;
            ArrayList<Tg> arrayList = new ArrayList<Tg>(Math.max(NTa.C, dh_22.A.length + tTa.h));
            ArrayList<Tg> arrayList2 = new ArrayList<Tg>();
            Iterator b2 = dh_22.J.iterator();
            while (b2.hasNext()) {
                Tg tg3;
                tg2 = (Tg)b2.next();
                tg2.l();
                if (tg3.j < Math.max(tg2.g, Ura.v)) {
                    arrayList.add(tg2);
                    continue;
                }
                if (tg2.M >= a2) continue;
                arrayList2.add(tg2);
            }
            Iterator iterator = b2 = arrayList2.iterator();
            while (iterator.hasNext()) {
                tg2 = (Tg)b2.next();
                iterator = b2;
                Tg tg4 = tg2;
                tg4.J();
                dh_22.J(tg4);
            }
            dh_22.A = arrayList.toArray(new Tg[uSa.E]);
            dh_2 = dh_22;
        } else {
            int b2;
            Tg[] tgArray = dh_22.A;
            int n2 = dh_22.A.length;
            int n3 = b2 = uSa.E;
            while (n3 < n2) {
                Tg tg5 = tgArray[b2];
                Tg tg6 = tg5;
                tg5.l();
                n3 = ++b2;
            }
            dh_2 = dh_22;
        }
        Arrays.sort(dh_2.A, PI.J());
        return dh_22.A;
    }

    public Dh_2() {
        Dh_2 a2;
        Dh_2 dh_2 = a2;
        a2.k = new HashMap<String, Tg>();
        dh_2.J = new LinkedHashSet<Tg>();
        a2.A = new Tg[uSa.E];
    }

    public Tg J(String string) {
        String b2 = string;
        Dh_2 a2 = this;
        return a2.k.get(b2);
    }

    public Collection<Tg> J() {
        Dh_2 a2;
        return a2.J;
    }

    public void J() {
        Object a2;
        Dh_2 dh_2 = this;
        Object object = a2 = dh_2.J.iterator();
        while (object.hasNext()) {
            ((Tg)a2.next()).J();
            object = a2;
        }
        Dh_2 dh_22 = dh_2;
        dh_22.J.clear();
        dh_22.k.clear();
        dh_22.A = new Tg[uSa.E];
    }
}

