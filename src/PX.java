/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  DQa
 *  YSa
 *  Ypa
 *  aSa
 *  vL
 *  vRa
 *  xy
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PX {
    private double g;
    private double L;
    private double E;
    private long m;
    private final List<cd> C = Lists.newArrayList();
    private double i;
    private long M;
    private double k;
    private int j;
    private double J;
    private int A;
    private int I;

    public int l() {
        PX a2;
        return a2.A;
    }

    public PX() {
        PX a2;
        a2.L = aSa.V;
        a2.g = aSa.V;
        a2.J = a2.k = uqa.M;
        a2.A = YSa.Ma;
        a2.i = iSa.P;
        a2.E = DQa.S;
        a2.j = Ypa.A;
        a2.I = tTa.h;
    }

    public double G() {
        PX a2;
        return a2.J;
    }

    public double D() {
        PX a2;
        return a2.L;
    }

    public int f() {
        PX a2;
        return a2.j;
    }

    public double A() {
        PX a2;
        if (a2.J() != qaa.STATIONARY) {
            double d2;
            double d3 = (float)(System.currentTimeMillis() - a2.M) / (float)(a2.m - a2.M);
            if (d2 < oua.i) {
                return a2.k + (a2.J - a2.k) * d3;
            }
            PX pX = a2;
            pX.J(pX.J);
        }
        return a2.k;
    }

    public double i() {
        double d2;
        PX a2;
        double d3 = a2.D() + a2.A() / KPa.y;
        if (d2 > (double)a2.A) {
            d3 = a2.A;
        }
        return d3;
    }

    public qaa J() {
        PX a2;
        if (a2.J < a2.k) {
            return qaa.SHRINKING;
        }
        if (a2.J > a2.k) {
            return qaa.GROWING;
        }
        return qaa.STATIONARY;
    }

    public int J() {
        PX a2;
        return a2.I;
    }

    public double M() {
        PX a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public void l(double d2) {
        Object b2;
        void a2;
        PX pX = this;
        pX.E = a2;
        Object object = b2 = pX.J().iterator();
        while (object.hasNext()) {
            ((cd)b2.next()).J(pX, (double)a2);
            object = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void l(int n2) {
        Object b2;
        void a2;
        PX pX = this;
        pX.j = a2;
        Object object = b2 = pX.J().iterator();
        while (object.hasNext()) {
            ((cd)b2.next()).f(pX, (int)a2);
            object = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3) {
        Object c2;
        void a2;
        void b2;
        PX pX = this;
        pX.L = b2;
        pX.g = a2;
        Object object = c2 = pX.J().iterator();
        while (object.hasNext()) {
            ((cd)c2.next()).J(pX, (double)b2, (double)a2);
            object = c2;
        }
    }

    public double J(vL vL2) {
        PX b2 = vL2;
        PX a2 = this;
        return a2.J(((vL)b2).la, ((vL)b2).A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, long l2) {
        Object d4;
        void a2;
        void b2;
        void c2;
        PX pX;
        PX pX2 = pX = this;
        PX pX3 = pX;
        pX3.k = c2;
        pX3.J = b2;
        pX2.M = System.currentTimeMillis();
        pX2.m = pX2.M + a2;
        Object object = d4 = pX2.J().iterator();
        while (object.hasNext()) {
            ((cd)d4.next()).J(pX, (double)c2, (double)b2, (long)a2);
            object = d4;
        }
    }

    public boolean J(Baa baa2) {
        PX b2 = baa2;
        PX a2 = this;
        if ((double)b2.C() > a2.J() && (double)b2.d() < a2.i() && (double)b2.l() > a2.e() && (double)b2.f() < a2.d()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(xy xy2) {
        PX b2 = xy2;
        PX a2 = this;
        if (((xy)b2).A > a2.J() && ((xy)b2).J < a2.i() && ((xy)b2).k > a2.e() && ((xy)b2).I < a2.d()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double e() {
        double d2;
        PX a2;
        double d3 = a2.C() - a2.A() / KPa.y;
        if (d2 < (double)(-a2.A)) {
            d3 = -a2.A;
        }
        return d3;
    }

    public double d() {
        double d2;
        PX a2;
        double d3 = a2.C() + a2.A() / KPa.y;
        if (d2 > (double)a2.A) {
            d3 = a2.A;
        }
        return d3;
    }

    public double C() {
        PX a2;
        return a2.g;
    }

    public double l() {
        PX a2;
        if (a2.m == a2.M) {
            return aSa.V;
        }
        return Math.abs(a2.k - a2.J) / (double)(a2.m - a2.M);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2) {
        Object b2;
        void a2;
        PX pX = this;
        pX.I = a2;
        Object object = b2 = pX.J().iterator();
        while (object.hasNext()) {
            ((cd)b2.next()).J(pX, (int)a2);
            object = b2;
        }
    }

    public double f() {
        PX a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void f(double d2) {
        Object b2;
        void a2;
        PX pX = this;
        pX.i = a2;
        Object object = b2 = pX.J().iterator();
        while (object.hasNext()) {
            ((cd)b2.next()).l(pX, (double)a2);
            object = b2;
        }
    }

    public double J(double b2, double a2) {
        PX c2;
        double d2 = a2 - c2.e();
        a2 = c2.d() - a2;
        PX pX = c2;
        double d3 = b2 - pX.J();
        b2 = pX.i() - b2;
        return Math.min(Math.min(Math.min(d3, b2), d2), a2);
    }

    public long J() {
        PX a2;
        if (a2.J() != qaa.STATIONARY) {
            return a2.m - System.currentTimeMillis();
        }
        return nqa.i;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2) {
        Object b2;
        void a2;
        Object object;
        PX pX = object;
        pX.k = a2;
        pX.J = a2;
        ((PX)(object = this)).M = ((PX)(object = this)).m = System.currentTimeMillis();
        object = this;
        Object object2 = b2 = ((PX)object).J().iterator();
        while (object2.hasNext()) {
            ((cd)b2.next()).f((PX)object, (double)a2);
            object2 = b2;
        }
    }

    public double J() {
        double d2;
        PX a2;
        double d3 = a2.D() - a2.A() / KPa.y;
        if (d2 < (double)(-a2.A)) {
            d3 = -a2.A;
        }
        return d3;
    }

    public void J(cd cd2) {
        cd b2 = cd2;
        PX a2 = this;
        a2.C.add(b2);
    }

    public void J(int n2) {
        int b2 = n2;
        PX a2 = this;
        a2.A = b2;
    }

    public boolean J(XF xF) {
        Object b2 = xF;
        PX a2 = this;
        if ((double)(b2.getX() + vRa.d) > a2.J() && (double)b2.getX() < a2.i() && (double)(b2.getZ() + vRa.d) > a2.e() && (double)b2.getZ() < a2.d()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<cd> J() {
        PX a2;
        return Lists.newArrayList(a2.C);
    }
}

