/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Le
 *  NQa
 *  PF
 *  kC
 *  pqa
 *  vRa
 */
public final class fb_1
extends kC {
    private int I = uSa.E;

    public fb_1() {
        super(null, Mqa.y, null);
        fb_1 a2;
        a2.k = DPa.Aa;
        a2.j = DPa.Aa;
    }

    public void l(int n2) {
        int b2 = n2;
        fb_1 a2 = this;
        a2.I = b2;
    }

    public void l() {
        a.I += vRa.d;
    }

    public void J(int n2, int n3) {
        int c2 = n2;
        fb_1 b2 = this;
        if (b2.I == 0) {
            return;
        }
        Ii ii2 = c2 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        ii2.J(NQa.C + b2.I, b2.I, (int)(b2.J + (b2.j - DPa.Aa) / KPa.y - oua.i), Bc.Ya.transparent(pqa.r - WF.J()).getRGB(), uSa.E != 0);
        ii2.J(new StringBuilder().insert(5 >> 3, NQa.C).append(b2.I).toString(), b2.I, (int)(b2.J + (b2.j - DPa.Aa) / KPa.y - KPa.y), Bc.Wa.transparent(pqa.r - WF.J()).getRGB(), uSa.E != 0);
    }

    public void J() {
        a.I -= vRa.d;
    }
}

