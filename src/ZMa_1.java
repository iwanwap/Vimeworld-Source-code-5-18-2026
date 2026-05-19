/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Kpa
 *  aKa
 *  nka
 *  pqa
 *  ska
 *  uKa
 *  vL
 *  vRa
 */
public final class ZMa_1
extends ska {
    private vL i;
    private int M;
    private int k;
    private float j;
    private oLa A;
    private vL I;

    public int J() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public ZMa_1(Gg gg2, vL vL2, vL vL3, float f2) {
        void a2;
        void b2;
        void d2;
        ZMa_1 c2;
        ZMa_1 e2 = vL2;
        ZMa_1 zMa_1 = c2 = this;
        super((Gg)d2, ((vL)e2).la, ((vL)e2).Z, ((vL)e2).A, ((vL)e2).i, ((vL)e2).Ea, ((vL)e2).f);
        c2.A = Kpa.J().J();
        c2.I = e2;
        zMa_1.i = b2;
        zMa_1.k = yRa.d;
        zMa_1.j = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void f8;
        ZMa_1 h2;
        ZMa_1 i322 = aKa2;
        ZMa_1 zMa_1 = h2 = this;
        ZMa_1 zMa_12 = h2;
        float i322 = ((float)zMa_1.M + f8) / (float)zMa_12.k;
        i322 *= i322;
        double d2 = zMa_1.I.la;
        double d3 = zMa_12.I.Z;
        double d4 = zMa_1.I.A;
        double d5 = zMa_1.i.V + (h2.i.la - h2.i.V) * (double)f8;
        double d6 = zMa_1.i.Ga + (h2.i.Z - h2.i.Ga) * (double)f8 + (double)h2.j;
        double d7 = zMa_1.i.Ca + (h2.i.A - h2.i.Ca) * (double)f8;
        double d8 = d2;
        d2 = d8 + (d5 - d8) * (double)i322;
        double d9 = d3;
        d3 = d9 + (d6 - d9) * (double)i322;
        double d10 = d4;
        d4 = d10 + (d7 - d10) * (double)i322;
        int i322 = zMa_1.J((float)f8);
        int g2 = i322 % opa.w;
        nka.J((int)nka.P, (float)((float)g2 / pqa.r), (float)((float)(i322 /= opa.w) / pqa.r));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        zMa_1.A.J(h2.I, (float)(d2 -= C), (float)(d3 -= k), (float)(d4 -= j), h2.I.X, (float)f8);
    }

    public void d() {
        ZMa_1 a2;
        ZMa_1 zMa_1 = a2;
        zMa_1.M += vRa.d;
        if (zMa_1.M == a2.k) {
            a2.k();
        }
    }
}

