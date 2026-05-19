/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  bRa
 *  pqa
 *  vRa
 *  vpa
 *  wI
 *  wPa
 *  zTa
 */
public final class qq_2
extends dQ {
    private int I;

    @Override
    public boolean J(int n2) {
        int a2;
        qq_2 qq_22 = this;
        if ((a2 = Oz.f((int)(qq_22.I + a2), (int)bRa.L, (int)vpa.o)) == qq_22.I) {
            return vRa.d != 0;
        }
        qq_2 qq_23 = qq_22;
        qq_23.I = a2;
        float b22 = pqa.r + (float)a2 / QTa.G;
        qq_23.I.k.J(b22);
        qq_23.I.J.J(b22);
        wI b22 = new wI();
        b22.put((Object)Wqa.fa, (Object)zTa.P);
        b22.put((Object)wPa.O, (Object)a2);
        OT.J(b22);
        return vRa.d != 0;
    }

    public qq_2(Bp bp2) {
        Bp b2 = bp2;
        qq_2 a2 = this;
        super(b2);
        a2.I = Math.round((b2.k.f() - pqa.r) * QTa.G);
    }
}

