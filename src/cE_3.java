/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Kd
 *  Kpa
 *  Le
 *  PF
 *  QF
 *  pPa
 *  wca
 */
import java.awt.Color;

public final class cE_3
extends QF {
    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a22;
        cE_3 cE_32;
        int c22 = n2;
        cE_3 b2 = this;
        if (b2.A) {
            cE_32 = b2;
            b2.j = Bc.fa.transparent(WF.J());
            b2.I = Bc.ua.transparent(WF.J());
        } else {
            cE_32 = b2;
            b2.j = Bc.Y.transparent(WF.J());
            b2.I = Bc.fa.transparent(WF.J());
        }
        super.J(c22, (int)a22);
        String c22 = WF.l() ? STa.M : uSa.I;
        Ii a22 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        a22.J(c22, (int)(b2.I + (b2.k - (double)a22.f(c22)) / KPa.y), (int)(b2.J + (b2.j - (double)a22.J(c22)) / KPa.y - oua.i), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        cE_3 a2 = this;
        if (e2 != false && b2 == false && WF.f()) {
            Kpa.J().J().J((KC)new wca(WF.l() ? lTa.W : pPa.Ca));
        }
    }

    public cE_3() {
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Y, null, (Color)Bc.fa);
        cE_3 a2;
        a2.A = Kd.S;
    }
}

