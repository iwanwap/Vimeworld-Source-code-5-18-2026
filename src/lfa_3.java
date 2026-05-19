/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Dc
 *  HA
 *  Mda
 *  Uz
 *  ld
 *  vRa
 *  ysa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lfa_3
implements HA {
    private Mda[] k;
    private final Dc j;
    private Uz J;
    private int A;
    private final Sx I;

    public boolean J(int n2, Mda mda2) {
        lfa_3 c2 = mda2;
        lfa_3 a2 = this;
        return vRa.d != 0;
    }

    public ld J() {
        lfa_3 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public int J(int n2) {
        int b2 = n2;
        lfa_3 a2 = this;
        return uSa.E;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public int l() {
        return ysa.s;
    }

    public int f() {
        lfa_3 a2;
        return a2.k.length;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void f() {
        lfa_3 a2;
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        void b2;
        lfa_3 c2 = mda2;
        lfa_3 a2 = this;
        a2.k[b2] = c2;
        if (a2.k[b2] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
        if (a2.J((int)b2)) {
            a2.J();
        }
    }

    public Uz J() {
        lfa_3 a2;
        return a2.J;
    }

    public void l() {
        int a2;
        lfa_3 lfa_32 = this;
        int n2 = a2 = uSa.E;
        while (n2 < lfa_32.k.length) {
            lfa_32.k[a2++] = null;
            n2 = a2;
        }
    }

    public int J() {
        return uSa.E;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        lfa_3 a2 = this;
        if (a2.j.J() == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public lfa_3(Sx sx2, Dc dc2) {
        void b2;
        lfa_3 c2 = dc2;
        lfa_3 a2 = this;
        a2.k = new Mda[yRa.d];
        lfa_3 lfa_32 = a2;
        lfa_32.I = b2;
        lfa_32.j = c2;
    }

    /*
     * Unable to fully structure code
     */
    public void J() {
        block8: {
            block7: {
                v0 = var1_1 = this;
                v0.J = null;
                var4_2 = v0.k[uSa.E];
                var2_3 = v0.k[vRa.d];
                if (var4_2 == null) {
                    var4_2 = var2_3;
                    var2_3 = null;
                }
                if (var4_2 != null) break block7;
                var1_1.J(uqa.g, null);
                v1 = var1_1;
                break block8;
            }
            v2 = var1_1;
            var3_4 = v2.j.J(v2.I);
            if (var3_4 == null) ** GOTO lbl35
            a = var3_4.canRecipeBeUsed(var4_2, var2_3, var1_1.A);
            if (a != null && !a.l()) {
                v3 = var1_1;
                v1 = v3;
                v3.J = a;
                v3.J(uqa.g, a.l().J());
            } else if (var2_3 != null) {
                a = var3_4.canRecipeBeUsed(var2_3, var4_2, var1_1.A);
                if (a != null && !a.l()) {
                    v4 = var1_1;
                    v1 = v4;
                    v4.J = a;
                    v4.J(uqa.g, a.l().J());
                } else {
                    var1_1.J(uqa.g, null);
                    v1 = var1_1;
                }
            } else {
                var1_1.J(uqa.g, null);
lbl35:
                // 2 sources

                v1 = var1_1;
            }
        }
        v1.j.J(var1_1.J(uqa.g));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        lfa_3 b2 = this;
        if (b2.k[c2] != null) {
            void a2;
            if (c2 == uqa.g) {
                lfa_3 lfa_32 = b2;
                Mda mda2 = lfa_32.k[c2];
                lfa_32.k[c2] = null;
                return mda2;
            }
            if (b2.k[c2].E <= a2) {
                lfa_3 lfa_33 = b2;
                Mda mda3 = lfa_33.k[c2];
                lfa_33.k[c2] = null;
                if (lfa_33.J(c2)) {
                    b2.J();
                }
                return mda3;
            }
            lfa_3 lfa_34 = b2;
            Mda mda4 = lfa_34.k[c2].J((int)a2);
            if (lfa_34.k[c2].E == 0) {
                b2.k[c2] = null;
            }
            if (b2.J(c2)) {
                b2.J();
            }
            return mda4;
        }
        return null;
    }

    public void J(int n2) {
        int b2 = n2;
        lfa_3 a2 = this;
        a2.A = b2;
        a2.J();
    }

    private boolean J(int n2) {
        int b2 = n2;
        lfa_3 a2 = this;
        if (b2 == 0 || b2 == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        return Yqa.J;
    }

    public Mda J(int n2) {
        int b2 = n2;
        lfa_3 a2 = this;
        return a2.k[b2];
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        lfa_3 lfa_32 = this;
    }

    public Mda f(int n2) {
        int b2 = n2;
        lfa_3 a2 = this;
        if (a2.k[b2] != null) {
            lfa_3 lfa_32 = a2;
            Mda mda2 = lfa_32.k[b2];
            lfa_32.k[b2] = null;
            return mda2;
        }
        return null;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }
}

