/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Ai
 *  FZ
 *  Gg
 *  HI
 *  JPa
 *  Kpa
 *  Oz
 *  UH
 *  Zta
 *  aSa
 *  bG
 *  fm
 *  mG
 *  pm
 *  vL
 *  vRa
 *  vg
 *  xy
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gh {
    public int a;
    public float b;
    public Ih l;
    public double e;
    public boolean G;
    public boolean D;
    public boolean f;
    public float F;
    public double g;
    private xy L;
    private boolean E;
    public xy m;
    public double C;
    private final int i;
    private static int M;
    public float k;
    public boolean j;
    public boolean J;
    public int A;
    private xy I;

    /*
     * WARNING - void declaration
     */
    public static void J(vL vL2, xy xy2) {
        void a2;
        vL vL3 = vL2;
        vL b2 = vL3.J();
        TreeMap<Double, Runnable> treeMap = new TreeMap<Double, Runnable>();
        if (b2.A > a2.J) {
            treeMap.put(Math.abs(b2.A - a2.J), HI.J((vL)vL3, (xy)a2, (xy)b2));
        }
        if (b2.J < a2.A) {
            treeMap.put(Math.abs(b2.J - a2.A), mG.J((vL)vL3, (xy)a2, (xy)b2));
        }
        if (b2.M > a2.j) {
            treeMap.put(Math.abs(b2.M - a2.j), vg.J((vL)vL3, (xy)a2, (xy)b2));
        }
        if (b2.j < a2.M) {
            treeMap.put(Math.abs(b2.j - a2.M), Ai.J((vL)vL3, (xy)a2, (xy)b2));
        }
        if (b2.k > a2.I) {
            treeMap.put(Math.abs(b2.k - a2.I), bG.J((vL)vL3, (xy)a2, (xy)b2));
        }
        if (b2.I < a2.k) {
            treeMap.put(Math.abs(b2.I - a2.k), UH.J((vL)vL3, (xy)a2, (xy)b2));
        }
        ((Runnable)treeMap.firstEntry().getValue()).run();
    }

    /*
     * Unable to fully structure code
     */
    public void J(fm var1_1) {
        b = var1_1;
        a = this;
        if (b.getCoordsCount() <= 0) ** GOTO lbl18
        var2_2 = new xy((double)b.getCoords(uSa.E), (double)b.getCoords(vRa.d), (double)b.getCoords(uqa.g), (double)b.getCoords(yRa.d), (double)b.getCoords(AQa.P), (double)b.getCoords(tTa.h));
        var3_3 = b.getAnimationTicks();
        if (var3_3 > 0) {
            v0 = a;
            a.L = a.m;
            v0.I = var2_2;
            v0.a = v0.A = var3_3;
            v1 = b;
            a.f();
            a.j = vRa.d;
        } else {
            v2 = a;
            v2.m = var2_2;
            v2.A = uSa.E;
lbl18:
            // 2 sources

            v1 = b;
        }
        if (v1.hasDrag()) {
            a.f = b.getDrag();
        }
        if (b.hasImpelX()) {
            a.k = b.getImpelX();
        }
        if (b.hasImpelY()) {
            a.F = b.getImpelY();
        }
        if (b.hasImpelZ()) {
            a.b = b.getImpelZ();
        }
        if (b.hasImpelYOnTop()) {
            a.J = b.getImpelYOnTop();
        }
        if (b.hasImpelXZOnSides()) {
            a.D = b.getImpelXZOnSides();
        }
        if (b.hasImpelType()) {
            a.l = Ih.fromProto(b.getImpelType());
        }
    }

    private void f() {
        gh gh2;
        gh gh3 = gh2 = this;
        gh a2 = gh3.I;
        if (Math.abs(gh3.m.A - gh2.m.J - (((xy)a2).A - ((xy)a2).J)) < DPa.Ia && Math.abs(gh2.m.M - gh2.m.j - (((xy)a2).M - ((xy)a2).j)) < DPa.Ia && Math.abs(gh2.m.k - gh2.m.I - (((xy)a2).k - ((xy)a2).I)) < DPa.Ia) {
            gh gh4 = gh2;
            gh gh5 = a2;
            gh2.e = ((xy)gh5).A - gh2.m.A;
            gh4.C = ((xy)gh5).M - gh2.m.M;
            gh4.g = ((xy)a2).k - gh2.m.k;
            gh4.E = vRa.d;
            return;
        }
        gh2.E = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void e(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        gh.J(a2, aSa.V, aSa.V, b2.I - c2.k);
    }

    private static xy J(long[] a2) {
        return new xy(Double.longBitsToDouble(a2[uSa.E]), Double.longBitsToDouble(a2[vRa.d]), Double.longBitsToDouble(a2[uqa.g]), Double.longBitsToDouble(a2[yRa.d]), Double.longBitsToDouble(a2[AQa.P]), Double.longBitsToDouble(a2[tTa.h]));
    }

    /*
     * WARNING - void declaration
     */
    private static List<vL> J(Gg gg2, xy xy2, boolean n2) {
        void b2;
        int c22 = n2;
        Gg a2 = gg2;
        if (c22 != 0) {
            ANa c22 = Kpa.J().c;
            if (c22.J().J((xy)b2)) {
                return Collections.singletonList(c22);
            }
            return Collections.emptyList();
        }
        void v0 = b2;
        c22 = Oz.f((double)((v0.J - KPa.y) / Zta.ba));
        int n3 = Oz.f((double)((v0.A + KPa.y) / Zta.ba));
        int n4 = Oz.f((double)((v0.I - KPa.y) / Zta.ba));
        int n5 = Oz.f((double)((v0.k + KPa.y) / Zta.ba));
        ArrayList<vL> arrayList = Lists.newArrayList();
        int n6 = c22 = c22;
        while (n6 <= n3) {
            int n7 = n4;
            while (n7 <= n5) {
                int n8;
                if (a2.f().J(c22, n8)) {
                    FZ[] fZArray = a2.J(c22, n8).J();
                    void v3 = b2;
                    int n9 = Oz.f((double)((v3.j - KPa.y) / Zta.ba));
                    int n10 = Oz.f((double)((v3.M + KPa.y) / Zta.ba));
                    n9 = Oz.f((int)n9, (int)uSa.E, (int)(fZArray.length - vRa.d));
                    n10 = Oz.f((int)n10, (int)uSa.E, (int)(fZArray.length - vRa.d));
                    int n11 = n9 = n9;
                    while (n11 <= n10) {
                        for (vL vL2 : fZArray[n9]) {
                            if (!vL2.J().J((xy)b2)) continue;
                            arrayList.add(vL2);
                        }
                        n11 = ++n9;
                    }
                }
                n7 = ++n8;
            }
            n6 = ++c22;
        }
        return arrayList;
    }

    public gh(pm pm2) {
        gh b2 = pm2;
        gh a2 = this;
        int n2 = M;
        M = n2 + vRa.d;
        a2.i = n2;
        a2.f = uSa.E;
        a2.G = vRa.d;
        a2.J = uSa.E;
        a2.D = uSa.E;
        a2.l = Ih.MOVE;
        gh gh2 = a2;
        a2.m = new xy((double)b2.getCoords(uSa.E), (double)b2.getCoords(vRa.d), (double)b2.getCoords(uqa.g), (double)b2.getCoords(yRa.d), (double)b2.getCoords(AQa.P), (double)b2.getCoords(tTa.h));
        if (b2.hasDrag()) {
            a2.f = b2.getDrag();
        }
        if (b2.hasAffectOnlyPlayers()) {
            a2.G = b2.getAffectOnlyPlayers();
        }
        gh gh3 = a2;
        gh gh4 = b2;
        a2.k = b2.getImpelX();
        gh3.F = gh4.getImpelY();
        gh3.b = gh4.getImpelZ();
        if (b2.hasImpelYOnTop()) {
            a2.J = b2.getImpelYOnTop();
        }
        if (b2.hasImpelXZOnSides()) {
            a2.D = b2.getImpelXZOnSides();
        }
        if (b2.hasImpelType()) {
            a2.l = Ih.fromProto(b2.getImpelType());
        }
    }

    public boolean C() {
        gh a2;
        if (a2.l() || a2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void d(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        gh.J(a2, aSa.V, b2.j - c2.M, aSa.V);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void C(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        gh.J(a2, aSa.V, b2.M - c2.j, aSa.V);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void l(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        gh.J(a2, b2.A - c2.J, aSa.V, aSa.V);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        gh.J(a2, b2.J - c2.A, aSa.V, aSa.V);
    }

    public int hashCode() {
        gh a2;
        return a2.i;
    }

    public void J() {
        vL vL2;
        Object object;
        gh gh2 = this;
        gh a2 = Kpa.J().c.J();
        if (gh2.A > 0) {
            gh gh3;
            double d2;
            gh gh4 = gh2;
            gh4.A -= vRa.d;
            if (gh4.E) {
                gh gh5 = gh2;
                d2 = gh5.e / (double)gh2.a;
                gh gh6 = gh2;
                double d3 = gh5.C / (double)gh6.a;
                double d4 = gh6.g / (double)gh2.a;
                if (gh5.f) {
                    Iterator<vL> iterator;
                    Iterator<vL> iterator2 = iterator = gh.J((Gg)a2, gh2.m.f(aSa.V, GPa.g, aSa.V), gh2.G).iterator();
                    while (iterator2.hasNext()) {
                        gh.J(iterator.next(), d2, d3, d4);
                        iterator2 = iterator;
                    }
                }
                gh2.m = gh2.m.C(d2, d3, d4);
                gh3 = a2;
            } else {
                gh gh7 = gh2;
                d2 = (double)(gh7.a - gh7.A) / (double)gh2.a;
                gh gh8 = gh2;
                gh7.m = new xy(gh.J(d2, gh2.L.J, gh2.I.J), gh.J(d2, gh2.L.j, gh2.I.j), gh.J(d2, gh2.L.I, gh2.I.I), gh.J(d2, gh2.L.A, gh2.I.A), gh.J(d2, gh2.L.M, gh2.I.M), gh.J(d2, gh2.L.k, gh2.I.k));
                gh3 = a2;
            }
            gh gh9 = gh2;
            object = gh.J((Gg)gh3, gh9.m, gh9.G).iterator();
            Iterator<Object> iterator = object;
            while (iterator.hasNext()) {
                vL2 = (vL)object.next();
                iterator = object;
                gh.J(vL2, gh2.m);
            }
        }
        if (gh2.F != JPa.N) {
            gh gh10 = gh2;
            object = gh10.m.f(GPa.g, aSa.V, GPa.g);
            if (gh10.J) {
                object = object.C(aSa.V, GPa.g, aSa.V);
            }
            vL vL3 = vL2 = gh.J((Gg)a2, (xy)object, gh2.G).iterator();
            while (vL3.hasNext()) {
                vL vL4 = vL2.next();
                vL3 = vL2;
                vL4.J((double)gh2.F);
            }
        }
        if (gh2.k != JPa.N || gh2.b != JPa.N) {
            gh gh11 = gh2;
            object = gh11.m.C(aSa.V, GPa.g, aSa.V);
            if (gh11.D) {
                object = object.f(GPa.g, aSa.V, GPa.g);
            }
            for (vL vL5 : gh.J((Gg)a2, (xy)object, gh2.G)) {
                if (gh2.l == Ih.MOVE) {
                    gh.J(vL5, gh2.k, aSa.V, gh2.b);
                    continue;
                }
                if (gh2.l != Ih.VELOCITY) continue;
                if (gh2.k != JPa.N) {
                    vL vL6 = vL5;
                    vL6.f(vL6.i + (double)gh2.k);
                }
                if (gh2.b == JPa.N) continue;
                vL vL7 = vL5;
                vL7.l(vL7.f + (double)gh2.b);
            }
        }
    }

    public boolean l() {
        gh a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        gh.J(a2, aSa.V, aSa.V, b2.k - c2.I);
    }

    public boolean f() {
        gh a2;
        if (a2.k != JPa.N || a2.F != JPa.N || a2.b != JPa.N) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        gh a2;
        if (a2.A > 0 && a2.E) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static double J(double c2, double b2, double a2) {
        return b2 + c2 * (a2 - b2);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(vL vL2, double d2, double d3, double d4) {
        void a2;
        void c2;
        void b2;
        vL vL3 = vL2;
        int d5 = vL3.ha && b2 == aSa.V ? vRa.d : uSa.E;
        vL3.J((double)c2, (double)b2, (double)a2);
        if (d5 != 0) {
            vL3.Ia = vRa.d;
            vL3.da = vRa.d;
            vL3.d(vRa.d != 0);
        }
    }
}

