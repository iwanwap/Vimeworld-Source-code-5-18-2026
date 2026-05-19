/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  EY
 *  Gua
 *  Oz
 *  SOa
 *  Tf
 *  YLa
 *  Ypa
 *  bFa
 *  pua
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class EY_1 {
    private long m;
    private int C;
    private final List<bFa> i;
    private final List<QX> M;
    private final Tf k;
    private final YLa j;
    private static final Logger J = LogManager.getLogger();
    private final List<QX> A;
    private final int[][] I;

    public void J() {
        Ty a22;
        EY_1 eY_1 = this;
        long l2 = eY_1.k.l();
        if (l2 - eY_1.m > SOa.a) {
            int a22;
            eY_1.m = l2;
            int n2 = a22 = uSa.E;
            while (n2 < eY_1.A.size()) {
                QX qX2 = eY_1.A.get(a22);
                qX2.f();
                qX2.J();
                n2 = ++a22;
            }
        } else {
            int a22;
            int n3 = a22 = uSa.E;
            while (n3 < eY_1.M.size()) {
                QX qX3 = eY_1.M.get(a22);
                qX3.f();
                n3 = ++a22;
            }
        }
        EY_1 eY_12 = eY_1;
        eY_12.M.clear();
        if (eY_12.i.isEmpty() && !(a22 = eY_1.k.F).l()) {
            eY_1.k.f.f();
        }
    }

    public static /* synthetic */ YLa J(EY a2) {
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        EY_1 a2 = this;
        long l2 = (long)b2 + Gua.R | (long)c2 + Gua.R << fPa.i;
        if (a2.j.J(l2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(bFa bFa2, int n2, int n3) {
        void c2;
        void a2;
        EY_1 b2 = this;
        int d22 = n2;
        QX d22 = b2.J(d22, (int)a2, uSa.E != 0);
        if (d22 != null && QX.J(d22).contains(c2) && !c2.M.contains(QX.J(d22))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2) {
        int n2;
        void a2;
        EY_1 eY_1 = this;
        void v0 = a2;
        int b22 = v0.getX() >> AQa.P;
        QX b22 = eY_1.J(b22, n2 = v0.getZ() >> AQa.P, uSa.E != 0);
        if (b22 != null) {
            b22.J(a2.getX() & Ypa.A, a2.getY(), a2.getZ() & Ypa.A);
        }
    }

    public void C(bFa bFa2) {
        EY_1 b2 = bFa2;
        EY_1 a2 = this;
        EY_1 eY_1 = b2;
        int n2 = (int)((bFa)eY_1).la >> AQa.P;
        int n3 = (int)((bFa)eY_1).A >> AQa.P;
        double d2 = ((bFa)eY_1).E - ((bFa)b2).la;
        double d3 = ((bFa)eY_1).K - ((bFa)b2).A;
        double d4 = d2;
        double d5 = d3;
        if (d4 * d4 + d5 * d5 >= ypa.X) {
            EY_1 eY_12 = b2;
            int n4 = (int)((bFa)eY_12).E >> AQa.P;
            int n5 = (int)((bFa)eY_12).K >> AQa.P;
            int n6 = a2.C;
            int n7 = n2 - n4;
            int n8 = n3 - n5;
            if (n7 != 0 || n8 != 0) {
                int n9;
                int n10 = n9 = n2 - n6;
                while (n10 <= n2 + n6) {
                    int n11 = n3 - n6;
                    while (n11 <= n3 + n6) {
                        QX qX2;
                        int n12;
                        if (!a2.J(n9, n12, n4, n5, n6)) {
                            a2.J(n9, n12, vRa.d != 0).J((bFa)b2);
                        }
                        if (!a2.J(n9 - n7, n12 - n8, n2, n3, n6) && (qX2 = a2.J(n9 - n7, n12 - n8, uSa.E != 0)) != null) {
                            qX2.f((bFa)b2);
                        }
                        n11 = ++n12;
                    }
                    n10 = ++n9;
                }
                a2.J((bFa)b2);
                EY_1 eY_13 = b2;
                ((bFa)eY_13).E = ((bFa)eY_13).la;
                ((bFa)eY_13).K = ((bFa)eY_13).A;
            }
        }
    }

    public static /* synthetic */ List f(EY a2) {
        return a2.M;
    }

    public EY_1(Tf tf) {
        EY_1 b2 = tf;
        EY_1 a2 = this;
        a2.i = Lists.newArrayList();
        EY_1 eY_1 = a2;
        eY_1.j = new YLa();
        a2.M = Lists.newArrayList();
        a2.A = Lists.newArrayList();
        int[][] nArrayArray = new int[AQa.P][];
        int[] nArray = new int[uqa.g];
        nArray[uSa.E] = vRa.d;
        nArray[vRa.d] = uSa.E;
        nArrayArray[uSa.E] = nArray;
        int[] nArray2 = new int[uqa.g];
        nArray2[uSa.E] = uSa.E;
        nArray2[vRa.d] = vRa.d;
        nArrayArray[vRa.d] = nArray2;
        int[] nArray3 = new int[uqa.g];
        nArray3[uSa.E] = pua.o;
        nArray3[vRa.d] = uSa.E;
        nArrayArray[uqa.g] = nArray3;
        int[] nArray4 = new int[uqa.g];
        nArray4[uSa.E] = uSa.E;
        nArray4[vRa.d] = pua.o;
        nArrayArray[yRa.d] = nArray4;
        a2.I = nArrayArray;
        a2.k = b2;
        a2.J(b2.J().J().J());
    }

    public void J(int n2) {
        int b2 = n2;
        EY_1 a2 = this;
        if ((b2 = Oz.f((int)b2, (int)yRa.d, (int)fPa.i)) != a2.C) {
            int n3 = b2 - a2.C;
            for (bFa bFa2 : Lists.newArrayList(a2.i)) {
                int n4;
                int n5;
                int n6 = (int)bFa2.la >> AQa.P;
                int n7 = (int)bFa2.A >> AQa.P;
                if (n3 > 0) {
                    int n8 = n6 - b2;
                    while (n8 <= n6 + b2) {
                        int n9 = n7 - b2;
                        while (n9 <= n7 + b2) {
                            QX qX2 = a2.J(n5, n4, vRa.d != 0);
                            if (!QX.J(qX2).contains(bFa2)) {
                                qX2.J(bFa2);
                            }
                            n9 = ++n4;
                        }
                        n8 = ++n5;
                    }
                    continue;
                }
                int n10 = n6 - a2.C;
                while (n10 <= n6 + a2.C) {
                    int n11 = n7 - a2.C;
                    while (n11 <= n7 + a2.C) {
                        if (!a2.J(n5, n4, n6, n7, b2)) {
                            a2.J(n5, n4, vRa.d != 0).f(bFa2);
                        }
                        n11 = ++n4;
                    }
                    n10 = ++n5;
                }
            }
            a2.C = b2;
        }
    }

    public void l(bFa bFa2) {
        int n2;
        EY_1 b2 = bFa2;
        EY_1 a2 = this;
        EY_1 eY_1 = b2;
        int n3 = (int)((bFa)eY_1).la >> AQa.P;
        int n4 = (int)((bFa)eY_1).A >> AQa.P;
        ((bFa)eY_1).E = ((bFa)eY_1).la;
        ((bFa)eY_1).K = ((bFa)eY_1).A;
        int n5 = n2 = n3 - a2.C;
        while (n5 <= n3 + a2.C) {
            int n6 = n4 - a2.C;
            while (n6 <= n4 + a2.C) {
                int n7;
                a2.J(n2, n7++, vRa.d != 0).J((bFa)b2);
                n6 = n7;
            }
            n5 = ++n2;
        }
        a2.i.add((bFa)b2);
        a2.J((bFa)b2);
    }

    public static /* synthetic */ List J(EY a2) {
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    private QX J(int n2, int n3, boolean bl) {
        void a2;
        void b2;
        void c2;
        EY_1 eY_1 = this;
        long l2 = (long)c2 + Gua.R | (long)b2 + Gua.R << fPa.i;
        Object d2 = (QX)eY_1.j.J(l2);
        if (d2 == null && a2 != false) {
            d2 = new QX((EY)eY_1, (int)c2, (int)b2);
            EY_1 eY_12 = eY_1;
            eY_12.j.J(l2, d2);
            eY_12.A.add((QX)d2);
        }
        return d2;
    }

    public Tf J() {
        EY_1 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public void f(bFa bFa2) {
        int n2;
        void a2;
        EY_1 eY_1 = this;
        void v0 = a2;
        int n3 = (int)v0.E >> AQa.P;
        int n4 = (int)v0.K >> AQa.P;
        int n5 = n2 = n3 - eY_1.C;
        while (n5 <= n3 + eY_1.C) {
            int n6 = n4 - eY_1.C;
            while (n6 <= n4 + eY_1.C) {
                int b2;
                QX qX2 = eY_1.J(n2, b2, uSa.E != 0);
                if (qX2 != null) {
                    qX2.f((bFa)a2);
                }
                n6 = ++b2;
            }
            n5 = ++n2;
        }
        eY_1.i.remove(a2);
    }

    public static /* synthetic */ Logger J() {
        return J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(bFa bFa2) {
        int n2;
        void a2;
        EY_1 eY_1 = this;
        void v0 = a2;
        ArrayList arrayList = Lists.newArrayList(v0.M);
        int n3 = uSa.E;
        int n4 = eY_1.C;
        int n5 = (int)v0.la >> AQa.P;
        int n6 = (int)v0.A >> AQa.P;
        int n7 = uSa.E;
        int n8 = uSa.E;
        EY_1 b2 = QX.J(eY_1.J(n5, n6, vRa.d != 0));
        v0.M.clear();
        if (arrayList.contains(b2)) {
            a2.M.add(b2);
        }
        int n9 = n2 = vRa.d;
        while (n9 <= n4 * uqa.g) {
            int n10 = uSa.E;
            while (n10 < uqa.g) {
                int n11;
                int n12 = n3 % AQa.P;
                ++n3;
                int[] nArray = eY_1.I[n12];
                int n13 = uSa.E;
                while (n13 < n2) {
                    int n14;
                    b2 = QX.J(eY_1.J(n5 + (n7 += nArray[uSa.E]), n6 + (n8 += nArray[vRa.d]), vRa.d != 0));
                    if (arrayList.contains(b2)) {
                        a2.M.add(b2);
                    }
                    n13 = ++n14;
                }
                n10 = ++n11;
            }
            n9 = ++n2;
        }
        n3 %= AQa.P;
        int n15 = n2 = uSa.E;
        while (n15 < n4 * uqa.g) {
            b2 = QX.J(eY_1.J(n5 + (n7 += eY_1.I[n3][uSa.E]), n6 + (n8 += eY_1.I[n3][vRa.d]), vRa.d != 0));
            if (arrayList.contains(b2)) {
                a2.M.add(b2);
            }
            n15 = ++n2;
        }
    }

    public static int J(int a2) {
        return a2 * ERa.C - ERa.C;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int n2, int n3, int n4, int n5, int n6) {
        void e2;
        void f2;
        void c2;
        void b2;
        int n7 = n6;
        EY_1 a2 = this;
        d2 -= b2;
        if ((e2 -= c2) >= -f2 && e2 <= f2) {
            void d2;
            if (d2 >= -f2 && d2 <= f2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Tf J(EY a2) {
        return a2.k;
    }
}

