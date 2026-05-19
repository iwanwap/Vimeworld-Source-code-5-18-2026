/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Epa
 *  Le
 *  PF
 *  Ve
 *  lPa
 *  tQa
 *  vB
 */
import java.awt.Color;

public final class vF_2
extends vB {
    private final byte[] A;
    private final String I;

    public vF_2(byte[] byArray) {
        vF_2 a2;
        Object b2 = byArray;
        vF_2 vF_22 = a2 = this;
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Ga, null);
        vF_22.A = (byte[])b2;
        vF_22.I = tQa.J((byte[])b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        vF_2 a2 = this;
        if (b2 == false && e2 != false) {
            WF.J(a2.A);
            Ve.f(uSa.E != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        vF_2 a2 = this;
        a2.j = (a2.A != false ? Bc.Za : Bc.Ga).transparent(WF.J());
        super.J((int)b2, c2);
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(Ve.J((int)Epa.u, (String)a2.I), (int)(a2.I + hpa.y), (int)(a2.J + a2.j / KPa.y - lPa.K), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }
}

