/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gl
 *  Hda
 *  Tpa
 *  Waa
 *  XSa
 *  ZRa
 *  Zpa
 *  hTa
 *  kba
 *  pPa
 *  vRa
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kba_2 {
    private static final Logger C = LogManager.getLogger();
    private int i;
    private boolean M;
    private boolean k;
    private int j;
    private boolean J;
    private boolean A;
    private int I;

    public kba_2(kba kba2) {
        kba_2 a2;
        kba_2 b2 = kba2;
        kba_2 kba_22 = a2 = this;
        kba_2 kba_23 = b2;
        kba_2 kba_24 = a2;
        kba_24.j = b2.j;
        kba_24.i = b2.i;
        a2.I = kba_23.I;
        kba_22.A = kba_23.A;
        kba_22.M = b2.M;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        kba_2 a2 = this;
        a2.k = b2;
    }

    public boolean l() {
        kba_2 a2;
        return a2.J;
    }

    public boolean f() {
        kba_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public kba_2(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        kba_2 a2 = this;
        a2((int)c2, (int)b2, d2, uSa.E != 0, vRa.d != 0);
    }

    public Waa J(Waa waa2) {
        kba_2 b2 = waa2;
        kba_2 a2 = this;
        kba_2 kba_22 = b2;
        kba_22.J(ZRa.Y, (byte)a2.f());
        kba_22.J(Zpa.N, (byte)a2.J());
        kba_22.J(EPa.S, a2.l());
        kba_22.J(XSa.B, a2.f());
        kba_22.J(FPa.g, a2.J());
        return kba_22;
    }

    public boolean J() {
        kba_2 a2;
        return a2.M;
    }

    public String toString() {
        kba_2 kba_22;
        kba_2 kba_23 = this;
        Object a2 = Mqa.y;
        if (kba_23.J() > 0) {
            a2 = new StringBuilder().insert(5 >> 3, kba_23.J()).append(lQa.Q).append(kba_23.J() + vRa.d).append(Tpa.h).append(kba_23.l()).toString();
            kba_22 = kba_23;
        } else {
            a2 = new StringBuilder().insert(3 & 4, kba_23.J()).append(Tpa.h).append(kba_23.l()).toString();
            kba_22 = kba_23;
        }
        if (kba_22.k) {
            a2 = new StringBuilder().insert(3 ^ 3, (String)a2).append(STa.E).toString();
        }
        if (!kba_23.M) {
            a2 = new StringBuilder().insert(2 & 5, (String)a2).append(fqa.q).toString();
        }
        if (Hda.A[kba_23.j].J()) {
            return new StringBuilder().insert(3 ^ 3, pPa.k).append((String)a2).append(hpa.b).toString();
        }
        return a2;
    }

    public boolean J(Gl gl2) {
        kba_2 b2 = gl2;
        kba_2 a2 = this;
        if (a2.i > 0) {
            kba_2 kba_22 = a2;
            if (Hda.A[a2.j].J(kba_22.i, kba_22.I)) {
                a2.J((Gl)b2);
            }
            a2.C();
        }
        if (a2.i > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private int C() {
        return a.i -= vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public kba_2(int n2, int n3) {
        void b2;
        int c2 = n3;
        kba_2 a2 = this;
        a2((int)b2, c2, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public kba_2(int n2, int n3, int n4, boolean bl, boolean bl2) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        kba_2 a2;
        boolean bl3 = bl2;
        kba_2 kba_22 = a2 = this;
        kba_2 kba_23 = a2;
        a2.j = e2;
        kba_23.i = d2;
        kba_23.I = c2;
        kba_22.A = b2;
        kba_22.M = f2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        kba_2 a2 = this;
        a2.J = b2;
    }

    public void J(kba kba2) {
        kba_2 kba_22;
        kba_2 b2 = kba2;
        kba_2 a2 = this;
        if (a2.j != b2.j) {
            C.warn(hTa.t);
        }
        if (b2.I > a2.I) {
            kba_22 = a2;
            a2.I = b2.I;
            a2.i = b2.i;
        } else if (b2.I == a2.I && a2.i < b2.i) {
            kba_22 = a2;
            a2.i = b2.i;
        } else {
            if (!b2.A && a2.A) {
                a2.A = b2.A;
            }
            kba_22 = a2;
        }
        kba_22.M = b2.M;
    }

    public int l() {
        kba_2 a2;
        return a2.i;
    }

    public static kba J(Waa waa2) {
        Waa waa3 = waa2;
        byte a2 = waa3.J(ZRa.Y);
        if (a2 >= 0 && a2 < Hda.A.length && Hda.A[a2] != null) {
            boolean bl;
            Waa waa4 = waa3;
            byte by2 = waa4.J(Zpa.N);
            int n2 = waa4.J(EPa.S);
            boolean bl2 = waa4.f(XSa.B);
            int bl22 = vRa.d;
            if (waa4.J(FPa.g, vRa.d)) {
                bl = waa3.f(FPa.g);
            }
            return new kba_2(a2, n2, by2, bl2, bl);
        }
        return null;
    }

    public int f() {
        kba_2 a2;
        return a2.j;
    }

    public int hashCode() {
        kba_2 a2;
        return a2.j;
    }

    public int J() {
        kba_2 a2;
        return a2.I;
    }

    public void J(Gl gl2) {
        kba_2 b2 = gl2;
        kba_2 a2 = this;
        if (a2.i > 0) {
            Hda.A[a2.j].J((Gl)b2, a2.I);
        }
    }

    public String J() {
        kba_2 a2;
        return Hda.A[a2.j].J();
    }

    public boolean equals(Object object) {
        Object b2 = object;
        kba_2 a2 = this;
        if (!(b2 instanceof kba_2)) {
            return uSa.E != 0;
        }
        b2 = (kba_2)b2;
        if (a2.j == ((kba_2)b2).j && a2.I == ((kba_2)b2).I && a2.i == ((kba_2)b2).i && a2.k == ((kba_2)b2).k && a2.A == ((kba_2)b2).A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

