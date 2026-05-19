/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KTa
 *  aSa
 *  dQa
 *  pua
 *  sB
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vO_1 {
    public static vC M;
    private static int k;
    private static int j;
    public static Color J;
    private static long A;
    public static vC I;

    public vO_1() {
        vO_1 a2;
    }

    static {
        I = new vC();
        M = new vC();
        J = new Color(pua.o);
    }

    public static int J() {
        return j;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        A = OT.e;
        j = a2;
        k = b2;
        J = new Color(c2);
        I.J();
        M.J();
    }

    public static void J() {
        long l2;
        long l3;
        block11: {
            block10: {
                block12: {
                    block9: {
                        I.J();
                        M.J();
                        if (A == nqa.i) {
                            return;
                        }
                        l3 = System.currentTimeMillis() - A;
                        if (l3 > Hra.m) break block9;
                        if (I.l()) break block10;
                        I.f(j, Bta.c, sB.q);
                        l2 = l3;
                        break block11;
                    }
                    if (l3 > dQa.c) break block12;
                    if (I.l()) break block10;
                    I.e(j).J((double)j).C(j);
                    l2 = l3;
                    break block11;
                }
                if (I.l() != aSa.V) {
                    I.J();
                }
            }
            l2 = l3;
        }
        if (l2 <= dQa.c) {
            if (!M.l()) {
                M.J();
                return;
            }
        } else if (l3 <= KTa.x) {
            if (!M.l()) {
                M.e(k).C(k).J((double)k);
                return;
            }
        } else {
            if (l3 <= KTa.Q) {
                M.J(aSa.V, kTa.B);
                return;
            }
            M.J();
            A = nqa.i;
        }
    }
}

