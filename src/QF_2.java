/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kd
 *  Ke
 *  if
 *  mA
 *  vB
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QF_2
extends vB {
    public mA J;
    public Kd A;
    public Color I;

    /*
     * WARNING - void declaration
     */
    public QF_2(int n2, int n3, Ke ke, Color color, i i2, Color color2) {
        Object g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        QF_2 qF_2 = object;
        Object object = color2;
        QF_2 a2 = qF_2;
        super((int)f2, (int)e2, (Ke)d2, (Color)c2, (i)b2);
        a2.A = Kd.S_X2;
        a2.I = g2;
    }

    public void J(mA mA2) {
        QF_2 b2 = mA2;
        QF_2 a2 = this;
        a2.J = b2;
    }

    public void f() {
        QF_2 a2;
        if (a2.J == null) {
            return;
        }
        QF_2 qF_2 = a2;
        qF_2.J.J((boolean)qF_2.A);
    }

    public void f(Color color) {
        Object b2 = color;
        QF_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public QF_2(int n2, int n3, int n4, int n5, Color color, Ke ke, Color color2) {
        Object h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        QF_2 qF_2 = object;
        Object object = color2;
        QF_2 a2 = qF_2;
        super((int)g2, (int)f2, (int)e2, (int)d2, (Color)c2, (Ke)b2);
        a2.A = Kd.S_X2;
        a2.I = h2;
    }

    public Color f() {
        QF_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public QF_2(int n2, int n3, int n4, int n5, Ke ke, Color color, i i2, Color color2) {
        Object i3;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        QF_2 qF_2 = object;
        Object object = color2;
        QF_2 a2 = qF_2;
        super((int)h2, (int)g2, (int)f2, (int)e2, (Ke)d2, (Color)c2, (i)b2);
        a2.A = Kd.S_X2;
        a2.I = i3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        QF_2 a2;
        int c2 = n3;
        QF_2 qF_2 = a2 = this;
        super.f((int)b2, c2);
        if (qF_2.j == null && a2.I == null) {
            return;
        }
        if (!a2.J()) {
            return;
        }
        QF_2 qF_22 = a2;
        if (a2.I == null) {
            QF_2 qF_23 = a2;
            if.C((double)qF_22.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)qF_23.j, (Kd)qF_23.A);
            return;
        }
        QF_2 qF_24 = a2;
        if (qF_22.j == null) {
            QF_2 qF_25 = a2;
            if.A((double)qF_24.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)qF_25.I, (Kd)qF_25.A);
            return;
        }
        QF_2 qF_26 = a2;
        if.J((double)qF_24.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)qF_26.j, (Color)qF_26.I, (Kd)a2.A);
    }

    public Kd J() {
        QF_2 a2;
        return a2.A;
    }

    public void J(Kd kd2) {
        QF_2 b2 = kd2;
        QF_2 a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public QF_2(Ke ke, Color color, i i2, Color color2) {
        Object e2;
        void b2;
        void c2;
        void d2;
        QF_2 qF_2 = object;
        Object object = color2;
        QF_2 a2 = qF_2;
        super((Ke)d2, (Color)c2, (i)b2);
        a2.A = Kd.S_X2;
        a2.I = e2;
    }
}

