/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F
 *  KA
 *  Ke
 *  ad
 *  vB
 *  vRa
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class vB_3
extends ad
implements F {
    public Color j;
    private boolean J;
    private i A;
    public final Ke I;

    public vB J(i i2) {
        Object b2 = i2;
        vB_3 a2 = this;
        a2.A = b2;
        return a2;
    }

    public i J() {
        vB_3 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public vB_3(int n2, int n3, int n4, int n5, Ke ke2, Color color, i i2) {
        Object h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        vB_3 a2;
        vB_3 vB_32 = object;
        Object object = i2;
        vB_3 vB_33 = a2 = vB_32;
        super((int)g2, (int)f2, (int)e2, (int)d2);
        a2.J = vRa.d;
        a2.I = c2;
        vB_33.j = b2;
        vB_33.A = h2;
    }

    /*
     * WARNING - void declaration
     */
    public vB_3(Ke ke2, Color color, i i2) {
        void b2;
        void c2;
        vB_3 a2;
        Object d2 = i2;
        vB_3 vB_32 = a2 = this;
        a2.J = vRa.d;
        a2.I = c2;
        vB_32.j = b2;
        vB_32.A = d2;
    }

    /*
     * WARNING - void declaration
     */
    public vB_3(int n2, int n3, Ke ke2, Color color, i i2) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        vB_3 a2;
        vB_3 vB_32 = object;
        Object object = i2;
        vB_3 vB_33 = a2 = vB_32;
        super((int)e2, (int)d2);
        a2.J = vRa.d;
        a2.I = c2;
        vB_33.j = b2;
        vB_33.A = f2;
    }

    public void f() {
    }

    public void J(Color color) {
        Object b2 = color;
        vB_3 a2 = this;
        a2.j = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl3 = bl2;
        vB_3 a2 = this;
        if (a2.A == null) {
            return;
        }
        a2.A.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        vB_3 a2;
        int c2 = n3;
        vB_3 vB_32 = a2 = this;
        super.J((int)b2, c2);
        if (vB_32.j == null || a2.j.getAlpha() == 0) {
            return;
        }
        if (a2.J()) {
            KA.J((int)((int)a2.I), (int)(a2.J ? 1 : 0), (int)((int)(a2.I + a2.k)), (int)(a2.J + a2.j), (int)a2.j.getRGB());
        }
    }

    public boolean J() {
        vB_3 a2;
        return a2.J;
    }

    public Color J() {
        vB_3 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public vB_3(int n2, int n3, int n4, int n5, Color color, Ke ke2) {
        vB_3 g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        vB_3 a2;
        vB_3 vB_32 = vB_33;
        vB_3 vB_33 = ke2;
        vB_3 vB_34 = a2 = vB_32;
        super((int)f2, (int)e2, (int)d2, (int)c2);
        a2.J = vRa.d;
        vB_34.j = b2;
        vB_34.I = g2;
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        vB_3 a2 = this;
        a2.J = b2;
    }
}

