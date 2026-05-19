/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yfa
 *  aFa
 *  cfa
 *  sea
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cea_1
extends aFa {
    private boolean J;
    private cfa A;
    public final /* synthetic */ cfa I;

    /*
     * WARNING - void declaration
     */
    public Cea_1(cfa cfa2, cfa cfa3) {
        void b2;
        Cea_1 c2 = cfa3;
        Cea_1 a2 = this;
        a2.I = b2;
        super((Yfa)c2);
        a2.J = uSa.E;
        a2.A = c2;
    }

    public void f() {
        Cea_1 a2;
        if (a2.A != false) {
            a2.A.J(sea.STEP);
            a2.A = (cfa)uSa.E;
        }
    }

    public boolean f() {
        Cea_1 a2;
        return (boolean)a2.A;
    }

    public boolean J() {
        Cea_1 a2;
        return a2.J;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Cea_1 a2 = this;
        a2.J = b2;
    }
}

