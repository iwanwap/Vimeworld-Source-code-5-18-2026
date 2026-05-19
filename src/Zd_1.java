/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DE
 *  DQa
 *  Le
 *  PF
 *  Sqa
 *  aSa
 *  if
 *  lE
 *  vB
 *  vRa
 */
import java.awt.Color;
import java.util.Objects;

public final class Zd_1
extends vB {
    private int J;
    private long A;
    private DE I;

    public void J(int n2, int n3) {
        int c22 = n2;
        Zd_1 b2 = this;
        if (System.currentTimeMillis() > b2.A) {
            b2.I = null;
        }
        if (b2.I == null) {
            Zd_1 zd_1 = b2;
            zd_1.k = aSa.V;
            zd_1.j = aSa.V;
            return;
        }
        Zd_1 zd_1 = b2;
        zd_1.k = cPa.x;
        zd_1.j = hQa.x;
        if.f((double)zd_1.I, (double)b2.J, (double)b2.k, (double)b2.j, (Color)b2.I.bgColor().transparent(WF.J()));
        if.f((double)zd_1.I, (double)(b2.J + b2.j - oua.i), (double)b2.k, (double)oua.i, (Color)b2.I.underlineColor().transparent(WF.J()));
        Ii c22 = Le.J((PF)PF.VIME_ART, (lE)lE.THIN, (int)hpa.Z);
        int a2 = (int)(zd_1.J + (b2.j - (double)c22.J(b2.I.content())) / KPa.y) - vRa.d;
        c22.J(b2.I.content(), (int)(b2.I + DQa.S), a2, b2.I.textColor().transparent(WF.J()).getRGB(), uSa.E != 0);
        if (zd_1.I == DE.COULD_NOT_CONNECT) {
            String string = new StringBuilder().insert(3 >> 2, Sqa.G).append(b2.J).toString();
            c22.J(string, (int)(b2.I + b2.k - DQa.S - (double)c22.f(string)), a2, b2.I.textColor().transparent(WF.J()).getRGB(), uSa.E != 0);
        }
    }

    public void J() {
        a.I = null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DE dE, int n2) {
        void b2;
        int c2 = n2;
        Zd_1 a2 = this;
        a2.I = (DE)Objects.requireNonNull(b2);
        Zd_1 zd_1 = a2;
        zd_1.J = c2;
        zd_1.A = System.currentTimeMillis() + lTa.n;
    }

    public Zd_1() {
        Zd_1 a2;
        Zd_1 zd_1 = a2;
        super(uSa.E, uSa.E, uSa.E, uSa.E, null, null);
        zd_1.A = nqa.i;
        zd_1.I = null;
        zd_1.J = uSa.E;
    }
}

