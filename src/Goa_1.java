/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  MNa
 *  Qta
 *  Wc
 *  dpa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Goa_1
implements Wc {
    private long j;
    public final Kpa J;
    public final MNa A;
    private final uLa I;

    public boolean J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int g2 = n2;
        Goa_1 f2 = this;
        f2.I.J(g2);
        if (Kpa.J() - f2.j < DPa.o) {
            f2.I.f();
        }
        f2.j = Kpa.J();
        return uSa.E != 0;
    }

    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7;
        Goa_1 a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public Goa_1(uLa uLa2, MNa mNa) {
        void b2;
        Goa_1 a2;
        Goa_1 c2 = mNa;
        Goa_1 goa_1 = a2 = this;
        a2.j = nqa.i;
        goa_1.I = b2;
        goa_1.A = c2;
        goa_1.J = Kpa.J();
    }

    public MNa J() {
        Goa_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        void g2;
        int i2 = n4;
        Goa_1 f2 = this;
        f2.J.Ea.J(oha.J(dpa.w, new Object[uSa.E]), (int)(g2 + fPa.i + yRa.d), i2 + vRa.d, pua.o);
        f2.J.Ea.J(f2.A.J(), (int)(g2 + fPa.i + yRa.d), i2 + lqa.s, Qta.L);
        if (f2.J.z.qb) {
            f2.J.Ea.J(oha.J(Lsa.I, new Object[uSa.E]), (int)(g2 + fPa.i + yRa.d), i2 + lqa.s + pPa.f, Upa.B);
            return;
        }
        f2.J.Ea.J(f2.A.f(), (int)(g2 + fPa.i + yRa.d), i2 + lqa.s + pPa.f, Upa.B);
    }

    public void J(int n2, int n3, int n4) {
        int d2 = n4;
        Goa_1 goa_1 = this;
    }
}

