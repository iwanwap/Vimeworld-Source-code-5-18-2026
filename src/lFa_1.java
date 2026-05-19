/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Lz
 *  Mga
 *  OEa
 *  XTa
 *  gFa
 *  lFa
 *  uRa
 *  vL
 *  vRa
 *  yCa
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lFa_1<T extends vL>
extends gFa {
    private double E;
    private yCa m;
    private double C;
    public T i;
    private xaa M;
    private Class<T> k;
    private float j;
    private final Predicate<vL> J;
    private Predicate<? super T> A;
    public bga I;

    public void l() {
        lFa_1 a2;
        lFa_1 lFa_12 = a2;
        lFa_12.M.J(lFa_12.m, a2.E);
    }

    /*
     * WARNING - void declaration
     */
    public lFa_1(bga bga2, Class<T> clazz, float f2, double d2, double d3) {
        void a2;
        void b2;
        void d4;
        void e2;
        float f3 = f2;
        lFa_1 c2 = this;
        c2((bga)e2, (Class<T>)d4, Predicates.alwaysTrue(), f3, (double)b2, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public lFa_1(bga bga2, Class<T> clazz, Predicate<? super T> predicate, float f2, double d2, double d3) {
        void a2;
        void b2;
        void c2;
        void d4;
        void e2;
        lFa_1 f3;
        Object g2 = bga2;
        lFa_1 lFa_12 = f3 = this;
        lFa_1 lFa_13 = f3;
        lFa_1 lFa_14 = f3;
        f3.J = new Mga((lFa)f3);
        f3.I = g2;
        lFa_13.k = e2;
        lFa_13.A = d4;
        lFa_12.j = c2;
        lFa_12.E = b2;
        f3.C = a2;
        f3.M = g2.J();
        f3.J(vRa.d);
    }

    public void J() {
        a.i = null;
    }

    public void f() {
        lFa_1 a2;
        lFa_1 lFa_12 = a2;
        if (lFa_12.I.J((vL)lFa_12.i) < vRa.K) {
            a2.I.J().J(a2.C);
            return;
        }
        a2.I.J().J(a2.E);
    }

    public boolean l() {
        lFa_1 a2;
        if (!a2.M.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        lFa_1 lFa_12;
        lFa_1 lFa_13 = lFa_12 = this;
        Predicate[] predicateArray = new Predicate[yRa.d];
        predicateArray[uSa.E] = Kaa.A;
        predicateArray[vRa.d] = lFa_12.J;
        predicateArray[uqa.g] = lFa_12.A;
        Object a2 = lFa_12.I.j.J(lFa_13.k, lFa_13.I.J().f((double)lFa_12.j, uRa.I, (double)lFa_12.j), Predicates.and(predicateArray));
        if (a2.isEmpty()) {
            return uSa.E != 0;
        }
        lFa_12.i = (vL)a2.get(uSa.E);
        a2 = OEa.J((bga)lFa_12.I, (int)ERa.C, (int)XTa.W, (Lz)new Lz(((vL)lFa_12.i).la, ((vL)lFa_12.i).Z, ((vL)lFa_12.i).A));
        if (a2 == null) {
            return uSa.E != 0;
        }
        lFa_1 lFa_14 = lFa_12;
        if (lFa_12.i.f(((Lz)a2).A, ((Lz)a2).j, ((Lz)a2).J) < lFa_14.i.J((vL)lFa_14.I)) {
            return uSa.E != 0;
        }
        lFa_1 lFa_15 = lFa_12;
        lFa_15.m = lFa_15.M.J(((Lz)a2).A, ((Lz)a2).j, ((Lz)a2).J);
        if (lFa_15.m == null) {
            return uSa.E != 0;
        }
        return lFa_12.m.J((Lz)a2);
    }
}

