/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  JPa
 *  Kpa
 *  Mx
 *  NTa
 *  Oz
 *  PV
 *  Tpa
 *  Yw
 *  aSa
 *  asa
 *  vQa
 */
public final class Gy_1 {
    public final PV C;
    public final Mx i;
    public final Zv M;
    public final PV k;
    public final Yw j;
    public final PV J;
    public final Mx A;
    public final Yw I;

    public void J() {
        Gy_1 gy_1;
        Gy_1 a2;
        long l2 = Kpa.J();
        long l3 = l2 - a2.C.f();
        long l4 = System.nanoTime() / Ata.p;
        double d2 = (double)l4 / Tpa.M;
        if (l3 <= asa.fa && l3 >= nqa.i) {
            long l5 = a2.J.f();
            if ((l5 += l3) > asa.fa) {
                double d3;
                long l6 = l4 - a2.k.f();
                double d4 = (double)l5 / (double)l6;
                Gy_1 gy_12 = a2;
                double d5 = d3 = gy_12.i.J();
                d3 = d5 + (d4 - d5) * Bua.Ia;
                gy_12.i.J(d3);
                gy_12.k.f(l4);
                l5 = nqa.i;
            }
            if (l5 < nqa.i) {
                a2.k.f(l4);
            }
            Gy_1 gy_13 = a2;
            gy_1 = gy_13;
            gy_13.J.f(l5);
        } else {
            Gy_1 gy_14 = a2;
            gy_1 = gy_14;
            gy_14.A.J(d2);
        }
        gy_1.C.f(l2);
        double d6 = (d2 - a2.A.J()) * a2.i.J();
        Gy_1 gy_15 = a2;
        gy_15.A.J(d2);
        d6 = Oz.J((double)d6, (double)aSa.V, (double)oua.i);
        float f2 = gy_15.I.J();
        f2 = (float)((double)f2 + d6 * vQa.c);
        int n2 = (int)f2;
        f2 -= (float)n2;
        if (n2 > NTa.C) {
            n2 = NTa.C;
        }
        Gy_1 gy_16 = a2;
        gy_16.M.f(n2);
        gy_16.j.J(f2);
        gy_16.I.J(f2);
    }

    public Gy_1(float f2) {
        Gy_1 a2;
        float b2 = f2;
        Gy_1 gy_1 = a2 = this;
        Gy_1 gy_12 = a2;
        gy_1.A = new Mx(aSa.V, ySa.T);
        gy_12.M = new Zv(uSa.E, ySa.T);
        gy_1.j = new Yw(JPa.N, ySa.T);
        gy_1.I = new Yw(JPa.N, ySa.T);
        gy_1.C = new PV(nqa.i, ySa.T);
        gy_1.k = new PV(nqa.i, ySa.T);
        gy_1.J = new PV(nqa.i, ySa.T);
        gy_1.i = new Mx(oua.i, ySa.T);
        gy_1.C.f(Kpa.J());
        gy_1.k.f(System.nanoTime() / Ata.p);
    }
}

