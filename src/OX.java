/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Qsa
 *  XTa
 *  lqa
 *  vRa
 *  wOa
 *  zy
 */
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class OX<V> {
    private transient zy<V>[] j = new zy[ERa.C];
    private final float J = 0.75f;
    private int A;
    private transient int I;

    /*
     * Unable to fully structure code
     */
    public void J(Predicate<zy<V>> var1_1) {
        var2_2 = this;
        v0 = var4_3 = uSa.E;
        while (v0 < var2_2.j.length) {
            v1 = b = (var3_4 = var2_2.j[var4_3]);
            while (v1 != null) {
                if (!a.test(b)) ** GOTO lbl14
                var2_2.I -= vRa.d;
                if (b == var3_4) {
                    v2 = b;
                    v3 = v2;
                    var2_2.j[var4_3] = v2.J;
                } else {
                    var3_4.J = b.J;
lbl14:
                    // 2 sources

                    v3 = b;
                }
                var3_4 = v3;
                v1 = b.J;
            }
            v0 = ++var4_3;
        }
    }

    public boolean J(int n2) {
        OX a2 = this;
        int b2 = n2;
        if (a2.f(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, V v2) {
        void a2;
        zy c2;
        void b2;
        zy zy2 = this;
        int n3 = OX.f((int)b2);
        int n4 = OX.J(n3, zy2.j.length);
        zy zy3 = c2 = zy2.j[n4];
        while (zy3 != null) {
            if (c2.I == b2) {
                c2.A = a2;
                return;
            }
            zy3 = c2.J;
        }
        super.J(n3, (int)b2, a2, n4);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2) {
        void a2;
        zy[] zyArray = this;
        if (zyArray.j.length == Qsa.X) {
            zyArray.A = vqa.F;
            return;
        }
        zy[] b2 = new zy[a2];
        super.J(b2);
        zyArray.j = b2;
        zyArray.getClass();
        zyArray.A = (int)((float)a2 * wOa.w);
    }

    private static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return a2 & b2 - vRa.d;
    }

    private static int f(int a2) {
        int n2 = a2;
        a2 = n2 ^ n2 >>> kTa.j ^ a2 >>> lqa.s;
        return a2 ^ a2 >>> XTa.W ^ a2 >>> AQa.P;
    }

    public V f(int n2) {
        OX a2 = this;
        int b22 = n2;
        V b22 = a2.J(b22);
        if (b22 == null) {
            return null;
        }
        return (V)((zy)b22).A;
    }

    public static /* synthetic */ int J(int a2) {
        return OX.f(a2);
    }

    /*
     * WARNING - void declaration
     */
    public final zy<V> f(int n2) {
        void a2;
        OX oX2 = this;
        int b2 = OX.f((int)a2);
        zy zy2 = b2 = oX2.j[OX.J(b2, oX2.j.length)];
        while (zy2 != null) {
            if (b2.I == a2) {
                return b2;
            }
            zy2 = b2.J;
        }
        return null;
    }

    public OX() {
        OX a2;
        OX oX2 = a2;
        oX2.A = lqa.s;
        oX2.J = wOa.w;
    }

    public void J() {
        int a2;
        OX oX2 = this;
        zy<V>[] zyArray = oX2.j;
        int n2 = a2 = uSa.E;
        while (n2 < zyArray.length) {
            zyArray[a2++] = null;
            n2 = a2;
        }
        oX2.I = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public final zy<V> J(int n2) {
        zy zy2;
        zy b2;
        void a2;
        zy zy3 = this;
        int n3 = OX.J(OX.f((int)a2), zy3.j.length);
        zy zy4 = b2 = (zy2 = zy3.j[n3]);
        while (zy4 != null) {
            zy zy5 = b2;
            zy zy6 = zy5.J;
            if (zy5.I == a2) {
                zy3.I -= vRa.d;
                if (zy2 == b2) {
                    zy3.j[n3] = zy6;
                    return b2;
                }
                zy2.J = zy6;
                return b2;
            }
            zy2 = b2;
            zy4 = zy6;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, V v2, int n4) {
        void b2;
        void c2;
        void d2;
        void a2;
        zy<V> zy2;
        zy<V> zy3 = zy2 = this;
        zy<V> e2 = zy3.j[a2];
        zy3.j[a2] = new zy((int)d2, (int)c2, (Object)b2, e2);
        int n5 = zy3.I;
        zy3.I = n5 + vRa.d;
        if (n5 >= zy2.A) {
            zy<V> zy4 = zy2;
            super.J(uqa.g * zy4.j.length);
        }
    }

    /*
     * WARNING - void declaration
     */
    public V J(int n2) {
        void a2;
        OX oX2 = this;
        int b2 = OX.f((int)a2);
        zy zy2 = b2 = oX2.j[OX.J(b2, oX2.j.length)];
        while (zy2 != null) {
            if (b2.I == a2) {
                return (V)b2.A;
            }
            zy2 = b2.J;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Consumer<zy<V>> consumer) {
        int b2;
        OX oX2 = this;
        zy<V>[] zyArray = oX2.j;
        int n2 = oX2.j.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            zy zy2 = zyArray[b2];
            while (zy2 != null) {
                void a2;
                zy zy3;
                zy zy4 = zy3;
                a2.accept(zy4);
                zy2 = zy4.J;
            }
            n3 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(zy<V>[] zyArray) {
        int b2;
        void a2;
        OX oX2 = this;
        zy<V>[] zyArray2 = oX2.j;
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < zyArray2.length) {
            zy zy2 = zyArray2[b2];
            if (zy2 != null) {
                zy zy3;
                zyArray2[b2] = null;
                do {
                    zy zy4 = zy2;
                    zy3 = zy4.J;
                    int n4 = OX.J(zy4.j, n2);
                    zy4.J = a2[n4];
                    a2[n4] = zy2;
                } while ((zy2 = zy3) != null);
            }
            n3 = ++b2;
        }
    }
}

