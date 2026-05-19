/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Ke
 *  Kpa
 *  Le
 *  PF
 *  QF
 *  Qsa
 *  Tpa
 *  Zc
 *  pua
 *  uKa
 */
import java.awt.Color;

public final class nR_3
extends QF {
    private final Zc I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        nR_3 nR_32 = this;
        if (nR_32.I <= mx.J().J().f() + mx.J().J().l()) {
            return;
        }
        Ii c2 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        int n4 = Kpa.J().d() ? uSa.E : (nR_32.I == Zc.VIMER ? Zc.getVimers() : Zc.getCoins());
        nR_32.k = c2.f(nR_32.I.getSymbol() + Tpa.E + n4) + yOa.B;
        super.J((int)b2, (int)a2);
        uKa.K();
        c2.J(nR_32.I.getSymbol() + Tpa.E + n4, (int)(nR_32.I + KSa.F), (int)(nR_32.J + nR_32.j / KPa.y - (double)(c2.J(Mqa.y) / uqa.g)) - uqa.g, pua.o, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public nR_3(mx mx2, Zc zc2) {
        void b2;
        nR_3 c2 = zc2;
        nR_3 a2 = this;
        super((Ke)b2, (Color)Bc.Ea, null, (Color)Bc.Ja);
        a2.j = ITa.a;
        a2.I = c2;
    }
}

