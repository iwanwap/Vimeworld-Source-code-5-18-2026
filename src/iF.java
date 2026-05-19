/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Epa
 *  Le
 *  PF
 *  Wd
 *  lPa
 *  vB
 */
import java.awt.Color;

public final class iF
extends vB {
    private final String I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        iF a2 = this;
        if (b2 == false && e2 != false) {
            WF.e(a2.I);
            Wd.f(uSa.E != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        iF a2 = this;
        a2.j = (a2.A ? Bc.Za : Bc.Ga).transparent(WF.J());
        super.J((int)b2, c2);
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(Wd.J((int)Epa.u, (String)a2.I), (int)(a2.I + hpa.y), (int)(a2.J + a2.j / KPa.y - lPa.K), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    public iF(String string) {
        Object b2 = string;
        iF a2 = this;
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Ga, null);
        a2.I = b2;
    }
}

