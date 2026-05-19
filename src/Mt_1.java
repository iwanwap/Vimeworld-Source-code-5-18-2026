/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Mt
 *  jt
 *  pqa
 *  qu
 *  vRa
 */
public final class Mt_1 {
    private final int m;
    private String C;
    public final /* synthetic */ qu i;
    private int M;
    private int k;
    public final Mda j;
    private int J;
    private final int A;
    private int I;

    public static /* synthetic */ int f(Mt a2) {
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2, int n2, int n3) {
        void a2;
        void b2;
        void c2;
        int n4;
        int n5;
        int d2;
        int n6;
        Mt_1 mt_1;
        Mt_1 mt_12 = this;
        if (jt.M) {
            if (jt.i) {
                Mt_1 mt_13 = mt_12;
                mt_1 = mt_13;
                Mt_1 mt_14 = mt_12;
                n6 = qu.f((qu)mt_13.i) - mt_14.m - uqa.g;
                d2 = (mt_13.I - mt_12.A) / uqa.g;
                n5 = uqa.g;
                n4 = (mt_14.I - mt_12.J) / uqa.g;
            } else {
                n6 = uqa.g;
                Mt_1 mt_15 = mt_12;
                Mt_1 mt_16 = mt_12;
                mt_1 = mt_16;
                d2 = (mt_15.I - mt_16.A) / uqa.g;
                n5 = uqa.g + mt_12.m + uqa.g;
                n4 = (mt_15.I - mt_12.J) / uqa.g;
            }
        } else {
            Mt_1 mt_17 = mt_12;
            if (jt.i) {
                n6 = (mt_17.k - mt_12.m) / uqa.g;
                Mt_1 mt_18 = mt_12;
                Mt_1 mt_19 = mt_12;
                mt_1 = mt_19;
                d2 = qu.J((qu)mt_18.i) - mt_19.A;
                n5 = (mt_18.k - mt_12.M) / uqa.g;
                n4 = uSa.E;
            } else {
                n6 = (mt_17.k - mt_12.m) / uqa.g;
                d2 = uSa.E;
                Mt_1 mt_110 = mt_12;
                Mt_1 mt_111 = mt_12;
                mt_1 = mt_111;
                n5 = (mt_110.k - mt_111.M) / uqa.g;
                n4 = mt_110.A;
            }
        }
        qu.f((qu)mt_1.i, (long)c2, (Mda)mt_12.j, (int)(b2 + n6), (int)(a2 + d2));
        Mt_1 mt_112 = mt_12;
        qu.J((qu)mt_112.i, (long)c2, (Mda)mt_12.j, (int)(b2 + n6), (int)(a2 + d2));
        if (mt_112.C.length() > 0) {
            mt_12.i.J((long)c2, mt_12.C, (float)(b2 + n5), (float)(a2 + n4), pqa.r, uSa.E != 0, jt.x, jt.e, vRa.d != 0);
        }
    }

    private void J() {
        Mt_1 mt_1 = this;
        if (jt.m != 0 && mt_1.j.d()) {
            Mt_1 mt_12;
            int n2 = mt_1.j.l();
            int a2 = n2 - mt_1.j.f();
            if (jt.m == vRa.d) {
                mt_12 = mt_1;
                mt_1.C = String.valueOf(a2);
            } else {
                if (jt.m == uqa.g) {
                    Mt_1 mt_13 = mt_1;
                    mt_13.C = a2 * ySa.T / n2 + Wqa.fa;
                }
                mt_12 = mt_1;
            }
            mt_12.M = mt_1.C.isEmpty() ? uSa.E : qu.J((qu)mt_1.i).Ea.J(mt_1.C);
            mt_1.J = mt_1.C.isEmpty() ? uSa.E : qu.J((qu)mt_1.i).Ea.u;
        }
        Mt_1 mt_14 = mt_1;
        if (jt.M) {
            mt_14.k = mt_1.m + uqa.g + mt_1.M;
            mt_1.I = Math.max(mt_1.J, mt_1.A);
            return;
        }
        Mt_1 mt_15 = mt_1;
        mt_14.k = Math.max(mt_15.M, mt_15.m);
        mt_1.I = mt_1.J + mt_1.A;
    }

    public static /* synthetic */ int J(Mt a2) {
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public Mt_1(qu qu2, Mda mda2, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        Mt_1 a2 = this;
        a2.i = d2;
        a2.C = Mqa.y;
        a2.j = c2;
        a2.m = b2;
        a2.A = e2;
        a2.J();
    }
}

