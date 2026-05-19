/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Ega
 *  HA
 *  Mda
 *  ld
 *  vRa
 *  ysa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xFa
implements HA {
    private final int j;
    private final int J;
    private final Mda[] A;
    private final Ega I;

    public void J(int n2, Mda mda2) {
        xFa a2;
        xFa c2 = mda2;
        xFa xFa2 = a2 = this;
        xFa2.A[b] = c2;
        xFa2.I.J((HA)a2);
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public Mda f(int n2) {
        int b2 = n2;
        xFa a2 = this;
        if (a2.A[b2] != null) {
            xFa xFa2 = a2;
            Mda mda2 = xFa2.A[b2];
            xFa2.A[b2] = null;
            return mda2;
        }
        return null;
    }

    public Mda J(int n2) {
        int b2 = n2;
        xFa a2 = this;
        if (b2 >= a2.f()) {
            return null;
        }
        return a2.A[b2];
    }

    public int d() {
        xFa a2;
        return a2.J;
    }

    public int f() {
        xFa a2;
        return a2.A.length;
    }

    public String J() {
        return Upa.q;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        xFa b2 = this;
        if (b2.A[c2] != null) {
            void a2;
            if (b2.A[c2].E <= a2) {
                xFa xFa2 = b2;
                Mda mda2 = xFa2.A[c2];
                xFa2.A[c2] = null;
                xFa2.I.J((HA)b2);
                return mda2;
            }
            xFa xFa3 = b2;
            Mda mda3 = xFa3.A[c2].J((int)a2);
            if (xFa3.A[c2].E == 0) {
                b2.A[c2] = null;
            }
            b2.I.J((HA)b2);
            return mda3;
        }
        return null;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        xFa xFa2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(int n2, int n3) {
        void b2;
        int c2 = n3;
        xFa a2 = this;
        if (b2 >= 0 && b2 < a2.j && c2 >= 0 && c2 <= a2.J) {
            xFa xFa2 = a2;
            return xFa2.J((int)(b2 + c2 * xFa2.j));
        }
        return null;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void l() {
        int a2;
        xFa xFa2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < xFa2.A.length) {
            xFa2.A[a2++] = null;
            n2 = a2;
        }
    }

    public void f() {
    }

    /*
     * WARNING - void declaration
     */
    public xFa(Ega ega, int n2, int n3) {
        void c2;
        void b2;
        int d2 = n3;
        xFa a2 = this;
        a2.A = new Mda[b2 * d2];
        xFa xFa2 = a2;
        a2.I = c2;
        xFa2.j = b2;
        xFa2.J = d2;
    }

    public boolean J(int n2, Mda mda2) {
        xFa c2 = mda2;
        xFa a2 = this;
        return vRa.d != 0;
    }

    public int J() {
        return uSa.E;
    }

    public ld J() {
        xFa a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public int C() {
        xFa a2;
        return a2.j;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        xFa a2 = this;
        return vRa.d != 0;
    }

    public int J(int n2) {
        int b2 = n2;
        xFa a2 = this;
        return uSa.E;
    }

    public int l() {
        return ysa.s;
    }
}

