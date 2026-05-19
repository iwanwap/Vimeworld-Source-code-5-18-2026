/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Oqa
 *  aSa
 *  ad
 *  vRa
 */
public final class TT
extends eF {
    private final mx I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void a2;
        void b2;
        TT tT;
        TT tT2 = tT = this;
        TT tT3 = tT;
        tT3.C();
        tT2.f((int)b2, (int)a2);
        double d2 = tT3.I.l() * uqa.g;
        for (TT c2 : tT2.f) {
            ad ad2;
            if (!(ad2.C() < d2) || !(c2.C() + c2.J() > aSa.V)) continue;
            c2.J((int)b2, (int)a2);
        }
    }

    public TT(mx mx2) {
        Object b2 = mx2;
        TT a2 = this;
        super(uSa.E, uSa.E, uSa.E, uSa.E, Oqa.COLUMN, ERa.C, vRa.d != 0);
        a2.I = b2;
    }
}

