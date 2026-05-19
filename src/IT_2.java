/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Le
 *  PF
 *  QF
 *  tS
 *  vRa
 *  zU
 */
import java.awt.Color;
import java.io.IOException;

public final class IT_2
extends QF {
    private String j;
    private boolean J;
    private final tS I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void a2;
        int e22 = n2;
        IT_2 d2 = this;
        if (a2 == false) {
            return;
        }
        try {
            d2.I.J().l();
            d2.J = vRa.d;
            d2.j = null;
            return;
        }
        catch (IOException e22) {
            IT_2 iT_2 = d2;
            iT_2.J = uSa.E;
            iT_2.j = e22.getMessage();
            zU.L.error(wta.fa, (Throwable)e22);
            return;
        }
    }

    public void f(boolean bl2) {
        boolean b2 = bl2;
        IT_2 a2 = this;
        a2.J = b2;
        if (!a2.J) {
            a2.j = null;
        }
    }

    public IT_2(tS tS2) {
        IT_2 b2 = tS2;
        IT_2 a2 = this;
        super(uSa.E, uSa.E, (int)b2.l(), ITa.E, (Color)Bc.sb, null, (Color)Bc.Da);
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b22;
        int c22 = n3;
        IT_2 a2 = this;
        a2.k = a2.I.l();
        a2.f((int)b22, c22);
        a2.j = a2.A ? Bc.Da : Bc.sb;
        IT_2 iT_2 = a2;
        super.J((int)b22, c22);
        Ii b22 = Le.J((PF)PF.VIME_ART, (int)kTa.j);
        String c22 = iT_2.j != null ? yOa.K : (a2.J ? Bua.g : Gta.H);
        b22.J(c22, (int)(a2.I + a2.k / KPa.y - (double)(b22.f(c22) / uqa.g)), a2.J + a2.j / KPa.y - (double)(b22.J(c22) / uqa.g), Bc.Ba.getRGB(), uSa.E != 0);
    }
}

