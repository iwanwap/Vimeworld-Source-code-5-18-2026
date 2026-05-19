/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JY
 *  Lra
 *  Qsa
 *  XTa
 *  lqa
 *  vRa
 *  wOa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class YLa_1 {
    private int i;
    private int M;
    private volatile transient int k;
    private final float j = 0.75f;
    private transient JY[] J = new JY[mPa.H];
    private transient int A;
    private static final String I = "CL_00001492";

    /*
     * WARNING - void declaration
     */
    private void J(JY[] jYArray) {
        int b2;
        void a2;
        YLa_1 yLa_1 = this;
        JY[] jYArray2 = yLa_1.J;
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < jYArray2.length) {
            JY jY2 = jYArray2[b2];
            if (jY2 != null) {
                JY jY3;
                jYArray2[b2] = null;
                do {
                    JY jY4 = jY2;
                    jY3 = jY4.j;
                    int n4 = YLa_1.J(jY4.I, n2 - vRa.d);
                    jY4.j = a2[n4];
                    a2[n4] = jY2;
                } while ((jY2 = jY3) != null);
            }
            n3 = ++b2;
        }
    }

    private void J(int n2) {
        int b22 = n2;
        YLa_1 a2 = this;
        if (a2.J.length == Qsa.X) {
            a2.M = vqa.F;
            return;
        }
        JY[] jYArray = new JY[b22];
        YLa_1 yLa_1 = a2;
        YLa_1 yLa_12 = a2;
        yLa_12.J(jYArray);
        yLa_1.J = jYArray;
        yLa_1.i = yLa_12.J.length - vRa.d;
        float b22 = b22;
        a2.getClass();
        a2.M = (int)(b22 * wOa.w);
    }

    public static /* synthetic */ int f(long a2) {
        return YLa_1.J(a2);
    }

    public YLa_1() {
        YLa_1 a2;
        a2.M = ATa.X;
        a2.j = wOa.w;
        a2.i = a2.J.length - vRa.d;
    }

    private static int J(long a2) {
        long l2 = a2;
        return (int)(l2 ^ l2 >>> Lra.e);
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2, Object object) {
        void a2;
        void b2;
        YLa_1 yLa_1 = this;
        int n2 = YLa_1.J((long)b2);
        int n3 = YLa_1.J(n2, yLa_1.i);
        YLa_1 c2 = yLa_1.J[n3];
        Object object2 = c2;
        while (object2 != null) {
            if (((JY)c2).A == b2) {
                ((JY)c2).J = a2;
                return;
            }
            object2 = ((JY)c2).j;
        }
        yLa_1.k += vRa.d;
        yLa_1.J(n2, (long)b2, a2, n3);
    }

    /*
     * WARNING - void declaration
     */
    public final JY f(long l2) {
        void a2;
        YLa_1 yLa_1 = this;
        int b2 = YLa_1.J((long)a2);
        JY jY2 = b2 = yLa_1.J[YLa_1.J(b2, yLa_1.i)];
        while (jY2 != null) {
            if (b2.A == a2) {
                return b2;
            }
            jY2 = b2.j;
        }
        return null;
    }

    public Object f(long a22) {
        YLa_1 b2;
        JY a22 = b2.J(a22);
        if (a22 == null) {
            return null;
        }
        return a22.J;
    }

    public int J() {
        YLa_1 a2;
        return a2.A;
    }

    public double J() {
        int a2;
        YLa_1 yLa_1 = this;
        int n2 = uSa.E;
        int n3 = a2 = uSa.E;
        while (n3 < yLa_1.J.length) {
            if (yLa_1.J[a2] != null) {
                ++n2;
            }
            n3 = ++a2;
        }
        return oua.i * (double)n2 / (double)yLa_1.A;
    }

    private static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return a2 & b2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, long l2, Object object, int n3) {
        void b2;
        void c2;
        void d2;
        void a2;
        YLa_1 yLa_1;
        YLa_1 yLa_12 = yLa_1 = this;
        YLa_1 e2 = yLa_12.J[a2];
        yLa_12.J[a2] = new JY((int)d2, (long)c2, (Object)b2, (JY)e2);
        int n4 = yLa_12.A;
        yLa_12.A = n4 + vRa.d;
        if (n4 >= yLa_1.M) {
            YLa_1 yLa_13 = yLa_1;
            yLa_13.J(uqa.g * yLa_13.J.length);
        }
    }

    public boolean J(long a2) {
        YLa_1 b2;
        if (b2.f(a2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public final JY J(long l2) {
        YLa_1 b2;
        void a2;
        YLa_1 yLa_1 = this;
        int n2 = YLa_1.J(YLa_1.J((long)a2), yLa_1.i);
        Object object = yLa_1.J[n2];
        YLa_1 yLa_12 = b2 = object;
        while (yLa_12 != null) {
            YLa_1 yLa_13 = b2;
            JY jY2 = ((JY)yLa_13).j;
            if (((JY)yLa_13).A == a2) {
                YLa_1 yLa_14 = yLa_1;
                yLa_14.k += vRa.d;
                yLa_14.A -= vRa.d;
                if (object == b2) {
                    yLa_1.J[n2] = jY2;
                    return b2;
                }
                object.j = jY2;
                return b2;
            }
            object = b2;
            yLa_12 = jY2;
        }
        return b2;
    }

    private static int J(int a2) {
        int n2 = a2;
        a2 = n2 ^ n2 >>> kTa.j ^ a2 >>> lqa.s;
        return a2 ^ a2 >>> XTa.W ^ a2 >>> AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    public Object J(long l2) {
        void a2;
        YLa_1 yLa_1 = this;
        int b2 = YLa_1.J((long)a2);
        JY jY2 = b2 = yLa_1.J[YLa_1.J(b2, yLa_1.i)];
        while (jY2 != null) {
            if (b2.A == a2) {
                return b2.J;
            }
            jY2 = b2.j;
        }
        return null;
    }
}

