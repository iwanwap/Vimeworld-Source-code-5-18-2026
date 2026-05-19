/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ifa
 *  Lx
 *  RC
 *  lea
 */
public final class DFa_2
extends lea {
    private Lx A;
    private Lx I;

    public double J() {
        DFa_2 a2;
        DFa_2 dFa_2 = a2;
        double d2 = super.J();
        if (!dFa_2.A.equals(d2, qQa.g)) {
            throw new RuntimeException(qQa.u);
        }
        return d2;
    }

    public void J(double a2) {
        DFa_2 b2;
        super.J(a2);
        DFa_2 dFa_2 = b2;
        dFa_2.A = new Lx(a2);
    }

    public double l() {
        DFa_2 a2;
        double d2 = super.l();
        DFa_2 dFa_2 = a2;
        dFa_2.I = new Lx(d2);
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public DFa_2(Ifa ifa, RC rC2) {
        void b2;
        DFa_2 c2 = rC2;
        DFa_2 a2 = this;
        super((Ifa)b2, (RC)c2);
        DFa_2 dFa_2 = a2;
        a2.A = new Lx(a2.M);
        dFa_2.I = new Lx(a2.J);
    }

    public double f() {
        DFa_2 a2;
        DFa_2 dFa_2 = a2;
        double d2 = super.f();
        if (!dFa_2.I.equals(d2, qQa.g)) {
            throw new RuntimeException(aua.ja);
        }
        return d2;
    }
}

