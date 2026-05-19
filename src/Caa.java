/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SZ
 *  Waa
 *  fda
 *  rd
 *  ty
 *  uY
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Caa
extends uY
implements rd {
    private final SZ I;

    public Caa() {
        Caa a2;
        Caa caa2 = a2;
        a2.I = new ty(a2);
    }

    public void J(Waa waa2) {
        Caa a2;
        Caa b2 = waa2;
        Caa caa2 = a2 = this;
        super.J((Waa)b2);
        caa2.I.J((Waa)b2);
    }

    public void J() {
        Caa a2;
        a2.I.J();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void a2;
        int c2 = n2;
        Caa b2 = this;
        if (b2.I.J(c2)) {
            return vRa.d != 0;
        }
        return super.J(c2, (int)a2);
    }

    public boolean C() {
        return vRa.d != 0;
    }

    public void f(Waa waa2) {
        Caa a2;
        Caa b2 = waa2;
        Caa caa2 = a2 = this;
        super.f((Waa)b2);
        caa2.I.f((Waa)b2);
    }

    public SZ J() {
        Caa a2;
        return a2.I;
    }

    public KC J() {
        Caa a2;
        Caa caa2 = this;
        Caa caa3 = a2 = new Waa();
        caa2.J((Waa)caa3);
        caa3.J(sOa.M);
        return new fda(caa2.pos, vRa.d, (Waa)a2);
    }
}

