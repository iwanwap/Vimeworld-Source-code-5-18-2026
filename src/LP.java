/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fr
 *  Kpa
 *  sq
 *  vRa
 */
public final class LP
extends sq {
    private final Fr J;
    private final Fr A;
    private final vp I;

    public boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public LP(Fr fr2, Fr fr3, vp vp2) {
        void b2;
        void c2;
        LP a2;
        Object d2 = vp2;
        LP lP = a2 = this;
        a2.J = c2;
        lP.A = b2;
        lP.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, Bp bp) {
        void a2;
        LP b2;
        LP c22 = kpa2;
        LP lP = b2 = this;
        boolean bl = lP.J.J((Kpa)c22, (Bp)a2);
        boolean c22 = lP.A.J((Kpa)c22, (Bp)a2);
        if (lP.I == vp.AND) {
            if (bl && c22) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (bl || c22) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

