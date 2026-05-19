/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  hna
 *  sq
 */
public final class qp_2
extends sq {
    private final String I;

    public qp_2(String string) {
        Object b2 = string;
        qp_2 a2 = this;
        a2.I = b2;
    }

    public boolean J(Kpa kpa2, Bp bp2) {
        qp_2 c2 = kpa2;
        qp_2 b2 = this;
        if (((Kpa)c2).ta instanceof hna) {
            return ((hna)((Kpa)c2).ta).A.J().f().equals(b2.I);
        }
        return uSa.E != 0;
    }
}

