/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  KA
 *  Kpa
 *  NQa
 *  RPa
 *  uKa
 */
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class He {
    private final int M;
    private final int k;
    private final int j;
    private final DF J;
    private final int A;
    private final char I;

    /*
     * WARNING - void declaration
     */
    public He(DF dF2, char c2, int n2, int n3, int n4, int n5) {
        void g;
        void b2;
        void c3;
        void d2;
        void e2;
        void f2;
        He a2;
        int n6 = n5;
        He he = a2 = this;
        He he2 = a2;
        He he3 = a2;
        he3.J = f2;
        he3.I = e2;
        he2.A = d2;
        he2.M = c3;
        he.j = b2;
        he.k = g;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void e2;
        void f2;
        void g;
        void b2;
        void c2;
        void d2;
        int n8 = n7;
        He a2 = this;
        uKa.f((float)((float)d2 / NQa.Y), (float)((float)c2 / NQa.Y), (float)((float)b2 / NQa.Y), (float)((float)g / NQa.Y));
        a2.J((int)f2, (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        void e2;
        void f2;
        void g;
        void h;
        void i2;
        void b2;
        void c2;
        void d2;
        int n10 = n9;
        He a2 = this;
        uKa.f((float)((float)d2 / NQa.Y), (float)((float)c2 / NQa.Y), (float)((float)b2 / NQa.Y), (float)((float)i2 / NQa.Y));
        a2.J((int)h, (int)g, (int)f2, (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        He a2 = this;
        a2.J((int)b2, c2, WOa.fa, WOa.fa);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        He a2 = this;
        int n5 = d2 >> ERa.C & osa.Ja;
        int n6 = d2 >> Yqa.i & osa.Ja;
        int n7 = d2 & osa.Ja;
        d2 = d2 >> osa.c & osa.Ja;
        a2.J((int)c2, (int)b2, n5, n6, n7, d2);
    }

    public char J() {
        He a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6) {
        void b2;
        void c2;
        void d2;
        void e2;
        int f2;
        int n7 = n6;
        He a2 = this;
        int n8 = f2 >> osa.c & osa.Ja;
        int n9 = f2 >> ERa.C & osa.Ja;
        int n10 = f2 >> Yqa.i & osa.Ja;
        a2.J((int)e2, (int)d2, (int)c2, (int)b2, n9, n10, f2 &= osa.Ja, n8);
    }

    public int C() {
        He a2;
        return a2.j;
    }

    public int l() {
        He a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        He a2 = this;
        Kpa.J().J().J(a2.J.J());
        uKa.K();
        if (a2.J.J()) {
            GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            GL11.glEnable(RPa.U);
        }
        He he = a2;
        KA.J((int)d2, (int)c2, (float)a2.A, (float)a2.M, (int)he.j, (int)he.k, (int)b2, (int)e2, (float)a2.J.f(), (float)a2.J.J());
        if (a2.J.J()) {
            GL11.glDisable(RPa.U);
        }
    }

    public int f() {
        He a2;
        return a2.k;
    }

    public int J() {
        He a2;
        return a2.M;
    }

    public DF J() {
        He a2;
        return a2.J;
    }
}

