/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  Kd
 *  Le
 *  PF
 *  QF
 *  aSa
 *  pPa
 *  qf
 *  vQa
 *  vRa
 *  wPa
 *  wra
 */
import java.awt.Color;

public final class TE_3
extends QF {
    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        TE_3 a2 = this;
        if (!qf.J().J() || !WF.f()) {
            TE_3 tE_3 = a2;
            tE_3.I = wra.Ja;
            tE_3.J = wra.Ja;
            tE_3.k = aSa.V;
            tE_3.j = aSa.V;
            return;
        }
        a2.I = WF.J().f();
        a2.J = WF.J().C() + WF.J().J() + Wqa.m;
        a2.k = cPa.x;
        a2.j = vQa.c;
        a2.j = (a2.A ? Bc.Da : Bc.sb).transparent(WF.J());
        a2.I = (a2.A ? Bc.L : Bc.Da).transparent(WF.J());
        super.J((int)b2, c2);
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(wPa.e, (int)(a2.I + DQa.S), (int)(a2.J + DQa.S), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(pPa.z, (int)(a2.I + a2.k - DQa.S - KSa.F), (int)(a2.J + DQa.S), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    public TE_3() {
        super(uSa.E, uSa.E, DPa.J, kTa.j, (Color)Bc.sb, null, (Color)Bc.Da);
        TE_3 a2;
        a2.A = Kd.S;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        boolean bl3 = bl2;
        TE_3 a2 = this;
        if (b2 == false && e2 != false) {
            WF.J((!WF.C() ? vRa.d : uSa.E) != 0);
        }
    }
}

