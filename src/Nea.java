/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dc
 *  Gg
 *  HA
 *  Mda
 *  Tz
 *  Uz
 *  lfa
 *  vRa
 */
public final class Nea
extends sEa {
    private final Dc M;
    private final lfa k;
    private Sx j;
    private int J;

    /*
     * WARNING - void declaration
     */
    public Nea(Sx sx, Dc dc2, lfa lfa2, int n2, int n3, int n4) {
        void e2;
        void f2;
        void a2;
        void b2;
        void c2;
        Nea d2;
        Nea g = lfa2;
        Nea nea = d2 = this;
        super((HA)g, (int)c2, (int)b2, (int)a2);
        d2.j = f2;
        nea.M = e2;
        nea.k = g;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Sx sx, Mda mda2) {
        Uz a2;
        Nea nea;
        Nea nea2 = nea = this;
        nea2.f((Mda)a2);
        a2 = nea2.k.J();
        if (a2 != null) {
            Nea c2;
            Nea nea3 = nea;
            Mda mda3 = nea3.k.J(uSa.E);
            if (nea3.J(a2, mda3, (Mda)(c2 = nea3.k.J(vRa.d))) || nea.J(a2, (Mda)c2, mda3)) {
                void b2;
                nea.M.J(a2);
                b2.J(Tz.t);
                if (mda3 != null && mda3.E <= 0) {
                    mda3 = null;
                }
                if (c2 != null && ((Mda)c2).E <= 0) {
                    c2 = null;
                }
                Nea nea4 = nea;
                nea4.k.J(uSa.E, mda3);
                nea4.k.J(vRa.d, (Mda)c2);
            }
        }
    }

    @Override
    public Mda J(int n2) {
        int b2 = n2;
        Nea a2 = this;
        if (a2.J()) {
            a2.J += Math.min(b2, a2.J().E);
        }
        return super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Uz uz2, Mda mda2, Mda mda3) {
        void b2;
        Mda c2;
        Nea nea = this;
        void v0 = c2;
        c2 = v0.J();
        Nea d2 = v0.f();
        if (b2 != null && b2.J() == c2.J()) {
            void a2;
            if (d2 != null && a2 != null && d2.J() == a2.J()) {
                b2.E -= c2.E;
                a2.E -= ((Mda)d2).E;
                return vRa.d != 0;
            }
            if (d2 == null && a2 == null) {
                b2.E -= c2.E;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Mda mda2, int n2) {
        void b2;
        Nea a2;
        int c2 = n2;
        Nea nea = a2 = this;
        nea.J += c2;
        nea.f((Mda)b2);
    }

    @Override
    public boolean J(Mda mda2) {
        Nea b2 = mda2;
        Nea a2 = this;
        return uSa.E != 0;
    }

    @Override
    public void f(Mda mda2) {
        Nea b2 = mda2;
        Nea a2 = this;
        b2.J((Gg)a2.j.j, a2.j, a2.J);
        a2.J = uSa.E;
    }
}

