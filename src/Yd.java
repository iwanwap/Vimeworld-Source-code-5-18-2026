/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A
 *  Bc
 *  Bpa
 *  DQa
 *  FPa
 *  Le
 *  NTa
 *  PF
 *  Sf
 *  if
 *  kPa
 *  pua
 *  uRa
 *  vB
 *  vQa
 *  vRa
 *  wOa
 */
import java.awt.Color;

public final class Yd
extends vB {
    private final A I;

    public Yd(A a2) {
        Yd b2 = a2;
        Yd a3 = this;
        super(uSa.E, uSa.E, DPa.J, wOa.t, null, null);
        a3.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        Yd a2 = this;
        if (b2 == false && e2 != false) {
            Yd yd = a2;
            yd.I.J((!yd.I.J() ? vRa.d : uSa.E) != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b22;
        Yd a2;
        int c22 = n3;
        Yd yd = a2 = this;
        super.J((int)b22, c22);
        if (yd.A) {
            if.f((double)(a2.I + oua.i), (double)a2.J, (double)(a2.k - KPa.y), (double)a2.j, (Color)Bc.Ja.transparent(WF.J()));
        }
        String b22 = a2.I.J() ? vQa.L : Bpa.W;
        String c22 = a2.I.J() ? kPa.M : ySa.O;
        Sf.J((char)b22.charAt(uSa.E)).J((int)(a2.I + DQa.S), (int)(a2.J + FPa.T), NTa.C, NTa.C, Bc.Ba.transparent(WF.J()).getRGB());
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(c22, (int)(a2.I + pua.Ha), (int)(a2.J + uRa.I), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }
}

