/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Oz
 *  aSa
 *  pqa
 *  xb
 */
import optifine.Config;

public final class bja_3
extends KLa {
    private double J;
    private static final String A = "CL_00001070";
    private double I;

    @Override
    public void f() {
        bja_3 bja_32 = this;
        if (!bja_32.q.isEmpty()) {
            bja_3 a2 = Kpa.J();
            double d2 = aSa.V;
            if (((Kpa)a2).Ta != null && ((Kpa)a2).c != null) {
                bja_3 bja_33 = a2;
                d2 = ((Kpa)bja_33).Ta.e(pqa.r);
                if (!((Kpa)bja_33).Ta.F.J()) {
                    d2 = Math.random();
                }
            }
            double d3 = d2 = d2 - bja_32.J;
            while (d3 < KPa.I) {
                d3 = d2 + oua.i;
            }
            double d4 = d2;
            while (d4 >= kTa.B) {
                d4 = d2 - oua.i;
            }
            d2 = Oz.J((double)d2, (double)pqa.q, (double)oua.i);
            bja_3 bja_34 = bja_32;
            bja_34.I += d2 * tpa.k;
            bja_34.I *= Jra.A;
            bja_34.J += bja_32.I;
            int n2 = a2 = (int)((bja_34.J + oua.i) * (double)bja_32.q.size()) % bja_32.q.size();
            while (n2 < 0) {
                n2 = (a2 + bja_32.q.size()) % bja_32.q.size();
            }
            if (a2 != bja_32.v) {
                bja_32.v = a2;
                bja_3 bja_35 = bja_32;
                if (Config.h()) {
                    bja_3 bja_36 = bja_32;
                    bja_3 bja_37 = bja_32;
                    xb.J((int[][])((int[][])bja_35.q.get(bja_32.v)), (int)bja_36.d, (int)bja_36.G, (int)bja_37.A, (int)bja_37.L, uSa.E != 0, uSa.E != 0);
                    return;
                }
                bja_3 bja_38 = bja_32;
                bja_3 bja_39 = bja_32;
                gLa.J((int[][])bja_35.q.get(bja_32.v), bja_38.d, bja_38.G, (int)bja_39.A, bja_39.L, uSa.E != 0, uSa.E != 0);
            }
        }
    }

    public bja_3(String string) {
        String b2 = string;
        bja_3 a2 = this;
        super(b2);
    }
}

