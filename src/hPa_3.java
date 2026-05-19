/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F
 *  Ke
 *  kC
 *  vB
 */
import java.awt.Color;

public final class hPa_3
extends vB
implements F {
    public final kC I;

    /*
     * WARNING - void declaration
     */
    public hPa_3(int n2, int n3, Ke ke, Color color, i i2, kC kC2) {
        hPa_3 g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        hPa_3 hPa_32 = hPa_33;
        hPa_3 hPa_33 = kC2;
        hPa_3 a2 = hPa_32;
        super((int)f2, (int)e2, (Ke)d2, (Color)c2, (i)b2);
        a2.I = g2;
    }

    /*
     * WARNING - void declaration
     */
    public hPa_3(int n2, int n3, int n4, int n5, Color color, Ke ke, kC kC2) {
        hPa_3 h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        hPa_3 hPa_32 = hPa_33;
        hPa_3 hPa_33 = kC2;
        hPa_3 a2 = hPa_32;
        super((int)g2, (int)f2, (int)e2, (int)d2, (Color)c2, (Ke)b2);
        a2.I = h2;
    }

    /*
     * WARNING - void declaration
     */
    public hPa_3(Ke ke, Color color, i i2, kC kC2) {
        hPa_3 e2;
        void b2;
        void c2;
        void d2;
        hPa_3 hPa_32 = hPa_33;
        hPa_3 hPa_33 = kC2;
        hPa_3 a2 = hPa_32;
        super((Ke)d2, (Color)c2, (i)b2);
        a2.I = e2;
    }

    /*
     * WARNING - void declaration
     */
    public hPa_3(int n2, int n3, int n4, int n5, Ke ke, Color color, i i2, kC kC2) {
        hPa_3 i3;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        hPa_3 hPa_32 = hPa_33;
        hPa_3 hPa_33 = kC2;
        hPa_3 a2 = hPa_32;
        super((int)h2, (int)g2, (int)f2, (int)e2, (Ke)d2, (Color)c2, (i)b2);
        a2.I = i3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        hPa_3 a2;
        int c2 = n3;
        hPa_3 hPa_32 = a2 = this;
        hPa_3 hPa_33 = a2;
        hPa_33.I.C((double)(hPa_33.I + a2.k / KPa.y));
        hPa_32.I.l(a2.J + a2.j / KPa.y);
        super.J((int)b2, c2);
        hPa_32.I.J((int)b2, c2);
    }
}

