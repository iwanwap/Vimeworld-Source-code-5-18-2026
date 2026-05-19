/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gc
 *  Kpa
 *  ac
 *  vRa
 */
public final class Lna
extends ac {
    private final Gc J;
    private boolean A;
    private String I;

    public void J(boolean bl) {
        Lna a2;
        boolean b2 = bl;
        Lna lna = a2 = this;
        lna.A = b2;
        lna.i = lna.J();
        lna.J.J(a2.C, b2);
    }

    /*
     * WARNING - void declaration
     */
    public Lna(Gc gc2, int n2, int n3, int n4, String string, boolean bl) {
        void f2;
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        Lna a2;
        boolean bl2 = bl;
        Lna lna = a2 = this;
        super((int)e2, (int)d2, (int)c2, Jpa.Ha, kTa.j, Mqa.y);
        lna.I = b2;
        lna.A = g2;
        a2.i = a2.J();
        a2.J = f2;
    }

    private String J() {
        Lna a2;
        return oha.J(a2.I, new Object[uSa.E]) + Xpa.E + (a2.A ? oha.J(dsa.Ha, new Object[uSa.E]) : oha.J(MTa.P, new Object[uSa.E]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, int n2, int n3) {
        void b2;
        void c2;
        Lna a2 = this;
        int d2 = n3;
        if (super.J((Kpa)c2, (int)b2, d2)) {
            a2.A = !a2.A ? vRa.d : uSa.E;
            Lna lna = a2;
            lna.i = lna.J();
            Lna lna2 = a2;
            lna.J.J(lna2.C, lna2.A);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

