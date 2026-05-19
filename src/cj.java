/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  JPa
 *  JSa
 *  Kpa
 *  Uh
 *  ZJa
 *  aSa
 *  fm
 *  hh
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  xy
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cj {
    private final Uh j;
    private final hh J;
    private int A;
    private final Map<String, gh> I;

    public int l() {
        cj a2;
        return a2.j.J.size();
    }

    public void J(ALa aLa2) {
        ALa b2 = aLa2;
        cj a2 = this;
        if (!a2.I.isEmpty()) {
            uKa.z();
            uKa.f((float)pqa.r, (float)JPa.N, (float)pqa.r, (float)pqa.r);
            Object object = b2;
            cj.J((ALa)object, a2.j.j);
            uKa.f((float)pqa.r, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            cj.J((ALa)object, a2.J.j);
            uKa.H();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ANa aNa2) {
        ArrayList arrayList;
        void a2;
        cj cj2 = this;
        Object b2 = a2.J().C(aSa.V, Eqa.I, aSa.V);
        ArrayList arrayList2 = arrayList = new ArrayList();
        cj2.j.J((xy)b2, arrayList2);
        b2 = arrayList2.iterator();
        if (b2.hasNext()) {
            if (((gh)(b2 = (gh)b2.next())).J()) {
                void v1 = a2;
                v1.f(v1.i + ((gh)b2).e / (double)((gh)b2).a);
                v1.J(v1.Ea + ((gh)b2).C / (double)((gh)b2).a);
                v1.l(v1.f + ((gh)b2).g / (double)((gh)b2).a);
            }
            if (((gh)b2).l == Ih.MOVE && ((gh)b2).f()) {
                void v2 = a2;
                v2.f(v2.i + (double)((gh)b2).k);
                v2.J(v2.Ea + (double)((gh)b2).F);
                v2.l(v2.f + (double)((gh)b2).b);
                return;
            }
        }
    }

    public cj() {
        cj a2;
        cj cj2 = a2;
        a2.I = new HashMap<String, gh>();
        cj2.j = new Uh();
        a2.J = new hh();
    }

    private static void J(ALa aLa2, Collection<gh> collection) {
        Iterator b2 = collection;
        ALa a2 = aLa2;
        b2 = b2.iterator();
        while (b2.hasNext()) {
            gh gh2 = (gh)b2.next();
            if (!a2.J(gh2.m)) continue;
            ZJa.J((xy)gh2.m.C(-RKa.k, -RKa.C, -RKa.f));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, fm fm2) {
        Object c2 = string;
        cj b2 = this;
        if ((c2 = b2.I.get(c2)) != null) {
            void a2;
            ((gh)c2).J((fm)a2);
            Object object = c2;
            b2.j.l((gh)object);
            if (!((gh)object).G) {
                b2.J.l((gh)c2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, xy xy2, List<xy> list) {
        void a2;
        void b2;
        cj d2 = vL2;
        cj c2 = this;
        d2 = d2 instanceof ANa ? c2.j : c2.J;
        d2.J((xy)b2, (List)a2);
    }

    public int f() {
        cj a2;
        return a2.I.size();
    }

    public void f() {
        cj cj2;
        cj cj3 = cj2 = this;
        cj3.j.J();
        cj3.J.J();
        if (Kpa.J().c == null) {
            return;
        }
        cj cj4 = cj2;
        Iterator a2 = cj4.j.J(cj4.J.I.size());
        a2.addAll(cj2.J.I);
        Iterator iterator = a2;
        cj2.A = iterator.size();
        a2 = iterator.iterator();
        while (a2.hasNext()) {
            gh gh2 = (gh)a2.next();
            gh2.J();
            if (gh2.G) continue;
            cj2.J.l(gh2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, gh gh2) {
        void b2;
        cj a2;
        gh c2 = gh2;
        cj cj2 = a2 = this;
        cj2.J((String)b2);
        gh gh3 = c2;
        cj2.I.put((String)b2, gh3);
        a2.j.f(c2);
        if (!gh3.G) {
            a2.J.f(c2);
        }
    }

    public int J() {
        cj a2;
        return a2.A;
    }

    public void J() {
        cj a2;
        cj cj2 = a2;
        cj2.I.clear();
        cj2.j.f();
        cj2.J.f();
    }

    public void J(String string) {
        Object object;
        Object b2;
        String a2;
        cj cj2 = this;
        List<Object> list = null;
        if (a2.endsWith(JSa.a)) {
            void v0 = a2;
            a2 = v0.substring(uSa.E, v0.length() - vRa.d);
            b2 = cj2.I.entrySet().iterator();
            while (b2.hasNext()) {
                object = (Map.Entry)b2.next();
                if (!((String)object.getKey()).startsWith(a2)) continue;
                b2.remove();
                if (list == null) {
                    list = new ArrayList<Object>();
                }
                list.add(object.getValue());
            }
        } else {
            b2 = cj2.I.remove(a2);
            if (b2 != null) {
                list = Collections.singletonList(b2);
            }
        }
        if (list != null) {
            b2 = list.iterator();
            while (b2.hasNext()) {
                Object object2 = object = (gh)b2.next();
                cj2.j.J((gh)object2);
                if (((gh)object2).G) continue;
                cj2.J.J((gh)object);
            }
        }
    }
}

