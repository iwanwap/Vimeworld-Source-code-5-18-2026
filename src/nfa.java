/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  OEa
 *  gFa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class nfa
extends gFa {
    private double k;
    private double j;
    public double J;
    private bga A;
    private double I;

    /*
     * WARNING - void declaration
     */
    public nfa(bga bga2, double d2) {
        void a2;
        Object c2 = bga2;
        nfa b2 = this;
        b2.A = c2;
        b2.J = a2;
        b2.J(vRa.d);
    }

    public void l() {
        nfa a2;
        a2.A.J().J(a2.k, a2.j, a2.I, a2.J);
    }

    public boolean l() {
        nfa a2;
        if (!a2.A.J().f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        nfa nfa2 = this;
        if (nfa2.A.f() == null && !nfa2.A.o()) {
            return uSa.E != 0;
        }
        nfa a2 = OEa.J((bga)nfa2.A, (int)tTa.h, (int)AQa.P);
        if (a2 == null) {
            return uSa.E != 0;
        }
        nfa nfa3 = nfa2;
        nfa nfa4 = a2;
        nfa2.k = ((Lz)a2).A;
        nfa3.j = ((Lz)nfa4).j;
        nfa3.I = ((Lz)nfa4).J;
        return vRa.d != 0;
    }
}

