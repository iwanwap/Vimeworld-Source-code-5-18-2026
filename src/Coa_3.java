/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  ERa
 *  Fpa
 *  JPa
 *  KA
 *  Kpa
 *  kNa
 *  ld
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Coa_3
implements PB {
    private final int A;
    private final boolean I;

    /*
     * WARNING - void declaration
     */
    public Coa_3(int n2, boolean bl) {
        void b2;
        Coa_3 a2;
        boolean c2 = bl;
        Coa_3 coa_3 = a2 = this;
        coa_3.A = b2;
        coa_3.I = c2;
    }

    @Override
    public boolean J() {
        Coa_3 a2;
        return a2.I;
    }

    @Override
    public void J(float f2, int n2) {
        int c2 = n2;
        Coa_3 a2 = this;
        Kpa.J().J().J(mna.k);
        if (a2.A < 0) {
            KA.J((int)uSa.E, (int)uSa.E, (float)WPa.E, (float)JPa.N, (int)ERa.C, (int)ERa.C, (float)Fpa.q, (float)Fpa.q);
            return;
        }
        KA.J((int)uSa.E, (int)uSa.E, (float)aua.a, (float)JPa.N, (int)ERa.C, (int)ERa.C, (float)Fpa.q, (float)Fpa.q);
    }

    @Override
    public void J(kNa kNa2) {
        Coa_3 b2 = kNa2;
        Coa_3 a2 = this;
        kNa.J((kNa)b2, (int)a2.A);
    }

    @Override
    public ld J() {
        Coa_3 a2;
        if (a2.A < 0) {
            return new CY(Yua.s);
        }
        return new CY(mSa.t);
    }
}

