/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MQa
 *  Mda
 *  Tz
 *  eAa
 *  kba
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class YCa
extends eAa {
    private final float m;
    public final int C;
    private final boolean i;
    private boolean M;
    private int k;
    private float j;
    private final int J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Mda f(Mda mda2, Gg gg2, Sx sx2) {
        void b2;
        void c2;
        Sx d2 = sx2;
        YCa a2 = this;
        void v0 = c2;
        v0.E -= vRa.d;
        Sx sx3 = d2;
        sx3.J().J(a2, (Mda)c2);
        b2.J((vL)sx3, rQa.z, MQa.L, b2.v.nextFloat() * Nra.e + ATa.r);
        a2.f((Mda)c2, (Gg)b2, d2);
        d2.J(Tz.H[eAa.J((eAa)a2)]);
        return v0;
    }

    /*
     * WARNING - void declaration
     */
    public YCa(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        YCa a2 = this;
        a2((int)b2, Ora.D, c2);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        Sx d2 = sx2;
        YCa a2 = this;
        if (d2.J(a2.M)) {
            void v0 = c2;
            d2.f((Mda)v0, a2.J((Mda)v0));
        }
        return c2;
    }

    public boolean A() {
        YCa a2;
        return a2.i;
    }

    public YCa J() {
        YCa a2;
        a2.M = vRa.d;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public YCa(int n2, float f2, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        YCa a2 = this;
        a2.C = fPa.i;
        a2.J = c2;
        a2.i = d2;
        a2.m = b2;
        a2.J(yGa.i);
    }

    public int f(Mda mda2) {
        YCa b2 = mda2;
        YCa a2 = this;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Mda mda2, Gg gg2, Sx sx2) {
        YCa d2 = gg2;
        YCa b2 = this;
        if (!((Gg)d2).e && b2.k > 0 && ((Gg)d2).v.nextFloat() < b2.j) {
            void a2;
            YCa yCa2 = b2;
            a2.J(new kba(yCa2.k, yCa2.A * kTa.j, b2.I));
        }
    }

    public float J(Mda mda2) {
        YCa b2 = mda2;
        YCa a2 = this;
        return a2.m;
    }

    public YFa J(Mda mda2) {
        YCa b2 = mda2;
        YCa a2 = this;
        return YFa.EAT;
    }

    public int J(Mda mda2) {
        YCa b2 = mda2;
        YCa a2 = this;
        return fPa.i;
    }

    /*
     * WARNING - void declaration
     */
    public YCa J(int n2, int n3, int n4, float f2) {
        void e2;
        void b2;
        void c2;
        void d2;
        YCa a2;
        float f3 = f2;
        YCa yCa2 = a2 = this;
        yCa2.k = d2;
        yCa2.A = c2;
        a2.I = b2;
        a2.j = e2;
        return a2;
    }
}

