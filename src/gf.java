/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  Wsa
 *  aSa
 */
import optifine.Config;

public final class gf {
    private long A = System.currentTimeMillis();
    private Lz I = null;

    public Lz J(double c2, double b2, double a2) {
        gf d2;
        if (d2.I == null) {
            d2.I = new Lz(c2, b2, a2);
            return d2.I;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - d2.A;
        if (l3 == nqa.i) {
            return d2.I;
        }
        d2.A = l2;
        if (Math.abs(c2 - d2.I.A) < Wsa.I && Math.abs(b2 - d2.I.j) < Wsa.I && Math.abs(a2 - d2.I.J) < Wsa.I) {
            return d2.I;
        }
        double d3 = (double)l3 * DPa.Ia;
        d3 = Config.J(d3, aSa.V, oua.i);
        c2 -= d2.I.A;
        b2 -= d2.I.j;
        a2 -= d2.I.J;
        gf gf2 = d2;
        c2 = gf2.I.A + c2 * d3;
        b2 = gf2.I.j + b2 * d3;
        a2 = gf2.I.J + a2 * d3;
        gf2.I = new Lz(c2, b2, a2);
        return gf2.I;
    }

    public gf() {
        gf a2;
    }
}

