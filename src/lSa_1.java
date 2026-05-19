/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fSa
 *  mta
 */
public final class lSa_1<T extends fSa>
extends mta<T> {
    public lSa_1(T ... TArray) {
        T[] b2 = TArray;
        T[] a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    public double J(double d2, int n2, int n3, int n4) {
        void b2;
        void e2;
        void c2;
        double d3;
        int n5 = n4;
        lSa_1 a2 = this;
        d3 = (oua.i - Math.cos((double)(d3 * lQa.f))) / KPa.y;
        return a2.J((int)c2, (int)e2) * (oua.i - d3) + a2.J((int)b2, (int)e2) * d3;
    }
}

