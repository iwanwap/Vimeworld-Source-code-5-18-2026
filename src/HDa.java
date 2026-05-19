/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  NTa
 *  OEa
 *  XTa
 *  gFa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class HDa
extends gFa {
    private double i;
    private boolean M;
    private double k;
    private int j;
    private double J;
    private double A;
    private bga I;

    public boolean f() {
        HDa a2;
        HDa hDa2 = this;
        if (!hDa2.M) {
            if (hDa2.I.G() >= ySa.T) {
                return uSa.E != 0;
            }
            if (hDa2.I.J().nextInt(hDa2.j) != 0) {
                return uSa.E != 0;
            }
        }
        if ((a2 = OEa.J((bga)hDa2.I, (int)NTa.C, (int)XTa.W)) == null) {
            return uSa.E != 0;
        }
        HDa hDa3 = hDa2;
        HDa hDa4 = a2;
        hDa2.J = ((Lz)hDa4).A;
        hDa3.A = ((Lz)hDa4).j;
        hDa3.i = ((Lz)a2).J;
        hDa2.M = uSa.E;
        return vRa.d != 0;
    }

    public void f(int n2) {
        int b2 = n2;
        HDa a2 = this;
        a2.j = b2;
    }

    public boolean l() {
        HDa a2;
        if (!a2.I.J().f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        HDa a2;
        a2.I.J().J(a2.J, a2.A, a2.i, a2.k);
    }

    /*
     * WARNING - void declaration
     */
    public HDa(bga bga2, double d2) {
        void a2;
        Object c2 = bga2;
        HDa b2 = this;
        b2((bga)((Object)c2), (double)a2, sOa.D);
    }

    /*
     * WARNING - void declaration
     */
    public HDa(bga bga2, double d2, int n2) {
        void d3;
        void b2;
        void c2;
        int n3 = n2;
        HDa a2 = this;
        a2.I = c2;
        a2.k = b2;
        a2.j = d3;
        a2.J(vRa.d);
    }

    public void C() {
        a.M = vRa.d;
    }
}

