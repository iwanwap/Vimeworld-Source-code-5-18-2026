/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LIa
 *  Yfa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Tha_2
extends LIa {
    public int A;
    public boolean I;

    public void J() {
        Tha_2 a2;
        if (a2.I) {
            Tha_2 tha_2 = a2;
            tha_2.M.J(tha_2.j.j, a2.k, uSa.E != 0);
        }
    }

    public void l() {
        Tha_2 a2;
        a2.A = kTa.j;
        a2.M.J(a2.j.j, a2.k, vRa.d != 0);
    }

    public void f() {
        Tha_2 a2;
        Tha_2 tha_2 = a2;
        tha_2.A -= vRa.d;
        super.f();
    }

    public boolean l() {
        Tha_2 a2;
        if (a2.I && a2.A > 0 && super.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Tha_2(Yfa yfa, boolean bl) {
        void b2;
        Tha_2 a2;
        boolean c2 = bl;
        Tha_2 tha_2 = a2 = this;
        void v1 = b2;
        super((Yfa)v1);
        tha_2.j = v1;
        tha_2.I = c2;
    }
}

