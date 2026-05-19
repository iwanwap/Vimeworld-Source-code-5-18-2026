/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  UZ
 *  aKa
 *  aSa
 *  ska
 *  vL
 *  vRa
 */
public final class Mma
extends ska {
    private int j;
    private int J;

    /*
     * WARNING - void declaration
     */
    public Mma(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void d8;
        void e2;
        void f2;
        Mma h2 = gg2;
        Mma g2 = this;
        super((Gg)h2, (double)f2, (double)e2, (double)d8, aSa.V, aSa.V, aSa.V);
        g2.J = Yqa.i;
    }

    public int J() {
        return vRa.d;
    }

    public void d() {
        int a2;
        Mma mma2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < uua.p) {
            Mma mma3 = mma2;
            double d2 = mma3.la + (mma2.R.nextDouble() - mma2.R.nextDouble()) * FPa.T;
            Mma mma4 = mma2;
            double d3 = mma3.Z + (mma4.R.nextDouble() - mma2.R.nextDouble()) * FPa.T;
            double d4 = mma4.A + (mma2.R.nextDouble() - mma2.R.nextDouble()) * FPa.T;
            int n3 = 4 ^ 5;
            mma3.j.J(UZ.EXPLOSION_LARGE, d2, d3, d4, (double)((float)mma2.j / (float)mma2.J), aSa.V, aSa.V, new int[uSa.E]);
            n2 = ++a2;
        }
        Mma mma5 = mma2;
        mma5.j += vRa.d;
        if (mma5.j == mma2.J) {
            mma2.k();
        }
    }

    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7;
        Mma a2 = this;
    }
}

