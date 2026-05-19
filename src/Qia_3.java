/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Lz
 *  OEa
 *  XTa
 *  gFa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qia_3
extends gFa {
    private double k;
    private double j;
    private double J;
    private bga A;
    private double I;

    public void l() {
        Qia_3 a2;
        a2.A.J().J(a2.k, a2.I, a2.J, a2.j);
    }

    public boolean f() {
        Qia_3 qia_3 = this;
        if (qia_3.A.V()) {
            return uSa.E != 0;
        }
        Qia_3 qia_32 = qia_3;
        Object a2 = qia_32.A.f();
        if ((a2 = OEa.l((bga)qia_32.A, (int)ERa.C, (int)XTa.W, (Lz)new Lz((double)a2.getX(), (double)a2.getY(), (double)a2.getZ()))) == null) {
            return uSa.E != 0;
        }
        Qia_3 qia_33 = qia_3;
        Object object = a2;
        qia_3.k = ((Lz)a2).A;
        qia_33.I = ((Lz)object).j;
        qia_33.J = ((Lz)object).J;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Qia_3(bga bga2, double d2) {
        void a2;
        Object c2 = bga2;
        Qia_3 b2 = this;
        b2.A = c2;
        b2.j = a2;
        b2.J(vRa.d);
    }

    public boolean l() {
        Qia_3 a2;
        if (!a2.A.J().f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

