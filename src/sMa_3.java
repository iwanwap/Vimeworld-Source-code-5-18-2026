/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Oz
 *  YSa
 *  cQa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sMa_3 {
    private int k;
    private int j;
    private int J;
    private final double A;
    private final double I;

    public double f() {
        sMa_3 a2;
        return a2.I;
    }

    public int l() {
        sMa_3 a2;
        return a2.J;
    }

    public double J() {
        sMa_3 a2;
        return a2.A;
    }

    public int f() {
        sMa_3 a2;
        return a2.k;
    }

    public sMa_3(Kpa kpa2) {
        sMa_3 a2;
        sMa_3 b22 = kpa2;
        sMa_3 sMa_32 = a2 = this;
        sMa_3 sMa_33 = b22;
        a2.k = ((Kpa)b22).t;
        sMa_32.j = ((Kpa)sMa_33).k;
        sMa_32.J = vRa.d;
        int b22 = ((Kpa)sMa_33).z.F;
        if (b22 == 0) {
            b22 = PRa.U;
        }
        sMa_3 sMa_34 = a2;
        while (sMa_34.J < b22) {
            sMa_3 sMa_35 = a2;
            if (sMa_35.k / (sMa_35.J + vRa.d) < cQa.Z) break;
            sMa_3 sMa_36 = a2;
            if (sMa_36.j / (sMa_36.J + vRa.d) < YSa.c) break;
            sMa_3 sMa_37 = a2;
            sMa_34 = sMa_37;
            sMa_37.J += vRa.d;
        }
        sMa_3 sMa_38 = a2;
        a2.I = (double)sMa_38.k / (double)a2.J;
        sMa_38.A = (double)sMa_38.j / (double)a2.J;
        sMa_38.k = Oz.J((double)sMa_38.I);
        sMa_38.j = Oz.J((double)sMa_38.A);
    }

    public int J() {
        sMa_3 a2;
        return a2.j;
    }
}

