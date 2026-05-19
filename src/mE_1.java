/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  EC
 *  FPa
 *  Kd
 *  Kpa
 *  Le
 *  NTa
 *  PF
 *  QF
 *  Sf
 *  Spa
 *  Xoa
 *  if
 *  pua
 *  uKa
 *  uRa
 *  wOa
 *  wra
 */
import java.awt.Color;

public final class mE_1
extends QF {
    private final rc A;
    private final rc I = Bc.Ya;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        mE_1 a2;
        int c2 = n3;
        mE_1 mE_12 = a2 = this;
        super.f((int)b2, c2);
        mE_12.j = (mE_12.A != false ? Bc.k : a2.I).transparent(WF.J());
        a2.I = (a2.A != false ? Bc.d : a2.A).transparent(WF.J());
        uKa.K();
        uKa.B();
        mE_1 mE_13 = a2;
        if.l((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)mE_13.j, (Color)mE_13.I, (Kd)a2.A);
        uKa.K();
        uKa.B();
        Sf.J((char)Spa.Ja).J((int)(a2.I + DQa.S), (int)(a2.J + FPa.T), NTa.C, NTa.C, Bc.Ba.transparent(WF.J()).getRGB());
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(aua.B, (int)(a2.I + pua.Ha), (int)(a2.J + uRa.I), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        mE_1 a2 = this;
        if (e2 != false && b2 == false) {
            Kpa.J().J((EC)new Xoa(wra.I));
        }
    }

    public mE_1() {
        super(uSa.E, uSa.E, DPa.J, wOa.t, null, null, null);
        mE_1 a2;
        a2.A = Bc.k;
        a2.A = Kd.S;
    }
}

