/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  JPa
 *  MQa
 *  QFa
 *  pqa
 *  rd
 *  uY
 *  vRa
 */
public final class Paa_1
extends uY
implements rd {
    public int j;
    public float J;
    public float A;
    private int I;

    public boolean J(Sx sx2) {
        Paa_1 a2;
        Object b2 = sx2;
        Paa_1 paa_1 = a2 = this;
        if (paa_1.worldObj.J(paa_1.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Paa_1() {
        Paa_1 a2;
    }

    public void M() {
        Paa_1 a2;
        Paa_1 paa_1 = a2;
        paa_1.j -= vRa.d;
        paa_1.worldObj.f(a2.pos, QFa.ta, vRa.d, a2.j);
    }

    public void l() {
        Paa_1 a2;
        Paa_1 paa_1 = a2;
        paa_1.j += vRa.d;
        paa_1.worldObj.f(a2.pos, QFa.ta, vRa.d, a2.j);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Paa_1 a2 = this;
        if (b2 == vRa.d) {
            a2.j = c2;
            return vRa.d != 0;
        }
        return super.J((int)b2, c2);
    }

    public void J() {
        double d2;
        Paa_1 paa_1 = this;
        if ((paa_1.I += vRa.d) % kTa.j * AQa.P == 0) {
            Paa_1 paa_12 = paa_1;
            paa_12.worldObj.f(paa_12.pos, QFa.ta, vRa.d, paa_1.j);
        }
        Paa_1 paa_13 = paa_1;
        paa_13.A = paa_13.J;
        int n2 = paa_13.pos.getX();
        int n3 = paa_13.pos.getY();
        int n4 = paa_13.pos.getZ();
        float a2 = Nra.e;
        if (paa_13.j > 0 && paa_1.J == JPa.N) {
            double d3 = (double)n2 + kTa.B;
            d2 = (double)n4 + kTa.B;
            paa_1.worldObj.J(d3, (double)n3 + kTa.B, d2, Bpa.n, MQa.L, paa_1.worldObj.v.nextFloat() * Nra.e + ATa.r);
        }
        if (paa_1.j == 0 && paa_1.J > JPa.N || paa_1.j > 0 && paa_1.J < pqa.r) {
            float f2;
            Paa_1 paa_14;
            Paa_1 paa_15 = paa_1;
            float f3 = paa_15.J;
            if (paa_15.j > 0) {
                Paa_1 paa_16 = paa_1;
                paa_14 = paa_16;
                paa_16.J += a2;
            } else {
                Paa_1 paa_17 = paa_1;
                paa_14 = paa_17;
                paa_17.J -= a2;
            }
            if (paa_14.J > pqa.r) {
                paa_1.J = pqa.r;
            }
            if (paa_1.J < (f2 = MQa.L) && f3 >= f2) {
                d2 = (double)n2 + kTa.B;
                double d4 = (double)n4 + kTa.B;
                paa_1.worldObj.J(d2, (double)n3 + kTa.B, d4, Ura.P, MQa.L, paa_1.worldObj.v.nextFloat() * Nra.e + ATa.r);
            }
            if (paa_1.J < JPa.N) {
                paa_1.J = JPa.N;
            }
        }
    }

    public void d() {
        Paa_1 a2;
        Paa_1 paa_1 = a2;
        paa_1.e();
        super.d();
    }
}

