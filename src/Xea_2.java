/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  HA
 *  Mda
 *  ld
 *  vRa
 *  ysa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xea_2
implements HA {
    private Mda[] I = new Mda[vRa.d];

    public boolean J() {
        return uSa.E != 0;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public String J() {
        return Eqa.L;
    }

    public int l() {
        return ysa.s;
    }

    public Xea_2() {
        Xea_2 a2;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        Xea_2 a2 = this;
        return vRa.d != 0;
    }

    public Mda J(int n2, int n3) {
        int c22 = n2;
        Xea_2 b2 = this;
        if (b2.I[uSa.E] != null) {
            Xea_2 xea_2 = b2;
            Mda c22 = xea_2.I[uSa.E];
            xea_2.I[uSa.E] = null;
            return c22;
        }
        return null;
    }

    public void l() {
        int a2;
        Xea_2 xea_2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < xea_2.I.length) {
            xea_2.I[a2++] = null;
            n2 = a2;
        }
    }

    public int J(int n2) {
        int b2 = n2;
        Xea_2 a2 = this;
        return uSa.E;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public Mda f(int n2) {
        int b22 = n2;
        Xea_2 a2 = this;
        if (a2.I[uSa.E] != null) {
            Xea_2 xea_2 = a2;
            Mda b22 = xea_2.I[uSa.E];
            xea_2.I[uSa.E] = null;
            return b22;
        }
        return null;
    }

    public ld J() {
        Xea_2 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public Mda J(int n2) {
        int b2 = n2;
        Xea_2 a2 = this;
        return a2.I[uSa.E];
    }

    public boolean J(int n2, Mda mda2) {
        Xea_2 c2 = mda2;
        Xea_2 a2 = this;
        return vRa.d != 0;
    }

    public void f() {
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        Xea_2 xea_2 = this;
    }

    public int J() {
        return uSa.E;
    }

    public void J(int n2, Mda mda2) {
        Xea_2 c2 = mda2;
        Xea_2 a2 = this;
        a2.I[uSa.E] = c2;
    }

    public int f() {
        return vRa.d;
    }
}

