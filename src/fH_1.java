/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Lqa
 *  MQa
 *  NPa
 *  OG
 *  Ppa
 *  Spa
 *  Ssa
 *  YI
 *  aSa
 *  fH
 *  mra
 *  pua
 *  vRa
 */
import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fH_1<T>
implements Iterable<T> {
    private OG<T> j;
    public T[] J;
    public int A;
    public boolean I;

    public fH_1(fH<? extends T> fH2) {
        fH<? extends T> b2 = fH2;
        fH<? extends T> a2 = this;
        fH<? extends T> fH3 = b2;
        fH<? extends T> fH4 = b2;
        super(fH4.I, fH4.A, b2.J.getClass().getComponentType());
        a2.A = fH3.A;
        System.arraycopy(fH3.J, uSa.E, a2.J, uSa.E, a2.A);
    }

    public fH_1(int n2) {
        int b2 = n2;
        fH_1<T> a2 = this;
        a2(vRa.d != 0, b2);
    }

    public int hashCode() {
        fH_1 fH_12 = this;
        if (!fH_12.I) {
            return super.hashCode();
        }
        fH_1 fH_13 = fH_12;
        T[] TArray = fH_13.J;
        int a2 = vRa.d;
        int n2 = uSa.E;
        int n3 = fH_13.A;
        int n4 = n2;
        while (n4 < n3) {
            a2 *= tua.U;
            T t2 = TArray[n2];
            if (t2 != null) {
                a2 += t2.hashCode();
            }
            n4 = ++n2;
        }
        return a2;
    }

    public boolean f() {
        fH_1 a2;
        if (a2.A > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void l(int n2, int n3) {
        int c2;
        int n4;
        void b2;
        void a2;
        fH_1 fH_12 = this;
        int n5 = fH_12.A;
        if (a2 >= n5) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(5 >> 3, Lqa.K).append((int)a2).append(Upa.n).append(fH_12.A).toString());
        }
        if (b2 > a2) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(2 & 5, Ppa.I).append((int)b2).append(mra.e).append((int)a2).toString());
        }
        fH_1 fH_13 = fH_12;
        T[] TArray = fH_13.J;
        void var5_7 = a2 - b2 + vRa.d;
        int n6 = n5 - var5_7;
        if (fH_13.I) {
            n4 = n6;
            void v2 = b2;
            System.arraycopy(TArray, (int)(b2 + var5_7), TArray, (int)v2, n5 - (v2 + var5_7));
        } else {
            c2 = Math.max(n6, (int)(a2 + vRa.d));
            n4 = n6;
            System.arraycopy(TArray, c2, TArray, (int)b2, n5 - c2);
        }
        int n7 = c2 = n4;
        while (n7 < n5) {
            TArray[c2++] = null;
            n7 = c2;
        }
        fH_12.A = n5 - var5_7;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(fH<? extends T> fH2, boolean bl) {
        T[] b2;
        fH_1 fH_12 = this;
        void v0 = b2;
        b2 = v0.J;
        int c2 = uSa.E;
        int n2 = v0.A;
        int n3 = c2;
        while (n3 < n2) {
            void a2;
            if (!fH_12.f(b2[c2], (boolean)a2)) {
                return uSa.E != 0;
            }
            n3 = ++c2;
        }
        return vRa.d != 0;
    }

    public T[] f() {
        fH_1 a2;
        if (a2.J.length != a2.A) {
            fH_1 fH_12 = a2;
            fH_12.l(fH_12.A);
        }
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        T[] TArray;
        void b2;
        int c2 = n3;
        fH_1 a2 = this;
        if (b2 >= a2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(5 >> 3, UOa.K).append((int)b2).append(Upa.n).append(a2.A).toString());
        }
        if (c2 >= a2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(2 & 5, Xpa.Y).append(c2).append(Upa.n).append(a2.A).toString());
        }
        T[] TArray2 = TArray = a2.J;
        T t2 = TArray2[b2];
        TArray2[b2] = TArray[c2];
        TArray[c2] = t2;
    }

    public void J(int n2) {
        int n3;
        int b2 = n2;
        fH_1 a2 = this;
        if (b2 < 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, kra.y).append(b2).toString());
        }
        if (a2.A <= b2) {
            return;
        }
        int n4 = n3 = b2;
        while (n4 < a2.A) {
            a2.J[n3++] = null;
            n4 = n3;
        }
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(fH<? extends T> fH2, boolean n2) {
        void b2;
        int n3;
        fH_1 a2;
        int c2 = n2;
        fH_1 fH_12 = a2 = this;
        int n4 = n3 = fH_12.A;
        T[] TArray = fH_12.J;
        if (c2 != 0) {
            c2 = uSa.E;
            int n5 = b2.A;
            int n6 = c2;
            while (n6 < n5) {
                T t2 = b2.J(c2);
                int n7 = uSa.E;
                while (n7 < n3) {
                    int n8;
                    if (t2 == TArray[n8]) {
                        --n3;
                        a2.f(n8);
                        break;
                    }
                    n7 = ++n8;
                }
                n6 = ++c2;
            }
        } else {
            c2 = uSa.E;
            int n9 = b2.A;
            int n10 = c2;
            while (n10 < n9) {
                T t3 = b2.J(c2);
                int n11 = uSa.E;
                while (n11 < n3) {
                    int n12;
                    if (t3.equals(TArray[n12])) {
                        --n3;
                        a2.f(n12);
                        break;
                    }
                    n11 = ++n12;
                }
                n10 = ++c2;
            }
        }
        if (n3 != n4) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(Object object) {
        int n2;
        Object b2 = object;
        T[] a2 = this;
        if (b2 == a2) {
            return vRa.d != 0;
        }
        if (!a2.I) {
            return uSa.E != 0;
        }
        if (!(b2 instanceof fH_1)) {
            return uSa.E != 0;
        }
        b2 = (fH_1)b2;
        if (!b2.I) {
            return uSa.E != 0;
        }
        int n3 = a2.A;
        if (n3 != b2.A) {
            return uSa.E != 0;
        }
        T[] TArray = a2.J;
        b2 = b2.J;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            if (TArray[n2] != b2[n2]) {
                return uSa.E != 0;
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }

    public T[] l(int n2) {
        int b22 = n2;
        fH_1 a2 = this;
        T[] TArray = a2.J;
        Object[] b22 = (Object[])Array.newInstance(a2.J.getClass().getComponentType(), b22);
        System.arraycopy(TArray, uSa.E, b22, uSa.E, Math.min(a2.A, b22.length));
        a2.J = b22;
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, T t3, T t4) {
        void a2;
        void b2;
        void c2;
        T[] TArray = this;
        T[] d2 = TArray.J;
        if (TArray.A + uqa.g >= d2.length) {
            d2 = TArray.l(Math.max(Yqa.i, (int)((float)TArray.A * NPa.L)));
        }
        d2[TArray.A] = c2;
        d2[TArray.A + vRa.d] = b2;
        d2[TArray.A + uqa.g] = a2;
        TArray.A += yRa.d;
    }

    public void J(fH<? extends T> fH2) {
        fH<T> b2 = fH2;
        fH<T> a2 = this;
        a2.J(b2.J, uSa.E, b2.A);
    }

    public T l() {
        fH_1 a2;
        if (a2.A == 0) {
            throw new IllegalStateException(MQa.M);
        }
        fH_1 fH_12 = a2;
        return fH_12.J[fH_12.A - vRa.d];
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(T t2, boolean bl) {
        int c2;
        void b2;
        void a2;
        fH_1 fH_12;
        T[] TArray = (fH_12 = this).J;
        if (a2 != false || b2 == null) {
            for (c2 = (v814323).A - vRa.d; c2 >= 0; --c2) {
                T t3 = TArray[c2];
                if (t3 != b2) continue;
                return vRa.d != 0;
            }
        } else {
            while (c2 >= 0) {
                boolean bl2 = b2.equals(TArray[c2]);
                --c2;
                if (!bl2) continue;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(T t2, boolean n2) {
        void b2;
        int c2 = n2;
        fH_1 a2 = this;
        T[] TArray = a2.J;
        if (c2 != 0 || b2 == null) {
            c2 = uSa.E;
            int n3 = a2.A;
            int n4 = c2;
            while (n4 < n3) {
                if (TArray[c2] == b2) {
                    a2.f(c2);
                    return vRa.d != 0;
                }
                n4 = ++c2;
            }
        } else {
            c2 = uSa.E;
            int n5 = a2.A;
            int n6 = c2;
            while (n6 < n5) {
                if (b2.equals(TArray[c2])) {
                    a2.f(c2);
                    return vRa.d != 0;
                }
                n6 = ++c2;
            }
        }
        return uSa.E != 0;
    }

    public void f() {
        fH_1 a2;
        Arrays.fill(a2.J, uSa.E, a2.A, null);
        a2.A = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, T t2) {
        void a2;
        T[] TArray;
        void b2;
        T[] TArray2 = this;
        if (b2 > TArray2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(2 & 5, Spa.E).append((int)b2).append(mra.e).append(TArray2.A).toString());
        }
        T[] c2 = TArray2.J;
        if (TArray2.A == c2.length) {
            c2 = TArray2.l(Math.max(Yqa.i, (int)((float)TArray2.A * NPa.L)));
        }
        if (TArray2.I) {
            TArray = TArray2;
            System.arraycopy(c2, (int)b2, c2, (int)(b2 + vRa.d), TArray2.A - b2);
        } else {
            c2[TArray2.A] = c2[b2];
            TArray = TArray2;
        }
        TArray.A += vRa.d;
        c2[b2] = a2;
    }

    public <V> V[] J(Class<V> clazz) {
        Object[] b2 = clazz;
        fH_1 a2 = this;
        b2 = (Object[])Array.newInstance(b2, a2.A);
        System.arraycopy(a2.J, uSa.E, b2, uSa.E, a2.A);
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static <T> fH<T> J(boolean bl, int n2, Class<T> clazz) {
        void b2;
        Class<T> c2 = clazz;
        boolean a2 = bl;
        return new fH_1<T>(a2, (int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, T t3) {
        void a2;
        void b2;
        T[] TArray = this;
        T[] c2 = TArray.J;
        if (TArray.A + vRa.d >= c2.length) {
            c2 = TArray.l(Math.max(Yqa.i, (int)((float)TArray.A * NPa.L)));
        }
        c2[TArray.A] = b2;
        c2[TArray.A + vRa.d] = a2;
        TArray.A += uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(fH<? extends T> fH2, boolean bl) {
        T[] b2;
        fH_1 fH_12 = this;
        void v0 = b2;
        b2 = v0.J;
        int c2 = uSa.E;
        int n2 = v0.A;
        int n3 = c2;
        while (n3 < n2) {
            void a2;
            if (fH_12.f(b2[c2], (boolean)a2)) {
                return vRa.d != 0;
            }
            n3 = ++c2;
        }
        return uSa.E != 0;
    }

    public void J() {
        fH_1 fH_12;
        fH_1 fH_13 = fH_12 = this;
        T[] TArray = fH_13.J;
        int a2 = uSa.E;
        int n2 = fH_13.A - vRa.d;
        int n3 = fH_13.A / uqa.g;
        int n4 = a2;
        while (n4 < n3) {
            int n5 = n2 - a2;
            T t2 = TArray[a2];
            TArray[a2] = TArray[n5];
            TArray[n5] = t2;
            n4 = ++a2;
        }
    }

    public T f() {
        fH_1 fH_12 = this;
        if (fH_12.A == 0) {
            throw new IllegalStateException(MQa.M);
        }
        fH_1 fH_13 = fH_12;
        fH_13.A -= vRa.d;
        fH_1<T> a2 = fH_13.J[fH_12.A];
        fH_13.J[fH_12.A] = null;
        return (T)a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, T t2) {
        void a2;
        int c2 = n2;
        fH_1 b2 = this;
        if (c2 >= b2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(3 ^ 3, hpa.ja).append(c2).append(Upa.n).append(b2.A).toString());
        }
        b2.J[c2] = a2;
    }

    public fH_1() {
        a2(vRa.d != 0, ERa.C);
        fH_1<T> a2;
    }

    /*
     * WARNING - void declaration
     */
    public fH_1(boolean bl, T[] TArray, int n2, int n3) {
        void b2;
        void c2;
        void e2;
        void d2;
        int n4 = n3;
        fH_1<T> a2 = this;
        a2((boolean)d2, (int)e2, c2.getClass().getComponentType());
        a2.A = e2;
        System.arraycopy(c2, (int)b2, a2.J, uSa.E, a2.A);
    }

    public T[] f(int n2) {
        int b2 = n2;
        fH_1 a2 = this;
        if (b2 < 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, wta.a).append(b2).toString());
        }
        if ((b2 = a2.A + b2) > a2.J.length) {
            fH_1 fH_12 = a2;
            fH_12.l(Math.max(Math.max(Yqa.i, b2), (int)((float)fH_12.A * NPa.L)));
        }
        return a2.J;
    }

    public static <T> fH<T> J(Class<T> a2) {
        return new fH_1<T>(a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(T[] TArray, int n2, int n3) {
        void b2;
        void c2;
        void a2;
        T[] TArray2 = this;
        int n4 = TArray2.A + a2;
        T[] d2 = TArray2.J;
        if (n4 > d2.length) {
            d2 = TArray2.l(Math.max(Math.max(Yqa.i, n4), (int)((float)TArray2.A * NPa.L)));
        }
        System.arraycopy(c2, (int)b2, d2, TArray2.A, (int)a2);
        TArray2.A = n4;
    }

    /*
     * WARNING - void declaration
     */
    public String toString(String string) {
        fH_1 fH_12 = this;
        if (fH_12.A == 0) {
            return Mqa.y;
        }
        T[] TArray = fH_12.J;
        StringBuilder b2 = new StringBuilder(fPa.i);
        b2.append(TArray[uSa.E]);
        int n2 = vRa.d;
        int n3 = n2;
        while (n3 < fH_12.A) {
            void a2;
            b2.append((String)a2);
            b2.append(TArray[n2++]);
            n3 = n2;
        }
        return b2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public int f(T t2, boolean n2) {
        void b2;
        int c2 = n2;
        fH_1 a2 = this;
        T[] TArray = a2.J;
        if (c2 != 0 || b2 == null) {
            c2 = uSa.E;
            int n3 = a2.A;
            int n4 = c2;
            while (n4 < n3) {
                if (TArray[c2] == b2) {
                    return c2;
                }
                n4 = ++c2;
            }
        } else {
            c2 = uSa.E;
            int n5 = a2.A;
            int n6 = c2;
            while (n6 < n5) {
                if (b2.equals(TArray[c2])) {
                    return c2;
                }
                n6 = ++c2;
            }
        }
        return pua.o;
    }

    public T J() {
        fH_1 a2;
        if (a2.A == 0) {
            throw new IllegalStateException(MQa.M);
        }
        return a2.J[uSa.E];
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        int c2 = n2;
        fH_1 b2 = this;
        if (c2 > b2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(5 >> 3, Spa.E).append(c2).append(mra.e).append(b2.A).toString());
        }
        int n4 = b2.A + a2;
        if (n4 > b2.J.length) {
            fH_1 fH_12 = b2;
            fH_12.J = fH_12.l(Math.max(Math.max(Yqa.i, n4), (int)((float)fH_12.A * NPa.L)));
        }
        fH_1 fH_13 = b2;
        int n5 = c2;
        System.arraycopy(fH_13.J, n5, fH_13.J, n5 + a2, b2.A - c2);
        b2.A = n4;
    }

    public T f(int n2) {
        T[] TArray;
        int b2 = n2;
        fH_1 a2 = this;
        if (b2 >= a2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(5 >> 3, hpa.ja).append(b2).append(Upa.n).append(a2.A).toString());
        }
        fH_1 fH_12 = a2;
        T[] TArray2 = fH_12.J;
        T t2 = fH_12.J[b2];
        fH_12.A -= vRa.d;
        if (fH_12.I) {
            TArray = TArray2;
            int n3 = b2;
            System.arraycopy(TArray2, b2 + vRa.d, TArray2, n3, a2.A - n3);
        } else {
            TArray = TArray2;
            TArray2[b2] = TArray2[a2.A];
        }
        TArray[a2.A] = null;
        return t2;
    }

    public void J(T ... TArray) {
        T[] b2 = TArray;
        T[] a2 = this;
        a2.J(b2, uSa.E, b2.length);
    }

    public boolean J() {
        fH_1 a2;
        if (a2.A == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public fH_1(T[] TArray) {
        T[] b2 = TArray;
        T[] a2 = this;
        super(vRa.d != 0, b2, uSa.E, b2.length);
    }

    /*
     * WARNING - void declaration
     */
    public void J(fH<? extends T> fH2, int n2, int n3) {
        void c2;
        void b2;
        int d2 = n3;
        fH_1 a2 = this;
        if (b2 + d2 > c2.A) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, gua.Da).append((int)b2).append(wta.E).append(d2).append(qQa.Q).append(c2.A).toString());
        }
        a2.J(c2.J, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public int J(T t2, boolean n2) {
        void b2;
        int c2 = n2;
        fH_1 a2 = this;
        T[] TArray = a2.J;
        if (c2 != 0 || b2 == null) {
            int n3 = c2 = a2.A - vRa.d;
            while (n3 >= 0) {
                if (TArray[c2] == b2) {
                    return c2;
                }
                n3 = --c2;
            }
        } else {
            int n4 = c2 = a2.A - vRa.d;
            while (n4 >= 0) {
                if (b2.equals(TArray[c2])) {
                    return c2;
                }
                n4 = --c2;
            }
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public fH_1(boolean bl, int n2, Class clazz) {
        void b2;
        void c2;
        fH_1 a2;
        Class d2 = clazz;
        fH_1 fH_12 = a2 = this;
        fH_12.I = c2;
        fH_12.J = (Object[])Array.newInstance(d2, (int)b2);
    }

    public String toString() {
        fH_1 fH_12 = this;
        if (fH_12.A == 0) {
            return aSa.Ga;
        }
        T[] TArray = fH_12.J;
        StringBuilder a2 = new StringBuilder(fPa.i);
        a2.append((char)rRa.R);
        a2.append(TArray[uSa.E]);
        int n2 = vRa.d;
        int n3 = n2;
        while (n3 < fH_12.A) {
            a2.append(TOa.n);
            a2.append(TArray[n2++]);
            n3 = n2;
        }
        Object object = a2;
        ((StringBuilder)object).append((char)fPa.t);
        return ((StringBuilder)object).toString();
    }

    public static <T> fH<T> J(T ... a2) {
        return new fH_1<T>(a2);
    }

    public boolean equals(Object object) {
        int n2;
        Object b2 = object;
        T[] a2 = this;
        if (b2 == a2) {
            return vRa.d != 0;
        }
        if (!a2.I) {
            return uSa.E != 0;
        }
        if (!(b2 instanceof fH_1)) {
            return uSa.E != 0;
        }
        b2 = (fH_1)b2;
        if (!b2.I) {
            return uSa.E != 0;
        }
        int n3 = a2.A;
        if (n3 != b2.A) {
            return uSa.E != 0;
        }
        T[] TArray = a2.J;
        b2 = b2.J;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            T t2 = TArray[n2];
            T t3 = b2[n2];
            if (!(t2 != null ? t2.equals(t3) : t3 == null)) {
                return uSa.E != 0;
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public fH_1(boolean bl, int n2) {
        void b2;
        fH_1 a2;
        int c2 = n2;
        fH_1 fH_12 = a2 = this;
        fH_12.I = b2;
        fH_12.J = new Object[c2];
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2) {
        void a2;
        T[] TArray = this;
        T[] b2 = TArray.J;
        if (TArray.A == b2.length) {
            b2 = TArray.l(Math.max(Yqa.i, (int)((float)TArray.A * NPa.L)));
        }
        int n2 = TArray.A;
        TArray.A = n2 + vRa.d;
        b2[n2] = a2;
    }

    public T[] J() {
        fH_1 a2;
        fH_1 fH_12 = a2;
        return fH_12.J(fH_12.J.getClass().getComponentType());
    }

    public T[] J(int n2) {
        int b2 = n2;
        fH_1 a2 = this;
        int n3 = b2;
        a2.J(n3);
        if (n3 > a2.J.length) {
            a2.l(Math.max(Yqa.i, b2));
        }
        a2.A = b2;
        return a2.J;
    }

    public YI<T> J() {
        fH_1 a2;
        if (a2.j == null) {
            fH_1 fH_12 = a2;
            a2.j = new OG((fH)a2);
        }
        return a2.j.J();
    }

    public fH_1(Class clazz) {
        Class b2 = clazz;
        fH_1<T> a2 = this;
        a2(vRa.d != 0, ERa.C, b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, T t3, T t4, T t5) {
        void a2;
        void b2;
        void c2;
        void d2;
        T[] TArray = this;
        T[] e2 = TArray.J;
        if (TArray.A + yRa.d >= e2.length) {
            e2 = TArray.l(Math.max(Yqa.i, (int)((float)TArray.A * Ssa.la)));
        }
        e2[TArray.A] = d2;
        e2[TArray.A + vRa.d] = c2;
        e2[TArray.A + uqa.g] = b2;
        e2[TArray.A + yRa.d] = a2;
        TArray.A += AQa.P;
    }

    public T J(int n2) {
        int b2 = n2;
        fH_1 a2 = this;
        if (b2 >= a2.A) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(5 >> 3, hpa.ja).append(b2).append(Upa.n).append(a2.A).toString());
        }
        return a2.J[b2];
    }
}

