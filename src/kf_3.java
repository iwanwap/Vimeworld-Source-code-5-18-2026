/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  KE
 *  Xd
 *  pqa
 *  ue
 *  vRa
 *  wd
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kf_3 {
    private int L;
    private boolean E;
    private final int m;
    private Xd C;
    private CE i;
    private boolean M;
    private int k;
    private float j;
    private boolean J;
    private float A;
    private ue I;

    public void C() {
        kf_3 a2;
        if (a2.i.f()) {
            kf_3 kf_32;
            a2.j = Math.copySign(pqa.r, kf_32.A) < JPa.N ? (float)a2.m : JPa.N;
        }
        a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public void f(Xd xd2, float f2) {
        Object c2;
        kf_3 kf_32 = this;
        Object object = c2 = kf_32.I.J().values().iterator();
        while (object.hasNext()) {
            void a2;
            void b2;
            KE kE2 = (KE)c2.next();
            wd wd2 = (wd)b2.J().get(kE2.J());
            if (wd2 == null) {
                object = c2;
                continue;
            }
            kE2.J(wd2, kf_32.J((float)a2));
            object = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public kf_3(ue ue2, CE cE2, boolean bl2, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n3 = n2;
        kf_3 a2 = this;
        a2((ue)d2, (CE)c2, (boolean)b2);
        a2.k = e2;
    }

    public void f(float f2) {
        float b2 = f2;
        kf_3 a2 = this;
        a2.j = b2;
    }

    public void l() {
        kf_3 a2;
        if (a2.E && a2.L > 0) {
            a2.L -= vRa.d;
            return;
        }
        if (!a2.J) {
            return;
        }
        kf_3 kf_32 = a2;
        kf_32.j += a2.A;
        if (!kf_32.M && !a2.E) {
            kf_3 kf_33 = a2;
            if (kf_33.j >= (float)kf_33.m) {
                a2.J();
            }
        }
        if (a2.M) {
            kf_3 kf_34 = a2;
            if (kf_34.j >= (float)kf_34.m && a2.A > JPa.N && a2.i.l()) {
                kf_3 kf_35 = a2;
                a2.j -= (float)kf_35.m;
                kf_35.j += (float)a2.i.J();
                return;
            }
            if (a2.j < JPa.N && a2.A < JPa.N && a2.i.l()) {
                kf_3 kf_36 = a2;
                a2.j = (float)a2.m + kf_36.j;
                kf_36.j -= (float)a2.i.J();
            }
        }
    }

    public boolean l() {
        kf_3 a2;
        if (a2.E && a2.L <= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ue J() {
        kf_3 a2;
        return a2.I;
    }

    public boolean f() {
        kf_3 a2;
        if (a2.E && a2.L > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        kf_3 a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public kf_3(ue ue2, CE cE2) {
        void b2;
        CE c2 = cE2;
        kf_3 a2 = this;
        a2((ue)b2, c2, vRa.d != 0);
    }

    public boolean J() {
        kf_3 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public kf_3(ue ue2, CE cE2, boolean bl2) {
        void a2;
        void b2;
        kf_3 c2;
        kf_3 d2 = ue2;
        kf_3 kf_32 = c2 = this;
        c2.A = pqa.r;
        c2.M = uSa.E;
        c2.E = uSa.E;
        c2.J = vRa.d;
        kf_32.I = d2;
        kf_32.i = b2;
        c2.m = d2.J();
        c2.M = a2;
        c2.J(pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xd xd2, float f2) {
        Object c2;
        kf_3 kf_32 = this;
        Object object = c2 = kf_32.I.J().values().iterator();
        while (object.hasNext()) {
            void a2;
            void b2;
            KE kE2 = (KE)c2.next();
            wd wd2 = (wd)b2.J().get(kE2.J());
            if (wd2 == null) {
                object = c2;
                continue;
            }
            kE2.J(wd2, kf_32.j, (float)a2);
            object = c2;
        }
    }

    public void J(float f2) {
        float b2 = f2;
        kf_3 a2 = this;
        a2.A = b2 * a2.i.J();
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        kf_3 a2 = this;
        a2.J = b2;
    }

    public void J(Xd xd2) {
        kf_3 b2 = xd2;
        kf_3 a2 = this;
        a2.C = b2;
    }

    public float f() {
        kf_3 a2;
        return a2.j;
    }

    public void J(int n2) {
        int b2 = n2;
        kf_3 a2 = this;
        a2.k = b2;
    }

    public int J() {
        kf_3 a2;
        return a2.k;
    }

    public float f(float f2) {
        float b2 = f2;
        kf_3 a2 = this;
        return ((float)a2.L - b2) / a2.i.f();
    }

    public float J(float f2) {
        kf_3 a2;
        float b2 = f2;
        kf_3 kf_32 = a2 = this;
        b2 = a2.j + b2 * kf_32.A;
        if (kf_32.M) {
            if (b2 >= (float)a2.m && a2.A > JPa.N && a2.i.l()) {
                return b2 -= (float)a2.m;
            }
            if (a2.j < JPa.N && a2.A < JPa.N && a2.i.l()) {
                b2 = (float)a2.m + b2;
            }
        }
        return b2;
    }

    public void J(ue ue2) {
        kf_3 b2 = ue2;
        kf_3 a2 = this;
        a2.I = b2;
    }

    public float J() {
        kf_3 a2;
        return a2.A;
    }

    public void f() {
        kf_3 a2;
        kf_3 kf_32 = a2;
        kf_32.L = uSa.E;
        kf_32.E = uSa.E;
    }

    public Xd J() {
        kf_3 a2;
        return a2.C;
    }

    public void J(CE cE2) {
        CE b2 = cE2;
        kf_3 a2 = this;
        a2.i = b2;
    }

    public void J() {
        kf_3 a2;
        a2.L = (int)a2.i.f();
        a2.E = vRa.d;
    }
}

