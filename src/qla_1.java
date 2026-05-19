/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  KKa
 *  Ypa
 *  Zta
 *  aSa
 *  be
 *  hra
 *  lla
 *  pua
 *  qta
 *  vRa
 */
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qla_1 {
    private static final String i = "CL_00002450";
    private static final int M;
    private final BitSet k;
    private int j;
    private static final int[] J;
    private static final int A;
    private static final int I;

    public KKa J() {
        int n2;
        qla_1 qla_12 = this;
        qla_1 a2 = new KKa();
        if (mPa.H - qla_12.j < hra.Ja) {
            qla_1 qla_13 = a2;
            qla_13.J(vRa.d != 0);
            return qla_13;
        }
        if (qla_12.j == 0) {
            qla_1 qla_14 = a2;
            qla_14.J(uSa.E != 0);
            return qla_14;
        }
        int[] nArray = J;
        int n3 = J.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            int n5 = nArray[n2];
            if (!qla_12.k.get(n5)) {
                a2.J(qla_12.J(n5));
            }
            n4 = ++n2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        return a2 << uSa.E | b2 << Yqa.i | c2 << AQa.P;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private int J(int n2, DZ dZ2) {
        void a2;
        int c2 = n2;
        qla_1 b2 = this;
        switch (lla.A[a2.ordinal()]) {
            case 1: {
                if ((c2 >> Yqa.i & Ypa.A) == 0) {
                    return pua.o;
                }
                return c2 - I;
            }
            case 2: {
                if ((c2 >> Yqa.i & Ypa.A) == Ypa.A) {
                    return pua.o;
                }
                return c2 + I;
            }
            case 3: {
                if ((c2 >> AQa.P & Ypa.A) == 0) {
                    return pua.o;
                }
                return c2 - M;
            }
            case 4: {
                if ((c2 >> AQa.P & Ypa.A) == Ypa.A) {
                    return pua.o;
                }
                return c2 + M;
            }
            case 5: {
                if ((c2 >> uSa.E & Ypa.A) == 0) {
                    return pua.o;
                }
                return c2 - A;
            }
            case 6: {
                if ((c2 >> uSa.E & Ypa.A) == Ypa.A) {
                    return pua.o;
                }
                return c2 + A;
            }
        }
        return pua.o;
    }

    public void J(XF xF2) {
        qla_1 a2;
        Object b2 = xF2;
        qla_1 qla_12 = a2 = this;
        qla_12.k.set(qla_1.J((XF)((Object)b2)), vRa.d != 0);
        qla_12.j -= vRa.d;
    }

    private Set J(int n2) {
        int a2;
        qla_1 qla_12 = this;
        EnumSet<DZ> enumSet = EnumSet.noneOf(DZ.class);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(qta.N);
        arrayDeque.add(be.valueOf((int)a2));
        qla_12.k.set(a2, vRa.d != 0);
        while (!arrayDeque.isEmpty()) {
            a2 = (Integer)arrayDeque.poll();
            qla_12.J(a2, enumSet);
            DZ[] dZArray = DZ.VALUES;
            int n3 = DZ.VALUES.length;
            int n4 = uSa.E;
            while (n4 < n3) {
                int n5;
                Object b22 = dZArray[n5];
                int b22 = qla_12.J(a2, (DZ)((Object)b22));
                if (b22 >= 0 && !qla_12.k.get(b22)) {
                    int n6 = b22;
                    qla_12.k.set(n6, vRa.d != 0);
                    arrayDeque.add(be.valueOf((int)n6));
                }
                n4 = ++n5;
            }
        }
        return enumSet;
    }

    public qla_1() {
        qla_1 a2;
        qla_1 qla_12 = a2;
        a2.k = new BitSet(mPa.H);
        qla_12.j = mPa.H;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Set set) {
        int n3;
        void a2;
        int n4;
        int c2 = n2;
        qla_1 b2 = this;
        int n5 = c2 >> uSa.E & Ypa.A;
        if (n5 == 0) {
            n4 = c2;
            a2.add(DZ.WEST);
        } else {
            if (n5 == Ypa.A) {
                a2.add(DZ.EAST);
            }
            n4 = c2;
        }
        n5 = n4 >> Yqa.i & Ypa.A;
        if (n5 == 0) {
            n3 = c2;
            a2.add(DZ.DOWN);
        } else {
            if (n5 == Ypa.A) {
                a2.add(DZ.UP);
            }
            n3 = c2;
        }
        c2 = n3 >> AQa.P & Ypa.A;
        if (c2 == 0) {
            a2.add(DZ.NORTH);
            return;
        }
        if (c2 == Ypa.A) {
            a2.add(DZ.SOUTH);
        }
    }

    public Set J(XF xF2) {
        Object b2 = xF2;
        qla_1 a2 = this;
        return a2.J(qla_1.J((XF)((Object)b2)));
    }

    static {
        int n2;
        A = (int)Math.pow(Zta.ba, aSa.V);
        M = (int)Math.pow(Zta.ba, oua.i);
        I = (int)Math.pow(Zta.ba, KPa.y);
        J = new int[Eqa.ga];
        int n3 = uSa.E;
        int n4 = n2 = uSa.E;
        while (n4 < ERa.C) {
            int n5 = uSa.E;
            while (n5 < ERa.C) {
                int n6;
                int n7 = uSa.E;
                while (n7 < ERa.C) {
                    int n8;
                    if (n2 == 0 || n2 == Ypa.A || n6 == 0 || n6 == Ypa.A || n8 == 0 || n8 == Ypa.A) {
                        qla_1.J[n3++] = qla_1.J(n2, n6, n8);
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++n2;
        }
    }

    private static int J(XF a2) {
        return qla_1.J(a2.getX() & Ypa.A, a2.getY() & Ypa.A, a2.getZ() & Ypa.A);
    }
}

