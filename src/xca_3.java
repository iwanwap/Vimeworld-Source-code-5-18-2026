/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Gg
 *  Lz
 *  Yfa
 *  cAa
 *  dv
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xca_3
extends xaa {
    @Override
    public boolean J(Lz lz2, Lz lz3, int n2, int n3, int n4) {
        RY e2;
        xca_3 f2 = lz3;
        xca_3 d2 = this;
        if ((e2 = d2.m.J((Lz)e2, new Lz(((Lz)f2).A, ((Lz)f2).j + (double)d2.k.u * kTa.B, ((Lz)f2).J), uSa.E != 0, vRa.d != 0, uSa.E != 0)) == null || e2.A == AY.MISS) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        xca_3 a2;
        return a2.J();
    }

    @Override
    public void J() {
        xca_3 a2;
        super.J();
    }

    @Override
    public cAa J() {
        return new cAa((Ex)new dv());
    }

    @Override
    public void C() {
        xca_3 xca_32;
        Lz lz2;
        block3: {
            xca_3 xca_33;
            xca_3 xca_34 = xca_33 = this;
            lz2 = xca_34.J();
            float a2 = xca_34.k.F * xca_33.k.F;
            int n2 = uua.p;
            xca_3 xca_35 = xca_33;
            if (lz2.l(xca_35.E.J((vL)xca_35.k, xca_33.E.f())) < (double)a2) {
                xca_33.E.J();
            }
            int n3 = a2 = Math.min(xca_33.E.f() + n2, xca_33.E.J() - vRa.d);
            while (n3 > xca_33.E.f()) {
                Lz lz3;
                xca_3 xca_36 = xca_33;
                Lz lz4 = xca_36.E.J((vL)xca_36.k, a2);
                if (lz3.l(lz2) <= Qra.l && xca_33.J(lz2, lz4, uSa.E, uSa.E, uSa.E)) {
                    xca_3 xca_37 = xca_33;
                    xca_32 = xca_37;
                    xca_37.E.J(a2);
                    break block3;
                }
                n3 = --a2;
            }
            xca_32 = xca_33;
        }
        xca_32.J(lz2);
    }

    /*
     * WARNING - void declaration
     */
    public xca_3(Yfa yfa2, Gg gg2) {
        void b2;
        xca_3 c2 = gg2;
        xca_3 a2 = this;
        super((Yfa)b2, (Gg)c2);
    }

    @Override
    public Lz J() {
        xca_3 a2;
        return new Lz(a2.k.la, a2.k.Z + (double)a2.k.u * kTa.B, a2.k.A);
    }
}

