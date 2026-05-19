/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  FPa
 *  Kd
 *  Le
 *  Lra
 *  PF
 *  QF
 *  pPa
 *  vRa
 */
import java.awt.Color;

public final class vD_2
extends QF {
    public vD_2() {
        super(WOa.fa, osa.c, kTa.j, kTa.j, (Color)Bc.Ea, null, (Color)Bc.Ja);
        vD_2 a2;
        a2.A = Kd.S;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        vD_2 vD_22;
        String string;
        void b2;
        vD_2 vD_23;
        int c2 = n3;
        vD_2 a2 = this;
        if (WF.C()) {
            a2.j = a2.A ? Bc.Ja.transparent(WF.J()) : Bc.Ea.transparent(WF.J());
            a2.I = a2.A ? Bc.Ga.transparent(WF.J()) : Bc.Ja.transparent(WF.J());
            vD_23 = a2;
        } else {
            a2.j = a2.A ? Bc.Da.transparent(WF.J()) : Bc.sb.transparent(WF.J());
            a2.I = a2.A ? Bc.L.transparent(WF.J()) : Bc.Da.transparent(WF.J());
            vD_23 = a2;
        }
        vD_23.I = KSa.F + WF.g.l() * Nra.Ga;
        super.J((int)b2, c2);
        Ii ii2 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        if (WF.C()) {
            string = pPa.z;
            vD_22 = a2;
        } else {
            string = Lra.Y;
            vD_22 = a2;
        }
        ii2.J(string, (int)(vD_22.I + DQa.S), (int)(a2.J + FPa.T), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        vD_2 a2 = this;
        if (b2 == false && e2 != false) {
            WF.J((!WF.C() ? vRa.d : uSa.E) != 0);
        }
    }
}

