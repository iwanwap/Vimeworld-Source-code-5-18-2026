/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NE
 *  Xd
 *  ue
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.vecmath.Vector2d;
import javax.vecmath.Vector3f;

public final class rf_3 {
    private final List<Vector2d> M;
    private final List<NE> k;
    private final Map<String, Xd> j;
    private final List<Vector3f> J;
    private final List<aE> A;
    private Map<String, ue> I;

    public Map<String, Xd> f() {
        rf_3 a2;
        return a2.j;
    }

    public List<Vector2d> C() {
        rf_3 a2;
        return a2.M;
    }

    public void J(Map<String, ue> map) {
        Map<String, ue> b2 = map;
        rf_3 a2 = this;
        a2.I = b2;
    }

    public void f() {
        rf_3 a2;
        rf_3 rf_32 = a2;
        rf_32.k.clear();
        rf_32.M.clear();
        rf_32.J.clear();
        rf_32.A.clear();
    }

    public Map<String, ue> J() {
        rf_3 a2;
        return a2.I;
    }

    public List<aE> l() {
        rf_3 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public rf_3(List<NE> list, List<Vector2d> list2, List<Vector3f> list3, List<aE> list4, Map<String, ue> map, Map<String, Xd> map2) {
        void a2;
        void b2;
        void c2;
        void d2;
        aE e2;
        rf_3 f2;
        Iterator g2 = list;
        rf_3 rf_32 = f2 = this;
        rf_3 rf_33 = f2;
        rf_3 rf_34 = f2;
        rf_34.k = g2;
        rf_34.M = e2;
        rf_33.J = d2;
        rf_33.A = c2;
        rf_32.I = b2;
        rf_32.j = a2;
        Iterator iterator = g2 = c2.iterator();
        while (iterator.hasNext()) {
            aE aE2 = e2 = (aE)g2.next();
            aE2.J((Xd)a2.get(aE2.f()));
            iterator = g2;
        }
    }

    public List<Vector3f> f() {
        rf_3 a2;
        return a2.J;
    }

    public List<NE> J() {
        rf_3 a2;
        return a2.k;
    }

    public void J() {
        Object a2;
        rf_3 rf_32 = this;
        Object object = a2 = rf_32.j.values().iterator();
        while (object.hasNext()) {
            ((Xd)a2.next()).J();
            object = a2;
        }
    }
}

