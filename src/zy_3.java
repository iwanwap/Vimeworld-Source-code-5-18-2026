/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  zy
 */
public final class zy_3<V> {
    public final int j;
    public zy<V> J;
    public V A;
    public final int I;

    public final String toString() {
        zy_3 a2;
        return a2.J() + vTa.S + a2.J();
    }

    public final boolean equals(Object object) {
        Integer n2;
        zy_3<V> a2;
        zy_3 zy_32 = this;
        if (!(a2 instanceof zy_3)) {
            return uSa.E != 0;
        }
        a2 = a2;
        Object b2 = zy_32.J();
        if ((b2 == (n2 = Integer.valueOf(a2.J())) || b2 != null && b2.equals(n2)) && ((b2 = zy_32.J()) == (a2 = a2.J()) || b2 != null && b2.equals(a2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public final int hashCode() {
        zy_3 a2;
        return OX.J(a2.I);
    }

    public final V J() {
        zy_3 a2;
        return a2.A;
    }

    public final int J() {
        zy_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public zy_3(int n2, int n3, V v2, zy<V> zy2) {
        void d2;
        void c2;
        zy<V> e2;
        void b2;
        zy<V> a2;
        zy<V> zy3 = zy4;
        zy<V> zy4 = zy2;
        zy<V> zy5 = a2 = zy3;
        zy<V> zy6 = a2;
        zy6.A = b2;
        zy6.J = e2;
        zy5.I = c2;
        zy5.j = d2;
    }
}

