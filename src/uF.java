/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  pqa
 *  vRa
 *  wOa
 */
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uF {
    private ArrayList j;
    private int J;
    private float A;
    private int I;

    public int f() {
        uF a2;
        return a2.J;
    }

    public uF(int n2) {
        int b2 = n2;
        uF a2 = this;
        a2(b2, wOa.w);
    }

    public boolean f(Object object) {
        Object b2 = object;
        uF a2 = this;
        return a2.j.contains(b2);
    }

    public uF() {
        a2(NTa.C, wOa.w);
        uF a2;
    }

    public Object f(int n2) {
        int b22 = n2;
        uF a2 = this;
        Object b22 = a2.j.remove(b22);
        if (b22 != null) {
            a2.J -= vRa.d;
        }
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Object object) {
        void b2;
        Object c2 = object;
        uF a2 = this;
        if (c2 != null) {
            a2.J += vRa.d;
        }
        a2.j.add((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public Object J(int n2, Object object) {
        void a2;
        int c22 = n2;
        uF b2 = this;
        void c22 = b2.j.set(c22, a2);
        if (a2 != c22) {
            if (c22 == null) {
                b2.J += vRa.d;
            }
            if (a2 == null) {
                b2.J -= vRa.d;
            }
        }
        return c22;
    }

    public Object J(int n2) {
        int b2 = n2;
        uF a2 = this;
        return a2.j.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public uF(int n2, float f2) {
        void a2;
        uF b2;
        int c2 = n2;
        uF uF2 = b2 = this;
        uF uF3 = b2;
        uF3.j = null;
        b2.I = uSa.E;
        uF3.A = pqa.r;
        uF3.J = uSa.E;
        uF uF4 = b2;
        uF3.j = new ArrayList(c2);
        uF2.I = c2;
        uF2.A = a2;
    }

    public int J() {
        uF a2;
        return a2.j.size();
    }

    public void f() {
        uF a2;
        a2.j.clear();
        a2.J = uSa.E;
    }

    public void J() {
        uF uF2 = this;
        if (uF2.J <= 0 && uF2.j.size() <= 0) {
            uF2.f();
            return;
        }
        if (uF2.j.size() > uF2.I && (float)uF2.J * pqa.r / (float)uF2.j.size() <= uF2.A) {
            int a2;
            int n2 = uSa.E;
            int n3 = a2 = uSa.E;
            while (n3 < uF2.j.size()) {
                Object e2 = uF2.j.get(a2);
                if (e2 != null) {
                    if (a2 != n2) {
                        uF2.j.set(n2, e2);
                    }
                    ++n2;
                }
                n3 = ++a2;
            }
            int n4 = a2 = uF2.j.size() - vRa.d;
            while (n4 >= n2) {
                uF2.j.remove(a2--);
                n4 = a2;
            }
        }
    }

    public boolean J(Object object) {
        Object b2 = object;
        uF a2 = this;
        if (b2 != null) {
            a2.J += vRa.d;
        }
        return a2.j.add(b2);
    }

    public boolean J() {
        uF a2;
        return a2.j.isEmpty();
    }
}

