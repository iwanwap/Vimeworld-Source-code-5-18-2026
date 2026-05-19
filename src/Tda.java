/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HA
 *  Mda
 *  aX
 *  vRa
 */
public final class Tda
extends sEa {
    private Sx I;

    @Override
    public int J() {
        return vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Sx sx2, Mda mda2) {
        void b2;
        Tda c2 = mda2;
        Tda a2 = this;
        if (c2.J() == Gea.aa && c2.J() > 0) {
            a2.I.J((aX)mY.A);
        }
        super.J((Sx)b2, (Mda)c2);
    }

    /*
     * WARNING - void declaration
     */
    public Tda(Sx sx2, HA hA2, int n2, int n3, int n4) {
        void e2;
        void f2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Tda a2 = this;
        super((HA)d2, (int)c2, (int)b2, (int)f2);
        a2.I = e2;
    }

    @Override
    public boolean J(Mda mda2) {
        Tda b2 = mda2;
        Tda a2 = this;
        return Tda.f((Mda)b2);
    }

    public static boolean f(Mda a2) {
        if (a2 != null && (a2.J() == Gea.aa || a2.J() == Gea.J)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

