/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  E
 *  ad
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ad_1
implements E {
    public double k;
    public double j;
    public double J;
    public boolean A;
    public double I;

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        void a2;
        int c2 = n2;
        ad_1 b2 = this;
        int n4 = (double)c2 >= b2.I && (double)a2 >= b2.J && (double)c2 < b2.I + b2.k && (double)a2 < b2.J + b2.j ? vRa.d : uSa.E;
        c2 = b2.A ? 1 : 0;
        b2.A = n4;
        if (n4 != c2) {
            b2.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ad_1(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        ad_1 a2;
        int n6 = n5;
        ad_1 ad_12 = a2 = this;
        ad_1 ad_13 = a2;
        ad_13.I = (double)d2;
        ad_13.J = (double)c2;
        ad_12.k = (double)b2;
        ad_12.j = (double)e2;
    }

    public double C() {
        ad_1 a2;
        return a2.J;
    }

    public boolean f() {
        ad_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        ad_1 a2 = this;
        a2.f((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public ad_1(int n2, int n3) {
        void b2;
        int c2 = n3;
        ad_1 a2 = this;
        a2((int)b2, c2, uSa.E, uSa.E);
    }

    public void f() {
    }

    public ad_1() {
        a2(uSa.E, uSa.E);
        ad_1 a2;
    }

    public double l() {
        ad_1 a2;
        return a2.k;
    }

    public void C(double a2) {
        b.I = a2;
    }

    public void l(double a2) {
        b.J = a2;
    }

    public double f() {
        ad_1 a2;
        return a2.I;
    }

    public ad J(boolean bl) {
        boolean b2 = bl;
        ad_1 a2 = this;
        a2.A = b2;
        return a2;
    }

    public void f(double a2) {
        b.j = a2;
    }

    public void J(double a2) {
        b.k = a2;
    }

    public double J() {
        ad_1 a2;
        return a2.j;
    }
}

