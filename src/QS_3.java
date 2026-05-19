/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  AY
 *  Cia
 *  ISa
 *  JPa
 *  Kpa
 *  Lz
 *  MQa
 *  NQa
 *  NTa
 *  Oo
 *  Oz
 *  YSa
 *  aSa
 *  cn
 *  io
 *  kta
 *  pua
 *  vL
 *  vRa
 *  xy
 */
import java.awt.MouseInfo;
import java.util.List;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QS_3 {
    private static final Kpa F = Kpa.J();
    private static int g;
    private static float L;
    private static int E;
    private static xy m;
    private static float C;
    private static final int i = 2;
    private static final float M = 20.0f;
    private static boolean k;
    private static final float j = 30.0f;
    private static float J;
    private static float A;
    private static final float I = 45.0f;

    public static List<xy> J(vL vL2, xy xy2, List<xy> list) {
        List<xy> c2 = list;
        vL a2 = vL2;
        List<xy> list2 = c2;
        list2.add(new xy(QS_3.J().J, QS_3.J().j, QS_3.J().I, QS_3.J().A, QS_3.J().M, QS_3.J().I));
        c2.add(new xy(QS_3.J().A, QS_3.J().j, QS_3.J().I, QS_3.J().A, QS_3.J().M, QS_3.J().k));
        c2.add(new xy(QS_3.J().A, QS_3.J().j, QS_3.J().k, QS_3.J().J, QS_3.J().M, QS_3.J().k));
        c2.add(new xy(QS_3.J().J, QS_3.J().j, QS_3.J().k, QS_3.J().J, QS_3.J().M, QS_3.J().I));
        return list2;
    }

    public static float C() {
        return C;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3, float f4, xy xy2) {
        void b2;
        void c2;
        xy d2 = xy2;
        float a2 = f2;
        if (k) {
            C = a2;
            L = c2;
            A = Math.max(eua.C, Math.min((float)b2, QTa.G));
            m = d2;
            return;
        }
        k = vRa.d;
        C = a2;
        L = c2;
        A = Math.max(eua.C, Math.min((float)b2, QTa.G));
        m = d2;
        g = uSa.E;
        E = QS_3.F.z.ld;
        QS_3.F.z.ld = vRa.d;
        F.j();
    }

    public static float l() {
        return A;
    }

    static {
        A = eta.e;
        L = nua.E;
        C = NSa.B;
        J = nua.E;
        m = new xy(aSa.V, aSa.V, aSa.V, aSa.V, aSa.V, aSa.V);
        g = uSa.E;
    }

    private static xy J() {
        return m;
    }

    public static float f() {
        return L;
    }

    public QS_3() {
        QS_3 a2;
    }

    public static void J(float a2) {
        L += a2;
    }

    public static void l() {
        if (!k) {
            return;
        }
        ANa aNa2 = QS_3.F.c;
        if (aNa2 == null) {
            QS_3.J();
            return;
        }
        if (Mouse.isGrabbed()) {
            QS_3.F.ea.l();
        }
        F.j();
        aNa2.X = L;
        if ((g += vRa.d) >= uqa.g) {
            g = uSa.E;
            QS_3.f();
        }
        J = L;
        Cia cia2 = QS_3.F.z;
        if (QS_3.F.ta == null) {
            Lz lz2;
            int n2 = NTa.C;
            int n3 = NTa.C;
            float f2 = Ira.d;
            float f3 = Xpa.R;
            if (Cia.J((mIa)cia2.yb)) {
                QS_3.J(NQa.m);
            }
            if (Cia.J((mIa)cia2.WB)) {
                QS_3.J(YSa.G);
            }
            Lz lz3 = QS_3.J(QS_3.f());
            Lz lz4 = QS_3.J(QS_3.f() + ISa.a);
            int n4 = MouseInfo.getPointerInfo().getLocation().x - Display.getX();
            int n5 = MouseInfo.getPointerInfo().getLocation().y - Display.getY();
            if (n5 >= QS_3.F.k - n2) {
                lz2 = lz3.f().J(lz4.J((double)(((float)n4 / (float)QS_3.F.t - MQa.L) * kta.v))).J().J((double)f2);
                ANa aNa3 = aNa2;
                Lz lz5 = lz2;
                aNa2.f(lz5.A);
                aNa3.J(lz5.j);
                aNa3.l(lz2.J);
            } else if (n5 <= n2) {
                lz2 = lz3.J(lz4.J((double)(((float)n4 / (float)QS_3.F.t - MQa.L) * kta.v))).J().J((double)f2);
                ANa aNa4 = aNa2;
                Lz lz6 = lz2;
                aNa2.f(lz6.A);
                aNa4.J(lz6.j);
                aNa4.l(lz2.J);
            } else if (n4 >= QS_3.F.t - n3) {
                lz2 = lz4.J(lz3.J((double)(((float)n5 / (float)QS_3.F.k - MQa.L) * dua.ca))).J().J((double)f2);
                ANa aNa5 = aNa2;
                Lz lz7 = lz2;
                aNa2.f(lz7.A);
                aNa5.J(lz7.j);
                aNa5.l(lz2.J);
            } else if (n4 <= n3) {
                lz2 = lz4.f().J(lz3.J((double)(((float)n5 / (float)QS_3.F.k - MQa.L) * dua.ca))).J().J((double)f2);
                ANa aNa6 = aNa2;
                Lz lz8 = lz2;
                aNa2.f(lz8.A);
                aNa6.J(lz8.j);
                aNa6.l(lz2.J);
            } else {
                ANa aNa7 = aNa2;
                aNa7.f(aSa.V);
                aNa7.l(aSa.V);
            }
            lz2 = Lz.I;
            if (Cia.J((mIa)cia2.jb)) {
                lz2 = lz2.J(lz3);
            }
            if (Cia.J((mIa)cia2.JA)) {
                lz2 = lz2.J(lz3.f());
            }
            if (Cia.J((mIa)cia2.L)) {
                lz2 = lz2.J(lz4.f());
            }
            if (Cia.J((mIa)cia2.gd)) {
                lz2 = lz2.J(lz4);
            }
            if (lz2 != Lz.I) {
                lz2 = lz2.J((double)f2, (double)f3, (double)f2);
                ANa aNa8 = aNa2;
                Lz lz9 = lz2;
                aNa2.f(lz9.A);
                aNa8.J(lz9.j);
                aNa8.l(lz2.J);
            }
        }
    }

    private static void J(int n2) {
        int n3 = n2;
        if (QS_3.F.c == null) {
            return;
        }
        int n4 = Mouse.getX();
        int n5 = Mouse.getY();
        int n6 = QS_3.F.t;
        int n7 = QS_3.F.k;
        RY a2 = QS_3.F.Oa;
        int n8 = uSa.E;
        int n9 = uSa.E;
        int n10 = uSa.E;
        int n11 = pua.o;
        int n12 = pua.o;
        if (a2 != null) {
            if (a2.A == AY.BLOCK && a2.J() != null) {
                RY rY2 = a2;
                XF xF2 = rY2.J();
                n8 = xF2.getX();
                n9 = xF2.getY();
                n10 = xF2.getZ();
                n11 = rY2.j != null ? a2.j.getIndex() : pua.o;
            } else if (a2.A == AY.ENTITY && a2.J != null) {
                n12 = a2.J.M();
            }
        }
        OT.J((Oo)Oo.J().setIsometricClick(cn.J().setScreenX(n4).setScreenY(n5).setScreenWidth(n6).setScreenHeight(n7).setHoveredBlockX(n8).setHoveredBlockY(n9).setHoveredBlockZ(n10).setHoveredBlockFace(n11).setHoveredEntityId(n12).setMouseButton(n3)).build());
    }

    public static float J() {
        return J;
    }

    private static Lz J(float f2) {
        float f3 = f2;
        float f4 = Oz.C((float)(-f3 * Bua.ga - pua.j));
        float f5 = Oz.d((float)(-f3 * Bua.ga - pua.j));
        float a2 = -Oz.C((float)JPa.N);
        return new Lz((double)(f5 * a2), aSa.V, (double)(f4 * a2));
    }

    public static boolean J() {
        return k;
    }

    private static void f() {
        if (QS_3.F.c == null) {
            return;
        }
        int n2 = Mouse.getX();
        int n3 = Mouse.getY();
        int n4 = QS_3.F.t;
        int n5 = QS_3.F.k;
        RY rY2 = QS_3.F.Oa;
        float f2 = JPa.N;
        float f3 = JPa.N;
        float f4 = JPa.N;
        int n6 = pua.o;
        int n7 = pua.o;
        if (rY2 != null) {
            if (rY2.A == AY.BLOCK && rY2.J() != null) {
                RY rY3 = rY2;
                Lz lz2 = rY3.I;
                f2 = (float)lz2.A;
                f3 = (float)lz2.j;
                f4 = (float)lz2.J;
                n6 = rY3.j != null ? rY2.j.getIndex() : pua.o;
            } else if (rY2.A == AY.ENTITY && rY2.J != null) {
                n7 = rY2.J.M();
            }
        }
        OT.J((Oo)Oo.J().setIsometricMousePosition(io.J().setScreenX(n2).setScreenY(n3).setScreenWidth(n4).setScreenHeight(n5).setHoveredPositionX(f2).setHoveredPositionY(f3).setHoveredPositionZ(f4).setHoveredBlockFace(n6).setHoveredEntityId(n7)).build());
    }

    public static boolean l(int a2) {
        if (!k) {
            return uSa.E != 0;
        }
        QS_3.J(a2);
        return vRa.d != 0;
    }

    public static boolean f(int n2) {
        int n3 = n2;
        float a2 = MQa.L;
        A = Math.max(eua.C, Math.min(A + a2 * (float)(-n3), QTa.G));
        return vRa.d != 0;
    }

    public static boolean J(int a2) {
        if (a2 == QS_3.F.z.yb.getKeyCode() || a2 == QS_3.F.z.WB.getKeyCode() || a2 == QS_3.F.z.ia.getKeyCode() || a2 == QS_3.F.z.ta.getKeyCode()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void J() {
        if (!k) {
            return;
        }
        k = uSa.E;
        F.C();
        if (E != vRa.d) {
            QS_3.F.z.ld = E;
            if (E == 0) {
                QS_3.F.R.J(F.J());
            }
        }
        L = nua.E;
        C = NSa.B;
        A = eta.e;
    }
}

