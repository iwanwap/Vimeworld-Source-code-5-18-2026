/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  CR
 *  FTa
 *  Hq
 *  Kpa
 *  RP
 *  Ri
 *  SP
 *  Xoa
 *  cI
 *  fTa
 *  jRa
 *  k
 *  lr
 *  nLa
 *  pqa
 *  sMa
 *  uKa
 *  vRa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eq
implements k {
    public static int f;
    public static int F;
    private final Kpa g;
    private final Map<CR, List<Bp>> L;
    public static int E;
    public static int m;
    private boolean C;
    private int i;
    public final Map<CR, List<Bp>> M;
    public final Map<String, Bp> k;
    private String[] j;
    public int J;
    public static sMa A;
    private Bp I;

    public static /* synthetic */ void f(List a2) {
        a2.forEach(HP.J());
    }

    public void e() {
        eq eq2 = this;
        Iterator<List<Bp>> iterator = eq2.M.values().iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next().iterator();
            while (object.hasNext()) {
                Object a2;
                ((Bp)a2.next()).l();
                object = a2;
            }
        }
    }

    private boolean f(Bp bp2) {
        Object b2 = bp2;
        eq a2 = this;
        while (true) {
            if (OT.e < ((Bp)b2).F) {
                return uSa.E != 0;
            }
            if (!((Bp)b2).W || !a2.J(((Bp)b2).w.j)) {
                return uSa.E != 0;
            }
            if (!(((Bp)b2).s instanceof Bp)) break;
            b2 = (Bp)((Bp)b2).s;
        }
        return vRa.d != 0;
    }

    public Bp J() {
        eq a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public eq(Kpa kpa2) {
        CR cR;
        int b2;
        void a2;
        eq eq2;
        eq eq3 = eq2 = this;
        eq2.j = null;
        eq2.C = vRa.d;
        eq3.I = null;
        eq3.g = a2;
        eq eq4 = eq2;
        eq3.M = new EnumMap<CR, List<Bp>>(CR.class);
        CR[] cRArray = CR.values();
        int n2 = cRArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            cR = cRArray[b2];
            eq2.M.put(cR, new ArrayList());
            n3 = ++b2;
        }
        eq2.L = new EnumMap<CR, List<Bp>>(CR.class);
        cRArray = CR.values();
        n2 = cRArray.length;
        int n4 = b2 = uSa.E;
        while (n4 < n2) {
            cR = cRArray[b2];
            eq2.L.put(cR, new ArrayList());
            n4 = ++b2;
        }
        eq2.k = new HashMap<String, Bp>();
        A = new sMa((Kpa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void C(Bp bp2) {
        void a2;
        eq eq2 = this;
        if (a2.f == null || !eq2.f((Bp)a2)) {
            return;
        }
        Object b2 = a2.J();
        if (eq2.k.containsKey(((Bp)b2).I)) {
            b2 = eq2.k.get((Object)((Bp)b2).I).w.j;
            if (eq2.g.ta != null && !(eq2.g.ta instanceof Xoa) && b2.ordinal() < CR.BEFORE_TOOLTIP.ordinal()) {
                return;
            }
        }
        eq eq3 = eq2;
        void v1 = a2;
        eq3.j = v1.f;
        eq3.C = v1.H;
    }

    public void l(Bp bp2) {
        eq a2;
        Bp b2 = bp2;
        eq eq2 = a2 = this;
        eq2.k.put((String)b2.I, b2);
        eq2.L.get(b2.w.j).add(b2);
    }

    public boolean J(Bp bp2) {
        Bp b2 = bp2;
        eq a2 = this;
        if (b2.A) {
            return vRa.d != 0;
        }
        return a2.J(b2.w.j);
    }

    public static /* synthetic */ boolean J(String string, Bp bp2) {
        Bp b2 = bp2;
        String a2 = string;
        return b2.I.equals(a2);
    }

    public void l(String string) {
        String b2 = string;
        eq a2 = this;
        if (a2.k.remove(b2) != null) {
            a2.L.values().forEach(RP.J((String)b2));
        }
    }

    private void d() {
        eq a2;
        OT.i.k.J();
        if (a2.I != null) {
            eq eq2 = a2;
            if (!eq2.f(eq2.I)) {
                a2.J();
            }
        }
        if (a2.j != null && a2.g.ta != null) {
            a2.g.ta.J(Arrays.asList(a2.j), m, E, a2.C);
            nLa.C();
        }
    }

    public Bp J(String string) {
        String b2 = string;
        eq a2 = this;
        return a2.k.get(b2);
    }

    public float f() {
        return F;
    }

    public static /* synthetic */ void J(List a2) {
        a2.forEach(lr.J());
    }

    public void J(CR cR) {
        eq eq2;
        eq b2 = cR;
        eq a2 = this;
        if (a2.g.z.ba && a2.g.ta == null) {
            return;
        }
        if (a2.g.ta == mx.J()) {
            return;
        }
        if (b2 == CR.BEFORE_HUD) {
            eq eq3 = a2;
            eq2 = eq3;
            eq3.f();
        } else {
            if (b2 == CR.SCREEN && a2.g.Ta == null) {
                return;
            }
            eq2 = a2;
        }
        List<Bp> list = eq2.M.get(b2);
        List<Bp> list2 = a2.L.get(b2);
        if (list.isEmpty() && list2.isEmpty()) {
            if (b2 == CR.SCREEN) {
                a2.d();
            }
            return;
        }
        a2.g.Ta.H.J(FTa.a);
        uKa.E();
        uKa.J((int)jRa.m, (float)Jpa.B);
        uKa.u();
        uKa.L();
        boolean bl = uKa.C();
        if (bl) {
            uKa.m();
        }
        a2.J(list, OT.e);
        a2.J(list2, OT.e);
        if (b2 == CR.SCREEN) {
            a2.d();
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.o();
        if (b2 != CR.BEFORE_TOOLTIP) {
            uKa.k();
            uKa.J();
        }
        if (bl) {
            uKa.h();
        }
        a2.g.Ta.H.f();
    }

    public void f(Bp bp2) {
        eq a2;
        Bp b2 = bp2;
        eq eq2 = a2 = this;
        eq2.J();
        eq2.I = b2;
        eq2.I.M();
    }

    public void C() {
        Iterator<List<Bp>> iterator;
        eq eq2 = this;
        Iterator<List<Bp>> iterator2 = iterator = eq2.M.values().iterator();
        while (iterator2.hasNext()) {
            List<Bp> list = iterator.next();
            Object object = list.iterator();
            while (object.hasNext()) {
                Object a2;
                Bp bp2 = (Bp)a2.next();
                object = a2;
                bp2.J();
                eq2.k.remove(bp2.I);
            }
            list.clear();
            iterator2 = iterator;
        }
    }

    public void l() {
        eq a2;
        eq eq2 = a2;
        eq2.M.values().forEach(SP.J());
        eq2.L.values().forEach(Hq.J());
    }

    public boolean J(CR cR) {
        eq b2 = cR;
        eq a2 = this;
        if (b2 == CR.BEFORE_TOOLTIP) {
            return a2.g.ta instanceof Ama;
        }
        return vRa.d != 0;
    }

    public float J() {
        return f;
    }

    /*
     * WARNING - void declaration
     */
    private void J(List<Bp> list, long l2) {
        Iterator b2;
        eq eq2 = this;
        b2 = b2.iterator();
        while (b2.hasNext()) {
            Bp bp2;
            void a2;
            Bp c2;
            block4: {
                c2 = (Bp)b2.next();
                eq eq3 = eq2;
                eq3.J((long)a2, c2);
                if (c2.J(eq3.g)) {
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                    eq2.J += vRa.d;
                    try {
                        c2.f((long)a2);
                        bp2 = c2;
                        break block4;
                    }
                    catch (Exception exception) {
                        OT.b.error(new StringBuilder().insert(3 & 4, fTa.s).append(c2).append(hpa.b).toString(), (Throwable)exception);
                    }
                }
                bp2 = c2;
            }
            if (bp2.i > a2) continue;
            b2.remove();
            eq2.k.remove(c2.I, c2);
            c2.J();
        }
    }

    private void f() {
        eq eq2 = this;
        OT.e = System.currentTimeMillis();
        RJ.M.J();
        if (eq2.I != null && (eq2.g.ta == null || eq2.I.i <= OT.e)) {
            eq2.J();
        }
        eq2.j = null;
        m = Mouse.getX();
        E = Mouse.getY();
        eq a2 = A;
        A = new sMa(eq2.g);
        f = A.f();
        F = A.J();
        m = m * f / eq2.g.t;
        E = F - E * F / eq2.g.k - vRa.d;
        eq2.J = eq2.i;
        eq2.i = uSa.E;
        if (a2 != null && a2.l() != A.l()) {
            eq2.l();
            OT.i.H.J();
        }
        cI.f();
    }

    public static /* synthetic */ void J(String string, List list) {
        List b2 = list;
        String a2 = string;
        b2.removeIf(Cp.J(a2));
    }

    /*
     * WARNING - void declaration
     */
    private void J(long l2, Bp bp2) {
        void b2;
        Bp c2 = bp2;
        eq a2 = this;
        if (a2.g.ta != null && (c2.w.j.ordinal() > CR.HUD.ordinal() || a2.g.ta instanceof Xoa)) {
            Bp bp3 = c2;
            Ri ri = bp3.J((long)b2);
            Bp bp4 = c2;
            bp4.J((int)(((float)m - ri.I) / c2.k.f()), (int)(((float)E - ri.A) / bp4.J.f()), (long)b2);
            if (bp3.e && c2.f != null && c2.J(a2.g)) {
                OT.i.F.C(c2);
                return;
            }
        } else {
            c2.J(rta.n, rta.n, (long)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(String string) {
        eq eq2 = this;
        Iterator<List<Bp>> iterator = eq2.M.values().iterator();
        while (iterator.hasNext()) {
            for (Bp bp2 : iterator.next()) {
                void a2;
                if (!bp2.I.equals(a2)) continue;
                bp2.l();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string) {
        eq eq2 = this;
        Iterator<List<Bp>> iterator = eq2.M.values().iterator();
        while (iterator.hasNext()) {
            for (Bp bp2 : iterator.next()) {
                void a2;
                if (!bp2.I.startsWith((String)a2)) continue;
                bp2.l();
            }
        }
    }

    public void J() {
        eq a2;
        if (a2.I != null) {
            a2.I.i();
            a2.I = null;
        }
    }

    public void J(String[] stringArray) {
        String[] b2 = stringArray;
        String[] a2 = this;
        a2.j = b2;
    }

    public void J(Bp bp2) {
        eq a2;
        Bp b2 = bp2;
        eq eq2 = a2 = this;
        eq2.f((String)b2.I);
        eq2.k.put((String)b2.I, b2);
        eq2.M.get(b2.w.j).add(b2);
    }

    public List<Bp> J() {
        Object a2;
        eq eq2 = this;
        ArrayList<Bp> arrayList = new ArrayList<Bp>();
        Object object = a2 = eq2.M.values().iterator();
        while (object.hasNext()) {
            List list = (List)a2.next();
            object = a2;
            arrayList.addAll(list);
        }
        return arrayList;
    }
}

