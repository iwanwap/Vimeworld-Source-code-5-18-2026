/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  aSa
 *  sB
 *  vRa
 */
import java.util.Objects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vC {
    private long M;
    private double k;
    private double j;
    private d J;
    private double A;
    private double I;

    public boolean l() {
        vC a2;
        if (!a2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public d J() {
        vC a2;
        return a2.J;
    }

    public double d() {
        vC a2;
        return a2.j;
    }

    public void f(double b2, double a2) {
        vC c2;
        c2.J(b2, a2, sB.G);
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof vC)) {
            return uSa.E != 0;
        }
        b2 = (vC)b2;
        if (Double.compare(((vC)a2).I, ((vC)b2).I) == 0 && ((vC)a2).M == ((vC)b2).M && Double.compare(((vC)a2).k, ((vC)b2).k) == 0 && Double.compare(((vC)a2).A, ((vC)b2).A) == 0 && Double.compare(((vC)a2).j, ((vC)b2).j) == 0 && Objects.equals(((vC)a2).J, ((vC)b2).J)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public vC(double a2) {
        vC b2;
        vC vC2 = b2;
        vC2.d(a2);
    }

    public double C() {
        vC a2;
        return a2.A;
    }

    public vC e(double a2) {
        vC b2;
        b2.I = a2;
        return b2;
    }

    public vC J(d d2) {
        d b2 = d2;
        vC a2 = this;
        a2.J = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(double d2, double d3, d d4) {
        void b2;
        d d5;
        void c2;
        vC vC2 = d6;
        d d6 = d4;
        vC a2 = vC2;
        if (a2.l() && (c2 == a2.C() || c2 == a2.d() || c2 == a2.l())) {
            return;
        }
        a2.J(d5);
        a2.l((double)(b2 * Tpa.M));
        a2.J(OT.e);
        vC vC3 = a2;
        vC3.C(vC3.l());
        a2.J((double)c2);
    }

    public vC d(double a2) {
        vC b2;
        return b2.J(nqa.i).C(a2).e(a2).J(a2).l(aSa.V);
    }

    public int J() {
        vC a2;
        return (int)a2.I;
    }

    public int hashCode() {
        vC a2;
        Object[] objectArray = new Object[uua.p];
        objectArray[uSa.E] = a2.I;
        objectArray[vRa.d] = a2.M;
        objectArray[uqa.g] = a2.k;
        objectArray[yRa.d] = a2.A;
        objectArray[AQa.P] = a2.j;
        objectArray[tTa.h] = a2.J;
        return Objects.hash(objectArray);
    }

    public void J(double b2, double a2) {
        vC c2;
        c2.f(b2, a2, sB.G);
    }

    public vC J() {
        vC a2;
        return a2.d(aSa.V);
    }

    public vC C(double a2) {
        vC b2;
        b2.A = a2;
        return b2;
    }

    public double l() {
        vC a2;
        return a2.I;
    }

    public vC J(long a2) {
        vC b2;
        b2.M = a2;
        return b2;
    }

    public vC l(double a2) {
        vC b2;
        b2.k = a2;
        return b2;
    }

    public boolean f() {
        vC a2;
        if (a2.J() >= oua.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double f() {
        vC a2;
        return a2.k;
    }

    public double J() {
        vC a2;
        return (double)(OT.e - a2.J()) / a2.f();
    }

    public vC f(double a2) {
        vC b2;
        return b2.J(nqa.i).C(a2).e(a2).J(a2).l(aSa.V);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, d d4) {
        void c2;
        void b2;
        d d5;
        vC vC2 = d6;
        d d6 = d4;
        vC a2 = vC2;
        a2.J(d5);
        a2.l((double)(b2 * Tpa.M));
        a2.J(System.currentTimeMillis());
        vC vC3 = a2;
        vC3.C(vC3.l());
        a2.J((double)c2);
    }

    public vC() {
        vC a2;
    }

    public boolean J() {
        vC vC2 = this;
        boolean a2 = vC2.l();
        if (a2) {
            vC vC3 = vC2;
            vC2.I = vC3.J(vC2.C(), vC3.d(), vC2.J().J((float)vC2.J()));
            return a2;
        }
        vC2.J(nqa.i);
        vC2.I = vC2.d();
        return a2;
    }

    public double J(double c2, double b2, double a2) {
        double d2 = c2;
        return d2 + (b2 - d2) * a2;
    }

    public long J() {
        vC a2;
        return a2.M;
    }

    public vC J(double a2) {
        vC b2;
        b2.j = a2;
        return b2;
    }

    public float J() {
        vC a2;
        return (float)a2.I;
    }
}

