/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  UZ
 *  aSa
 *  gZ
 *  nEa
 *  vL
 */
public final class Pda
extends nEa {
    /*
     * WARNING - void declaration
     */
    public Pda(Gg gg2, Gl gl2) {
        void b2;
        Pda c2 = gl2;
        Pda a2 = this;
        super((Gg)b2, (Gl)c2);
    }

    /*
     * WARNING - void declaration
     */
    public Pda(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Pda e2 = gg2;
        Pda d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(RY rY2) {
        int b22;
        void a2;
        Pda pda2 = this;
        if (a2.J != null) {
            int b22 = uSa.E;
            if (a2.J instanceof Zfa) {
                b22 = yRa.d;
            }
            Pda pda3 = pda2;
            a2.J.J(gZ.J((vL)pda3, (vL)pda3.J()), (float)b22);
        }
        int n2 = b22 = uSa.E;
        while (n2 < Yqa.i) {
            int n3 = 2 ^ 3;
            pda2.j.J(UZ.SNOWBALL, pda2.la, pda2.Z, pda2.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            n2 = ++b22;
        }
        if (!pda2.j.e) {
            pda2.k();
        }
    }

    public Pda(Gg gg2) {
        Pda b2 = gg2;
        Pda a2 = this;
        super((Gg)b2);
    }
}

