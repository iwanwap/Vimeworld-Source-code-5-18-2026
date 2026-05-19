/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NQa
 *  Rua
 *  pua
 *  vRa
 *  wd
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ag_3 {
    private final String J;
    private final int A;
    private final List<qE> I;

    public List<qE> J() {
        ag_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2) {
        int n2;
        void a2;
        qE qE2;
        ag_3 ag_32 = this;
        int n3 = ag_32.I.size();
        if (n3 == 0) {
            return JPa.N;
        }
        if (n3 == vRa.d) {
            return ag_32.I.get(uSa.E).J();
        }
        Object b2 = ag_32.I.get(uSa.E);
        if (qE2.f() > a2) {
            return ((qE)b2).J();
        }
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            qE qE3;
            b2 = ag_32.I.get(n2);
            if (qE3.f() > a2 && n2 != 0) {
                qE qE4 = ag_32.I.get(n2 - vRa.d);
                void var6_6 = (a2 - qE4.f()) / (((qE)b2).f() - qE4.f());
                return qE4.J((float)var6_6, (qE)b2);
            }
            n4 = ++n2;
        }
        return ((qE)b2).J();
    }

    public int J() {
        ag_3 a2;
        return a2.A;
    }

    public String J() {
        ag_3 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public ag_3(String string, int n2) {
        void b2;
        ag_3 a2;
        int c2 = n2;
        ag_3 ag_32 = a2 = this;
        ag_3 ag_33 = a2;
        ag_33.I = new ArrayList<qE>();
        ag_32.J = b2;
        ag_32.A = c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(wd wd2, float f2, float f3) {
        int n2;
        ag_3 b2;
        float d2;
        block16: {
            d2 = f2;
            ag_3 ag_32 = b2 = this;
            d2 = ag_32.J(d2);
            String string = ag_32.J;
            int n3 = pua.o;
            switch (string.hashCode()) {
                case 1901043637: {
                    if (!string.equals(AQa.Ia)) break;
                    n2 = n3 = uSa.E;
                    break block16;
                }
                case -40300674: {
                    if (!string.equals(NQa.ja)) break;
                    n2 = n3 = vRa.d;
                    break block16;
                }
                case 109250890: {
                    if (!string.equals(Rua.C)) break;
                    n3 = uqa.g;
                }
            }
            n2 = n3;
        }
        switch (n2) {
            case 0: {
                void a2;
                void c2;
                if (b2.A == 0) {
                    void v2 = c2;
                    v2.D(d2 + (v2.A() - d2) * a2);
                    return;
                }
                if (b2.A == vRa.d) {
                    void v3 = c2;
                    v3.e(d2 + (v3.i() - d2) * a2);
                    return;
                }
                if (b2.A != uqa.g) return;
                void v4 = c2;
                v4.A(d2 + (v4.C() - d2) * a2);
                return;
            }
            case 1: {
                void a2;
                void c2;
                if (b2.A == 0) {
                    void v5 = c2;
                    v5.J(d2 + (v5.d() - d2) * a2);
                    return;
                }
                if (b2.A == vRa.d) {
                    void v6 = c2;
                    v6.C(d2 + (v6.M() - d2) * a2);
                    return;
                }
                if (b2.A != uqa.g) return;
                void v7 = c2;
                v7.d(d2 + (v7.f() - d2) * a2);
                return;
            }
            case 2: {
                void a2;
                void c2;
                if (b2.A == 0) {
                    void v8 = c2;
                    v8.M(d2 + (v8.e() - d2) * a2);
                    return;
                }
                if (b2.A == vRa.d) {
                    void v9 = c2;
                    v9.l(d2 + (v9.J() - d2) * a2);
                    return;
                }
                if (b2.A != uqa.g) return;
                void v10 = c2;
                v10.i(d2 + (v10.l() - d2) * a2);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public qE J(float f2, boolean bl) {
        int c2;
        ag_3 ag_32 = this;
        int n2 = ag_32.I.size();
        if (n2 == 0) {
            return null;
        }
        if (n2 == vRa.d) {
            return ag_32.I.get(uSa.E);
        }
        qE qE2 = null;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void b2;
            qE qE3;
            qE2 = ag_32.I.get(c2);
            if (qE3.f() > b2 && c2 != 0) {
                void a2;
                if (a2 != false) {
                    return qE2;
                }
                return ag_32.I.get(c2 - vRa.d);
            }
            n3 = ++c2;
        }
        return qE2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(wd wd2, float f2) {
        int n2;
        ag_3 a2;
        float c2;
        block16: {
            c2 = f2;
            a2 = this;
            String string = a2.J;
            int n3 = pua.o;
            switch (string.hashCode()) {
                case 1901043637: {
                    if (!string.equals(AQa.Ia)) break;
                    n2 = n3 = uSa.E;
                    break block16;
                }
                case -40300674: {
                    if (!string.equals(NQa.ja)) break;
                    n2 = n3 = vRa.d;
                    break block16;
                }
                case 109250890: {
                    if (!string.equals(Rua.C)) break;
                    n3 = uqa.g;
                }
            }
            n2 = n3;
        }
        switch (n2) {
            case 0: {
                void b2;
                if (a2.A == 0) {
                    b2.D(a2.J(c2));
                    return;
                }
                if (a2.A == vRa.d) {
                    b2.e(a2.J(c2));
                    return;
                }
                if (a2.A != uqa.g) return;
                b2.A(a2.J(c2));
                return;
            }
            case 1: {
                void b2;
                if (a2.A == 0) {
                    b2.J(a2.J(c2));
                    return;
                }
                if (a2.A == vRa.d) {
                    b2.C(a2.J(c2));
                    return;
                }
                if (a2.A != uqa.g) return;
                b2.d(a2.J(c2));
                return;
            }
            case 2: {
                void b2;
                if (a2.A == 0) {
                    b2.M(a2.J(c2));
                    return;
                }
                if (a2.A == vRa.d) {
                    b2.l(a2.J(c2));
                    return;
                }
                if (a2.A != uqa.g) return;
                b2.i(a2.J(c2));
                return;
            }
        }
    }
}

