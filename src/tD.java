/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Kd
 *  Le
 *  NTa
 *  PF
 *  QF
 *  bc
 *  uKa
 *  vRa
 */
import java.awt.Color;

public final class tD
extends QF {
    private final bc I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        Object c22;
        tD tD2 = this;
        if (WF.J().J() == tD2.I) {
            tD tD3 = tD2;
            tD3.j = Bc.Za.transparent(WF.J());
            tD3.I = Bc.Za.transparent(WF.J());
        } else if (tD2.A) {
            tD tD4 = tD2;
            tD4.j = Bc.Za.transparent(WF.J());
            tD4.I = Bc.X.transparent(WF.J());
        } else {
            tD tD5 = tD2;
            tD5.j = Bc.Ja.transparent(WF.J());
            tD5.I = Bc.Ga.transparent(WF.J());
        }
        Object object = c22 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        tD tD6 = tD2;
        int c22 = ((Ii)c22).f(tD6.I.getDisplayName());
        int n4 = ((Ii)object).J(tD6.I.getDisplayName());
        tD2.k = c22 + NTa.C;
        tD2.j = DPa.Aa;
        super.J((int)b2, (int)a2);
        uKa.B();
        ((Ii)object).J(tD2.I.getDisplayName(), (int)(tD2.I + (tD2.k - (double)c22) / KPa.y + (double)(tD2.I.getDisplayName().length() == vRa.d ? vRa.d : uSa.E)), (int)(tD2.J + (tD2.j - (double)n4) / KPa.y - oua.i), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        tD a2 = this;
        if (WF.J().J() == a2.I) {
            return;
        }
        if (b2 == false && e2 != false) {
            WF.J().J(a2.I);
        }
    }

    public tD(bc bc2) {
        tD b2 = bc2;
        tD a2 = this;
        super(uSa.E, uSa.E, uSa.E, uSa.E, (Color)Bc.Ja.transparent(WF.J()), null, (Color)Bc.Ga.transparent(WF.J()));
        a2.A = Kd.XS;
        a2.I = b2;
    }
}

