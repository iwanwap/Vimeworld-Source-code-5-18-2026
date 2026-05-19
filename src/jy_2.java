/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MD
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jy_2 {
    private boolean M;
    private final DZ k;
    private int j;
    private final XF J;
    private final XF A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public jy_2(XF xF2, int n2, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        jy_2 a2 = this;
        a2((XF)d2, jy_2.J((int)c2, (int)b2), (int)e2);
    }

    public boolean J(XF xF2) {
        Object b22 = xF2;
        jy_2 a2 = this;
        Object object = b22;
        int b22 = object.getX() - a2.A.getX();
        int n2 = object.getZ() - a2.A.getY();
        if (b22 * a2.k.getFrontOffsetX() + n2 * a2.k.getFrontOffsetZ() >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(int n2) {
        int b2 = n2;
        jy_2 a2 = this;
        a2.j = b2;
    }

    public void f() {
        a.I = uSa.E;
    }

    public int f(XF xF2) {
        Object b2 = xF2;
        jy_2 a2 = this;
        return (int)a2.J.distanceSq((MD)b2);
    }

    /*
     * WARNING - void declaration
     */
    public jy_2(XF xF2, DZ dZ2, int n2) {
        void a2;
        void b2;
        jy_2 c2;
        XF d2 = xF2;
        jy_2 jy_22 = c2 = this;
        c2.A = d2;
        c2.k = b2;
        jy_22.J = d2.offset(c2.k, uqa.g);
        jy_22.j = a2;
    }

    public void J() {
        a.I += vRa.d;
    }

    public XF f() {
        jy_2 a2;
        return a2.A;
    }

    public int J(XF xF2) {
        Object b2 = xF2;
        jy_2 a2 = this;
        return (int)b2.distanceSq(a2.f());
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        jy_2 a2 = this;
        a2.M = b2;
    }

    public int C() {
        jy_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        jy_2 a2 = this;
        return (int)a2.A.distanceSq((double)c2, (double)b2, d2);
    }

    public int l() {
        jy_2 a2;
        return a2.k.getFrontOffsetX() * uqa.g;
    }

    private static DZ J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (a2 < 0) {
            return DZ.WEST;
        }
        if (a2 > 0) {
            return DZ.EAST;
        }
        if (b2 < 0) {
            return DZ.NORTH;
        }
        return DZ.SOUTH;
    }

    public int f() {
        jy_2 a2;
        return a2.k.getFrontOffsetZ() * uqa.g;
    }

    public XF J() {
        jy_2 a2;
        return a2.J;
    }

    public boolean J() {
        jy_2 a2;
        return a2.M;
    }

    public int J() {
        jy_2 a2;
        return a2.I;
    }
}

