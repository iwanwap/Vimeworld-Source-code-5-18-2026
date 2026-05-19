/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Mda
 *  Waa
 *  YSa
 *  ZRa
 *  Zpa
 *  aSa
 *  gZ
 *  kPa
 *  kta
 *  lqa
 *  pqa
 *  vQa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uX_1 {
    private float k;
    private float j;
    private int J = kTa.j;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, float f2) {
        void a2;
        uX_1 b2;
        int c2 = n2;
        uX_1 uX_12 = b2 = this;
        uX_12.J = Math.min(c2 + uX_12.J, kTa.j);
        b2.k = Math.min(uX_12.k + (float)c2 * a2 * kta.v, (float)b2.J);
    }

    /*
     * Unable to fully structure code
     */
    public void J(Sx var1_1) {
        b = var1_1;
        a = this;
        var2_2 = b.j.J();
        v0 = a;
        v0.I = v0.J;
        if (!(v0.j > YSa.G)) ** GOTO lbl15
        v1 = a;
        v1.j -= YSa.G;
        if (v1.k > JPa.N) {
            v2 = b;
            a.k = Math.max(a.k - pqa.r, JPa.N);
        } else {
            if (var2_2 != sZ.PEACEFUL) {
                a.J = Math.max(a.J - vRa.d, uSa.E);
            }
lbl15:
            // 4 sources

            v2 = b;
        }
        if (v2.j.J().f(Ora.Y) && a.J >= yOa.B && b.n()) {
            v3 = a;
            v3.A += vRa.d;
            if (v3.A >= Fua.J) {
                b.e(pqa.r);
                a.J(vQa.q);
                a.A = uSa.E;
                return;
            }
        } else if (a.J <= 0) {
            v4 = a;
            v4.A += vRa.d;
            if (v4.A >= Fua.J) {
                if (b.f() > FRa.Ga || var2_2 == sZ.HARD || b.f() > pqa.r && var2_2 == sZ.NORMAL) {
                    b.J(gZ.D, pqa.r);
                }
                a.A = uSa.E;
                return;
            }
        } else {
            a.A = uSa.E;
        }
    }

    public int f() {
        uX_1 a2;
        return a2.I;
    }

    public void f(float f2) {
        float b2 = f2;
        uX_1 a2 = this;
        a2.k = b2;
    }

    public boolean J() {
        uX_1 a2;
        if (a2.J < kTa.j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        uX_1 a2;
        return a2.J;
    }

    public void J(int n2) {
        int b2 = n2;
        uX_1 a2 = this;
        a2.J = b2;
    }

    public float J() {
        uX_1 a2;
        return a2.k;
    }

    public uX_1() {
        uX_1 a2;
        a2.k = eua.C;
        a2.I = kTa.j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(YCa yCa2, Mda mda2) {
        void b2;
        uX_1 c2 = mda2;
        uX_1 a2 = this;
        a2.J(b2.f((Mda)c2), b2.J((Mda)c2));
    }

    public void J(float f2) {
        float b2 = f2;
        uX_1 a2 = this;
        a2.j = Math.min(a2.j + b2, ZRa.l);
    }

    public void f(Waa waa2) {
        uX_1 b2 = waa2;
        uX_1 a2 = this;
        if (b2.J(Zpa.v, zOa.v)) {
            uX_1 uX_12 = a2;
            uX_1 uX_13 = b2;
            a2.J = b2.J(Zpa.v);
            a2.A = uX_13.J(aSa.T);
            uX_12.k = uX_13.J(lqa.O);
            uX_12.j = b2.J(kPa.o);
        }
    }

    public void J(Waa waa2) {
        uX_1 b2 = waa2;
        uX_1 a2 = this;
        uX_1 uX_12 = b2;
        uX_12.J(Zpa.v, a2.J);
        uX_12.J(aSa.T, a2.A);
        uX_12.J(lqa.O, a2.k);
        uX_12.J(kPa.o, a2.j);
    }
}

